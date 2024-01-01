const SLIDER_TIMER=700;
let SLIDE_COUNT=3;
let currentSliderTime=0;
let currentSliderNum=0;
const SLIDE_WIDTH=570;
let isNotStoppedSliding=false;
let slideLoading=10;


function setSliderListeners(){
    let sliderLeft= document.getElementById("slider-button");
    sliderLeft.addEventListener("click", function(){
    changeSlideToLeft();
});

let sliderRight= document.getElementById("slider-button-right");
sliderRight.addEventListener("click", function(){
    changeSlideToRight();
});
}

function changeSlideToRight(){
    let sliderBig=document.getElementById("drink-slider-container-big");
    if(currentSliderNum<SLIDE_COUNT-1){
        currentSliderNum=currentSliderNum+1;
        sliderBig.style.transform="translateX(-"+SLIDE_WIDTH*currentSliderNum+"px)";
        changeSliderLine(currentSliderNum);
    } else {
        currentSliderNum=0;
        sliderBig.style.transform="translateX(-"+SLIDE_WIDTH*currentSliderNum+"px)";
        changeSliderLine(currentSliderNum);
    }
}

function changeSlideToLeft(){
    let sliderBig=document.getElementById("drink-slider-container-big");
    if(currentSliderNum>0){
        currentSliderNum=currentSliderNum-1;
        sliderBig.style.transform="translateX(-"+SLIDE_WIDTH*currentSliderNum+"px)";
        changeSliderLine(currentSliderNum);
    } else {
        currentSliderNum=SLIDE_COUNT-1;
        sliderBig.style.transform="translateX(-"+SLIDE_WIDTH*currentSliderNum+"px)";
        changeSliderLine(currentSliderNum);
    }
}

function changeSliderLine(lineNum){
   let line1=document.getElementById("dark1");
   let line2=document.getElementById("dark2");
   let line3=document.getElementById("dark3");
   let lines=[line1, line2, line3];

    line1.classList.remove("dark");
    line2.classList.remove("dark")
    line3.classList.remove("dark")
    line1.style.width=0;
    line2.style.width=0;
    line3.style.width=0;
    lines[lineNum].classList.add("dark");
}

function autoSlide() {
    let currentSlideLine=document.getElementById("dark"+(currentSliderNum+1));
    setInterval(function(){changeSlideToRight()},7000);
}
