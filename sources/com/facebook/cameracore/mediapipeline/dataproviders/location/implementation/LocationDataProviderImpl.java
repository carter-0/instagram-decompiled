package com.facebook.cameracore.mediapipeline.dataproviders.location.implementation;

import X.0KC;
import X.1Wr;
import X.C12130Sna;
import X.C276164sm;
import X.QLM;
import X.SOQ;
import android.content.Context;
import com.facebook.cameracore.mediapipeline.dataproviders.location.interfaces.LocationData;
import com.facebook.cameracore.mediapipeline.dataproviders.location.interfaces.LocationDataProvider;
import com.facebook.jni.HybridData;
import com.facebook.native_bridge.NativeDataPromise;
import com.instagram.common.session.UserSession;

public class LocationDataProviderImpl extends LocationDataProvider {
    public SOQ mDataSource;

    private native HybridData initHybrid();

    private native void onLocationDataUpdatedNative(LocationData locationData);

    public void getCurrentCityName(NativeDataPromise nativeDataPromise) {
        SOQ soq = this.mDataSource;
        if (soq != null) {
            soq.A03 = nativeDataPromise;
            soq.A05 = false;
            String str = soq.A04;
            if (str != null) {
                nativeDataPromise.setValue(str);
                soq.A05 = true;
            }
        }
    }

    public LocationData getCurrentLocationData() {
        C276164sm A01;
        SOQ soq = this.mDataSource;
        if (soq == null) {
            return null;
        }
        Context context = soq.A07;
        boolean isLocationEnabled = 1Wr.isLocationEnabled(context);
        boolean isLocationPermitted = 1Wr.isLocationPermitted(context, (UserSession) null, "LOCATION_SERVICE_DATA_SOURCE");
        if (!isLocationEnabled || !isLocationPermitted || (A01 = soq.A09.A01("LocationDataSource", Float.MAX_VALUE, Long.MAX_VALUE, false)) == null || A01.A03() == null) {
            return new LocationData(false, 0.0d, 0.0d, 0.0d);
        }
        return SOQ.A00(soq, A01);
    }

    public void release() {
        SOQ soq = this.mDataSource;
        if (soq != null) {
            soq.A00 = null;
        }
    }

    public void setDataSource(SOQ soq) {
        SOQ soq2 = this.mDataSource;
        if (soq != soq2) {
            if (soq2 != null) {
                soq2.A00 = null;
            }
            this.mDataSource = soq;
            soq.A00 = this;
            if (soq.A01 == null) {
                Context context = soq.A07;
                boolean isLocationEnabled = 1Wr.isLocationEnabled(context);
                boolean isLocationPermitted = 1Wr.isLocationPermitted(context, (UserSession) null, "LOCATION_SERVICE_DATA_SOURCE");
                if (isLocationEnabled && isLocationPermitted) {
                    C12130Sna sna = new C12130Sna(soq, 0);
                    soq.A01 = sna;
                    try {
                        soq.A0A.A07(sna, soq.A02, QLM.class.getName());
                    } catch (IllegalStateException e) {
                        0KC.A05(QLM.class, "Failed to request location updates", e);
                    }
                }
            }
        }
    }

    public LocationDataProviderImpl() {
        this.mHybridData = initHybrid();
    }

    public void onLocationDataUpdated(LocationData locationData) {
        onLocationDataUpdatedNative(locationData);
    }
}
