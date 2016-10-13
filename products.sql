-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Хост: 127.0.0.1
-- Время создания: Окт 13 2016 г., 23:29
-- Версия сервера: 10.1.13-MariaDB
-- Версия PHP: 5.6.21

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- База данных: `webstorefish`
--

-- --------------------------------------------------------

--
-- Структура таблицы `products`
--

CREATE TABLE `products` (
  `id_product` int(11) NOT NULL,
  `name` varchar(256) COLLATE utf8_bin NOT NULL,
  `discription_product` text COLLATE utf8_bin,
  `image` varchar(256) COLLATE utf8_bin DEFAULT NULL,
  `stock` int(11) NOT NULL,
  `id_productGroup` int(11) DEFAULT NULL,
  `id_price` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Дамп данных таблицы `products`
--

INSERT INTO `products` (`id_product`, `name`, `discription_product`, `image`, `stock`, `id_productGroup`, `id_price`) VALUES
(1, 'Воблер Pontoon 21 Agarron 80F SR 721', 'Описание Воблер Pontoon 21 Agarron 80F SR 721', '721', 12, 1, 1),
(2, 'Воблер Pontoon 21 Agarron 80F SR 773', 'Описание Воблер Pontoon 21 Agarron 80F SR 773', '773', 5, 1, 2),
(3, 'Воблер Pontoon 21 Agarron 80F SR 777', 'Описание Воблер Pontoon 21 Agarron 80F SR 777', '777', 8, 2, 3),
(4, 'Воблер Pontoon 21 Agarron 80F SR 784', 'Описание Воблер Pontoon 21 Agarron 80F SR 784', '784', 7, 2, 4);

--
-- Индексы сохранённых таблиц
--

--
-- Индексы таблицы `products`
--
ALTER TABLE `products`
  ADD PRIMARY KEY (`id_product`),
  ADD KEY `id_productGroup` (`id_productGroup`);

--
-- AUTO_INCREMENT для сохранённых таблиц
--

--
-- AUTO_INCREMENT для таблицы `products`
--
ALTER TABLE `products`
  MODIFY `id_product` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
