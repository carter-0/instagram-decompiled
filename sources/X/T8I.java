package X;

import com.facebook.browser.lite.BrowserLiteFragment;

public final class T8I implements C13823Tht {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public T8I(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public final void Cyn() {
        S6e s6e;
        if (this.A00 == 0) {
            SUL sul = (SUL) this.A02;
            C13823Tht tht = sul.A0I;
            if (tht != null) {
                tht.Cyn();
            }
            if (sul.A00 != 0.0d && (s6e = sul.A0K) != null && !0qQ.A0K(s6e.A02, "secondary_cta")) {
                0Aj A0e = AnonymousClass7TE.A0e(s6e.A04, "instagram_cnb_partial_sheet_interaction");
                if (A0e.isSampled()) {
                    A0e.AAJ("from_size", s6e.A02);
                    A0e.AAJ("to_size", s6e.A02);
                    A0e.A9F("ad_id", DbZ.A0d(s6e.A05));
                    A0e.AAJ("callsite_session_id", s6e.A01);
                    A0e.AAJ("action_type", "nudge");
                    A0e.AAJ("launch_method", s6e.A06);
                    A0e.Cgf();
                }
            }
        }
    }

    public final void DA6() {
        if (this.A00 == 0) {
            SUL sul = (SUL) this.A02;
            C13823Tht tht = sul.A0I;
            if (tht != null) {
                tht.DA6();
            }
            S6e s6e = sul.A0K;
            if (s6e != null) {
                s6e.A02("full", "expand", AnonymousClass000.A00(3031));
            }
            C340017kY r1 = (C340017kY) this.A01;
            if (sul.A0n) {
                SUL.A03(r1, sul);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r6 = (X.SUL) r7.A02;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean DPO() {
        /*
            r7 = this;
            int r0 = r7.A00
            if (r0 != 0) goto L_0x002b
            java.lang.Object r6 = r7.A02
            X.SUL r6 = (X.SUL) r6
            X.Tht r5 = r6.A0I
            if (r5 == 0) goto L_0x002b
            java.lang.Object r4 = r7.A01
            X.7kY r4 = (X.C340017kY) r4
            X.S6e r3 = r6.A0K
            if (r3 == 0) goto L_0x001d
            java.lang.String r2 = "full"
            java.lang.String r1 = "expand"
            java.lang.String r0 = "long_press"
            r3.A02(r2, r1, r0)
        L_0x001d:
            boolean r1 = r5.DPO()
            boolean r0 = r6.A0n
            if (r0 == 0) goto L_0x002a
            if (r1 == 0) goto L_0x002a
            X.SUL.A03(r4, r6)
        L_0x002a:
            return r1
        L_0x002b:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.T8I.DPO():boolean");
    }

    public final void DVD() {
        S6e s6e;
        if (this.A00 == 0) {
            SUL sul = (SUL) this.A02;
            C13823Tht tht = sul.A0I;
            if (tht != null) {
                tht.DVD();
            }
            if (sul.A15 && (s6e = sul.A0K) != null) {
                s6e.A02("secondary_cta", "dismiss", "interaction_tap");
            }
        }
    }

    public final void Dkz() {
        if (this.A00 != 0) {
            1Xj r3 = (1Xj) this.A01;
            if (r3 != null) {
                C15383Ubh ubh = (C15383Ubh) this.A02;
                AnonymousClass6L4.A00(C15383Ubh.A01(ubh), r3, ubh.A0M, "bottom_sheet_tap_to_expand_fullscreen");
                return;
            }
            return;
        }
        SUL sul = (SUL) this.A02;
        C13823Tht tht = sul.A0I;
        if (tht != null) {
            tht.Dkz();
        }
        S6e s6e = sul.A0K;
        if (s6e != null) {
            s6e.A02("full", "expand", "tap");
        }
        if (sul.A0x && !SUL.A08(sul)) {
            ((BrowserLiteFragment) this.A01).FMM(REW.FULL_SCREEN, AnonymousClass05K.A1F);
        }
        C340017kY r1 = (C340017kY) this.A01;
        if (sul.A0n) {
            SUL.A03(r1, sul);
        }
    }
}
