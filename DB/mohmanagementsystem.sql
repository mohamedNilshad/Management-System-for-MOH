-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 26, 2022 at 04:13 PM
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
(3, 'CORONA', 'CO-19');

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
(1, 'Hospital');

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
  `satff_ID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `patient`
--

INSERT INTO `patient` (`Serial_No`, `year`, `patient_Name`, `Age`, `Phone`, `Gender`, `Adress`, `disease_ID`, `Notified_date`, `NotifiedBy_ID`, `D_recept_by_MOH`, `Phi_Area`, `D_Dispatch_To_PHI`, `D_of_Investigation`, `D_Out_Come`, `satff_ID`) VALUES
('1/TB/1', 2022, 'jhon', 15, 12345678, 'M', '123/fchf', 1, '2022-11-08', 1, '2022-11-08', 2, '0000-00-00', '0000-00-00', '0000-00-00', 4),
('2/Dengue/1', 2022, 'anne', 23, 1324567, 'F', 'dzxfc21', 2, '2022-11-04', 1, '2022-11-04', 1, '0000-00-00', '0000-00-00', '0000-00-00', 4),
('3/DENGUE/2', 2022, 'avi', 12, 1124, 'M', '12jhhgj', 2, '2022-11-26', 1, '0000-00-00', 1, '0000-00-00', '0000-00-00', '0000-00-00', 4),
('4/TB/2', 2022, 'avi', 12, 1124, 'M', '12jhhgj', 1, '2022-11-26', 1, '0000-00-00', 1, '0000-00-00', '0000-00-00', '0000-00-00', 4),
('5/CORONA/1', 2022, 'avi', 12, 1124, 'M', '12jhhgj', 3, '2022-11-26', 1, '0000-00-00', 1, '0000-00-00', '0000-00-00', '0000-00-00', 4),
('6/DEN/3', 2022, 'bg', 12, 456, 'F', '12dfsdf', 2, '2022-11-10', 1, '0000-00-00', 2, '0000-00-00', '0000-00-00', '0000-00-00', 4),
('7/TB/3', 2022, 'bg', 12, 456, 'F', '12dfsdf', 1, '2022-11-10', 1, '0000-00-00', 2, '0000-00-00', '0000-00-00', '0000-00-00', 4),
('8/CO-19/2', 2022, 'bg', 12, 456, 'F', '12dfsdf', 3, '2022-11-10', 1, '0000-00-00', 2, '0000-00-00', '0000-00-00', '0000-00-00', 4);

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
(0, 5, 4, 'miss. Saduni', 'saduni@gmail.com', '81dc9bdb52d04dc20036dbd8313ed055'),
(0, 8, 2, 'Mr. John', 'j@gmail.com', '81dc9bdb52d04dc20036dbd8313ed055'),
(1, 10, 1, 'J1@gmail.com', 'J1@gmail.com', 'b34fd460eb949de2f0b4155ae254d218');

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
(4, 'Statistical Officer');

-- --------------------------------------------------------

--
-- Table structure for table `vaccine`
--

CREATE TABLE `vaccine` (
  `v_ID` int(11) NOT NULL,
  `vaccine_name` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `vaccine_store`
--

CREATE TABLE `vaccine_store` (
  `vs_ID` int(11) NOT NULL,
  `vaccine_ID` int(11) NOT NULL,
  `date` date NOT NULL,
  `reminder` int(11) NOT NULL,
  `recived_this_month` int(11) NOT NULL,
  `issued` int(11) NOT NULL,
  `used` int(11) NOT NULL,
  `balance` int(11) NOT NULL,
  `staff_ID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

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
  ADD KEY `satff_ID` (`satff_ID`);

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
  MODIFY `d_ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `notified_by`
--
ALTER TABLE `notified_by`
  MODIFY `n_ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `phi_area`
--
ALTER TABLE `phi_area`
  MODIFY `area_ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `staff`
--
ALTER TABLE `staff`
  MODIFY `s_ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT for table `staff_type`
--
ALTER TABLE `staff_type`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `vaccine`
--
ALTER TABLE `vaccine`
  MODIFY `v_ID` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `vaccine_store`
--
ALTER TABLE `vaccine_store`
  MODIFY `vs_ID` int(11) NOT NULL AUTO_INCREMENT;

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
  ADD CONSTRAINT `patient_ibfk_4` FOREIGN KEY (`satff_ID`) REFERENCES `staff` (`s_ID`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `staff`
--
ALTER TABLE `staff`
  ADD CONSTRAINT `staff_ibfk_1` FOREIGN KEY (`type_ID`) REFERENCES `staff_type` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

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
