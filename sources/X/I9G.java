package X;

import android.content.DialogInterface;

public final class I9G implements DialogInterface.OnDismissListener {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public I9G(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0082, code lost:
        if (X.AnonymousClass3WP.A09(r7, r8, r9, r10, X.C51966G9m.A1D(r5), r12, false, r14, r15, r16, r17) != true) goto L_0x0084;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00ca, code lost:
        if (r0 != null) goto L_0x0180;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0130, code lost:
        if (X.AnonymousClass3WP.A09(r7, r8, r9, r10, X.C51966G9m.A1D(r5), r12, false, r14, r15, r16, r17) != true) goto L_0x0132;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x017e, code lost:
        if (r0 != null) goto L_0x0180;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0180, code lost:
        r2 = r0.CEL();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onDismiss(android.content.DialogInterface r19) {
        /*
            r18 = this;
            r0 = r18
            int r1 = r0.A00
            switch(r1) {
                case 0: goto L_0x00e4;
                case 1: goto L_0x0036;
                case 2: goto L_0x0007;
                case 3: goto L_0x0007;
                case 4: goto L_0x01a4;
                case 5: goto L_0x0021;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r4 = r0.A01
            X.GCh r4 = (X.C52035GCh) r4
            boolean r1 = r4.A00
            if (r1 != 0) goto L_0x001b
            java.lang.Object r3 = r0.A02
            com.facebook.quicklog.reliability.UserFlowLoggerImpl r3 = (com.facebook.quicklog.reliability.UserFlowLoggerImpl) r3
            r1 = 658062002(0x27393ab2, double:3.25125828E-315)
            java.lang.String r0 = "user_cancelled"
            r3.flowEndCancel(r1, r0)
        L_0x001b:
            X.HqC r0 = r4.A05
            r0.A00()
        L_0x0020:
            return
        L_0x0021:
            java.lang.Object r1 = r0.A01
            X.0r1 r1 = (X.0r1) r1
            boolean r1 = r1.A00
            if (r1 != 0) goto L_0x0020
            java.lang.Object r1 = r0.A02
            X.6ZN r1 = (X.AnonymousClass6ZN) r1
            r0 = 0
            r1.A0B = r0
            X.4mU r0 = r1.A0F
            r0.EHd()
            return
        L_0x0036:
            java.lang.Object r3 = r0.A02
            X.GHv r3 = (X.C52179GHv) r3
            X.GBn r1 = r3.A07
            X.4Nf r6 = r1.Auf()
            X.Jw6 r5 = r3.A00
            r4 = 1
            r13 = 0
            r2 = 0
            if (r5 == 0) goto L_0x0084
            java.lang.Object r5 = r5.A03
            X.1Xj r5 = (X.1Xj) r5
            if (r5 == 0) goto L_0x0084
            com.instagram.common.session.UserSession r7 = r3.A06
            if (r6 == 0) goto L_0x00e1
            boolean r6 = r6.A00
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r6)
        L_0x0057:
            boolean r14 = r5.CcK()
            boolean r15 = r5.CeS()
            boolean r16 = r5.A51()
            boolean r17 = r5.A4L()
            java.util.List r12 = X.C51965G9l.A0w(r5)
            X.3WR r8 = r5.CEL()
            com.instagram.user.model.User r6 = X.C51966G9m.A11(r5)
            if (r6 == 0) goto L_0x00df
            java.lang.String r10 = r6.getId()
        L_0x0079:
            java.lang.String r11 = X.C51966G9m.A1D(r5)
            boolean r5 = X.AnonymousClass3WP.A09(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r6 = 1
            if (r5 == r4) goto L_0x0085
        L_0x0084:
            r6 = 0
        L_0x0085:
            java.lang.String r5 = "fragment_resumed"
            r1.A0R(r5, r13)
            if (r6 == 0) goto L_0x00d0
            java.lang.Object r6 = r0.A01
            X.Jw6 r6 = (X.C61068Jw6) r6
            java.lang.Object r0 = r6.A04
            X.3v4 r0 = (X.C256003v4) r0
            X.C263164Jj.A01(r0)
            com.instagram.common.session.UserSession r5 = r3.A06
            X.0qQ.A0B(r5, r13)
            boolean r0 = X.AnonymousClass3WS.A06(r5)
            if (r0 == 0) goto L_0x00ce
            java.lang.Object r0 = r6.A03
            X.1Xj r0 = (X.1Xj) r0
            java.lang.String r0 = X.C51966G9m.A1D(r0)
            java.lang.String r0 = X.AnonymousClass3WS.A00(r5, r0)
        L_0x00ae:
            r1.A0U(r4, r0)
        L_0x00b1:
            com.instagram.common.session.UserSession r6 = r3.A06
            X.0Tu r0 = X.DbS.A0J(r6, r13)
            r4 = 36323156897639330(0x810bb800012ba2, double:3.03424891145561E-306)
            boolean r0 = X.182.A06(r0, r6, r4)
            if (r0 == 0) goto L_0x0020
            X.Jw6 r0 = r3.A00
            if (r0 == 0) goto L_0x0184
            java.lang.Object r0 = r0.A03
            X.1Xj r0 = (X.1Xj) r0
            if (r0 == 0) goto L_0x0184
            goto L_0x0180
        L_0x00ce:
            r0 = r2
            goto L_0x00ae
        L_0x00d0:
            r1.A0U(r13, r2)
            java.lang.Object r0 = r0.A01
            X.Jw6 r0 = (X.C61068Jw6) r0
            java.lang.Object r0 = r0.A04
            X.3v4 r0 = (X.C256003v4) r0
            X.C263164Jj.A00(r0)
            goto L_0x00b1
        L_0x00df:
            r10 = r2
            goto L_0x0079
        L_0x00e1:
            r9 = r2
            goto L_0x0057
        L_0x00e4:
            java.lang.Object r3 = r0.A02
            X.GHv r3 = (X.C52179GHv) r3
            X.GBn r1 = r3.A07
            X.4Nf r6 = r1.Auf()
            X.Jw6 r5 = r3.A00
            r4 = 1
            r13 = 0
            r2 = 0
            if (r5 == 0) goto L_0x0132
            java.lang.Object r5 = r5.A03
            X.1Xj r5 = (X.1Xj) r5
            if (r5 == 0) goto L_0x0132
            com.instagram.common.session.UserSession r7 = r3.A06
            if (r6 == 0) goto L_0x01a1
            boolean r6 = r6.A00
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r6)
        L_0x0105:
            boolean r14 = r5.CcK()
            boolean r15 = r5.CeS()
            boolean r16 = r5.A51()
            boolean r17 = r5.A4L()
            java.util.List r12 = X.C51965G9l.A0w(r5)
            X.3WR r8 = r5.CEL()
            com.instagram.user.model.User r6 = X.C51966G9m.A11(r5)
            if (r6 == 0) goto L_0x019f
            java.lang.String r10 = r6.getId()
        L_0x0127:
            java.lang.String r11 = X.C51966G9m.A1D(r5)
            boolean r5 = X.AnonymousClass3WP.A09(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r6 = 1
            if (r5 == r4) goto L_0x0133
        L_0x0132:
            r6 = 0
        L_0x0133:
            java.lang.String r5 = "fragment_resumed"
            r1.A0R(r5, r13)
            if (r6 == 0) goto L_0x0190
            java.lang.Object r0 = r0.A01
            X.Jw6 r0 = (X.C61068Jw6) r0
            java.lang.Object r0 = r0.A04
            X.3v4 r0 = (X.C256003v4) r0
            X.C263164Jj.A01(r0)
            com.instagram.common.session.UserSession r5 = r3.A06
            X.0qQ.A0B(r5, r13)
            boolean r0 = X.AnonymousClass3WS.A06(r5)
            if (r0 == 0) goto L_0x018e
            X.Jw6 r0 = r3.A00
            if (r0 == 0) goto L_0x018c
            java.lang.Object r0 = r0.A03
            X.1Xj r0 = (X.1Xj) r0
            if (r0 == 0) goto L_0x018c
            java.lang.String r0 = X.C51966G9m.A1D(r0)
        L_0x015e:
            java.lang.String r0 = X.AnonymousClass3WS.A00(r5, r0)
        L_0x0162:
            r1.A0U(r4, r0)
        L_0x0165:
            com.instagram.common.session.UserSession r6 = r3.A06
            X.0Tu r0 = X.DbS.A0J(r6, r13)
            r4 = 36323156897639330(0x810bb800012ba2, double:3.03424891145561E-306)
            boolean r0 = X.182.A06(r0, r6, r4)
            if (r0 == 0) goto L_0x0020
            X.Jw6 r0 = r3.A00
            if (r0 == 0) goto L_0x0184
            java.lang.Object r0 = r0.A03
            X.1Xj r0 = (X.1Xj) r0
            if (r0 == 0) goto L_0x0184
        L_0x0180:
            X.3WR r2 = r0.CEL()
        L_0x0184:
            boolean r0 = X.AnonymousClass3WS.A0B(r6, r2)
            r1.A0T(r0)
            return
        L_0x018c:
            r0 = r2
            goto L_0x015e
        L_0x018e:
            r0 = r2
            goto L_0x0162
        L_0x0190:
            r1.A0U(r13, r2)
            java.lang.Object r0 = r0.A01
            X.Jw6 r0 = (X.C61068Jw6) r0
            java.lang.Object r0 = r0.A04
            X.3v4 r0 = (X.C256003v4) r0
            X.C263164Jj.A00(r0)
            goto L_0x0165
        L_0x019f:
            r10 = r2
            goto L_0x0127
        L_0x01a1:
            r9 = r2
            goto L_0x0105
        L_0x01a4:
            java.lang.Object r2 = r0.A02
            X.GCf r2 = (X.C52033GCf) r2
            X.HqC r1 = r2.A0E
            r1.A00()
            X.GCg r1 = r2.A0H
            java.lang.Object r4 = r0.A01
            X.4bN r4 = (X.C267324bN) r4
            X.GBE r3 = r1.A0G
            com.instagram.common.session.UserSession r2 = r1.A0B
            androidx.fragment.app.FragmentActivity r1 = r1.A04
            X.6cp r0 = new X.6cp
            r0.<init>(r2, r1)
            r3.A0L(r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.I9G.onDismiss(android.content.DialogInterface):void");
    }
}
