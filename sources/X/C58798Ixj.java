package X;

/* renamed from: X.Ixj  reason: case insensitive filesystem */
public final class C58798Ixj extends 0Yg implements 0sP {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final boolean A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58798Ixj(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, boolean z) {
        super(1);
        this.A00 = i;
        this.A03 = obj;
        this.A06 = z;
        this.A05 = obj2;
        this.A01 = obj3;
        this.A04 = obj4;
        this.A02 = obj5;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:130:0x03d4, code lost:
        if (r2.A05 != null) goto L_0x03d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x059b, code lost:
        if (r17 != false) goto L_0x059d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0048, code lost:
        if (((X.0r1) r0.A04).A00 != false) goto L_0x004a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0247  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r53) {
        /*
            r52 = this;
            r0 = r52
            r10 = r53
            int r1 = r0.A00
            switch(r1) {
                case 0: goto L_0x0199;
                case 1: goto L_0x015a;
                case 2: goto L_0x00b1;
                case 3: goto L_0x0624;
                case 4: goto L_0x006f;
                case 5: goto L_0x0267;
                default: goto L_0x0009;
            }
        L_0x0009:
            X.5u7 r10 = (X.C298835u7) r10
            r15 = 0
            X.0qQ.A0B(r10, r15)
            X.4sa r5 = r10.BaP()
            java.lang.Object r4 = r0.A05
            X.GLR r4 = (X.GLR) r4
            java.lang.Object r7 = r0.A02
            X.GLa r7 = (X.C52259GLa) r7
            java.lang.String r3 = r7.A02
            X.GLa r1 = X.GLR.A00(r5, r3, r15, r15)
            r4.A00 = r1
            java.util.List r1 = X.C51973G9u.A0m(r10)
            java.util.List r11 = X.GLR.A05(r4, r1)
            r2 = 1
            X.GLR.A07(r10, r4, r11, r15, r2)
            X.GLd r9 = r4.A08
            java.lang.Object r6 = r0.A01
            X.0rk r6 = (X.0rk) r6
            int r12 = r6.A00
            int r1 = r12 + 1
            r6.A00 = r1
            boolean r13 = r7.A04
            boolean r1 = r7.A06
            if (r1 == 0) goto L_0x004a
            java.lang.Object r1 = r0.A04
            X.0r1 r1 = (X.0r1) r1
            boolean r1 = r1.A00
            r14 = 1
            if (r1 == 0) goto L_0x004b
        L_0x004a:
            r14 = 0
        L_0x004b:
            java.lang.Object r1 = r0.A03
            boolean r19 = X.G9w.A1b(r1)
            boolean r1 = r0.A06
            r17 = r2
            r16 = r2
            r18 = r1
            r9.A02(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            java.lang.String r1 = r10.BaG()
            X.GLR.A08(r4, r1)
            X.GLR.A06(r5, r4, r3, r11, r13)
            java.lang.Object r0 = r0.A04
            X.0r1 r0 = (X.0r1) r0
            r0.A00 = r2
        L_0x006c:
            X.0gF r0 = X.C60340gF.A00
            return r0
        L_0x006f:
            int r6 = X.AnonymousClass7TE.A0M(r10)
            java.lang.Object r2 = r0.A05
            com.instagram.common.session.UserSession r2 = (com.instagram.common.session.UserSession) r2
            boolean r1 = X.C56645I6a.A03(r2)
            if (r1 != 0) goto L_0x006c
            java.lang.Object r1 = r0.A01
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto L_0x0095
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x0095
            java.lang.Object r1 = r0.A02
            X.3Wa r1 = (X.C242813Wa) r1
            java.lang.Object r0 = r0.A03
            X.1Xj r0 = (X.1Xj) r0
            r1.Cx1(r0)
            goto L_0x006c
        L_0x0095:
            java.lang.Object r3 = r0.A03
            X.1Xj r3 = (X.1Xj) r3
            com.instagram.user.model.User r1 = r3.A2A(r2)
            java.lang.Object r2 = r0.A02
            X.3Wa r2 = (X.C242813Wa) r2
            java.lang.Object r4 = r0.A04
            X.3W1 r4 = (X.AnonymousClass3W1) r4
            if (r1 == 0) goto L_0x0650
            java.lang.String r5 = r1.getId()
            boolean r7 = r0.A06
            r2.D3K(r3, r4, r5, r6, r7)
            goto L_0x006c
        L_0x00b1:
            X.2WA r10 = (X.AnonymousClass2WA) r10
            r5 = 0
            X.0qQ.A0B(r10, r5)
            X.2S0 r1 = X.AnonymousClass2S0.A01
            r1.A06()
            java.lang.Object r1 = r0.A02
            X.5xz r1 = (X.C300835xz) r1
            java.lang.Object r9 = r0.A01
            X.7dj r9 = (X.C335907dj) r9
            boolean r4 = r9.A0S
            r1.A02(r4, r5, r5)
            java.lang.Object r3 = r0.A05
            X.GgO r3 = (X.C52971GgO) r3
            java.lang.String r2 = r9.A0K
            java.lang.String r1 = r9.A0N
            r3.A0h(r2, r1, r4)
            if (r4 != 0) goto L_0x006c
            boolean r1 = r0.A06
            if (r1 != 0) goto L_0x006c
            android.view.View r1 = r10.A00
            android.content.Context r8 = X.AnonymousClass7TE.A0S(r1)
            android.view.View r6 = r10.A00
            X.0qQ.A06(r6)
            java.lang.Object r4 = r0.A04
            com.instagram.common.session.UserSession r4 = (com.instagram.common.session.UserSession) r4
            X.7dd r7 = r9.A07
            X.7fs r3 = r9.A03
            X.571 r2 = r9.A08
            java.lang.Object r1 = r0.A03
            X.7a7 r1 = (X.C333777a7) r1
            r0 = 2
            X.0qQ.A0B(r4, r0)
            boolean r0 = X.I2W.A02(r4)
            if (r0 == 0) goto L_0x0136
            X.I2W.A00(r4)
            r2 = 2131961008(0x7f1324b0, float:1.95587E38)
        L_0x0103:
            android.app.Activity r1 = X.C61270mF.A00(r8)
            X.6jx r0 = new X.6jx
            r0.<init>((int) r2)
            X.5Gt r7 = new X.5Gt
            r7.<init>(r1, r0)
            r7.A03(r6)
            android.content.res.Resources r1 = r8.getResources()
            r0 = 2131165214(0x7f07001e, float:1.7944639E38)
            int r0 = r1.getDimensionPixelOffset(r0)
            double r2 = (double) r0
            r0 = -4620693217682128896(0xbfe0000000000000, double:-0.5)
            double r2 = r2 * r0
            int r1 = (int) r2
            r0 = 1
            r7.A04(r6, r5, r1, r0)
            r7.A02()
            r7.A0A = r0
            X.5Gv r0 = r7.A00()
            r0.A07(r4)
            goto L_0x006c
        L_0x0136:
            boolean r0 = X.I2W.A01(r3, r1, r7, r4, r2)
            if (r0 == 0) goto L_0x006c
            X.0xa r1 = X.AnonymousClass7TE.A0q(r4)
            java.lang.String r0 = "seen_share_comment_nux_count"
            X.0xY r0 = X.AnonymousClass7TG.A0g(r1, r0)
            r0.apply()
            r2 = 2131956397(0x7f1312ad, float:1.9549349E38)
            android.view.ViewParent r1 = r6.getParent()
            boolean r0 = r1 instanceof android.view.ViewGroup
            if (r0 == 0) goto L_0x0103
            android.view.View r1 = (android.view.View) r1
            if (r1 == 0) goto L_0x0103
            r6 = r1
            goto L_0x0103
        L_0x015a:
            X.6Gb r10 = (X.C305006Gb) r10
            r12 = 0
            X.0qQ.A0B(r10, r12)
            java.lang.Object r13 = r0.A04
            java.util.List r13 = (java.util.List) r13
            X.JEX r1 = X.JEX.A00
            boolean r6 = r0.A06
            java.lang.Object r14 = r0.A01
            java.lang.Object r15 = r0.A05
            java.lang.Object r5 = r0.A02
            java.lang.Object r4 = r0.A03
            int r3 = r13.size()
            r0 = 29
            X.J6l r2 = new X.J6l
            r2.<init>((int) r0, (java.lang.Object) r13, (java.lang.Object) r1)
            r0 = 46
            X.MP6 r1 = new X.MP6
            r1.<init>(r13, r0)
            r0 = -1091073711(0xffffffffbef78951, float:-0.48346952)
            X.JJk r11 = new X.JJk
            r16 = r5
            r17 = r4
            r18 = r6
            r11.<init>(r12, r13, r14, r15, r16, r17, r18)
            X.5PJ r0 = X.AnonymousClass5PI.A03(r11, r0)
            r10.CfA(r2, r1, r0, r3)
            goto L_0x006c
        L_0x0199:
            X.4ch r10 = (X.C268064ch) r10
            java.lang.Object r5 = r0.A03
            X.Gc7 r5 = (X.C52754Gc7) r5
            r5.A02 = r10
            X.5Oz r3 = r5.A0C
            java.lang.Object r1 = r3.getValue()
            X.I1h r1 = (X.C56553I1h) r1
            if (r1 == 0) goto L_0x01ad
            r1.A01 = r10
        L_0x01ad:
            boolean r1 = r0.A06
            if (r1 == 0) goto L_0x006c
            X.5Oz r4 = r5.A09
            java.lang.Object r2 = r4.getValue()
            X.HL2 r1 = X.HL2.Selection
            r6 = 1
            if (r2 != r1) goto L_0x0256
            X.5Oz r1 = r5.A0G
            boolean r1 = X.C51971G9r.A1W(r1)
            if (r1 == 0) goto L_0x024e
            java.lang.Object r1 = r0.A05
            X.5Qx r1 = (X.C285345Qx) r1
            X.5Qw r1 = (X.C285335Qw) r1
            X.5Oz r1 = r1.A00
            boolean r1 = X.C51971G9r.A1W(r1)
            if (r1 == 0) goto L_0x024e
            java.lang.Object r4 = r0.A01
            X.Gb5 r4 = (X.C52693Gb5) r4
            r4.A0B()
        L_0x01d9:
            boolean r2 = X.C56168Htx.A01(r4, r6)
            X.5Oz r1 = r5.A0I
            X.C51967G9n.A16(r1, r2)
            r1 = 0
            boolean r2 = X.C56168Htx.A01(r4, r1)
            X.5Oz r1 = r5.A0H
            X.C51967G9n.A16(r1, r2)
            java.lang.Object r1 = r0.A04
            X.5Tl r1 = (X.C285975Tl) r1
            long r1 = r1.A00
            boolean r2 = X.C285965Tk.A03(r1)
        L_0x01f6:
            X.5Oz r1 = r5.A0F
            X.C51967G9n.A16(r1, r2)
        L_0x01fb:
            java.lang.Object r8 = r0.A04
            X.5Tl r8 = (X.C285975Tl) r8
            java.lang.Object r7 = r0.A02
            X.JS3 r7 = (X.JS3) r7
            X.C52694Gb6.A02(r5, r7, r8)
            java.lang.Object r4 = r3.getValue()
            X.I1h r4 = (X.C56553I1h) r4
            if (r4 == 0) goto L_0x006c
            X.Hpq r3 = r5.A04
            if (r3 == 0) goto L_0x006c
            X.5Oz r0 = r5.A0A
            boolean r0 = X.C51971G9r.A1W(r0)
            if (r0 == 0) goto L_0x006c
            X.4ch r2 = r4.A01
            if (r2 == 0) goto L_0x006c
            boolean r0 = r2.COx()
            if (r0 == 0) goto L_0x006c
            X.4ch r1 = r4.A00
            if (r1 == 0) goto L_0x006c
            X.62f r6 = r4.A02
            r0 = 10
            X.J6M r9 = X.J6M.A00(r2, r0)
            X.5VN r4 = X.HRC.A00(r2)
            r0 = 0
            X.5VN r5 = r2.CgV(r1, r0)
            X.5Ui r0 = r3.A01
            java.util.concurrent.atomic.AtomicReference r0 = r0.A01
            java.lang.Object r0 = r0.get()
            boolean r0 = X.0qQ.A0K(r0, r3)
            if (r0 == 0) goto L_0x006c
            X.5Te r3 = r3.A00
            r3.FLn(r4, r5, r6, r7, r8, r9)
            goto L_0x006c
        L_0x024e:
            java.lang.Object r4 = r0.A01
            X.Gb5 r4 = (X.C52693Gb5) r4
            r4.A08()
            goto L_0x01d9
        L_0x0256:
            java.lang.Object r2 = r4.getValue()
            X.HL2 r1 = X.HL2.Cursor
            if (r2 != r1) goto L_0x01fb
            java.lang.Object r1 = r0.A01
            X.Gb5 r1 = (X.C52693Gb5) r1
            boolean r2 = X.C56168Htx.A01(r1, r6)
            goto L_0x01f6
        L_0x0267:
            java.lang.Object r1 = r0.A03
            X.N4N r1 = (X.N4N) r1
            java.lang.Object r11 = r0.A01
            X.Vd2 r11 = (X.C17733Vd2) r11
            java.lang.Object r2 = r0.A02
            X.Gyv r2 = (X.C54072Gyv) r2
            java.lang.Object r12 = r0.A04
            com.instagram.common.session.UserSession r12 = (com.instagram.common.session.UserSession) r12
            java.lang.Object r3 = r0.A05
            X.Ocm r3 = (X.C71108Ocm) r3
            android.content.Context r10 = r3.A00
            boolean r5 = r0.A06
            r0 = 0
            X.0qQ.A0B(r1, r0)
            r22 = 1
            r3 = r22
            X.DbZ.A0t(r3, r11, r2, r12)
            java.util.ArrayList r7 = X.AnonymousClass7TE.A1C()
            java.util.LinkedHashMap r21 = X.AnonymousClass7TE.A1H()
            X.01N r4 = X.0jo.A1H()
            java.util.List r3 = r2.A09
            r4.addAll(r3)
            X.Hoa r3 = r2.A02
            if (r3 == 0) goto L_0x02a4
            java.util.List r3 = r3.A05
            r4.addAll(r3)
        L_0x02a4:
            X.01N r3 = X.0jo.A1I(r4)
            java.util.ArrayList r6 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r15 = r3.iterator()
            r9 = 0
        L_0x02b1:
            boolean r3 = r15.hasNext()
            if (r3 == 0) goto L_0x0345
            java.lang.Object r4 = r15.next()
            int r14 = r9 + 1
            if (r9 >= 0) goto L_0x02c7
            X.0sr.A1T()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x02c7:
            boolean r3 = r4 instanceof X.C295745oq
            if (r3 == 0) goto L_0x0335
            if (r5 == 0) goto L_0x0324
            X.IRF r3 = X.IRF.A00
            r8 = r4
            X.5oq r8 = (X.C295745oq) r8
            boolean r3 = X.GX2.A00(r3, r8)
            if (r3 == 0) goto L_0x0324
            java.lang.Integer r3 = java.lang.Integer.valueOf(r9)
            X.AnonymousClass7TF.A1I(r3, r4, r7)
            r3 = 0
            java.lang.Object r8 = X.C296885qo.A05(r12, r3, r8, r0)
            java.util.List r3 = r1.A0H
            int r4 = X.DbT.A01(r3, r9)
            boolean r3 = r8 instanceof X.C297005r0
            if (r3 == 0) goto L_0x031c
            java.lang.Integer r9 = java.lang.Integer.valueOf(r4)
            X.5r0 r8 = (X.C297005r0) r8
            java.util.List r3 = r8.A02
            java.util.ArrayList r8 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r13 = r3.iterator()
        L_0x02fe:
            boolean r3 = r13.hasNext()
            if (r3 == 0) goto L_0x033d
            java.lang.Object r4 = r13.next()
            X.5qt r4 = (X.C296935qt) r4
            boolean r3 = r4 instanceof X.C296965qw
            if (r3 == 0) goto L_0x02fe
            X.5qw r4 = (X.C296965qw) r4
            if (r4 == 0) goto L_0x02fe
            X.1Xj r3 = r4.BPf()
            if (r3 == 0) goto L_0x02fe
            X.C51971G9r.A1M(r3, r8)
            goto L_0x02fe
        L_0x031c:
            java.lang.String r4 = "SerpFeed"
            java.lang.String r3 = "fallback sections are not valid"
            X.0wb.A03(r4, r3)
            goto L_0x0342
        L_0x0324:
            X.5oq r4 = (X.C295745oq) r4
            r3 = 0
            java.lang.Object r4 = X.C296885qo.A05(r12, r3, r4, r0)
            if (r4 == 0) goto L_0x0342
            boolean r3 = r4 instanceof java.util.List
            if (r3 != 0) goto L_0x0339
            boolean r3 = r4 instanceof X.C297005r0
            if (r3 == 0) goto L_0x0342
        L_0x0335:
            java.util.List r4 = X.AnonymousClass7TE.A1I(r4)
        L_0x0339:
            r6.add(r4)
            goto L_0x0342
        L_0x033d:
            r3 = r21
            r3.put(r9, r8)
        L_0x0342:
            r9 = r14
            goto L_0x02b1
        L_0x0345:
            java.util.ArrayList r5 = X.0Yv.A1F(r6)
            java.util.ArrayList r9 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r13 = r5.iterator()
        L_0x0351:
            boolean r3 = r13.hasNext()
            if (r3 == 0) goto L_0x038d
            java.lang.Object r4 = r13.next()
            boolean r3 = r4 instanceof X.C297005r0
            if (r3 == 0) goto L_0x0351
            X.5r0 r4 = (X.C297005r0) r4
            java.util.List r3 = r4.A02
            java.util.ArrayList r8 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r6 = r3.iterator()
        L_0x036b:
            boolean r3 = r6.hasNext()
            if (r3 == 0) goto L_0x0389
            java.lang.Object r4 = r6.next()
            X.5qt r4 = (X.C296935qt) r4
            boolean r3 = r4 instanceof X.C296965qw
            if (r3 == 0) goto L_0x036b
            X.5qw r4 = (X.C296965qw) r4
            if (r4 == 0) goto L_0x036b
            X.1Xj r3 = r4.BPf()
            if (r3 == 0) goto L_0x036b
            X.C51971G9r.A1M(r3, r8)
            goto L_0x036b
        L_0x0389:
            r9.add(r8)
            goto L_0x0351
        L_0x038d:
            java.util.ArrayList r3 = X.0Yv.A1F(r9)
            java.util.ArrayList r8 = X.AnonymousClass7TF.A0p(r3)
            java.util.Iterator r6 = r3.iterator()
        L_0x0399:
            boolean r3 = r6.hasNext()
            if (r3 == 0) goto L_0x03ad
            java.lang.Object r4 = r6.next()
            int r3 = r1.A04
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            X.AnonymousClass7TF.A1I(r4, r3, r8)
            goto L_0x0399
        L_0x03ad:
            java.util.Map r20 = X.0Yt.A08(r8)
            boolean r6 = r11.A0F
            java.util.List r3 = r1.A0H
            r32 = r3
            int r8 = r32.size()
            int r3 = r1.A04
            r19 = r3
            X.ULh r18 = new X.ULh
            r4 = r18
            r4.<init>((java.util.List) r7, (int) r8, (int) r3, (boolean) r6)
            boolean r3 = r20.isEmpty()
            r17 = r3 ^ 1
            X.OMy r3 = r2.A00
            if (r3 != 0) goto L_0x03d6
            java.lang.String r3 = r2.A05
            r50 = 0
            if (r3 == 0) goto L_0x03d8
        L_0x03d6:
            r50 = 1
        L_0x03d8:
            if (r6 == 0) goto L_0x0556
            java.util.ArrayList r9 = X.AnonymousClass7TE.A1D(r32)
            int r14 = r9.size()
            r13 = 0
        L_0x03e3:
            if (r13 >= r14) goto L_0x041d
            java.lang.Object r3 = r9.get(r13)
            boolean r3 = r3 instanceof X.N62
            if (r3 == 0) goto L_0x041a
            java.lang.Object r4 = r9.get(r13)
            java.lang.String r3 = "null cannot be cast to non-null type com.instagram.discovery.hcm.model.SuggestedPromptPillsModel"
            X.0qQ.A0C(r4, r3)
            X.N62 r4 = (X.N62) r4
            java.lang.Integer r8 = r4.A02
            java.util.List r7 = r4.A03
            X.QP5 r6 = r4.A01
            X.Jw0 r4 = r4.A00
            X.0qQ.A0B(r8, r0)
            r3 = r22
            X.0qQ.A0B(r7, r3)
            X.N62 r3 = new X.N62
            r45 = r3
            r46 = r4
            r47 = r6
            r48 = r8
            r49 = r7
            r45.<init>(r46, r47, r48, r49, r50)
            r9.set(r13, r3)
        L_0x041a:
            int r13 = r13 + 1
            goto L_0x03e3
        L_0x041d:
            X.01N r8 = X.0jo.A1H()
            X.OMy r3 = r2.A00
            if (r3 == 0) goto L_0x0428
            r8.add(r3)
        L_0x0428:
            java.util.ArrayList r13 = X.AnonymousClass7TE.A1C()
            java.util.ArrayList r7 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r5 = r5.iterator()
        L_0x0434:
            boolean r3 = r5.hasNext()
            if (r3 == 0) goto L_0x0444
            java.lang.Object r4 = r5.next()
            boolean r3 = r4 instanceof X.C66942Mfb
            X.C51970G9q.A1Q(r4, r13, r7, r3)
            goto L_0x0434
        L_0x0444:
            java.lang.String r3 = r2.A05
            if (r3 == 0) goto L_0x0459
            X.GKw r6 = new X.GKw
            r6.<init>(r3)
            java.lang.Integer r5 = X.AnonymousClass05K.A01
            java.lang.Integer r4 = X.AnonymousClass05K.A0j
            X.Jw7 r3 = new X.Jw7
            r3.<init>((X.C266444Yx) r6, (java.lang.Integer) r5, (java.lang.Integer) r4)
            r8.add(r3)
        L_0x0459:
            java.util.List r3 = r2.A0A
            if (r3 == 0) goto L_0x04b5
            java.util.Iterator r16 = r3.iterator()
        L_0x0461:
            boolean r3 = r16.hasNext()
            if (r3 == 0) goto L_0x04b5
            java.lang.Object r6 = r16.next()
            X.9Un r6 = (X.C379599Un) r6
            java.lang.String r5 = r6.A06
            r3 = 816(0x330, float:1.143E-42)
            java.lang.String r3 = X.AnonymousClass000.A00(r3)
            boolean r3 = X.0qQ.A0K(r5, r3)
            if (r3 == 0) goto L_0x0516
            boolean r3 = X.C267044ar.A00(r10, r12)
            if (r3 == 0) goto L_0x0516
        L_0x0481:
            java.util.ArrayList r12 = X.AnonymousClass7TE.A1C()
            r12.addAll(r13)
            int r10 = r6.A01
            int r3 = r13.size()
            if (r10 <= r3) goto L_0x0491
            r10 = r3
        L_0x0491:
            java.lang.String r14 = r6.A05
            java.lang.String r13 = r6.A04
            X.Nfe r4 = new X.Nfe
            r4.<init>(r5)
            java.lang.Integer r25 = X.AnonymousClass05K.A01
            java.lang.String r6 = r6.A03
            X.UqJ r3 = new X.UqJ
            r23 = r3
            r24 = r4
            r26 = r14
            r27 = r13
            r28 = r5
            r29 = r6
            r30 = r10
            r23.<init>(r24, r25, r26, r27, r28, r29, r30)
            r12.add(r10, r3)
            r13 = r12
        L_0x04b5:
            r8.addAll(r13)
            java.lang.String r3 = r2.A08
            if (r3 == 0) goto L_0x04cd
            X.GKw r6 = new X.GKw
            r6.<init>(r3)
            java.lang.Integer r5 = X.AnonymousClass05K.A01
            java.lang.Integer r4 = X.AnonymousClass05K.A0j
            X.Jw7 r3 = new X.Jw7
            r3.<init>((X.C266444Yx) r6, (java.lang.Integer) r5, (java.lang.Integer) r4)
            r8.add(r3)
        L_0x04cd:
            r8.addAll(r7)
            X.HjD r3 = r2.A03
            if (r3 == 0) goto L_0x0553
            com.instagram.model.keyword.KeywordRecommendations r6 = r3.A00
            if (r6 == 0) goto L_0x0553
            r5 = 2131968421(0x7f1341a5, float:1.9573736E38)
            java.lang.String r3 = r11.A0B
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            X.HsR r4 = new X.HsR
            r4.<init>(r3, r5)
            X.UqI r3 = new X.UqI
            r3.<init>(r4)
            r8.add(r3)
            java.lang.String r3 = r6.A01
            X.Jw7 r3 = X.C18690Vwo.A02(r3)
            r8.add(r3)
            java.util.List r3 = r6.A02
            java.util.ArrayList r6 = X.AnonymousClass7TF.A0p(r3)
            java.util.Iterator r5 = r3.iterator()
        L_0x0501:
            boolean r3 = r5.hasNext()
            if (r3 == 0) goto L_0x055f
            java.lang.Object r4 = r5.next()
            com.instagram.model.keyword.Keyword r4 = (com.instagram.model.keyword.Keyword) r4
            X.Mn4 r3 = new X.Mn4
            r3.<init>(r4)
            r6.add(r3)
            goto L_0x0501
        L_0x0516:
            r3 = 4160(0x1040, float:5.83E-42)
            java.lang.String r3 = X.AnonymousClass000.A00(r3)
            boolean r3 = X.0qQ.A0K(r5, r3)
            if (r3 != 0) goto L_0x0481
            r3 = 5204(0x1454, float:7.292E-42)
            java.lang.String r3 = X.AnonymousClass000.A00(r3)
            boolean r3 = X.0qQ.A0K(r5, r3)
            if (r3 == 0) goto L_0x0461
            X.1Av r14 = X.1Au.A00(r12)
            X.0s0 r15 = r14.A1t
            X.0YZ[] r4 = X.1Av.A8a
            r3 = 488(0x1e8, float:6.84E-43)
            boolean r3 = X.AnonymousClass7TG.A1a(r14, r15, r4, r3)
            if (r3 != 0) goto L_0x0461
            boolean r3 = X.C267044ar.A01(r10, r12)
            if (r3 != 0) goto L_0x0481
            X.0Tu r14 = X.0Tu.A05
            r3 = 36322190531569658(0x810ad7001927fa, double:3.033637777661905E-306)
            boolean r3 = X.182.A06(r14, r12, r3)
            if (r3 == 0) goto L_0x0461
            goto L_0x0481
        L_0x0553:
            r44 = 0
            goto L_0x0564
        L_0x0556:
            r3 = r32
            java.util.ArrayList r36 = X.00k.A0S(r5, r3)
            r44 = 0
            goto L_0x0570
        L_0x055f:
            r8.addAll(r6)
            r44 = 1
        L_0x0564:
            X.01N r3 = X.0jo.A1I(r8)
            java.util.List r3 = X.00k.A0a(r3)
            java.util.ArrayList r36 = X.00k.A0S(r3, r9)
        L_0x0570:
            X.N3M r6 = r1.A07
            if (r6 != 0) goto L_0x0576
            X.N3M r6 = r2.A01
        L_0x0576:
            X.OEW r5 = r1.A09
            if (r5 != 0) goto L_0x057c
            X.OEW r5 = r2.A04
        L_0x057c:
            java.lang.Integer r29 = X.AnonymousClass05K.A01
            boolean r3 = r2.CKA()
            if (r3 == 0) goto L_0x0620
            java.lang.String r4 = r2.getNextMaxId()
            if (r4 == 0) goto L_0x0620
            X.Nfw r3 = new X.Nfw
            r3.<init>(r4)
        L_0x058f:
            java.lang.String r31 = r2.BjE()
            int r39 = r19 + 1
            boolean r4 = r1.A0K
            if (r4 != 0) goto L_0x059d
            r42 = 0
            if (r17 == 0) goto L_0x059f
        L_0x059d:
            r42 = 1
        L_0x059f:
            java.util.Map r7 = r1.A0J
            r4 = r20
            java.util.LinkedHashMap r37 = X.0Yt.A04(r7, r4)
            int r40 = r32.size()
            boolean r4 = r1.A0M
            if (r4 != 0) goto L_0x061d
            java.util.List r4 = r2.A09
            boolean r4 = X.AnonymousClass7TE.A1b(r4)
            if (r4 == 0) goto L_0x05c3
            X.Hoa r4 = r2.A02
            if (r4 == 0) goto L_0x05c3
            java.util.List r4 = r4.A05
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L_0x061d
        L_0x05c3:
            r43 = 0
        L_0x05c5:
            r25 = 0
            X.Hoa r2 = r2.A02
            if (r2 == 0) goto L_0x0619
            java.lang.String r11 = r2.A00
            java.lang.String r10 = r2.A04
            java.lang.String r9 = r2.A01
        L_0x05d1:
            X.Jvf r2 = r1.A06
            boolean r13 = r2.A04
            java.lang.String r8 = r2.A02
            java.lang.String r7 = r2.A03
            boolean r12 = r2.A05
            java.lang.Object r2 = r2.A01
            X.N62 r2 = (X.N62) r2
            r4 = r22
            X.AnonymousClass7TF.A1B(r8, r4, r7)
            X.Jvf r23 = new X.Jvf
            r45 = r23
            r46 = r2
            r47 = r8
            r48 = r7
            r49 = r13
            r51 = r12
            r45.<init>(r46, r47, r48, r49, r50, r51)
            r41 = 15083520(0xe62800, float:2.1136513E-38)
            r22 = r18
            r24 = r6
            r26 = r5
            r27 = r3
            r28 = r1
            r30 = r25
            r32 = r25
            r33 = r11
            r34 = r10
            r35 = r9
            r38 = r21
            r45 = r0
            r46 = r0
            r47 = r0
            X.N4N r0 = X.N4N.A00(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47)
            return r0
        L_0x0619:
            r11 = 0
            r10 = 0
            r9 = 0
            goto L_0x05d1
        L_0x061d:
            r43 = 1
            goto L_0x05c5
        L_0x0620:
            X.HEN r3 = X.HEN.A00
            goto L_0x058f
        L_0x0624:
            X.2Uy r5 = X.C51968G9o.A0a(r10)
            java.lang.Object r3 = r0.A02
            X.GMQ r3 = (X.GMQ) r3
            java.lang.Object r2 = r3.A05
            X.3Zt r2 = (X.C243673Zt) r2
            android.view.View r1 = r5.A01
            r2.A00(r1)
            java.lang.Object r4 = r0.A03
            X.2Vt r4 = (X.C70802Vt) r4
            java.lang.Object r6 = r0.A01
            X.JLq r6 = (X.C59492JLq) r6
            java.lang.Object r8 = r0.A05
            X.0sP r8 = (X.0sP) r8
            java.lang.Object r7 = r0.A04
            X.JNz r7 = (X.C59553JNz) r7
            boolean r9 = r0.A06
            boolean r0 = X.GMP.A01(r3, r4, r5, r6, r7, r8, r9)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L_0x0650:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58798Ixj.invoke(java.lang.Object):java.lang.Object");
    }
}
