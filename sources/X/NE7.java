package X;

public final class NE7 extends C68056MzN {
    public C67644MrX A00;
    public final NgG A01;
    public final boolean A02;
    public final AnonymousClass0iw A03;

    public NE7(AnonymousClass0iw r2, NgG ngG, boolean z, boolean z2) {
        super(ngG.A00, z);
        this.A01 = ngG;
        this.A03 = r2;
        this.A02 = z2;
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00ab, code lost:
        if (r10 != r0) goto L_0x0169;
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x020f  */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0218  */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x021f  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0228  */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0206  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03(X.C68166N3g r14) {
        /*
            r13 = this;
            X.NgG r6 = r13.A01
            X.0iw r8 = r13.A03
            r5 = 0
            r4 = 1
            X.N3g r0 = r6.A00
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x015b
            boolean r2 = r14.A0L
            if (r2 == 0) goto L_0x022f
            com.instagram.rtc.presentation.participants.RtcCallParticipantCellView r7 = r6.A04
            java.lang.Integer r1 = r7.A02
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r1 == r0) goto L_0x0025
            r7.A02 = r0
            X.0eM r0 = r7.A0G
            android.graphics.drawable.Drawable r0 = X.JTO.A0D(r0)
        L_0x0022:
            r7.setBackground(r0)
        L_0x0025:
            com.instagram.common.typedurl.ImageUrl r10 = r14.A04
            float r3 = r14.A00
            X.0qQ.A0B(r10, r5)
            com.instagram.common.typedurl.ImageUrl r0 = r7.A01
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x0046
            r7.A01 = r10
            com.instagram.common.ui.widget.imageview.CircularImageView r9 = r7.A0C
            r1 = 2
            X.Oyx r0 = new X.Oyx
            r0.<init>(r7, r1)
            r9.A0E = r0
            r9.setUrl(r10, r8)
            r9.setVisibility(r5)
        L_0x0046:
            com.instagram.common.ui.widget.imageview.CircularImageView r9 = r7.A0C
            android.view.ViewGroup$LayoutParams r1 = r9.getLayoutParams()
            java.lang.String r8 = "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams"
            X.0qQ.A0C(r1, r8)
            X.2dQ r1 = (X.C71492dQ) r1
            float r0 = r1.A06
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x005b
            r1.A06 = r3
        L_0x005b:
            boolean r0 = r14.A0H
            if (r0 == 0) goto L_0x0228
            r9.setVisibility(r5)
        L_0x0062:
            if (r2 == 0) goto L_0x021f
            android.view.View r0 = r7.A09
            r0.setVisibility(r5)
        L_0x0069:
            java.lang.String r2 = r14.A0A
            com.instagram.common.ui.base.IgTextView r1 = r7.A0B
            if (r2 == 0) goto L_0x0218
            java.lang.CharSequence r0 = r1.getText()
            boolean r0 = X.0qQ.A0K(r0, r2)
            if (r0 != 0) goto L_0x007c
            r1.setText(r2)
        L_0x007c:
            r1.setVisibility(r5)
        L_0x007f:
            boolean r0 = r14.A0M
            if (r0 == 0) goto L_0x020f
            com.instagram.igds.components.mediabutton.IgdsMediaButton r0 = r7.A0E
            r0.setVisibility(r5)
        L_0x0088:
            boolean r0 = r14.A0J
            if (r0 == 0) goto L_0x0206
            android.view.View r0 = r7.A08
            r0.setVisibility(r5)
        L_0x0091:
            java.lang.Integer r10 = r14.A06
            X.N3g r11 = r6.A00
            if (r11 == 0) goto L_0x0169
            long r2 = r14.A02
            long r0 = r11.A02
            int r12 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r12 != 0) goto L_0x0169
            boolean r1 = r14.A0K
            boolean r0 = r11.A0K
            if (r1 != r0) goto L_0x0169
            java.lang.Integer r0 = r11.A06
            if (r0 != 0) goto L_0x00ab
            java.lang.Integer r0 = X.AnonymousClass05K.A00
        L_0x00ab:
            if (r10 != r0) goto L_0x0169
        L_0x00ad:
            org.webrtc.RendererCommon$ScalingType r1 = r14.A0B
            X.Oq3 r9 = r7.A0F
            org.webrtc.RendererCommon$ScalingType r0 = r9.A05
            if (r0 == r1) goto L_0x00c1
            r9.A05 = r1
            X.MsF r0 = r9.A01
            if (r0 == 0) goto L_0x00be
            r0.setScalingType(r1)
        L_0x00be:
            X.C71743Oq3.A00(r9)
        L_0x00c1:
            r10 = 0
            X.NgG.A00(r6, r14, r5)
            com.facebook.rtc.views.omnigrid.GridItemType r8 = r14.A03
            com.facebook.rtc.views.omnigrid.GridItemType r3 = com.facebook.rtc.views.omnigrid.GridItemType.SELF_VIEW
            if (r8 != r3) goto L_0x010f
            boolean r0 = r14.A0C
            if (r0 == 0) goto L_0x0163
            boolean r0 = r14.A0N
            if (r0 == 0) goto L_0x0163
            android.widget.TextView r0 = r7.A00
            if (r0 != 0) goto L_0x00f2
            android.view.LayoutInflater r1 = X.DbV.A0D(r7)
            r0 = 2131624113(0x7f0e00b1, float:1.8875397E38)
            android.widget.TextView r11 = X.C66582MXn.A0E(r1, r7, r0, r5)
            r7.A00 = r11
            r2 = -1
            r1 = -2
            X.2dQ r0 = new X.2dQ
            r0.<init>(r2, r1)
            r0.A0u = r5
            r0.A0F = r5
            r7.addView(r11, r0)
        L_0x00f2:
            android.widget.TextView r0 = r7.A00
            if (r0 == 0) goto L_0x00f9
            r0.setVisibility(r5)
        L_0x00f9:
            boolean r0 = r14.A0G
            if (r0 == 0) goto L_0x010f
            android.widget.TextView r2 = r7.A00
            if (r2 == 0) goto L_0x010f
            android.content.res.Resources r1 = r2.getResources()
            r0 = 2131165572(0x7f070184, float:1.7945365E38)
            float r0 = X.AnonymousClass7TE.A01(r1, r0)
            r2.setTextSize(r5, r0)
        L_0x010f:
            boolean r0 = r14.A0F
            if (r0 == 0) goto L_0x015c
            android.view.View$OnClickListener r0 = r6.A02
            X.AnonymousClass0fU.A00(r0, r7)
            r7.setClickable(r4)
        L_0x011b:
            boolean r5 = r14.A0E
            com.instagram.common.session.UserSession r4 = X.C71743Oq3.A0B
            X.0Tu r2 = X.0Tu.A05
            r0 = 2342167811083743608(0x20810d3700003178, double:4.069657458708284E-152)
            boolean r0 = X.DbY.A1Y(r2, r4, r0)
            if (r0 == 0) goto L_0x0132
            if (r5 != 0) goto L_0x0132
            boolean r0 = r9.A07
            if (r0 == 0) goto L_0x013d
        L_0x0132:
            X.0eM r0 = r9.A09
            android.view.View r0 = X.AnonymousClass7TE.A0c(r0)
            if (r0 == 0) goto L_0x013d
            r0.setEnabled(r5)
        L_0x013d:
            java.lang.String r0 = r14.A08
            r7.setContentDescription(r0)
            X.N3g r0 = r6.A00
            if (r0 != 0) goto L_0x0159
            boolean r0 = r6.A01
            if (r0 != 0) goto L_0x0159
            X.0sL r2 = r6.A06
            boolean r0 = X.AnonymousClass7TF.A1W(r8, r3)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            X.NiR r0 = X.C69265NiR.VIEW_BOUND
            r2.invoke(r1, r0)
        L_0x0159:
            r6.A00 = r14
        L_0x015b:
            return
        L_0x015c:
            r7.setOnClickListener(r10)
            r7.setClickable(r5)
            goto L_0x011b
        L_0x0163:
            android.widget.TextView r0 = r7.A00
            X.AnonymousClass7TH.A0R(r0)
            goto L_0x00f9
        L_0x0169:
            boolean r0 = r14.A0K
            if (r0 == 0) goto L_0x01fd
            com.instagram.common.ui.widget.imageview.IgImageView r2 = r7.A0D
            r2.setVisibility(r5)
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r10 != r0) goto L_0x01b3
            X.0eM r0 = r7.A0H
            android.graphics.drawable.Drawable r0 = X.JTO.A0D(r0)
            r2.setImageDrawable(r0)
            r0 = 255(0xff, float:3.57E-43)
            r2.setImageAlpha(r0)
            android.view.ViewGroup$LayoutParams r3 = r2.getLayoutParams()
            if (r3 == 0) goto L_0x024e
            X.2dQ r3 = (X.C71492dQ) r3
            X.0eM r1 = r7.A0I
            int r0 = X.DbX.A07(r1)
            r3.height = r0
            int r0 = X.DbX.A07(r1)
            r3.width = r0
            int r0 = r9.getId()
            r3.A0M = r0
            int r0 = r9.getId()
            r3.A0F = r0
            r3.leftMargin = r5
            r3.rightMargin = r5
            r3.topMargin = r5
            r3.bottomMargin = r5
        L_0x01ae:
            r2.setLayoutParams(r3)
            goto L_0x00ad
        L_0x01b3:
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r10 != r0) goto L_0x01f6
            X.0eM r0 = r7.A0J
            int r0 = X.DbX.A07(r0)
        L_0x01bd:
            X.0eM r1 = r7.A0K
            android.graphics.drawable.Drawable r1 = X.JTO.A0D(r1)
            r2.setImageDrawable(r1)
            r1 = 80
            r2.setImageAlpha(r1)
            android.view.ViewGroup$LayoutParams r3 = r2.getLayoutParams()
            if (r3 == 0) goto L_0x0253
            X.2dQ r3 = (X.C71492dQ) r3
            r3.height = r0
            r3.width = r0
            r3.A0M = r5
            r3.A0F = r5
            X.0eM r1 = r7.A0L
            int r0 = X.DbX.A07(r1)
            r3.leftMargin = r0
            int r0 = X.DbX.A07(r1)
            r3.rightMargin = r0
            int r0 = X.DbX.A07(r1)
            r3.topMargin = r0
            int r0 = X.DbX.A07(r1)
            r3.bottomMargin = r0
            goto L_0x01ae
        L_0x01f6:
            X.0eM r0 = r7.A0M
            int r0 = X.DbX.A07(r0)
            goto L_0x01bd
        L_0x01fd:
            com.instagram.common.ui.widget.imageview.IgImageView r1 = r7.A0D
            r0 = 8
            r1.setVisibility(r0)
            goto L_0x00ad
        L_0x0206:
            android.view.View r1 = r7.A08
            r0 = 8
            r1.setVisibility(r0)
            goto L_0x0091
        L_0x020f:
            com.instagram.igds.components.mediabutton.IgdsMediaButton r1 = r7.A0E
            r0 = 8
            r1.setVisibility(r0)
            goto L_0x0088
        L_0x0218:
            r0 = 8
            r1.setVisibility(r0)
            goto L_0x007f
        L_0x021f:
            android.view.View r1 = r7.A09
            r0 = 8
            r1.setVisibility(r0)
            goto L_0x0069
        L_0x0228:
            r0 = 8
            r9.setVisibility(r0)
            goto L_0x0062
        L_0x022f:
            boolean r1 = r14.A0I
            if (r1 == 0) goto L_0x023e
            boolean r0 = r14.A0D
            if (r0 == 0) goto L_0x023e
            com.instagram.rtc.presentation.participants.RtcCallParticipantCellView r7 = r6.A04
            com.instagram.rtc.presentation.participants.RtcCallParticipantCellView.A01(r7, r4, r5)
            goto L_0x0025
        L_0x023e:
            com.instagram.rtc.presentation.participants.RtcCallParticipantCellView r7 = r6.A04
            if (r1 == 0) goto L_0x0247
            com.instagram.rtc.presentation.participants.RtcCallParticipantCellView.A01(r7, r5, r5)
            goto L_0x0025
        L_0x0247:
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            r7.A02 = r0
            r0 = 0
            goto L_0x0022
        L_0x024e:
            java.lang.NullPointerException r0 = X.AnonymousClass7TE.A11(r8)
            throw r0
        L_0x0253:
            java.lang.NullPointerException r0 = X.AnonymousClass7TE.A11(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NE7.A03(X.N3g):void");
    }
}
