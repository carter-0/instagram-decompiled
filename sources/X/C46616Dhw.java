package X;

import java.io.IOException;

/* renamed from: X.Dhw  reason: case insensitive filesystem */
public abstract class C46616Dhw {
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00b8, code lost:
        if (r0 != null) goto L_0x006b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0143, code lost:
        if (r6.A0T(false) == false) goto L_0x0151;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0096 A[LOOP:0: B:38:0x0094->B:39:0x0096, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x013d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C46615Dhv A00(X.C20880X2h r18, X.C307786Rm r19, X.C307896Rx r20, X.C276544tV r21) {
        /*
            r15 = 0
            r4 = r21
            if (r21 != 0) goto L_0x0006
            return r15
        L_0x0006:
            int r3 = r4.A04
            r2 = 13690(0x357a, float:1.9184E-41)
            boolean r0 = X.AnonymousClass7TF.A1S(r3, r2)
            java.lang.String r13 = ""
            if (r0 == 0) goto L_0x0128
            java.lang.String r0 = r4.A0I()
            if (r0 == 0) goto L_0x0019
            r13 = r0
        L_0x0019:
            boolean r0 = X.AnonymousClass7TF.A1S(r3, r2)
            r5 = 0
            if (r0 == 0) goto L_0x0115
            r0 = 38
        L_0x0022:
            boolean r17 = r4.A0R(r0, r5)
        L_0x0026:
            X.4tV r6 = X.C46617Dhx.A00(r4)
            if (r6 == 0) goto L_0x00fc
            r0 = 36
            boolean r16 = r6.A0R(r0, r5)
            r0 = 51
            X.4uI r1 = r6.A0A(r0)
        L_0x0038:
            r8 = r18
            if (r18 != 0) goto L_0x00f9
            if (r6 == 0) goto L_0x00d2
            if (r1 == 0) goto L_0x00d2
            r7 = r19
            if (r19 == 0) goto L_0x00ca
            X.6Tm r0 = X.AnonymousClass6Tm.A01
            java.lang.Object r9 = X.C307886Rw.A03(r7, r6, r0, r1)
            r9.getClass()
            X.68u r9 = (X.C3034368u) r9
        L_0x004f:
            r0 = 44
            if (r6 == 0) goto L_0x00c8
            X.4tV r11 = r6.A07(r0)
        L_0x0057:
            if (r6 == 0) goto L_0x00af
            r0 = 42
            X.4uI r12 = r6.A0A(r0)
            r0 = 41
            X.4tV r0 = r6.A07(r0)
            if (r0 == 0) goto L_0x00b0
            java.util.ArrayList r0 = X.DbV.A14(r0)
        L_0x006b:
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L_0x00c6
            java.lang.Object r0 = r0.get(r5)
            X.4tV r0 = (X.C276544tV) r0
            X.4tV r10 = A02(r0)
        L_0x007b:
            if (r6 == 0) goto L_0x00a6
            r0 = 43
            java.util.List r0 = r6.A0M(r0)
        L_0x0083:
            if (r0 == 0) goto L_0x013b
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L_0x013b
            java.util.ArrayList r15 = X.AnonymousClass7TE.A1C()
            int r3 = r0.size()
            r2 = 0
        L_0x0094:
            if (r2 >= r3) goto L_0x013b
            java.lang.Object r1 = r0.get(r2)
            X.4tV r1 = (X.C276544tV) r1
            X.4tV r1 = A02(r1)
            r15.add(r1)
            int r2 = r2 + 1
            goto L_0x0094
        L_0x00a6:
            if (r3 != r2) goto L_0x0146
            r0 = 42
            java.util.List r0 = r4.A0M(r0)
            goto L_0x0083
        L_0x00af:
            r12 = r15
        L_0x00b0:
            if (r3 != r2) goto L_0x00bb
            r0 = 40
            java.util.List r0 = r4.A0M(r0)
            if (r0 == 0) goto L_0x00c6
            goto L_0x006b
        L_0x00bb:
            r0 = 13785(0x35d9, float:1.9317E-41)
            if (r3 == r0) goto L_0x00c6
            java.lang.String r1 = "BloksScreenNavbarUtils"
            java.lang.String r0 = "Navbar should be an instance of BloksScreenNavbar or BloksScreenNavbarV2"
            X.1Kn.A02(r1, r0)
        L_0x00c6:
            r10 = r15
            goto L_0x007b
        L_0x00c8:
            r11 = 0
            goto L_0x0057
        L_0x00ca:
            java.lang.String r1 = "IgNavbarModelUtils"
            java.lang.String r0 = "Cannot evaluate custom_title_parseresult with a null BloksContext"
            X.1Kn.A02(r1, r0)
            goto L_0x00f9
        L_0x00d2:
            if (r3 != r2) goto L_0x00ee
            r0 = 35
            java.lang.Object r0 = X.C276544tV.A00(r4, r0)
            X.4tV r0 = (X.C276544tV) r0
            if (r0 == 0) goto L_0x00f9
            r1 = r20
            if (r20 == 0) goto L_0x00e8
            X.68u r9 = X.C3034368u.A00(r1, r0)
            goto L_0x004f
        L_0x00e8:
            X.68u r9 = X.C3034368u.A04(r0)
            goto L_0x004f
        L_0x00ee:
            r0 = 13785(0x35d9, float:1.9317E-41)
            if (r3 == r0) goto L_0x00f9
            java.lang.String r1 = "BloksScreenNavbarUtils"
            java.lang.String r0 = "Navbar should be an instance of BloksScreenNavbar or BloksScreenNavbarV2"
            X.1Kn.A02(r1, r0)
        L_0x00f9:
            r9 = r15
            goto L_0x004f
        L_0x00fc:
            if (r3 != r2) goto L_0x0107
            r0 = 36
            boolean r16 = r4.A0R(r0, r5)
        L_0x0104:
            r1 = r15
            goto L_0x0038
        L_0x0107:
            r0 = 13785(0x35d9, float:1.9317E-41)
            if (r3 == r0) goto L_0x0112
            java.lang.String r1 = "BloksScreenNavbarUtils"
            java.lang.String r0 = "Navbar should be an instance of BloksScreenNavbar or BloksScreenNavbarV2"
            X.1Kn.A02(r1, r0)
        L_0x0112:
            r16 = 0
            goto L_0x0104
        L_0x0115:
            r0 = 13785(0x35d9, float:1.9317E-41)
            if (r3 != r0) goto L_0x011d
            r0 = 35
            goto L_0x0022
        L_0x011d:
            java.lang.String r1 = "BloksScreenNavbarUtils"
            java.lang.String r0 = "Navbar should be an instance of BloksScreenNavbar or BloksScreenNavbarV2"
            X.1Kn.A02(r1, r0)
            r17 = 0
            goto L_0x0026
        L_0x0128:
            r0 = 13785(0x35d9, float:1.9317E-41)
            if (r3 != r0) goto L_0x0132
            java.lang.String r13 = r4.A0F()
            goto L_0x0019
        L_0x0132:
            java.lang.String r1 = "BloksScreenNavbarUtils"
            java.lang.String r0 = "Navbar should be an instance of BloksScreenNavbar or BloksScreenNavbarV2"
            X.1Kn.A02(r1, r0)
            goto L_0x0019
        L_0x013b:
            if (r6 == 0) goto L_0x0151
            boolean r0 = r6.A0T(r5)
            r18 = 1
            if (r0 != 0) goto L_0x0153
            goto L_0x0151
        L_0x0146:
            r0 = 13785(0x35d9, float:1.9317E-41)
            if (r3 == r0) goto L_0x0151
            java.lang.String r1 = "BloksScreenNavbarUtils"
            java.lang.String r0 = "Navbar should be an instance of BloksScreenNavbar or BloksScreenNavbarV2"
            X.1Kn.A02(r1, r0)
        L_0x0151:
            r18 = 0
        L_0x0153:
            r14 = 0
            X.Dhv r7 = new X.Dhv
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C46616Dhw.A00(X.X2h, X.6Rm, X.6Rx, X.4tV):X.Dhv");
    }

    public static C46615Dhv A01(C307896Rx r11, C276544tV r12) {
        C3034368u r2 = null;
        if (r12 == null) {
            return null;
        }
        C276544tV A07 = r12.A07(36);
        if (A07 != null) {
            r2 = C3034368u.A00(r11, A07);
        }
        r12.A0K(35);
        String A0K = r12.A0K(48);
        String A0K2 = r12.A0K(50);
        C277014uI A0A = r12.A0A(44);
        boolean A0T = r12.A0T(false);
        boolean A0R = r12.A0R(41, false);
        boolean A0R2 = r12.A0R(40, false);
        return new C46615Dhv((C20880X2h) null, r2, r12.A07(43), r12.A07(46), A0A, A0K, A0K2, r12.A0N(45), A0T, A0R, A0R2);
    }

    public static C276544tV A02(C276544tV r5) {
        String A0K;
        if (r5.A04 == 13412) {
            return r5;
        }
        C276534tU r4 = new C276534tU(13412);
        String A0K2 = r5.A0K(38);
        if (A0K2 != null) {
            r4.A0P(36, A0K2);
        }
        C277014uI A0A = r5.A0A(36);
        if (A0A != null) {
            r4.A0P(35, A0A);
        }
        r4.A0P(40, C48719Ej4.A00(r5.A0I()));
        C276544tV A07 = r5.A07(35);
        if (!(A07 == null || (A0K = A07.A0K(35)) == null)) {
            r4.A0P(38, A0K);
        }
        r4.A0O();
        return r4;
    }

    public static void A04(String str) {
        if (str != null) {
            try {
                AnonymousClass6Su.A03(str);
            } catch (C258053yO unused) {
                1Kn.A03("IgNavbarModelUtils", new IOException(002.A0R("Parsing error for color ", str)));
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005d, code lost:
        if (r3.equals("next") == false) goto L_0x0008;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0066, code lost:
        if (r3.equals("more") == false) goto L_0x0008;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x006f, code lost:
        if (r3.equals("mail") == false) goto L_0x0008;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0078, code lost:
        if (r3.equals("info") == false) goto L_0x0008;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0081, code lost:
        if (r3.equals(r0) == false) goto L_0x0008;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x008a, code lost:
        if (r3.equals("cart") == false) goto L_0x0008;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0094, code lost:
        if (r3.equals("back") == false) goto L_0x0008;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x009e, code lost:
        if (r3.equals("add") == false) goto L_0x0008;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00a8, code lost:
        if (r3.equals("menu_horizontal") == false) goto L_0x0008;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00b2, code lost:
        if (r3.equals("search") == false) goto L_0x0008;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00bc, code lost:
        if (r3.equals("report") == false) goto L_0x0008;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00c6, code lost:
        if (r3.equals("reload") == false) goto L_0x0008;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00d0, code lost:
        if (r3.equals("delete") == false) goto L_0x0008;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00da, code lost:
        if (r3.equals("camera") == false) goto L_0x0008;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00e4, code lost:
        if (r3.equals("questions") == false) goto L_0x0008;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00ee, code lost:
        if (r3.equals("edit_list") == false) goto L_0x0008;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001c, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00ff, code lost:
        return X.AnonymousClass05K.A0C;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0102, code lost:
        return X.AnonymousClass05K.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0105, code lost:
        return X.AnonymousClass05K.A0I;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0108, code lost:
        return X.AnonymousClass05K.A0Y;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x010b, code lost:
        return X.AnonymousClass05K.A1F;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x010e, code lost:
        return X.AnonymousClass05K.A0G;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0111, code lost:
        return X.AnonymousClass05K.A0B;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0114, code lost:
        return X.AnonymousClass05K.A1I;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0117, code lost:
        return X.AnonymousClass05K.A0F;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x011a, code lost:
        return X.AnonymousClass05K.A0P;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x011d, code lost:
        return X.AnonymousClass05K.A0E;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0120, code lost:
        return X.AnonymousClass05K.A0D;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0123, code lost:
        return X.AnonymousClass05K.A0u;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0126, code lost:
        return X.AnonymousClass05K.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0129, code lost:
        return X.AnonymousClass05K.A0L;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x012c, code lost:
        return X.AnonymousClass05K.A0M;
     */
    /* JADX WARNING: Removed duplicated region for block: B:4:0x000c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Integer A03(java.lang.String r3) {
        /*
            int r0 = r3.hashCode()
            r1 = -1
            switch(r0) {
                case -2119261262: goto L_0x00f2;
                case -1866255949: goto L_0x00e8;
                case -1782234803: goto L_0x00de;
                case -1367751899: goto L_0x00d4;
                case -1335458389: goto L_0x00ca;
                case -934641255: goto L_0x00c0;
                case -934521548: goto L_0x00b6;
                case -906336856: goto L_0x00ac;
                case -218232060: goto L_0x00a2;
                case 96417: goto L_0x0098;
                case 3015911: goto L_0x008e;
                case 3046176: goto L_0x0084;
                case 3089282: goto L_0x007b;
                case 3237038: goto L_0x0072;
                case 3343799: goto L_0x0069;
                case 3357525: goto L_0x0060;
                case 3377907: goto L_0x0057;
                case 3387192: goto L_0x004c;
                case 94627080: goto L_0x0049;
                case 94756344: goto L_0x003e;
                case 109400031: goto L_0x0033;
                case 1382682413: goto L_0x0028;
                case 1434631203: goto L_0x001d;
                default: goto L_0x0008;
            }
        L_0x0008:
            r2 = 0
            switch(r1) {
                case 1: goto L_0x012a;
                case 2: goto L_0x0127;
                case 3: goto L_0x0124;
                case 4: goto L_0x0121;
                case 5: goto L_0x011e;
                case 6: goto L_0x011b;
                case 7: goto L_0x0118;
                case 8: goto L_0x0115;
                case 9: goto L_0x0112;
                case 10: goto L_0x010f;
                case 11: goto L_0x010c;
                case 12: goto L_0x0109;
                case 13: goto L_0x0106;
                case 14: goto L_0x0103;
                case 15: goto L_0x0100;
                case 16: goto L_0x00fd;
                case 17: goto L_0x001c;
                default: goto L_0x000c;
            }
        L_0x000c:
            java.lang.String r0 = "Unsupported icon type: "
            java.lang.String r0 = X.002.A0R(r0, r3)
            X.3yO r1 = new X.3yO
            r1.<init>(r0)
            java.lang.String r0 = "IgNavbarModelUtils"
            X.1Kn.A03(r0, r1)
        L_0x001c:
            return r2
        L_0x001d:
            java.lang.String r0 = "settings"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0008
            java.lang.Integer r2 = X.AnonymousClass05K.A0H
            return r2
        L_0x0028:
            java.lang.String r0 = "payments"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0008
            java.lang.Integer r2 = X.AnonymousClass05K.A0K
            return r2
        L_0x0033:
            java.lang.String r0 = "share"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0008
            java.lang.Integer r2 = X.AnonymousClass05K.A0N
            return r2
        L_0x003e:
            java.lang.String r0 = "close"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0008
            java.lang.Integer r2 = X.AnonymousClass05K.A09
            return r2
        L_0x0049:
            java.lang.String r0 = "check"
            goto L_0x007d
        L_0x004c:
            java.lang.String r0 = "none"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0008
            r1 = 17
            goto L_0x0008
        L_0x0057:
            java.lang.String r0 = "next"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x00fd
            goto L_0x0008
        L_0x0060:
            java.lang.String r0 = "more"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x0100
            goto L_0x0008
        L_0x0069:
            java.lang.String r0 = "mail"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x0103
            goto L_0x0008
        L_0x0072:
            java.lang.String r0 = "info"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x0106
            goto L_0x0008
        L_0x007b:
            java.lang.String r0 = "done"
        L_0x007d:
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x0109
            goto L_0x0008
        L_0x0084:
            java.lang.String r0 = "cart"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x010c
            goto L_0x0008
        L_0x008e:
            java.lang.String r0 = "back"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x010f
            goto L_0x0008
        L_0x0098:
            java.lang.String r0 = "add"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x0112
            goto L_0x0008
        L_0x00a2:
            java.lang.String r0 = "menu_horizontal"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x0115
            goto L_0x0008
        L_0x00ac:
            java.lang.String r0 = "search"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x0118
            goto L_0x0008
        L_0x00b6:
            java.lang.String r0 = "report"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x011b
            goto L_0x0008
        L_0x00c0:
            java.lang.String r0 = "reload"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x011e
            goto L_0x0008
        L_0x00ca:
            java.lang.String r0 = "delete"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x0121
            goto L_0x0008
        L_0x00d4:
            java.lang.String r0 = "camera"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x0124
            goto L_0x0008
        L_0x00de:
            java.lang.String r0 = "questions"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x0127
            goto L_0x0008
        L_0x00e8:
            java.lang.String r0 = "edit_list"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x012a
            goto L_0x0008
        L_0x00f2:
            java.lang.String r0 = "sliders"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0008
            java.lang.Integer r2 = X.AnonymousClass05K.A0J
            return r2
        L_0x00fd:
            java.lang.Integer r2 = X.AnonymousClass05K.A0C
            return r2
        L_0x0100:
            java.lang.Integer r2 = X.AnonymousClass05K.A00
            return r2
        L_0x0103:
            java.lang.Integer r2 = X.AnonymousClass05K.A0I
            return r2
        L_0x0106:
            java.lang.Integer r2 = X.AnonymousClass05K.A0Y
            return r2
        L_0x0109:
            java.lang.Integer r2 = X.AnonymousClass05K.A1F
            return r2
        L_0x010c:
            java.lang.Integer r2 = X.AnonymousClass05K.A0G
            return r2
        L_0x010f:
            java.lang.Integer r2 = X.AnonymousClass05K.A0B
            return r2
        L_0x0112:
            java.lang.Integer r2 = X.AnonymousClass05K.A1I
            return r2
        L_0x0115:
            java.lang.Integer r2 = X.AnonymousClass05K.A0F
            return r2
        L_0x0118:
            java.lang.Integer r2 = X.AnonymousClass05K.A0P
            return r2
        L_0x011b:
            java.lang.Integer r2 = X.AnonymousClass05K.A0E
            return r2
        L_0x011e:
            java.lang.Integer r2 = X.AnonymousClass05K.A0D
            return r2
        L_0x0121:
            java.lang.Integer r2 = X.AnonymousClass05K.A0u
            return r2
        L_0x0124:
            java.lang.Integer r2 = X.AnonymousClass05K.A03
            return r2
        L_0x0127:
            java.lang.Integer r2 = X.AnonymousClass05K.A0L
            return r2
        L_0x012a:
            java.lang.Integer r2 = X.AnonymousClass05K.A0M
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C46616Dhw.A03(java.lang.String):java.lang.Integer");
    }
}
