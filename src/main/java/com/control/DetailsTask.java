package com.control;

import java.util.Date;

public class DetailsTask {
    private long idTask;
    private String status;
    private int priority;
    private String description;
    Date dateStart = new Date();
    Date dateEnd = new Date();

    DetailsTask() {
        this.status = "Begin";
        this.priority = 1;
    }
    DetailsTask(long idTask) {
        this.idTask = idTask;
        this.status = "Begin";
        this.priority = 1;
    }

    DetailsTask(long idTask, int priority) {
        this(idTask);
        this.priority = priority;
    }

    DetailsTask(long idTask, Date dateStart, Date dateEnd) {
        this(idTask);
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
    }

    DetailsTask(long idTask, int priority, Date dateStart, Date dateEnd) {
        this(idTask, priority);
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
    }

    public void setIdTask(long idTask) {
        this.idTask = idTask;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getIdTask() {
        return idTask;
    }

    public String getStatus() {
        return status;
    }

    public int getPriority() {
        return priority;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "DetailsTask{" +
                "idTask=" + idTask +
                ", status='" + status + '\'' +
                ", priority=" + priority +
                ", description='" + description + '\'' +
                ", dateStart=" + dateStart +
                ", dateEnd=" + dateEnd +
                '}';
    }
}
