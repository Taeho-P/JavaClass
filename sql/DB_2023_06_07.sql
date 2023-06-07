SELECT *
FROM DEPARTMENT, student
WHERE department.DEPT_ID = student.DEPT_ID;

SELECT address
FROM student;

SELECT DISTINCT address
FROM student;

SELECT *
FROM professor;

SELECT name, year_emp, 2023-year_emp
FROM professor;

SELECT student.name, student.STU_ID, department.DEPT_NAME
FROM student, DEPARTMENT
WHERE student.DEPT_ID = department.DEPT_ID;

SELECT student.STU_ID 
FROM STUDENT, DEPARTMENT
WHERE student.DEPT_ID  = department.DEPT_ID AND student."YEAR" = 3 AND department.DEPT_NAME = '컴퓨터공학과';

SELECT *
FROM student;

UPDATE STUDENT 
SET YEAR = YEAR - 1;

SELECT name, stu_id
FROM STUDENT
WHERE YEAR = 3 OR year = 4
ORDER BY name, stu_id;

SELECT name, stu_id
FROM STUDENT
WHERE YEAR = 3 OR YEAR = 4
ORDER BY name DESC, stu_id;

SELECT s.name, d.dept_name
FROM STUDENT s , DEPARTMENT d 
WHERE s.DEPT_ID = d.dept_id;

SELECT  address
FROM student
WHERE name = '김광식';

SELECT name, address
FROM STUDENT
WHERE address = '서울';

SELECT * 
FROM student s1, student s2
WHERE s1.ADDRESS = s2.ADDRESS AND s1.name = '김광식';

SELECT name, POSITION, 2021-year_emp
FROM PROFESSOR;

SELECT name 이름, POSITION 직위, 2021-year_emp 재직연수
FROM PROFESSOR;

SELECT *
FROM STUDENT
WHERE name LIKE '김%';

SELECT *
FROM student;

SELECT s.name, s.YEAR
FROM STUDENT s 
WHERE RESIDENT_ID LIKE '%*2%' OR s.resident_id LIKE '%*4&';

SELECT name FROM STUDENT
union
SELECT name FROM PROFESSOR;

SELECT dept_id FROM STUDENT
UNION all
SELECT dept_id FROM PROFESSOR;

SELECT * FROM takes;

SELECT * FROM CLASS;

SELECT * FROM tab;

insert into takes values('1292001', 'C101-01', 'B+');
insert into takes values('1292001', 'C103-01', 'A+');
insert into takes values('1292001', 'C301-01', 'A');
insert into takes values('1292002', 'C102-01', 'A');
insert into takes values('1292002', 'C103-01', 'B+');
insert into takes values('1292002', 'C502-01', 'C+');
insert into takes values('1292003', 'C103-02', 'B');
insert into takes values('1292003', 'C501-02', 'A+');
insert into takes values('1292301', 'C102-01', 'C+');
insert into takes values('1292303', 'C102-01', 'C');
insert into takes values('1292303', 'C103-02', 'B+');
insert into takes values('1292303', 'C501-01', 'A+');

SELECT s.stu_id
FROM STUDENT s, DEPARTMENT d , TAKES t 
WHERE s.DEPT_ID = d.DEPT_ID AND t.stu_id = s.STU_ID AND dept_name = '컴퓨터공학과' AND grade = 'A+';

SELECT stu_id
FROM student s, department d
WHERE s.DEPT_ID = d.DEPT_ID AND dept_name = '컴퓨터공학과'
INTERSECT 
SELECT stu_id
FROM TAKES
WHERE grade = 'A+';

SELECT * FROM student;

SELECT stu_id FROM STUDENT s , DEPARTMENT d 
WHERE s.DEPT_ID = d.DEPT_ID AND dEPT_name  = '산업공학과'
MINUS
SELECT stu_id FROM TAKES
WHERE grade = 'A+';

SELECT * FROM takes;

insert into takes values('1292001', 'C101-01', 'B+');
insert into takes values('1292001', 'C103-01', 'A+');
insert into takes values('1292001', 'C301-01', 'A');
insert into takes values('1292002', 'C102-01', 'A');
insert into takes values('1292002', 'C103-01', 'B+');
insert into takes values('1292002', 'C502-01', 'C+');
insert into takes values('1292003', 'C103-02', 'B');
insert into takes values('1292003', 'C501-02', 'A+');
insert into takes values('1292301', 'C102-01', 'C+');
insert into takes values('1292303', 'C102-01', 'C');
insert into takes values('1292303', 'C103-02', 'B+');
insert into takes values('1292303', 'C501-01', 'A+');

SELECT stu_id FROM STUDENT s , DEPARTMENT d 
WHERE s.DEPT_ID = d.DEPT_ID AND dEPT_name  = '산업공학과'
MINUS
SELECT stu_id FROM TAKES
WHERE grade = 'A+';


SELECT title, credit, YEAR, semester
FROM COURSE, class
WHERE course.COURSE_ID = class.COURSE_ID;

SELECT * FROM course;

SELECT * FROM class;

SELECT title, credit, YEAR, semester
FROM course LEFT OUTER JOIN CLASS
USING (COURSE_id);

SELECT title, credit, YEAR, semester
FROM COURSE, CLASS
WHERE course.COURSE_ID  = class.COURSE_ID (+);

SELECT title, credit, YEAR, semester
FROM COURSE FULL OUTER JOIN CLASS c 
USING (COURSE_id);

SELECT title, credit
FROM course;

SELECT YEAR, semester
FROM class;

SELECT *
FROM course;

SELECT *
FROM class;

SELECT *
FROM emp
ORDER BY 6 DESC;

SELECT *
FROM STUDENT
WHERE YEAR = 3;

SELECT *
FROM emp;

SELECT count(ename)
FROM EMP;

SELECT count(mgr)
FROM emp;

SELECT count(dept_id)
FROM student;

SELECT count(DISTINCT dept_id)
FROM student;

SELECT count(*)
FROM STUDENT s , department d
WHERE s.dept_id = d.dept_id AND d.DEPT_ID ='컴퓨터공학과';

SELECT *
FROM EMP e ;

SELECT count(*)
FROM EMP e 
WHERE e.job = 'SALESMAN';

SELECT count(*)
FROM EMP e
WHERE e.JOB = 'SALESMAN' AND SAL >= 1500;

SELECT *
FROM professor;

SELECT sum(2012-year_emp)
FROM PROFESSOR;

SELECT sum(sal)
FROM EMP e 
WHERE e.job = 'SALESMAN'

SELECT *
FROM EMP e
WHERE job = 'SALESMAN'

SELECT sum(sal)
FROM dept, EMP
WHERE dept.DEPTNO = emp.DEPTNo AND dept.DNAME = 'RESEARCH';

SELECT avg(2012 - year_emp)
FROM professor

SELECT *
FROM EMP;

SELECT avg(sal)
FROM EMP
WHERE job = 'PRESIDENT';

SELECT max(sal)
FROM EMP e, DEPT d
WHERE e.DEPTNO = d.DEPTNO AND d.DNAME = 'ACCOUNTING'

SELECT ename, max(sal)
FROM emp;

SELECT dept_id, count(*)
FROM STUDENT s 
GROUP BY DEPT_ID;

SELECT dept_name , count(*)
FROM student s, DEPARTMENT d
WHERE s.DEPT_ID  = d.DEPT_ID
GROUP BY dept_name;

SELECT dname, count(*), avg(sal), max(sal), min(sal)
FROM emp e, dept d
WHERE e.DEPTNO = d.DEPTNO
GROUP BY dname
ORDER BY dname;

SELECT dept_name 학과명, count(*) 인원수, avg(2012 - year_emp)평균재직년수, max(2012 - year_emp) 최대재직년수
FROM PROFESSOR p , DEPARTMENT d 
WHERE p.DEPT_ID = d.DEPT_ID
GROUP BY dept_name;

SELECT dept_name, count(*), avg(2012 - year_emp), max(2012 - year_emp)
FROM PROFESSOR p , DEPARTMENT d 
WHERE p.DEPT_ID = d.DEPT_ID AND AVG(2012 - YEAR_EMP) >= 10  -- ORA - 00934 : 그룹함수는 허가되지 않습니다.
GROUP BY DEPT_name;

SELECT dept_name, count(*), avg(2012 - year_emp), max(2012 - year_emp)
FROM PROFESSOR p , DEPARTMENT d 
WHERE p.DEPT_ID = d.DEPT_ID
GROUP BY DEPT_name
HAVING AVG(2012 - YEAR_EMP) >= 10;

SELECT dname, count(*), avg(sal), max(sal), min(sal)
FROM EMP e, DEPT d
WHERE e.DEPTNO = d.DEPTNO
GROUP BY dname
HAVING count(*) >= 5

SELECT count(*)
FROM EMP e 
WHERE comm IS NOT NULL

SELECT stu_id
FROM TAKES t 
WHERE grade <> 'A+' -- <> 는 != 과 같다.

SELECT count(comm)
FROM EMP e 
WHERE comm IS NULL

SELECT *
FROM class
WHERE classroom = '301호'

SELECT *
FROM course

SELECT title
FROM COURSE c 
WHERE COURSE_ID IN (
	SELECT DISTINCT course_id
	FROM CLASS c2 
	WHERE classroom = '301호'
);

SELECT DISTINCT title
FROM COURSE c1, class c2 
WHERE c1.COURSE_ID = c2.COURSE_ID
AND classroom = '301호'

SELECT title
FROM COURSE c 
WHERE COURSE_ID not in(
	SELECT distinct course_id
	FROM CLASS c 
	WHERE YEAR = 2012
	AND semester = 2
)

CREATE OR REPLACE VIEW vm_TAKES AS
SELECT stu_id, class_id
FROM takes

SELECT *
FROM vm_takes

