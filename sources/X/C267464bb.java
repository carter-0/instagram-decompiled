package X;

import com.facebook.mobileboost.framework.os.jni.MobileBoostNative;

/* renamed from: X.4bb  reason: invalid class name and case insensitive filesystem */
public final class C267464bb extends 0D3 {
    public boolean A00 = false;
    public final boolean A01;
    public final boolean A02;

    public final String getName() {
        return "LicmCrashFixer";
    }

    public final void CMP() {
        if (this.A01 && !this.A00 && MobileBoostNative.sNativeLibLoaded) {
            this.A00 = MobileBoostNative.enableLicmFix(this.A02);
            A08();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0029, code lost:
        if (X.0oI.A09(r4.A01) != false) goto L_0x002b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C267464bb(X.AnonymousClass0Rt r7) {
        /*
            r6 = this;
            r6.<init>(r7)
            r5 = 0
            r6.A00 = r5
            java.lang.Class<X.0hI> r0 = X.AnonymousClass0hI.class
            X.0Rt r4 = r6.A05(r0)
            X.0hI r4 = (X.AnonymousClass0hI) r4
            if (r4 == 0) goto L_0x002b
            com.instagram.common.session.UserSession r3 = r4.A00
            r3.getClass()
            X.0Tu r2 = X.0Tu.A05
            r0 = 36314115994290614(0x81037f002c09b6, double:3.028531407773086E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x002b
            android.content.Context r0 = r4.A01
            boolean r1 = X.0oI.A09(r0)
            r0 = 1
            if (r1 == 0) goto L_0x002c
        L_0x002b:
            r0 = 0
        L_0x002c:
            r6.A01 = r0
            if (r4 == 0) goto L_0x0043
            com.instagram.common.session.UserSession r3 = r4.A00
            r3.getClass()
            X.0Tu r2 = X.0Tu.A05
            r0 = 36314115994225077(0x81037f002b09b5, double:3.02853140773164E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x0043
            r5 = 1
        L_0x0043:
            r6.A02 = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C267464bb.<init>(X.0Rt):void");
    }
}
