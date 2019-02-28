-- phpMyAdmin SQL Dump
-- version 4.7.9
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1:3306
-- Tiempo de generación: 12-08-2018 a las 21:33:48
-- Versión del servidor: 5.7.21
-- Versión de PHP: 5.6.35

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `tallerescolumba`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `mecanico`
--

DROP TABLE IF EXISTS `mecanico`;
CREATE TABLE IF NOT EXISTS `mecanico` (
  `cedula` varchar(10) NOT NULL,
  `nombre` varchar(20) DEFAULT NULL,
  `apellido` varchar(20) DEFAULT NULL,
  `edad` varchar(10) DEFAULT NULL,
  `telf` varchar(10) DEFAULT NULL,
  `direccion` varchar(29) DEFAULT NULL,
  `cargo` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`cedula`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `mecanico`
--

INSERT INTO `mecanico` (`cedula`, `nombre`, `apellido`, `edad`, `telf`, `direccion`, `cargo`) VALUES
('123433', 'Maria', 'Ojeda', '22', '09999999', 'QUITO', 'Balanceo'),
('543654', 'Manuel', 'Ruiz', '28', '08888888', 'Saangolqui', 'Balanceo');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `repuesto`
--

DROP TABLE IF EXISTS `repuesto`;
CREATE TABLE IF NOT EXISTS `repuesto` (
  `codigo` varchar(10) NOT NULL,
  `nombre` varchar(20) DEFAULT NULL,
  `cantidad` varchar(20) DEFAULT NULL,
  `descripcion` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`codigo`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `repuesto`
--

INSERT INTO `repuesto` (`codigo`, `nombre`, `cantidad`, `descripcion`) VALUES
('123213', 'Parabrisas', '4', 'Parabris para camion GH600'),
('543456', 'Puerta', '4', 'Puerta para auto toyota  4x4');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
