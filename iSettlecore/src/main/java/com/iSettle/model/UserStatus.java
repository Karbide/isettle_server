package com.iSettle.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

/**
 * Created by deepeshuniyal on 03/12/16.
 */
@Entity
public class UserStatus {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Long status;
        private String status_display_name;
        private boolean active;
        private Date update_time;

    public Long getId() {
        return status;
    }

    public void setId(Long id) {
        this.status = id;
    }

    public String getStatus_display_name() {
        return status_display_name;
    }

    public void setStatus_display_name(String status_display_name) {
        this.status_display_name = status_display_name;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public Date getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(Date update_time) {
        this.update_time = update_time;
    }
}
