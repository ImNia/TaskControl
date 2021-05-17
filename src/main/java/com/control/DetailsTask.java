package com.control;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DetailsTask {
    private long idTask;
    private String status;
    private int priority;
    private String description;
    Date dateStart;
    Date dateEnd;

    DetailsTask() {
        status = "Begin";
        priority = 1;
        dateStart = new Date();
        dateEnd = new Date();
    }
    DetailsTask(long idTask) {
        this();
        this.idTask = idTask;
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

    public void setDateStart(String date) {
        try {
            dateStart = new SimpleDateFormat("dd/MM/yyyy").parse(date);
        } catch (Exception ex) {
            dateStart = new Date();
        }
    }

    public void setDateEnd(String date) {
        try {
            dateEnd = new SimpleDateFormat("dd/MM/yyyy").parse(date);
        } catch (Exception ex) {
            dateEnd = new Date();
        }
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

    public String getDateStart() {
        return new SimpleDateFormat("dd/MM/yyyy").format(dateStart);
    }

    public String getDateEnd() {
        return new SimpleDateFormat("dd/MM/yyyy").format(dateEnd);
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
