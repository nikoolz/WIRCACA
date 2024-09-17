/** Create Project Tables **/
drop table students;
CREATE TABLE `students` (
  `id` int unsigned NOT NULL AUTO_INCREMENT,
  `first_name` varchar(255),
  `middle_name` varchar(255),
  `last_name` varchar(255),
  `age` int,
   `gender` varchar(6),
   `birthday` date,
    `strand` varchar(5),
    `level` int,
    `section` int,
    `school_id` varchar(255),
    `contact_info` varchar(255),
    `email` varchar(255),
    `former_school` varchar(255),
    `permanent_address` varchar(255),
    `present_address` varchar(255),
    `city` varchar(255),
    `province` varchar(255),
    `zip_code` varchar(255),
    `barangay` varchar(255),
    `picture` varchar(1000),
     PRIMARY KEY (`id`)
);

drop table users;
CREATE TABLE `users` (
  `id` int unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `username` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `is_admin` tinyint(1) DEFAULT '0',
  `student_id` int unsigned DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `username_uk` (`username`),
  KEY `student_fk` (`student_id`),
  CONSTRAINT `student_fk` FOREIGN KEY (`student_id`) REFERENCES `students` (`id`) ON DELETE CASCADE
) ;
