<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8"/>
    <meta http-equiv="X-UA-Compatible" content="IE=edge"/>
    <meta name="viewport" content="width=device-width, initial-scale=1"/>
    <title>Торт можно</title>
    <link href="https://fonts.cdnfonts.com/css/inter" rel="stylesheet"/>
    <link rel="icon" type="image/x-icon" href="img/common/cake-favicon.png"/>
    <style>
        <%@include file="/css/common.css"%>
        <%@include file="/css/main.css"%>
        <%@include file="/css/header.css"%>
        <%@include file="/css/footer.css"%>
        <%@include file="/css/menu.css"%>
    </style>
    <script src="${pageContext.request.contextPath}/js/main/sale-cards.js"></script>
    <script src="${pageContext.request.contextPath}/js/menu/products.js"></script>
        <script type="text/javascript">

        <%@include file="/js/main/main.js"%>
        window.onload = function () {
            showCards("${pageContext.request.contextPath}/cake");
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
                            >Каталог тортов</a>
                        </div>
                        <div class="header-links-item hoverable">
                            <a href="index.html#About" class="header-links-link">Галерея</a>
                        </div>
                        <div class="header-links-item hoverable">
                            <a href="index.html#Mobile%20app" class="header-links-link"
                            >О нас</a
                            >
                        </div>
                        <div class="header-links-item hoverable">
                            <a href="index.html#Contact%20us" class="header-links-link"
                            >Контакты</a
                            >
                        </div>
                    </div>
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
    <section id="Menu" class="menu">
        <h2 style="display: none">Only for task</h2>
        <div class="wrapper menu">
            <div class="menu-title title-font text-dark">
                Каждый торт скрывает
                <span class="text-accent" style="font-style: italic">
              чудесный вкус
            </span>
            </div>
            <!-- fulfill from js -->
            <div id="menu-cards-container"></div>
            <div id="refresh-btn-container" class="refresh-btn-container">
                <button id="refresh-btn" class="refresh-btn small-round">
                    <img alt="refresh" src="img/menu/refresh.svg">
                </button>
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
                    <div class="title-font text-light">Пробуй, ощущай, люби.</div>
                    <span style="font-style: italic">Время для сладкого!</span>
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
                <div class="footer-contacts-title">Свяжитесь с нами</div>
                <div class="footer-contacts-list">
                    <div class="footer-contact">
                        <a
                                class="hoverable-light footer-contact transparent-border"
                                href="tel:+375292565659">
                            <img alt="phone" src="img/main-page/phone.svg"/>
                            <span> +375(29)256-56-59 </span>
                        </a>
                    </div>
                    <div class="footer-contact">
                        <div class="footer-time">
                            <img alt="clock" src="img/main-page/clock.svg"/>
                        </div>
                        Ежедневно: 9:00 – 21:00
                    </div>
                </div>
            </div>
        </div>
    </section>
</footer>
</body>
</html>
