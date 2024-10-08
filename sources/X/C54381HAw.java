package X;

/* renamed from: X.HAw  reason: case insensitive filesystem */
public final class C54381HAw extends C324596za {
    public final int A00;
    public final Object A01;
    public final boolean A02;

    public C54381HAw(int i, Object obj, boolean z) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = z;
    }

    public static void A00(1OC r1, C324356z9 r2, Object obj, int i, boolean z) {
        r2.A03(r1, new C54381HAw(i, obj, z));
    }

    public final void onFail(C268654dm r6) {
        int A03;
        int i;
        switch (this.A00) {
            case 0:
                A03 = AnonymousClass0fD.A03(-155592959);
                C54178H1y h1y = (C54178H1y) this.A01;
                C59689JTv.A07(h1y.requireContext(), 2131968258);
                C54178H1y.A01(h1y, false);
                i = -1140860733;
                break;
            case 1:
                A03 = AnonymousClass0fD.A03(754515067);
                i = 872901879;
                break;
            case 2:
                A03 = AnonymousClass0fD.A03(-155516598);
                ((C54372HAn) this.A01).A03.DeI();
                i = -1586019549;
                break;
            case 3:
                A03 = AnonymousClass0fD.A03(-2073013934);
                ((C54374HAp) this.A01).A04.DeI();
                i = 519319370;
                break;
            case 4:
                A03 = AnonymousClass0fD.A03(918334613);
                ((C54375HAq) this.A01).A05.DeI();
                i = -1579655749;
                break;
            case 5:
                A03 = AnonymousClass0fD.A03(1175495417);
                C54175H1v h1v = (C54175H1v) this.A01;
                h1v.A03.A0C();
                C59689JTv.A0F(h1v.getActivity(), "save_media_request_failed", 2131956760);
                C54175H1v.A01(h1v);
                i = 639769374;
                break;
            case 6:
                A03 = AnonymousClass0fD.A03(-468791897);
                ((C54371HAm) this.A01).A01.DeI();
                i = -149697636;
                break;
            default:
                A03 = AnonymousClass0fD.A03(1293221249);
                ((C54376HAr) this.A01).A09.DeI();
                i = -851263737;
                break;
        }
        AnonymousClass0fD.A0A(i, A03);
    }

    public final void onFinish() {
        int A03;
        int i;
        switch (this.A00) {
            case 0:
                A03 = AnonymousClass0fD.A03(476151747);
                C54178H1y h1y = (C54178H1y) this.A01;
                if (h1y.mView != null) {
                    ((C238143As) h1y.getScrollingViewProxy()).setIsLoading(false);
                }
                C54178H1y.A01(h1y, false);
                i = -736342658;
                break;
            case 1:
                A03 = AnonymousClass0fD.A03(-1831118102);
                i = -865677389;
                break;
            case 2:
                A03 = AnonymousClass0fD.A03(594726679);
                ((C54372HAn) this.A01).A03.DeS();
                i = 898418392;
                break;
            case 3:
                A03 = AnonymousClass0fD.A03(-1488387897);
                ((C54374HAp) this.A01).A04.DeS();
                i = 1398415879;
                break;
            case 4:
                A03 = AnonymousClass0fD.A03(1405849013);
                ((C54375HAq) this.A01).A05.DeS();
                i = 1654247050;
                break;
            case 5:
                A03 = AnonymousClass0fD.A03(-601833383);
                i = 1150159136;
                break;
            case 6:
                A03 = AnonymousClass0fD.A03(372463294);
                ((C54371HAm) this.A01).A01.DeS();
                i = -1046165819;
                break;
            default:
                A03 = AnonymousClass0fD.A03(-1482656774);
                ((C54376HAr) this.A01).A09.DeS();
                i = 583563978;
                break;
        }
        AnonymousClass0fD.A0A(i, A03);
    }

    public final void onStart() {
        int A03;
        int i;
        switch (this.A00) {
            case 0:
                A03 = AnonymousClass0fD.A03(873564335);
                C54178H1y h1y = (C54178H1y) this.A01;
                if (h1y.mView != null) {
                    ((C238143As) h1y.getScrollingViewProxy()).setIsLoading(true);
                }
                C54178H1y.A01(h1y, false);
                i = 1147493857;
                break;
            case 1:
                A03 = AnonymousClass0fD.A03(1204303428);
                i = 1643158368;
                break;
            case 2:
                A03 = AnonymousClass0fD.A03(-51619391);
                ((C54372HAn) this.A01).A03.Dei();
                i = 1380198351;
                break;
            case 3:
                A03 = AnonymousClass0fD.A03(-647609299);
                ((C54374HAp) this.A01).A04.Dei();
                i = 1364494732;
                break;
            case 4:
                A03 = AnonymousClass0fD.A03(-1748952590);
                ((C54375HAq) this.A01).A05.Dei();
                i = -1609178147;
                break;
            case 5:
                A03 = AnonymousClass0fD.A03(1822474842);
                i = 878891046;
                break;
            case 6:
                A03 = AnonymousClass0fD.A03(149908560);
                ((C54371HAm) this.A01).A01.Dei();
                i = 20981277;
                break;
            default:
                A03 = AnonymousClass0fD.A03(1056497015);
                ((C54376HAr) this.A01).A09.Dei();
                i = 455064078;
                break;
        }
        AnonymousClass0fD.A0A(i, A03);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:77:0x026c, code lost:
        X.AnonymousClass0fD.A0A(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x026f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0300, code lost:
        if (r1 != false) goto L_0x0302;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x030f, code lost:
        X.AnonymousClass0fD.A0A(r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0312, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r15) {
        /*
            r14 = this;
            int r0 = r14.A00
            switch(r0) {
                case 0: goto L_0x02c7;
                case 1: goto L_0x029a;
                case 2: goto L_0x0270;
                case 3: goto L_0x01e5;
                case 4: goto L_0x017f;
                case 5: goto L_0x0083;
                case 6: goto L_0x0055;
                default: goto L_0x0005;
            }
        L_0x0005:
            r0 = 909001502(0x362e431e, float:2.5967088E-6)
            int r0 = X.AnonymousClass0fD.A03(r0)
            X.1XO r15 = (X.1XO) r15
            r1 = 1521860451(0x5ab5bf63, float:2.55787014E16)
            int r2 = X.AnonymousClass7TG.A0D(r15, r1)
            java.lang.Object r6 = r14.A01
            X.HAr r6 = (X.C54376HAr) r6
            X.0eM r1 = r6.A0C
            boolean r4 = X.AnonymousClass7TF.A1Z(r1)
            X.1Xi r3 = X.1Xg.A0A
            java.util.List r1 = r15.A06
            X.0qQ.A07(r1)
            java.util.List r1 = r3.A06(r1)
            java.util.ArrayList r7 = X.00k.A0U(r1)
            if (r4 == 0) goto L_0x0225
            java.util.LinkedHashSet r5 = X.DbS.A0y()
            java.util.Iterator r4 = r7.iterator()
        L_0x0038:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x0050
            java.lang.Object r3 = r4.next()
            X.JRI r1 = r6.A09
            X.3W1 r1 = r1.BQs(r3)
            boolean r1 = r1.A2l
            if (r1 == 0) goto L_0x0038
            r5.add(r3)
            goto L_0x0038
        L_0x0050:
            r7.removeAll(r5)
            goto L_0x024f
        L_0x0055:
            r0 = -844371255(0xffffffffcdabeac9, float:-3.60536352E8)
            int r2 = X.AnonymousClass0fD.A03(r0)
            X.CGM r15 = (X.CGM) r15
            r0 = 347525566(0x14b6d1be, float:1.8460032E-26)
            int r1 = X.AnonymousClass0fD.A03(r0)
            r7 = 0
            X.0qQ.A0B(r15, r7)
            java.lang.Object r0 = r14.A01
            X.HAm r0 = (X.C54371HAm) r0
            X.JRI r3 = r0.A01
            java.util.ArrayList r6 = r15.A04
            boolean r8 = r14.A02
            r4 = 0
            r5 = r4
            r3.Dex(r4, r5, r6, r7, r8)
            r0 = 331038655(0x13bb3fbf, float:4.7268295E-27)
            X.AnonymousClass0fD.A0A(r0, r1)
            r0 = -1521780878(0xffffffffa54b7772, float:-1.7647913E-16)
            goto L_0x030f
        L_0x0083:
            r0 = -1352780412(0xffffffffaf5e3584, float:-2.0209795E-10)
            int r0 = X.AnonymousClass0fD.A03(r0)
            X.HE8 r15 = (X.HE8) r15
            r1 = 2031735373(0x7919d24d, float:4.9917927E34)
            int r4 = X.AnonymousClass0fD.A03(r1)
            boolean r5 = r14.A02
            if (r5 == 0) goto L_0x00a5
            java.lang.Object r1 = r14.A01
            X.H1v r1 = (X.C54175H1v) r1
            X.H3r r2 = r1.A03
            X.4n0 r1 = r2.A00
            r1.A04()
            r2.A0C()
        L_0x00a5:
            java.util.ArrayList r9 = X.AnonymousClass7TE.A1C()
            java.util.List r1 = r15.A01
            java.util.Iterator r2 = r1.iterator()
        L_0x00af:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x00c1
            java.lang.Object r1 = r2.next()
            X.Hj6 r1 = (X.C55524Hj6) r1
            X.1Xj r1 = r1.A00
            r9.add(r1)
            goto L_0x00af
        L_0x00c1:
            java.lang.Object r6 = r14.A01
            X.H1v r6 = (X.C54175H1v) r6
            X.H3r r3 = r6.A03
            X.4n0 r2 = r3.A00
            r2.A0A(r9)
            X.2ms r1 = r3.A04
            boolean r1 = r1.CKB()
            r2.A01 = r1
            r3.A0C()
            X.6yu r10 = r6.A02
            r8 = 1
            if (r5 == 0) goto L_0x00e3
            android.content.Context r2 = r10.A00
            com.instagram.common.session.UserSession r1 = r10.A02
            X.AnonymousClass46O.A00(r2, r1, r8)
        L_0x00e3:
            int r7 = r9.size()
            r5 = 0
        L_0x00e8:
            if (r5 >= r7) goto L_0x0155
            java.lang.Object r11 = r9.get(r5)
            X.1Xj r11 = (X.1Xj) r11
            boolean r1 = r11.A4w()
            if (r1 == 0) goto L_0x0144
            r11.CeS()
            r12 = 1
            boolean r1 = com.facebook.systrace.Systrace.A0E(r12)     // Catch:{ all -> 0x0147 }
            if (r1 == 0) goto L_0x0109
            java.lang.String r2 = "preloadResources"
            r1 = 1877607526(0x6fea0466, float:1.4484962E29)
            X.0fS.A01(r2, r1)     // Catch:{ all -> 0x0147 }
        L_0x0109:
            com.instagram.common.typedurl.ImageUrl r3 = r11.A1Q()     // Catch:{ all -> 0x0147 }
            if (r3 == 0) goto L_0x0132
            X.1NK r2 = X.1NK.A00()     // Catch:{ all -> 0x0147 }
            X.0iw r1 = r10.A01     // Catch:{ all -> 0x0147 }
            java.lang.String r1 = r1.getModuleName()     // Catch:{ all -> 0x0147 }
            X.1OO r1 = r2.A0J(r3, r1)     // Catch:{ all -> 0x0147 }
            r1.A0I = r8     // Catch:{ all -> 0x0147 }
            X.2iF r1 = r1.A00()     // Catch:{ all -> 0x0147 }
            java.util.List r3 = r10.A03     // Catch:{ all -> 0x0147 }
            X.IfV r2 = new X.IfV     // Catch:{ all -> 0x0147 }
            r2.<init>(r1)     // Catch:{ all -> 0x0147 }
            X.Ijm r1 = new X.Ijm     // Catch:{ all -> 0x0147 }
            r1.<init>(r5, r2)     // Catch:{ all -> 0x0147 }
            r3.add(r1)     // Catch:{ all -> 0x0147 }
        L_0x0132:
            r11.A0o()     // Catch:{ all -> 0x0147 }
            r11.CeS()     // Catch:{ all -> 0x0147 }
            boolean r1 = com.facebook.systrace.Systrace.A0E(r12)
            if (r1 == 0) goto L_0x0144
            r1 = 357032026(0x1547e05a, float:4.0364712E-26)
            X.0fS.A00(r1)
        L_0x0144:
            int r5 = r5 + 1
            goto L_0x00e8
        L_0x0147:
            r1 = move-exception
            boolean r0 = com.facebook.systrace.Systrace.A0E(r12)
            if (r0 == 0) goto L_0x0154
            r0 = 40312831(0x2671fff, float:1.6980382E-37)
            X.0fS.A00(r0)
        L_0x0154:
            throw r1
        L_0x0155:
            java.util.List r3 = r10.A03
            X.01V.A1C(r3)
            java.util.Iterator r2 = r3.iterator()
        L_0x015e:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x016e
            java.lang.Object r1 = r2.next()
            X.Ijm r1 = (X.C57993Ijm) r1
            r1.run()
            goto L_0x015e
        L_0x016e:
            r3.clear()
            X.C54175H1v.A01(r6)
            r1 = 101566995(0x60dca13, float:2.6667613E-35)
            X.AnonymousClass0fD.A0A(r1, r4)
            r1 = -1807333813(0xffffffff9446464b, float:-1.0010308E-26)
            goto L_0x026c
        L_0x017f:
            r0 = -1360709050(0xffffffffaee53a46, float:-1.0424066E-10)
            int r0 = X.AnonymousClass0fD.A03(r0)
            X.HE8 r15 = (X.HE8) r15
            r1 = 838483460(0x31fa3e04, float:7.283008E-9)
            int r3 = X.AnonymousClass0fD.A03(r1)
            java.lang.Object r4 = r14.A01
            X.HAq r4 = (X.C54375HAq) r4
            com.instagram.common.session.UserSession r5 = r4.A04
            r8 = 0
            X.0qQ.A0B(r5, r8)
            java.lang.Class<X.IOj> r2 = X.C57095IOj.class
            X.Ish r1 = X.C58486Ish.A00
            java.lang.Object r2 = r5.A01(r2, r1)
            X.IOj r2 = (X.C57095IOj) r2
            boolean r9 = r14.A02
            X.0qQ.A0B(r15, r8)
            if (r9 == 0) goto L_0x01b2
            r1 = 1
            r2.A00 = r1
            java.util.LinkedList r1 = r2.A01
            r1.clear()
        L_0x01b2:
            java.util.LinkedList r1 = r2.A01
            r1.add(r15)
            java.util.ArrayList r7 = X.AnonymousClass7TE.A1C()
            java.util.List r1 = r15.A01
            java.util.Iterator r2 = r1.iterator()
        L_0x01c1:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x01d3
            java.lang.Object r1 = r2.next()
            X.Hj6 r1 = (X.C55524Hj6) r1
            X.1Xj r1 = r1.A00
            r7.add(r1)
            goto L_0x01c1
        L_0x01d3:
            X.JRI r4 = r4.A05
            r5 = 0
            r6 = r5
            r4.Dex(r5, r6, r7, r8, r9)
            r1 = -64121543(0xfffffffffc2d9539, float:-3.6051758E36)
            X.AnonymousClass0fD.A0A(r1, r3)
            r1 = -1679703952(0xffffffff9be1c070, float:-3.7347487E-22)
            goto L_0x026c
        L_0x01e5:
            r0 = 190118553(0xb54fa99, float:4.1018244E-32)
            int r0 = X.AnonymousClass0fD.A03(r0)
            X.1XO r15 = (X.1XO) r15
            r1 = 2122443748(0x7e81ebe4, float:8.634761E37)
            int r3 = X.AnonymousClass0fD.A03(r1)
            r8 = 0
            java.util.ArrayList r7 = X.AnonymousClass7TF.A0q(r15, r8)
            java.util.List r1 = r15.A06
            java.util.Iterator r2 = r1.iterator()
        L_0x0200:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x020e
            java.lang.Object r1 = r2.next()
            r7.add(r1)
            goto L_0x0200
        L_0x020e:
            java.lang.Object r1 = r14.A01
            X.HAp r1 = (X.C54374HAp) r1
            X.JRI r4 = r1.A04
            boolean r9 = r14.A02
            r5 = 0
            r6 = r5
            r4.Dex(r5, r6, r7, r8, r9)
            r1 = -1789732332(0xffffffff9552da14, float:-4.2581196E-26)
            X.AnonymousClass0fD.A0A(r1, r3)
            r1 = -1946205173(0xffffffff8bff440b, float:-9.8324807E-32)
            goto L_0x026c
        L_0x0225:
            java.lang.String r5 = r6.A02
            if (r5 == 0) goto L_0x024f
            java.util.Iterator r4 = r7.iterator()
        L_0x022d:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x024c
            java.lang.Object r3 = r4.next()
            X.1Xg r3 = (X.1Xg) r3
            X.1Xj r1 = X.C51965G9l.A0o(r3)
            if (r1 == 0) goto L_0x022d
            java.lang.String r1 = r1.A2n()
            boolean r1 = r5.equals(r1)
            if (r1 == 0) goto L_0x022d
            r7.remove(r3)
        L_0x024c:
            r1 = 0
            r6.A02 = r1
        L_0x024f:
            boolean r1 = r7.isEmpty()
            if (r1 == 0) goto L_0x0259
            r1 = 1
            X.C54376HAr.A02(r6, r1)
        L_0x0259:
            X.JRI r4 = r6.A09
            r8 = 1
            boolean r9 = r14.A02
            r5 = 0
            r6 = r5
            r4.Dex(r5, r6, r7, r8, r9)
            r1 = 2089061744(0x7c848d70, float:5.506015E36)
            X.AnonymousClass0fD.A0A(r1, r2)
            r1 = -662319102(0xffffffffd885d002, float:-1.17702747E15)
        L_0x026c:
            X.AnonymousClass0fD.A0A(r1, r0)
            return
        L_0x0270:
            r0 = -588117708(0xffffffffdcf20934, float:-5.45016506E17)
            int r2 = X.AnonymousClass0fD.A03(r0)
            X.1XO r15 = (X.1XO) r15
            r0 = -1489958860(0xffffffffa7310834, float:-2.4568131E-15)
            int r1 = X.AnonymousClass7TG.A0D(r15, r0)
            java.lang.Object r0 = r14.A01
            X.HAn r0 = (X.C54372HAn) r0
            X.JRI r3 = r0.A03
            java.util.List r6 = r15.A06
            boolean r8 = r14.A02
            r7 = 1
            r4 = 0
            r5 = r4
            r3.Dex(r4, r5, r6, r7, r8)
            r0 = -1838289308(0xffffffff926dee64, float:-7.5077853E-28)
            X.AnonymousClass0fD.A0A(r0, r1)
            r0 = -506954745(0xffffffffe1c87c07, float:-4.6228574E20)
            goto L_0x030f
        L_0x029a:
            r0 = -1212389932(0xffffffffb7bc65d4, float:-2.2458764E-5)
            int r2 = X.AnonymousClass0fD.A03(r0)
            X.1XO r15 = (X.1XO) r15
            r0 = 1654324891(0x629afe9b, float:1.4295724E21)
            int r5 = X.AnonymousClass7TG.A0D(r15, r0)
            java.lang.Object r4 = r14.A01
            X.GhV r4 = (X.C53039GhV) r4
            java.util.List r3 = r15.A06
            X.0qQ.A07(r3)
            boolean r1 = r14.A02
            X.HB6 r0 = new X.HB6
            r0.<init>(r3, r1)
            r4.A05(r0)
            r0 = -381060892(0xffffffffe94978e4, float:-1.5222811E25)
            X.AnonymousClass0fD.A0A(r0, r5)
            r0 = 245104597(0xe9bffd5, float:3.8456807E-30)
            goto L_0x030f
        L_0x02c7:
            r0 = -1770109152(0xffffffff967e4720, float:-2.05404E-25)
            int r2 = X.AnonymousClass0fD.A03(r0)
            X.Gyz r15 = (X.C54075Gyz) r15
            r0 = 467364035(0x1bdb68c3, float:3.6298212E-22)
            int r5 = X.AnonymousClass7TG.A0D(r15, r0)
            boolean r0 = r14.A02
            java.lang.String r4 = "listAdapter"
            if (r0 == 0) goto L_0x02e8
            java.lang.Object r0 = r14.A01
            X.H1y r0 = (X.C54178H1y) r0
            X.E9H r0 = r0.A00
            if (r0 == 0) goto L_0x0313
            r0.clear()
        L_0x02e8:
            java.lang.Object r3 = r14.A01
            X.H1y r3 = (X.C54178H1y) r3
            X.E9H r1 = r3.A00
            if (r1 == 0) goto L_0x0313
            java.util.List r0 = r15.A01
            r1.A01 = r0
            X.E9H.A00(r1)
            java.util.List r0 = r15.A01
            if (r0 == 0) goto L_0x0302
            boolean r1 = r0.isEmpty()
            r0 = 0
            if (r1 == 0) goto L_0x0303
        L_0x0302:
            r0 = 1
        L_0x0303:
            X.C54178H1y.A01(r3, r0)
            r0 = 1344801643(0x50280b6b, float:1.12772823E10)
            X.AnonymousClass0fD.A0A(r0, r5)
            r0 = 1917839193(0x724fe759, float:4.117957E30)
        L_0x030f:
            X.AnonymousClass0fD.A0A(r0, r2)
            return
        L_0x0313:
            X.0qQ.A0F(r4)
            X.00P r1 = X.AnonymousClass00P.createAndThrow()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C54381HAw.onSuccess(java.lang.Object):void");
    }

    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        int A03;
        int i;
        switch (this.A00) {
            case 0:
                A03 = AnonymousClass0fD.A03(1966093322);
                int A032 = AnonymousClass0fD.A03(498150465);
                AnonymousClass0eM r0 = ((C54178H1y) this.A01).A07;
                AnonymousClass4HO.A00(AnonymousClass7TE.A0l(r0), new AnonymousClass4HN(AnonymousClass7TE.A0l(r0))).A03(true);
                AnonymousClass0fD.A0A(-1359426925, A032);
                i = -1801325973;
                break;
            case 1:
                A03 = AnonymousClass0fD.A03(-1087617517);
                AnonymousClass0fD.A0A(698411925, AnonymousClass0fD.A03(-46817429));
                i = 2088815876;
                break;
            case 2:
                A03 = AnonymousClass0fD.A03(1793237801);
                AnonymousClass0fD.A0A(1236596851, AnonymousClass0fD.A03(-1639960225));
                i = -1003843055;
                break;
            case 3:
                A03 = AnonymousClass0fD.A03(366464733);
                AnonymousClass0fD.A0A(-1332114010, AnonymousClass0fD.A03(203012159));
                i = -353235080;
                break;
            case 4:
                A03 = AnonymousClass0fD.A03(1914949086);
                AnonymousClass0fD.A0A(-253606309, AnonymousClass0fD.A03(-2056300544));
                i = 1085935458;
                break;
            case 5:
                A03 = AnonymousClass0fD.A03(-1351036869);
                AnonymousClass0fD.A0A(-564443904, AnonymousClass0fD.A03(808448102));
                i = -1444987212;
                break;
            case 6:
                A03 = AnonymousClass0fD.A03(563371906);
                AnonymousClass0fD.A0A(-144563648, AnonymousClass0fD.A03(1780092356));
                i = 902203471;
                break;
            default:
                A03 = AnonymousClass0fD.A03(-56978028);
                AnonymousClass0fD.A0A(-2135307495, AnonymousClass0fD.A03(-511263398));
                i = 1015351690;
                break;
        }
        AnonymousClass0fD.A0A(i, A03);
    }
}
