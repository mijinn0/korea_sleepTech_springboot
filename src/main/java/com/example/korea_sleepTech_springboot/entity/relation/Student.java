package com.example.korea_sleepTech_springboot.entity.relation;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

// 다 대 다 관계
// : 양쪽 모두 여러 개
// EX) 사용자 여러 명 - 여러 개의 그룹
// EX) 학생 여러 명 - 여러 개의 강의

/*
* 1) 다대다 연결 테이블의 엔티티화 X
*   : 단순한 다대다 관계
*   - 학생과 강의가 서로 연결만 하면 되는 경우
*   - 중간 테이블에 별도 컬럼(수강 날짜, 성적 등)이 필요 없는 경우
*
* 2) 다대다 연결 테이블의 엔티티화 O
*   : 연결 테이브렝 별도의 컬럼이 존재하는 경우
* */
@Entity
public class Student {
    @Id @GeneratedValue
    private Long id;

    private String name;

    @ManyToMany
    @JoinTable(
            name = "student_courses", // 다대다 연결 테이블

            // 다대다 연결 테이블 내의 복합키를 각각 설정
            // PRIMARY KEY (student_id, course_id)
            joinColumns = @JoinColumn(name = "student_id"),
            inverseJoinColumns = @JoinColumn(name = "course_id")
    )
    private Set<Course> courses = new HashSet<>();
}

/*
* CREATE TABLE student (
*   id BIGINT PRIMARY KEY AUTO_INCREMENT,
*   name VARCHAR(100)
* );
* */

/*
 * CREATE TABLE student_courses (
 *   student_id BIGINT,
 *   course_id BIGINT,
 *   PRIMARY KEY(student_id, courser_id),
 *   FOREIGN KEY (student_id) REFERENCES student(id),
 *   FOREIGN KEY (course_id) REFERENCES course(id)
 * );
 * */