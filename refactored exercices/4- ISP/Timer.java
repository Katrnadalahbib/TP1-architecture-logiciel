package com.directi.training.isp.exercise;

import java.util.TimerTask;

public class Timer
{
    public void register(long timeout, final timeOut door)
    {
        java.util.Timer timerUtility = new java.util.Timer();
        timerUtility.schedule(new TimerTask()
        {
            @Override
            public void run()
            {
                door.timeOutCallback();
            }
        }, timeout);
    }
}