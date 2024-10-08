package X;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.Feature;
import com.google.android.gms.deviceperformance.internal.IDevicePerformanceService;
import com.google.android.gms.deviceperformance.internal.IDevicePerformanceService$Stub$Proxy;

/* renamed from: X.Qpy  reason: case insensitive filesystem */
public final class C8393Qpy extends AnonymousClass645 {
    public final /* bridge */ /* synthetic */ IInterface A04(IBinder iBinder) {
        0qQ.A0B(iBinder, 0);
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.deviceperformance.internal.IDevicePerformanceService");
        if (!(queryLocalInterface instanceof IDevicePerformanceService)) {
            return new IDevicePerformanceService$Stub$Proxy(iBinder);
        }
        return queryLocalInterface;
    }

    public final String A05() {
        return "com.google.android.gms.deviceperformance.internal.IDevicePerformanceService";
    }

    public final String A06() {
        return "com.google.android.gms.deviceperformance.service.START";
    }

    public final boolean A08() {
        return true;
    }

    public final boolean A09() {
        return true;
    }

    public final int getMinApkVersion() {
        return 17895000;
    }

    public final Feature[] A0A() {
        Feature[] featureArr = C10084RmM.A01;
        0qQ.A08(featureArr);
        return featureArr;
    }
}
