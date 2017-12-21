package com.trinhha.scrumboard.scrumboardserver.task.entity;

import com.trinhha.scrumboard.scrumboardserver.util.Constants;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Time;

@Entity
@SequenceGenerator(
        name = "task_sequence",
        sequenceName = "task_sequence",
        allocationSize = 1
)
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TASK_SEQ")
    @SequenceGenerator(sequenceName = "task_sequence", allocationSize = 1, name
            = "TASK_SEQ")
    public int id;

    @Override
    public String toString() {
        return this.title + Constants.STR__NEW_LINE + this.description + Constants.STR__NEW_LINE + this.dateLine + this.priority;
    }

    @NotNull
    @Column(name = "title")
    public String title;

    @Column(name = "description")
    public String description;

    @Column(name = "create_time")
    public Time createTime;

    @Column(name = "update_time")
    public Time updateTime;

    @Column(name = "priority")
    public int priority;

    @Column(name = "dateline")
    public Time dateLine;

    @Column(name = "category")
    public int category;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Time getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Time createTime) {
        this.createTime = createTime;
    }

    public Time getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Time updateTime) {
        this.updateTime = updateTime;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public Time getDateLine() {
        return dateLine;
    }

    public void setDateLine(Time dateLine) {
        this.dateLine = dateLine;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }
}


