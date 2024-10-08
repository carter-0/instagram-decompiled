package X;

import android.view.View;

public final class FP5 implements View.OnClickListener {
    public final int A00;
    public final Object A01;

    public FP5(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static FP5 A00(Object obj, int i) {
        return new FP5(obj, i);
    }

    public static void A01(View view, int i, Object obj) {
        AnonymousClass0fU.A00(new FP5(obj, i), view);
    }

    /* JADX WARNING: type inference failed for: r6v5, types: [X.1P0, java.lang.Object, X.EB3] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x0c99, code lost:
        X.AnonymousClass0fD.A0C(r0, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x0c9c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0035, code lost:
        X.AnonymousClass0fD.A0C(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0038, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0547, code lost:
        r4 = "session";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x057e, code lost:
        X.0qQ.A0F(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0585, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r16) {
        /*
            r15 = this;
            int r0 = r15.A00
            r3 = r16
            switch(r0) {
                case 0: goto L_0x06b8;
                case 1: goto L_0x0641;
                case 2: goto L_0x0c28;
                case 3: goto L_0x0607;
                case 4: goto L_0x0b47;
                case 5: goto L_0x05f4;
                case 6: goto L_0x0abb;
                case 7: goto L_0x0aaa;
                case 8: goto L_0x05c7;
                case 9: goto L_0x0598;
                case 10: goto L_0x056c;
                case 11: goto L_0x055b;
                case 12: goto L_0x054a;
                case 13: goto L_0x0520;
                case 14: goto L_0x04f9;
                case 15: goto L_0x0a7f;
                case 16: goto L_0x04e6;
                case 17: goto L_0x04d3;
                case 18: goto L_0x04c0;
                case 19: goto L_0x04ad;
                case 20: goto L_0x0492;
                case 21: goto L_0x0a64;
                case 22: goto L_0x0a49;
                case 23: goto L_0x0a2b;
                case 24: goto L_0x047b;
                case 25: goto L_0x0464;
                case 26: goto L_0x044d;
                case 27: goto L_0x0436;
                case 28: goto L_0x09f3;
                case 29: goto L_0x09bb;
                case 30: goto L_0x0409;
                case 31: goto L_0x03c4;
                case 32: goto L_0x0394;
                case 33: goto L_0x0347;
                case 34: goto L_0x08e5;
                case 35: goto L_0x031e;
                case 36: goto L_0x030b;
                case 37: goto L_0x02fa;
                case 38: goto L_0x02e4;
                case 39: goto L_0x02d3;
                case 40: goto L_0x02c0;
                case 41: goto L_0x029f;
                case 42: goto L_0x028c;
                case 43: goto L_0x027b;
                case 44: goto L_0x026a;
                case 45: goto L_0x0257;
                case 46: goto L_0x0896;
                case 47: goto L_0x0220;
                case 48: goto L_0x0883;
                case 49: goto L_0x082b;
                case 50: goto L_0x0814;
                case 51: goto L_0x07fe;
                case 52: goto L_0x01d3;
                case 53: goto L_0x01c0;
                case 54: goto L_0x07cc;
                case 55: goto L_0x079a;
                case 56: goto L_0x0039;
                case 57: goto L_0x0184;
                case 58: goto L_0x016d;
                case 59: goto L_0x0153;
                case 60: goto L_0x0139;
                case 61: goto L_0x0124;
                case 62: goto L_0x010f;
                case 63: goto L_0x077c;
                case 64: goto L_0x00d4;
                case 65: goto L_0x00bb;
                case 66: goto L_0x0744;
                case 67: goto L_0x00aa;
                case 68: goto L_0x006b;
                case 69: goto L_0x06c9;
                default: goto L_0x0007;
            }
        L_0x0007:
            r0 = 804377419(0x2ff1d34b, float:4.3987777E-10)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r15.A01
            X.E48 r4 = (X.E48) r4
            X.0eM r1 = r4.A05
            X.0lg r1 = X.DbT.A0X(r1)
            r2 = 0
            X.0qQ.A0B(r1, r2)
            X.7Pr r1 = X.DbS.A0W(r1)
            r1.A1C = r2
            X.7Pu r3 = r1.A00()
            androidx.fragment.app.FragmentActivity r2 = r4.requireActivity()
            X.H1c r1 = new X.H1c
            r1.<init>()
            r3.A02(r2, r1)
            r1 = 1124917825(0x430ce241, float:140.8838)
        L_0x0035:
            X.AnonymousClass0fD.A0C(r1, r0)
            return
        L_0x0039:
            r0 = -735233287(0xffffffffd42d3af9, float:-2.97607496E12)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r15.A01
            X.E61 r2 = (X.E61) r2
            X.A8y r1 = r2.A00
            if (r1 == 0) goto L_0x01bc
            X.DmI r0 = r2.A01
            java.lang.String r4 = "adapter"
            if (r0 == 0) goto L_0x057e
            java.util.ArrayList r0 = r0.A04
            r1.A00(r0)
            X.0eM r0 = r2.A04
            r0.getValue()
            java.util.List r0 = r2.A02
            if (r0 != 0) goto L_0x0060
            java.lang.String r4 = "preloadedSettingItems"
            goto L_0x057e
        L_0x0060:
            X.DmI r0 = r2.A01
            if (r0 == 0) goto L_0x057e
            r0 = -1628547616(0xffffffff9eee55e0, float:-2.5234747E-20)
            X.AnonymousClass0fD.A0C(r0, r3)
            return
        L_0x006b:
            r0 = 1193993119(0x472ae39f, float:43747.62)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r6 = r15.A01
            X.E48 r6 = (X.E48) r6
            X.0eM r1 = r6.A04
            java.lang.Object r5 = r1.getValue()
            X.FA6 r5 = (X.FA6) r5
            X.0eM r1 = r6.A02
            java.lang.String r4 = X.DbS.A0t(r1)
            X.0eM r1 = r6.A01
            java.lang.String r3 = X.DbS.A0t(r1)
            X.0eM r1 = r6.A03
            boolean r2 = X.AnonymousClass7TF.A1Z(r1)
            X.AnonymousClass7TG.A1N(r4, r3)
            java.lang.String r1 = "cancel_fan_onboarding_nux"
            X.FA6.A00(r5, r1, r4, r3, r2)
            X.0eM r1 = r6.A06
            java.lang.Object r1 = r1.getValue()
            X.Dku r1 = (X.C46767Dku) r1
            r1.A00()
            X.DbX.A1I(r6)
            r1 = -471095349(0xffffffffe3eba7cb, float:-8.694151E21)
            goto L_0x0035
        L_0x00aa:
            r0 = -1200695476(0xffffffffb86ed74c, float:-5.6944133E-5)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r15.A01
            X.DbS.A1U(r1)
            r1 = -875665678(0xffffffffcbce66f2, float:-2.705354E7)
            goto L_0x0035
        L_0x00bb:
            r0 = 186653569(0xb201b81, float:3.083557E-32)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r15.A01
            android.content.Context r2 = X.DbT.A07(r1)
            if (r2 == 0) goto L_0x00cf
            X.37E r1 = X.AnonymousClass37D.A00
            X.DbX.A14(r2, r1)
        L_0x00cf:
            r1 = -1959996556(0xffffffff8b2cd374, float:-3.3285075E-32)
            goto L_0x0035
        L_0x00d4:
            r0 = 1778619197(0x6a03933d, float:3.976615E25)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r7 = r15.A01
            X.E6F r7 = (X.E6F) r7
            com.instagram.common.session.UserSession r6 = r7.A00
            java.lang.Integer r1 = r7.A01
            X.C59762JXa.A02(r6, r1)
            X.C52345GOp.A06(r6)
            X.1Av r5 = X.1Au.A00(r6)
            r4 = 1
            X.0s0 r3 = r5.A4p
            X.0YZ[] r2 = X.1Av.A8a
            r1 = 333(0x14d, float:4.67E-43)
            X.AnonymousClass7TF.A1J(r5, r3, r2, r1, r4)
            android.content.Context r2 = r7.getContext()
            if (r2 == 0) goto L_0x0102
            X.37E r1 = X.AnonymousClass37D.A00
            X.DbX.A14(r2, r1)
        L_0x0102:
            X.0sa r1 = r7.A02
            r1.invoke()
            X.27p.A01(r6)
            r1 = 1866350604(0x6f3e400c, float:5.887958E28)
            goto L_0x0035
        L_0x010f:
            r0 = -1420763478(0xffffffffab50deaa, float:-7.4205453E-13)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r15.A01
            X.E6H r1 = (X.E6H) r1
            X.7Pu r1 = r1.A03
            X.DbW.A1K(r1)
            r1 = 2054893744(0x7a7b30b0, float:3.260635E35)
            goto L_0x0035
        L_0x0124:
            r0 = 1819354899(0x6c712713, float:1.1661426E27)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r15.A01
            X.E6G r1 = (X.E6G) r1
            X.7Pu r1 = r1.A02
            X.DbW.A1K(r1)
            r1 = -71574487(0xfffffffffbbbdc29, float:-1.9508498E36)
            goto L_0x0035
        L_0x0139:
            r0 = 766671054(0x2db278ce, float:2.0289905E-11)
            int r0 = X.DbX.A03(r3, r0)
            java.lang.Object r2 = r15.A01
            X.E1t r2 = (X.C47425E1t) r2
            android.view.View$OnClickListener r1 = r2.A01
            if (r1 == 0) goto L_0x014e
            X.DbZ.A15(r2)
            r1.onClick(r3)
        L_0x014e:
            r1 = 98951281(0x5e5e071, float:2.1617503E-35)
            goto L_0x0035
        L_0x0153:
            r0 = 1367216382(0x517e10fe, float:6.8200423E10)
            int r0 = X.DbX.A03(r3, r0)
            java.lang.Object r2 = r15.A01
            X.E1t r2 = (X.C47425E1t) r2
            android.view.View$OnClickListener r1 = r2.A00
            if (r1 == 0) goto L_0x0168
            X.DbZ.A15(r2)
            r1.onClick(r3)
        L_0x0168:
            r1 = -176899099(0xfffffffff574bbe5, float:-3.1023716E32)
            goto L_0x0035
        L_0x016d:
            r0 = -1791303813(0xffffffff953adf7b, float:-3.7738696E-26)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r15.A01
            android.content.Context r2 = X.DbT.A08(r1)
            java.lang.String r1 = "https://help.instagram.com/503708446705527/?helpref=uf_share"
            X.FH7.A03(r2, r1)
            r1 = -848882299(0xffffffffcd671585, float:-2.423092E8)
            goto L_0x0035
        L_0x0184:
            r0 = 1004564105(0x3be06e89, float:0.0068491143)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r15.A01
            X.E61 r5 = (X.E61) r5
            X.DmI r3 = r5.A01
            java.lang.String r4 = "adapter"
            if (r3 == 0) goto L_0x057e
            java.util.ArrayList r2 = r3.A03
            r2.clear()
            java.util.List r1 = r3.A05
            r2.addAll(r1)
            java.util.ArrayList r1 = r3.A04
            r1.clear()
            r1 = 1
            r3.A00 = r1
            r3.notifyDataSetChanged()
            X.A8y r2 = r5.A00
            if (r2 == 0) goto L_0x01bc
            X.DmI r1 = r5.A01
            if (r1 == 0) goto L_0x057e
            java.util.ArrayList r1 = r1.A04
            r2.A00(r1)
            r1 = -1801547206(0xffffffff949e923a, float:-1.6011599E-26)
            goto L_0x0035
        L_0x01bc:
            java.lang.String r4 = "delegate"
            goto L_0x057e
        L_0x01c0:
            r0 = 1027344764(0x3d3c097c, float:0.045907483)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r15.A01
            X.LxB r1 = (X.C65634LxB) r1
            r1.A01()
            r1 = -495587112(0xffffffffe275f0d8, float:-1.1342017E21)
            goto L_0x0035
        L_0x01d3:
            r0 = -1629454999(0xffffffff9ee07d69, float:-2.3768791E-20)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r15.A01
            X.K4c r5 = (X.C61360K4c) r5
            X.0eM r1 = r5.A0H
            X.0lg r2 = X.DbT.A0X(r1)
            java.lang.String r7 = X.DbU.A0u(r1)
            r6 = 1
            r1 = 0
            X.0qQ.A0B(r2, r1)
            r4 = 0
            X.1NY r3 = X.AnonymousClass7TG.A0a(r2)
            java.lang.Object[] r2 = new java.lang.Object[]{r7}
            java.lang.String r1 = "live/%s/set_subscriptions_upsell_reminder/"
            r3.A0K(r1, r2)
            r1 = 5221(0x1465, float:7.316E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r1)
            java.lang.String r1 = "true"
            r3.A9m(r2, r1)
            java.lang.String r1 = "broadcast_owner_id"
            r3.A9m(r1, r7)
            java.lang.Class<X.1XP> r2 = X.1XP.class
            java.lang.Class<X.1XY> r1 = X.1XY.class
            r3.A0O(r4, r2, r1, r6)
            X.1OC r2 = X.DbT.A0U(r3, r6)
            r1 = 41
            X.C47697EDg.A01(r5, r2, r1)
            r1 = 1571996367(0x5db2c2cf, float:1.61013569E18)
            goto L_0x0035
        L_0x0220:
            r0 = -566439139(0xffffffffde3cd31d, float:-3.4015627E18)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r7 = r15.A01
            X.E7U r7 = (X.E7U) r7
            X.0eM r1 = r7.A0E
            X.0lg r2 = X.DbT.A0X(r1)
            java.lang.String r1 = "partial_ci_selection"
            r6 = 0
            X.FEK.A00(r2, r6, r1)
            X.6cm r5 = r7.A02
            if (r5 != 0) goto L_0x023f
            java.lang.String r4 = "contactImportLogger"
            goto L_0x057e
        L_0x023f:
            r4 = 1
            java.lang.String r3 = r7.A09
            r2 = 95
            java.lang.String r1 = "skip_on_top"
            java.lang.String r1 = X.002.A0T(r3, r1, r2)
            r5.A03(r6, r1, r4)
            X.G8t r1 = r7.A04
            X.Dba.A1N(r1)
            r1 = 2146233143(0x7feceb37, float:NaN)
            goto L_0x0035
        L_0x0257:
            r0 = 1364175931(0x514fac3b, float:5.5746736E10)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r15.A01
            X.K50 r1 = (X.K50) r1
            X.K50.A00(r1)
            r1 = 221727806(0xd374c3e, float:5.6483E-31)
            goto L_0x0035
        L_0x026a:
            r0 = 485635398(0x1cf23546, float:1.6027988E-21)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r15.A01
            X.Dba.A1Q(r1)
            r1 = 69254725(0x420be45, float:1.8895277E-36)
            goto L_0x0035
        L_0x027b:
            r0 = -959504544(0xffffffffc6cf1f60, float:-26511.688)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r15.A01
            X.Dba.A1Q(r1)
            r1 = -714174102(0xffffffffd56e916a, float:-1.63942698E13)
            goto L_0x0035
        L_0x028c:
            r0 = 2125485118(0x7eb0543e, float:1.1719077E38)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r15.A01
            X.K50 r1 = (X.K50) r1
            X.K50.A00(r1)
            r1 = -1745785194(0xffffffff97f16e96, float:-1.5602176E-24)
            goto L_0x0035
        L_0x029f:
            r0 = 1840649225(0x6db61409, float:7.0438116E27)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r15.A01
            X.K50 r3 = (X.K50) r3
            X.0eM r1 = r3.A02
            java.lang.Object r1 = r1.getValue()
            X.Jg1 r1 = (X.C60120Jg1) r1
            X.2Fj r2 = r1.A00
            r1 = 0
            r2.A0B(r1)
            X.DbT.A1J(r3)
            r1 = 292527824(0x116f9ed0, float:1.8902714E-28)
            goto L_0x0035
        L_0x02c0:
            r0 = -1124418581(0xffffffffbcfabbeb, float:-0.030607184)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r15.A01
            X.E30 r1 = (X.E30) r1
            X.E30.A01(r1)
            r1 = 152570359(0x91809f7, float:1.830102E-33)
            goto L_0x0035
        L_0x02d3:
            r0 = -477485842(0xffffffffe38a24ee, float:-5.0966235E21)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r15.A01
            X.Dba.A1Q(r1)
            r1 = -1695465154(0xffffffff9af1413e, float:-9.978067E-23)
            goto L_0x0035
        L_0x02e4:
            r0 = -553115602(0xffffffffdf08202e, float:-9.808891E18)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r15.A01
            android.view.View r1 = (android.view.View) r1
            r1.requestFocus()
            X.0nA.A0R(r1)
            r1 = -808211228(0xffffffffcfd3ace4, float:-7.1026463E9)
            goto L_0x0035
        L_0x02fa:
            r0 = -1110415592(0xffffffffbdd06718, float:-0.101759136)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r15.A01
            X.Dba.A1Q(r1)
            r1 = -1752306419(0xffffffff978ded0d, float:-9.171751E-25)
            goto L_0x0035
        L_0x030b:
            r0 = 303997558(0x121ea276, float:5.005626E-28)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r15.A01
            X.E30 r1 = (X.E30) r1
            X.E30.A01(r1)
            r1 = 1746217480(0x68152a08, float:2.8176318E24)
            goto L_0x0035
        L_0x031e:
            r0 = 1957825157(0x74b20a85, float:1.1284695E32)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r15.A01
            androidx.fragment.app.Fragment r3 = (androidx.fragment.app.Fragment) r3
            X.8ab r2 = X.DbW.A0U(r3)
            r1 = 2131956380(0x7f13129c, float:1.9549314E38)
            r2.A09(r1)
            r1 = 26
            X.FJi r1 = X.C50023FJi.A00(r3, r1)
            r2.A0F(r1)
            r2.A05()
            X.DbT.A1V(r2)
            r1 = 400966473(0x17e64349, float:1.4880387E-24)
            goto L_0x0035
        L_0x0347:
            r0 = -1429324548(0xffffffffaace3cfc, float:-3.6635267E-13)
            int r0 = X.AnonymousClass0fD.A05(r0)
            X.FFw r3 = X.C49943FFw.A00()
            java.lang.Object r4 = r15.A01
            X.E3y r4 = (X.C47474E3y) r4
            com.instagram.common.session.UserSession r5 = r4.A00
            java.lang.Integer r6 = X.AnonymousClass05K.A0j
            java.lang.Integer r7 = X.AnonymousClass05K.A06
            r1 = 0
            X.0qQ.A0B(r5, r1)
            r8 = 0
            r3.A02(r4, r5, r6, r7, r8)
            android.content.Context r3 = r4.requireContext()
            com.instagram.common.session.UserSession r8 = r4.A00
            X.0hq r6 = r4.getParentFragmentManager()
            boolean r12 = X.DbX.A1Y(r8)
            X.Mqv r2 = X.C67620Mqs.A04
            java.util.ArrayList r11 = X.AnonymousClass7TE.A1C()
            X.EVP r10 = X.EVP.SINGLE
            android.app.Activity r5 = r4.getRootActivity()
            androidx.fragment.app.FragmentActivity r5 = (androidx.fragment.app.FragmentActivity) r5
            X.EMf r2 = new X.EMf
            r7 = r4
            r9 = r8
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            java.lang.Void[] r1 = new java.lang.Void[r1]
            r2.A02(r1)
            X.DbT.A1K(r4)
            r1 = -2057408214(0xffffffff855e712a, float:-1.0459175E-35)
            goto L_0x0035
        L_0x0394:
            r0 = 459253927(0x1b5fa8a7, float:1.8500622E-22)
            int r0 = X.AnonymousClass0fD.A05(r0)
            X.FFw r4 = X.C49943FFw.A00()
            java.lang.Object r5 = r15.A01
            X.E3y r5 = (X.C47474E3y) r5
            com.instagram.common.session.UserSession r6 = r5.A00
            java.lang.Integer r7 = X.AnonymousClass05K.A0C
            java.lang.Integer r8 = X.AnonymousClass05K.A06
            java.lang.String r9 = r5.A01
            r1 = 0
            X.DbW.A1N(r6, r1, r9)
            r4.A02(r5, r6, r7, r8, r9)
            java.lang.String r1 = r5.A01
            android.net.Uri r2 = X.0cp.A03(r1)
            android.content.Context r1 = r3.getContext()
            X.0kR.A0F(r1, r2)
            r1 = 317895503(0x12f2b34f, float:1.531655E-27)
            goto L_0x0035
        L_0x03c4:
            r0 = -1162826803(0xffffffffbab0abcd, float:-0.0013478935)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r15.A01
            X.4mT r3 = (X.C273374mT) r3
            com.instagram.common.session.UserSession r1 = r3.getSession()
            X.6qt r2 = X.C319606qt.A01(r1)
            com.instagram.common.session.UserSession r1 = r3.getSession()
            java.lang.String r1 = r1.A06
            boolean r10 = r2.A0K(r1)
            X.Mqv r1 = X.C67620Mqs.A04
            android.content.Context r2 = r3.requireContext()
            com.instagram.common.session.UserSession r7 = r3.getSession()
            java.util.ArrayList r9 = X.AnonymousClass7TE.A1C()
            X.0hq r5 = r3.getParentFragmentManager()
            X.EVP r8 = X.EVP.SINGLE
            android.app.Activity r4 = r3.getRootActivity()
            androidx.fragment.app.FragmentActivity r4 = (androidx.fragment.app.FragmentActivity) r4
            X.EDo r1 = new X.EDo
            r6 = r3
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            X.DbV.A1Q(r1)
            r1 = -31036886(0xfffffffffe266a2a, float:-5.530077E37)
            goto L_0x0035
        L_0x0409:
            r0 = -1266249964(0xffffffffb4868f14, float:-2.5063548E-7)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r15.A01
            X.4mT r5 = (X.C273374mT) r5
            X.6Yo r4 = X.Dbb.A0G(r5)
            X.F3j r3 = X.DbW.A0X()
            com.instagram.common.session.UserSession r2 = r5.getSession()
            java.lang.String r1 = "inauthentic"
            X.E75 r1 = r3.A00(r2, r1)
            r4.A0E(r1)
            r1 = 12
            r4.A0F(r5, r1)
            r4.A04()
            r1 = -802266991(0xffffffffd02e6091, float:-1.17022566E10)
            goto L_0x0035
        L_0x0436:
            r0 = 1459758231(0x57022497, float:1.43093664E14)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r15.A01
            X.E21 r3 = (X.E21) r3
            X.EZW r2 = X.EZW.AUDIO_DUBBING
            X.EZc r1 = X.C48134EZc.POOR_VISUAL_QUALITY
            X.E21.A01(r1, r2, r3)
            r1 = -753353785(0xffffffffd318bbc7, float:-6.5598541E11)
            goto L_0x0035
        L_0x044d:
            r0 = -636482949(0xffffffffda100a7b, float:-1.013598E16)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r15.A01
            X.E21 r3 = (X.E21) r3
            X.EZW r2 = X.EZW.AUDIO_DUBBING
            X.EZc r1 = X.C48134EZc.POOR_SPEECH_QUALITY
            X.E21.A01(r1, r2, r3)
            r1 = -1736074331(0xffffffff98859ba5, float:-3.4536855E-24)
            goto L_0x0035
        L_0x0464:
            r0 = -151781442(0xfffffffff6f3ffbe, float:-2.4744438E33)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r15.A01
            X.E21 r3 = (X.E21) r3
            X.EZW r2 = X.EZW.AUDIO_DUBBING
            X.EZc r1 = X.C48134EZc.POOR_SOUND_QUALITY
            X.E21.A01(r1, r2, r3)
            r1 = 2062370201(0x7aed4599, float:6.15993E35)
            goto L_0x0035
        L_0x047b:
            r0 = 941169137(0x381919f1, float:3.6502202E-5)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r15.A01
            X.E21 r3 = (X.E21) r3
            X.EZW r2 = X.EZW.AUDIO_DUBBING
            X.EZc r1 = X.C48134EZc.VOICE_INACCURATE
            X.E21.A01(r1, r2, r3)
            r1 = 200231402(0xbef49ea, float:9.2170665E-32)
            goto L_0x0035
        L_0x0492:
            r0 = -1212088056(0xffffffffb7c10108, float:-2.3007873E-5)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r15.A01
            com.instagram.business.ui.BusinessInfoSectionView r1 = (com.instagram.business.ui.BusinessInfoSectionView) r1
            com.instagram.igds.components.switchbutton.IgdsSwitch r1 = r1.A06
            if (r1 != 0) goto L_0x04a5
            java.lang.String r4 = "profileDisplayToggle"
            goto L_0x057e
        L_0x04a5:
            r1.performClick()
            r1 = 1225701015(0x490eb697, float:584553.44)
            goto L_0x0035
        L_0x04ad:
            r0 = 1562720846(0x5d253a4e, float:7.4411965E17)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r15.A01
            X.G9e r1 = (X.C51958G9e) r1
            r1.E0L()
            r1 = 1731197267(0x672ff953, float:8.3101335E23)
            goto L_0x0035
        L_0x04c0:
            r0 = -1241989600(0xffffffffb5f8be20, float:-1.8532774E-6)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r15.A01
            X.G9e r1 = (X.C51958G9e) r1
            r1.DTW()
            r1 = -1195769794(0xffffffffb8ba003e, float:-8.869216E-5)
            goto L_0x0035
        L_0x04d3:
            r0 = 1757661440(0x68c3c900, float:7.396554E24)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r15.A01
            X.G9e r1 = (X.C51958G9e) r1
            r1.CuW()
            r1 = -1708019988(0xffffffff9a31aeec, float:-3.6744043E-23)
            goto L_0x0035
        L_0x04e6:
            r0 = -2010161733(0xffffffff882f5dbb, float:-5.2772327E-34)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r15.A01
            X.G9e r1 = (X.C51958G9e) r1
            r1.DWt()
            r1 = 1492893402(0x58fbbeda, float:2.21437696E15)
            goto L_0x0035
        L_0x04f9:
            r0 = -1771864214(0xffffffff96637f6a, float:-1.8377119E-25)
            int r0 = X.AnonymousClass0fD.A05(r0)
            X.1Wy r1 = X.C322576w3.A00()
            r1.A01()
            X.E2w r3 = new X.E2w
            r3.<init>()
            java.lang.Object r1 = r15.A01
            X.UaR r1 = (X.C15319UaR) r1
            androidx.fragment.app.FragmentActivity r2 = r1.requireActivity()
            com.instagram.common.session.UserSession r1 = r1.A01
            if (r1 == 0) goto L_0x0547
            X.DbY.A14(r3, r2, r1)
            r1 = -494661092(0xffffffffe284121c, float:-1.2181376E21)
            goto L_0x0035
        L_0x0520:
            r0 = 76920430(0x495b66e, float:3.5197267E-36)
            int r0 = X.AnonymousClass0fD.A05(r0)
            X.1Wy r1 = X.C322576w3.A00()
            r1.A01()
            X.E2P r3 = new X.E2P
            r3.<init>()
            java.lang.Object r1 = r15.A01
            X.UaR r1 = (X.C15319UaR) r1
            androidx.fragment.app.FragmentActivity r2 = r1.requireActivity()
            com.instagram.common.session.UserSession r1 = r1.A01
            if (r1 == 0) goto L_0x0547
            X.DbY.A14(r3, r2, r1)
            r1 = -1534785650(0xffffffffa485078e, float:-5.7692354E-17)
            goto L_0x0035
        L_0x0547:
            java.lang.String r4 = "session"
            goto L_0x057e
        L_0x054a:
            r0 = 869373660(0x33d196dc, float:9.759762E-8)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r15.A01
            X.Dba.A1Q(r1)
            r1 = 2000029032(0x77360568, float:3.691827E33)
            goto L_0x0035
        L_0x055b:
            r0 = 1337092611(0x4fb26a03, float:5.9865841E9)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r15.A01
            X.Dba.A1Q(r1)
            r1 = 24997325(0x17d6dcd, float:4.654754E-38)
            goto L_0x0035
        L_0x056c:
            r0 = 1879296017(0x7003c811, float:1.631376E29)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r6 = r15.A01
            X.E4h r6 = (X.C47482E4h) r6
            X.Xzn r5 = r6.A03
            r4 = 0
            if (r5 != 0) goto L_0x0586
            java.lang.String r4 = "logger"
        L_0x057e:
            X.0qQ.A0F(r4)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0586:
            java.lang.String r3 = "pro_inspiration_grid"
            java.lang.String r2 = "continue"
            java.lang.String r1 = ""
            r5.A06(r3, r2, r1, r4)
            r1 = 1
            X.C47482E4h.A04(r6, r1)
            r1 = 139558838(0x8517fb6, float:6.3043773E-34)
            goto L_0x0035
        L_0x0598:
            r0 = 937068846(0x37da892e, float:2.6051504E-5)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r15.A01
            com.instagram.business.instantexperiences.ui.InstantExperiencesBrowserChrome r4 = (com.instagram.business.instantexperiences.ui.InstantExperiencesBrowserChrome) r4
            android.content.Context r1 = r4.getContext()
            X.FF8 r3 = new X.FF8
            r3.<init>(r1)
            java.lang.CharSequence[] r2 = r4.getMenuOptions()
            android.content.DialogInterface$OnClickListener r1 = r4.A0B
            r3.A04(r1, r2)
            r2 = 1
            X.Dig r1 = r3.A0D
            r1.setCanceledOnTouchOutside(r2)
            X.Dig r1 = r3.A00()
            X.AnonymousClass0fN.A00(r1)
            r1 = -2134981937(0xffffffff80bec2cf, float:-1.7518628E-38)
            goto L_0x0035
        L_0x05c7:
            r0 = 342292905(0x1466f9a9, float:1.1661269E-26)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r15.A01
            X.4mT r4 = (X.C273374mT) r4
            com.instagram.common.session.UserSession r1 = r4.getSession()
            X.1NY r3 = X.AnonymousClass7TG.A0a(r1)
            java.lang.String r1 = "users/accept_insights_terms/"
            r3.A0A(r1)
            java.lang.Class<X.92k> r2 = X.C3727892k.class
            java.lang.Class<X.92l> r1 = X.C3727992l.class
            r3.A0Q(r2, r1)
            X.1OC r2 = X.DbW.A0K(r3)
            r1 = 33
            X.C47697EDg.A01(r4, r2, r1)
            r1 = 1047509052(0x3e6fb83c, float:0.23410124)
            goto L_0x0035
        L_0x05f4:
            r0 = -331450915(0xffffffffec3e75dd, float:-9.2101E26)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r15.A01
            X.E50 r1 = (X.E50) r1
            r1.onBackPressed()
            r1 = -2069935770(0xffffffff849f4966, float:-3.7448126E-36)
            goto L_0x0035
        L_0x0607:
            r0 = -1885925290(0xffffffff8f971056, float:-1.4896042E-29)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r15.A01
            com.instagram.business.fragment.SupportServiceEditUrlFragment r2 = (com.instagram.business.fragment.SupportServiceEditUrlFragment) r2
            r1 = 0
            com.instagram.business.fragment.SupportServiceEditUrlFragment.A03(r2, r1)
            X.FFo r9 = r2.A02
            java.lang.String r8 = r2.A07
            java.lang.String r7 = r2.A05
            java.lang.String r6 = r2.A0B
            java.lang.String r5 = r2.A06
            r1 = 0
            X.0qQ.A0B(r8, r1)
            r4 = 1
            X.DbZ.A0t(r4, r7, r6, r5)
            X.0Aj r3 = X.C49935FFo.A00(r9)
            java.lang.String r2 = "remove_link"
            java.lang.String r1 = "step"
            X.Dba.A1B(r3, r1, r2)
            X.C49935FFo.A01(r3, r9, r8, r7, r4)
            X.Dba.A1A(r3, r6, r5)
            r3.Cgf()
            r1 = 802311163(0x2fd24bfb, float:3.8252765E-10)
            goto L_0x0035
        L_0x0641:
            r0 = -1780831225(0xffffffff95daac07, float:-8.832091E-26)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r15.A01
            com.instagram.business.fragment.SupportProfileDisplayOptionsFragment r5 = (com.instagram.business.fragment.SupportProfileDisplayOptionsFragment) r5
            X.4os r2 = r5.A01
            java.lang.String r1 = "Initial Partner should not be null if remove button is shown"
            X.17k.A07(r2, r1)
            X.FFo r11 = r5.A03
            java.lang.String r10 = r2.AmM()
            java.lang.String r9 = r2.Ac5()
            java.lang.String r8 = r2.Bao()
            java.lang.String r7 = r2.getUrl()
            java.lang.String r6 = r2.Ain()
            r4 = 1
            X.DbZ.A0t(r4, r9, r8, r7)
            X.0Aj r3 = X.C49935FFo.A00(r11)
            java.lang.String r2 = "remove_action_button"
            java.lang.String r1 = "step"
            X.Dba.A1B(r3, r1, r2)
            X.C49935FFo.A01(r3, r11, r10, r9, r4)
            X.Dba.A1A(r3, r8, r7)
            java.lang.String r1 = "button_label"
            r3.AAJ(r1, r6)
            r3.Cgf()
            X.6ST r3 = X.DbW.A0Y(r5)
            android.content.Context r2 = r5.requireContext()
            r1 = 2131969783(0x7f1346f7, float:1.9576499E38)
            X.DbU.A18(r2, r3, r1)
            r1 = 0
            r3.setCancelable(r1)
            com.instagram.common.session.UserSession r2 = r5.A04
            r1 = 5
            X.EDV r4 = new X.EDV
            r4.<init>(r1, r5, r3)
            X.1NY r3 = X.DbZ.A0L(r2)
            java.lang.String r1 = "accounts/remove_profile_action_button/"
            r3.A0A(r1)
            java.lang.Class<X.DwL> r2 = X.DwL.class
            java.lang.Class<X.F56> r1 = X.F56.class
            X.DbV.A1N(r3, r2, r1)
            X.DbW.A1E(r3, r4, r5)
            r1 = 450216644(0x1ad5c2c4, float:8.8409396E-23)
            goto L_0x0035
        L_0x06b8:
            r0 = -361906802(0xffffffffea6dbd8e, float:-7.185264E25)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r15.A01
            X.Dba.A1Q(r1)
            r1 = 974897465(0x3a1bc139, float:5.941573E-4)
            goto L_0x0035
        L_0x06c9:
            r0 = -58286751(0xfffffffffc869d61, float:-5.5916784E36)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r7 = r15.A01
            X.E48 r7 = (X.E48) r7
            X.0eM r0 = r7.A04
            java.lang.Object r6 = r0.getValue()
            X.FA6 r6 = (X.FA6) r6
            X.0eM r0 = r7.A02
            java.lang.String r4 = X.DbS.A0t(r0)
            X.0eM r0 = r7.A01
            java.lang.String r3 = X.DbS.A0t(r0)
            X.0eM r0 = r7.A03
            boolean r2 = X.AnonymousClass7TF.A1Z(r0)
            boolean r1 = X.AnonymousClass7TG.A1Z(r4, r3)
            java.lang.String r0 = "accept_fan_onboarding_nux"
            X.FA6.A00(r6, r0, r4, r3, r2)
            X.0eM r0 = r7.A06
            java.lang.Object r0 = r0.getValue()
            X.Dku r0 = (X.C46767Dku) r0
            com.instagram.creator.agent.disclosure.inthread.repository.CreatorAIFanNuxRepository r6 = r0.A00
            java.lang.String r9 = r0.A01
            int r0 = r6.A00
            if (r0 == r1) goto L_0x073c
            r6.A00 = r1
            r4 = 0
            X.2IS r8 = X.C41845B3m.A04()
            X.2IS r3 = X.C41845B3m.A04()
            X.0K0 r2 = com.facebook.graphql.calls.GraphQlCallInput.A02
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            java.lang.String r0 = "did_accept"
            X.0Df r2 = X.C41845B3m.A03(r2, r1, r0)
            java.lang.String r1 = "BETA_02_24"
            java.lang.String r0 = "terms_type"
            X.0Df.A00(r2, r1, r0)
            java.lang.String r0 = "creator_igid"
            X.0Df.A00(r2, r9, r0)
            X.C41848B3p.A1L(r2, r8)
            com.facebook.pando.PandoGraphQLRequest r3 = X.C50171FSd.A00(r8, r3)
            X.4Cq r2 = r6.A01
            r1 = 6
            X.ImQ r0 = new X.ImQ
            r0.<init>(r3, r6, r4, r1)
            X.AnonymousClass7TE.A1Z(r0, r2)
        L_0x073c:
            X.DbX.A1I(r7)
            r0 = -379054066(0xffffffffe968180e, float:-1.7536524E25)
            goto L_0x0c99
        L_0x0744:
            r0 = 1111157451(0x423aeacb, float:46.72929)
            int r5 = X.AnonymousClass0fD.A05(r0)
            X.FEe r6 = com.instagram.simplewebview.SimpleWebViewActivity.A02
            java.lang.Object r1 = r15.A01
            X.E6F r1 = (X.E6F) r1
            android.content.Context r4 = r1.requireContext()
            com.instagram.common.session.UserSession r3 = r1.A00
            r0 = 16
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.SFz r2 = new X.SFz
            r2.<init>((java.lang.String) r0)
            android.content.Context r1 = r1.getContext()
            if (r1 == 0) goto L_0x077a
            r0 = 2131964884(0x7f1333d4, float:1.9566562E38)
            java.lang.String r0 = r1.getString(r0)
        L_0x076f:
            X.C49906FEe.A01(r4, r3, r6, r2, r0)
            X.27p.A01(r3)
            r0 = -468559923(0xffffffffe41257cd, float:-1.0798205E22)
            goto L_0x0c99
        L_0x077a:
            r0 = 0
            goto L_0x076f
        L_0x077c:
            r0 = 837809028(0x31eff384, float:6.9835E-9)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r15.A01
            X.E6H r1 = (X.E6H) r1
            X.Ete r0 = r1.A01
            if (r0 == 0) goto L_0x0790
            X.0sa r0 = r0.A00
            r0.invoke()
        L_0x0790:
            X.7Pu r0 = r1.A03
            X.DbW.A1K(r0)
            r0 = 88231588(0x5424ea4, float:9.13628E-36)
            goto L_0x0c99
        L_0x079a:
            r0 = 1057030100(0x3f00ffd4, float:0.5039036)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r15.A01
            X.E0j r0 = (X.E0j) r0
            X.Dba.A11(r0)
            X.DbZ.A15(r0)
            X.0eM r0 = r0.A00
            X.0lg r2 = X.DbY.A0R(r0)
            r0 = 24
            X.MMR r1 = new X.MMR
            r1.<init>(r2, r0)
            java.lang.Class<X.KVS> r0 = X.KVS.class
            java.lang.Object r0 = r2.A01(r0, r1)
            X.FYW r0 = (X.FYW) r0
            X.G7f r0 = r0.A00
            if (r0 == 0) goto L_0x07c7
            r0.DZM()
        L_0x07c7:
            r0 = -1894074025(0xffffffff8f1ab957, float:-7.628481E-30)
            goto L_0x0c99
        L_0x07cc:
            r0 = 1520173359(0x5a9c012f, float:2.19556989E16)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r15.A01
            X.E0i r0 = (X.E0i) r0
            X.Dba.A11(r0)
            X.DbZ.A15(r0)
            X.0eM r0 = r0.A00
            X.0lg r2 = X.DbY.A0R(r0)
            r0 = 23
            X.MMR r1 = new X.MMR
            r1.<init>(r2, r0)
            java.lang.Class<X.9pK> r0 = X.C389369pK.class
            java.lang.Object r0 = r2.A01(r0, r1)
            X.FYW r0 = (X.FYW) r0
            X.G7f r0 = r0.A00
            if (r0 == 0) goto L_0x07f9
            r0.DZM()
        L_0x07f9:
            r0 = -1168839811(0xffffffffba54eb7d, float:-8.1222487E-4)
            goto L_0x0c99
        L_0x07fe:
            r0 = 1192174033(0x470f21d1, float:36641.816)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r15.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            X.Dba.A11(r0)
            X.DbZ.A15(r0)
            r0 = 1617206582(0x60649d36, float:6.589353E19)
            goto L_0x0c99
        L_0x0814:
            r0 = -1766235252(0xffffffff96b9638c, float:-2.9951185E-25)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r15.A01
            X.E68 r0 = (X.E68) r0
            X.G6o r0 = r0.A00
            if (r0 == 0) goto L_0x0826
            r0.Di1()
        L_0x0826:
            r0 = -510060710(0xffffffffe199175a, float:-3.530043E20)
            goto L_0x0c99
        L_0x082b:
            r0 = 2073089302(0x7b90d516, float:1.5040253E36)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r15.A01
            X.E68 r2 = (X.E68) r2
            X.G6o r0 = r2.A00
            if (r0 == 0) goto L_0x087e
            r0.DZJ()
            X.0eM r0 = r2.A07
            X.0lg r1 = X.DbT.A0X(r0)
            X.0eM r0 = r2.A02
            java.lang.String r4 = X.DbS.A0t(r0)
            X.0eM r0 = r2.A04
            java.lang.Object r3 = r0.getValue()
            X.GPK r3 = (X.GPK) r3
            X.0eM r0 = r2.A05
            java.lang.String r2 = X.DbS.A0t(r0)
            X.AnonymousClass7TG.A1N(r1, r4)
            r0 = 3
            X.0qQ.A0B(r2, r0)
            X.0wc r1 = X.AnonymousClass0kN.A02(r1)
            java.lang.String r0 = "instagram_media_note_production_nux_try_it_click_client"
            X.0Aj r1 = X.AnonymousClass7TE.A0e(r1, r0)
            boolean r0 = r1.isSampled()
            if (r0 == 0) goto L_0x087e
            java.lang.String r0 = "media_id"
            r1.AAJ(r0, r2)
            X.DbS.A1O(r1, r4)
            java.lang.String r0 = "event_source"
            r1.A8M(r3, r0)
            r1.Cgf()
        L_0x087e:
            r0 = -996389568(0xffffffffc49c4d40, float:-1250.4141)
            goto L_0x0c99
        L_0x0883:
            r0 = -1833400598(0xffffffff92b886ea, float:-1.1645291E-27)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r15.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            X.DbZ.A15(r0)
            r0 = 1863574696(0x6f13e4a8, float:4.5770725E28)
            goto L_0x0c99
        L_0x0896:
            r0 = -759559382(0xffffffffd2ba0b2a, float:-3.99525609E11)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r15.A01
            X.FY0 r0 = (X.FY0) r0
            X.Eta r0 = r0.A00
            X.E7U r6 = r0.A00
            java.util.Map r0 = r6.A0A
            java.util.Collection r1 = r0.values()
            java.util.HashSet r0 = r6.A0D
            r0.addAll(r1)
            int r0 = r0.size()
            r6.A00 = r0
            java.util.ArrayList r0 = r6.A0C
            java.util.Iterator r4 = r0.iterator()
            r3 = 0
        L_0x08bd:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x08dd
            int r2 = r3 + 1
            java.lang.Object r1 = r4.next()
            X.2tL r1 = (X.C232262tL) r1
            boolean r0 = r1 instanceof X.C47240DtR
            if (r0 == 0) goto L_0x08db
            X.DtR r1 = (X.C47240DtR) r1
            boolean r0 = r1.A00
            if (r0 != 0) goto L_0x08db
            r0 = 1
            r1.A00 = r0
            r6.notifyItemChanged(r3)
        L_0x08db:
            r3 = r2
            goto L_0x08bd
        L_0x08dd:
            X.E7U.A00(r6)
            r0 = -388255403(0xffffffffe8dbb155, float:-8.2997557E24)
            goto L_0x0c99
        L_0x08e5:
            r0 = 785639592(0x2ed3e8a8, float:9.636497E-11)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r6 = r15.A01
            X.UaY r6 = (X.C15325UaY) r6
            X.0eM r10 = r6.A0B
            X.0lg r0 = X.DbT.A0X(r10)
            if (r0 == 0) goto L_0x09b6
            X.7Pr r1 = X.DbS.A0W(r0)
            r0 = 2131963501(0x7f132e6d, float:1.9563757E38)
            java.lang.String r0 = r6.getString(r0)
            r1.A0d = r0
            X.7Pu r9 = r1.A00()
            android.content.Context r8 = r6.requireContext()
            r6.requireContext()
            com.instagram.common.session.UserSession r11 = X.AnonymousClass7TE.A0l(r10)
            r0 = 1
            X.0qQ.A0B(r11, r0)
            java.lang.String r7 = "favorites_how_it_works"
            r0 = 2131962084(0x7f1328e4, float:1.9560883E38)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            r0 = 2131962083(0x7f1328e3, float:1.9560881E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 2131238965(0x7f082035, float:1.8094224E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r13 = 0
            com.instagram.nux.common.HowItWorksNuxFragment$Row r12 = new com.instagram.nux.common.HowItWorksNuxFragment$Row
            r12.<init>(r2, r1, r0, r13)
            r0 = 2131962086(0x7f1328e6, float:1.9560887E38)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            r0 = 2131962085(0x7f1328e5, float:1.9560885E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 2131238844(0x7f081fbc, float:1.8093978E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            com.instagram.nux.common.HowItWorksNuxFragment$Row r4 = new com.instagram.nux.common.HowItWorksNuxFragment$Row
            r4.<init>(r2, r1, r0, r13)
            r0 = 2131962088(0x7f1328e8, float:1.9560891E38)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            r0 = 2131962087(0x7f1328e7, float:1.956089E38)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            r0 = 2131238514(0x7f081e72, float:1.8093309E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            com.instagram.nux.common.HowItWorksNuxFragment$Row r0 = new com.instagram.nux.common.HowItWorksNuxFragment$Row
            r0.<init>(r3, r2, r1, r13)
            com.instagram.nux.common.HowItWorksNuxFragment$Row[] r0 = new com.instagram.nux.common.HowItWorksNuxFragment$Row[]{r12, r4, r0}
            java.util.ArrayList r0 = X.0sr.A1L(r0)
            X.E1X r0 = X.C49781F6o.A01(r11, r7, r0)
            X.0qQ.A07(r0)
            r9.A03(r8, r0)
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r10)
            X.5rw r1 = X.C297545rv.A00(r0)
            r0 = 4765(0x129d, float:6.677E-42)
            java.lang.String r3 = X.AnonymousClass000.A00(r0)
            X.0eM r0 = r6.A0A
            java.lang.Object r0 = r0.getValue()
            X.3kK r0 = (X.C249763kK) r0
            java.lang.String r2 = r0.getSessionId()
            com.instagram.common.session.UserSession r0 = r1.A00
            X.0wc r1 = X.DbW.A0J(r0, r3)
            java.lang.String r0 = "instagram_feed_favorites_how_it_works"
            X.0Aj r1 = X.AnonymousClass7TE.A0e(r1, r0)
            boolean r0 = r1.isSampled()
            if (r0 == 0) goto L_0x09b6
            X.DbS.A1K(r1, r3)
            r0 = 3000(0xbb8, float:4.204E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            r1.AAJ(r0, r2)
            r1.Cgf()
        L_0x09b6:
            r0 = -391873339(0xffffffffe8a47cc5, float:-6.2141576E24)
            goto L_0x0c99
        L_0x09bb:
            r0 = 437364574(0x1a11a75e, float:3.0120495E-23)
            int r5 = X.AnonymousClass0fD.A05(r0)
            X.37E r2 = X.AnonymousClass37D.A00
            java.lang.Object r1 = r15.A01
            X.ES2 r1 = (X.ES2) r1
            androidx.fragment.app.FragmentActivity r0 = r1.requireActivity()
            X.37D r0 = r2.A01(r0)
            X.7Pu r4 = X.C48943Emh.A00(r0)
            if (r4 == 0) goto L_0x09ee
            X.E1g r3 = new X.E1g
            r3.<init>()
            X.0eM r0 = r1.A06
            X.7Pr r2 = X.DbX.A0f(r0)
            android.content.Context r1 = r1.requireContext()
            r0 = 2131975511(0x7f135d57, float:1.9588116E38)
            X.DbZ.A0z(r1, r2, r0)
            r4.A0F(r3, r2)
        L_0x09ee:
            r0 = -22038484(0xfffffffffeafb82c, float:-1.1678559E38)
            goto L_0x0c99
        L_0x09f3:
            r0 = 1999154307(0x7728ac83, float:3.4211126E33)
            int r5 = X.AnonymousClass0fD.A05(r0)
            X.37E r2 = X.AnonymousClass37D.A00
            java.lang.Object r1 = r15.A01
            X.ES2 r1 = (X.ES2) r1
            androidx.fragment.app.FragmentActivity r0 = r1.requireActivity()
            X.37D r0 = r2.A01(r0)
            X.7Pu r4 = X.C48943Emh.A00(r0)
            if (r4 == 0) goto L_0x0a26
            X.E1J r3 = new X.E1J
            r3.<init>()
            X.0eM r0 = r1.A06
            X.7Pr r2 = X.DbX.A0f(r0)
            android.content.Context r1 = r1.requireContext()
            r0 = 2131960972(0x7f13248c, float:1.9558628E38)
            X.DbZ.A0z(r1, r2, r0)
            r4.A0F(r3, r2)
        L_0x0a26:
            r0 = -1135018245(0xffffffffbc58fefb, float:-0.013244386)
            goto L_0x0c99
        L_0x0a2b:
            r0 = 382346415(0x16ca24af, float:3.265801E-25)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r15.A01
            X.E21 r2 = (X.E21) r2
            boolean r0 = r2.A02
            if (r0 == 0) goto L_0x0a46
            X.EZW r1 = X.EZW.CLOSED_CAPTION
        L_0x0a3c:
            X.EZc r0 = X.C48134EZc.TEXT_INACCURATE
            X.E21.A01(r0, r1, r2)
            r0 = 1192272165(0x4710a125, float:37025.145)
            goto L_0x0c99
        L_0x0a46:
            X.EZW r1 = X.EZW.STICKER
            goto L_0x0a3c
        L_0x0a49:
            r0 = -1788672356(0xffffffff9563069c, float:-4.58475E-26)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r15.A01
            X.EEJ r1 = (X.EEJ) r1
            boolean r0 = r1.A03
            if (r0 != 0) goto L_0x0a5f
            X.G7t r0 = r1.A01
            if (r0 == 0) goto L_0x0a5f
            r0.Di0()
        L_0x0a5f:
            r0 = -846582802(0xffffffffcd8a2bee, float:-2.89766848E8)
            goto L_0x0c99
        L_0x0a64:
            r0 = 51216915(0x30d8213, float:4.1585494E-37)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r15.A01
            X.EEJ r1 = (X.EEJ) r1
            boolean r0 = r1.A03
            if (r0 != 0) goto L_0x0a7a
            X.G7t r0 = r1.A01
            if (r0 == 0) goto L_0x0a7a
            r0.DZI()
        L_0x0a7a:
            r0 = -1675156676(0xffffffff9c27233c, float:-5.5301204E-22)
            goto L_0x0c99
        L_0x0a7f:
            r0 = 1086692570(0x40c59cda, float:6.175397)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r15.A01
            X.EET r3 = (X.EET) r3
            boolean r0 = r3.A00
            if (r0 != 0) goto L_0x0a93
            r0 = 600551318(0x23cbaf96, float:2.2083668E-17)
            goto L_0x0c99
        L_0x0a93:
            com.instagram.ui.widget.search.SearchController r2 = r3.A03
            android.view.View r0 = r3.A01
            int r0 = r0.getHeight()
            float r1 = (float) r0
            r0 = 1
            r2.A02(r0, r1)
            com.instagram.business.fragment.CategorySearchFragment r0 = r3.A02
            r0.A0c()
            r0 = -2046446007(0xffffffff8605b649, float:-2.5148442E-35)
            goto L_0x0c99
        L_0x0aaa:
            r0 = 195744500(0xbaad2f4, float:6.5799025E-32)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r15.A01
            X.Dbb.A1S(r0)
            r0 = 244837140(0xe97eb14, float:3.7450746E-30)
            goto L_0x0c99
        L_0x0abb:
            r0 = -1713921223(0xffffffff99d7a339, float:-2.2296404E-23)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r15.A01
            X.E50 r0 = (X.E50) r0
            X.Dkz r3 = r0.A07
            java.lang.String r9 = "not_business"
            com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger r0 = r3.A05
            java.lang.String r7 = "intro"
            r10 = 0
            java.lang.String r8 = r3.A08
            X.Xtl r6 = new X.Xtl
            r11 = r10
            r12 = r10
            r13 = r10
            r14 = r10
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14)
            r0.Ckp(r6)
            X.0lg r2 = r3.A07
            java.lang.String r0 = "feed_persistent_icon"
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L_0x0b38
            boolean r0 = r2 instanceof com.instagram.common.session.UserSession
            if (r0 == 0) goto L_0x0b38
            com.instagram.common.session.UserSession r2 = (com.instagram.common.session.UserSession) r2
            java.lang.Integer r7 = X.AnonymousClass05K.A05
            com.instagram.user.model.User r0 = X.DbT.A0j(r2)
            X.EB3 r6 = new X.EB3
            r6.<init>()
            r6.A00 = r2
            r6.A02 = r7
            r6.A01 = r0
            java.lang.String r1 = "business_conversion"
            X.4D6 r4 = X.F9Z.A00
            X.1NY r2 = X.DbU.A0N(r2)
            java.lang.String r0 = "megaphone/log/"
            r2.A0A(r0)
            java.lang.String r0 = "type"
            r2.A9m(r0, r1)
            java.lang.String r1 = X.C48986EnO.A00(r7)
            java.lang.String r0 = "action"
            r2.A9m(r0, r1)
            java.lang.Class<X.1XP> r1 = X.1XP.class
            java.lang.Class<X.1XY> r0 = X.1XY.class
            r2.A0R(r1, r0)
            java.lang.String r1 = "profile_page"
            java.lang.String r0 = "display_medium"
            r2.A9m(r0, r1)
            X.DbW.A1E(r2, r6, r4)
            X.2Fj r1 = r3.A00
            java.lang.Boolean r0 = X.AnonymousClass7TE.A0v()
            r1.A0B(r0)
        L_0x0b33:
            r0 = -536518558(0xffffffffe0056062, float:-3.8443157E19)
            goto L_0x0c99
        L_0x0b38:
            X.6oS r2 = X.C318116oQ.A00(r3)
            r1 = 13
            X.MG7 r0 = new X.MG7
            r0.<init>(r3, r10, r1)
            X.AnonymousClass7TE.A1Z(r0, r2)
            goto L_0x0b33
        L_0x0b47:
            r0 = -2077602293(0xffffffff842a4e0b, float:-2.001924E-36)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r6 = r15.A01
            com.instagram.business.fragment.SupportServiceEditUrlFragment r6 = (com.instagram.business.fragment.SupportServiceEditUrlFragment) r6
            android.widget.EditText r0 = r6.mURLEditText
            java.lang.String r8 = X.AnonymousClass7TF.A0f(r0)
            X.FFo r11 = r6.A02
            java.lang.String r10 = r6.A07
            boolean r9 = r6.A0C
            java.lang.String r4 = r6.A05
            java.lang.String r3 = r6.A0B
            r7 = 0
            X.0qQ.A0B(r10, r7)
            r0 = 2
            X.AnonymousClass7TG.A0w(r0, r4, r3, r8)
            X.0Aj r2 = X.C49935FFo.A00(r11)
            java.lang.String r1 = "flow_connect_website"
            java.lang.String r0 = "step"
            X.Dba.A1B(r2, r0, r1)
            X.C49935FFo.A01(r2, r11, r10, r4, r9)
            java.lang.String r0 = "partner_name"
            r2.AAJ(r0, r3)
            java.lang.String r10 = "url"
            r2.AAJ(r10, r8)
            r2.Cgf()
            boolean r0 = r6.A0C
            if (r0 == 0) goto L_0x0b99
            java.lang.String r0 = r6.A06
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L_0x0b99
            com.instagram.business.fragment.SupportServiceEditUrlFragment.A01(r6)
            r0 = 1188211645(0x46d2abbd, float:26965.87)
            goto L_0x0c99
        L_0x0b99:
            com.instagram.actionbar.ActionButton r0 = r6.A00
            r9 = 1
            r0.setDisplayedChild(r9)
            java.lang.String r0 = r8.trim()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0bf7
            X.FFo r10 = r6.A02
            java.lang.String r9 = r6.A07
            boolean r4 = r6.A0C
            java.lang.String r3 = r6.A05
            java.lang.String r2 = r6.A0B
            X.DbZ.A0t(r7, r9, r3, r2)
            X.0Aj r1 = X.C49935FFo.A00(r10)
            java.lang.String r0 = "validate_url"
            X.DbS.A1H(r1, r0)
            java.lang.String r0 = "url_invalid"
            X.DbS.A1J(r1, r0)
            X.C49935FFo.A01(r1, r10, r9, r3, r4)
            X.Dba.A1A(r1, r2, r8)
            r1.Cgf()
            r0 = 2131964473(0x7f133239, float:1.9565729E38)
            java.lang.String r1 = r6.getString(r0)
            android.widget.TextView r0 = r6.mURLTitleTextView
            r0.setText(r1)
            android.widget.TextView r3 = r6.mURLTitleTextView
            android.content.Context r2 = r6.requireContext()
            android.content.Context r1 = r6.requireContext()
            r0 = 2130970215(0x7f040667, float:1.7549134E38)
            int r0 = X.2Yu.A0H(r1, r0)
            X.DbT.A17(r2, r3, r0)
            com.instagram.actionbar.ActionButton r0 = r6.A00
            r0.setDisplayedChild(r7)
        L_0x0bf2:
            r0 = 566131929(0x21be7cd9, float:1.2907948E-18)
            goto L_0x0c99
        L_0x0bf7:
            com.instagram.common.session.UserSession r0 = r6.A03
            java.lang.String r4 = r6.A05
            X.ECz r3 = new X.ECz
            r3.<init>(r8, r6, r7)
            X.0qQ.A0B(r0, r7)
            X.1NY r2 = X.AnonymousClass7TG.A0a(r0)
            java.lang.String r0 = "business/instant_experience/smb_validate_url/"
            r2.A0A(r0)
            java.lang.Class<X.DwM> r1 = X.DwM.class
            java.lang.Class<X.F59> r0 = X.F59.class
            r2.A0Q(r1, r0)
            r2.A0R = r9
            r2.A9m(r10, r8)
            java.lang.String r0 = "app_id"
            r2.A9m(r0, r4)
            java.lang.String r1 = "use_strict_checking"
            java.lang.String r0 = "0"
            r2.A9m(r1, r0)
            X.DbW.A1E(r2, r3, r6)
            goto L_0x0bf2
        L_0x0c28:
            r0 = -232225532(0xfffffffff2288504, float:-3.3378744E30)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r6 = r15.A01
            com.instagram.business.fragment.SupportProfileDisplayOptionsFragment r6 = (com.instagram.business.fragment.SupportProfileDisplayOptionsFragment) r6
            X.E9E r0 = r6.A02
            X.4os r0 = r0.A00
            java.lang.String r10 = "Selected Partner should not be null if save enabled"
            X.17k.A07(r0, r10)
            X.FFo r12 = r6.A03
            java.lang.String r11 = r0.AmM()
            java.lang.String r9 = r0.Ac5()
            java.lang.String r8 = r0.Bao()
            java.lang.String r7 = r0.getUrl()
            java.lang.String r4 = r0.Ain()
            r3 = 1
            X.DbZ.A0t(r3, r9, r8, r7)
            X.0Aj r2 = X.C49935FFo.A00(r12)
            java.lang.String r1 = "update_action_button"
            java.lang.String r0 = "step"
            X.Dba.A1B(r2, r0, r1)
            X.C49935FFo.A01(r2, r12, r11, r9, r3)
            X.Dba.A1A(r2, r8, r7)
            java.lang.String r0 = "button_label"
            r2.AAJ(r0, r4)
            r2.Cgf()
            X.E9E r0 = r6.A02
            X.4os r0 = r0.A00
            if (r0 != 0) goto L_0x0c9d
            r4 = 0
        L_0x0c76:
            X.17k.A07(r4, r10)
            X.6ST r3 = X.DbW.A0Y(r6)
            android.content.Context r1 = r6.requireContext()
            r0 = 2131969783(0x7f1346f7, float:1.9576499E38)
            X.DbU.A18(r1, r3, r0)
            r0 = 0
            r3.setCancelable(r0)
            com.instagram.common.session.UserSession r2 = r6.A04
            r1 = 4
            X.EDV r0 = new X.EDV
            r0.<init>(r1, r6, r3)
            X.C48757Ejg.A00(r0, r2, r6, r4)
            r0 = 872696890(0x34044c3a, float:1.2321189E-7)
        L_0x0c99:
            X.AnonymousClass0fD.A0C(r0, r5)
            return
        L_0x0c9d:
            java.lang.String r4 = r0.AmM()
            goto L_0x0c76
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FP5.onClick(android.view.View):void");
    }
}
