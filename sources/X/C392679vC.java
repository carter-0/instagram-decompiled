package X;

import android.os.Build;
import android.os.Bundle;
import com.facebook.cameracore.mediapipeline.dataproviders.worldtracker.interfaces.DeviceConfig;

/* renamed from: X.9vC  reason: invalid class name and case insensitive filesystem */
public abstract class C392679vC {
    public static final C372128zj A00(Bundle bundle) {
        Object parcelable;
        Integer num;
        if (!bundle.containsKey("trackerPatchSize") || !bundle.containsKey("trackerScales") || !bundle.containsKey("useSimilarityTracker") || !bundle.containsKey("setScaleByARClass") || !bundle.containsKey("executionMode") || !bundle.containsKey("deviceConfig") || !bundle.containsKey("startPlaneTrackingOnLoad") || !bundle.containsKey("deviceType")) {
            return null;
        }
        int i = bundle.getInt("trackerPatchSize");
        int i2 = bundle.getInt("trackerScales");
        boolean z = bundle.getBoolean("useSimilarityTracker");
        boolean z2 = bundle.getBoolean("setScaleByARClass");
        int i3 = bundle.getInt("executionMode");
        if (Build.VERSION.SDK_INT >= 34) {
            parcelable = bundle.getParcelable("deviceConfig", DeviceConfig.class);
        } else {
            parcelable = bundle.getParcelable("deviceConfig");
        }
        DeviceConfig deviceConfig = (DeviceConfig) parcelable;
        boolean z3 = bundle.getBoolean("startPlaneTrackingOnLoad");
        String string = bundle.getString("deviceType");
        if (deviceConfig == null || string == null) {
            return null;
        }
        if (i3 == 0 || i3 != 1) {
            num = AnonymousClass05K.A00;
        } else {
            num = AnonymousClass05K.A01;
        }
        C372128zj r4 = new C372128zj(deviceConfig, num, string, i, i2, z, z2);
        r4.A01 = z3;
        return r4;
    }
}
