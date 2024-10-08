package X;

import android.content.Intent;

public final class T8L implements C262944Gp {
    public final /* synthetic */ C340017kY A00;
    public final /* synthetic */ SUL A01;
    public final /* synthetic */ AnonymousClass37D A02;

    public final void Cv7(Integer num, float f) {
        0qQ.A0B(num, 1);
        SUL sul = this.A01;
        C262944Gp r0 = sul.A0J;
        if (r0 != null) {
            r0.Cv7(num, f);
        }
        if (sul.A0x && !SUL.A08(sul)) {
            this.A00.FMM(REW.HALF_SHEET, C9856RiV.A00(num));
        }
        SUL.A04(this.A00, sul, 3);
    }

    public final void D4O(Integer num) {
        String str;
        0qQ.A0B(num, 0);
        SUL sul = this.A01;
        C262944Gp r0 = sul.A0J;
        if (r0 != null) {
            r0.D4O(num);
        }
        if (sul.A0x && !SUL.A08(sul)) {
            this.A00.FMM(REW.PEEK, C9856RiV.A00(num));
        }
        S6e s6e = sul.A0K;
        if (s6e != null) {
            int intValue = num.intValue();
            if (intValue == 0) {
                str = "tap";
            } else if (intValue == 11) {
                str = "back_tap";
            }
            s6e.A02("collapsed", "dismiss", str);
        }
        SUL.A04(this.A00, sul, 4);
    }

    public final void DHB(Integer num) {
        RIg rIg;
        Intent intent;
        0qQ.A0B(num, 0);
        C340017kY r2 = this.A00;
        SUL sul = this.A01;
        int i = 8;
        int i2 = 0;
        if (!sul.A1A) {
            i = 0;
            i2 = 8;
        }
        C13847TiP tiP = r2.A0U;
        if (tiP != null) {
            tiP.AJB(true, 0, i, i2, 8);
            if (r2.A02 == 11 && (intent = r2.A06) != null && intent.getBooleanExtra("BrowserLiteIntent.InstagramExtras.EXTRA_KEEP_BROWSER_OPEN_ON_BACK_PRESSED", false)) {
                r2.A02 = 0;
            }
        }
        C13847TiP tiP2 = r2.A0U;
        if (tiP2 != null) {
            tiP2.Cnb();
        }
        if (sul.A0n) {
            AnonymousClass3GX.A00(sul.A1K).A06("webview");
        }
        if (!sul.A0h) {
            if (182.A06(0Tu.A06, sul.A1K, 36320579917783698L)) {
                RIg rIg2 = sul.A09;
                if (rIg2 != null) {
                    r2.A0a(rIg2);
                }
                sul.A0h = true;
            }
        }
        C262944Gp r0 = sul.A0J;
        if (r0 != null) {
            r0.DHB(num);
        }
        if (!(sul.A05 == 2 || (rIg = sul.A09) == null)) {
            r2.A0a(rIg);
        }
        if (sul.A0k) {
            sul.A05 = 2;
        }
        SUL.A04(r2, sul, 2);
        if (sul.A0x && !SUL.A08(sul)) {
            r2.FMM(REW.FULL_SCREEN, C9856RiV.A00(num));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Dx6(X.C61065Jw3 r12) {
        /*
            r11 = this;
            r0 = 0
            X.0qQ.A0B(r12, r0)
            X.SUL r3 = r11.A01
            X.4Gp r0 = r3.A0J
            if (r0 == 0) goto L_0x000d
            r0.Dx6(r12)
        L_0x000d:
            int r5 = r12.A01
            X.7kY r2 = r11.A00
            boolean r0 = r3.A0k
            if (r0 == 0) goto L_0x0031
            int r1 = r3.A05
            r0 = 3
            r4 = 4
            if (r1 == r5) goto L_0x001d
            if (r5 != r0) goto L_0x0021
        L_0x001d:
            if (r1 != r4) goto L_0x0031
            if (r5 != r0) goto L_0x0031
        L_0x0021:
            r1 = 2
            if (r5 == r1) goto L_0x0106
            if (r5 == r0) goto L_0x0106
            if (r5 != r4) goto L_0x0031
            X.RIg r0 = r3.A09
            if (r0 == 0) goto L_0x002f
            r2.A0Z(r0)
        L_0x002f:
            r3.A05 = r4
        L_0x0031:
            android.app.Activity r0 = r3.A1H
            if (r0 == 0) goto L_0x0102
            X.37D r4 = X.DbT.A0i(r0)
            if (r4 == 0) goto L_0x0102
            java.lang.Object r0 = r12.A02
            X.GlP r0 = (X.C53277GlP) r0
            java.lang.Object r0 = r0.A03
            android.view.MotionEvent r0 = (android.view.MotionEvent) r0
            if (r0 == 0) goto L_0x0102
            float r1 = r0.getY()
            X.37F r4 = (X.AnonymousClass37F) r4
            X.Pzn r0 = r4.A0D
            if (r0 == 0) goto L_0x0102
            boolean r0 = r0.A0J(r1)
            if (r0 == 0) goto L_0x0102
            java.lang.Integer r4 = X.AnonymousClass05K.A0j
        L_0x0057:
            boolean r0 = r3.A0x
            if (r0 == 0) goto L_0x0071
            boolean r0 = X.SUL.A08(r3)
            if (r0 != 0) goto L_0x0071
            int r1 = r12.A01
            r0 = 2
            if (r1 == r0) goto L_0x00fe
            r0 = 3
            if (r1 == r0) goto L_0x00fa
            r0 = 4
            if (r1 != r0) goto L_0x0071
            X.REW r0 = X.REW.PEEK
        L_0x006e:
            r2.FMM(r0, r4)
        L_0x0071:
            r8 = 2
            if (r5 != r8) goto L_0x007b
            boolean r0 = r3.A0n
            if (r0 == 0) goto L_0x007b
            X.SUL.A03(r2, r3)
        L_0x007b:
            X.S6e r4 = r3.A0K
            if (r4 == 0) goto L_0x00a7
            X.37D r10 = r11.A02
            java.lang.String r7 = "external_swipe"
            r9 = 0
            java.lang.String r6 = "swipe"
            r0 = 1
            if (r5 != r8) goto L_0x00a8
            java.lang.Object r0 = r12.A02
            X.GlP r0 = (X.C53277GlP) r0
            java.lang.Object r1 = r0.A04
            android.view.MotionEvent r1 = (android.view.MotionEvent) r1
            X.37F r10 = (X.AnonymousClass37F) r10
            int r0 = r10.A06
            if (r0 != r8) goto L_0x0099
            r9 = 1
        L_0x0099:
            boolean r0 = X.SUL.A07(r1, r3, r9)
            if (r0 != 0) goto L_0x00a0
            r7 = r6
        L_0x00a0:
            java.lang.String r1 = "full"
            java.lang.String r0 = "expand"
            r4.A02(r1, r0, r7)
        L_0x00a7:
            return
        L_0x00a8:
            java.lang.String r2 = "dismiss"
            if (r5 != r0) goto L_0x00c9
            java.lang.Object r0 = r12.A02
            X.GlP r0 = (X.C53277GlP) r0
            java.lang.Object r1 = r0.A04
            android.view.MotionEvent r1 = (android.view.MotionEvent) r1
            X.37F r10 = (X.AnonymousClass37F) r10
            int r0 = r10.A06
            if (r0 != r8) goto L_0x00bb
            r9 = 1
        L_0x00bb:
            boolean r0 = X.SUL.A07(r1, r3, r9)
            if (r0 != 0) goto L_0x00c2
            r7 = r6
        L_0x00c2:
            java.lang.String r0 = "secondary_cta"
        L_0x00c5:
            r4.A02(r0, r2, r7)
            return
        L_0x00c9:
            r0 = 4
            if (r5 != r0) goto L_0x00e5
            java.lang.Object r0 = r12.A02
            X.GlP r0 = (X.C53277GlP) r0
            java.lang.Object r1 = r0.A04
            android.view.MotionEvent r1 = (android.view.MotionEvent) r1
            X.37F r10 = (X.AnonymousClass37F) r10
            int r0 = r10.A06
            if (r0 != r8) goto L_0x00db
            r9 = 1
        L_0x00db:
            boolean r0 = X.SUL.A07(r1, r3, r9)
            if (r0 != 0) goto L_0x00e2
            r7 = r6
        L_0x00e2:
            java.lang.String r0 = "collapsed"
            goto L_0x00c5
        L_0x00e5:
            r0 = 3
            if (r5 != r0) goto L_0x00a7
            int r1 = r12.A00
            r0 = 1
            if (r1 == r0) goto L_0x00f7
            if (r1 == r8) goto L_0x00f1
            java.lang.String r2 = "bounce"
        L_0x00f1:
            java.lang.String r0 = "anchored"
            r4.A02(r0, r2, r6)
            return
        L_0x00f7:
            java.lang.String r2 = "expand"
            goto L_0x00f1
        L_0x00fa:
            X.REW r0 = X.REW.HALF_SHEET
            goto L_0x006e
        L_0x00fe:
            X.REW r0 = X.REW.FULL_SCREEN
            goto L_0x006e
        L_0x0102:
            java.lang.Integer r4 = X.AnonymousClass05K.A15
            goto L_0x0057
        L_0x0106:
            X.RIg r0 = r3.A09
            if (r0 == 0) goto L_0x010d
            r2.A0a(r0)
        L_0x010d:
            r3.A05 = r1
            goto L_0x0031
        */
        throw new UnsupportedOperationException("Method not decompiled: X.T8L.Dx6(X.Jw3):void");
    }

    public T8L(C340017kY r1, SUL sul, AnonymousClass37D r3) {
        this.A01 = sul;
        this.A00 = r1;
        this.A02 = r3;
    }

    public final void Cv6(float f) {
        C262944Gp r0 = this.A01.A0J;
        if (r0 != null) {
            r0.Cv6(f);
        }
    }

    public final void D4N() {
        C262944Gp r0 = this.A01.A0J;
        if (r0 != null) {
            r0.D4N();
        }
    }

    public final void D9d() {
        C262944Gp r0 = this.A01.A0J;
        if (r0 != null) {
            r0.D9d();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0013, code lost:
        if (r3 != null) goto L_0x0015;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DYG(int r10, int r11) {
        /*
            r9 = this;
            X.SUL r2 = r9.A01
            boolean r0 = r2.A0y
            X.7kY r1 = r9.A00
            if (r0 != 0) goto L_0x0022
            boolean r0 = r2.A1E
            int r5 = X.DbW.A00(r0)
            r6 = 8
            r4 = 0
            X.TiP r3 = r1.A0U
            if (r3 == 0) goto L_0x001a
        L_0x0015:
            r7 = r6
            r8 = r6
            r3.AJB(r4, r5, r6, r7, r8)
        L_0x001a:
            X.4Gp r0 = r2.A0J
            if (r0 == 0) goto L_0x0021
            r0.DYG(r10, r11)
        L_0x0021:
            return
        L_0x0022:
            r6 = 8
            r4 = 0
            X.TiP r3 = r1.A0U
            if (r3 == 0) goto L_0x001a
            r5 = r4
            goto L_0x0015
        */
        throw new UnsupportedOperationException("Method not decompiled: X.T8L.DYG(int, int):void");
    }
}
