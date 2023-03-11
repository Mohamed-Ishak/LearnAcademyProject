-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Mar 11, 2023 at 06:25 PM
-- Server version: 10.4.27-MariaDB
-- PHP Version: 8.0.25

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `learn_academy`
--

-- --------------------------------------------------------

--
-- Table structure for table `class`
--

CREATE TABLE `class` (
  `classID` int(11) NOT NULL,
  `teacher_Name` varchar(50) NOT NULL,
  `subject_Name` varchar(50) NOT NULL,
  `teacher_id` int(11) NOT NULL,
  `subject_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `class`
--

INSERT INTO `class` (`classID`, `teacher_Name`, `subject_Name`, `teacher_id`, `subject_id`) VALUES
(1, 'Yasin', 'Javascript', 3, 2),
(2, 'Gamal', 'Data Structure', 5, 4),
(3, 'Yasin', 'HTML&CSS', 3, 5),
(4, 'Ahmed', 'Operating System', 1, 1),
(5, 'Gamal', 'Algorithms', 5, 3);

-- --------------------------------------------------------

--
-- Table structure for table `student`
--

CREATE TABLE `student` (
  `studentID` int(11) NOT NULL,
  `classID` int(11) NOT NULL,
  `studentName` varchar(255) NOT NULL,
  `stEmail` varchar(50) NOT NULL,
  `stPhone` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `student`
--

INSERT INTO `student` (`studentID`, `classID`, `studentName`, `stEmail`, `stPhone`) VALUES
(1, 1, 'Mohamed', 'mohamed@gmail.com', 3254716),
(2, 1, 'Samer', 'samer@gmail.com', 542716),
(3, 2, 'Shady', 'shady@gmail.com', 7564985),
(4, 1, 'Kiro', 'kiroy@gmail.com', 96559885),
(5, 3, 'Tamer', 'tamer@gmail.com', 84149815),
(6, 2, 'Kamal', 'kamal@gmail.com', 98569615);

-- --------------------------------------------------------

--
-- Table structure for table `subject`
--

CREATE TABLE `subject` (
  `subjectID` int(11) NOT NULL,
  `subName` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `subject`
--

INSERT INTO `subject` (`subjectID`, `subName`) VALUES
(1, 'Operating System'),
(2, 'JavaScript'),
(3, 'Algorithms'),
(4, 'Data Structure'),
(5, 'HTML & CSS');

-- --------------------------------------------------------

--
-- Table structure for table `teacher`
--

CREATE TABLE `teacher` (
  `teacherID` int(11) NOT NULL,
  `teacherName` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `teacher`
--

INSERT INTO `teacher` (`teacherID`, `teacherName`) VALUES
(1, 'Ahmed'),
(2, 'Hassan'),
(3, 'Yasin'),
(4, 'Khaled'),
(5, 'Gamal');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `class`
--
ALTER TABLE `class`
  ADD PRIMARY KEY (`classID`),
  ADD KEY `teacher` (`teacher_Name`),
  ADD KEY `subject` (`subject_Name`),
  ADD KEY `teacher_id` (`teacher_id`),
  ADD KEY `subject_id` (`subject_id`);

--
-- Indexes for table `student`
--
ALTER TABLE `student`
  ADD PRIMARY KEY (`studentID`);

--
-- Indexes for table `subject`
--
ALTER TABLE `subject`
  ADD PRIMARY KEY (`subjectID`);

--
-- Indexes for table `teacher`
--
ALTER TABLE `teacher`
  ADD PRIMARY KEY (`teacherID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
