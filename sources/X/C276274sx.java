package X;

import android.os.Build;
import java.util.ArrayList;

/* renamed from: X.4sx  reason: invalid class name and case insensitive filesystem */
public final class C276274sx {
    public C270914hb A00;
    public final C276224ss A01;
    public final C276264sw A02;

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0027, code lost:
        if (X.C276244su.A00(r2) == false) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.net.wifi.WifiInfo A00() {
        /*
            r6 = this;
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            if (r1 < r0) goto L_0x0039
            boolean r0 = X.0LA.A06()
        L_0x000a:
            r5 = 0
            if (r0 == 0) goto L_0x0040
            X.4sw r4 = r6.A02
            boolean r0 = X.C276264sw.A00(r4)
            r3 = 0
            if (r0 == 0) goto L_0x0040
            X.4su r2 = r4.A04
            java.lang.String r1 = "android.permission.ACCESS_WIFI_STATE"
            android.content.Context r0 = r2.A00
            int r0 = r0.checkCallingOrSelfPermission(r1)
            if (r0 != 0) goto L_0x0029
            boolean r1 = X.C276244su.A00(r2)
            r0 = 1
            if (r1 != 0) goto L_0x002a
        L_0x0029:
            r0 = 0
        L_0x002a:
            if (r0 == 0) goto L_0x0040
            android.content.Context r1 = r4.A01
            java.lang.String r0 = "wifi"
            java.lang.Object r0 = r1.getSystemService(r0)
            android.net.wifi.WifiManager r0 = (android.net.wifi.WifiManager) r0
            if (r0 == 0) goto L_0x0040
            goto L_0x003b
        L_0x0039:
            r0 = 1
            goto L_0x000a
        L_0x003b:
            android.net.wifi.WifiInfo r3 = X.AnonymousClass0fl.A00(r0)     // Catch:{ Exception -> 0x003f }
        L_0x003f:
            return r3
        L_0x0040:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C276274sx.A00():android.net.wifi.WifiInfo");
    }

    public final ArrayList A01() {
        boolean z;
        if (Build.VERSION.SDK_INT >= 29) {
            z = 0LA.A06();
        } else {
            z = true;
        }
        if (!z) {
            return null;
        }
        try {
            return this.A02.A01(true);
        } catch (SecurityException unused) {
            return null;
        }
    }

    public C276274sx(C270914hb r1, C276264sw r2, C276224ss r3) {
        this.A01 = r3;
        this.A02 = r2;
        this.A00 = r1;
    }
}
