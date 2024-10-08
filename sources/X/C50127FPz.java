package X;

import android.widget.CompoundButton;

/* renamed from: X.FPz  reason: case insensitive filesystem */
public final class C50127FPz implements CompoundButton.OnCheckedChangeListener {
    public final int A00;
    public final int A01;
    public final Object A02;

    public C50127FPz(int i, int i2, Object obj) {
        this.A00 = i2;
        this.A02 = obj;
        this.A01 = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0206, code lost:
        if (r14 != false) goto L_0x01f2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCheckedChanged(android.widget.CompoundButton r13, boolean r14) {
        /*
            r12 = this;
            int r0 = r12.A00
            switch(r0) {
                case 0: goto L_0x01c0;
                case 1: goto L_0x0014;
                case 2: goto L_0x00ef;
                case 3: goto L_0x0090;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r2 = r12.A02
            X.0sP r2 = (X.0sP) r2
            int r1 = r12.A01
            X.EOe r0 = new X.EOe
            r0.<init>(r1, r14)
            r2.invoke(r0)
        L_0x0013:
            return
        L_0x0014:
            java.lang.Object r2 = r12.A02
            X.Mv1 r2 = (X.C67797Mv1) r2
            java.util.TreeSet r1 = r2.A03
            int r0 = r12.A01
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            if (r14 == 0) goto L_0x003b
            r1.add(r0)
        L_0x0025:
            X.O5z r0 = r2.A02
            X.NJe r4 = r0.A00
            boolean r0 = r4.A01
            if (r0 == 0) goto L_0x0013
            X.Mv1 r0 = r4.A00
            if (r0 != 0) goto L_0x003f
            java.lang.String r0 = "itemAdapter"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x003b:
            r1.remove(r0)
            goto L_0x0025
        L_0x003f:
            java.util.TreeSet r0 = r0.A03
            boolean r5 = X.DbT.A1b(r0)
            boolean r0 = r4.A01
            if (r0 == 0) goto L_0x0013
            X.37E r0 = X.AnonymousClass37D.A00
            X.37D r0 = X.DbV.A0g(r4, r0)
            if (r0 == 0) goto L_0x0013
            X.7Pu r3 = X.C48943Emh.A00(r0)
            if (r3 == 0) goto L_0x0013
            com.instagram.igds.components.bottomsheet.BottomSheetFragment r0 = r3.A03
            androidx.fragment.app.Fragment r0 = r0.A0M()
            boolean r0 = X.0qQ.A0K(r0, r4)
            if (r0 == 0) goto L_0x0013
            r7 = 0
            r2 = 1
            r10 = 0
            java.lang.String r9 = ""
            X.7Ps r6 = new X.7Ps
            r8 = r7
            r11 = r10
            r6.<init>(r7, r8, r9, r10, r11)
            android.content.Context r1 = r4.requireContext()
            r0 = 2131957531(0x7f13171b, float:1.9551649E38)
            java.lang.CharSequence r0 = r1.getText(r0)
            r6.A06 = r0
            r6.A0A = r5
            r6.A09 = r2
            r0 = 22
            X.FPI r0 = X.FPI.A00(r4, r0)
            r6.A05 = r0
            X.7Pt r0 = r6.A00()
            r3.A0K(r0, r2)
            return
        L_0x0090:
            java.lang.Object r0 = r12.A02
            X.U9x r0 = (X.C14802U9x) r0
            X.UnR r3 = r0.A02
            java.util.List r0 = r0.A03
            int r2 = r12.A01
            java.lang.Object r1 = X.DbX.A0n(r0, r2)
            java.util.List r0 = r3.A09
            if (r14 == 0) goto L_0x00ca
            r0.add(r1)
            X.05G r1 = r3.A0B
            java.util.List r0 = X.00k.A0a(r0)
            r1.Epw(r0)
            X.VsC r0 = r3.A06
            X.XB6 r1 = r0.A00
            java.lang.String r3 = r0.A01
            java.lang.String r6 = java.lang.String.valueOf(r2)
            java.lang.String r0 = r0.A02
            android.os.Bundle r2 = X.C18463VsC.A00(r0)
            r0 = 3497(0xda9, float:4.9E-42)
            java.lang.String r4 = X.AnonymousClass000.A00(r0)
            java.lang.String r5 = "multi_submit_ad_selection"
        L_0x00c6:
            r1.Cgq(r2, r3, r4, r5, r6)
            return
        L_0x00ca:
            r0.remove(r1)
            X.05G r1 = r3.A0B
            java.util.List r0 = X.00k.A0a(r0)
            r1.Epw(r0)
            X.VsC r0 = r3.A06
            X.XB6 r1 = r0.A00
            java.lang.String r3 = r0.A01
            java.lang.String r6 = java.lang.String.valueOf(r2)
            java.lang.String r0 = r0.A02
            android.os.Bundle r2 = X.C18463VsC.A00(r0)
            r0 = 3497(0xda9, float:4.9E-42)
            java.lang.String r4 = X.AnonymousClass000.A00(r0)
            java.lang.String r5 = "multi_submit_ad_unselection"
            goto L_0x00c6
        L_0x00ef:
            if (r14 == 0) goto L_0x010f
            java.lang.Object r4 = r12.A02
            X.E4V r4 = (X.E4V) r4
            X.DkL r5 = X.E4V.A00(r4)
            int r3 = r12.A01
            r8 = 1
            r2 = 2
            if (r3 != r2) goto L_0x0133
            X.EV0 r1 = r5.A07
            X.EV0 r0 = X.EV0.Broadcast
            if (r1 != r0) goto L_0x0133
            int r0 = r5.A00
            if (r0 >= r8) goto L_0x0133
            X.C46732DkL.A01(r5)
        L_0x010c:
            X.Dbb.A0v(r4)
        L_0x010f:
            java.lang.Object r0 = r12.A02
            X.E4V r0 = (X.E4V) r0
            X.DkL r0 = X.E4V.A00(r0)
            X.0Ud r0 = r0.A0G()
            java.lang.Object r2 = r0.getValue()
            X.EaB r2 = (X.C48169EaB) r2
            boolean r0 = r2 instanceof X.C47819EIr
            if (r0 == 0) goto L_0x01bb
            int r1 = r12.A01
            X.EIr r2 = (X.C47819EIr) r2
            int r0 = r2.A00
            boolean r0 = X.AnonymousClass7TF.A1S(r1, r0)
            r13.setChecked(r0)
            return
        L_0x0133:
            r7 = 0
            if (r3 != r2) goto L_0x015d
            X.EV0 r1 = r5.A07
            X.EV0 r0 = X.EV0.Social
            if (r1 != r0) goto L_0x015d
            boolean r0 = r5.A0J
            if (r0 != 0) goto L_0x015d
            X.05G r6 = r5.A0C
            java.lang.Object[] r1 = new java.lang.Object[r7]
            r0 = 2131974615(0x7f1359d7, float:1.95863E38)
            X.GKO r2 = X.DbS.A0Q(r1, r0)
            java.lang.Object[] r1 = new java.lang.Object[r7]
            r0 = 2131974614(0x7f1359d6, float:1.9586297E38)
            X.GKO r1 = X.DbS.A0Q(r1, r0)
            X.Dti r0 = new X.Dti
            r0.<init>(r2, r1)
        L_0x0159:
            r6.Epw(r0)
            goto L_0x010c
        L_0x015d:
            X.6gx r6 = r5.A06
            if (r3 == r2) goto L_0x0162
            r8 = 0
        L_0x0162:
            X.1Ln r1 = X.DbT.A0J(r6)
            boolean r0 = X.DbT.A1Y(r1)
            if (r0 == 0) goto L_0x018d
            X.DbW.A17(r1, r6)
            if (r8 == 0) goto L_0x01b2
            java.lang.String r0 = "limit_to_subscribers_enabled"
        L_0x0173:
            r1.A0l(r0)
            java.lang.String r0 = "toggle"
            r1.A0k(r0)
            java.lang.String r0 = "limit_to_subscribers_toggle"
            r1.A0p(r0)
            java.lang.String r0 = "chat_setup"
            r1.A0q(r0)
            java.lang.String r0 = "subscriber_broadcast"
            r1.A0o(r0)
            X.Dba.A1C(r1, r6)
        L_0x018d:
            X.05G r1 = r5.A09
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            r1.Epw(r0)
            X.EV0 r1 = r5.A07
            X.EV0 r0 = X.EV0.Social
            if (r1 != r0) goto L_0x010c
            X.05G r6 = r5.A0A
            if (r3 != r2) goto L_0x01b8
            com.instagram.common.session.UserSession r3 = r5.A05
            X.0Tu r2 = X.0Tu.A05
            r0 = 36327615073761845(0x810fc600023a35, double:3.0370682799871225E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x01b5
            X.EWM r0 = X.EWM.THREE_MONTHS
            goto L_0x0159
        L_0x01b2:
            java.lang.String r0 = "limit_to_subscribers_disabled"
            goto L_0x0173
        L_0x01b5:
            X.EWM r0 = X.EWM.ONE_MONTH
            goto L_0x0159
        L_0x01b8:
            X.EWM r0 = X.EWM.INDEFINITE
            goto L_0x0159
        L_0x01bb:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x01c0:
            java.lang.Object r2 = r12.A02
            X.Dm8 r2 = (X.C46832Dm8) r2
            int r3 = r12.A01
            boolean r0 = r2.A05
            if (r0 == 0) goto L_0x0206
            if (r14 == 0) goto L_0x0209
            java.util.Set r1 = r2.A04
            java.lang.Object r0 = X.00k.A0A(r1)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x01f2
            r1.clear()
            androidx.recyclerview.widget.LinearLayoutManager r1 = r2.A02
            int r0 = r0.intValue()
            android.view.View r1 = r1.A1D(r0)
            if (r1 == 0) goto L_0x01f2
            r0 = 2131440393(0x7f0b3309, float:1.8502768E38)
            android.view.View r1 = X.AnonymousClass7TE.A0b(r1, r0)
            android.widget.CompoundButton r1 = (android.widget.CompoundButton) r1
            r0 = 0
            r1.setChecked(r0)
        L_0x01f2:
            java.util.Set r1 = r2.A04
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            r1.add(r0)
        L_0x01fb:
            android.os.Handler r1 = r2.A00
            java.lang.Runnable r0 = r2.A03
            r1.removeCallbacks(r0)
            r1.post(r0)
            return
        L_0x0206:
            if (r14 == 0) goto L_0x0209
            goto L_0x01f2
        L_0x0209:
            java.util.Set r1 = r2.A04
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            r1.remove(r0)
            goto L_0x01fb
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50127FPz.onCheckedChanged(android.widget.CompoundButton, boolean):void");
    }
}
