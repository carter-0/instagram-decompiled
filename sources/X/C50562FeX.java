package X;

import android.view.View;

/* renamed from: X.FeX  reason: case insensitive filesystem */
public final class C50562FeX implements G7C {
    public final Dd4 A00;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000f, code lost:
        if (r1 == 0) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean AFM(X.C48087EVf r3, X.C283155Gi r4, int r5) {
        /*
            r2 = this;
            r0 = 0
            X.0qQ.A0B(r4, r0)
            X.5Gj r0 = r4.A04
            java.lang.String r0 = r0.A0f
            if (r0 == 0) goto L_0x0011
            int r1 = r0.length()
            r0 = 0
            if (r1 != 0) goto L_0x0012
        L_0x0011:
            r0 = 1
        L_0x0012:
            r0 = r0 ^ 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50562FeX.AFM(X.EVf, X.5Gi, int):boolean");
    }

    public C50562FeX(Dd4 dd4) {
        this.A00 = dd4;
    }

    public final void AJS(View view, JV7 jv7, C48087EVf eVf, C283155Gi r7, int i) {
        AnonymousClass7TG.A1N(r7, eVf);
        Dd4 dd4 = this.A00;
        String str = r7.A04.A0f;
        if (str != null) {
            dd4.Dw6(C47179Dru.A00(jv7, eVf, i), r7, str, i);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }
}
