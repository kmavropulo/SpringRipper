package com.epam.university.springripper.quoters;

import lombok.Getter;

@Getter
public class ProfilingController implements ProfilingControllerMBean {
    private boolean enabled;

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }
}