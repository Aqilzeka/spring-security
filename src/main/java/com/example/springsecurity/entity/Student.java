package com.example.springsecurity.entity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class Student {

    private final Integer studentId;
    private final String studentName;

}
