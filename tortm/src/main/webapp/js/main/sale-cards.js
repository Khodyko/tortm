let isWindowRefreshed = false;
const COUNT_CARDS_MORE_768_PX = 32;
const COUNT_CARDS_LESS_768_PX = 4;
let defaultCardsCount = COUNT_CARDS_MORE_768_PX;

function clearCardContainer(container) {
    container.innerHTML = "";
}

function setCardsCount(windowWidth) {
    let refreshBtnContainer = document.getElementById("refresh-btn-container");
    let isCountChanged = false;
    if (windowWidth > 768 && defaultCardsCount != COUNT_CARDS_MORE_768_PX) {
        defaultCardsCount = COUNT_CARDS_MORE_768_PX;
        isCountChanged = true;
    } else if (windowWidth <= 768 && defaultCardsCount != COUNT_CARDS_LESS_768_PX) {
        defaultCardsCount = COUNT_CARDS_LESS_768_PX;
        isCountChanged = true;
        refreshBtnContainer.style.display = "flex";
    }
    return isCountChanged;
}

function getCardsByCategory(category) {
    let categoryArray = tabData.filter((item) => item.category == category);
    return categoryArray;
}

function showCards(url) {

    let windowWidth = window.innerWidth;
    setCardsCount(windowWidth);
    let cardsContainer = document.getElementById("menu-cards-container");
    clearCardContainer(cardsContainer);
    let cards = getRequest(url);
    for (let i = 0; i < cards.length; i += 1) {
        createNewCardInContainer(cards[i], cardsContainer, (i < defaultCardsCount || isWindowRefreshed));
    }
}

function createNewCardInContainer(card, cardsContainer, isShow) {
    let displayValue = isShow ? "flex" : "none";
    cardsContainer.innerHTML += `
        <div class="menu-card" style="display:${displayValue}">
                        <div class="menu-card-img">
                            <img class="resizable-photo" src="${card.imgHref}" style="width: 100%; /* or any custom size */
                            height: 100%; 
                            object-fit: contain;  border-radius: 40px;" alt="${card.name}">
                        </div>
                        <div class="menu-card-text-container">
                            <div class="menu-card-title">${card.name}</div>
                        <div class="menu-card-description">${card.description}</div>
                        <div class="menu-card-cost">${card.costPerMeasureCoins} бел.руб.</div>
                        </div>
                </div>
        `;
}

function setListeners() {
    let refreshBtnContainer = document.getElementById("refresh-btn-container");
    window.addEventListener("resize", function () {
        var windowWidth = window.innerWidth;
        if (!isWindowRefreshed && setCardsCount(windowWidth)) {
            showCards(currentTab);
            if (defaultCardsCount < COUNT_CARDS_MORE_768_PX) {
                refreshBtnContainer.style.display = "flex";
            } else if (defaultCardsCount > COUNT_CARDS_LESS_768_PX) {
                refreshBtnContainer.style.display = "none";
            }
        }
    })

    let refreshBtn = document.getElementById("refresh-btn");
    refreshBtn.addEventListener("click", function () {
        isWindowRefreshed = true;
        showCards(currentTab);
        refreshBtn.style.display = "none";
    });
}

function getRequest(theUrl){
    const xmlHttp = new XMLHttpRequest();
    xmlHttp.open( "GET", theUrl, false ); // false for synchronous request
    xmlHttp.send( null );
    const responseText=JSON.parse(xmlHttp.responseText);
    console.log(responseText);
    return responseText;
}



