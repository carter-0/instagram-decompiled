package X;

import android.view.View;

/* renamed from: X.WAz  reason: case insensitive filesystem */
public final class C18887WAz implements View.OnClickListener {
    public final int A00;
    public final Object A01;

    public C18887WAz(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(View view, int i, Object obj) {
        AnonymousClass0fU.A00(new C18887WAz(obj, i), view);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x02bf: MOVE  (r4v47 X.X6R) = (r4v46 X.X6R)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    /* JADX WARNING: Removed duplicated region for block: B:367:0x0e0c  */
    /* JADX WARNING: Removed duplicated region for block: B:372:0x0e21  */
    public final void onClick(android.view.View r19) {
        /*
            r18 = this;
            r1 = r18
            int r0 = r1.A00
            r3 = r19
            switch(r0) {
                case 0: goto L_0x0618;
                case 1: goto L_0x0505;
                case 2: goto L_0x0edd;
                case 3: goto L_0x0eca;
                case 4: goto L_0x0eab;
                case 5: goto L_0x0e96;
                case 6: goto L_0x0e81;
                case 7: goto L_0x0d69;
                case 8: goto L_0x04e1;
                case 9: goto L_0x0d50;
                case 10: goto L_0x04a1;
                case 11: goto L_0x0ef8;
                case 12: goto L_0x0d28;
                case 13: goto L_0x0cfe;
                case 14: goto L_0x0478;
                case 15: goto L_0x0ce9;
                case 16: goto L_0x0e44;
                case 17: goto L_0x0cc1;
                case 18: goto L_0x0ca1;
                case 19: goto L_0x0428;
                case 20: goto L_0x03cf;
                case 21: goto L_0x0399;
                case 22: goto L_0x0c75;
                case 23: goto L_0x0c60;
                case 24: goto L_0x0c38;
                case 25: goto L_0x0f0c;
                case 26: goto L_0x0f04;
                case 27: goto L_0x0c1c;
                case 28: goto L_0x0c05;
                case 29: goto L_0x0bf2;
                case 30: goto L_0x0bde;
                case 31: goto L_0x0bca;
                case 32: goto L_0x0bb5;
                case 33: goto L_0x034a;
                case 34: goto L_0x0b89;
                case 35: goto L_0x02f4;
                case 36: goto L_0x0b76;
                case 37: goto L_0x0b63;
                case 38: goto L_0x02d4;
                case 39: goto L_0x0b30;
                case 40: goto L_0x0afd;
                case 41: goto L_0x02a0;
                case 42: goto L_0x028d;
                case 43: goto L_0x0ae0;
                case 44: goto L_0x027a;
                case 45: goto L_0x0ac3;
                case 46: goto L_0x0249;
                case 47: goto L_0x021b;
                case 48: goto L_0x01dd;
                case 49: goto L_0x01aa;
                case 50: goto L_0x0a89;
                case 51: goto L_0x0a76;
                case 52: goto L_0x0a1f;
                case 53: goto L_0x0152;
                case 54: goto L_0x0a0e;
                case 55: goto L_0x0d9c;
                case 56: goto L_0x09c9;
                case 57: goto L_0x099a;
                case 58: goto L_0x0963;
                case 59: goto L_0x0930;
                case 60: goto L_0x0901;
                case 61: goto L_0x0122;
                case 62: goto L_0x08ee;
                case 63: goto L_0x072b;
                case 64: goto L_0x0090;
                case 65: goto L_0x069c;
                case 66: goto L_0x071a;
                case 67: goto L_0x06fc;
                case 68: goto L_0x0653;
                case 69: goto L_0x0029;
                default: goto L_0x0009;
            }
        L_0x0009:
            r0 = -669398569(0xffffffffd819c9d7, float:-6.763687E14)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r1.A01
            X.UaU r4 = (X.C15322UaU) r4
            X.WGU r3 = r4.A03
            if (r3 == 0) goto L_0x001f
            X.UzE r1 = X.C16678UzE.AUDIENCE_SELECTION
            java.lang.String r0 = "regulated_category_switch"
            r3.A0F(r1, r0)
        L_0x001f:
            X.C15322UaU.A07(r4)
            r0 = -934762509(0xffffffffc848a7f3, float:-205471.8)
        L_0x0025:
            X.AnonymousClass0fD.A0C(r0, r2)
            return
        L_0x0029:
            r0 = -722758284(0xffffffffd4eb9574, float:-8.0945978E12)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r1.A01
            X.UaU r4 = (X.C15322UaU) r4
            X.WGU r3 = r4.A03
            if (r3 == 0) goto L_0x003f
            X.UzE r2 = X.C16678UzE.AUDIENCE_SELECTION
            java.lang.String r1 = "create_audience_row"
            r3.A0F(r2, r1)
        L_0x003f:
            X.0eM r6 = r4.A0N
            X.0lg r5 = X.DbY.A0R(r6)
            X.0Tu r3 = X.0Tu.A05
            r1 = 36320975054250994(0x8109bc000123f2, double:3.032869104911248E-306)
            boolean r1 = X.182.A06(r3, r5, r1)
            if (r1 == 0) goto L_0x007a
            com.instagram.common.session.UserSession r8 = X.AnonymousClass7TE.A0l(r6)
            androidx.fragment.app.FragmentActivity r5 = r4.requireActivity()
            com.instagram.business.promote.model.PromoteData r1 = X.C15322UaU.A00(r4)
            java.lang.String r9 = r1.A1S
            r10 = 0
            com.instagram.business.promote.model.PromoteData r1 = X.C15322UaU.A00(r4)
            com.instagram.api.schemas.XIGIGBoostDestination r6 = r1.A0i
            com.instagram.business.promote.model.PromoteData r1 = X.C15322UaU.A00(r4)
            boolean r11 = r1.A2V
            X.WNu r7 = new X.WNu
            r7.<init>(r4)
            X.C305936Kd.A02(r5, r6, r7, r8, r9, r10, r11)
        L_0x0075:
            r1 = -2032487602(0xffffffff86dab34e, float:-8.226595E-35)
            goto L_0x0d80
        L_0x007a:
            X.C13990Tnq.A0h()
            X.UZi r3 = new X.UZi
            r3.<init>()
            androidx.fragment.app.FragmentActivity r2 = r4.requireActivity()
            com.instagram.business.promote.model.PromoteData r1 = X.C15322UaU.A00(r4)
            com.instagram.common.session.UserSession r1 = r1.A0y
            X.DbY.A14(r3, r2, r1)
            goto L_0x0075
        L_0x0090:
            r0 = 923460092(0x370ae1fc, float:8.278057E-6)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r1.A01
            X.UZP r4 = (X.UZP) r4
            X.0eM r1 = r4.A05
            X.WGU r3 = X.C13990Tnq.A0M(r1)
            X.UzE r2 = X.C16678UzE.LOCATIONS_SELECTION
            java.lang.String r1 = "done_button"
            r3.A0F(r2, r1)
            X.0eM r1 = r4.A07
            java.lang.Object r7 = r1.getValue()
            X.U92 r7 = (X.U92) r7
            X.W2W r1 = X.C17149VKb.A00
            java.util.List r1 = r7.A0B()
            boolean r1 = X.W2W.A04(r1)
            java.util.List r6 = r7.A0B()
            if (r1 != 0) goto L_0x00e7
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r3 = r6.iterator()
        L_0x00c9:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x00e3
            java.lang.Object r2 = r3.next()
            X.ULF r1 = r7.A0A()
            java.util.List r1 = r1.A04
            boolean r1 = r1.contains(r2)
            if (r1 != 0) goto L_0x00c9
            r5.add(r2)
            goto L_0x00c9
        L_0x00e3:
            java.util.ArrayList r6 = X.00k.A0U(r5)
        L_0x00e7:
            java.util.Iterator r2 = r6.iterator()
        L_0x00eb:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x00f5
            r2.next()
            goto L_0x00eb
        L_0x00f5:
            X.LAF r1 = r7.A02
            X.05G r3 = r1.A01
        L_0x00f9:
            java.lang.Object r2 = r3.getValue()
            r9 = r2
            X.ULv r9 = (X.C15053ULv) r9
            r7 = 0
            r14 = 0
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>(r6)
            r16 = 991(0x3df, float:1.389E-42)
            r8 = r7
            r10 = r7
            r11 = r7
            r13 = r7
            r15 = r14
            r17 = r14
            X.ULv r1 = X.C15053ULv.A00(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            boolean r1 = r3.AIY(r2, r1)
            if (r1 == 0) goto L_0x00f9
            X.DbT.A1J(r4)
            r1 = -1394245703(0xfffffffface57fb9, float:-6.5227515E-12)
            goto L_0x0d80
        L_0x0122:
            r0 = 421920698(0x1925ffba, float:8.581944E-24)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r1.A01
            X.VvD r4 = (X.C18620VvD) r4
            androidx.fragment.app.FragmentActivity r3 = r4.A03
            if (r3 == 0) goto L_0x014d
            android.view.View r1 = r3.getCurrentFocus()
            X.0nA.A0N(r1)
            X.1Wy r1 = X.C322576w3.A00()
            r1.A02()
            X.UZ9 r2 = new X.UZ9
            r2.<init>()
            com.instagram.common.session.UserSession r1 = r4.A04
            X.7Pu r1 = X.DbW.A0T(r1)
            r1.A02(r3, r2)
        L_0x014d:
            r1 = -618072427(0xffffffffdb28f695, float:-4.7558916E16)
            goto L_0x0d80
        L_0x0152:
            r0 = 44848619(0x2ac55eb, float:2.5322443E-37)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r1.A01
            X.UZT r4 = (X.UZT) r4
            X.0eM r5 = r4.A0A
            X.WGU r3 = X.C13990Tnq.A0M(r5)
            X.UzE r2 = X.C16678UzE.AGE_AND_GENDER_SELECTION
            java.lang.String r1 = "done_button"
            r3.A0F(r2, r1)
            X.WGU r1 = X.C13990Tnq.A0M(r5)
            r1.A0A(r2)
            X.0eM r1 = r4.A0C
            java.lang.Object r2 = r1.getValue()
            X.U92 r2 = (X.U92) r2
            int r12 = r4.A01
            int r13 = r4.A00
            com.google.common.collect.ImmutableList r1 = X.UZT.A00(r4)
            java.util.ArrayList r9 = X.00k.A0U(r1)
            X.LAF r1 = r2.A02
            X.05G r3 = r1.A01
        L_0x0189:
            java.lang.Object r2 = r3.getValue()
            r7 = r2
            X.ULv r7 = (X.C15053ULv) r7
            r5 = 0
            r15 = 0
            r14 = 995(0x3e3, float:1.394E-42)
            r6 = r5
            r8 = r5
            r10 = r5
            r11 = r5
            X.ULv r1 = X.C15053ULv.A00(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            boolean r1 = r3.AIY(r2, r1)
            if (r1 == 0) goto L_0x0189
            X.DbT.A1J(r4)
            r1 = 1719237282(0x66797aa2, float:2.9453286E23)
            goto L_0x0d80
        L_0x01aa:
            r0 = -1352568087(0xffffffffaf6172e9, float:-2.0504455E-10)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r6 = r1.A01
            X.Uac r6 = (X.C15328Uac) r6
            boolean r1 = r6.A0Y
            if (r1 == 0) goto L_0x01c9
            android.content.Context r3 = r6.requireContext()
            java.lang.String r2 = r6.A0O
            java.lang.String r1 = r6.A0N
            X.W3M.A04(r3, r2, r1)
        L_0x01c4:
            r1 = 196797449(0xbbae409, float:7.1987703E-32)
            goto L_0x0d80
        L_0x01c9:
            X.W2F r5 = X.C17137VJm.A00
            java.lang.String r4 = "promote_ads_manager_fragment"
            X.0eM r1 = r6.A0f
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r1)
            androidx.fragment.app.FragmentActivity r2 = r6.requireActivity()
            java.lang.String r1 = ""
            r5.A05(r2, r3, r4, r1)
            goto L_0x01c4
        L_0x01dd:
            r0 = -1079377426(0xffffffffbfaa01ee, float:-1.3281839)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r1.A01
            X.Uac r5 = (X.C15328Uac) r5
            boolean r1 = r5.A0X
            if (r1 == 0) goto L_0x0218
            java.lang.String r2 = "direct_inbox_setting_entrypoint"
        L_0x01ee:
            r5.A0E()
            X.C13990Tnq.A0h()
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            X.DbS.A1B(r1, r2)
            X.Uab r4 = new X.Uab
            r4.<init>()
            androidx.fragment.app.FragmentActivity r3 = X.DbU.A0I(r1, r4, r5)
            X.0eM r1 = r5.A0f
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r1)
            X.6Yo r1 = new X.6Yo
            r1.<init>(r3, r2)
            X.Dba.A12(r4, r1)
            r1 = -308565361(0xffffffffed9baa8f, float:-6.022046E27)
            goto L_0x0d80
        L_0x0218:
            java.lang.String r2 = "ads_manager"
            goto L_0x01ee
        L_0x021b:
            r0 = -934658885(0xffffffffc84a3cbb, float:-207090.92)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            X.Uac r2 = (X.C15328Uac) r2
            androidx.fragment.app.FragmentActivity r4 = r2.getActivity()
            if (r4 == 0) goto L_0x0244
            X.1Yh r3 = X.C18138VmE.A00()
            X.0eM r1 = r2.A0f
            com.instagram.common.session.UserSession r5 = X.AnonymousClass7TE.A0l(r1)
            r7 = 0
            boolean r8 = r2.A0X
            r9 = 0
            r1 = 3705(0xe79, float:5.192E-42)
            java.lang.String r6 = X.AnonymousClass000.A00(r1)
            r10 = r9
            r3.A0A(r4, r5, r6, r7, r8, r9, r10)
        L_0x0244:
            r1 = -920831758(0xffffffffc91d38f2, float:-643983.1)
            goto L_0x0d80
        L_0x0249:
            r0 = 1925836988(0x72c9f0bc, float:7.999682E30)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r1.A01
            X.Uac r5 = (X.C15328Uac) r5
            boolean r1 = r5.A0Y
            if (r1 == 0) goto L_0x0268
            android.content.Context r3 = r5.requireContext()
            java.lang.String r2 = r5.A0O
            java.lang.String r1 = r5.A0N
            X.W3M.A04(r3, r2, r1)
        L_0x0263:
            r1 = 954227456(0x38e05b00, float:1.06981024E-4)
            goto L_0x0d80
        L_0x0268:
            r4 = 0
            boolean r1 = r5.A0X
            if (r1 == 0) goto L_0x0277
            java.lang.String r3 = "direct_inbox_setting_entrypoint"
        L_0x026f:
            java.lang.String r2 = "promotion_list"
            java.lang.String r1 = "promote_row_button"
            X.C15328Uac.A0C(r5, r4, r3, r2, r1)
            goto L_0x0263
        L_0x0277:
            java.lang.String r3 = "ads_manager"
            goto L_0x026f
        L_0x027a:
            r0 = -313915577(0xffffffffed4a0747, float:-3.907798E27)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            X.DbX.A1J(r1)
            r1 = -586945246(0xffffffffdd03ed22, float:-5.9414324E17)
            goto L_0x0d80
        L_0x028d:
            r0 = 252494372(0xf0cc224, float:6.939923E-30)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            X.DbX.A1J(r1)
            r1 = -1611625593(0xffffffff9ff08b87, float:-1.0187478E-19)
            goto L_0x0d80
        L_0x02a0:
            r0 = -1798184027(0xffffffff94d1e3a5, float:-2.1193397E-26)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A01
            X.Ua6 r3 = (X.C15299Ua6) r3
            X.0eM r1 = r3.A0F
            X.WGU r2 = X.JTU.A0D(r1)
            X.UzE r1 = X.C16678UzE.BOOST_PACKAGES
            r5 = 0
            r2.A0C(r1, r5)
            androidx.fragment.app.FragmentActivity r4 = r3.getActivity()
            boolean r1 = r4 instanceof X.X6R
            if (r1 == 0) goto L_0x02cf
            X.X6R r4 = (X.X6R) r4
            if (r4 == 0) goto L_0x02cf
            r8 = 0
            r9 = 1
            X.0eM r1 = r3.A0D
            java.lang.String r6 = X.DbS.A0t(r1)
            r7 = r5
            r4.CpG(r5, r6, r7, r8, r9)
        L_0x02cf:
            r1 = -494643331(0xffffffffe284577d, float:-1.2206372E21)
            goto L_0x0d80
        L_0x02d4:
            r0 = -1074309624(0xffffffffbff75608, float:-1.932313)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            X.WRp r2 = (X.C19256WRp) r2
            boolean r1 = r2.A05
            if (r1 == 0) goto L_0x02ee
            android.app.Activity r2 = r2.A09
            r1 = 0
            X.W38.A06(r2, r1)
        L_0x02e9:
            r1 = 1791987437(0x6acf8eed, float:1.254613E26)
            goto L_0x0d80
        L_0x02ee:
            boolean r1 = r2.A04
            X.C19256WRp.A01(r2, r1)
            goto L_0x02e9
        L_0x02f4:
            r0 = 1226395319(0x49194eb7, float:627947.44)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r1.A01
            X.W2M r4 = (X.W2M) r4
            com.instagram.model.reels.Reel r3 = r4.A06
            com.instagram.common.session.UserSession r2 = r4.A05
            java.util.List r1 = r3.A0O(r2)
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x0346
            androidx.fragment.app.Fragment r1 = r4.A03
            X.0hq r1 = r1.getParentFragmentManager()
            X.SQH.A02(r1)
            X.3BV r9 = X.1OP.A03(r2)
            java.lang.String r5 = X.JTP.A0r(r3)
            X.VM6 r1 = new X.VM6
            r1.<init>(r4)
            r14 = 0
            X.WaV r10 = new X.WaV
            r10.<init>(r14, r1, r4, r3)
            X.0iw r1 = r4.A04
            java.lang.String r11 = r1.getModuleName()
            X.3BU r4 = X.AnonymousClass3BU.DIRECT_SHARE
            r6 = 1
            r7 = -1
            X.3PJ r3 = new X.3PJ
            r8 = r7
            r3.<init>(r4, r5, r6, r7, r8)
            java.util.ArrayList r13 = X.DbV.A14(r3)
            r12 = 0
            r9.A0B(r10, r11, r12, r13, r14)
        L_0x0341:
            r1 = 1596171095(0x5f23a357, float:1.1791364E19)
            goto L_0x0d80
        L_0x0346:
            X.W2M.A01(r4, r3)
            goto L_0x0341
        L_0x034a:
            r0 = 886239946(0x34d2f2ca, float:3.92922E-7)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            X.W2M r2 = (X.W2M) r2
            X.0eE r1 = X.AnonymousClass0t1.A01
            com.instagram.common.session.UserSession r5 = r2.A05
            com.instagram.user.model.User r1 = r1.A01(r5)
            boolean r1 = r1.A2P()
            X.6rX r3 = X.C319976rX.A00
            X.0iw r4 = r2.A04
            X.6rY r6 = X.C319986rY.SELF
            java.lang.String r8 = r5.A06
            if (r1 == 0) goto L_0x0396
            java.lang.String r9 = "forced_migration"
        L_0x036d:
            r10 = 0
            java.lang.String r7 = "manage_highlights_from_highlight_long_press_tap"
            r3.A0D(r4, r5, r6, r7, r8, r9, r10)
            androidx.fragment.app.Fragment r1 = r2.A03
            androidx.fragment.app.FragmentActivity r1 = r1.requireActivity()
            X.0qQ.A0A(r1)
            X.6Yo r3 = new X.6Yo
            r3.<init>(r1, r5)
            X.C46447Df9.A03()
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            com.instagram.profile.edithighlightsmigration.HighlightsMigrationFragment r1 = new com.instagram.profile.edithighlightsmigration.HighlightsMigrationFragment
            r1.<init>()
            X.DbW.A0y(r2, r1, r3)
            r1 = 2139753311(0x7f8a0b5f, float:NaN)
            goto L_0x0d80
        L_0x0396:
            java.lang.String r9 = "opt_in"
            goto L_0x036d
        L_0x0399:
            r0 = 63897894(0x3cf0126, float:1.216663E-36)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.Vby r1 = (X.C17667Vby) r1
            X.A8U r1 = r1.A02
            X.Uag r5 = r1.A00
            com.instagram.model.arads.ArAdsUIModel r1 = r5.A03()
            java.lang.String r4 = r1.A05
            if (r4 == 0) goto L_0x03c1
            X.1ZN r3 = X.C297725sE.A00()
            androidx.fragment.app.FragmentActivity r2 = r5.requireActivity()
            X.0eM r1 = r5.A0M
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r1)
            r3.A03(r1, r2, r4)
        L_0x03c1:
            X.WT1 r2 = r5.A02()
            X.Uy8 r1 = X.C16612Uy8.CTA_CLICKED
            X.WT1.A00(r1, r2)
            r1 = 150433533(0x8f76efd, float:1.4891865E-33)
            goto L_0x0d80
        L_0x03cf:
            r0 = -1319369700(0xffffffffb15c041c, float:-3.201655E-9)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.Vby r1 = (X.C17667Vby) r1
            X.A8U r1 = r1.A02
            X.Uag r6 = r1.A00
            com.instagram.model.arads.ArAdsUIModel r1 = r6.A03()
            java.lang.String r7 = r1.A01
            if (r7 == 0) goto L_0x041a
            X.0eM r1 = r6.A0M
            X.0lg r10 = X.DbT.A0X(r1)
            java.lang.Class<com.instagram.modal.ModalActivity> r11 = com.instagram.modal.ModalActivity.class
            X.1a1 r5 = X.C46447Df9.A02()
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r1)
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r1)
            java.lang.String r2 = r6.getModuleName()
            java.lang.String r1 = "ar_ads_camera"
            X.Dfc r1 = X.C46548Dgp.A02(r3, r7, r1, r2)
            com.instagram.profile.intf.UserDetailLaunchConfig r1 = r1.A04()
            android.os.Bundle r9 = r5.A01(r4, r1)
            androidx.fragment.app.FragmentActivity r8 = r6.getActivity()
            java.lang.String r12 = "profile"
            X.6W8 r7 = new X.6W8
            r7.<init>(r8, r9, r10, r11, r12)
            X.DbT.A1M(r6, r7)
        L_0x041a:
            X.WT1 r2 = r6.A02()
            X.Uy8 r1 = X.C16612Uy8.ADVERTISER_PROFILE_CLICKED
            X.WT1.A00(r1, r2)
            r1 = 1775382895(0x69d2316f, float:3.1763483E25)
            goto L_0x0d80
        L_0x0428:
            r0 = -274083807(0xffffffffefa9d021, float:-1.0510916E29)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.Vby r1 = (X.C17667Vby) r1
            X.A8U r1 = r1.A02
            X.Uag r5 = r1.A00
            X.WT1 r2 = r5.A02()
            X.Uy8 r1 = X.C16612Uy8.MORE_OPTIONS_BUTTON_CLICKED
            X.WT1.A00(r1, r2)
            android.content.Context r2 = r5.requireContext()
            X.0eM r1 = r5.A0M
            X.Dg1 r4 = X.C46498Dg1.A00(r2, r1)
            r3 = 2131961551(0x7f1326cf, float:1.9559802E38)
            r2 = 16
            X.WAz r1 = new X.WAz
            r1.<init>(r5, r2)
            r4.A02(r1, r3)
            com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectAttribution r1 = r5.A03
            if (r1 == 0) goto L_0x0468
            r3 = 2131961550(0x7f1326ce, float:1.95598E38)
            r2 = 17
            X.WAz r1 = new X.WAz
            r1.<init>(r5, r2)
            r4.A04(r1, r3)
        L_0x0468:
            r2 = 2131954722(0x7f130c22, float:1.9545951E38)
            X.WAP r1 = X.WAP.A00
            r4.A04(r1, r2)
            X.C49945FFy.A00(r5, r4)
            r1 = -1980680859(0xffffffff89f13565, float:-5.806885E-33)
            goto L_0x0d80
        L_0x0478:
            r0 = 1987697378(0x7679dae2, float:1.2669154E33)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.VcK r1 = (X.C17689VcK) r1
            X.2Fj r2 = r1.A09
            java.lang.Object r1 = r2.A02()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            if (r1 == 0) goto L_0x049f
            boolean r1 = r1.booleanValue()
            r1 = r1 ^ 1
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
        L_0x0497:
            r2.A0A(r1)
            r1 = 1386713624(0x52a79218, float:3.59855292E11)
            goto L_0x0d80
        L_0x049f:
            r1 = 0
            goto L_0x0497
        L_0x04a1:
            r0 = 1300436255(0x4d83151f, float:2.74899936E8)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.VV7 r1 = (X.VV7) r1
            com.google.android.material.textfield.TextInputLayout r4 = r1.A02
            android.widget.EditText r3 = r4.A0F
            if (r3 != 0) goto L_0x04b7
            r1 = -1411341293(0xffffffffabe0a413, float:-1.5961697E-12)
            goto L_0x0d80
        L_0x04b7:
            int r2 = r3.getSelectionEnd()
            android.widget.EditText r1 = r4.A0F
            if (r1 == 0) goto L_0x04dc
            android.text.method.TransformationMethod r1 = r1.getTransformationMethod()
            boolean r1 = r1 instanceof android.text.method.PasswordTransformationMethod
            if (r1 == 0) goto L_0x04dc
            r1 = 0
        L_0x04c8:
            r3.setTransformationMethod(r1)
            if (r2 < 0) goto L_0x04d0
            r3.setSelection(r2)
        L_0x04d0:
            com.google.android.material.internal.CheckableImageButton r2 = r4.A1D
            android.content.res.ColorStateList r1 = r4.A0A
            com.google.android.material.textfield.TextInputLayout.A0I(r1, r2, r4)
            r1 = -1856941630(0xffffffff915151c2, float:-1.6512386E-28)
            goto L_0x0d80
        L_0x04dc:
            android.text.method.PasswordTransformationMethod r1 = android.text.method.PasswordTransformationMethod.getInstance()
            goto L_0x04c8
        L_0x04e1:
            r0 = 635363267(0x25dedfc3, float:3.8662488E-16)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.VV7 r1 = (X.VV7) r1
            com.google.android.material.textfield.TextInputLayout r3 = r1.A02
            android.widget.EditText r1 = r3.A0F
            android.text.Editable r1 = r1.getText()
            if (r1 == 0) goto L_0x04f9
            r1.clear()
        L_0x04f9:
            com.google.android.material.internal.CheckableImageButton r2 = r3.A1D
            android.content.res.ColorStateList r1 = r3.A0A
            com.google.android.material.textfield.TextInputLayout.A0I(r1, r2, r3)
            r1 = 1181448994(0x466b7b22, float:15070.783)
            goto L_0x0d80
        L_0x0505:
            r0 = -1061994802(0xffffffffc0b33ece, float:-5.6014166)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r7 = r1.A01
            androidx.appcompat.widget.SearchView r7 = (androidx.appcompat.widget.SearchView) r7
            android.widget.ImageView r1 = r7.A0b
            if (r3 != r1) goto L_0x051c
            r7.A0A()
        L_0x0517:
            r1 = 1206377867(0x47e7dd8b, float:118715.086)
            goto L_0x0d80
        L_0x051c:
            android.widget.ImageView r1 = r7.A0Z
            if (r3 != r1) goto L_0x0524
            r7.A09()
            goto L_0x0517
        L_0x0524:
            android.widget.ImageView r1 = r7.A0a
            if (r3 != r1) goto L_0x052c
            r7.A0B()
            goto L_0x0517
        L_0x052c:
            android.widget.ImageView r1 = r7.A0c
            if (r3 != r1) goto L_0x060f
            android.app.SearchableInfo r12 = r7.A00
            if (r12 == 0) goto L_0x0517
            boolean r1 = r12.getVoiceSearchLaunchWebSearch()     // Catch:{ ActivityNotFoundException -> 0x0606 }
            if (r1 == 0) goto L_0x055e
            android.content.Intent r1 = r7.A0V     // Catch:{ ActivityNotFoundException -> 0x0606 }
            android.content.Intent r3 = new android.content.Intent     // Catch:{ ActivityNotFoundException -> 0x0606 }
            r3.<init>(r1)     // Catch:{ ActivityNotFoundException -> 0x0606 }
            android.content.ComponentName r1 = r12.getSearchActivity()     // Catch:{ ActivityNotFoundException -> 0x0606 }
            if (r1 != 0) goto L_0x0549
            r2 = 0
            goto L_0x054d
        L_0x0549:
            java.lang.String r2 = r1.flattenToShortString()     // Catch:{ ActivityNotFoundException -> 0x0606 }
        L_0x054d:
            r1 = 1153(0x481, float:1.616E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)     // Catch:{ ActivityNotFoundException -> 0x0606 }
            r3.putExtra(r1, r2)     // Catch:{ ActivityNotFoundException -> 0x0606 }
            android.content.Context r1 = r7.getContext()     // Catch:{ ActivityNotFoundException -> 0x0606 }
            r1.startActivity(r3)     // Catch:{ ActivityNotFoundException -> 0x0606 }
            goto L_0x0517
        L_0x055e:
            boolean r1 = r12.getVoiceSearchLaunchRecognizer()     // Catch:{ ActivityNotFoundException -> 0x0606 }
            if (r1 == 0) goto L_0x0517
            android.content.Intent r8 = r7.A0U     // Catch:{ ActivityNotFoundException -> 0x0606 }
            android.content.ComponentName r9 = r12.getSearchActivity()     // Catch:{ ActivityNotFoundException -> 0x0606 }
            java.lang.String r1 = "android.intent.action.SEARCH"
            android.content.Intent r3 = new android.content.Intent     // Catch:{ ActivityNotFoundException -> 0x0606 }
            r3.<init>(r1)     // Catch:{ ActivityNotFoundException -> 0x0606 }
            r3.setComponent(r9)     // Catch:{ ActivityNotFoundException -> 0x0606 }
            android.content.Context r5 = r7.getContext()     // Catch:{ ActivityNotFoundException -> 0x0606 }
            r2 = 0
            r1 = 1107296256(0x42000000, float:32.0)
            android.app.PendingIntent r6 = android.app.PendingIntent.getActivity(r5, r2, r3, r1)     // Catch:{ ActivityNotFoundException -> 0x0606 }
            android.os.Bundle r4 = new android.os.Bundle     // Catch:{ ActivityNotFoundException -> 0x0606 }
            r4.<init>()     // Catch:{ ActivityNotFoundException -> 0x0606 }
            android.os.Bundle r2 = r7.A01     // Catch:{ ActivityNotFoundException -> 0x0606 }
            if (r2 == 0) goto L_0x058d
            java.lang.String r1 = "app_data"
            r4.putParcelable(r1, r2)     // Catch:{ ActivityNotFoundException -> 0x0606 }
        L_0x058d:
            android.content.Intent r3 = new android.content.Intent     // Catch:{ ActivityNotFoundException -> 0x0606 }
            r3.<init>(r8)     // Catch:{ ActivityNotFoundException -> 0x0606 }
            r8 = 1
            android.content.res.Resources r2 = r7.getResources()     // Catch:{ ActivityNotFoundException -> 0x0606 }
            int r1 = r12.getVoiceLanguageModeId()     // Catch:{ ActivityNotFoundException -> 0x0606 }
            if (r1 == 0) goto L_0x05e5
            int r1 = r12.getVoiceLanguageModeId()     // Catch:{ ActivityNotFoundException -> 0x0606 }
            java.lang.String r11 = r2.getString(r1)     // Catch:{ ActivityNotFoundException -> 0x0606 }
        L_0x05a5:
            int r1 = r12.getVoicePromptTextId()     // Catch:{ ActivityNotFoundException -> 0x0606 }
            r7 = 0
            if (r1 == 0) goto L_0x05e3
            int r1 = r12.getVoicePromptTextId()     // Catch:{ ActivityNotFoundException -> 0x0606 }
            java.lang.String r10 = r2.getString(r1)     // Catch:{ ActivityNotFoundException -> 0x0606 }
        L_0x05b4:
            int r1 = r12.getVoiceLanguageId()     // Catch:{ ActivityNotFoundException -> 0x0606 }
            if (r1 == 0) goto L_0x05e1
            int r1 = r12.getVoiceLanguageId()     // Catch:{ ActivityNotFoundException -> 0x0606 }
            java.lang.String r2 = r2.getString(r1)     // Catch:{ ActivityNotFoundException -> 0x0606 }
        L_0x05c2:
            int r1 = r12.getVoiceMaxResults()     // Catch:{ ActivityNotFoundException -> 0x0606 }
            if (r1 == 0) goto L_0x05cc
            int r8 = r12.getVoiceMaxResults()     // Catch:{ ActivityNotFoundException -> 0x0606 }
        L_0x05cc:
            java.lang.String r1 = "android.speech.extra.LANGUAGE_MODEL"
            r3.putExtra(r1, r11)     // Catch:{ ActivityNotFoundException -> 0x0606 }
            java.lang.String r1 = "android.speech.extra.PROMPT"
            r3.putExtra(r1, r10)     // Catch:{ ActivityNotFoundException -> 0x0606 }
            java.lang.String r1 = "android.speech.extra.LANGUAGE"
            r3.putExtra(r1, r2)     // Catch:{ ActivityNotFoundException -> 0x0606 }
            java.lang.String r1 = "android.speech.extra.MAX_RESULTS"
            r3.putExtra(r1, r8)     // Catch:{ ActivityNotFoundException -> 0x0606 }
            goto L_0x05e8
        L_0x05e1:
            r2 = r7
            goto L_0x05c2
        L_0x05e3:
            r10 = r7
            goto L_0x05b4
        L_0x05e5:
            java.lang.String r11 = "free_form"
            goto L_0x05a5
        L_0x05e8:
            if (r9 == 0) goto L_0x05ee
            java.lang.String r7 = r9.flattenToShortString()     // Catch:{ ActivityNotFoundException -> 0x0606 }
        L_0x05ee:
            r1 = 1153(0x481, float:1.616E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)     // Catch:{ ActivityNotFoundException -> 0x0606 }
            r3.putExtra(r1, r7)     // Catch:{ ActivityNotFoundException -> 0x0606 }
            java.lang.String r1 = "android.speech.extra.RESULTS_PENDINGINTENT"
            r3.putExtra(r1, r6)     // Catch:{ ActivityNotFoundException -> 0x0606 }
            java.lang.String r1 = "android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE"
            r3.putExtra(r1, r4)     // Catch:{ ActivityNotFoundException -> 0x0606 }
            r5.startActivity(r3)     // Catch:{ ActivityNotFoundException -> 0x0606 }
            goto L_0x0517
        L_0x0606:
            java.lang.String r2 = "SearchView"
            java.lang.String r1 = "Could not find voice search activity"
            android.util.Log.w(r2, r1)
            goto L_0x0517
        L_0x060f:
            androidx.appcompat.widget.SearchView$SearchAutoComplete r1 = r7.A0d
            if (r3 != r1) goto L_0x0517
            r7.A08()
            goto L_0x0517
        L_0x0618:
            r0 = -1621075994(0xffffffff9f6057e6, float:-4.7506553E-20)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r1.A01
            X.VzO r4 = (X.C18743VzO) r4
            android.widget.Button r1 = r4.A0F
            if (r3 != r1) goto L_0x0641
            android.os.Message r1 = r4.A0A
            if (r1 == 0) goto L_0x0641
        L_0x062b:
            android.os.Message r1 = android.os.Message.obtain(r1)
            if (r1 == 0) goto L_0x0634
            r1.sendToTarget()
        L_0x0634:
            android.os.Handler r3 = r4.A07
            r2 = 1
            X.QAE r1 = r4.A0V
            X.Pxe.A1N(r3, r1, r2)
            r1 = 75702570(0x483212a, float:3.082841E-36)
            goto L_0x0d80
        L_0x0641:
            android.widget.Button r1 = r4.A0D
            if (r3 != r1) goto L_0x064a
            android.os.Message r1 = r4.A08
            if (r1 == 0) goto L_0x064a
            goto L_0x062b
        L_0x064a:
            android.widget.Button r1 = r4.A0E
            if (r3 != r1) goto L_0x0634
            android.os.Message r1 = r4.A09
            if (r1 == 0) goto L_0x0634
            goto L_0x062b
        L_0x0653:
            r0 = 54050821(0x338c005, float:5.4293168E-37)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r1.A01
            X.UaU r5 = (X.C15322UaU) r5
            X.WGU r3 = r5.A03
            if (r3 == 0) goto L_0x0669
            X.UzE r1 = X.C16678UzE.AUDIENCE_SELECTION
            java.lang.String r0 = "education"
            r3.A0F(r1, r0)
        L_0x0669:
            X.C13990Tnq.A0h()
            X.UzE r4 = X.C16678UzE.AUDIENCE_SELECTION
            X.UbX r3 = new X.UbX
            r3.<init>()
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            java.lang.String r0 = "step"
            r1.putSerializable(r0, r4)
            r3.setArguments(r1)
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.business.promote.fragment.PromoteEducationDrawerBottomSheetFragment"
            X.0qQ.A0C(r3, r0)
            X.WOY r0 = new X.WOY
            r0.<init>(r5)
            r3.A04 = r0
            X.0eM r0 = r5.A0N
            X.7Pr r0 = X.DbX.A0f(r0)
            r0.A0U = r3
            X.DbY.A13(r5, r3, r0)
            r0 = 2069256021(0x7b565755, float:1.1129228E36)
            goto L_0x0025
        L_0x069c:
            r0 = -7951748(0xffffffffff86aa7c, float:NaN)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A01
            X.UYy r3 = (X.UYy) r3
            r1 = 0
            android.view.View r0 = r3.A01
            if (r0 != 0) goto L_0x06b0
            java.lang.String r7 = "discardButtonRow"
            goto L_0x0e68
        L_0x06b0:
            r0.setClickable(r1)
            android.view.View r0 = r3.A00
            if (r0 != 0) goto L_0x06bb
            java.lang.String r7 = "cancelButtonRow"
            goto L_0x0e68
        L_0x06bb:
            r0.setClickable(r1)
            X.W1k r6 = r3.A03
            if (r6 == 0) goto L_0x08e5
            X.0eM r0 = r3.A06
            java.lang.Object r5 = r0.getValue()
            X.1P0 r5 = (X.1P0) r5
            com.instagram.business.promote.model.PromoteData r3 = r6.A03
            java.lang.String r1 = r3.A1J
            java.lang.String r0 = "draftId cannot be null while deleting drafts."
            X.17k.A07(r1, r0)
            com.instagram.common.session.UserSession r0 = r3.A0y
            java.lang.String r4 = r3.A1J
            java.lang.String r1 = r3.A1A
            X.1NY r3 = X.DbU.A0N(r0)
            java.lang.String r0 = "ads/promote/delete_draft_promotion/"
            r3.A0A(r0)
            java.lang.String r0 = "draft_id"
            r3.A9m(r0, r4)
            java.lang.String r0 = "fb_auth_token"
            r3.A9m(r0, r1)
            java.lang.Class<X.UX6> r1 = X.UX6.class
            java.lang.Class<X.VmU> r0 = X.C18154VmU.class
            X.1OC r0 = X.DbT.A0S(r3, r1, r0)
            X.C18784W1k.A02(r6, r5, r0)
            r0 = -255045473(0xfffffffff0cc509f, float:-5.0585926E29)
            goto L_0x0025
        L_0x06fc:
            r0 = 2089499421(0x7c8b3b1d, float:5.783426E36)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r1.A01
            X.UbW r4 = (X.C15378UbW) r4
            X.WGU r3 = r4.A00
            if (r3 == 0) goto L_0x0abf
            X.UzE r1 = X.C16678UzE.OBJECTIVE
            java.lang.String r0 = "discard_ad_button"
            r3.A0F(r1, r0)
            X.DbT.A1K(r4)
            r0 = 1323917851(0x4ee9621b, float:1.95776038E9)
            goto L_0x0025
        L_0x071a:
            r0 = -813784146(0xffffffffcf7ea3ae, float:-4.27213978E9)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.Dba.A1Q(r0)
            r0 = -521968146(0xffffffffe0e365ee, float:-1.3108612E20)
            goto L_0x0025
        L_0x072b:
            r0 = -1104370793(0xffffffffbe2ca397, float:-0.1685928)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r1.A01
            X.UZg r4 = (X.C15278UZg) r4
            boolean r1 = r4.A09
            java.lang.String r7 = "promoteState"
            java.lang.String r3 = "done_button"
            java.lang.String r6 = "promoteData"
            X.WGU r2 = r4.A02
            if (r1 == 0) goto L_0x08bd
            if (r2 == 0) goto L_0x0749
            X.UzE r1 = X.C16678UzE.UPDATE_AUTO_AUDIENCE_LOCATION
            r2.A0F(r1, r3)
        L_0x0749:
            com.instagram.business.promote.model.PromoteData r1 = r4.A05
            if (r1 == 0) goto L_0x08e9
            com.instagram.business.promote.model.PromoteAudienceInfo r1 = r1.A0p
            java.util.List r1 = r1.A07
            if (r1 == 0) goto L_0x0759
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x077c
        L_0x0759:
            com.instagram.business.promote.model.PromoteData r1 = r4.A05
            if (r1 == 0) goto L_0x08e9
            com.instagram.business.promote.model.PendingLocation r1 = r1.A0o
            java.util.List r1 = r1.A04
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x077c
            X.WGU r3 = r4.A02
            if (r3 == 0) goto L_0x0774
            com.instagram.business.promote.model.PromoteData r2 = r4.A05
            if (r2 == 0) goto L_0x08e9
            X.UzE r1 = X.C16678UzE.UPDATE_AUTO_AUDIENCE_LOCATION
        L_0x0771:
            r3.A0B(r1, r2)
        L_0x0774:
            X.DbT.A1J(r4)
        L_0x0777:
            r1 = -431113626(0xffffffffe64dba66, float:-2.428809E23)
            goto L_0x0d80
        L_0x077c:
            com.instagram.business.promote.model.PromoteState r5 = r4.A06
            if (r5 == 0) goto L_0x0e68
            com.instagram.business.promote.model.PromoteData r3 = r4.A05
            if (r3 == 0) goto L_0x08e9
            com.instagram.business.promote.model.PendingLocation r1 = r3.A0o
            java.util.List r2 = r1.A04
            com.instagram.business.promote.model.PromoteAudienceInfo r1 = r3.A0p
            X.0qQ.A06(r1)
            X.VuU r1 = X.C18167Vmh.A00(r1)
            r1.A07 = r2
            com.instagram.business.promote.model.PromoteAudienceInfo r1 = r1.A01()
            r3.A0p = r1
            java.lang.Integer r1 = X.AnonymousClass05K.A1F
            com.instagram.business.promote.model.PromoteState.A01(r5, r1)
            X.W1k r8 = r4.A03
            if (r8 == 0) goto L_0x08e5
            r1 = 11
            X.Ufn r7 = new X.Ufn
            r7.<init>(r4, r1)
            com.instagram.business.promote.model.PromoteData r9 = r8.A03
            com.instagram.business.promote.model.PromoteAudienceInfo r1 = r9.A0p
            java.util.List r1 = r1.A07
            if (r1 == 0) goto L_0x0892
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x0892
            com.instagram.business.promote.model.PromoteAudienceInfo r1 = r9.A0p
            java.util.List r3 = r1.A07
            r3.getClass()
            com.instagram.business.promote.model.PromoteAudienceInfo r1 = r9.A0p
            java.util.List r1 = r1.A07
            int r2 = r1.size()
            r1 = 1
            r4 = 0
            r17 = 0
            if (r2 != r1) goto L_0x086f
            java.lang.Object r1 = r3.get(r4)
            com.instagram.business.promote.model.AudienceGeoLocation r1 = (com.instagram.business.promote.model.AudienceGeoLocation) r1
            com.instagram.api.schemas.AdGeoLocationType r1 = r1.A03
            if (r1 == 0) goto L_0x086f
            java.lang.Object r1 = r3.get(r4)
            com.instagram.business.promote.model.AudienceGeoLocation r1 = (com.instagram.business.promote.model.AudienceGeoLocation) r1
            com.instagram.api.schemas.AdGeoLocationType r1 = r1.A03
            com.instagram.api.schemas.AdGeoLocationType r2 = X.VAK.A00(r1)
            com.instagram.api.schemas.AdGeoLocationType r1 = com.instagram.api.schemas.AdGeoLocationType.CUSTOM_LOCATION
            if (r2 != r1) goto L_0x086f
            java.lang.Object r1 = r3.get(r4)
            com.instagram.business.promote.model.AudienceGeoLocation r1 = (com.instagram.business.promote.model.AudienceGeoLocation) r1
            double r3 = r1.A00
            double r5 = r1.A01
            int r12 = r1.A02
            java.lang.String r10 = r1.A05
            r1 = r17
            r16 = r1
            r15 = r1
        L_0x07f9:
            com.instagram.common.session.UserSession r11 = r8.A08
            java.lang.String r14 = r9.A1A
            java.lang.String r13 = r9.A1L
            X.WGU r2 = r8.A02
            java.lang.String r9 = r2.A03
            X.1NY r11 = X.DbU.A0N(r11)
            java.lang.String r2 = "ads/promote/update_auto_audience_v2/"
            X.C13990Tnq.A1C(r11, r2, r14)
            java.lang.String r2 = "fb_actor_id"
            r11.A9m(r2, r13)
            java.lang.String r2 = "address"
            r11.A0G(r2, r10)
            java.lang.String r2 = "flow_id"
            r11.A0G(r2, r9)
            java.lang.Class<X.UXD> r9 = X.UXD.class
            java.lang.Class<X.Vmn> r2 = X.C18173Vmn.class
            r11.A0R(r9, r2)
            if (r16 == 0) goto L_0x082d
            java.lang.String r9 = X.C51970G9q.A0k(r16)
            java.lang.String r2 = "countries"
            r11.A9m(r2, r9)
        L_0x082d:
            if (r15 == 0) goto L_0x0838
            java.lang.String r9 = X.C51970G9q.A0k(r15)
            java.lang.String r2 = "region_keys"
            r11.A9m(r2, r9)
        L_0x0838:
            if (r17 == 0) goto L_0x0843
            java.lang.String r9 = X.C51970G9q.A0k(r17)
            java.lang.String r2 = "city_keys"
            r11.A9m(r2, r9)
        L_0x0843:
            if (r1 == 0) goto L_0x084e
            java.lang.String r2 = X.C51970G9q.A0k(r1)
            java.lang.String r1 = "zip_keys"
            r11.A9m(r1, r2)
        L_0x084e:
            r9 = 0
            int r1 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r1 == 0) goto L_0x085b
            int r1 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r1 == 0) goto L_0x085b
            X.C13991Tnr.A1B(r11, r5, r3)
        L_0x085b:
            if (r12 == 0) goto L_0x0866
            java.lang.String r2 = java.lang.String.valueOf(r12)
            java.lang.String r1 = "radius"
            r11.A9m(r1, r2)
        L_0x0866:
            X.1OC r1 = r11.A0M()
            X.C18784W1k.A02(r8, r7, r1)
            goto L_0x0777
        L_0x086f:
            com.instagram.api.schemas.AdGeoLocationType r1 = com.instagram.api.schemas.AdGeoLocationType.COUNTRY
            java.util.ArrayList r16 = X.W3x.A0I(r1, r3)
            com.instagram.api.schemas.AdGeoLocationType r1 = com.instagram.api.schemas.AdGeoLocationType.REGION
            java.util.ArrayList r15 = X.W3x.A0I(r1, r3)
            com.instagram.api.schemas.AdGeoLocationType r1 = com.instagram.api.schemas.AdGeoLocationType.CITY
            java.util.ArrayList r2 = X.W3x.A0I(r1, r3)
            com.instagram.api.schemas.AdGeoLocationType r1 = com.instagram.api.schemas.AdGeoLocationType.ZIP
            java.util.ArrayList r1 = X.W3x.A0I(r1, r3)
            r10 = r17
            r12 = 0
            r3 = 0
            r17 = r2
            r5 = 0
            goto L_0x07f9
        L_0x0892:
            com.instagram.common.session.UserSession r5 = r8.A08
            java.lang.String r4 = r9.A1A
            java.lang.String r2 = r9.A1L
            X.WGU r1 = r8.A02
            java.lang.String r3 = r1.A03
            X.1NY r11 = X.DbU.A0N(r5)
            java.lang.String r1 = "ads/promote/update_auto_audience_v2/"
            X.C13990Tnq.A1C(r11, r1, r4)
            java.lang.String r1 = "fb_actor_id"
            r11.A9m(r1, r2)
            java.lang.String r2 = "address"
            r1 = 0
            X.0qQ.A0B(r2, r1)
            java.lang.String r1 = "flow_id"
            r11.A0G(r1, r3)
            java.lang.Class<X.UXD> r2 = X.UXD.class
            java.lang.Class<X.Vmn> r1 = X.C18173Vmn.class
            r11.A0R(r2, r1)
            goto L_0x0866
        L_0x08bd:
            if (r2 == 0) goto L_0x08c4
            X.UzE r1 = X.C16678UzE.LOCATIONS_SELECTION
            r2.A0F(r1, r3)
        L_0x08c4:
            com.instagram.business.promote.model.PromoteState r5 = r4.A06
            if (r5 == 0) goto L_0x0e68
            com.instagram.business.promote.model.PromoteData r3 = r4.A05
            if (r3 == 0) goto L_0x08e9
            com.instagram.business.promote.model.PendingLocation r1 = r3.A0o
            java.util.List r2 = r1.A04
            X.VuU r1 = X.C18167Vmh.A01(r3)
            r1.A07 = r2
            X.C18578VuU.A00(r1, r3, r5)
            X.WGU r3 = r4.A02
            if (r3 == 0) goto L_0x0774
            com.instagram.business.promote.model.PromoteData r2 = r4.A05
            if (r2 == 0) goto L_0x08e9
            X.UzE r1 = X.C16678UzE.LOCATIONS_SELECTION
            goto L_0x0771
        L_0x08e5:
            java.lang.String r7 = "dataFetcher"
            goto L_0x0e68
        L_0x08e9:
            X.0qQ.A0F(r6)
            goto L_0x0e6b
        L_0x08ee:
            r0 = 1592068820(0x5ee50ad4, float:8.2521184E18)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.WUu r0 = (X.C19338WUu) r0
            X.C19338WUu.A00(r0)
            r0 = -1090243412(0xffffffffbf0434ac, float:-0.5164287)
            goto L_0x0025
        L_0x0901:
            r0 = 238881486(0xe3d0ace, float:2.330125E-30)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r1.A01
            X.Vzw r4 = (X.C18761Vzw) r4
            androidx.fragment.app.FragmentActivity r3 = r4.A04
            android.view.View r0 = r3.getCurrentFocus()
            X.0nA.A0N(r0)
            X.C13990Tnq.A0h()
            X.UZ8 r1 = new X.UZ8
            r1.<init>()
            com.instagram.business.promote.model.PromoteData r0 = r4.A08
            com.instagram.common.session.UserSession r0 = r0.A0y
            X.0qQ.A06(r0)
            X.7Pu r0 = X.DbW.A0T(r0)
            r0.A02(r3, r1)
            r0 = -1052672117(0xffffffffc1417f8b, float:-12.093638)
            goto L_0x0025
        L_0x0930:
            r0 = 1840349740(0x6db1822c, float:6.867027E27)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r1.A01
            X.UaV r4 = (X.C15323UaV) r4
            X.0eM r0 = r4.A0T
            X.WGU r3 = X.C13990Tnq.A0M(r0)
            X.UzE r1 = X.C16678UzE.BUDGET_DURATION
            java.lang.String r0 = "zero_outcome_warning_banner"
            r3.A0F(r1, r0)
            X.UYp r3 = new X.UYp
            r3.<init>()
            com.instagram.business.promote.model.PromoteData r0 = r4.A08
            if (r0 == 0) goto L_0x0996
            com.instagram.common.session.UserSession r1 = r0.A0y
            X.0qQ.A06(r1)
            X.7Pr r0 = new X.7Pr
            r0.<init>(r1)
            X.DbY.A13(r4, r3, r0)
            r0 = 432247919(0x19c3946f, float:2.022248E-23)
            goto L_0x0025
        L_0x0963:
            r0 = 2035449848(0x79527ff8, float:6.8311116E34)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r1.A01
            X.UaV r4 = (X.C15323UaV) r4
            X.0eM r0 = r4.A0T
            X.WGU r3 = X.C13990Tnq.A0M(r0)
            X.UzE r1 = X.C16678UzE.BUDGET_DURATION
            java.lang.String r0 = "low_outcome_warning_banner"
            r3.A0F(r1, r0)
            X.UYp r3 = new X.UYp
            r3.<init>()
            com.instagram.business.promote.model.PromoteData r0 = r4.A08
            if (r0 == 0) goto L_0x0996
            com.instagram.common.session.UserSession r1 = r0.A0y
            X.0qQ.A06(r1)
            X.7Pr r0 = new X.7Pr
            r0.<init>(r1)
            X.DbY.A13(r4, r3, r0)
            r0 = 1594564656(0x5f0b2030, float:1.0025066E19)
            goto L_0x0025
        L_0x0996:
            java.lang.String r4 = "promoteData"
            goto L_0x0a50
        L_0x099a:
            r0 = -671321533(0xffffffffd7fc7243, float:-5.55135361E14)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r1.A01
            X.UaV r5 = (X.C15323UaV) r5
            X.0eM r0 = r5.A0T
            X.WGU r3 = X.C13990Tnq.A0M(r0)
            X.UzE r1 = X.C16678UzE.BUDGET_DURATION
            java.lang.String r0 = "ad_account_budget_limit_ads_manager_link"
            r3.A0F(r1, r0)
            androidx.fragment.app.FragmentActivity r4 = r5.requireActivity()
            com.instagram.common.session.UserSession r3 = r5.getSession()
            r0 = 1
            X.WOB r1 = new X.WOB
            r1.<init>(r5, r0)
            r0 = 0
            X.C18676VwZ.A02(r4, r1, r3, r0)
            r0 = 1614219869(0x60370a5d, float:5.2757827E19)
            goto L_0x0025
        L_0x09c9:
            r0 = -1515770718(0xffffffffa5a72ca2, float:-2.9000126E-16)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r1.A01
            X.UaV r5 = (X.C15323UaV) r5
            X.0eM r0 = r5.A0T
            X.WGU r1 = X.C13990Tnq.A0M(r0)
            X.UzE r4 = X.C16678UzE.BUDGET_DURATION
            java.lang.String r0 = "education"
            r1.A0F(r4, r0)
            X.C13990Tnq.A0h()
            X.UbX r3 = new X.UbX
            r3.<init>()
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            java.lang.String r0 = "step"
            r1.putSerializable(r0, r4)
            r3.setArguments(r1)
            com.instagram.common.session.UserSession r0 = r5.getSession()
            X.7Pr r1 = new X.7Pr
            r1.<init>(r0)
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.ui.bottomsheet.OnBottomSheetDismissListener"
            X.0qQ.A0C(r3, r0)
            r1.A0U = r3
            X.DbY.A13(r5, r3, r1)
            r0 = -2062716357(0xffffffff850d723b, float:-6.650769E-36)
            goto L_0x0025
        L_0x0a0e:
            r0 = -595219669(0xffffffffdc85ab2b, float:-3.00994985E17)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.Dba.A1Q(r0)
            r0 = 921870425(0x36f2a059, float:7.230829E-6)
            goto L_0x0025
        L_0x0a1f:
            r0 = -1388408796(0xffffffffad3e9024, float:-1.0832255E-11)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r7 = r1.A01
            X.UZf r7 = (X.C15277UZf) r7
            X.WGU r2 = r7.A02
            java.lang.String r4 = "promoteLogger"
            if (r2 == 0) goto L_0x0a50
            X.UzE r3 = X.C16678UzE.AGE_AND_GENDER_SELECTION
            java.lang.String r1 = "done_button"
            r2.A0F(r3, r1)
            X.WGU r2 = r7.A02
            if (r2 == 0) goto L_0x0a50
            com.instagram.business.promote.model.PromoteData r1 = r7.A03
            java.lang.String r4 = "promoteData"
            if (r1 == 0) goto L_0x0a50
            r2.A0B(r3, r1)
            java.util.List r1 = r7.A0C
            if (r1 != 0) goto L_0x0a4a
            X.0sn r1 = X.0sn.A00
        L_0x0a4a:
            com.instagram.business.promote.model.PromoteState r6 = r7.A04
            if (r6 != 0) goto L_0x0a55
            java.lang.String r4 = "promoteState"
        L_0x0a50:
            X.0qQ.A0F(r4)
            goto L_0x0e6b
        L_0x0a55:
            com.instagram.business.promote.model.PromoteData r5 = r7.A03
            if (r5 == 0) goto L_0x0a50
            int r4 = r7.A01
            int r3 = r7.A00
            java.util.ArrayList r2 = X.00k.A0U(r1)
            X.VuU r1 = X.C18167Vmh.A01(r5)
            r1.A01 = r4
            r1.A00 = r3
            r1.A06 = r2
            X.C18578VuU.A00(r1, r5, r6)
            X.DbT.A1J(r7)
            r1 = 273277272(0x1049e158, float:3.981386E-29)
            goto L_0x0d80
        L_0x0a76:
            r0 = 1254359079(0x4ac40027, float:6422547.5)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.Uab r0 = (X.C15327Uab) r0
            r0.onBackPressed()
            r0 = 1677977559(0x6403e7d7, float:9.732917E21)
            goto L_0x0025
        L_0x0a89:
            r0 = 1294791194(0x4d2cf21a, float:1.8134672E8)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r1.A01
            X.Uac r5 = (X.C15328Uac) r5
            androidx.fragment.app.FragmentActivity r4 = r5.getActivity()
            if (r4 == 0) goto L_0x0aba
            X.WGU r3 = r5.A09
            if (r3 == 0) goto L_0x0abf
            X.UzE r2 = X.C16678UzE.ADS_MANAGER
            java.lang.String r1 = "meta_status_learn_more_link"
            r3.A0F(r2, r1)
            X.0eM r1 = r5.A0f
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r1)
            X.2EG r2 = X.2EG.A34
            java.lang.String r1 = "https://metastatus.com/ig-boost"
            X.SUL r2 = X.Dba.A0J(r4, r3, r2, r1)
            java.lang.String r1 = "promote_ads_manager_fragment"
            r2.A0S = r1
            r2.A0A()
        L_0x0aba:
            r1 = -2098638216(0xffffffff82e95278, float:-3.4283608E-37)
            goto L_0x0d80
        L_0x0abf:
            java.lang.String r7 = "promoteLogger"
            goto L_0x0e68
        L_0x0ac3:
            r0 = 1709323787(0x65e2360b, float:1.3353147E23)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.Uac r0 = (X.C15328Uac) r0
            android.content.Context r1 = r0.requireContext()
            X.0eM r0 = r0.A0f
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.C18145VmL.A01(r1, r0)
            r0 = -326953743(0xffffffffec8314f1, float:-1.2677454E27)
            goto L_0x0025
        L_0x0ae0:
            r0 = -2036687376(0xffffffff869a9df0, float:-5.816043E-35)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.UZU r0 = (X.UZU) r0
            android.content.Context r1 = r0.requireContext()
            X.0eM r0 = r0.A0B
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.C18145VmL.A01(r1, r0)
            r0 = -932125929(0xffffffffc870e317, float:-246668.36)
            goto L_0x0025
        L_0x0afd:
            r0 = 744696551(0x2c632ae7, float:3.2282456E-12)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r1.A01
            X.Ua6 r5 = (X.C15299Ua6) r5
            X.0eM r4 = r5.A0F
            X.WGU r3 = X.JTU.A0D(r4)
            X.UzE r1 = X.C16678UzE.BOOST_PACKAGES
            java.lang.String r0 = "boost_packages_special_requirements"
            r3.A0F(r1, r0)
            r1 = 1
            androidx.fragment.app.FragmentActivity r0 = r5.getActivity()
            if (r0 == 0) goto L_0x0b2b
            X.Vl8 r0 = X.C13990Tnq.A0N()
            X.UaU r1 = r0.A03(r1)
            androidx.fragment.app.FragmentActivity r0 = r5.requireActivity()
            X.Dbc.A0S(r1, r0, r4)
        L_0x0b2b:
            r0 = 351193042(0x14eec7d2, float:2.4110674E-26)
            goto L_0x0025
        L_0x0b30:
            r0 = -1818019895(0xffffffff93a337c9, float:-4.1201993E-27)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r1.A01
            X.Ua6 r5 = (X.C15299Ua6) r5
            X.0eM r4 = r5.A0F
            X.WGU r3 = X.JTU.A0D(r4)
            X.UzE r1 = X.C16678UzE.BOOST_PACKAGES
            java.lang.String r0 = "boost_packages_customize_more"
            r3.A0F(r1, r0)
            r1 = 0
            androidx.fragment.app.FragmentActivity r0 = r5.getActivity()
            if (r0 == 0) goto L_0x0b5e
            X.Vl8 r0 = X.C13990Tnq.A0N()
            X.UaU r1 = r0.A03(r1)
            androidx.fragment.app.FragmentActivity r0 = r5.requireActivity()
            X.Dbc.A0S(r1, r0, r4)
        L_0x0b5e:
            r0 = 333822873(0x13e5bb99, float:5.7992713E-27)
            goto L_0x0025
        L_0x0b63:
            r0 = 380904112(0x16b422b0, float:2.910246E-25)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.X6G r0 = (X.X6G) r0
            r0.DuM()
            r0 = 1192258677(0x47106c75, float:36972.457)
            goto L_0x0025
        L_0x0b76:
            r0 = 1626803841(0x60f70e81, float:1.4241847E20)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.X6G r0 = (X.X6G) r0
            r0.Djz()
            r0 = 19785736(0x12de808, float:3.1941556E-38)
            goto L_0x0025
        L_0x0b89:
            r0 = -432205819(0xffffffffe63d1005, float:-2.232057E23)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A01
            X.W2M r3 = (X.W2M) r3
            com.instagram.common.session.UserSession r6 = r3.A05
            android.app.Activity r4 = r3.A01
            X.0iw r5 = r3.A04
            com.instagram.model.reels.Reel r0 = r3.A06
            java.lang.String r9 = r0.getId()
            X.TpH r7 = X.C14068TpH.PROFILE
            X.UzD r8 = X.C16677UzD.STORY_HIGHLIGHT_COVER
            X.OcF r1 = X.ORV.A01(r4, r5, r6, r7, r8, r9)
            com.instagram.user.model.User r0 = r3.A07
            r1.A01 = r0
            r0 = 0
            X.C71093OcF.A00(r0, r1)
            r0 = -89262547(0xfffffffffaadf62d, float:-4.516302E35)
            goto L_0x0025
        L_0x0bb5:
            r0 = -1029583800(0xffffffffc2a1cc48, float:-80.89899)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.W2M r1 = (X.W2M) r1
            X.Ki3 r0 = X.Ki3.SELF_PROFILE
            r1.A05(r0)
            r0 = 1789210156(0x6aa52e2c, float:9.98454E25)
            goto L_0x0025
        L_0x0bca:
            r0 = -1911780694(0xffffffff8e0c8aaa, float:-1.7323097E-30)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.X6H r1 = (X.X6H) r1
            r0 = 1
            r1.Drz(r0)
            r0 = -598773390(0xffffffffdc4f7172, float:-2.33560218E17)
            goto L_0x0025
        L_0x0bde:
            r0 = -598797028(0xffffffffdc4f151c, float:-2.33154121E17)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.X6H r1 = (X.X6H) r1
            r0 = 0
            r1.Drz(r0)
            r0 = 475358772(0x1c556634, float:7.0607883E-22)
            goto L_0x0025
        L_0x0bf2:
            r0 = -984115075(0xffffffffc557987d, float:-3449.5305)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.X6H r0 = (X.X6H) r0
            r0.CuG()
            r0 = -1762801212(0xffffffff96edc9c4, float:-3.8416747E-25)
            goto L_0x0025
        L_0x0c05:
            r0 = 1430709265(0x5546e411, float:1.36676775E13)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            androidx.fragment.app.FragmentActivity r0 = r0.getActivity()
            X.C59689JTv.A04(r0)
            r0 = 142698550(0x8816836, float:7.788405E-34)
            goto L_0x0025
        L_0x0c1c:
            r0 = -1881951030(0xffffffff8fd3b4ca, float:-2.0875844E-29)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            com.instagram.archive.fragment.ArchiveReelRecycleBinFragment r0 = (com.instagram.archive.fragment.ArchiveReelRecycleBinFragment) r0
            X.0eM r0 = r0.A09
            java.lang.Object r1 = r0.getValue()
            X.Jih r1 = (X.C60285Jih) r1
            r0 = 1
            r1.A01(r0)
            r0 = 366701229(0x15db6aad, float:8.86217E-26)
            goto L_0x0025
        L_0x0c38:
            r0 = 21301525(0x1450915, float:3.6189702E-38)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.WJj r1 = (X.WJj) r1
            X.2cs r0 = r1.A00
            r0.A03()
            com.instagram.common.session.UserSession r0 = r1.A01
            X.1Av r0 = X.1Au.A00(r0)
            r3 = 1
            X.0xY r1 = X.AnonymousClass7TE.A0p(r0)
            java.lang.String r0 = "archive_map_privacy_banner_dismissed"
            r1.E5T(r0, r3)
            r1.apply()
            r0 = 851297857(0x32bdc641, float:2.2092651E-8)
            goto L_0x0025
        L_0x0c60:
            r0 = 26076915(0x18de6f3, float:5.2126616E-38)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.UdF r0 = (X.C15464UdF) r0
            X.2ms r0 = r0.A04
            r0.CgO()
            r0 = 1157246264(0x44fa2d38, float:2001.4131)
            goto L_0x0025
        L_0x0c75:
            r0 = -1210758301(0xffffffffb7d54b63, float:-2.5426683E-5)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.Vby r0 = (X.C17667Vby) r0
            X.A8U r0 = r0.A02
            X.Uag r1 = r0.A00
            X.A7p r0 = r1.A01()
            X.AH4 r0 = r0.A03
            X.AUb r0 = r0.A09
            X.7tn r0 = X.C40161AUb.A00(r0)
            r0.EzJ()
            X.WT1 r1 = r1.A02()
            X.Uy8 r0 = X.C16612Uy8.FLIP_CAMERA_BUTTON_CLICKED
            X.WT1.A00(r0, r1)
            r0 = -746524006(0xffffffffd380f29a, float:-1.10765199E12)
            goto L_0x0025
        L_0x0ca1:
            r0 = 1271535570(0x4bca17d2, float:2.648874E7)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.Vby r0 = (X.C17667Vby) r0
            X.A8U r0 = r0.A02
            X.Uag r0 = r0.A00
            X.DbT.A1J(r0)
            X.WT1 r1 = r0.A02()
            X.Uy8 r0 = X.C16612Uy8.CLOSE_CAMERA_BUTTON_CLICKED
            X.WT1.A00(r0, r1)
            r0 = -1642972904(0xffffffff9e123918, float:-7.740982E-21)
            goto L_0x0025
        L_0x0cc1:
            r0 = -1054607381(0xffffffffc123f7eb, float:-10.248027)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r1.A01
            X.Uag r4 = (X.C15331Uag) r4
            X.WT1 r1 = r4.A02()
            X.Uy8 r0 = X.C16612Uy8.LICENSE_BUTTON_CLICKED
            X.WT1.A00(r0, r1)
            X.0eM r0 = r4.A0M
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r0)
            com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectAttribution r1 = r4.A03
            androidx.fragment.app.FragmentActivity r0 = r4.requireActivity()
            X.C49894FBx.A00(r0, r1, r3)
            r0 = 1558611240(0x5ce68528, float:5.19085212E17)
            goto L_0x0025
        L_0x0ce9:
            r0 = -1644805100(0xffffffff9df64414, float:-6.518605E-21)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.VcK r0 = (X.C17689VcK) r0
            X.W2G r0 = r0.A0A
            r0.A03()
            r0 = -889700526(0xffffffffcaf83f52, float:-8134569.0)
            goto L_0x0025
        L_0x0cfe:
            r0 = 2022198579(0x78884d33, float:2.2116192E34)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A01
            com.instagram.analytics.eventlog.EventLogListFragment r3 = (com.instagram.analytics.eventlog.EventLogListFragment) r3
            X.0xM r0 = r3.A01
            X.1Mx r0 = r0.A00
            r0.A02()
            X.Ud4 r1 = r3.A00
            java.util.List r0 = r1.A00
            r0.clear()
            X.C15453Ud4.A00(r1)
            java.lang.String r1 = ""
            r3.A04 = r1
            com.instagram.ui.widget.typeahead.TypeaheadHeader r0 = r3.A03
            r0.A04(r1)
            r0 = 1044455500(0x3e41204c, float:0.18859977)
            goto L_0x0025
        L_0x0d28:
            r0 = 1589975946(0x5ec51b8a, float:7.1015488E18)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r1.A01
            X.UbU r4 = (X.C15376UbU) r4
            X.C15376UbU.A02(r4)
            X.0eM r0 = r4.A05
            java.lang.Object r0 = r0.getValue()
            X.VzB r0 = (X.C18732VzB) r0
            X.30s r3 = r0.A00
            java.util.Map r1 = r0.A02
            java.lang.String r0 = "ig_cg_bottomsheet_secondary_cta_click"
            r3.A00(r0, r1)
            r0 = 1
            X.C15376UbU.A01(r4, r4, r0)
            r0 = 1689115473(0x64addb51, float:2.565672E22)
            goto L_0x0025
        L_0x0d50:
            r0 = -1403866275(0xffffffffac52b35d, float:-2.9942362E-12)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.UWb r1 = (X.C15224UWb) r1
            com.google.android.material.textfield.TextInputLayout r0 = r1.A02
            android.widget.EditText r0 = r0.A0F
            android.widget.AutoCompleteTextView r0 = (android.widget.AutoCompleteTextView) r0
            X.C15224UWb.A01(r0, r1)
            r0 = 952026145(0x38bec421, float:9.096438E-5)
            goto L_0x0025
        L_0x0d69:
            r0 = 638348884(0x260c6e54, float:4.872178E-16)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            X.Vu7 r2 = (X.C18555Vu7) r2
            java.lang.Integer r1 = r2.A00
            java.lang.Integer r4 = X.AnonymousClass05K.A00
            if (r1 != r4) goto L_0x0d84
            r2.A01()
        L_0x0d7d:
            r1 = -1523634665(0xffffffffa52f2e17, float:-1.5194446E-16)
        L_0x0d80:
            X.AnonymousClass0fD.A0C(r1, r0)
            return
        L_0x0d84:
            X.C18555Vu7.A00(r2, r4)
            X.VM2 r1 = r2.A02
            X.UYH r3 = r1.A00
            X.WRp r2 = r3.A0A
            if (r2 == 0) goto L_0x0d98
            X.Vfd r1 = new X.Vfd
            r1.<init>(r3)
            r2.A02(r1, r4)
            goto L_0x0d7d
        L_0x0d98:
            java.lang.String r7 = "cameraInitializationController"
            goto L_0x0e68
        L_0x0d9c:
            r0 = 171337302(0xa366656, float:8.7822285E-33)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A01
            X.Vkt r3 = (X.C18067Vkt) r3
            X.VVO r1 = r3.A04
            com.instagram.model.coupon.PromoteCouponType r11 = r3.A0B
            if (r11 == 0) goto L_0x0f25
            java.lang.Integer r0 = r3.A01()
            java.lang.String r5 = r3.A0C
            r8 = 1
            r6 = 0
            int r0 = r0.intValue()
            if (r0 == r6) goto L_0x0e2b
            if (r0 != r8) goto L_0x0e3f
            X.Uac r4 = r1.A00
            java.lang.String r3 = r1.A02
            com.instagram.business.promote.model.PromoteEnrollCouponInfo r0 = r1.A01
            java.lang.String r10 = r0.A0A
            java.lang.String r1 = "Required value was null."
            if (r10 == 0) goto L_0x0f1f
            com.instagram.model.coupon.PromoteCouponCurrencyAmount r0 = r0.A03
            if (r0 == 0) goto L_0x0e1f
            java.lang.String r9 = r0.A00()
        L_0x0dd1:
            if (r5 == 0) goto L_0x0f19
            X.6ap r7 = new X.6ap
            r7.<init>()
            com.instagram.model.coupon.PromoteCouponType r0 = com.instagram.model.coupon.PromoteCouponType.HERES_X
            if (r11 != r0) goto L_0x0e0f
            android.content.Context r1 = r4.requireContext()
            r0 = 2131970556(0x7f1349fc, float:1.9578066E38)
            java.lang.String r0 = r1.getString(r0)
        L_0x0de7:
            r7.A0D = r0
        L_0x0de9:
            r0 = 5000(0x1388, float:7.006E-42)
            r7.A01 = r0
            android.content.Context r1 = r4.requireContext()
            r0 = 2131957179(0x7f1315bb, float:1.9550935E38)
            X.DbW.A0q(r1, r7, r0)
            X.WYG r0 = new X.WYG
            r0.<init>(r5, r4, r8)
            r7.A0A = r0
            r7.A0L = r8
            X.DbY.A1N(r7)
            java.util.List r1 = r4.A0e
            r1.clear()
            X.UdV r0 = r4.A0B
            if (r0 != 0) goto L_0x0e21
            java.lang.String r7 = "promoteAdToolsAdapter"
            goto L_0x0e68
        L_0x0e0f:
            com.instagram.model.coupon.PromoteCouponType r0 = com.instagram.model.coupon.PromoteCouponType.RECREATE_MIN_SPEND_X_TO_GET_Y
            if (r11 != r0) goto L_0x0de9
            android.content.Context r1 = r4.requireContext()
            r0 = 2131970797(0x7f134aed, float:1.9578555E38)
            java.lang.String r0 = X.DbV.A0u(r1, r10, r9, r0)
            goto L_0x0de7
        L_0x0e1f:
            r9 = 0
            goto L_0x0dd1
        L_0x0e21:
            r0.A01(r1)
            X.Vvg r1 = r4.A0C
            if (r1 != 0) goto L_0x0e37
            java.lang.String r7 = "promoteAdsManagerDataFetcher"
            goto L_0x0e68
        L_0x0e2b:
            X.Uac r4 = r1.A00
            java.lang.String r3 = "ads_manager"
            java.lang.String r1 = "promotion_list"
            java.lang.String r0 = "promote_row_button"
            X.C15328Uac.A0C(r4, r5, r3, r1, r0)
            goto L_0x0e3f
        L_0x0e37:
            X.Ufe r0 = new X.Ufe
            r0.<init>(r3, r4, r6)
            r1.A02(r0, r3, r5)
        L_0x0e3f:
            r0 = -640701798(0xffffffffd9cfaa9a, float:-7.3066123E15)
            goto L_0x0025
        L_0x0e44:
            r0 = -470445033(0xffffffffe3f59417, float:-9.0602466E21)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r1.A01
            X.Uag r4 = (X.C15331Uag) r4
            X.WT1 r1 = r4.A02()
            X.Uy8 r0 = X.C16612Uy8.REPORT_EFFECT_BUTTON_CLICKED
            X.WT1.A00(r0, r1)
            X.0eM r0 = r4.A0M
            com.instagram.common.session.UserSession r5 = X.AnonymousClass7TE.A0l(r0)
            androidx.fragment.app.FragmentActivity r3 = r4.requireActivity()
            java.lang.String r8 = r4.A0H
            if (r8 != 0) goto L_0x0e70
            java.lang.String r7 = "effectId"
        L_0x0e68:
            X.0qQ.A0F(r7)
        L_0x0e6b:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0e70:
            X.TpH r6 = X.C14068TpH.IG_AR_ADS_CAMERA
            X.UzD r7 = X.C16677UzD.AR_EFFECT
            X.OcF r1 = X.ORV.A01(r3, r4, r5, r6, r7, r8)
            r0 = 0
            X.C71093OcF.A00(r0, r1)
            r0 = 1780805488(0x6a24ef70, float:4.9848637E25)
            goto L_0x0025
        L_0x0e81:
            r0 = 662155498(0x2777b0ea, float:3.4374041E-15)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.Eyk r0 = (X.C49575Eyk) r0
            X.X5N r0 = r0.A03
            r0.onCancel()
            r0 = 988745543(0x3aef0f47, float:0.0018238806)
            goto L_0x0025
        L_0x0e96:
            r0 = 1201066312(0x4796d148, float:77218.56)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.Tyg r0 = (X.C14576Tyg) r0
            X.X5N r0 = r0.A04
            r0.onCancel()
            r0 = 248976027(0xed7129b, float:5.301951E-30)
            goto L_0x0025
        L_0x0eab:
            r0 = 864100818(0x338121d2, float:6.0131825E-8)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A01
            X.Tyh r3 = (X.C14577Tyh) r3
            X.X5N r0 = r3.A04
            r0.onCancel()
            android.os.Handler r1 = r3.A02
            X.Whn r0 = new X.Whn
            r0.<init>(r3)
            r1.post(r0)
            r0 = 771978553(0x2e037539, float:2.9890066E-11)
            goto L_0x0025
        L_0x0eca:
            r0 = 1840152192(0x6dae7e80, float:6.750415E27)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            androidx.preference.Preference r0 = (androidx.preference.Preference) r0
            r0.A0B(r3)
            r0 = 549793157(0x20c52d85, float:3.340322E-19)
            goto L_0x0025
        L_0x0edd:
            r0 = -1902541467(0xffffffff8e998565, float:-3.7845866E-30)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            androidx.appcompat.widget.Toolbar r0 = (androidx.appcompat.widget.Toolbar) r0
            X.WDS r0 = r0.A0G
            if (r0 == 0) goto L_0x0ef3
            X.WDm r0 = r0.A01
            if (r0 == 0) goto L_0x0ef3
            r0.collapseActionView()
        L_0x0ef3:
            r0 = 1567995446(0x5d75b636, float:1.1065874E18)
            goto L_0x0025
        L_0x0ef8:
            r0 = 463506739(0x1ba08d33, float:2.6561027E-22)
            int r2 = X.AnonymousClass0fD.A05(r0)
            r0 = -404241728(0xffffffffe7e7c2c0, float:-2.1889183E24)
            goto L_0x0025
        L_0x0f04:
            java.lang.Object r0 = r1.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            X.DbX.A1J(r0)
            return
        L_0x0f0c:
            java.lang.Object r0 = r1.A01
            com.instagram.archive.fragment.ArchiveReelFragment r0 = (com.instagram.archive.fragment.ArchiveReelFragment) r0
            X.Jj7 r2 = r0.A03
            java.lang.String r1 = r0.A0A
            r0 = 1
            X.C60308Jj7.A01(r2, r1, r0)
            return
        L_0x0f19:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0f1f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0f25:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0y()
            r0 = -1435472205(0xffffffffaa706eb3, float:-2.1354689E-13)
            X.AnonymousClass0fD.A0C(r0, r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18887WAz.onClick(android.view.View):void");
    }
}
