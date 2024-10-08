package X;

/* renamed from: X.WxY  reason: case insensitive filesystem */
public final class C20701WxY extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C20701WxY(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    public static AnonymousClass0eM A00(Object obj, int i) {
        return AnonymousClass1YB.A00(new C20701WxY(obj, i));
    }

    public static 0t0 A01(Object obj, int i) {
        return AnonymousClass0eN.A01(new C20701WxY(obj, i));
    }

    /* JADX WARNING: type inference failed for: r3v15, types: [X.UcC, X.07g, X.4mT] */
    /* JADX WARNING: type inference failed for: r0v121, types: [X.2tF, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v122, types: [X.2tF, java.lang.Object] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0256, code lost:
        X.0qQ.A0F(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x025d, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0268, code lost:
        r0 = "priorModule";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0390, code lost:
        return X.C60340gF.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r18 = this;
            r1 = r18
            int r0 = r1.A00
            switch(r0) {
                case 0: goto L_0x0066;
                case 1: goto L_0x04d8;
                case 2: goto L_0x04a8;
                case 3: goto L_0x0446;
                case 4: goto L_0x042f;
                case 5: goto L_0x041f;
                case 6: goto L_0x0007;
                case 7: goto L_0x0418;
                case 8: goto L_0x0411;
                case 9: goto L_0x03f5;
                case 10: goto L_0x03df;
                case 11: goto L_0x03c7;
                case 12: goto L_0x0391;
                case 13: goto L_0x035d;
                case 14: goto L_0x032b;
                case 15: goto L_0x0304;
                case 16: goto L_0x02ea;
                case 17: goto L_0x02c9;
                case 18: goto L_0x02b6;
                case 19: goto L_0x0007;
                case 20: goto L_0x0418;
                case 21: goto L_0x0411;
                case 22: goto L_0x026b;
                case 23: goto L_0x0219;
                case 24: goto L_0x0244;
                case 25: goto L_0x01dd;
                case 26: goto L_0x01b2;
                case 27: goto L_0x0190;
                case 28: goto L_0x0007;
                case 29: goto L_0x0418;
                case 30: goto L_0x0411;
                case 31: goto L_0x0007;
                case 32: goto L_0x0418;
                case 33: goto L_0x0411;
                case 34: goto L_0x017f;
                case 35: goto L_0x016e;
                case 36: goto L_0x0158;
                case 37: goto L_0x013e;
                case 38: goto L_0x00fb;
                case 39: goto L_0x00e9;
                case 40: goto L_0x00bb;
                case 41: goto L_0x00ae;
                case 42: goto L_0x00a1;
                case 43: goto L_0x0071;
                case 44: goto L_0x004f;
                case 45: goto L_0x0038;
                case 46: goto L_0x0021;
                case 47: goto L_0x000a;
                case 48: goto L_0x0066;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r4 = r1.A01
        L_0x0009:
            return r4
        L_0x000a:
            java.lang.Object r0 = r1.A01
            android.os.Bundle r1 = X.DbS.A0B(r0)
            java.lang.String r0 = "analytics_referral_page"
            java.lang.String r0 = r1.getString(r0)
            if (r0 == 0) goto L_0x001e
            X.V1X r4 = X.V1X.valueOf(r0)
            if (r4 != 0) goto L_0x0009
        L_0x001e:
            X.V1X r4 = X.V1X.UNKNOWN
            return r4
        L_0x0021:
            java.lang.Object r0 = r1.A01
            android.os.Bundle r1 = X.DbS.A0B(r0)
            java.lang.String r0 = "analytics_referral_module"
            java.lang.String r0 = r1.getString(r0)
            if (r0 == 0) goto L_0x0035
            X.V1Y r4 = X.V1Y.valueOf(r0)
            if (r4 != 0) goto L_0x0009
        L_0x0035:
            X.V1Y r4 = X.V1Y.UNKNOWN
            return r4
        L_0x0038:
            java.lang.Object r0 = r1.A01
            android.os.Bundle r1 = X.DbS.A0B(r0)
            java.lang.String r0 = "analytics_referral_experience"
            java.lang.String r0 = r1.getString(r0)
            if (r0 == 0) goto L_0x004c
            X.V1W r4 = X.V1W.valueOf(r0)
            if (r4 != 0) goto L_0x0009
        L_0x004c:
            X.V1W r4 = X.V1W.UNKNOWN
            return r4
        L_0x004f:
            java.lang.Object r0 = r1.A01
            android.os.Bundle r1 = X.DbS.A0B(r0)
            java.lang.String r0 = "analytics_referral_component"
            java.lang.String r0 = r1.getString(r0)
            if (r0 == 0) goto L_0x0063
            X.V1Z r4 = X.V1Z.valueOf(r0)
            if (r4 != 0) goto L_0x0009
        L_0x0063:
            X.V1Z r4 = X.V1Z.UNKNOWN
            return r4
        L_0x0066:
            java.lang.Object r0 = r1.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            android.os.Bundle r0 = r0.mArguments
            java.lang.String r4 = X.C228022kf.A00(r0)
            return r4
        L_0x0071:
            java.lang.Object r6 = r1.A01
            X.Ub7 r6 = (X.C15356Ub7) r6
            androidx.fragment.app.FragmentActivity r5 = r6.requireActivity()
            X.0eM r0 = r6.A0F
            com.instagram.common.session.UserSession r7 = X.AnonymousClass7TE.A0l(r0)
            X.0eM r0 = r6.A0G
            java.lang.String r11 = X.DbS.A0t(r0)
            X.0eM r0 = r6.A09
            r0.getValue()
            X.0eM r0 = r6.A05
            java.lang.Object r9 = r0.getValue()
            X.Vzs r9 = (X.C18757Vzs) r9
            X.0eM r0 = r6.A0J
            java.lang.Object r10 = r0.getValue()
            X.VWx r10 = (X.C17470VWx) r10
            X.Var r4 = new X.Var
            r8 = r6
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            return r4
        L_0x00a1:
            java.lang.Object r0 = r1.A01
            android.os.Bundle r1 = X.DbS.A0B(r0)
            java.lang.String r0 = "prior_submodule_name"
            java.lang.String r4 = r1.getString(r0)
            return r4
        L_0x00ae:
            java.lang.Object r0 = r1.A01
            android.os.Bundle r1 = X.DbS.A0B(r0)
            java.lang.String r0 = "prior_module_name"
            java.lang.String r4 = r1.getString(r0)
            return r4
        L_0x00bb:
            java.lang.Object r5 = r1.A01
            X.Ub7 r5 = (X.C15356Ub7) r5
            X.0eM r0 = r5.A0F
            com.instagram.common.session.UserSession r6 = X.AnonymousClass7TE.A0l(r0)
            X.0eM r0 = r5.A09
            java.lang.String r7 = X.DbS.A0t(r0)
            X.0eM r0 = r5.A0E
            java.lang.Object r0 = r0.getValue()
            X.V1X r0 = (X.V1X) r0
            java.lang.String r8 = r0.name()
            X.0eM r0 = r5.A0C
            java.lang.Object r0 = r0.getValue()
            X.V1W r0 = (X.V1W) r0
            java.lang.String r9 = r0.name()
            X.Vhr r4 = new X.Vhr
            r4.<init>(r5, r6, r7, r8, r9)
            return r4
        L_0x00e9:
            java.lang.Object r0 = r1.A01
            X.Ub7 r0 = (X.C15356Ub7) r0
            X.0eM r0 = r0.A05
            java.lang.Object r0 = r0.getValue()
            X.Vzs r0 = (X.C18757Vzs) r0
            X.Wdv r4 = new X.Wdv
            r4.<init>(r0)
            return r4
        L_0x00fb:
            java.lang.Object r9 = r1.A01
            X.Ub7 r9 = (X.C15356Ub7) r9
            X.0eM r0 = r9.A0F
            com.instagram.common.session.UserSession r10 = X.AnonymousClass7TE.A0l(r0)
            X.0eM r0 = r9.A0G
            java.lang.String r12 = X.DbS.A0t(r0)
            X.0eM r0 = r9.A09
            java.lang.String r13 = X.DbS.A0t(r0)
            X.0eM r0 = r9.A0A
            java.lang.String r14 = X.DbS.A0t(r0)
            X.0eM r0 = r9.A0C
            java.lang.Object r6 = r0.getValue()
            X.V1W r6 = (X.V1W) r6
            X.0eM r0 = r9.A0E
            java.lang.Object r8 = r0.getValue()
            X.V1X r8 = (X.V1X) r8
            X.0eM r0 = r9.A0D
            java.lang.Object r7 = r0.getValue()
            X.V1Y r7 = (X.V1Y) r7
            X.0eM r0 = r9.A0B
            java.lang.Object r5 = r0.getValue()
            X.V1Z r5 = (X.V1Z) r5
            X.Vzs r4 = new X.Vzs
            r11 = r9
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return r4
        L_0x013e:
            java.lang.Object r0 = r1.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            X.2tC r1 = X.DbV.A0S(r0)
            X.Uhe r0 = new X.Uhe
            r0.<init>()
            r1.A01(r0)
            X.NNp r0 = new X.NNp
            r0.<init>()
            X.2t9 r4 = X.DbU.A0U(r1, r0)
            return r4
        L_0x0158:
            java.lang.Object r0 = r1.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            android.content.Context r1 = r0.requireContext()
            int r0 = X.C13990Tnq.A0A(r0)
            float r0 = (float) r0
            float r0 = X.0nA.A01(r1, r0)
            java.lang.Float r4 = java.lang.Float.valueOf(r0)
            return r4
        L_0x016e:
            java.lang.Object r0 = r1.A01
            android.os.Bundle r1 = X.DbS.A0B(r0)
            r0 = 508(0x1fc, float:7.12E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            java.lang.String r4 = r1.getString(r0)
            return r4
        L_0x017f:
            java.lang.Object r0 = r1.A01
            android.os.Bundle r1 = X.DbS.A0B(r0)
            r0 = 507(0x1fb, float:7.1E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            java.lang.String r4 = r1.getString(r0)
            return r4
        L_0x0190:
            X.1YN r3 = X.AnonymousClass2bO.A00()
            java.lang.Object r0 = r1.A01
            X.Uar r0 = (X.C15341Uar) r0
            X.0eM r0 = r0.A0M
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r0)
            com.instagram.quickpromotion.intf.QPTooltipAnchor r1 = com.instagram.quickpromotion.intf.QPTooltipAnchor.IGTV_PIN_PRODUCTS_BUTTON
            X.2qQ r0 = new X.2qQ
            r0.<init>()
            X.0eP[] r0 = X.DbW.A1b(r1, r0)
            java.util.LinkedHashMap r0 = X.0Yt.A07(r0)
            X.2qT r4 = r3.A04(r2, r0)
            return r4
        L_0x01b2:
            X.1YN r2 = X.AnonymousClass2bO.A00()
            java.lang.Object r3 = r1.A01
            X.Uar r3 = (X.C15341Uar) r3
            X.0eM r0 = r3.A0M
            com.instagram.common.session.UserSession r5 = X.AnonymousClass7TE.A0l(r0)
            com.instagram.quickpromotion.intf.QuickPromotionSlot r7 = com.instagram.quickpromotion.intf.QuickPromotionSlot.A0z
            X.AnonymousClass2bO.A00()
            r0 = 5
            X.WZY r1 = new X.WZY
            r1.<init>(r3, r0)
            X.0eM r0 = r3.A0L
            java.lang.Object r0 = r0.getValue()
            X.2qT r0 = (X.C230882qT) r0
            X.2bW r6 = X.2bV.A06(r1, r0)
            r4 = r3
            X.2qi r4 = r2.A01(r3, r4, r5, r6, r7)
            return r4
        L_0x01dd:
            java.lang.Object r2 = r1.A01
            X.Uar r2 = (X.C15341Uar) r2
            X.0eM r1 = r2.A0M
            com.instagram.common.session.UserSession r5 = X.AnonymousClass7TE.A0l(r1)
            X.0sl r10 = X.0sl.A00
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r1)
            com.instagram.model.shopping.ProductSource r6 = X.W3U.A00(r0)
            if (r6 != 0) goto L_0x01fe
            java.lang.String r1 = X.DbU.A0u(r1)
            X.Uyv r0 = X.C16659Uyv.CATALOG
            com.instagram.model.shopping.ProductSource r6 = new com.instagram.model.shopping.ProductSource
            r6.<init>(r0, r1)
        L_0x01fe:
            int r11 = r2.A00
            X.Uxb r7 = r2.A06
            if (r7 != 0) goto L_0x0207
            java.lang.String r0 = "surface"
            goto L_0x0256
        L_0x0207:
            X.0eM r0 = r2.A0N
            java.lang.String r8 = X.DbS.A0t(r0)
            X.0eM r0 = r2.A0O
            java.lang.String r9 = X.DbS.A0t(r0)
            X.UhX r4 = new X.UhX
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            return r4
        L_0x0219:
            java.lang.Object r3 = r1.A01
            X.Uar r3 = (X.C15341Uar) r3
            X.0eM r2 = r3.A0M
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r2)
            java.lang.String r0 = r3.A07
            if (r0 == 0) goto L_0x0268
            X.VgG r6 = new X.VgG
            r6.<init>(r1, r3, r0)
            com.instagram.common.session.UserSession r5 = X.AnonymousClass7TE.A0l(r2)
            r7 = 0
            X.0eM r0 = r3.A0N
            java.lang.String r9 = X.DbS.A0t(r0)
            X.0eM r0 = r3.A0O
            java.lang.String r10 = X.DbS.A0t(r0)
            X.UhU r4 = new X.UhU
            r8 = r7
            r4.<init>(r5, r6, r7, r8, r9, r10)
            return r4
        L_0x0244:
            X.3kF r2 = X.C249713kF.A00
            java.lang.Object r4 = r1.A01
            X.Uar r4 = (X.C15341Uar) r4
            X.0eM r0 = r4.A0M
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r0)
            java.lang.String r5 = r4.A08
            if (r5 != 0) goto L_0x025e
            java.lang.String r0 = "waterfallId"
        L_0x0256:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x025e:
            java.lang.String r6 = r4.A07
            if (r6 == 0) goto L_0x0268
            r7 = 0
            X.W02 r4 = r2.A05(r3, r4, r5, r6, r7)
            return r4
        L_0x0268:
            java.lang.String r0 = "priorModule"
            goto L_0x0256
        L_0x026b:
            java.lang.Object r4 = r1.A01
            X.Uah r4 = (X.C15332Uah) r4
            android.os.Bundle r1 = r4.requireArguments()
            X.0eM r3 = r4.A01
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r3)
            java.lang.String r0 = "prior_module"
            java.lang.String r0 = X.C320236s2.A01(r1, r0)
            X.VgG r6 = new X.VgG
            r6.<init>(r2, r4, r0)
            com.instagram.common.session.UserSession r5 = X.AnonymousClass7TE.A0l(r3)
            r0 = 509(0x1fd, float:7.13E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            java.lang.String r7 = r1.getString(r0)
            r0 = 510(0x1fe, float:7.15E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            java.lang.String r8 = r1.getString(r0)
            r0 = 507(0x1fb, float:7.1E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            java.lang.String r9 = r1.getString(r0)
            r0 = 508(0x1fc, float:7.12E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            java.lang.String r10 = r1.getString(r0)
            X.UhU r4 = new X.UhU
            r4.<init>(r5, r6, r7, r8, r9, r10)
            return r4
        L_0x02b6:
            java.lang.Object r2 = r1.A01
            X.Uah r2 = (X.C15332Uah) r2
            X.Wby r1 = new X.Wby
            r1.<init>(r2)
            android.content.Context r0 = r2.requireContext()
            X.VgF r4 = new X.VgF
            r4.<init>(r0, r2, r1)
            return r4
        L_0x02c9:
            java.lang.Object r3 = r1.A01
            X.UcC r3 = (X.C15402UcC) r3
            com.instagram.common.session.UserSession r2 = r3.getSession()
            X.0eM r0 = r3.A04
            java.lang.Object r1 = r0.getValue()
            X.1Xj r1 = (X.1Xj) r1
            X.UhC r0 = new X.UhC
            r0.<init>(r2, r1)
            X.2YN r1 = new X.2YN
            r1.<init>(r0, r3)
            java.lang.Class<X.Jgb> r0 = X.C60156Jgb.class
            X.2YL r4 = r1.A00(r0)
            return r4
        L_0x02ea:
            java.lang.Object r3 = r1.A01
            X.UcC r3 = (X.C15402UcC) r3
            androidx.fragment.app.FragmentActivity r1 = r3.requireActivity()
            android.content.Context r0 = r3.requireContext()
            com.instagram.common.session.UserSession r2 = r3.getSession()
            r5 = 0
            java.lang.String r4 = "shops_mini_pdp"
            r7 = 1
            r6 = r5
            X.2qw r4 = X.C231132qv.A02(r0, r1, r2, r3, r4, r5, r6, r7)
            return r4
        L_0x0304:
            java.lang.Object r3 = r1.A01
            X.4mT r3 = (X.C273374mT) r3
            com.instagram.common.session.UserSession r0 = r3.getSession()
            X.1E8 r2 = X.1E7.A00(r0)
            android.os.Bundle r1 = r3.requireArguments()
            java.lang.String r0 = "media_id"
            java.lang.String r0 = r1.getString(r0)
            X.1Xj r1 = r2.A02(r0)
            if (r1 == 0) goto L_0x0329
            com.instagram.common.session.UserSession r0 = r3.getSession()
            X.1Xj r4 = r1.A1e(r0)
            return r4
        L_0x0329:
            r4 = 0
            return r4
        L_0x032b:
            java.lang.Object r0 = r1.A01
            X.UcC r0 = (X.C15402UcC) r0
            X.0eM r0 = r0.A06
            java.lang.Object r0 = r0.getValue()
            X.Jgb r0 = (X.C60156Jgb) r0
            X.05G r6 = r0.A02
        L_0x0339:
            java.lang.Object r5 = r6.getValue()
            r4 = r5
            X.Jw5 r4 = (X.C61067Jw5) r4
            java.lang.Object r1 = r4.A01
            java.util.Collection r1 = (java.util.Collection) r1
            X.VvO r0 = X.C18631VvO.A00
            java.util.ArrayList r3 = X.00k.A0T(r0, r1)
            java.lang.Object r2 = r4.A02
            com.instagram.user.model.Product r2 = (com.instagram.user.model.Product) r2
            boolean r1 = r4.A04
            boolean r0 = r4.A03
            X.Jw5 r0 = X.C61067Jw5.A00(r2, r3, r1, r0)
            boolean r0 = r6.AIY(r5, r0)
            if (r0 == 0) goto L_0x0339
            goto L_0x038e
        L_0x035d:
            java.lang.Object r0 = r1.A01
            X.UcC r0 = (X.C15402UcC) r0
            X.0eM r0 = r0.A06
            java.lang.Object r0 = r0.getValue()
            X.Jgb r0 = (X.C60156Jgb) r0
            X.05G r6 = r0.A02
        L_0x036b:
            java.lang.Object r5 = r6.getValue()
            r4 = r5
            X.Jw5 r4 = (X.C61067Jw5) r4
            java.lang.Object r1 = r4.A01
            java.util.Collection r1 = (java.util.Collection) r1
            X.VvN r0 = X.C18630VvN.A00
            java.util.ArrayList r3 = X.00k.A0T(r0, r1)
            java.lang.Object r2 = r4.A02
            com.instagram.user.model.Product r2 = (com.instagram.user.model.Product) r2
            boolean r1 = r4.A04
            boolean r0 = r4.A03
            X.Jw5 r0 = X.C61067Jw5.A00(r2, r3, r1, r0)
            boolean r0 = r6.AIY(r5, r0)
            if (r0 == 0) goto L_0x036b
        L_0x038e:
            X.0gF r4 = X.C60340gF.A00
            return r4
        L_0x0391:
            java.lang.Object r4 = r1.A01
            X.Uae r4 = (X.C15329Uae) r4
            X.0eM r0 = r4.A0G
            X.0lg r3 = X.DbT.A0X(r0)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36313256997947231(0x8102b70000075f, double:3.02798817502663E-306)
            boolean r3 = X.182.A06(r2, r3, r0)
            r0 = 5
            java.lang.String r2 = X.AnonymousClass000.A00(r0)
            androidx.fragment.app.FragmentActivity r0 = r4.requireActivity()
            android.view.View r1 = X.C66581MXm.A0A(r0)
            X.0qQ.A0C(r1, r2)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            if (r3 == 0) goto L_0x03c0
            X.7HT r4 = new X.7HT
            r4.<init>(r1)
            return r4
        L_0x03c0:
            r0 = 0
            X.2xl r4 = new X.2xl
            r4.<init>(r1, r0)
            return r4
        L_0x03c7:
            java.lang.Object r2 = r1.A01
            X.Uae r2 = (X.C15329Uae) r2
            X.0eM r0 = r2.A0G
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r0)
            X.0eM r0 = r2.A0K
            java.lang.Object r0 = r0.getValue()
            X.2el r0 = (X.2el) r0
            X.VTq r4 = new X.VTq
            r4.<init>(r1, r0, r2)
            return r4
        L_0x03df:
            java.lang.Object r3 = r1.A01
            X.Uae r3 = (X.C15329Uae) r3
            android.content.Context r2 = r3.requireContext()
            X.0eM r0 = r3.A0G
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r0)
            X.4DU r0 = r3.A09
            X.Vkr r4 = new X.Vkr
            r4.<init>(r2, r1, r0, r3)
            return r4
        L_0x03f5:
            java.lang.Object r3 = r1.A01
            X.Uae r3 = (X.C15329Uae) r3
            android.content.Context r2 = r3.requireContext()
            X.0eM r0 = r3.A0G
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r0)
            X.0eM r0 = r3.A0A
            com.instagram.shopping.fragment.pdp.lightbox.LightboxArguments r0 = X.C13990Tnq.A0W(r0)
            com.instagram.user.model.Product r0 = r0.A01
            X.Wde r4 = new X.Wde
            r4.<init>(r2, r1, r0)
            return r4
        L_0x0411:
            java.lang.Object r0 = r1.A01
            X.07f r4 = X.DbY.A0I(r0)
            return r4
        L_0x0418:
            java.lang.Object r0 = r1.A01
            java.lang.Object r4 = X.DbT.A0r(r0)
            return r4
        L_0x041f:
            java.lang.Object r0 = r1.A01
            X.Uae r0 = (X.C15329Uae) r0
            X.0eM r0 = r0.A0G
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.VWg r4 = new X.VWg
            r4.<init>(r0)
            return r4
        L_0x042f:
            java.lang.Object r3 = r1.A01
            X.Uae r3 = (X.C15329Uae) r3
            X.0eM r0 = r3.A0G
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r0)
            X.328 r1 = new X.328
            r1.<init>(r3)
            X.4DU r0 = r3.A09
            X.32A r4 = new X.32A
            r4.<init>(r0, r2, r1)
            return r4
        L_0x0446:
            java.lang.Object r0 = r1.A01
            X.Uae r0 = (X.C15329Uae) r0
            X.4DU r6 = r0.A09
            X.0eM r1 = r0.A0G
            com.instagram.common.session.UserSession r7 = X.AnonymousClass7TE.A0l(r1)
            X.0eM r2 = r0.A0A
            com.instagram.shopping.fragment.pdp.lightbox.LightboxArguments r0 = X.C13990Tnq.A0W(r2)
            com.instagram.user.model.Product r9 = r0.A01
            com.instagram.shopping.fragment.pdp.lightbox.LightboxArguments r0 = X.C13990Tnq.A0W(r2)
            java.lang.String r10 = r0.A03
            com.instagram.shopping.fragment.pdp.lightbox.LightboxArguments r0 = X.C13990Tnq.A0W(r2)
            java.lang.String r11 = r0.A09
            com.instagram.shopping.fragment.pdp.lightbox.LightboxArguments r0 = X.C13990Tnq.A0W(r2)
            java.lang.String r12 = r0.A0B
            com.instagram.shopping.fragment.pdp.lightbox.LightboxArguments r0 = X.C13990Tnq.A0W(r2)
            java.lang.String r13 = r0.A0C
            com.instagram.shopping.fragment.pdp.lightbox.LightboxArguments r0 = X.C13990Tnq.A0W(r2)
            java.lang.String r14 = r0.A0E
            X.1E8 r1 = X.DbX.A0d(r1)
            com.instagram.shopping.fragment.pdp.lightbox.LightboxArguments r0 = X.C13990Tnq.A0W(r2)
            java.lang.String r0 = r0.A07
            X.1Xj r8 = r1.A02(r0)
            com.instagram.shopping.fragment.pdp.lightbox.LightboxArguments r0 = X.C13990Tnq.A0W(r2)
            java.lang.String r15 = r0.A02
            com.instagram.shopping.fragment.pdp.lightbox.LightboxArguments r0 = X.C13990Tnq.A0W(r2)
            com.instagram.api.schemas.RankingInfo r5 = r0.A00
            com.instagram.shopping.fragment.pdp.lightbox.LightboxArguments r0 = X.C13990Tnq.A0W(r2)
            java.lang.String r1 = r0.A04
            com.instagram.shopping.fragment.pdp.lightbox.LightboxArguments r0 = X.C13990Tnq.A0W(r2)
            java.lang.String r0 = r0.A0D
            X.W1d r4 = new X.W1d
            r16 = r1
            r17 = r0
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            return r4
        L_0x04a8:
            java.lang.Object r2 = r1.A01
            X.Uae r2 = (X.C15329Uae) r2
            X.0eM r0 = r2.A0G
            com.instagram.common.session.UserSession r5 = X.AnonymousClass7TE.A0l(r0)
            X.0eM r1 = r2.A0A
            com.instagram.shopping.fragment.pdp.lightbox.LightboxArguments r0 = X.C13990Tnq.A0W(r1)
            com.instagram.user.model.Product r7 = r0.A01
            com.instagram.shopping.fragment.pdp.lightbox.LightboxArguments r0 = X.C13990Tnq.A0W(r1)
            java.util.HashMap r9 = r0.A0G
            com.instagram.shopping.fragment.pdp.lightbox.LightboxArguments r0 = X.C13990Tnq.A0W(r1)
            java.lang.String r8 = r0.A07
            X.0eM r0 = r2.A0C
            java.lang.Object r6 = r0.getValue()
            X.W1d r6 = (X.C18778W1d) r6
            int r10 = X.JTT.A06(r2)
            X.UhT r4 = new X.UhT
            r4.<init>(r5, r6, r7, r8, r9, r10)
            return r4
        L_0x04d8:
            java.lang.Object r0 = r1.A01
            android.os.Bundle r1 = X.DbS.A0B(r0)
            java.lang.String r0 = "arguments"
            android.os.Parcelable r4 = r1.getParcelable(r0)
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.shopping.fragment.pdp.lightbox.LightboxArguments"
            X.0qQ.A0C(r4, r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20701WxY.invoke():java.lang.Object");
    }
}
