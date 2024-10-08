package X;

public final class MP6 extends 0Yg implements 0sP {
    public final int A00;
    public final Object A01;

    public static Object A00(Object obj, MP6 mp6) {
        0qQ.A0B(obj, 0);
        return mp6.A01;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MP6(Object obj, int i) {
        super(1);
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: type inference failed for: r10v12, types: [java.lang.Object, X.Koz] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0099, code lost:
        r1.A06(r0.A03());
        r1 = r1.A00();
        r0 = X.DbX.A0i(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x0418, code lost:
        r2 = "paginationScrollListener";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x00a8, code lost:
        if (r0 == null) goto L_0x079e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x00aa, code lost:
        r0.A0J(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x051b, code lost:
        X.0qQ.A0F(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x0522, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:266:0x0778, code lost:
        return r1.itemView;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:271:0x07a0, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x01a7, code lost:
        r10.A01 = X.DbS.A04(r2, r3, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x01cb, code lost:
        r10.A02 = X.DbS.A04(r2, r3, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x01df, code lost:
        r10.A00(r3, new X.MP6(r2, r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x01fc, code lost:
        if (r2 != r0.intValue()) goto L_0x01fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x02c7, code lost:
        r10.A09 = true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r37) {
        /*
            r36 = this;
            r5 = r36
            r10 = r37
            int r0 = r5.A00
            switch(r0) {
                case 0: goto L_0x002f;
                case 1: goto L_0x002f;
                case 2: goto L_0x0038;
                case 3: goto L_0x0049;
                case 4: goto L_0x0009;
                case 5: goto L_0x0009;
                case 6: goto L_0x0009;
                case 7: goto L_0x0009;
                case 8: goto L_0x0069;
                case 9: goto L_0x007a;
                case 10: goto L_0x0009;
                case 11: goto L_0x00af;
                case 12: goto L_0x00bc;
                case 13: goto L_0x00ff;
                case 14: goto L_0x0016;
                case 15: goto L_0x012a;
                case 16: goto L_0x0137;
                case 17: goto L_0x015e;
                case 18: goto L_0x016b;
                case 19: goto L_0x017b;
                case 20: goto L_0x018b;
                case 21: goto L_0x0198;
                case 22: goto L_0x01af;
                case 23: goto L_0x01bc;
                case 24: goto L_0x01d3;
                case 25: goto L_0x01e9;
                case 26: goto L_0x0204;
                case 27: goto L_0x0220;
                case 28: goto L_0x0268;
                case 29: goto L_0x029a;
                case 30: goto L_0x02cc;
                case 31: goto L_0x02eb;
                case 32: goto L_0x0317;
                case 33: goto L_0x0388;
                case 34: goto L_0x03aa;
                case 35: goto L_0x03c8;
                case 36: goto L_0x041c;
                case 37: goto L_0x0450;
                case 38: goto L_0x050a;
                case 39: goto L_0x06d7;
                case 40: goto L_0x06ed;
                case 41: goto L_0x0704;
                case 42: goto L_0x071a;
                case 43: goto L_0x0729;
                case 44: goto L_0x0746;
                case 45: goto L_0x0758;
                case 46: goto L_0x0009;
                case 47: goto L_0x0779;
                case 48: goto L_0x078b;
                case 49: goto L_0x0795;
                default: goto L_0x0009;
            }
        L_0x0009:
            int r1 = X.AnonymousClass7TE.A0M(r10)
            java.lang.Object r0 = r5.A01
            java.util.List r0 = (java.util.List) r0
            r0.get(r1)
            r0 = 0
        L_0x0015:
            return r0
        L_0x0016:
            java.lang.String r2 = X.C41847B3o.A1E(r10)
            java.lang.Object r1 = r5.A01
            com.facebook.pando.TreeJNI r1 = (com.facebook.pando.TreeJNI) r1
            com.facebook.pando.TreeJNI r0 = com.facebook.pando.TreeJNI.$redex_init_class
            java.lang.Object r0 = r1.getField_UNTYPED(r2)
            if (r0 == 0) goto L_0x002c
            java.lang.String r0 = r0.toString()
            if (r0 != 0) goto L_0x0015
        L_0x002c:
            java.lang.String r0 = ""
            return r0
        L_0x002f:
            java.lang.Object r0 = A00(r10, r5)
            X.C51965G9l.A1W(r0, r10)
            goto L_0x079e
        L_0x0038:
            X.GmB r10 = (X.C53325GmB) r10
            r3 = 0
            X.0qQ.A0B(r10, r3)
            java.lang.Object r2 = r5.A01
            X.K56 r2 = (X.K56) r2
            r1 = 0
            r0 = 1
            X.K56.A00(r10, r1, r2, r3, r0)
            goto L_0x079e
        L_0x0049:
            X.GmB r10 = (X.C53325GmB) r10
            java.lang.Object r3 = A00(r10, r5)
            X.K56 r3 = (X.K56) r3
            X.0eM r0 = r3.A07
            r0.getValue()
            X.0eM r0 = r3.A04
            com.instagram.common.session.UserSession r2 = X.JTU.A0J(r0)
            X.1as r0 = X.1as.A04
            X.1ap r1 = r0.A02
            X.2FW r0 = X.2FW.A0H
            X.F3w r1 = r1.A07(r3, r2, r0)
            X.Kp1 r0 = r10.A00
            goto L_0x0099
        L_0x0069:
            java.lang.Object r2 = r5.A01
            X.K60 r2 = (X.K60) r2
            X.0eM r0 = r2.A03
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r0)
            java.lang.String r0 = "your_ais_null_state_create"
            X.K60.A00(r2, r1, r0)
            goto L_0x079e
        L_0x007a:
            X.Gm2 r10 = (X.C53316Gm2) r10
            java.lang.Object r3 = A00(r10, r5)
            X.K60 r3 = (X.K60) r3
            X.0eM r0 = r3.A05
            r0.getValue()
            X.0eM r0 = r3.A03
            com.instagram.common.session.UserSession r2 = X.JTU.A0J(r0)
            X.1as r0 = X.1as.A04
            X.1ap r1 = r0.A02
            X.2FW r0 = X.2FW.A0H
            X.F3w r1 = r1.A07(r3, r2, r0)
            X.Kp1 r0 = r10.A00
        L_0x0099:
            java.lang.String r0 = r0.A03()
            r1.A06(r0)
            com.instagram.direct.fragment.sharesheet.DirectShareSheetFragment r1 = r1.A00()
            X.37D r0 = X.DbX.A0i(r3)
            if (r0 == 0) goto L_0x079e
            r0.A0J(r1)
            goto L_0x079e
        L_0x00af:
            android.view.View r1 = X.C51969G9p.A0O(r10)
            java.lang.Object r0 = r5.A01
            android.view.View$OnClickListener r0 = (android.view.View.OnClickListener) r0
            r0.onClick(r1)
            goto L_0x079e
        L_0x00bc:
            boolean r0 = X.AnonymousClass7TE.A1a(r10)
            java.lang.Object r2 = r5.A01
            X.VcK r2 = (X.C17689VcK) r2
            android.widget.ImageView r1 = r2.A04
            if (r0 == 0) goto L_0x00f0
            if (r1 == 0) goto L_0x00d0
            r0 = 2131239404(0x7f0821ec, float:1.8095114E38)
            r1.setImageResource(r0)
        L_0x00d0:
            android.view.View r1 = r2.A03
            if (r1 == 0) goto L_0x00ee
            r0 = 2131442626(0x7f0b3bc2, float:1.8507297E38)
            android.widget.TextView r1 = X.AnonymousClass7TE.A0d(r1, r0)
        L_0x00db:
            r2.A06 = r1
            if (r1 == 0) goto L_0x00e7
            android.text.method.ScrollingMovementMethod r0 = new android.text.method.ScrollingMovementMethod
            r0.<init>()
            r1.setMovementMethod(r0)
        L_0x00e7:
            android.widget.TextView r0 = r2.A06
            X.AnonymousClass7TF.A16(r0)
            goto L_0x079e
        L_0x00ee:
            r1 = 0
            goto L_0x00db
        L_0x00f0:
            if (r1 == 0) goto L_0x00f8
            r0 = 2131239406(0x7f0821ee, float:1.8095118E38)
            r1.setImageResource(r0)
        L_0x00f8:
            android.widget.TextView r0 = r2.A06
            X.AnonymousClass7TH.A0R(r0)
            goto L_0x079e
        L_0x00ff:
            java.lang.String r10 = (java.lang.String) r10
            r5 = 0
            X.0qQ.A0B(r10, r5)
            r4 = 1
            char[] r0 = new char[r4]
            r3 = 58
            r0[r5] = r3
            java.util.List r2 = X.00l.A0Q(r10, r0, r5)
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = X.AnonymousClass7TE.A19(r2, r5)
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = X.AnonymousClass7TE.A19(r2, r4)
            r1.append(r0)
            java.lang.String r0 = X.C51967G9n.A0r(r1, r3)
            return r0
        L_0x012a:
            java.nio.ByteBuffer r10 = (java.nio.ByteBuffer) r10
            java.lang.Object r0 = A00(r10, r5)
            X.3ka r0 = (X.C249923ka) r0
            r0.A0F(r10)
            goto L_0x079e
        L_0x0137:
            X.1Pl r10 = (X.1Pl) r10
            r4 = 0
            X.0qQ.A0B(r10, r4)
            java.lang.Object r3 = r5.A01
            X.0lg r3 = (X.0lg) r3
            X.0Tu r2 = X.0Tu.A05
            r0 = 36310542583726257(0x81003f004e00b1, double:3.026271568543217E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x0158
            X.2mL r1 = X.C228792mL.A00
            X.0qQ.A0B(r1, r4)
            java.util.Set r0 = r10.A05
            r0.add(r1)
        L_0x0158:
            r0 = 36592017560174723(0x82003f004a0083, double:3.2042774770579833E-306)
            goto L_0x01a7
        L_0x015e:
            X.1Ph r10 = (X.1Ph) r10
            r0 = 0
            X.0qQ.A0B(r10, r0)
            X.KZs r3 = X.C62088KZs.A00
            java.lang.Object r2 = r5.A01
            r1 = 16
            goto L_0x01df
        L_0x016b:
            X.1Pl r10 = (X.1Pl) r10
            java.lang.Object r3 = A00(r10, r5)
            X.0lg r3 = (X.0lg) r3
            X.0Tu r2 = X.0Tu.A06
            r0 = 36599293230255585(0x8206dd00050de1, double:3.2088786401138923E-306)
            goto L_0x01cb
        L_0x017b:
            X.1Pl r10 = (X.1Pl) r10
            java.lang.Object r3 = A00(r10, r5)
            X.0lg r3 = (X.0lg) r3
            X.0Tu r2 = X.0Tu.A06
            r0 = 36600302547308370(0x8207c800010f52, double:3.209516936282267E-306)
            goto L_0x01a7
        L_0x018b:
            X.1Ph r10 = (X.1Ph) r10
            r0 = 0
            X.0qQ.A0B(r10, r0)
            X.KZu r3 = X.C62090KZu.A01
            java.lang.Object r2 = r5.A01
            r1 = 19
            goto L_0x01df
        L_0x0198:
            X.1Pl r10 = (X.1Pl) r10
            java.lang.Object r3 = A00(r10, r5)
            X.0lg r3 = (X.0lg) r3
            X.0Tu r2 = X.0Tu.A06
            r0 = 36600852303122442(0x8208480001100a, double:3.209864604072775E-306)
        L_0x01a7:
            int r0 = X.DbS.A04(r2, r3, r0)
            r10.A01 = r0
            goto L_0x079e
        L_0x01af:
            X.1Ph r10 = (X.1Ph) r10
            r0 = 0
            X.0qQ.A0B(r10, r0)
            X.KZu r3 = X.C62090KZu.A01
            java.lang.Object r2 = r5.A01
            r1 = 21
            goto L_0x01df
        L_0x01bc:
            X.1Pl r10 = (X.1Pl) r10
            java.lang.Object r3 = A00(r10, r5)
            X.0lg r3 = (X.0lg) r3
            X.0Tu r2 = X.0Tu.A06
            r0 = 36603141520692090(0x820a5d0001137a, double:3.21131231448176E-306)
        L_0x01cb:
            int r0 = X.DbS.A04(r2, r3, r0)
            r10.A02 = r0
            goto L_0x079e
        L_0x01d3:
            X.1Ph r10 = (X.1Ph) r10
            r0 = 0
            X.0qQ.A0B(r10, r0)
            X.KZt r3 = X.C62089KZt.A02
            java.lang.Object r2 = r5.A01
            r1 = 23
        L_0x01df:
            X.MP6 r0 = new X.MP6
            r0.<init>(r2, r1)
            r10.A00(r3, r0)
            goto L_0x079e
        L_0x01e9:
            X.11y r10 = (X.AnonymousClass11y) r10
            r0 = 0
            X.0qQ.A0B(r10, r0)
            int r2 = r10.A00
            java.lang.Object r0 = r5.A01
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x01fe
            int r0 = r0.intValue()
            r1 = 1
            if (r2 == r0) goto L_0x01ff
        L_0x01fe:
            r1 = 0
        L_0x01ff:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            return r0
        L_0x0204:
            X.OID r10 = X.DbV.A0L(r10)
            r0 = 2131625565(0x7f0e065d, float:1.8878342E38)
            X.DbX.A1N(r10, r0)
            java.lang.Object r0 = r5.A01
            android.content.Context r1 = X.DbT.A08(r0)
            androidx.recyclerview.widget.LinearLayoutManager r0 = new androidx.recyclerview.widget.LinearLayoutManager
            r0.<init>(r1)
            r10.A01 = r0
            r0 = 0
            r10.A05 = r0
            goto L_0x02c7
        L_0x0220:
            long r11 = X.AnonymousClass7TE.A0R(r10)
            java.lang.Object r1 = r5.A01
            X.K8G r1 = (X.K8G) r1
            X.0eM r0 = r1.A09
            java.lang.Object r7 = r0.getValue()
            X.JjC r7 = (X.C60311JjC) r7
            android.os.Bundle r1 = r1.requireArguments()
            java.lang.String r0 = "arg_media_id"
            java.lang.String r8 = X.C320236s2.A01(r1, r0)
            r10 = 0
            X.0qQ.A0B(r8, r10)
            X.05G r0 = r7.A09
            java.lang.Object r6 = r0.getValue()
            r0 = 1
            boolean r0 = X.C61137Jxn.A00(r0, r6)
            if (r0 == 0) goto L_0x0257
            X.6oS r4 = X.C318116oQ.A00(r7)
            r9 = 0
            X.MFf r5 = new X.MFf
            r5.<init>(r6, r7, r8, r9, r10, r11)
            goto L_0x0715
        L_0x0257:
            r0 = 419(0x1a3, float:5.87E-43)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            r0 = 490(0x1ea, float:6.87E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0wb.A03(r1, r0)
            goto L_0x079e
        L_0x0268:
            X.OID r3 = X.DbV.A0L(r10)
            java.lang.Object r2 = r5.A01
            androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2
            android.os.Bundle r1 = r2.requireArguments()
            java.lang.String r0 = "arg_full_screen"
            boolean r1 = r1.getBoolean(r0)
            r0 = 2131625566(0x7f0e065e, float:1.8878344E38)
            if (r1 == 0) goto L_0x0282
            r0 = 2131625567(0x7f0e065f, float:1.8878346E38)
        L_0x0282:
            X.DbX.A1N(r3, r0)
            android.content.Context r2 = r2.requireContext()
            r1 = 1
            com.instagram.common.ui.widget.recyclerview.FastScrollingLinearLayoutManager r0 = new com.instagram.common.ui.widget.recyclerview.FastScrollingLinearLayoutManager
            r0.<init>(r2)
            r3.A01 = r0
            r0 = 0
            r3.A05 = r0
            r3.A09 = r1
            r3.A0A = r1
            goto L_0x079e
        L_0x029a:
            X.OID r10 = (X.OID) r10
            r4 = 0
            X.0qQ.A0B(r10, r4)
            r0 = 2131625568(0x7f0e0660, float:1.8878348E38)
            X.DbX.A1N(r10, r0)
            java.lang.Object r3 = r5.A01
            androidx.fragment.app.Fragment r3 = (androidx.fragment.app.Fragment) r3
            android.content.Context r2 = r3.requireContext()
            r0 = 3
            com.instagram.common.ui.widget.recyclerview.FastScrollingGridLayoutManager r1 = new com.instagram.common.ui.widget.recyclerview.FastScrollingGridLayoutManager
            r1.<init>(r2, r0)
            X.JkE r0 = new X.JkE
            r0.<init>(r3, r4)
            r1.A01 = r0
            r10.A01 = r1
            r0 = 0
            r10.A05 = r0
            X.Jlz r0 = new X.Jlz
            r0.<init>(r3, r4)
            r10.A00 = r0
        L_0x02c7:
            r0 = 1
            r10.A09 = r0
            goto L_0x079e
        L_0x02cc:
            java.lang.String r10 = (java.lang.String) r10
            r3 = 0
            X.0qQ.A0B(r10, r3)
            java.lang.Object r0 = r5.A01
            X.K80 r0 = (X.K80) r0
            X.0eM r0 = r0.A00
            java.lang.Object r2 = r0.getValue()
            X.86a r2 = (X.C3507486a) r2
            r1 = 1
            X.81o r0 = r2.A02
            r0.A01(r3, r10, r1)
            X.2Fj r0 = r2.A00
            X.JTS.A12(r0)
            goto L_0x079e
        L_0x02eb:
            X.OID r4 = X.DbV.A0L(r10)
            java.lang.Object r3 = r5.A01
            X.K80 r3 = (X.K80) r3
            boolean r0 = r3 instanceof X.K2T
            if (r0 == 0) goto L_0x0313
            r0 = 2131625927(0x7f0e07c7, float:1.8879076E38)
        L_0x02fa:
            X.DbX.A1N(r4, r0)
            android.content.Context r2 = r3.getContext()
            r1 = 3
            androidx.recyclerview.widget.GridLayoutManager r0 = new androidx.recyclerview.widget.GridLayoutManager
            r0.<init>(r2, r1)
            r4.A01 = r0
            r1 = 1
            X.Jlz r0 = new X.Jlz
            r0.<init>(r3, r1)
            r4.A00 = r0
            goto L_0x079e
        L_0x0313:
            r0 = 2131625925(0x7f0e07c5, float:1.8879072E38)
            goto L_0x02fa
        L_0x0317:
            X.L7b r10 = (X.C63795L7b) r10
            r3 = 0
            X.0qQ.A0B(r10, r3)
            java.lang.Object r4 = r5.A01
            X.K5D r4 = (X.K5D) r4
            X.JlW r5 = r4.A07
            if (r5 == 0) goto L_0x0357
            java.util.List r2 = r10.A01
            boolean r1 = r10.A03
            boolean r0 = r10.A02
            if (r1 == 0) goto L_0x0350
            r5.A04(r2, r0)
            int r0 = r2.size()
            X.Jij r6 = r4.A08
            if (r6 == 0) goto L_0x0354
            int r5 = r4.A01
            int r0 = r0 + -1
            if (r5 <= r0) goto L_0x033f
            r5 = r0
        L_0x033f:
            if (r5 < 0) goto L_0x0354
            r2 = 0
        L_0x0342:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            java.util.Map r0 = r6.A08
            X.JTP.A1R(r1, r0, r3)
            if (r2 == r5) goto L_0x0354
            int r2 = r2 + 1
            goto L_0x0342
        L_0x0350:
            r5.A03(r2, r0)
            goto L_0x0357
        L_0x0354:
            X.K5D.A01(r4)
        L_0x0357:
            X.Jij r1 = r4.A08
            if (r1 == 0) goto L_0x0376
            java.util.List r0 = r10.A01
            boolean r0 = r0.isEmpty()
            java.lang.String r2 = "savedEmptyState"
            if (r0 == 0) goto L_0x037e
            java.lang.String r1 = r1.A07
            java.lang.String r0 = "SAVED"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x037e
            android.view.ViewGroup r0 = r4.A03
            if (r0 == 0) goto L_0x051b
            r0.setVisibility(r3)
        L_0x0376:
            X.Jm4 r0 = r4.A0A
            if (r0 == 0) goto L_0x0418
            r0.A00 = r3
            goto L_0x079e
        L_0x037e:
            android.view.ViewGroup r1 = r4.A03
            if (r1 == 0) goto L_0x051b
            r0 = 8
            r1.setVisibility(r0)
            goto L_0x0376
        L_0x0388:
            X.84D r10 = (X.AnonymousClass84D) r10
            java.lang.Object r0 = r5.A01
            X.K5D r0 = (X.K5D) r0
            X.JlW r3 = r0.A07
            if (r3 == 0) goto L_0x079e
            boolean r0 = r10 instanceof X.AnonymousClass8YD
            if (r0 == 0) goto L_0x03a8
            X.8YD r10 = (X.AnonymousClass8YD) r10
            java.lang.String r2 = r10.A02
        L_0x039a:
            java.lang.String r1 = r3.A01
            r0 = 0
            X.C60438JlW.A01(r3, r1, r0)
            r3.A01 = r2
            r0 = 1
            X.C60438JlW.A01(r3, r2, r0)
            goto L_0x079e
        L_0x03a8:
            r2 = 0
            goto L_0x039a
        L_0x03aa:
            java.lang.Object r2 = r5.A01
            X.K5D r2 = (X.K5D) r2
            X.Jij r1 = r2.A08
            if (r1 == 0) goto L_0x079e
            X.86D r0 = r1.A05
            java.lang.String r1 = r1.A07
            java.lang.String r0 = X.AnonymousClass86D.A00(r0)
            boolean r0 = X.0qQ.A0K(r0, r1)
            if (r0 == 0) goto L_0x079e
            X.K5D.A02(r2)
            X.K5D.A00(r2)
            goto L_0x079e
        L_0x03c8:
            X.L7b r10 = (X.C63795L7b) r10
            r4 = 0
            X.0qQ.A0B(r10, r4)
            java.lang.Object r3 = r5.A01
            X.K5E r3 = (X.K5E) r3
            boolean r0 = r10.A03
            X.JlW r2 = r3.A04
            if (r0 == 0) goto L_0x040e
            if (r2 == 0) goto L_0x03e1
            java.util.List r1 = r10.A01
            boolean r0 = r10.A02
            r2.A04(r1, r0)
        L_0x03e1:
            X.Jm4 r0 = r3.A0A
            if (r0 == 0) goto L_0x0418
            r0.A00 = r4
            X.86D r2 = r3.A06
            if (r2 == 0) goto L_0x079e
            java.util.List r0 = r10.A01
            boolean r0 = X.AnonymousClass7TE.A1b(r0)
            if (r0 != 0) goto L_0x040b
            X.86U r0 = r2.A02
            java.lang.String r0 = r0.A03
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0408
            X.86V r1 = X.AnonymousClass86V.NULL_CONTENT
        L_0x03ff:
            X.86U r0 = r2.A02
            X.2Fj r0 = r0.A01
            r0.A0B(r1)
            goto L_0x079e
        L_0x0408:
            X.86V r1 = X.AnonymousClass86V.NOT_FOUND
            goto L_0x03ff
        L_0x040b:
            X.86V r1 = X.AnonymousClass86V.DISPLAY_CONTENT
            goto L_0x03ff
        L_0x040e:
            if (r2 == 0) goto L_0x03e1
            java.util.List r1 = r10.A01
            boolean r0 = r10.A02
            r2.A03(r1, r0)
            goto L_0x03e1
        L_0x0418:
            java.lang.String r2 = "paginationScrollListener"
            goto L_0x051b
        L_0x041c:
            X.84D r10 = (X.AnonymousClass84D) r10
            java.lang.Object r4 = r5.A01
            X.K5E r4 = (X.K5E) r4
            X.JlW r3 = r4.A04
            if (r3 == 0) goto L_0x043a
            boolean r0 = r10 instanceof X.AnonymousClass8YD
            if (r0 == 0) goto L_0x044e
            X.8YD r10 = (X.AnonymousClass8YD) r10
            java.lang.String r2 = r10.A02
        L_0x042e:
            java.lang.String r1 = r3.A01
            r0 = 0
            X.C60438JlW.A01(r3, r1, r0)
            r3.A01 = r2
            r0 = 1
            X.C60438JlW.A01(r3, r2, r0)
        L_0x043a:
            com.instagram.ui.widget.searchedittext.SearchEditText r0 = r4.A09
            if (r0 == 0) goto L_0x0441
            X.0nA.A0N(r0)
        L_0x0441:
            X.86D r0 = r4.A06
            if (r0 == 0) goto L_0x079e
            X.05G r1 = r0.A0P
            X.86S r0 = X.AnonymousClass86S.CLOSED
            r1.Epw(r0)
            goto L_0x079e
        L_0x044e:
            r2 = 0
            goto L_0x042e
        L_0x0450:
            X.86V r10 = (X.AnonymousClass86V) r10
            r4 = 0
            X.0qQ.A0B(r10, r4)
            java.lang.Object r2 = r5.A01
            X.K5E r2 = (X.K5E) r2
            int r1 = r10.ordinal()
            r3 = 8
            r5 = 1
            java.lang.String r7 = "gridRecyclerView"
            java.lang.String r6 = "nullStateController"
            if (r1 == r4) goto L_0x04d3
            r0 = 3
            if (r1 == r0) goto L_0x0485
            if (r1 == r5) goto L_0x0474
            r0 = 2
            if (r1 == r0) goto L_0x0474
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0474:
            X.L7n r0 = r2.A08
            if (r0 == 0) goto L_0x0506
            androidx.recyclerview.widget.RecyclerView r0 = r0.A01
            r0.setVisibility(r3)
            androidx.recyclerview.widget.RecyclerView r0 = r2.A03
            if (r0 == 0) goto L_0x0502
            r0.setVisibility(r4)
            goto L_0x04f4
        L_0x0485:
            X.L7n r0 = r2.A08
            if (r0 == 0) goto L_0x0506
            androidx.recyclerview.widget.RecyclerView r0 = r0.A01
            r0.setVisibility(r3)
            androidx.recyclerview.widget.RecyclerView r0 = r2.A03
            if (r0 == 0) goto L_0x0502
            r0.setVisibility(r3)
            android.view.View r0 = r2.A02
            r1 = 0
            if (r0 == 0) goto L_0x0500
            r0.setVisibility(r4)
            android.content.Context r4 = r2.getContext()
            X.86D r0 = r2.A06
            if (r0 == 0) goto L_0x04d0
            X.86U r0 = r0.A02
            java.lang.String r3 = r0.A03
        L_0x04a9:
            if (r4 == 0) goto L_0x079e
            int r0 = r3.length()
            if (r0 <= 0) goto L_0x079e
            com.instagram.common.ui.base.IgTextView r0 = r2.A07
            java.lang.String r7 = "notFoundText"
            if (r0 == 0) goto L_0x0502
            r0.setTypeface(r1, r5)
            com.instagram.common.ui.base.IgTextView r1 = r2.A07
            if (r1 == 0) goto L_0x0502
            r0 = 2130970132(0x7f040614, float:1.7548965E38)
            X.JTS.A0u(r4, r1, r0)
            com.instagram.common.ui.base.IgTextView r1 = r2.A07
            if (r1 == 0) goto L_0x0502
            r0 = 2131968421(0x7f1341a5, float:1.9573736E38)
            X.DbX.A13(r4, r1, r3, r0)
            goto L_0x079e
        L_0x04d0:
            java.lang.String r3 = ""
            goto L_0x04a9
        L_0x04d3:
            X.L7n r1 = r2.A08
            if (r1 == 0) goto L_0x0506
            androidx.recyclerview.widget.RecyclerView r0 = r1.A01
            r0.setVisibility(r4)
            X.UA8 r1 = r1.A02
            com.instagram.common.session.UserSession r0 = r1.A01
            X.TvT r0 = X.C59820JZt.A00(r0)
            java.util.List r0 = r0.A00()
            r1.A00 = r0
            r1.notifyDataSetChanged()
            androidx.recyclerview.widget.RecyclerView r0 = r2.A03
            if (r0 == 0) goto L_0x0502
            r0.setVisibility(r3)
        L_0x04f4:
            android.view.View r0 = r2.A02
            if (r0 == 0) goto L_0x0500
            r0.setVisibility(r3)
            r2.getContext()
            goto L_0x079e
        L_0x0500:
            java.lang.String r7 = "notFoundContainer"
        L_0x0502:
            X.0qQ.A0F(r7)
            goto L_0x051e
        L_0x0506:
            X.0qQ.A0F(r6)
            goto L_0x051e
        L_0x050a:
            java.util.List r10 = (java.util.List) r10
            r9 = 0
            X.0qQ.A0B(r10, r9)
            java.lang.Object r0 = r5.A01
            X.K71 r0 = (X.K71) r0
            X.JlM r8 = r0.A03
            r7 = 0
            if (r8 != 0) goto L_0x0523
            java.lang.String r2 = "adapter"
        L_0x051b:
            X.0qQ.A0F(r2)
        L_0x051e:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0523:
            java.util.HashSet r6 = r8.A05
            r6.clear()
            java.util.List r0 = r8.A06
            r35 = r0
            r35.clear()
            java.util.ArrayList r5 = X.AnonymousClass7TE.A1C()
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()
            java.util.ArrayList r17 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r16 = r10.iterator()
        L_0x053f:
            boolean r0 = r16.hasNext()
            r14 = 0
            if (r0 == 0) goto L_0x06c6
            java.lang.Object r3 = r16.next()
            com.instagram.camera.effect.models.effectpreview.EffectPreview r3 = (com.instagram.camera.effect.models.effectpreview.EffectPreview) r3
            java.lang.String r2 = r3.A07
            boolean r0 = r6.contains(r2)
            java.lang.String r10 = "EffectsPreviewVideoAdapter"
            if (r0 == 0) goto L_0x0567
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "Should not receive duplicate effects from server. Filtering out effect ID: "
        L_0x055c:
            r1.append(r0)
            java.lang.String r0 = X.AnonymousClass7TF.A0l(r2, r1)
        L_0x0563:
            X.0kD.A01(r10, r0)
            goto L_0x053f
        L_0x0567:
            java.lang.String r0 = r3.A07
            if (r0 == 0) goto L_0x06be
            java.lang.String r0 = r3.A08
            if (r0 == 0) goto L_0x06be
            com.instagram.common.typedurl.ImageUrl r0 = r3.A02
            if (r0 == 0) goto L_0x06be
            com.instagram.camera.effect.models.AttributionUser r1 = r3.A00
            if (r1 == 0) goto L_0x06be
            java.lang.String r0 = r1.A02
            if (r0 == 0) goto L_0x06be
            java.lang.String r0 = r1.A01
            if (r0 == 0) goto L_0x06be
            r0 = r17
            r0.add(r2)
            com.instagram.common.session.UserSession r13 = r8.A03
            X.4Om r1 = X.C264044Oj.A00(r13)
            java.lang.String r0 = r8.A04
            r27 = r0
            r1.AAT(r2, r0)
            X.C264044Oj.A00(r13)
            java.lang.String r0 = r3.A08
            r24 = r0
            com.instagram.common.typedurl.ImageUrl r0 = r3.A02
            r19 = r0
            java.lang.String r11 = r3.A0A
            java.lang.String r1 = r3.A0B
            java.lang.String r0 = "SAVED"
            boolean r34 = r0.equals(r1)
            X.3HX r12 = r3.A05
            r1 = 0
            if (r12 == 0) goto L_0x0664
            java.util.List r10 = X.AnonymousClass3P9.A05(r12)
            boolean r0 = r10.isEmpty()
            if (r0 != 0) goto L_0x05bd
            X.1Xj r0 = X.DbZ.A0T(r10, r9)
            com.instagram.common.typedurl.ImageUrl r1 = r0.A1Q()
        L_0x05bd:
            X.1Ns r0 = X.AnonymousClass3P9.A01(r13, r12)
            r0.getClass()
            com.instagram.user.model.User r15 = r0.CCd()
            r15.getClass()
            com.instagram.reels.store.ReelStore r11 = X.1OP.A05(r13)
            java.lang.Integer r10 = r0.CAm()
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r10 != r0) goto L_0x05e2
            com.instagram.user.model.User r0 = X.DbT.A0j(r13)
            boolean r0 = r0.equals(r15)
            if (r0 == 0) goto L_0x05e2
            r14 = 1
        L_0x05e2:
            com.instagram.model.reels.Reel r0 = r11.A0I(r12, r14)
            com.instagram.camera.effect.models.EffectActionSheet r10 = r3.A01
            java.lang.String r25 = r15.getUsername()
            java.lang.String r26 = r15.getId()
            com.instagram.common.typedurl.ImageUrl r20 = r15.Bh3()
            int r11 = r8.A01
            r33 = r11
            if (r10 == 0) goto L_0x065f
            java.util.List r12 = r10.A00
        L_0x05fc:
            if (r10 == 0) goto L_0x065a
            java.util.List r11 = r10.A01
        L_0x0600:
            java.lang.String r28 = X.LPR.A02(r33)
            com.instagram.model.shopping.ProductAREffectContainer r15 = r3.A06
            java.lang.String r14 = r3.A09
            X.Kit r13 = r3.A04
            com.instagram.model.effect.AttributedAREffect r10 = new com.instagram.model.effect.AttributedAREffect
            r18 = r10
            r21 = r13
            r22 = r15
            r23 = r2
            r29 = r14
            r30 = r12
            r31 = r11
            r32 = r17
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            r0.A0G = r10
            r4.add(r0)
        L_0x0624:
            com.instagram.camera.effect.models.AttributionUser r3 = r3.A00
            r3.getClass()
            java.lang.String r12 = r3.A02
            r11 = -1
            X.Koz r10 = new X.Koz
            r10.<init>()
            r10.A09 = r9
            r10.A05 = r2
            r3 = r24
            r10.A06 = r3
            r10.A04 = r12
            r3 = r19
            r10.A01 = r3
            r10.A02 = r1
            r10.A03 = r0
            r10.A0B = r9
            r10.A00 = r11
            r10.A07 = r7
            r10.A08 = r7
            r10.A0A = r9
            X.LQR r0 = new X.LQR
            r0.<init>((X.C62947Koz) r10)
            r5.add(r0)
            r6.add(r2)
            goto L_0x053f
        L_0x065a:
            java.util.ArrayList r11 = X.AnonymousClass7TE.A1C()
            goto L_0x0600
        L_0x065f:
            java.util.ArrayList r12 = X.AnonymousClass7TE.A1C()
            goto L_0x05fc
        L_0x0664:
            if (r11 == 0) goto L_0x06ba
            com.instagram.common.typedurl.ImageUrl r1 = r3.A03
            if (r1 == 0) goto L_0x06ba
            com.instagram.model.reels.Reel r0 = X.Dba.A0L(r13, r11)
            com.instagram.camera.effect.models.AttributionUser r12 = r3.A00
            r12.getClass()
            com.instagram.camera.effect.models.EffectActionSheet r11 = r3.A01
            if (r0 == 0) goto L_0x053f
            if (r11 == 0) goto L_0x053f
            java.lang.String r10 = r12.A02
            r25 = r10
            java.lang.String r10 = r12.A01
            r26 = r10
            com.instagram.camera.effect.models.ProfilePicture r10 = r12.A00
            if (r10 == 0) goto L_0x06b7
            com.instagram.common.typedurl.ImageUrl r10 = r10.A00
            r20 = r10
        L_0x0689:
            int r10 = r8.A01
            r33 = r10
            java.util.List r15 = r11.A00
            java.util.List r14 = r11.A01
            java.lang.String r28 = X.LPR.A02(r33)
            com.instagram.model.shopping.ProductAREffectContainer r13 = r3.A06
            java.lang.String r12 = r3.A09
            X.Kit r11 = r3.A04
            com.instagram.model.effect.AttributedAREffect r10 = new com.instagram.model.effect.AttributedAREffect
            r18 = r10
            r21 = r11
            r22 = r13
            r23 = r2
            r29 = r12
            r30 = r15
            r31 = r14
            r32 = r17
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            r0.A0G = r10
            r4.add(r0)
            goto L_0x0624
        L_0x06b7:
            r20 = r7
            goto L_0x0689
        L_0x06ba:
            java.lang.String r0 = "EffectPreview should not have both null response item and null reel ID"
            goto L_0x0563
        L_0x06be:
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "Trying to layout third party preview without attribution user: "
            goto L_0x055c
        L_0x06c6:
            X.K71 r0 = r8.A00
            r0.A09 = r4
            r35.size()
            r0 = r35
            r0.addAll(r5)
            r8.notifyDataSetChanged()
            goto L_0x079e
        L_0x06d7:
            boolean r0 = X.AnonymousClass7TE.A1a(r10)
            java.lang.Object r1 = r5.A01
            X.K71 r1 = (X.K71) r1
            if (r0 != 0) goto L_0x079e
            com.instagram.profile.fragment.UserDetailTabController r0 = r1.A04
            if (r0 == 0) goto L_0x06e8
            r0.A0H()
        L_0x06e8:
            r0 = 0
            r1.A04 = r0
            goto L_0x079e
        L_0x06ed:
            X.JwA r10 = (X.C61072JwA) r10
            java.lang.Object r0 = A00(r10, r5)
            X.K6p r0 = (X.C61418K6p) r0
            java.util.Map r2 = r0.A01
            int r0 = r10.A01
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.Object r0 = r10.A02
            r2.put(r1, r0)
            goto L_0x079e
        L_0x0704:
            boolean r3 = X.AnonymousClass7TE.A1a(r10)
            java.lang.Object r2 = r5.A01
            X.Jfj r2 = (X.C60103Jfj) r2
            X.4Cq r4 = r2.A04
            r1 = 0
            r0 = 4
            X.JV6 r5 = new X.JV6
            r5.<init>((java.lang.Object) r2, (X.AnonymousClass4D7) r1, (int) r0, (boolean) r3)
        L_0x0715:
            X.AnonymousClass7TE.A1Z(r5, r4)
            goto L_0x079e
        L_0x071a:
            boolean r3 = X.AnonymousClass7TE.A1a(r10)
            java.lang.Object r2 = r5.A01
            X.Jfj r2 = (X.C60103Jfj) r2
            X.4Cq r1 = r2.A04
            r0 = 5
            X.Dba.A1S(r2, r1, r0, r3)
            goto L_0x079e
        L_0x0729:
            android.view.View r10 = (android.view.View) r10
            r2 = 0
            X.0qQ.A0B(r10, r2)
            java.lang.Object r1 = r10.getTag()
            r0 = 720(0x2d0, float:1.009E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0qQ.A0C(r1, r0)
            X.Jpp r1 = (X.C60704Jpp) r1
            java.lang.Object r0 = r5.A01
            X.6wf r0 = (X.C322946wf) r0
            X.C64173LSa.A02(r0, r1, r2, r2)
            goto L_0x079e
        L_0x0746:
            android.content.Context r2 = X.C51968G9o.A0J(r10)
            java.lang.Object r0 = r5.A01
            java.lang.Object r1 = X.C51966G9m.A18(r0)
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            r0 = 0
            X.3N1 r1 = X.AnonymousClass3Mc.A00(r2, r0, r1)
            goto L_0x0776
        L_0x0758:
            android.content.Context r10 = (android.content.Context) r10
            r4 = 0
            X.0qQ.A0B(r10, r4)
            java.lang.Object r3 = r5.A01
            X.6wg r3 = (X.C322956wg) r3
            r2 = 0
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r10)
            r0 = 2131626747(0x7f0e0afb, float:1.8880739E38)
            android.view.View r0 = r1.inflate(r0, r2, r4)
            X.6rD r1 = new X.6rD
            r1.<init>(r0, r3)
            r0.setTag(r1)
        L_0x0776:
            android.view.View r0 = r1.itemView
            return r0
        L_0x0779:
            java.lang.Object r0 = r5.A01
            X.Jj7 r0 = X.JTU.A0C(r0)
            X.LSr r0 = r0.A01
            java.util.Map r0 = r0.A05
            java.util.Set r0 = r0.keySet()
            X.0qQ.A07(r0)
            goto L_0x079e
        L_0x078b:
            java.lang.Object r1 = r5.A01
            X.0sP r1 = (X.0sP) r1
            X.5VN r0 = X.AnonymousClass5VN.A04
            r1.invoke(r0)
            goto L_0x079e
        L_0x0795:
            java.lang.Object r0 = A00(r10, r5)
            X.5Oz r0 = (X.C284945Oz) r0
            r0.Epw(r10)
        L_0x079e:
            X.0gF r0 = X.C60340gF.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MP6.invoke(java.lang.Object):java.lang.Object");
    }
}
