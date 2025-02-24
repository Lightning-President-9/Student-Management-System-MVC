create table student (
    student_id number(4) primary key,
    password varchar2(20) not null,
    first_name varchar2(15) not null,
    last_name varchar2(15) not null,
    email varchar2(30) unique not null,
    dob date,
    address varchar2(50),
    phone_number varchar2(10),
    enrollment_date date,
    department varchar2(5),
    year number(1)
);

create table faculty (
    faculty_id number(3) primary key,
    password varchar2(20) not null,
    first_name varchar2(15) not null,
    last_name varchar2(15) not null,
    email varchar2(30) unique not null,
    department varchar2(5),
    phone_number varchar2(10),
    hire_date date,
    course_name varchar2(30)
);

create table admin (
    admin_id number(2) primary key,
    password varchar2(20) not null,
    first_name varchar2(15) not null,
    last_name varchar2(15) not null,
    email varchar2(30) unique not null,
    phone_number varchar2(10)
);

create table marks (
    student_id number(4),
    department varchar2(5),
    course1_name varchar2(20),
    course1_marks number(6,2),
    course2_name varchar2(20),
    course2_marks number(6,2),
    course3_name varchar2(20),
    course3_marks number(6,2),
    total_marks number(6,2),
    percentage number(6,2),
    result varchar2(4)
);

create table log_table (
    log_id number primary key,
    id number(4),
    person_type varchar2(7),
    log_date date,
    log_time varchar2(8)
);

create table faculty_log (
    faculty_id number(3),
    action varchar2(8),
    log_date date,
    log_time varchar2(8)
);

create table admin_log (
    admin_id number(2),
    action varchar2(8),
    log_date date,
    log_time varchar2(8)
);