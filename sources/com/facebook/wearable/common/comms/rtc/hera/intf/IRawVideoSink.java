package com.facebook.wearable.common.comms.rtc.hera.intf;

import X.0sL;

public interface IRawVideoSink {
    0sL getOnSinkParamsChanged();

    IVideoSize getSinkSize();

    void notifySourceSizeChanged(int i, int i2);

    void release();

    void setOnSinkParamsChanged(0sL r1);
}
