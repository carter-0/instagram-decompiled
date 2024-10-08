package X;

/* renamed from: X.MBl  reason: case insensitive filesystem */
public final class C66103MBl implements C61910qF, 02o {
    public final int A00;
    public final Object A01;

    public C66103MBl(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0063, code lost:
        if (r5 > r8.length()) goto L_0x0065;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object emit(java.lang.Object r58, X.AnonymousClass4D7 r59) {
        /*
            r57 = this;
            r1 = r57
            r3 = r58
            int r0 = r1.A00
            switch(r0) {
                case 0: goto L_0x03d8;
                case 1: goto L_0x03cd;
                case 2: goto L_0x03c2;
                case 3: goto L_0x03b7;
                case 4: goto L_0x01b8;
                case 5: goto L_0x03e7;
                case 6: goto L_0x0178;
                case 7: goto L_0x00f6;
                case 8: goto L_0x00e3;
                default: goto L_0x0009;
            }
        L_0x0009:
            X.JvW r3 = (X.C61032JvW) r3
            java.lang.Object r7 = r1.A01
            X.K74 r7 = (X.K74) r7
            X.0eM r0 = r7.A02
            java.lang.Object r1 = r0.getValue()
            X.Dew r1 = (X.C46434Dew) r1
            java.lang.String r0 = r3.A04
            r1.A00 = r0
            java.util.List r6 = r7.A00
            r6.clear()
            java.lang.Object r0 = r3.A03
            java.util.List r0 = (java.util.List) r0
            java.util.List r0 = X.K74.A00(r0)
            r6.addAll(r0)
            boolean r2 = r3.A08
            if (r2 != 0) goto L_0x0033
            boolean r0 = r3.A0A
            if (r0 == 0) goto L_0x009d
        L_0x0033:
            boolean r0 = r3.A07
            if (r0 != 0) goto L_0x00cd
            boolean r0 = r3.A09
            if (r0 != 0) goto L_0x00cd
            android.content.Context r1 = r7.requireContext()
            r0 = 2131974377(0x7f1358e9, float:1.9585816E38)
            java.lang.String r8 = X.AnonymousClass7TE.A16(r1, r0)
            android.content.Context r1 = r7.requireContext()
            r0 = 2131974281(0x7f135889, float:1.9585622E38)
            java.lang.String r1 = X.AnonymousClass7TE.A16(r1, r0)
            r0 = 0
            int r5 = X.00l.A08(r8, r1, r0, r0)
            int r4 = r1.length()
            int r4 = r4 + r5
            r2 = 1
            if (r5 < 0) goto L_0x0065
            int r0 = r8.length()
            r1 = 1
            if (r5 <= r0) goto L_0x0066
        L_0x0065:
            r1 = 0
        L_0x0066:
            if (r4 < 0) goto L_0x00cb
            int r0 = r8.length()
            if (r4 > r0) goto L_0x00cb
        L_0x006e:
            if (r1 == 0) goto L_0x009d
            if (r2 == 0) goto L_0x009d
            android.text.SpannableStringBuilder r2 = X.DbS.A0C(r8)
            r0 = 3
            X.JdN r1 = new X.JdN
            r1.<init>(r7, r0)
            r0 = 33
            r2.setSpan(r1, r5, r4, r0)
            X.FGF r4 = new X.FGF
            r4.<init>((android.text.SpannableStringBuilder) r2)
        L_0x0086:
            android.content.Context r1 = r7.requireContext()
            r0 = 2131238268(0x7f081d7c, float:1.809281E38)
            android.graphics.drawable.Drawable r2 = r1.getDrawable(r0)
            android.content.Context r1 = r7.requireContext()
            X.JyD r0 = new X.JyD
            r0.<init>(r1, r2, r4)
            r6.add(r0)
        L_0x009d:
            boolean r0 = r3.A09
            if (r0 == 0) goto L_0x00ac
            java.lang.Object r0 = r3.A02
            java.util.List r0 = (java.util.List) r0
            java.util.List r0 = X.K74.A00(r0)
            r6.addAll(r0)
        L_0x00ac:
            boolean r0 = r3.A07
            if (r0 == 0) goto L_0x00bb
            java.lang.Object r0 = r3.A01
            java.util.List r0 = (java.util.List) r0
            java.util.List r0 = X.K74.A00(r0)
            r6.addAll(r0)
        L_0x00bb:
            X.0eM r0 = r7.A01
            java.lang.Object r0 = r0.getValue()
            X.2t9 r0 = (X.AnonymousClass2t9) r0
            if (r0 == 0) goto L_0x00c8
            r0.A08(r6)
        L_0x00c8:
            X.0gF r1 = X.C60340gF.A00
            return r1
        L_0x00cb:
            r2 = 0
            goto L_0x006e
        L_0x00cd:
            r1 = 2131956368(0x7f131290, float:1.954929E38)
            if (r2 == 0) goto L_0x00d5
            r1 = 2131974391(0x7f1358f7, float:1.9585845E38)
        L_0x00d5:
            android.content.Context r0 = r7.requireContext()
            java.lang.String r0 = r0.getString(r1)
            X.FGF r4 = new X.FGF
            r4.<init>((java.lang.CharSequence) r0)
            goto L_0x0086
        L_0x00e3:
            java.lang.Object r0 = r1.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            if (r58 == 0) goto L_0x063a
            android.content.Context r2 = r0.requireContext()
            java.lang.String r1 = "story_comments_failure_toast"
            r0 = 2131974397(0x7f1358fd, float:1.9585857E38)
            X.C59689JTv.A0F(r2, r1, r0)
            goto L_0x00c8
        L_0x00f6:
            X.MRA r3 = (X.MRA) r3
            java.lang.Object r1 = r1.A01
            X.VtD r1 = (X.C18514VtD) r1
            boolean r0 = r3 instanceof X.C65696LyB
            if (r0 == 0) goto L_0x010a
            com.instagram.common.ui.base.IgEditText r1 = r1.A07
            r1.requestFocus()
            r0 = 1
            X.0nA.A0v(r1, r0)
            goto L_0x00c8
        L_0x010a:
            boolean r0 = r3 instanceof X.C65695LyA
            if (r0 == 0) goto L_0x0114
            com.instagram.common.ui.base.IgEditText r0 = r1.A07
            X.0nA.A0N(r0)
            goto L_0x00c8
        L_0x0114:
            boolean r0 = r3 instanceof X.C61255Jzn
            if (r0 == 0) goto L_0x0134
            X.Jzn r3 = (X.C61255Jzn) r3
            X.N3L r8 = r3.A00
            com.instagram.common.session.UserSession r5 = r1.A06
            android.content.Context r2 = r1.A01
            X.0qQ.A06(r2)
            android.view.View r3 = r1.A03
            X.LeE r4 = new X.LeE
            r4.<init>()
            X.LqJ r6 = new X.LqJ
            r6.<init>(r1)
            r7 = 0
            X.OPM.A01(r2, r3, r4, r5, r6, r7, r8)
            goto L_0x00c8
        L_0x0134:
            r4 = 1
            boolean r0 = r3 instanceof X.C61256Jzo
            if (r0 == 0) goto L_0x063f
            X.Jzo r3 = (X.C61256Jzo) r3
            int r2 = r3.A00
            if (r2 != r4) goto L_0x0167
            java.lang.Object r4 = r3.A02
            X.JwL r4 = (X.C61083JwL) r4
            java.lang.Object r5 = r3.A01
            X.0wc r5 = (X.0wc) r5
            X.WgT r7 = new X.WgT
            r7.<init>(r5, r1)
        L_0x014c:
            com.instagram.common.ui.base.IgTextView r0 = r1.A08
            android.content.Context r2 = r0.getContext()
            boolean r0 = r2 instanceof android.app.Activity
            if (r0 == 0) goto L_0x00c8
            android.app.Activity r2 = (android.app.Activity) r2
            if (r2 == 0) goto L_0x00c8
            X.07Z r0 = r1.A05
            X.07V r3 = r0.getLifecycle()
            com.instagram.common.session.UserSession r6 = r1.A06
            X.C335747dT.A01(r2, r3, r4, r5, r6, r7)
            goto L_0x00c8
        L_0x0167:
            r0 = 0
            if (r2 != r0) goto L_0x063f
            java.lang.Object r4 = r3.A02
            X.JwL r4 = (X.C61083JwL) r4
            java.lang.Object r5 = r3.A01
            X.0wc r5 = (X.0wc) r5
            X.WgS r7 = new X.WgS
            r7.<init>(r1)
            goto L_0x014c
        L_0x0178:
            X.Tnz r3 = (X.C13997Tnz) r3
            java.lang.Object r4 = r1.A01
            X.LMs r4 = (X.C64098LMs) r4
            boolean r0 = r3.A03
            if (r0 == 0) goto L_0x01b3
            X.6lK r1 = r4.A02
            X.0eM r0 = r1.A07
            java.lang.Object r3 = r0.getValue()
            com.instagram.common.ui.base.IgSimpleImageView r3 = (com.instagram.common.ui.base.IgSimpleImageView) r3
            X.0eM r0 = r1.A06
            java.lang.Object r2 = r0.getValue()
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            X.0eM r1 = r4.A03
            java.lang.Object r0 = r1.getValue()
            X.61R r0 = (X.AnonymousClass61R) r0
            boolean r0 = r0.isPlaying()
            if (r0 != 0) goto L_0x00c8
            if (r3 == 0) goto L_0x00c8
            if (r2 == 0) goto L_0x00c8
            java.lang.Object r1 = r1.getValue()
            X.61R r1 = (X.AnonymousClass61R) r1
            android.widget.ImageView r0 = r4.A00
            X.C70899OQr.A01(r0, r2, r1, r3)
            goto L_0x00c8
        L_0x01b3:
            X.C64098LMs.A00(r4)
            goto L_0x00c8
        L_0x01b8:
            X.6n9 r3 = (X.C317366n9) r3
            java.lang.Object r4 = r1.A01
            X.6iR r4 = (X.C314546iR) r4
            boolean r0 = r3.A0P
            r5 = 0
            if (r0 == 0) goto L_0x025a
            X.0eM r0 = r4.A0A
            android.view.View r2 = X.AnonymousClass7TE.A0c(r0)
            r1 = 8
            int r0 = r2.getVisibility()
            if (r0 == r1) goto L_0x01d4
            r2.setVisibility(r1)
        L_0x01d4:
            X.6iS r0 = X.C314546iR.A00(r4)
            boolean r0 = r0.A03
            if (r0 != 0) goto L_0x02d8
            android.app.Activity r7 = r4.A00
            r6 = 1
            X.MMg r5 = new X.MMg
            r5.<init>(r4, r6)
            r0 = 2131238447(0x7f081e2f, float:1.8093173E38)
            android.graphics.drawable.Drawable r8 = r7.getDrawable(r0)
            if (r8 == 0) goto L_0x0230
            X.F3t r2 = new X.F3t
            r2.<init>(r7)
            android.content.res.Resources r1 = r7.getResources()
            r0 = 2131974378(0x7f1358ea, float:1.9585818E38)
            java.lang.String r0 = X.AnonymousClass7TF.A0d(r1, r0)
            r2.A06 = r0
            android.content.res.Resources r1 = r7.getResources()
            r0 = 2131974379(0x7f1358eb, float:1.958582E38)
            java.lang.String r0 = X.AnonymousClass7TF.A0d(r1, r0)
            r2.A04 = r0
            r2.A03(r8)
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            r2.A05 = r0
            r0 = 2131968772(0x7f134304, float:1.9574448E38)
            java.lang.String r1 = X.AnonymousClass7TE.A16(r7, r0)
            r0 = 0
            r2.A02(r0, r1)
            r1 = 14
            X.LV8 r0 = new X.LV8
            r0.<init>(r5, r1)
            r2.A01 = r0
            boolean r0 = r7.isFinishing()
            if (r0 != 0) goto L_0x0230
            r2.A01()     // Catch:{ BadTokenException -> 0x0230 }
        L_0x0230:
            X.6iS r2 = X.C314546iR.A00(r4)
            X.LwF r0 = X.C65581LwF.A00
            X.C314556iS.A01(r0, r2)
            r2.A03 = r6
            X.1Av r0 = r2.A05
            X.0xY r1 = X.AnonymousClass7TE.A0p(r0)
            r0 = 2439(0x987, float:3.418E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            r1.E5T(r0, r6)
            r1.apply()
            X.0eM r0 = r2.A0A
            java.lang.Object r0 = r0.getValue()
            X.6Ym r0 = (X.C309496Ym) r0
            r0.A00()
            goto L_0x02dd
        L_0x025a:
            boolean r0 = r3.A0O
            if (r0 == 0) goto L_0x02bb
            X.6iS r0 = X.C314546iR.A00(r4)
            r0.A08()
            X.3oV r0 = r4.A03
            r0.setVisibility(r5)
            X.0eM r0 = r4.A0A
            android.view.View r1 = X.AnonymousClass7TE.A0c(r0)
            int r0 = r1.getVisibility()
            if (r0 == r5) goto L_0x0279
            r1.setVisibility(r5)
        L_0x0279:
            X.0eM r2 = r4.A0D
            android.view.View r0 = X.AnonymousClass7TE.A0c(r2)
            android.content.Context r0 = r0.getContext()
            int r1 = X.AnonymousClass7TG.A04(r0)
            android.view.View r0 = X.AnonymousClass7TE.A0c(r2)
            X.0nA.A0k(r0, r5, r1, r5, r5)
            X.0eM r0 = r4.A06
            android.view.View r0 = X.AnonymousClass7TE.A0c(r0)
            X.0nA.A0T(r0, r1)
            X.0eM r0 = r4.A08
            X.DbW.A1R(r0, r5)
            X.0eM r0 = r4.A09
            X.DbW.A1R(r0, r5)
            X.6iS r1 = X.C314546iR.A00(r4)
            X.LwE r0 = X.C65580LwE.A00
            X.C314556iS.A01(r0, r1)
            X.LwF r0 = X.C65581LwF.A00
            X.C314556iS.A01(r0, r1)
            X.0eM r0 = r1.A0A
            java.lang.Object r0 = r0.getValue()
            X.6Ym r0 = (X.C309496Ym) r0
            r0.A00()
            goto L_0x02dd
        L_0x02bb:
            boolean r0 = r3.A0N
            if (r0 == 0) goto L_0x02dd
            X.0eM r0 = r4.A0A
            android.view.View r2 = X.AnonymousClass7TE.A0c(r0)
            r1 = 8
            int r0 = r2.getVisibility()
            if (r0 == r1) goto L_0x02d0
            r2.setVisibility(r1)
        L_0x02d0:
            X.6iS r0 = X.C314546iR.A00(r4)
            r0.A05()
            goto L_0x02dd
        L_0x02d8:
            X.3oV r0 = r4.A03
            r0.setVisibility(r5)
        L_0x02dd:
            X.3oV r0 = r4.A03
            boolean r0 = r0.CVM()
            if (r0 == 0) goto L_0x00c8
            com.instagram.common.typedurl.ImageUrl r2 = r3.A05
            if (r2 == 0) goto L_0x02f6
            X.0eM r0 = r4.A06
            java.lang.Object r1 = r0.getValue()
            com.instagram.common.ui.widget.imageview.IgImageView r1 = (com.instagram.common.ui.widget.imageview.IgImageView) r1
            X.0iw r0 = r4.A01
            r1.setUrl(r2, r0)
        L_0x02f6:
            X.0eM r2 = r4.A0D
            java.lang.Object r0 = r2.getValue()
            android.widget.EditText r0 = (android.widget.EditText) r0
            java.lang.String r0 = X.AnonymousClass7TF.A0f(r0)
            java.lang.CharSequence r1 = r3.A08
            boolean r0 = X.Dba.A1X(r1, r0)
            if (r0 != 0) goto L_0x0311
            android.widget.TextView r0 = X.JTO.A0I(r2)
            r0.setText(r1)
        L_0x0311:
            X.0eM r0 = r4.A07
            android.widget.TextView r6 = X.JTO.A0I(r0)
            android.content.Context r5 = r6.getContext()
            r2 = 2131974385(0x7f1358f1, float:1.9585833E38)
            int r0 = r3.A00
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            int r0 = r3.A01
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            X.JTR.A18(r5, r6, r1, r0, r2)
            boolean r0 = r3.A0J
            X.C314546iR.A01(r6, r0)
            X.0eM r0 = r4.A0G
            android.view.View r1 = X.AnonymousClass7TE.A0c(r0)
            boolean r0 = r3.A0C
            X.C314546iR.A01(r1, r0)
            java.util.List r6 = r3.A0B
            java.util.List r5 = r4.A05
            java.util.Iterator r2 = r5.iterator()
        L_0x0345:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x035b
            android.view.View r1 = X.JTO.A0H(r2)
            X.0eM r0 = r4.A0H
            java.lang.Object r0 = r0.getValue()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r0.removeView(r1)
            goto L_0x0345
        L_0x035b:
            r5.clear()
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()
            X.0jq r2 = X.00k.A0o(r6)
            r1 = 40
            X.9LT r0 = new X.9LT
            r0.<init>(r4, r1)
            X.3Sz r0 = X.C242173Sx.A0E(r0, r2)
            X.3T4 r2 = new X.3T4
            r2.<init>(r0)
        L_0x0376:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0398
            java.lang.Object r1 = r2.next()
            android.view.View r1 = (android.view.View) r1
            r5.add(r1)
            X.0eM r0 = r4.A0H
            java.lang.Object r0 = r0.getValue()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r0.addView(r1)
            int r0 = r1.getId()
            X.AnonymousClass7TF.A1M(r3, r0)
            goto L_0x0376
        L_0x0398:
            X.0eM r2 = r4.A0E
            java.lang.Object r1 = X.AnonymousClass7TE.A14(r2)
            X.3oT r1 = (X.C252043oT) r1
            int[] r0 = X.00k.A0x(r3)
            r1.setReferencedIds(r0)
            android.view.View r0 = X.AnonymousClass7TH.A06(r2)
            r0.requestLayout()
            X.6iS r0 = X.C314546iR.A00(r4)
            r0.A08()
            goto L_0x00c8
        L_0x03b7:
            X.8I4 r3 = (X.AnonymousClass8I4) r3
            java.lang.Object r0 = r1.A01
            X.8Hw r0 = (X.C353498Hw) r0
            X.C353498Hw.A0w(r0, r3)
            goto L_0x00c8
        L_0x03c2:
            X.MQK r3 = (X.MQK) r3
            java.lang.Object r0 = r1.A01
            X.K4N r0 = (X.K4N) r0
            X.K4N.A00(r0, r3)
            goto L_0x00c8
        L_0x03cd:
            java.lang.Object r0 = r1.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            if (r58 == 0) goto L_0x0644
            X.DbZ.A15(r0)
            goto L_0x00c8
        L_0x03d8:
            java.lang.Object r0 = r1.A01
            X.3jv r0 = (X.C249523jv) r0
            r1 = r59
            java.lang.Object r1 = r0.ELH(r3, r1)
            X.1Hj r0 = X.1Hj.A02
            if (r1 != r0) goto L_0x00c8
            return r1
        L_0x03e7:
            X.MQt r3 = (X.C66413MQt) r3
            java.lang.Object r2 = r1.A01
            X.6iR r2 = (X.C314546iR) r2
            boolean r0 = r3 instanceof X.C65580LwE
            if (r0 == 0) goto L_0x0428
            X.0eM r6 = r2.A0D
            android.widget.TextView r5 = X.JTO.A0I(r6)
            X.0eM r0 = r2.A0B
            java.lang.Object r4 = X.AnonymousClass7TE.A14(r0)
            android.content.Context r4 = (android.content.Context) r4
            r3 = 2131974374(0x7f1358e6, float:1.958581E38)
            r1 = 1
            X.6n9 r0 = A00(r2)
            java.lang.String r0 = r0.A09
            java.lang.String r0 = X.DbW.A0h(r4, r0, r3)
            r5.setHint(r0)
            android.view.View r0 = X.AnonymousClass7TE.A0c(r6)
            r0.requestFocus()
            android.widget.TextView r0 = X.JTO.A0I(r6)
            r0.setSingleLine()
            android.view.View r0 = X.AnonymousClass7TE.A0c(r6)
            X.0nA.A0v(r0, r1)
        L_0x0425:
            X.0gF r1 = X.C60340gF.A00
            return r1
        L_0x0428:
            boolean r0 = r3 instanceof X.C65581LwF
            if (r0 == 0) goto L_0x0434
            instagram.features.stories.fragment.ReelViewerFragment r1 = r2.A04
            java.lang.String r0 = "comment"
            r1.EHY(r0)
            goto L_0x0425
        L_0x0434:
            boolean r0 = r3 instanceof X.C65582LwG
            if (r0 == 0) goto L_0x043e
            instagram.features.stories.fragment.ReelViewerFragment r0 = r2.A04
            r0.EHd()
            goto L_0x0425
        L_0x043e:
            boolean r0 = r3 instanceof X.C65576LwA
            if (r0 == 0) goto L_0x0453
            X.3oV r1 = r2.A03
            r0 = 8
            r1.setVisibility(r0)
            X.0eM r0 = r2.A0D
            android.view.View r0 = X.AnonymousClass7TE.A0c(r0)
            X.0nA.A0N(r0)
            goto L_0x0425
        L_0x0453:
            boolean r0 = r3 instanceof X.C65579LwD
            if (r0 == 0) goto L_0x0467
            X.0eM r0 = r2.A0B
            java.lang.Object r2 = X.AnonymousClass7TE.A14(r0)
            android.content.Context r2 = (android.content.Context) r2
            r1 = 0
            r0 = 2131974384(0x7f1358f0, float:1.958583E38)
        L_0x0463:
            X.C59689JTv.A0F(r2, r1, r0)
            goto L_0x0425
        L_0x0467:
            boolean r0 = r3 instanceof X.C65578LwC
            if (r0 == 0) goto L_0x0479
            X.0eM r0 = r2.A0B
            java.lang.Object r2 = X.AnonymousClass7TE.A14(r0)
            android.content.Context r2 = (android.content.Context) r2
            java.lang.String r1 = "story_comments_failure_toast"
            r0 = 2131974375(0x7f1358e7, float:1.9585812E38)
            goto L_0x0463
        L_0x0479:
            boolean r0 = r3 instanceof X.C65577LwB
            if (r0 == 0) goto L_0x048b
            X.0eM r0 = r2.A0B
            java.lang.Object r2 = X.AnonymousClass7TE.A14(r0)
            android.content.Context r2 = (android.content.Context) r2
            java.lang.String r1 = "story_comments_failure_toast"
            r0 = 2131974376(0x7f1358e8, float:1.9585814E38)
            goto L_0x0463
        L_0x048b:
            boolean r0 = r3 instanceof X.Lw9
            if (r0 == 0) goto L_0x0578
            X.Lw9 r3 = (X.Lw9) r3
            java.lang.String r5 = r3.A00
            boolean r1 = r3.A01
            X.0iw r0 = r2.A01
            java.lang.String r19 = r0.getModuleName()
            X.6n9 r0 = A00(r2)
            boolean r6 = r0.A0F
            X.6n9 r0 = A00(r2)
            boolean r4 = r0.A0E
            r43 = r1 ^ 1
            r34 = 1
            r32 = 0
            X.6n9 r0 = A00(r2)
            java.util.List r0 = r0.A0B
            int r30 = r0.size()
            X.6n9 r0 = A00(r2)
            boolean r3 = r0.A0D
            r10 = 0
            X.6iS r8 = X.C314546iR.A00(r2)
            X.6nl r0 = r8.A07
            com.instagram.common.session.UserSession r9 = r0.A00
            X.0Tu r7 = X.0Tu.A05
            r0 = 36318247752112180(0x81074100211834, double:3.0311443480566977E-306)
            boolean r0 = X.182.A06(r7, r9, r0)
            if (r0 == 0) goto L_0x0573
            X.05G r0 = r8.A0D
            java.lang.Object r0 = r0.getValue()
            X.6n9 r0 = (X.C317366n9) r0
            java.util.List r0 = r0.A0B
            int r8 = r0.size()
            r0 = 3
            if (r8 <= r0) goto L_0x0562
            r0 = 1063675494(0x3f666666, float:0.9)
        L_0x04e7:
            java.lang.Float r11 = java.lang.Float.valueOf(r0)
            X.GmL r9 = new X.GmL
            r12 = r10
            r13 = r10
            r14 = r10
            r15 = r10
            r16 = r10
            r18 = r10
            r20 = r10
            r21 = r10
            r22 = r10
            r23 = r10
            r24 = r10
            r25 = r10
            r26 = r10
            r27 = r10
            r28 = r10
            r29 = r10
            r31 = r6
            r33 = r32
            r35 = r32
            r36 = r32
            r37 = r32
            r38 = r32
            r39 = r32
            r40 = r32
            r41 = r34
            r42 = r4
            r44 = r34
            r45 = r34
            r46 = r32
            r47 = r32
            r48 = r3
            r49 = r34
            r50 = r32
            r51 = r32
            r52 = r32
            r53 = r32
            r54 = r32
            r55 = r32
            r56 = r32
            r17 = r5
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56)
            X.1Y4 r0 = X.C3018960m.A00()
            X.Hs6 r3 = r0.A00()
            com.instagram.common.session.UserSession r7 = r2.A02
            android.app.Activity r4 = r2.A00
            r0 = 17
            X.Lyz r8 = new X.Lyz
            r8.<init>(r2, r0)
            r1 = 46
            X.9LV r0 = new X.9LV
            r0.<init>(r2, r1)
            r5 = r10
            r6 = r9
            r10 = r32
            r11 = r10
            r12 = r10
            r9 = r0
            r3.A00(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            goto L_0x0425
        L_0x0562:
            if (r8 != 0) goto L_0x0568
            r0 = 1058893988(0x3f1d70a4, float:0.615)
            goto L_0x04e7
        L_0x0568:
            r7 = 1057384038(0x3f066666, float:0.525)
            r1 = 1035489772(0x3db851ec, float:0.09)
            float r0 = (float) r8
            float r0 = r0 * r1
            float r0 = r0 + r7
            goto L_0x04e7
        L_0x0573:
            r0 = 1060571709(0x3f370a3d, float:0.715)
            goto L_0x04e7
        L_0x0578:
            boolean r0 = r3 instanceof X.Lw7
            if (r0 == 0) goto L_0x05f3
            r0 = 48
            X.MJ1 r5 = new X.MJ1
            r5.<init>(r3, r0)
            X.6iS r1 = X.C314546iR.A00(r2)
            X.LwA r0 = X.C65576LwA.A00
            X.C314556iS.A01(r0, r1)
            X.LwF r0 = X.C65581LwF.A00
            X.C314556iS.A01(r0, r1)
            X.0eM r0 = r1.A0A
            java.lang.Object r0 = r0.getValue()
            X.6Ym r0 = (X.C309496Ym) r0
            r0.A00()
            X.0eM r0 = r2.A0B
            java.lang.Object r1 = X.AnonymousClass7TE.A14(r0)
            android.content.Context r1 = (android.content.Context) r1
            r0 = 49
            X.MJ1 r4 = new X.MJ1
            r4.<init>(r2, r0)
            r0 = 0
            X.MMg r3 = new X.MMg
            r3.<init>(r5, r0)
            X.0qQ.A0B(r1, r0)
            X.8ab r2 = X.DbS.A0Y(r1)
            r0 = 2131239389(0x7f0821dd, float:1.8095084E38)
            android.graphics.drawable.Drawable r0 = r1.getDrawable(r0)
            r2.A0j(r0)
            r0 = 2131968761(0x7f1342f9, float:1.9574426E38)
            r2.A09(r0)
            r0 = 2131974381(0x7f1358ed, float:1.9585824E38)
            r2.A08(r0)
            r0 = 2131974380(0x7f1358ec, float:1.9585822E38)
            java.lang.String r1 = X.AnonymousClass7TE.A16(r1, r0)
            r0 = 34
            X.LV2 r0 = X.LV2.A00(r4, r0)
            r2.A0c(r0, r1)
            r1 = 2131968756(0x7f1342f4, float:1.9574416E38)
            r0 = 35
            X.LV2 r0 = X.LV2.A00(r3, r0)
            r2.A0G(r0, r1)
            android.app.Dialog r0 = r2.A02()
            X.AnonymousClass0fN.A00(r0)     // Catch:{ BadTokenException -> 0x0425 }
            goto L_0x0425
        L_0x05f3:
            boolean r0 = r3 instanceof X.Lw8
            if (r0 == 0) goto L_0x0425
            X.Lw8 r3 = (X.Lw8) r3
            X.6nA r7 = r3.A00
            java.util.List r0 = r3.A01
            java.util.Iterator r6 = r0.iterator()
        L_0x0601:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0425
            java.lang.Object r5 = r6.next()
            X.3gp r5 = (X.C247733gp) r5
            if (r5 == 0) goto L_0x0601
            java.util.List r0 = r2.A05
            java.util.Iterator r4 = r0.iterator()
        L_0x0615:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0638
            java.lang.Object r3 = r4.next()
            r0 = r3
            android.view.View r0 = (android.view.View) r0
            java.lang.Object r1 = r0.getTag()
            java.lang.String r0 = r5.A0G
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0615
        L_0x062e:
            android.view.View r3 = (android.view.View) r3
            if (r3 == 0) goto L_0x0601
            if (r7 == 0) goto L_0x0601
            r7.A00(r3, r5)
            goto L_0x0601
        L_0x0638:
            r3 = 0
            goto L_0x062e
        L_0x063a:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x063f:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0644:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66103MBl.emit(java.lang.Object, X.4D7):java.lang.Object");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof 02o) || !(obj instanceof C61910qF)) {
            return false;
        }
        return AnonymousClass7TG.A1Y(obj, getFunctionDelegate());
    }

    public final AnonymousClass0eL getFunctionDelegate() {
        Class cls;
        int i;
        String str;
        String str2;
        int i2 = this.A00;
        Object obj = this.A01;
        switch (i2) {
            case 0:
                return new 03J(2, obj, C66578MXj.class, "send", "send(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
            case 1:
                cls = K41.class;
                i = 2;
                str = "handleUiEffect";
                str2 = "handleUiEffect(Lcom/instagram/creation/capture/quickcapture/potato/capture/viewmodel/PotatoAudienceSelectorViewModel$UiEffect;)V";
                break;
            case 2:
                cls = K4N.class;
                i = 2;
                str = "handleUiEffect";
                str2 = "handleUiEffect(Lcom/instagram/creation/capture/quickcapture/potato/capture/viewmodel/PotatoPostCaptureViewModel$UiEffect;)V";
                break;
            case 3:
                cls = C353498Hw.class;
                i = 2;
                str = "onStickyToastModel";
                str2 = "onStickyToastModel(Lcom/instagram/creation/capture/quickcapture/sundial/stickytoast/ClipsCaptureStickyToastModel;)V";
                break;
            case 4:
                cls = C314546iR.class;
                i = 2;
                str = "updateView";
                str2 = "updateView(Lcom/instagram/reels/comments/viewmodel/StoryCommentsViewModel$ViewState;)V";
                break;
            case 5:
                cls = C314546iR.class;
                i = 2;
                str = "handleViewEffect";
                str2 = AnonymousClass000.A00(3209);
                break;
            case 6:
                cls = C64098LMs.class;
                i = 2;
                str = "updateState";
                str2 = "updateState(Lcom/instagram/stories/like/domain/StoryViewerLikeViewModel$UiState;)V";
                break;
            case 7:
                cls = C18514VtD.class;
                i = 2;
                str = "handleViewEffect";
                str2 = "handleViewEffect(Lcom/instagram/stories/messagecomposer/domain/StoriesMessageComposerViewModel$UiEffect;)V";
                break;
            case 8:
                cls = C61370K4o.class;
                i = 2;
                str = "handleViewEffect";
                str2 = "handleViewEffect(Linstagram/features/stories/fragment/userlist/comments/viewmodel/StoryCommentLikesViewModel$ViewEffect;)V";
                break;
            default:
                cls = K74.class;
                i = 2;
                str = "updateView";
                str2 = "updateView(Linstagram/features/stories/fragment/userlist/comments/viewmodel/StoryCommentsDashboardViewModel$ViewState;)V";
                break;
        }
        return new 0Yk(i, obj, cls, str, str2, 4);
    }

    public static C317366n9 A00(C314546iR r0) {
        return (C317366n9) C314546iR.A00(r0).A0D.getValue();
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
