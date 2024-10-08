package com.facebook.traffic.nts.providers.background;

public interface BackgroundV2TaskSchedulerAppLayerUpcalls {
    void cancel();

    void refresh(long j);
}
