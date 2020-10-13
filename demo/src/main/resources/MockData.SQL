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

INSERT INTO COURSES (COURSE_ID, NAME, DEPARTMENT, CREDITS, GRADUATE) VALUES
('CSC452', 'Object Oriented Enterprise Computing', 'CDM', 4, 1),
('CSC352', 'Object Oriented Enterprise Computing', 'CDM', 4, 0)
('CSC471', 'Mobile Appplication Development for iOS', 'CDM', 4, 1),
('CSC371', 'Mobile Appplication Development for iOS', 'CDM', 4, 0),
('FIN555', 'Financial Management', 'BUSS', 4, 1),
('CSC 435', 'Distributed Systems', 'CDM', 4, 1),
('CSC 335', 'Distributed Systems', 'CDM', 4, 0);

INSERT INTO CLASSES (COURSE_ID, PROFESSOR_ID) VALUES
('CSC452', 1);