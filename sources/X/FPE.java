package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.instagram.modal.ModalActivity;
import com.instagram.model.direct.DirectShareTarget;

public final class FPE implements View.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public FPE(G8F g8f, DirectShareTarget directShareTarget, int i) {
        this.A00 = i;
        if (67 - i != 0) {
            this.A01 = g8f;
            this.A02 = directShareTarget;
            return;
        }
        this.A01 = directShareTarget;
        this.A02 = g8f;
    }

    public static void A00(Context context, Bundle bundle, FPE fpe, String str) {
        AnonymousClass6W8.A06(context, bundle, ModalActivity.class, str);
        ((C331157Pu) fpe.A01).A0L((C332277Ui) null);
    }

    public static void A01(View view, int i, Object obj, Object obj2) {
        AnonymousClass0fU.A00(new FPE(i, obj, obj2), view);
    }

    /* JADX WARNING: type inference failed for: r0v9, types: [X.EmJ, java.lang.Object] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x04b3, code lost:
        if (X.E4V.A01(r4) != X.EV0.A03) goto L_0x04b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x0a9f, code lost:
        r4.A04.A01(r5.A05.toLowerCase());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x0aaa, code lost:
        if (r10 == null) goto L_0x0af4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x0aac, code lost:
        r6 = X.DbY.A08(r10);
        r6.putAll(r4.requireArguments());
        r1 = r4.A04.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x0abb, code lost:
        if (r1 == null) goto L_0x0af9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x0abd, code lost:
        r5 = r1.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x0ac5, code lost:
        if (r5.hasNext() == false) goto L_0x0af9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x0ac7, code lost:
        r2 = (X.F3Q) r5.next();
        r1 = r2.A05;
        X.0qQ.A07(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x0ad6, code lost:
        if (X.C48741EjQ.A00(r1) != r3) goto L_0x0ac1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x0ad8, code lost:
        r2 = "complete".equals(r2.A03);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x0ae0, code lost:
        r6.putBoolean("ARG_CHECKLIST_ITEM_COMPLETED", r2);
        r10.setArguments(r6);
        r4.A01.A00(r10, r4.requireActivity(), r4.A03, r13, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x0af4, code lost:
        r1 = -990054362;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x0af9, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x0b06, code lost:
        r2 = X.AnonymousClass7TE.A0a();
        r2.putString("ARG_TITLE", r7);
        r2.putString("ARG_SUB_TITLE", r6);
        r10.setArguments(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:288:0x0c60, code lost:
        r2.putString(r1, r6);
        r10.setArguments(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:367:0x10ef, code lost:
        if (r1.A04.size() != 1) goto L_0x10f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:416:0x142e, code lost:
        X.AnonymousClass0fD.A0C(r0, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:417:0x1431, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:455:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x033d, code lost:
        if (r1 == 0) goto L_0x033f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0035, code lost:
        X.AnonymousClass0fD.A0C(r1, r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r17) {
        /*
            r16 = this;
            r3 = r16
            int r0 = r3.A00
            r6 = r17
            switch(r0) {
                case 0: goto L_0x10a6;
                case 1: goto L_0x143f;
                case 2: goto L_0x1087;
                case 3: goto L_0x0fc6;
                case 4: goto L_0x0f97;
                case 5: goto L_0x0f66;
                case 6: goto L_0x0f3f;
                case 7: goto L_0x0f22;
                case 8: goto L_0x0ed5;
                case 9: goto L_0x0ec0;
                case 10: goto L_0x0ea5;
                case 11: goto L_0x0e90;
                case 12: goto L_0x13c7;
                case 13: goto L_0x0e45;
                case 14: goto L_0x13b6;
                case 15: goto L_0x0dd0;
                case 16: goto L_0x0d5b;
                case 17: goto L_0x0d42;
                case 18: goto L_0x0c81;
                case 19: goto L_0x0c68;
                case 20: goto L_0x0a76;
                case 21: goto L_0x138c;
                case 22: goto L_0x1415;
                case 23: goto L_0x1375;
                case 24: goto L_0x0a03;
                case 25: goto L_0x1342;
                case 26: goto L_0x0979;
                case 27: goto L_0x12bb;
                case 28: goto L_0x0900;
                case 29: goto L_0x08bf;
                case 30: goto L_0x1293;
                case 31: goto L_0x089c;
                case 32: goto L_0x1262;
                case 33: goto L_0x1245;
                case 34: goto L_0x13f1;
                case 35: goto L_0x0858;
                case 36: goto L_0x0800;
                case 37: goto L_0x122e;
                case 38: goto L_0x1215;
                case 39: goto L_0x11fc;
                case 40: goto L_0x11df;
                case 41: goto L_0x0791;
                case 42: goto L_0x0762;
                case 43: goto L_0x073b;
                case 44: goto L_0x0620;
                case 45: goto L_0x05fc;
                case 46: goto L_0x057e;
                case 47: goto L_0x048a;
                case 48: goto L_0x0458;
                case 49: goto L_0x0441;
                case 50: goto L_0x042a;
                case 51: goto L_0x02bf;
                case 52: goto L_0x02aa;
                case 53: goto L_0x11be;
                case 54: goto L_0x028d;
                case 55: goto L_0x0273;
                case 56: goto L_0x0208;
                case 57: goto L_0x01f1;
                case 58: goto L_0x01da;
                case 59: goto L_0x01c3;
                case 60: goto L_0x01ac;
                case 61: goto L_0x0117;
                case 62: goto L_0x00f1;
                case 63: goto L_0x00cf;
                case 64: goto L_0x00a9;
                case 65: goto L_0x0084;
                case 66: goto L_0x0063;
                case 67: goto L_0x0051;
                case 68: goto L_0x11b2;
                case 69: goto L_0x0039;
                default: goto L_0x0009;
            }
        L_0x0009:
            r0 = 565174566(0x21afe126, float:1.1918058E-18)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r3.A02
            X.E6j r2 = (X.C47523E6j) r2
            X.G8t r1 = X.C49047EoR.A00(r2)
            if (r1 == 0) goto L_0x002a
            X.FBf r5 = X.C49881FBf.A00
            X.0eM r1 = r2.A0S
            X.0lg r4 = X.DbT.A0X(r1)
            X.DiE r1 = r2.A04
            java.lang.String r2 = r1.A01
            r1 = 0
            r5.A00(r4, r1, r2)
        L_0x002a:
            java.lang.Object r2 = r3.A01
            X.G8t r2 = (X.C51950G8t) r2
            r1 = 1
            r2.Cm0(r1)
            r1 = 175752169(0xa79c3e9, float:1.20257605E-32)
        L_0x0035:
            X.AnonymousClass0fD.A0C(r1, r0)
        L_0x0038:
            return
        L_0x0039:
            r0 = -1943993683(0xffffffff8c2102ad, float:-1.2403794E-31)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r3.A02
            X.Dp6 r2 = (X.C47014Dp6) r2
            int r1 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            X.0sP r2 = r2.A05
            java.lang.Object r1 = r3.A01
            r2.invoke(r1)
            r1 = -576415564(0xffffffffdda498b4, float:-1.48255344E18)
            goto L_0x0035
        L_0x0051:
            java.lang.Object r2 = r3.A01
            com.instagram.model.direct.DirectShareTarget r2 = (com.instagram.model.direct.DirectShareTarget) r2
            java.lang.Object r1 = r3.A02
            X.G8F r1 = (X.G8F) r1
            boolean r0 = r2.A0I()
            if (r0 == 0) goto L_0x0038
            r1.Dbo(r2)
            return
        L_0x0063:
            r0 = -1950088252(0xffffffff8bc403c4, float:-7.550212E-32)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r3.A02
            X.FGW r5 = (X.FGW) r5
            X.F9w r2 = r5.A03
            java.lang.String r1 = "message_setting_welcome_message_click"
            X.C49856F9w.A00(r2, r1)
            android.os.Bundle r4 = X.AnonymousClass7TE.A0a()
            androidx.fragment.app.FragmentActivity r2 = r5.A00
            java.lang.String r1 = "direct_greeting_setting_fragment"
            A00(r2, r4, r3, r1)
            r1 = -1698183076(0xffffffff9ac7c85c, float:-8.262817E-23)
            goto L_0x0035
        L_0x0084:
            r0 = -57353697(0xfffffffffc94da1f, float:-6.1830717E36)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r3.A02
            X.FGW r5 = (X.FGW) r5
            X.F9w r2 = r5.A03
            java.lang.String r1 = "message_setting_saved_replies_click"
            X.C49856F9w.A00(r2, r1)
            android.os.Bundle r4 = X.AnonymousClass7TE.A0a()
            androidx.fragment.app.FragmentActivity r2 = r5.A00
            r1 = 2263(0x8d7, float:3.171E-42)
            java.lang.String r1 = X.C273654mx.A00(r1)
            A00(r2, r4, r3, r1)
            r1 = 1278184261(0x4c2f8b45, float:4.6017812E7)
            goto L_0x0035
        L_0x00a9:
            r0 = 590213053(0x232defbd, float:9.429115E-18)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r3.A02
            X.FGW r5 = (X.FGW) r5
            X.F9w r2 = r5.A03
            java.lang.String r1 = "message_settings_response_suggestions_click"
            X.C49856F9w.A00(r2, r1)
            android.os.Bundle r4 = X.AnonymousClass7TE.A0a()
            androidx.fragment.app.FragmentActivity r2 = r5.A00
            r1 = 2264(0x8d8, float:3.173E-42)
            java.lang.String r1 = X.C273654mx.A00(r1)
            A00(r2, r4, r3, r1)
            r1 = -798841445(0xffffffffd062a59b, float:-1.52100157E10)
            goto L_0x0035
        L_0x00cf:
            r0 = 1745795816(0x680ebae8, float:2.6960954E24)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r3.A02
            X.FGW r5 = (X.FGW) r5
            X.F9w r2 = r5.A03
            java.lang.String r1 = "message_setting_message_control_click"
            X.C49856F9w.A00(r2, r1)
            android.os.Bundle r4 = X.AnonymousClass7TE.A0a()
            androidx.fragment.app.FragmentActivity r2 = r5.A00
            java.lang.String r1 = "direct_message_options"
            A00(r2, r4, r3, r1)
            r1 = 131368146(0x7d484d2, float:3.197628E-34)
            goto L_0x0035
        L_0x00f1:
            r0 = -1302184208(0xffffffffb2623ef0, float:-1.3169242E-8)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r3.A02
            X.FGW r5 = (X.FGW) r5
            X.F9w r2 = r5.A03
            java.lang.String r1 = "message_setting_icebreaker_click"
            X.C49856F9w.A00(r2, r1)
            android.os.Bundle r4 = X.AnonymousClass7TE.A0a()
            androidx.fragment.app.FragmentActivity r2 = r5.A00
            r1 = 265(0x109, float:3.71E-43)
            java.lang.String r1 = X.C273654mx.A00(r1)
            A00(r2, r4, r3, r1)
            r1 = -1674642006(0xffffffff9c2efdaa, float:-5.7899624E-22)
            goto L_0x0035
        L_0x0117:
            r0 = -175148541(0xfffffffff58f7203, float:-3.636772E32)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r3.A02
            X.Dfx r1 = (X.C46494Dfx) r1
            X.MjN r4 = r1.A00
            java.lang.Object r1 = r3.A01
            X.Dg4 r1 = (X.C46501Dg4) r1
            java.lang.String r2 = r1.A01
            r13 = 0
            X.0qQ.A0B(r2, r13)
            java.lang.String r1 = "suggested_accounts_to_follow"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x015d
            android.os.Bundle r5 = X.AnonymousClass7TE.A0a()
            java.lang.String r2 = "entry_point"
            java.lang.String r1 = "direct_suggestions_unit"
            r5.putString(r2, r1)
            X.Ma2 r1 = r4.A00
            com.instagram.common.session.UserSession r4 = r1.A0p()
            java.lang.Class<com.instagram.modal.ModalActivity> r3 = com.instagram.modal.ModalActivity.class
            X.4DH r6 = r1.A1J
            androidx.fragment.app.FragmentActivity r2 = r6.requireActivity()
            java.lang.String r1 = "account_discovery"
            X.6W8 r1 = X.DbS.A0b(r2, r5, r4, r3, r1)
        L_0x0155:
            X.DbT.A1L(r6, r1)
        L_0x0158:
            r1 = -1556257506(0xffffffffa33d651e, float:-1.0267123E-17)
            goto L_0x0035
        L_0x015d:
            r1 = 1034(0x40a, float:1.449E-42)
            java.lang.String r1 = X.C66579MXk.A00(r1)
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0158
            X.Df5 r2 = X.C46443Df5.FOLLOWERS
            X.Ma2 r6 = r4.A00
            com.instagram.common.session.UserSession r1 = r6.A0p()
            java.lang.String r1 = r1.A06
            r11 = 0
            com.instagram.user.recommended.FollowListData r10 = X.C46451DfE.A00(r2, r1, r11, r13)
            com.instagram.common.session.UserSession r1 = r6.A0p()
            X.17i r2 = X.17h.A00(r1)
            com.instagram.common.session.UserSession r1 = r6.A0p()
            java.lang.String r1 = r1.A06
            com.instagram.user.model.User r9 = r2.A02(r1)
            if (r9 == 0) goto L_0x149d
            com.instagram.common.session.UserSession r5 = r6.A0p()
            java.lang.Class<com.instagram.modal.ModalActivity> r4 = com.instagram.modal.ModalActivity.class
            X.1YF r7 = X.C46339Dch.A01()
            com.instagram.common.session.UserSession r8 = r6.A0p()
            r12 = r11
            android.os.Bundle r3 = r7.ANE(r8, r9, r10, r11, r12, r13)
            X.4DH r6 = r6.A1J
            androidx.fragment.app.FragmentActivity r2 = r6.requireActivity()
            java.lang.String r1 = "unified_follow_list"
            X.6W8 r1 = X.DbS.A0b(r2, r3, r5, r4, r1)
            goto L_0x0155
        L_0x01ac:
            r0 = -452981888(0xffffffffe5000b80, float:-3.779219E22)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r3.A02
            X.EH7 r1 = (X.EH7) r1
            X.0sP r2 = r1.A00
            java.lang.Object r1 = r3.A01
            r2.invoke(r1)
            r1 = -2105816283(0xffffffff827bcb25, float:-1.8498867E-37)
            goto L_0x0035
        L_0x01c3:
            r0 = 76767020(0x4935f2c, float:3.4646935E-36)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r3.A02
            X.EH7 r1 = (X.EH7) r1
            X.0sP r2 = r1.A00
            java.lang.Object r1 = r3.A01
            r2.invoke(r1)
            r1 = -87830461(0xfffffffffac3d043, float:-5.0836097E35)
            goto L_0x0035
        L_0x01da:
            r0 = 264220701(0xfbfb01d, float:1.890189E-29)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r3.A01
            X.5nB r2 = (X.C294875nB) r2
            java.lang.Object r1 = r3.A02
            com.instagram.model.direct.DirectShareTarget r1 = (com.instagram.model.direct.DirectShareTarget) r1
            r2.D9P(r1)
            r1 = -1636230806(0xffffffff9e79196a, float:-1.3187206E-20)
            goto L_0x0035
        L_0x01f1:
            r0 = -1802492523(0xffffffff94902595, float:-1.4555108E-26)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r3.A01
            X.5nB r2 = (X.C294875nB) r2
            java.lang.Object r1 = r3.A02
            com.instagram.model.direct.DirectShareTarget r1 = (com.instagram.model.direct.DirectShareTarget) r1
            r2.D8N(r1)
            r1 = 204410302(0xc2f0dbe, float:1.3485645E-31)
            goto L_0x0035
        L_0x0208:
            r0 = -1980814734(0xffffffff89ef2a72, float:-5.7577072E-33)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r3.A02
            X.NJY r5 = (X.NJY) r5
            boolean r1 = X.NJY.A0L(r5)
            com.instagram.common.session.UserSession r4 = r5.A0N()
            if (r1 == 0) goto L_0x0265
            r1 = 635(0x27b, float:8.9E-43)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            r8 = 0
            X.0qQ.A0B(r4, r8)
            com.instagram.simplewebview.SimpleWebViewConfig r3 = X.Dba.A0N(r1)
            android.os.Bundle r2 = X.AnonymousClass7TE.A0a()
            java.lang.String r1 = "SimpleWebViewFragment.SIMPLE_WEB_VIEW_CONFIG"
            r2.putParcelable(r1, r3)
            X.DbU.A1D(r2, r4)
            X.R8R r3 = new X.R8R
            r3.<init>()
            r3.setArguments(r2)
            X.37E r1 = X.AnonymousClass37D.A00
            X.37D r1 = X.DbV.A0g(r5, r1)
            X.7Pu r2 = X.C48943Emh.A00(r1)
            com.instagram.common.session.UserSession r1 = r5.A0N()
            X.7Pr r4 = X.DbS.A0W(r1)
            r5 = 1
            X.Lys r1 = new X.Lys
            r1.<init>(r3, r5)
            r4.A0T = r1
            if (r2 == 0) goto L_0x0260
            r6 = r5
            r7 = r5
            r2.A0H(r3, r4, r5, r6, r7, r8)
        L_0x0260:
            r1 = -1702488382(0xffffffff9a8616c2, float:-5.545787E-23)
            goto L_0x0035
        L_0x0265:
            androidx.fragment.app.FragmentActivity r2 = r5.requireActivity()
            r1 = 635(0x27b, float:8.9E-43)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            X.C49845F9k.A00(r2, r4, r1)
            goto L_0x0260
        L_0x0273:
            r0 = 783753442(0x2eb720e2, float:8.327718E-11)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r3.A01
            android.view.View r2 = (android.view.View) r2
            X.0qQ.A0A(r2)
            java.lang.Object r1 = r3.A02
            X.6iJ r1 = (X.C314466iJ) r1
            X.Dbc.A0O(r2, r1)
            r1 = -1914839691(0xffffffff8ddddd75, float:-1.367349E-30)
            goto L_0x0035
        L_0x028d:
            r0 = -82184726(0xfffffffffb19f5ea, float:-7.9940915E35)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r3.A01
            X.G4t r1 = (X.G4t) r1
            java.lang.Object r2 = r3.A02
            com.instagram.model.direct.DirectShareTarget r2 = (com.instagram.model.direct.DirectShareTarget) r2
            X.Fb0 r1 = (X.Fb0) r1
            X.EIn r1 = r1.A01
            X.G9Z r1 = r1.A0B
            r1.D8y(r2)
            r1 = -685400708(0xffffffffd7259d7c, float:-1.82095809E14)
            goto L_0x0035
        L_0x02aa:
            r0 = 493274669(0x1d66c62d, float:3.0542701E-21)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r3.A01
            X.0sP r2 = (X.0sP) r2
            java.lang.Object r1 = r3.A02
            r2.invoke(r1)
            r1 = -176805355(0xfffffffff5762a15, float:-3.1205043E32)
            goto L_0x0035
        L_0x02bf:
            java.lang.Object r10 = r3.A01
            X.E5H r10 = (X.E5H) r10
            java.lang.Object r9 = r3.A02
            X.EZi r9 = (X.C48140EZi) r9
            X.EEP r0 = r10.A0A
            boolean r0 = r0.A0S()
            r2 = 1
            if (r0 == 0) goto L_0x030e
            X.EEP r0 = r10.A0A
            int r0 = X.EEP.A00(r0)
            if (r0 != r2) goto L_0x030e
            X.EEP r3 = r10.A0A
            java.util.List r0 = r3.A0N()
            java.lang.Object r1 = X.AnonymousClass7TE.A13(r0)
            com.instagram.model.direct.DirectShareTarget r1 = (com.instagram.model.direct.DirectShareTarget) r1
            boolean r0 = r3.A0x
            boolean r0 = r1.A0b(r0)
            if (r0 != 0) goto L_0x030e
            boolean r0 = r3.A0t
            boolean r0 = r1.A0a(r0)
            if (r0 == 0) goto L_0x030e
            X.G9Y r0 = r3.A0m
            android.content.Context r0 = r0.requireContext()
            X.8ab r1 = X.DbS.A0Y(r0)
            r0 = 2131958710(0x7f131bb6, float:1.955404E38)
            r1.A09(r0)
            r0 = 2131958709(0x7f131bb5, float:1.9554038E38)
            r1.A08(r0)
            X.Dba.A1L(r1)
            return
        L_0x030e:
            X.EEP r7 = r10.A0A
            java.util.List r1 = r7.A0N()
            int r0 = r1.size()
            r6 = 0
            if (r0 <= r2) goto L_0x03bd
            com.instagram.common.session.UserSession r5 = r7.A0g
            java.util.ArrayList r0 = X.FFJ.A00(r5, r1)
            java.util.Iterator r8 = r0.iterator()
        L_0x0325:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x03bd
            com.instagram.user.model.User r3 = X.DbT.A0k(r8)
            java.lang.Integer r0 = r3.Bjj()
            if (r0 == 0) goto L_0x033f
            int r1 = r0.intValue()
            r0 = 5
            if (r1 == r0) goto L_0x033f
            r0 = 1
            if (r1 != 0) goto L_0x0340
        L_0x033f:
            r0 = 0
        L_0x0340:
            r4 = 0
            if (r0 == 0) goto L_0x0377
            X.G9Y r0 = r7.A0m
            android.content.Context r0 = r0.requireContext()
            X.8ab r2 = X.DbS.A0Y(r0)
            X.0Tu r0 = X.0Tu.A05
            boolean r1 = X.182.A05(r0, r5)
            r0 = 2131958585(0x7f131b39, float:1.9553786E38)
            if (r1 == 0) goto L_0x035b
            r0 = 2131958583(0x7f131b37, float:1.9553782E38)
        L_0x035b:
            r2.A09(r0)
            r0 = 2131958584(0x7f131b38, float:1.9553784E38)
            r2.A08(r0)
            r0 = 2131956164(0x7f1311c4, float:1.9548876E38)
            X.Dba.A0t(r4, r2, r0)
            X.9tO r2 = X.C391629tO.A0T
            boolean r1 = r7.A0U
            X.FUj r0 = new X.FUj
            r0.<init>(r7)
            X.C3265677h.A06(r2, r0, r5, r4, r1)
            return
        L_0x0377:
            boolean r0 = r3.A2C()
            if (r0 != 0) goto L_0x0325
            X.0Tu r3 = X.0Tu.A05
            r0 = 36325403165471676(0x810dc3000033bc, double:3.03566946027778E-306)
            boolean r0 = X.182.A06(r3, r5, r0)
            if (r0 == 0) goto L_0x0325
            X.G9Y r3 = r7.A0m
            android.content.Context r0 = r3.requireContext()
            X.8ab r1 = X.DbS.A0Y(r0)
            r0 = 2131959424(0x7f131e80, float:1.9555488E38)
            r1.A09(r0)
            r0 = 2131959425(0x7f131e81, float:1.955549E38)
            r1.A08(r0)
            r0 = 2131956164(0x7f1311c4, float:1.9548876E38)
            X.Dba.A0t(r4, r1, r0)
            X.EZi r2 = r7.A06
            X.0wc r1 = X.DbT.A0Q(r3, r5, r6)
            java.lang.String r0 = "direct_group_creation_unreachable_generic_group_dialog_shown"
            X.0Aj r0 = X.AnonymousClass7TE.A0e(r1, r0)
            if (r2 != 0) goto L_0x03b6
            X.EZi r2 = X.C48140EZi.UNKNOWN
        L_0x03b6:
            X.DbS.A1F(r2, r0)
            r0.Cgf()
            return
        L_0x03bd:
            X.DbZ.A1Y(r10)
            X.EEP r0 = r10.A0A
            java.util.List r4 = r0.A0N()
            X.2Ep r1 = r10.A0B
            int r0 = r4.size()
            if (r0 <= r2) goto L_0x0428
            if (r1 == 0) goto L_0x0428
            java.lang.String r0 = r1.C6C()
            if (r0 == 0) goto L_0x0428
            boolean r0 = r10.A0R
            if (r0 == 0) goto L_0x0428
            java.lang.String r14 = r1.C6C()
        L_0x03de:
            int r0 = r4.size()
            if (r0 <= r2) goto L_0x14a2
            if (r14 != 0) goto L_0x14a2
            X.EEP r0 = r10.A0A
            boolean r5 = r0.A0S()
            X.DbZ.A1Y(r10)
            com.instagram.common.session.UserSession r3 = r10.A04
            java.lang.String r2 = X.DbV.A0s()
            java.lang.String r1 = X.E5H.A02(r10, r4)
            java.util.ArrayList r0 = X.FFJ.A02(r4)
            X.0qQ.A0B(r3, r6)
            X.1OC r3 = com.instagram.direct.request.DirectThreadApi.A0D(r3, r2, r1, r0)
            com.instagram.common.session.UserSession r2 = r10.A04
            r1 = 2
            X.NHz r0 = new X.NHz
            r0.<init>(r2, r9, r10, r1)
            r3.A00 = r0
            X.1ES.A03(r3)
            X.E5H.A0C(r10, r4, r5)
            java.lang.String r0 = X.E5H.A02(r10, r4)
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0038
            com.instagram.common.session.UserSession r2 = r10.A04
            X.EZa r1 = X.EZa.THREAD_CREATION
            java.lang.String r0 = ""
            X.C3265677h.A07(r1, r9, r10, r2, r0)
            return
        L_0x0428:
            r14 = 0
            goto L_0x03de
        L_0x042a:
            r0 = -1348311753(0xffffffffafa26537, float:-2.9539546E-10)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r3.A02
            X.EH5 r1 = (X.EH5) r1
            X.0sP r2 = r1.A00
            java.lang.Object r1 = r3.A01
            r2.invoke(r1)
            r1 = 1873886841(0x6fb13e79, float:1.0970874E29)
            goto L_0x0035
        L_0x0441:
            r0 = 376526880(0x16715820, float:1.9495632E-25)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r3.A02
            X.EH5 r1 = (X.EH5) r1
            X.0sP r2 = r1.A00
            java.lang.Object r1 = r3.A01
            r2.invoke(r1)
            r1 = 336149604(0x14093c64, float:6.928642E-27)
            goto L_0x0035
        L_0x0458:
            r0 = 80829558(0x4d15c76, float:4.9220576E-36)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r3.A02
            X.EG3 r1 = (X.EG3) r1
            X.Etk r2 = r1.A01
            java.lang.Object r1 = r3.A01
            X.Dtc r1 = (X.C47251Dtc) r1
            java.lang.String r5 = r1.A03
            r1 = 0
            X.0qQ.A0B(r5, r1)
            X.E7K r3 = r2.A00
            X.0eM r1 = r3.A01
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r1)
            androidx.fragment.app.FragmentActivity r2 = r3.requireActivity()
            r1 = 648(0x288, float:9.08E-43)
            java.lang.String r6 = X.C273654mx.A00(r1)
            r7 = 0
            X.OP8.A00(r2, r3, r4, r5, r6, r7)
            r1 = 1730755721(0x67293c89, float:7.991966E23)
            goto L_0x0035
        L_0x048a:
            r0 = 608114293(0x243f1675, float:4.1435545E-17)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r3.A02
            X.E4V r4 = (X.E4V) r4
            X.DkL r1 = X.E4V.A00(r4)
            X.0Ud r1 = r1.A0G
            java.lang.Object r6 = r1.getValue()
            X.EWM r6 = (X.EWM) r6
            X.DkL r1 = X.E4V.A00(r4)
            int r2 = X.C46732DkL.A00(r1)
            r1 = 2
            if (r2 != r1) goto L_0x04b5
            X.EV0 r5 = X.E4V.A01(r4)
            X.EV0 r1 = X.EV0.Social
            r2 = 1
            if (r5 == r1) goto L_0x04b6
        L_0x04b5:
            r2 = 0
        L_0x04b6:
            java.lang.Object r1 = r3.A01
            X.Etj r1 = (X.C49328Etj) r1
            r11 = 0
            X.AnonymousClass7TF.A1H(r6, r1)
            X.E1q r5 = new X.E1q
            r5.<init>()
            r5.A00 = r1
            r5.A01 = r6
            r5.A02 = r2
            X.0eM r1 = r4.A0G
            X.7Pr r3 = X.DbX.A0f(r1)
            r8 = 0
            java.lang.String r10 = ""
            X.7Ps r7 = new X.7Ps
            r9 = r8
            r12 = r11
            r7.<init>(r8, r9, r10, r11, r12)
            r1 = 2131959352(0x7f131e38, float:1.9555342E38)
            java.lang.String r1 = r4.getString(r1)
            r7.A06 = r1
            r1 = 38
            X.FPI r1 = X.FPI.A00(r4, r1)
            r7.A05 = r1
            X.7Pt r1 = r7.A00()
            r3.A0R = r1
            X.7Ps r7 = new X.7Ps
            r7.<init>(r8, r9, r10, r11, r12)
            r1 = 2131959349(0x7f131e35, float:1.9555336E38)
            java.lang.String r1 = r4.getString(r1)
            r7.A06 = r1
            r2 = 46
            X.FPE r1 = new X.FPE
            r1.<init>((int) r2, (java.lang.Object) r6, (java.lang.Object) r4)
            r7.A05 = r1
            X.7Pt r1 = r7.A00()
            r3.A0Q = r1
            r1 = 2131959353(0x7f131e39, float:1.9555344E38)
            java.lang.String r1 = r4.getString(r1)
            r3.A0d = r1
            X.DbY.A13(r4, r5, r3)
            X.EV0 r2 = X.E4V.A01(r4)
            X.EV0 r1 = X.EV0.Broadcast
            if (r2 != r1) goto L_0x054d
            X.0eM r1 = r4.A0F
            X.6gx r2 = X.DbZ.A0R(r1)
            X.1Ln r3 = X.DbT.A0J(r2)
            boolean r1 = X.DbT.A1Y(r3)
            if (r1 == 0) goto L_0x0548
            com.instagram.common.session.UserSession r1 = r2.A04
            X.Dbb.A1G(r3, r1)
            java.lang.String r1 = "channel_duration_sheet_rendered"
            X.DbV.A1M(r3, r1)
            java.lang.String r1 = "channel_options"
            X.Dbb.A1H(r3, r1)
            java.lang.String r1 = r2.A01
        L_0x0542:
            r3.A0v(r1)
            r3.Cgf()
        L_0x0548:
            r1 = -161037806(0xfffffffff666c212, float:-1.1700825E33)
            goto L_0x0035
        L_0x054d:
            X.EV0 r2 = X.E4V.A01(r4)
            X.EV0 r1 = X.EV0.Social
            if (r2 != r1) goto L_0x0548
            X.0eM r1 = r4.A0H
            java.lang.Object r2 = r1.getValue()
            X.FYv r2 = (X.C50338FYv) r2
            X.1Ln r3 = X.C50338FYv.A00(r2)
            boolean r1 = X.DbT.A1Y(r3)
            if (r1 == 0) goto L_0x0548
            com.instagram.common.session.UserSession r1 = r2.A03
            X.Dbb.A1G(r3, r1)
            java.lang.String r1 = "channel_duration_sheet_rendered"
            X.DbV.A1M(r3, r1)
            java.lang.String r1 = "channel_options"
            r3.A0p(r1)
            java.lang.String r1 = "chat_setup"
            X.Dba.A1E(r3, r1)
            java.lang.String r1 = r2.A00
            goto L_0x0542
        L_0x057e:
            r0 = 642654481(0x264e2111, float:7.151542E-16)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r3.A02
            X.E4V r4 = (X.E4V) r4
            X.DkL r1 = X.E4V.A00(r4)
            java.lang.Object r2 = r3.A01
            X.05G r1 = r1.A0A
            r1.Epw(r2)
            X.DbT.A1J(r4)
            X.EV0 r2 = X.E4V.A01(r4)
            X.EV0 r1 = X.EV0.Broadcast
            if (r2 != r1) goto L_0x05cb
            X.0eM r1 = r4.A0F
            X.6gx r2 = X.DbZ.A0R(r1)
            X.1Ln r3 = X.DbT.A0J(r2)
            boolean r1 = X.DbT.A1Y(r3)
            if (r1 == 0) goto L_0x05c6
            com.instagram.common.session.UserSession r1 = r2.A04
            X.Dbb.A1G(r3, r1)
            java.lang.String r1 = "set_channel_duration_cancel"
            X.DbV.A1M(r3, r1)
            java.lang.String r1 = "channel_duration_sheet"
            X.Dbb.A1H(r3, r1)
            java.lang.String r1 = r2.A01
        L_0x05c0:
            r3.A0v(r1)
            r3.Cgf()
        L_0x05c6:
            r1 = -2027533263(0xffffffff87264c31, float:-1.2510843E-34)
            goto L_0x0035
        L_0x05cb:
            X.EV0 r2 = X.E4V.A01(r4)
            X.EV0 r1 = X.EV0.Social
            if (r2 != r1) goto L_0x05c6
            X.0eM r1 = r4.A0H
            java.lang.Object r2 = r1.getValue()
            X.FYv r2 = (X.C50338FYv) r2
            X.1Ln r3 = X.C50338FYv.A00(r2)
            boolean r1 = X.DbT.A1Y(r3)
            if (r1 == 0) goto L_0x05c6
            com.instagram.common.session.UserSession r1 = r2.A03
            X.Dbb.A1G(r3, r1)
            java.lang.String r1 = "set_channel_duration_cancel"
            X.DbV.A1M(r3, r1)
            java.lang.String r1 = "channel_duration_sheet"
            r3.A0p(r1)
            java.lang.String r1 = "chat_setup"
            X.Dba.A1E(r3, r1)
            java.lang.String r1 = r2.A00
            goto L_0x05c0
        L_0x05fc:
            r0 = 901782458(0x35c01bba, float:1.4313184E-6)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r6 = r3.A02
            X.Dm4 r6 = (X.C46828Dm4) r6
            com.instagram.common.session.UserSession r5 = r6.A01
            com.instagram.direct.channels.analytics.ChannelCreationSource r4 = r6.A03
            java.lang.Object r3 = r3.A01
            X.EV0 r3 = (X.EV0) r3
            com.instagram.creatormessaging.intf.ChannelCreationFlowExtraArgs r2 = r6.A02
            r1 = 1
            X.G6v r2 = X.FC2.A01(r5, r2, r4, r3, r1)
            androidx.fragment.app.FragmentActivity r1 = r6.A00
            r2.CfS(r1)
            r1 = -52339351(0xfffffffffce15d69, float:-9.361291E36)
            goto L_0x0035
        L_0x0620:
            r0 = 489955612(0x1d34211c, float:2.3839919E-21)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r3.A02
            X.EGF r1 = (X.EGF) r1
            X.E12 r9 = r1.A02
            java.lang.Object r2 = r3.A01
            X.DtX r2 = (X.C47246DtX) r2
            r8 = 0
            java.lang.String r12 = r2.A05
            java.lang.Integer r4 = r2.A04
            java.lang.String r5 = "Required value was null."
            if (r4 == 0) goto L_0x14c6
            int r3 = r4.intValue()
            boolean r1 = X.AnonymousClass48O.A02(r3)
            r6 = 1
            if (r1 == 0) goto L_0x06a8
            X.37D r1 = X.DbX.A0i(r9)
            if (r1 == 0) goto L_0x14c1
            androidx.fragment.app.Fragment r3 = r1.A09()
            r1 = 1633(0x661, float:2.288E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            X.0qQ.A0C(r3, r1)
            com.instagram.igds.components.bottomsheet.BottomSheetFragment r3 = (com.instagram.igds.components.bottomsheet.BottomSheetFragment) r3
            X.7Pu r7 = r3.A02
            if (r7 == 0) goto L_0x14bc
            X.0eM r1 = r9.A02
            java.lang.Object r1 = r1.getValue()
            X.Dke r1 = (X.C46751Dke) r1
            X.17i r3 = r1.A00
            java.lang.String r1 = r1.A01
            com.instagram.user.model.User r1 = r3.A02(r1)
            if (r1 == 0) goto L_0x06a0
            X.4Cl r1 = r1.A03
            com.instagram.api.schemas.FanClubInfoDict r1 = r1.B3v()
            if (r1 == 0) goto L_0x06a0
            java.lang.String r5 = r1.getFanClubId()
            if (r5 == 0) goto L_0x06a0
            X.Fb1 r4 = new X.Fb1
            r4.<init>(r8, r9, r7)
            java.lang.String r3 = r2.A08
            X.NjJ r2 = X.C69318NjJ.PROFILE
            r1 = 0
            X.NKN r2 = X.C71045OaN.A02(r2, r4, r3, r5, r1)
            r7.A05()
            X.0eM r1 = r9.A01
            X.7Pr r1 = X.DbX.A0f(r1)
            X.DbS.A1S(r1, r6)
            r7.A0F(r2, r1)
        L_0x069b:
            r1 = -440275103(0xffffffffe5c1ef61, float:-1.1447906E23)
            goto L_0x0035
        L_0x06a0:
            android.content.Context r1 = r9.requireContext()
            X.FGM.A01(r1)
            goto L_0x069b
        L_0x06a8:
            r1 = 29
            if (r3 != r1) goto L_0x06e1
            X.1as r7 = X.1as.A04
            X.0eM r1 = r9.A01
            com.instagram.common.session.UserSession r10 = X.AnonymousClass7TE.A0l(r1)
            androidx.fragment.app.FragmentActivity r8 = r9.requireActivity()
            java.lang.String r11 = r2.A08
            X.0eM r1 = r9.A02
            java.lang.Object r1 = r1.getValue()
            X.Dke r1 = (X.C46751Dke) r1
            java.lang.String r13 = r1.A01
            X.47m r1 = r2.A00
            if (r1 == 0) goto L_0x06df
            int r15 = r1.AdN()
        L_0x06cc:
            android.os.Bundle r3 = r9.requireArguments()
            java.lang.String r2 = "ChannelsListFragment.ENTRY_POINT"
            r1 = 0
            java.lang.String r14 = r3.getString(r2, r1)
            if (r14 != 0) goto L_0x06db
            java.lang.String r14 = "channel_link_bottom_sheet"
        L_0x06db:
            r7.A03(r8, r9, r10, r11, r12, r13, r14, r15)
            goto L_0x069b
        L_0x06df:
            r15 = 1
            goto L_0x06cc
        L_0x06e1:
            if (r12 == 0) goto L_0x0732
            android.os.Bundle r3 = r9.requireArguments()
            java.lang.String r2 = "ChannelsListFragment.ENTRY_POINT"
            r1 = 0
            java.lang.String r2 = r3.getString(r2, r1)
            if (r2 != 0) goto L_0x06f2
            java.lang.String r2 = "channel_link_bottom_sheet"
        L_0x06f2:
            java.lang.String r1 = "s"
            android.util.Pair r5 = new android.util.Pair
            r5.<init>(r1, r2)
            java.lang.String r2 = r4.toString()
            java.lang.String r1 = "st"
            android.util.Pair r4 = new android.util.Pair
            r4.<init>(r1, r2)
            X.0eM r1 = r9.A02
            java.lang.Object r1 = r1.getValue()
            X.Dke r1 = (X.C46751Dke) r1
            java.lang.String r3 = r1.A01
            java.lang.String r2 = "cid"
            android.util.Pair r1 = new android.util.Pair
            r1.<init>(r2, r3)
            android.util.Pair[] r1 = new android.util.Pair[]{r5, r4, r1}
            java.util.List r1 = X.0sr.A1P(r1)
            java.lang.String r4 = X.OXO.A01(r12, r1)
            androidx.fragment.app.FragmentActivity r3 = r9.requireActivity()
            X.0eM r1 = r9.A01
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r1)
            java.lang.String r1 = "channels_sheet"
            X.FH7.A0B(r3, r2, r4, r1)
            goto L_0x069b
        L_0x0732:
            java.lang.String r2 = "ChannelsListFragment"
            java.lang.String r1 = "Invite link was not present on channel preview object."
            X.0wb.A03(r2, r1)
            goto L_0x069b
        L_0x073b:
            r0 = -745841462(0xffffffffd38b5cca, float:-1.19711439E12)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r6 = r3.A02
            X.E0k r6 = (X.C47392E0k) r6
            X.0eM r1 = r6.A00
            com.instagram.common.session.UserSession r5 = X.AnonymousClass7TE.A0l(r1)
            androidx.fragment.app.FragmentActivity r4 = r6.requireActivity()
            java.lang.Object r1 = r3.A01
            java.lang.String r2 = r1.toString()
            r1 = 0
            X.C49951FGg.A00(r4, r1, r5, r2, r1)
            X.DbX.A1I(r6)
            r1 = -242749678(0xfffffffff187ef12, float:-1.3462238E30)
            goto L_0x0035
        L_0x0762:
            r0 = 2057817447(0x7aa7cd67, float:4.356398E35)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r6 = r3.A01
            X.Nml r1 = X.C69503Nml.A0E
            if (r6 != r1) goto L_0x0785
            java.lang.Object r2 = r3.A02
            X.E0k r2 = (X.C47392E0k) r2
            X.0eM r1 = r2.A00
            com.instagram.common.session.UserSession r5 = X.AnonymousClass7TE.A0l(r1)
            androidx.fragment.app.FragmentActivity r4 = r2.requireActivity()
            java.lang.String r2 = r6.toString()
            r1 = 0
            X.C49951FGg.A00(r4, r1, r5, r2, r1)
        L_0x0785:
            java.lang.Object r1 = r3.A02
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            X.DbX.A1I(r1)
            r1 = 2051847621(0x7a4cb5c5, float:2.6572882E35)
            goto L_0x0035
        L_0x0791:
            r0 = 664189201(0x2796b911, float:4.1834013E-15)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r6 = r3.A02
            X.F0C r6 = (X.F0C) r6
            com.instagram.common.session.UserSession r5 = r6.A01
            X.1Av r4 = X.1Au.A00(r5)
            java.lang.String r2 = "meta_ai_in_thread_blocking_nux"
            r1 = 1
            r4.A13(r2, r1)
            java.lang.Object r2 = r3.A01
            X.7I3 r2 = (X.AnonymousClass7I3) r2
            X.Nml r1 = X.C69503Nml.A0I
            r2.A05(r1)
            com.instagram.common.ui.base.IgTextView r1 = r6.A02
            r2 = 8
            if (r1 == 0) goto L_0x07ba
            r1.setVisibility(r2)
        L_0x07ba:
            com.instagram.igds.components.button.IgdsButton r1 = r6.A03
            if (r1 == 0) goto L_0x07c1
            r1.setVisibility(r2)
        L_0x07c1:
            X.0sa r1 = r6.A05
            r1.invoke()
            X.0sa r1 = r6.A04
            java.lang.Object r2 = r1.invoke()
            com.instagram.model.direct.DirectShareTarget r2 = (com.instagram.model.direct.DirectShareTarget) r2
            java.util.List r1 = X.DbT.A14(r2)
            r4 = 0
            if (r1 == 0) goto L_0x07fe
            java.lang.Object r1 = X.00k.A0J(r1)
            com.instagram.pendingmedia.model.recipients.PendingRecipient r1 = (com.instagram.pendingmedia.model.recipients.PendingRecipient) r1
            if (r1 == 0) goto L_0x07fe
            java.lang.String r3 = r1.A0A
        L_0x07df:
            java.util.List r1 = X.DbT.A14(r2)
            if (r1 == 0) goto L_0x07f9
            java.lang.Object r1 = X.00k.A0J(r1)
            com.instagram.pendingmedia.model.recipients.PendingRecipient r1 = (com.instagram.pendingmedia.model.recipients.PendingRecipient) r1
            if (r1 == 0) goto L_0x07f9
            java.lang.String r2 = r1.A0B
            if (r2 == 0) goto L_0x07f9
            com.instagram.direct.aiagent.navigation.AiAgentThreadLauncher r1 = new com.instagram.direct.aiagent.navigation.AiAgentThreadLauncher
            r1.<init>(r5)
            r1.A09(r4, r3, r2)
        L_0x07f9:
            r1 = 306695375(0x1247cccf, float:6.3045774E-28)
            goto L_0x0035
        L_0x07fe:
            r3 = r4
            goto L_0x07df
        L_0x0800:
            r0 = 2102615023(0x7d535bef, float:1.7559028E37)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r3.A01
            X.DmJ r5 = (X.C46843DmJ) r5
            java.lang.String r1 = r5.A00
            java.lang.Object r7 = r3.A02
            X.F2P r7 = (X.F2P) r7
            java.lang.String r6 = r7.A01
            boolean r2 = X.0qQ.A0K(r1, r6)
            r1 = r6
            if (r2 == 0) goto L_0x081b
            r1 = 0
        L_0x081b:
            r5.A00 = r1
            com.instagram.direct.fragment.sharesheet.DirectShareSheetFragment r4 = r5.A04
            X.F2X r1 = r4.A0N
            if (r1 == 0) goto L_0x0842
            java.lang.String r1 = r1.A00
            if (r1 == 0) goto L_0x082a
            com.instagram.direct.fragment.sharesheet.DirectShareSheetFragment.A0G(r4)
        L_0x082a:
            X.F2X r3 = r4.A0N
            java.lang.String r1 = r3.A00
            boolean r1 = r6.equals(r1)
            if (r1 == 0) goto L_0x084a
            X.7eL r2 = r4.A0l
            if (r2 == 0) goto L_0x084a
            java.lang.String r1 = ""
            r2.EhX(r1)
            X.F2X r2 = r4.A0N
            r1 = 0
            r2.A00 = r1
        L_0x0842:
            r5.notifyDataSetChanged()
            r1 = -1939536097(0xffffffff8c65071f, float:-1.7643661E-31)
            goto L_0x0035
        L_0x084a:
            r3.A00 = r6
            com.instagram.common.session.UserSession r3 = r4.A0G
            r2 = 1
            X.EHO r1 = new X.EHO
            r1.<init>(r2, r4, r7)
            X.Dbb.A1O(r3, r1)
            goto L_0x0842
        L_0x0858:
            r0 = -1486357146(0xffffffffa767fd66, float:-3.2195057E-15)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r3.A01
            X.FBq r5 = (X.C49890FBq) r5
            r5.A06(r6)
            java.lang.Object r4 = r3.A02
            X.Dm7 r4 = (X.C46831Dm7) r4
            X.2FW r2 = r5.A05
            java.lang.Object r1 = r5.A06
            java.lang.String r8 = X.C49890FBq.A01(r2, r1)
            boolean r1 = r5 instanceof X.C47850EJw
            if (r1 == 0) goto L_0x0897
            com.instagram.common.session.UserSession r7 = r4.A02
            X.0Tu r3 = X.0Tu.A05
            r1 = 36327554944088573(0x810fb8000039fd, double:3.0370302537396226E-306)
            boolean r1 = X.182.A06(r3, r7, r1)
            if (r1 == 0) goto L_0x0897
            if (r8 == 0) goto L_0x0897
            X.4DU r6 = r4.A04
            java.lang.String r9 = r5.A04()
            java.lang.String r10 = r5.A08
            X.0qQ.A07(r10)
            java.lang.String r11 = ""
            X.C22031Xty.A0J(r6, r7, r8, r9, r10, r11)
        L_0x0897:
            r1 = -506866514(0xffffffffe1c9d4ae, float:-4.653901E20)
            goto L_0x0035
        L_0x089c:
            r0 = 1589158227(0x5eb8a153, float:6.652003E18)
            int r0 = X.AnonymousClass0fD.A05(r0)
            X.37E r2 = X.AnonymousClass37D.A00
            java.lang.Object r1 = r3.A01
            android.app.Activity r1 = (android.app.Activity) r1
            X.37D r4 = r2.A01(r1)
            if (r4 == 0) goto L_0x08ba
            java.lang.Object r3 = r3.A02
            r2 = 0
            X.FmJ r1 = new X.FmJ
            r1.<init>(r2, r3, r6)
            X.DbU.A1U(r1, r4, r4)
        L_0x08ba:
            r1 = -40759121(0xfffffffffd9210af, float:-2.426924E37)
            goto L_0x0035
        L_0x08bf:
            r0 = 1714824713(0x66362609, float:2.1504308E23)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r3.A01
            android.widget.CompoundButton r4 = (android.widget.CompoundButton) r4
            boolean r1 = r4.isChecked()
            r2 = r1 ^ 1
            r4.setChecked(r2)
            java.lang.Object r1 = r3.A02
            X.DtR r1 = (X.C47240DtR) r1
            r1.A00 = r2
            X.Evy r4 = r1.A01
            X.E7U r3 = r4.A01
            int r1 = r3.A00
            if (r2 == 0) goto L_0x08f4
            int r1 = r1 + 1
            r3.A00 = r1
            java.util.HashSet r2 = r3.A0D
            X.F0B r1 = r4.A00
            r2.add(r1)
        L_0x08ec:
            X.E7U.A00(r3)
            r1 = -433124982(0xffffffffe62f098a, float:-2.0664752E23)
            goto L_0x0035
        L_0x08f4:
            int r1 = r1 + -1
            r3.A00 = r1
            java.util.HashSet r2 = r3.A0D
            X.F0B r1 = r4.A00
            r2.remove(r1)
            goto L_0x08ec
        L_0x0900:
            r0 = -1612807254(0xffffffff9fde83aa, float:-9.423848E-20)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r7 = r3.A01
            androidx.fragment.app.Fragment r7 = (androidx.fragment.app.Fragment) r7
            java.lang.Object r6 = r3.A02
            com.instagram.common.session.UserSession r6 = (com.instagram.common.session.UserSession) r6
            r5 = 1
            X.E4A r4 = new X.E4A
            r4.<init>()
            android.os.Bundle r1 = X.AnonymousClass7TE.A0a()
            X.C227642jf.A04(r1, r6)
            r4.setArguments(r1)
            X.37E r2 = X.AnonymousClass37D.A00
            X.37D r1 = X.DbV.A0g(r7, r2)
            if (r1 == 0) goto L_0x0948
            X.37F r1 = (X.AnonymousClass37F) r1
            boolean r1 = r1.A0g
            if (r1 != r5) goto L_0x0948
            X.37D r1 = X.DbV.A0g(r7, r2)
            X.7Pu r3 = X.C48943Emh.A00(r1)
            if (r3 == 0) goto L_0x0943
            X.7Pr r2 = X.DbX.A0e(r6, r5)
            r1 = 1060320051(0x3f333333, float:0.7)
            r2.A03 = r1
            r3.A0F(r4, r2)
        L_0x0943:
            r1 = -1108308119(0xffffffffbdf08f69, float:-0.11746103)
            goto L_0x0035
        L_0x0948:
            X.0hq r1 = r7.getParentFragmentManager()
            X.0s1 r3 = new X.0s1
            r3.<init>(r1)
            android.view.View r1 = r7.requireView()
            android.view.ViewParent r2 = r1.getParent()
            r1 = 0
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            X.0qQ.A0C(r2, r1)
            android.view.View r2 = (android.view.View) r2
            int r1 = r2.getId()
            r3.A0A(r4, r1)
            java.lang.Class<X.E4A> r2 = X.E4A.class
            java.util.Map r1 = X.0Yh.A03
            java.lang.String r1 = X.0q1.A01(r2)
            r3.A0I(r1)
            r3.A00()
            goto L_0x0943
        L_0x0979:
            r0 = -378597171(0xffffffffe96f10cd, float:-1.8063288E25)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r3.A01
            X.E9A r1 = (X.E9A) r1
            java.lang.Object r4 = r3.A02
            X.ExP r4 = (X.ExP) r4
            r5 = 0
            com.instagram.business.fragment.SupportServicePartnerSelectionFragment r3 = r1.A02
            X.4os r1 = r3.A00
            if (r1 == 0) goto L_0x0a01
            java.lang.String r2 = r1.Ac5()
            java.lang.String r1 = r4.A00
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0a01
            X.4os r1 = r3.A00
            java.lang.String r11 = r1.getUrl()
        L_0x09a1:
            X.FFo r9 = r3.A03
            com.instagram.api.schemas.SMBPartnerType r8 = r3.A01
            boolean r2 = r3.A08
            java.lang.String r7 = r4.A00
            java.lang.String r6 = r4.A01
            X.DbZ.A0t(r5, r8, r7, r6)
            X.0Aj r5 = X.C49935FFo.A00(r9)
            java.lang.String r1 = "flow_select_partner"
            X.DbS.A1H(r5, r1)
            java.lang.String r1 = "tap"
            X.C49935FFo.A02(r5, r9, r1, r2)
            java.lang.String r2 = r8.toString()
            java.lang.String r1 = "service_type"
            r5.AAJ(r1, r2)
            java.lang.Long r2 = X.AnonymousClass7TE.A10(r7)
            java.lang.String r1 = "partner_id"
            r5.A9F(r1, r2)
            java.lang.String r1 = "partner_name"
            r5.AAJ(r1, r6)
            r5.Cgf()
            androidx.fragment.app.FragmentActivity r2 = r3.requireActivity()
            com.instagram.common.session.UserSession r1 = r3.A04
            X.6Yo r2 = X.DbS.A0M(r2, r1)
            X.F3v r5 = X.DbU.A0R()
            java.lang.String r7 = r3.A06
            java.lang.String r8 = r4.A00
            java.lang.String r9 = r4.A01
            java.lang.String r10 = X.C324066yY.A03(r4)
            java.lang.String r12 = r3.A05
            com.instagram.api.schemas.SMBPartnerType r6 = r3.A01
            com.instagram.business.fragment.SupportServiceEditUrlFragment r1 = r5.A06(r6, r7, r8, r9, r10, r11, r12)
            r2.A0E(r1)
            r2.A04()
            r1 = 1892112340(0x70c757d4, float:4.9354956E29)
            goto L_0x0035
        L_0x0a01:
            r11 = 0
            goto L_0x09a1
        L_0x0a03:
            r0 = 945130623(0x38558c7f, float:5.0914005E-5)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r3.A02
            X.E6U r2 = (X.E6U) r2
            java.lang.Object r4 = r3.A01
            X.EwM r4 = (X.C49481EwM) r4
            androidx.fragment.app.Fragment r6 = r2.getTargetFragment()
            r6.getClass()
            X.E4e r6 = (X.C47479E4e) r6
            java.lang.String r9 = r4.A01
            java.lang.String r10 = r4.A00
            android.widget.EditText r1 = r6.A00
            java.lang.String r8 = X.AnonymousClass7TF.A0f(r1)
            android.widget.TextView r1 = r6.A01
            java.lang.String r11 = X.DbV.A0x(r1)
            android.content.Context r5 = r6.getContext()
            android.widget.EditText r1 = r6.A00
            java.lang.String r3 = X.AnonymousClass7TF.A0f(r1)
            android.widget.TextView r1 = r6.A01
            java.lang.String r1 = X.DbV.A0x(r1)
            java.lang.String r12 = X.AnonymousClass703.A05(r5, r3, r1, r9)
            com.instagram.model.business.Address r7 = new com.instagram.model.business.Address
            r7.<init>(r8, r9, r10, r11, r12)
            r6.A05 = r7
            X.C47479E4e.A02(r6)
            r1 = 1
            r2.A07 = r1
            com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger r1 = r2.A01
            if (r1 == 0) goto L_0x0a6e
            java.util.HashMap r10 = X.AnonymousClass7TE.A1E()
            java.lang.String r3 = r4.A01
            java.lang.String r1 = "city"
            r10.put(r1, r3)
            com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger r1 = r2.A01
            java.lang.String r4 = "page_import_info_city_town"
            r6 = 0
            java.lang.String r5 = r2.A06
            X.Xtl r3 = new X.Xtl
            r7 = r6
            r8 = r6
            r9 = r6
            r11 = r6
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            r1.Ci7(r3)
        L_0x0a6e:
            X.DbT.A1J(r2)
            r1 = 1217638368(0x4893afe0, float:302463.0)
            goto L_0x0035
        L_0x0a76:
            r0 = 376600636(0x1672783c, float:1.9586544E-25)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r3.A02
            X.EG2 r1 = (X.EG2) r1
            com.instagram.business.fragment.OnboardingCheckListFragment r4 = r1.A00
            java.lang.Object r1 = r3.A01
            X.FXy r1 = (X.FXy) r1
            X.F3Q r5 = r1.A00
            java.lang.String r1 = r5.A05
            java.lang.Integer r3 = X.C48741EjQ.A00(r1)
            r3.getClass()
            java.lang.String r7 = r5.A02
            java.lang.String r6 = r5.A01
            int r1 = r3.intValue()
            r13 = 0
            switch(r1) {
                case 0: goto L_0x0c1e;
                case 1: goto L_0x0b72;
                case 2: goto L_0x0b01;
                case 3: goto L_0x0b18;
                case 4: goto L_0x0afb;
                case 5: goto L_0x0c43;
                case 6: goto L_0x0a9e;
                case 7: goto L_0x0b6b;
                case 8: goto L_0x0a9e;
                case 9: goto L_0x0b42;
                case 10: goto L_0x0b62;
                case 11: goto L_0x0c25;
                case 12: goto L_0x0b53;
                default: goto L_0x0a9e;
            }
        L_0x0a9e:
            r10 = r13
        L_0x0a9f:
            X.F3i r2 = r4.A04
            java.lang.String r1 = r5.A05
            java.lang.String r1 = r1.toLowerCase()
            r2.A01(r1)
            if (r10 == 0) goto L_0x0af4
            android.os.Bundle r6 = X.DbY.A08(r10)
            android.os.Bundle r1 = r4.requireArguments()
            r6.putAll(r1)
            X.F3i r1 = r4.A04
            java.util.List r1 = r1.A03
            if (r1 == 0) goto L_0x0af9
            java.util.Iterator r5 = r1.iterator()
        L_0x0ac1:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L_0x0af9
            java.lang.Object r2 = r5.next()
            X.F3Q r2 = (X.F3Q) r2
            java.lang.String r1 = r2.A05
            X.0qQ.A07(r1)
            java.lang.Integer r1 = X.C48741EjQ.A00(r1)
            if (r1 != r3) goto L_0x0ac1
            java.lang.String r2 = r2.A03
            java.lang.String r1 = "complete"
            boolean r2 = r1.equals(r2)
        L_0x0ae0:
            java.lang.String r1 = "ARG_CHECKLIST_ITEM_COMPLETED"
            r6.putBoolean(r1, r2)
            r10.setArguments(r6)
            X.F1I r9 = r4.A01
            androidx.fragment.app.FragmentActivity r11 = r4.requireActivity()
            r14 = 1
            X.EtT r12 = r4.A03
            r9.A00(r10, r11, r12, r13, r14)
        L_0x0af4:
            r1 = -990054362(0xffffffffc4fcf826, float:-2023.7546)
            goto L_0x0035
        L_0x0af9:
            r2 = 0
            goto L_0x0ae0
        L_0x0afb:
            com.instagram.business.fragment.InviteFollowersV2Fragment r10 = new com.instagram.business.fragment.InviteFollowersV2Fragment
            r10.<init>()
            goto L_0x0b06
        L_0x0b01:
            X.E4I r10 = new X.E4I
            r10.<init>()
        L_0x0b06:
            android.os.Bundle r2 = X.AnonymousClass7TE.A0a()
            java.lang.String r1 = "ARG_TITLE"
            r2.putString(r1, r7)
            java.lang.String r1 = "ARG_SUB_TITLE"
            r2.putString(r1, r6)
            r10.setArguments(r2)
            goto L_0x0a9f
        L_0x0b18:
            X.28D r1 = X.28D.A3q
            X.Hrt r1 = X.C250563lf.A0C(r1)
            r2 = 1
            r1.A0m = r2
            android.os.Bundle r8 = r1.A00()
            java.lang.String r1 = "modal_dismiss_on_cancel"
            r8.putBoolean(r1, r2)
            com.instagram.common.session.UserSession r7 = r4.A07
            java.lang.Class<com.instagram.modal.TransparentModalActivity> r6 = com.instagram.modal.TransparentModalActivity.class
            androidx.fragment.app.FragmentActivity r2 = r4.requireActivity()
            java.lang.String r1 = "clips_camera"
            X.6W8 r2 = X.AnonymousClass6W8.A02(r2, r8, r7, r6, r1)
            r2.A07()
            r1 = 102(0x66, float:1.43E-43)
            r2.A0D(r4, r1)
            goto L_0x0a9e
        L_0x0b42:
            X.1Yh r7 = X.C18138VmE.A00()
            com.instagram.common.session.UserSession r6 = r4.A07
            androidx.fragment.app.FragmentActivity r2 = r4.requireActivity()
            java.lang.String r1 = "onboarding_checklist"
            r7.A09(r2, r6, r1)
            goto L_0x0a9e
        L_0x0b53:
            com.instagram.common.session.UserSession r6 = r4.A07
            r1 = 1
            X.FVR r2 = new X.FVR
            r2.<init>(r4, r1)
            java.lang.String r1 = "ig_pro_onboarding_checklist_step"
            X.F6X.A00(r4, r2, r6, r1)
            goto L_0x0a9e
        L_0x0b62:
            X.E4H r10 = new X.E4H
            r10.<init>()
            java.lang.String r13 = "BusinessObjectives"
            goto L_0x0a9f
        L_0x0b6b:
            X.E4X r10 = new X.E4X
            r10.<init>()
            goto L_0x0a9f
        L_0x0b72:
            com.instagram.common.session.UserSession r9 = r4.A07
            r1 = 0
            X.0qQ.A0B(r9, r1)
            boolean r1 = X.C319126q5.A05(r9)
            if (r1 == 0) goto L_0x0b8b
            X.0Tu r8 = X.0Tu.A05
            r1 = 36315060884212689(0x81045b00000bd1, double:3.0291289599645725E-306)
            boolean r1 = X.182.A06(r8, r9, r1)
            if (r1 != 0) goto L_0x0b9e
        L_0x0b8b:
            boolean r1 = X.C319126q5.A06(r9)
            if (r1 == 0) goto L_0x0be2
            X.0Tu r8 = X.0Tu.A05
            r1 = 36315065179179987(0x81045c00000bd3, double:3.029131676119186E-306)
            boolean r1 = X.182.A06(r8, r9, r1)
            if (r1 == 0) goto L_0x0be2
        L_0x0b9e:
            android.net.Uri$Builder r2 = new android.net.Uri$Builder
            r2.<init>()
            java.lang.String r1 = "instagram"
            android.net.Uri$Builder r2 = r2.scheme(r1)
            java.lang.String r1 = "pro_inspiration"
            android.net.Uri$Builder r3 = r2.authority(r1)
            java.lang.String r2 = "entry_point"
            java.lang.String r1 = "onboarding_checklist"
            android.net.Uri$Builder r3 = r3.appendQueryParameter(r2, r1)
            java.lang.String r2 = "should_show_promotion_content"
            java.lang.String r1 = "true"
            android.net.Uri$Builder r3 = r3.appendQueryParameter(r2, r1)
            java.lang.String r2 = X.AnonymousClass7TF.A0b()
            java.lang.String r1 = "dummy_param"
            android.net.Uri r3 = X.DbV.A08(r3, r1, r2)
            X.14B r2 = X.AnonymousClass14B.A00()
            androidx.fragment.app.FragmentActivity r1 = r4.requireActivity()
            android.content.Intent r1 = r2.A01(r1)
            android.content.Intent r2 = r1.setData(r3)
            androidx.fragment.app.FragmentActivity r1 = r4.requireActivity()
            X.0kR.A0B(r1, r2)
            goto L_0x0af4
        L_0x0be2:
            java.lang.String r9 = r4.A08
            boolean r1 = android.text.TextUtils.isEmpty(r7)
            if (r1 == 0) goto L_0x0bf5
            android.content.Context r2 = r4.requireContext()
            r1 = 2131964883(0x7f1333d3, float:1.956656E38)
            java.lang.String r7 = r2.getString(r1)
        L_0x0bf5:
            boolean r1 = android.text.TextUtils.isEmpty(r6)
            if (r1 == 0) goto L_0x0c06
            android.content.Context r2 = r4.requireContext()
            r1 = 2131964882(0x7f1333d2, float:1.9566558E38)
            java.lang.String r6 = r2.getString(r1)
        L_0x0c06:
            java.lang.String r8 = "onboarding_checklist_render"
            com.instagram.business.fragment.SuggestBusinessFragment r10 = new com.instagram.business.fragment.SuggestBusinessFragment
            r10.<init>()
            android.os.Bundle r2 = X.DbX.A0B(r9)
            java.lang.String r1 = "suggested_business_fetch_entry_point"
            r2.putString(r1, r8)
            java.lang.String r1 = "ARG_TITLE"
            r2.putString(r1, r7)
            java.lang.String r1 = "ARG_SUB_TITLE"
            goto L_0x0c60
        L_0x0c1e:
            com.instagram.profile.edit.fragment.CompleteYourProfileFragment r10 = new com.instagram.profile.edit.fragment.CompleteYourProfileFragment
            r10.<init>()
            goto L_0x0a9f
        L_0x0c25:
            X.EzY r1 = r5.A00
            if (r1 == 0) goto L_0x0a9e
            java.util.List r1 = r1.A03
            if (r1 == 0) goto L_0x0a9e
            java.lang.String r2 = r4.A08
            r1 = 0
            X.0qQ.A0B(r2, r1)
            X.E4D r10 = new X.E4D
            r10.<init>()
            android.os.Bundle r1 = X.DbX.A0B(r2)
            r10.setArguments(r1)
            java.lang.String r13 = "BoostGuidance"
            goto L_0x0a9f
        L_0x0c43:
            X.EzY r1 = r5.A00
            if (r1 == 0) goto L_0x0a9e
            java.lang.String r1 = r1.A02
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x0a9e
            java.lang.String r2 = r4.A08
            X.EzY r1 = r5.A00
            java.lang.String r6 = r1.A02
            X.E4E r10 = new X.E4E
            r10.<init>()
            android.os.Bundle r2 = X.DbX.A0B(r2)
            java.lang.String r1 = "ARG_TARGET_USER_ID"
        L_0x0c60:
            r2.putString(r1, r6)
            r10.setArguments(r2)
            goto L_0x0a9f
        L_0x0c68:
            r0 = 1577543105(0x5e0765c1, float:2.43910409E18)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r3.A02
            X.E8p r1 = (X.C47577E8p) r1
            com.instagram.business.fragment.CategorySearchFragment r2 = r1.A02
            java.lang.Object r1 = r3.A01
            X.FYO r1 = (X.FYO) r1
            r2.A0d(r1)
            r1 = -712834355(0xffffffffd58302cd, float:-1.80060066E13)
            goto L_0x0035
        L_0x0c81:
            r0 = -592430016(0xffffffffdcb03c40, float:-3.96846732E17)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r3.A02
            X.Dm9 r4 = (X.C46833Dm9) r4
            java.lang.Object r3 = r3.A01
            com.instagram.business.model.BoostGuidanceItemResponse r3 = (com.instagram.business.model.BoostGuidanceItemResponse) r3
            java.util.List r1 = r4.A00
            java.util.ArrayList r6 = X.AnonymousClass7TG.A0r(r1)
            java.util.Iterator r2 = r1.iterator()
        L_0x0c9a:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x0cac
            java.lang.Object r1 = r2.next()
            com.instagram.business.model.BoostGuidanceItemResponse r1 = (com.instagram.business.model.BoostGuidanceItemResponse) r1
            java.lang.String r1 = r1.A00
            r6.add(r1)
            goto L_0x0c9a
        L_0x0cac:
            java.lang.String r5 = r3.A00
            java.lang.String r1 = "media_id"
            java.util.Map r14 = X.AnonymousClass7TF.A0w(r1, r5)
            com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger r1 = r4.A03
            if (r1 == 0) goto L_0x0cc9
            java.lang.String r8 = r4.A07
            r10 = 0
            java.lang.String r9 = r4.A06
            X.Xtl r7 = new X.Xtl
            r11 = r10
            r12 = r10
            r13 = r10
            r15 = r10
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15)
            r1.Ckp(r7)
        L_0x0cc9:
            boolean r2 = r4.A08
            android.content.Context r8 = r4.A01
            X.0iw r1 = r4.A04
            java.lang.String r1 = r1.getModuleName()
            if (r2 == 0) goto L_0x0d0f
            r7 = 0
            r3 = 1
            X.AnonymousClass7TF.A1B(r5, r3, r1)
            X.Del r2 = new X.Del
            r2.<init>(r1)
            r1 = 875(0x36b, float:1.226E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            r2.A06 = r1
            r1 = 2131954002(0x7f130952, float:1.954449E38)
            java.lang.String r1 = r8.getString(r1)
            r2.A07 = r1
            r2.A08 = r5
            java.util.ArrayList r1 = X.AnonymousClass7TE.A1D(r6)
            r2.A09(r1)
            r2.A0D = r3
            r2.A0E = r7
            android.os.Bundle r5 = r2.A06()
            com.instagram.common.session.UserSession r3 = r4.A05
            androidx.fragment.app.FragmentActivity r2 = r4.A02
            java.lang.String r1 = "contextual_feed"
            X.DbY.A0u(r2, r5, r3, r1)
        L_0x0d0a:
            r1 = 682537149(0x28aeb0bd, float:1.9394529E-14)
            goto L_0x0035
        L_0x0d0f:
            r3 = 1
            X.AnonymousClass7TF.A1B(r5, r3, r1)
            X.Del r2 = new X.Del
            r2.<init>(r1)
            r1 = 875(0x36b, float:1.226E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            r2.A06 = r1
            r1 = 2131954002(0x7f130952, float:1.954449E38)
            java.lang.String r1 = r8.getString(r1)
            r2.A07 = r1
            r2.A08 = r5
            java.util.ArrayList r1 = X.AnonymousClass7TE.A1D(r6)
            r2.A09(r1)
            r2.A0D = r3
            r2.A0E = r3
            instagram.features.feed.fragment.ContextualFeedFragment r3 = r2.A07()
            androidx.fragment.app.FragmentActivity r2 = r4.A02
            com.instagram.common.session.UserSession r1 = r4.A05
            X.Dbb.A11(r3, r2, r1)
            goto L_0x0d0a
        L_0x0d42:
            r0 = -1008814693(0xffffffffc3deb59b, float:-445.4188)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r3.A02
            androidx.fragment.app.FragmentActivity r2 = X.DbT.A0E(r1)
            java.lang.Object r1 = r3.A01
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            X.FC7.A01(r2, r1)
            r1 = 283401362(0x10e45c92, float:9.007277E-29)
            goto L_0x0035
        L_0x0d5b:
            r0 = 333891669(0x13e6c855, float:5.8257705E-27)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r3.A02
            X.8Wh r4 = (X.C357058Wh) r4
            r7 = 1
            r4.A00 = r7
            X.37E r2 = X.AnonymousClass37D.A00
            androidx.fragment.app.FragmentActivity r1 = r4.A02
            X.DbX.A10(r1, r2)
            com.instagram.common.session.UserSession r1 = r4.A04
            X.27r r4 = X.27p.A01(r1)
            java.lang.Object r1 = r3.A01
            java.util.Collection r1 = (java.util.Collection) r1
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1D(r1)
            X.29R r6 = r4.A09
            X.0wc r1 = r6.A01
            X.1Ln r5 = X.1Ln.A08(r1)
            X.4yP r4 = r6.A0J()
            boolean r1 = X.DbT.A1Y(r5)
            if (r1 == 0) goto L_0x0dcb
            if (r4 == 0) goto L_0x0dcb
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r2 = r2.iterator()
        L_0x0d9a:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x0dac
            java.lang.String r1 = X.AnonymousClass7TE.A18(r2)
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r3.add(r1)
            goto L_0x0d9a
        L_0x0dac:
            java.lang.String r1 = "IG_CAMERA_ENTITY_TAP"
            r5.A0t(r1)
            java.lang.String r1 = "ADS_MODE_SHARE_STORY_ON_ERROR_REVIEW_SHEET"
            X.283 r1 = X.Dbc.A08(r5, r4, r6, r1)
            X.Dbc.A0i(r5, r1)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r7)
            java.lang.String r1 = "ads_mode_boost_story_enabled"
            r5.A0O(r1, r2)
            java.lang.String r1 = "ads_mode_boost_story_error_codes"
            r5.A0S(r1, r3)
            r5.Cgf()
        L_0x0dcb:
            r1 = 1698964724(0x654424f4, float:5.7891593E22)
            goto L_0x0035
        L_0x0dd0:
            r0 = 189940720(0xb5243f0, float:4.049564E-32)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r3.A02
            X.8Wh r4 = (X.C357058Wh) r4
            r1 = 0
            r4.A00 = r1
            X.37E r2 = X.AnonymousClass37D.A00
            androidx.fragment.app.FragmentActivity r1 = r4.A02
            X.DbX.A10(r1, r2)
            com.instagram.common.session.UserSession r1 = r4.A04
            X.27r r4 = X.27p.A01(r1)
            java.lang.Object r1 = r3.A01
            java.util.Collection r1 = (java.util.Collection) r1
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1D(r1)
            X.29R r6 = r4.A09
            X.0wc r1 = r6.A01
            X.1Ln r5 = X.1Ln.A08(r1)
            X.4yP r4 = r6.A0J()
            boolean r1 = X.DbT.A1Y(r5)
            if (r1 == 0) goto L_0x0e40
            if (r4 == 0) goto L_0x0e40
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r2 = r2.iterator()
        L_0x0e0f:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x0e21
            java.lang.String r1 = X.AnonymousClass7TE.A18(r2)
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r3.add(r1)
            goto L_0x0e0f
        L_0x0e21:
            java.lang.String r1 = "IG_CAMERA_ENTITY_TAP"
            r5.A0t(r1)
            java.lang.String r1 = "ADS_MODE_EDIT_BUTTON_SELECTED_ON_ERROR_REVIEW_SHEET"
            X.283 r1 = X.Dbc.A08(r5, r4, r6, r1)
            X.Dbc.A0i(r5, r1)
            java.lang.Boolean r2 = X.AnonymousClass7TE.A0v()
            java.lang.String r1 = "ads_mode_boost_story_enabled"
            r5.A0O(r1, r2)
            java.lang.String r1 = "ads_mode_boost_story_error_codes"
            r5.A0S(r1, r3)
            r5.Cgf()
        L_0x0e40:
            r1 = -1021053120(0xffffffffc323f740, float:-163.96582)
            goto L_0x0035
        L_0x0e45:
            java.lang.Object r8 = r3.A01
            androidx.fragment.app.Fragment r8 = (androidx.fragment.app.Fragment) r8
            java.lang.Object r6 = r3.A02
            X.2nI r6 = (X.C229382nI) r6
            android.content.Context r0 = r8.getContext()
            if (r0 == 0) goto L_0x0038
            java.util.HashMap r7 = X.AnonymousClass7TE.A1E()
            java.util.HashMap r5 = X.AnonymousClass7TE.A1E()
            r4 = 2
            java.util.BitSet r9 = X.DbS.A0w(r4)
            r0 = 1
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "some_required_int_param"
            boolean r3 = X.Dba.A1Z(r0, r1, r7, r9)
            java.lang.String r1 = "Test"
            java.lang.String r0 = "some_required_string_param"
            r7.put(r0, r1)
            r0 = 1
            r9.set(r0)
            android.content.Context r2 = r8.getContext()
            X.FVR r1 = new X.FVR
            r1.<init>(r8, r3)
            int r0 = r9.nextClearBit(r3)
            if (r0 < r4) goto L_0x14cb
            java.lang.String r0 = "com.bloks.www.bloks.demo.testnativeactionbuilder"
            X.FBO r0 = X.FBO.A00(r1, r0, r7, r5)
            r0.A01(r2, r6)
            return
        L_0x0e90:
            r0 = 1822464329(0x6ca09949, float:1.553216E27)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r3.A01
            X.6Rx r2 = (X.C307896Rx) r2
            java.lang.Object r1 = r3.A02
            X.DbZ.A1V(r2, r1)
            r1 = 48469393(0x2e39591, float:3.34405E-37)
            goto L_0x0035
        L_0x0ea5:
            r0 = -1706913137(0xffffffff9a42928f, float:-4.023665E-23)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r3.A01
            X.4tV r1 = (X.C276544tV) r1
            X.4uI r4 = r1.A08()
            X.6Tm r2 = X.AnonymousClass6Tm.A01
            java.lang.Object r1 = r3.A02
            X.DbS.A1R(r2, r4, r1)
            r1 = 255397794(0xf390fa2, float:9.124215E-30)
            goto L_0x0035
        L_0x0ec0:
            r0 = -1282784605(0xffffffffb38a42a3, float:-6.438247E-8)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r3.A01
            X.6Rx r2 = (X.C307896Rx) r2
            java.lang.Object r1 = r3.A02
            X.DbZ.A1V(r2, r1)
            r1 = 1824304273(0x6cbcac91, float:1.8247438E27)
            goto L_0x0035
        L_0x0ed5:
            r0 = -1228666783(0xffffffffb6c40861, float:-5.8422306E-6)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r3.A02
            X.FXh r5 = (X.C50302FXh) r5
            java.lang.Object r9 = r3.A01
            com.instagram.common.session.UserSession r9 = (com.instagram.common.session.UserSession) r9
            X.6Rm r4 = r5.A07
            r2 = 0
            X.FXb r1 = new X.FXb
            r1.<init>(r5, r2)
            X.C308206Td.A0I(r4, r1)
            X.Fbq r3 = new X.Fbq
            r3.<init>(r5)
            java.lang.String r10 = X.AnonymousClass7TG.A0j()
            X.4tV r1 = r5.A08
            java.lang.String r2 = ""
            java.lang.String r1 = r1.A0I()
            if (r1 == 0) goto L_0x0f03
            r2 = r1
        L_0x0f03:
            java.lang.String r1 = "profile_shop"
            X.C49798F7j.A01(r9, r3, r10, r2, r1)
            X.3kF r6 = X.C249713kF.A00
            X.0eM r1 = r5.A09
            java.lang.Object r7 = r1.getValue()
            android.app.Activity r7 = (android.app.Activity) r7
            androidx.fragment.app.Fragment r8 = X.C308206Td.A00(r4)
            java.lang.String r11 = r3.getModuleName()
            r6.A0b(r7, r8, r9, r10, r11)
            r1 = -22682765(0xfffffffffea5e373, float:-1.102518E38)
            goto L_0x0035
        L_0x0f22:
            r0 = 343197609(0x1474c7a9, float:1.2358228E-26)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r3.A02
            X.FXh r1 = (X.C50302FXh) r1
            X.4tV r4 = r1.A08
            java.lang.Object r3 = r3.A01
            X.4uI r3 = (X.C277014uI) r3
            X.6Tm r2 = X.AnonymousClass6Tm.A01
            X.6Rm r1 = r1.A07
            X.C307886Rw.A03(r1, r4, r2, r3)
            r1 = 1000431445(0x3ba15f55, float:0.0049246945)
            goto L_0x0035
        L_0x0f3f:
            r0 = 26841214(0x199907e, float:5.641066E-38)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r3.A02
            X.4tV r5 = (X.C276544tV) r5
            r1 = 45
            X.4uI r4 = r5.A0A(r1)
            if (r4 == 0) goto L_0x0f61
            X.6Tl r1 = X.DbU.A0T(r5)
            X.6Tm r2 = r1.A00()
            java.lang.Object r1 = r3.A01
            X.6Rm r1 = (X.C307786Rm) r1
            X.C307886Rw.A03(r1, r5, r2, r4)
        L_0x0f61:
            r1 = 1224196936(0x48f7c348, float:507418.25)
            goto L_0x0035
        L_0x0f66:
            r0 = -497531391(0xffffffffe2584601, float:-9.9738526E20)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r6 = r3.A02
            X.E24 r6 = (X.E24) r6
            X.G5P r1 = r6.A00
            if (r1 == 0) goto L_0x0f78
            r1.DHu()
        L_0x0f78:
            java.lang.Object r5 = r3.A01
            X.61u r5 = (X.C3021461u) r5
            r6.requireContext()
            r1 = 1
            r5.setPrimaryActionIsLoading(r1)
            X.0xx r4 = X.DbW.A0E(r6)
            r3 = 0
            r2 = 26
            X.MHC r1 = new X.MHC
            r1.<init>((java.lang.Object) r5, (java.lang.Object) r6, (X.AnonymousClass4D7) r3, (int) r2)
            X.AnonymousClass7TE.A1Z(r1, r4)
            r1 = 313114148(0x12a9be24, float:1.0712273E-27)
            goto L_0x0035
        L_0x0f97:
            r0 = 1170212724(0x45c00774, float:6144.9316)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r3.A02
            X.EG0 r1 = (X.EG0) r1
            X.Evo r1 = r1.A00
            java.lang.Object r2 = r3.A01
            X.FYN r2 = (X.FYN) r2
            X.E2C r1 = r1.A01
            X.0eM r1 = r1.A01
            X.2YL r6 = X.DbS.A0H(r1)
            com.instagram.api.schemas.TrackOrOriginalSoundSchema r5 = r2.A00
            X.6oS r4 = X.C318116oQ.A00(r6)
            r3 = 0
            r2 = 39
            X.MHD r1 = new X.MHD
            r1.<init>((java.lang.Object) r5, (java.lang.Object) r6, (X.AnonymousClass4D7) r3, (int) r2)
            X.AnonymousClass7TE.A1Z(r1, r4)
            r1 = -571066614(0xffffffffddf6370a, float:-2.21770753E18)
            goto L_0x0035
        L_0x0fc6:
            r0 = 449443035(0x1ac9f4db, float:8.352724E-23)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r3.A02
            X.EG0 r1 = (X.EG0) r1
            X.Evo r4 = r1.A00
            java.lang.Object r3 = r3.A01
            X.FYN r3 = (X.FYN) r3
            androidx.recyclerview.widget.RecyclerView r1 = r4.A00
            X.2Rw r2 = r1.A0A
            r1 = 23
            java.lang.String r1 = X.C66579MXk.A00(r1)
            X.0qQ.A0C(r2, r1)
            X.2t9 r2 = (X.AnonymousClass2t9) r2
            java.lang.String r1 = r3.getKey()
            int r5 = r2.A02(r1)
            X.E2C r1 = r4.A01
            X.0eM r1 = r1.A01
            java.lang.Object r10 = r1.getValue()
            X.Dkn r10 = (X.C46760Dkn) r10
            com.instagram.api.schemas.TrackOrOriginalSoundSchema r8 = r3.A00
            X.8ZN r9 = X.AnonymousClass8ZN.MUSIC_DROP_NOTIF
            X.HOu r11 = X.C54689HOu.A0a
            X.Evp r2 = r10.A01
            java.util.UUID r4 = r10.A00
            r1 = 2
            X.0qQ.A0B(r4, r1)
            com.instagram.api.schemas.OriginalSoundData r1 = r8.A00
            if (r1 == 0) goto L_0x100e
            java.lang.String r7 = r1.A0I
            if (r7 != 0) goto L_0x1018
        L_0x100e:
            com.instagram.api.schemas.TrackData r1 = r8.A01
            if (r1 == 0) goto L_0x14d0
            java.lang.String r7 = r1.getAudioAssetId()
            if (r7 == 0) goto L_0x14d0
        L_0x1018:
            com.instagram.common.session.UserSession r1 = r2.A01
            X.0iw r6 = r2.A00
            X.0wc r2 = X.AnonymousClass0kN.A01(r6, r1)
            r1 = 162(0xa2, float:2.27E-43)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            X.0Aj r3 = X.AnonymousClass7TE.A0e(r2, r1)
            X.DbW.A16(r3, r6)
            java.lang.String r2 = ""
            java.lang.String r1 = "media_compound_key"
            r3.AAJ(r1, r2)
            java.lang.String r1 = "action_source"
            r3.A8M(r11, r1)
            java.lang.Long r2 = X.DbV.A0q(r7)
            java.lang.String r1 = "target_id"
            r3.A9F(r1, r2)
            java.lang.String r2 = X.AnonymousClass7TF.A0b()
            java.lang.String r1 = "media_tap_token"
            java.lang.Long r2 = X.DbV.A0p(r3, r1, r2, r5)
            java.lang.String r1 = "media_index"
            r3.A9F(r1, r2)
            java.lang.String r2 = r4.toString()
            java.lang.String r1 = "viewer_session_id"
            r3.AAJ(r1, r2)
            r1 = 1685(0x695, float:2.361E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            r3.A8M(r9, r1)
            java.lang.String r2 = r4.toString()
            r1 = 1686(0x696, float:2.363E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            r3.AAJ(r1, r2)
            X.DbX.A1L(r3)
            X.6oS r1 = X.C318116oQ.A00(r10)
            r12 = 0
            r13 = 16
            X.MHG r7 = new X.MHG
            r7.<init>(r8, r9, r10, r11, r12, r13)
            X.AnonymousClass7TE.A1Z(r7, r1)
            r1 = 1670925041(0x63984af1, float:5.6186104E21)
            goto L_0x0035
        L_0x1087:
            r0 = -1536757993(0xffffffffa466ef17, float:-5.0075817E-17)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r3.A01
            android.content.DialogInterface$OnCancelListener r2 = (android.content.DialogInterface.OnCancelListener) r2
            r1 = 0
            r2.onCancel(r1)
            java.lang.Object r1 = r3.A02
            X.Evn r1 = (X.C49446Evn) r1
            android.app.Dialog r1 = r1.A00
            if (r1 == 0) goto L_0x14d5
            r1.dismiss()
            r1 = 193383189(0xb86cb15, float:5.1920486E-32)
            goto L_0x0035
        L_0x10a6:
            r0 = -190201481(0xfffffffff4a9c177, float:-1.0759547E32)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r3.A02
            X.E4j r4 = (X.E4j) r4
            java.lang.Object r5 = r3.A01
            X.Evm r5 = (X.C49445Evm) r5
            boolean r1 = r4.A06
            if (r1 != 0) goto L_0x115a
            boolean r1 = r5.A00
            if (r1 == 0) goto L_0x1180
            androidx.fragment.app.FragmentActivity r1 = r4.getActivity()
            if (r1 == 0) goto L_0x115a
            android.content.Context r1 = r4.getContext()
            if (r1 == 0) goto L_0x115a
            com.instagram.user.model.User r8 = r5.A01
            X.4Cl r1 = r8.A03
            com.instagram.api.schemas.HasPasswordState r2 = r1.BBn()
            com.instagram.api.schemas.HasPasswordState r1 = com.instagram.api.schemas.HasPasswordState.FALSE
            r9 = 1
            boolean r3 = X.AnonymousClass7TF.A1W(r2, r1)
            X.9BG r1 = r4.A01
            java.lang.String r2 = r8.getId()
            java.util.Map r1 = r1.A02
            java.lang.Object r1 = r1.get(r2)
            com.instagram.accountlinking.model.AccountFamily r1 = (com.instagram.accountlinking.model.AccountFamily) r1
            if (r1 == 0) goto L_0x10f1
            java.util.List r1 = r1.A04
            int r1 = r1.size()
            r2 = 1
            if (r1 == r9) goto L_0x10f2
        L_0x10f1:
            r2 = 0
        L_0x10f2:
            if (r3 == 0) goto L_0x117e
            if (r2 == 0) goto L_0x117e
            X.0Tu r3 = X.0Tu.A05
            r1 = 18298046739776629(0x4101fa00020475, double:1.8921717636795614E-307)
            boolean r1 = X.1AW.A06(r3, r1)
            if (r1 == 0) goto L_0x117e
        L_0x1103:
            r7 = 2
            androidx.fragment.app.FragmentActivity r1 = r4.getActivity()
            android.content.res.Resources r6 = r1.getResources()
            if (r9 == 0) goto L_0x115f
            r3 = 2131952062(0x7f1301be, float:1.9540556E38)
            java.lang.String r2 = r8.getUsername()
            com.instagram.common.session.UserSession r1 = r4.A04
            java.lang.String r1 = X.DbX.A0q(r1)
            java.lang.String[] r1 = new java.lang.String[]{r2, r1}
            android.text.Spanned r6 = X.0bC.A01(r6, r1, r3)
            X.FHz r2 = new X.FHz
            r2.<init>(r5, r4)
            r5 = 0
        L_0x1129:
            android.content.Context r1 = r4.getContext()
            X.8ab r3 = X.DbS.A0Y(r1)
            r1 = 2131952061(0x7f1301bd, float:1.9540554E38)
            r3.A09(r1)
            r3.A0q(r6)
            r1 = 2131971974(0x7f134f86, float:1.9580942E38)
            r3.A0K(r2, r1)
            r2 = 2131954722(0x7f130c22, float:1.9545951E38)
            X.8ae r1 = X.C358278ae.BLUE
            r3.A0P(r5, r1, r2)
            r1 = 1
            X.AnonymousClass7TH.A0a(r3, r1)
            java.lang.String r1 = "ig_manage_main_account_remove_dialog_impression"
            X.0xI r2 = X.0xI.A00(r4, r1)
            X.E4j.A02(r4, r2)
            com.instagram.common.session.UserSession r1 = r4.A04
            X.C48310EcT.A00(r2, r1)
        L_0x115a:
            r1 = 1252562946(0x4aa89802, float:5524481.0)
            goto L_0x0035
        L_0x115f:
            r3 = 2131952060(0x7f1301bc, float:1.9540552E38)
            java.lang.String r2 = r8.getUsername()
            com.instagram.common.session.UserSession r1 = r4.A04
            java.lang.String r1 = X.DbX.A0q(r1)
            java.lang.String[] r1 = new java.lang.String[]{r2, r1}
            android.text.Spanned r6 = X.0bC.A01(r6, r1, r3)
            X.FJk r2 = X.C50025FJk.A00(r4, r5, r7)
            r1 = 5
            X.FJi r5 = X.C50023FJi.A00(r4, r1)
            goto L_0x1129
        L_0x117e:
            r9 = 0
            goto L_0x1103
        L_0x1180:
            X.E8o r1 = r4.A00
            java.util.Set r1 = r1.A04
            int r2 = r1.size()
            r1 = 4
            r3 = 1
            if (r2 != r1) goto L_0x11a3
            X.8ab r2 = X.Dba.A0I(r4)
            r1 = 2131952080(0x7f1301d0, float:1.9540593E38)
            r2.A09(r1)
            r1 = 2131952079(0x7f1301cf, float:1.954059E38)
            r2.A08(r1)
            r2.A06()
            X.AnonymousClass7TH.A0a(r2, r3)
            goto L_0x115a
        L_0x11a3:
            X.E8o r2 = r4.A00
            com.instagram.user.model.User r1 = r5.A01
            java.lang.String r1 = r1.getId()
            r2.A0C(r1, r3)
            X.E4j.A00(r5, r4)
            goto L_0x115a
        L_0x11b2:
            java.lang.Object r1 = r3.A01
            X.G8F r1 = (X.G8F) r1
            java.lang.Object r0 = r3.A02
            com.instagram.model.direct.DirectShareTarget r0 = (com.instagram.model.direct.DirectShareTarget) r0
            r1.D8y(r0)
            return
        L_0x11be:
            java.lang.Object r2 = r3.A01
            com.instagram.direct.fragment.sharesheet.DirectShareSheetFragment r2 = (com.instagram.direct.fragment.sharesheet.DirectShareSheetFragment) r2
            java.lang.Object r4 = r3.A02
            android.app.Activity r4 = (android.app.Activity) r4
            android.os.Bundle r3 = X.AnonymousClass7TE.A0a()
            java.lang.String r1 = "bottom_sheet_content_fragment"
            r0 = 1241(0x4d9, float:1.739E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r3.putString(r1, r0)
            com.instagram.common.session.UserSession r2 = r2.A0G
            java.lang.Class<com.instagram.modal.TransparentModalActivity> r1 = com.instagram.modal.TransparentModalActivity.class
            java.lang.String r0 = "bottom_sheet"
            X.DbU.A0w(r4, r3, r2, r1, r0)
            return
        L_0x11df:
            r0 = 1714404997(0x662fbe85, float:2.0748215E23)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r3.A02
            X.Doc r1 = (X.C46984Doc) r1
            int r0 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            X.0sP r1 = r1.A03
            java.lang.Object r0 = r3.A01
            X.DtO r0 = (X.C47237DtO) r0
            java.lang.String r0 = r0.A01
            r1.invoke(r0)
            r0 = 1156989096(0x44f640a8, float:1970.0205)
            goto L_0x142e
        L_0x11fc:
            r0 = -1239724645(0xffffffffb61b4d9b, float:-2.3141972E-6)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r3.A01
            X.EIn r0 = (X.C47816EIn) r0
            java.lang.Object r1 = r3.A02
            X.DpZ r1 = (X.C47039DpZ) r1
            X.G9Z r0 = r0.A0B
            r0.Dnl(r1)
            r0 = 1076867859(0x402fb313, float:2.7453048)
            goto L_0x142e
        L_0x1215:
            r0 = 453590249(0x1b093ce9, float:1.1352056E-22)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r3.A01
            X.EIn r0 = (X.C47816EIn) r0
            java.lang.Object r1 = r3.A02
            X.Dpb r1 = (X.C47041Dpb) r1
            X.G9Z r0 = r0.A0B
            r0.Dnl(r1)
            r0 = -390810294(0xffffffffe8b4b54a, float:-6.826961E24)
            goto L_0x142e
        L_0x122e:
            r0 = 1308164973(0x4df9036d, float:5.22218912E8)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r3.A01
            X.G9Z r1 = (X.G9Z) r1
            java.lang.Object r0 = r3.A02
            X.Dpa r0 = (X.C47040Dpa) r0
            r1.Dnk(r0)
            r0 = -2031680868(0xffffffff86e7029c, float:-8.6896377E-35)
            goto L_0x142e
        L_0x1245:
            r0 = -951525249(0xffffffffc748e07f, float:-51424.496)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r3.A02
            X.Do7 r1 = (X.C46953Do7) r1
            int r0 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            X.0sP r1 = r1.A02
            java.lang.Object r0 = r3.A01
            X.DtN r0 = (X.C47236DtN) r0
            java.lang.String r0 = r0.A00
            r1.invoke(r0)
            r0 = 622405225(0x25192669, float:1.3283648E-16)
            goto L_0x142e
        L_0x1262:
            r0 = 397526845(0x17b1c73d, float:1.1488652E-24)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r3.A02
            X.E6G r1 = (X.E6G) r1
            r0 = 2131955244(0x7f130e2c, float:1.954701E38)
            java.lang.String r6 = X.DbU.A0m(r1, r0)
            X.FEe r5 = com.instagram.simplewebview.SimpleWebViewActivity.A02
            java.lang.Object r0 = r3.A01
            android.view.View r0 = (android.view.View) r0
            android.content.Context r3 = X.AnonymousClass7TE.A0S(r0)
            X.0eM r0 = r1.A04
            X.0lg r2 = X.DbT.A0X(r0)
            java.lang.String r1 = "https://help.instagram.com/752771420132044"
            X.SFz r0 = new X.SFz
            r0.<init>((java.lang.String) r1)
            X.C49906FEe.A01(r3, r2, r5, r0, r6)
            r0 = -189615512(0xfffffffff4b2b268, float:-1.1326262E32)
            goto L_0x142e
        L_0x1293:
            r0 = -114761658(0xfffffffff928e046, float:-5.4803417E34)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r3.A01
            X.LxB r0 = (X.C65634LxB) r0
            r0.A01()
            java.lang.Object r0 = r3.A02
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.1Av r0 = X.1Au.A00(r0)
            r2 = 1
            X.0xY r1 = X.AnonymousClass7TE.A0p(r0)
            java.lang.String r0 = "group_stories_badging_seen_count"
            r1.E5Z(r0, r2)
            r1.apply()
            r0 = 242047579(0xe6d5a5b, float:2.925601E-30)
            goto L_0x142e
        L_0x12bb:
            r0 = -807785123(0xffffffffcfda2d5d, float:-7.320812E9)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r3.A02
            X.E1j r0 = (X.C47415E1j) r0
            X.0eM r0 = r0.A04
            java.lang.Object r5 = r0.getValue()
            X.Dko r5 = (X.C46761Dko) r5
            java.lang.Object r6 = r3.A01
            X.EWU r6 = (X.EWU) r6
            r0 = 0
            X.0qQ.A0B(r6, r0)
            com.instagram.common.session.UserSession r11 = r5.A03
            java.lang.String r10 = r5.A04
            com.instagram.api.schemas.XIGIGBoostCallToAction r2 = r5.A01
            boolean r7 = r5.A09
            com.instagram.api.schemas.ApiAdFormats r9 = r6.A02
            X.WGU r1 = r5.A02
            r0 = 4
            X.0qQ.A0B(r9, r0)
            java.lang.String r8 = r2.toString()
            java.lang.String r3 = r1.A03
            X.1NY r2 = X.DbU.A0N(r11)
            java.lang.String r0 = "ads/promote/fetch_ad_preview_url_v2/"
            r2.A0A(r0)
            r0 = 761(0x2f9, float:1.066E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            r2.A9m(r0, r10)
            r0 = 318(0x13e, float:4.46E-43)
            java.lang.String r1 = X.C66579MXk.A00(r0)
            java.lang.String r0 = ""
            r2.A9m(r1, r0)
            java.lang.String r0 = "call_to_action"
            r2.A9m(r0, r8)
            java.lang.String r1 = r9.A00
            java.lang.String r0 = "ad_format"
            r2.A9m(r0, r1)
            r0 = 4954(0x135a, float:6.942E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r2.A0H(r0, r7)
            java.lang.String r0 = "flow_id"
            r2.A0G(r0, r3)
            java.lang.Class<X.CF7> r1 = X.CF7.class
            java.lang.Class<X.D0X> r0 = X.D0X.class
            X.1OC r1 = X.DbT.A0S(r2, r1, r0)
            r0 = 1018893372(0x3cbb143c, float:0.022836797)
            X.032 r3 = r1.A03(r0)
            r2 = 0
            r1 = 13
            X.MH4 r0 = new X.MH4
            r0.<init>((X.AnonymousClass4D7) r2, (java.lang.Object) r6, (java.lang.Object) r5, (int) r1)
            X.DbY.A19(r5, r0, r3)
            r0 = -707833443(0xffffffffd5cf519d, float:-2.84936792E13)
            goto L_0x142e
        L_0x1342:
            r0 = -901120467(0xffffffffca49fe2d, float:-3309451.2)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r3.A01
            X.EtU r1 = (X.EtU) r1
            java.lang.Object r0 = r3.A02
            java.lang.String r6 = X.DbS.A0q(r0)
            com.instagram.business.fragment.SuggestBusinessFragment r2 = r1.A00
            androidx.fragment.app.FragmentActivity r1 = r2.requireActivity()
            com.instagram.common.session.UserSession r0 = r2.A04
            X.6Yo r5 = X.DbS.A0M(r1, r0)
            X.1a1 r3 = X.C46447Df9.A02()
            com.instagram.common.session.UserSession r2 = r2.A04
            java.lang.String r1 = "suggest_business_fragment"
            java.lang.String r0 = "suggested_professional_user_card"
            X.Dfc r0 = X.C46548Dgp.A01(r2, r6, r0, r1)
            X.C46474Dfc.A02(r5, r2, r3, r0)
            r0 = -2050088875(0xffffffff85ce2055, float:-1.9384024E-35)
            goto L_0x142e
        L_0x1375:
            r0 = -1411228579(0xffffffffabe25c5d, float:-1.6083902E-12)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r3.A02
            com.instagram.business.fragment.CategorySearchFragment r1 = (com.instagram.business.fragment.CategorySearchFragment) r1
            java.lang.Object r0 = r3.A01
            X.FYO r0 = (X.FYO) r0
            r1.A0d(r0)
            r0 = 1074982044(0x4012ec9c, float:2.2956915)
            goto L_0x142e
        L_0x138c:
            r0 = -1058569975(0xffffffffc0e78109, float:-7.2345014)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r3.A01
            X.E9E r1 = (X.E9E) r1
            java.lang.Object r0 = r3.A02
            X.Dvt r0 = (X.C47359Dvt) r0
            X.4or r0 = r0.A00
            if (r0 == 0) goto L_0x13a9
            r1.A01(r0)
            r0 = -211623475(0xfffffffff362e1cd, float:-1.7975447E31)
            X.AnonymousClass0fD.A0C(r0, r2)
            return
        L_0x13a9:
            java.lang.String r0 = "Partner should not be null if row enabled"
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0z(r0)
            r0 = -1325791964(0xffffffffb0fa0524, float:-1.8191355E-9)
            X.AnonymousClass0fD.A0C(r0, r2)
            throw r1
        L_0x13b6:
            java.lang.Object r4 = r3.A01
            X.ES4 r4 = (X.ES4) r4
            java.lang.Object r3 = r3.A02
            android.content.Context r3 = (android.content.Context) r3
            com.instagram.common.session.UserSession r2 = r4.A00
            X.DeL r1 = X.C46398DeL.A0E
            r0 = 0
            X.C46399DeM.A02(r3, r4, r1, r2, r0)
            return
        L_0x13c7:
            java.lang.Object r4 = r3.A01
            X.ES4 r4 = (X.ES4) r4
            java.lang.Object r3 = r3.A02
            android.content.Context r3 = (android.content.Context) r3
            X.FFt r2 = new X.FFt
            r2.<init>()
            X.Di6 r0 = X.C46626Di6.HALF_SHEET
            r2.A03 = r0
            X.Di7 r0 = X.C46627Di7.ENABLED
            r2.A02 = r0
            r0 = 2
            X.Foi r1 = new X.Foi
            r1.<init>((android.content.Context) r3, (int) r0)
            com.meta.foa.cds.CdsOpenScreenCallerDismissCallback r0 = new com.meta.foa.cds.CdsOpenScreenCallerDismissCallback
            r0.<init>(r1)
            r2.A04 = r0
            X.DfZ r0 = r2.A03()
            X.ES4.A06(r4, r0)
            return
        L_0x13f1:
            r0 = -1356414871(0xffffffffaf26c069, float:-1.516597E-10)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r3.A01
            X.F3u r0 = (X.C49729F3u) r0
            java.lang.Object r1 = r3.A02
            com.instagram.user.model.User r1 = (com.instagram.user.model.User) r1
            X.G84 r0 = r0.A02
            if (r0 != 0) goto L_0x140e
            java.lang.String r0 = "delegate"
            X.0qQ.A0F(r0)
            X.00P r1 = X.AnonymousClass00P.createAndThrow()
            throw r1
        L_0x140e:
            r0.FLR(r1)
            r0 = -102017833(0xfffffffff9eb54d7, float:-1.5273881E35)
            goto L_0x142e
        L_0x1415:
            r0 = 1331772960(0x4f613e20, float:3.77894502E9)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r3.A01
            X.E9E r1 = (X.E9E) r1
            java.lang.Object r0 = r3.A02
            X.Dvt r0 = (X.C47359Dvt) r0
            X.4or r0 = r0.A00
            if (r0 == 0) goto L_0x1432
            r1.A01(r0)
            r0 = -338219826(0xffffffffebd72cce, float:-5.2026127E26)
        L_0x142e:
            X.AnonymousClass0fD.A0C(r0, r4)
            return
        L_0x1432:
            java.lang.String r0 = "Partner should not be null if row enabled"
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0z(r0)
            r0 = 591209237(0x233d2315, float:1.02531394E-17)
            X.AnonymousClass0fD.A0C(r0, r4)
            throw r1
        L_0x143f:
            java.lang.Object r6 = r3.A01
            X.E4C r6 = (X.E4C) r6
            java.lang.Object r4 = r3.A02
            com.instagram.user.model.User r4 = (com.instagram.user.model.User) r4
            com.instagram.common.session.UserSession r1 = r6.A02
            X.EZs r0 = X.C48150EZs.A03
            java.lang.String r2 = r0.toString()
            X.AnonymousClass7TG.A1N(r1, r2)
            java.lang.String r0 = "linking_prescreen_primary_button_clicked"
            X.FG9.A00(r1, r0, r2)
            com.instagram.common.session.UserSession r1 = r6.A02
            r0 = 0
            X.0qQ.A0B(r1, r0)
            java.lang.String r0 = "linking_flow_initiated"
            X.FG9.A00(r1, r0, r2)
            com.instagram.common.session.UserSession r1 = r6.A02
            java.lang.String r0 = r4.getId()
            X.C48922EmM.A00(r1, r2, r0)
            X.F2W r3 = r6.A01
            com.instagram.common.session.UserSession r0 = r3.A04
            X.1Ng r2 = X.AnonymousClass1Nd.A00(r0)
            java.lang.Class<X.FW1> r1 = X.FW1.class
            X.1wn r0 = r3.A03
            r2.A01(r0, r1)
            X.1Z9 r1 = X.C48920EmK.A00()
            X.EmJ r0 = r1.A00
            if (r0 != 0) goto L_0x1489
            X.EmJ r0 = new X.EmJ
            r0.<init>()
            r1.A00 = r0
        L_0x1489:
            X.ELW r5 = new X.ELW
            r5.<init>()
            com.instagram.common.session.UserSession r7 = r6.A02
            java.lang.String r9 = r4.getId()
            java.lang.String r8 = "igpc_login_info"
            r10 = 51738(0xca1a, float:7.25E-41)
            r5.A01(r6, r7, r8, r9, r10)
            return
        L_0x149d:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0y()
            throw r1
        L_0x14a2:
            int r0 = r4.size()
            if (r0 <= r2) goto L_0x14b2
            com.instagram.common.session.UserSession r11 = r10.A04
            java.lang.String r12 = r10.A0M
            r13 = 0
            java.lang.String r15 = "existing"
            X.C3265677h.A09(r9, r10, r11, r12, r13, r14, r15)
        L_0x14b2:
            X.EEP r0 = r10.A0A
            boolean r0 = r0.A0S()
            X.E5H.A0C(r10, r4, r0)
            return
        L_0x14bc:
            java.lang.IllegalArgumentException r1 = X.AnonymousClass7TE.A0w(r5)
            throw r1
        L_0x14c1:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0z(r5)
            throw r1
        L_0x14c6:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0z(r5)
            throw r1
        L_0x14cb:
            java.lang.IllegalStateException r1 = X.DbU.A0i()
            throw r1
        L_0x14d0:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0y()
            throw r1
        L_0x14d5:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0y()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FPE.onClick(android.view.View):void");
    }

    public FPE(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public FPE(C69503Nml nml, C47392E0k e0k, int i) {
        this.A00 = i;
        if (42 - i != 0) {
            this.A02 = e0k;
            this.A01 = nml;
        } else {
            this.A01 = nml;
            this.A02 = e0k;
        }
    }
}
