package com.facebook.cameracore.mediapipeline.dataproviders.location.interfaces;

import X.SOQ;
import com.facebook.jni.HybridData;
import com.facebook.native_bridge.NativeDataPromise;

public abstract class LocationDataProvider {
    public HybridData mHybridData;

    public abstract void getCurrentCityName(NativeDataPromise nativeDataPromise);

    public abstract LocationData getCurrentLocationData();

    public abstract void setDataSource(SOQ soq);
}
