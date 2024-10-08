package X;

/* renamed from: X.FxH  reason: case insensitive filesystem */
public final class C51628FxH implements 02o {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;
    public final Object A08;

    public C51628FxH(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        this.A00 = i;
        this.A06 = obj;
        this.A07 = obj6;
        this.A05 = obj5;
        this.A02 = obj2;
        this.A03 = obj8;
        this.A01 = obj3;
        this.A04 = obj4;
        this.A08 = obj7;
    }

    /* JADX WARNING: type inference failed for: r0v16, types: [com.instagram.common.accessibility.AccessibleTextView, android.widget.TextView] */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x003f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object emit(java.lang.Object r11, X.AnonymousClass4D7 r12) {
        /*
            r10 = this;
            int r0 = r10.A00
            if (r0 == 0) goto L_0x00e4
            X.Drr r11 = (X.C47176Drr) r11
            java.lang.Object r2 = r10.A06
            android.view.View r2 = (android.view.View) r2
            boolean r1 = r11.A07
            r4 = 0
            int r0 = X.DbW.A01(r1)
            r2.setVisibility(r0)
            java.lang.Object r3 = r10.A07
            com.instagram.common.ui.widget.imageview.IgImageView r3 = (com.instagram.common.ui.widget.imageview.IgImageView) r3
            java.lang.Object r2 = r10.A08
            X.E4g r2 = (X.C47481E4g) r2
            r0 = r1 ^ 1
            int r0 = X.DbW.A01(r0)
            r3.setVisibility(r0)
            com.instagram.common.typedurl.ImageUrl r0 = r11.A01
            if (r0 == 0) goto L_0x00a9
            r3.setUrl(r0, r2)
            r0 = 2131976325(0x7f136085, float:1.9589767E38)
            java.lang.String r0 = r2.getString(r0)
        L_0x0033:
            r3.setContentDescription(r0)
        L_0x0036:
            android.widget.ImageView$ScaleType r0 = r11.A00
            r3.setScaleType(r0)
            boolean r0 = r11.A0A
            if (r0 == 0) goto L_0x00a7
            android.content.Context r1 = r2.requireContext()
            r0 = 2131231505(0x7f080311, float:1.8079093E38)
            android.graphics.drawable.Drawable r0 = r1.getDrawable(r0)
        L_0x004a:
            r3.setBackground(r0)
            boolean r0 = r11.A08
            r3.setEnabled(r0)
            X.3NG r5 = new X.3NG
            r5.<init>(r3)
            r1 = 1
            X.EHe r0 = new X.EHe
            r0.<init>(r1, r2, r11)
            r5.A04 = r0
            r5.A00()
            java.lang.Object r1 = r10.A05
            android.view.View r1 = (android.view.View) r1
            boolean r0 = r11.A09
            int r0 = X.DbW.A01(r0)
            r1.setVisibility(r0)
            java.lang.Object r1 = r10.A02
            android.view.View r1 = (android.view.View) r1
            boolean r0 = r11.A05
            int r0 = X.DbW.A01(r0)
            r1.setVisibility(r0)
            java.lang.Object r3 = r10.A03
            com.instagram.igds.components.textcell.IgdsListCell r3 = (com.instagram.igds.components.textcell.IgdsListCell) r3
            r1 = 16
            X.FPF r0 = new X.FPF
            r0.<init>((int) r1, (java.lang.Object) r11, (java.lang.Object) r2)
            r3.A0C(r0)
            java.lang.Object r1 = r10.A01
            android.view.View r1 = (android.view.View) r1
            boolean r0 = r11.A04
            int r0 = X.DbW.A01(r0)
            r1.setVisibility(r0)
            java.lang.Object r1 = r10.A04
            android.view.View r1 = (android.view.View) r1
            boolean r0 = r11.A06
            if (r0 != 0) goto L_0x00a1
            r4 = 8
        L_0x00a1:
            r1.setVisibility(r4)
        L_0x00a4:
            X.0gF r0 = X.C60340gF.A00
            return r0
        L_0x00a7:
            r0 = 0
            goto L_0x004a
        L_0x00a9:
            java.lang.String r5 = r11.A02
            if (r5 == 0) goto L_0x00c9
            int r1 = r3.getWidth()
            int r0 = r3.getHeight()
            android.graphics.Bitmap r0 = X.1MF.A0E(r5, r1, r0)
            if (r0 == 0) goto L_0x00c0
            r3.setImageBitmap(r0)
            goto L_0x0036
        L_0x00c0:
            java.lang.String r1 = "FanClubPromoAndWelcomeVideoFragment_imageFilePath is null"
            java.lang.String r0 = ""
            X.0wb.A03(r1, r0)
            goto L_0x0036
        L_0x00c9:
            boolean r0 = r11.A0B
            if (r0 == 0) goto L_0x0036
            X.0eM r0 = r2.A03
            java.lang.Object r0 = r0.getValue()
            android.graphics.drawable.Drawable r0 = (android.graphics.drawable.Drawable) r0
            r3.setImageDrawable(r0)
            X.0eM r0 = r2.A05
            X.DeO r0 = X.C46790DlK.A00(r0)
            java.lang.String r0 = X.C47481E4g.A02(r0, r2)
            goto L_0x0033
        L_0x00e4:
            X.JV5 r11 = (X.JV5) r11
            boolean r0 = r11.A01
            r5 = 0
            r3 = 8
            if (r0 == 0) goto L_0x0118
            java.lang.Object r0 = r10.A07
            android.view.View r0 = (android.view.View) r0
            r0.setVisibility(r3)
            java.lang.Object r3 = r10.A08
            X.E48 r3 = (X.E48) r3
            X.2da r0 = r3.A00
            if (r0 == 0) goto L_0x00ff
            r0.Etr(r5)
        L_0x00ff:
            X.6ap r2 = X.DbS.A0a()
            android.content.res.Resources r1 = X.DbV.A05(r3)
            r0 = 2131956940(0x7f1314cc, float:1.955045E38)
            X.DbT.A1D(r1, r2, r0)
            r0 = 1
            X.FdH.A00(r2, r3, r0)
            r2.A06()
            X.Dbb.A1Q(r2)
            goto L_0x00a4
        L_0x0118:
            java.lang.Object r4 = r10.A08
            X.E48 r4 = (X.E48) r4
            X.2da r0 = r4.A00
            r2 = 1
            if (r0 == 0) goto L_0x0124
            r0.Etr(r2)
        L_0x0124:
            java.lang.Object r0 = r11.A03
            X.HLa r0 = (X.C54617HLa) r0
            int r1 = r0.ordinal()
            if (r1 == r5) goto L_0x01ab
            if (r1 == r2) goto L_0x0138
            r0 = 2
            if (r1 != r0) goto L_0x01b4
            X.DbX.A1I(r4)
            goto L_0x00a4
        L_0x0138:
            java.lang.Object r0 = r10.A07
            android.view.View r0 = (android.view.View) r0
            r0.setVisibility(r5)
            java.lang.Object r6 = r11.A00
            X.Drf r6 = (X.C47164Drf) r6
            if (r6 == 0) goto L_0x00a4
            java.lang.Object r9 = r10.A06
            com.instagram.igds.components.headline.IgdsHeadline r9 = (com.instagram.igds.components.headline.IgdsHeadline) r9
            java.lang.Object r8 = r10.A02
            com.instagram.igds.components.bulletcell.IgdsBulletCell r8 = (com.instagram.igds.components.bulletcell.IgdsBulletCell) r8
            java.lang.Object r7 = r10.A04
            com.instagram.igds.components.bulletcell.IgdsBulletCell r7 = (com.instagram.igds.components.bulletcell.IgdsBulletCell) r7
            java.lang.Object r2 = r10.A03
            com.instagram.igds.components.bulletcell.IgdsBulletCell r2 = (com.instagram.igds.components.bulletcell.IgdsBulletCell) r2
            java.lang.Object r5 = r10.A05
            com.instagram.igds.components.textcell.IgdsFooterCell r5 = (com.instagram.igds.components.textcell.IgdsFooterCell) r5
            java.lang.Object r3 = r10.A01
            X.61u r3 = (X.C3021461u) r3
            java.lang.String r1 = r6.A03
            X.FOh r0 = X.C50092FOh.A00
            r9.setHeadline(r1, r0)
            java.lang.String r0 = r6.A0A
            r9.setBody((java.lang.CharSequence) r0)
            java.lang.String r1 = r6.A05
            java.lang.String r0 = r6.A04
            com.instagram.igds.components.bulletcell.IgdsBulletCell.A00(r8, r1, r0)
            java.lang.String r1 = r6.A07
            java.lang.String r0 = r6.A06
            com.instagram.igds.components.bulletcell.IgdsBulletCell.A00(r7, r1, r0)
            java.lang.String r1 = r6.A09
            java.lang.String r0 = r6.A08
            com.instagram.igds.components.bulletcell.IgdsBulletCell.A00(r2, r1, r0)
            java.lang.String r2 = r6.A02
            java.lang.String r1 = r6.A01
            android.net.Uri r0 = r6.A00
            android.text.SpannableStringBuilder r0 = X.AnonymousClass7AV.A00(r0, r2, r1)
            r5.A00(r0)
            android.text.method.MovementMethod r1 = android.text.method.LinkMovementMethod.getInstance()
            X.0qQ.A07(r1)
            com.instagram.common.accessibility.AccessibleTextView r0 = r5.A02
            r0.setMovementMethod(r1)
            r0 = 69
            X.FP5 r0 = X.FP5.A00(r4, r0)
            r3.setPrimaryActionOnClickListener(r0)
            r0 = 70
            X.FP5 r0 = X.FP5.A00(r4, r0)
            r3.setSecondaryActionOnClickListener(r0)
            goto L_0x00a4
        L_0x01ab:
            java.lang.Object r0 = r10.A07
            android.view.View r0 = (android.view.View) r0
            r0.setVisibility(r3)
            goto L_0x00a4
        L_0x01b4:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51628FxH.emit(java.lang.Object, X.4D7):java.lang.Object");
    }
}
