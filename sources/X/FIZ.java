package X;

import android.content.DialogInterface;

public final class FIZ implements DialogInterface.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final String A04;

    public FIZ(Object obj, Object obj2, Object obj3, String str, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A03 = obj3;
        this.A04 = str;
        this.A02 = obj2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0120, code lost:
        X.FH4.A0A(r0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0123, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0154, code lost:
        X.FH4.A06(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0157, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0177, code lost:
        X.FH4.A05(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x017a, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.content.DialogInterface r17, int r18) {
        /*
            r16 = this;
            r4 = r16
            int r0 = r4.A00
            switch(r0) {
                case 0: goto L_0x00a8;
                case 1: goto L_0x01ce;
                case 2: goto L_0x01aa;
                case 3: goto L_0x018d;
                case 4: goto L_0x0124;
                case 5: goto L_0x00f2;
                case 6: goto L_0x00c3;
                case 7: goto L_0x0075;
                case 8: goto L_0x0048;
                case 9: goto L_0x0025;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r3 = r4.A03
            java.lang.Object r0 = r4.A02
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            java.lang.String r5 = r4.A04
            java.lang.Object r4 = r4.A01
            X.0h9 r0 = r0.mLifecycleRegistry
            X.0qQ.A07(r0)
            X.0xx r0 = X.C71772f0.A00(r0)
            r6 = 0
            r7 = 3
            X.Ilc r2 = new X.Ilc
            r2.<init>(r3, r4, r5, r6, r7)
            X.AnonymousClass7TE.A1Z(r2, r0)
        L_0x0024:
            return
        L_0x0025:
            java.lang.Object r3 = r4.A02
            X.0wc r3 = (X.0wc) r3
            java.lang.Object r0 = r4.A03
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            java.lang.String r2 = r0.A06
            java.lang.String r1 = r4.A04
            r0 = 0
            X.0qQ.A0B(r3, r0)
            java.lang.String r0 = "cancel_click"
            X.FEM.A00(r3, r2, r1, r0)
            java.lang.Object r0 = r4.A01
            android.content.DialogInterface$OnClickListener r0 = (android.content.DialogInterface.OnClickListener) r0
            if (r0 == 0) goto L_0x0024
            r2 = r17
            r1 = r18
            r0.onClick(r2, r1)
            return
        L_0x0048:
            X.1We r6 = X.1We.A02
            if (r6 == 0) goto L_0x0024
            java.lang.Object r5 = r4.A03
            com.instagram.common.session.UserSession r5 = (com.instagram.common.session.UserSession) r5
            java.lang.String r0 = r4.A04
            X.EWJ r3 = X.FG5.A01(r0)
            long r1 = X.Dba.A01(r5)
            java.lang.Integer r0 = X.AnonymousClass05K.A0H
            X.Dbb.A1P(r5, r3, r0, r1)
            X.1Wg r1 = X.1We.A00(r6)
            X.EWJ r0 = X.EWJ.IG_TS_SIMILAR_POSTS_NUDGE
            X.3M3 r2 = r1.A01(r5, r0)
            java.lang.Object r1 = r4.A01
            androidx.fragment.app.FragmentActivity r1 = (androidx.fragment.app.FragmentActivity) r1
            java.lang.Object r0 = r4.A02
            X.0lg r0 = (X.0lg) r0
            X.DbY.A14(r2, r1, r0)
            return
        L_0x0075:
            X.1We r0 = X.1We.A02
            if (r0 == 0) goto L_0x0024
            java.lang.Object r5 = r4.A03
            com.instagram.common.session.UserSession r5 = (com.instagram.common.session.UserSession) r5
            java.lang.String r0 = r4.A04
            X.EWJ r3 = X.FG5.A01(r0)
            long r1 = X.Dba.A01(r5)
            java.lang.Integer r0 = X.AnonymousClass05K.A0H
            X.Dbb.A1P(r5, r3, r0, r1)
            java.lang.Class<com.instagram.modal.ModalActivity> r3 = com.instagram.modal.ModalActivity.class
            android.os.Bundle r2 = X.AnonymousClass7TE.A0a()
            java.lang.Object r1 = r4.A02
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 3428(0xd64, float:4.804E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            X.6W8 r1 = X.DbW.A0W(r1, r2, r5, r3, r0)
            java.lang.Object r0 = r4.A01
            android.content.Context r0 = (android.content.Context) r0
            r1.A0C(r0)
            return
        L_0x00a8:
            java.lang.String r6 = r4.A04
            java.lang.Object r5 = r4.A02
            X.4VR r5 = (X.AnonymousClass4VR) r5
            java.lang.Object r4 = r4.A01
            X.2cW r4 = (X.2cW) r4
            r0 = 5
            java.lang.Integer[] r3 = X.AnonymousClass05K.A00(r0)
            int r2 = r3.length
            r1 = 0
        L_0x00b9:
            if (r1 >= r2) goto L_0x0024
            r0 = r3[r1]
            r4.AHW(r5, r0, r6)
            int r1 = r1 + 1
            goto L_0x00b9
        L_0x00c3:
            java.lang.Object r5 = r4.A03
            X.0lg r5 = (X.0lg) r5
            X.0iw r1 = X.C49848F9n.A00
            r0 = 1
            X.0qQ.A0B(r1, r0)
            X.0wc r3 = X.AnonymousClass0kN.A01(r1, r5)
            java.lang.Object r2 = r4.A02
            X.F10 r2 = (X.F10) r2
            java.lang.String r1 = r4.A04
            java.lang.String r0 = "ig_quiet_mode_confirmation_toast_edit_tap"
            X.DcM.A01(r3, r2, r0, r1)
            java.lang.Class<com.instagram.modal.ModalActivity> r3 = com.instagram.modal.ModalActivity.class
            java.lang.String r0 = "entrypoint"
            android.os.Bundle r2 = X.DbY.A0B(r0, r1)
            java.lang.Object r1 = r4.A01
            android.app.Activity r1 = (android.app.Activity) r1
            java.lang.String r0 = "quiet_mode_settings"
            X.6W8 r0 = X.DbW.A0W(r1, r2, r5, r3, r0)
            r0.A0C(r1)
            return
        L_0x00f2:
            java.lang.Object r0 = r4.A01
            X.FH4 r0 = (X.FH4) r0
            com.instagram.common.session.UserSession r3 = r0.A04
            X.0iw r2 = r0.A03
            java.lang.String r1 = "logout_d3_cancel_tapped"
            X.FCF.A00(r2, r3, r1)
            java.lang.Object r2 = r4.A02
            X.EVP r1 = X.EVP.ALL
            if (r2 == r1) goto L_0x0154
            X.EVP r1 = X.EVP.LINKED_ACCOUNTS
            if (r2 == r1) goto L_0x0177
            java.lang.Object r5 = r4.A03
            X.6qt r5 = (X.C319606qt) r5
            java.lang.String r3 = r4.A04
            r1 = 1
            X.6qx r2 = X.C319606qt.A02(r5, r3)
            r2.A0A = r1
            java.util.Map r1 = r5.A00
            r1.put(r3, r2)
            r1 = 0
            r3 = 0
            r5.A0B(r1, r1, r1, r3)
        L_0x0120:
            X.FH4.A0A(r0, r3)
            return
        L_0x0124:
            java.lang.Object r0 = r4.A01
            X.FH4 r0 = (X.FH4) r0
            com.instagram.common.session.UserSession r6 = r0.A04
            X.0iw r5 = r0.A03
            java.lang.String r1 = "logout_d3_remember_tapped"
            X.FCF.A00(r5, r6, r1)
            java.lang.Object r2 = r4.A02
            X.EVP r1 = X.EVP.ALL
            if (r2 != r1) goto L_0x0158
            java.lang.Object r3 = r4.A03
            X.6qt r3 = (X.C319606qt) r3
            X.0BQ r1 = X.AnonymousClass0BO.A00(r6)
            java.util.Set r10 = r1.BNz()
            r11 = 1
            java.lang.Integer r9 = X.AnonymousClass05K.A0j
            androidx.fragment.app.FragmentActivity r1 = r0.A01
            android.content.Context r4 = r1.getApplicationContext()
            java.lang.Boolean r7 = X.AnonymousClass7TE.A0u()
            r8 = r7
            r3.A07(r4, r5, r6, r7, r8, r9, r10, r11)
        L_0x0154:
            X.FH4.A06(r0)
            return
        L_0x0158:
            X.EVP r1 = X.EVP.LINKED_ACCOUNTS
            r3 = 1
            java.lang.Object r7 = r4.A03
            X.6qt r7 = (X.C319606qt) r7
            if (r2 != r1) goto L_0x017b
            java.lang.String r2 = r6.A06
            java.lang.Integer r13 = X.AnonymousClass05K.A0j
            androidx.fragment.app.FragmentActivity r1 = r0.A01
            android.content.Context r8 = r1.getApplicationContext()
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r3)
            r9 = r5
            r10 = r6
            r12 = r11
            r14 = r2
            r15 = r3
            r7.A08(r8, r9, r10, r11, r12, r13, r14, r15)
        L_0x0177:
            X.FH4.A05(r0)
            return
        L_0x017b:
            java.lang.String r2 = r4.A04
            java.lang.Integer r11 = X.AnonymousClass05K.A0j
            androidx.fragment.app.FragmentActivity r1 = r0.A01
            android.content.Context r8 = r1.getApplicationContext()
            r9 = r5
            r10 = r6
            r12 = r2
            r13 = r3
            r7.A09(r8, r9, r10, r11, r12, r13)
            goto L_0x0120
        L_0x018d:
            java.lang.Object r3 = r4.A01
            android.content.Context r3 = (android.content.Context) r3
            java.lang.Object r2 = r4.A03
            com.instagram.common.session.UserSession r2 = (com.instagram.common.session.UserSession) r2
            java.lang.String r1 = r4.A04
            X.2EG r0 = X.2EG.A15
            X.SUL r1 = X.Dba.A0J(r3, r2, r0, r1)
            java.lang.String r0 = r2.A06
            r1.A0E(r0)
            java.lang.Object r0 = r4.A02
            X.0iw r0 = (X.AnonymousClass0iw) r0
            X.DbW.A1J(r0, r1)
            return
        L_0x01aa:
            java.lang.Object r3 = r4.A03
            com.instagram.common.session.UserSession r3 = (com.instagram.common.session.UserSession) r3
            X.27r r2 = X.27p.A01(r3)
            X.283 r0 = r2.A04
            X.JVj r1 = r0.A0C
            java.lang.String r0 = "META_CLOUD_ALBUM_NUX_LEARN_MORE"
            r2.A1Q(r1, r0)
            java.lang.Object r2 = r4.A02
            X.0iw r2 = (X.AnonymousClass0iw) r2
            java.lang.String r1 = r4.A04
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            X.AnonymousClass9PQ.A06(r2, r3, r0, r1)
            java.lang.Object r0 = r4.A01
            android.content.Context r0 = (android.content.Context) r0
            X.AJ5.A05(r0, r3)
            return
        L_0x01ce:
            java.lang.Object r3 = r4.A03
            X.FGL r3 = (X.FGL) r3
            java.lang.Object r2 = r4.A01
            android.content.Context r2 = (android.content.Context) r2
            java.lang.String r1 = r4.A04
            java.lang.Object r0 = r4.A02
            X.EX9 r0 = (X.EX9) r0
            X.FGL.A01(r2, r3, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FIZ.onClick(android.content.DialogInterface, int):void");
    }
}
