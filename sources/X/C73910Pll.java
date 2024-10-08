package X;

/* renamed from: X.Pll  reason: case insensitive filesystem */
public final class C73910Pll extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C73910Pll(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    public static 0t0 A00(Object obj, int i) {
        return AnonymousClass0eN.A01(new C73910Pll(obj, i));
    }

    /* JADX WARNING: type inference failed for: r1v35, types: [X.9Hq, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0065, code lost:
        if (r2.A1T != X.AnonymousClass05K.A0C) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00b9, code lost:
        if (r4.A1T != X.AnonymousClass05K.A0C) goto L_0x00bb;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r63 = this;
            r1 = r63
            int r0 = r1.A00
            switch(r0) {
                case 0: goto L_0x003a;
                case 1: goto L_0x008e;
                case 2: goto L_0x00ed;
                case 3: goto L_0x00f9;
                case 4: goto L_0x0120;
                case 5: goto L_0x012a;
                case 6: goto L_0x014a;
                case 7: goto L_0x0154;
                case 8: goto L_0x015e;
                case 9: goto L_0x0169;
                case 10: goto L_0x012a;
                case 11: goto L_0x017c;
                case 12: goto L_0x01cf;
                case 13: goto L_0x0228;
                case 14: goto L_0x0232;
                case 15: goto L_0x0242;
                case 16: goto L_0x024c;
                case 17: goto L_0x0256;
                case 18: goto L_0x0277;
                case 19: goto L_0x0288;
                case 20: goto L_0x0293;
                case 21: goto L_0x029f;
                case 22: goto L_0x02bc;
                case 23: goto L_0x02c6;
                case 24: goto L_0x02d7;
                case 25: goto L_0x02e1;
                case 26: goto L_0x02eb;
                case 27: goto L_0x000e;
                case 28: goto L_0x02f5;
                case 29: goto L_0x0303;
                case 30: goto L_0x030e;
                case 31: goto L_0x0318;
                case 32: goto L_0x0322;
                case 33: goto L_0x032d;
                case 34: goto L_0x033c;
                case 35: goto L_0x0588;
                case 36: goto L_0x0597;
                case 37: goto L_0x05b9;
                case 38: goto L_0x05c3;
                case 39: goto L_0x05c3;
                case 40: goto L_0x05ce;
                case 41: goto L_0x05e7;
                case 42: goto L_0x0037;
                case 43: goto L_0x0605;
                case 44: goto L_0x0007;
                case 45: goto L_0x060c;
                case 46: goto L_0x0617;
                case 47: goto L_0x0037;
                case 48: goto L_0x0605;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r0 = r1.A01
            X.07f r0 = X.DbY.A0I(r0)
        L_0x000d:
            return r0
        L_0x000e:
            java.lang.Object r1 = r1.A01
            X.Ma2 r1 = (X.C66633Ma2) r1
            X.0eM r0 = r1.A2u
            java.lang.Object r3 = r0.getValue()
            X.2el r3 = (X.2el) r3
            r0 = 0
            if (r3 == 0) goto L_0x000d
            X.2lJ r6 = r1.A1R
            if (r6 == 0) goto L_0x000d
            com.instagram.common.session.UserSession r2 = r1.A0p()
            java.lang.Integer r7 = X.AnonymousClass05K.A15
            r4 = 0
            r9 = 1
            X.4DH r0 = r1.A1J
            java.lang.String r8 = r0.getModuleName()
            X.GAC r0 = new X.GAC
            r5 = r4
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return r0
        L_0x0037:
            java.lang.Object r0 = r1.A01
            return r0
        L_0x003a:
            java.lang.Object r2 = r1.A01
            X.Ma2 r2 = (X.C66633Ma2) r2
            com.instagram.common.session.UserSession r4 = r2.A0p()
            X.0eE r1 = X.AnonymousClass0t1.A01
            com.instagram.common.session.UserSession r0 = r2.A0p()
            com.instagram.user.model.User r0 = r1.A01(r0)
            boolean r7 = r0.A2L()
            boolean r8 = r2.A2y
            com.instagram.common.session.UserSession r0 = r2.A0p()
            X.2HN r0 = X.2HM.A00(r0)
            boolean r0 = r0.A07()
            if (r0 == 0) goto L_0x0067
            java.lang.Integer r1 = r2.A1T
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            r9 = 1
            if (r1 == r0) goto L_0x0068
        L_0x0067:
            r9 = 0
        L_0x0068:
            X.43A r5 = X.AnonymousClass43A.A00
            com.instagram.common.session.UserSession r3 = r2.A0p()
            X.0Tu r2 = X.0Tu.A05
            r0 = 36312376530109508(0x8101ea00070444, double:3.0274313636206945E-306)
            java.lang.Boolean r6 = X.AnonymousClass7TF.A0R(r2, r3, r0)
            X.Mgq r0 = new X.Mgq
            r3 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r3 = 20000(0x4e20, double:9.8813E-320)
            android.os.Handler r2 = X.AnonymousClass7TF.A0D()
            X.MiC r1 = new X.MiC
            r1.<init>(r0)
            r2.postDelayed(r1, r3)
            return r0
        L_0x008e:
            java.lang.Object r4 = r1.A01
            X.Ma2 r4 = (X.C66633Ma2) r4
            com.instagram.common.session.UserSession r5 = r4.A0p()
            X.0eE r1 = X.AnonymousClass0t1.A01
            com.instagram.common.session.UserSession r0 = r4.A0p()
            com.instagram.user.model.User r0 = r1.A01(r0)
            boolean r6 = r0.A2L()
            boolean r7 = r4.A2y
            com.instagram.common.session.UserSession r0 = r4.A0p()
            X.2HN r0 = X.2HM.A00(r0)
            boolean r0 = r0.A07()
            if (r0 == 0) goto L_0x00bb
            java.lang.Integer r1 = r4.A1T
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            r8 = 1
            if (r1 == r0) goto L_0x00bc
        L_0x00bb:
            r8 = 0
        L_0x00bc:
            com.instagram.common.session.UserSession r2 = r4.A0p()
            X.0Tu r3 = X.0Tu.A05
            r0 = 36313076611155678(0x81028d001c06de, double:3.0278740976932925E-306)
            boolean r9 = X.182.A06(r3, r2, r0)
            com.instagram.common.session.UserSession r2 = r4.A0p()
            r0 = 36313076611221215(0x81028d001d06df, double:3.0278740977347384E-306)
            boolean r10 = X.182.A06(r3, r2, r0)
            X.Mi9 r0 = new X.Mi9
            r4 = r0
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r3 = 30000(0x7530, double:1.4822E-319)
            android.os.Handler r2 = X.AnonymousClass7TF.A0D()
            X.MiB r1 = new X.MiB
            r1.<init>(r0)
            r2.postDelayed(r1, r3)
            return r0
        L_0x00ed:
            java.lang.Object r0 = r1.A01
            com.instagram.common.session.UserSession r1 = X.C66583MXo.A0M(r0)
            X.43E r0 = new X.43E
            r0.<init>(r1)
            return r0
        L_0x00f9:
            java.lang.Object r0 = r1.A01
            X.Ma2 r0 = (X.C66633Ma2) r0
            com.instagram.common.session.UserSession r4 = r0.A0p()
            X.4DH r3 = r0.A1J
            X.MjH r2 = new X.MjH
            r2.<init>(r0)
            r0 = 0
            X.0qQ.A0B(r4, r0)
            boolean r0 = X.AnonymousClass4AJ.A03(r4)
            if (r0 == 0) goto L_0x0595
            java.lang.String r0 = r3.getModuleName()
            X.0xG r1 = X.DbS.A0O(r0)
            X.MgA r0 = new X.MgA
            r0.<init>(r3, r1, r4, r2)
            return r0
        L_0x0120:
            java.lang.Object r1 = r1.A01
            X.Ma2 r1 = (X.C66633Ma2) r1
            X.MlE r0 = new X.MlE
            r0.<init>(r1)
            return r0
        L_0x012a:
            java.lang.Object r4 = r1.A01
            X.Ma2 r4 = (X.C66633Ma2) r4
            android.view.View r3 = r4.A0C
            if (r3 == 0) goto L_0x0145
            r0 = 0
            r4.A0C = r0
            com.instagram.common.session.UserSession r2 = r4.A0p()
            X.Mht r1 = new X.Mht
            r1.<init>(r4)
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            X.3AD r0 = X.C3253672c.A02(r3, r2, r1, r0)
            return r0
        L_0x0145:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x014a:
            java.lang.Object r1 = r1.A01
            X.Ma2 r1 = (X.C66633Ma2) r1
            X.MlC r0 = new X.MlC
            r0.<init>(r1)
            return r0
        L_0x0154:
            java.lang.Object r1 = r1.A01
            X.Ma2 r1 = (X.C66633Ma2) r1
            X.MiT r0 = new X.MiT
            r0.<init>(r1)
            return r0
        L_0x015e:
            java.lang.Object r0 = r1.A01
            com.instagram.common.session.UserSession r0 = X.C66583MXo.A0M(r0)
            X.4A0 r0 = X.C2615449z.A00(r0)
            return r0
        L_0x0169:
            java.lang.Object r0 = r1.A01
            X.Ma2 r0 = (X.C66633Ma2) r0
            X.4DH r2 = r0.A1J
            android.content.Context r1 = r2.requireContext()
            com.instagram.common.session.UserSession r0 = r0.A0p()
            X.Dfm r0 = X.C46482Dfl.A00(r1, r2, r0)
            return r0
        L_0x017c:
            X.1YN r17 = X.AnonymousClass2bO.A00()
            java.lang.Object r3 = r1.A01
            X.Ma2 r3 = (X.C66633Ma2) r3
            X.4DH r2 = r3.A1J
            com.instagram.common.session.UserSession r20 = r3.A0p()
            com.instagram.quickpromotion.intf.QuickPromotionSlot r22 = com.instagram.quickpromotion.intf.QuickPromotionSlot.A0J
            X.AnonymousClass2bO.A00()
            r5 = 0
            r1 = 1
            X.PIv r8 = new X.PIv
            r8.<init>(r3, r1)
            X.FhY r6 = new X.FhY
            r6.<init>(r3, r1)
            X.PIx r13 = new X.PIx
            r13.<init>(r3, r1)
            r0 = 0
            X.IWV r12 = new X.IWV
            r12.<init>(r3, r0)
            X.0eM r0 = r3.A2V
            java.lang.Object r14 = r0.getValue()
            X.2qT r14 = (X.C230882qT) r14
            X.Mj9 r10 = new X.Mj9
            r10.<init>(r3)
            X.MhX r11 = new X.MhX
            r11.<init>(r3)
            X.FhW r4 = new X.FhW
            r4.<init>(r3, r1)
            r7 = r5
            r9 = r5
            r15 = r5
            r16 = r5
            X.2bW r21 = X.2bV.A00(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r19 = r2
            r18 = r2
            X.2qi r0 = r17.A01(r18, r19, r20, r21, r22)
            return r0
        L_0x01cf:
            X.1YN r3 = X.AnonymousClass2bO.A00()
            java.lang.Object r0 = r1.A01
            com.instagram.common.session.UserSession r2 = X.C66583MXo.A0M(r0)
            com.instagram.quickpromotion.intf.QPTooltipAnchor r1 = com.instagram.quickpromotion.intf.QPTooltipAnchor.INBOX_VIDEO_CALL_ICON
            X.2qQ r0 = new X.2qQ
            r0.<init>()
            X.0eP r4 = X.AnonymousClass7TE.A1L(r1, r0)
            com.instagram.quickpromotion.intf.QPTooltipAnchor r1 = com.instagram.quickpromotion.intf.QPTooltipAnchor.INBOX_FILTER_ICON
            X.2qQ r0 = new X.2qQ
            r0.<init>()
            X.0eP r5 = X.AnonymousClass7TE.A1L(r1, r0)
            com.instagram.quickpromotion.intf.QPTooltipAnchor r1 = com.instagram.quickpromotion.intf.QPTooltipAnchor.INBOX_OPTIONS_MENU_ICON
            X.2qQ r0 = new X.2qQ
            r0.<init>()
            X.0eP r6 = X.AnonymousClass7TE.A1L(r1, r0)
            com.instagram.quickpromotion.intf.QPTooltipAnchor r1 = com.instagram.quickpromotion.intf.QPTooltipAnchor.INBOX_SEARCH_BAR
            X.MjA r0 = new X.MjA
            r0.<init>()
            X.0eP r7 = X.AnonymousClass7TE.A1L(r1, r0)
            com.instagram.quickpromotion.intf.QPTooltipAnchor r1 = com.instagram.quickpromotion.intf.QPTooltipAnchor.INBOX_MESSAGE_ADS_ICON
            X.2qQ r0 = new X.2qQ
            r0.<init>()
            X.0eP r8 = X.AnonymousClass7TE.A1L(r1, r0)
            com.instagram.quickpromotion.intf.QPTooltipAnchor r1 = com.instagram.quickpromotion.intf.QPTooltipAnchor.INBOX_FOLDER_AD_RESPONSES
            X.2qQ r0 = new X.2qQ
            r0.<init>()
            X.0eP r9 = X.AnonymousClass7TE.A1L(r1, r0)
            X.0eP[] r0 = new X.0eP[]{r4, r5, r6, r7, r8, r9}
            java.util.LinkedHashMap r0 = X.0Yt.A06(r0)
            X.2qT r0 = r3.A04(r2, r0)
            return r0
        L_0x0228:
            java.lang.Object r1 = r1.A01
            X.Ma2 r1 = (X.C66633Ma2) r1
            X.Men r0 = new X.Men
            r0.<init>((X.C66633Ma2) r1)
            return r0
        L_0x0232:
            java.lang.Object r0 = r1.A01
            X.Ma2 r0 = (X.C66633Ma2) r0
            com.instagram.common.session.UserSession r2 = r0.A0p()
            X.4DH r1 = r0.A1J
            X.2om r0 = new X.2om
            r0.<init>(r1, r2)
            return r0
        L_0x0242:
            java.lang.Object r1 = r1.A01
            X.Ma2 r1 = (X.C66633Ma2) r1
            X.MjM r0 = new X.MjM
            r0.<init>(r1)
            return r0
        L_0x024c:
            java.lang.Object r1 = r1.A01
            X.Ma2 r1 = (X.C66633Ma2) r1
            X.MjN r0 = new X.MjN
            r0.<init>(r1)
            return r0
        L_0x0256:
            java.lang.Object r4 = r1.A01
            X.Ma2 r4 = (X.C66633Ma2) r4
            com.instagram.common.session.UserSession r3 = r4.A0p()
            X.0Tu r2 = X.0Tu.A05
            r0 = 36325892791874897(0x810e3500023551, double:3.035979101986744E-306)
            boolean r2 = X.182.A06(r2, r3, r0)
            X.0eM r0 = r4.A2A
            java.lang.Object r1 = r0.getValue()
            X.Mku r1 = (X.C67260Mku) r1
            X.MhK r0 = new X.MhK
            r0.<init>(r1, r2)
            return r0
        L_0x0277:
            java.lang.Object r0 = r1.A01
            X.Ma2 r0 = (X.C66633Ma2) r0
            com.instagram.common.session.UserSession r3 = r0.A0p()
            X.4DH r2 = r0.A1J
            r1 = 0
            X.MaJ r0 = new X.MaJ
            r0.<init>(r2, r3, r1)
            return r0
        L_0x0288:
            java.lang.Object r0 = r1.A01
            com.instagram.common.session.UserSession r0 = X.C66583MXo.A0M(r0)
            X.MYv r0 = X.C66606MYs.A00(r0)
            return r0
        L_0x0293:
            java.lang.Object r2 = r1.A01
            X.Ma2 r2 = (X.C66633Ma2) r2
            r0 = 0
            r2.A06 = r0
            r2.A05 = r0
            goto L_0x05cb
        L_0x029f:
            java.lang.Object r0 = r1.A01
            X.Ma2 r0 = (X.C66633Ma2) r0
            com.instagram.common.session.UserSession r3 = r0.A0p()
            X.0eE r1 = X.AnonymousClass0t1.A01
            com.instagram.common.session.UserSession r0 = r0.A0p()
            com.instagram.user.model.User r0 = r1.A01(r0)
            boolean r2 = r0.A2L()
            r1 = 0
            X.Nbb r0 = new X.Nbb
            r0.<init>(r3, r2, r1)
            return r0
        L_0x02bc:
            java.lang.Object r1 = r1.A01
            X.Ma2 r1 = (X.C66633Ma2) r1
            X.MiV r0 = new X.MiV
            r0.<init>(r1)
            return r0
        L_0x02c6:
            java.lang.Object r0 = r1.A01
            com.instagram.common.session.UserSession r2 = X.C66583MXo.A0M(r0)
            X.9Hq r1 = new X.9Hq
            r1.<init>()
            X.9Hr r0 = new X.9Hr
            r0.<init>(r2, r1)
            return r0
        L_0x02d7:
            java.lang.Object r1 = r1.A01
            X.Ma2 r1 = (X.C66633Ma2) r1
            X.Mjn r0 = new X.Mjn
            r0.<init>(r1)
            return r0
        L_0x02e1:
            java.lang.Object r1 = r1.A01
            X.Ma2 r1 = (X.C66633Ma2) r1
            X.MjI r0 = new X.MjI
            r0.<init>(r1)
            return r0
        L_0x02eb:
            java.lang.Object r1 = r1.A01
            X.Ma2 r1 = (X.C66633Ma2) r1
            X.MjG r0 = new X.MjG
            r0.<init>(r1)
            return r0
        L_0x02f5:
            java.lang.Object r0 = r1.A01
            X.Ma2 r0 = (X.C66633Ma2) r0
            X.2lJ r1 = r0.A1R
            if (r1 == 0) goto L_0x0595
            X.2mA r0 = new X.2mA
            r0.<init>(r1)
            return r0
        L_0x0303:
            java.lang.Object r0 = r1.A01
            com.instagram.common.session.UserSession r0 = X.C66583MXo.A0M(r0)
            X.42q r0 = X.MYQ.A00(r0)
            return r0
        L_0x030e:
            java.lang.Object r1 = r1.A01
            X.Ma2 r1 = (X.C66633Ma2) r1
            X.Dg2 r0 = new X.Dg2
            r0.<init>(r1)
            return r0
        L_0x0318:
            java.lang.Object r1 = r1.A01
            X.Ma2 r1 = (X.C66633Ma2) r1
            X.MiG r0 = new X.MiG
            r0.<init>(r1)
            return r0
        L_0x0322:
            java.lang.Object r0 = r1.A01
            com.instagram.common.session.UserSession r0 = X.C66583MXo.A0M(r0)
            X.2Dm r0 = X.2L2.A00(r0)
            return r0
        L_0x032d:
            java.lang.Object r0 = r1.A01
            X.Ma2 r0 = (X.C66633Ma2) r0
            com.instagram.common.session.UserSession r1 = r0.A0p()
            X.4DH r0 = r0.A1J
            X.0wc r0 = X.AnonymousClass0kN.A01(r0, r1)
            return r0
        L_0x033c:
            java.lang.Object r0 = r1.A01
            X.Ma2 r0 = (X.C66633Ma2) r0
            X.0eM r5 = r0.A1h
            java.lang.Object r1 = r5.getValue()
            X.Pvy r1 = (X.C74503Pvy) r1
            X.PxE r6 = r1.B6g()
            java.lang.Object r1 = r5.getValue()
            X.Pvy r1 = (X.C74503Pvy) r1
            X.PxF r28 = r1.C6W()
            com.instagram.common.session.UserSession r1 = r0.A0p()
            X.3mS r30 = X.C251033mS.A00(r1)
            X.Moi r1 = r0.A0b
            boolean r50 = X.AnonymousClass7TF.A1V(r1)
            X.4DH r1 = r0.A1J
            r23 = r1
            android.content.Context r4 = r23.requireContext()
            com.instagram.common.session.UserSession r9 = r0.A0p()
            androidx.fragment.app.FragmentActivity r15 = r23.requireActivity()
            X.0eM r1 = r0.A24
            java.lang.Object r3 = r1.getValue()
            X.PxD r3 = (X.C74564PxD) r3
            X.0eM r1 = r0.A2F
            java.lang.Object r14 = r1.getValue()
            X.2ms r14 = (X.C229122ms) r14
            X.0eM r1 = r0.A1y
            java.lang.Object r8 = r1.getValue()
            X.6wO r8 = (X.C322776wO) r8
            X.0eM r1 = r0.A20
            java.lang.Object r1 = r1.getValue()
            X.4bu r1 = (X.C267614bu) r1
            boolean r2 = r0.A2w
            boolean r18 = X.AnonymousClass7TF.A1P(r2)
            X.0eM r2 = r0.A1r
            java.lang.Object r2 = r2.getValue()
            X.Mi5 r2 = (X.Mi5) r2
            boolean r2 = r2.A0D
            r40 = r2
            X.0eM r2 = r0.A2C
            boolean r41 = X.AnonymousClass7TF.A1Z(r2)
            X.1aU r19 = r6.FN4()
            X.1aU r20 = r28.FN4()
            java.lang.Object r2 = r5.getValue()
            X.Pvy r2 = (X.C74503Pvy) r2
            X.Pvz r2 = r2.BzE()
            X.1aU r21 = r2.AE3()
            X.0eM r2 = r0.A2Q
            java.lang.Object r13 = r2.getValue()
            X.MiT r13 = (X.C67109MiT) r13
            com.instagram.common.session.UserSession r2 = r0.A0p()
            boolean r42 = X.AnonymousClass9B8.A02(r2)
            com.instagram.common.session.UserSession r7 = r0.A0p()
            r10 = 0
            X.0Tu r2 = X.DbS.A0J(r7, r10)
            r5 = 36320438183666097(0x81093f000621b1, double:3.032529585791555E-306)
            boolean r43 = X.182.A06(r2, r7, r5)
            com.instagram.common.session.UserSession r7 = X.C66580MXl.A0P(r0, r10)
            r5 = 36320438183928245(0x81093f000a21b5, double:3.032529585957338E-306)
            boolean r44 = X.182.A06(r2, r7, r5)
            com.instagram.common.session.UserSession r7 = X.C66580MXl.A0P(r0, r10)
            r5 = 36320438184780223(0x81093f001721bf, double:3.0325295864961325E-306)
            boolean r45 = X.182.A06(r2, r7, r5)
            com.instagram.common.session.UserSession r7 = X.C66580MXl.A0P(r0, r10)
            r5 = 36320438184845760(0x81093f001821c0, double:3.0325295865375783E-306)
            boolean r46 = X.182.A06(r2, r7, r5)
            com.instagram.common.session.UserSession r7 = X.C66580MXl.A0P(r0, r10)
            r5 = 36601913161617783(0x82093f00191177, double:3.210535495256963E-306)
            int r39 = X.DbS.A04(r2, r7, r5)
            com.instagram.common.session.UserSession r0 = r0.A0p()
            boolean r47 = X.AnonymousClass9B8.A0A(r0)
            r11 = 1
            X.C51974G9v.A0d(r11, r9, r3, r14, r8)
            r0 = 7
            X.0qQ.A0B(r1, r0)
            r0 = 17
            java.util.ArrayList r5 = X.AnonymousClass7TF.A0q(r13, r0)
            X.Mi2 r0 = new X.Mi2
            r0.<init>(r1)
            r5.add(r0)
            X.Mi1 r0 = new X.Mi1
            r0.<init>(r1)
            r5.add(r0)
            java.lang.String r24 = ""
            X.Mfn r7 = new X.Mfn
            r22 = r7
            r25 = r5
            r26 = r10
            r27 = r11
            r22.<init>(r23, r24, r25, r26, r27)
            boolean r0 = X.JYR.A01(r9)
            if (r0 != 0) goto L_0x0585
            boolean r0 = X.JYR.A00(r9)
            if (r0 != 0) goto L_0x0585
            com.instagram.monetization.repository.MonetizationRepository r5 = X.AnonymousClass2o3.A00(r9)
            com.instagram.api.schemas.UserMonetizationProductType r0 = com.instagram.api.schemas.UserMonetizationProductType.BRANDED_CONTENT_DEAL_CREATOR
            boolean r0 = r5.A06(r0)
            if (r0 != 0) goto L_0x046d
            com.instagram.monetization.repository.MonetizationRepository r0 = X.AnonymousClass2o3.A00(r9)
            boolean r0 = r0.A05
            if (r0 == 0) goto L_0x0585
        L_0x046d:
            r12 = 1
        L_0x046e:
            X.Mbk r25 = new X.Mbk
            r31 = r25
            r32 = r4
            r33 = r15
            r34 = r9
            r35 = r3
            r36 = r8
            r31.<init>(r32, r33, r34, r35, r36)
            r0 = 2131952161(0x7f130221, float:1.9540757E38)
            java.lang.String r6 = X.AnonymousClass7TE.A16(r4, r0)
            java.lang.String r5 = "find_people_header_row"
            X.Mgs r17 = new X.Mgs
            r0 = r17
            r0.<init>(r5, r6)
            X.MiY r16 = new X.MiY
            r0 = r16
            r0.<init>(r7)
            X.Mib r8 = new X.Mib
            r8.<init>(r4, r9, r3, r1)
            java.lang.Integer r33 = X.AnonymousClass05K.A01
            r0 = 2131959523(0x7f131ee3, float:1.9555689E38)
            java.lang.Integer r34 = java.lang.Integer.valueOf(r0)
            r58 = 0
            java.lang.String r35 = "channel_invites_header_row"
            r36 = 2131959455(0x7f131e9f, float:1.955555E38)
            X.Mid r32 = new X.Mid
            r37 = r10
            r38 = r11
            r32.<init>(r33, r34, r35, r36, r37, r38)
            java.lang.Integer r52 = X.AnonymousClass05K.A00
            java.lang.String r54 = "find_channels_header_row"
            r55 = 2131959457(0x7f131ea1, float:1.9555555E38)
            X.Mid r33 = new X.Mid
            r51 = r33
            r53 = r34
            r56 = r10
            r57 = r11
            r51.<init>(r52, r53, r54, r55, r56, r57)
            r0 = 2131959563(0x7f131f0b, float:1.955577E38)
            java.lang.String r0 = X.AnonymousClass7TE.A16(r4, r0)
            X.MiX r7 = new X.MiX
            r7.<init>(r0)
            com.instagram.user.model.User r0 = X.AnonymousClass7TF.A0Q(r9)
            boolean r0 = X.2Ek.A01(r0)
            if (r0 == 0) goto L_0x0572
            r60 = 2131959458(0x7f131ea2, float:1.9555557E38)
        L_0x04e1:
            r0 = 36600882370121764(0x82084f00231024, double:3.2098836185642166E-306)
            int r0 = X.DbS.A04(r2, r9, r0)
            r31 = 0
            if (r0 != r11) goto L_0x04f5
            r0 = 2131959557(0x7f131f05, float:1.9555758E38)
            java.lang.Integer r58 = java.lang.Integer.valueOf(r0)
        L_0x04f5:
            java.lang.String r59 = "suggestions_disclaimer_header_row"
            X.Mid r34 = new X.Mid
            r56 = r34
            r61 = r10
            r62 = r11
            r57 = r52
            r56.<init>(r57, r58, r59, r60, r61, r62)
            if (r18 == 0) goto L_0x051c
            r48 = r9
            r49 = r39
            r51 = r10
            r52 = r42
            r53 = r43
            r54 = r44
            r55 = r45
            r56 = r46
            r57 = r47
            X.MeV r31 = X.C66891MeW.A00(r48, r49, r50, r51, r52, r53, r54, r55, r56, r57)
        L_0x051c:
            r0 = 2131962421(0x7f132a35, float:1.9561567E38)
            java.lang.String r0 = X.AnonymousClass7TE.A16(r4, r0)
            X.MiZ r6 = new X.MiZ
            r6.<init>(r0)
            r0 = 2131968314(0x7f13413a, float:1.957352E38)
            java.lang.String r3 = X.AnonymousClass7TE.A16(r4, r0)
            r0 = 2131968313(0x7f134139, float:1.9573517E38)
            java.lang.String r2 = X.AnonymousClass7TE.A16(r4, r0)
            r0 = 2131963039(0x7f132c9f, float:1.956282E38)
            java.lang.String r1 = X.AnonymousClass7TE.A16(r4, r0)
            X.JYT r0 = new X.JYT
            r0.<init>(r15, r9)
            X.Mia r5 = new X.Mia
            r5.<init>(r0, r3, r2, r1)
            X.Mif r0 = new X.Mif
            r0.<init>(r15, r9)
            X.JYS r1 = new X.JYS
            r1.<init>(r0, r12)
            X.Mbh r0 = new X.Mbh
            r26 = r6
            r27 = r13
            r29 = r1
            r35 = r7
            r36 = r17
            r37 = r14
            r38 = r16
            r17 = r15
            r18 = r23
            r22 = r9
            r23 = r8
            r24 = r5
            r15 = r0
            r16 = r4
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47)
            return r0
        L_0x0572:
            r0 = 36317934218122912(0x8106f8000c16a0, double:3.0309460678993845E-306)
            boolean r0 = X.182.A06(r2, r9, r0)
            r60 = 2131959564(0x7f131f0c, float:1.9555772E38)
            if (r0 == 0) goto L_0x04e1
            r60 = 2131959556(0x7f131f04, float:1.9555756E38)
            goto L_0x04e1
        L_0x0585:
            r12 = 0
            goto L_0x046e
        L_0x0588:
            java.lang.Object r0 = r1.A01
            X.Ma2 r0 = (X.C66633Ma2) r0
            X.2lJ r0 = r0.A1R
            if (r0 == 0) goto L_0x0595
            X.2el r0 = X.2el.A00()
            return r0
        L_0x0595:
            r0 = 0
            return r0
        L_0x0597:
            java.lang.Object r0 = r1.A01
            com.instagram.common.session.UserSession r3 = X.C66583MXo.A0M(r0)
            r0 = 1
            X.0Tu r2 = X.DbS.A0J(r3, r0)
            r0 = 36325579259458624(0x810dec00053440, double:3.0357808228241994E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x05b3
            X.P3R r0 = new X.P3R
            r0.<init>(r3)
            return r0
        L_0x05b3:
            X.Mb5 r0 = new X.Mb5
            r0.<init>()
            return r0
        L_0x05b9:
            java.lang.Object r1 = r1.A01
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            X.Mk3 r0 = new X.Mk3
            r0.<init>(r1)
            return r0
        L_0x05c3:
            java.lang.Object r1 = r1.A01
            X.Mkx r1 = (X.C67263Mkx) r1
            r0 = 0
            X.C67263Mkx.A07(r1, r0)
        L_0x05cb:
            X.0gF r0 = X.C60340gF.A00
            return r0
        L_0x05ce:
            java.lang.Object r0 = r1.A01
            X.MiQ r0 = (X.C67106MiQ) r0
            X.4DH r3 = r0.A00
            android.content.Context r2 = r3.getContext()
            if (r2 == 0) goto L_0x05e2
            com.instagram.common.session.UserSession r1 = r0.A01
            X.MaX r0 = new X.MaX
            r0.<init>(r2, r3, r3, r1)
            return r0
        L_0x05e2:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x05e7:
            java.lang.Object r0 = r1.A01
            X.MiQ r0 = (X.C67106MiQ) r0
            X.4DH r4 = r0.A00
            android.content.Context r3 = r4.getContext()
            if (r3 == 0) goto L_0x0600
            com.instagram.common.session.UserSession r2 = r0.A01
            X.7Zn r1 = new X.7Zn
            r1.<init>(r2)
            X.Mbo r0 = new X.Mbo
            r0.<init>(r3, r4, r2, r1)
            return r0
        L_0x0600:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0605:
            java.lang.Object r0 = r1.A01
            java.lang.Object r0 = X.DbT.A0r(r0)
            return r0
        L_0x060c:
            java.lang.Object r0 = r1.A01
            X.NIt r0 = (X.C68455NIt) r0
            X.0sa r0 = r0.A01
            java.lang.Object r0 = r0.invoke()
            return r0
        L_0x0617:
            java.lang.Object r2 = r1.A01
            X.NIt r2 = (X.C68455NIt) r2
            X.0eM r0 = r2.A03
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r0)
            X.NMt r0 = new X.NMt
            r0.<init>(r2, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C73910Pll.invoke():java.lang.Object");
    }
}
