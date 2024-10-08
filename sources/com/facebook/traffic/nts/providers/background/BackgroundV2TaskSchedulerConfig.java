package com.facebook.traffic.nts.providers.background;

public interface BackgroundV2TaskSchedulerConfig {
    boolean getAsyncBackgroundJobEnabled();

    boolean getExecuteIfIdleEnabled();

    boolean getExecuteIfNetworkConnectedEnabled();

    boolean getRescheduleOnExecuteEnabled();

    long getSchedulingAlignmentInterval();
}
