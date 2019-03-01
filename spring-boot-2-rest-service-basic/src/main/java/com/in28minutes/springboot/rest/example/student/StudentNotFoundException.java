package com.in28minutes.springboot.rest.example.student;

import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus
public class StudentNotFoundException extends RuntimeException{

private String id;

public StudentNotFoundException(String id) {
super(String.format(" not found : '%s'",id));
this.id=id;

}

public String getId() {
return this.id;
}

}