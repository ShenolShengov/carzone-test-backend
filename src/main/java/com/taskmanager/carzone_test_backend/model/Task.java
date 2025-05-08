package com.taskmanager.carzone_test_backend.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "tasks")
public class Task extends BaseEntity {
    private String name;
    private String description;
}
