package X;

import androidx.fragment.app.Fragment;

/* renamed from: X.EDi  reason: case insensitive filesystem */
public final class C47699EDi extends 1P0 {
    public final int A00;
    public final Object A01;

    public C47699EDi(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(AnonymousClass4DH r1, 1OC r2, int i) {
        r2.A00 = new C47699EDi(r1, i);
        r1.schedule(r2);
    }

    public static void A01(C268654dm r1, C47699EDi eDi) {
        C49952FGh.A02(((Fragment) eDi.A01).requireContext(), r1);
    }

    public static void A02(C268654dm r2, C47699EDi eDi) {
        Fragment fragment = (Fragment) eDi.A01;
        if (fragment.isResumed()) {
            C49952FGh.A02(fragment.requireContext(), r2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0539, code lost:
        X.AnonymousClass0fD.A0A(r0, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x053c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0580, code lost:
        X.0qQ.A0F(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x0587, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x05b6, code lost:
        X.AnonymousClass0fD.A0A(r0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x05b9, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0129, code lost:
        r3 = "twoFacStage";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x012d, code lost:
        r3 = "loggedOutSession";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onFail(X.C268654dm r9) {
        /*
            r8 = this;
            int r0 = r8.A00
            switch(r0) {
                case 0: goto L_0x0502;
                case 1: goto L_0x05a1;
                case 2: goto L_0x04e1;
                case 3: goto L_0x04c0;
                case 4: goto L_0x04a6;
                case 5: goto L_0x041f;
                case 6: goto L_0x03f9;
                case 7: goto L_0x03e3;
                case 8: goto L_0x03c2;
                case 9: goto L_0x03a6;
                case 10: goto L_0x0391;
                case 11: goto L_0x0373;
                case 12: goto L_0x0359;
                case 13: goto L_0x034a;
                case 14: goto L_0x0331;
                case 15: goto L_0x02f8;
                case 16: goto L_0x02c1;
                case 17: goto L_0x02ac;
                case 18: goto L_0x029d;
                case 19: goto L_0x0280;
                case 20: goto L_0x026e;
                case 21: goto L_0x025f;
                case 22: goto L_0x024a;
                case 23: goto L_0x023b;
                case 24: goto L_0x0217;
                case 25: goto L_0x0208;
                case 26: goto L_0x01de;
                case 27: goto L_0x01cf;
                case 28: goto L_0x0187;
                case 29: goto L_0x0178;
                case 30: goto L_0x0169;
                case 31: goto L_0x0140;
                case 32: goto L_0x0131;
                case 33: goto L_0x053d;
                case 34: goto L_0x0105;
                case 35: goto L_0x00e1;
                case 36: goto L_0x00d2;
                case 37: goto L_0x00a8;
                case 38: goto L_0x0092;
                case 39: goto L_0x0080;
                case 40: goto L_0x006e;
                case 41: goto L_0x005f;
                case 42: goto L_0x0043;
                case 43: goto L_0x0020;
                case 44: goto L_0x0005;
                case 45: goto L_0x0009;
                default: goto L_0x0005;
            }
        L_0x0005:
            X.C47699EDi.super.onFail(r9)
            return
        L_0x0009:
            r0 = -53698205(0xfffffffffccca163, float:-8.500015E36)
            int r3 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r0 = r8.A01
            androidx.fragment.app.FragmentActivity r1 = X.DbZ.A0E(r0)
            java.lang.String r0 = "fetch_followers_failed"
            X.C59689JTv.A0D(r1, r0)
            r0 = -113266319(0xfffffffff93fb171, float:-6.2207977E34)
            goto L_0x05b6
        L_0x0020:
            r0 = -2113496710(0xffffffff8206997a, float:-9.888811E-38)
            int r3 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r2 = r8.A01
            X.Dd4 r2 = (X.Dd4) r2
            X.0hq r0 = r2.A06
            X.SQH.A01(r0)
            java.lang.String r1 = "DefaultNewsfeedRowDelegate"
            java.lang.String r0 = "failed to fetch media for clips edit metadata page"
            X.0wb.A03(r1, r0)
            androidx.fragment.app.FragmentActivity r1 = r2.A05
            java.lang.String r0 = "navigate_to_clips_edit_failed"
            X.C59689JTv.A0D(r1, r0)
            r0 = -388513249(0xffffffffe8d7c21f, float:-8.1511176E24)
            goto L_0x05b6
        L_0x0043:
            r0 = -455032627(0xffffffffe4e0c0cd, float:-3.3167707E22)
            int r3 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r1 = r8.A01
            X.Dd4 r1 = (X.Dd4) r1
            X.0hq r0 = r1.A06
            X.SQH.A01(r0)
            androidx.fragment.app.FragmentActivity r1 = r1.A05
            java.lang.String r0 = "launch_shared_memory_story_creation_failed"
            X.C59689JTv.A0C(r1, r0)
            r0 = 2094436957(0x7cd6925d, float:8.912961E36)
            goto L_0x05b6
        L_0x005f:
            r0 = -729430793(0xffffffffd485c4f7, float:-4.5962814E12)
            int r3 = X.AnonymousClass7TG.A0D(r9, r0)
            A01(r9, r8)
            r0 = 506657166(0x1e32f98e, float:9.474848E-21)
            goto L_0x05b6
        L_0x006e:
            r0 = 1334259579(0x4f872f7b, float:4.5360717E9)
            int r3 = X.AnonymousClass7TG.A0D(r9, r0)
            X.C47699EDi.super.onFail(r9)
            A01(r9, r8)
            r0 = -1581136332(0xffffffffa1c1c634, float:-1.3130653E-18)
            goto L_0x05b6
        L_0x0080:
            r0 = 2097789816(0x7d09bb78, float:1.1442352E37)
            int r3 = X.AnonymousClass7TG.A0D(r9, r0)
            X.C47699EDi.super.onFail(r9)
            A01(r9, r8)
            r0 = -307637320(0xffffffffeda9d3b8, float:-6.569865E27)
            goto L_0x05b6
        L_0x0092:
            r0 = -2087354359(0xffffffff83958009, float:-8.786828E-37)
            int r3 = X.AnonymousClass7TG.A0D(r9, r0)
            X.C47699EDi.super.onFail(r9)
            java.lang.Object r0 = r8.A01
            X.ESD r0 = (X.ESD) r0
            X.ESD.A06(r0)
            r0 = -1889580600(0xffffffff8f5f49c8, float:-1.10089586E-29)
            goto L_0x05b6
        L_0x00a8:
            r0 = -1932971974(0xffffffff8cc9303a, float:-3.0997979E-31)
            int r4 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r2 = r8.A01
            X.E25 r2 = (X.E25) r2
            android.os.Handler r1 = r2.A00
            if (r1 != 0) goto L_0x00bb
            java.lang.String r3 = "notificationStatusHandler"
            goto L_0x0580
        L_0x00bb:
            java.lang.Runnable r0 = r2.A0U
            r1.removeCallbacks(r0)
            boolean r0 = r2.isResumed()
            if (r0 == 0) goto L_0x00cd
            android.content.Context r0 = r2.requireContext()
            X.C49952FGh.A01(r0)
        L_0x00cd:
            r0 = 262126558(0xf9fbbde, float:1.5750974E-29)
            goto L_0x0539
        L_0x00d2:
            r0 = -1877696744(0xffffffff90149f18, float:-2.9310415E-29)
            int r3 = X.AnonymousClass7TG.A0D(r9, r0)
            A01(r9, r8)
            r0 = 419137492(0x18fb87d4, float:6.501913E-24)
            goto L_0x05b6
        L_0x00e1:
            r0 = 528218765(0x1f7bfa8d, float:5.3358568E-20)
            int r3 = X.AnonymousClass7TG.A0D(r9, r0)
            java.lang.Object r2 = r8.A01
            X.E25 r2 = (X.E25) r2
            X.C49952FGh.A07(r2, r9)
            X.1Q0 r1 = X.1Q0.A21
            X.0aP r0 = r2.A06
            if (r0 == 0) goto L_0x012d
            X.FGI r1 = r1.A02(r0)
            X.DiE r0 = r2.A0C
            if (r0 == 0) goto L_0x0129
            X.FGI.A03(r1, r0)
            r0 = -790905603(0xffffffffd0dbbcfd, float:-2.94927667E10)
            goto L_0x05b6
        L_0x0105:
            r0 = 1861637464(0x6ef65558, float:3.8118243E28)
            int r3 = X.AnonymousClass7TG.A0D(r9, r0)
            java.lang.Object r2 = r8.A01
            X.E25 r2 = (X.E25) r2
            X.C49952FGh.A07(r2, r9)
            X.1Q0 r1 = X.1Q0.A21
            X.0aP r0 = r2.A06
            if (r0 == 0) goto L_0x012d
            X.FGI r1 = r1.A02(r0)
            X.DiE r0 = r2.A0C
            if (r0 == 0) goto L_0x0129
            X.FGI.A03(r1, r0)
            r0 = -513102784(0xffffffffe16aac40, float:-2.7055938E20)
            goto L_0x05b6
        L_0x0129:
            java.lang.String r3 = "twoFacStage"
            goto L_0x0580
        L_0x012d:
            java.lang.String r3 = "loggedOutSession"
            goto L_0x0580
        L_0x0131:
            r0 = 371483256(0x16246278, float:1.3278886E-25)
            int r3 = X.AnonymousClass7TG.A0D(r9, r0)
            A01(r9, r8)
            r0 = -285189075(0xffffffffef005c2d, float:-3.9725515E28)
            goto L_0x05b6
        L_0x0140:
            r0 = -273077491(0xffffffffefb92b0d, float:-1.1461354E29)
            int r3 = X.AnonymousClass7TG.A0D(r9, r0)
            java.lang.Object r2 = r8.A01
            X.E2r r2 = (X.C47445E2r) r2
            X.0eM r0 = r2.A0A
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r0)
            java.lang.Object r0 = r9.A00()
            X.Dvg r0 = (X.C47346Dvg) r0
            if (r0 == 0) goto L_0x0166
            java.lang.String r0 = r0.A00
        L_0x015b:
            X.FCE.A01(r1, r0)
            X.C49952FGh.A07(r2, r9)
            r0 = -878900477(0xffffffffcb9d0b03, float:-2.0583942E7)
            goto L_0x05b6
        L_0x0166:
            java.lang.String r0 = "unknown"
            goto L_0x015b
        L_0x0169:
            r0 = -1313904707(0xffffffffb1af67bd, float:-5.104964E-9)
            int r3 = X.AnonymousClass7TG.A0D(r9, r0)
            A02(r9, r8)
            r0 = -97300092(0xfffffffffa335184, float:-2.3276862E35)
            goto L_0x05b6
        L_0x0178:
            r0 = 186319987(0xb1b0473, float:2.985526E-32)
            int r3 = X.AnonymousClass7TG.A0D(r9, r0)
            A02(r9, r8)
            r0 = -1049551444(0xffffffffc1711dac, float:-15.069744)
            goto L_0x05b6
        L_0x0187:
            r0 = 1360964180(0x511eaa54, float:4.2591404E10)
            int r3 = X.AnonymousClass0fD.A03(r0)
            r4 = 0
            X.0qQ.A0B(r9, r4)
            java.lang.Object r1 = r8.A01
            X.E2r r1 = (X.C47445E2r) r1
            boolean r0 = r1.isResumed()
            if (r0 == 0) goto L_0x01ca
            X.C49952FGh.A07(r1, r9)
            X.1XT r0 = X.DbT.A0L(r9)
            if (r0 == 0) goto L_0x01ab
            java.lang.String r2 = r0.getErrorMessage()
            if (r2 != 0) goto L_0x01ad
        L_0x01ab:
            java.lang.String r2 = "unknown"
        L_0x01ad:
            X.0eM r0 = r1.A0A
            X.0lg r1 = X.AnonymousClass7TF.A0L(r0, r4)
            X.0iw r0 = X.C49852F9r.A01
            X.0wc r1 = X.AnonymousClass0kN.A01(r0, r1)
            java.lang.String r0 = "instagram_two_fac_setup_verification_failure"
            X.0Aj r1 = X.AnonymousClass7TE.A0e(r1, r0)
            java.lang.String r0 = "reason"
            r1.AAJ(r0, r2)
            X.Dbc.A0W(r1)
            r1.Cgf()
        L_0x01ca:
            r0 = -1575637954(0xffffffffa215ac3e, float:-2.028445E-18)
            goto L_0x05b6
        L_0x01cf:
            r0 = 2093353436(0x7cc609dc, float:8.226198E36)
            int r3 = X.AnonymousClass7TG.A0D(r9, r0)
            A02(r9, r8)
            r0 = 513351151(0x1e991def, float:1.6211885E-20)
            goto L_0x05b6
        L_0x01de:
            r0 = -432205616(0xffffffffe63d10d0, float:-2.2320935E23)
            int r3 = X.AnonymousClass7TG.A0D(r9, r0)
            java.lang.Object r2 = r8.A01
            X.E2r r2 = (X.C47445E2r) r2
            X.0eM r0 = r2.A0A
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r0)
            X.1XT r0 = X.DbT.A0L(r9)
            if (r0 == 0) goto L_0x01fb
            java.lang.String r0 = r0.getErrorMessage()
            if (r0 != 0) goto L_0x01fd
        L_0x01fb:
            java.lang.String r0 = "unknown"
        L_0x01fd:
            X.FCE.A01(r1, r0)
            X.C49952FGh.A07(r2, r9)
            r0 = -977984321(0xffffffffc5b524bf, float:-5796.5933)
            goto L_0x05b6
        L_0x0208:
            r0 = 598021989(0x23a51765, float:1.7899244E-17)
            int r3 = X.AnonymousClass7TG.A0D(r9, r0)
            A01(r9, r8)
            r0 = -2105690603(0xffffffff827db615, float:-1.8639759E-37)
            goto L_0x05b6
        L_0x0217:
            r0 = 2066639668(0x7b2e6b34, float:9.05634E35)
            int r3 = X.AnonymousClass7TG.A0D(r9, r0)
            java.lang.Object r2 = r8.A01
            X.E2r r2 = (X.C47445E2r) r2
            X.0eM r0 = r2.A0A
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r0)
            java.lang.String r0 = "unknown"
            X.FCE.A01(r1, r0)
            boolean r0 = r2.isResumed()
            if (r0 == 0) goto L_0x0236
            X.C49952FGh.A07(r2, r9)
        L_0x0236:
            r0 = -578154681(0xffffffffdd8a0f47, float:-1.24353102E18)
            goto L_0x05b6
        L_0x023b:
            r0 = -1461028843(0xffffffffa8ea7815, float:-2.6031296E-14)
            int r3 = X.AnonymousClass7TG.A0D(r9, r0)
            A02(r9, r8)
            r0 = -940468202(0xffffffffc7f19816, float:-123696.17)
            goto L_0x05b6
        L_0x024a:
            r0 = 791743772(0x2f310d1c, float:1.6102714E-10)
            int r3 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r0 = r8.A01
            android.content.Context r0 = X.DbT.A08(r0)
            X.C49952FGh.A01(r0)
            r0 = 2109012396(0x7db4f9ac, float:3.0069676E37)
            goto L_0x05b6
        L_0x025f:
            r0 = -109802883(0xfffffffff9748a7d, float:-7.935808E34)
            int r3 = X.AnonymousClass7TG.A0D(r9, r0)
            A02(r9, r8)
            r0 = -1032755836(0xffffffffc2716584, float:-60.349136)
            goto L_0x05b6
        L_0x026e:
            r0 = 940665978(0x38116c7a, float:3.467172E-5)
            int r3 = X.AnonymousClass7TG.A0D(r9, r0)
            X.C47699EDi.super.onFail(r9)
            A01(r9, r8)
            r0 = -185129015(0xfffffffff4f727c9, float:-1.5665335E32)
            goto L_0x05b6
        L_0x0280:
            r0 = -736792965(0xffffffffd4156e7b, float:-2.56721473E12)
            int r3 = X.AnonymousClass7TG.A0D(r9, r0)
            java.lang.Object r1 = r8.A01
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            boolean r0 = r1.isResumed()
            if (r0 == 0) goto L_0x0298
            androidx.fragment.app.FragmentActivity r0 = r1.requireActivity()
            X.C49952FGh.A02(r0, r9)
        L_0x0298:
            r0 = -206645853(0xfffffffff3aed5a3, float:-2.7703635E31)
            goto L_0x05b6
        L_0x029d:
            r0 = -2078319613(0xffffffff841f5c03, float:-1.873261E-36)
            int r3 = X.AnonymousClass7TG.A0D(r9, r0)
            A01(r9, r8)
            r0 = -1338016158(0xffffffffb03f7e62, float:-6.9664996E-10)
            goto L_0x05b6
        L_0x02ac:
            r0 = 564733206(0x21a92516, float:1.1461702E-18)
            int r3 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r0 = r8.A01
            android.content.Context r0 = X.DbT.A07(r0)
            X.C49952FGh.A02(r0, r9)
            r0 = -1971432233(0xffffffff8a7e54d7, float:-1.2245612E-32)
            goto L_0x05b6
        L_0x02c1:
            r0 = 776432749(0x2e476c6d, float:4.5343663E-11)
            int r3 = X.AnonymousClass0fD.A03(r0)
            X.C47699EDi.super.onFail(r9)
            java.lang.Throwable r1 = r9.A01()
            if (r1 == 0) goto L_0x02ed
            java.lang.String r0 = r1.getMessage()
            if (r0 == 0) goto L_0x02ed
            java.lang.Object r0 = r8.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            java.lang.String r1 = r1.getMessage()
            X.8ab r0 = X.Dba.A0I(r0)
            r0.A05 = r1
            X.Dba.A1L(r0)
        L_0x02e8:
            r0 = 27164641(0x19e7fe1, float:5.822353E-38)
            goto L_0x05b6
        L_0x02ed:
            java.lang.Object r1 = r8.A01
            X.E5f r1 = (X.C47500E5f) r1
            r0 = 2131975552(0x7f135d80, float:1.95882E38)
            r1.A02(r0)
            goto L_0x02e8
        L_0x02f8:
            r0 = 795644126(0x2f6c90de, float:2.1515542E-10)
            int r3 = X.AnonymousClass0fD.A03(r0)
            X.C47699EDi.super.onFail(r9)
            java.lang.Object r1 = r9.A00()
            if (r1 == 0) goto L_0x0326
            X.1XT r1 = (X.AnonymousClass1XT) r1
            java.lang.String r0 = r1.getErrorMessage()
            if (r0 == 0) goto L_0x0326
            java.lang.Object r0 = r8.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            java.lang.String r1 = r1.getErrorMessage()
            X.8ab r0 = X.Dba.A0I(r0)
            r0.A05 = r1
            X.Dba.A1L(r0)
        L_0x0321:
            r0 = -1789418544(0xffffffff9557a3d0, float:-4.354813E-26)
            goto L_0x05b6
        L_0x0326:
            java.lang.Object r1 = r8.A01
            X.E5f r1 = (X.C47500E5f) r1
            r0 = 2131975551(0x7f135d7f, float:1.9588197E38)
            r1.A02(r0)
            goto L_0x0321
        L_0x0331:
            r0 = -420621532(0xffffffffe6edd324, float:-5.6154786E23)
            int r3 = X.AnonymousClass0fD.A03(r0)
            X.C47699EDi.super.onFail(r9)
            java.lang.Object r1 = r8.A01
            X.E5f r1 = (X.C47500E5f) r1
            r0 = 2131975552(0x7f135d80, float:1.95882E38)
            r1.A02(r0)
            r0 = 611555241(0x247397a9, float:5.2820687E-17)
            goto L_0x05b6
        L_0x034a:
            r0 = -1901621849(0xffffffff8ea78da7, float:-4.1305085E-30)
            int r3 = X.AnonymousClass0fD.A03(r0)
            A01(r9, r8)
            r0 = -1033453005(0xffffffffc266c233, float:-57.689648)
            goto L_0x05b6
        L_0x0359:
            r0 = 242645278(0xe76791e, float:3.0380157E-30)
            int r3 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r2 = r8.A01
            X.E2u r2 = (X.C47448E2u) r2
            com.instagram.common.session.UserSession r1 = r2.A07
            java.lang.String r0 = "The API creation line before this callback is used additionally includes checkNotNulls in IgApi.Builder to assert that the user session is not null"
            X.0JA.A03(r1, r0)
            X.C49952FGh.A07(r2, r9)
            r0 = 549890153(0x20c6a869, float:3.365395E-19)
            goto L_0x05b6
        L_0x0373:
            r0 = -2139114427(0xffffffff807fb445, float:-1.1727777E-38)
            int r3 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r1 = r8.A01
            X.E5C r1 = (X.E5C) r1
            java.lang.String r0 = X.E5C.__redex_internal_original_name
            X.FBX r0 = r1.A06
            X.FBX.A00(r0)
            android.content.Context r0 = r1.getContext()
            X.C49952FGh.A02(r0, r9)
            r0 = 550907895(0x20d62ff7, float:3.628475E-19)
            goto L_0x05b6
        L_0x0391:
            r0 = 1422967318(0x54d0c216, float:7.1728754E12)
            int r3 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r0 = r8.A01
            android.content.Context r0 = X.DbT.A07(r0)
            X.C49952FGh.A02(r0, r9)
            r0 = 1453678932(0x56a56154, float:9.091872E13)
            goto L_0x05b6
        L_0x03a6:
            r0 = 1865749219(0x6f3512e3, float:5.603962E28)
            int r3 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r0 = r8.A01
            android.content.Context r2 = X.DbT.A07(r0)
            r1 = 2131968382(0x7f13417e, float:1.9573657E38)
            r0 = 0
            X.C59689JTv.A08(r2, r1, r0)
            X.C47699EDi.super.onFail(r9)
            r0 = -135001595(0xfffffffff7f40a05, float:-9.8994035E33)
            goto L_0x05b6
        L_0x03c2:
            r0 = -801231075(0xffffffffd03e2f1d, float:-1.27630346E10)
            int r3 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r0 = r8.A01
            X.FJf r0 = (X.C50020FJf) r0
            java.lang.Object r1 = r0.A01
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            android.content.Context r0 = r1.getContext()
            if (r0 == 0) goto L_0x03de
            android.content.Context r0 = r1.getContext()
            X.C49952FGh.A01(r0)
        L_0x03de:
            r0 = -1508656053(0xffffffffa613bc4b, float:-5.1256055E-16)
            goto L_0x05b6
        L_0x03e3:
            r0 = 2060798858(0x7ad54b8a, float:5.5374567E35)
            int r3 = X.AnonymousClass0fD.A03(r0)
            X.C47699EDi.super.onFail(r9)
            java.lang.Object r0 = r8.A01
            X.ESO r0 = (X.ESO) r0
            X.ESO.A07(r0)
            r0 = 1156256005(0x44eb1105, float:1880.5319)
            goto L_0x05b6
        L_0x03f9:
            r0 = -907718505(0xffffffffc9e55097, float:-1878546.9)
            int r3 = X.AnonymousClass0fD.A03(r0)
            X.C47699EDi.super.onFail(r9)
            r1 = 0
            java.lang.Object r0 = r8.A01
            X.E3Q r0 = (X.E3Q) r0
            r0.A08 = r1
            X.E3Q.A00(r0)
            X.8ab r1 = X.Dba.A0I(r0)
            r0 = 2131968258(0x7f134102, float:1.9573406E38)
            r1.A08(r0)
            X.Dba.A1L(r1)
            r0 = 298772566(0x11cee856, float:3.2644257E-28)
            goto L_0x05b6
        L_0x041f:
            r0 = -1278132615(0xffffffffb3d13e79, float:-9.7436846E-8)
            int r3 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r4 = r8.A01
            X.E75 r4 = (X.E75) r4
            X.FBX r0 = r4.A04
            X.FBX.A00(r0)
            r0 = 2131961740(0x7f13278c, float:1.9560185E38)
            java.lang.String r5 = r4.getString(r0)
            r0 = 2131975944(0x7f135f08, float:1.9588995E38)
            java.lang.String r7 = r4.getString(r0)
            boolean r0 = r9 instanceof X.C268674do
            if (r0 == 0) goto L_0x047c
            java.lang.Object r6 = r9.A00()
            if (r6 == 0) goto L_0x047c
            X.1XT r6 = (X.AnonymousClass1XT) r6
            java.util.List r0 = r6.getErrorStrings()
            if (r0 == 0) goto L_0x0472
            java.lang.StringBuilder r2 = X.AnonymousClass7TE.A1A()
            java.util.Iterator r1 = r0.iterator()
        L_0x0457:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x046a
            java.lang.String r0 = X.AnonymousClass7TE.A18(r1)
            r2.append(r0)
            r0 = 10
            r2.append(r0)
            goto L_0x0457
        L_0x046a:
            java.lang.String r0 = r2.toString()
            java.lang.String r7 = r0.trim()
        L_0x0472:
            java.lang.String r0 = r6.getErrorTitle()
            if (r0 == 0) goto L_0x047c
            java.lang.String r5 = r6.getErrorTitle()
        L_0x047c:
            X.E75.A02(r4, r7)
            r2 = 1
            r4.A06 = r2
            r4.A08 = r2
            X.E75.A01(r4)
            android.content.Context r1 = r4.requireContext()
            r0 = 0
            X.C49952FGh.A06(r1, r7, r5)
            X.Dbb.A17(r4, r0)
            com.instagram.igds.components.form.IgFormField r0 = r4.A00
            r0.setEnabled(r2)
            com.instagram.igds.components.form.IgFormField r0 = r4.A02
            r0.setEnabled(r2)
            com.instagram.igds.components.form.IgFormField r0 = r4.A01
            r0.setEnabled(r2)
            r0 = -260203888(0xfffffffff07d9a90, float:-3.1394625E29)
            goto L_0x05b6
        L_0x04a6:
            r0 = -178889129(0xfffffffff5565e57, float:-2.7174438E32)
            int r3 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r0 = r8.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            X.Dbb.A0x(r0)
            android.content.Context r0 = r0.getContext()
            X.C49952FGh.A02(r0, r9)
            r0 = -723616397(0xffffffffd4de7d73, float:-7.6446994E12)
            goto L_0x05b6
        L_0x04c0:
            r0 = -625270873(0xffffffffdabb1fa7, float:-2.63353114E16)
            int r3 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r1 = r8.A01
            X.ESN r1 = (X.ESN) r1
            android.content.Context r0 = r1.getContext()
            X.C49952FGh.A01(r0)
            android.os.Handler r1 = r1.A08
            X.FqS r0 = new X.FqS
            r0.<init>(r8)
            r1.post(r0)
            r0 = -910436995(0xffffffffc9bbd57d, float:-1538735.6)
            goto L_0x05b6
        L_0x04e1:
            r0 = 206863719(0xc547d67, float:1.6369623E-31)
            int r3 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r2 = r8.A01
            X.ESN r2 = (X.ESN) r2
            android.os.Handler r1 = r2.A08
            X.FqR r0 = new X.FqR
            r0.<init>(r8)
            r1.post(r0)
            android.content.Context r0 = r2.getContext()
            X.C49952FGh.A02(r0, r9)
            r0 = -670625149(0xffffffffd8071283, float:-5.9405431E14)
            goto L_0x05b6
        L_0x0502:
            r0 = -1483467731(0xffffffffa794142d, float:-4.1100127E-15)
            int r4 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r2 = r8.A01
            X.E6j r2 = (X.C47523E6j) r2
            r0 = 16909819(0x10205fb, float:2.388152E-38)
            X.Dbc.A10(r2, r0)
            X.6rm r1 = r2.A02
            java.lang.String r3 = "latencyPerfLogger"
            if (r1 == 0) goto L_0x0580
            java.lang.String r0 = "fetch_request_fail"
            r1.A0E(r0)
            X.6rm r0 = r2.A02
            if (r0 == 0) goto L_0x0580
            X.34p r0 = r0.A00
            r0.A01()
            r3 = 0
            r2.A09 = r3
            android.content.Context r2 = r2.getContext()
            java.lang.String r1 = "tabbed_explore_people_fail"
            r0 = 2131974929(0x7f135b11, float:1.9586936E38)
            X.C59689JTv.A01(r2, r1, r0, r3)
            r0 = 868462388(0x33c3af34, float:9.1122644E-8)
        L_0x0539:
            X.AnonymousClass0fD.A0A(r0, r4)
            return
        L_0x053d:
            r0 = -1531956734(0xffffffffa4b03202, float:-7.641255E-17)
            int r3 = X.AnonymousClass7TG.A0D(r9, r0)
            X.C47699EDi.super.onFail(r9)
            X.1XT r4 = X.DbT.A0L(r9)
            if (r4 == 0) goto L_0x0572
            java.lang.Object r1 = r8.A01
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            java.lang.String r0 = r4.getErrorMessage()
            if (r0 == 0) goto L_0x0590
            android.content.Context r2 = r1.requireContext()
            java.lang.String r0 = r4.getErrorTitle()
            if (r0 == 0) goto L_0x0588
            int r0 = r0.length()
            if (r0 == 0) goto L_0x0588
            java.lang.String r1 = r4.getErrorTitle()
        L_0x056b:
            java.lang.String r0 = r4.getErrorMessage()
            X.C49952FGh.A06(r2, r0, r1)
        L_0x0572:
            java.lang.Object r1 = r8.A01
            X.E2h r1 = (X.C47435E2h) r1
            android.view.View r0 = r1.mView
            if (r0 == 0) goto L_0x059d
            android.view.ViewStub r1 = r1.A01
            if (r1 != 0) goto L_0x0598
            java.lang.String r3 = "loadingViewStub"
        L_0x0580:
            X.0qQ.A0F(r3)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0588:
            r0 = 2131961740(0x7f13278c, float:1.9560185E38)
            java.lang.String r1 = r1.getString(r0)
            goto L_0x056b
        L_0x0590:
            android.content.Context r0 = r1.requireContext()
            X.C49952FGh.A01(r0)
            goto L_0x0572
        L_0x0598:
            r0 = 8
            r1.setVisibility(r0)
        L_0x059d:
            r0 = -1584229311(0xffffffffa1929441, float:-9.932587E-19)
            goto L_0x05b6
        L_0x05a1:
            r0 = -516134995(0xffffffffe13c67ad, float:-2.1721616E20)
            int r3 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r0 = r8.A01
            X.FYV r0 = (X.FYV) r0
            java.util.Map r1 = r0.A01
            java.lang.String r0 = "FACEBOOK"
            r1.remove(r0)
            r0 = 983261738(0x3a9b622a, float:0.0011854817)
        L_0x05b6:
            X.AnonymousClass0fD.A0A(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47699EDi.onFail(X.4dm):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0069, code lost:
        r4 = "confirmButton";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x01d1, code lost:
        r4 = "nextButton";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0308, code lost:
        X.0qQ.A0F(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x030f, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0319, code lost:
        X.AnonymousClass0fD.A0A(r0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x031c, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onFinish() {
        /*
            r5 = this;
            int r0 = r5.A00
            switch(r0) {
                case 0: goto L_0x02f4;
                case 1: goto L_0x0005;
                case 2: goto L_0x02df;
                case 3: goto L_0x02ca;
                case 4: goto L_0x02b5;
                case 5: goto L_0x02a3;
                case 6: goto L_0x0005;
                case 7: goto L_0x0005;
                case 8: goto L_0x0005;
                case 9: goto L_0x0285;
                case 10: goto L_0x0272;
                case 11: goto L_0x025f;
                case 12: goto L_0x024c;
                case 13: goto L_0x0239;
                case 14: goto L_0x0221;
                case 15: goto L_0x0209;
                case 16: goto L_0x01f1;
                case 17: goto L_0x01d5;
                case 18: goto L_0x0005;
                case 19: goto L_0x01b9;
                case 20: goto L_0x0005;
                case 21: goto L_0x0197;
                case 22: goto L_0x0005;
                case 23: goto L_0x0175;
                case 24: goto L_0x015d;
                case 25: goto L_0x0005;
                case 26: goto L_0x0145;
                case 27: goto L_0x0123;
                case 28: goto L_0x0101;
                case 29: goto L_0x00df;
                case 30: goto L_0x00bd;
                case 31: goto L_0x00a5;
                case 32: goto L_0x0083;
                case 33: goto L_0x006d;
                case 34: goto L_0x0051;
                case 35: goto L_0x0039;
                case 36: goto L_0x0021;
                case 37: goto L_0x0005;
                case 38: goto L_0x0005;
                case 39: goto L_0x0005;
                case 40: goto L_0x0005;
                case 41: goto L_0x0005;
                case 42: goto L_0x0005;
                case 43: goto L_0x0005;
                case 44: goto L_0x0005;
                case 45: goto L_0x0005;
                case 46: goto L_0x0009;
                default: goto L_0x0005;
            }
        L_0x0005:
            X.C47699EDi.super.onFinish()
            return
        L_0x0009:
            r0 = 1500640707(0x5971f5c3, float:4.25660545E15)
            int r3 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r0 = r5.A01
            X.E6Z r0 = (X.E6Z) r0
            X.E91 r1 = r0.A02
            r0 = 46819180(0x2ca676c, float:2.9740594E-37)
            X.0fE.A00(r1, r0)
            r0 = -446935286(0xffffffffe55c4f0a, float:-6.5023665E22)
            goto L_0x0319
        L_0x0021:
            r0 = -1031018635(0xffffffffc28be775, float:-69.952065)
            int r3 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r0 = r5.A01
            X.E25 r0 = (X.E25) r0
            com.instagram.ui.widget.progressbutton.ProgressButton r1 = r0.A0B
            if (r1 == 0) goto L_0x0069
            r0 = 0
            r1.setShowProgressBar(r0)
            r0 = 1832007932(0x6d3238fc, float:3.4473264E27)
            goto L_0x0319
        L_0x0039:
            r0 = -482453025(0xffffffffe33e59df, float:-3.5113573E21)
            int r3 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r0 = r5.A01
            X.E25 r0 = (X.E25) r0
            com.instagram.ui.widget.progressbutton.ProgressButton r1 = r0.A0B
            if (r1 == 0) goto L_0x0069
            r0 = 0
            r1.setShowProgressBar(r0)
            r0 = -2055509311(0xffffffff857b6ac1, float:-1.1821571E-35)
            goto L_0x0319
        L_0x0051:
            r0 = 279400141(0x10a74ecd, float:6.59913E-29)
            int r3 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r0 = r5.A01
            X.E25 r0 = (X.E25) r0
            com.instagram.ui.widget.progressbutton.ProgressButton r1 = r0.A0B
            if (r1 == 0) goto L_0x0069
            r0 = 0
            r1.setShowProgressBar(r0)
            r0 = 388882994(0x172de232, float:5.6184813E-25)
            goto L_0x0319
        L_0x0069:
            java.lang.String r4 = "confirmButton"
            goto L_0x0308
        L_0x006d:
            r0 = 1621077119(0x609fac7f, float:9.204569E19)
            int r3 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r1 = r5.A01
            X.E2h r1 = (X.C47435E2h) r1
            r0 = 0
            r1.A03 = r0
            X.Dbb.A0u(r1)
            r0 = -184073574(0xfffffffff507429a, float:-1.7146263E32)
            goto L_0x0319
        L_0x0083:
            r0 = -121990359(0xfffffffff8ba9329, float:-3.02735E34)
            int r3 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r2 = r5.A01
            X.E3L r2 = (X.E3L) r2
            com.instagram.ui.widget.progressbutton.ProgressButton r1 = r2.A01
            java.lang.String r4 = "nextButton"
            if (r1 == 0) goto L_0x0308
            r0 = 1
            r1.setEnabled(r0)
            com.instagram.ui.widget.progressbutton.ProgressButton r1 = r2.A01
            if (r1 == 0) goto L_0x0308
            r0 = 0
            r1.setShowProgressBar(r0)
            r0 = 1371525494(0x51bfd176, float:1.02981616E11)
            goto L_0x0319
        L_0x00a5:
            r0 = -540010112(0xffffffffdfd01980, float:-2.9990314E19)
            int r3 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r0 = r5.A01
            X.E2r r0 = (X.C47445E2r) r0
            com.instagram.ui.widget.progressbutton.ProgressButton r1 = r0.A02
            if (r1 == 0) goto L_0x01d1
            r0 = 0
            r1.setShowProgressBar(r0)
            r0 = -1354638533(0xffffffffaf41db3b, float:-1.7631134E-10)
            goto L_0x0319
        L_0x00bd:
            r0 = 705368617(0x2a0b1229, float:1.235198E-13)
            int r3 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r2 = r5.A01
            X.E2r r2 = (X.C47445E2r) r2
            com.instagram.ui.widget.progressbutton.ProgressButton r1 = r2.A02
            java.lang.String r4 = "nextButton"
            if (r1 == 0) goto L_0x0308
            r0 = 1
            r1.setEnabled(r0)
            com.instagram.ui.widget.progressbutton.ProgressButton r1 = r2.A02
            if (r1 == 0) goto L_0x0308
            r0 = 0
            r1.setShowProgressBar(r0)
            r0 = 250236024(0xeea4c78, float:5.775909E-30)
            goto L_0x0319
        L_0x00df:
            r0 = 135328713(0x810f3c9, float:4.361999E-34)
            int r3 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r2 = r5.A01
            X.E2r r2 = (X.C47445E2r) r2
            com.instagram.ui.widget.progressbutton.ProgressButton r1 = r2.A02
            java.lang.String r4 = "nextButton"
            if (r1 == 0) goto L_0x0308
            r0 = 1
            r1.setEnabled(r0)
            com.instagram.ui.widget.progressbutton.ProgressButton r1 = r2.A02
            if (r1 == 0) goto L_0x0308
            r0 = 0
            r1.setShowProgressBar(r0)
            r0 = -1769629618(0xffffffff9685984e, float:-2.1583427E-25)
            goto L_0x0319
        L_0x0101:
            r0 = 2094378978(0x7cd5afe2, float:8.8762125E36)
            int r3 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r2 = r5.A01
            X.E2r r2 = (X.C47445E2r) r2
            com.instagram.ui.widget.progressbutton.ProgressButton r1 = r2.A02
            java.lang.String r4 = "nextButton"
            if (r1 == 0) goto L_0x0308
            r0 = 1
            r1.setEnabled(r0)
            com.instagram.ui.widget.progressbutton.ProgressButton r1 = r2.A02
            if (r1 == 0) goto L_0x0308
            r0 = 0
            r1.setShowProgressBar(r0)
            r0 = 1399578062(0x536bddce, float:1.01303858E12)
            goto L_0x0319
        L_0x0123:
            r0 = -1434505844(0xffffffffaa7f2d8c, float:-2.2664352E-13)
            int r3 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r2 = r5.A01
            X.E2r r2 = (X.C47445E2r) r2
            com.instagram.ui.widget.progressbutton.ProgressButton r1 = r2.A02
            java.lang.String r4 = "nextButton"
            if (r1 == 0) goto L_0x0308
            r0 = 1
            r1.setEnabled(r0)
            com.instagram.ui.widget.progressbutton.ProgressButton r1 = r2.A02
            if (r1 == 0) goto L_0x0308
            r0 = 0
            r1.setShowProgressBar(r0)
            r0 = -211862949(0xfffffffff35f3a5b, float:-1.768594E31)
            goto L_0x0319
        L_0x0145:
            r0 = -1141598479(0xffffffffbbf496f1, float:-0.0074642827)
            int r3 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r0 = r5.A01
            X.E2r r0 = (X.C47445E2r) r0
            com.instagram.ui.widget.progressbutton.ProgressButton r1 = r0.A02
            if (r1 == 0) goto L_0x01d1
            r0 = 0
            r1.setShowProgressBar(r0)
            r0 = -1206060770(0xffffffffb81cf91e, float:-3.7425307E-5)
            goto L_0x0319
        L_0x015d:
            r0 = 434969723(0x19ed1c7b, float:2.4516729E-23)
            int r3 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r0 = r5.A01
            X.E2r r0 = (X.C47445E2r) r0
            com.instagram.ui.widget.progressbutton.ProgressButton r1 = r0.A02
            if (r1 == 0) goto L_0x01d1
            r0 = 0
            r1.setShowProgressBar(r0)
            r0 = 595098044(0x237879bc, float:1.3469885E-17)
            goto L_0x0319
        L_0x0175:
            r0 = 399682624(0x17d2ac40, float:1.3614414E-24)
            int r3 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r2 = r5.A01
            X.E2r r2 = (X.C47445E2r) r2
            com.instagram.ui.widget.progressbutton.ProgressButton r1 = r2.A02
            java.lang.String r4 = "nextButton"
            if (r1 == 0) goto L_0x0308
            r0 = 1
            r1.setEnabled(r0)
            com.instagram.ui.widget.progressbutton.ProgressButton r1 = r2.A02
            if (r1 == 0) goto L_0x0308
            r0 = 0
            r1.setShowProgressBar(r0)
            r0 = 813620376(0x307edc98, float:9.2718144E-10)
            goto L_0x0319
        L_0x0197:
            r0 = 166289966(0x9e9622e, float:5.6185037E-33)
            int r3 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r2 = r5.A01
            X.E3u r2 = (X.C47470E3u) r2
            com.instagram.ui.widget.progressbutton.ProgressButton r1 = r2.A00
            java.lang.String r4 = "nextButton"
            if (r1 == 0) goto L_0x0308
            r0 = 1
            r1.setEnabled(r0)
            com.instagram.ui.widget.progressbutton.ProgressButton r1 = r2.A00
            if (r1 == 0) goto L_0x0308
            r0 = 0
            r1.setShowProgressBar(r0)
            r0 = 2143045774(0x7fbc488e, float:NaN)
            goto L_0x0319
        L_0x01b9:
            r0 = -21496360(0xfffffffffeb7fdd8, float:-1.2228338E38)
            int r3 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r0 = r5.A01
            X.E2M r0 = (X.E2M) r0
            com.instagram.ui.widget.progressbutton.ProgressButton r1 = r0.A01
            if (r1 == 0) goto L_0x01d1
            r0 = 0
            r1.setShowProgressBar(r0)
            r0 = 609528100(0x2454a924, float:4.611344E-17)
            goto L_0x0319
        L_0x01d1:
            java.lang.String r4 = "nextButton"
            goto L_0x0308
        L_0x01d5:
            r0 = -367287734(0xffffffffea1ba24a, float:-4.7037473E25)
            int r3 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r2 = r5.A01
            X.E1v r2 = (X.C47427E1v) r2
            com.instagram.ui.widget.progressbutton.ProgressButton r1 = r2.A05
            r0 = 1
            r1.setEnabled(r0)
            com.instagram.ui.widget.progressbutton.ProgressButton r1 = r2.A05
            r0 = 0
            r1.setShowProgressBar(r0)
            r0 = 1583321339(0x5e5f90fb, float:4.02741296E18)
            goto L_0x0319
        L_0x01f1:
            r0 = 1388364077(0x52c0c12d, float:4.13937336E11)
            int r3 = X.AnonymousClass0fD.A03(r0)
            X.C47699EDi.super.onFinish()
            java.lang.Object r0 = r5.A01
            X.E5f r0 = (X.C47500E5f) r0
            X.EEK r0 = r0.A03
            r0.A00()
            r0 = -159141954(0xfffffffff683afbe, float:-1.3354597E33)
            goto L_0x0319
        L_0x0209:
            r0 = 514922389(0x1eb11795, float:1.8750357E-20)
            int r3 = X.AnonymousClass0fD.A03(r0)
            X.C47699EDi.super.onFinish()
            java.lang.Object r0 = r5.A01
            X.E5f r0 = (X.C47500E5f) r0
            X.EEK r0 = r0.A03
            r0.A00()
            r0 = 1849484053(0x6e3ce315, float:1.4614427E28)
            goto L_0x0319
        L_0x0221:
            r0 = 1333184573(0x4f76c83d, float:4.14031795E9)
            int r3 = X.AnonymousClass0fD.A03(r0)
            X.C47699EDi.super.onFinish()
            java.lang.Object r0 = r5.A01
            X.E5f r0 = (X.C47500E5f) r0
            X.EEK r0 = r0.A03
            r0.A00()
            r0 = -206880194(0xfffffffff3ab423e, float:-2.7137034E31)
            goto L_0x0319
        L_0x0239:
            r0 = -1915830656(0xffffffff8dcebe80, float:-1.2741591E-30)
            int r3 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r0 = r5.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            X.Dbb.A0x(r0)
            r0 = 565064929(0x21ae34e1, float:1.1804696E-18)
            goto L_0x0319
        L_0x024c:
            r0 = -605141759(0xffffffffdbee4501, float:-1.3413383E17)
            int r3 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r0 = r5.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            X.Dbb.A0x(r0)
            r0 = -929851974(0xffffffffc89395ba, float:-302253.8)
            goto L_0x0319
        L_0x025f:
            r0 = 310887759(0x1287c54f, float:8.568338E-28)
            int r3 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r0 = r5.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            X.Dbb.A0x(r0)
            r0 = 1775249827(0x69d029a3, float:3.145665E25)
            goto L_0x0319
        L_0x0272:
            r0 = -594767191(0xffffffffdc8c92a9, float:-3.1654201E17)
            int r3 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r0 = r5.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            X.Dbb.A0x(r0)
            r0 = 283981988(0x10ed38a4, float:9.3567286E-29)
            goto L_0x0319
        L_0x0285:
            r0 = 1660926987(0x62ffbc0b, float:2.3587348E21)
            int r3 = X.AnonymousClass0fD.A03(r0)
            X.C47699EDi.super.onFinish()
            java.lang.Object r2 = r5.A01
            X.E4d r2 = (X.C47478E4d) r2
            r1 = 0
            r2.A0B = r1
            boolean r0 = r2.isResumed()
            if (r0 == 0) goto L_0x029f
            X.Dbb.A17(r2, r1)
        L_0x029f:
            r0 = 213993978(0xcc149fa, float:2.9780881E-31)
            goto L_0x0319
        L_0x02a3:
            r0 = 1097442347(0x4169a42b, float:14.60258)
            int r3 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r1 = r5.A01
            X.E75 r1 = (X.E75) r1
            r0 = 0
            r1.A07 = r0
            r0 = 151682645(0x90a7e55, float:1.6670547E-33)
            goto L_0x0319
        L_0x02b5:
            r0 = -1890931160(0xffffffff8f4aae28, float:-9.99291E-30)
            int r3 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r1 = r5.A01
            X.ESR r1 = (X.ESR) r1
            r0 = 0
            r1.A04 = r0
            X.Dbb.A0u(r1)
            r0 = 987978861(0x3ae35c6d, float:0.0017346271)
            goto L_0x0319
        L_0x02ca:
            r0 = -1803797495(0xffffffff947c3c09, float:-1.27345885E-26)
            int r3 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r1 = r5.A01
            X.ESN r1 = (X.ESN) r1
            r0 = 0
            r1.A06 = r0
            X.Dbb.A0u(r1)
            r0 = -1113438013(0xffffffffbda248c3, float:-0.079240344)
            goto L_0x0319
        L_0x02df:
            r0 = 717496188(0x2ac41f7c, float:3.483844E-13)
            int r3 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r1 = r5.A01
            X.ESN r1 = (X.ESN) r1
            r0 = 0
            r1.A06 = r0
            X.Dbb.A0u(r1)
            r0 = 1073168562(0x3ff740b2, float:1.9316618)
            goto L_0x0319
        L_0x02f4:
            r0 = 1208631055(0x480a3f0f, float:141564.23)
            int r3 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r2 = r5.A01
            X.E6j r2 = (X.C47523E6j) r2
            r1 = 0
            r2.A0A = r1
            X.3AD r0 = r2.A03
            if (r0 != 0) goto L_0x0310
            java.lang.String r4 = "pullToRefresh"
        L_0x0308:
            X.0qQ.A0F(r4)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0310:
            r0.setIsLoading(r1)
            X.C46445Df7.A01(r2, r1)
            r0 = -1246427146(0xffffffffb5b507f6, float:-1.3487868E-6)
        L_0x0319:
            X.AnonymousClass0fD.A0A(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47699EDi.onFinish():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01e6, code lost:
        X.AnonymousClass0fD.A0A(r0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01e9, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01fe, code lost:
        X.0qQ.A0F(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0205, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x034e, code lost:
        X.AnonymousClass0fD.A0A(r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0351, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onStart() {
        /*
            r5 = this;
            int r0 = r5.A00
            switch(r0) {
                case 0: goto L_0x01ea;
                case 1: goto L_0x0005;
                case 2: goto L_0x033a;
                case 3: goto L_0x0328;
                case 4: goto L_0x0313;
                case 5: goto L_0x02ee;
                case 6: goto L_0x02d6;
                case 7: goto L_0x0005;
                case 8: goto L_0x0005;
                case 9: goto L_0x02be;
                case 10: goto L_0x02ab;
                case 11: goto L_0x0298;
                case 12: goto L_0x0285;
                case 13: goto L_0x0272;
                case 14: goto L_0x025a;
                case 15: goto L_0x0242;
                case 16: goto L_0x022a;
                case 17: goto L_0x020e;
                case 18: goto L_0x0005;
                case 19: goto L_0x0005;
                case 20: goto L_0x0005;
                case 21: goto L_0x01c6;
                case 22: goto L_0x0005;
                case 23: goto L_0x01a5;
                case 24: goto L_0x0184;
                case 25: goto L_0x0005;
                case 26: goto L_0x0163;
                case 27: goto L_0x0141;
                case 28: goto L_0x011f;
                case 29: goto L_0x00fd;
                case 30: goto L_0x00db;
                case 31: goto L_0x00b9;
                case 32: goto L_0x0097;
                case 33: goto L_0x0084;
                case 34: goto L_0x0062;
                case 35: goto L_0x0040;
                case 36: goto L_0x001e;
                case 37: goto L_0x0005;
                case 38: goto L_0x0005;
                case 39: goto L_0x0005;
                case 40: goto L_0x0005;
                case 41: goto L_0x0005;
                case 42: goto L_0x0009;
                default: goto L_0x0005;
            }
        L_0x0005:
            X.C47699EDi.super.onStart()
            return
        L_0x0009:
            r0 = 319174746(0x1306385a, float:1.6940961E-27)
            int r2 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r0 = r5.A01
            X.Dd4 r0 = (X.Dd4) r0
            X.0hq r0 = r0.A06
            X.SQH.A02(r0)
            r0 = 2046626659(0x79fd0b63, float:1.6423526E35)
            goto L_0x034e
        L_0x001e:
            r0 = -573030927(0xffffffffddd83df1, float:-1.94773441E18)
            int r3 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r2 = r5.A01
            X.E25 r2 = (X.E25) r2
            com.instagram.ui.widget.progressbutton.ProgressButton r1 = r2.A0B
            java.lang.String r4 = "confirmButton"
            if (r1 == 0) goto L_0x01fe
            r0 = 0
            r1.setEnabled(r0)
            com.instagram.ui.widget.progressbutton.ProgressButton r1 = r2.A0B
            if (r1 == 0) goto L_0x01fe
            r0 = 1
            r1.setShowProgressBar(r0)
            r0 = -1439306156(0xffffffffaa35ee54, float:-1.6158716E-13)
            goto L_0x01e6
        L_0x0040:
            r0 = -234158731(0xfffffffff20b0575, float:-2.753601E30)
            int r3 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r2 = r5.A01
            X.E25 r2 = (X.E25) r2
            com.instagram.ui.widget.progressbutton.ProgressButton r1 = r2.A0B
            java.lang.String r4 = "confirmButton"
            if (r1 == 0) goto L_0x01fe
            r0 = 0
            r1.setEnabled(r0)
            com.instagram.ui.widget.progressbutton.ProgressButton r1 = r2.A0B
            if (r1 == 0) goto L_0x01fe
            r0 = 1
            r1.setShowProgressBar(r0)
            r0 = 1005083552(0x3be85ba0, float:0.0070910007)
            goto L_0x01e6
        L_0x0062:
            r0 = -1854334910(0xffffffff91791842, float:-1.9650112E-28)
            int r3 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r2 = r5.A01
            X.E25 r2 = (X.E25) r2
            com.instagram.ui.widget.progressbutton.ProgressButton r1 = r2.A0B
            java.lang.String r4 = "confirmButton"
            if (r1 == 0) goto L_0x01fe
            r0 = 0
            r1.setEnabled(r0)
            com.instagram.ui.widget.progressbutton.ProgressButton r1 = r2.A0B
            if (r1 == 0) goto L_0x01fe
            r0 = 1
            r1.setShowProgressBar(r0)
            r0 = -1338732681(0xffffffffb0348f77, float:-6.5687494E-10)
            goto L_0x01e6
        L_0x0084:
            r0 = 2035249370(0x794f70da, float:6.7318397E34)
            int r2 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r1 = r5.A01
            X.E2h r1 = (X.C47435E2h) r1
            r0 = 1
            r1.A03 = r0
            r0 = -1150186282(0xffffffffbb718cd6, float:-0.0036857626)
            goto L_0x034e
        L_0x0097:
            r0 = 533436704(0x1fcb9920, float:8.622717E-20)
            int r3 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r2 = r5.A01
            X.E3L r2 = (X.E3L) r2
            com.instagram.ui.widget.progressbutton.ProgressButton r1 = r2.A01
            java.lang.String r4 = "nextButton"
            if (r1 == 0) goto L_0x01fe
            r0 = 0
            r1.setEnabled(r0)
            com.instagram.ui.widget.progressbutton.ProgressButton r1 = r2.A01
            if (r1 == 0) goto L_0x01fe
            r0 = 1
            r1.setShowProgressBar(r0)
            r0 = -2018933384(0xffffffff87a98578, float:-2.550674E-34)
            goto L_0x01e6
        L_0x00b9:
            r0 = -333200880(0xffffffffec23c210, float:-7.918854E26)
            int r3 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r2 = r5.A01
            X.E2r r2 = (X.C47445E2r) r2
            com.instagram.ui.widget.progressbutton.ProgressButton r1 = r2.A02
            java.lang.String r4 = "nextButton"
            if (r1 == 0) goto L_0x01fe
            r0 = 0
            r1.setEnabled(r0)
            com.instagram.ui.widget.progressbutton.ProgressButton r1 = r2.A02
            if (r1 == 0) goto L_0x01fe
            r0 = 1
            r1.setShowProgressBar(r0)
            r0 = -720444655(0xffffffffd50ee311, float:-9.8191184E12)
            goto L_0x01e6
        L_0x00db:
            r0 = 158372031(0x97090bf, float:2.8957008E-33)
            int r3 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r2 = r5.A01
            X.E2r r2 = (X.C47445E2r) r2
            com.instagram.ui.widget.progressbutton.ProgressButton r1 = r2.A02
            java.lang.String r4 = "nextButton"
            if (r1 == 0) goto L_0x01fe
            r0 = 0
            r1.setEnabled(r0)
            com.instagram.ui.widget.progressbutton.ProgressButton r1 = r2.A02
            if (r1 == 0) goto L_0x01fe
            r0 = 1
            r1.setShowProgressBar(r0)
            r0 = 719261388(0x2adf0ecc, float:3.9623025E-13)
            goto L_0x01e6
        L_0x00fd:
            r0 = -595152509(0xffffffffdc86b183, float:-3.03302585E17)
            int r3 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r2 = r5.A01
            X.E2r r2 = (X.C47445E2r) r2
            com.instagram.ui.widget.progressbutton.ProgressButton r1 = r2.A02
            java.lang.String r4 = "nextButton"
            if (r1 == 0) goto L_0x01fe
            r0 = 0
            r1.setEnabled(r0)
            com.instagram.ui.widget.progressbutton.ProgressButton r1 = r2.A02
            if (r1 == 0) goto L_0x01fe
            r0 = 1
            r1.setShowProgressBar(r0)
            r0 = 830923634(0x3186e372, float:3.925771E-9)
            goto L_0x01e6
        L_0x011f:
            r0 = 733652914(0x2bbaa7b2, float:1.326264E-12)
            int r3 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r2 = r5.A01
            X.E2r r2 = (X.C47445E2r) r2
            com.instagram.ui.widget.progressbutton.ProgressButton r1 = r2.A02
            java.lang.String r4 = "nextButton"
            if (r1 == 0) goto L_0x01fe
            r0 = 0
            r1.setEnabled(r0)
            com.instagram.ui.widget.progressbutton.ProgressButton r1 = r2.A02
            if (r1 == 0) goto L_0x01fe
            r0 = 1
            r1.setShowProgressBar(r0)
            r0 = 205465485(0xc3f278d, float:1.4726007E-31)
            goto L_0x01e6
        L_0x0141:
            r0 = 1318989224(0x4e9e2da8, float:1.32689613E9)
            int r3 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r2 = r5.A01
            X.E2r r2 = (X.C47445E2r) r2
            com.instagram.ui.widget.progressbutton.ProgressButton r1 = r2.A02
            java.lang.String r4 = "nextButton"
            if (r1 == 0) goto L_0x01fe
            r0 = 0
            r1.setEnabled(r0)
            com.instagram.ui.widget.progressbutton.ProgressButton r1 = r2.A02
            if (r1 == 0) goto L_0x01fe
            r0 = 1
            r1.setShowProgressBar(r0)
            r0 = -1194918479(0xffffffffb8c6fdb1, float:-9.4886294E-5)
            goto L_0x01e6
        L_0x0163:
            r0 = -1166012448(0xffffffffba800fe0, float:-9.770356E-4)
            int r3 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r2 = r5.A01
            X.E2r r2 = (X.C47445E2r) r2
            com.instagram.ui.widget.progressbutton.ProgressButton r1 = r2.A02
            java.lang.String r4 = "nextButton"
            if (r1 == 0) goto L_0x01fe
            r0 = 0
            r1.setEnabled(r0)
            com.instagram.ui.widget.progressbutton.ProgressButton r1 = r2.A02
            if (r1 == 0) goto L_0x01fe
            r0 = 1
            r1.setShowProgressBar(r0)
            r0 = -1296807108(0xffffffffb2b44b3c, float:-2.098897E-8)
            goto L_0x01e6
        L_0x0184:
            r0 = 1196194311(0x474c7a07, float:52346.027)
            int r3 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r2 = r5.A01
            X.E2r r2 = (X.C47445E2r) r2
            com.instagram.ui.widget.progressbutton.ProgressButton r1 = r2.A02
            java.lang.String r4 = "nextButton"
            if (r1 == 0) goto L_0x01fe
            r0 = 0
            r1.setEnabled(r0)
            com.instagram.ui.widget.progressbutton.ProgressButton r1 = r2.A02
            if (r1 == 0) goto L_0x01fe
            r0 = 1
            r1.setShowProgressBar(r0)
            r0 = -225963630(0xfffffffff2881192, float:-5.390234E30)
            goto L_0x01e6
        L_0x01a5:
            r0 = 761434490(0x2d62917a, float:1.2878915E-11)
            int r3 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r2 = r5.A01
            X.E2r r2 = (X.C47445E2r) r2
            com.instagram.ui.widget.progressbutton.ProgressButton r1 = r2.A02
            java.lang.String r4 = "nextButton"
            if (r1 == 0) goto L_0x01fe
            r0 = 0
            r1.setEnabled(r0)
            com.instagram.ui.widget.progressbutton.ProgressButton r1 = r2.A02
            if (r1 == 0) goto L_0x01fe
            r0 = 1
            r1.setShowProgressBar(r0)
            r0 = 1520821382(0x5aa5e486, float:2.33473177E16)
            goto L_0x01e6
        L_0x01c6:
            r0 = 1777888279(0x69f86c17, float:3.7540505E25)
            int r3 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r2 = r5.A01
            X.E3u r2 = (X.C47470E3u) r2
            com.instagram.ui.widget.progressbutton.ProgressButton r1 = r2.A00
            java.lang.String r4 = "nextButton"
            if (r1 == 0) goto L_0x01fe
            r0 = 0
            r1.setEnabled(r0)
            com.instagram.ui.widget.progressbutton.ProgressButton r1 = r2.A00
            if (r1 == 0) goto L_0x01fe
            r0 = 1
            r1.setShowProgressBar(r0)
            r0 = 1112352472(0x424d26d8, float:51.287933)
        L_0x01e6:
            X.AnonymousClass0fD.A0A(r0, r3)
            return
        L_0x01ea:
            r0 = 370633400(0x16176ab8, float:1.2231357E-25)
            int r2 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r0 = r5.A01
            X.E6j r0 = (X.C47523E6j) r0
            r1 = 1
            r0.A0A = r1
            X.3AD r0 = r0.A03
            if (r0 != 0) goto L_0x0206
            java.lang.String r4 = "pullToRefresh"
        L_0x01fe:
            X.0qQ.A0F(r4)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0206:
            r0.setIsLoading(r1)
            r0 = -1629250063(0xffffffff9ee39df1, float:-2.4099883E-20)
            goto L_0x034e
        L_0x020e:
            r0 = -500195404(0xffffffffe22f9fb4, float:-8.09922E20)
            int r2 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r3 = r5.A01
            X.E1v r3 = (X.C47427E1v) r3
            com.instagram.ui.widget.progressbutton.ProgressButton r1 = r3.A05
            r0 = 0
            r1.setEnabled(r0)
            com.instagram.ui.widget.progressbutton.ProgressButton r1 = r3.A05
            r0 = 1
            r1.setShowProgressBar(r0)
            r0 = 708989549(0x2a42526d, float:1.7259259E-13)
            goto L_0x034e
        L_0x022a:
            r0 = 1918989541(0x726174e5, float:4.4656284E30)
            int r2 = X.AnonymousClass0fD.A03(r0)
            X.C47699EDi.super.onStart()
            java.lang.Object r0 = r5.A01
            X.E5f r0 = (X.C47500E5f) r0
            X.EEK r0 = r0.A03
            r0.A01()
            r0 = 1871344476(0x6f8a735c, float:8.569678E28)
            goto L_0x034e
        L_0x0242:
            r0 = -420941889(0xffffffffe6e8efbf, float:-5.5000578E23)
            int r2 = X.AnonymousClass0fD.A03(r0)
            X.C47699EDi.super.onStart()
            java.lang.Object r0 = r5.A01
            X.E5f r0 = (X.C47500E5f) r0
            X.EEK r0 = r0.A03
            r0.A01()
            r0 = -1304889356(0xffffffffb238f7f4, float:-1.0766588E-8)
            goto L_0x034e
        L_0x025a:
            r0 = -2113577799(0xffffffff82055cb9, float:-9.797907E-38)
            int r2 = X.AnonymousClass0fD.A03(r0)
            X.C47699EDi.super.onStart()
            java.lang.Object r0 = r5.A01
            X.E5f r0 = (X.C47500E5f) r0
            X.EEK r0 = r0.A03
            r0.A01()
            r0 = -1386396440(0xffffffffad5d44e8, float:-1.2577696E-11)
            goto L_0x034e
        L_0x0272:
            r0 = 519214763(0x1ef296ab, float:2.5685061E-20)
            int r2 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r0 = r5.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            X.Dbb.A0y(r0)
            r0 = -942599450(0xffffffffc7d112e6, float:-107045.8)
            goto L_0x034e
        L_0x0285:
            r0 = 571123635(0x220aa7b3, float:1.8791267E-18)
            int r2 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r0 = r5.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            X.Dbb.A0y(r0)
            r0 = -1728003245(0xffffffff9900c353, float:-6.65689E-24)
            goto L_0x034e
        L_0x0298:
            r0 = 1026193612(0x3d2a78cc, float:0.041619107)
            int r2 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r0 = r5.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            X.Dbb.A0y(r0)
            r0 = -429117080(0xffffffffe66c3168, float:-2.7884747E23)
            goto L_0x034e
        L_0x02ab:
            r0 = -1993388809(0xffffffff892f4cf7, float:-2.1101047E-33)
            int r2 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r0 = r5.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            X.Dbb.A0y(r0)
            r0 = 1880175042(0x701131c2, float:1.7974192E29)
            goto L_0x034e
        L_0x02be:
            r0 = -978084490(0xffffffffc5b39d76, float:-5747.6826)
            int r2 = X.AnonymousClass0fD.A03(r0)
            X.C47699EDi.super.onStart()
            java.lang.Object r1 = r5.A01
            X.E4d r1 = (X.C47478E4d) r1
            r0 = 1
            r1.A0B = r0
            X.Dbb.A17(r1, r0)
            r0 = 511891444(0x1e82d7f4, float:1.3853602E-20)
            goto L_0x034e
        L_0x02d6:
            r0 = -1270476891(0xffffffffb4460fa5, float:-1.8445878E-7)
            int r2 = X.AnonymousClass0fD.A03(r0)
            X.C47699EDi.super.onStart()
            r1 = 1
            java.lang.Object r0 = r5.A01
            X.E3Q r0 = (X.E3Q) r0
            r0.A08 = r1
            X.E3Q.A00(r0)
            r0 = -850019867(0xffffffffcd55b9e5, float:-2.24108112E8)
            goto L_0x034e
        L_0x02ee:
            r0 = -1020841364(0xffffffffc327326c, float:-167.19696)
            int r2 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r3 = r5.A01
            X.E75 r3 = (X.E75) r3
            r0 = 1
            r3.A07 = r0
            X.Dbb.A17(r3, r0)
            r1 = 0
            com.instagram.igds.components.form.IgFormField r0 = r3.A00
            r0.setEnabled(r1)
            com.instagram.igds.components.form.IgFormField r0 = r3.A02
            r0.setEnabled(r1)
            com.instagram.igds.components.form.IgFormField r0 = r3.A01
            r0.setEnabled(r1)
            r0 = 1668178743(0x636e6337, float:4.3974743E21)
            goto L_0x034e
        L_0x0313:
            r0 = -560596602(0xffffffffde95f986, float:-5.4034081E18)
            int r2 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r1 = r5.A01
            X.ESR r1 = (X.ESR) r1
            r0 = 1
            r1.A04 = r0
            X.Dbb.A0u(r1)
            r0 = 786043148(0x2eda110c, float:9.9165204E-11)
            goto L_0x034e
        L_0x0328:
            r0 = 834225562(0x31b9459a, float:5.3921214E-9)
            int r2 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r1 = r5.A01
            X.ESN r1 = (X.ESN) r1
            r0 = 1
            r1.A06 = r0
            r0 = 204810320(0xc352850, float:1.3955864E-31)
            goto L_0x034e
        L_0x033a:
            r0 = 416699116(0x18d652ec, float:5.5401433E-24)
            int r2 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r1 = r5.A01
            X.ESN r1 = (X.ESN) r1
            r0 = 1
            r1.A06 = r0
            X.Dbb.A0u(r1)
            r0 = 1033956442(0x3da0ec5a, float:0.078575805)
        L_0x034e:
            X.AnonymousClass0fD.A0A(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47699EDi.onStart():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:134:0x055d, code lost:
        if (r3 == false) goto L_0x055f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x0662, code lost:
        if (r4 == false) goto L_0x0664;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x0738, code lost:
        r12 = "twoFacPhoneVerificationHelper";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x084a, code lost:
        r12 = androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:281:0x0d53, code lost:
        if (r3 != X.EXH.A02) goto L_0x0d55;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:407:0x0fe0, code lost:
        X.AnonymousClass0fD.A0A(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:408:0x0fe3, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:413:0x0ff0, code lost:
        X.0qQ.A0F(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:415:0x0ff7, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x01e8, code lost:
        r12 = "igKeyLineTwo";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x01ec, code lost:
        r12 = "igKeyLineOne";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0357, code lost:
        r12 = "twoFacIdentifier";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x035b, code lost:
        r12 = X.Dbq.A03();
     */
    /* JADX WARNING: Removed duplicated region for block: B:405:0x0fd3  */
    /* JADX WARNING: Removed duplicated region for block: B:409:0x0fe4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r31) {
        /*
            r30 = this;
            r1 = r30
            r2 = r31
            int r0 = r1.A00
            switch(r0) {
                case 0: goto L_0x0d70;
                case 1: goto L_0x0d2c;
                case 2: goto L_0x0d03;
                case 3: goto L_0x0ccd;
                case 4: goto L_0x0c9e;
                case 5: goto L_0x0c42;
                case 6: goto L_0x0bad;
                case 7: goto L_0x0b80;
                case 8: goto L_0x0b51;
                case 9: goto L_0x0b1b;
                case 10: goto L_0x0aec;
                case 11: goto L_0x0aa5;
                case 12: goto L_0x0a70;
                case 13: goto L_0x0a47;
                case 14: goto L_0x0a21;
                case 15: goto L_0x096b;
                case 16: goto L_0x0945;
                case 17: goto L_0x0908;
                case 18: goto L_0x08c6;
                case 19: goto L_0x084e;
                case 20: goto L_0x07fc;
                case 21: goto L_0x0799;
                case 22: goto L_0x076b;
                case 23: goto L_0x073c;
                case 24: goto L_0x0707;
                case 25: goto L_0x0009;
                case 26: goto L_0x06d6;
                case 27: goto L_0x068f;
                case 28: goto L_0x059b;
                case 29: goto L_0x051d;
                case 30: goto L_0x04ad;
                case 31: goto L_0x047c;
                case 32: goto L_0x0418;
                case 33: goto L_0x03dc;
                case 34: goto L_0x03a5;
                case 35: goto L_0x0361;
                case 36: goto L_0x02c0;
                case 37: goto L_0x021b;
                case 38: goto L_0x01f0;
                case 39: goto L_0x0199;
                case 40: goto L_0x0167;
                case 41: goto L_0x013d;
                case 42: goto L_0x010a;
                case 43: goto L_0x00b4;
                case 44: goto L_0x0080;
                case 45: goto L_0x000d;
                default: goto L_0x0009;
            }
        L_0x0009:
            X.C47699EDi.super.onSuccess(r2)
            return
        L_0x000d:
            r0 = -1986351411(0xffffffff899aaecd, float:-3.7238533E-33)
            int r0 = X.AnonymousClass0fD.A03(r0)
            X.Dvx r2 = (X.C47363Dvx) r2
            r3 = 289368219(0x113f689b, float:1.5099477E-28)
            int r4 = X.AnonymousClass0fD.A03(r3)
            java.lang.Object r5 = r1.A01
            X.E6Z r5 = (X.E6Z) r5
            r5.A03 = r2
            X.E91 r8 = r5.A02
            java.util.List r7 = r2.A02
            java.lang.Integer r6 = r2.A01
            X.3UH r3 = r2.A00
            java.util.List r1 = r8.A08
            r1.clear()
            if (r7 != 0) goto L_0x0034
            X.0sn r7 = X.0sn.A00
        L_0x0034:
            r1.addAll(r7)
            int r1 = X.DbX.A02(r6)
            X.E91.A00(r3, r8, r1)
            java.util.List r1 = r2.A02
            if (r1 == 0) goto L_0x0077
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x0077
            java.util.List r2 = r2.A02
            com.instagram.common.session.UserSession r1 = r5.A00
            X.AnonymousClass7TG.A1N(r1, r2)
            X.1OC r3 = X.C320126ro.A03(r1, r2)
            r2 = 46
            X.EDi r1 = new X.EDi
            r1.<init>(r5, r2)
            r3.A00 = r1
            r5.schedule(r3)
        L_0x005f:
            androidx.fragment.app.FragmentActivity r1 = r5.getActivity()
            if (r1 == 0) goto L_0x006c
            X.2dZ r1 = X.DbT.A0K(r1)
            r1.A0T()
        L_0x006c:
            r1 = 745893701(0x2c756f45, float:3.487836E-12)
            X.AnonymousClass0fD.A0A(r1, r4)
            r1 = 1480167897(0x583991d9, float:8.1614425E14)
            goto L_0x0fe0
        L_0x0077:
            X.E91 r2 = r5.A02
            r1 = -184063477(0xfffffffff5076a0b, float:-1.7165793E32)
            X.0fE.A00(r2, r1)
            goto L_0x005f
        L_0x0080:
            r0 = 2142762015(0x7fb7f41f, float:NaN)
            int r0 = X.AnonymousClass0fD.A03(r0)
            X.1XO r2 = (X.1XO) r2
            r3 = -774338711(0xffffffffd1d88769, float:-1.16248093E11)
            int r5 = X.AnonymousClass0fD.A03(r3)
            java.util.List r2 = r2.A06
            java.lang.Object r4 = X.AnonymousClass7TE.A13(r2)
            X.1Xj r4 = (X.1Xj) r4
            if (r4 == 0) goto L_0x00a9
            java.lang.Object r1 = r1.A01
            X.Dd4 r1 = (X.Dd4) r1
            X.4DH r3 = r1.A07
            com.instagram.common.session.UserSession r2 = r1.A0A
            java.lang.String r1 = X.DbS.A0n(r1)
            X.C48899Elz.A00(r3, r2, r4, r1)
        L_0x00a9:
            r1 = -2013358612(0xffffffff87fe95ec, float:-3.8305788E-34)
            X.AnonymousClass0fD.A0A(r1, r5)
            r1 = -759990090(0xffffffffd2b378b6, float:-3.8541217E11)
            goto L_0x0fe0
        L_0x00b4:
            r0 = -684989285(0xffffffffd72be49b, float:-1.88998341E14)
            int r0 = X.AnonymousClass0fD.A03(r0)
            X.1XO r2 = (X.1XO) r2
            r3 = -1549621714(0xffffffffa3a2a62e, float:-1.7634455E-17)
            int r4 = X.AnonymousClass0fD.A03(r3)
            java.lang.Object r6 = r1.A01
            X.Dd4 r6 = (X.Dd4) r6
            X.0hq r1 = r6.A06
            X.SQH.A01(r1)
            java.util.List r1 = r2.A06
            r11 = 0
            java.lang.Object r1 = r1.get(r11)
            if (r1 == 0) goto L_0x00fb
            com.instagram.common.session.UserSession r7 = r6.A0A
            java.lang.Class<com.instagram.modal.ModalActivity> r5 = com.instagram.modal.ModalActivity.class
            java.util.List r1 = r2.A06
            java.lang.Object r8 = r1.get(r11)
            X.1Xj r8 = (X.1Xj) r8
            r9 = 0
            r10 = r9
            r12 = r11
            android.os.Bundle r3 = X.C63502KyD.A00(r7, r8, r9, r10, r11, r12)
            androidx.fragment.app.FragmentActivity r2 = r6.A05
            java.lang.String r1 = "clips_editor"
            X.DbU.A0w(r2, r3, r7, r5, r1)
        L_0x00f0:
            r1 = -473678863(0xffffffffe3c43bf1, float:-7.239762E21)
            X.AnonymousClass0fD.A0A(r1, r4)
            r1 = 2117423170(0x7e355042, float:6.0251747E37)
            goto L_0x0fe0
        L_0x00fb:
            java.lang.String r2 = "DefaultNewsfeedRowDelegate"
            java.lang.String r1 = "failed to fetch media for clips edit metadata page"
            X.0wb.A03(r2, r1)
            androidx.fragment.app.FragmentActivity r2 = r6.A05
            java.lang.String r1 = "navigate_to_clips_edit_failed"
            X.C59689JTv.A0D(r2, r1)
            goto L_0x00f0
        L_0x010a:
            r0 = -562297862(0xffffffffde7c03fa, float:-4.53990825E18)
            int r0 = X.AnonymousClass0fD.A03(r0)
            X.1XO r2 = (X.1XO) r2
            r3 = 1675174452(0x63d92234, float:8.010816E21)
            int r3 = X.AnonymousClass0fD.A03(r3)
            java.lang.Object r1 = r1.A01
            X.Dd4 r1 = (X.Dd4) r1
            com.instagram.common.session.UserSession r6 = r1.A0A
            androidx.fragment.app.FragmentActivity r4 = r1.A05
            X.4DH r5 = r1.A07
            java.util.List r1 = r2.A06
            java.lang.Object r7 = X.AnonymousClass7TE.A13(r1)
            X.1Xj r7 = (X.1Xj) r7
            java.lang.String r8 = "activity_tab"
            r9 = 1
            X.1OP.A09(r4, r5, r6, r7, r8, r9)
            r1 = 1663706448(0x632a2550, float:3.1386351E21)
            X.AnonymousClass0fD.A0A(r1, r3)
            r1 = -2025494811(0xffffffff874566e5, float:-1.4850871E-34)
            goto L_0x0fe0
        L_0x013d:
            r0 = -1997454089(0xffffffff88f144f7, float:-1.4520873E-33)
            int r0 = X.AnonymousClass0fD.A03(r0)
            r2 = 2027366413(0x78d7280d, float:3.491113E34)
            int r3 = X.AnonymousClass0fD.A03(r2)
            java.lang.Object r1 = r1.A01
            X.E4Y r1 = (X.E4Y) r1
            androidx.fragment.app.FragmentActivity r2 = r1.requireActivity()
            X.0eM r1 = r1.A03
            X.6Yo r1 = X.DbX.A0N(r2, r1)
            r1.A06()
            r1 = -1932558325(0xffffffff8ccf800b, float:-3.1970463E-31)
            X.AnonymousClass0fD.A0A(r1, r3)
            r1 = -1747512(0xffffffffffe555c8, float:NaN)
            goto L_0x0fe0
        L_0x0167:
            r0 = 1041552805(0x3e14d5a5, float:0.14534624)
            int r0 = X.AnonymousClass0fD.A03(r0)
            X.Dui r2 = (X.C47315Dui) r2
            r3 = 916253650(0x369cebd2, float:4.6766154E-6)
            int r4 = X.AnonymousClass7TG.A0D(r2, r3)
            X.DrH r2 = r2.A00
            if (r2 == 0) goto L_0x084a
            java.lang.Object r1 = r1.A01
            X.E2T r1 = (X.E2T) r1
            java.lang.String r3 = r2.A00
            r1.A02 = r3
            android.widget.TextView r2 = r1.A00
            if (r2 == 0) goto L_0x01ec
            android.widget.TextView r1 = r1.A01
            if (r1 == 0) goto L_0x01e8
            X.FGN.A03(r2, r1, r3)
            r1 = 318826952(0x1300e9c8, float:1.6271134E-27)
            X.AnonymousClass0fD.A0A(r1, r4)
            r1 = 1875891617(0x6fcfd5a1, float:1.2864332E29)
            goto L_0x0fe0
        L_0x0199:
            r0 = -2140242564(0xffffffff806e7d7c, float:-1.014692E-38)
            int r0 = X.AnonymousClass0fD.A03(r0)
            X.Dui r2 = (X.C47315Dui) r2
            r3 = 1467743835(0x577bfe5b, float:2.77069867E14)
            int r6 = X.AnonymousClass7TG.A0D(r2, r3)
            X.DrH r7 = r2.A00
            if (r7 == 0) goto L_0x084a
            java.lang.Object r5 = r1.A01
            X.E4M r5 = (X.E4M) r5
            r1 = 1
            r5.A03 = r1
            android.os.Bundle r2 = r5.A00
            java.lang.String r12 = "twoFacResponseBundle"
            if (r2 == 0) goto L_0x0ff0
            java.lang.String r4 = r7.A00
            java.lang.String r1 = "instagram_key"
            r2.putString(r1, r4)
            android.os.Bundle r3 = r5.A00
            if (r3 == 0) goto L_0x0ff0
            java.lang.String r2 = r7.A01
            if (r2 != 0) goto L_0x01cb
            java.lang.String r2 = ""
        L_0x01cb:
            java.lang.String r1 = X.Dbb.A0W()
            r3.putString(r1, r2)
            android.widget.TextView r2 = r5.A01
            if (r2 == 0) goto L_0x01ec
            android.widget.TextView r1 = r5.A02
            if (r1 == 0) goto L_0x01e8
            X.FGN.A03(r2, r1, r4)
            r1 = 377390642(0x167e8632, float:2.0560301E-25)
            X.AnonymousClass0fD.A0A(r1, r6)
            r1 = -1631616700(0xffffffff9ebf8144, float:-2.0276375E-20)
            goto L_0x0fe0
        L_0x01e8:
            java.lang.String r12 = "igKeyLineTwo"
            goto L_0x0ff0
        L_0x01ec:
            java.lang.String r12 = "igKeyLineOne"
            goto L_0x0ff0
        L_0x01f0:
            r0 = -1568228686(0xffffffffa286bab2, float:-3.6518444E-18)
            int r0 = X.AnonymousClass0fD.A03(r0)
            X.DwU r2 = (X.DwU) r2
            r3 = 997839869(0x3b79d3fd, float:0.003812074)
            int r5 = X.AnonymousClass7TG.A0D(r2, r3)
            java.lang.Object r4 = r1.A01
            X.ESD r4 = (X.ESD) r4
            android.os.Bundle r3 = r2.A00()
            r4.A00 = r3
            X.C47699EDi.super.onSuccess(r2)
            X.ESD.A06(r4)
            r1 = 114823629(0x6d811cd, float:8.1276325E-35)
            X.AnonymousClass0fD.A0A(r1, r5)
            r1 = -2065210530(0xffffffff84e7635e, float:-5.4399093E-36)
            goto L_0x0fe0
        L_0x021b:
            r0 = 381467021(0x16bcb98d, float:3.0490137E-25)
            int r0 = X.AnonymousClass0fD.A03(r0)
            X.CGF r2 = (X.CGF) r2
            r3 = 923812257(0x371041a1, float:8.598349E-6)
            int r3 = X.AnonymousClass0fD.A03(r3)
            r13 = 0
            X.0qQ.A0B(r2, r13)
            X.C47699EDi.super.onSuccess(r2)
            java.lang.Integer r2 = r2.A00()
            int r4 = r2.intValue()
            r2 = 3
            java.lang.String r12 = "notificationStatusHandler"
            if (r4 == r2) goto L_0x0271
            r2 = 2
            if (r4 == r2) goto L_0x0261
            r2 = 4
            if (r4 != r2) goto L_0x0256
            java.lang.Object r2 = r1.A01
            X.E25 r2 = (X.E25) r2
            X.FEz r1 = r2.A09
            if (r1 == 0) goto L_0x02bc
            java.lang.String r2 = r2.A0E
            if (r2 == 0) goto L_0x02b8
            java.util.Map r1 = r1.A01
            r1.remove(r2)
        L_0x0256:
            r1 = -1214368383(0xffffffffb79e3581, float:-1.8859982E-5)
            X.AnonymousClass0fD.A0A(r1, r3)
            r1 = 485384932(0x1cee62e4, float:1.5775081E-21)
            goto L_0x0fe0
        L_0x0261:
            java.lang.Object r1 = r1.A01
            X.E25 r1 = (X.E25) r1
            android.os.Handler r5 = r1.A00
            if (r5 == 0) goto L_0x0ff0
            java.lang.Runnable r4 = r1.A0U
            r1 = 3000(0xbb8, double:1.482E-320)
            r5.postDelayed(r4, r1)
            goto L_0x0256
        L_0x0271:
            java.lang.Object r4 = r1.A01
            X.E25 r4 = (X.E25) r4
            android.os.Handler r2 = r4.A00
            if (r2 == 0) goto L_0x0ff0
            java.lang.Runnable r1 = r4.A0U
            r2.removeCallbacks(r1)
            android.content.Context r6 = r4.requireContext()
            X.0aP r7 = r4.A06
            if (r7 != 0) goto L_0x028a
            java.lang.String r12 = "loggedOutSession"
            goto L_0x0ff0
        L_0x028a:
            java.lang.String r8 = r4.A0H
            if (r8 == 0) goto L_0x035b
            java.lang.String r9 = r4.A0G
            if (r9 == 0) goto L_0x0357
            X.FEz r1 = r4.A09
            if (r1 == 0) goto L_0x02bc
            java.lang.String r2 = r4.A0E
            if (r2 == 0) goto L_0x02b8
            java.util.Map r1 = r1.A01
            java.lang.Object r12 = r1.get(r2)
            java.util.List r12 = (java.util.List) r12
            r1 = 4
            java.lang.String r11 = java.lang.String.valueOf(r1)
            java.lang.String r10 = ""
            X.1OC r2 = X.FFP.A00(r6, r7, r8, r9, r10, r11, r12, r13)
            X.EMF r1 = new X.EMF
            r1.<init>(r4, r13)
            r2.A00 = r1
            r4.schedule(r2)
            goto L_0x0256
        L_0x02b8:
            java.lang.String r12 = "pk"
            goto L_0x0ff0
        L_0x02bc:
            java.lang.String r12 = "twoFacSecureNonceManager"
            goto L_0x0ff0
        L_0x02c0:
            r0 = 529808410(0x1f943c1a, float:6.277987E-20)
            int r0 = X.AnonymousClass0fD.A03(r0)
            X.DwF r2 = (X.DwF) r2
            r3 = 478023028(0x1c7e0d74, float:8.405894E-22)
            int r8 = X.AnonymousClass7TG.A0D(r2, r3)
            java.lang.String r4 = r2.A00
            java.lang.String r3 = "show_two_factor_support_challenge"
            boolean r3 = X.0qQ.A0K(r4, r3)
            java.lang.String r12 = "loggedOutSession"
            r9 = 0
            if (r3 == 0) goto L_0x0324
            java.util.HashMap r5 = X.AnonymousClass7TE.A1E()
            java.lang.String r4 = "get_challenge"
            java.lang.String r3 = "true"
            r5.put(r4, r3)
            java.lang.String r4 = r2.A05
            java.lang.String r3 = "user_id"
            r5.put(r3, r4)
            java.lang.String r4 = r2.A04
            java.lang.String r3 = "nonce_code"
            r5.put(r3, r4)
            java.lang.String r4 = r2.A03
            java.lang.String r3 = "cni"
            r5.put(r3, r4)
            java.lang.String r4 = r2.A02
            java.lang.String r3 = "challenge_context"
            r5.put(r3, r4)
            java.lang.Object r4 = r1.A01
            X.E25 r4 = (X.E25) r4
            X.0aP r3 = r4.A06
            if (r3 == 0) goto L_0x0ff0
            java.lang.String r1 = r2.A01
            X.8ey r2 = X.C359988do.A02(r9, r3, r1, r5)
            r1 = 7
            X.E84.A00(r2, r4, r1)
            r4.schedule(r2)
        L_0x0319:
            r1 = -155653090(0xfffffffff6b8ec1e, float:-1.8753352E33)
            X.AnonymousClass0fD.A0A(r1, r8)
            r1 = -2145817490(0xffffffff80196c6e, float:-2.334785E-39)
            goto L_0x0fe0
        L_0x0324:
            X.DbT.A15()
            java.lang.Object r7 = r1.A01
            X.E25 r7 = (X.E25) r7
            java.lang.String r6 = r7.A0H
            if (r6 == 0) goto L_0x035b
            java.lang.String r5 = r7.A0G
            if (r5 == 0) goto L_0x0357
            X.EVZ r4 = X.EVZ.ARGUMENT_TWO_FAC_LOGIN_SUPPORT_FLOW
            X.E1v r3 = new X.E1v
            r3.<init>()
            android.os.Bundle r2 = X.AnonymousClass7TE.A0a()
            java.lang.String r1 = "ARGUMENT_OMNISTRING"
            r2.putString(r1, r6)
            java.lang.String r1 = "ARGUMENT_TWOFAC_IDENTIFIER"
            r2.putString(r1, r5)
            X.C48975EnD.A00(r2, r4)
            androidx.fragment.app.FragmentActivity r2 = X.DbU.A0I(r2, r3, r7)
            X.0aP r1 = r7.A06
            if (r1 == 0) goto L_0x0ff0
            X.Dbb.A0o(r9, r3, r2, r1)
            goto L_0x0319
        L_0x0357:
            java.lang.String r12 = "twoFacIdentifier"
            goto L_0x0ff0
        L_0x035b:
            java.lang.String r12 = X.Dbq.A03()
            goto L_0x0ff0
        L_0x0361:
            r0 = -373374627(0xffffffffe9bec15d, float:-2.882613E25)
            int r0 = X.AnonymousClass0fD.A03(r0)
            X.Dvv r2 = (X.C47361Dvv) r2
            r3 = -126904414(0xfffffffff86f97a2, float:-1.9438038E34)
            int r5 = X.AnonymousClass7TG.A0D(r2, r3)
            java.lang.Object r4 = r1.A01
            X.E25 r4 = (X.E25) r4
            boolean r1 = r4.A0I
            if (r1 == 0) goto L_0x0387
            r1 = 2131975765(0x7f135e55, float:1.9588632E38)
            java.lang.String r3 = X.DbU.A0m(r4, r1)
            android.content.Context r1 = r4.requireContext()
            X.C59689JTv.A09(r1, r3)
        L_0x0387:
            r1 = 1
            r4.A0I = r1
            X.F19 r1 = r2.A01
            java.lang.String r1 = r1.A05
            r4.A0G = r1
            X.EwO r3 = r4.A08
            if (r3 == 0) goto L_0x0738
            long r1 = android.os.SystemClock.elapsedRealtime()
            r3.A01 = r1
            r1 = -2104152579(0xffffffff82952dfd, float:-2.1919978E-37)
            X.AnonymousClass0fD.A0A(r1, r5)
            r1 = -1073753907(0xffffffffbfffd0cd, float:-1.9985596)
            goto L_0x0fe0
        L_0x03a5:
            r0 = 307399705(0x12528c19, float:6.6437E-28)
            int r0 = X.AnonymousClass0fD.A03(r0)
            X.Dun r2 = (X.C47320Dun) r2
            r3 = 312457523(0x129fb933, float:1.0079966E-27)
            int r5 = X.AnonymousClass7TG.A0D(r2, r3)
            X.DrM r4 = r2.A00
            if (r4 == 0) goto L_0x084a
            java.lang.Object r3 = r1.A01
            X.E25 r3 = (X.E25) r3
            r1 = 2131975765(0x7f135e55, float:1.9588632E38)
            java.lang.String r2 = X.DbU.A0m(r3, r1)
            android.content.Context r1 = r3.requireContext()
            X.C59689JTv.A09(r1, r2)
            X.Drc r1 = r4.A00
            java.lang.String r1 = r1.A00
            r3.A0G = r1
            r1 = 1364401624(0x51531dd8, float:5.6671175E10)
            X.AnonymousClass0fD.A0A(r1, r5)
            r1 = 18968020(0x1216dd4, float:2.9649828E-38)
            goto L_0x0fe0
        L_0x03dc:
            r0 = -781904983(0xffffffffd16513a9, float:-6.1492335E10)
            int r0 = X.AnonymousClass0fD.A03(r0)
            X.DwU r2 = (X.DwU) r2
            r3 = -1493102114(0xffffffffa70111de, float:-1.7912032E-15)
            int r5 = X.AnonymousClass7TG.A0D(r2, r3)
            java.lang.Object r4 = r1.A01
            X.E2h r4 = (X.C47435E2h) r4
            android.view.View r1 = r4.mView
            if (r1 == 0) goto L_0x0401
            android.view.ViewStub r3 = r4.A01
            if (r3 != 0) goto L_0x03fc
            java.lang.String r12 = "loadingViewStub"
            goto L_0x0ff0
        L_0x03fc:
            r1 = 8
            r3.setVisibility(r1)
        L_0x0401:
            android.os.Handler r3 = X.AnonymousClass7TF.A0D()
            X.Ft3 r1 = new X.Ft3
            r1.<init>(r2, r4)
            r3.post(r1)
            r1 = -1523206049(0xffffffffa535b85f, float:-1.5761715E-16)
            X.AnonymousClass0fD.A0A(r1, r5)
            r1 = 612384957(0x248040bd, float:5.562082E-17)
            goto L_0x0fe0
        L_0x0418:
            r0 = 190865912(0xb6061f8, float:4.3214534E-32)
            int r0 = X.AnonymousClass0fD.A03(r0)
            r2 = 1670421232(0x63909af0, float:5.334991E21)
            int r3 = X.AnonymousClass0fD.A03(r2)
            java.lang.Object r5 = r1.A01
            X.E3L r5 = (X.E3L) r5
            com.instagram.ui.widget.editphonenumber.EditPhoneNumberView r1 = r5.A00
            java.lang.String r12 = "editPhoneNumberView"
            if (r1 == 0) goto L_0x0ff0
            java.lang.String r1 = r1.getPhoneNumber()
            r5.A02 = r1
            android.os.Bundle r4 = r5.requireArguments()
            com.instagram.ui.widget.editphonenumber.EditPhoneNumberView r1 = r5.A00
            if (r1 == 0) goto L_0x0ff0
            java.lang.String r2 = r1.getPhoneNumber()
            java.lang.String r1 = X.Dbq.A00()
            r4.putString(r1, r2)
            com.instagram.ui.widget.editphonenumber.EditPhoneNumberView r1 = r5.A00
            if (r1 == 0) goto L_0x0ff0
            java.lang.String r2 = r1.getCountryCode()
            java.lang.String r1 = "country_code"
            r4.putString(r1, r2)
            com.instagram.ui.widget.editphonenumber.EditPhoneNumberView r1 = r5.A00
            if (r1 == 0) goto L_0x0ff0
            android.widget.EditText r1 = r1.A01
            java.lang.String r2 = X.AnonymousClass7TF.A0f(r1)
            java.lang.String r1 = "national_number"
            r4.putString(r1, r2)
            android.os.Handler r2 = X.AnonymousClass7TF.A0D()
            X.Fqf r1 = new X.Fqf
            r1.<init>(r5)
            r2.post(r1)
            r1 = 926290339(0x373611a3, float:1.0852152E-5)
            X.AnonymousClass0fD.A0A(r1, r3)
            r1 = 1228066685(0x4932cf7d, float:732407.8)
            goto L_0x0fe0
        L_0x047c:
            r0 = 1999955972(0x7734e804, float:3.669216E33)
            int r0 = X.AnonymousClass0fD.A03(r0)
            r2 = -1902967491(0xffffffff8e93053d, float:-3.6243342E-30)
            int r4 = X.AnonymousClass0fD.A03(r2)
            java.lang.Object r3 = r1.A01
            X.E2r r3 = (X.C47445E2r) r3
            android.content.Context r2 = r3.requireContext()
            r1 = 2131975765(0x7f135e55, float:1.9588632E38)
            X.DbZ.A0w(r2, r3, r1)
            X.EwO r3 = r3.A00
            if (r3 == 0) goto L_0x0738
            long r1 = android.os.SystemClock.elapsedRealtime()
            r3.A01 = r1
            r1 = -961309833(0xffffffffc6b39377, float:-22985.732)
            X.AnonymousClass0fD.A0A(r1, r4)
            r1 = -1213126897(0xffffffffb7b1270f, float:-2.1118232E-5)
            goto L_0x0fe0
        L_0x04ad:
            r0 = 711310780(0x2a65bdbc, float:2.0405113E-13)
            int r0 = X.AnonymousClass0fD.A03(r0)
            r2 = 313842302(0x12b4da7e, float:1.14134595E-27)
            int r5 = X.AnonymousClass0fD.A03(r2)
            java.lang.Object r6 = r1.A01
            X.E2r r6 = (X.C47445E2r) r6
            X.1xC r7 = X.1xC.A01
            X.6ap r4 = X.DbS.A0a()
            r1 = 2131975795(0x7f135e73, float:1.9588692E38)
            X.DbS.A1E(r6, r4, r1)
            android.content.Context r2 = r6.requireContext()
            r1 = 2131237902(0x7f081c0e, float:1.8092068E38)
            android.graphics.drawable.Drawable r3 = r2.getDrawable(r1)
            X.0qQ.A0A(r3)
            android.content.Context r2 = r6.requireContext()
            android.content.Context r1 = r6.getContext()
            int r1 = X.2Yu.A05(r1)
            int r1 = r2.getColor(r1)
            r4.A08(r3, r1)
            r4.A02()
            X.DbY.A1K(r7, r4)
            X.F3Y r4 = X.FFR.A00()
            android.os.Bundle r2 = r6.requireArguments()
            java.lang.String r1 = "is_two_factor_enabled"
            boolean r1 = r2.getBoolean(r1)
            r3 = 1
            r2 = r1 ^ 1
            java.lang.Integer r1 = X.AnonymousClass05K.A0j
            X.E2h r3 = r4.A02(r1, r3, r2)
            androidx.fragment.app.FragmentActivity r2 = r6.requireActivity()
            X.0eM r1 = r6.A0A
            X.Dbc.A0S(r3, r2, r1)
            r1 = -1675280836(0xffffffff9c253e3c, float:-5.4674356E-22)
            X.AnonymousClass0fD.A0A(r1, r5)
            r1 = 1878670338(0x6ffa3c02, float:1.54887595E29)
            goto L_0x0fe0
        L_0x051d:
            r0 = -492774688(0xffffffffe2a0dae0, float:-1.4836253E21)
            int r0 = X.AnonymousClass0fD.A03(r0)
            r2 = 564261190(0x21a1f146, float:1.0973649E-18)
            int r6 = X.AnonymousClass0fD.A03(r2)
            java.lang.Object r7 = r1.A01
            X.E2r r7 = (X.C47445E2r) r7
            boolean r1 = r7.isResumed()
            if (r1 == 0) goto L_0x0590
            android.os.Bundle r8 = r7.requireArguments()
            java.lang.String r2 = r7.A05
            java.lang.String r12 = "phoneNumberOrEmail"
            if (r2 == 0) goto L_0x0ff0
            java.lang.String r9 = X.Dbq.A00()
            java.lang.String r1 = r8.getString(r9)
            boolean r3 = r2.equals(r1)
            java.lang.String r1 = "is_phone_confirmed"
            boolean r2 = r8.getBoolean(r1)
            java.lang.String r1 = "is_two_factor_enabled"
            boolean r5 = r8.getBoolean(r1)
            X.FFR.A03()
            if (r2 == 0) goto L_0x055f
            r4 = 0
            if (r3 != 0) goto L_0x0560
        L_0x055f:
            r4 = 1
        L_0x0560:
            java.lang.String r3 = r7.A05
            if (r3 == 0) goto L_0x0ff0
            java.lang.Integer r2 = r7.A04
            if (r2 != 0) goto L_0x056c
            java.lang.String r12 = "twoFacMethod"
            goto L_0x0ff0
        L_0x056c:
            java.lang.String r1 = "has_phone_number_confirmed"
            r8.putBoolean(r1, r4)
            r8.putString(r9, r3)
            java.lang.String r1 = "has_two_fac_already_on"
            r8.putBoolean(r1, r5)
            java.lang.String r2 = X.C48977EnF.A00(r2)
            java.lang.String r1 = "two_fac_enable_method"
            r8.putString(r1, r2)
            X.E4K r3 = new X.E4K
            r3.<init>()
            androidx.fragment.app.FragmentActivity r2 = X.DbU.A0I(r8, r3, r7)
            X.0eM r1 = r7.A0A
            X.Dbc.A0S(r3, r2, r1)
        L_0x0590:
            r1 = -2128616544(0xffffffff811fe3a0, float:-2.9367E-38)
            X.AnonymousClass0fD.A0A(r1, r6)
            r1 = 254769087(0xf2f77bf, float:8.6512284E-30)
            goto L_0x0fe0
        L_0x059b:
            r0 = -191966519(0xfffffffff48ed2c9, float:-9.052507E31)
            int r0 = X.AnonymousClass0fD.A03(r0)
            X.DwX r2 = (X.DwX) r2
            r3 = -754774635(0xffffffffd3030d95, float:-5.6286858E11)
            int r8 = X.AnonymousClass7TG.A0D(r2, r3)
            java.lang.Object r9 = r1.A01
            X.E2r r9 = (X.C47445E2r) r9
            boolean r1 = r9.isResumed()
            if (r1 == 0) goto L_0x062f
            java.lang.Integer r3 = r9.A04
            java.lang.String r11 = "twoFacMethod"
            if (r3 == 0) goto L_0x068a
            java.lang.Integer r1 = X.AnonymousClass05K.A0C
            if (r3 != r1) goto L_0x063a
            X.1xC r6 = X.1xC.A01
            X.6ap r5 = X.DbS.A0a()
            r1 = 2131975680(0x7f135e00, float:1.958846E38)
            X.DbS.A1E(r9, r5, r1)
            r1 = 2131975796(0x7f135e74, float:1.9588694E38)
            java.lang.String r1 = r9.getString(r1)
            r5.A0I = r1
            android.content.Context r3 = r9.requireContext()
            r1 = 2131237941(0x7f081c35, float:1.8092147E38)
            android.graphics.drawable.Drawable r4 = r3.getDrawable(r1)
            X.0qQ.A0A(r4)
            android.content.Context r3 = r9.requireContext()
            android.content.Context r1 = r9.getContext()
            int r1 = X.2Yu.A05(r1)
            int r1 = r3.getColor(r1)
            r5.A08(r4, r1)
            r5.A02()
            X.DbY.A1K(r6, r5)
            X.FFR.A03()
            android.os.Bundle r7 = r9.requireArguments()
            X.E3u r5 = new X.E3u
            r5.<init>()
        L_0x0607:
            r5.setArguments(r7)
            java.lang.String r1 = r2.A02
            if (r1 == 0) goto L_0x0626
            int r1 = r1.length()
            if (r1 == 0) goto L_0x0626
            X.FEz r4 = X.FFR.A02()
            X.0eM r1 = r9.A0A
            java.lang.String r3 = X.DbU.A0u(r1)
            java.lang.String r1 = r2.A02
            X.0qQ.A07(r1)
            r4.A02(r3, r1)
        L_0x0626:
            androidx.fragment.app.FragmentActivity r2 = r9.requireActivity()
            X.0eM r1 = r9.A0A
            X.Dbc.A0S(r5, r2, r1)
        L_0x062f:
            r1 = 307898719(0x125a295f, float:6.8839665E-28)
            X.AnonymousClass0fD.A0A(r1, r8)
            r1 = 1626688281(0x60f54b19, float:1.4140199E20)
            goto L_0x0fe0
        L_0x063a:
            android.os.Bundle r7 = r9.requireArguments()
            java.lang.String r3 = r9.A05
            java.lang.String r12 = "phoneNumberOrEmail"
            if (r3 == 0) goto L_0x0ff0
            java.lang.String r10 = X.Dbq.A00()
            java.lang.String r1 = r7.getString(r10)
            boolean r4 = r3.equals(r1)
            java.lang.String r1 = "is_phone_confirmed"
            boolean r3 = r7.getBoolean(r1)
            java.lang.String r1 = "is_totp_two_factor_enabled"
            boolean r6 = r7.getBoolean(r1)
            X.FFR.A03()
            if (r3 == 0) goto L_0x0664
            r5 = 1
            if (r4 != 0) goto L_0x0665
        L_0x0664:
            r5 = 0
        L_0x0665:
            java.lang.String r4 = r9.A05
            if (r4 == 0) goto L_0x0ff0
            java.lang.Integer r3 = r9.A04
            if (r3 == 0) goto L_0x068a
            java.lang.String r1 = "has_phone_number_confirmed"
            r7.putBoolean(r1, r5)
            r7.putString(r10, r4)
            java.lang.String r1 = "has_two_fac_already_on"
            r7.putBoolean(r1, r6)
            java.lang.String r3 = X.C48977EnF.A00(r3)
            java.lang.String r1 = "two_fac_enable_method"
            r7.putString(r1, r3)
            X.E4K r5 = new X.E4K
            r5.<init>()
            goto L_0x0607
        L_0x068a:
            X.0qQ.A0F(r11)
            goto L_0x0ff3
        L_0x068f:
            r0 = 497744458(0x1daafa4a, float:4.525742E-21)
            int r0 = X.AnonymousClass0fD.A03(r0)
            r2 = -259486270(0xfffffffff0888dc2, float:-3.380907E29)
            int r6 = X.AnonymousClass0fD.A03(r2)
            java.lang.Object r7 = r1.A01
            X.E2r r7 = (X.C47445E2r) r7
            boolean r1 = r7.isResumed()
            if (r1 == 0) goto L_0x06cb
            X.F3Y r3 = X.FFR.A00()
            r2 = 1
            r5 = 0
            java.lang.Integer r1 = X.AnonymousClass05K.A0j
            X.E2h r4 = r3.A02(r1, r2, r5)
            android.content.Context r2 = r7.requireContext()
            r3 = 0
            r1 = 2131975679(0x7f135dff, float:1.9588457E38)
            X.C59689JTv.A01(r2, r3, r1, r5)
            androidx.fragment.app.FragmentActivity r2 = r7.requireActivity()
            X.0eM r1 = r7.A0A
            X.0lg r1 = X.DbT.A0X(r1)
            X.Dbb.A0o(r3, r4, r2, r1)
        L_0x06cb:
            r1 = -1820444210(0xffffffff937e39ce, float:-3.2087807E-27)
            X.AnonymousClass0fD.A0A(r1, r6)
            r1 = 503443946(0x1e01f1ea, float:6.87923E-21)
            goto L_0x0fe0
        L_0x06d6:
            r0 = 1751070460(0x685f36fc, float:4.216408E24)
            int r0 = X.AnonymousClass0fD.A03(r0)
            r2 = -541385562(0xffffffffdfbb1ca6, float:-2.6965668E19)
            int r4 = X.AnonymousClass0fD.A03(r2)
            java.lang.Object r3 = r1.A01
            X.E2r r3 = (X.C47445E2r) r3
            android.content.Context r2 = r3.requireContext()
            r1 = 2131975765(0x7f135e55, float:1.9588632E38)
            X.DbZ.A0w(r2, r3, r1)
            X.EwO r3 = r3.A00
            if (r3 == 0) goto L_0x0738
            long r1 = android.os.SystemClock.elapsedRealtime()
            r3.A01 = r1
            r1 = -793858474(0xffffffffd0aeae56, float:-2.34452869E10)
            X.AnonymousClass0fD.A0A(r1, r4)
            r1 = 1556008387(0x5cbecdc3, float:4.29651864E17)
            goto L_0x0fe0
        L_0x0707:
            r0 = -1153746367(0xffffffffbb3b3a41, float:-0.0028568658)
            int r0 = X.AnonymousClass0fD.A03(r0)
            r2 = 2125050028(0x7ea9b0ac, float:1.1277843E38)
            int r4 = X.AnonymousClass0fD.A03(r2)
            java.lang.Object r3 = r1.A01
            X.E2r r3 = (X.C47445E2r) r3
            android.content.Context r2 = r3.requireContext()
            r1 = 2131975765(0x7f135e55, float:1.9588632E38)
            X.DbZ.A0w(r2, r3, r1)
            X.EwO r3 = r3.A00
            if (r3 == 0) goto L_0x0738
            long r1 = android.os.SystemClock.elapsedRealtime()
            r3.A01 = r1
            r1 = -342838008(0xffffffffeb90b508, float:-3.4988043E26)
            X.AnonymousClass0fD.A0A(r1, r4)
            r1 = -398698312(0xffffffffe83c58b8, float:-3.557766E24)
            goto L_0x0fe0
        L_0x0738:
            java.lang.String r12 = "twoFacPhoneVerificationHelper"
            goto L_0x0ff0
        L_0x073c:
            r0 = 1117897385(0x42a1c2a9, float:80.880196)
            int r0 = X.AnonymousClass0fD.A03(r0)
            r2 = 2047843179(0x7a0f9b6b, float:1.8641268E35)
            int r5 = X.AnonymousClass0fD.A03(r2)
            java.lang.Object r1 = r1.A01
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            X.0hq r4 = r1.getParentFragmentManager()
            r3 = 487(0x1e7, float:6.82E-43)
            r2 = 38
            r1 = 21
            java.lang.String r2 = X.Dbq.A05(r3, r2, r1)
            r1 = 0
            r4.A0y(r2, r1)
            r1 = 741996880(0x2c39f950, float:2.6428477E-12)
            X.AnonymousClass0fD.A0A(r1, r5)
            r1 = -226366450(0xfffffffff281ec0e, float:-5.146744E30)
            goto L_0x0fe0
        L_0x076b:
            r0 = -1642439949(0xffffffff9e1a5af3, float:-8.1715E-21)
            int r0 = X.AnonymousClass0fD.A03(r0)
            r2 = 650486707(0x26c5a3b3, float:1.3713992E-15)
            int r5 = X.AnonymousClass0fD.A03(r2)
            java.lang.Object r4 = r1.A01
            X.ESP r4 = (X.ESP) r4
            android.os.Bundle r3 = r4.A00
            if (r3 != 0) goto L_0x0785
            java.lang.String r12 = "twoFacResponseBundle"
            goto L_0x0ff0
        L_0x0785:
            r2 = 0
            java.lang.String r1 = "is_totp_two_factor_enabled"
            r3.putBoolean(r1, r2)
            X.ESP.A06(r4)
            r1 = 11246457(0xab9b79, float:1.5759643E-38)
            X.AnonymousClass0fD.A0A(r1, r5)
            r1 = -1790861033(0xffffffff9541a117, float:-3.9103117E-26)
            goto L_0x0fe0
        L_0x0799:
            r0 = 1555162902(0x5cb1e716, float:4.0060122E17)
            int r0 = X.AnonymousClass0fD.A03(r0)
            X.Dvg r2 = (X.C47346Dvg) r2
            r3 = 1508303400(0x59e6e228, float:8.1234883E15)
            int r5 = X.AnonymousClass0fD.A03(r3)
            r11 = 0
            X.0qQ.A0B(r2, r11)
            boolean r3 = r2.A01
            if (r3 == 0) goto L_0x07d7
            X.F3Y r6 = X.FFR.A00()
            java.lang.Object r1 = r1.A01
            X.E3u r1 = (X.C47470E3u) r1
            android.os.Bundle r7 = r1.requireArguments()
            java.lang.String r10 = r1.A01
            if (r10 != 0) goto L_0x07c5
            java.lang.String r12 = "currPhoneNumber"
            goto L_0x0ff0
        L_0x07c5:
            java.lang.Integer r8 = X.AnonymousClass05K.A0C
            java.lang.Integer r9 = X.AnonymousClass05K.A0Y
            X.E2r r3 = r6.A01(r7, r8, r9, r10, r11)
            androidx.fragment.app.FragmentActivity r2 = r1.requireActivity()
            X.0eM r1 = r1.A03
            X.Dbc.A0S(r3, r2, r1)
            goto L_0x07f1
        L_0x07d7:
            java.lang.Object r1 = r1.A01
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            android.content.Context r4 = r1.requireContext()
            android.content.Context r3 = r1.requireContext()
            r1 = 2131961740(0x7f13278c, float:1.9560185E38)
            java.lang.String r3 = r3.getString(r1)
            java.lang.String r1 = r2.getErrorMessage()
            X.C49952FGh.A06(r4, r1, r3)
        L_0x07f1:
            r1 = 730370677(0x2b889275, float:9.704031E-13)
            X.AnonymousClass0fD.A0A(r1, r5)
            r1 = 1319316621(0x4ea32c8d, float:1.36880294E9)
            goto L_0x0fe0
        L_0x07fc:
            r0 = 1480071241(0x58381849, float:8.0965777E14)
            int r0 = X.AnonymousClass0fD.A03(r0)
            X.Dui r2 = (X.C47315Dui) r2
            r3 = -1701040489(0xffffffff9a9c2e97, float:-6.459536E-23)
            int r6 = X.AnonymousClass7TG.A0D(r2, r3)
            java.lang.Object r5 = r1.A01
            X.E3w r5 = (X.C47472E3w) r5
            androidx.fragment.app.FragmentActivity r3 = r5.requireActivity()
            X.0eM r1 = r5.A00
            X.6Yo r4 = X.DbX.A0N(r3, r1)
            X.FFR.A03()
            android.os.Bundle r3 = r5.requireArguments()
            X.DrH r1 = r2.A00
            if (r1 == 0) goto L_0x084a
            java.lang.String r2 = r1.A00
            if (r2 == 0) goto L_0x082e
            java.lang.String r1 = "arg_totp_seed"
            r3.putString(r1, r2)
        L_0x082e:
            X.E4L r1 = new X.E4L
            r1.<init>()
            r1.setArguments(r3)
            r4.A0D(r1)
            r1 = 1
            r4.A0G = r1
            r4.A04()
            r1 = -714917271(0xffffffffd5633a69, float:-1.56150006E13)
            X.AnonymousClass0fD.A0A(r1, r6)
            r1 = -935415785(0xffffffffc83eb017, float:-195264.36)
            goto L_0x0fe0
        L_0x084a:
            java.lang.String r12 = "response"
            goto L_0x0ff0
        L_0x084e:
            r0 = -112032847(0xfffffffff95283b1, float:-6.8315835E34)
            int r0 = X.AnonymousClass0fD.A03(r0)
            X.Dw4 r2 = (X.Dw4) r2
            r3 = -1583531607(0xffffffffa19d39a9, float:-1.0653996E-18)
            int r4 = X.AnonymousClass0fD.A03(r3)
            r11 = 0
            X.0qQ.A0B(r2, r11)
            java.lang.Object r5 = r1.A01
            X.E2M r5 = (X.E2M) r5
            boolean r1 = r5.isResumed()
            if (r1 == 0) goto L_0x08bb
            boolean r1 = r2.A02
            if (r1 == 0) goto L_0x0897
            X.F3Y r6 = X.FFR.A00()
            boolean r1 = r2.A03
            if (r1 == 0) goto L_0x0884
            android.os.Bundle r7 = r5.requireArguments()
            com.instagram.igds.components.form.IgFormField r1 = r5.A00
            if (r1 != 0) goto L_0x08a3
            java.lang.String r12 = "emailFormField"
            goto L_0x0ff0
        L_0x0884:
            r2 = 1
            java.lang.Integer r1 = X.AnonymousClass05K.A0j
            X.E2h r3 = r6.A02(r1, r2, r11)
            android.content.Context r2 = r5.requireContext()
            r8 = 0
            r1 = 2131975679(0x7f135dff, float:1.9588457E38)
            X.C59689JTv.A01(r2, r8, r1, r11)
            goto L_0x08ae
        L_0x0897:
            androidx.fragment.app.FragmentActivity r5 = r5.requireActivity()
            java.lang.String r3 = r2.A01
            java.lang.String r1 = r2.A00
            X.C49952FGh.A06(r5, r1, r3)
            goto L_0x08bb
        L_0x08a3:
            java.lang.String r10 = X.DbU.A0o(r1)
            r8 = 0
            java.lang.Integer r9 = X.AnonymousClass05K.A0N
            X.E2r r3 = r6.A01(r7, r8, r9, r10, r11)
        L_0x08ae:
            androidx.fragment.app.FragmentActivity r2 = r5.requireActivity()
            X.0eM r1 = r5.A05
            X.0lg r1 = X.DbT.A0X(r1)
            X.Dbb.A0o(r8, r3, r2, r1)
        L_0x08bb:
            r1 = 1435932842(0x559698aa, float:2.06978039E13)
            X.AnonymousClass0fD.A0A(r1, r4)
            r1 = 1969401804(0x7562afcc, float:2.8735954E32)
            goto L_0x0fe0
        L_0x08c6:
            r0 = 1151877911(0x44a84317, float:1346.0966)
            int r0 = X.AnonymousClass0fD.A03(r0)
            X.DwU r2 = (X.DwU) r2
            r3 = -731372734(0xffffffffd4682342, float:-3.98809576E12)
            int r5 = X.AnonymousClass7TG.A0D(r2, r3)
            java.lang.Object r4 = r1.A01
            X.E4T r4 = (X.E4T) r4
            android.content.Context r3 = r4.requireContext()
            r1 = 2131975616(0x7f135dc0, float:1.958833E38)
            X.C59689JTv.A07(r3, r1)
            android.widget.TextView r4 = r4.A02
            if (r4 != 0) goto L_0x08ec
            java.lang.String r12 = "backupCodesTextView"
            goto L_0x0ff0
        L_0x08ec:
            java.util.ArrayList r3 = r2.A04
            if (r3 == 0) goto L_0x0905
            java.lang.String r2 = "\n"
            r1 = 0
            java.lang.String r1 = X.DbT.A0z(r2, r3, r1)
        L_0x08f7:
            r4.setText(r1)
            r1 = -1352425136(0xffffffffaf63a150, float:-2.070284E-10)
            X.AnonymousClass0fD.A0A(r1, r5)
            r1 = 1906742259(0x71a693f3, float:1.6497079E30)
            goto L_0x0fe0
        L_0x0905:
            java.lang.String r1 = ""
            goto L_0x08f7
        L_0x0908:
            r0 = -38210569(0xfffffffffdb8f3f7, float:-3.0730586E37)
            int r0 = X.AnonymousClass0fD.A03(r0)
            r2 = 227331604(0xd8cce14, float:8.677778E-31)
            int r4 = X.AnonymousClass0fD.A03(r2)
            java.lang.Object r2 = r1.A01
            androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2
            X.8ab r3 = X.Dba.A0I(r2)
            r2 = 2131975673(0x7f135df9, float:1.9588445E38)
            r3.A09(r2)
            r2 = 2131975672(0x7f135df8, float:1.9588443E38)
            r3.A08(r2)
            r2 = 13
            X.FJf r1 = X.C50020FJf.A00(r1, r2)
            r3.A0E(r1)
            r1 = 0
            r3.A0s(r1)
            X.DbT.A1V(r3)
            r1 = -1204634639(0xffffffffb832bbf1, float:-4.261354E-5)
            X.AnonymousClass0fD.A0A(r1, r4)
            r1 = 118344034(0x70dc962, float:1.0666842E-34)
            goto L_0x0fe0
        L_0x0945:
            r0 = -1440199809(0xffffffffaa284b7f, float:-1.494759E-13)
            int r0 = X.AnonymousClass0fD.A03(r0)
            r3 = 138599303(0x842db87, float:5.8637805E-34)
            int r3 = X.AnonymousClass0fD.A03(r3)
            X.C47699EDi.super.onSuccess(r2)
            java.lang.Object r2 = r1.A01
            X.E5f r2 = (X.C47500E5f) r2
            r1 = 2131961579(0x7f1326eb, float:1.9559859E38)
            r2.A02(r1)
            r1 = -1368188409(0xffffffffae731a07, float:-5.527492E-11)
            X.AnonymousClass0fD.A0A(r1, r3)
            r1 = 1549701861(0x5c5e92e5, float:2.50595828E17)
            goto L_0x0fe0
        L_0x096b:
            r0 = -2135701490(0xffffffff80b3c80e, float:-1.651032E-38)
            int r0 = X.AnonymousClass0fD.A03(r0)
            X.Dv9 r2 = (X.Dv9) r2
            r3 = 1438069135(0x55b7318f, float:2.51779351E13)
            int r3 = X.AnonymousClass0fD.A03(r3)
            X.C47699EDi.super.onSuccess(r2)
            java.lang.Object r5 = r1.A01
            X.EMQ r5 = (X.EMQ) r5
            com.instagram.registration.model.RegFlowExtras r10 = r5.A00
            java.lang.String r1 = r2.A00
            r10.A0B = r1
            X.EXD r2 = X.EXD.SAC
            X.EXD r1 = r10.A01()
            if (r2 != r1) goto L_0x09fe
            boolean r1 = r10.A0t
            if (r1 == 0) goto L_0x09c6
            r1 = 0
            r10.A0u = r1
            androidx.fragment.app.FragmentActivity r2 = r5.requireActivity()
            X.0wW r1 = r5.A02
            X.6Yo r1 = X.DbS.A0M(r2, r1)
            com.instagram.registration.model.RegFlowExtras r4 = r5.A00
            android.os.Bundle r5 = X.AnonymousClass7TE.A0a()
            java.lang.String r2 = "RegFlowExtras.EXTRA_KEY"
            r5.putParcelable(r2, r4)
            X.E5j r4 = new X.E5j
            r4.<init>()
        L_0x09b1:
            r4.setArguments(r5)
            r2 = 0
            r1.A0B(r2, r4)
        L_0x09b8:
            r1.A04()
        L_0x09bb:
            r1 = -909884039(0xffffffffc9c44579, float:-1607855.1)
            X.AnonymousClass0fD.A0A(r1, r3)
            r1 = -1498277629(0xffffffffa6b21903, float:-1.2358011E-15)
            goto L_0x0fe0
        L_0x09c6:
            boolean r1 = r10.A0u
            if (r1 == 0) goto L_0x09e3
            r15 = 0
            r10.A0u = r15
            X.0wW r7 = r5.A02
            X.0aP r7 = (X.AnonymousClass0aP) r7
            java.lang.String r13 = r10.A0Z
            android.os.Handler r4 = X.AnonymousClass7TF.A0D()
            X.EEK r11 = r5.A03
            r8 = 0
            X.DiE r12 = X.C46634DiE.A1U
            r6 = r5
            r9 = r5
            r14 = r8
            X.C50144FRb.A02(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            goto L_0x09bb
        L_0x09e3:
            androidx.fragment.app.FragmentActivity r2 = r5.requireActivity()
            X.0wW r1 = r5.A02
            X.6Yo r1 = X.DbS.A0M(r2, r1)
            com.instagram.registration.model.RegFlowExtras r4 = r5.A00
            android.os.Bundle r5 = X.AnonymousClass7TE.A0a()
            java.lang.String r2 = "RegFlowExtras.EXTRA_KEY"
            r5.putParcelable(r2, r4)
            X.DuG r4 = new X.DuG
            r4.<init>()
            goto L_0x09b1
        L_0x09fe:
            X.DbT.A15()
            com.instagram.registration.model.RegFlowExtras r4 = r5.A00
            android.os.Bundle r2 = X.AnonymousClass7TE.A0a()
            java.lang.String r1 = "RegFlowExtras.EXTRA_KEY"
            r2.putParcelable(r1, r4)
            X.0wW r1 = r5.A02
            X.DbW.A0w(r2, r1)
            X.E3V r4 = new X.E3V
            r4.<init>()
            androidx.fragment.app.FragmentActivity r2 = X.DbU.A0I(r2, r4, r5)
            X.0wW r1 = r5.A02
            X.6Yo r1 = X.DbV.A0N(r4, r2, r1)
            goto L_0x09b8
        L_0x0a21:
            r0 = 1863791755(0x6f17348b, float:4.6795757E28)
            int r0 = X.AnonymousClass0fD.A03(r0)
            r3 = -1323762095(0xffffffffb118fe51, float:-2.2263473E-9)
            int r3 = X.AnonymousClass0fD.A03(r3)
            X.C47699EDi.super.onSuccess(r2)
            java.lang.Object r2 = r1.A01
            X.E5f r2 = (X.C47500E5f) r2
            r1 = 2131961579(0x7f1326eb, float:1.9559859E38)
            r2.A02(r1)
            r1 = -352128155(0xffffffffeb02f365, float:-1.5830975E26)
            X.AnonymousClass0fD.A0A(r1, r3)
            r1 = 1777575175(0x69f3a507, float:3.6818537E25)
            goto L_0x0fe0
        L_0x0a47:
            r0 = 663033615(0x2785170f, float:3.6939916E-15)
            int r0 = X.AnonymousClass0fD.A03(r0)
            X.DwX r2 = (X.DwX) r2
            r3 = -150374149(0xfffffffff70978fb, float:-2.7882752E33)
            int r5 = X.AnonymousClass0fD.A03(r3)
            java.lang.Object r3 = r1.A01
            X.E2u r3 = (X.C47448E2u) r3
            android.os.Handler r4 = r3.A0L
            X.Ft0 r3 = new X.Ft0
            r3.<init>(r1, r2)
            r4.post(r3)
            r1 = -664904552(0xffffffffd85e5c98, float:-9.7795707E14)
            X.AnonymousClass0fD.A0A(r1, r5)
            r1 = 956862300(0x39088f5c, float:1.3023376E-4)
            goto L_0x0fe0
        L_0x0a70:
            r0 = -2019167010(0xffffffff87a5f4de, float:-2.497036E-34)
            int r0 = X.AnonymousClass0fD.A03(r0)
            r2 = 1481888625(0x5853d371, float:9.3162035E14)
            int r6 = X.AnonymousClass0fD.A03(r2)
            java.lang.Object r5 = r1.A01
            X.E2u r5 = (X.C47448E2u) r5
            r1 = 2131975765(0x7f135e55, float:1.9588632E38)
            java.lang.String r4 = r5.getString(r1)
            androidx.fragment.app.FragmentActivity r3 = r5.getActivity()
            r2 = 0
            r1 = 0
            X.C59689JTv.A03(r3, r4, r1, r2)
            X.FBN r2 = r5.A08
            int r1 = r2.A00
            int r1 = r1 + -1
            r2.A00 = r1
            r1 = -1375588028(0xffffffffae023144, float:-2.9602334E-11)
            X.AnonymousClass0fD.A0A(r1, r6)
            r1 = -1925901226(0xffffffff8d351456, float:-5.579941E-31)
            goto L_0x0fe0
        L_0x0aa5:
            r0 = -1651523779(0xffffffff9d8fbf3d, float:-3.804952E-21)
            int r0 = X.AnonymousClass0fD.A03(r0)
            X.Dvd r2 = (X.C47343Dvd) r2
            r3 = 2141340017(0x7fa24171, float:NaN)
            int r6 = X.AnonymousClass0fD.A03(r3)
            java.lang.Object r7 = r1.A01
            X.E5C r7 = (X.E5C) r7
            java.lang.String r3 = X.E5C.__redex_internal_original_name
            X.FBX r3 = r7.A06
            X.02m r5 = r3.A00
            r4 = 857809457(0x33212231, float:3.751683E-8)
            r3 = 2
            r5.markerEnd(r4, r3)
            java.lang.Integer r4 = r2.A01
            java.lang.Integer r3 = X.AnonymousClass05K.A01
            if (r4 != r3) goto L_0x0ae1
            android.os.Handler r3 = r7.A0H
            X.FqZ r2 = new X.FqZ
            r2.<init>(r1)
            r3.post(r2)
        L_0x0ad6:
            r1 = 1573715132(0x5dccfcbc, float:1.84636095E18)
            X.AnonymousClass0fD.A0A(r1, r6)
            r1 = -238999965(0xfffffffff1c12663, float:-1.9128644E30)
            goto L_0x0fe0
        L_0x0ae1:
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            if (r4 != r1) goto L_0x0ad6
            X.FBN r2 = r2.A00
            r1 = 1
            X.E5C.A01(r2, r7, r1)
            goto L_0x0ad6
        L_0x0aec:
            r0 = -943557519(0xffffffffc7c27471, float:-99560.88)
            int r0 = X.AnonymousClass0fD.A03(r0)
            X.DwW r2 = (X.DwW) r2
            r3 = 717169427(0x2abf2313, float:3.3952753E-13)
            int r4 = X.AnonymousClass0fD.A03(r3)
            java.lang.Object r3 = r1.A01
            X.E5C r3 = (X.E5C) r3
            java.lang.String r1 = X.E5C.__redex_internal_original_name
            com.instagram.ui.widget.editphonenumber.EditPhoneNumberView r1 = r3.A07
            java.lang.String r1 = r1.getPhoneNumber()
            r3.A0A = r1
            X.FBN r2 = r2.A00
            r1 = 0
            X.E5C.A01(r2, r3, r1)
            r1 = 106506024(0x6592728, float:4.084193E-35)
            X.AnonymousClass0fD.A0A(r1, r4)
            r1 = -1965339293(0xffffffff8adb4d63, float:-2.1118043E-32)
            goto L_0x0fe0
        L_0x0b1b:
            r0 = -55921855(0xfffffffffcaab341, float:-7.0906093E36)
            int r0 = X.AnonymousClass0fD.A03(r0)
            X.Dvn r2 = (X.C47353Dvn) r2
            r3 = 1300046440(0x4d7d2268, float:2.65430656E8)
            int r4 = X.AnonymousClass0fD.A03(r3)
            java.lang.Object r3 = r1.A01
            X.E4d r3 = (X.C47478E4d) r3
            java.lang.String r1 = r2.A01
            if (r1 == 0) goto L_0x0b4b
            r3.A09 = r1
            com.instagram.common.typedurl.ImageUrl r1 = r2.A00
            if (r1 == 0) goto L_0x0fee
            r3.A06 = r1
            android.view.View r1 = r3.mView
            X.C47478E4d.A00(r1, r3)
            r1 = -1172088459(0xffffffffba235975, float:-6.2312867E-4)
            X.AnonymousClass0fD.A0A(r1, r4)
            r1 = -1968979586(0xffffffff8aa3c17e, float:-1.5769113E-32)
            goto L_0x0fe0
        L_0x0b4b:
            java.lang.String r12 = X.DcV.A01()
            goto L_0x0ff0
        L_0x0b51:
            r0 = 1823884666(0x6cb6457a, float:1.7628207E27)
            int r0 = X.AnonymousClass0fD.A03(r0)
            r2 = -1539566916(0xffffffffa43c12bc, float:-4.078187E-17)
            int r6 = X.AnonymousClass0fD.A03(r2)
            X.FFx r5 = X.C49944FFx.A00
            java.lang.Object r1 = r1.A01
            X.FJf r1 = (X.C50020FJf) r1
            java.lang.Object r4 = r1.A01
            X.ESO r4 = (X.ESO) r4
            com.instagram.common.session.UserSession r3 = r4.A00
            java.lang.String r2 = "manage_saved_login"
            java.lang.String r1 = "client_del_setting_opt_out_confirmed"
            r5.A02(r3, r2, r1)
            X.ESO.A06(r4)
            r1 = 1359984783(0x510fb88f, float:3.8579794E10)
            X.AnonymousClass0fD.A0A(r1, r6)
            r1 = -640989332(0xffffffffd9cb476c, float:-7.1522437E15)
            goto L_0x0fe0
        L_0x0b80:
            r0 = 130268905(0x7c3bee9, float:2.9452546E-34)
            int r0 = X.AnonymousClass0fD.A03(r0)
            X.Dvc r2 = (X.C47342Dvc) r2
            r3 = -968237200(0xffffffffc649df70, float:-12919.859)
            int r4 = X.AnonymousClass0fD.A03(r3)
            X.C47699EDi.super.onSuccess(r2)
            java.lang.Object r3 = r1.A01
            X.ESO r3 = (X.ESO) r3
            java.lang.String r1 = r2.A00
            r3.A01 = r1
            boolean r1 = r2.A01
            r3.A02 = r1
            X.ESO.A07(r3)
            r1 = 921234049(0x36e8ea81, float:6.9414386E-6)
            X.AnonymousClass0fD.A0A(r1, r4)
            r1 = 913312616(0x36700b68, float:3.5769426E-6)
            goto L_0x0fe0
        L_0x0bad:
            r0 = 1857112462(0x6eb1498e, float:2.7433884E28)
            int r0 = X.AnonymousClass0fD.A03(r0)
            r3 = -1294299568(0xffffffffb2da8e50, float:-2.5443256E-8)
            int r4 = X.AnonymousClass0fD.A03(r3)
            X.C47699EDi.super.onSuccess(r2)
            r2 = 0
            java.lang.Object r7 = r1.A01
            X.E3Q r7 = (X.E3Q) r7
            r7.A08 = r2
            X.E3Q.A00(r7)
            com.instagram.common.session.UserSession r1 = r7.A02
            X.9BF r1 = X.AnonymousClass9BE.A00(r1)
            r1.A01()
            com.instagram.common.session.UserSession r1 = r7.A02
            X.9BG r2 = X.AnonymousClass9BG.A01(r1)
            com.instagram.common.session.UserSession r1 = r7.A02
            com.instagram.accountlinking.model.AccountFamily r1 = X.Dba.A09(r2, r1)
            if (r1 == 0) goto L_0x0bea
            com.instagram.user.model.User r1 = r1.A01
            if (r1 == 0) goto L_0x0bea
            com.instagram.api.schemas.HasPasswordState r2 = com.instagram.api.schemas.HasPasswordState.TRUE
            X.4Cl r1 = r1.A03
            r1.EYc(r2)
        L_0x0bea:
            android.widget.CheckBox r1 = r7.A00
            boolean r1 = r1.isChecked()
            if (r1 == 0) goto L_0x0c06
            com.instagram.common.session.UserSession r1 = r7.A02
            X.6qt r5 = X.C319606qt.A01(r1)
            com.instagram.common.session.UserSession r8 = r7.A02
            java.lang.String r10 = r8.A06
            r11 = 1
            java.lang.Integer r9 = X.AnonymousClass05K.A04
            android.content.Context r6 = r7.getContext()
            r5.A09(r6, r7, r8, r9, r10, r11)
        L_0x0c06:
            android.content.Context r2 = r7.getContext()
            r1 = 2131969197(0x7f1344ad, float:1.957531E38)
            r3 = 1
            X.C59689JTv.A08(r2, r1, r3)
            androidx.fragment.app.Fragment r1 = r7.getTargetFragment()
            if (r1 == 0) goto L_0x0c34
            android.content.Context r2 = r7.getContext()
            java.lang.Class<X.E3Q> r1 = X.E3Q.class
            android.content.Intent r5 = new android.content.Intent
            r5.<init>(r2, r1)
            java.lang.String r1 = "password_updated_key"
            r5.putExtra(r1, r3)
            androidx.fragment.app.Fragment r3 = r7.getTargetFragment()
            X.07M.A02(r7)
            int r2 = r7.mTargetRequestCode
            r1 = 7
            r3.onActivityResult(r2, r1, r5)
        L_0x0c34:
            X.DbT.A1I(r7)
            r1 = -20823929(0xfffffffffec24087, float:-1.2910264E38)
            X.AnonymousClass0fD.A0A(r1, r4)
            r1 = 1105418897(0x41e35a91, float:28.419222)
            goto L_0x0fe0
        L_0x0c42:
            r0 = -1096617604(0xffffffffbea2f17c, float:-0.31824863)
            int r0 = X.AnonymousClass0fD.A03(r0)
            r2 = 1828768459(0x6d00cacb, float:2.4912027E27)
            int r3 = X.AnonymousClass0fD.A03(r2)
            java.lang.Object r6 = r1.A01
            X.E75 r6 = (X.E75) r6
            X.FBX r2 = r6.A04
            X.02m r5 = r2.A00
            r4 = 857809457(0x33212231, float:3.751683E-8)
            r2 = 2
            r5.markerEnd(r4, r2)
            androidx.fragment.app.FragmentActivity r2 = r6.getActivity()
            if (r2 == 0) goto L_0x0c93
            com.instagram.common.session.UserSession r2 = r6.getSession()
            X.0eE r4 = X.AnonymousClass0t1.A01
            java.lang.String r11 = X.DbU.A0n(r2, r4)
            com.instagram.igds.components.form.IgFormField r2 = r6.A02
            java.lang.CharSequence r2 = r2.getText()
            java.lang.String r12 = r2.toString()
            com.instagram.common.session.UserSession r2 = r6.getSession()
            com.instagram.user.model.User r2 = r4.A01(r2)
            com.instagram.common.typedurl.ImageUrl r8 = r2.Bh3()
            r13 = 0
            r10 = 0
            com.instagram.common.session.UserSession r7 = r6.getSession()
            X.Fds r9 = new X.Fds
            r9.<init>(r1)
            X.C46632DiC.A02(r6, r7, r8, r9, r10, r11, r12, r13)
        L_0x0c93:
            r1 = -1510815264(0xffffffffa5f2c9e0, float:-4.2117104E-16)
            X.AnonymousClass0fD.A0A(r1, r3)
            r1 = -2009523622(0xffffffff88391a5a, float:-5.570239E-34)
            goto L_0x0fe0
        L_0x0c9e:
            r0 = 343452939(0x1478ad0b, float:1.2554927E-26)
            int r0 = X.AnonymousClass0fD.A03(r0)
            X.DwU r2 = (X.DwU) r2
            r3 = -1636160018(0xffffffff9e7a2dee, float:-1.3244388E-20)
            int r5 = X.AnonymousClass0fD.A03(r3)
            java.lang.Object r4 = r1.A01
            X.ESR r4 = (X.ESR) r4
            android.os.Bundle r3 = r4.mArguments
            java.util.ArrayList r2 = r2.A04
            java.lang.String r1 = "backup_codes_key"
            r3.putStringArrayList(r1, r2)
            java.util.ArrayList r1 = X.ESR.A06(r4)
            r4.setItems(r1)
            r1 = -1087228395(0xffffffffbf323615, float:-0.6961377)
            X.AnonymousClass0fD.A0A(r1, r5)
            r1 = -181203943(0xfffffffff5330c19, float:-2.2696936E32)
            goto L_0x0fe0
        L_0x0ccd:
            r0 = 725453171(0x2b3d8973, float:6.733704E-13)
            int r0 = X.AnonymousClass0fD.A03(r0)
            r2 = 429002975(0x199210df, float:1.510286E-23)
            int r4 = X.AnonymousClass0fD.A03(r2)
            java.lang.Object r2 = r1.A01
            X.ESN r2 = (X.ESN) r2
            r1 = 0
            X.ESN.A06(r1, r2)
            X.0xm r1 = X.DbS.A0e()
            r3 = 0
            X.0xY r2 = X.DbS.A0d(r1)
            r1 = 622(0x26e, float:8.72E-43)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            r2.E5T(r1, r3)
            r2.apply()
            r1 = 1978726590(0x75f0f8be, float:6.109357E32)
            X.AnonymousClass0fD.A0A(r1, r4)
            r1 = 1030501847(0x3d6c35d7, float:0.057668533)
            goto L_0x0fe0
        L_0x0d03:
            r0 = 1680814917(0x642f3345, float:1.2927498E22)
            int r0 = X.AnonymousClass0fD.A03(r0)
            X.DwW r2 = (X.DwW) r2
            r3 = -1112085376(0xffffffffbdb6ec80, float:-0.089318275)
            int r5 = X.AnonymousClass0fD.A03(r3)
            java.lang.Object r3 = r1.A01
            X.ESN r3 = (X.ESN) r3
            android.os.Handler r4 = r3.A08
            X.Fsy r3 = new X.Fsy
            r3.<init>(r1, r2)
            r4.post(r3)
            r1 = -2032315613(0xffffffff86dd5323, float:-8.325312E-35)
            X.AnonymousClass0fD.A0A(r1, r5)
            r1 = 1661609780(0x630a2734, float:2.5484756E21)
            goto L_0x0fe0
        L_0x0d2c:
            r0 = 365308511(0x15c62a5f, float:8.003841E-26)
            int r0 = X.AnonymousClass0fD.A03(r0)
            X.3JC r2 = (X.AnonymousClass3JC) r2
            r3 = -1732902301(0xffffffff98b60263, float:-4.7048307E-24)
            int r6 = X.AnonymousClass0fD.A03(r3)
            java.lang.Object r5 = r2.A01
            if (r5 == 0) goto L_0x0d55
            X.3FZ r5 = (X.AnonymousClass3FZ) r5
            X.EXH r4 = X.EXH.A03
            java.lang.String r3 = "fx_account_linking_native_token_verification"
            java.lang.Enum r2 = r5.A04(r3, r4)
            if (r2 == 0) goto L_0x0d55
            java.lang.Enum r3 = r5.A04(r3, r4)
            X.EXH r2 = X.EXH.A02
            r4 = 1
            if (r3 == r2) goto L_0x0d56
        L_0x0d55:
            r4 = 0
        L_0x0d56:
            java.lang.Object r1 = r1.A01
            X.FYV r1 = (X.FYV) r1
            java.util.Map r3 = r1.A01
            java.lang.String r2 = "FACEBOOK"
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r4)
            r3.put(r2, r1)
            r1 = 657448330(0x272fdd8a, float:2.4406225E-15)
            X.AnonymousClass0fD.A0A(r1, r6)
            r1 = 200839768(0xbf89258, float:9.574632E-32)
            goto L_0x0fe0
        L_0x0d70:
            r0 = 1197950681(0x476746d9, float:59206.848)
            int r0 = X.AnonymousClass0fD.A03(r0)
            X.CEn r2 = (X.C43821CEn) r2
            r3 = 1255693537(0x4ad85ce1, float:7089776.5)
            int r26 = X.AnonymousClass0fD.A03(r3)
            r5 = 0
            X.0qQ.A0B(r2, r5)
            java.lang.Object r4 = r1.A01
            X.E6j r4 = (X.C47523E6j) r4
            r1 = 16912446(0x102103e, float:2.3888882E-38)
            X.Dbc.A10(r4, r1)
            X.6rm r3 = r4.A02
            java.lang.String r12 = "latencyPerfLogger"
            if (r3 == 0) goto L_0x0ff0
            java.lang.String r1 = "fetch_request_end"
            r3.A0E(r1)
            X.6rm r1 = r4.A02
            if (r1 == 0) goto L_0x0ff0
            X.C46329Dbx.A00(r1)
            X.DrL r2 = r2.FH3()
            X.0eM r1 = r4.A0S
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r1)
            X.1E4.A00(r1)
            boolean r1 = r4.A0B
            java.lang.String r12 = "explorePeopleAdapter"
            if (r1 == 0) goto L_0x0f1e
            java.util.List r2 = r2.A00
            if (r2 == 0) goto L_0x0fcf
            java.lang.String r1 = r4.A08
            if (r1 != 0) goto L_0x0de4
            X.E9K r7 = r4.A01
            if (r7 == 0) goto L_0x0ff0
            r6 = 1
            java.lang.Object r1 = X.00k.A0O(r2, r5)
            X.Dse r1 = (X.C47192Dse) r1
            if (r1 == 0) goto L_0x0dd4
            X.Dre r1 = r1.A00
            if (r1 == 0) goto L_0x0dd4
            java.lang.Boolean r1 = r1.A00
            boolean r1 = X.AnonymousClass7TF.A1Y(r1, r6)
            if (r1 != 0) goto L_0x0e30
        L_0x0dd4:
            java.lang.Integer r3 = r4.A05
            java.lang.Integer r1 = X.AnonymousClass05K.A0j
            if (r3 == r1) goto L_0x0e30
            java.lang.Integer r1 = X.AnonymousClass05K.A0N
            if (r3 == r1) goto L_0x0e30
            java.lang.Integer r1 = X.AnonymousClass05K.A0C
            if (r3 == r1) goto L_0x0e30
        L_0x0de2:
            r7.A08 = r6
        L_0x0de4:
            X.E9K r3 = r4.A01
            if (r3 == 0) goto L_0x0ff0
            r25 = 4
            r6 = 6
            java.util.Set r1 = r3.A0J
            r29 = r1
            r29.clear()
            java.util.ArrayList r1 = r3.A0G
            r28 = r1
            r28.clear()
            java.util.ArrayList r1 = r3.A0H
            r27 = r1
            r27.clear()
            r3.A01 = r6
            java.util.Iterator r7 = r2.iterator()
            r6 = 0
        L_0x0e07:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L_0x0e32
            java.lang.Object r1 = r7.next()
            X.Dse r1 = (X.C47192Dse) r1
            X.Dre r1 = r1.A00
            if (r1 == 0) goto L_0x0e07
            java.util.List r1 = r1.A01
            if (r1 == 0) goto L_0x0e07
            java.lang.Object r1 = X.00k.A0O(r1, r5)
            X.N5K r1 = (X.N5K) r1
            if (r1 == 0) goto L_0x0e07
            java.util.List r1 = r1.A00
            if (r1 == 0) goto L_0x0e07
            boolean r1 = X.AnonymousClass7TE.A1b(r1)
            if (r1 == 0) goto L_0x0e07
            int r6 = r6 + 1
            goto L_0x0e07
        L_0x0e30:
            r6 = 0
            goto L_0x0de2
        L_0x0e32:
            int r24 = r6 + -1
            java.util.Iterator r23 = r2.iterator()
            r6 = 0
        L_0x0e39:
            boolean r1 = r23.hasNext()
            if (r1 == 0) goto L_0x0fcc
            java.lang.Object r8 = r23.next()
            X.Dse r8 = (X.C47192Dse) r8
            X.Dre r1 = r8.A00
            r22 = 0
            if (r1 == 0) goto L_0x0e39
            java.util.List r1 = r1.A01
            if (r1 == 0) goto L_0x0e39
            java.lang.Object r1 = X.00k.A0O(r1, r5)
            X.N5K r1 = (X.N5K) r1
            if (r1 == 0) goto L_0x0e39
            java.util.List r9 = r1.A00
            if (r9 == 0) goto L_0x0e39
            boolean r1 = r9.isEmpty()
            if (r1 != 0) goto L_0x0e39
            X.3UH r7 = new X.3UH
            r1 = r22
            r7.<init>(r1)
            java.util.ArrayList r21 = X.AnonymousClass7TE.A1C()
            java.util.ArrayList r20 = X.AnonymousClass7TE.A1C()
            java.lang.String r2 = r8.A01
            java.lang.String r1 = "From your contacts"
            boolean r19 = X.0qQ.A0K(r2, r1)
            java.util.Iterator r18 = r9.iterator()
            r10 = 0
        L_0x0e7d:
            boolean r1 = r18.hasNext()
            if (r1 == 0) goto L_0x0f02
            java.lang.Object r14 = r18.next()
            X.Dt4 r14 = (X.C47217Dt4) r14
            com.instagram.user.model.User r9 = r14.A00
            if (r9 == 0) goto L_0x0e7d
            X.3UL r11 = new X.3UL
            r1 = r22
            r11.<init>(r1)
            X.DbY.A1O(r9)
            r11.A03 = r9
            java.lang.String r1 = r14.A03
            r11.A07 = r1
            java.lang.String r1 = r14.A02
            if (r1 == 0) goto L_0x0ea3
            r11.A04 = r1
        L_0x0ea3:
            java.lang.Boolean r1 = r14.A01
            if (r1 == 0) goto L_0x0ec8
            boolean r15 = r1.booleanValue()
            com.instagram.common.session.UserSession r13 = r3.A02
            r1 = 1
            X.0qQ.A0B(r13, r1)
            r11.A0C = r15
            X.0Tu r1 = X.0Tu.A05
            r16 = 36327434685004218(0x810f9c000039ba, double:3.036954201410432E-306)
            r12 = r1
            r1 = r16
            boolean r1 = X.182.A06(r12, r13, r1)
            if (r1 == 0) goto L_0x0ec8
            com.instagram.user.model.User r1 = r11.A03
            r1.A13(r15)
        L_0x0ec8:
            java.lang.String r1 = r14.A04
            if (r1 == 0) goto L_0x0ece
            r11.A05 = r1
        L_0x0ece:
            java.util.List r1 = r14.A06
            if (r1 == 0) goto L_0x0ed4
            r11.A0A = r1
        L_0x0ed4:
            r1 = r25
            if (r10 < r1) goto L_0x0ef1
            r1 = r24
            if (r6 == r1) goto L_0x0ef1
            r1 = r20
            r1.add(r11)
        L_0x0ee1:
            java.util.HashMap r11 = r3.A05
            if (r11 == 0) goto L_0x0e7d
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r19)
            java.lang.String r1 = r9.getId()
            r11.put(r1, r2)
            goto L_0x0e7d
        L_0x0ef1:
            r1 = r21
            r1.add(r11)
            java.lang.String r2 = r9.getId()
            r1 = r29
            r1.add(r2)
            int r10 = r10 + 1
            goto L_0x0ee1
        L_0x0f02:
            r1 = r21
            r7.A0M = r1
            java.lang.String r1 = r8.A02
            if (r1 != 0) goto L_0x0f0c
            java.lang.String r1 = ""
        L_0x0f0c:
            r7.A0K = r1
            r1 = r28
            r1.add(r7)
            int r6 = r6 + 1
            r2 = r27
            r1 = r20
            r2.add(r1)
            goto L_0x0e39
        L_0x0f1e:
            java.util.List r1 = r2.A00
            if (r1 == 0) goto L_0x0fcf
            java.lang.Object r2 = X.00k.A0O(r1, r5)
            X.Dse r2 = (X.C47192Dse) r2
            if (r2 == 0) goto L_0x0fcf
            X.E9K r3 = r4.A01
            if (r3 == 0) goto L_0x0ff0
            r3.A08 = r5
            java.util.Set r1 = r3.A0J
            r17 = r1
            r17.clear()
            java.util.ArrayList r9 = r3.A0G
            r9.clear()
            X.Dre r1 = r2.A00
            r10 = 0
            if (r1 == 0) goto L_0x0fcc
            java.util.List r1 = r1.A01
            if (r1 == 0) goto L_0x0fcc
            java.lang.Object r1 = X.00k.A0O(r1, r5)
            X.N5K r1 = (X.N5K) r1
            if (r1 == 0) goto L_0x0fcc
            java.util.List r2 = r1.A00
            r8 = 1
            if (r2 == 0) goto L_0x0fcc
            boolean r1 = r2.isEmpty()
            if (r1 != 0) goto L_0x0fcc
            X.3UH r7 = new X.3UH
            r7.<init>(r10)
            java.util.ArrayList r6 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r16 = r2.iterator()
        L_0x0f65:
            boolean r1 = r16.hasNext()
            if (r1 == 0) goto L_0x0fc3
            java.lang.Object r13 = r16.next()
            X.Dt4 r13 = (X.C47217Dt4) r13
            com.instagram.user.model.User r12 = r13.A00
            if (r12 == 0) goto L_0x0f65
            X.3UL r11 = new X.3UL
            r11.<init>(r10)
            X.DbY.A1O(r12)
            r11.A03 = r12
            java.lang.String r1 = r13.A03
            r11.A07 = r1
            java.lang.String r1 = r13.A02
            if (r1 == 0) goto L_0x0f89
            r11.A04 = r1
        L_0x0f89:
            X.4Cl r1 = r12.A03
            java.lang.Integer r2 = r1.B6v()
            if (r2 == 0) goto L_0x0fb6
            android.content.Context r15 = r3.A0B
            android.content.res.Resources r1 = r15.getResources()
            java.lang.String r14 = X.C14066TpE.A01(r1, r2, r8)
            X.0qQ.A07(r14)
            java.lang.String r2 = " "
            r1 = 2131962607(0x7f132aef, float:1.9561944E38)
            java.lang.String r1 = r15.getString(r1)
            java.lang.String r1 = X.002.A0g(r14, r2, r1)
            X.0qQ.A07(r1)
            r11.A05 = r1
            java.util.List r1 = r13.A06
            if (r1 == 0) goto L_0x0fb6
            r11.A0A = r1
        L_0x0fb6:
            r6.add(r11)
            java.lang.String r2 = r12.getId()
            r1 = r17
            r1.add(r2)
            goto L_0x0f65
        L_0x0fc3:
            r7.A0M = r6
            java.lang.String r1 = ""
            r7.A0K = r1
            r9.add(r7)
        L_0x0fcc:
            X.E9K.A00(r3)
        L_0x0fcf:
            boolean r1 = r4.A09
            if (r1 == 0) goto L_0x0fe4
            r4.A09 = r5
        L_0x0fd5:
            r2 = -1095566262(0xffffffffbeb2fc4a, float:-0.34958106)
            r1 = r26
            X.AnonymousClass0fD.A0A(r2, r1)
            r1 = 1299329877(0x4d723355, float:2.53965648E8)
        L_0x0fe0:
            X.AnonymousClass0fD.A0A(r1, r0)
            return
        L_0x0fe4:
            boolean r1 = r4.A0D
            if (r1 == 0) goto L_0x0fd5
            r4.EKl()
            r4.A0D = r5
            goto L_0x0fd5
        L_0x0fee:
            java.lang.String r12 = "profilePicUrl"
        L_0x0ff0:
            X.0qQ.A0F(r12)
        L_0x0ff3:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47699EDi.onSuccess(java.lang.Object):void");
    }
}
