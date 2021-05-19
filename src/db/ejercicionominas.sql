-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 14-05-2021 a las 17:11:10
-- Versión del servidor: 10.4.17-MariaDB
-- Versión de PHP: 8.0.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `ejercicionominas`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `convenio`
--

CREATE TABLE `convenio` (
  `id` int(11) NOT NULL,
  `nombreConvenio` varchar(25) CHARACTER SET utf8 NOT NULL,
  `plusConvenio` float NOT NULL,
  `años_antiguedad` int(11) NOT NULL,
  `salarioBase` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `convenio`
--

INSERT INTO `convenio` (`id`, `nombreConvenio`, `plusConvenio`, `años_antiguedad`, `salarioBase`) VALUES
(1, 'TIC', 100, 3, 1000.25);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `deducciones`
--

CREATE TABLE `deducciones` (
  `idDeduccion` int(11) NOT NULL,
  `formacion` double NOT NULL,
  `Desempleo` double NOT NULL,
  `horas_extra` double NOT NULL,
  `horas_extra_fm` double NOT NULL,
  `contingencias_comunes` double NOT NULL,
  `idConvenio` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `deducciones`
--

INSERT INTO `deducciones` (`idDeduccion`, `formacion`, `Desempleo`, `horas_extra`, `horas_extra_fm`, `contingencias_comunes`, `idConvenio`) VALUES
(1, 5, 10, 10, 12, 5, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `empresa`
--

CREATE TABLE `empresa` (
  `CIF_Empresa` varchar(25) CHARACTER SET utf8 NOT NULL,
  `nombreEmpresa` varchar(25) CHARACTER SET utf8 NOT NULL,
  `sedeFiscal` varchar(25) CHARACTER SET utf8 NOT NULL,
  `ccc` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `empresa`
--

INSERT INTO `empresa` (`CIF_Empresa`, `nombreEmpresa`, `sedeFiscal`, `ccc`) VALUES
('F08139712', 'CIDE', 'Palma', 1111111111);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `nominas`
--

CREATE TABLE `nominas` (
  `idNomina` int(11) NOT NULL,
  `horas_extra` double NOT NULL,
  `horas_extra_fm` double NOT NULL,
  `plus_antiguedad` double NOT NULL,
  `irpf` float NOT NULL,
  `formacion` float NOT NULL,
  `desempleo` float NOT NULL,
  `deduc_horas_extra` float NOT NULL,
  `deduc_horas_extraFM` float NOT NULL,
  `contingencias_comunes` float NOT NULL,
  `salari_base` float NOT NULL,
  `total_merital` float NOT NULL,
  `salario_final` double NOT NULL,
  `idConvenio` int(11) DEFAULT NULL,
  `DNItrabajdor` varchar(9) CHARACTER SET utf8 DEFAULT NULL,
  `fecha_actual` date DEFAULT NULL,
  `salarioBaseMasHoraExtra` double NOT NULL,
  `nombreT` varchar(25) CHARACTER SET utf8 NOT NULL,
  `apellidoT` varchar(25) CHARACTER SET utf8 NOT NULL,
  `puestoT` varchar(25) CHARACTER SET utf8 NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `nominas`
--

INSERT INTO `nominas` (`idNomina`, `horas_extra`, `horas_extra_fm`, `plus_antiguedad`, `irpf`, `formacion`, `desempleo`, `deduc_horas_extra`, `deduc_horas_extraFM`, `contingencias_comunes`, `salari_base`, `total_merital`, `salario_final`, `idConvenio`, `DNItrabajdor`, `fecha_actual`, `salarioBaseMasHoraExtra`, `nombreT`, `apellidoT`, `puestoT`) VALUES
(1, 20, 25, 333.33333333333337, 620.362, 51.0125, 102.025, 2, 3, 50.0125, 1000.25, 1378.58, 550.17, 1, '6568425Z', '2021-05-14', 1020.25, 'Gus', 'Mu', 'juca'),
(2, 20, 25, 233.33333333333334, 25.5717, 51.0125, 102.025, 2, 3, 50.0125, 1000.25, 1278.58, 1044.96, 1, '43479992X', '2021-05-14', 1020.25, 'Marcos', 'Ra', 'jefe'),
(3, 20, 25, 233.33333333333334, 25.5717, 51.0125, 102.025, 2, 3, 50.0125, 1000.25, 1278.58, 1044.96, 1, '43479992X', '2021-05-14', 1020.25, 'Marcos', 'Ra', 'jefe'),
(4, 20, 25, 233.33333333333334, 25.5717, 51.0125, 102.025, 2, 3, 50.0125, 1000.25, 1278.58, 1044.96, 1, '43479992X', '2021-05-14', 1020.25, 'Marcos', 'Ra', 'jefe'),
(5, 20, 25, 233.33333333333334, 25.5717, 51.0125, 102.025, 2, 3, 50.0125, 1000.25, 1278.58, 1044.96, 1, '43479992X', '2021-05-14', 1020.25, 'Marcos', 'Ra', 'jefe'),
(6, 20, 25, 350, 139.525, 51.0125, 102.025, 2, 3, 50.0125, 1000.25, 1395.25, 1047.67, 1, '53479992J', '2021-05-14', 1020.25, 'Pedro', 'Inisesta', 'junior'),
(7, 20, 25, 350, 27.905, 51.0125, 102.025, 2, 3, 50.0125, 1000.25, 1395.25, 1159.29, 1, '12197863M', '2021-05-14', 1020.25, 'Shen', 'ye', 'junior'),
(8, 20, 25, 233.33333333333334, 25.5717, 51.0125, 102.025, 2, 3, 50.0125, 1000.25, 1278.58, 1044.96, 1, '43479992X', '2021-05-14', 1020.25, 'Marcos', 'Ra', 'jefe'),
(9, 20, 25, 350, 139.525, 51.0125, 102.025, 2, 3, 50.0125, 1000.25, 1395.25, 1047.67, 1, '53479992J', '2021-05-14', 1020.25, 'Pedro', 'Inisesta', 'junior');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `percepciones_salariales`
--

CREATE TABLE `percepciones_salariales` (
  `idPercepcion` int(11) NOT NULL,
  `horasExtra` float NOT NULL,
  `horasExtraFuerzaMayor` float NOT NULL,
  `plus_antiguedad` float NOT NULL,
  `idConvenio` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `percepciones_salariales`
--

INSERT INTO `percepciones_salariales` (`idPercepcion`, `horasExtra`, `horasExtraFuerzaMayor`, `plus_antiguedad`, `idConvenio`) VALUES
(1, 20, 25, 50, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `trabajador`
--

CREATE TABLE `trabajador` (
  `DNI_Trabajador` varchar(9) CHARACTER SET utf8 NOT NULL,
  `nombre` varchar(25) CHARACTER SET utf8 NOT NULL,
  `apellido` varchar(25) CHARACTER SET utf8 NOT NULL,
  `apellido2` varchar(25) CHARACTER SET utf8 NOT NULL,
  `fechaInicio` date DEFAULT NULL,
  `edad` int(11) NOT NULL,
  `puesto` varchar(25) CHARACTER SET utf8 DEFAULT NULL,
  `irpf` float NOT NULL,
  `idConvenio` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `trabajador`
--

INSERT INTO `trabajador` (`DNI_Trabajador`, `nombre`, `apellido`, `apellido2`, `fechaInicio`, `edad`, `puesto`, `irpf`, `idConvenio`) VALUES
('12197863M', 'Shen', 'ye', 'Xiang', '2000-05-09', 21, 'junior', 2, 1),
('43479992X', 'Marcos', 'Ra', 'CO', '2006-09-19', 21, 'jefe', 2, 1),
('53479992J', 'Pedro', 'Inisesta', 'Popo', '2000-01-01', 20, 'junior', 10, 1),
('6568425Z', 'Gus', 'Mu', 'Fer', '2000-06-08', 21, 'juca', 45, 1);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `convenio`
--
ALTER TABLE `convenio`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `deducciones`
--
ALTER TABLE `deducciones`
  ADD PRIMARY KEY (`idDeduccion`),
  ADD KEY `idConvenio` (`idConvenio`);

--
-- Indices de la tabla `empresa`
--
ALTER TABLE `empresa`
  ADD PRIMARY KEY (`CIF_Empresa`);

--
-- Indices de la tabla `nominas`
--
ALTER TABLE `nominas`
  ADD PRIMARY KEY (`idNomina`),
  ADD KEY `DNItrabajdor` (`DNItrabajdor`),
  ADD KEY `idConvenio` (`idConvenio`);

--
-- Indices de la tabla `percepciones_salariales`
--
ALTER TABLE `percepciones_salariales`
  ADD PRIMARY KEY (`idPercepcion`),
  ADD KEY `idConvenio` (`idConvenio`);

--
-- Indices de la tabla `trabajador`
--
ALTER TABLE `trabajador`
  ADD PRIMARY KEY (`DNI_Trabajador`),
  ADD KEY `idConvenio` (`idConvenio`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `convenio`
--
ALTER TABLE `convenio`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `deducciones`
--
ALTER TABLE `deducciones`
  MODIFY `idDeduccion` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `nominas`
--
ALTER TABLE `nominas`
  MODIFY `idNomina` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT de la tabla `percepciones_salariales`
--
ALTER TABLE `percepciones_salariales`
  MODIFY `idPercepcion` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `deducciones`
--
ALTER TABLE `deducciones`
  ADD CONSTRAINT `deducciones_ibfk_1` FOREIGN KEY (`idConvenio`) REFERENCES `convenio` (`id`);

--
-- Filtros para la tabla `nominas`
--
ALTER TABLE `nominas`
  ADD CONSTRAINT `nominas_ibfk_1` FOREIGN KEY (`DNItrabajdor`) REFERENCES `trabajador` (`DNI_Trabajador`),
  ADD CONSTRAINT `nominas_ibfk_2` FOREIGN KEY (`idConvenio`) REFERENCES `convenio` (`id`);

--
-- Filtros para la tabla `percepciones_salariales`
--
ALTER TABLE `percepciones_salariales`
  ADD CONSTRAINT `percepciones_salariales_ibfk_1` FOREIGN KEY (`idConvenio`) REFERENCES `convenio` (`id`);

--
-- Filtros para la tabla `trabajador`
--
ALTER TABLE `trabajador`
  ADD CONSTRAINT `trabajador_ibfk_1` FOREIGN KEY (`idConvenio`) REFERENCES `convenio` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
