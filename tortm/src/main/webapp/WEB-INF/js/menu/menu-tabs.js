let isWindowRefreshed = false;
const COUNT_CARDS_MORE_768_PX = 32;
const COUNT_CARDS_LESS_768_PX = 4;
let defaultCardsCount = COUNT_CARDS_MORE_768_PX;
let currentTab= "coffee";


function clearCardContainer(container) {
  container.innerHTML = "";
}

function setCardsCount(windowWidth){
  let refreshBtnContainer= document.getElementById("refresh-btn-container");
  let isCountChanged=false;
  if(windowWidth>768 && defaultCardsCount!=COUNT_CARDS_MORE_768_PX ) {
    defaultCardsCount=COUNT_CARDS_MORE_768_PX;
    isCountChanged=true;
  } else if(windowWidth<=768 && defaultCardsCount!=COUNT_CARDS_LESS_768_PX ){
    defaultCardsCount=COUNT_CARDS_LESS_768_PX;
    isCountChanged=true;
    refreshBtnContainer.style.display="flex";      
  }
  return isCountChanged;
}

function getCardsByCategory(category){
  let categoryArray= tabData.filter((item)=>item.category==category);
  return categoryArray;
}


function showCards(category) {
  if(!category){
    category=currentTab;
  }
  currentTab=category;
  var windowWidth=window.innerWidth;
  setCardsCount(windowWidth);
  let cardsContainer = document.getElementById("menu-cards-container");
  clearCardContainer(cardsContainer);
  let cards = getCardsByCategory(category);
  for (let i = 0; i < cards.length; i += 1) { 
      createNewCardInContainer(cards[i], cardsContainer, (i<defaultCardsCount || isWindowRefreshed));
  }
}

function createNewCardInContainer(card, cardsContainer, isShow) {
  let displayValue=isShow?"flex":"none";
  cardsContainer.innerHTML += `
        <div class="menu-card" style="display:${displayValue}">
                        <div class="menu-card-img">
                            <img class="resizable-photo" src="${card.imgLink}" style="width: 100%; /* or any custom size */
                            height: 100%; 
                            object-fit: contain;  border-radius: 40px;" alt="${card.name}">
                        </div>
                        <div class="menu-card-text-container">
                            <div class="menu-card-title">${card.name}</div>
                        <div class="menu-card-description">${card.description}</div>
                        <div class="menu-card-cost">${card.price}$</div>
                        </div>
                </div>
        `;
}

function setListeners(){
  let refreshBtnContainer= document.getElementById("refresh-btn-container");
  window.addEventListener("resize", function(){
    var windowWidth=window.innerWidth;
    if(!isWindowRefreshed && setCardsCount(windowWidth)){
      showCards(currentTab);
      if(defaultCardsCount<COUNT_CARDS_MORE_768_PX){
        refreshBtnContainer.style.display="flex";      
      } else if(defaultCardsCount>COUNT_CARDS_LESS_768_PX){
        refreshBtnContainer.style.display="none";  
      }
    }
  })

let refreshBtn= document.getElementById("refresh-btn");
refreshBtn.addEventListener("click", function(){
  isWindowRefreshed=true;
  showCards(currentTab);
  refreshBtn.style.display="none";
});


  let coffeeBtn= document.getElementById("coffee-tab-btn");
  let teaBtn= document.getElementById("tea-tab-btn");
  let desertBtn= document.getElementById("dessert-tab-btn");
  coffeeBtn.addEventListener("click", function(){
    if(currentTab!="coffee"){
      clearTabsBtn();
      chooseTabBtn(coffeeBtn);
      showCards("coffee")
    }
  });
  teaBtn.addEventListener("click", function(){
    if(currentTab!="tea"){
      clearTabsBtn();
      chooseTabBtn(teaBtn);
      showCards("tea")
    }
  });
  desertBtn.addEventListener("click", function(){
    if(currentTab!="dessert"){
      clearTabsBtn();
      chooseTabBtn(desertBtn);
      showCards("dessert");
    }
  });
}

function clearTabsBtn(){
  let tabs=document.getElementsByClassName("menu-tab-black");
  Array.from(tabs).forEach((element) => {element.classList.remove("menu-tab-black");
  element.classList.add("menu-tab");
});
}

function chooseTabBtn(btn){
  btn.classList.add("menu-tab-black");
}