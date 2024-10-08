package X;

import android.content.Context;
import android.content.pm.PackageManager;

/* renamed from: X.S2h  reason: case insensitive filesystem */
public final class C10949S2h {
    public final Context A00;
    public final RRG A01;
    public final C13712Tfa A02;
    public final AnonymousClass1SF A03;
    public final AnonymousClass0eK A04;

    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00a1, code lost:
        if (r0.versionCode == 1) goto L_0x007b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x007e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Integer A00() {
        /*
            r5 = this;
            android.content.Context r1 = r5.A00
            X.RRG r0 = r5.A01
            java.lang.String r2 = r0.A00()
            android.content.pm.PackageManager r1 = r1.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0031 }
            if (r1 == 0) goto L_0x0031
            r0 = 128(0x80, float:1.794E-43)
            android.content.pm.PackageInfo r4 = r1.getPackageInfo(r2, r0)     // Catch:{ NameNotFoundException -> 0x0031 }
            r3 = 0
            if (r4 == 0) goto L_0x0031
            android.content.pm.ApplicationInfo r0 = r4.applicationInfo
            if (r0 == 0) goto L_0x0031
            android.os.Bundle r1 = r0.metaData
            if (r1 == 0) goto L_0x0031
            java.lang.String r0 = "preloaded-stub"
            boolean r0 = r1.getBoolean(r0, r3)
            r1 = 1
            if (r0 == 0) goto L_0x002e
            int r0 = r4.versionCode
            if (r0 != r1) goto L_0x002e
            r3 = 1
        L_0x002e:
            r0 = r3 ^ 1
            goto L_0x0032
        L_0x0031:
            r0 = 0
        L_0x0032:
            if (r0 == 0) goto L_0x0037
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            return r0
        L_0x0037:
            X.1SF r3 = r5.A03
            if (r3 != 0) goto L_0x003e
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            return r0
        L_0x003e:
            X.1TT r1 = r3.A00()
            boolean r0 = r1.A06
            if (r0 != 0) goto L_0x0049
            java.lang.Integer r0 = X.AnonymousClass05K.A15
            return r0
        L_0x0049:
            boolean r0 = r1.A05
            if (r0 != 0) goto L_0x0063
            X.1TK r0 = r1.A01
            if (r0 == 0) goto L_0x0060
            boolean r0 = r0.A05
            if (r0 == 0) goto L_0x0060
            X.1Sx r0 = r1.A00
            if (r0 == 0) goto L_0x005d
            boolean r0 = r0.A05
            if (r0 != 0) goto L_0x00a9
        L_0x005d:
            java.lang.Integer r0 = X.AnonymousClass05K.A0j
            return r0
        L_0x0060:
            java.lang.Integer r0 = X.AnonymousClass05K.A0u
            return r0
        L_0x0063:
            X.1SS r4 = r3.A03
            X.1TT r0 = r3.A00()
            X.1TK r1 = r0.A01
            if (r1 == 0) goto L_0x0095
            boolean r0 = r1.A05
            if (r0 == 0) goto L_0x0095
            java.util.Set r1 = r1.A04
            X.1TG r0 = X.1TG.A03
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x0095
        L_0x007b:
            r0 = 1
        L_0x007c:
            if (r0 == 0) goto L_0x00a9
            r0 = 19
            boolean r0 = r3.A01(r0)
            if (r0 == 0) goto L_0x00a6
            X.0eK r0 = r5.A04
            java.lang.Object r0 = r0.get()
            X.S1k r0 = (X.C10932S1k) r0
            boolean r0 = r0.A02
            if (r0 != 0) goto L_0x00a6
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            return r0
        L_0x0095:
            r1 = 0
            android.content.pm.PackageManager r0 = r4.A00     // Catch:{ NameNotFoundException -> 0x00a4 }
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r2, r1)     // Catch:{ NameNotFoundException -> 0x00a4 }
            r1 = 1
            if (r0 == 0) goto L_0x00a4
            int r0 = r0.versionCode
            if (r0 != r1) goto L_0x00a4
            goto L_0x007b
        L_0x00a4:
            r0 = 0
            goto L_0x007c
        L_0x00a6:
            java.lang.Integer r0 = X.AnonymousClass05K.A0Y
            return r0
        L_0x00a9:
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C10949S2h.A00():java.lang.Integer");
    }

    public C10949S2h(Context context, RRG rrg, C13712Tfa tfa) {
        AnonymousClass1SF r2;
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            r2 = null;
        } else {
            r2 = new AnonymousClass1SF(context, packageManager);
        }
        C13187TOt tOt = new C13187TOt(context, 0);
        this.A00 = context;
        this.A01 = rrg;
        this.A03 = r2;
        this.A04 = tOt;
        this.A02 = tfa;
    }
}
