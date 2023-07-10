-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Mar 10, 2023 at 05:31 AM
-- Server version: 10.4.21-MariaDB
-- PHP Version: 7.3.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `mohmanagementsystem`
--

-- --------------------------------------------------------

--
-- Table structure for table `disease`
--

CREATE TABLE `disease` (
  `d_ID` int(11) NOT NULL,
  `disease` varchar(255) NOT NULL,
  `shortName` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `disease`
--

INSERT INTO `disease` (`d_ID`, `disease`, `shortName`) VALUES
(1, 'TB', 'TB'),
(2, 'DENGUE', 'DEN'),
(3, 'CORONA', 'COR'),
(4, 'Malaria', 'MAL'),
(5, 'Chikungunya', 'CKG');

-- --------------------------------------------------------

--
-- Table structure for table `notified_by`
--

CREATE TABLE `notified_by` (
  `n_ID` int(11) NOT NULL,
  `place` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `notified_by`
--

INSERT INTO `notified_by` (`n_ID`, `place`) VALUES
(1, 'Hospital'),
(2, 'Ayurveda Hospital');

-- --------------------------------------------------------

--
-- Table structure for table `patient`
--

CREATE TABLE `patient` (
  `Serial_No` varchar(50) NOT NULL,
  `year` int(11) NOT NULL,
  `patient_Name` varchar(255) NOT NULL,
  `Age` int(11) NOT NULL,
  `Phone` int(10) NOT NULL,
  `Gender` varchar(15) NOT NULL,
  `Adress` varchar(255) NOT NULL,
  `disease_ID` int(11) NOT NULL,
  `Notified_date` date NOT NULL,
  `NotifiedBy_ID` int(11) NOT NULL,
  `D_recept_by_MOH` varchar(50) NOT NULL,
  `Phi_Area` int(11) NOT NULL,
  `D_Dispatch_To_PHI` varchar(50) NOT NULL,
  `D_of_Investigation` varchar(50) NOT NULL,
  `D_Out_Come` varchar(50) NOT NULL,
  `satff_ID` int(11) NOT NULL,
  `Status` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `patient`
--

INSERT INTO `patient` (`Serial_No`, `year`, `patient_Name`, `Age`, `Phone`, `Gender`, `Adress`, `disease_ID`, `Notified_date`, `NotifiedBy_ID`, `D_recept_by_MOH`, `Phi_Area`, `D_Dispatch_To_PHI`, `D_of_Investigation`, `D_Out_Come`, `satff_ID`, `Status`) VALUES
('1/DEN/1', 2022, 'hjh', 12, 421, 'M', '12jh', 2, '2022-11-30', 1, '0000-00-00', 1, '0000-00-00', '0000-00-00', '0000-00-00', 4, 2),
('2/CO-19/1', 2022, 'fgdfg', 5, 23555, 'F', '33FFVGJHJJHJ', 3, '2022-12-03', 1, '0000-00-00', 2, '0000-00-00', '0000-00-00', '0000-00-00', 4, 2),
('3/COR/2', 2022, 'fgbfcg', 5, 23555, 'F', '33FFVGJHJJHJ', 3, '2022-12-03', 1, '0000-00-00', 2, '0000-00-00', '0000-00-00', '0000-00-00', 4, 2),
('4/DEN/2', 2022, 'bf', 12, 2123132121, 'M', 'njmjgjg', 2, '2022-12-04', 1, '0000-00-00', 1, '0000-00-00', '0000-00-00', '0000-00-00', 4, 4),
('5/TB/1', 2022, 'xcxf', 12, 1234657800, 'M', 'sdszds', 1, '2022-12-04', 1, '0000-00-00', 1, '0000-00-00', '0000-00-00', '0000-00-00', 4, 4),
('6/CKG/1', 2022, 'dxgd', 15, 1521456311, 'M', 'fvdxgfd', 5, '2022-12-05', 1, '0000-00-00', 1, '0000-00-00', '0000-00-00', '0000-00-00', 4, 1),
('7/DEN/3', 2022, 'fgfcg', 12, 2123456789, 'M', 'hjnb', 2, '2022-12-08', 1, '0000-00-00', 1, '0000-00-00', '0000-00-00', '0000-00-00', 4, 1);

-- --------------------------------------------------------

--
-- Table structure for table `patientstatus`
--

CREATE TABLE `patientstatus` (
  `id` int(11) NOT NULL,
  `Status` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `patientstatus`
--

INSERT INTO `patientstatus` (`id`, `Status`) VALUES
(1, 'Not Rated'),
(2, 'Sended to MOH'),
(3, 'Under Investigation'),
(4, 'Completed');

-- --------------------------------------------------------

--
-- Table structure for table `phi_area`
--

CREATE TABLE `phi_area` (
  `area_ID` int(11) NOT NULL,
  `area` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `phi_area`
--

INSERT INTO `phi_area` (`area_ID`, `area`) VALUES
(1, 'Udunuwara'),
(2, 'Bambaradeniya');

-- --------------------------------------------------------

--
-- Table structure for table `staff`
--

CREATE TABLE `staff` (
  `hide` int(11) NOT NULL,
  `s_ID` int(11) NOT NULL,
  `type_ID` int(11) NOT NULL,
  `full_name` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  `password` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `staff`
--

INSERT INTO `staff` (`hide`, `s_ID`, `type_ID`, `full_name`, `email`, `password`) VALUES
(0, 2, 3, 'Mr. David', 'd@gmail.com', '81dc9bdb52d04dc20036dbd8313ed055'),
(0, 3, 1, 'dr. Gaythri', 'g@gmail.com', '81dc9bdb52d04dc20036dbd8313ed055'),
(0, 4, 2, 'Mr. Bandara', 'bandara1@gmail.com', '81dc9bdb52d04dc20036dbd8313ed055'),
(0, 5, 4, 'miss. Saduni', 's@gmail.com', '250cf8b51c773f3f8dc8b4be867a9a02'),
(0, 8, 2, 'Mr. John', 'j@gmail.com', '81dc9bdb52d04dc20036dbd8313ed055'),
(1, 10, 1, 'J1@gmail.com', 'J1@gmail.com', 'b34fd460eb949de2f0b4155ae254d218'),
(2, 11, 6, 'nnghg', 'hfgh@gmail.com', '-'),
(2, 12, 1, 'hj', 'hj@gmail.com', '-');

-- --------------------------------------------------------

--
-- Table structure for table `staff_type`
--

CREATE TABLE `staff_type` (
  `id` int(11) NOT NULL,
  `typeName` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `staff_type`
--

INSERT INTO `staff_type` (`id`, `typeName`) VALUES
(1, 'MOH'),
(2, 'SPHI'),
(3, 'ADMIN'),
(4, 'Statistical Officer'),
(6, 'Mid Wives');

-- --------------------------------------------------------

--
-- Table structure for table `syringe`
--

CREATE TABLE `syringe` (
  `id` int(11) NOT NULL,
  `s_type` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `syringe`
--

INSERT INTO `syringe` (`id`, `s_type`) VALUES
(1, '0.05 ml'),
(2, '0.1 ml'),
(3, '0.5 ml'),
(4, '2 ml'),
(5, '5 ml');

-- --------------------------------------------------------

--
-- Table structure for table `syringe_store`
--

CREATE TABLE `syringe_store` (
  `sr_ID` int(11) NOT NULL,
  `srngID` int(11) NOT NULL,
  `date` varchar(255) NOT NULL,
  `updatedDate` varchar(255) NOT NULL,
  `inStock` int(11) NOT NULL,
  `recived_this_month` int(11) NOT NULL,
  `issued` int(11) NOT NULL,
  `used` int(11) NOT NULL,
  `staffID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `syringe_store`
--

INSERT INTO `syringe_store` (`sr_ID`, `srngID`, `date`, `updatedDate`, `inStock`, `recived_this_month`, `issued`, `used`, `staffID`) VALUES
(1, 1, '2022-12-01', '', 5, 0, 0, 0, 0),
(2, 2, '2022-12-01', '', 0, 0, 0, 0, 0),
(3, 3, '2022-12-01', '', 0, 0, 0, 0, 0),
(4, 4, '2022-12-01', '', 0, 0, 0, 0, 0),
(5, 5, '2022-12-01', '', 0, 0, 0, 0, 0),
(6, 1, '2022-12-06', '', 30, 25, 0, 0, 5),
(7, 1, '2022-12-06', '', 35, 5, 0, 0, 5),
(8, 1, '2022-12-06', '', 37, 2, 0, 0, 5),
(9, 1, '2022-12-06', '', 42, 5, 0, 0, 5),
(10, 2, '2022-12-06', '', 5, 5, 0, 0, 5),
(11, 2, '2022-12-06', '', 10, 5, 0, 0, 5),
(12, 2, '2022-12-06', '', 15, 5, 0, 0, 5),
(13, 2, '2022-12-06', '', 17, 2, 0, 0, 5),
(14, 3, '2022-12-06', '', 5, 5, 0, 0, 5),
(15, 1, '2022-12-06', '', 45, 3, 0, 0, 5),
(16, 1, '2022-12-06', '', 50, 5, 0, 0, 5),
(17, 2, '2022-12-06', '', 20, 3, 0, 0, 5),
(18, 5, '2022-12-06', '2022-12-07', 5, 5, 0, 0, 5),
(19, 4, '2022-12-06', '', 5, 5, 0, 0, 5),
(20, 1, '2022-12-07', '', 60, 10, 0, 0, 5),
(21, 1, '2022-12-07', '', 70, 10, 0, 0, 5),
(22, 2, '2022-12-07', '2022-12-07', 26, 6, 0, 0, 5),
(23, 1, '2022-12-07', '2022-12-07', 55, 0, 15, 0, 3),
(24, 1, '2022-12-07', '2022-12-07', 50, 0, 5, 0, 3),
(25, 2, '2022-12-07', '2022-12-07', 21, 0, 5, 0, 3),
(26, 2, '2022-12-07', '2022-12-07', 20, 0, 1, 0, 3),
(27, 2, '2022-12-07', '2022-12-07', 15, 0, 5, 0, 3),
(28, 2, '2022-12-07', '2022-12-07', 13, 0, 2, 0, 3),
(29, 1, '2022-12-07', '2022-12-07', 45, 0, 5, 0, 3),
(30, 1, '2022-12-07', '2022-12-07', 43, 0, 2, 0, 3),
(31, 3, '2022-12-07', '2022-12-07', 3, 0, 2, 0, 3),
(32, 2, '2022-12-07', '2022-12-07', 10, 0, 3, 0, 3),
(33, 2, '2022-12-07', '2022-12-07', 5, 0, 5, 0, 3),
(34, 2, '2022-12-07', '2022-12-07', 2, 0, 3, 0, 3),
(35, 3, '2022-12-07', '2022-12-07', 0, 0, 3, 0, 3),
(36, 4, '2022-12-07', '2022-12-07', 3, 0, 2, 0, 3),
(37, 2, '2022-12-07', '2022-12-07', 0, 0, 2, 0, 3),
(38, 4, '2022-12-07', '2022-12-07', 2, 0, 1, 0, 3),
(39, 4, '2022-12-07', '2022-12-07', 1, 0, 1, 0, 4),
(40, 1, '2022-12-07', '2022-12-07', 3, 0, 40, 0, 2),
(41, 4, '2022-12-07', '2022-12-07', 0, 0, 1, 0, 2),
(42, 3, '2022-12-07', '2022-12-07', 10, 10, 0, 0, 5);

-- --------------------------------------------------------

--
-- Table structure for table `vaccine`
--

CREATE TABLE `vaccine` (
  `v_ID` int(11) NOT NULL,
  `vaccine_name` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `vaccine`
--

INSERT INTO `vaccine` (`v_ID`, `vaccine_name`) VALUES
(6, 'BCG'),
(7, 'PVV'),
(8, 'OPV'),
(9, 'FIPV'),
(10, 'DPT'),
(11, 'DT'),
(12, 'MMR'),
(13, 'LIEV'),
(14, 'aTd'),
(15, 'HPV'),
(16, 'TT'),
(17, 'Typoid');

-- --------------------------------------------------------

--
-- Table structure for table `vaccine_store`
--

CREATE TABLE `vaccine_store` (
  `vs_ID` int(11) NOT NULL,
  `vaccine_ID` int(11) NOT NULL,
  `date` varchar(255) NOT NULL,
  `updatedDate` varchar(255) NOT NULL,
  `inStock` int(11) NOT NULL,
  `recived_this_month` int(11) NOT NULL,
  `issued` int(11) NOT NULL,
  `used` int(11) NOT NULL,
  `staff_ID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `vaccine_store`
--

INSERT INTO `vaccine_store` (`vs_ID`, `vaccine_ID`, `date`, `updatedDate`, `inStock`, `recived_this_month`, `issued`, `used`, `staff_ID`) VALUES
(14, 6, '2022-12-06', '', 50, 50, 0, 0, 5),
(15, 6, '2022-12-06', '', 55, 5, 0, 0, 5),
(16, 6, '2022-12-06', '', 60, 5, 0, 0, 5),
(17, 6, '2022-12-06', '', 65, 5, 0, 0, 5),
(18, 6, '2022-12-06', '', 66, 1, 0, 0, 5),
(19, 6, '2022-12-06', '', 71, 5, 0, 0, 5),
(20, 6, '2022-12-06', '', 75, 4, 0, 0, 5),
(21, 9, '2022-12-06', '2022-12-07', 50, 50, 0, 0, 5),
(22, 7, '2022-12-06', '', 2, 2, 0, 0, 5),
(23, 6, '2022-12-06', '', 77, 2, 0, 0, 5),
(24, 6, '2022-12-06', '', 80, 3, 0, 0, 5),
(25, 6, '2022-12-06', '', 90, 10, 0, 0, 5),
(26, 7, '2022-12-06', '', 5, 3, 0, 0, 5),
(27, 6, '2022-12-06', '', 100, 10, 0, 0, 5),
(28, 6, '2022-12-06', '', 108, 8, 0, 0, 5),
(29, 7, '2022-12-06', '', 5, 0, 0, 0, 5),
(30, 8, '2022-12-06', '', 10, 10, 0, 0, 5),
(31, 12, '2022-12-06', '', 30, 30, 0, 0, 5),
(32, 8, '2022-12-06', '2022-12-07', 25, 15, 0, 0, 5),
(33, 6, '2022-12-07', '2022-12-07', 113, 5, 0, 0, 5),
(34, 17, '2022-12-07', '', 0, 0, 0, 0, 5),
(35, 13, '2022-12-07', '', 50, 50, 0, 0, 5),
(36, 6, '2022-11-07', '2022-12-07', 110, 0, 13, 3, 3),
(37, 6, '2022-12-07', '2022-12-07', 95, 0, 15, 5, 11),
(38, 6, '2022-12-07', '2022-12-07', 85, 0, 3, 0, 11),
(39, 8, '2022-12-07', '2022-12-07', 24, 0, 5, 1, 11),
(40, 8, '2022-12-07', '2022-12-07', 20, 0, 2, 0, 3),
(41, 7, '2022-12-07', '2022-12-07', 2, 0, 3, 0, 3),
(42, 6, '2022-12-07', '2022-12-07', 70, 0, 12, 10, 4),
(43, 8, '2022-12-07', '2022-12-07', 18, 0, 5, 0, 3),
(44, 12, '2022-12-07', '2022-12-07', 21, 0, 5, 4, 3),
(45, 9, '2022-12-07', '2022-12-07', 44, 0, 4, 2, 3),
(46, 6, '2022-12-07', '2022-12-07', 75, 0, 5, 0, 4),
(47, 6, '2022-12-07', '2022-12-07', 60, 0, 5, 0, 5),
(48, 7, '2022-12-07', '2022-12-07', 58, 56, 0, 0, 5);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `disease`
--
ALTER TABLE `disease`
  ADD PRIMARY KEY (`d_ID`);

--
-- Indexes for table `notified_by`
--
ALTER TABLE `notified_by`
  ADD PRIMARY KEY (`n_ID`);

--
-- Indexes for table `patient`
--
ALTER TABLE `patient`
  ADD PRIMARY KEY (`Serial_No`),
  ADD KEY `disease_ID` (`disease_ID`),
  ADD KEY `NotifiedBy_ID` (`NotifiedBy_ID`),
  ADD KEY `Phi_Area` (`Phi_Area`),
  ADD KEY `satff_ID` (`satff_ID`),
  ADD KEY `Status` (`Status`);

--
-- Indexes for table `patientstatus`
--
ALTER TABLE `patientstatus`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `phi_area`
--
ALTER TABLE `phi_area`
  ADD PRIMARY KEY (`area_ID`);

--
-- Indexes for table `staff`
--
ALTER TABLE `staff`
  ADD PRIMARY KEY (`s_ID`),
  ADD KEY `type_ID` (`type_ID`);

--
-- Indexes for table `staff_type`
--
ALTER TABLE `staff_type`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `syringe`
--
ALTER TABLE `syringe`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `syringe_store`
--
ALTER TABLE `syringe_store`
  ADD PRIMARY KEY (`sr_ID`),
  ADD KEY `srngID` (`srngID`);

--
-- Indexes for table `vaccine`
--
ALTER TABLE `vaccine`
  ADD PRIMARY KEY (`v_ID`);

--
-- Indexes for table `vaccine_store`
--
ALTER TABLE `vaccine_store`
  ADD PRIMARY KEY (`vs_ID`),
  ADD KEY `vaccine_ID` (`vaccine_ID`),
  ADD KEY `staff_ID` (`staff_ID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `disease`
--
ALTER TABLE `disease`
  MODIFY `d_ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `notified_by`
--
ALTER TABLE `notified_by`
  MODIFY `n_ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `patientstatus`
--
ALTER TABLE `patientstatus`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `phi_area`
--
ALTER TABLE `phi_area`
  MODIFY `area_ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `staff`
--
ALTER TABLE `staff`
  MODIFY `s_ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- AUTO_INCREMENT for table `staff_type`
--
ALTER TABLE `staff_type`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `syringe`
--
ALTER TABLE `syringe`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `syringe_store`
--
ALTER TABLE `syringe_store`
  MODIFY `sr_ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=43;

--
-- AUTO_INCREMENT for table `vaccine`
--
ALTER TABLE `vaccine`
  MODIFY `v_ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=19;

--
-- AUTO_INCREMENT for table `vaccine_store`
--
ALTER TABLE `vaccine_store`
  MODIFY `vs_ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=49;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `patient`
--
ALTER TABLE `patient`
  ADD CONSTRAINT `patient_ibfk_1` FOREIGN KEY (`disease_ID`) REFERENCES `disease` (`d_ID`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `patient_ibfk_2` FOREIGN KEY (`NotifiedBy_ID`) REFERENCES `notified_by` (`n_ID`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `patient_ibfk_3` FOREIGN KEY (`Phi_Area`) REFERENCES `phi_area` (`area_ID`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `patient_ibfk_4` FOREIGN KEY (`satff_ID`) REFERENCES `staff` (`s_ID`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `patient_ibfk_5` FOREIGN KEY (`Status`) REFERENCES `patientstatus` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `staff`
--
ALTER TABLE `staff`
  ADD CONSTRAINT `staff_ibfk_1` FOREIGN KEY (`type_ID`) REFERENCES `staff_type` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `syringe_store`
--
ALTER TABLE `syringe_store`
  ADD CONSTRAINT `syringe_store_ibfk_1` FOREIGN KEY (`srngID`) REFERENCES `syringe` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `vaccine_store`
--
ALTER TABLE `vaccine_store`
  ADD CONSTRAINT `vaccine_store_ibfk_1` FOREIGN KEY (`vaccine_ID`) REFERENCES `vaccine` (`v_ID`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `vaccine_store_ibfk_2` FOREIGN KEY (`staff_ID`) REFERENCES `staff` (`s_ID`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
