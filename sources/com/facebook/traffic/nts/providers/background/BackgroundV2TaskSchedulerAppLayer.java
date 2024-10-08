package com.facebook.traffic.nts.providers.background;

public interface BackgroundV2TaskSchedulerAppLayer {
    void executeReadyTasksAndReschedule();

    void setUpcallImpl(BackgroundV2TaskSchedulerAppLayerUpcalls backgroundV2TaskSchedulerAppLayerUpcalls);
}
