package X;

public abstract class F3G {
    public final 0lg A00;
    public final C49368EuW A01;
    public final String A02;

    public final void A00(boolean z, boolean z2) {
        0lg r2;
        String str;
        String str2;
        if (this instanceof C47926ENd) {
            if (0 == this.A01.A00.size() - 1 && A01(z, z2)) {
                0lg r22 = this.A00;
                String str3 = this.A02;
                0qQ.A0B(r22, 0);
                0qQ.A0B(str3, 1);
                FG9.A00(r22, "disclosures_v2_screen_pt2_all_content_fits", str3);
            }
            if (A01(z, z2)) {
                r2 = this.A00;
                str = this.A02;
                0qQ.A0B(r2, 0);
                0qQ.A0B(str, 1);
                str2 = "disclosures_v2_screen_pt1_all_content_fits";
            } else {
                return;
            }
        } else {
            boolean z3 = this instanceof C47924ENb;
            boolean A012 = A01(z, z2);
            if (z3) {
                if (A012) {
                    r2 = this.A00;
                    str = this.A02;
                    AnonymousClass7TG.A1N(r2, str);
                } else {
                    return;
                }
            } else if (A012 && !((C49561Exw) this.A01.A00.get(0)).A00) {
                r2 = this.A00;
                str = this.A02;
                AnonymousClass7TF.A1H(r2, str);
            } else {
                return;
            }
            str2 = "disclosures_v2_screen_all_content_fits";
        }
        FG9.A00(r2, str2, str);
    }

    /* JADX WARNING: Removed duplicated region for block: B:5:0x0015 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A01(boolean r3, boolean r4) {
        /*
            r2 = this;
            boolean r0 = r2 instanceof X.C47923ENa
            if (r0 == 0) goto L_0x0017
            if (r3 == 0) goto L_0x0015
            X.EuW r0 = r2.A01
            java.util.List r0 = r0.A00
            java.lang.Object r0 = X.AnonymousClass7TE.A13(r0)
            X.Exw r0 = (X.C49561Exw) r0
            boolean r0 = r0.A00
            r1 = 1
            if (r0 == 0) goto L_0x0016
        L_0x0015:
            r1 = 0
        L_0x0016:
            return r1
        L_0x0017:
            if (r3 == 0) goto L_0x0015
            if (r4 == 0) goto L_0x0015
            X.EuW r0 = r2.A01
            java.util.List r0 = r0.A00
            java.lang.Object r0 = X.AnonymousClass7TE.A13(r0)
            X.Exw r0 = (X.C49561Exw) r0
            boolean r0 = r0.A00
            r1 = 1
            if (r0 == 0) goto L_0x0016
            goto L_0x0015
        */
        throw new UnsupportedOperationException("Method not decompiled: X.F3G.A01(boolean, boolean):boolean");
    }

    public F3G(0lg r1, C49368EuW euW, String str) {
        this.A00 = r1;
        this.A02 = str;
        this.A01 = euW;
    }
}
