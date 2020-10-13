-- Populate base tables

INSERT INTO ADMINS (ADMIN_ID, FIRST_NAME, LAST_NAME) VALUES
(1, 'Hugh', 'Jackman'),
(2, 'Jackie', 'Chan'),
(3, 'Bill', 'Gates');

INSERT INTO STUDENTS (STUDENT_ID, FIRST_NAME, LAST_NAME, U_PASS, CREDITS_TAKEN) VALUES
(1, 'Kevin', 'Lee', 11111, 0),
(2, 'Kalgi', 'Pawar', 22222, 0),
(3, 'Arta', 'Khademinejad', 33333, 0),
(4, 'Christopher', 'Gibson', 44444, 0),
(5, 'Yunfei', 'Shi', 55555, 0);

INSERT INTO PROFESSORS (PROFESSOR_ID, FIRST_NAME, LAST_NAME) VALUES
(1, 'Ken', 'Yu'),
(2, 'Joesph','Phillips'),
(3, 'Clark','Elliott');

INSERT INTO COURSES (COURSE_ID, SHORT_NAME, NAME, DEPARTMENT, CREDITS, GRADUATE) VALUES
(452, 'CSC452', 'Object Oriented Enterprise Computing', 'CDM', 4, 1),
(352, 'CSC352', 'Object Oriented Enterprise Computing', 'CDM', 4, 0)
(471, 'CSC471', 'Mobile Appplication Development for iOS', 'CDM', 4, 1),
(371, 'CSC371', 'Mobile Appplication Development for iOS', 'CDM', 4, 0),
(555, 'FIN555', 'Financial Management', 'BUSS', 4, 1),
(435, 'CSC435', 'Distributed Systems', 'CDM', 4, 1),
(335, 'CSC335', 'Distributed Systems', 'CDM', 4, 0);

INSERT INTO CLASSES (CLASS_ID, COURSE_ID, PROFESSOR_ID) VALUES
(1, 'CSC452', 1),
(1, 'CSC352', 1),
(1, 'CSC471', 3),
(1, 'CSC371', 3);

INSERT INTO GRADES (COURSE_ID, CLASS_ID, GRADES_EARNED, STUDENT_ID) VALUES
(452, 1, 4.0, 1),
(452, 1, 4.0, 2),
(452, 1, 4.0, 3),
(452, 1, 4.0, 4),
(452, 1, 4.0, 5);

INSERT INTO ENROLLMENT (CLASS_ID, STUDENT_ID) VALUES
(1, 1),
(1, 2),
(1, 3),
(1, 4),
(1, 5);

INSERT INTO TUITION (TUITION_ID, STUDENT_ID, MONEY_DUE, QUARTER) VALUES
(11, 1, 5000, 'FALL2020'),
(22, 2, 5000, 'FALL2020'),
(33, 3, 5000, 'FALL2020'),
(44, 4, 5000, 'FALL2020'),
(55, 5, 5000, 'FALL2020');

INSERT INTO PAYMENTS (PAYMENT_ID, TUITION_ID, AMOUNT_PAID) VALUES
(111, 11, 5),
(222, 22, 100),
(333, 33, 30),
(444, 44, 65),
(555, 55, 500);

INSERT INTO LOGIN (LOGIN_ID, PASSWORD, ACCESS_TYPE, STUDENT_ID) VALUES
(123, 'ABD', 'STUDENT', 1),
(345, 'EFG', 'STUDENT', 2),
(678, 'HIJ', 'STUDENT', 3),
(910, 'KLM', 'STUDENT', 4),
(911, 'NOP', 'STUDENT', 5);





