<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8"/>
    <meta http-equiv="X-UA-Compatible" content="IE=edge"/>
    <meta name="viewport" content="width=device-width, initial-scale=1"/>
    <title>Торт можно</title>
    <link href="https://fonts.cdnfonts.com/css/inter" rel="stylesheet"/>
    <link rel="icon" type="image/x-icon" href="img/common/coffee-ico.png"/>
    <style>
        <%@include file="/WEB-INF/css/common.css"%>
        <%@include file="/WEB-INF/css/main.css"%>
        <%@include file="/WEB-INF/css/header.css"%>
        <%@include file="/WEB-INF/css/footer.css"%>
    </style>
    <script type="text/javascript">
        <%@include file="/WEB-INF/js/common/header.js"%>
        <%@include file="/WEB-INF/js/main/main.js"%>
        window.onload = function () {
            setHeaderListeners();
            setSliderListeners();
            autoSlide();
        };
    </script>
</head>
<body>
<header style="position: relative;">
    <section class="header">
        <h1 style="display: none">Only for task</h1>
        <div class="wrapper">
            <div class="header-content">
                <div class="logo-container burger-closer">
                    <img alt="logo" src="/img/main-page/logo-tortm.png" style="height: 76px; width: 76px;"/>
                </div>
                <div class="header-links-container">
                    <div class="header-links">
                        <div class="header-links-item hoverable">
                            <a
                                    href="index.html#Favorite%20coffee"
                                    class="header-links-link"
                            >Favorite coffee</a>
                        </div>
                        <div class="header-links-item hoverable">
                            <a href="index.html#About" class="header-links-link">About</a>
                        </div>
                        <div class="header-links-item hoverable">
                            <a href="index.html#Mobile%20app" class="header-links-link"
                            >Mobile app</a
                            >
                        </div>
                        <div class="header-links-item hoverable">
                            <a href="index.html#Contact%20us" class="header-links-link"
                            >Contact us</a
                            >
                        </div>
                    </div>
                </div>
                <div class="menu-link-big-container">
                    <a
                            class="menu-link-small-container hoverable"
                            href="menu.html">
                        <div class="text-dark">Menu</div>
                        <div>
                            <img
                                    alt="coffee-cup"
                                    style="height: 20px; width: 20px"
                                    src="img/main-page/coffee-cup.svg"
                            />
                        </div>
                    </a>
                    <button id="burgerBtn" class="burger-btn">
                <span id="burger-lines" class="burger-lines">
                </span>
                        <img id="burger-btn-cross" class="burger-btn-cross"
                             alt="cross"
                             style="height: 16px; width: 16px"
                             src="img/common/cross.png"
                        />
                    </button>
                </div>
            </div>
        </div>
    </section>
    <section id="burger-menu" class="burger-menu">
        <h2 style="display: none">Only for task</h2>
        <div class="burger-menu-container">
            <div class="burger-menu-links1">
                <div class="burger-links-item">
                    <a
                            href="index.html#Favorite%20coffee"
                            class="burger-links-link"
                    >Favorite coffee</a
                    >
                </div>
                <div class="burger-links-item burger-closer">
                    <a href="index.html#About" class="header-links-link">About</a>
                </div>
                <div class="burger-links-item burger-closer">
                    <a href="index.html#Mobile%20app" class="header-links-link"
                    >Mobile app</a
                    >
                </div>
                <div class="burger-links-item burger-closer">
                    <a href="index.html#Contact%20us" class="header-links-link"
                    >Contact us</a
                    >
                </div>
            </div>

            <div class="burger-menu-links2">
                <a
                        class="burger-links-item burger-closer"
                        href="menu.html">
                    <div class="text-dark">Menu</div>
                    <div>
                        <img
                                alt="coffee-cup"
                                style="height: 20px; width: 20px"
                                src="img/main-page/coffee-cup.svg"
                        />
                    </div>
                </a>
            </div>
        </div>
        </div>
    </section>
</header>
<main>
    <section id="Enjoy" class="coffee-banner" >
        <h2 style="display: none">Only for task</h2>
        <div class="wrapper">
            <div class="coffee-banner-content">
                <div class="coffee-banner-info">
                    <div>
                <span class="coffee-banner-title text-light">
                  <span
                          class="inherit-font text-accent"
                          style="font-style: italic;"
                  >Создай</span
                  >
                  сладкие моменты для себя и близких</span
                >
                    </div>
                    <div class="coffee-banner-text text-light">
                        Откройте волшебный мир вкусов!
                        Погрузитесь в незабываемые кулинарные приключения,
                        расширьте свое восприятие и создайте моменты вкусового
                        наслаждения, которые запомнятся навсегда.
                    </div>
                    <div class="coffee-banner-text text-light" style="display:flex; justify-content: flex-end;
                    padding-right: 36px;">
                       С любовью, торт можно.
                    </div>
                </div>
            </div>

        </div>
    </section>

</main>
<footer>
    <section id="Contact%20us" class="footer">
        <h2 style="display: none">Only for task</h2>
        <div class="wrapper footer">
            <div class="footer-links-container">
                <div class="title-font text-accent">
                    <span class="title-font text-light">Sip, Savor, Smile.</span>
                    <span style="font-style: italic">It’s coffee time!</span>
                </div>
                <div class="footer-links">
                    <button class="footer-btn small-dark-round">
                        <img src="img/main-page/twitter.svg" alt="twitter-logo"/>
                    </button>
                    <button class="footer-btn small-dark-round">
                        <img src="img/main-page/instagram.svg" alt="twitter-logo"/>
                    </button>
                    <button class="footer-btn small-dark-round">
                        <img src="img/main-page/facebook.svg" alt="twitter-logo"/>
                    </button>
                </div>
            </div>
            <div class="footer-contacts-container text-light">
                <div class="footer-contacts-title">Contact us</div>
                <div class="footer-contacts-list">
                    <div style="cursor: pointer;" class="footer-contact hoverable-light transparent-border"
                         onclick="window.open('https://maps.app.goo.gl/BPK74a44BTYMmFZx6')">
                        <img alt="pin-alt" src="img/main-page/pin-alt.svg"/>
                        <span>8558 Green Rd., LA</span>
                    </div>
                    <div class="footer-contact">
                        <a
                                class="hoverable-light footer-contact transparent-border"
                                href="tel:+1%20(603)%20555-0123">
                            <img alt="phone" src="img/main-page/phone.svg"/>
                            <span> +1 (603) 555-0123 </span>
                        </a>
                    </div>
                    <div class="footer-contact">
                        <div class="footer-time">
                            <img alt="clock" src="img/main-page/clock.svg"/>
                        </div>
                        Mon-Sat: 9:00 AM – 23:00 PM
                    </div>
                </div>
            </div>
        </div>
    </section>
</footer>
</body>
</html>
