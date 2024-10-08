package X;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;

public abstract class S5N {
    public BroadcastReceiver A00;
    public final /* synthetic */ 2X4 A01;

    public S5N(2X4 r1) {
        this.A01 = r1;
    }

    /* JADX WARNING: type inference failed for: r10v2, types: [java.lang.Object, X.S2F] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0072 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00eb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A00() {
        /*
            r23 = this;
            r1 = r23
            boolean r0 = r1 instanceof X.QAK
            if (r0 == 0) goto L_0x0052
            r0 = r1
            X.QAK r0 = (X.QAK) r0
            X.Rve r5 = r0.A00
            X.RqY r4 = r5.A02
            long r6 = r4.A00
            long r1 = java.lang.System.currentTimeMillis()
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x00e4
            android.content.Context r3 = r5.A00
            r0 = 21
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            int r0 = X.C9157RRi.A00(r3, r0)
            r9 = 0
            if (r0 != 0) goto L_0x0035
            java.lang.String r2 = "network"
            android.location.LocationManager r1 = r5.A01     // Catch:{ Exception -> 0x0035 }
            boolean r0 = r1.isProviderEnabled(r2)     // Catch:{ Exception -> 0x0035 }
            if (r0 == 0) goto L_0x0035
            android.location.Location r9 = X.0fW.A00(r1, r2)     // Catch:{ Exception -> 0x0035 }
        L_0x0035:
            r0 = 27
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            int r0 = X.C9157RRi.A00(r3, r0)
            if (r0 != 0) goto L_0x005f
            java.lang.String r2 = "gps"
            android.location.LocationManager r1 = r5.A01     // Catch:{ Exception -> 0x005f }
            boolean r0 = r1.isProviderEnabled(r2)     // Catch:{ Exception -> 0x005f }
            if (r0 == 0) goto L_0x005f
            android.location.Location r3 = X.0fW.A00(r1, r2)     // Catch:{ Exception -> 0x005f }
            if (r3 == 0) goto L_0x005f
            goto L_0x0074
        L_0x0052:
            r0 = r1
            X.QAJ r0 = (X.QAJ) r0
            r1 = 1
            android.os.PowerManager r0 = r0.A00
            boolean r0 = r0.isPowerSaveMode()
            if (r0 == 0) goto L_0x0073
            goto L_0x0072
        L_0x005f:
            if (r9 != 0) goto L_0x0083
            java.util.Calendar r1 = java.util.Calendar.getInstance()
            r0 = 11
            int r1 = r1.get(r0)
            r0 = 6
            if (r1 < r0) goto L_0x0072
            r0 = 22
            if (r1 < r0) goto L_0x00f1
        L_0x0072:
            r1 = 2
        L_0x0073:
            return r1
        L_0x0074:
            if (r9 == 0) goto L_0x0082
            long r5 = r3.getTime()
            long r1 = r9.getTime()
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0083
        L_0x0082:
            r9 = r3
        L_0x0083:
            long r17 = java.lang.System.currentTimeMillis()
            X.S2F r10 = X.S2F.A03
            if (r10 != 0) goto L_0x0092
            X.S2F r10 = new X.S2F
            r10.<init>()
            X.S2F.A03 = r10
        L_0x0092:
            r7 = 86400000(0x5265c00, double:4.2687272E-316)
            long r11 = r17 - r7
            double r13 = r9.getLatitude()
            double r15 = r9.getLongitude()
            r10.A00(r11, r13, r15)
            double r19 = r9.getLatitude()
            double r21 = r9.getLongitude()
            r16 = r10
            r16.A00(r17, r19, r21)
            int r1 = r10.A00
            r0 = 1
            boolean r6 = X.AnonymousClass7TF.A1S(r1, r0)
            long r2 = r10.A01
            long r0 = r10.A02
            long r11 = r17 + r7
            double r13 = r9.getLatitude()
            double r15 = r9.getLongitude()
            r10.A00(r11, r13, r15)
            long r7 = r10.A01
            r9 = -1
            int r5 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r5 == 0) goto L_0x00eb
            int r5 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r5 == 0) goto L_0x00eb
            int r5 = (r17 > r0 ? 1 : (r17 == r0 ? 0 : -1))
            if (r5 > 0) goto L_0x00dc
            int r5 = (r17 > r2 ? 1 : (r17 == r2 ? 0 : -1))
            if (r5 <= 0) goto L_0x00e9
            r7 = r0
        L_0x00dc:
            r0 = 60000(0xea60, double:2.9644E-319)
            long r7 = r7 + r0
        L_0x00e0:
            r4.A01 = r6
            r4.A00 = r7
        L_0x00e4:
            boolean r0 = r4.A01
            if (r0 == 0) goto L_0x00f1
            goto L_0x0072
        L_0x00e9:
            r7 = r2
            goto L_0x00dc
        L_0x00eb:
            r7 = 43200000(0x2932e00, double:2.1343636E-316)
            long r7 = r7 + r17
            goto L_0x00e0
        L_0x00f1:
            r1 = 1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.S5N.A00():int");
    }

    public final void A01() {
        BroadcastReceiver broadcastReceiver = this.A00;
        if (broadcastReceiver != null) {
            try {
                this.A01.A0l.unregisterReceiver(broadcastReceiver);
            } catch (IllegalArgumentException unused) {
            }
            this.A00 = null;
        }
    }

    public final void A02() {
        IntentFilter intentFilter;
        String str;
        A01();
        if (this instanceof QAK) {
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            str = "android.intent.action.TIME_TICK";
        } else {
            intentFilter = new IntentFilter();
            str = "android.os.action.POWER_SAVE_MODE_CHANGED";
        }
        intentFilter.addAction(str);
        if (intentFilter.countActions() != 0) {
            BroadcastReceiver broadcastReceiver = this.A00;
            if (broadcastReceiver == null) {
                broadcastReceiver = new Q63(this, 0);
                this.A00 = broadcastReceiver;
            }
            this.A01.A0l.registerReceiver(broadcastReceiver, intentFilter);
        }
    }
}
