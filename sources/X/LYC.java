package X;

import android.view.View;
import com.instagram.archive.fragment.ArchiveHomeFragment;

public final class LYC implements View.OnClickListener {
    public final int A00;
    public final Object A01;

    public LYC(ArchiveHomeFragment archiveHomeFragment, int i) {
        this.A00 = i;
        switch (i) {
            case 23:
            case 24:
            case 25:
            case 26:
                this.A01 = archiveHomeFragment;
                return;
            default:
                this.A01 = archiveHomeFragment;
                return;
        }
    }

    public static void A00(View view, int i, Object obj) {
        AnonymousClass0fU.A00(new LYC(obj, i), view);
    }

    public static void A01(2da r1, Object obj, int i, int i2) {
        r1.AA9(new LYC(obj, i), i2);
    }

    /* JADX WARNING: type inference failed for: r0v296, types: [X.KH6, X.11X] */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x04ca, code lost:
        X.W38.A06(r2, (java.lang.Integer) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x04ce, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x0594, code lost:
        X.JTO.A1K();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x059b, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x09a1, code lost:
        r4.A0E(r2);
        r4.A04();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x09a7, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:323:0x0cda, code lost:
        X.AnonymousClass0fD.A0C(r0, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:324:0x0cdd, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:402:0x1021, code lost:
        X.AnonymousClass0fD.A0C(r0, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:403:0x1024, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:430:0x1139, code lost:
        X.AnonymousClass0fD.A0C(r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:431:0x113c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:442:0x1194, code lost:
        X.AnonymousClass0fD.A0C(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:443:0x1197, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x027d, code lost:
        if (r1.equals(r0) == false) goto L_0x0260;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r31) {
        /*
            r30 = this;
            r1 = r30
            int r0 = r1.A00
            switch(r0) {
                case 0: goto L_0x10bb;
                case 1: goto L_0x103b;
                case 2: goto L_0x0fc3;
                case 3: goto L_0x0f2a;
                case 4: goto L_0x0ea0;
                case 5: goto L_0x0e22;
                case 6: goto L_0x0dcf;
                case 7: goto L_0x0d4d;
                case 8: goto L_0x0cf4;
                case 9: goto L_0x0c7c;
                case 10: goto L_0x0c2e;
                case 11: goto L_0x0ba8;
                case 12: goto L_0x0b09;
                case 13: goto L_0x1183;
                case 14: goto L_0x0ad4;
                case 15: goto L_0x0ac3;
                case 16: goto L_0x0a40;
                case 17: goto L_0x0a2b;
                case 18: goto L_0x0a16;
                case 19: goto L_0x09eb;
                case 20: goto L_0x09c5;
                case 21: goto L_0x09a8;
                case 22: goto L_0x0069;
                case 23: goto L_0x098f;
                case 24: goto L_0x096f;
                case 25: goto L_0x091a;
                case 26: goto L_0x098f;
                case 27: goto L_0x08c5;
                case 28: goto L_0x0894;
                case 29: goto L_0x081e;
                case 30: goto L_0x1146;
                case 31: goto L_0x07ff;
                case 32: goto L_0x07e2;
                case 33: goto L_0x07da;
                case 34: goto L_0x0023;
                case 35: goto L_0x07d2;
                case 36: goto L_0x0693;
                case 37: goto L_0x0667;
                case 38: goto L_0x05f9;
                case 39: goto L_0x05a6;
                case 40: goto L_0x059c;
                case 41: goto L_0x0550;
                case 42: goto L_0x050c;
                case 43: goto L_0x04d3;
                case 44: goto L_0x0008;
                case 45: goto L_0x04b4;
                case 46: goto L_0x049c;
                case 47: goto L_0x0485;
                case 48: goto L_0x044d;
                case 49: goto L_0x0432;
                case 50: goto L_0x0405;
                case 51: goto L_0x03ea;
                case 52: goto L_0x03d9;
                case 53: goto L_0x03c2;
                case 54: goto L_0x03ab;
                case 55: goto L_0x0394;
                case 56: goto L_0x037d;
                case 57: goto L_0x0366;
                case 58: goto L_0x032e;
                case 59: goto L_0x02f6;
                case 60: goto L_0x02e5;
                case 61: goto L_0x02d4;
                case 62: goto L_0x02c0;
                case 63: goto L_0x02ad;
                case 64: goto L_0x0294;
                case 65: goto L_0x0244;
                case 66: goto L_0x01b4;
                case 67: goto L_0x0197;
                case 68: goto L_0x0150;
                case 69: goto L_0x0118;
                case 70: goto L_0x00e5;
                default: goto L_0x0007;
            }
        L_0x0007:
            return
        L_0x0008:
            java.lang.Object r1 = r1.A01
            X.KB1 r1 = (X.KB1) r1
            boolean r0 = X.KB1.A03(r1)
            if (r0 == 0) goto L_0x0007
            X.Lnj r0 = r1.A03
            r0.getClass()
            androidx.recyclerview.widget.GridLayoutManager r0 = r0.A0H
            boolean r0 = X.C2808154f.A03(r0)
            if (r0 == 0) goto L_0x1198
            X.KB1.A02(r1)
            return
        L_0x0023:
            java.lang.Object r3 = r1.A01
            com.instagram.archive.fragment.InlineAddHighlightFragment r3 = (com.instagram.archive.fragment.InlineAddHighlightFragment) r3
            java.lang.Integer r1 = r3.A01
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r1 != r0) goto L_0x005b
            X.MUz r0 = r3.mDelegate
            if (r0 == 0) goto L_0x0007
            r1 = 0
            android.widget.TextView r0 = r3.mActionButton
            if (r0 == 0) goto L_0x0039
            r0.setEnabled(r1)
        L_0x0039:
            X.MUz r2 = r3.mDelegate
            android.widget.EditText r0 = r3.mCreateHighlightEditText
            if (r0 == 0) goto L_0x0058
            java.lang.String r0 = X.AnonymousClass7TF.A0f(r0)
            java.lang.String r1 = r0.trim()
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x0054
            r0 = 2131963446(0x7f132e36, float:1.9563646E38)
            java.lang.String r1 = r3.getString(r0)
        L_0x0054:
            r2.D6m(r3, r3, r1)
            return
        L_0x0058:
            java.lang.String r1 = ""
            goto L_0x0054
        L_0x005b:
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r1 != r0) goto L_0x0007
            android.content.Context r0 = r3.requireContext()
            android.app.Activity r0 = (android.app.Activity) r0
            r0.onBackPressed()
            return
        L_0x0069:
            java.lang.Object r2 = r1.A01
            X.KB0 r2 = (X.KB0) r2
            android.widget.EditText r0 = r2.A01
            r0.getClass()
            android.view.inputmethod.InputMethodManager r1 = r2.A00
            r1.getClass()
            android.widget.EditText r0 = r2.A01
            android.os.IBinder r0 = r0.getWindowToken()
            r3 = 0
            r1.hideSoftInputFromWindow(r0, r3)
            X.Kzd r0 = r2.A0B
            com.instagram.archive.fragment.HighlightsMetadataFragment r7 = r0.A00
            com.instagram.common.session.UserSession r0 = r7.getSession()
            X.0qQ.A0B(r0, r3)
            com.instagram.archive.fragment.HighlightsProfileVisibilityFragment r6 = new com.instagram.archive.fragment.HighlightsProfileVisibilityFragment
            r6.<init>()
            android.os.Bundle r1 = X.JTP.A0F(r0)
            java.lang.String r0 = "HIDE_FROM_PROFILE_GRID"
            r1.putBoolean(r0, r3)
            r6.setArguments(r1)
            com.instagram.common.session.UserSession r0 = r7.getSession()
            X.7Pr r2 = X.DbS.A0W(r0)
            androidx.fragment.app.FragmentActivity r1 = r7.requireActivity()
            r0 = 2131956866(0x7f131482, float:1.95503E38)
            X.DbZ.A0z(r1, r2, r0)
            X.DbS.A1S(r2, r3)
            X.7Pu r5 = r2.A00()
            X.DbU.A1I(r7, r6, r5)
            boolean r0 = r6.isAdded()
            if (r0 == 0) goto L_0x0007
            X.0eM r4 = r6.A00
            java.lang.Object r0 = r4.getValue()
            X.Jfz r0 = (X.C60118Jfz) r0
            X.05G r2 = r0.A01
            r3 = 0
            r1 = 6
            X.MG9 r0 = new X.MG9
            r0.<init>(r5, r3, r1)
            X.JTS.A11(r6, r0, r2)
            java.lang.Object r0 = r4.getValue()
            X.Jfz r0 = (X.C60118Jfz) r0
            X.05G r2 = r0.A00
            r1 = 7
            X.MG9 r0 = new X.MG9
            r0.<init>(r7, r3, r1)
            X.JTS.A11(r6, r0, r2)
            return
        L_0x00e5:
            r0 = 655846302(0x27176b9e, float:2.10138E-15)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r1.A01
            X.K8W r4 = (X.K8W) r4
            com.instagram.brandedcontent.disclosure.BrandedContentDisclosureViewModel r3 = X.K8W.A02(r4)
            java.util.List r1 = r3.A06
            java.util.List r0 = r3.A07
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0114
            com.instagram.api.schemas.BrandedContentGatingInfo r1 = r3.A02
            com.instagram.api.schemas.BrandedContentGatingInfo r0 = r3.A01
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0114
            boolean r0 = r4.A01
            if (r0 != 0) goto L_0x0114
            X.K8W.A03(r4)
        L_0x010f:
            r0 = -184046520(0xfffffffff507ac48, float:-1.7198593E32)
            goto L_0x1139
        L_0x0114:
            X.K8W.A04(r4)
            goto L_0x010f
        L_0x0118:
            r0 = 1751223355(0x68618c3b, float:4.260477E24)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.K8Z r0 = (X.K8Z) r0
            X.0eM r0 = r0.A05
            java.lang.Object r7 = r0.getValue()
            X.JjM r7 = (X.C60318JjM) r7
            com.instagram.common.session.UserSession r6 = r7.A04
            X.0iw r5 = r7.A03
            java.util.Map r0 = r7.A08
            java.util.Collection r4 = r0.values()
            X.MNe r1 = X.C66321MNe.A00
            r3 = 0
            java.lang.String r0 = ", "
            java.lang.String r0 = X.DbT.A0z(r0, r4, r1)
            X.C64186LSt.A02(r5, r6, r0)
            X.C60318JjM.A01(r3, r7)
            java.lang.Integer r1 = X.AnonymousClass05K.A0E
            java.lang.String r0 = r6.A06
            X.JVF.A04(r5, r6, r1, r0, r3)
            r0 = -1298662862(0xffffffffb297fa32, float:-1.769249E-8)
            goto L_0x1139
        L_0x0150:
            r0 = 1926544800(0x72d4bda0, float:8.427528E30)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A01
            X.K8Z r3 = (X.K8Z) r3
            java.lang.String r2 = r3.A01
            int r1 = r2.hashCode()
            switch(r1) {
                case 3138974: goto L_0x0187;
                case 3230752: goto L_0x017b;
                case 3322092: goto L_0x016f;
                case 3496474: goto L_0x016c;
                case 109770997: goto L_0x0169;
                default: goto L_0x0164;
            }
        L_0x0164:
            r1 = -1391178625(0xffffffffad144c7f, float:-8.4298115E-12)
            goto L_0x1194
        L_0x0169:
            java.lang.String r1 = "story"
            goto L_0x017d
        L_0x016c:
            java.lang.String r1 = "reel"
            goto L_0x017d
        L_0x016f:
            java.lang.String r1 = "live"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0164
            X.DbT.A1K(r3)
            goto L_0x0164
        L_0x017b:
            java.lang.String r1 = "igtv"
        L_0x017d:
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0164
            X.DbT.A1I(r3)
            goto L_0x0164
        L_0x0187:
            java.lang.String r1 = "feed"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0164
            com.instagram.common.session.UserSession r1 = r3.A06()
            X.C59888JbD.A00(r1)
            goto L_0x0164
        L_0x0197:
            r0 = 459405622(0x1b61f936, float:1.8692088E-22)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.K88 r0 = (X.K88) r0
            androidx.fragment.app.FragmentActivity r1 = r0.requireActivity()
            X.0eM r0 = r0.A04
            X.6Yo r0 = X.DbX.A0N(r1, r0)
            r0.A06()
            r0 = -160836156(0xfffffffff669d5c4, float:-1.1856844E33)
            goto L_0x1139
        L_0x01b4:
            r0 = 1990754361(0x76a88039, float:1.7088018E33)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r1.A01
            X.K8a r5 = (X.C61446K8a) r5
            com.instagram.common.session.UserSession r6 = r5.A06()
            java.util.List r3 = r5.A04
            X.MNc r1 = X.C66319MNc.A00
            r4 = 0
            java.lang.String r0 = ", "
            java.lang.String r0 = X.DbT.A0z(r0, r3, r1)
            X.C64186LSt.A02(r5, r6, r0)
            java.util.List r0 = r5.A04
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x01ff
            X.8ab r3 = X.DbW.A0U(r5)
            r0 = 2131952277(0x7f130295, float:1.9540992E38)
            r3.A09(r0)
            r0 = 2131952276(0x7f130294, float:1.954099E38)
            r3.A08(r0)
            r1 = 2131956706(0x7f1313e2, float:1.9549975E38)
            r0 = 12
            X.LV3.A01(r3, r5, r0, r1)
            r0 = 2131956164(0x7f1311c4, float:1.9548876E38)
            r3.A0G(r4, r0)
            X.DbT.A1V(r3)
            r0 = -767808007(0xffffffffd23c2df9, float:-2.02056286E11)
            goto L_0x1139
        L_0x01ff:
            X.MTP r0 = r5.A01
            r1 = 1
            if (r0 == 0) goto L_0x022d
            boolean r0 = r0.COO()
            if (r0 != r1) goto L_0x022d
            java.util.List r0 = r5.A04
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x022d
            X.8ab r1 = X.DbW.A0U(r5)
            r0 = 2131954106(0x7f1309ba, float:1.9544702E38)
            r1.A09(r0)
            r0 = 2131954105(0x7f1309b9, float:1.95447E38)
            r1.A08(r0)
            r0 = 2131956164(0x7f1311c4, float:1.9548876E38)
            X.Dba.A0t(r4, r1, r0)
            r0 = 1452821542(0x56984c26, float:8.3726411E13)
            goto L_0x1139
        L_0x022d:
            X.C61446K8a.A01(r5)
            com.instagram.common.session.UserSession r3 = r5.A06()
            java.lang.Integer r1 = X.AnonymousClass05K.A0E
            com.instagram.common.session.UserSession r0 = r5.A06()
            java.lang.String r0 = r0.A06
            X.JVF.A04(r5, r3, r1, r0, r4)
            r0 = -378165278(0xffffffffe975a7e2, float:-1.8561227E25)
            goto L_0x1139
        L_0x0244:
            r0 = -524223743(0xffffffffe0c0fb01, float:-1.11245675E20)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A01
            X.K8a r3 = (X.C61446K8a) r3
            boolean r0 = r3.A07
            if (r0 != 0) goto L_0x0290
            boolean r0 = r3.A09
            if (r0 != 0) goto L_0x0290
            java.lang.String r1 = r3.A03
            int r0 = r1.hashCode()
            switch(r0) {
                case 3138974: goto L_0x0280;
                case 3230752: goto L_0x0277;
                case 3322092: goto L_0x026b;
                case 3496474: goto L_0x0268;
                case 109770997: goto L_0x0265;
                default: goto L_0x0260;
            }
        L_0x0260:
            r0 = 566990410(0x21cb964a, float:1.3795596E-18)
            goto L_0x1139
        L_0x0265:
            java.lang.String r0 = "story"
            goto L_0x0279
        L_0x0268:
            java.lang.String r0 = "reel"
            goto L_0x0279
        L_0x026b:
            java.lang.String r0 = "live"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0260
            X.DbT.A1K(r3)
            goto L_0x0260
        L_0x0277:
            java.lang.String r0 = "igtv"
        L_0x0279:
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0290
            goto L_0x0260
        L_0x0280:
            java.lang.String r0 = "feed"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0260
            com.instagram.common.session.UserSession r0 = r3.A06()
            X.C59888JbD.A00(r0)
            goto L_0x0260
        L_0x0290:
            X.DbT.A1I(r3)
            goto L_0x0260
        L_0x0294:
            r0 = -1889497615(0xffffffff8f608df1, float:-1.10713896E-29)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A01
            X.2YL r3 = (X.2YL) r3
            X.6oS r1 = X.C318116oQ.A00(r3)
            r0 = 11
            X.MH8.A03(r3, r1, r0)
            r0 = 1195173354(0x473ce5ea, float:48357.914)
            goto L_0x1139
        L_0x02ad:
            r0 = -851511922(0xffffffffcd3ef58e, float:-2.00235232E8)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.K87 r0 = (X.K87) r0
            r0.onBackPressed()
            r0 = -294227989(0xffffffffee766feb, float:-1.9067153E28)
            goto L_0x1139
        L_0x02c0:
            r0 = 1166766308(0x458b70e4, float:4462.1113)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.K4g r1 = (X.C61364K4g) r1
            r0 = 0
            r1.A0M(r0)
            r0 = 52460397(0x3207b6d, float:4.716146E-37)
            goto L_0x1139
        L_0x02d4:
            r0 = 854966643(0x32f5c173, float:2.8609724E-8)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.Dba.A1Q(r0)
            r0 = -908540873(0xffffffffc9d8c437, float:-1775750.9)
            goto L_0x1139
        L_0x02e5:
            r0 = -458868062(0xffffffffe4a63aa2, float:-2.4531076E22)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.Dba.A1Q(r0)
            r0 = 1844163665(0x6debb451, float:9.118371E27)
            goto L_0x1139
        L_0x02f6:
            r0 = -1591330962(0xffffffffa126376e, float:-5.631635E-19)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r1.A01
            X.K7m r5 = (X.C61437K7m) r5
            r1 = 1
            r5.A0H = r1
            X.0eM r1 = r5.A0L
            java.lang.Object r4 = r1.getValue()
            X.JgS r4 = (X.C60147JgS) r4
            X.0wc r2 = r4.A00
            java.lang.String r1 = "ig_exit_nux_see_avatar_stickers_event"
            X.0Aj r2 = X.AnonymousClass7TE.A0e(r2, r1)
            r1 = 218(0xda, float:3.05E-43)
            X.1Ln r3 = X.C51965G9l.A0U(r2, r1)
            java.lang.String r2 = r4.A02
            java.lang.String r1 = "entry_point"
            r3.A0R(r1, r2)
            r3.Cgf()
            X.7Pu r1 = r5.A0E
            X.DbW.A1K(r1)
            r1 = 484253145(0x1cdd1dd9, float:1.4632269E-21)
            goto L_0x1194
        L_0x032e:
            r0 = -768394930(0xffffffffd233394e, float:-1.9244014E11)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r1.A01
            X.JgC r4 = (X.C60131JgC) r4
            X.05G r3 = r4.A01
            java.lang.Object r1 = r3.getValue()
            X.L3N r1 = (X.L3N) r1
            java.lang.Object r0 = r3.getValue()
            X.L3N r0 = (X.L3N) r0
            boolean r0 = r0.A00
            r0 = r0 ^ 1
            r1.A00 = r0
            java.lang.Object r0 = r3.getValue()
            X.L3N r0 = (X.L3N) r0
            boolean r0 = r0.A00
            X.05G r1 = r4.A00
            if (r0 == 0) goto L_0x0363
            X.K36 r0 = X.K36.A00
        L_0x035b:
            r1.Epw(r0)
            r0 = -885889323(0xffffffffcb3266d5, float:-1.1691733E7)
            goto L_0x1139
        L_0x0363:
            X.K35 r0 = X.K35.A00
            goto L_0x035b
        L_0x0366:
            r0 = -505333024(0xffffffffe1e13ae0, float:-5.1934498E20)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.JgC r0 = (X.C60131JgC) r0
            X.05G r1 = r0.A00
            X.K34 r0 = X.K34.A00
            r1.Epw(r0)
            r0 = 429248974(0x1995d1ce, float:1.5490978E-23)
            goto L_0x1139
        L_0x037d:
            r0 = 451821432(0x1aee3f78, float:9.853703E-23)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.JgC r0 = (X.C60131JgC) r0
            X.05G r1 = r0.A00
            X.K32 r0 = X.K32.A00
            r1.Epw(r0)
            r0 = -1573068000(0xffffffffa23ce320, float:-2.559899E-18)
            goto L_0x1139
        L_0x0394:
            r0 = -783661157(0xffffffffd14a479b, float:-5.4299046E10)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.JgC r0 = (X.C60131JgC) r0
            X.05G r1 = r0.A00
            X.K33 r0 = X.K33.A00
            r1.Epw(r0)
            r0 = -1864193832(0xffffffff90e2a8d8, float:-8.940143E-29)
            goto L_0x1139
        L_0x03ab:
            r0 = -446696327(0xffffffffe55ff479, float:-6.609984E22)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.JgC r0 = (X.C60131JgC) r0
            X.05G r1 = r0.A00
            X.K30 r0 = X.K30.A00
            r1.Epw(r0)
            r0 = -1181838792(0xffffffffb98e9238, float:-2.7193292E-4)
            goto L_0x1139
        L_0x03c2:
            r0 = -1033832052(0xffffffffc260f98c, float:-56.2437)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.JgC r0 = (X.C60131JgC) r0
            X.05G r1 = r0.A00
            X.K31 r0 = X.K31.A00
            r1.Epw(r0)
            r0 = 565675987(0x21b787d3, float:1.2436515E-18)
            goto L_0x1139
        L_0x03d9:
            r0 = 13947324(0xd4d1bc, float:1.9544364E-38)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.Dba.A1Q(r0)
            r0 = -465714688(0xffffffffe43dc200, float:-1.4001655E22)
            goto L_0x1139
        L_0x03ea:
            r0 = -1062184754(0xffffffffc0b058ce, float:-5.5108404)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.K4W r0 = (X.K4W) r0
            X.0eM r0 = r0.A07
            java.lang.Object r0 = r0.getValue()
            X.Jhm r0 = (X.C60229Jhm) r0
            r0.A00()
            r0 = 2112726630(0x7deda666, float:3.9486378E37)
            goto L_0x1139
        L_0x0405:
            r0 = 1119832561(0x42bf49f1, float:95.64442)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.K4W r1 = (X.K4W) r1
            X.LZb r4 = r1.A01
            if (r4 == 0) goto L_0x042d
            X.0eM r1 = r1.A06
            r1.getValue()
            org.json.JSONObject r3 = X.DbS.A11()
            java.lang.String r2 = "event_name"
            java.lang.String r1 = "reload_avatar"
            r3.put(r2, r1)
            java.lang.String r1 = "avatar_fetch_event"
            X.0eP r1 = X.AnonymousClass7TE.A1L(r1, r3)
            r4.A03(r1)
        L_0x042d:
            r1 = 1908537793(0x71c1f9c1, float:1.9210413E30)
            goto L_0x1194
        L_0x0432:
            r0 = -1402778775(0xffffffffac634b69, float:-3.2300501E-12)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.K4W r0 = (X.K4W) r0
            X.0eM r0 = r0.A07
            java.lang.Object r0 = r0.getValue()
            X.Jhm r0 = (X.C60229Jhm) r0
            r0.A00()
            r0 = 1007065191(0x3c069867, float:0.0082150465)
            goto L_0x1139
        L_0x044d:
            java.lang.Object r2 = r1.A01
            X.LWg r2 = (X.LWg) r2
            X.U1A r1 = r2.A06
            r1.getClass()
            r0 = 1
            r1.A09 = r0
            X.U1A.A05(r1)
            int r0 = r2.A00
            int r1 = r0 + 1
            X.KiR[] r0 = X.C62594KiR.values()
            int r0 = r0.length
            int r1 = r1 % r0
            r2.A00 = r1
            X.LWg.A03(r2)
            X.KB6 r0 = r2.A0G
            int r2 = r2.A00
            r0.A02 = r2
            com.instagram.arlink.ui.GridPatternView r1 = r0.A0M
            android.util.SparseArray r0 = X.C62594KiR.A04
            java.lang.Object r0 = r0.get(r2)
            X.KiR r0 = (X.C62594KiR) r0
            if (r0 != 0) goto L_0x047f
            X.KiR r0 = X.C62594KiR.SUNGLASSES
        L_0x047f:
            int r0 = r0.A02
            r1.setSticker(r0)
            return
        L_0x0485:
            java.lang.Object r1 = r1.A01
            X.LWg r1 = (X.LWg) r1
            android.app.Activity r2 = r1.A0D
            java.lang.String r0 = "android.permission.CAMERA"
            boolean r0 = X.1DL.A07(r2, r0)
            if (r0 != 0) goto L_0x0498
            boolean r0 = r1.A0A
            if (r0 == 0) goto L_0x0498
            goto L_0x04ca
        L_0x0498:
            X.LWg.A02(r1)
            return
        L_0x049c:
            r0 = -1647746869(0xffffffff9dc960cb, float:-5.330434E-21)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.Kaf r0 = (X.C62129Kaf) r0
            X.KB6 r1 = r0.A00
            if (r1 == 0) goto L_0x0594
            r0 = 1
            X.KB6.A08(r1, r0)
            r0 = -948876865(0xffffffffc77149bf, float:-61769.746)
            goto L_0x1139
        L_0x04b4:
            java.lang.Object r1 = r1.A01
            X.KB1 r1 = (X.KB1) r1
            android.app.Activity r2 = r1.A0H
            java.lang.String r0 = "android.permission.CAMERA"
            boolean r0 = X.1DL.A07(r2, r0)
            if (r0 != 0) goto L_0x04cf
            boolean r0 = r1.A0A
            if (r0 == 0) goto L_0x04cf
            r0 = 0
            X.0qQ.A0B(r2, r0)
        L_0x04ca:
            r0 = 0
            X.W38.A06(r2, r0)
            return
        L_0x04cf:
            r1.A05()
            return
        L_0x04d3:
            r0 = -109066726(0xfffffffff97fc61a, float:-8.3003355E34)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A01
            X.Lnj r3 = (X.C65121Lnj) r3
            android.app.Activity r1 = r3.A0C
            boolean r0 = X.C2604245p.A03(r1)
            if (r0 == 0) goto L_0x04f8
            X.7kB r0 = r3.A02
            if (r0 == 0) goto L_0x04ed
            r0.A00()
        L_0x04ed:
            r0 = 0
            r3.A02 = r0
            X.C65121Lnj.A00(r3)
        L_0x04f3:
            r0 = -1335203468(0xffffffffb06a6974, float:-8.527856E-10)
            goto L_0x1139
        L_0x04f8:
            boolean r0 = r3.A06
            if (r0 == 0) goto L_0x0501
            r0 = 0
            X.W38.A06(r1, r0)
            goto L_0x04f3
        L_0x0501:
            boolean r0 = r3.A07
            if (r0 != 0) goto L_0x04f3
            r0 = 1
            r3.A07 = r0
            X.C2604245p.A01(r1, r3)
            goto L_0x04f3
        L_0x050c:
            r0 = -337386096(0xffffffffebe3e590, float:-5.5102048E26)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.Kae r0 = (X.C62128Kae) r0
            com.instagram.arlink.fragment.NametagController r5 = r0.A00
            if (r5 == 0) goto L_0x0594
            com.instagram.common.session.UserSession r6 = r5.A0D     // Catch:{ Exception -> 0x0536 }
            X.0iw r4 = r5.A0C     // Catch:{ Exception -> 0x0536 }
            java.lang.String r3 = r6.A06     // Catch:{ Exception -> 0x0536 }
            java.lang.String r1 = r5.A0F     // Catch:{ Exception -> 0x0536 }
            java.lang.String r0 = "download_qr_code"
            X.C22031Xty.A0D(r4, r6, r3, r1, r0)     // Catch:{ Exception -> 0x0536 }
            java.lang.String r4 = r5.A0H     // Catch:{ Exception -> 0x0536 }
            java.lang.Integer r3 = X.AnonymousClass05K.A0B     // Catch:{ Exception -> 0x0536 }
            r1 = 0
            X.Lc4 r0 = new X.Lc4     // Catch:{ Exception -> 0x0536 }
            r0.<init>(r5, r1)     // Catch:{ Exception -> 0x0536 }
            com.instagram.arlink.fragment.NametagController.A02(r0, r5, r3, r4)     // Catch:{ Exception -> 0x0536 }
            goto L_0x054b
        L_0x0536:
            r11 = move-exception
            com.instagram.common.session.UserSession r7 = r5.A0D
            X.0iw r6 = r5.A0C
            java.lang.String r8 = r7.A06
            java.lang.String r9 = r5.A0F
            java.lang.String r10 = "download_qr_code"
            X.C22031Xty.A0H(r6, r7, r8, r9, r10, r11)
            android.content.Context r1 = r5.A07
            java.lang.String r0 = "SAVE_QR_CODE_error"
            X.C59689JTv.A0A(r1, r0)
        L_0x054b:
            r0 = 1341894069(0x4ffbadb5, float:8.4449306E9)
            goto L_0x1139
        L_0x0550:
            r0 = -1876374194(0xffffffff9028cd4e, float:-3.329032E-29)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.Kae r0 = (X.C62128Kae) r0
            com.instagram.arlink.fragment.NametagController r5 = r0.A00
            if (r5 == 0) goto L_0x0594
            com.instagram.common.session.UserSession r6 = r5.A0D     // Catch:{ Exception -> 0x057a }
            X.0iw r4 = r5.A0C     // Catch:{ Exception -> 0x057a }
            java.lang.String r3 = r6.A06     // Catch:{ Exception -> 0x057a }
            java.lang.String r1 = r5.A0F     // Catch:{ Exception -> 0x057a }
            java.lang.String r0 = "download_qr_code"
            X.C22031Xty.A0D(r4, r6, r3, r1, r0)     // Catch:{ Exception -> 0x057a }
            java.lang.String r4 = r5.A0H     // Catch:{ Exception -> 0x057a }
            java.lang.Integer r3 = X.AnonymousClass05K.A0B     // Catch:{ Exception -> 0x057a }
            r1 = 1
            X.Lc4 r0 = new X.Lc4     // Catch:{ Exception -> 0x057a }
            r0.<init>(r5, r1)     // Catch:{ Exception -> 0x057a }
            com.instagram.arlink.fragment.NametagController.A02(r0, r5, r3, r4)     // Catch:{ Exception -> 0x057a }
            goto L_0x058f
        L_0x057a:
            r11 = move-exception
            com.instagram.common.session.UserSession r7 = r5.A0D
            X.0iw r6 = r5.A0C
            java.lang.String r8 = r7.A06
            java.lang.String r9 = r5.A0F
            java.lang.String r10 = "download_qr_code"
            X.C22031Xty.A0H(r6, r7, r8, r9, r10, r11)
            android.content.Context r1 = r5.A07
            java.lang.String r0 = "SAVE_QR_CODE_error"
            X.C59689JTv.A0A(r1, r0)
        L_0x058f:
            r0 = 165811014(0x9e21346, float:5.4425646E-33)
            goto L_0x1139
        L_0x0594:
            X.JTO.A1K()
            X.00P r3 = X.AnonymousClass00P.createAndThrow()
            throw r3
        L_0x059c:
            java.lang.Object r0 = r1.A01
            X.LQl r0 = (X.C64148LQl) r0
            X.2cs r0 = r0.A0B
            r0.A04()
            return
        L_0x05a6:
            r0 = -457797899(0xffffffffe4b68ef5, float:-2.6940868E22)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A01
            X.K65 r3 = (X.K65) r3
            androidx.fragment.app.FragmentActivity r1 = r3.requireActivity()
            X.0eM r0 = r3.A07
            X.6Yo r5 = X.DbX.A0N(r1, r0)
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r0)
            X.0eM r0 = r3.A08
            java.lang.Object r4 = r0.getValue()
            X.Ki3 r4 = (X.Ki3) r4
            if (r4 == 0) goto L_0x05ee
            r0 = 0
            X.0qQ.A0B(r1, r0)
            com.instagram.archive.fragment.HighlightsMetadataFragment r3 = new com.instagram.archive.fragment.HighlightsMetadataFragment
            r3.<init>()
            java.lang.String r1 = r1.A05
            java.lang.String r0 = "IgSessionManager.SESSION_TOKEN_KEY"
            X.0eP r1 = X.AnonymousClass7TE.A1L(r0, r1)
            java.lang.String r0 = "highlight_management_source"
            android.os.Bundle r0 = X.AnonymousClass7TG.A0P(r0, r4, r1)
            r3.setArguments(r0)
            r5.A0D(r3)
            r5.A04()
            r0 = -776091652(0xffffffffd1bdc7fc, float:-1.01888E11)
            goto L_0x1139
        L_0x05ee:
            java.lang.IllegalStateException r3 = X.AnonymousClass7TE.A0y()
            r0 = -99113680(0xfffffffffa17a530, float:-1.968468E35)
            X.AnonymousClass0fD.A0C(r0, r2)
            throw r3
        L_0x05f9:
            r0 = -2139618773(0xffffffff8078022b, float:-1.1021037E-38)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r8 = r1.A01
            com.instagram.archive.fragment.SelectHighlightsCoverFragment r8 = (com.instagram.archive.fragment.SelectHighlightsCoverFragment) r8
            androidx.fragment.app.FragmentActivity r9 = r8.requireActivity()
            boolean r10 = r8.A08
            X.L8l r0 = r8.A03
            if (r0 == 0) goto L_0x0645
            X.LSr r7 = r8.A02
            java.lang.String r6 = r0.A03
            java.lang.String r5 = r0.A04
            com.instagram.common.typedurl.ImageUrl r4 = r0.A02
            com.instagram.common.ui.widget.touchimageview.TouchImageView r0 = r8.mTouchImageView
            android.graphics.Rect r3 = r0.getCropRect()
            r1 = 0
            X.L8l r0 = new X.L8l
            if (r6 == 0) goto L_0x0663
            r0.<init>(r3, r4, r6, r1)
        L_0x0624:
            r7.A00 = r0
            X.LSr r0 = r8.A02
            X.L8l r3 = r0.A00
            r3.getClass()
            r8.A03 = r3
            java.lang.String r0 = r3.A03
            if (r0 != 0) goto L_0x0645
            if (r10 == 0) goto L_0x0645
            com.instagram.common.session.UserSession r0 = r8.A04
            X.Lj6 r1 = new X.Lj6
            r1.<init>(r9, r3, r0)
            X.LNo r0 = X.LNo.A00()
            r0.A00 = r1
            X.1ES.A03(r1)
        L_0x0645:
            boolean r0 = r8.A07
            if (r0 == 0) goto L_0x065f
            X.L8l r0 = r8.A03
            if (r0 != 0) goto L_0x0655
            X.DbX.A1I(r8)
        L_0x0650:
            r0 = 1160172741(0x4526d4c5, float:2669.298)
            goto L_0x1139
        L_0x0655:
            r1 = 0
            X.KH6 r0 = new X.KH6
            r0.<init>(r8, r1)
            r8.schedule(r0)
            goto L_0x0650
        L_0x065f:
            X.DbT.A1J(r8)
            goto L_0x0650
        L_0x0663:
            r0.<init>(r3, r4, r1, r5)
            goto L_0x0624
        L_0x0667:
            r0 = 1170681380(0x45c72e24, float:6373.7676)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            X.K68 r2 = (X.K68) r2
            X.0eM r1 = r2.A0E
            java.lang.Object r7 = r1.getValue()
            X.Jgh r7 = (X.C60162Jgh) r7
            androidx.fragment.app.FragmentActivity r6 = r2.requireActivity()
            X.1Yy r5 = r7.A01
            com.instagram.common.session.UserSession r4 = r7.A00
            java.lang.Integer r3 = X.AnonymousClass05K.A00
            r2 = 12
            X.J6h r1 = new X.J6h
            r1.<init>(r7, r2)
            r5.A01(r6, r4, r3, r1)
            r1 = 2054389508(0x7a737f04, float:3.1607608E35)
            goto L_0x1194
        L_0x0693:
            r0 = -1235017796(0xffffffffb6631fbc, float:-3.3844108E-6)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r13 = r1.A01
            X.K68 r13 = (X.K68) r13
            X.LSr r5 = r13.A01
            java.lang.String r7 = "Required value was null."
            if (r5 == 0) goto L_0x07bf
            X.0eM r1 = r13.A0A
            boolean r1 = X.AnonymousClass7TF.A1Z(r1)
            if (r1 == 0) goto L_0x0724
            X.0eM r1 = r13.A0C
            X.0lg r4 = X.DbT.A0X(r1)
            java.lang.Class<X.LS7> r3 = X.LS7.class
            r2 = 2
            X.MBI r1 = new X.MBI
            r1.<init>(r4, r2)
            java.lang.Object r4 = r4.A01(r3, r1)
            X.LS7 r4 = (X.LS7) r4
            java.util.SortedMap r1 = r5.A07
            java.util.Collection r1 = r1.values()
            java.util.ArrayList r12 = X.AnonymousClass7TE.A1D(r1)
            java.lang.String r11 = r5.A01
            X.L8l r8 = r5.A00
            if (r8 == 0) goto L_0x07c7
            com.instagram.model.reels.Reel r1 = r4.A02
            r1.getClass()
            boolean r1 = r4.A04
            r5 = 1
            if (r1 != 0) goto L_0x06f1
            com.instagram.common.session.UserSession r9 = r4.A05
            com.instagram.model.reels.Reel r10 = r4.A02
            X.L8l r7 = r4.A01
            if (r7 != 0) goto L_0x06e6
            X.L8l r7 = X.C64184LSr.A01(r10)
        L_0x06e6:
            boolean r1 = X.LS7.A02(r7, r8, r9, r10, r11, r12)
            if (r1 == 0) goto L_0x06f1
            X.LS7.A01(r4)
            r4.A04 = r5
        L_0x06f1:
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1D(r12)
            com.instagram.model.reels.Reel r1 = r4.A02
            r1.A0X(r2)
            com.instagram.model.reels.Reel r3 = r4.A02
            int r1 = r2.size()
            int r1 = r1 - r5
            java.lang.Object r1 = r2.get(r1)
            X.1Xj r1 = (X.1Xj) r1
            long r1 = r1.A1A()
            r3.A03 = r1
            com.instagram.model.reels.Reel r2 = r4.A02
            r2.A0r = r11
            r4.A00 = r8
            X.3Hq r1 = X.LS7.A00(r8)
            r2.A0L = r1
            X.K68.A00(r13)
            X.DbT.A1J(r13)
            r1 = 143949053(0x8947cfd, float:8.936811E-34)
            goto L_0x1194
        L_0x0724:
            X.L8k r6 = r5.A04()
            java.util.Map r2 = r6.A03
            boolean r1 = r2.isEmpty()
            if (r1 == 0) goto L_0x074c
            java.util.Map r1 = r6.A04
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x074c
            boolean r1 = r6.A02
            if (r1 != 0) goto L_0x074c
            boolean r1 = r6.A01
            if (r1 != 0) goto L_0x074c
            boolean r1 = r6.A00
            if (r1 != 0) goto L_0x074c
            X.DbT.A1K(r13)
            r1 = 1781320915(0x6a2cccd3, float:5.2225623E25)
            goto L_0x1194
        L_0x074c:
            java.util.Map r1 = r5.A05
            java.util.Set r1 = r1.keySet()
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x0793
            androidx.fragment.app.FragmentActivity r10 = r13.requireActivity()
            X.0eM r1 = r13.A0C
            com.instagram.common.session.UserSession r14 = X.AnonymousClass7TE.A0l(r1)
            X.0gy r12 = X.AnonymousClass07i.A00(r13)
            X.0hq r11 = r13.getParentFragmentManager()
            X.LG3 r9 = new X.LG3
            r9.<init>(r10, r11, r12, r13, r14)
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r1)
            com.instagram.reels.store.ReelStore r2 = com.instagram.reels.store.ReelStore.A03(r1)
            X.0eM r1 = r13.A0B
            java.lang.String r1 = X.DbS.A0t(r1)
            com.instagram.model.reels.Reel r1 = r2.A0M(r1)
            if (r1 == 0) goto L_0x078b
            r9.A00(r13, r1)
            r1 = -2070861918(0xffffffff849127a2, float:-3.4125733E-36)
            goto L_0x1194
        L_0x078b:
            java.lang.IllegalArgumentException r3 = X.AnonymousClass7TE.A0w(r7)
            r1 = -846120171(0xffffffffcd913b15, float:-3.0457104E8)
            goto L_0x07ce
        L_0x0793:
            java.util.Collection r2 = r2.values()
            java.util.Map r1 = r6.A04
            java.util.Collection r1 = r1.values()
            X.KAL r4 = new X.KAL
            r4.<init>(r13, r2, r1)
            X.0hq r1 = r13.getParentFragmentManager()
            X.SQH.A02(r1)
            X.M8O r3 = new X.M8O
            r3.<init>(r6, r4, r13)
            X.LNo r2 = X.LNo.A00()
            X.Lcy r1 = new X.Lcy
            r1.<init>(r5, r3)
            r2.A01(r1, r4)
            r1 = -497709497(0xffffffffe2558e47, float:-9.8485216E20)
            goto L_0x1194
        L_0x07bf:
            java.lang.IllegalStateException r3 = X.AnonymousClass7TE.A0z(r7)
            r1 = -802253712(0xffffffffd02e9470, float:-1.17158543E10)
            goto L_0x07ce
        L_0x07c7:
            java.lang.IllegalStateException r3 = X.AnonymousClass7TE.A0z(r7)
            r1 = 746932525(0x2c85492d, float:3.7882115E-12)
        L_0x07ce:
            X.AnonymousClass0fD.A0C(r1, r0)
            throw r3
        L_0x07d2:
            java.lang.Object r0 = r1.A01
            com.instagram.archive.fragment.InlineAddHighlightFragment r0 = (com.instagram.archive.fragment.InlineAddHighlightFragment) r0
            com.instagram.archive.fragment.InlineAddHighlightFragment.A01(r0)
            return
        L_0x07da:
            java.lang.Object r0 = r1.A01
            com.instagram.archive.fragment.InlineAddHighlightFragment r0 = (com.instagram.archive.fragment.InlineAddHighlightFragment) r0
            com.instagram.archive.fragment.InlineAddHighlightFragment.A02(r0)
            return
        L_0x07e2:
            r0 = -1457404853(0xffffffffa921c44b, float:-3.591944E-14)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            com.instagram.archive.fragment.HighlightsProfileVisibilityFragment r1 = (com.instagram.archive.fragment.HighlightsProfileVisibilityFragment) r1
            X.0eM r1 = r1.A00
            java.lang.Object r1 = r1.getValue()
            X.Jfz r1 = (X.C60118Jfz) r1
            X.05G r1 = r1.A01
            X.JTR.A1W(r1)
            r1 = -1047049387(0xffffffffc1974b55, float:-18.911783)
            goto L_0x1194
        L_0x07ff:
            r0 = -880547189(0xffffffffcb83ea8b, float:-1.7290518E7)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.4mT r1 = (X.C273374mT) r1
            X.6Yo r2 = X.Dbb.A0G(r1)
            com.instagram.archive.fragment.SelectHighlightsCoverFragment r1 = new com.instagram.archive.fragment.SelectHighlightsCoverFragment
            r1.<init>()
            r2.A0D(r1)
            r2.A04()
            r1 = 37000099(0x23493a3, float:1.3266681E-37)
            goto L_0x1194
        L_0x081e:
            java.lang.Object r4 = r1.A01
            com.instagram.archive.fragment.ArchiveReelFragment r4 = (com.instagram.archive.fragment.ArchiveReelFragment) r4
            X.28D r2 = X.28D.A4Z
            com.instagram.common.session.UserSession r0 = r4.A04
            X.8ZP r1 = X.AnonymousClass8ZO.A00(r0)
            r0 = 0
            r1.A00(r2, r0)
            X.Hrt r0 = X.C250563lf.A0C(r2)
            android.os.Bundle r5 = r0.A00()
            com.instagram.common.session.UserSession r0 = r4.A04
            X.LSr r0 = X.C64184LSr.A00(r0)
            java.util.SortedMap r0 = r0.A07
            java.util.Collection r0 = r0.values()
            java.util.ArrayList r0 = X.AnonymousClass7TE.A1D(r0)
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r2 = r0.iterator()
        L_0x084e:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0869
            X.1Xj r1 = X.C51966G9m.A0t(r2)
            com.instagram.common.session.UserSession r0 = r4.A04
            X.1E8 r0 = X.1E7.A00(r0)
            r0.A00(r1)
            java.lang.String r0 = r1.getId()
            r3.add(r0)
            goto L_0x084e
        L_0x0869:
            r0 = 209(0xd1, float:2.93E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r5.putStringArrayList(r0, r3)
            X.50r r1 = X.C2801950r.CLIPS
            r0 = 19
            java.lang.String r0 = X.C273654mx.A00(r0)
            r5.putSerializable(r0, r1)
            com.instagram.common.session.UserSession r3 = r4.A04
            java.lang.Class<com.instagram.modal.TransparentModalActivity> r2 = com.instagram.modal.TransparentModalActivity.class
            androidx.fragment.app.FragmentActivity r1 = r4.requireActivity()
            java.lang.String r0 = "clips_camera"
            X.6W8 r1 = X.AnonymousClass6W8.A02(r1, r5, r3, r2, r0)
            X.Dbc.A0y(r1)
            r0 = 9786(0x263a, float:1.3713E-41)
            r1.A0D(r4, r0)
            return
        L_0x0894:
            java.lang.Object r2 = r1.A01
            com.instagram.archive.fragment.ArchiveReelFragment r2 = (com.instagram.archive.fragment.ArchiveReelFragment) r2
            androidx.fragment.app.FragmentActivity r1 = r2.requireActivity()
            com.instagram.common.session.UserSession r0 = r2.A04
            X.6Yo r4 = X.DbS.A0M(r1, r0)
            com.instagram.common.session.UserSession r1 = r2.A04
            X.Ki3 r3 = r2.A02
            r3.getClass()
            r0 = 0
            X.0qQ.A0B(r1, r0)
            com.instagram.archive.fragment.HighlightsMetadataFragment r2 = new com.instagram.archive.fragment.HighlightsMetadataFragment
            r2.<init>()
            java.lang.String r1 = r1.A05
            java.lang.String r0 = "IgSessionManager.SESSION_TOKEN_KEY"
            X.0eP r1 = X.AnonymousClass7TE.A1L(r0, r1)
            java.lang.String r0 = "highlight_management_source"
            android.os.Bundle r0 = X.AnonymousClass7TG.A0P(r0, r3, r1)
            r2.setArguments(r0)
            goto L_0x09a1
        L_0x08c5:
            r0 = 2056139858(0x7a8e3452, float:3.6918367E35)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r1.A01
            com.instagram.archive.fragment.ArchiveHomeFragment r5 = (com.instagram.archive.fragment.ArchiveHomeFragment) r5
            android.content.Context r1 = r5.requireContext()
            com.instagram.common.session.UserSession r0 = r5.A02
            X.Dg1 r4 = new X.Dg1
            r4.<init>(r1, r0)
            com.instagram.common.session.UserSession r6 = r5.A02
            X.0Tu r3 = X.0Tu.A05
            r0 = 36319098153474968(0x81080700001b98, double:3.031682145302816E-306)
            boolean r0 = X.DbY.A1Y(r3, r6, r0)
            if (r0 != 0) goto L_0x08f3
            X.KiM r3 = X.C62589KiM.STORY
            int r1 = r3.A00
            r0 = 15
            X.LY8.A01(r4, r5, r3, r0, r1)
        L_0x08f3:
            X.KiM r1 = X.C62589KiM.POSTS
            int r0 = r1.A00
            r3 = 15
            X.LY8.A01(r4, r5, r1, r3, r0)
            X.KiM r1 = X.C62589KiM.LIVE
            int r0 = r1.A00
            X.LY8.A01(r4, r5, r1, r3, r0)
            com.instagram.common.session.UserSession r0 = r5.A02
            boolean r0 = X.AnonymousClass39U.A04(r0)
            if (r0 == 0) goto L_0x0912
            X.KiM r1 = X.C62589KiM.QUICK_SNAP
            int r0 = r1.A00
            X.LY8.A01(r4, r5, r1, r3, r0)
        L_0x0912:
            X.C49945FFy.A00(r5, r4)
            r0 = -289237242(0xffffffffeec29706, float:-3.0111334E28)
            goto L_0x1139
        L_0x091a:
            java.lang.Object r6 = r1.A01
            com.instagram.archive.fragment.ArchiveHomeFragment r6 = (com.instagram.archive.fragment.ArchiveHomeFragment) r6
            androidx.fragment.app.FragmentActivity r5 = r6.getActivity()
            androidx.fragment.app.FragmentActivity r1 = r6.requireActivity()
            com.instagram.common.session.UserSession r0 = r6.A02
            X.Dg1 r4 = new X.Dg1
            r4.<init>(r1, r0)
            r0 = 2131966739(0x7f133b13, float:1.9570325E38)
            r4.A01(r0)
            r1 = 2131956865(0x7f131481, float:1.9550298E38)
            r0 = 14
            X.LY8.A01(r4, r6, r5, r0, r1)
            r2 = 2131973150(0x7f13541e, float:1.9583328E38)
            r1 = 23
            X.LYC r0 = new X.LYC
            r0.<init>((com.instagram.archive.fragment.ArchiveHomeFragment) r6, (int) r1)
            r4.A04(r0, r2)
            com.instagram.common.session.UserSession r3 = r6.A02
            X.0Tu r2 = X.0Tu.A05
            r0 = 36323444660382881(0x810bfb00002ca1, double:3.034430893773359E-306)
            boolean r0 = X.DbY.A1Y(r2, r3, r0)
            if (r0 == 0) goto L_0x0963
            r0 = 24
            X.LYC r1 = new X.LYC
            r1.<init>((com.instagram.archive.fragment.ArchiveHomeFragment) r6, (int) r0)
            java.lang.String r0 = "Recap"
            r4.A0C(r0, r1)
        L_0x0963:
            X.FFy r0 = new X.FFy
            r0.<init>(r4)
            r5.getClass()
            r0.A03(r5)
            return
        L_0x096f:
            java.lang.Object r4 = r1.A01
            com.instagram.archive.fragment.ArchiveHomeFragment r4 = (com.instagram.archive.fragment.ArchiveHomeFragment) r4
            java.util.HashMap r1 = X.AnonymousClass7TE.A1E()
            java.lang.String r0 = "com.instagram.shell.playground.recap_playground"
            X.DiU r3 = X.C46649DiU.A04(r0, r1)
            android.content.Context r2 = r4.requireContext()
            com.instagram.common.session.UserSession r0 = r4.A02
            com.instagram.bloks.hosting.IgBloksScreenConfig r1 = X.DbS.A0N(r0)
            java.lang.String r0 = "Recap"
            r1.A0U = r0
            r3.A0D(r2, r1)
            return
        L_0x098f:
            java.lang.Object r0 = r1.A01
            com.instagram.archive.fragment.ArchiveHomeFragment r0 = (com.instagram.archive.fragment.ArchiveHomeFragment) r0
            androidx.fragment.app.FragmentActivity r1 = r0.requireActivity()
            com.instagram.common.session.UserSession r0 = r0.A02
            X.6Yo r4 = X.DbS.A0M(r1, r0)
            X.Kai r2 = X.C250563lf.A0D()
        L_0x09a1:
            r4.A0E(r2)
            r4.A04()
            return
        L_0x09a8:
            r0 = -1050147990(0xffffffffc168036a, float:-14.5008335)
            int r0 = X.AnonymousClass0fD.A05(r0)
            X.6ap r3 = X.DbV.A0X()
            java.lang.Object r2 = r1.A01
            android.content.Context r2 = (android.content.Context) r2
            r1 = 2131961513(0x7f1326a9, float:1.9559725E38)
            X.DbS.A19(r2, r3, r1)
            X.Dbb.A1Q(r3)
            r1 = -210679171(0xfffffffff3714a7d, float:-1.911704E31)
            goto L_0x1194
        L_0x09c5:
            r0 = 1596713592(0x5f2bea78, float:1.2387846E19)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.Jpa r1 = (X.C60689Jpa) r1
            int r0 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            X.Koz r3 = r1.A01
            if (r3 != 0) goto L_0x09e2
            X.MUe r0 = r1.A00
            if (r0 == 0) goto L_0x09dd
            r0.DUO()
        L_0x09dd:
            r0 = -1395641324(0xffffffffacd03414, float:-5.9174974E-12)
            goto L_0x1139
        L_0x09e2:
            X.MUe r1 = r1.A00
            if (r1 == 0) goto L_0x09dd
            r0 = 1
            r1.DBY(r3, r0)
            goto L_0x09dd
        L_0x09eb:
            r0 = -747301586(0xffffffffd375152e, float:-1.05262232E12)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.KFS r1 = (X.KFS) r1
            X.KzY r1 = r1.A00
            X.K86 r1 = r1.A00
            X.0eM r1 = r1.A08
            X.2YL r6 = X.DbS.A0H(r1)
            java.lang.Integer r5 = X.AnonymousClass05K.A01
            X.6oS r4 = X.C318116oQ.A00(r6)
            r3 = 0
            r2 = 14
            X.MHH r1 = new X.MHH
            r1.<init>((X.AnonymousClass4D7) r3, (java.lang.Object) r6, (java.lang.Object) r5, (int) r2)
            X.AnonymousClass7TE.A1Z(r1, r4)
            r1 = 91038545(0x56d2351, float:1.1150173E-35)
            goto L_0x1194
        L_0x0a16:
            r0 = 18147721(0x114e989, float:2.735086E-38)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.KF9 r1 = (X.KF9) r1
            X.0sa r1 = r1.A00
            r1.invoke()
            r1 = -2021760172(0xffffffff877e6354, float:-1.9138026E-34)
            goto L_0x1194
        L_0x0a2b:
            r0 = -380734823(0xffffffffe94e7299, float:-1.5598743E25)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.KF7 r1 = (X.KF7) r1
            X.0sa r1 = r1.A00
            r1.invoke()
            r1 = 1369300969(0x519ddfe9, float:8.4758307E10)
            goto L_0x1194
        L_0x0a40:
            r0 = 1418128733(0x5486ed5d, float:4.6360633E12)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A01
            X.K89 r3 = (X.K89) r3
            android.os.Bundle r1 = r3.requireArguments()
            com.instagram.appreciation.analytics.LoggingData r2 = X.C63033KqO.A00(r1)
            android.os.Bundle r1 = r3.requireArguments()
            com.instagram.appreciation.analytics.creator.CreatorLoggingData r4 = X.C63036KqR.A00(r1)
            X.0eM r1 = r3.A00
            java.lang.Object r7 = r1.getValue()
            X.LTO r7 = (X.LTO) r7
            java.lang.Integer r12 = X.AnonymousClass05K.A1F
            java.lang.Integer r13 = X.AnonymousClass05K.A03
            boolean r6 = r4.A01
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r6)
            boolean r5 = r4.A02
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r5)
            java.util.Map r14 = r4.A00
            r10 = 0
            X.0sm r16 = X.0Yt.A0E()
            r11 = r10
            r15 = r10
            r7.A08(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            X.0eM r1 = r3.A01
            X.7Pr r1 = X.DbX.A0f(r1)
            r1.A0U = r3
            X.7Pu r8 = r1.A00()
            androidx.fragment.app.FragmentActivity r7 = r3.requireActivity()
            X.1Z0 r1 = X.AnonymousClass2BF.A00()
            r1.A02()
            java.lang.String r3 = r2.A01
            java.lang.String r1 = r2.A00
            X.AnonymousClass7TG.A1N(r3, r1)
            X.K81 r4 = new X.K81
            r4.<init>()
            com.instagram.appreciation.analytics.LoggingData r2 = new com.instagram.appreciation.analytics.LoggingData
            r2.<init>(r3, r1)
            java.lang.String r1 = "appreciation_logging_data"
            X.0eP r3 = X.AnonymousClass7TE.A1L(r1, r2)
            com.instagram.appreciation.analytics.creator.CreatorLoggingData r2 = new com.instagram.appreciation.analytics.creator.CreatorLoggingData
            r2.<init>(r6, r5, r14)
            java.lang.String r1 = "appreciation_creator_logging_data"
            android.os.Bundle r1 = X.AnonymousClass7TG.A0P(r1, r2, r3)
            r4.setArguments(r1)
            r8.A02(r7, r4)
            r1 = -242711625(0xfffffffff18883b7, float:-1.3519742E30)
            goto L_0x1194
        L_0x0ac3:
            r0 = 658380537(0x273e16f9, float:2.638025E-15)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.DbS.A1U(r1)
            r1 = -1757743158(0xffffffff973af7ca, float:-6.0412595E-25)
            goto L_0x1194
        L_0x0ad4:
            r0 = -290611571(0xffffffffeead9e8d, float:-2.6866291E28)
            int r7 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A01
            X.K60 r3 = (X.K60) r3
            X.0eM r0 = r3.A00
            java.lang.Object r2 = r0.getValue()
            X.LRW r2 = (X.LRW) r2
            X.1Ln r1 = X.LRW.A00(r2)
            boolean r0 = X.DbT.A1Y(r1)
            if (r0 == 0) goto L_0x0af9
            java.lang.String r0 = "your_ais_create_header_button_clicked"
            r1.A0l(r0)
            X.LRW.A01(r1, r2)
        L_0x0af9:
            X.0eM r0 = r3.A03
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r0)
            java.lang.String r0 = "your_ais_top_right_create"
            X.K60.A00(r3, r1, r0)
            r0 = 1424358577(0x54e5fcb1, float:7.9022958E12)
            goto L_0x0cda
        L_0x0b09:
            r0 = 592827020(0x2355d28c, float:1.1591338E-17)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.K5t r1 = (X.C61399K5t) r1
            X.0eM r0 = r1.A02
            X.LTH r0 = X.JTO.A0T(r0)
            X.0eM r4 = r1.A05
            java.lang.String r5 = X.C60316JjJ.A01(r4)
            r14 = 0
            X.1Ln r3 = X.LTH.A00(r0)
            boolean r0 = X.DbT.A1Y(r3)
            if (r0 == 0) goto L_0x0b30
            java.lang.String r0 = "ai_custom_creation_screen_next_clicked"
            X.JTT.A1H(r3, r0, r5)
        L_0x0b30:
            X.JjJ r0 = X.JTO.A0R(r4)
            X.0Ud r0 = r0.A0M
            java.lang.String r9 = X.JTO.A11(r0)
            X.JjJ r0 = X.JTO.A0R(r4)
            r10 = 0
            X.0qQ.A0B(r9, r14)
            X.KX0 r15 = r0.A00
            java.lang.String r0 = r0.A02
            r16 = r10
            r17 = r9
            r18 = r10
            r19 = r0
            r20 = r10
            r21 = r10
            r22 = r10
            r23 = r14
            r15.A06(r16, r17, r18, r19, r20, r21, r22, r23)
            X.JjJ r0 = X.JTO.A0R(r4)
            X.KX0 r0 = r0.A00
            X.05G r0 = r0.A0B
            r0.Epw(r9)
            X.0eM r3 = r1.A03
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r3)
            boolean r0 = X.LST.A04(r0)
            if (r0 == 0) goto L_0x0b9b
            X.JjJ r0 = X.JTO.A0R(r4)
            X.05G r0 = r0.A05
            X.Lcc r6 = X.C64475Lcc.A00
            X.Lcf r8 = X.C64478Lcf.A00
            X.Lce r7 = X.C64477Lce.A00
            X.Lcb r5 = X.C64474Lcb.A00
            X.0sn r13 = X.0sn.A00
            X.JvA r4 = new X.JvA
            r11 = r10
            r12 = r10
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r0.Epw(r4)
            X.6Yo r1 = X.DbZ.A0P(r1, r3)
            X.K62 r0 = new X.K62
            r0.<init>()
            X.Dba.A0w(r10, r0, r1)
        L_0x0b96:
            r0 = -2010375278(0xffffffff882c1b92, float:-5.1791776E-34)
            goto L_0x1139
        L_0x0b9b:
            X.6Yo r1 = X.DbZ.A0P(r1, r3)
            X.K63 r0 = new X.K63
            r0.<init>()
            X.Dba.A0w(r10, r0, r1)
            goto L_0x0b96
        L_0x0ba8:
            r0 = 1325281930(0x4efe328a, float:2.1323625E9)
            int r7 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r1.A01
            X.K5j r5 = (X.C61389K5j) r5
            X.0eM r0 = r5.A01
            X.LTH r0 = X.JTO.A0T(r0)
            X.0eM r4 = r5.A04
            java.lang.String r3 = X.C60316JjJ.A02(r4)
            java.lang.String r2 = X.C60316JjJ.A01(r4)
            X.1Ln r1 = X.LTH.A00(r0)
            boolean r0 = X.DbT.A1Y(r1)
            if (r0 == 0) goto L_0x0bd6
            java.lang.String r0 = "edit_ai_details_avatar_done_clicked"
            java.lang.Long r0 = X.JTU.A0W(r1, r0, r3)
            X.JTT.A1G(r1, r0, r2)
        L_0x0bd6:
            X.JjJ r0 = X.JTO.A0R(r4)
            X.KX0 r6 = r0.A00
            X.0Ud r0 = r6.A0b
            java.lang.Object r4 = r0.getValue()
            if (r4 == 0) goto L_0x0c29
            X.Jvz r4 = (X.C61061Jvz) r4
            X.0Ud r0 = r6.A0x
            java.lang.Object r3 = r0.getValue()
            X.Jv2 r3 = (X.C61005Jv2) r3
            if (r3 == 0) goto L_0x0c1e
            X.MPk r1 = r3.A01
            if (r1 == 0) goto L_0x0c1e
            boolean r0 = r1 instanceof X.C61090Jx1
            if (r0 == 0) goto L_0x0c18
            java.lang.String r2 = r3.A02
            if (r2 != 0) goto L_0x0bfe
            java.lang.String r2 = r4.A05
        L_0x0bfe:
            X.Jx1 r1 = (X.C61090Jx1) r1
            com.instagram.common.typedurl.ImageUrl r1 = r1.A00
            if (r1 == 0) goto L_0x0c26
            com.instagram.common.typedurl.SimpleImageUrl r0 = new com.instagram.common.typedurl.SimpleImageUrl
            r0.<init>(r1)
        L_0x0c09:
            java.lang.String r1 = r3.A03
            if (r1 != 0) goto L_0x0c0f
            java.lang.String r1 = r4.A0A
        L_0x0c0f:
            X.Jvz r1 = X.C61061Jvz.A00((X.C61073JwB) null, r4, r0, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, r2, r1, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, (java.util.List) null, (java.util.List) null, (java.util.List) null, (java.util.List) null, (java.util.List) null, 8388495, false, false)
            X.05G r0 = r6.A0C
            r0.Epw(r1)
        L_0x0c18:
            X.05G r1 = r6.A0Y
            r0 = 0
            r1.Epw(r0)
        L_0x0c1e:
            X.DbT.A1I(r5)
            r0 = -1405744310(0xffffffffac360b4a, float:-2.5870022E-12)
            goto L_0x0cda
        L_0x0c26:
            com.instagram.common.typedurl.ImageUrl r0 = r4.A01
            goto L_0x0c09
        L_0x0c29:
            java.lang.IllegalStateException r3 = X.AnonymousClass7TE.A0y()
            throw r3
        L_0x0c2e:
            r0 = 1611465962(0x600d04ea, float:4.0646016E19)
            int r7 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A01
            X.K64 r3 = (X.K64) r3
            X.0eM r0 = r3.A01
            X.1Ln r1 = X.LTH.A02(r0)
            boolean r0 = X.DbT.A1Y(r1)
            if (r0 == 0) goto L_0x0c4d
            java.lang.String r0 = "settings_main_screen_insights_clicked"
            r1.A0l(r0)
            r1.Cgf()
        L_0x0c4d:
            android.os.Bundle r1 = r3.requireArguments()
            java.lang.String r0 = "persona_id"
            java.lang.String r1 = X.C320236s2.A01(r1, r0)
            java.lang.String r0 = "target_id"
            java.util.HashMap r1 = X.DbY.A0m(r0, r1)
            java.lang.String r0 = "com.instagram.insights.account.ai_studio_breakout.container"
            X.DiU r1 = X.C46649DiU.A04(r0, r1)
            X.0eM r2 = r3.A02
            X.0lg r0 = X.DbT.A0X(r2)
            com.instagram.bloks.hosting.IgBloksScreenConfig r0 = X.DbS.A0N(r0)
            X.3M3 r1 = X.C49891FBs.A02(r0, r1)
            androidx.fragment.app.FragmentActivity r0 = r3.requireActivity()
            X.Dbc.A0S(r1, r0, r2)
            r0 = 38822409(0x2506209, float:1.5309561E-37)
            goto L_0x0cda
        L_0x0c7c:
            r0 = 1081591600(0x4077c730, float:3.8715324)
            int r7 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r6 = r1.A01
            X.K5n r6 = (X.C61393K5n) r6
            X.0eM r0 = r6.A02
            X.LTH r4 = X.JTO.A0T(r0)
            X.0eM r0 = r6.A03
            java.lang.String r3 = X.DbS.A0t(r0)
            X.0eM r2 = r6.A05
            java.lang.String r1 = X.C60315JjI.A02(r2)
            java.lang.String r0 = "advanced_settings_editing"
            r4.A0S(r3, r1, r0)
            X.JjI r0 = X.JTO.A0S(r2)
            X.05G r5 = r0.A02
            java.lang.Object r4 = r5.getValue()
            java.lang.String r1 = "Required value was null."
            if (r4 == 0) goto L_0x0cef
            X.Jvn r4 = (X.C61049Jvn) r4
            X.05G r0 = r0.A06
            java.lang.Object r3 = r0.getValue()
            if (r3 == 0) goto L_0x0cea
            X.JuL r3 = (X.C60963JuL) r3
            int r2 = r3.A00
            java.util.List r1 = r4.A04
            r0 = -1
            if (r2 != r0) goto L_0x0ce0
            java.lang.String r0 = r3.A01
            java.util.ArrayList r1 = X.00k.A0T(r0, r1)
        L_0x0cc5:
            java.lang.Object r0 = r5.getValue()
            X.Jvn r0 = (X.C61049Jvn) r0
            if (r0 == 0) goto L_0x0cde
            X.Jvn r0 = X.C61049Jvn.A00(r0, (java.lang.String) null, (java.util.List) null, r1, (java.util.List) null, (java.util.List) null, 987, true, false, false, false, false)
        L_0x0cd1:
            r5.Epw(r0)
            X.DbT.A1I(r6)
            r0 = -1293506558(0xffffffffb2e6a802, float:-2.6851925E-8)
        L_0x0cda:
            X.AnonymousClass0fD.A0C(r0, r7)
            return
        L_0x0cde:
            r0 = 0
            goto L_0x0cd1
        L_0x0ce0:
            java.util.ArrayList r1 = X.00k.A0U(r1)
            java.lang.String r0 = r3.A01
            r1.set(r2, r0)
            goto L_0x0cc5
        L_0x0cea:
            java.lang.IllegalStateException r3 = X.AnonymousClass7TE.A0z(r1)
            throw r3
        L_0x0cef:
            java.lang.IllegalStateException r3 = X.AnonymousClass7TE.A0z(r1)
            throw r3
        L_0x0cf4:
            r0 = 880668776(0x347df068, float:2.364992E-7)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r1.A01
            X.K5p r5 = (X.C61395K5p) r5
            X.0eM r0 = r5.A00
            X.LTH r0 = X.JTO.A0T(r0)
            X.0eM r6 = r5.A03
            java.lang.String r4 = X.C60316JjJ.A02(r6)
            java.lang.String r3 = X.C60316JjJ.A01(r6)
            X.1Ln r1 = X.LTH.A00(r0)
            boolean r0 = X.DbT.A1Y(r1)
            if (r0 == 0) goto L_0x0d22
            java.lang.String r0 = "creation_preparation_screen_dismiss_clicked"
            java.lang.Long r0 = X.JTU.A0W(r1, r0, r4)
            X.JTT.A1G(r1, r0, r3)
        L_0x0d22:
            X.0eM r0 = r5.A01
            X.7I6 r4 = X.JTO.A0U(r0)
            java.lang.String r3 = "ai_preparation_screen_back_button_clicked"
            r1 = 673059101(0x281e111d, float:8.774473E-15)
            X.02m r0 = r4.A06
            r0.markerPoint(r1, r3)
            r0 = 1
            r4.A03 = r0
            androidx.fragment.app.FragmentActivity r1 = r5.requireActivity()
            java.lang.String r0 = "ugc_ai_creation"
            X.C48314EcX.A00(r1, r0)
            X.JjJ r0 = X.JTO.A0R(r6)
            r0.A07()
            X.DbX.A1I(r5)
            r0 = 1379034472(0x52326568, float:1.91551373E11)
            goto L_0x1139
        L_0x0d4d:
            r0 = -27436148(0xfffffffffe5d5b8c, float:-7.355868E37)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r7 = r1.A01
            X.K5i r7 = (X.K5i) r7
            X.0eM r0 = r7.A01
            X.LTH r0 = X.JTO.A0T(r0)
            X.0eM r3 = r7.A03
            java.lang.String r2 = X.C60315JjI.A02(r3)
            X.1Ln r1 = X.LTH.A00(r0)
            boolean r0 = X.DbT.A1Y(r1)
            if (r0 == 0) goto L_0x0d7a
            java.lang.String r0 = "settings_main_screen_edit_profile_picture_screen_done_clicked"
            java.lang.Long r0 = X.JTU.A0W(r1, r0, r2)
            r1.A0j(r0)
            r1.Cgf()
        L_0x0d7a:
            X.JjI r0 = X.JTO.A0S(r3)
            com.instagram.aistudio.editor.AiSettingsRepository r6 = r0.A00
            X.0Ud r0 = r6.A0X
            java.lang.Object r4 = r0.getValue()
            if (r4 == 0) goto L_0x0dca
            X.Jvz r4 = (X.C61061Jvz) r4
            X.0Ud r0 = r6.A0t
            java.lang.Object r3 = r0.getValue()
            X.Jv2 r3 = (X.C61005Jv2) r3
            if (r3 == 0) goto L_0x0dbf
            X.MPk r1 = r3.A01
            if (r1 == 0) goto L_0x0dbf
            boolean r0 = r1 instanceof X.C61090Jx1
            if (r0 == 0) goto L_0x0dbf
            java.lang.String r2 = r3.A02
            if (r2 != 0) goto L_0x0da2
            java.lang.String r2 = r4.A05
        L_0x0da2:
            X.Jx1 r1 = (X.C61090Jx1) r1
            com.instagram.common.typedurl.ImageUrl r0 = r1.A00
            if (r0 == 0) goto L_0x0dc7
            com.instagram.common.typedurl.SimpleImageUrl r1 = new com.instagram.common.typedurl.SimpleImageUrl
            r1.<init>(r0)
        L_0x0dad:
            java.lang.String r0 = r3.A03
            if (r0 != 0) goto L_0x0db3
            java.lang.String r0 = r4.A0A
        L_0x0db3:
            X.Jvz r1 = X.C61061Jvz.A00((X.C61073JwB) null, r4, r1, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, r2, r0, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, (java.util.List) null, (java.util.List) null, (java.util.List) null, (java.util.List) null, (java.util.List) null, 8388495, false, false)
            X.05G r0 = r6.A08
            r0.Epw(r1)
            com.instagram.aistudio.editor.AiSettingsRepository.A07(r6, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, (java.util.List) null, 255)
        L_0x0dbf:
            X.DbT.A1I(r7)
            r0 = 1947207812(0x74100884, float:4.5645963E31)
            goto L_0x1021
        L_0x0dc7:
            com.instagram.common.typedurl.ImageUrl r1 = r4.A01
            goto L_0x0dad
        L_0x0dca:
            java.lang.IllegalStateException r3 = X.AnonymousClass7TE.A0y()
            throw r3
        L_0x0dcf:
            r0 = 573539312(0x222f83f0, float:2.378677E-18)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r1.A01
            X.K5s r4 = (X.C61398K5s) r4
            r0 = 28
            X.MMM r5 = new X.MMM
            r5.<init>(r4, r0)
            X.0eM r0 = r4.A05
            X.JuL r0 = X.C60315JjI.A00(r0)
            if (r0 == 0) goto L_0x0e1e
            boolean r1 = r0.A05
            boolean r0 = r0.A06
            if (r1 == 0) goto L_0x0e1e
            if (r0 == 0) goto L_0x0e1e
            X.0eM r3 = r4.A02
            X.1Ln r1 = X.LTH.A02(r3)
            boolean r0 = X.DbT.A1Y(r1)
            if (r0 == 0) goto L_0x0e05
            java.lang.String r0 = "thread_view_add_instruction_submit_for_review_dialog_shown"
            r1.A0l(r0)
            r1.Cgf()
        L_0x0e05:
            android.content.Context r4 = r4.requireContext()
            X.LTH r3 = X.JTO.A0T(r3)
            r0 = 31
            X.MMM r1 = new X.MMM
            r1.<init>(r5, r0)
            java.lang.String r0 = "in_thread_instruction"
            X.C63001Kpr.A00(r4, r3, r0, r1)
        L_0x0e19:
            r0 = -1490510465(0xffffffffa7289d7f, float:-2.3400062E-15)
            goto L_0x1139
        L_0x0e1e:
            r5.invoke()
            goto L_0x0e19
        L_0x0e22:
            r0 = 1934772710(0x735249e6, float:1.6660785E31)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r6 = r1.A01
            X.K63 r6 = (X.K63) r6
            X.0eM r0 = r6.A02
            X.LTH r9 = X.JTO.A0T(r0)
            X.0eM r4 = r6.A04
            java.lang.String r3 = X.C60316JjJ.A02(r4)
            X.JjJ r0 = X.JTO.A0R(r4)
            boolean r1 = r0.A0H()
            X.JjJ r0 = X.JTO.A0R(r4)
            boolean r2 = r0.A0J()
            X.JjJ r0 = X.JTO.A0R(r4)
            boolean r8 = r0.A0I()
            java.lang.String r7 = X.C60316JjJ.A01(r4)
            X.1Ln r4 = X.LTH.A00(r9)
            boolean r0 = X.DbT.A1Y(r4)
            if (r0 == 0) goto L_0x0e89
            java.lang.String r0 = "edit_ai_details_next_clicked"
            java.lang.Long r0 = X.JTU.A0W(r4, r0, r3)
            r4.A0j(r0)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r0 = "is_description_changed"
            X.0eP r3 = X.AnonymousClass7TE.A1L(r0, r1)
            java.lang.String r1 = java.lang.String.valueOf(r2)
            java.lang.String r0 = "is_tagline_changed"
            X.0eP r2 = X.AnonymousClass7TE.A1L(r0, r1)
            java.lang.String r1 = java.lang.String.valueOf(r8)
            java.lang.String r0 = "is_name_changed"
            java.util.LinkedHashMap r0 = X.DbY.A0q(r0, r1, r3, r2)
            X.JTT.A1I(r4, r7, r0)
        L_0x0e89:
            androidx.fragment.app.FragmentActivity r1 = r6.requireActivity()
            X.0eM r0 = r6.A03
            X.6Yo r1 = X.DbX.A0N(r1, r0)
            X.K59 r0 = new X.K59
            r0.<init>()
            X.Dba.A12(r0, r1)
            r0 = -1659629927(0xffffffff9d140e99, float:-1.9595184E-21)
            goto L_0x1021
        L_0x0ea0:
            r0 = 1620865486(0x609c71ce, float:9.018414E19)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r1.A01
            X.K63 r4 = (X.K63) r4
            X.0eM r0 = r4.A02
            X.LTH r6 = X.JTO.A0T(r0)
            X.0eM r8 = r4.A04
            java.lang.String r3 = X.C60316JjJ.A02(r8)
            X.JjJ r0 = X.JTO.A0R(r8)
            boolean r1 = r0.A0H()
            X.JjJ r0 = X.JTO.A0R(r8)
            boolean r2 = r0.A0J()
            X.JjJ r0 = X.JTO.A0R(r8)
            boolean r9 = r0.A0I()
            java.lang.String r7 = X.C60316JjJ.A01(r8)
            X.1Ln r6 = X.LTH.A00(r6)
            boolean r0 = X.DbT.A1Y(r6)
            if (r0 == 0) goto L_0x0f07
            java.lang.String r0 = "edit_ai_details_done_clicked"
            java.lang.Long r0 = X.JTU.A0W(r6, r0, r3)
            r6.A0j(r0)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r0 = "is_description_changed"
            X.0eP r3 = X.AnonymousClass7TE.A1L(r0, r1)
            java.lang.String r1 = java.lang.String.valueOf(r2)
            java.lang.String r0 = "is_tagline_changed"
            X.0eP r2 = X.AnonymousClass7TE.A1L(r0, r1)
            java.lang.String r1 = java.lang.String.valueOf(r9)
            java.lang.String r0 = "is_name_changed"
            java.util.LinkedHashMap r0 = X.DbY.A0q(r0, r1, r3, r2)
            X.JTT.A1I(r6, r7, r0)
        L_0x0f07:
            X.JjJ r0 = X.JTO.A0R(r8)
            X.KX0 r0 = r0.A00
            X.05G r1 = r0.A0W
            X.0Ud r0 = r0.A0b
            java.lang.Object r0 = r0.getValue()
            r1.Epw(r0)
            androidx.fragment.app.FragmentActivity r1 = r4.requireActivity()
            X.0eM r0 = r4.A03
            X.6Yo r0 = X.DbX.A0N(r1, r0)
            r0.A06()
            r0 = -171471509(0xfffffffff5c78d6b, float:-5.0592547E32)
            goto L_0x1021
        L_0x0f2a:
            r0 = -399437716(0xffffffffe831106c, float:-3.3446472E24)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r9 = r1.A01
            X.K5h r9 = (X.C61388K5h) r9
            X.0eM r2 = r9.A02
            X.JjJ r0 = X.JTO.A0R(r2)
            r0.A05()
            X.0eM r0 = r9.A01
            X.1Ln r1 = X.LTH.A02(r0)
            boolean r0 = X.DbT.A1Y(r1)
            if (r0 == 0) goto L_0x0f52
            java.lang.String r0 = "ai_creation_advanced_settings_done_button_clicked"
            r1.A0l(r0)
            r1.Cgf()
        L_0x0f52:
            X.JjJ r1 = X.JTO.A0R(r2)
            X.05G r0 = r1.A04
            java.lang.Object r0 = r0.getValue()
            if (r0 == 0) goto L_0x0fbe
            X.Jvn r0 = (X.C61049Jvn) r0
            X.KX0 r8 = r1.A00
            java.lang.String r7 = r0.A00
            java.util.List r6 = r0.A03
            java.util.List r4 = r0.A04
            java.util.List r3 = r0.A02
            java.util.List r1 = r0.A01
            r2 = 0
            X.0qQ.A0B(r7, r2)
            X.C51974G9v.A1P(r6, r4, r3, r1)
            X.0Ud r0 = r8.A0b
            java.lang.Object r11 = r0.getValue()
            if (r11 == 0) goto L_0x0fb9
            X.Jvz r11 = (X.C61061Jvz) r11
            r10 = 0
            r27 = 4716031(0x47f5ff, float:6.608567E-39)
            r12 = r10
            r13 = r10
            r14 = r10
            r15 = r10
            r16 = r10
            r17 = r10
            r18 = r10
            r20 = r10
            r21 = r4
            r22 = r10
            r23 = r10
            r24 = r3
            r25 = r6
            r26 = r1
            r28 = r2
            r29 = r2
            r19 = r7
            X.Jvz r1 = X.C61061Jvz.A00(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            X.05G r0 = r8.A0C
            r0.Epw(r1)
            androidx.fragment.app.FragmentActivity r1 = r9.requireActivity()
            X.0eM r0 = r9.A03
            X.6Yo r0 = X.DbX.A0N(r1, r0)
            r0.A0G(r10, r2)
            r0 = -594553303(0xffffffffdc8fd629, float:-3.23891146E17)
            goto L_0x1021
        L_0x0fb9:
            java.lang.IllegalStateException r3 = X.AnonymousClass7TE.A0y()
            throw r3
        L_0x0fbe:
            java.lang.IllegalStateException r3 = X.AnonymousClass7TE.A0y()
            throw r3
        L_0x0fc3:
            r0 = 867264790(0x33b16916, float:8.26132E-8)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r7 = r1.A01
            X.K5l r7 = (X.C61391K5l) r7
            X.0eM r0 = r7.A02
            X.LTH r4 = X.JTO.A0T(r0)
            X.0eM r0 = r7.A03
            java.lang.String r3 = X.DbS.A0t(r0)
            X.0eM r2 = r7.A05
            java.lang.String r1 = X.C60316JjJ.A02(r2)
            java.lang.String r0 = "advanced_settings_creation"
            r4.A0S(r3, r1, r0)
            X.JjJ r0 = X.JTO.A0R(r2)
            X.05G r6 = r0.A04
            java.lang.Object r4 = r6.getValue()
            java.lang.String r1 = "Required value was null."
            if (r4 == 0) goto L_0x1036
            X.Jvn r4 = (X.C61049Jvn) r4
            X.05G r0 = r0.A08
            java.lang.Object r3 = r0.getValue()
            if (r3 == 0) goto L_0x1031
            X.JuL r3 = (X.C60963JuL) r3
            int r2 = r3.A00
            java.util.List r1 = r4.A04
            r0 = -1
            if (r2 != r0) goto L_0x1027
            java.lang.String r0 = r3.A01
            java.util.ArrayList r1 = X.00k.A0T(r0, r1)
        L_0x100c:
            java.lang.Object r0 = r6.getValue()
            X.Jvn r0 = (X.C61049Jvn) r0
            if (r0 == 0) goto L_0x1025
            X.Jvn r0 = X.C61049Jvn.A00(r0, (java.lang.String) null, (java.util.List) null, r1, (java.util.List) null, (java.util.List) null, 987, true, false, false, false, false)
        L_0x1018:
            r6.Epw(r0)
            X.DbT.A1I(r7)
            r0 = -947832513(0xffffffffc781393f, float:-66162.49)
        L_0x1021:
            X.AnonymousClass0fD.A0C(r0, r5)
            return
        L_0x1025:
            r0 = 0
            goto L_0x1018
        L_0x1027:
            java.util.ArrayList r1 = X.00k.A0U(r1)
            java.lang.String r0 = r3.A01
            r1.set(r2, r0)
            goto L_0x100c
        L_0x1031:
            java.lang.IllegalStateException r3 = X.AnonymousClass7TE.A0z(r1)
            throw r3
        L_0x1036:
            java.lang.IllegalStateException r3 = X.AnonymousClass7TE.A0z(r1)
            throw r3
        L_0x103b:
            r0 = 2130253332(0x7ef91614, float:1.655462E38)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r1.A01
            X.K5g r4 = (X.K5g) r4
            X.0eM r0 = r4.A01
            X.LTH r3 = X.JTO.A0T(r0)
            X.0eM r7 = r4.A03
            java.lang.String r8 = X.C60315JjI.A02(r7)
            X.JjI r0 = X.JTO.A0S(r7)
            boolean r1 = r0.A0J()
            X.JjI r0 = X.JTO.A0S(r7)
            boolean r6 = r0.A0I()
            X.1Ln r5 = X.LTH.A00(r3)
            boolean r0 = X.DbT.A1Y(r5)
            if (r0 == 0) goto L_0x1092
            java.lang.String r0 = "settings_conversation_done_clicked"
            r5.A0l(r0)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r0 = "has_welcome_message_changed"
            X.0eP r3 = X.AnonymousClass7TE.A1L(r0, r1)
            java.lang.String r1 = java.lang.String.valueOf(r6)
            java.lang.String r0 = "has_icebreaker_changed"
            java.util.LinkedHashMap r0 = X.DbY.A0p(r0, r1, r3)
            r5.A0x(r0)
            java.lang.Long r0 = X.DbZ.A0d(r8)
            r5.A0j(r0)
            r5.Cgf()
        L_0x1092:
            X.JjI r1 = X.JTO.A0S(r7)
            X.0Ud r0 = r1.A0D
            java.lang.Object r3 = r0.getValue()
            if (r3 == 0) goto L_0x10b6
            X.JwF r3 = (X.C61077JwF) r3
            com.instagram.aistudio.editor.AiSettingsRepository r1 = r1.A00
            java.lang.Object r0 = r3.A00
            java.util.List r0 = (java.util.List) r0
            r1.A0C(r0)
            java.lang.String r0 = r3.A01
            r1.A0A(r0)
            X.DbT.A1I(r4)
            r0 = 834263569(0x31b9da11, float:5.409E-9)
            goto L_0x1139
        L_0x10b6:
            java.lang.IllegalStateException r3 = X.AnonymousClass7TE.A0y()
            throw r3
        L_0x10bb:
            r0 = 1266417907(0x4b7c00f3, float:1.6515315E7)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r7 = r1.A01
            X.K5f r7 = (X.C61387K5f) r7
            X.0eM r3 = r7.A03
            X.JjI r0 = X.JTO.A0S(r3)
            r0.A07()
            X.0eM r0 = r7.A01
            X.1Ln r1 = X.LTH.A02(r0)
            boolean r0 = X.DbT.A1Y(r1)
            if (r0 == 0) goto L_0x10e3
            java.lang.String r0 = "ai_settings_advanced_settings_done_button_clicked"
            r1.A0l(r0)
            r1.Cgf()
        L_0x10e3:
            X.JjI r1 = X.JTO.A0S(r3)
            X.0Ud r0 = r1.A08
            java.lang.Object r6 = r0.getValue()
            if (r6 == 0) goto L_0x1141
            X.Jvn r6 = (X.C61049Jvn) r6
            com.instagram.aistudio.editor.AiSettingsRepository r5 = r1.A00
            java.util.List r0 = r6.A01
            r5.A0B(r0)
            java.lang.String r0 = r6.A00
            r5.A0A(r0)
            java.util.List r0 = r6.A03
            r5.A0C(r0)
            java.util.List r1 = r6.A04
            r4 = 0
            X.0qQ.A0B(r1, r4)
            X.05G r3 = r5.A08
            java.lang.Object r0 = r3.getValue()
            X.Jvz r0 = (X.C61061Jvz) r0
            if (r0 == 0) goto L_0x113f
            X.Jvz r0 = X.C61061Jvz.A00((X.C61073JwB) null, r0, (com.instagram.common.typedurl.ImageUrl) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, r1, (java.util.List) null, (java.util.List) null, (java.util.List) null, (java.util.List) null, (java.util.List) null, 8386559, false, false)
        L_0x1116:
            r3.Epw(r0)
            com.instagram.aistudio.editor.AiSettingsRepository.A07(r5, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, (java.util.List) null, 255)
            java.util.List r1 = r6.A02
            X.0qQ.A0B(r1, r4)
            java.lang.Object r0 = r3.getValue()
            X.Jvz r0 = (X.C61061Jvz) r0
            if (r0 == 0) goto L_0x113d
            X.Jvz r0 = X.C61061Jvz.A00((X.C61073JwB) null, r0, (com.instagram.common.typedurl.ImageUrl) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, (java.util.List) null, (java.util.List) null, r1, (java.util.List) null, (java.util.List) null, 7864319, false, false)
        L_0x112d:
            r3.Epw(r0)
            com.instagram.aistudio.editor.AiSettingsRepository.A07(r5, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, (java.util.List) null, 255)
            X.DbT.A1I(r7)
            r0 = -192761431(0xfffffffff482b1a9, float:-8.283715E31)
        L_0x1139:
            X.AnonymousClass0fD.A0C(r0, r2)
            return
        L_0x113d:
            r0 = 0
            goto L_0x112d
        L_0x113f:
            r0 = 0
            goto L_0x1116
        L_0x1141:
            java.lang.IllegalStateException r3 = X.AnonymousClass7TE.A0y()
            throw r3
        L_0x1146:
            r0 = 1427606016(0x55178a00, float:1.04136851E13)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            com.instagram.archive.fragment.HighlightsMetadataFragment r1 = (com.instagram.archive.fragment.HighlightsMetadataFragment) r1
            X.KB0 r2 = r1.A00
            if (r2 != 0) goto L_0x115f
            java.lang.String r0 = "controller"
            X.0qQ.A0F(r0)
            X.00P r3 = X.AnonymousClass00P.createAndThrow()
            throw r3
        L_0x115f:
            X.KAC r5 = new X.KAC
            r5.<init>(r2)
            X.0hq r1 = r2.A08
            r1.getClass()
            X.SQH.A02(r1)
            X.LSr r4 = r2.A0A
            X.M5o r3 = new X.M5o
            r3.<init>(r5, r2)
            X.LNo r2 = X.LNo.A00()
            X.Lcy r1 = new X.Lcy
            r1.<init>(r4, r3)
            r2.A01(r1, r5)
            r1 = 504588982(0x1e136ab6, float:7.8041825E-21)
            goto L_0x1194
        L_0x1183:
            r0 = 1826006854(0x6cd6a746, float:2.0760004E27)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.K56 r1 = (X.K56) r1
            X.K56.A01(r1)
            r1 = -1306693463(0xffffffffb21d70a9, float:-9.164219E-9)
        L_0x1194:
            X.AnonymousClass0fD.A0C(r1, r0)
            return
        L_0x1198:
            X.Lnj r0 = r1.A03
            androidx.recyclerview.widget.RecyclerView r1 = r0.A0I
            r0 = 1
            X.C2808154f.A01(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LYC.onClick(android.view.View):void");
    }

    public LYC(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }
}
