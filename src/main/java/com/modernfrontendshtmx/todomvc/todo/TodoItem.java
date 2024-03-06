package com.modernfrontendshtmx.todomvc.todo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;

import java.util.Date;

@Entity
public class TodoItem {
    @Id
    @GeneratedValue
    private Long id;
    @NotBlank
    private String title;
    private boolean completed;
    private Date registration_date;

    protected TodoItem() {
    }

    public TodoItem(String title, boolean completed, Date registration_date) {
        this.title = title;
        this.completed = completed;
        this.registration_date = registration_date;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public Date getRegistration_date() {
        return registration_date;
    }

    public void setRegistration_date(Date registration_date) {
        this.registration_date = registration_date;
    }
}