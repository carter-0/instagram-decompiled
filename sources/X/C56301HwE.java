package X;

import android.app.Activity;

/* renamed from: X.HwE  reason: case insensitive filesystem */
public abstract class C56301HwE {
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0013, code lost:
        if (r1 == 0) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A01(X.1Xj r1) {
        /*
            X.1Xy r0 = r1.A0C
            X.3dh r0 = r0.B2s()
            if (r0 == 0) goto L_0x0015
            java.lang.String r0 = r0.B2v()
            if (r0 == 0) goto L_0x0015
            int r1 = r0.length()
            r0 = 0
            if (r1 != 0) goto L_0x0016
        L_0x0015:
            r0 = 1
        L_0x0016:
            r0 = r0 ^ 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56301HwE.A01(X.1Xj):boolean");
    }

    public static final void A00(Activity activity, 1Xj r6) {
        C245923dh B2s;
        String B2v;
        if (A01(r6) && (B2s = r6.A0C.B2s()) != null && (B2v = B2s.B2v()) != null) {
            C358248ab A0X = DbS.A0X(activity);
            A0X.A09(2131961868);
            A0X.A0q(B2v);
            A0X.A0I(new C50022FJh(B2v, (Object) activity, 5), 2131956746);
            DbX.A16(new C49969FHc(4), A0X);
        }
    }
}
