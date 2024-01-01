let isMenuOpened=false;




function setHeaderListeners(){
    let burgerBtn= document.getElementById("burgerBtn");
    burgerBtn.addEventListener("click", function(){
    
   if(isMenuOpened){
    closeMenu();
    isMenuOpened=false;
   } else{
    openMenu();
    isMenuOpened=true;
   }
});
window.addEventListener("resize", function(){
    var windowWidth=window.innerWidth;
    if(windowWidth>768){
     closeMenu();
    }
  })

  let burgerCloserList= document.getElementsByClassName("burger-closer");
  Array.from(burgerCloserList).forEach(element => {
    element.addEventListener("click", function(){
        closeMenu();
    })
  });

};

function openMenu(){
    let lines= document.getElementById("burger-lines");
    let cross= document.getElementById("burger-btn-cross");
    let burgerMenu= document.getElementById("burger-menu");
    lines.style.opacity="0";
    setTimeout(function(){
        lines.style.display="none";
        cross.style.opacity="0";
        cross.style.display="flex";
        cross.style.opacity="1";
}, 500);
    burgerMenu.style.height=window.innerHeight;
    burgerMenu.style.opacity="1"
    burgerMenu.style.left="0";
}

function closeMenu(){
    let lines= document.getElementById("burger-lines");
    let cross= document.getElementById("burger-btn-cross");
    let burgerMenu= document.getElementById("burger-menu");
    cross.style.opacity="0";
    setTimeout(function(){
        cross.style.display="none";
        lines.style.opacity="0";
        lines.style.display="flex";
        lines.style.opacity="1";
}, 500);
    burgerMenu.style.height=window.innerHeight;
    burgerMenu.style.left="3000px";
    setTimeout(function(){burgerMenu.style.opacity="0";}, 500);
    
}