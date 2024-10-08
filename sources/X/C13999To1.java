package X;

/* renamed from: X.To1  reason: case insensitive filesystem */
public final class C13999To1 extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13999To1(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    public static 0t0 A00(Object obj, int i) {
        return AnonymousClass0eN.A01(new C13999To1(obj, i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:127:?, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00bd, code lost:
        r4.clear();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00c0, code lost:
        monitor-exit(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        r0.invoke();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r10 = this;
            int r0 = r10.A00
            switch(r0) {
                case 0: goto L_0x00dc;
                case 1: goto L_0x00f4;
                case 2: goto L_0x0126;
                case 3: goto L_0x014f;
                case 4: goto L_0x00d9;
                case 5: goto L_0x015a;
                case 6: goto L_0x0161;
                case 7: goto L_0x0168;
                case 8: goto L_0x017a;
                case 9: goto L_0x019a;
                case 10: goto L_0x01c1;
                case 11: goto L_0x01cb;
                case 12: goto L_0x01d5;
                case 13: goto L_0x000f;
                case 14: goto L_0x000f;
                case 15: goto L_0x01ef;
                case 16: goto L_0x0205;
                case 17: goto L_0x0217;
                case 18: goto L_0x0225;
                case 19: goto L_0x0233;
                case 20: goto L_0x0245;
                case 21: goto L_0x0259;
                case 22: goto L_0x0269;
                case 23: goto L_0x027d;
                case 24: goto L_0x0017;
                case 25: goto L_0x0291;
                case 26: goto L_0x0291;
                case 27: goto L_0x029a;
                case 28: goto L_0x02a9;
                case 29: goto L_0x02b7;
                case 30: goto L_0x02c4;
                case 31: goto L_0x02d9;
                case 32: goto L_0x0039;
                case 33: goto L_0x02e3;
                case 34: goto L_0x02ec;
                case 35: goto L_0x02ff;
                case 36: goto L_0x0309;
                case 37: goto L_0x0005;
                case 38: goto L_0x0005;
                case 39: goto L_0x0005;
                case 40: goto L_0x0040;
                case 41: goto L_0x0067;
                case 42: goto L_0x0092;
                case 43: goto L_0x00c3;
                case 44: goto L_0x00ce;
                case 45: goto L_0x0329;
                case 46: goto L_0x0333;
                case 47: goto L_0x0348;
                case 48: goto L_0x036c;
                case 49: goto L_0x0396;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r10.A01
            X.0sa r0 = (X.C62320sa) r0
        L_0x0009:
            r0.invoke()
        L_0x000c:
            X.0gF r4 = X.C60340gF.A00
        L_0x000e:
            return r4
        L_0x000f:
            java.lang.Object r0 = r10.A01
            X.JQL r0 = (X.JQL) r0
            r0.Dei()
            goto L_0x000c
        L_0x0017:
            java.lang.Object r0 = r10.A01
            X.U90 r0 = (X.U90) r0
            com.instagram.user.model.Product r1 = r0.A08
            boolean r0 = r1.A05()
            r4 = 0
            if (r0 == 0) goto L_0x000e
            java.lang.String r2 = r1.A0G
            if (r2 == 0) goto L_0x000e
            java.lang.String r0 = r1.A0L
            if (r0 == 0) goto L_0x000e
            r1 = 2131969813(0x7f134715, float:1.957656E38)
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r2}
            X.HsR r4 = new X.HsR
            r4.<init>(r0, r1)
            return r4
        L_0x0039:
            java.lang.Object r0 = r10.A01
            X.JuT r0 = (X.C60971JuT) r0
            X.0sa r0 = r0.A06
            goto L_0x0009
        L_0x0040:
            java.lang.Object r0 = r10.A01
            X.LN7 r0 = (X.LN7) r0
            X.Vhr r4 = r0.A04
            monitor-enter(r4)
            java.util.Set r0 = r4.A04     // Catch:{ all -> 0x03c0 }
            java.util.Iterator r3 = r0.iterator()     // Catch:{ all -> 0x03c0 }
        L_0x004d:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x03c0 }
            if (r0 == 0) goto L_0x0065
            java.lang.Object r0 = r3.next()     // Catch:{ all -> 0x03c0 }
            java.lang.Number r0 = (java.lang.Number) r0     // Catch:{ all -> 0x03c0 }
            int r2 = r0.intValue()     // Catch:{ all -> 0x03c0 }
            X.02m r1 = X.02m.A0p     // Catch:{ all -> 0x03c0 }
            java.lang.String r0 = "FETCH_BEGIN"
            r1.markerPoint(r2, r0)     // Catch:{ all -> 0x03c0 }
            goto L_0x004d
        L_0x0065:
            monitor-exit(r4)
            goto L_0x000c
        L_0x0067:
            java.lang.Object r0 = r10.A01
            X.LN7 r0 = (X.LN7) r0
            X.Vhr r5 = r0.A04
            monitor-enter(r5)
            java.util.Set r4 = r5.A04     // Catch:{ all -> 0x03c3 }
            java.util.Iterator r3 = r4.iterator()     // Catch:{ all -> 0x03c3 }
        L_0x0074:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x03c3 }
            if (r0 == 0) goto L_0x00bd
            java.lang.Object r0 = r3.next()     // Catch:{ all -> 0x03c3 }
            java.lang.Number r0 = (java.lang.Number) r0     // Catch:{ all -> 0x03c3 }
            int r2 = r0.intValue()     // Catch:{ all -> 0x03c3 }
            X.02m r1 = X.02m.A0p     // Catch:{ all -> 0x03c3 }
            java.lang.String r0 = "NETWORK_FAILED"
            r1.markerPoint(r2, r0)     // Catch:{ all -> 0x03c3 }
            r1 = 3
            X.02m r0 = X.02m.A0p     // Catch:{ all -> 0x03c3 }
            r0.markerEnd(r2, r1)     // Catch:{ all -> 0x03c3 }
            goto L_0x0074
        L_0x0092:
            java.lang.Object r0 = r10.A01
            X.LN7 r0 = (X.LN7) r0
            X.Vhr r5 = r0.A04
            monitor-enter(r5)
            java.util.Set r4 = r5.A04     // Catch:{ all -> 0x03c3 }
            java.util.Iterator r3 = r4.iterator()     // Catch:{ all -> 0x03c3 }
        L_0x009f:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x03c3 }
            if (r0 == 0) goto L_0x00bd
            java.lang.Object r0 = r3.next()     // Catch:{ all -> 0x03c3 }
            java.lang.Number r0 = (java.lang.Number) r0     // Catch:{ all -> 0x03c3 }
            int r2 = r0.intValue()     // Catch:{ all -> 0x03c3 }
            X.02m r1 = X.02m.A0p     // Catch:{ all -> 0x03c3 }
            java.lang.String r0 = "USER_NAVIGATION_CANCELLATION"
            r1.markerPoint(r2, r0)     // Catch:{ all -> 0x03c3 }
            r1 = 4
            X.02m r0 = X.02m.A0p     // Catch:{ all -> 0x03c3 }
            r0.markerEnd(r2, r1)     // Catch:{ all -> 0x03c3 }
            goto L_0x009f
        L_0x00bd:
            r4.clear()     // Catch:{ all -> 0x03c3 }
            monitor-exit(r5)
            goto L_0x000c
        L_0x00c3:
            java.lang.Object r0 = r10.A01
            X.LN7 r0 = (X.LN7) r0
            X.2mA r0 = r0.A02
            r0.A01()
            goto L_0x000c
        L_0x00ce:
            java.lang.Object r0 = r10.A01
            X.LN7 r0 = (X.LN7) r0
            X.2mA r0 = r0.A02
            r0.A00()
            goto L_0x000c
        L_0x00d9:
            java.lang.Object r4 = r10.A01
            return r4
        L_0x00dc:
            java.lang.Object r2 = r10.A01
            X.Uam r2 = (X.C15337Uam) r2
            X.0eM r0 = r2.A0C
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r0)
            X.0eM r0 = r2.A07
            java.lang.Object r0 = r0.getValue()
            com.instagram.shopping.intf.taggingfeed.ShoppingTaggingFeedArguments r0 = (com.instagram.shopping.intf.taggingfeed.ShoppingTaggingFeedArguments) r0
            X.Vjb r4 = new X.Vjb
            r4.<init>(r2, r1, r0)
            return r4
        L_0x00f4:
            java.lang.Object r3 = r10.A01
            X.Uam r3 = (X.C15337Uam) r3
            android.content.Context r5 = r3.requireContext()
            android.content.Context r2 = r3.requireContext()
            X.0gy r1 = X.AnonymousClass07i.A00(r3)
            r0 = 0
            X.2lw r6 = new X.2lw
            r6.<init>(r2, r1, r0)
            X.0eM r0 = r3.A0C
            com.instagram.common.session.UserSession r7 = X.AnonymousClass7TE.A0l(r0)
            X.0eM r0 = r3.A07
            java.lang.Object r9 = r0.getValue()
            com.instagram.shopping.intf.taggingfeed.ShoppingTaggingFeedArguments r9 = (com.instagram.shopping.intf.taggingfeed.ShoppingTaggingFeedArguments) r9
            X.0eM r0 = r3.A09
            java.lang.Object r8 = r0.getValue()
            X.Vjb r8 = (X.C17999Vjb) r8
            X.LQd r4 = new X.LQd
            r4.<init>(r5, r6, r7, r8, r9)
            return r4
        L_0x0126:
            java.lang.Object r1 = r10.A01
            X.Uam r1 = (X.C15337Uam) r1
            androidx.fragment.app.FragmentActivity r3 = r1.requireActivity()
            X.0eM r0 = r1.A0C
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r0)
            X.0eM r0 = r1.A07
            java.lang.Object r0 = r0.getValue()
            com.instagram.shopping.intf.taggingfeed.ShoppingTaggingFeedArguments r0 = (com.instagram.shopping.intf.taggingfeed.ShoppingTaggingFeedArguments) r0
            com.instagram.shopping.model.taggingfeed.TaggingFeedMultiSelectState r1 = r0.A06
            X.UhD r0 = new X.UhD
            r0.<init>(r2, r1)
            X.2YN r1 = new X.2YN
            r1.<init>(r0, r3)
            java.lang.Class<X.U8u> r0 = X.C14784U8u.class
            X.2YL r4 = r1.A00(r0)
            return r4
        L_0x014f:
            java.lang.Object r0 = r10.A01
            android.os.Bundle r0 = X.DbS.A0B(r0)
            java.lang.String r4 = X.C228022kf.A00(r0)
            return r4
        L_0x015a:
            java.lang.Object r0 = r10.A01
            java.lang.Object r4 = X.DbT.A0r(r0)
            return r4
        L_0x0161:
            java.lang.Object r0 = r10.A01
            X.07f r4 = X.DbY.A0I(r0)
            return r4
        L_0x0168:
            java.lang.Object r0 = r10.A01
            X.Uam r0 = (X.C15337Uam) r0
            X.0eM r0 = r0.A0A
            java.lang.Object r0 = r0.getValue()
            X.LQd r0 = (X.C64141LQd) r0
            X.Uh8 r4 = new X.Uh8
            r4.<init>(r0)
            return r4
        L_0x017a:
            java.lang.Object r3 = r10.A01
            X.Uam r3 = (X.C15337Uam) r3
            X.0eM r0 = r3.A0F
            java.lang.Object r2 = r0.getValue()
            X.2el r2 = (X.2el) r2
            X.0eM r0 = r3.A0C
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r0)
            X.0eM r0 = r3.A09
            java.lang.Object r0 = r0.getValue()
            X.Vjb r0 = (X.C17999Vjb) r0
            X.VTr r4 = new X.VTr
            r4.<init>(r1, r2, r0)
            return r4
        L_0x019a:
            android.text.TextPaint r4 = new android.text.TextPaint
            r4.<init>()
            java.lang.Object r2 = r10.A01
            androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2
            android.content.res.Resources r1 = X.DbV.A05(r2)
            r0 = 2131165216(0x7f070020, float:1.7944643E38)
            X.C13988Tno.A0t(r1, r4, r0)
            android.content.Context r1 = r2.requireContext()
            android.content.Context r0 = r2.getContext()
            int r0 = X.2Yu.A07(r0)
            r1.getColor(r0)
            r0 = 1
            r4.setFakeBoldText(r0)
            return r4
        L_0x01c1:
            java.lang.Object r0 = r10.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.FYi r4 = new X.FYi
            r4.<init>(r0)
            return r4
        L_0x01cb:
            java.lang.Object r0 = r10.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.35M r4 = new X.35M
            r4.<init>(r0)
            return r4
        L_0x01d5:
            r1 = 1165749434(0x457becba, float:4030.7954)
            r0 = 3
            X.19S r2 = X.AnonymousClass1HX.A01(r1, r0)
            java.lang.Object r0 = r10.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.1vn r1 = X.1vm.A01(r0)
            X.1QP r0 = X.AnonymousClass1QO.A00(r0)
            X.Liy r4 = new X.Liy
            r4.<init>(r1, r0, r2)
            return r4
        L_0x01ef:
            java.lang.Object r0 = r10.A01
            X.Vd3 r0 = (X.C17734Vd3) r0
            android.content.Context r5 = r0.A00
            com.instagram.common.session.UserSession r6 = r0.A02
            java.lang.String r9 = r0.A07
            X.VYm r8 = r0.A04
            com.instagram.shopping.fragment.pdp.AdsProductPageFragment r0 = r0.A03
            X.Uqy r7 = r0.A0B
            X.Vss r4 = new X.Vss
            r4.<init>(r5, r6, r7, r8, r9)
            return r4
        L_0x0205:
            java.lang.Object r0 = r10.A01
            X.Vd3 r0 = (X.C17734Vd3) r0
            android.content.Context r2 = r0.A00
            com.instagram.common.session.UserSession r1 = r0.A02
            com.instagram.shopping.fragment.pdp.AdsProductPageFragment r0 = r0.A03
            X.Ur1 r0 = r0.A0D
            X.VsI r4 = new X.VsI
            r4.<init>(r2, r1, r0)
            return r4
        L_0x0217:
            java.lang.Object r0 = r10.A01
            X.Vd3 r0 = (X.C17734Vd3) r0
            com.instagram.shopping.fragment.pdp.AdsProductPageFragment r0 = r0.A03
            X.Uqz r0 = r0.A0F
            X.VPH r4 = new X.VPH
            r4.<init>(r0)
            return r4
        L_0x0225:
            java.lang.Object r0 = r10.A01
            X.Vd3 r0 = (X.C17734Vd3) r0
            com.instagram.shopping.fragment.pdp.AdsProductPageFragment r0 = r0.A03
            X.Ur0 r0 = r0.A0E
            X.VPG r4 = new X.VPG
            r4.<init>(r0)
            return r4
        L_0x0233:
            java.lang.Object r3 = r10.A01
            X.Vd3 r3 = (X.C17734Vd3) r3
            com.instagram.common.session.UserSession r2 = r3.A02
            com.instagram.shopping.fragment.pdp.AdsProductPageFragment r0 = r3.A03
            X.Ur2 r1 = r0.A0G
            X.VkS r0 = r3.A06
            X.VsD r4 = new X.VsD
            r4.<init>(r2, r1, r0)
            return r4
        L_0x0245:
            java.lang.Object r0 = r10.A01
            X.Vd3 r0 = (X.C17734Vd3) r0
            android.content.Context r3 = r0.A00
            com.instagram.common.session.UserSession r2 = r0.A02
            X.0iw r1 = r0.A01
            com.instagram.shopping.fragment.pdp.AdsProductPageFragment r0 = r0.A03
            X.Uqx r0 = r0.A0H
            X.VYc r4 = new X.VYc
            r4.<init>(r3, r1, r2, r0)
            return r4
        L_0x0259:
            java.lang.Object r0 = r10.A01
            X.Vd3 r0 = (X.C17734Vd3) r0
            android.content.Context r1 = r0.A00
            com.instagram.shopping.fragment.pdp.AdsProductPageFragment r0 = r0.A03
            X.Uqv r0 = r0.A0I
            X.VPI r4 = new X.VPI
            r4.<init>(r1, r0)
            return r4
        L_0x0269:
            java.lang.Object r4 = r10.A01
            X.Vd3 r4 = (X.C17734Vd3) r4
            android.content.Context r3 = r4.A00
            com.instagram.common.session.UserSession r2 = r4.A02
            com.instagram.shopping.fragment.pdp.AdsProductPageFragment r0 = r4.A03
            X.Uqw r1 = r0.A0J
            X.0iw r0 = r4.A01
            X.VYd r4 = new X.VYd
            r4.<init>(r3, r0, r2, r1)
            return r4
        L_0x027d:
            java.lang.Object r0 = r10.A01
            X.U90 r0 = (X.U90) r0
            com.instagram.user.model.Product r0 = r0.A08
            java.lang.String r1 = r0.A0J
            if (r1 == 0) goto L_0x028f
            r0 = 2131967982(0x7f133fee, float:1.9572846E38)
            X.HsR r4 = X.JTR.A0g(r1, r0)
            return r4
        L_0x028f:
            r4 = 0
            return r4
        L_0x0291:
            java.lang.Object r0 = r10.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.17i r4 = X.17h.A00(r0)
            return r4
        L_0x029a:
            java.lang.Object r0 = r10.A01
            X.JhS r0 = (X.C60209JhS) r0
            X.0sP r1 = r0.A03
            X.6oS r0 = X.C318116oQ.A00(r0)
            java.lang.Object r4 = r1.invoke(r0)
            return r4
        L_0x02a9:
            java.lang.Object r0 = r10.A01
            X.Lix r0 = (X.C64835Lix) r0
            com.instagram.common.session.UserSession r0 = r0.A00
            X.C18552Vu4.A00(r0)
            java.lang.Boolean r4 = X.AnonymousClass7TE.A0v()
            return r4
        L_0x02b7:
            java.lang.Object r0 = r10.A01
            X.Lix r0 = (X.C64835Lix) r0
            X.JwC r0 = X.C64835Lix.A00(r0)
            X.02z r4 = X.106.A01(r0)
            return r4
        L_0x02c4:
            X.0nE r0 = X.C61410nE.A00
            X.WQh r4 = new X.WQh
            r4.<init>(r0)
            java.lang.Object r0 = r10.A01
            X.0lg r0 = (X.0lg) r0
            X.1Ng r1 = X.AnonymousClass1Nd.A00(r0)
            java.lang.Class<X.3DT> r0 = X.AnonymousClass3DT.class
            r1.A01(r4, r0)
            return r4
        L_0x02d9:
            java.lang.Object r0 = r10.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.LQV r4 = new X.LQV
            r4.<init>(r0)
            return r4
        L_0x02e3:
            java.lang.String r1 = "endpoint:"
            java.lang.String r0 = "reconsideration_destination"
            java.lang.String r4 = X.002.A0R(r1, r0)
            return r4
        L_0x02ec:
            java.lang.Object r3 = r10.A01
            X.JuT r3 = (X.C60971JuT) r3
            X.0eM r0 = r3.A04
            java.lang.String r2 = X.DbS.A0t(r0)
            java.lang.String r1 = ",paginationToken:"
            java.lang.String r0 = r3.A03
            java.lang.String r4 = X.002.A0g(r2, r1, r0)
            return r4
        L_0x02ff:
            java.lang.Object r0 = r10.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.LEt r4 = new X.LEt
            r4.<init>(r0)
            return r4
        L_0x0309:
            X.0eE r1 = X.AnonymousClass0t1.A01
            java.lang.Object r0 = r10.A01
            X.LEt r0 = (X.C63951LEt) r0
            com.instagram.common.session.UserSession r0 = r0.A00
            com.instagram.user.model.User r0 = r1.A01(r0)
            X.4Cl r0 = r0.A03
            java.lang.Boolean r0 = r0.CP5()
            boolean r0 = X.AnonymousClass7TG.A1X(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            X.2Fj r4 = new X.2Fj
            r4.<init>(r0)
            return r4
        L_0x0329:
            java.lang.Object r0 = r10.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.VPQ r4 = new X.VPQ
            r4.<init>(r0)
            return r4
        L_0x0333:
            int r0 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            java.lang.Object r0 = r10.A01
            X.UE2 r0 = (X.UE2) r0
            android.view.View r1 = r0.A00
            r0 = 2131433242(0x7f0b171a, float:1.8488264E38)
            android.view.View r0 = X.AnonymousClass7TF.A0G(r1, r0)
            X.UDZ r4 = new X.UDZ
            r4.<init>(r0)
            return r4
        L_0x0348:
            java.lang.Object r0 = r10.A01
            X.UE2 r0 = (X.UE2) r0
            android.view.View r3 = r0.A00
            r0 = 2131434576(0x7f0b1c50, float:1.849097E38)
            android.view.View r2 = r3.requireViewById(r0)
            r0 = 2131434577(0x7f0b1c51, float:1.8490972E38)
            android.view.View r1 = r3.requireViewById(r0)
            r0 = 2131434578(0x7f0b1c52, float:1.8490974E38)
            android.view.View r0 = r3.requireViewById(r0)
            android.view.View[] r0 = new android.view.View[]{r2, r1, r0}
            java.util.ArrayList r4 = X.0sr.A1L(r0)
            return r4
        L_0x036c:
            java.lang.Object r0 = r10.A01
            X.UE2 r0 = (X.UE2) r0
            android.view.View r3 = r0.A00
            r0 = 2131434529(0x7f0b1c21, float:1.8490875E38)
            android.view.View r2 = r3.requireViewById(r0)
            com.instagram.common.ui.widget.imageview.IgImageView r2 = (com.instagram.common.ui.widget.imageview.IgImageView) r2
            r0 = 2131434530(0x7f0b1c22, float:1.8490877E38)
            android.view.View r1 = r3.requireViewById(r0)
            com.instagram.common.ui.widget.imageview.IgImageView r1 = (com.instagram.common.ui.widget.imageview.IgImageView) r1
            r0 = 2131434531(0x7f0b1c23, float:1.8490879E38)
            android.view.View r0 = r3.requireViewById(r0)
            com.instagram.common.ui.widget.imageview.IgImageView r0 = (com.instagram.common.ui.widget.imageview.IgImageView) r0
            com.instagram.common.ui.widget.imageview.IgImageView[] r0 = new com.instagram.common.ui.widget.imageview.IgImageView[]{r2, r1, r0}
            java.util.ArrayList r4 = X.0sr.A1L(r0)
            return r4
        L_0x0396:
            java.lang.Object r0 = r10.A01
            X.UE2 r0 = (X.UE2) r0
            android.view.View r3 = r0.A00
            r0 = 2131443119(0x7f0b3daf, float:1.8508297E38)
            android.view.View r2 = r3.requireViewById(r0)
            com.instagram.common.ui.touch.TouchOverlayView r2 = (com.instagram.common.ui.touch.TouchOverlayView) r2
            r0 = 2131443120(0x7f0b3db0, float:1.85083E38)
            android.view.View r1 = r3.requireViewById(r0)
            com.instagram.common.ui.touch.TouchOverlayView r1 = (com.instagram.common.ui.touch.TouchOverlayView) r1
            r0 = 2131443121(0x7f0b3db1, float:1.8508301E38)
            android.view.View r0 = r3.requireViewById(r0)
            com.instagram.common.ui.touch.TouchOverlayView r0 = (com.instagram.common.ui.touch.TouchOverlayView) r0
            com.instagram.common.ui.touch.TouchOverlayView[] r0 = new com.instagram.common.ui.touch.TouchOverlayView[]{r2, r1, r0}
            java.util.List r4 = X.0sr.A1P(r0)
            return r4
        L_0x03c0:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x03c3:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C13999To1.invoke():java.lang.Object");
    }
}
