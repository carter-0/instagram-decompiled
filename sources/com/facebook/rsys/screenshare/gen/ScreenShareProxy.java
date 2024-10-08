package com.facebook.rsys.screenshare.gen;

public abstract class ScreenShareProxy {
    public abstract void setApi(ScreenShareApi screenShareApi);

    public abstract void setScreenShareAvailability(int i);

    public abstract void setScreenShareFrameCaptureRate(int i);

    public abstract void setScreenShareStopSharing();
}
