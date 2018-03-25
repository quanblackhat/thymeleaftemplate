package com.quangtk.DemoThymleaf.model;

public class User {
    private int id;
    private String name;
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private int newTask;
    private int taskPending;
    private int inboxCount;
    private int notificationCount;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNewTask() {
        return newTask;
    }

    public void setNewTask(int newTask) {
        this.newTask = newTask;
    }

    public int getTaskPending() {
        return taskPending;
    }

    public void setTaskPending(int taskPending) {
        this.taskPending = taskPending;
    }

    public int getInboxCount() {
        return inboxCount;
    }

    public void setInboxCount(int inboxCount) {
        this.inboxCount = inboxCount;
    }

    public int getNotificationCount() {
        return notificationCount;
    }

    public void setNotificationCount(int notificationCount) {
        this.notificationCount = notificationCount;
    }

    public User(int id, String name, int newTask, int taskPending, int inboxCount, int notificationCount) {
        this.id = id;
        this.name = name;
        this.newTask = newTask;
        this.taskPending = taskPending;
        this.inboxCount = inboxCount;
        this.notificationCount = notificationCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;

        User user = (User) o;

        return getId() == user.getId();
    }

    @Override
    public int hashCode() {
        return getId();
    }
}
