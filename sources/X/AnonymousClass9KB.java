package X;

/* renamed from: X.9KB  reason: invalid class name */
public final class AnonymousClass9KB extends AnonymousClass1Ek implements 0sL {
    public Object A00;
    public final int A01;
    public final Object A02;
    public final Object A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass9KB(Object obj, Object obj2, Object obj3, AnonymousClass4D7 r5, int i) {
        super(2, r5);
        this.A01 = i;
        this.A03 = obj;
        this.A00 = obj2;
        this.A02 = obj3;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.9KB, X.4D7] */
    /* JADX WARNING: type inference failed for: r3v1, types: [X.9KB, X.4D7] */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0039, code lost:
        return new X.AnonymousClass9KB(r4, r5, r6, r7, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        r3 = new X.AnonymousClass9KB(r2, r1, r11, r0);
        r3.A00 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0012, code lost:
        return r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass4D7 create(java.lang.Object r10, X.AnonymousClass4D7 r11) {
        /*
            r9 = this;
            int r0 = r9.A01
            r7 = r11
            switch(r0) {
                case 0: goto L_0x0013;
                case 1: goto L_0x0019;
                case 2: goto L_0x001f;
                case 3: goto L_0x0025;
                case 4: goto L_0x002d;
                default: goto L_0x0006;
            }
        L_0x0006:
            java.lang.Object r2 = r9.A03
            java.lang.Object r1 = r9.A02
            r0 = 5
        L_0x000b:
            X.9KB r3 = new X.9KB
            r3.<init>(r2, r1, r11, r0)
            r3.A00 = r10
            return r3
        L_0x0013:
            java.lang.Object r2 = r9.A03
            java.lang.Object r1 = r9.A02
            r0 = 0
            goto L_0x000b
        L_0x0019:
            java.lang.Object r2 = r9.A03
            java.lang.Object r1 = r9.A02
            r0 = 1
            goto L_0x000b
        L_0x001f:
            java.lang.Object r2 = r9.A03
            java.lang.Object r1 = r9.A02
            r0 = 2
            goto L_0x000b
        L_0x0025:
            java.lang.Object r4 = r9.A03
            java.lang.Object r5 = r9.A00
            java.lang.Object r6 = r9.A02
            r8 = 3
            goto L_0x0034
        L_0x002d:
            java.lang.Object r4 = r9.A03
            java.lang.Object r5 = r9.A00
            java.lang.Object r6 = r9.A02
            r8 = 4
        L_0x0034:
            X.9KB r3 = new X.9KB
            r3.<init>(r4, r5, r6, r7, r8)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9KB.create(java.lang.Object, X.4D7):X.4D7");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AnonymousClass9KB) create(obj, (AnonymousClass4D7) obj2)).invokeSuspend(C60340gF.A00);
    }

    /* JADX WARNING: type inference failed for: r0v24, types: [X.7yb, X.3FZ] */
    /* JADX WARNING: type inference failed for: r0v56, types: [X.3B3, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x066b, code lost:
        if (r6 != null) goto L_0x0654;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01d6, code lost:
        if ((r1 instanceof X.C62222KcI) != false) goto L_0x01d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01ed, code lost:
        if (r0 != null) goto L_0x0232;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            r17 = this;
            r5 = r17
            int r0 = r5.A01
            switch(r0) {
                case 0: goto L_0x0679;
                case 1: goto L_0x0594;
                case 2: goto L_0x04c2;
                case 3: goto L_0x049e;
                case 4: goto L_0x035f;
                default: goto L_0x0007;
            }
        L_0x0007:
            X.0eS.A00(r18)
            java.lang.Object r1 = r5.A00
            X.Kns r1 = (X.C62878Kns) r1
            boolean r0 = r1 instanceof X.C62223KcJ
            if (r0 != 0) goto L_0x0316
            X.Kcb r0 = X.C62241Kcb.A00
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x0316
            boolean r0 = r1 instanceof X.C62215KcB
            if (r0 != 0) goto L_0x030b
            X.KcC r0 = X.C62216KcC.A00
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x030b
            boolean r0 = r1 instanceof X.C62213Kc9
            if (r0 == 0) goto L_0x00a6
            java.lang.Object r7 = r5.A03
            X.6gj r7 = (X.C313616gj) r7
            java.lang.String r4 = "ufi"
        L_0x0030:
            X.4gL r6 = r7.A00
            if (r6 == 0) goto L_0x00a3
            X.6Jt r0 = r7.A01
            if (r0 == 0) goto L_0x003d
            android.view.ViewGroup r0 = r0.A0V
            X.0nA.A0N(r0)
        L_0x003d:
            X.K4Q r5 = new X.K4Q
            r5.<init>()
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            com.instagram.common.session.UserSession r2 = r7.A0N
            java.lang.String r1 = r2.A05
            java.lang.String r0 = "IgSessionManager.SESSION_TOKEN_KEY"
            r3.putString(r0, r1)
            java.lang.String r1 = r6.A0X
            r1.getClass()
            r0 = 2622(0xa3e, float:3.674E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r3.putString(r0, r1)
            r5.setArguments(r3)
            r5.A00 = r7
            X.4DH r0 = r7.A0K
            androidx.fragment.app.FragmentActivity r1 = r0.getActivity()
            if (r1 == 0) goto L_0x0076
            X.37E r0 = X.AnonymousClass37D.A00
            X.37D r0 = r0.A01(r1)
            if (r0 == 0) goto L_0x0076
            r0.A0J(r5)
        L_0x0076:
            X.KVj r3 = X.C63492Kxw.A00(r2)
            X.0wc r2 = r3.A00
            java.lang.String r1 = "ig_user_pay_tap_user_pay_badge_cta"
            X.0kJ r0 = r2.A00
            X.0Aj r5 = r2.A00(r0, r1)
            X.LMi r2 = r3.A01
            java.lang.String r1 = r2.A02
            java.lang.String r0 = "media_id"
            r5.AAJ(r0, r1)
            java.lang.String r1 = r2.A03
            java.lang.String r0 = "product_type"
            r5.AAJ(r0, r1)
            java.lang.String r1 = r2.A01
            java.lang.String r0 = "container_module"
            r5.AAJ(r0, r1)
            java.lang.String r0 = "method"
        L_0x009d:
            r5.AAJ(r0, r4)
            r5.Cgf()
        L_0x00a3:
            X.0gF r0 = X.C60340gF.A00
            return r0
        L_0x00a6:
            boolean r0 = r1 instanceof X.C390109qk
            if (r0 == 0) goto L_0x0101
            X.9qk r1 = (X.C390109qk) r1
            boolean r0 = r1.A01
            if (r0 == 0) goto L_0x00b8
            java.lang.Object r7 = r5.A03
            X.6gj r7 = (X.C313616gj) r7
            java.lang.String r4 = "system_comment"
            goto L_0x0030
        L_0x00b8:
            java.lang.Object r7 = r5.A02
            X.0r1 r7 = (X.0r1) r7
            boolean r0 = r7.A00
            if (r0 == 0) goto L_0x00a3
            r0 = 0
            r7.A00 = r0
            X.1xC r6 = X.1xC.A01
            X.6ap r4 = new X.6ap
            r4.<init>()
            r4.A05()
            java.lang.String r0 = "live_user_pay_badges_system_comment_buy_error"
            r4.A0H = r0
            java.lang.Object r0 = r5.A03
            X.6gj r0 = (X.C313616gj) r0
            X.4DH r0 = r0.A0K
            android.content.Context r3 = r0.requireContext()
            r2 = 2131965417(0x7f1335e9, float:1.9567643E38)
            java.lang.String r0 = r1.A00
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r0 = r3.getString(r2, r0)
            r4.A0D = r0
            r1 = 11
            X.FdH r0 = new X.FdH
            r0.<init>(r7, r1)
            r4.A0A(r0)
            X.Dc2 r1 = r4.A00()
            X.3GP r0 = new X.3GP
            r0.<init>(r1)
            r6.A00(r0)
            goto L_0x00a3
        L_0x0101:
            boolean r0 = r1 instanceof X.C62232KcS
            r11 = 0
            if (r0 != 0) goto L_0x027b
            X.KcR r0 = X.C62231KcR.A00
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x027b
            X.9qm r0 = X.C390129qm.A00
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x027b
            boolean r0 = r1 instanceof X.C62228KcO
            if (r0 == 0) goto L_0x0124
            java.lang.Object r0 = r5.A03
            X.6gj r0 = (X.C313616gj) r0
            X.0sa r0 = r0.A0Z
            r0.invoke()
            goto L_0x00a3
        L_0x0124:
            boolean r0 = r1 instanceof X.C62192Kbo
            if (r0 == 0) goto L_0x013d
            java.lang.Object r0 = r5.A03
            X.6gj r0 = (X.C313616gj) r0
            X.6Jt r0 = r0.A01
            if (r0 == 0) goto L_0x00a3
            X.IOu r2 = r0.A09
            if (r2 == 0) goto L_0x00a3
            X.Kbo r1 = (X.C62192Kbo) r1
            java.lang.String r0 = r1.A00
            r2.A03(r0)
            goto L_0x00a3
        L_0x013d:
            boolean r0 = r1 instanceof X.C62199Kbv
            if (r0 != 0) goto L_0x01e6
            boolean r0 = r1 instanceof X.C62200Kbw
            if (r0 != 0) goto L_0x01ef
            boolean r0 = r1 instanceof X.C62185Kbh
            if (r0 != 0) goto L_0x01ef
            boolean r0 = r1 instanceof X.C390119ql
            if (r0 == 0) goto L_0x018f
            java.lang.Object r5 = r5.A03
            X.6gj r5 = (X.C313616gj) r5
            com.instagram.common.session.UserSession r6 = r5.A0N
            com.instagram.reels.store.ReelStore r4 = X.1OP.A05(r6)
            X.9ql r1 = (X.C390119ql) r1
            X.4gL r0 = r1.A01
            com.instagram.model.reels.Reel r7 = r4.A0G(r0)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.List r0 = r1.A02
            java.util.Iterator r2 = r0.iterator()
        L_0x016a:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x017e
            java.lang.Object r0 = r2.next()
            X.4gL r0 = (X.C270194gL) r0
            com.instagram.model.reels.Reel r0 = r4.A0G(r0)
            r3.add(r0)
            goto L_0x016a
        L_0x017e:
            androidx.fragment.app.FragmentActivity r5 = r5.A0J
            X.3BQ r8 = X.AnonymousClass3BQ.SUGGESTED_LIVE
            int r0 = r1.A00
            r13 = 0
            r9 = r11
            r10 = r11
            r11 = r3
            r12 = r0
            r14 = r13
            X.F8Q.A01(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            goto L_0x00a3
        L_0x018f:
            boolean r0 = r1 instanceof X.C62218KcE
            if (r0 == 0) goto L_0x01be
            java.lang.Object r2 = r5.A03
            X.6gj r2 = (X.C313616gj) r2
            com.instagram.common.session.UserSession r14 = r2.A0N
            X.0Tu r3 = X.0Tu.A05
            r0 = 36330196348977667(0x81121f00004203, double:3.0387006888275694E-306)
            boolean r0 = X.182.A06(r3, r14, r0)
            if (r0 == 0) goto L_0x0234
            r0 = 36893146302514127(0x83121f000203cf, double:3.3947125062615417E-306)
            java.lang.String r0 = X.182.A04(r3, r14, r0)
            android.net.Uri r1 = X.0cp.A03(r0)
            X.4DH r0 = r2.A0K
            android.content.Context r0 = r0.requireContext()
            X.0kR.A0F(r0, r1)
            goto L_0x00a3
        L_0x01be:
            boolean r0 = r1 instanceof X.C62210Kc6
            if (r0 != 0) goto L_0x01d8
            boolean r0 = r1 instanceof X.C62235KcV
            if (r0 == 0) goto L_0x01d4
            java.lang.Object r0 = r5.A03
            X.6gj r0 = (X.C313616gj) r0
            X.6gh r0 = r0.A0R
            X.4mU r1 = r0.A02
            r0 = 1
            r1.E4O(r0)
            goto L_0x00a3
        L_0x01d4:
            boolean r0 = r1 instanceof X.C62222KcI
            if (r0 == 0) goto L_0x00a3
        L_0x01d8:
            java.lang.Object r0 = r5.A03
            X.6gj r0 = (X.C313616gj) r0
            X.6gh r0 = r0.A0R
            X.4mU r1 = r0.A02
            r0 = 1
            r1.Crd(r0)
            goto L_0x00a3
        L_0x01e6:
            r0 = r1
            X.Kbv r0 = (X.C62199Kbv) r0
            if (r0 == 0) goto L_0x01ef
            java.lang.String r0 = r0.A00
            if (r0 != 0) goto L_0x0232
        L_0x01ef:
            boolean r0 = r1 instanceof X.C62200Kbw
            if (r0 == 0) goto L_0x0228
            r0 = r1
            X.Kbw r0 = (X.C62200Kbw) r0
            if (r0 == 0) goto L_0x0228
            java.lang.String r11 = r0.A00
        L_0x01fa:
            java.lang.Object r0 = r5.A03
            X.6gj r0 = (X.C313616gj) r0
            com.instagram.common.session.UserSession r6 = r0.A0N
            X.4DH r2 = r0.A0K
            java.lang.String r1 = r2.getModuleName()
            java.lang.String r0 = "reel_viewer_go_to_profile"
            X.Dfc r3 = X.C46548Dgp.A01(r6, r11, r0, r1)
            java.lang.Class<com.instagram.modal.ModalActivity> r7 = com.instagram.modal.ModalActivity.class
            X.1a0 r0 = X.C46447Df9.A03()
            X.1a1 r1 = r0.A01
            com.instagram.profile.intf.UserDetailLaunchConfig r0 = r3.A04()
            android.os.Bundle r5 = r1.A01(r6, r0)
            androidx.fragment.app.FragmentActivity r4 = r2.getActivity()
            java.lang.String r8 = "profile"
            X.6W8 r3 = new X.6W8
            r3.<init>(r4, r5, r6, r7, r8)
            goto L_0x026f
        L_0x0228:
            boolean r0 = r1 instanceof X.C62185Kbh
            if (r0 == 0) goto L_0x01fa
            X.Kbh r1 = (X.C62185Kbh) r1
            if (r1 == 0) goto L_0x01fa
            java.lang.String r0 = r1.A00
        L_0x0232:
            r11 = r0
            goto L_0x01fa
        L_0x0234:
            r0 = 36330196349043204(0x81121f00014204, double:3.038700688869015E-306)
            boolean r0 = X.182.A06(r3, r14, r0)
            if (r0 == 0) goto L_0x0248
            r0 = 36893146302514127(0x83121f000203cf, double:3.3947125062615417E-306)
            java.lang.String r11 = X.182.A04(r3, r14, r0)
        L_0x0248:
            java.lang.Class<com.instagram.modal.ModalActivity> r15 = com.instagram.modal.ModalActivity.class
            r3 = 0
            r0 = 3834(0xefa, float:5.373E-42)
            java.lang.String r10 = X.AnonymousClass000.A00(r0)
            r12 = 0
            r4 = r3
            r5 = r3
            r6 = r3
            r7 = r3
            r8 = r3
            r9 = r3
            r13 = r12
            android.os.Bundle r13 = X.C55247Hec.A00(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            X.4DH r2 = r2.A0K
            androidx.fragment.app.FragmentActivity r12 = r2.getActivity()
            r0 = 374(0x176, float:5.24E-43)
            java.lang.String r16 = X.C273654mx.A00(r0)
            X.6W8 r3 = new X.6W8
            r11 = r3
            r11.<init>(r12, r13, r14, r15, r16)
        L_0x026f:
            r3.A08()
            androidx.fragment.app.FragmentActivity r0 = r2.getActivity()
            r3.A0C(r0)
            goto L_0x00a3
        L_0x027b:
            java.lang.Object r3 = r5.A03
            X.6gj r3 = (X.C313616gj) r3
            X.4gL r2 = r3.A00
            if (r2 == 0) goto L_0x00a3
            X.3NV r1 = r2.A0A
            if (r1 != 0) goto L_0x0289
            X.3NV r1 = X.AnonymousClass3NV.A08
        L_0x0289:
            X.3NV r0 = X.AnonymousClass3NV.A07
            if (r1 != r0) goto L_0x02b0
            X.4DH r0 = r3.A0K
            android.content.Context r0 = r0.requireContext()
            X.8ab r1 = new X.8ab
            r1.<init>((android.content.Context) r0)
            r0 = 2131965293(0x7f13356d, float:1.9567392E38)
            r1.A09(r0)
            r0 = 2131965292(0x7f13356c, float:1.956739E38)
            r1.A08(r0)
            r1.A06()
            android.app.Dialog r0 = r1.A02()
            X.AnonymousClass0fN.A00(r0)
            goto L_0x00a3
        L_0x02b0:
            X.3NV r0 = X.AnonymousClass3NV.A09
            if (r1 != r0) goto L_0x00a3
            X.6gx r4 = r3.A0O
            java.lang.String r3 = r2.A0e
            r3.getClass()
            X.0wc r0 = r4.A03
            X.1Ln r2 = X.1Ln.A0E(r0)
            X.0Aj r0 = r2.A00
            boolean r0 = r0.isSampled()
            if (r0 == 0) goto L_0x00a3
            long r0 = r4.A02
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A0h(r0)
            java.lang.String r0 = "share_live_stream"
            r2.A0l(r0)
            java.lang.String r0 = "tap"
            r2.A0k(r0)
            r0 = 72
            java.lang.String r0 = X.C66579MXk.A00(r0)
            r2.A0p(r0)
            r0 = 330(0x14a, float:4.62E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            r2.A0q(r0)
            java.lang.String r0 = "broadcast"
            r2.A0o(r0)
            java.lang.String r0 = r4.A01
            r2.A0v(r0)
            java.lang.String r1 = "live_id"
            X.0eP r0 = new X.0eP
            r0.<init>(r1, r3)
            java.util.Map r0 = X.0se.A0M(r0)
            r2.A0w(r0)
            r2.Cgf()
            goto L_0x00a3
        L_0x030b:
            java.lang.Object r0 = r5.A03
            X.6gj r0 = (X.C313616gj) r0
            androidx.fragment.app.FragmentActivity r0 = r0.A0J
            r0.onBackPressed()
            goto L_0x00a3
        L_0x0316:
            java.lang.Object r1 = r5.A03
            X.6gj r1 = (X.C313616gj) r1
            X.4gL r0 = r1.A00
            if (r0 == 0) goto L_0x00a3
            X.6gt r2 = r1.A03
            if (r2 == 0) goto L_0x00a3
            X.0wc r3 = r2.A08
            java.lang.String r1 = "live_tap_header"
            X.0kJ r0 = r3.A00
            X.0Aj r5 = r3.A00(r0, r1)
            java.lang.String r0 = r2.A03
            long r0 = java.lang.Long.parseLong(r0)
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "a_pk"
            r5.A9F(r0, r1)
            java.lang.String r0 = r2.A02
            long r0 = java.lang.Long.parseLong(r0)
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            r0 = 2729(0xaa9, float:3.824E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r5.A9F(r0, r1)
            java.lang.String r1 = r2.A04
            java.lang.String r0 = "m_pk"
            r5.AAJ(r0, r1)
            X.0iw r0 = r2.A07
            java.lang.String r4 = r0.getModuleName()
            java.lang.String r0 = "container_module"
            goto L_0x009d
        L_0x035f:
            X.0eS.A00(r18)
            java.lang.Object r4 = r5.A03
            X.8L9 r4 = (X.AnonymousClass8L9) r4
            com.instagram.common.session.UserSession r10 = r4.A08
            X.8LG r1 = X.AnonymousClass8LF.A00(r10)
            java.lang.Object r9 = r5.A00
            X.7zv r9 = (X.C349307zv) r9
            java.lang.String r0 = r9.A0k
            X.A7z r8 = r1.A00(r0)
            if (r8 == 0) goto L_0x00a3
            java.lang.Object r11 = r5.A02
            com.instagram.creation.capture.quickcapture.freetransform.transformmatrix.TransformMatrixConfig r11 = (com.instagram.creation.capture.quickcapture.freetransform.transformmatrix.TransformMatrixConfig) r11
            java.util.List r5 = r8.A06
            if (r5 == 0) goto L_0x00a3
            java.util.List r7 = r8.A04
            if (r7 == 0) goto L_0x00a3
            int r1 = r5.size()
            int r0 = r7.size()
            if (r1 == r0) goto L_0x03c5
            java.lang.String r3 = "cleanTrackingData() inconsistent sizes "
            int r2 = r5.size()
            java.lang.String r1 = " and "
            int r0 = r7.size()
            java.lang.String r1 = X.002.A02(r2, r0, r3, r1)
            java.lang.String r0 = "SmartTrackingOnScreenRenderController"
            X.0wb.A03(r0, r1)
            int r1 = r5.size()
            int r0 = r7.size()
            if (r1 <= r0) goto L_0x03c5
            int r2 = r5.size()
            int r0 = r7.size()
            int r2 = r2 - r0
            r1 = 0
            if (r2 < 0) goto L_0x06c3
            int r0 = r5.size()
            int r0 = r0 - r2
            if (r0 >= r1) goto L_0x03c1
            r0 = 0
        L_0x03c1:
            java.util.List r5 = X.00k.A0d(r5, r0)
        L_0x03c5:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r3 = 0
            int r2 = r5.size()
        L_0x03cf:
            if (r3 >= r2) goto L_0x046d
            java.lang.Object r0 = r7.get(r3)
            X.A5a r0 = (X.C39684A5a) r0
            if (r0 == 0) goto L_0x0463
            float r1 = r0.A00
            java.lang.Float r0 = new java.lang.Float
            r0.<init>(r1)
            float r16 = r0.floatValue()
            int r0 = r9.A0K
            float r0 = (float) r0
            float r16 = r16 * r0
            int r0 = r8.A01
            float r0 = (float) r0
            float r16 = r16 / r0
            com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r0 = r4.A00
            if (r0 == 0) goto L_0x06b9
            com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl r0 = (com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl) r0
            X.81W r0 = r0.A0K
            int r0 = r0.getWidth()
            float r13 = (float) r0
            com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r0 = r4.A00
            if (r0 == 0) goto L_0x06b9
            com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl r0 = (com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl) r0
            X.81W r0 = r0.A0K
            int r0 = r0.getHeight()
            float r0 = (float) r0
            float r13 = r13 / r0
            int r0 = r11.A04
            int r12 = r0 % 180
            if (r12 != 0) goto L_0x046a
            int r0 = r11.A05
        L_0x0411:
            float r1 = (float) r0
            if (r12 != 0) goto L_0x0467
            int r0 = r11.A03
        L_0x0416:
            float r0 = (float) r0
            float r1 = r1 / r0
            float r1 = r1 / r13
            r0 = 1050253722(0x3e99999a, float:0.3)
            float r1 = java.lang.Math.max(r0, r1)
            r0 = 1084227584(0x40a00000, float:5.0)
            float r13 = java.lang.Math.min(r0, r1)
            com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams r12 = r11.A08
            r12.A01 = r13
            int r1 = r9.A0K
            int r0 = r9.A08
            float r15 = (float) r0
            r0 = 1058013184(0x3f100000, float:0.5625)
            float r15 = r15 * r0
            r0 = 1073741824(0x40000000, float:2.0)
            float r15 = r15 / r0
            float r1 = (float) r1
            float r15 = r15 / r1
            r14 = 1056964608(0x3f000000, float:0.5)
            float r14 = r14 - r15
            float r0 = r1 / r0
            float r0 = r0 - r16
            float r0 = r0 / r1
            float r1 = java.lang.Math.min(r0, r14)
            float r0 = -r14
            float r1 = java.lang.Math.max(r1, r0)
            float r0 = r11.A00
            float r13 = r13 * r0
            float r13 = r13 * r1
            r12.A02 = r13
            r11.A03()
            X.A4G r1 = new X.A4G
            r1.<init>()
            float[] r0 = r11.C5o()
            java.util.List r0 = X.03t.A0F(r0)
            r1.A00 = r0
            r6.add(r1)
        L_0x0463:
            int r3 = r3 + 1
            goto L_0x03cf
        L_0x0467:
            int r0 = r11.A05
            goto L_0x0416
        L_0x046a:
            int r0 = r11.A03
            goto L_0x0411
        L_0x046d:
            r8.A07 = r6
            X.8LG r0 = X.AnonymousClass8LF.A00(r10)
            r0.A01(r8)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r6.iterator()
        L_0x047f:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0498
            java.lang.Object r0 = r2.next()
            X.A4G r0 = (X.A4G) r0
            X.A4L r1 = new X.A4L
            r1.<init>()
            java.util.List r0 = r0.A00
            r1.A00 = r0
            r3.add(r1)
            goto L_0x047f
        L_0x0498:
            r4.A06 = r5
            r4.A05 = r3
            goto L_0x00a3
        L_0x049e:
            X.0eS.A00(r18)
            java.lang.Object r0 = r5.A03
            X.7Sj r0 = (X.C331787Sj) r0
            X.7Sn r3 = r0.A08
            java.lang.Object r1 = r5.A00
            com.instagram.model.direct.DirectThreadKey r1 = (com.instagram.model.direct.DirectThreadKey) r1
            java.lang.Object r2 = r5.A02
            java.util.List r2 = (java.util.List) r2
            r0 = 0
            X.0qQ.A0B(r1, r0)
            r0 = 1
            X.0qQ.A0B(r2, r0)
            java.lang.String r1 = r1.A00
            if (r1 == 0) goto L_0x00a3
            com.instagram.common.session.UserSession r0 = r3.A02
            X.C331247Qd.A02(r0, r1, r2)
            goto L_0x00a3
        L_0x04c2:
            X.0eS.A00(r18)
            java.lang.Object r0 = r5.A00
            boolean r0 = r0 instanceof X.KN1
            if (r0 == 0) goto L_0x00a3
            java.lang.Object r4 = r5.A03
            X.87i r4 = (X.C3510387i) r4
            java.lang.Object r2 = r5.A02
            X.87s r2 = (X.C3511387s) r2
            X.4gw r0 = r2.A04
            if (r0 == 0) goto L_0x0591
            X.4yi r0 = r0.Ad4()
            if (r0 == 0) goto L_0x0591
            java.lang.String r6 = r0.getOwnerUsername()
        L_0x04e1:
            com.instagram.user.model.User r7 = r2.A09
            X.4gw r8 = r2.A04
            X.1E7 r1 = X.1E8.A03
            com.instagram.common.session.UserSession r9 = r4.A0K
            java.lang.String r0 = r2.A0C
            java.lang.String r3 = "VideoStickerController"
            X.1Xj r0 = r1.A01(r9, r3, r0)
            r4.A0C = r0
            if (r7 == 0) goto L_0x00a3
            if (r8 == 0) goto L_0x00a3
            if (r0 == 0) goto L_0x00a3
            java.lang.String r0 = r7.getUsername()
            r4.A0D = r0
            android.text.SpannableStringBuilder r1 = new android.text.SpannableStringBuilder
            r1.<init>(r0)
            boolean r0 = r7.isVerified()
            r5 = 0
            if (r0 == 0) goto L_0x0510
            android.content.Context r0 = r4.A0F
            X.C244273av.A08(r0, r1, r5)
        L_0x0510:
            com.instagram.common.ui.base.IgTextView r0 = r4.A0M
            r0.setText(r1)
            com.instagram.common.ui.widget.imageview.CircularImageView r2 = r4.A0N
            com.instagram.common.typedurl.ImageUrl r1 = r7.Bh3()
            X.0xG r0 = new X.0xG
            r0.<init>(r3)
            r2.setUrl(r1, r0)
            java.lang.String r0 = r7.getUsername()
            boolean r0 = X.0qQ.A0K(r0, r6)
            if (r0 != 0) goto L_0x0548
            if (r6 == 0) goto L_0x0548
            com.instagram.common.ui.base.IgTextView r3 = r4.A0L
            android.content.Context r0 = r4.A0F
            android.content.res.Resources r2 = r0.getResources()
            r1 = 2131975059(0x7f135b93, float:1.95872E38)
            java.lang.String[] r0 = new java.lang.String[]{r6}
            android.text.Spanned r0 = X.0bC.A01(r2, r0, r1)
            r3.setText(r0)
            r3.setVisibility(r5)
        L_0x0548:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r5)
            r0 = 1177(0x499, float:1.65E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0eP r3 = new X.0eP
            r3.<init>(r0, r6)
            java.lang.String r0 = "audio"
            X.0eP r2 = new X.0eP
            r2.<init>(r0, r6)
            java.lang.String r1 = "effect"
            X.0eP r0 = new X.0eP
            r0.<init>(r1, r6)
            X.0eP[] r0 = new X.0eP[]{r3, r2, r0}
            java.util.LinkedHashMap r11 = X.0Yt.A07(r0)
            android.content.Context r7 = r4.A0F
            X.1Xj r10 = r4.A0C
            X.Gi5 r6 = new X.Gi5
            r6.<init>(r7, r8, r9, r10, r11)
            r4.A0B = r6
            androidx.recyclerview.widget.LinearLayoutManager r2 = new androidx.recyclerview.widget.LinearLayoutManager
            r2.<init>(r7, r5, r5)
            androidx.recyclerview.widget.RecyclerView r1 = r4.A0J
            X.Gi5 r0 = r4.A0B
            r1.setAdapter(r0)
            r1.setLayoutManager(r2)
            X.9YQ r0 = new X.9YQ
            r0.<init>()
            r1.A11(r0)
            goto L_0x00a3
        L_0x0591:
            r6 = 0
            goto L_0x04e1
        L_0x0594:
            X.0eS.A00(r18)
            java.lang.Object r3 = r5.A00
            X.3JC r3 = (X.AnonymousClass3JC) r3
            java.lang.Object r8 = r5.A02
            X.8cI r8 = (X.C359218cI) r8
            java.lang.Object r2 = r3.A01
            X.3FZ r2 = (X.AnonymousClass3FZ) r2
            if (r2 == 0) goto L_0x05ff
            java.lang.Class<X.7yV> r1 = X.C348467yV.class
            java.lang.String r0 = "ar_effect_categories"
            X.3FZ r2 = r2.A00(r1, r0)
            if (r2 == 0) goto L_0x05ff
            java.lang.Class<X.7yW> r1 = X.C348477yW.class
            java.lang.String r0 = "results"
            X.3FZ r0 = r2.A00(r1, r0)
            if (r0 == 0) goto L_0x05ff
            org.json.JSONObject r0 = r0.A00
            X.7yX r6 = new X.7yX
            r6.<init>(r0)
        L_0x05c0:
            boolean r11 = r3.mFromDiskCache
            r2 = 0
            if (r6 == 0) goto L_0x0601
            java.lang.Class<X.7yY> r1 = X.C348497yY.class
            java.lang.String r0 = "effect_page"
            X.3FZ r3 = r6.A00(r1, r0)
            if (r3 == 0) goto L_0x0601
            java.lang.Class<X.7yZ> r1 = X.C348507yZ.class
            java.lang.String r0 = "effects"
            com.google.common.collect.ImmutableList r1 = r3.A02(r0, r1)
            if (r1 == 0) goto L_0x0601
            r0 = 10
            int r0 = X.0Yv.A1E(r1, r0)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r0)
            java.util.Iterator r3 = r1.iterator()
        L_0x05e8:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0602
            java.lang.Object r0 = r3.next()
            X.3FZ r0 = (X.AnonymousClass3FZ) r0
            org.json.JSONObject r1 = r0.A00
            X.7ya r0 = new X.7ya
            r0.<init>(r1)
            r4.add(r0)
            goto L_0x05e8
        L_0x05ff:
            r6 = 0
            goto L_0x05c0
        L_0x0601:
            r4 = r2
        L_0x0602:
            r9 = 0
            if (r4 == 0) goto L_0x0637
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r10 = r4.iterator()
        L_0x060e:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x0639
            java.lang.Object r7 = r10.next()
            X.7ya r7 = (X.C348517ya) r7
            java.lang.Integer r4 = X.AnonymousClass05K.A0N
            java.lang.String r3 = r8.A01
            r0 = 0
            X.0qQ.A0B(r7, r0)
            org.json.JSONObject r1 = r7.A00
            X.7yb r0 = new X.7yb
            r0.<init>(r1)
            boolean r0 = X.C346227uo.A04(r0)
            if (r0 == 0) goto L_0x060e
            com.instagram.camera.effect.models.CameraAREffect r0 = X.C346227uo.A00(r7, r4, r3)
            r5.add(r0)
            goto L_0x060e
        L_0x0637:
            X.0sn r5 = X.0sn.A00
        L_0x0639:
            if (r11 == 0) goto L_0x066e
            java.lang.Integer r3 = X.AnonymousClass05K.A00
        L_0x063d:
            X.9Ih r4 = new X.9Ih
            r4.<init>((X.C359218cI) r8, (java.lang.Integer) r3, (java.lang.Long) r9, (java.util.List) r5)
            if (r6 == 0) goto L_0x066a
            java.lang.Class<X.7yY> r1 = X.C348497yY.class
            java.lang.String r0 = "effect_page"
            X.3FZ r1 = r6.A00(r1, r0)
            if (r1 == 0) goto L_0x066a
            java.lang.String r0 = "has_next"
            boolean r3 = r1.A06(r0)
        L_0x0654:
            java.lang.Class<X.7yY> r1 = X.C348497yY.class
            java.lang.String r0 = "effect_page"
            X.3FZ r1 = r6.A00(r1, r0)
            if (r1 == 0) goto L_0x0664
            java.lang.String r0 = "cursor"
            java.lang.String r2 = r1.A05(r0)
        L_0x0664:
            X.7ul r0 = new X.7ul
            r0.<init>(r4, r2, r3)
            return r0
        L_0x066a:
            r3 = 0
            if (r6 == 0) goto L_0x0664
            goto L_0x0654
        L_0x066e:
            java.lang.Integer r3 = X.AnonymousClass05K.A0Y
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.Long r9 = java.lang.Long.valueOf(r0)
            goto L_0x063d
        L_0x0679:
            X.0eS.A00(r18)
            java.lang.Object r1 = r5.A00
            X.3Ii r1 = (X.C239803Ii) r1
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x06b1
            X.3Ih r1 = (X.C239793Ih) r1
            java.lang.Object r0 = r1.A00
            X.7ul r0 = (X.C346197ul) r0
            java.lang.Object r2 = r0.A00
            X.9Ih r2 = (X.C376519Ih) r2
            java.lang.Object r1 = r2.A03
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r1 == r0) goto L_0x0698
            java.lang.Integer r0 = X.AnonymousClass05K.A0Y
            if (r1 != r0) goto L_0x06b1
        L_0x0698:
            long r3 = java.lang.System.currentTimeMillis()
            java.lang.Object r0 = r5.A02
            X.7zi r0 = (X.C349177zi) r0
            long r0 = r0.A00
            long r3 = r3 - r0
            java.lang.Object r0 = r2.A04
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x06b7
            long r1 = r0.longValue()
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x06b7
        L_0x06b1:
            r0 = 0
        L_0x06b2:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L_0x06b7:
            r0 = 1
            goto L_0x06b2
        L_0x06b9:
            java.lang.String r0 = "targetViewSizeProvider"
            X.0qQ.A0F(r0)
            X.00P r1 = X.AnonymousClass00P.createAndThrow()
            throw r1
        L_0x06c3:
            r0 = 2480(0x9b0, float:3.475E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            r0 = 1985(0x7c1, float:2.782E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r0 = X.002.A0c(r1, r0, r2)
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9KB.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass9KB(Object obj, Object obj2, AnonymousClass4D7 r4, int i) {
        super(2, r4);
        this.A01 = i;
        this.A03 = obj;
        this.A02 = obj2;
    }
}
