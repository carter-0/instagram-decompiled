package com.facebook.common.networkreachability;

import com.facebook.cameracore.instagram.ardelivery.networkconsentmanager.IgNetworkConsentStorage;
import org.webrtc.CameraCapturer;
import org.webrtc.ScreenCapturerAndroid;

public enum NetworkState {
    NONE(-1),
    UNKNOWN(1),
    CELL_UNKNOWN(100),
    CELL_2G(200),
    CELL_3G(300),
    CELL_3G_HSPAP(350),
    CELL_4G(ScreenCapturerAndroid.VIRTUAL_DISPLAY_DPI),
    CELL_5G(CameraCapturer.OPEN_CAMERA_DELAY_MS),
    WIFI(IgNetworkConsentStorage.MAX_ENTRIES);
    
    public final int A00;

    /* access modifiers changed from: public */
    NetworkState(int i) {
        this.A00 = i;
    }
}
