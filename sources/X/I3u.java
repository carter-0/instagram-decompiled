package X;

public final class I3u {
    public static final I3u A00 = new Object();

    /* JADX WARNING: type inference failed for: r7v3, types: [com.instagram.common.ui.widget.imageview.RoundedCornerImageView, android.view.View] */
    /* JADX WARNING: type inference failed for: r7v9, types: [com.instagram.common.ui.widget.imageview.IgImageView, com.instagram.common.ui.widget.imageview.RoundedCornerImageView] */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001c, code lost:
        if (r8 != null) goto L_0x001f;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(android.content.Context r11, X.AnonymousClass0iw r12, com.instagram.common.session.UserSession r13, X.1Xj r14, X.C317286n1 r15, X.C55880Hp1 r16, com.instagram.ui.widget.radiogroup.IgRadioGroup r17, X.C62320sa r18, int r19, boolean r20, boolean r21) {
        /*
            r10 = r14
            com.instagram.model.mediatype.ProductType r1 = r14.A1v()
            com.instagram.model.mediatype.ProductType r0 = com.instagram.model.mediatype.ProductType.REPOST_MEDIA_FACADE
            r5 = 0
            r7 = 0
            if (r1 != r0) goto L_0x001e
            r7 = 1
            X.4oA r0 = X.C51966G9m.A0x(r14)
            if (r0 == 0) goto L_0x001e
            X.4o8 r0 = r0.BtE()
            if (r0 == 0) goto L_0x001e
            X.1Xj r8 = r0.Bn2()
            if (r8 != 0) goto L_0x001f
        L_0x001e:
            r8 = r14
        L_0x001f:
            X.4oA r0 = X.C51966G9m.A0x(r14)
            if (r0 == 0) goto L_0x0031
            X.4o8 r0 = r0.BtE()
            if (r0 == 0) goto L_0x0031
            X.1Xj r6 = r0.Bj0()
            if (r6 != 0) goto L_0x0032
        L_0x0031:
            r6 = r14
        L_0x0032:
            r4 = r16
            if (r20 == 0) goto L_0x003b
            android.view.View r0 = r4.A00
            r0.setVisibility(r5)
        L_0x003b:
            com.instagram.user.model.User r0 = X.C51966G9m.A11(r8)
            r9 = r12
            if (r0 == 0) goto L_0x0051
            X.4Cl r0 = r0.A03
            com.instagram.common.typedurl.ImageUrl r1 = r0.C50()
            if (r1 != 0) goto L_0x004c
            com.instagram.common.typedurl.SimpleImageUrl r1 = com.instagram.user.model.User.A08
        L_0x004c:
            com.instagram.common.ui.widget.imageview.CircularImageView r0 = r4.A06
            r0.setUrl(r1, r12)
        L_0x0051:
            com.instagram.user.model.User r0 = X.C51966G9m.A11(r8)
            r1 = 0
            if (r0 == 0) goto L_0x008b
            r0.getUsername()
            com.instagram.user.model.User r0 = X.C51966G9m.A11(r8)
            if (r0 == 0) goto L_0x0065
            java.lang.String r1 = r0.getUsername()
        L_0x0065:
            android.text.SpannableStringBuilder r3 = X.DbS.A0C(r1)
            com.instagram.user.model.User r0 = X.C51966G9m.A11(r8)
            if (r0 == 0) goto L_0x007e
            boolean r2 = r0.isVerified()
            java.lang.Integer r1 = X.AnonymousClass05K.A01
            X.3Zv r0 = X.C243683Zu.A0E
            X.3Zu r0 = r0.A01(r11)
            X.AnonymousClass3ZI.A02(r11, r3, r0, r1, r2)
        L_0x007e:
            X.3a9 r0 = new X.3a9
            r0.<init>()
            X.C51971G9r.A0y(r3, r0, r5)
            android.widget.TextView r0 = r4.A05
            r0.setText(r3)
        L_0x008b:
            if (r7 == 0) goto L_0x00a0
            android.widget.TextView r2 = r4.A03
            r2.setVisibility(r5)
            r1 = 2131971575(0x7f134df7, float:1.9580133E38)
            com.instagram.user.model.User r0 = X.C51966G9m.A11(r14)
            java.lang.String r0 = X.C51971G9r.A0t(r0)
            X.DbX.A13(r11, r2, r0, r1)
        L_0x00a0:
            android.widget.TextView r7 = r4.A04
            long r2 = r8.A1A()
            double r0 = (double) r2
            java.lang.String r0 = X.1G0.A04(r11, r0)
            r7.setText(r0)
            android.widget.TextView r2 = r4.A01
            X.3gp r0 = r8.A1T()
            if (r0 == 0) goto L_0x01b9
            java.lang.String r0 = r0.A0d
        L_0x00b8:
            r2.setText(r0)
            com.instagram.model.mediasize.ExtendedImageUrl r1 = r6.A1n(r11)
            if (r1 == 0) goto L_0x01b0
            r0 = 3
            r2.setMaxLines(r0)
            com.instagram.common.ui.widget.imageview.RoundedCornerImageView r7 = r4.A07
            r7.setUrl(r1, r12)
        L_0x00ca:
            if (r21 == 0) goto L_0x0126
            boolean r0 = r6.A50()
            if (r0 != 0) goto L_0x00d8
            boolean r0 = r6.A4a()
            if (r0 == 0) goto L_0x0126
        L_0x00d8:
            boolean r0 = r6.A4a()
            if (r0 == 0) goto L_0x01ad
            java.util.List r0 = X.C51966G9m.A1I(r6)
            r1 = 1
            if (r0 == 0) goto L_0x01ad
            X.1Xj r0 = X.DbZ.A0T(r0, r5)
            if (r0 == 0) goto L_0x01ad
            boolean r0 = r0.A50()
            if (r0 != r1) goto L_0x01ad
            java.util.List r0 = X.C51966G9m.A1I(r6)
            if (r0 == 0) goto L_0x01aa
            X.1Xj r3 = X.DbZ.A0T(r0, r5)
        L_0x00fb:
            X.0Tu r2 = X.0Tu.A05
            r0 = 36328130469772240(0x81103e00013bd0, double:3.0373942184994295E-306)
            boolean r0 = X.182.A06(r2, r13, r0)
            if (r0 == 0) goto L_0x01a1
            if (r3 == 0) goto L_0x01a1
            com.instagram.model.mediasize.ExtendedImageUrl r2 = r6.A1n(r11)
            r0 = 8
            r7.setVisibility(r0)
            X.Ib0 r1 = r4.A09
            com.instagram.ui.simplevideolayout.SimpleVideoLayout r0 = r1.A05
            r0.setVideoSource(r3, r12)
            if (r2 == 0) goto L_0x0121
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r1.A04
            r0.setUrl(r2, r12)
        L_0x0121:
            android.view.View r0 = r1.A00
            r0.setVisibility(r5)
        L_0x0126:
            android.widget.TextView r6 = r4.A02
            X.4oA r0 = X.C51966G9m.A0x(r8)
            if (r0 == 0) goto L_0x019f
            java.lang.Integer r0 = r0.AxC()
            if (r0 == 0) goto L_0x019f
            int r7 = r0.intValue()
        L_0x0138:
            int r3 = r8.A0v()
            android.content.res.Resources r1 = r11.getResources()
            r0 = 2131820914(0x7f110172, float:1.9274556E38)
            java.lang.String r2 = X.DbY.A0d(r1, r7, r0)
            X.0qQ.A07(r2)
            android.content.res.Resources r1 = r11.getResources()
            r0 = 2131820913(0x7f110171, float:1.9274554E38)
            java.lang.String r1 = X.DbY.A0d(r1, r3, r0)
            X.0qQ.A07(r1)
            if (r7 <= 0) goto L_0x0193
            if (r3 <= 0) goto L_0x018f
            r0 = 2131971573(0x7f134df5, float:1.958013E38)
            java.lang.String r0 = X.DbV.A0u(r11, r2, r1, r0)
            r6.setText(r0)
        L_0x0166:
            if (r20 != 0) goto L_0x0182
            r11 = r15
            r1 = r17
            r0 = r18
            if (r15 == 0) goto L_0x018c
            if (r17 == 0) goto L_0x0183
            if (r18 == 0) goto L_0x0183
        L_0x0173:
            X.IDY r6 = new X.IDY
            r6.<init>(r5, r1, r4, r0)
            com.instagram.igds.components.button.IgdsRadioButton r0 = r4.A08
            r0.setOnTouchListener(r6)
        L_0x017d:
            android.view.View r0 = r4.A00
            r0.setOnTouchListener(r6)
        L_0x0182:
            return
        L_0x0183:
            r8 = 2
            X.IDZ r6 = new X.IDZ
            r7 = r19
            r6.<init>(r7, r8, r9, r10, r11)
            goto L_0x017d
        L_0x018c:
            if (r17 != 0) goto L_0x0173
            return
        L_0x018f:
            r6.setText(r2)
            goto L_0x0166
        L_0x0193:
            if (r3 <= 0) goto L_0x0199
            r6.setText(r1)
            goto L_0x0166
        L_0x0199:
            r0 = 8
            r6.setVisibility(r0)
            goto L_0x0166
        L_0x019f:
            r7 = 0
            goto L_0x0138
        L_0x01a1:
            android.view.ViewGroup$LayoutParams r1 = r7.getLayoutParams()
            r0 = -1
            r1.width = r0
            goto L_0x0126
        L_0x01aa:
            r3 = 0
            goto L_0x00fb
        L_0x01ad:
            r3 = r6
            goto L_0x00fb
        L_0x01b0:
            com.instagram.common.ui.widget.imageview.RoundedCornerImageView r7 = r4.A07
            r0 = 8
            r7.setVisibility(r0)
            goto L_0x00ca
        L_0x01b9:
            r0 = 0
            goto L_0x00b8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.I3u.A00(android.content.Context, X.0iw, com.instagram.common.session.UserSession, X.1Xj, X.6n1, X.Hp1, com.instagram.ui.widget.radiogroup.IgRadioGroup, X.0sa, int, boolean, boolean):void");
    }
}
