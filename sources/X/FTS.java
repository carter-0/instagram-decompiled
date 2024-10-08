package X;

public final class FTS implements AnonymousClass4DS {
    public final int A00;
    public final Object A01;

    public FTS(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0318, code lost:
        if (X.182.A06(X.0Tu.A05, r3, 36327005188274297L) != false) goto L_0x031a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x022d, code lost:
        if (r2.A0Y != false) goto L_0x022f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x02a8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void configureActionBar(X.2da r11) {
        /*
            r10 = this;
            int r0 = r10.A00
            switch(r0) {
                case 0: goto L_0x0333;
                case 1: goto L_0x0178;
                case 2: goto L_0x0037;
                case 3: goto L_0x0090;
                case 4: goto L_0x0079;
                default: goto L_0x0005;
            }
        L_0x0005:
            r0 = 0
            X.0qQ.A0B(r11, r0)
            java.lang.Object r3 = r10.A01
            androidx.fragment.app.Fragment r3 = (androidx.fragment.app.Fragment) r3
            android.content.res.Resources r1 = X.DbV.A05(r3)
            r0 = 2131953811(0x7f130893, float:1.9544104E38)
            java.lang.String r0 = r1.getString(r0)
            X.DbW.A1C(r11, r0)
            X.3JR r2 = X.DbS.A0K()
            android.content.res.Resources r1 = X.DbV.A05(r3)
            r0 = 2131953804(0x7f13088c, float:1.954409E38)
            java.lang.String r0 = r1.getString(r0)
            r2.A0K = r0
            r0 = 52
            X.FP9 r1 = new X.FP9
            r1.<init>((java.lang.Object) r3, (int) r0)
        L_0x0033:
            X.DbX.A19(r1, r2, r11)
            return
        L_0x0037:
            X.Dbb.A1I(r11)
            X.Dbc.A0k(r11)
            java.lang.Object r3 = r10.A01
            X.NKp r3 = (X.C68496NKp) r3
            java.util.List r0 = r3.A0E
            if (r0 == 0) goto L_0x0063
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0063
            X.3JR r2 = X.DbS.A0K()
            r0 = 2131238564(0x7f081ea4, float:1.809341E38)
            r2.A06 = r0
            r0 = 2131966734(0x7f133b0e, float:1.9570314E38)
            r2.A05 = r0
            r1 = 66
            X.Ojw r0 = new X.Ojw
            r0.<init>(r3, r1)
            X.DbX.A19(r0, r2, r11)
        L_0x0063:
            X.3JR r2 = X.DbS.A0K()
            r0 = 2131238210(0x7f081d42, float:1.8092692E38)
            r2.A06 = r0
            r0 = 2131960080(0x7f132110, float:1.9556819E38)
            r2.A05 = r0
            r0 = 67
            X.Ojw r1 = new X.Ojw
            r1.<init>(r3, r0)
            goto L_0x0033
        L_0x0079:
            r0 = 0
            X.0qQ.A0B(r11, r0)
            java.lang.Object r0 = r10.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            android.content.res.Resources r1 = X.DbV.A05(r0)
            r0 = 2131953797(0x7f130885, float:1.9544075E38)
            java.lang.String r0 = r1.getString(r0)
            X.DbW.A1C(r11, r0)
            return
        L_0x0090:
            r5 = r11
            X.2dZ r5 = (X.2dZ) r5
            android.widget.FrameLayout r4 = r5.A0S
            android.content.Context r6 = r4.getContext()
            boolean r0 = r6 instanceof android.app.Activity
            if (r0 == 0) goto L_0x00c3
            r0 = 2131100175(0x7f06020f, float:1.7812724E38)
            int r2 = r6.getColor(r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            X.F3V r1 = new X.F3V
            r1.<init>(r0)
            r1.A01(r2)
            java.lang.Object r0 = r10.A01
            X.W1R r0 = (X.W1R) r0
            android.graphics.drawable.Drawable r0 = r0.A0O
            r1.A08 = r0
            X.57Z r0 = r1.A00()
            r11.ErJ(r0)
            r0 = r6
            android.app.Activity r0 = (android.app.Activity) r0
            X.2db.A02(r0, r2)
        L_0x00c3:
            X.3JR r2 = X.DbS.A0K()
            java.lang.Object r3 = r10.A01
            X.W1R r3 = (X.W1R) r3
            android.graphics.drawable.Drawable r0 = r3.A0O
            r2.A0F = r0
            X.UZ2 r0 = r3.A0T
            int r0 = r0.A00()
            int r0 = r6.getColor(r0)
            r2.A02 = r0
            r0 = 2131976728(0x7f136218, float:1.9590585E38)
            r2.A05 = r0
            r1 = 38
            X.WB9 r0 = new X.WB9
            r0.<init>((java.lang.Object) r10, (int) r1)
            X.DbX.A1A(r0, r2, r11)
            X.2dZ r0 = r3.A0D
            if (r0 == 0) goto L_0x00f4
            android.widget.ImageView r0 = r0.A0Q()
            r3.A06 = r0
        L_0x00f4:
            X.ViP r6 = r3.A0E
            X.UXq r0 = r6.A00
            if (r0 == 0) goto L_0x0115
            java.lang.String r0 = r0.A04
            if (r0 == 0) goto L_0x0115
            X.3JR r2 = X.DbS.A0K()
            android.graphics.drawable.Drawable r0 = r3.A0Q
            r2.A0F = r0
            r0 = 2131976731(0x7f13621b, float:1.959059E38)
            r2.A05 = r0
            r1 = 39
            X.WB9 r0 = new X.WB9
            r0.<init>((java.lang.Object) r10, (int) r1)
            X.DbX.A19(r0, r2, r11)
        L_0x0115:
            X.UXq r0 = r6.A00
            if (r0 == 0) goto L_0x0142
            com.instagram.infocenter.model.ShareInfo r0 = r0.A01
            if (r0 == 0) goto L_0x0142
            boolean r0 = r0.A0D
            if (r0 == 0) goto L_0x0142
            X.3JR r2 = X.DbS.A0K()
            android.graphics.drawable.Drawable r0 = r3.A0R
            r2.A0F = r0
            r0 = 2131976732(0x7f13621c, float:1.9590593E38)
            r2.A05 = r0
            r1 = 40
            X.WB9 r0 = new X.WB9
            r0.<init>((java.lang.Object) r10, (int) r1)
            r2.A0G = r0
            X.3Jb r0 = new X.3Jb
            r0.<init>(r2)
            android.view.View r0 = r11.AA3(r0)
            r3.A08 = r0
        L_0x0142:
            X.UXq r0 = r6.A00
            if (r0 == 0) goto L_0x016b
            X.V3C r0 = r0.A00
            if (r0 == 0) goto L_0x016b
            X.3JR r2 = X.DbS.A0K()
            android.graphics.drawable.Drawable r0 = r3.A0P
            r2.A0F = r0
            r0 = 2131976730(0x7f13621a, float:1.9590589E38)
            r2.A05 = r0
            r1 = 41
            X.WB9 r0 = new X.WB9
            r0.<init>((java.lang.Object) r10, (int) r1)
            r2.A0G = r0
            X.3Jb r0 = new X.3Jb
            r0.<init>(r2)
            android.view.View r0 = r11.AA3(r0)
            r3.A07 = r0
        L_0x016b:
            android.graphics.drawable.ColorDrawable r0 = r3.A0M
            r4.setBackground(r0)
            android.view.View r0 = r5.A0L
            r3.A05 = r0
            X.W1R.A01(r3)
            return
        L_0x0178:
            java.lang.Object r6 = r10.A01
            X.E5H r6 = (X.E5H) r6
            X.2dZ r0 = r6.A03
            r3 = 1
            if (r0 == 0) goto L_0x019c
            com.instagram.common.session.UserSession r4 = r6.A04
            X.0Tu r2 = X.0Tu.A05
            r0 = 36324694496456960(0x810d1e00093100, double:3.0352212951392924E-306)
            boolean r0 = X.DbY.A1Y(r2, r4, r0)
            if (r0 == 0) goto L_0x019c
            X.2dZ r2 = r6.A03
            r1 = 60
            X.FPI r0 = new X.FPI
            r0.<init>((X.FTS) r10, (int) r1)
            r2.Eu5(r0, r3)
        L_0x019c:
            boolean r0 = r6.A0S
            r5 = 0
            if (r0 != 0) goto L_0x01ab
            boolean r0 = X.E5H.A0D(r6)
            if (r0 == 0) goto L_0x01ab
            r11.Etr(r5)
            return
        L_0x01ab:
            r11.Etr(r3)
            r1 = 4
            r0 = r11
            X.2dZ r0 = (X.2dZ) r0
            android.view.ViewGroup r0 = r0.A0O
            r0.setImportantForAccessibility(r1)
            r11.Eu4(r3)
            java.lang.Integer r2 = X.AnonymousClass05K.A00
            r4 = 0
            r1 = 58
            X.FPI r0 = new X.FPI
            r0.<init>((X.FTS) r10, (int) r1)
            r0 = 15
            X.0qQ.A0B(r2, r0)
            X.DbZ.A1Y(r6)
            boolean r1 = r6.A0Q
            r0 = 2131628702(0x7f0e129e, float:1.8884704E38)
            if (r1 == 0) goto L_0x01d6
            r0 = 2131628697(0x7f0e1299, float:1.8884694E38)
        L_0x01d6:
            android.view.View r9 = r11.ETg(r0, r5, r5, r3)
            r0 = 2131427559(0x7f0b00e7, float:1.8476738E38)
            android.widget.TextView r7 = X.DbU.A0G(r9, r0)
            r0 = 2131427549(0x7f0b00dd, float:1.8476717E38)
            android.widget.TextView r0 = X.AnonymousClass7TE.A0d(r9, r0)
            boolean r1 = X.E5H.A0D(r6)
            if (r1 != 0) goto L_0x0215
            r1 = 2131436784(0x7f0b24f0, float:1.8495448E38)
            android.view.View r2 = r9.requireViewById(r1)
            com.instagram.common.ui.base.IgEditText r2 = (com.instagram.common.ui.base.IgEditText) r2
            r6.A05 = r2
            android.text.TextWatcher r1 = r6.A01
            r2.addTextChangedListener(r1)
            r1 = 2131436783(0x7f0b24ef, float:1.8495446E38)
            android.view.View r8 = r9.findViewById(r1)
            com.instagram.common.ui.widget.imageview.IgImageView r8 = (com.instagram.common.ui.widget.imageview.IgImageView) r8
            r6.A07 = r8
            if (r8 == 0) goto L_0x0215
            r2 = 59
            X.FPI r1 = new X.FPI
            r1.<init>((X.FTS) r10, (int) r2)
            X.AnonymousClass0fU.A00(r1, r8)
        L_0x0215:
            r1 = 2131432131(0x7f0b12c3, float:1.848601E38)
            com.instagram.common.ui.base.IgTextView r9 = X.DbT.A0a(r9, r1)
            r6.A06 = r9
            X.EEP r2 = r6.A0A
            boolean r1 = r2.A0w
            if (r1 == 0) goto L_0x022f
            X.G9Y r1 = r2.A0m
            boolean r1 = r1 instanceof X.E5H
            if (r1 == 0) goto L_0x022f
            boolean r2 = r2.A0Y
            r1 = 1
            if (r2 == 0) goto L_0x0230
        L_0x022f:
            r1 = 0
        L_0x0230:
            r8 = 8
            if (r1 == 0) goto L_0x032e
            boolean r1 = r6.A0P
            if (r1 != 0) goto L_0x032e
            if (r9 == 0) goto L_0x024c
            r9.setVisibility(r5)
            X.EEP r1 = r6.A0A
            boolean r2 = r1.A0U
            r1 = 2131960133(0x7f132145, float:1.9556926E38)
            if (r2 == 0) goto L_0x0249
            r1 = 2131960134(0x7f132146, float:1.9556928E38)
        L_0x0249:
            r9.setText(r1)
        L_0x024c:
            boolean r1 = r6.A0Q
            if (r1 == 0) goto L_0x02c5
            int r1 = r6.A00
            if (r1 <= 0) goto L_0x0276
            if (r0 == 0) goto L_0x0276
            r0.setVisibility(r5)
            android.content.Context r7 = r6.getContext()
            r7.getClass()
            r3 = 2131959594(0x7f131f2a, float:1.9555833E38)
            int r1 = r6.A00
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            r1 = 75
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r1 = X.DbV.A0u(r7, r2, r1, r3)
        L_0x0273:
            r0.setText(r1)
        L_0x0276:
            r6.A0L = r4
            X.EEP r1 = r6.A0A
            boolean r0 = r1.A0w
            if (r0 == 0) goto L_0x02b6
            X.G9Y r0 = r1.A0m
            boolean r0 = r0 instanceof X.E5H
            if (r0 == 0) goto L_0x02b6
            boolean r0 = r1.A0Y
            if (r0 != 0) goto L_0x02b6
            boolean r0 = r6.A0P
            if (r0 != 0) goto L_0x02b6
            X.3JR r1 = X.DbS.A0K()
            r0 = 2131628700(0x7f0e129c, float:1.88847E38)
            r1.A0A = r0
            r1.A0O = r5
            r0 = 16
            r1.A09 = r0
            X.3Jb r0 = new X.3Jb
            r0.<init>(r1)
            android.view.View r1 = r11.AA5(r0)
            boolean r0 = r1 instanceof androidx.appcompat.widget.SwitchCompat
            if (r0 == 0) goto L_0x02b6
            android.widget.CompoundButton r1 = (android.widget.CompoundButton) r1
            r0 = 10
            X.FQO.A00(r1, r6, r0)
            X.EEP r0 = r6.A0A
            boolean r0 = r0.A0U
            r1.setChecked(r0)
        L_0x02b6:
            android.os.Handler r3 = X.AnonymousClass7TF.A0D()
            X.Fsm r2 = new X.Fsm
            r2.<init>(r10, r11)
            r0 = 500(0x1f4, double:2.47E-321)
            r3.postDelayed(r2, r0)
            return
        L_0x02c5:
            boolean r0 = r6.A0O
            if (r0 == 0) goto L_0x02d6
            boolean r0 = X.E5H.A0D(r6)
            if (r0 == 0) goto L_0x02d6
        L_0x02cf:
            r0 = 2131959844(0x7f132024, float:1.955634E38)
        L_0x02d2:
            r7.setText(r0)
            goto L_0x0276
        L_0x02d6:
            X.EEP r0 = r6.A0A
            int r0 = X.EEP.A00(r0)
            if (r0 <= r3) goto L_0x031a
            X.DbZ.A1Y(r6)
            boolean r0 = r6.A0O
            if (r0 != 0) goto L_0x02e9
            boolean r0 = r6.A0Q
            if (r0 == 0) goto L_0x031a
        L_0x02e9:
            boolean r0 = X.E5H.A0D(r6)
            if (r0 != 0) goto L_0x02cf
            X.2Ep r0 = r6.A0B
            if (r0 == 0) goto L_0x0304
            boolean r0 = r0.CY7()
            if (r0 == 0) goto L_0x0304
            X.2Ep r0 = r6.A0B
            java.lang.String r0 = r0.C6f()
            r7.setText(r0)
            goto L_0x0276
        L_0x0304:
            X.2Ep r0 = r6.A0B
            if (r0 == 0) goto L_0x031e
            com.instagram.common.session.UserSession r3 = r6.A04
            r3.getClass()
            X.0Tu r2 = X.0Tu.A05
            r0 = 36327005188274297(0x810f3800003879, double:3.0366825859489854E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x031e
        L_0x031a:
            r0 = 2131959846(0x7f132026, float:1.9556344E38)
            goto L_0x02d2
        L_0x031e:
            r7.setVisibility(r8)
            com.instagram.common.ui.base.IgEditText r0 = r6.A05
            if (r0 == 0) goto L_0x0276
            r0.setVisibility(r5)
            com.instagram.common.ui.base.IgEditText r0 = r6.A05
            java.lang.String r1 = r6.A0L
            goto L_0x0273
        L_0x032e:
            r9.setVisibility(r8)
            goto L_0x024c
        L_0x0333:
            r0 = 0
            X.0qQ.A0B(r11, r0)
            java.lang.Object r3 = r10.A01
            X.E3r r3 = (X.C47468E3r) r3
            r0 = 2131956217(0x7f1311f9, float:1.9548983E38)
            r11.Eom(r0)
            X.3JR r2 = X.DbS.A0K()
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            r2.A02(r0)
            r1 = 29
            X.FP6 r0 = new X.FP6
            r0.<init>((java.lang.Object) r3, (int) r1)
            X.DbX.A19(r0, r2, r11)
            java.lang.String r1 = r3.A07
            if (r1 != 0) goto L_0x0362
            java.lang.String r0 = "editorSurface"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0362:
            java.lang.String r0 = "ig_edit_profile"
            boolean r1 = r1.equals(r0)
            r0 = 2131239025(0x7f082071, float:1.8094345E38)
            if (r1 == 0) goto L_0x0370
            r0 = 2131237915(0x7f081c1b, float:1.8092094E38)
        L_0x0370:
            X.3JR r2 = X.DbS.A0K()
            r2.A01 = r0
            r1 = 30
            X.FP6 r0 = new X.FP6
            r0.<init>((java.lang.Object) r3, (int) r1)
            X.DbX.A1A(r0, r2, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FTS.configureActionBar(X.2da):void");
    }
}
