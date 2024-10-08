package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Gup  reason: case insensitive filesystem */
public final class C53822Gup extends C251343mx {
    public final int A00 = 1;
    public final C267324bN A01;
    public final UserSession A02;
    public final GK4 A03;
    public final JTF A04;
    public final C59512JMk A05;
    public final 2WX A06;

    public C53822Gup(2WX r2, C267324bN r3, UserSession userSession, GK4 gk4, JTF jtf, C59512JMk jMk) {
        AnonymousClass7TG.A1Q(jtf, r3);
        AnonymousClass7TG.A1S(userSession, jMk);
        this.A03 = gk4;
        this.A04 = jtf;
        this.A01 = r3;
        this.A06 = r2;
        this.A02 = userSession;
        this.A05 = jMk;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00bb, code lost:
        if (r13 != null) goto L_0x006c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00eb, code lost:
        if (r0 == false) goto L_0x00ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x010b, code lost:
        if (r11 != 0) goto L_0x0149;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0118, code lost:
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0149, code lost:
        r2 = X.C51971G9r.A0X(X.C51974G9v.A0M((X.2WX) null, r12, 0, r2), X.AnonymousClass05K.A0C, 0.0f, 1);
        r1 = X.C51968G9o.A0K(r13, r11);
        X.C51973G9u.A0x(r1, r13, com.instagram.android.R.color.canvas_bottom_sheet_description_text_color);
        r8 = new X.GH5(r1, (android.widget.ImageView.ScaleType) null, r2, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0163, code lost:
        r3 = X.C52199GIq.A02(r13, (X.2WX) null, r10.A00(X.C243803a8.A00(r13), r7, r9), false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0171, code lost:
        if (r6 != X.GJ2.META_VERIFIED_LINK) goto L_0x018f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0173, code lost:
        r14 = java.lang.Integer.valueOf((int) (((double) X.AnonymousClass7TF.A0A(r13.Aqq().A0C).getDisplayMetrics().widthPixels) * 0.4d));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x01a9, code lost:
        return X.C51967G9n.A0Q(X.C243563Zg.A0G(X.C51973G9u.A0J(r8, r3, r13.Aqq()), r13, X.C52199GIq.A01(r13, r14, false, false, false, false)), r13, r5, r4);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C251263mp A0X(X.AnonymousClass3Y5 r20) {
        /*
            r19 = this;
            r15 = 0
            r5 = r20
            X.0qQ.A0B(r5, r15)
            r6 = r19
            X.2WX r2 = r6.A06
            r0 = 12
            X.J6F r1 = X.J6F.A00(r6, r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A1F
            r3 = 4
            X.9JS r1 = X.C51965G9l.A0d(r0, r1, r3)
            X.3XV r0 = X.2WX.A02
            r14 = 0
            if (r2 != r0) goto L_0x001d
            r2 = r14
        L_0x001d:
            X.2WX r2 = X.C51965G9l.A0X(r2, r1)
            r0 = 41
            X.J6R r1 = X.J6R.A00(r6, r5, r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A04
            X.2WX r1 = X.C51971G9r.A0Y(r2, r0, r1, r3)
            r0 = 13
            X.J6F r0 = X.J6F.A00(r6, r0)
            java.lang.Integer r12 = X.AnonymousClass05K.A00
            X.2WX r4 = X.C51971G9r.A0Z(r1, r12, r0, r14)
            X.I0X r10 = X.I0X.A00
            android.content.Context r3 = X.C243803a8.A00(r5)
            X.GK4 r9 = r6.A03
            com.instagram.common.session.UserSession r7 = r6.A02
            r8 = 1
            int r1 = X.DbW.A02(r8, r9, r7)
            X.1Xj r11 = r9.A00
            X.GJ2 r6 = r9.A02
            int r0 = r6.ordinal()
            java.lang.String r13 = ""
            if (r0 == r15) goto L_0x00a4
            if (r0 == r1) goto L_0x0086
            r1 = 10
            if (r0 != r1) goto L_0x006c
            com.instagram.user.model.UpcomingEvent r2 = r11.A27(r7)
            if (r2 == 0) goto L_0x006c
            X.0nE r1 = X.C61410nE.A00
            X.Vkq r2 = X.C17116VIm.A00(r7, r1, r2)
            X.Uy1 r1 = X.Uy1.A0D
            java.lang.String r13 = r2.A00(r3, r1)
        L_0x006c:
            java.lang.Integer r1 = X.AnonymousClass05K.A0N
            X.2WX r4 = X.C51971G9r.A0Y(r4, r1, r13, r15)
        L_0x0072:
            X.2Wb r13 = X.C51972G9s.A0Q(r5)
            long r2 = X.C244013aV.A06(r13)
            android.content.Context r1 = X.C243803a8.A00(r13)
            switch(r0) {
                case 0: goto L_0x00f1;
                case 1: goto L_0x00f5;
                case 2: goto L_0x00f9;
                case 3: goto L_0x00fd;
                case 4: goto L_0x0101;
                case 5: goto L_0x011a;
                case 6: goto L_0x011a;
                case 7: goto L_0x011e;
                case 8: goto L_0x0122;
                case 9: goto L_0x0126;
                case 10: goto L_0x00be;
                case 11: goto L_0x012a;
                case 12: goto L_0x012e;
                case 13: goto L_0x0132;
                case 14: goto L_0x00c3;
                case 15: goto L_0x0136;
                case 16: goto L_0x013a;
                case 17: goto L_0x010e;
                case 18: goto L_0x011a;
                case 19: goto L_0x013e;
                case 20: goto L_0x0142;
                case 21: goto L_0x00f9;
                case 22: goto L_0x00f9;
                case 23: goto L_0x0146;
                case 24: goto L_0x00fd;
                default: goto L_0x0081;
            }
        L_0x0081:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0086:
            android.content.res.Resources r3 = r3.getResources()
            r2 = 2131965500(0x7f13363c, float:1.9567812E38)
            X.1Xy r1 = r11.A0C
            com.instagram.model.venue.LocationDictIntf r1 = r1.BNh()
            if (r1 == 0) goto L_0x009c
            java.lang.String r1 = r1.getName()
            if (r1 == 0) goto L_0x009c
            r13 = r1
        L_0x009c:
            java.lang.String r13 = X.AnonymousClass7TF.A0e(r3, r13, r2)
            X.0qQ.A07(r13)
            goto L_0x006c
        L_0x00a4:
            android.content.res.Resources r13 = r3.getResources()
            r2 = 2131820978(0x7f1101b2, float:1.9274686E38)
            int r1 = r11.A0z()
            java.lang.String r2 = r13.getQuantityString(r2, r1)
            java.lang.String r1 = r10.A00(r3, r7, r9)
            java.lang.String r13 = X.002.A0R(r2, r1)
            if (r13 == 0) goto L_0x0072
            goto L_0x006c
        L_0x00be:
            r11 = 2131238012(0x7f081c7c, float:1.809229E38)
            goto L_0x0149
        L_0x00c3:
            X.1Xy r0 = r11.A0C
            java.util.List r0 = r0.Av3()
            if (r0 == 0) goto L_0x00ed
            java.lang.Object r0 = X.00k.A0J(r0)
            X.5DY r0 = (X.AnonymousClass5DY) r0
            if (r0 == 0) goto L_0x00ed
            java.lang.Boolean r0 = r0.Cdc()
            boolean r0 = X.AnonymousClass7TF.A1Y(r0, r8)
            if (r0 == 0) goto L_0x00ed
            X.0Tu r11 = X.0Tu.A06
            r0 = 36323805437898263(0x810c4f00042e17, double:3.034659050926821E-306)
            boolean r0 = X.182.A06(r11, r7, r0)
            r11 = 2131237925(0x7f081c25, float:1.8092114E38)
            if (r0 != 0) goto L_0x0149
        L_0x00ed:
            r11 = 2131238742(0x7f081f56, float:1.8093771E38)
            goto L_0x0149
        L_0x00f1:
            r11 = 2131238953(0x7f082029, float:1.80942E38)
            goto L_0x0149
        L_0x00f5:
            r11 = 2131238782(0x7f081f7e, float:1.8093852E38)
            goto L_0x0149
        L_0x00f9:
            r11 = 2131238501(0x7f081e65, float:1.8093282E38)
            goto L_0x0149
        L_0x00fd:
            r11 = 2131238876(0x7f081fdc, float:1.8094043E38)
            goto L_0x0149
        L_0x0101:
            X.I0Y r0 = X.I0Y.A00
            X.0eP r0 = r0.A00(r1, r7, r11)
            int r11 = X.C51970G9q.A0B(r0)
            if (r11 == 0) goto L_0x0118
            goto L_0x0149
        L_0x010e:
            boolean r0 = X.JUL.A01(r7)
            if (r0 != 0) goto L_0x0118
            r11 = 2131238907(0x7f081ffb, float:1.8094106E38)
            goto L_0x0149
        L_0x0118:
            r8 = r14
            goto L_0x0163
        L_0x011a:
            r11 = 2131237876(0x7f081bf4, float:1.8092015E38)
            goto L_0x0149
        L_0x011e:
            r11 = 2131238331(0x7f081dbb, float:1.8092938E38)
            goto L_0x0149
        L_0x0122:
            r11 = 2131238264(0x7f081d78, float:1.8092802E38)
            goto L_0x0149
        L_0x0126:
            r11 = 2131238657(0x7f081f01, float:1.8093599E38)
            goto L_0x0149
        L_0x012a:
            r11 = 2131238856(0x7f081fc8, float:1.8094003E38)
            goto L_0x0149
        L_0x012e:
            r11 = 2131238325(0x7f081db5, float:1.8092926E38)
            goto L_0x0149
        L_0x0132:
            r11 = 2131238320(0x7f081db0, float:1.8092915E38)
            goto L_0x0149
        L_0x0136:
            r11 = 2131238495(0x7f081e5f, float:1.809327E38)
            goto L_0x0149
        L_0x013a:
            r11 = 2131238067(0x7f081cb3, float:1.8092402E38)
            goto L_0x0149
        L_0x013e:
            r11 = 2131238644(0x7f081ef4, float:1.8093573E38)
            goto L_0x0149
        L_0x0142:
            r11 = 2131238684(0x7f081f1c, float:1.8093654E38)
            goto L_0x0149
        L_0x0146:
            r11 = 2131238662(0x7f081f06, float:1.809361E38)
        L_0x0149:
            X.2WX r2 = X.C51974G9v.A0M(r14, r12, r15, r2)
            r1 = 0
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            X.2WX r2 = X.C51971G9r.A0X(r2, r0, r1, r8)
            android.graphics.drawable.Drawable r1 = X.C51968G9o.A0K(r13, r11)
            r0 = 2131099843(0x7f0600c3, float:1.781205E38)
            X.C51973G9u.A0x(r1, r13, r0)
            X.GH5 r8 = new X.GH5
            r8.<init>(r1, r14, r2, r15)
        L_0x0163:
            android.content.Context r0 = X.C243803a8.A00(r13)
            java.lang.String r0 = r10.A00(r0, r7, r9)
            X.2WW r3 = X.C52199GIq.A02(r13, r14, r0, r15)
            X.GJ2 r0 = X.GJ2.META_VERIFIED_LINK
            if (r6 != r0) goto L_0x018f
            X.2V1 r0 = r13.Aqq()
            android.content.Context r0 = r0.A0C
            android.content.res.Resources r0 = X.AnonymousClass7TF.A0A(r0)
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r0 = r0.widthPixels
            double r1 = (double) r0
            r6 = 4600877379321698714(0x3fd999999999999a, double:0.4)
            double r1 = r1 * r6
            int r0 = (int) r1
            java.lang.Integer r14 = java.lang.Integer.valueOf(r0)
        L_0x018f:
            r16 = r15
            r17 = r15
            r18 = r15
            X.2WX r1 = X.C52199GIq.A01(r13, r14, r15, r16, r17, r18)
            X.2V1 r0 = r13.Aqq()
            X.2Wb r0 = X.C51973G9u.A0J(r8, r3, r0)
            X.2Tp r0 = X.C243563Zg.A0G(r0, r13, r1)
            X.2Tp r0 = X.C51967G9n.A0Q(r0, r13, r5, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C53822Gup.A0X(X.3Y5):X.3mp");
    }
}
