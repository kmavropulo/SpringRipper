package com.epam.university.springripper.quoters;

import lombok.Getter;

@Getter
public class ProfilingController implements ProfilingControllerMBean {
    private boolean enabled =true;

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }
}