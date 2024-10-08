package X;

import android.location.LocationManager;
import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import com.google.common.collect.EvictingQueue;

/* renamed from: X.4hg  reason: invalid class name and case insensitive filesystem */
public final class C270964hg {
    public static final String[] A08 = {"gps", "network"};
    public C276164sm A00;
    public final LocationManager A01;
    public final C270924hc A02;
    public final C270934hd A03;
    public final LightweightQuickPerformanceLogger A04;
    public final C270944he A05;
    public final C242093Sp A06;
    public final EvictingQueue A07 = new EvictingQueue(0);

    private void A00(String str, boolean z) {
        LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = this.A04;
        if (lightweightQuickPerformanceLogger != null) {
            lightweightQuickPerformanceLogger.markerAnnotate(794441906, str, z);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x011b  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0166  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0172  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x018f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C276164sm A01(java.lang.String r27, float r28, long r29, boolean r31) {
        /*
            r26 = this;
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            r6 = 0
            if (r1 < r0) goto L_0x0008
            r6 = 1
        L_0x0008:
            r7 = 0
            r2 = 0
            int r1 = (r29 > r2 ? 1 : (r29 == r2 ? 0 : -1))
            r0 = 0
            if (r1 <= 0) goto L_0x0011
            r0 = 1
        L_0x0011:
            X.17k.A0E(r0)
            r0 = 0
            int r1 = (r28 > r0 ? 1 : (r28 == r0 ? 0 : -1))
            r0 = 0
            if (r1 <= 0) goto L_0x001b
            r0 = 1
        L_0x001b:
            X.17k.A0E(r0)
            r3 = 794441906(0x2f5a38b2, float:1.9847127E-10)
            r1 = r26
            com.facebook.quicklog.LightweightQuickPerformanceLogger r0 = r1.A04
            if (r0 == 0) goto L_0x002a
            r0.markerStart(r3)
        L_0x002a:
            java.lang.Long r4 = java.lang.Long.valueOf(r29)
            java.lang.String r2 = "age_limit_ms"
            if (r4 == 0) goto L_0x003b
            if (r0 == 0) goto L_0x003b
            long r4 = r4.longValue()
            r0.markerAnnotate(r3, r2, r4)
        L_0x003b:
            java.lang.Float r2 = java.lang.Float.valueOf(r28)
            java.lang.String r8 = "accuracy_limit_meters"
            if (r2 == 0) goto L_0x004d
            if (r0 == 0) goto L_0x004d
            float r2 = r2.floatValue()
            double r4 = (double) r2
            r0.markerAnnotate(r3, r8, r4)
        L_0x004d:
            java.lang.String r2 = "run_foreground_check"
            r1.A00(r2, r6)
            java.lang.String r2 = "caller_context"
            r4 = r27
            if (r27 == 0) goto L_0x005d
            if (r0 == 0) goto L_0x005d
            r0.markerAnnotate(r3, r2, r4)
        L_0x005d:
            java.lang.String r2 = "is_called_from_location_manager"
            r9 = r31
            r1.A00(r2, r9)
            X.4hc r10 = r1.A02
            java.lang.Integer r5 = X.AnonymousClass05K.A0C
            r8 = 0
            r2 = 1
            java.lang.Integer r11 = X.C270924hc.A00(r10, r5, r8, r8, r2)
            java.lang.String r5 = X.C270974hh.A00(r11)
            java.lang.String r2 = "location_status_state"
            if (r0 == 0) goto L_0x0079
            r0.markerAnnotate(r3, r2, r5)
        L_0x0079:
            boolean r10 = r1.A03()
            java.lang.String r2 = "minimize_location_access"
            r1.A00(r2, r10)
            r5 = 0
            java.lang.String r2 = "should_allow_access_to_os_cache"
            r1.A00(r2, r7)
            java.lang.Integer r2 = X.AnonymousClass05K.A0N
            r20 = 0
            if (r11 == r2) goto L_0x009c
            java.lang.String r2 = "approximate location status not okay"
            if (r0 == 0) goto L_0x009b
            java.lang.String r1 = "end_reason"
            r0.markerAnnotate(r3, r1, r2)
            r1 = 3
            r0.markerEnd(r3, r1)
        L_0x009b:
            return r8
        L_0x009c:
            X.4sm r2 = r1.A00
            if (r6 == 0) goto L_0x00bb
            boolean r11 = X.0LA.A06()
            java.lang.String r6 = "is_app_in_foreground"
            r1.A00(r6, r11)
            if (r11 != 0) goto L_0x00bb
            java.lang.String r4 = "app in background. returning saved location"
        L_0x00ad:
            if (r0 == 0) goto L_0x00ba
            java.lang.String r1 = "end_reason"
            r0.markerAnnotate(r3, r1, r4)
        L_0x00b4:
            r1 = 2
            if (r0 == 0) goto L_0x00ba
            r0.markerEnd(r3, r1)
        L_0x00ba:
            return r2
        L_0x00bb:
            if (r2 == 0) goto L_0x00fa
            X.4hd r6 = r1.A03
            long r12 = r6.A00(r2)
            int r11 = (r12 > r29 ? 1 : (r12 == r29 ? 0 : -1))
            if (r11 > 0) goto L_0x00fa
            java.lang.Float r11 = r2.A01()
            if (r11 == 0) goto L_0x00fa
            java.lang.Float r11 = r2.A01()
            float r11 = r11.floatValue()
            int r11 = (r11 > r28 ? 1 : (r11 == r28 ? 0 : -1))
            if (r11 > 0) goto L_0x00fa
            if (r10 == 0) goto L_0x00fc
            r5 = r31 ^ 1
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r5)
            long r5 = r6.A00(r2)
            java.lang.Long r8 = java.lang.Long.valueOf(r5)
            java.lang.String r9 = "FBLocationCache"
            java.lang.String r10 = "internalGetLastLocation"
            java.lang.String r12 = "Cache"
            java.lang.String r13 = "FacebookLocationProvider"
            X.4he r6 = r1.A05
            r11 = r4
            r6.A00(r7, r8, r9, r10, r11, r12, r13)
            java.lang.String r4 = "minimize location access and should not allow access to OS cache"
            goto L_0x00ad
        L_0x00fa:
            r6 = r8
            goto L_0x0103
        L_0x00fc:
            android.location.Location r2 = r2.A00
            android.location.Location r6 = new android.location.Location
            r6.<init>(r2)
        L_0x0103:
            java.lang.String r2 = "access OS cache"
            if (r0 == 0) goto L_0x010a
            r0.markerPoint(r3, r2)
        L_0x010a:
            java.lang.String[] r19 = A08
            r2 = 2
        L_0x010d:
            r11 = r19[r7]
            android.location.LocationManager r10 = r1.A01     // Catch:{ IllegalArgumentException | SecurityException -> 0x015b }
            android.location.Location r18 = X.0fW.A00(r10, r11)     // Catch:{ IllegalArgumentException | SecurityException -> 0x015b }
            boolean r10 = X.C270984hi.A00(r18)     // Catch:{ IllegalArgumentException | SecurityException -> 0x015b }
            if (r10 == 0) goto L_0x015b
            X.4hd r10 = r1.A03
            long r16 = r18.getElapsedRealtimeNanos()
            r12 = 0
            int r11 = (r16 > r12 ? 1 : (r16 == r12 ? 0 : -1))
            if (r11 == 0) goto L_0x019a
            java.lang.Long r11 = java.lang.Long.valueOf(r16)
            if (r11 == 0) goto L_0x019a
            r14 = 1000000(0xf4240, double:4.940656E-318)
            X.0JR r10 = r10.A01
            long r12 = r10.now()
            long r12 = r12 * r14
            long r12 = r12 - r16
            r10 = 500000(0x7a120, double:2.47033E-318)
            long r12 = r12 + r10
            long r12 = r12 / r14
        L_0x013e:
            int r10 = (r12 > r29 ? 1 : (r12 == r29 ? 0 : -1))
            if (r10 > 0) goto L_0x015b
            float r10 = r18.getAccuracy()
            int r10 = (r10 > r28 ? 1 : (r10 == r28 ? 0 : -1))
            if (r10 > 0) goto L_0x015b
            if (r6 == 0) goto L_0x0158
            long r13 = r6.getTime()
            long r11 = r18.getTime()
            int r10 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r10 >= 0) goto L_0x015b
        L_0x0158:
            r6 = r18
            r5 = 1
        L_0x015b:
            int r7 = r7 + 1
            if (r7 < r2) goto L_0x010d
            java.lang.String r2 = "updated_from_os_cache"
            r1.A00(r2, r5)
            if (r6 != 0) goto L_0x018f
            r2 = 0
        L_0x0167:
            r1.A02(r2)
            r5 = r31 ^ 1
            java.lang.Boolean r19 = java.lang.Boolean.valueOf(r5)
            if (r2 == 0) goto L_0x017c
            X.4hd r5 = r1.A03
            long r5 = r5.A00(r2)
            java.lang.Long r20 = java.lang.Long.valueOf(r5)
        L_0x017c:
            java.lang.String r21 = "FBLocationCache"
            java.lang.String r22 = "internalGetLastLocation"
            java.lang.String r24 = "Cache"
            java.lang.String r25 = "AndroidPlatformLocationProvider"
            X.4he r1 = r1.A05
            r18 = r1
            r23 = r4
            r18.A00(r19, r20, r21, r22, r23, r24, r25)
            goto L_0x00b4
        L_0x018f:
            android.location.Location r5 = new android.location.Location
            r5.<init>(r6)
            X.4sm r2 = new X.4sm
            r2.<init>(r5, r8)
            goto L_0x0167
        L_0x019a:
            X.0JP r10 = r10.A00
            long r12 = r10.now()
            long r10 = r18.getTime()
            long r12 = r12 - r10
            goto L_0x013e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C270964hg.A01(java.lang.String, float, long, boolean):X.4sm");
    }

    public final boolean A03() {
        if (this.A06.A00()) {
            return true;
        }
        return false;
    }

    public C270964hg(LocationManager locationManager, C270924hc r4, C270934hd r5, LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger, C270944he r7, C242093Sp r8) {
        this.A02 = r4;
        this.A01 = locationManager;
        this.A03 = r5;
        this.A06 = r8;
        this.A05 = r7;
        this.A04 = lightweightQuickPerformanceLogger;
    }

    public final void A02(C276164sm r9) {
        String str;
        LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = this.A04;
        if (lightweightQuickPerformanceLogger != null) {
            lightweightQuickPerformanceLogger.markerStart(794430333);
        }
        short s = 3;
        if (r9 == null) {
            str = "new location is null";
        } else {
            C276164sm r1 = this.A00;
            if (r1 == null || r1.A03() == null || (r9.A03() != null && r9.A03().longValue() > r1.A03().longValue())) {
                this.A00 = r9;
                s = 2;
                if (lightweightQuickPerformanceLogger == null) {
                    return;
                }
                lightweightQuickPerformanceLogger.markerEnd(794430333, s);
            }
            str = "saved location is newer";
        }
        if (lightweightQuickPerformanceLogger != null) {
            lightweightQuickPerformanceLogger.markerAnnotate(794430333, "end_reason", str);
            lightweightQuickPerformanceLogger.markerEnd(794430333, s);
        }
    }
}
