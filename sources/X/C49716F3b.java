package X;

import android.content.Context;
import android.content.pm.PackageManager;
import com.instagram.common.session.UserSession;

/* renamed from: X.F3b  reason: case insensitive filesystem */
public final class C49716F3b {
    public final Context A00;
    public final UserSession A01;

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0027, code lost:
        if (X.00p.A0k(r6, r2, false) != false) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(android.content.Intent r5, java.lang.String r6) {
        /*
            r4 = this;
            r3 = 1
            X.0qQ.A0B(r6, r3)
            r0 = 694(0x2b6, float:9.73E-43)
            java.lang.String r2 = X.AnonymousClass000.A00(r0)
            r1 = 0
            boolean r0 = X.00p.A0k(r6, r2, r1)
            if (r0 != 0) goto L_0x0029
            r0 = 219(0xdb, float:3.07E-43)
            java.lang.String r2 = X.Pxd.A00(r0)
            boolean r0 = X.00p.A0k(r6, r2, r1)
            if (r0 != 0) goto L_0x0029
            r0 = 222(0xde, float:3.11E-43)
            java.lang.String r2 = X.Pxd.A00(r0)
            boolean r0 = X.00p.A0k(r6, r2, r1)
            if (r0 == 0) goto L_0x0033
        L_0x0029:
            r0 = 221(0xdd, float:3.1E-43)
            java.lang.String r0 = X.Pxd.A00(r0)
            java.lang.String r6 = X.00p.A0g(r6, r2, r0, r1)
        L_0x0033:
            android.net.Uri r0 = X.0cp.A03(r6)
            r5.setData(r0)
            java.lang.String r0 = "com.android.vending"
            r5.setPackage(r0)
            java.lang.String r0 = "overlay"
            r5.putExtra(r0, r3)
            r0 = 266(0x10a, float:3.73E-43)
            java.lang.String r1 = X.C66579MXk.A00(r0)
            java.lang.String r0 = "com.instagram.android"
            r5.putExtra(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49716F3b.A00(android.content.Intent, java.lang.String):void");
    }

    public final boolean A01() {
        UserSession userSession = this.A01;
        0Tu r3 = 0Tu.A05;
        if (182.A06(r3, userSession, 36323629343976786L)) {
            Context context = this.A00;
            if (0oI.A0F(context)) {
                String A04 = 182.A04(r3, userSession, 36886579297452756L);
                String A05 = 0oI.A05(context, "com.android.vending");
                if (A05 == null || A05.compareTo(A04) < 0 || !A02()) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public final boolean A02() {
        String str;
        if (182.A06(0Tu.A05, this.A01, 36323629344107859L)) {
            return true;
        }
        PackageManager packageManager = this.A00.getPackageManager();
        String str2 = 0oI.A02;
        try {
            str = packageManager.getInstallerPackageName("com.instagram.android");
            if (str == null) {
                str = "";
            }
        } catch (IllegalArgumentException unused) {
            str = "unknown";
        }
        return str.equals("com.android.vending");
    }

    public C49716F3b(Context context, UserSession userSession) {
        this.A00 = context;
        this.A01 = userSession;
    }
}
