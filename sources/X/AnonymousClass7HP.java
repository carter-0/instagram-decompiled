package X;

/* renamed from: X.7HP  reason: invalid class name */
public abstract class AnonymousClass7HP implements C234382xm {
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x016a, code lost:
        if (X.AnonymousClass48O.A06(java.lang.Integer.valueOf(r5.C6a())) != true) goto L_0x016c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002b, code lost:
        if (r2.A0o != true) goto L_0x002d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00(android.view.MotionEvent r25, X.AnonymousClass7HQ r26) {
        /*
            r24 = this;
            r0 = r24
            X.7HO r0 = (X.AnonymousClass7HO) r0
            r3 = 0
            r1 = 1
            X.7H6 r0 = r0.A00
            X.OIL r2 = X.AnonymousClass7H6.A03(r0)
            if (r2 == 0) goto L_0x00dc
            com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout r8 = r2.A0E
            if (r8 == 0) goto L_0x00dc
            X.77B r2 = X.AnonymousClass7H6.A05(r0)
            if (r2 == 0) goto L_0x020b
            java.lang.Boolean r4 = r2.A0J
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r1)
            boolean r7 = X.0qQ.A0K(r4, r2)
        L_0x0022:
            X.77B r2 = X.AnonymousClass7H6.A05(r0)
            if (r2 == 0) goto L_0x002d
            boolean r2 = r2.A0o
            r10 = 1
            if (r2 == r1) goto L_0x002e
        L_0x002d:
            r10 = 0
        L_0x002e:
            X.Pw3 r2 = r0.A0L
            if (r2 == 0) goto L_0x00dc
            boolean r2 = r2.CW1()
            if (r2 != 0) goto L_0x00dc
            com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager r2 = r0.A0C
            if (r2 == 0) goto L_0x0212
            X.3TF r4 = r2.A0O
            X.3TF r2 = X.AnonymousClass3TF.IDLE
            if (r4 != r2) goto L_0x00dc
            boolean r2 = r0.A0h
            if (r2 == 0) goto L_0x00df
            com.instagram.common.session.UserSession r5 = r0.A0w
            r2 = 33
        L_0x004a:
            X.Plq r9 = new X.Plq
            r9.<init>(r2, r0, r8)
            boolean r2 = X.C66797Mcj.A02(r5, r7)
            if (r2 == 0) goto L_0x020e
            X.77B r2 = X.AnonymousClass7H6.A05(r0)
            r6 = 0
            if (r2 == 0) goto L_0x020e
            com.instagram.direct.wellbeing.harmfulcontent.ondevicenudity.view.data.PrivacyMediaOverlayViewModel r2 = r2.A01
            if (r2 == 0) goto L_0x020e
            int r4 = r2.A00
            r2 = 2
            if (r4 == r2) goto L_0x0067
            if (r4 != r1) goto L_0x020e
        L_0x0067:
            com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager r1 = r0.A0C
            if (r1 == 0) goto L_0x0212
            int r1 = r1.getCurrentDataIndex()
            X.759 r9 = X.AnonymousClass7H6.A08(r0, r1)
            if (r9 == 0) goto L_0x00dc
            X.3oV r1 = r9.A05
            int r1 = r1.CFV()
            if (r1 != 0) goto L_0x00dc
            r1 = r26
            android.view.ScaleGestureDetector r1 = r1.A00
            float r8 = r1.getFocusX()
            float r7 = r1.getFocusY()
            X.OIL r2 = X.AnonymousClass7H6.A03(r0)
            r1 = 0
            if (r2 == 0) goto L_0x00dd
            X.3oV r2 = r2.A08
            if (r2 == 0) goto L_0x00dd
            android.view.View r4 = r2.getView()
            if (r4 == 0) goto L_0x00dd
            r2 = 2131439981(0x7f0b316d, float:1.8501932E38)
            android.view.View r4 = r4.findViewById(r2)
        L_0x00a1:
            X.OIL r2 = X.AnonymousClass7H6.A03(r0)
            if (r2 == 0) goto L_0x00a9
            android.view.View r1 = r2.A03
        L_0x00a9:
            boolean r1 = X.OZ0.A00(r4, r1, r8, r7, r3)
            if (r1 == 0) goto L_0x00dc
            r9.A02()
            X.77B r1 = X.AnonymousClass7H6.A05(r0)
            if (r1 == 0) goto L_0x00bb
            X.AnonymousClass7H6.A0P(r0, r1)
        L_0x00bb:
            java.lang.String r2 = r5.A06
            X.77B r1 = X.AnonymousClass7H6.A05(r0)
            if (r1 == 0) goto L_0x00c5
            java.lang.String r6 = r1.A0U
        L_0x00c5:
            boolean r2 = X.0qQ.A0K(r2, r6)
            if (r2 != 0) goto L_0x00d1
            X.77B r1 = X.AnonymousClass7H6.A05(r0)
            r0.A0M = r1
        L_0x00d1:
            com.instagram.direct.thread.analytics.DirectThreadAnalyticsParams r1 = r0.A0P
            if (r10 == 0) goto L_0x00dc
            if (r1 == 0) goto L_0x00dc
            X.NmR r0 = X.C69483NmR.PHOTO_VIEWER
            X.C71137Odf.A05(r0, r5, r1, r2)
        L_0x00dc:
            return
        L_0x00dd:
            r4 = r6
            goto L_0x00a1
        L_0x00df:
            X.77B r2 = X.AnonymousClass7H6.A05(r0)
            if (r2 == 0) goto L_0x00dc
            boolean r2 = r2.A0p
            if (r2 != 0) goto L_0x00dc
            boolean r2 = r0.A0j
            if (r2 != 0) goto L_0x00dc
            float r6 = r25.getRawX()
            float r5 = r25.getRawY()
            X.OIL r2 = X.AnonymousClass7H6.A03(r0)
            if (r2 == 0) goto L_0x0205
            com.instagram.igds.components.mediabutton.IgdsMediaButton r2 = r2.A0D
            if (r2 == 0) goto L_0x0205
            int r2 = r2.getVisibility()
            if (r2 != 0) goto L_0x0205
            X.OIL r2 = X.AnonymousClass7H6.A03(r0)
            if (r2 == 0) goto L_0x014a
            com.instagram.igds.components.mediabutton.IgdsMediaButton r4 = r2.A0D
        L_0x010d:
            r2 = 0
            boolean r4 = X.OZ0.A00(r4, r2, r6, r5, r3)
            if (r4 == 0) goto L_0x0205
            X.77B r7 = X.AnonymousClass7H6.A05(r0)
            r9 = 0
            if (r7 == 0) goto L_0x00dc
            java.lang.String r14 = r7.A0R
            if (r14 != 0) goto L_0x0147
            X.Nky r18 = X.C69416Nky.A0K
        L_0x0121:
            X.1Xj r6 = r7.A0E
            if (r6 == 0) goto L_0x0145
            int r4 = r6.A0y()
            if (r4 <= 0) goto L_0x0145
            int r4 = r6.A0x()
            if (r4 <= 0) goto L_0x0145
            int r5 = r6.A0y()
            int r4 = r6.A0x()
            android.util.Size r8 = new android.util.Size
            r8.<init>(r5, r4)
        L_0x013e:
            if (r14 != 0) goto L_0x014c
            java.lang.String r14 = r7.A0S
            if (r14 != 0) goto L_0x014c
            return
        L_0x0145:
            r8 = r2
            goto L_0x013e
        L_0x0147:
            X.Nky r18 = X.C69416Nky.A0J
            goto L_0x0121
        L_0x014a:
            r4 = 0
            goto L_0x010d
        L_0x014c:
            if (r6 == 0) goto L_0x00dc
            androidx.fragment.app.FragmentActivity r4 = r0.A0t
            java.lang.String r15 = r6.A35(r4)
            if (r15 == 0) goto L_0x00dc
            java.lang.String r6 = r7.A0O
            X.2Ep r5 = r0.A0N
            if (r5 == 0) goto L_0x016c
            int r5 = r5.C6a()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            boolean r5 = X.AnonymousClass48O.A06(r5)
            r17 = 1
            if (r5 == r1) goto L_0x016e
        L_0x016c:
            r17 = 0
        L_0x016e:
            boolean r7 = r7.A0k
            if (r8 == 0) goto L_0x0201
            int r5 = r8.getWidth()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r5)
            int r5 = r8.getHeight()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r5)
        L_0x0182:
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r7)
            X.HtR r10 = new X.HtR
            r16 = r6
            r10.<init>(r11, r12, r13, r14, r15, r16, r17)
            com.instagram.common.session.UserSession r6 = r0.A0w
            X.3sy r7 = r0.A0S
            if (r7 == 0) goto L_0x00dc
            X.0sn r15 = X.0sn.A00
            boolean r5 = r0.A0i
            X.OVN r17 = new X.OVN
            r11 = r17
            r12 = r4
            r13 = r6
            r14 = r7
            r16 = r5
            r11.<init>(r12, r13, r14, r15, r16)
            java.lang.String r22 = new java.lang.String
            r22.<init>()
            java.lang.Integer r21 = X.AnonymousClass05K.A01
            r23 = 184(0xb8, float:2.58E-43)
            r19 = r10
            r20 = r2
            X.OVN.A00(r17, r18, r19, r20, r21, r22, r23)
            X.7I3 r5 = new X.7I3
            r5.<init>(r6)
            X.3sy r4 = r0.A0S
            if (r4 == 0) goto L_0x01c4
            com.instagram.model.direct.DirectThreadKey r4 = X.C66647MaG.A03(r4)
            if (r4 == 0) goto L_0x01c4
            java.lang.String r2 = r4.A01
        L_0x01c4:
            X.2Ep r0 = r0.A0N
            if (r0 == 0) goto L_0x01cf
            boolean r0 = r0.CUG()
            if (r0 != r1) goto L_0x01cf
            r9 = 1
        L_0x01cf:
            X.0wc r0 = r5.A01
            X.1Ln r5 = X.1Ln.A0J(r0)
            if (r9 == 0) goto L_0x01fe
            X.XSV r4 = X.XSV.A05
        L_0x01d9:
            X.0Aj r0 = r5.A00
            boolean r0 = r0.isSampled()
            if (r0 == 0) goto L_0x00dc
            r0 = 26
            r5.A0Z(r0)
            r5.A0X(r3)
            java.lang.String r1 = "edit_with_ai"
            java.lang.String r0 = "selected_item"
            r5.A0R(r0, r1)
            java.lang.String r0 = "thread_id"
            r5.A0R(r0, r2)
            java.lang.String r0 = "thread_type"
            r5.A0M(r4, r0)
            r5.Cgf()
            return
        L_0x01fe:
            X.XSV r4 = X.XSV.A06
            goto L_0x01d9
        L_0x0201:
            r12 = r2
            r13 = r2
            goto L_0x0182
        L_0x0205:
            com.instagram.common.session.UserSession r5 = r0.A0w
            r2 = 34
            goto L_0x004a
        L_0x020b:
            r7 = 0
            goto L_0x0022
        L_0x020e:
            r9.invoke()
            return
        L_0x0212:
            java.lang.String r0 = "viewPager"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7HP.A00(android.view.MotionEvent, X.7HQ):void");
    }
}
