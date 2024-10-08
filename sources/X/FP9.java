package X;

import android.view.View;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import java.util.HashMap;

public final class FP9 implements View.OnClickListener {
    public final int A00;
    public final Object A01;

    public FP9(EyI eyI, int i) {
        this.A00 = i;
        if (58 - i != 0) {
            this.A01 = eyI;
        } else {
            this.A01 = eyI;
        }
    }

    /* JADX WARNING: type inference failed for: r1v19, types: [android.content.Context, com.instagram.base.activity.BaseFragmentActivity] */
    /* JADX WARNING: type inference failed for: r0v39, types: [android.content.Context, com.instagram.base.activity.BaseFragmentActivity] */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x09a7, code lost:
        r0 = "birthdayLogger";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x09bd, code lost:
        X.0qQ.A0F(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x09c4, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0b42, code lost:
        r4 = new X.C51637FxV(r5, r0);
        r3 = r5.A02;
        r2 = X.DbW.A0Y(r3);
        X.DbX.A15(r3.requireActivity(), r2);
        X.AnonymousClass0fN.A00(r2);
        r1 = X.C359988do.A04(r5.A00, "com.instagram.portable.settings.help.open_screen_async_action", r4);
        X.E86.A01(r1, r5, r2, 17);
        r3.schedule(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0b67, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x0c1b, code lost:
        X.AnonymousClass0fD.A0C(r0, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x0c1e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x0c26, code lost:
        X.AnonymousClass0fD.A0C(r0, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x0c29, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x0d1a, code lost:
        X.AnonymousClass0fD.A0C(r0, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x0d1d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x0d8a, code lost:
        X.AnonymousClass0fD.A0C(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x0d8d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x0da5, code lost:
        X.AnonymousClass0fD.A0C(r0, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x0da8, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0465, code lost:
        r4.A0A = r5;
        r4.A04();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x046a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0016, code lost:
        X.AnonymousClass0fD.A0C(r0, r4);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r15) {
        /*
            r14 = this;
            int r0 = r14.A00
            switch(r0) {
                case 0: goto L_0x0d6f;
                case 1: goto L_0x0d4e;
                case 2: goto L_0x0d20;
                case 3: goto L_0x0c63;
                case 4: goto L_0x0c2a;
                case 5: goto L_0x0bc6;
                case 6: goto L_0x0b68;
                case 7: goto L_0x0751;
                case 8: goto L_0x072f;
                case 9: goto L_0x0708;
                case 10: goto L_0x06d2;
                case 11: goto L_0x06b2;
                case 12: goto L_0x069c;
                case 13: goto L_0x0657;
                case 14: goto L_0x0b3d;
                case 15: goto L_0x0b05;
                case 16: goto L_0x0aff;
                case 17: goto L_0x0af9;
                case 18: goto L_0x063c;
                case 19: goto L_0x0619;
                case 20: goto L_0x05f6;
                case 21: goto L_0x05c1;
                case 22: goto L_0x0a96;
                case 23: goto L_0x0594;
                case 24: goto L_0x0a33;
                case 25: goto L_0x0567;
                case 26: goto L_0x053a;
                case 27: goto L_0x0515;
                case 28: goto L_0x04f0;
                case 29: goto L_0x04cb;
                case 30: goto L_0x04ac;
                case 31: goto L_0x046b;
                case 32: goto L_0x0440;
                case 33: goto L_0x042b;
                case 34: goto L_0x001a;
                case 35: goto L_0x03fa;
                case 36: goto L_0x03b5;
                case 37: goto L_0x0399;
                case 38: goto L_0x037d;
                case 39: goto L_0x0362;
                case 40: goto L_0x031d;
                case 41: goto L_0x02ec;
                case 42: goto L_0x02c9;
                case 43: goto L_0x02a0;
                case 44: goto L_0x0277;
                case 45: goto L_0x0266;
                case 46: goto L_0x09aa;
                case 47: goto L_0x09e8;
                case 48: goto L_0x0253;
                case 49: goto L_0x023f;
                case 50: goto L_0x0954;
                case 51: goto L_0x022c;
                case 52: goto L_0x0219;
                case 53: goto L_0x0206;
                case 54: goto L_0x0930;
                case 55: goto L_0x08e9;
                case 56: goto L_0x089b;
                case 57: goto L_0x0850;
                case 58: goto L_0x0810;
                case 59: goto L_0x01d4;
                case 60: goto L_0x01b9;
                case 61: goto L_0x0189;
                case 62: goto L_0x0152;
                case 63: goto L_0x0117;
                case 64: goto L_0x00f1;
                case 65: goto L_0x07b2;
                case 66: goto L_0x0771;
                case 67: goto L_0x00b8;
                case 68: goto L_0x007e;
                case 69: goto L_0x006c;
                default: goto L_0x0005;
            }
        L_0x0005:
            r0 = 1069551444(0x3fc00f54, float:1.5004678)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r14.A01
            X.E3t r0 = (X.C47469E3t) r0
            r0.onBackPressed()
            r0 = 1685461866(0x64761b6a, float:1.8159498E22)
        L_0x0016:
            X.AnonymousClass0fD.A0C(r0, r4)
        L_0x0019:
            return
        L_0x001a:
            java.lang.Object r0 = r14.A01
            X.Ezz r0 = (X.C49642Ezz) r0
            com.instagram.common.session.UserSession r6 = r0.A02
            java.lang.String r9 = "shopping_business_settings"
            androidx.fragment.app.FragmentActivity r2 = r0.A01
            java.lang.String r8 = "SHOP_INVENTORY_SHOPPING_SETTINGS"
            r0 = 0
            X.AnonymousClass7TF.A1C(r6, r0, r2)
            X.F1Y r7 = X.C49314Esx.A01
            r7.A00()
            java.lang.String r1 = X.AnonymousClass7TG.A0j()
            java.lang.String r5 = "1"
            X.6Yo r4 = X.DbS.A0M(r2, r6)
            r0 = 1
            r4.A0F = r0
            X.3kF r0 = X.C249713kF.A00
            r0.A0T()
            r0 = 2131973802(0x7f1356aa, float:1.958465E38)
            java.lang.String r3 = X.AnonymousClass7TE.A16(r2, r0)
            java.util.HashMap r2 = X.AnonymousClass7TE.A1E()
            java.lang.String r0 = "prior_module"
            r2.put(r0, r9)
            java.lang.String r0 = "entry_point"
            r2.put(r0, r8)
            r7.A00()
            java.lang.String r0 = "waterfall_id"
            r2.put(r0, r1)
            java.lang.String r1 = "default"
            java.lang.String r0 = "presentation_style"
            r2.put(r0, r1)
            java.lang.String r0 = "com.bloks.www.bloks.commerce.shop.inventory.settings"
            X.C46649DiU.A0A(r4, r6, r0, r3, r2)
            goto L_0x0465
        L_0x006c:
            r0 = 922061595(0x36f58b1b, float:7.317763E-6)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r14.A01
            X.E3t r0 = (X.C47469E3t) r0
            r0.onBackPressed()
            r0 = 933705605(0x37a73785, float:1.9933805E-5)
            goto L_0x0016
        L_0x007e:
            r0 = 94305318(0x59efc26, float:1.4950873E-35)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r14.A01
            X.ERz r5 = (X.C48034ERz) r5
            java.lang.String r0 = r5.A01
            android.os.Bundle r0 = X.DbX.A0B(r0)
            X.KXb r3 = new X.KXb
            r3.<init>()
            androidx.fragment.app.FragmentActivity r0 = X.DbU.A0I(r0, r3, r5)
            X.0eM r2 = r5.A02
            X.6Yo r1 = X.DbX.A0N(r0, r2)
            r0 = 1
            r1.A0F = r0
            X.0qQ.A0A(r3)
            r1.A0D(r3)
            r1.A04()
            X.0wc r1 = X.DbX.A0P(r5, r2)
            java.lang.String r0 = "call_settings_specific_people_tapped"
            X.Dba.A1I(r1, r0)
            r0 = 1214862707(0x48695573, float:238933.8)
            goto L_0x0016
        L_0x00b8:
            r0 = 1916969557(0x7242a255, float:3.8551257E30)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r14.A01
            X.EyI r2 = (X.EyI) r2
            com.instagram.common.session.UserSession r5 = r2.A01
            java.lang.String r1 = "security"
            java.lang.String r0 = "emails_sent_list_entered"
            X.FCT.A02(r5, r1, r0)
            java.util.HashMap r1 = X.AnonymousClass7TE.A1E()
            java.lang.String r0 = "com.instagram.account_security.screens.email_sent_list"
            X.DiU r3 = X.C46649DiU.A04(r0, r1)
            androidx.fragment.app.FragmentActivity r2 = r2.A00
            com.instagram.bloks.hosting.IgBloksScreenConfig r1 = X.DbS.A0N(r5)
            r0 = 0
            r1.A0m = r0
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            r1.A0P = r0
            r0 = 2131961576(0x7f1326e8, float:1.9559853E38)
            X.DbS.A18(r2, r1, r0)
            r3.A0D(r2, r1)
            r0 = -591119107(0xffffffffdcc43cfd, float:-4.41889222E17)
            goto L_0x0016
        L_0x00f1:
            r0 = 95013899(0x5a9cc0b, float:1.5967637E-35)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r14.A01
            X.EyI r0 = (X.EyI) r0
            androidx.fragment.app.FragmentActivity r1 = r0.A00
            com.instagram.common.session.UserSession r0 = r0.A01
            X.6Yo r1 = X.DbU.A0Q(r1, r0)
            X.DbT.A15()
            X.ESO r0 = new X.ESO
            r0.<init>()
            r1.A0E(r0)
            r1.A04()
            r0 = -1869277545(0xffffffff90951697, float:-5.880494E-29)
            goto L_0x0016
        L_0x0117:
            r0 = -2054557478(0xffffffff8589f0da, float:-1.2971893E-35)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r6 = r14.A01
            X.EyI r6 = (X.EyI) r6
            com.instagram.common.session.UserSession r5 = r6.A01
            java.lang.String r1 = "security"
            java.lang.String r0 = "password_setting_entered"
            r3 = 0
            X.FCT.A02(r5, r1, r0)
            X.FBX r2 = new X.FBX
            r2.<init>(r5)
            r1 = 857808781(0x33211f8d, float:3.751443E-8)
            java.lang.String r0 = "password_change"
            r2.A01(r1, r0)
            androidx.fragment.app.FragmentActivity r0 = r6.A00
            X.6Yo r1 = X.DbU.A0Q(r0, r5)
            X.F3j r0 = X.DbW.A0X()
            X.E75 r0 = r0.A00(r5, r3)
            r1.A0E(r0)
            r1.A04()
            r0 = -732623120(0xffffffffd4550ef0, float:-3.66031457E12)
            goto L_0x0016
        L_0x0152:
            r0 = -533851693(0xffffffffe02e11d3, float:-5.0172154E19)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r14.A01
            X.EyI r5 = (X.EyI) r5
            com.instagram.common.session.UserSession r0 = r5.A01
            X.1NY r2 = X.DbU.A0N(r0)
            java.lang.String r0 = "accounts/send_password_reset_link/"
            r2.A0A(r0)
            java.lang.Class<X.DwE> r1 = X.DwE.class
            java.lang.Class<X.F6D> r0 = X.F6D.class
            X.1OC r3 = X.DbY.A0N(r2, r1, r0)
            androidx.fragment.app.FragmentActivity r2 = r5.A00
            X.E6c r0 = r5.A02
            X.0hq r1 = r0.getParentFragmentManager()
            X.ENe r0 = new X.ENe
            r0.<init>(r2)
            r0.A00 = r1
            r3.A00 = r0
            X.1ES.A03(r3)
            r0 = -122957813(0xfffffffff8abd00b, float:-2.78782E34)
            goto L_0x0016
        L_0x0189:
            r0 = 1881740870(0x70291646, float:2.0931957E29)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r14.A01
            X.EyI r2 = (X.EyI) r2
            androidx.fragment.app.FragmentActivity r1 = r2.A00
            com.instagram.common.session.UserSession r0 = r2.A01
            X.6Yo r3 = X.DbY.A0J(r1, r0)
            X.E6c r2 = r2.A02
            android.os.Bundle r0 = X.DbY.A09(r0)
            X.E3Q r1 = new X.E3Q
            r1.<init>()
            r1.setArguments(r0)
            r0 = 0
            r1.setTargetFragment(r2, r0)
            r3.A0E(r1)
            r3.A04()
            r0 = -576617186(0xffffffffdda1851e, float:-1.45484272E18)
            goto L_0x0016
        L_0x01b9:
            r0 = 1311857626(0x4e315bda, float:7.438967E8)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r14.A01
            X.EyI r0 = (X.EyI) r0
            X.E6c r3 = r0.A02
            com.instagram.common.session.UserSession r2 = r0.A01
            java.lang.String r1 = "ig_change_password_phase_1"
            java.lang.String r0 = "password_change"
            X.C49955FGk.A02(r3, r2, r1, r0)
            r0 = 98598553(0x5e07e99, float:2.1111363E-35)
            goto L_0x0016
        L_0x01d4:
            r0 = 320605810(0x131c0e72, float:1.969709E-27)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r14.A01
            X.EyI r2 = (X.EyI) r2
            com.instagram.common.session.UserSession r5 = r2.A01
            java.lang.String r1 = "security"
            java.lang.String r0 = "app_and_websites_entered"
            X.FCT.A02(r5, r1, r0)
            java.util.HashMap r1 = X.AnonymousClass7TE.A1E()
            java.lang.String r0 = "com.instagram.platformapi.platform_authorized_applications.list"
            X.DiU r3 = X.C46649DiU.A04(r0, r1)
            androidx.fragment.app.FragmentActivity r2 = r2.A00
            com.instagram.bloks.hosting.IgBloksScreenConfig r1 = X.DbS.A0N(r5)
            r0 = 2131953103(0x7f1305cf, float:1.9542668E38)
            X.DbS.A18(r2, r1, r0)
            X.C46649DiU.A07(r2, r1, r3)
            r0 = -69850975(0xfffffffffbd628a1, float:-2.2239512E36)
            goto L_0x0016
        L_0x0206:
            r0 = -1214257175(0xffffffffb79fe7e9, float:-1.9062269E-5)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r14.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            X.DbT.A1K(r0)
            r0 = -1627496130(0xffffffff9efe613e, float:-2.6933515E-20)
            goto L_0x0016
        L_0x0219:
            r0 = 1963857869(0x750e17cd, float:1.8012424E32)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r14.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            X.Dbb.A0z(r0)
            r0 = -975386000(0xffffffffc5dcca70, float:-7065.3047)
            goto L_0x0016
        L_0x022c:
            r0 = -162137713(0xfffffffff655f98f, float:-1.0849813E33)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r14.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            X.Dbb.A0z(r0)
            r0 = 768841750(0x2dd39816, float:2.4055462E-11)
            goto L_0x0016
        L_0x023f:
            r0 = -771162969(0xffffffffd208fca7, float:-1.47088589E11)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r14.A01
            X.E26 r1 = (X.E26) r1
            r0 = 1
            X.E26.A06(r1, r0)
            r0 = 1936681408(0x736f69c0, float:1.8968259E31)
            goto L_0x0016
        L_0x0253:
            r0 = -1287772389(0xffffffffb33e271b, float:-4.427339E-8)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r14.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            X.Dbb.A0z(r0)
            r0 = -1069877403(0xffffffffc03af765, float:-2.9213498)
            goto L_0x0016
        L_0x0266:
            r0 = -52202799(0xfffffffffce372d1, float:-9.447841E36)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r14.A01
            X.Dba.A1Q(r0)
            r0 = 444138843(0x1a79055b, float:5.149632E-23)
            goto L_0x0016
        L_0x0277:
            r0 = -1497266259(0xffffffffa6c187ad, float:-1.342884E-15)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r14.A01
            X.ESZ r3 = (X.ESZ) r3
            android.content.Context r1 = r3.A04
            r0 = 2131975388(0x7f135cdc, float:1.9587867E38)
            java.lang.String r2 = r1.getString(r0)
            X.EbY r0 = r3.A00
            X.SGw r0 = r0.A01
            java.lang.String r1 = java.lang.String.valueOf(r0)
            X.FlO r0 = new X.FlO
            r0.<init>(r14)
            X.ESZ.A01(r0, r3, r2, r1)
            r0 = 341576024(0x145c0958, float:1.1109004E-26)
            goto L_0x0016
        L_0x02a0:
            r0 = -1230459795(0xffffffffb6a8ac6d, float:-5.026863E-6)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r14.A01
            X.ESZ r3 = (X.ESZ) r3
            android.content.Context r1 = r3.A04
            r0 = 2131975387(0x7f135cdb, float:1.9587865E38)
            java.lang.String r2 = r1.getString(r0)
            X.EbY r0 = r3.A00
            X.SGw r0 = r0.A00
            java.lang.String r1 = java.lang.String.valueOf(r0)
            X.FlN r0 = new X.FlN
            r0.<init>(r14)
            X.ESZ.A01(r0, r3, r2, r1)
            r0 = 993763420(0x3b3ba05c, float:0.0028629517)
            goto L_0x0016
        L_0x02c9:
            r0 = -938591605(0xffffffffc80e3a8b, float:-145642.17)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.String r0 = "stella://"
            android.net.Uri r2 = android.net.Uri.parse(r0)
            X.0qQ.A07(r2)
            java.lang.String r0 = "android.intent.action.VIEW"
            android.content.Intent r1 = new android.content.Intent
            r1.<init>(r0, r2)
            java.lang.Object r0 = r14.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            X.0kR.A03(r1, r0)
            r0 = 1997769095(0x77138987, float:2.9924103E33)
            goto L_0x0016
        L_0x02ec:
            r0 = 673722374(0x28283006, float:9.336287E-15)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.String r1 = "com.instagram.shopping.screens.shop_linking_seller"
            java.util.HashMap r0 = X.AnonymousClass7TE.A1E()
            X.DiU r1 = X.C46649DiU.A04(r1, r0)
            java.lang.Object r3 = r14.A01
            X.Ezz r3 = (X.C49642Ezz) r3
            com.instagram.common.session.UserSession r2 = r3.A02
            com.instagram.bloks.hosting.IgBloksScreenConfig r0 = X.DbS.A0N(r2)
            X.3M3 r1 = X.C49891FBs.A02(r0, r1)
            androidx.fragment.app.FragmentActivity r0 = r3.A01
            X.6Yo r1 = X.DbV.A0N(r1, r0, r2)
            java.lang.String r0 = "shopping_business_settings"
            r1.A0A = r0
            r1.A04()
            r0 = -1981423380(0xffffffff89e5e0ec, float:-5.534126E-33)
            goto L_0x0016
        L_0x031d:
            r0 = 1195574780(0x474305fc, float:49925.984)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r14.A01
            X.Ezz r0 = (X.C49642Ezz) r0
            com.instagram.common.session.UserSession r7 = r0.A02
            java.lang.String r6 = "shopping_business_settings"
            androidx.fragment.app.FragmentActivity r2 = r0.A01
            java.lang.String r5 = "PRODUCT_TAG_OPTIONS"
            r0 = 0
            X.0qQ.A0B(r7, r0)
            X.F1Y r0 = X.C49314Esx.A01
            r0.A00()
            java.lang.String r1 = X.AnonymousClass7TG.A0j()
            X.6Yo r3 = X.DbU.A0Q(r2, r7)
            X.3kF r0 = X.C249713kF.A00
            r0.A0T()
            r0 = 2131973806(0x7f1356ae, float:1.9584658E38)
            java.lang.String r2 = r2.getString(r0)
            java.util.HashMap r1 = A00(r2, r5, r1, r6)
            java.lang.String r0 = "com.instagram.shopping.screens.product_tags_options"
            X.C46649DiU.A0A(r3, r7, r0, r2, r1)
            java.lang.String r0 = "1"
            r3.A0A = r0
            r3.A04()
            r0 = 938250175(0x37ec8fbf, float:2.820033E-5)
            goto L_0x0016
        L_0x0362:
            r0 = 865565080(0x33977998, float:7.053603E-8)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r14.A01
            X.Ezz r0 = (X.C49642Ezz) r0
            com.instagram.common.session.UserSession r3 = r0.A02
            java.lang.String r2 = "shopping_business_settings"
            androidx.fragment.app.FragmentActivity r1 = r0.A01
            java.lang.String r0 = "CHECKOUT_UPSELL_SHOPPING_SETTINGS"
            X.C324476zN.A0I(r1, r3, r0, r2)
            r0 = -12795071(0xffffffffff3cc341, float:-2.5090868E38)
            goto L_0x0016
        L_0x037d:
            r0 = 224020959(0xd5a49df, float:6.7265356E-31)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r14.A01
            X.Ezz r0 = (X.C49642Ezz) r0
            com.instagram.common.session.UserSession r5 = r0.A02
            java.lang.String r3 = "shopping_business_settings"
            androidx.fragment.app.FragmentActivity r2 = r0.A01
            java.lang.String r1 = "CHECKOUT_DEFERRED_PAYOUT_SHOPPING_SETTINGS"
            r0 = 1
            X.C324476zN.A0Q(r2, r5, r1, r3, r0)
            r0 = 1153442601(0x44c02329, float:1537.0988)
            goto L_0x0016
        L_0x0399:
            r0 = -2147408922(0xffffffff800123e6, float:-1.04713E-40)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r14.A01
            X.Ezz r0 = (X.C49642Ezz) r0
            com.instagram.common.session.UserSession r5 = r0.A02
            java.lang.String r3 = "shopping_business_settings"
            androidx.fragment.app.FragmentActivity r2 = r0.A01
            java.lang.String r1 = "CHECKOUT_SETUP_SHOPPING_SETTINGS"
            r0 = 0
            X.C324476zN.A0Q(r2, r5, r1, r3, r0)
            r0 = 2020353008(0x786c23f0, float:1.9157984E34)
            goto L_0x0016
        L_0x03b5:
            r0 = 547884709(0x20a80ea5, float:2.8469998E-19)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r14.A01
            X.Ezz r0 = (X.C49642Ezz) r0
            com.instagram.common.session.UserSession r7 = r0.A02
            java.lang.String r6 = "shopping_business_settings"
            androidx.fragment.app.FragmentActivity r2 = r0.A01
            java.lang.String r5 = "DOMAIN_CHANGE_SHOPPING_SETTINGS"
            r0 = 0
            X.0qQ.A0B(r7, r0)
            X.F1Y r0 = X.C49314Esx.A01
            r0.A00()
            java.lang.String r1 = X.AnonymousClass7TG.A0j()
            X.6Yo r3 = X.DbU.A0Q(r2, r7)
            X.3kF r0 = X.C249713kF.A00
            r0.A0T()
            r0 = 2131973809(0x7f1356b1, float:1.9584664E38)
            java.lang.String r2 = r2.getString(r0)
            java.util.HashMap r1 = A00(r2, r5, r1, r6)
            java.lang.String r0 = "com.instagram.shopping.screens.domain_change"
            X.C46649DiU.A0A(r3, r7, r0, r2, r1)
            java.lang.String r0 = "1"
            r3.A0A = r0
            r3.A04()
            r0 = -843096159(0xffffffffcdbf5fa1, float:-4.01339424E8)
            goto L_0x0016
        L_0x03fa:
            r0 = -257976004(0xfffffffff09f993c, float:-3.9514692E29)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r6 = r14.A01
            X.Ezz r6 = (X.C49642Ezz) r6
            X.Ev1 r0 = r6.A03
            r3 = 0
            X.0wc r1 = r0.A00
            java.lang.String r0 = "shopping_business_setting_tapped"
            X.0Aj r2 = X.AnonymousClass7TE.A0e(r1, r0)
            java.lang.String r1 = "domain"
            java.lang.String r0 = "shopping_business_setting_type"
            r2.AAJ(r0, r1)
            X.DbV.A1G(r2, r3)
            com.instagram.common.session.UserSession r5 = r6.A02
            java.lang.String r3 = "shopping_business_settings"
            androidx.fragment.app.FragmentActivity r2 = r6.A01
            java.lang.String r1 = "POLICY_MIGRATION_SHOPPING_SETTINGS"
            r0 = 0
            X.C324476zN.A0O(r2, r5, r1, r3, r0)
            r0 = 1006893167(0x3c03f86f, float:0.008054837)
            goto L_0x0016
        L_0x042b:
            r0 = 559150398(0x2153f53e, float:7.1814156E-19)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r14.A01
            android.content.Context r0 = X.DbT.A08(r0)
            X.C3726691w.A07(r0)
            r0 = 550390908(0x20ce4c7c, float:3.494837E-19)
            goto L_0x0016
        L_0x0440:
            java.lang.Object r2 = r14.A01
            X.ERj r2 = (X.C48020ERj) r2
            androidx.fragment.app.FragmentActivity r0 = r2.getActivity()
            if (r0 == 0) goto L_0x0019
            com.instagram.common.session.UserSession r1 = r2.A00
            java.lang.String r0 = "settings_single_payment_option"
            X.C18707VyY.A01(r1, r0)
            androidx.fragment.app.FragmentActivity r1 = r2.requireActivity()
            com.instagram.common.session.UserSession r0 = r2.A00
            X.6Yo r4 = X.DbU.A0Q(r1, r0)
            X.UsI r0 = new X.UsI
            r0.<init>()
            r4.A0E(r0)
            java.lang.String r5 = "PromotePaymentsInterstitialFragment.BACK_STACK_NAME"
        L_0x0465:
            r4.A0A = r5
            r4.A04()
            return
        L_0x046b:
            r0 = 777553380(0x2e5885e4, float:4.9231633E-11)
            int r4 = X.AnonymousClass0fD.A05(r0)
            X.1WM r0 = X.1WM.getInstance()
            java.lang.Object r6 = r14.A01
            X.F3U r6 = (X.F3U) r6
            com.instagram.common.session.UserSession r5 = r6.A05
            X.TmU r3 = r0.getPerformanceLogger(r5)
            java.lang.Integer r2 = X.AnonymousClass05K.A01
            java.lang.String r1 = "email_sms_notification_settings"
            r0 = 0
            r3.EwT(r2, r0, r1)
            X.1WM.getInstance()
            X.T8B r1 = new X.T8B
            r1.<init>(r5)
            java.lang.String r0 = "IgEmailSmsSettingsRoute"
            X.T8B r2 = r1.A01(r0)
            android.app.Activity r1 = r6.A01
            r0 = 2131961583(0x7f1326ef, float:1.9559867E38)
            java.lang.String r0 = r1.getString(r0)
            r2.A07 = r0
            r0 = 1
            r2.A08 = r0
            r2.A02(r1)
            r0 = 831497491(0x318fa513, float:4.1806145E-9)
            goto L_0x0016
        L_0x04ac:
            r0 = 1622997612(0x60bcfa6c, float:1.0893852E20)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r14.A01
            X.NgU r0 = (X.C69181NgU) r0
            androidx.fragment.app.FragmentActivity r2 = r0.requireActivity()
            X.0eM r0 = r0.A01
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r0)
            java.lang.String r0 = ""
            X.C250563lf.A0d(r2, r1, r0)
            r0 = 152299840(0x913e940, float:1.7804155E-33)
            goto L_0x0016
        L_0x04cb:
            r0 = 1005664558(0x3bf1392e, float:0.0073615527)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r14.A01
            X.NgU r0 = (X.C69181NgU) r0
            androidx.fragment.app.FragmentActivity r1 = r0.requireActivity()
            X.0eM r0 = r0.A01
            X.6Yo r1 = X.DbX.A0N(r1, r0)
            X.Nga r0 = new X.Nga
            r0.<init>()
            r1.A0D(r0)
            r1.A04()
            r0 = 622337371(0x25181d5b, float:1.3193844E-16)
            goto L_0x0016
        L_0x04f0:
            r0 = -509363624(0xffffffffe1a3ba58, float:-3.7753085E20)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r14.A01
            X.NgU r0 = (X.C69181NgU) r0
            androidx.fragment.app.FragmentActivity r1 = r0.requireActivity()
            X.0eM r0 = r0.A01
            X.6Yo r1 = X.DbX.A0N(r1, r0)
            X.ERe r0 = new X.ERe
            r0.<init>()
            r1.A0D(r0)
            r1.A04()
            r0 = 155086402(0x93e6e42, float:2.2922261E-33)
            goto L_0x0016
        L_0x0515:
            r0 = -1214512276(0xffffffffb79c036c, float:-1.8598243E-5)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r14.A01
            X.NgU r0 = (X.C69181NgU) r0
            androidx.fragment.app.FragmentActivity r1 = r0.requireActivity()
            X.0eM r0 = r0.A01
            X.6Yo r1 = X.DbX.A0N(r1, r0)
            X.Kag r0 = new X.Kag
            r0.<init>()
            r1.A0D(r0)
            r1.A04()
            r0 = -1472737412(0xffffffffa837cf7c, float:-1.0203532E-14)
            goto L_0x0016
        L_0x053a:
            r0 = 1470910406(0x57ac4fc6, float:3.78917249E14)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r14.A01
            X.NgU r0 = (X.C69181NgU) r0
            androidx.fragment.app.FragmentActivity r2 = r0.requireActivity()
            X.0eM r0 = r0.A01
            X.0lg r1 = X.DbT.A0X(r0)
            r0 = 1
            X.0qQ.A0B(r1, r0)
            X.6Yo r1 = X.DbU.A0Q(r2, r1)
            X.ERu r0 = new X.ERu
            r0.<init>()
            r1.A0D(r0)
            r1.A04()
            r0 = 1569111462(0x5d86bda6, float:1.21363736E18)
            goto L_0x0016
        L_0x0567:
            r0 = 466050122(0x1bc75c4a, float:3.298143E-22)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r14.A01
            X.NgU r0 = (X.C69181NgU) r0
            androidx.fragment.app.FragmentActivity r2 = r0.requireActivity()
            X.0eM r0 = r0.A01
            X.0lg r1 = X.DbT.A0X(r0)
            r0 = 1
            X.0qQ.A0B(r1, r0)
            X.6Yo r1 = X.DbU.A0Q(r2, r1)
            X.ERt r0 = new X.ERt
            r0.<init>()
            r1.A0D(r0)
            r1.A04()
            r0 = -482425340(0xffffffffe33ec604, float:-3.51915E21)
            goto L_0x0016
        L_0x0594:
            r0 = -644771697(0xffffffffd991908f, float:-5.1216019E15)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r14.A01
            X.NgU r5 = (X.C69181NgU) r5
            java.util.HashMap r1 = X.AnonymousClass7TE.A1E()
            java.lang.String r0 = "com.instagram.portable_settings.story_replies"
            X.DiU r3 = X.C46649DiU.A04(r0, r1)
            androidx.fragment.app.FragmentActivity r2 = r5.requireActivity()
            X.0eM r0 = r5.A01
            com.instagram.bloks.hosting.IgBloksScreenConfig r1 = X.Dbb.A0J(r0)
            r0 = 2131974500(0x7f135964, float:1.9586066E38)
            X.DbZ.A19(r5, r1, r0)
            r3.A0D(r2, r1)
            r0 = -272441469(0xffffffffefc2df83, float:-1.206206E29)
            goto L_0x0016
        L_0x05c1:
            r0 = -2005733783(0xffffffff8872ee69, float:-7.3104476E-34)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r14.A01
            X.NgU r5 = (X.C69181NgU) r5
            X.0eM r0 = r5.A01
            com.instagram.common.session.UserSession r6 = X.AnonymousClass7TE.A0l(r0)
            r0 = 0
            X.0qQ.A0B(r6, r0)
            java.lang.String r1 = "is_bloks"
            java.lang.String r0 = "0"
            java.util.Map r11 = X.AnonymousClass7TF.A0w(r1, r0)
            java.lang.String r7 = "ig_settings"
            java.lang.String r8 = "click"
            java.lang.String r9 = "button"
            r10 = 0
            X.C48823Ekl.A00(r5, r6, r7, r8, r9, r10, r11)
            androidx.fragment.app.FragmentActivity r1 = r5.requireActivity()
            java.lang.String r0 = "instagram://direct_account_theme_picker?entrypoint=ig_settings"
            X.FHB.A05(r1, r0)
            r0 = -733688296(0xffffffffd444ce18, float:-3.38108508E12)
            goto L_0x0016
        L_0x05f6:
            r0 = 938439157(0x37ef71f5, float:2.8544086E-5)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r14.A01
            X.EzM r0 = (X.C49603EzM) r0
            androidx.fragment.app.FragmentActivity r1 = r0.A01
            com.instagram.common.session.UserSession r0 = r0.A03
            X.6Yo r1 = X.DbS.A0M(r1, r0)
            com.instagram.debug.mcdoptions.MetaCheckoutDeveloperOptionsFragment r0 = new com.instagram.debug.mcdoptions.MetaCheckoutDeveloperOptionsFragment
            r0.<init>()
            r1.A0E(r0)
            r1.A04()
            r0 = 2138969461(0x7f7e1575, float:3.3773532E38)
            goto L_0x0016
        L_0x0619:
            r0 = 1833812714(0x6d4dc2ea, float:3.980004E27)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r14.A01
            X.EzM r0 = (X.C49603EzM) r0
            androidx.fragment.app.FragmentActivity r1 = r0.A01
            com.instagram.common.session.UserSession r0 = r0.A03
            X.6Yo r1 = X.DbS.A0M(r1, r0)
            com.instagram.debug.whoptions.WhitehatOptionsFragment r0 = new com.instagram.debug.whoptions.WhitehatOptionsFragment
            r0.<init>()
            r1.A0E(r0)
            r1.A04()
            r0 = -395880972(0xffffffffe86755f4, float:-4.3698089E24)
            goto L_0x0016
        L_0x063c:
            r0 = -1002524176(0xffffffffc43eb1f0, float:-762.7803)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r14.A01
            X.EzM r0 = (X.C49603EzM) r0
            android.content.Context r3 = r0.A00
            X.0hq r2 = r0.A02
            androidx.fragment.app.FragmentActivity r1 = r0.A01
            com.instagram.common.session.UserSession r0 = r0.A03
            com.instagram.debug.devoptions.api.DeveloperOptionsLauncher.loadAndLaunchDeveloperOptions(r3, r2, r1, r0)
            r0 = 1691086608(0x64cbef10, float:3.0095323E22)
            goto L_0x0016
        L_0x0657:
            r0 = -1656473169(0xffffffff9d4439af, float:-2.5970206E-21)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r8 = r14.A01
            X.FF7 r8 = (X.FF7) r8
            androidx.fragment.app.Fragment r0 = r8.A02
            androidx.fragment.app.FragmentActivity r7 = r0.requireActivity()
            java.lang.String r6 = "self_profile"
            java.lang.String r5 = "follow_accounts_you_know_oc"
            r3 = 1
            X.E6T r2 = new X.E6T
            r2.<init>()
            android.os.Bundle r1 = X.AnonymousClass7TE.A0a()
            java.lang.String r0 = "ARG_ENTRY_POINT"
            r1.putString(r0, r6)
            java.lang.String r0 = "ARG_FROM_PRO_ONBOARDING_CHECKLIST"
            r1.putBoolean(r0, r3)
            java.lang.String r0 = "ARG_MODULE_NAME"
            r1.putString(r0, r5)
            r2.setArguments(r1)
            com.instagram.common.session.UserSession r0 = r8.A04
            X.6Yo r0 = X.DbS.A0M(r7, r0)
            java.lang.Object r1 = X.Dba.A0U(r2, r0)
            java.lang.String r0 = "suma_followings"
            X.FF7.A00(r8, r1, r0)
            r0 = 100918513(0x603e4f1, float:2.480656E-35)
            goto L_0x0016
        L_0x069c:
            r0 = -183189181(0xfffffffff514c143, float:-1.8856927E32)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r14.A01
            X.FF7 r2 = (X.FF7) r2
            java.lang.String r1 = "direct_message"
            r0 = 0
            X.FF7.A00(r2, r0, r1)
            r0 = -758956843(0xffffffffd2c33cd5, float:-4.19269607E11)
            goto L_0x0016
        L_0x06b2:
            r0 = 760373531(0x2d52611b, float:1.195868E-11)
            int r4 = X.AnonymousClass0fD.A05(r0)
            X.ERm r3 = new X.ERm
            r3.<init>()
            java.lang.Object r2 = r14.A01
            X.FRY r2 = (X.FRY) r2
            java.lang.String r0 = X.FRY.A09
            com.instagram.base.activity.BaseFragmentActivity r1 = r2.A00
            if (r1 == 0) goto L_0x0d8e
            com.instagram.common.session.UserSession r0 = r2.A02
            X.Dbb.A11(r3, r1, r0)
            r0 = 177505237(0xa9483d5, float:1.4301471E-32)
            goto L_0x0016
        L_0x06d2:
            r0 = -1754860972(0xffffffff9766f254, float:-7.462287E-25)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r14.A01
            X.FRY r3 = (X.FRY) r3
            java.lang.String r0 = X.FRY.A09
            com.instagram.common.session.UserSession r2 = r3.A02
            X.McN r0 = X.C66778McO.A00(r2)
            r0.A05()
            X.1as r0 = X.1as.A04
            X.1ap r1 = r0.A02
            java.lang.String r0 = "settings_business_options"
            X.NJP r1 = r1.A02(r0)
            com.instagram.base.activity.BaseFragmentActivity r0 = r3.A00
            if (r0 == 0) goto L_0x0d96
            X.6Yo r0 = X.DbU.A0Q(r0, r2)
            X.0qQ.A0A(r1)
            r0.A0D(r1)
            r0.A04()
            r0 = -956411089(0xffffffffc6fe532f, float:-32553.592)
            goto L_0x0016
        L_0x0708:
            r0 = -1237198057(0xffffffffb641db17, float:-2.8886768E-6)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r14.A01
            X.6Yo r3 = X.Dbc.A06(r0)
            X.1Yw r0 = X.C49195Er0.A00()
            X.LEU r2 = r0.A00()
            java.lang.String r0 = "SETTINGS"
            r1 = 0
            X.KUY r0 = r2.A00(r0, r1)
            r3.A0B(r1, r0)
            X.DbZ.A1Q(r3)
            r0 = -114368547(0xfffffffff92edfdd, float:-5.675001E34)
            goto L_0x0016
        L_0x072f:
            r0 = 1388168532(0x52bdc554, float:4.07529718E11)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r14.A01
            X.6Yo r2 = X.Dbc.A06(r0)
            X.F3X r1 = X.FC8.A00()
            java.lang.String r0 = "SETTINGS"
            X.EN2 r0 = r1.A02(r0)
            r2.A0D(r0)
            X.DbZ.A1Q(r2)
            r0 = -742914830(0xffffffffd3b804f2, float:-1.5807139E12)
            goto L_0x0016
        L_0x0751:
            r0 = -1883519624(0xffffffff8fbbc578, float:-1.8515686E-29)
            int r4 = X.AnonymousClass0fD.A05(r0)
            X.ESB r3 = new X.ESB
            r3.<init>()
            java.lang.Object r2 = r14.A01
            X.FRY r2 = (X.FRY) r2
            java.lang.String r0 = X.FRY.A09
            com.instagram.base.activity.BaseFragmentActivity r1 = r2.A00
            if (r1 == 0) goto L_0x0d9e
            com.instagram.common.session.UserSession r0 = r2.A02
            X.Dbb.A11(r3, r1, r0)
            r0 = -1504136055(0xffffffffa658b489, float:-7.5184725E-16)
            goto L_0x0016
        L_0x0771:
            r0 = 1785851715(0x6a71ef43, float:7.312025E25)
            int r7 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r14.A01
            X.EyI r4 = (X.EyI) r4
            com.instagram.common.session.UserSession r3 = r4.A01
            java.lang.String r1 = "security"
            java.lang.String r0 = "login_activity_entered"
            X.FCT.A02(r3, r1, r0)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36314369394477585(0x8103ba00000a11, double:3.028691659071687E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x07a0
            X.E6c r2 = r4.A02
            java.lang.String r1 = "ig_login_activities_phase_1"
            java.lang.String r0 = "login_activities"
            X.C49955FGk.A02(r2, r3, r1, r0)
        L_0x079b:
            r0 = 1460162830(0x5708510e, float:1.49881709E14)
            goto L_0x0d1a
        L_0x07a0:
            androidx.fragment.app.FragmentActivity r0 = r4.A00
            X.6Yo r1 = X.DbS.A0M(r0, r3)
            X.NKT r0 = new X.NKT
            r0.<init>()
            r1.A0E(r0)
            r1.A04()
            goto L_0x079b
        L_0x07b2:
            r0 = 890713953(0x35173761, float:5.633247E-7)
            int r7 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r14.A01
            X.EyI r5 = (X.EyI) r5
            com.instagram.common.session.UserSession r3 = r5.A01
            java.lang.String r1 = "security"
            r0 = 3447(0xd77, float:4.83E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            X.FCT.A02(r3, r1, r0)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36314365099510288(0x8103b900000a10, double:3.028688942917074E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x07e9
            X.E6c r2 = r5.A02
            r0 = 2855(0xb27, float:4.001E-42)
            java.lang.String r1 = X.C273654mx.A00(r0)
            java.lang.String r0 = "two_factor"
            X.C49955FGk.A02(r2, r3, r1, r0)
        L_0x07e4:
            r0 = -1614975750(0xffffffff9fbd6cfa, float:-8.02249E-20)
            goto L_0x0d1a
        L_0x07e9:
            X.F3Y r2 = X.FFR.A00()
            java.lang.Integer r1 = X.AnonymousClass05K.A0C
            r0 = 0
            X.E2h r4 = r2.A02(r1, r0, r0)
            androidx.fragment.app.FragmentActivity r0 = r5.A00
            X.6Yo r3 = X.DbS.A0M(r0, r3)
            r2 = 31
            r1 = 24
            r0 = 88
            java.lang.String r0 = X.Dd6.A02(r2, r1, r0)
            r3.A0A = r0
            r3.A0E(r4)
            r0 = 1
            r3.A0F = r0
            r3.A04()
            goto L_0x07e4
        L_0x0810:
            java.lang.Object r5 = r14.A01
            X.EyI r5 = (X.EyI) r5
            com.instagram.common.session.UserSession r4 = r5.A01
            X.EVx r0 = X.C48105EVx.PROACTIVE
            int r0 = r0.A00
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            X.1NY r2 = X.DbZ.A0L(r4)
            java.lang.String r0 = "security_checkup/start/"
            r2.A0A(r0)
            java.lang.String r0 = "use_case"
            r2.A09(r1, r0)
            java.lang.Class<X.DwC> r1 = X.DwC.class
            java.lang.Class<X.F8b> r0 = X.C49814F8b.class
            X.1OC r3 = X.DbU.A0S(r2, r1, r0)
            androidx.fragment.app.FragmentActivity r2 = r5.A00
            X.0hq r1 = r2.getSupportFragmentManager()
            com.instagram.base.activity.IgFragmentActivity r2 = (com.instagram.base.activity.IgFragmentActivity) r2
            X.AnonymousClass7TG.A1U(r1, r2, r4)
            X.EQP r0 = new X.EQP
            r0.<init>(r1)
            r0.A00 = r1
            r0.A01 = r2
            r0.A02 = r4
            r3.A00 = r0
            X.1ES.A03(r3)
            return
        L_0x0850:
            r0 = 552213688(0x20ea1cb8, float:3.9660146E-19)
            int r7 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r14.A01
            X.E1x r4 = (X.C47428E1x) r4
            X.0eM r5 = r4.A08
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r5)
            X.17i r2 = X.17h.A00(r0)
            android.os.Bundle r1 = r4.requireArguments()
            java.lang.String r0 = "USER_ID_ARGUMENT"
            java.lang.String r0 = r1.getString(r0)
            com.instagram.user.model.User r3 = r2.A02(r0)
            if (r3 == 0) goto L_0x0889
            androidx.fragment.app.FragmentActivity r2 = r4.requireActivity()
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r5)
            java.lang.String r0 = "celebrate_birthday_bottomsheet"
            X.1pE r0 = X.1pE.A01(r2, r4, r1, r0)
            X.Dbc.A0x(r0, r3)
            r0.A06()
        L_0x0889:
            com.instagram.user.model.User r0 = r4.A04
            if (r0 == 0) goto L_0x0896
            java.lang.String r1 = r0.getId()
            java.lang.String r0 = "send_confetti"
            X.C47428E1x.A00(r4, r1, r0)
        L_0x0896:
            r0 = -1551253702(0xffffffffa389bf3a, float:-1.4934557E-17)
            goto L_0x0d1a
        L_0x089b:
            r0 = -353434182(0xffffffffeaef05ba, float:-1.4448016E26)
            int r7 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r14.A01
            X.E1x r4 = (X.C47428E1x) r4
            com.instagram.user.model.User r1 = r4.A04
            if (r1 == 0) goto L_0x08d7
            X.0eM r0 = r4.A08
            X.0lg r0 = X.DbT.A0X(r0)
            java.lang.String r3 = r1.getId()
            X.1NY r2 = X.DbZ.A0L(r0)
            r2.A02()
            java.lang.String r0 = "api/v1/stories/follow_versaries/follow_versaries_media/"
            r2.A0A(r0)
            java.lang.Class<X.DuW> r1 = X.C47303DuW.class
            java.lang.Class<X.F4H> r0 = X.F4H.class
            r2.A0Q(r1, r0)
            java.lang.String r0 = "follower_id"
            X.1OC r1 = X.DbT.A0T(r2, r0, r3)
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.common.api.base.HttpRequestTask<com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.FollowVersariesResponse>, com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.FollowVersariesResponse>>"
            X.0qQ.A0C(r1, r0)
            r0 = 34
            X.C47696EDf.A00(r4, r1, r0)
        L_0x08d7:
            com.instagram.user.model.User r0 = r4.A04
            if (r0 == 0) goto L_0x08e4
            java.lang.String r1 = r0.getId()
            java.lang.String r0 = "shared_memories"
            X.C47428E1x.A00(r4, r1, r0)
        L_0x08e4:
            r0 = -1706653498(0xffffffff9a4688c6, float:-4.1055925E-23)
            goto L_0x0d1a
        L_0x08e9:
            r0 = 2109247899(0x7db8919b, float:3.0666747E37)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r14.A01
            X.E1x r5 = (X.C47428E1x) r5
            X.0eM r1 = r5.A08
            X.0lg r6 = X.DbT.A0X(r1)
            java.lang.Class<com.instagram.modal.ModalActivity> r4 = com.instagram.modal.ModalActivity.class
            r1 = 2131953813(0x7f130895, float:1.9544108E38)
            java.lang.String r2 = r5.getString(r1)
            r1 = 465(0x1d1, float:6.52E-43)
            java.lang.String r1 = X.C273654mx.A00(r1)
            android.os.Bundle r3 = X.DbY.A0B(r1, r2)
            androidx.fragment.app.FragmentActivity r2 = r5.requireActivity()
            r1 = 563(0x233, float:7.89E-43)
            java.lang.String r1 = X.C273654mx.A00(r1)
            X.6W8 r1 = X.DbW.A0W(r2, r3, r6, r4, r1)
            X.DbU.A1K(r5, r1)
            com.instagram.user.model.User r1 = r5.A04
            if (r1 == 0) goto L_0x092b
            java.lang.String r2 = r1.getId()
            java.lang.String r1 = "notif_setting"
            X.C47428E1x.A00(r5, r2, r1)
        L_0x092b:
            r1 = 1661412895(0x6307261f, float:2.4930574E21)
            goto L_0x0d8a
        L_0x0930:
            r0 = 160457454(0x99062ee, float:3.4759772E-33)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r14.A01
            X.ESH r3 = (X.ESH) r3
            java.lang.String r1 = r3.A02
            if (r1 == 0) goto L_0x094c
            java.lang.String r2 = r3.A03
            if (r2 == 0) goto L_0x094c
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L_0x094c
            X.ESH.A07(r3, r2)
        L_0x094c:
            X.DbT.A1J(r3)
            r1 = 1360481457(0x51174cb1, float:4.0614171E10)
            goto L_0x0d8a
        L_0x0954:
            r0 = 219379686(0xd1377e6, float:4.5442195E-31)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r7 = r14.A01
            X.E26 r7 = (X.E26) r7
            boolean r1 = r7.A0C
            if (r1 == 0) goto L_0x0974
            android.graphics.Bitmap r1 = r7.A00
            if (r1 == 0) goto L_0x0974
            boolean r1 = r7.A0D
            if (r1 != 0) goto L_0x0974
            r1 = 0
            X.E26.A06(r7, r1)
        L_0x096f:
            r1 = 838373911(0x31f89217, float:7.2343584E-9)
            goto L_0x0d8a
        L_0x0974:
            X.0eM r6 = r7.A0N
            X.0lg r5 = X.DbT.A0X(r6)
            java.lang.Class<com.instagram.modal.TransparentModalActivity> r4 = com.instagram.modal.TransparentModalActivity.class
            android.os.Bundle r3 = r7.mArguments
            androidx.fragment.app.FragmentActivity r2 = r7.getActivity()
            r1 = 1197(0x4ad, float:1.677E-42)
            java.lang.String r1 = X.C273654mx.A00(r1)
            X.6W8 r2 = X.AnonymousClass6W8.A02(r2, r3, r5, r4, r1)
            r1 = 7766(0x1e56, float:1.0882E-41)
            r2.A0D(r7, r1)
            X.91o r3 = r7.A09
            if (r3 == 0) goto L_0x09a7
            long r7 = X.Dbb.A08(r6)
            long r9 = X.Dbb.A08(r6)
            java.lang.String r4 = "qp"
            java.lang.String r5 = "birthday_selfie_camera"
            java.lang.String r6 = "open"
            r3.A02(r4, r5, r6, r7, r9)
            goto L_0x096f
        L_0x09a7:
            java.lang.String r0 = "birthdayLogger"
            goto L_0x09bd
        L_0x09aa:
            r0 = -98048564(0xfffffffffa27e5cc, float:-2.179436E35)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r14.A01
            X.Dlv r1 = (X.C46819Dlv) r1
            X.E26 r5 = r1.A00
            X.30l r4 = r5.A03
            if (r4 != 0) goto L_0x09c5
            java.lang.String r0 = "closeFriendsController"
        L_0x09bd:
            X.0qQ.A0F(r0)
            X.00P r1 = X.AnonymousClass00P.createAndThrow()
            throw r1
        L_0x09c5:
            X.Ki7 r3 = X.C62574Ki7.BIRTHDAY_EFFECTS_SETTINGS
            r6 = 0
            r2 = 2002(0x7d2, float:2.805E-42)
            r1 = 0
            r4.A00(r5, r3, r2, r1)
            X.91o r3 = r5.A09
            if (r3 == 0) goto L_0x09a7
            X.0eM r1 = r5.A0N
            long r7 = X.Dbb.A08(r1)
            long r9 = X.Dbb.A08(r1)
            java.lang.String r4 = "qp"
            java.lang.String r5 = "close_friend_list"
            r3.A02(r4, r5, r6, r7, r9)
            r1 = -1763822691(0xffffffff96de339d, float:-3.5898607E-25)
            goto L_0x0d8a
        L_0x09e8:
            r0 = 1870218501(0x6f794505, float:7.7145207E28)
            int r7 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r14.A01
            X.E26 r3 = (X.E26) r3
            android.graphics.Bitmap r0 = r3.A00
            if (r0 == 0) goto L_0x0a1a
            boolean r0 = r3.A0D
            if (r0 == 0) goto L_0x0a1a
            r0 = 5
            X.MAc r1 = new X.MAc
            r1.<init>(r3, r0)
            r0 = 1726365662(0x66e63fde, float:5.436612E23)
            X.5g0 r2 = new X.5g0
            r2.<init>(r1, r0)
            r1 = 17
            X.KH1 r0 = new X.KH1
            r0.<init>((java.lang.Object) r3, (int) r1)
            r2.A00 = r0
            r3.schedule(r2)
        L_0x0a15:
            r0 = -72627657(0xfffffffffbabca37, float:-1.7839683E36)
            goto L_0x0d1a
        L_0x0a1a:
            X.0eM r0 = r3.A0O
            java.lang.Object r0 = r0.getValue()
            X.Dkc r0 = (X.C46749Dkc) r0
            X.2Fk r0 = r0.A01
            java.lang.Object r0 = r0.A02()
            X.EWN r0 = (X.EWN) r0
            if (r0 == 0) goto L_0x0a15
            int r1 = r0.A00
            r0 = 0
            X.E26.A04(r3, r0, r1)
            goto L_0x0a15
        L_0x0a33:
            r0 = -1367954216(0xffffffffae76acd8, float:-5.608744E-11)
            int r7 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r14.A01
            X.NgU r0 = (X.C69181NgU) r0
            androidx.fragment.app.FragmentActivity r3 = r0.requireActivity()
            X.0eM r0 = r0.A01
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r0)
            r0 = 1
            X.0qQ.A0B(r4, r0)
            boolean r0 = X.AnonymousClass431.A00(r4)
            if (r0 == 0) goto L_0x0a7f
            X.0Tu r2 = X.0Tu.A05
            r0 = 36316422388846956(0x8105980000116c, double:3.029989980977622E-306)
            boolean r0 = X.182.A06(r2, r4, r0)
            if (r0 == 0) goto L_0x0a7f
            java.util.HashMap r1 = X.AnonymousClass7TE.A1E()
            r0 = 73
        L_0x0a65:
            java.lang.String r0 = X.C273654mx.A00(r0)
            X.DiU r2 = X.C46649DiU.A04(r0, r1)
            com.instagram.bloks.hosting.IgBloksScreenConfig r1 = X.DbS.A0N(r4)
            r0 = 2131963000(0x7f132c78, float:1.9562741E38)
            X.DbS.A18(r3, r1, r0)
            r2.A0D(r3, r1)
            r0 = -145701201(0xfffffffff750c6af, float:-4.2344825E33)
            goto L_0x0d1a
        L_0x0a7f:
            X.0Tu r2 = X.0Tu.A05
            r0 = 36315675064536532(0x8104ea00000dd4, double:3.0295173700744765E-306)
            boolean r0 = X.182.A06(r2, r4, r0)
            java.util.HashMap r1 = X.AnonymousClass7TE.A1E()
            if (r0 == 0) goto L_0x0a93
            r0 = 256(0x100, float:3.59E-43)
            goto L_0x0a65
        L_0x0a93:
            r0 = 131(0x83, float:1.84E-43)
            goto L_0x0a65
        L_0x0a96:
            r0 = -811020279(0xffffffffcfa8d009, float:-5.6644122E9)
            int r7 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r6 = r14.A01
            X.NgU r6 = (X.C69181NgU) r6
            X.0eM r5 = r6.A01
            X.0lg r3 = X.DbY.A0R(r5)
            X.0Tu r2 = X.0Tu.A05
            r0 = 2342161703640832389(0x208107a900091985, double:4.064478865199414E-152)
            boolean r0 = X.182.A06(r2, r3, r0)
            r4 = 0
            if (r0 == 0) goto L_0x0ad0
            X.XQw r0 = X.C21251XQw.MESSAGE_CONTROLS
            X.JaK r2 = X.Eq6.A00(r0, r4)
            X.6Yo r1 = X.DbZ.A0P(r6, r5)
            r0 = 1
            r1.A0F = r0
            X.0qQ.A0A(r2)
            r1.A0B(r4, r2)
        L_0x0ac8:
            r1.A04()
            r0 = 1169634351(0x45b7342f, float:5862.523)
            goto L_0x0d1a
        L_0x0ad0:
            com.instagram.settings.privacy.messages.DirectMessagesOptionsFragment r3 = new com.instagram.settings.privacy.messages.DirectMessagesOptionsFragment
            r3.<init>()
            android.os.Bundle r2 = X.DbY.A08(r3)
            java.lang.String r1 = "entry_point"
            java.lang.String r0 = "ig_settings"
            r2.putString(r1, r0)
            X.Nlx r1 = X.C69453Nlx.PRIVACY_SETTINGS
            r0 = 382(0x17e, float:5.35E-43)
            java.lang.String r0 = X.C66579MXk.A00(r0)
            r2.putSerializable(r0, r1)
            r3.setArguments(r2)
            X.6Yo r1 = X.DbZ.A0P(r6, r5)
            r0 = 1
            r1.A0F = r0
            r1.A0B(r4, r3)
            goto L_0x0ac8
        L_0x0af9:
            java.lang.Object r5 = r14.A01
            X.EyH r5 = (X.EyH) r5
            r0 = 2
            goto L_0x0b42
        L_0x0aff:
            java.lang.Object r5 = r14.A01
            X.EyH r5 = (X.EyH) r5
            r0 = 0
            goto L_0x0b42
        L_0x0b05:
            java.lang.Object r4 = r14.A01
            X.EyH r4 = (X.EyH) r4
            com.instagram.common.session.UserSession r3 = r4.A00
            X.0kM r0 = X.DbY.A0M(r3)
            java.lang.String r2 = "data_control"
            r0.A01 = r2
            X.0wc r1 = r0.A00()
            java.lang.String r0 = "instagram_privacy_and_security_help_entry"
            X.0Aj r1 = X.AnonymousClass7TE.A0e(r1, r0)
            boolean r0 = r1.isSampled()
            if (r0 == 0) goto L_0x0b29
            X.DbS.A1K(r1, r2)
            r1.Cgf()
        L_0x0b29:
            java.util.HashMap r1 = X.AnonymousClass7TE.A1E()
            java.lang.String r0 = "com.instagram.portable.settings.help.privacy_and_security"
            X.DiU r1 = X.C46649DiU.A04(r0, r1)
            X.E6c r0 = r4.A02
            androidx.fragment.app.FragmentActivity r0 = r0.requireActivity()
            X.C46649DiU.A09(r0, r1, r3)
            return
        L_0x0b3d:
            java.lang.Object r5 = r14.A01
            X.EyH r5 = (X.EyH) r5
            r0 = 1
        L_0x0b42:
            X.FxV r4 = new X.FxV
            r4.<init>(r5, r0)
            java.lang.String r1 = "com.instagram.portable.settings.help.open_screen_async_action"
            X.E6c r3 = r5.A02
            X.6ST r2 = X.DbW.A0Y(r3)
            androidx.fragment.app.FragmentActivity r0 = r3.requireActivity()
            X.DbX.A15(r0, r2)
            X.AnonymousClass0fN.A00(r2)
            com.instagram.common.session.UserSession r0 = r5.A00
            X.8ey r1 = X.C359988do.A04(r0, r1, r4)
            r0 = 17
            X.E86.A01(r1, r5, r2, r0)
            r3.schedule(r1)
            return
        L_0x0b68:
            r0 = 857388987(0x331ab7bb, float:3.602302E-8)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r14.A01
            X.FRY r1 = (X.FRY) r1
            java.lang.String r0 = X.FRY.A09
            com.instagram.common.session.UserSession r7 = r1.A02
            java.lang.String r8 = "settings_business_options"
            com.instagram.base.activity.BaseFragmentActivity r3 = r1.A00
            if (r3 == 0) goto L_0x0bbe
            java.lang.String r2 = "setting"
            r6 = 0
            X.F1Y r0 = X.C49314Esx.A01
            r0.A00()
            java.lang.String r1 = X.AnonymousClass7TG.A0j()
            X.6Yo r4 = X.DbU.A0Q(r3, r7)
            X.3kF r0 = X.C249713kF.A00
            r0.A0T()
            r0 = 2131973750(0x7f135676, float:1.9584545E38)
            java.lang.String r3 = r3.getString(r0)
            java.util.HashMap r2 = A00(r3, r2, r1, r8)
            java.lang.String r1 = java.lang.String.valueOf(r6)
            r0 = 1500(0x5dc, float:2.102E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r2.put(r0, r1)
            r0 = 2886(0xb46, float:4.044E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.C46649DiU.A0A(r4, r7, r0, r3, r2)
            java.lang.String r0 = "1"
            r4.A0A = r0
            r4.A04()
            r0 = 1302830726(0x4da79e86, float:3.51523008E8)
            goto L_0x0c1b
        L_0x0bbe:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0y()
            r0 = 360252827(0x1579059b, float:5.028957E-26)
            goto L_0x0c26
        L_0x0bc6:
            r0 = 2073078127(0x7b90a96f, float:1.5022545E36)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r14.A01
            X.FRY r1 = (X.FRY) r1
            java.lang.String r0 = X.FRY.A09
            com.instagram.common.session.UserSession r7 = r1.A02
            java.lang.String r8 = "settings_business_options"
            com.instagram.base.activity.BaseFragmentActivity r3 = r1.A00
            if (r3 == 0) goto L_0x0c1f
            java.lang.String r2 = "setting"
            r6 = 0
            X.F1Y r0 = X.C49314Esx.A01
            r0.A00()
            java.lang.String r1 = X.AnonymousClass7TG.A0j()
            X.6Yo r4 = X.DbU.A0Q(r3, r7)
            X.3kF r0 = X.C249713kF.A00
            r0.A0T()
            r0 = 2131973750(0x7f135676, float:1.9584545E38)
            java.lang.String r3 = r3.getString(r0)
            java.util.HashMap r2 = A00(r3, r2, r1, r8)
            java.lang.String r1 = java.lang.String.valueOf(r6)
            r0 = 1500(0x5dc, float:2.102E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r2.put(r0, r1)
            r0 = 2885(0xb45, float:4.043E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.C46649DiU.A0A(r4, r7, r0, r3, r2)
            java.lang.String r0 = "1"
            r4.A0A = r0
            r4.A04()
            r0 = -577715281(0xffffffffdd90c3af, float:-1.3039217E18)
        L_0x0c1b:
            X.AnonymousClass0fD.A0C(r0, r5)
            return
        L_0x0c1f:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0y()
            r0 = 1352196461(0x5098e16d, float:2.05192827E10)
        L_0x0c26:
            X.AnonymousClass0fD.A0C(r0, r5)
            throw r1
        L_0x0c2a:
            r0 = 1143596022(0x4429e3f6, float:679.5619)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.String r8 = X.AnonymousClass7TF.A0b()
            java.lang.String r5 = "setting"
            java.lang.String r6 = "management_surface_screen"
            java.lang.String r7 = "management_surface"
            r9 = 13
            X.QP5 r4 = new X.QP5
            r4.<init>(r5, r6, r7, r8, r9)
            java.lang.Object r2 = r14.A01
            X.FRY r2 = (X.FRY) r2
            java.lang.String r0 = X.FRY.A09
            com.instagram.common.session.UserSession r1 = r2.A02
            com.instagram.base.activity.BaseFragmentActivity r0 = r2.A00
            if (r0 == 0) goto L_0x0c58
            X.C48951Emp.A00(r0, r4, r1)
            r0 = -489856129(0xffffffffe2cd637f, float:-1.894376E21)
            X.AnonymousClass0fD.A0C(r0, r3)
            return
        L_0x0c58:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0y()
            r0 = 1852053443(0x6e6417c3, float:1.7647827E28)
            X.AnonymousClass0fD.A0C(r0, r3)
            throw r1
        L_0x0c63:
            r0 = -862215542(0xffffffffcc9ba28a, float:-8.159752E7)
            int r7 = X.AnonymousClass0fD.A05(r0)
            r0 = 13784(0x35d8, float:1.9315E-41)
            X.4tU r3 = new X.4tU
            r3.<init>(r0)
            r0 = 45
            java.lang.String r2 = "CASD_BUSINESS_LINK_MANAGEMENT"
            r3.A0P(r0, r2)
            java.lang.String r8 = "entry_point"
            java.lang.String r0 = "ig_professional_settings"
            X.0eP r1 = X.AnonymousClass7TE.A1L(r8, r0)
            java.lang.String r6 = "link_flow_source"
            java.lang.String r0 = "instagram"
            java.util.HashMap r1 = X.Dbb.A0e(r6, r0, r1)
            java.lang.String r0 = "com.bloks.www.casd_bl.business_link_management"
            X.DiU r5 = X.C46649DiU.A04(r0, r1)
            r3.A0O()
            r5.A03 = r3
            r5.A06 = r2
            java.lang.Object r1 = r14.A01
            X.FRY r1 = (X.FRY) r1
            java.lang.String r0 = X.FRY.A09
            X.2jx r0 = r1.A01
            android.content.Context r4 = r0.getContext()
            com.instagram.common.session.UserSession r3 = r1.A02
            com.instagram.bloks.hosting.IgBloksScreenConfig r2 = X.DbS.A0N(r3)
            com.instagram.base.activity.BaseFragmentActivity r1 = r1.A00
            if (r1 == 0) goto L_0x0d1e
            r0 = 2131965825(0x7f133781, float:1.956847E38)
            java.lang.String r0 = r1.getString(r0)
        L_0x0cb2:
            r2.A0U = r0
            r5.A0F(r4, r2)
            r0 = 39
            X.To0 r1 = new X.To0
            r1.<init>(r3, r0)
            java.lang.Class<X.EyF> r0 = X.EyF.class
            java.lang.Object r0 = r3.A01(r0, r1)
            X.EyF r0 = (X.EyF) r0
            X.EZF r13 = X.EZF.UI
            X.EZG r11 = X.EZG.BLM_LANDING_PAGE
            X.EZq r12 = X.C48148EZq.A02
            X.EZE r10 = X.EZE.BLM_ENTRY_POINT
            X.EZI r5 = X.EZI.IG_BLM
            X.EZr r4 = X.C48149EZr.A02
            X.EZJ r3 = X.EZJ.INSTAGRAM
            X.EZH r2 = X.EZH.CASD_BL_BIZ_LINK_MGMT
            X.0wc r1 = r0.A00
            java.lang.String r0 = "bizlinking_disclosure_events"
            X.0Aj r1 = X.AnonymousClass7TE.A0e(r1, r0)
            X.Dpi r9 = new X.Dpi
            r9.<init>()
            java.lang.String r0 = "event_type"
            r9.A01(r13, r0)
            java.lang.String r0 = "event_name"
            r9.A01(r12, r0)
            java.lang.String r0 = "flow_type"
            r9.A01(r11, r0)
            r0 = 2324(0x914, float:3.257E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            r9.A01(r10, r0)
            r0 = 683(0x2ab, float:9.57E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            r1.AAK(r9, r0)
            java.lang.String r0 = "disclosure_type"
            r1.A8M(r5, r0)
            r1.A8M(r4, r8)
            r1.A8M(r3, r6)
            java.lang.String r0 = "product_type"
            r1.A8M(r2, r0)
            r1.Cgf()
            r0 = 1182659283(0x467df2d3, float:16252.706)
        L_0x0d1a:
            X.AnonymousClass0fD.A0C(r0, r7)
            return
        L_0x0d1e:
            r0 = 0
            goto L_0x0cb2
        L_0x0d20:
            r0 = 1892900440(0x70d35e58, float:5.2332313E29)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r14.A01
            X.FRY r2 = (X.FRY) r2
            java.lang.String r1 = X.FRY.A09
            X.2jx r1 = r2.A01
            androidx.fragment.app.FragmentActivity r1 = r1.requireActivity()
            com.instagram.common.session.UserSession r5 = r2.A02
            X.6Yo r4 = X.DbU.A0Q(r1, r5)
            X.FBk r3 = X.F9Y.A00()
            java.lang.String r1 = "SETTINGS"
            r2 = 0
            X.E4f r1 = r3.A03(r5, r1, r2, r2)
            r4.A0B(r2, r1)
            X.DbZ.A1Q(r4)
            r1 = -2137403173(0xffffffff8099d0db, float:-1.4125754E-38)
            goto L_0x0d8a
        L_0x0d4e:
            r0 = 1217026256(0x488a58d0, float:283334.5)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r14.A01
            X.6Yo r3 = X.Dbc.A06(r1)
            X.1a1 r2 = X.C46447Df9.A02()
            java.lang.String r1 = "setting"
            X.Dib r1 = r2.A04(r1)
            r3.A0D(r1)
            r3.A04()
            r1 = -299068828(0xffffffffee2c9264, float:-1.3352099E28)
            goto L_0x0d8a
        L_0x0d6f:
            r0 = -2116724412(0xffffffff81d55944, float:-7.837193E-38)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r14.A01
            X.6Yo r2 = X.Dbc.A06(r1)
            X.ESA r1 = new X.ESA
            r1.<init>()
            r2.A0D(r1)
            r2.A04()
            r1 = 1421351591(0x54b81aa7, float:6.3257691E12)
        L_0x0d8a:
            X.AnonymousClass0fD.A0C(r1, r0)
            return
        L_0x0d8e:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0y()
            r0 = -1121431315(0xffffffffbd2850ed, float:-0.0410928)
            goto L_0x0da5
        L_0x0d96:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0y()
            r0 = -1827956833(0xffffffff930b979f, float:-1.7619022E-27)
            goto L_0x0da5
        L_0x0d9e:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0y()
            r0 = -1967755064(0xffffffff8ab670c8, float:-1.7568386E-32)
        L_0x0da5:
            X.AnonymousClass0fD.A0C(r0, r4)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FP9.onClick(android.view.View):void");
    }

    public static HashMap A00(Object obj, Object obj2, Object obj3, Object obj4) {
        0qQ.A07(obj);
        HashMap hashMap = new HashMap();
        hashMap.put(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, obj2);
        hashMap.put("waterfall_id", obj3);
        hashMap.put("prior_module", obj4);
        hashMap.put("presentation_style", GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT);
        return hashMap;
    }

    public FP9(C49642Ezz ezz, int i) {
        this.A00 = i;
        if (34 - i != 0) {
            this.A01 = ezz;
        } else {
            this.A01 = ezz;
        }
    }

    public FP9(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }
}
