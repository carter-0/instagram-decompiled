package com.facebook.mediastreaming.opt.videoqualityquery;

import X.0dV;
import X.XVC;
import com.facebook.mediastreaming.client.livestreaming.interfaces.ServiceProviderHolder;

public class VideoQualityDeviceModelServiceProviderHolder extends ServiceProviderHolder {
    public static final XVC Companion = new Object();

    private final native void initHybrid(String str);

    /* JADX WARNING: type inference failed for: r0v0, types: [X.XVC, java.lang.Object] */
    static {
        0dV.A0C("mediastreaming-videoqualityquery");
    }

    public VideoQualityDeviceModelServiceProviderHolder(String str) {
        initHybrid(str);
    }
}
