package X;

import android.location.LocationListener;
import android.os.Bundle;

/* renamed from: X.SVl  reason: case insensitive filesystem */
public final class C11449SVl implements LocationListener {
    public final /* synthetic */ C10823Ryj A00;

    public final void onProviderDisabled(String str) {
    }

    public final void onProviderEnabled(String str) {
    }

    public final void onStatusChanged(String str, int i, Bundle bundle) {
    }

    public C11449SVl(C10823Ryj ryj) {
        this.A00 = ryj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0041, code lost:
        if (r1 >= 0) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0047, code lost:
        if (r1 <= 200) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0049, code lost:
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004a, code lost:
        r2 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0050, code lost:
        if (r12.getProvider() == null) goto L_0x0061;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0052, code lost:
        r1 = r12.getProvider();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005a, code lost:
        if (r8.getProvider() == null) goto L_0x0063;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005c, code lost:
        r2 = r8.getProvider();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0061, code lost:
        r1 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0063, code lost:
        if (r1 != null) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0065, code lost:
        r0 = X.DbW.A1a(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0069, code lost:
        if (r4 != false) goto L_0x0079;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x006b, code lost:
        if (r7 == false) goto L_0x0097;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x006d, code lost:
        if (r5 == false) goto L_0x0079;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x006f, code lost:
        if (r3 != false) goto L_0x0097;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0071, code lost:
        if (r0 == false) goto L_0x0097;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        r0 = r1.equals(r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onLocationChanged(android.location.Location r12) {
        /*
            r11 = this;
            X.Ryj r6 = r11.A00
            monitor-enter(r6)
            boolean r0 = r6.A01     // Catch:{ all -> 0x009b }
            if (r0 != 0) goto L_0x0097
            android.location.Location r8 = r6.A00     // Catch:{ all -> 0x009b }
            if (r8 == 0) goto L_0x0079
            long r9 = r12.getTime()     // Catch:{ all -> 0x009b }
            long r0 = r8.getTime()     // Catch:{ all -> 0x009b }
            long r9 = r9 - r0
            r1 = 120000(0x1d4c0, double:5.9288E-319)
            int r0 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            boolean r4 = X.AnonymousClass7TF.A1R(r0)
            r1 = -120000(0xfffffffffffe2b40, double:NaN)
            int r0 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            boolean r3 = X.C51970G9q.A1T(r0)
            r1 = 0
            int r0 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            boolean r7 = X.AnonymousClass7TF.A1R(r0)
            if (r4 != 0) goto L_0x0079
            if (r3 != 0) goto L_0x0097
            float r1 = r12.getAccuracy()     // Catch:{ all -> 0x009b }
            float r0 = r8.getAccuracy()     // Catch:{ all -> 0x009b }
            float r1 = r1 - r0
            int r1 = (int) r1     // Catch:{ all -> 0x009b }
            r5 = 1
            if (r1 > 0) goto L_0x0043
            r5 = 0
            r4 = 1
            if (r1 < 0) goto L_0x0049
        L_0x0043:
            r4 = 0
            r0 = 200(0xc8, float:2.8E-43)
            r3 = 1
            if (r1 > r0) goto L_0x004a
        L_0x0049:
            r3 = 0
        L_0x004a:
            java.lang.String r0 = r12.getProvider()     // Catch:{ all -> 0x009b }
            java.lang.String r2 = ""
            if (r0 == 0) goto L_0x0061
            java.lang.String r1 = r12.getProvider()     // Catch:{ all -> 0x009b }
        L_0x0056:
            java.lang.String r0 = r8.getProvider()     // Catch:{ all -> 0x009b }
            if (r0 == 0) goto L_0x0063
            java.lang.String r2 = r8.getProvider()     // Catch:{ all -> 0x009b }
            goto L_0x0063
        L_0x0061:
            r1 = r2
            goto L_0x0056
        L_0x0063:
            if (r1 != 0) goto L_0x0074
            boolean r0 = X.DbW.A1a(r2)
        L_0x0069:
            if (r4 != 0) goto L_0x0079
            if (r7 == 0) goto L_0x0097
            if (r5 == 0) goto L_0x0079
            if (r3 != 0) goto L_0x0097
            if (r0 == 0) goto L_0x0097
            goto L_0x0079
        L_0x0074:
            boolean r0 = r1.equals(r2)     // Catch:{ all -> 0x009b }
            goto L_0x0069
        L_0x0079:
            com.facebook.react.bridge.Callback r1 = r6.A07     // Catch:{ all -> 0x009b }
            r2 = 1
            X.Tm8 r0 = com.facebook.react.modules.location.LocationModule.locationToMap(r12)     // Catch:{ all -> 0x009b }
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch:{ all -> 0x009b }
            r1.invoke(r0)     // Catch:{ all -> 0x009b }
            android.os.Handler r1 = r6.A05     // Catch:{ all -> 0x009b }
            java.lang.Runnable r0 = r6.A08     // Catch:{ all -> 0x009b }
            r1.removeCallbacks(r0)     // Catch:{ all -> 0x009b }
            r6.A01 = r2     // Catch:{ all -> 0x009b }
            android.location.LocationManager r1 = r6.A04     // Catch:{ all -> 0x009b }
            android.location.LocationListener r0 = r6.A03     // Catch:{ all -> 0x009b }
            X.0fW.A01(r0, r1)     // Catch:{ all -> 0x009b }
        L_0x0097:
            r6.A00 = r12     // Catch:{ all -> 0x009b }
            monitor-exit(r6)     // Catch:{ all -> 0x009b }
            return
        L_0x009b:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x009b }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11449SVl.onLocationChanged(android.location.Location):void");
    }
}
