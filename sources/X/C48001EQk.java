package X;

/* renamed from: X.EQk  reason: case insensitive filesystem */
public final class C48001EQk extends H4J {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C48001EQk(0hq r1, Object obj, int i) {
        super(r1);
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(0hq r1, AnonymousClass4DH r2, 1OC r3, int i) {
        r3.A00 = new C48001EQk(r1, r2, i);
        r2.schedule(r3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0145, code lost:
        r0 = "twoFacResponseBundle";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0147, code lost:
        X.0qQ.A0F(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x014e, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0016, code lost:
        X.AnonymousClass0fD.A0A(r0, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0019, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onFail(X.C268654dm r6) {
        /*
            r5 = this;
            int r0 = r5.A00
            switch(r0) {
                case 0: goto L_0x0130;
                case 1: goto L_0x011b;
                case 2: goto L_0x0108;
                case 3: goto L_0x00e4;
                case 4: goto L_0x00bd;
                case 5: goto L_0x00a6;
                case 6: goto L_0x008f;
                case 7: goto L_0x007a;
                case 8: goto L_0x005e;
                case 9: goto L_0x0040;
                case 10: goto L_0x002c;
                case 11: goto L_0x001a;
                default: goto L_0x0005;
            }
        L_0x0005:
            r0 = 1345815426(0x50378382, float:1.23153961E10)
            int r4 = X.AnonymousClass7TG.A0D(r6, r0)
            java.lang.Object r0 = r5.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            X.C49952FGh.A07(r0, r6)
            r0 = -727815340(0xffffffffd49e6b54, float:-5.443244E12)
        L_0x0016:
            X.AnonymousClass0fD.A0A(r0, r4)
            return
        L_0x001a:
            r0 = -1107408811(0xffffffffbdfe4855, float:-0.1241614)
            int r4 = X.AnonymousClass7TG.A0D(r6, r0)
            java.lang.Object r0 = r5.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            X.C49952FGh.A07(r0, r6)
            r0 = 662979648(0x27844440, float:3.6711357E-15)
            goto L_0x0016
        L_0x002c:
            r0 = 1300566381(0x4d85116d, float:2.79063968E8)
            int r4 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r1 = r5.A01
            X.E3A r1 = (X.E3A) r1
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            X.E3A.A03(r1, r0)
            r0 = 89461867(0x555146b, float:1.0018962E-35)
            goto L_0x0016
        L_0x0040:
            r0 = 1447154985(0x5641d529, float:5.3280315E13)
            int r4 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r2 = r5.A01
            X.E0z r2 = (X.C47407E0z) r2
            com.instagram.login.twofac.model.TrustedDevice r1 = r2.A00
            if (r1 != 0) goto L_0x0053
            java.lang.String r0 = "trustedDevice"
            goto L_0x0147
        L_0x0053:
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            r1.A03 = r0
            X.DbZ.A17(r2)
            r0 = -1721902046(0xffffffff995ddc22, float:-1.1469888E-23)
            goto L_0x0016
        L_0x005e:
            r0 = -697928157(0xffffffffd6667623, float:-6.3348767E13)
            int r4 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r1 = r5.A01
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            android.content.Context r0 = r1.getContext()
            if (r0 == 0) goto L_0x0076
            android.content.Context r0 = r1.requireContext()
            X.C49952FGh.A01(r0)
        L_0x0076:
            r0 = -1326985370(0xffffffffb0e7cf66, float:-1.6866408E-9)
            goto L_0x0016
        L_0x007a:
            r0 = 1063572911(0x3f64d5af, float:0.89388555)
            int r4 = X.AnonymousClass7TG.A0D(r6, r0)
            java.lang.Object r0 = r5.A01
            X.ES6 r0 = (X.ES6) r0
            X.C49952FGh.A07(r0, r6)
            X.ES6.A06(r0)
            r0 = 557551976(0x213b9168, float:6.355051E-19)
            goto L_0x0016
        L_0x008f:
            r0 = 193145287(0xb8329c7, float:5.0522224E-32)
            int r4 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r0 = r5.A01
            android.content.Context r0 = X.DbT.A07(r0)
            if (r0 == 0) goto L_0x00a1
            X.C49952FGh.A01(r0)
        L_0x00a1:
            r0 = -1333206587(0xffffffffb088e1c5, float:-9.95947E-10)
            goto L_0x0016
        L_0x00a6:
            r0 = -1153280126(0xffffffffbb425782, float:-0.002965421)
            int r4 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r0 = r5.A01
            android.content.Context r0 = X.DbT.A07(r0)
            if (r0 == 0) goto L_0x00b8
            X.C49952FGh.A01(r0)
        L_0x00b8:
            r0 = 1483878955(0x5872322b, float:1.06518913E15)
            goto L_0x0016
        L_0x00bd:
            r0 = -1807465372(0xffffffff94444464, float:-9.908959E-27)
            int r4 = X.AnonymousClass0fD.A03(r0)
            r3 = 0
            X.0qQ.A0B(r6, r3)
            java.lang.Object r2 = r5.A01
            X.ESP r2 = (X.ESP) r2
            androidx.fragment.app.FragmentActivity r0 = r2.requireActivity()
            X.C49952FGh.A02(r0, r6)
            android.os.Bundle r1 = r2.A00
            if (r1 == 0) goto L_0x0145
            java.lang.String r0 = "is_whatsapp_two_factor_enabled"
            r1.putBoolean(r0, r3)
            X.ESP.A06(r2)
            r0 = 955480430(0x38f3796e, float:1.1609761E-4)
            goto L_0x0016
        L_0x00e4:
            r0 = -1748131723(0xffffffff97cda075, float:-1.328832E-24)
            int r4 = X.AnonymousClass7TG.A0D(r6, r0)
            java.lang.Object r3 = r5.A01
            X.ESP r3 = (X.ESP) r3
            android.os.Bundle r2 = r3.A00
            if (r2 == 0) goto L_0x0145
            r1 = 1
            java.lang.String r0 = "is_whatsapp_two_factor_enabled"
            r2.putBoolean(r0, r1)
            X.ESP.A06(r3)
            androidx.fragment.app.FragmentActivity r0 = r3.requireActivity()
            X.C49952FGh.A02(r0, r6)
            r0 = 1020241221(0x3ccfa545, float:0.025347361)
            goto L_0x0016
        L_0x0108:
            r0 = -1440376756(0xffffffffaa25984c, float:-1.4707783E-13)
            int r4 = X.AnonymousClass7TG.A0D(r6, r0)
            java.lang.Object r0 = r5.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            X.C49952FGh.A07(r0, r6)
            r0 = -1050840521(0xffffffffc15d7237, float:-13.8403845)
            goto L_0x0016
        L_0x011b:
            r0 = 260637058(0xf890182, float:1.3509824E-29)
            int r4 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r0 = r5.A01
            android.content.Context r0 = X.DbT.A07(r0)
            X.C49952FGh.A02(r0, r6)
            r0 = 1258616788(0x4b04f7d4, float:8714196.0)
            goto L_0x0016
        L_0x0130:
            r0 = 1744577616(0x67fc2450, float:2.3814124E24)
            int r4 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r0 = r5.A01
            android.content.Context r0 = X.DbT.A08(r0)
            X.C49952FGh.A01(r0)
            r0 = 1782810607(0x6a4387ef, float:5.9095616E25)
            goto L_0x0016
        L_0x0145:
            java.lang.String r0 = "twoFacResponseBundle"
        L_0x0147:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48001EQk.onFail(X.4dm):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x01c8, code lost:
        r3 = "twoFacResponseBundle";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x01ef, code lost:
        X.0qQ.A0F(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x01f6, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x03ad, code lost:
        X.AnonymousClass0fD.A0A(r0, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x03b0, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r13) {
        /*
            r12 = this;
            int r0 = r12.A00
            switch(r0) {
                case 0: goto L_0x0352;
                case 1: goto L_0x02b2;
                case 2: goto L_0x01cb;
                case 3: goto L_0x019e;
                case 4: goto L_0x012f;
                case 5: goto L_0x00f4;
                case 6: goto L_0x0292;
                case 7: goto L_0x00c7;
                case 8: goto L_0x025f;
                case 9: goto L_0x009b;
                case 10: goto L_0x0051;
                case 11: goto L_0x0239;
                default: goto L_0x0005;
            }
        L_0x0005:
            r0 = -316953594(0xffffffffed1bac06, float:-3.0111338E27)
            int r5 = X.AnonymousClass0fD.A03(r0)
            X.CGF r13 = (X.CGF) r13
            r0 = -441517617(0xffffffffe5aef9cf, float:-1.0328749E23)
            int r6 = X.AnonymousClass7TG.A0D(r13, r0)
            java.lang.Object r4 = r12.A01
            X.E3A r4 = (X.E3A) r4
            java.lang.Integer r0 = r13.A00()
            X.E3A.A03(r4, r0)
            X.F3j r2 = X.DbW.A0X()
            com.instagram.common.session.UserSession r1 = r4.A04
            java.lang.String r3 = "userSession"
            if (r1 == 0) goto L_0x01ef
            java.lang.String r0 = "two_fac_trusted_notification"
            X.E75 r2 = r2.A00(r1, r0)
            androidx.fragment.app.FragmentActivity r1 = r4.requireActivity()
            com.instagram.common.session.UserSession r0 = r4.A04
            if (r0 == 0) goto L_0x01ef
            X.6Yo r1 = X.DbV.A0M(r2, r1, r0)
            r0 = 168(0xa8, float:2.35E-43)
            r1.A0F(r4, r0)
            r1.A04()
            r0 = -444065252(0xffffffffe5881a1c, float:-8.034043E22)
            X.AnonymousClass0fD.A0A(r0, r6)
            r0 = -2044602024(0xffffffff8621d958, float:-3.0440413E-35)
            X.AnonymousClass0fD.A0A(r0, r5)
            return
        L_0x0051:
            r0 = 566859880(0x21c99868, float:1.3660631E-18)
            int r4 = X.AnonymousClass0fD.A03(r0)
            X.CGF r13 = (X.CGF) r13
            r0 = 392442809(0x176433b9, float:7.3736056E-25)
            int r5 = X.AnonymousClass7TG.A0D(r13, r0)
            java.lang.Integer r1 = r13.A00()
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            java.lang.Object r3 = r12.A01
            X.E3A r3 = (X.E3A) r3
            if (r1 == r0) goto L_0x007d
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            X.E3A.A03(r3, r0)
        L_0x0072:
            r0 = -1214863577(0xffffffffb796a727, float:-1.795923E-5)
            X.AnonymousClass0fD.A0A(r0, r5)
            r0 = -1745650099(0xffffffff97f37e4d, float:-1.573539E-24)
            goto L_0x03ad
        L_0x007d:
            android.content.Context r2 = r3.requireContext()
            java.lang.Integer r0 = r3.A05
            if (r0 != 0) goto L_0x0089
            java.lang.String r3 = "loginNotificationUserAction"
            goto L_0x01ef
        L_0x0089:
            int r1 = r0.intValue()
            r0 = 1
            if (r1 == r0) goto L_0x0097
            r0 = 2
            if (r1 != r0) goto L_0x0072
            X.E3A.A02(r2, r3)
            goto L_0x0072
        L_0x0097:
            X.E3A.A01(r2, r3)
            goto L_0x0072
        L_0x009b:
            r0 = 1860956107(0x6eebefcb, float:3.6509435E28)
            int r4 = X.AnonymousClass0fD.A03(r0)
            r0 = 210150426(0xc86a41a, float:2.0744734E-31)
            int r3 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r2 = r12.A01
            X.E0z r2 = (X.C47407E0z) r2
            com.instagram.login.twofac.model.TrustedDevice r1 = r2.A00
            if (r1 != 0) goto L_0x00b5
            java.lang.String r3 = "trustedDevice"
            goto L_0x01ef
        L_0x00b5:
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            r1.A03 = r0
            X.DbZ.A17(r2)
            r0 = -598128457(0xffffffffdc5948b7, float:-2.44640083E17)
            X.AnonymousClass0fD.A0A(r0, r3)
            r0 = 2144676297(0x7fd529c9, float:NaN)
            goto L_0x03ad
        L_0x00c7:
            r0 = -1262708164(0xffffffffb4bc9a3c, float:-3.512995E-7)
            int r4 = X.AnonymousClass0fD.A03(r0)
            X.DvV r13 = (X.DvV) r13
            r0 = -454262833(0xffffffffe4ec7fcf, float:-3.490113E22)
            int r5 = X.AnonymousClass7TG.A0D(r13, r0)
            java.lang.Object r3 = r12.A01
            X.ES6 r3 = (X.ES6) r3
            android.os.Bundle r2 = r3.A00
            if (r2 == 0) goto L_0x01c8
            boolean r1 = r13.A00
            java.lang.String r0 = "is_trusted_notifications_enabled"
            r2.putBoolean(r0, r1)
            X.ES6.A06(r3)
            r0 = -129318559(0xfffffffff84ac161, float:-1.6449471E34)
            X.AnonymousClass0fD.A0A(r0, r5)
            r0 = 1548182484(0x5c4763d4, float:2.2449313E17)
            goto L_0x03ad
        L_0x00f4:
            r0 = -1104832813(0xffffffffbe2596d3, float:-0.16170816)
            int r4 = X.AnonymousClass0fD.A03(r0)
            r0 = -988159858(0xffffffffc519e08e, float:-2462.0347)
            int r6 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r5 = r12.A01
            X.ESD r5 = (X.ESD) r5
            android.os.Bundle r1 = r5.A00
            if (r1 == 0) goto L_0x01c8
            java.lang.String r0 = "is_totp_two_factor_enabled"
            r3 = 0
            r1.putBoolean(r0, r3)
            X.F3Y r2 = X.FFR.A00()
            r1 = 1
            java.lang.Integer r0 = X.AnonymousClass05K.A0j
            X.E2h r2 = r2.A02(r0, r1, r3)
            androidx.fragment.app.FragmentActivity r1 = r5.requireActivity()
            X.0eM r0 = r5.A02
            X.Dbc.A0S(r2, r1, r0)
            r0 = -434433974(0xffffffffe61b104a, float:-1.8306682E23)
            X.AnonymousClass0fD.A0A(r0, r6)
            r0 = -660152870(0xffffffffd8a6ddda, float:-1.4677742E15)
            goto L_0x03ad
        L_0x012f:
            r0 = 299545765(0x11dab4a5, float:3.4505666E-28)
            int r4 = X.AnonymousClass0fD.A03(r0)
            X.Dvg r13 = (X.C47346Dvg) r13
            r0 = 1077762395(0x403d595b, float:2.9585788)
            int r3 = X.AnonymousClass0fD.A03(r0)
            r11 = 0
            X.0qQ.A0B(r13, r11)
            boolean r0 = r13.A01
            if (r0 == 0) goto L_0x0177
            X.F3Y r6 = X.FFR.A00()
            java.lang.Object r5 = r12.A01
            X.ESP r5 = (X.ESP) r5
            android.os.Bundle r7 = r5.requireArguments()
            android.os.Bundle r0 = r5.A00
            if (r0 == 0) goto L_0x01c8
            java.lang.String r10 = X.Dbb.A0Z(r0)
            java.lang.Integer r8 = X.AnonymousClass05K.A0C
            java.lang.Integer r9 = X.AnonymousClass05K.A0Y
            X.E2r r2 = r6.A01(r7, r8, r9, r10, r11)
            androidx.fragment.app.FragmentActivity r1 = r5.requireActivity()
            X.0eM r0 = r5.A05
            X.Dbc.A0S(r2, r1, r0)
        L_0x016c:
            r0 = -1237848752(0xffffffffb637ed50, float:-2.740726E-6)
            X.AnonymousClass0fD.A0A(r0, r3)
            r0 = -1595729529(0xffffffffa0e31987, float:-3.8472188E-19)
            goto L_0x03ad
        L_0x0177:
            java.lang.Object r5 = r12.A01
            X.ESP r5 = (X.ESP) r5
            android.content.Context r2 = r5.requireContext()
            android.content.Context r1 = r5.requireContext()
            r0 = 2131961740(0x7f13278c, float:1.9560185E38)
            java.lang.String r1 = r1.getString(r0)
            java.lang.String r0 = r13.getErrorMessage()
            X.C49952FGh.A06(r2, r0, r1)
            android.os.Bundle r1 = r5.A00
            if (r1 == 0) goto L_0x01c8
            java.lang.String r0 = "is_whatsapp_two_factor_enabled"
            r1.putBoolean(r0, r11)
            X.ESP.A06(r5)
            goto L_0x016c
        L_0x019e:
            r0 = -165294507(0xfffffffff625ce55, float:-8.407362E32)
            int r4 = X.AnonymousClass0fD.A03(r0)
            r0 = -1898323679(0xffffffff8ed9e121, float:-5.371142E-30)
            int r5 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r3 = r12.A01
            X.ESP r3 = (X.ESP) r3
            android.os.Bundle r2 = r3.A00
            if (r2 == 0) goto L_0x01c8
            r1 = 0
            java.lang.String r0 = "is_whatsapp_two_factor_enabled"
            r2.putBoolean(r0, r1)
            X.ESP.A06(r3)
            r0 = -1415831966(0xffffffffab9c1e62, float:-1.10929E-12)
            X.AnonymousClass0fD.A0A(r0, r5)
            r0 = 693578553(0x29572b39, float:4.777708E-14)
            goto L_0x03ad
        L_0x01c8:
            java.lang.String r3 = "twoFacResponseBundle"
            goto L_0x01ef
        L_0x01cb:
            r0 = 865744120(0x339a34f8, float:7.180819E-8)
            int r4 = X.AnonymousClass0fD.A03(r0)
            X.DwU r13 = (X.DwU) r13
            r0 = -1310643695(0xffffffffb1e12a11, float:-6.5531442E-9)
            int r5 = X.AnonymousClass7TG.A0D(r13, r0)
            java.lang.Object r6 = r12.A01
            X.E4T r6 = (X.E4T) r6
            android.os.Bundle r0 = r13.A00()
            r6.A00 = r0
            boolean r0 = r6.A04
            if (r0 == 0) goto L_0x01f7
            android.widget.TextView r3 = r6.A02
            if (r3 != 0) goto L_0x0215
            java.lang.String r3 = "backupCodesTextView"
        L_0x01ef:
            X.0qQ.A0F(r3)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x01f7:
            boolean r0 = r6.A05
            if (r0 == 0) goto L_0x022e
            boolean r0 = r13.A0B
            r3 = r0 ^ 1
            android.view.View r2 = r6.A01
            if (r2 != 0) goto L_0x0206
            java.lang.String r3 = "divider"
            goto L_0x01ef
        L_0x0206:
            r1 = 0
            int r0 = X.DbW.A01(r3)
            r2.setVisibility(r0)
            com.instagram.ui.widget.progressbutton.ProgressButton r0 = r6.A03
            if (r0 != 0) goto L_0x0227
            java.lang.String r3 = "nextButton"
            goto L_0x01ef
        L_0x0215:
            java.util.ArrayList r2 = r13.A04
            if (r2 == 0) goto L_0x0224
            java.lang.String r1 = "\n"
            r0 = 0
            java.lang.String r0 = X.DbT.A0z(r1, r2, r0)
        L_0x0220:
            r3.setText(r0)
            goto L_0x022e
        L_0x0224:
            java.lang.String r0 = ""
            goto L_0x0220
        L_0x0227:
            if (r3 != 0) goto L_0x022b
            r1 = 8
        L_0x022b:
            r0.setVisibility(r1)
        L_0x022e:
            r0 = 542749596(0x2059b39c, float:1.8440043E-19)
            X.AnonymousClass0fD.A0A(r0, r5)
            r0 = -1710412475(0xffffffff9a0d2d45, float:-2.9194685E-23)
            goto L_0x03ad
        L_0x0239:
            r0 = 846360265(0x32726ec9, float:1.4111444E-8)
            int r4 = X.AnonymousClass0fD.A03(r0)
            X.CGF r13 = (X.CGF) r13
            r0 = -1712530282(0xffffffff99ecdc96, float:-2.4490922E-23)
            int r2 = X.AnonymousClass7TG.A0D(r13, r0)
            java.lang.Object r1 = r12.A01
            X.E3A r1 = (X.E3A) r1
            java.lang.Integer r0 = r13.A00()
            X.E3A.A03(r1, r0)
            r0 = -1684710975(0xffffffff9b9559c1, float:-2.4707984E-22)
            X.AnonymousClass0fD.A0A(r0, r2)
            r0 = 1125177686(0x4310d956, float:144.84897)
            goto L_0x03ad
        L_0x025f:
            r0 = 1460078330(0x570706fa, float:1.48464034E14)
            int r4 = X.AnonymousClass0fD.A03(r0)
            r0 = -340337762(0xffffffffebb6db9e, float:-4.4212322E26)
            int r5 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r3 = r12.A01
            X.ES3 r3 = (X.ES3) r3
            android.os.Bundle r1 = r3.requireArguments()
            java.lang.String r0 = "is_two_factor_enabled"
            r2 = 0
            r1.putBoolean(r0, r2)
            android.os.Bundle r1 = r3.requireArguments()
            java.lang.String r0 = "is_whatsapp_two_factor_enabled"
            r1.putBoolean(r0, r2)
            X.ES3.A06(r3)
            r0 = -346128278(0xffffffffeb5e806a, float:-2.6898795E26)
            X.AnonymousClass0fD.A0A(r0, r5)
            r0 = 97670843(0x5d256bb, float:1.9780165E-35)
            goto L_0x03ad
        L_0x0292:
            r0 = -64949633(0xfffffffffc20f27f, float:-3.3427436E36)
            int r4 = X.AnonymousClass0fD.A03(r0)
            r0 = 702148862(0x29d9f0fe, float:9.678541E-14)
            int r1 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r0 = r12.A01
            X.ESD r0 = (X.ESD) r0
            r0.A08()
            r0 = 565355613(0x21b2a45d, float:1.2105256E-18)
            X.AnonymousClass0fD.A0A(r0, r1)
            r0 = -1650268912(0xffffffff9da2e510, float:-4.311789E-21)
            goto L_0x03ad
        L_0x02b2:
            r0 = -631329532(0xffffffffda5ead04, float:-1.56694194E16)
            int r4 = X.AnonymousClass0fD.A03(r0)
            X.DwU r13 = (X.DwU) r13
            r0 = 703637788(0x29f0a91c, float:1.0687477E-13)
            int r5 = X.AnonymousClass0fD.A03(r0)
            boolean r0 = r13.A08
            r3 = 0
            if (r0 == 0) goto L_0x02f8
            java.lang.Object r1 = r12.A01
            X.E5C r1 = (X.E5C) r1
            java.lang.String r0 = X.E5C.__redex_internal_original_name
            android.widget.TextView r0 = r1.A01
            r0.setVisibility(r3)
            android.widget.TextView r8 = r1.A01
            r0 = 2131975760(0x7f135e50, float:1.9588621E38)
            java.lang.String r7 = r1.getString(r0)
            r0 = 2131975759(0x7f135e4f, float:1.958862E38)
            java.lang.String r6 = r1.getString(r0)
            androidx.fragment.app.FragmentActivity r1 = r1.getActivity()
            int r0 = X.2Yu.A0D(r1)
            java.lang.Integer r2 = X.DbV.A0n(r1, r0)
            r1 = 15
            X.ESw r0 = new X.ESw
            r0.<init>((java.lang.Integer) r2, (java.lang.Object) r13, (java.lang.Object) r12, (int) r1)
            X.AnonymousClass7AV.A07(r0, r8, r7, r6)
        L_0x02f8:
            java.lang.Object r7 = r12.A01
            X.E5C r7 = (X.E5C) r7
            boolean r1 = r13.A0D
            java.lang.String r0 = X.E5C.__redex_internal_original_name
            if (r1 == 0) goto L_0x0348
            boolean r0 = r13.A0G
            r7.A0C = r0
            android.view.View r0 = r7.A00
            r0.setVisibility(r3)
            com.instagram.common.ui.base.IgTextView r0 = r7.A03
            r0.setVisibility(r3)
            com.instagram.common.ui.base.IgTextView r8 = r7.A03
            r0 = 2131964887(0x7f1333d7, float:1.9566568E38)
            java.lang.String r6 = r7.getString(r0)
            r0 = 2131973864(0x7f1356e8, float:1.9584776E38)
            java.lang.String r3 = r7.getString(r0)
            androidx.fragment.app.FragmentActivity r1 = r7.getActivity()
            int r0 = X.2Yu.A0D(r1)
            java.lang.Integer r2 = X.DbV.A0n(r1, r0)
            r1 = 21
            X.ESx r0 = new X.ESx
            r0.<init>((java.lang.Integer) r2, (java.lang.Object) r12, (int) r1)
            X.AnonymousClass7AV.A07(r0, r8, r6, r3)
            com.instagram.igds.components.switchbutton.IgdsSwitch r1 = r7.A04
            boolean r0 = r7.A0C
            r1.setChecked(r0)
            com.instagram.igds.components.switchbutton.IgdsSwitch r2 = r7.A04
            r1 = 12
            X.FdS r0 = new X.FdS
            r0.<init>(r12, r1)
            r2.A07 = r0
        L_0x0348:
            r0 = 1045613557(0x3e52cbf5, float:0.20585616)
            X.AnonymousClass0fD.A0A(r0, r5)
            r0 = 2025419401(0x78b97289, float:3.0090561E34)
            goto L_0x03ad
        L_0x0352:
            r0 = 892020582(0x352b2766, float:6.3759796E-7)
            int r4 = X.AnonymousClass0fD.A03(r0)
            X.371 r13 = (X.AnonymousClass371) r13
            r0 = -504373446(0xffffffffe1efdf3a, float:-5.5310713E20)
            int r5 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r0 = r13.FH3()
            X.DrA r0 = (X.C47133DrA) r0
            java.lang.Integer r0 = r0.A00
            if (r0 == 0) goto L_0x03a4
            java.lang.Object r0 = r13.FH3()
            X.DrA r0 = (X.C47133DrA) r0
            java.lang.Integer r0 = r0.A00
            int r0 = r0.intValue()
            long r1 = (long) r0
            java.util.Locale r3 = X.AnonymousClass1Q2.A02()
            java.lang.String r0 = "MM/dd/yy"
            java.text.SimpleDateFormat r6 = new java.text.SimpleDateFormat
            r6.<init>(r0, r3)
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS
            long r0 = r3.convert(r1, r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.String r3 = r6.format(r0)
            java.lang.Object r2 = r12.A01
            X.E75 r2 = (X.E75) r2
            com.instagram.igds.components.form.IgFormField r1 = r2.A00
            r0 = 2131957227(0x7f1315eb, float:1.9551032E38)
            java.lang.String r0 = X.DbV.A0z(r2, r3, r0)
            r1.setLabelText(r0)
        L_0x03a4:
            r0 = 1171616612(0x45d57364, float:6830.424)
            X.AnonymousClass0fD.A0A(r0, r5)
            r0 = 278048598(0x1092af56, float:5.7856994E-29)
        L_0x03ad:
            X.AnonymousClass0fD.A0A(r0, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48001EQk.onSuccess(java.lang.Object):void");
    }
}
