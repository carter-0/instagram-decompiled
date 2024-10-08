package X;

import com.facebook.cameracore.mediapipeline.dataproviders.worldtracker.interfaces.DeviceConfig;
import com.facebook.cameracore.mediapipeline.dataproviders.worldtracker.interfaces.WorldTrackingDataProviderDelegateWrapper;

/* renamed from: X.8zj  reason: invalid class name and case insensitive filesystem */
public class C372128zj {
    public String A00;
    public boolean A01;
    public final int A02;
    public final int A03;
    public final DeviceConfig A04;
    public final WorldTrackingDataProviderDelegateWrapper A05 = new Object();
    public final Integer A06;
    public final boolean A07;
    public final boolean A08;

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, com.facebook.cameracore.mediapipeline.dataproviders.worldtracker.interfaces.WorldTrackingDataProviderDelegateWrapper] */
    public C372128zj(DeviceConfig deviceConfig, Integer num, String str, int i, int i2, boolean z, boolean z2) {
        this.A02 = i;
        this.A03 = i2;
        this.A06 = num;
        this.A04 = deviceConfig;
        this.A08 = z;
        this.A07 = z2;
        this.A00 = str;
    }
}
