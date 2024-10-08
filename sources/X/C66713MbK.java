package X;

import com.instagram.user.model.User;

/* renamed from: X.MbK  reason: case insensitive filesystem */
public abstract class C66713MbK {
    public static final String A00 = new String(Character.toChars(10084));

    public static String A01(C254703su r2) {
        C67259Mkt mkt = C67259Mkt.$redex_init_class;
        if (r2.A10.ordinal() == 18) {
            return A02(r2);
        }
        17k.A0E(r2.A1T instanceof User);
        return 002.A0R("@", ((User) r2.A1T).getUsername());
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x004e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A02(X.C254703su r5) {
        /*
            X.2FW r4 = r5.A10
            if (r4 == 0) goto L_0x004f
            java.lang.Object r2 = r5.A1T
            if (r2 == 0) goto L_0x004f
            java.util.List r2 = (java.util.List) r2
            int r1 = r2.size()
            r0 = 1
            if (r1 < r0) goto L_0x004f
            java.lang.Object r3 = X.AnonymousClass7TE.A13(r2)
            X.3tC r3 = (X.C254873tC) r3
            X.Mkt r0 = X.C67259Mkt.$redex_init_class
            int r1 = r4.ordinal()
            r0 = 18
            if (r1 == r0) goto L_0x003b
            r0 = 83
            if (r1 != r0) goto L_0x004a
            java.lang.String r2 = r3.A11
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x004a
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "#"
        L_0x0033:
            r1.append(r0)
            java.lang.String r0 = X.AnonymousClass7TF.A0l(r2, r1)
            return r0
        L_0x003b:
            java.lang.String r2 = r3.A11
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x004a
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "@"
            goto L_0x0033
        L_0x004a:
            java.lang.String r0 = r3.A1N
            if (r0 == 0) goto L_0x004f
            return r0
        L_0x004f:
            java.lang.String r0 = ""
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66713MbK.A02(X.3su):java.lang.String");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x02b3, code lost:
        if (r18 != false) goto L_0x02d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x02b5, code lost:
        if (r17 == false) goto L_0x02be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x02b7, code lost:
        if (r20 == null) goto L_0x02be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x02b9, code lost:
        r1 = 2131959131;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x02be, code lost:
        r0 = X.C3266377o.A01(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x02c2, code lost:
        if (r0 == null) goto L_0x02d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x02c4, code lost:
        r6 = r0.A11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x02ca, code lost:
        if (android.text.TextUtils.isEmpty(r6) != false) goto L_0x02d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x02cc, code lost:
        r1 = 2131959106;
        r6 = r6;
        r4 = new java.lang.Object[1];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x02d3, code lost:
        r1 = 2131959105;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x02d8, code lost:
        r1 = 2131959159;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0049, code lost:
        if (r0 == false) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x02f3, code lost:
        if (r18 == false) goto L_0x0710;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x0335, code lost:
        r1 = 2131959449;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x0338, code lost:
        if (r18 == false) goto L_0x001b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x033a, code lost:
        r1 = 2131959450;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x0394, code lost:
        if (r18 != false) goto L_0x0396;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x0399, code lost:
        r4 = new java.lang.Object[1];
        r6 = r2.getUsername();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x03a5, code lost:
        if (r7.A0z == X.2FW.A0m) goto L_0x03cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x03a7, code lost:
        r0 = X.C3266377o.A01(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x03ab, code lost:
        if (r0 == null) goto L_0x03c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x03ad, code lost:
        r6 = r0.A11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x03b3, code lost:
        if (android.text.TextUtils.isEmpty(r6) != false) goto L_0x03c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x03b5, code lost:
        r1 = 2131958759;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x03b8, code lost:
        if (r18 == false) goto L_0x03bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x03ba, code lost:
        r1 = 2131958760;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x03bd, code lost:
        r6 = r6;
        r4 = new java.lang.Object[1];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x03c1, code lost:
        r1 = 2131958757;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x03c4, code lost:
        if (r18 == false) goto L_0x001b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x03c6, code lost:
        r1 = 2131958758;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x03cb, code lost:
        r0 = 2131959072;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x03ce, code lost:
        if (r18 == false) goto L_0x0988;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x03d0, code lost:
        r0 = 2131959140;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x0402, code lost:
        if (r18 == false) goto L_0x0409;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x0404, code lost:
        r1 = 2131959645;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x0409, code lost:
        if (r17 == false) goto L_0x0412;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x040b, code lost:
        if (r20 == null) goto L_0x0412;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x040d, code lost:
        r1 = 2131959642;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x0412, code lost:
        r1 = 2131959643;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:420:0x0651, code lost:
        if (r1 == null) goto L_0x0653;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:459:0x070e, code lost:
        if (r0 == null) goto L_0x0710;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:460:0x0710, code lost:
        r1 = 2131959066;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:479:0x0758, code lost:
        if (r7.A1M() != false) goto L_0x0775;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:481:0x0764, code lost:
        if ((!r7.A0v().isEmpty()) != false) goto L_0x0775;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:482:0x0766, code lost:
        monitor-enter(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:484:?, code lost:
        r0 = r7.A0d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:485:0x0769, code lost:
        if (r0 == null) goto L_0x0770;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:486:0x076b, code lost:
        r1 = r0.A05;
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:487:0x076e, code lost:
        if (r1 != null) goto L_0x0771;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:488:0x0770, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:489:0x0771, code lost:
        monitor-exit(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:490:0x0772, code lost:
        r1 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:491:0x0773, code lost:
        if (r0 == false) goto L_0x0776;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:492:0x0775, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:493:0x0776, code lost:
        r0 = r7.A1q;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:494:0x0778, code lost:
        if (r0 == null) goto L_0x077b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:495:0x077a, code lost:
        r4 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:496:0x077b, code lost:
        if (r1 == false) goto L_0x0798;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:497:0x077d, code lost:
        if (r18 == false) goto L_0x078a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:498:0x077f, code lost:
        if (r17 == false) goto L_0x07ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:499:0x0781, code lost:
        r1 = 2131959141;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:500:0x0784, code lost:
        r4 = new java.lang.Object[]{r4};
     */
    /* JADX WARNING: Code restructure failed: missing block: B:501:0x078a, code lost:
        r1 = 2131959073;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:502:0x078d, code lost:
        if (r17 == false) goto L_0x0784;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:503:0x078f, code lost:
        r1 = 2131959115;
        r4 = new java.lang.Object[]{r2, r4};
     */
    /* JADX WARNING: Code restructure failed: missing block: B:504:0x0798, code lost:
        if (r17 == false) goto L_0x07a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:505:0x079a, code lost:
        if (r18 == false) goto L_0x07b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:506:0x079c, code lost:
        r1 = 2131959144;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:507:0x07a1, code lost:
        if (r18 != false) goto L_0x0abc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:509:0x07a7, code lost:
        if (r7.A0z != X.2FW.A0m) goto L_0x07b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:510:0x07a9, code lost:
        r1 = 2131959075;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:511:0x07ad, code lost:
        r1 = 2131959142;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:512:0x07b2, code lost:
        r1 = 2131959116;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:513:0x07b7, code lost:
        r1 = 2131959092;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:521:0x07da, code lost:
        if (r18 == false) goto L_0x07e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:522:0x07dc, code lost:
        r1 = 2131960426;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:523:0x07e1, code lost:
        if (r17 == false) goto L_0x07ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:524:0x07e3, code lost:
        if (r20 == null) goto L_0x07ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:525:0x07e5, code lost:
        r1 = 2131960416;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:526:0x07ea, code lost:
        r1 = 2131960421;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:543:0x0826, code lost:
        return r6.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:557:0x085d, code lost:
        if (X.2PP.A00(r7.A00, "screen_recording") == false) goto L_0x085f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:569:0x087c, code lost:
        r1 = new java.lang.Object[]{r2};
     */
    /* JADX WARNING: Code restructure failed: missing block: B:587:0x08cd, code lost:
        if (r0 != X.1iA.A0Q) goto L_0x08cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:608:0x090b, code lost:
        return r5.getString(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:617:0x0927, code lost:
        if (r0.A0P == false) goto L_0x0929;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:654:0x098c, code lost:
        return r5.getString(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:662:0x09a5, code lost:
        if (r6 != null) goto L_0x09a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:664:0x09a8, code lost:
        if (r18 != false) goto L_0x0a7a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:665:0x09aa, code lost:
        if (r17 == false) goto L_0x0a75;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:666:0x09ac, code lost:
        if (r20 == null) goto L_0x0a75;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:667:0x09ae, code lost:
        r4 = 2131959126;
        r1 = new java.lang.Object[1];
        r0 = X.AnonymousClass50n.A07(r20);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:688:0x0a53, code lost:
        r1 = new java.lang.Object[1];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:689:0x0a55, code lost:
        r1[0] = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:698:0x0a75, code lost:
        r0 = 2131959099;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:699:0x0a7a, code lost:
        r0 = 2131959153;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:711:0x0ab8, code lost:
        r4[0] = r6;
        r4 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:712:0x0abc, code lost:
        r1 = 2131959151;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:716:0x0aca, code lost:
        r1 = 2131959096;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:750:0x0b50, code lost:
        r4 = new java.lang.Object[]{r2};
     */
    /* JADX WARNING: Code restructure failed: missing block: B:752:0x0b58, code lost:
        return r5.getString(r1, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:773:0x0b9c, code lost:
        if (r20 != null) goto L_0x0bad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:778:0x0bab, code lost:
        if (r19.CQq() == false) goto L_0x0bad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:784:0x0bc5, code lost:
        return r4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x022f  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x0241  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x026d A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:591:0x08d6  */
    /* JADX WARNING: Removed duplicated region for block: B:612:0x0918  */
    /* JADX WARNING: Removed duplicated region for block: B:684:0x0a37  */
    /* JADX WARNING: Removed duplicated region for block: B:702:0x0a87  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.CharSequence A00(android.content.Context r16, com.instagram.common.session.UserSession r17, X.C254703su r18, X.AnonymousClass2Ep r19, com.instagram.user.model.User r20) {
        /*
            r9 = r16
            android.content.res.Resources r5 = r9.getResources()
            boolean r0 = r19.isPending()
            if (r0 == 0) goto L_0x0020
            boolean r0 = r19.AqP()
            if (r0 != 0) goto L_0x0018
            boolean r0 = r19.CWJ()
            if (r0 == 0) goto L_0x0020
        L_0x0018:
            r1 = 2131959059(0x7f131d13, float:1.9554748E38)
        L_0x001b:
            java.lang.String r4 = r5.getString(r1)
        L_0x001f:
            return r4
        L_0x0020:
            java.lang.String r4 = ""
            r7 = r18
            if (r18 == 0) goto L_0x0bc6
            X.0eE r12 = X.AnonymousClass0t1.A01
            r8 = r17
            com.instagram.user.model.User r11 = r12.A01(r8)
            boolean r18 = r7.A1j(r11)
            int r0 = r19.C6a()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r0 = X.AnonymousClass48O.A06(r0)
            r10 = 1
            r3 = 0
            if (r0 != 0) goto L_0x004b
            X.7AG r1 = r7.A0Q
            r0 = 0
            if (r1 == 0) goto L_0x0048
            r0 = 1
        L_0x0048:
            r15 = 1
            if (r0 != 0) goto L_0x004c
        L_0x004b:
            r15 = 0
        L_0x004c:
            java.lang.Object r6 = r7.A1T
            if (r20 != 0) goto L_0x005e
            r2 = 0
        L_0x0051:
            boolean r0 = r7.A2P
            if (r0 == 0) goto L_0x0063
            r1 = 2131959076(0x7f131d24, float:1.9554782E38)
            if (r18 == 0) goto L_0x001b
            r1 = 2131958540(0x7f131b0c, float:1.9553695E38)
            goto L_0x001b
        L_0x005e:
            java.lang.String r2 = X.AnonymousClass50n.A08(r20)
            goto L_0x0051
        L_0x0063:
            boolean r17 = r19.CUG()
            X.0Tu r13 = X.0Tu.A05
            r0 = 36330488406885015(0x81126300024297, double:3.038885387424199E-306)
            boolean r14 = X.182.A06(r13, r8, r0)
            X.Mkt r0 = X.C67259Mkt.$redex_init_class
            X.2FW r0 = r7.A10
            int r0 = r0.ordinal()
            java.lang.String r1 = "tag"
            r13 = 3
            switch(r0) {
                case 0: goto L_0x088c;
                case 1: goto L_0x08a3;
                case 2: goto L_0x0ae5;
                case 3: goto L_0x0174;
                case 4: goto L_0x08bb;
                case 5: goto L_0x0b8b;
                case 6: goto L_0x07ef;
                case 7: goto L_0x082c;
                case 8: goto L_0x0080;
                case 9: goto L_0x0080;
                case 10: goto L_0x0080;
                case 11: goto L_0x02dd;
                case 12: goto L_0x0088;
                case 13: goto L_0x09a8;
                case 14: goto L_0x0301;
                case 15: goto L_0x0b86;
                case 16: goto L_0x0080;
                case 17: goto L_0x0080;
                case 18: goto L_0x0b86;
                case 19: goto L_0x0080;
                case 20: goto L_0x01d8;
                case 21: goto L_0x02b3;
                case 22: goto L_0x05f7;
                case 23: goto L_0x0754;
                case 24: goto L_0x02f0;
                case 25: goto L_0x0080;
                case 26: goto L_0x0080;
                case 27: goto L_0x0080;
                case 28: goto L_0x07bc;
                case 29: goto L_0x07da;
                case 30: goto L_0x02f7;
                case 31: goto L_0x0080;
                case 32: goto L_0x03d5;
                case 33: goto L_0x0402;
                case 34: goto L_0x0417;
                case 35: goto L_0x0417;
                case 36: goto L_0x0125;
                case 37: goto L_0x0316;
                case 38: goto L_0x0335;
                case 39: goto L_0x042e;
                case 40: goto L_0x0441;
                case 41: goto L_0x0441;
                case 42: goto L_0x09a8;
                case 43: goto L_0x0080;
                case 44: goto L_0x0080;
                case 45: goto L_0x0486;
                case 46: goto L_0x033f;
                case 47: goto L_0x0080;
                case 48: goto L_0x0080;
                case 49: goto L_0x03a1;
                case 50: goto L_0x0080;
                case 51: goto L_0x0080;
                case 52: goto L_0x05e4;
                case 53: goto L_0x098d;
                case 54: goto L_0x0080;
                case 55: goto L_0x0b81;
                case 56: goto L_0x0549;
                case 57: goto L_0x09b9;
                case 58: goto L_0x0490;
                case 59: goto L_0x04a7;
                case 60: goto L_0x0080;
                case 61: goto L_0x04be;
                case 62: goto L_0x04d5;
                case 63: goto L_0x04ec;
                case 64: goto L_0x0549;
                case 65: goto L_0x0560;
                case 66: goto L_0x0b81;
                case 67: goto L_0x0b5e;
                case 68: goto L_0x0080;
                case 69: goto L_0x080c;
                case 70: goto L_0x0080;
                case 71: goto L_0x05a3;
                case 72: goto L_0x0b81;
                case 73: goto L_0x0080;
                case 74: goto L_0x0080;
                case 75: goto L_0x0080;
                case 76: goto L_0x00f3;
                case 77: goto L_0x00ba;
                case 78: goto L_0x0577;
                case 79: goto L_0x0b81;
                case 80: goto L_0x046f;
                case 81: goto L_0x0458;
                case 82: goto L_0x0458;
                case 83: goto L_0x058c;
                case 84: goto L_0x05af;
                case 85: goto L_0x05af;
                case 86: goto L_0x0080;
                case 87: goto L_0x0080;
                case 88: goto L_0x0080;
                case 89: goto L_0x0080;
                case 90: goto L_0x0080;
                case 91: goto L_0x0080;
                case 92: goto L_0x0080;
                case 93: goto L_0x05c6;
                case 94: goto L_0x0080;
                case 95: goto L_0x0080;
                case 96: goto L_0x02dd;
                case 97: goto L_0x0080;
                case 98: goto L_0x0080;
                case 99: goto L_0x0080;
                case 100: goto L_0x088c;
                case 101: goto L_0x0080;
                case 102: goto L_0x0080;
                case 103: goto L_0x05d0;
                case 104: goto L_0x05da;
                case 105: goto L_0x09b9;
                default: goto L_0x0080;
            }
        L_0x0080:
            java.lang.String r1 = "Unhandled message type"
            java.lang.String r0 = "DirectMessageTextExtractor"
            X.0wb.A03(r0, r1)
            return r4
        L_0x0088:
            java.lang.Object r0 = r7.A1T
            r0.getClass()
            com.instagram.model.direct.gifs.DirectAnimatedMedia r0 = (com.instagram.model.direct.gifs.DirectAnimatedMedia) r0
            boolean r0 = r0.A06
            if (r0 == 0) goto L_0x00a6
            if (r18 != 0) goto L_0x0a7a
            if (r17 == 0) goto L_0x0a75
            if (r20 == 0) goto L_0x0a75
            r4 = 2131959126(0x7f131d56, float:1.9554884E38)
        L_0x009c:
            java.lang.String r0 = X.AnonymousClass50n.A07(r20)
            java.lang.Object[] r1 = new java.lang.Object[]{r0}
            goto L_0x0907
        L_0x00a6:
            if (r18 == 0) goto L_0x00ad
            r0 = 2131959150(0x7f131d6e, float:1.9554932E38)
            goto L_0x0988
        L_0x00ad:
            if (r17 == 0) goto L_0x00b5
            if (r20 == 0) goto L_0x00b5
            r4 = 2131959121(0x7f131d51, float:1.9554873E38)
            goto L_0x009c
        L_0x00b5:
            r0 = 2131959095(0x7f131d37, float:1.955482E38)
            goto L_0x0988
        L_0x00ba:
            com.google.common.collect.ImmutableList r0 = r7.A0H()
            if (r0 == 0) goto L_0x00e9
            com.google.common.collect.ImmutableList r0 = r7.A0H()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00e9
            com.google.common.collect.ImmutableList r0 = r7.A0H()
            java.lang.Object r0 = r0.get(r3)
            X.3tC r0 = (X.C254873tC) r0
            java.lang.String r0 = r0.A1N
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x00e9
            com.google.common.collect.ImmutableList r0 = r7.A0H()
            java.lang.Object r0 = r0.get(r3)
            X.3tC r0 = (X.C254873tC) r0
            java.lang.String r6 = r0.A1N
            return r6
        L_0x00e9:
            r0 = 2131959442(0x7f131e92, float:1.9555525E38)
            if (r18 == 0) goto L_0x0988
            r0 = 2131959914(0x7f13206a, float:1.9556482E38)
            goto L_0x0988
        L_0x00f3:
            java.lang.Object r1 = r7.A1T
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto L_0x0bc5
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0bc5
            java.lang.Object r0 = r1.get(r3)
            X.3tC r0 = (X.C254873tC) r0
            java.lang.String r1 = r0.A1N
            java.lang.String r0 = r0.A0t
            if (r18 == 0) goto L_0x0114
            r4 = 2131960772(0x7f1323c4, float:1.9558222E38)
        L_0x010e:
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r0}
            goto L_0x0907
        L_0x0114:
            if (r17 == 0) goto L_0x0121
            if (r2 == 0) goto L_0x0121
            r4 = 2131959426(0x7f131e82, float:1.9555492E38)
            java.lang.Object[] r1 = new java.lang.Object[]{r2, r1, r0}
            goto L_0x0907
        L_0x0121:
            r4 = 2131960440(0x7f132278, float:1.9557549E38)
            goto L_0x010e
        L_0x0125:
            r6.getClass()
            X.55L r6 = (X.AnonymousClass55L) r6
            java.lang.String r1 = r6.A03
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x0133
            return r1
        L_0x0133:
            if (r20 == 0) goto L_0x0bc6
            java.lang.Integer r0 = r6.A02
            int r1 = r0.intValue()
            if (r1 == r3) goto L_0x0168
            if (r1 == r13) goto L_0x015c
            if (r1 == r10) goto L_0x0150
            r0 = 2
            if (r1 != r0) goto L_0x0bc6
            if (r18 == 0) goto L_0x014b
            r1 = 2131960690(0x7f132372, float:1.9558056E38)
            goto L_0x001b
        L_0x014b:
            r1 = 2131960686(0x7f13236e, float:1.9558048E38)
            goto L_0x0b50
        L_0x0150:
            if (r18 == 0) goto L_0x0157
            r1 = 2131960689(0x7f132371, float:1.9558054E38)
            goto L_0x001b
        L_0x0157:
            r1 = 2131960685(0x7f13236d, float:1.9558046E38)
            goto L_0x0b50
        L_0x015c:
            if (r18 == 0) goto L_0x0163
            r1 = 2131960688(0x7f132370, float:1.9558052E38)
            goto L_0x001b
        L_0x0163:
            r1 = 2131960684(0x7f13236c, float:1.9558044E38)
            goto L_0x0b50
        L_0x0168:
            if (r18 == 0) goto L_0x016f
            r1 = 2131960691(0x7f132373, float:1.9558058E38)
            goto L_0x001b
        L_0x016f:
            r1 = 2131960687(0x7f13236f, float:1.955805E38)
            goto L_0x0b50
        L_0x0174:
            boolean r0 = r6 instanceof X.C300925yB
            if (r0 == 0) goto L_0x018f
            X.5yB r6 = (X.C300925yB) r6
            boolean r4 = r6.A05()
            X.1iA r3 = r6.A01
        L_0x0180:
            X.1iA r1 = X.1iA.A0E
            r0 = 0
            if (r3 != r1) goto L_0x0186
            r0 = 1
        L_0x0186:
            if (r4 == 0) goto L_0x01ac
            if (r18 == 0) goto L_0x019e
            r1 = 2131959155(0x7f131d73, float:1.9554942E38)
            goto L_0x001b
        L_0x018f:
            boolean r0 = r6 instanceof X.1Xj
            if (r0 == 0) goto L_0x0b8e
            X.1Xj r6 = (X.1Xj) r6
            boolean r4 = r6.CeS()
            X.1iA r3 = r6.BR7()
            goto L_0x0180
        L_0x019e:
            if (r17 != 0) goto L_0x01a7
            if (r15 != 0) goto L_0x01a7
            r1 = 2131959100(0x7f131d3c, float:1.955483E38)
            goto L_0x001b
        L_0x01a7:
            r1 = 2131959127(0x7f131d57, float:1.9554886E38)
            goto L_0x0b50
        L_0x01ac:
            if (r0 == 0) goto L_0x01c3
            if (r18 == 0) goto L_0x01b5
            r1 = 2131959149(0x7f131d6d, float:1.955493E38)
            goto L_0x001b
        L_0x01b5:
            if (r17 != 0) goto L_0x01be
            if (r15 != 0) goto L_0x01be
            r1 = 2131959094(0x7f131d36, float:1.9554819E38)
            goto L_0x001b
        L_0x01be:
            r1 = 2131959120(0x7f131d50, float:1.9554871E38)
            goto L_0x0b50
        L_0x01c3:
            if (r18 == 0) goto L_0x01ca
            r1 = 2131959152(0x7f131d70, float:1.9554936E38)
            goto L_0x001b
        L_0x01ca:
            if (r17 != 0) goto L_0x01d3
            if (r15 != 0) goto L_0x01d3
            r1 = 2131959097(0x7f131d39, float:1.9554825E38)
            goto L_0x001b
        L_0x01d3:
            r1 = 2131959124(0x7f131d54, float:1.955488E38)
            goto L_0x0b50
        L_0x01d8:
            r0 = 2
            boolean r0 = X.AnonymousClass9JI.A00(r0, r6)
            if (r0 == 0) goto L_0x0282
            X.9JI r6 = (X.AnonymousClass9JI) r6
            java.lang.String r6 = r6.A03
        L_0x01e3:
            boolean r0 = r7.A1X()
            if (r0 == 0) goto L_0x0285
            java.lang.Object r0 = r7.A1T
            if (r0 == 0) goto L_0x001f
            r0 = 2131958766(0x7f131bee, float:1.9554153E38)
            java.lang.String r6 = r5.getString(r0)
            r0 = 2131958767(0x7f131bef, float:1.9554155E38)
            java.lang.String r10 = r5.getString(r0)
            java.lang.Object r0 = r7.A1T
            X.9JI r0 = (X.AnonymousClass9JI) r0
            java.lang.Object r9 = r0.A00
            X.1Xj r9 = (X.1Xj) r9
            X.1Xy r0 = r9.A0C
            java.util.List r0 = r0.getCoauthorProducers()
            if (r0 == 0) goto L_0x026e
            X.1Xy r0 = r9.A0C
            java.util.List r0 = r0.getCoauthorProducers()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x026e
            X.1Xy r0 = r9.A0C
            java.util.List r0 = r0.getCoauthorProducers()
        L_0x021d:
            java.lang.Object r0 = r0.get(r3)
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            java.lang.String r2 = r0.getUsername()
        L_0x0227:
            X.1Xy r0 = r9.A0C
            com.instagram.user.model.User r0 = r0.CCd()
            if (r0 == 0) goto L_0x0239
            X.1Xy r0 = r9.A0C
            com.instagram.user.model.User r0 = r0.CCd()
            java.lang.String r4 = r0.getUsername()
        L_0x0239:
            com.instagram.model.mediatype.ProductType r1 = com.instagram.model.mediatype.ProductType.CLIPS
            com.instagram.model.mediatype.ProductType r0 = r9.A1v()
            if (r1 != r0) goto L_0x0263
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x0252
            r1 = 2131958773(0x7f131bf5, float:1.9554168E38)
            java.lang.Object[] r0 = new java.lang.Object[]{r2}
            java.lang.String r10 = r5.getString(r1, r0)
        L_0x0252:
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x0263
            r1 = 2131958772(0x7f131bf4, float:1.9554166E38)
            java.lang.Object[] r0 = new java.lang.Object[]{r4}
            java.lang.String r6 = r5.getString(r1, r0)
        L_0x0263:
            com.instagram.user.model.User r0 = r12.A01(r8)
            boolean r0 = r7.A1j(r0)
            if (r0 == 0) goto L_0x09a7
            return r10
        L_0x026e:
            r9.A3a()
            java.util.List r0 = r9.A3a()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0280
            java.util.List r0 = r9.A3a()
            goto L_0x021d
        L_0x0280:
            r2 = r4
            goto L_0x0227
        L_0x0282:
            r6 = 0
            goto L_0x01e3
        L_0x0285:
            boolean r0 = r1.equals(r6)
            if (r0 == 0) goto L_0x02b3
            if (r18 == 0) goto L_0x02ae
            java.util.List r1 = r19.BRZ()
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x02d8
            java.lang.Object r0 = r1.get(r3)
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            java.lang.String r6 = r0.getUsername()
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L_0x02d8
            r1 = 2131959135(0x7f131d5f, float:1.9554902E38)
            java.lang.Object[] r4 = new java.lang.Object[r10]
            goto L_0x0ab8
        L_0x02ae:
            r1 = 2131959064(0x7f131d18, float:1.9554758E38)
            goto L_0x001b
        L_0x02b3:
            if (r18 != 0) goto L_0x02d8
            if (r17 == 0) goto L_0x02be
            if (r20 == 0) goto L_0x02be
            r1 = 2131959131(0x7f131d5b, float:1.9554894E38)
            goto L_0x0b50
        L_0x02be:
            X.3tC r0 = X.C3266377o.A01(r7)
            if (r0 == 0) goto L_0x02d3
            java.lang.String r6 = r0.A11
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 != 0) goto L_0x02d3
            r1 = 2131959106(0x7f131d42, float:1.9554843E38)
            java.lang.Object[] r4 = new java.lang.Object[r10]
            goto L_0x0ab8
        L_0x02d3:
            r1 = 2131959105(0x7f131d41, float:1.9554841E38)
            goto L_0x001b
        L_0x02d8:
            r1 = 2131959159(0x7f131d77, float:1.955495E38)
            goto L_0x001b
        L_0x02dd:
            if (r18 == 0) goto L_0x02e4
            r1 = 2131959158(0x7f131d76, float:1.9554949E38)
            goto L_0x001b
        L_0x02e4:
            if (r17 != 0) goto L_0x02eb
            r1 = 2131959104(0x7f131d40, float:1.955484E38)
            goto L_0x001b
        L_0x02eb:
            r1 = 2131959130(0x7f131d5a, float:1.9554892E38)
            goto L_0x0b50
        L_0x02f0:
            r1 = 2131959056(0x7f131d10, float:1.9554742E38)
            if (r18 != 0) goto L_0x001b
            goto L_0x0710
        L_0x02f7:
            r1 = 2131959636(0x7f131f54, float:1.9555918E38)
            if (r18 == 0) goto L_0x001b
            r1 = 2131959637(0x7f131f55, float:1.955592E38)
            goto L_0x001b
        L_0x0301:
            if (r18 == 0) goto L_0x0308
            r1 = 2131959156(0x7f131d74, float:1.9554944E38)
            goto L_0x001b
        L_0x0308:
            if (r17 == 0) goto L_0x0311
            if (r20 == 0) goto L_0x0311
            r1 = 2131959129(0x7f131d59, float:1.955489E38)
            goto L_0x0b50
        L_0x0311:
            r1 = 2131959103(0x7f131d3f, float:1.9554837E38)
            goto L_0x001b
        L_0x0316:
            X.9Iu r6 = (X.C376649Iu) r6
            if (r6 == 0) goto L_0x0335
            java.lang.Object r1 = r6.A00
            X.1Xj r1 = (X.1Xj) r1
            if (r1 == 0) goto L_0x0335
            com.instagram.user.model.User r0 = r1.A2A(r8)
            if (r0 == 0) goto L_0x0335
            com.instagram.user.model.User r2 = r1.A2A(r8)
            if (r2 == 0) goto L_0x0335
            r1 = 2131964020(0x7f133074, float:1.956481E38)
            if (r18 == 0) goto L_0x0399
            r1 = 2131964021(0x7f133075, float:1.9564812E38)
            goto L_0x0399
        L_0x0335:
            r1 = 2131959449(0x7f131e99, float:1.9555539E38)
            if (r18 == 0) goto L_0x001b
            r1 = 2131959450(0x7f131e9a, float:1.955554E38)
            goto L_0x001b
        L_0x033f:
            X.77X r6 = (X.AnonymousClass77X) r6
            if (r6 == 0) goto L_0x03a1
            java.lang.String r0 = r6.A03
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x03cb
            X.1Xj r0 = r6.A01
            if (r0 == 0) goto L_0x03a1
            com.instagram.user.model.User r0 = r0.A2A(r8)
            if (r0 == 0) goto L_0x03a1
            X.1Xj r0 = r6.A01
            com.instagram.user.model.User r2 = r0.A2A(r8)
            if (r2 == 0) goto L_0x03a1
            java.lang.String r0 = r6.A04
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0391
            if (r18 == 0) goto L_0x038c
            java.util.List r1 = r19.BRZ()
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x038a
            java.lang.Object r0 = r1.get(r3)
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            java.lang.String r6 = r0.getUsername()
        L_0x037d:
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 != 0) goto L_0x0396
            r1 = 2131959136(0x7f131d60, float:1.9554904E38)
            java.lang.Object[] r4 = new java.lang.Object[r10]
            goto L_0x0ab8
        L_0x038a:
            r6 = 0
            goto L_0x037d
        L_0x038c:
            r1 = 2131959065(0x7f131d19, float:1.955476E38)
            goto L_0x001b
        L_0x0391:
            r1 = 2131958759(0x7f131be7, float:1.955414E38)
            if (r18 == 0) goto L_0x0399
        L_0x0396:
            r1 = 2131958760(0x7f131be8, float:1.9554141E38)
        L_0x0399:
            java.lang.Object[] r4 = new java.lang.Object[r10]
            java.lang.String r6 = r2.getUsername()
            goto L_0x0ab8
        L_0x03a1:
            X.2FW r1 = r7.A0z
            X.2FW r0 = X.2FW.A0m
            if (r1 == r0) goto L_0x03cb
            X.3tC r0 = X.C3266377o.A01(r7)
            if (r0 == 0) goto L_0x03c1
            java.lang.String r6 = r0.A11
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 != 0) goto L_0x03c1
            r1 = 2131958759(0x7f131be7, float:1.955414E38)
            if (r18 == 0) goto L_0x03bd
            r1 = 2131958760(0x7f131be8, float:1.9554141E38)
        L_0x03bd:
            java.lang.Object[] r4 = new java.lang.Object[r10]
            goto L_0x0ab8
        L_0x03c1:
            r1 = 2131958757(0x7f131be5, float:1.9554135E38)
            if (r18 == 0) goto L_0x001b
            r1 = 2131958758(0x7f131be6, float:1.9554137E38)
            goto L_0x001b
        L_0x03cb:
            r0 = 2131959072(0x7f131d20, float:1.9554774E38)
            if (r18 == 0) goto L_0x0988
            r0 = 2131959140(0x7f131d64, float:1.9554912E38)
            goto L_0x0988
        L_0x03d5:
            X.Cw5 r6 = (X.C45425Cw5) r6
            if (r6 == 0) goto L_0x0402
            X.4gL r0 = r6.A01
            if (r0 == 0) goto L_0x0402
            com.instagram.user.model.User r0 = r0.A03()
            java.lang.String r1 = r0.getId()
            java.lang.String r0 = r7.A1u
            boolean r0 = X.2PP.A00(r1, r0)
            if (r0 == 0) goto L_0x0402
            if (r18 == 0) goto L_0x03f4
            r1 = 2131959638(0x7f131f56, float:1.9555922E38)
            goto L_0x001b
        L_0x03f4:
            if (r17 == 0) goto L_0x03fd
            if (r20 == 0) goto L_0x03fd
            r1 = 2131959640(0x7f131f58, float:1.9555926E38)
            goto L_0x0b50
        L_0x03fd:
            r1 = 2131959639(0x7f131f57, float:1.9555924E38)
            goto L_0x001b
        L_0x0402:
            if (r18 == 0) goto L_0x0409
            r1 = 2131959645(0x7f131f5d, float:1.9555936E38)
            goto L_0x001b
        L_0x0409:
            if (r17 == 0) goto L_0x0412
            if (r20 == 0) goto L_0x0412
            r1 = 2131959642(0x7f131f5a, float:1.955593E38)
            goto L_0x0b50
        L_0x0412:
            r1 = 2131959643(0x7f131f5b, float:1.9555932E38)
            goto L_0x001b
        L_0x0417:
            if (r18 == 0) goto L_0x041e
            r1 = 2131959160(0x7f131d78, float:1.9554953E38)
            goto L_0x001b
        L_0x041e:
            if (r17 == 0) goto L_0x0429
            if (r20 == 0) goto L_0x0429
            if (r2 == 0) goto L_0x0429
            r1 = 2131959132(0x7f131d5c, float:1.9554896E38)
            goto L_0x0b50
        L_0x0429:
            r1 = 2131959067(0x7f131d1b, float:1.9554764E38)
            goto L_0x001b
        L_0x042e:
            if (r20 != 0) goto L_0x0435
            r1 = 2131959119(0x7f131d4f, float:1.955487E38)
            goto L_0x001b
        L_0x0435:
            if (r18 == 0) goto L_0x043c
            r1 = 2131959148(0x7f131d6c, float:1.9554928E38)
            goto L_0x001b
        L_0x043c:
            r1 = 2131959118(0x7f131d4e, float:1.9554867E38)
            goto L_0x0b50
        L_0x0441:
            if (r18 == 0) goto L_0x0448
            r1 = 2131958626(0x7f131b62, float:1.955387E38)
            goto L_0x001b
        L_0x0448:
            if (r17 == 0) goto L_0x0453
            if (r20 == 0) goto L_0x0453
            if (r2 == 0) goto L_0x0453
            r1 = 2131958627(0x7f131b63, float:1.9553872E38)
            goto L_0x0b50
        L_0x0453:
            r1 = 2131958625(0x7f131b61, float:1.9553867E38)
            goto L_0x001b
        L_0x0458:
            if (r18 == 0) goto L_0x045f
            r1 = 2131958647(0x7f131b77, float:1.9553912E38)
            goto L_0x001b
        L_0x045f:
            if (r17 == 0) goto L_0x046a
            if (r20 == 0) goto L_0x046a
            if (r2 == 0) goto L_0x046a
            r1 = 2131958646(0x7f131b76, float:1.955391E38)
            goto L_0x0b50
        L_0x046a:
            r1 = 2131958645(0x7f131b75, float:1.9553908E38)
            goto L_0x001b
        L_0x046f:
            if (r18 == 0) goto L_0x0476
            r1 = 2131958616(0x7f131b58, float:1.955385E38)
            goto L_0x001b
        L_0x0476:
            if (r17 == 0) goto L_0x0481
            if (r20 == 0) goto L_0x0481
            if (r2 == 0) goto L_0x0481
            r1 = 2131958615(0x7f131b57, float:1.9553847E38)
            goto L_0x0b50
        L_0x0481:
            r1 = 2131958614(0x7f131b56, float:1.9553845E38)
            goto L_0x001b
        L_0x0486:
            r1 = 2131960372(0x7f132234, float:1.955741E38)
            if (r18 == 0) goto L_0x001b
            r1 = 2131960373(0x7f132235, float:1.9557413E38)
            goto L_0x001b
        L_0x0490:
            if (r18 == 0) goto L_0x0497
            r1 = 2131960197(0x7f132185, float:1.9557056E38)
            goto L_0x001b
        L_0x0497:
            if (r17 == 0) goto L_0x04a2
            if (r20 == 0) goto L_0x04a2
            if (r2 == 0) goto L_0x04a2
            r1 = 2131960198(0x7f132186, float:1.9557058E38)
            goto L_0x0b50
        L_0x04a2:
            r1 = 2131960196(0x7f132184, float:1.9557054E38)
            goto L_0x001b
        L_0x04a7:
            if (r18 == 0) goto L_0x04ae
            r1 = 2131959648(0x7f131f60, float:1.9555942E38)
            goto L_0x001b
        L_0x04ae:
            if (r17 == 0) goto L_0x04b9
            if (r20 == 0) goto L_0x04b9
            if (r2 == 0) goto L_0x04b9
            r1 = 2131959647(0x7f131f5f, float:1.955594E38)
            goto L_0x0b50
        L_0x04b9:
            r1 = 2131959646(0x7f131f5e, float:1.9555938E38)
            goto L_0x001b
        L_0x04be:
            if (r18 == 0) goto L_0x04c5
            r1 = 2131960735(0x7f13239f, float:1.9558147E38)
            goto L_0x001b
        L_0x04c5:
            if (r17 == 0) goto L_0x04d0
            if (r20 == 0) goto L_0x04d0
            if (r2 == 0) goto L_0x04d0
            r1 = 2131960736(0x7f1323a0, float:1.955815E38)
            goto L_0x0b50
        L_0x04d0:
            r1 = 2131960734(0x7f13239e, float:1.9558145E38)
            goto L_0x001b
        L_0x04d5:
            if (r18 == 0) goto L_0x04dc
            r1 = 2131959584(0x7f131f20, float:1.9555813E38)
            goto L_0x001b
        L_0x04dc:
            if (r17 == 0) goto L_0x04e7
            if (r20 == 0) goto L_0x04e7
            if (r2 == 0) goto L_0x04e7
            r1 = 2131959585(0x7f131f21, float:1.9555815E38)
            goto L_0x0b50
        L_0x04e7:
            r1 = 2131959583(0x7f131f1f, float:1.955581E38)
            goto L_0x001b
        L_0x04ec:
            com.google.common.collect.ImmutableList r0 = r7.A0H()
            if (r0 == 0) goto L_0x0532
            com.google.common.collect.ImmutableList r0 = r7.A0H()
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x0532
            com.google.common.collect.ImmutableList r0 = r7.A0H()
            java.lang.Object r0 = r0.get(r3)
            X.3tC r0 = (X.C254873tC) r0
            java.lang.String r0 = r0.A1L
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r18 == 0) goto L_0x0518
            r1 = 2131958832(0x7f131c30, float:1.9554287E38)
            if (r0 == 0) goto L_0x001b
            r1 = 2131958829(0x7f131c2d, float:1.9554281E38)
            goto L_0x001b
        L_0x0518:
            if (r17 == 0) goto L_0x0528
            if (r20 == 0) goto L_0x0528
            if (r2 == 0) goto L_0x0528
            r1 = 2131958833(0x7f131c31, float:1.955429E38)
            if (r0 == 0) goto L_0x0b50
            r1 = 2131958830(0x7f131c2e, float:1.9554283E38)
            goto L_0x0b50
        L_0x0528:
            r1 = 2131958831(0x7f131c2f, float:1.9554285E38)
            if (r0 == 0) goto L_0x001b
            r1 = 2131958828(0x7f131c2c, float:1.955428E38)
            goto L_0x001b
        L_0x0532:
            if (r18 == 0) goto L_0x0539
            r1 = 2131959581(0x7f131f1d, float:1.9555806E38)
            goto L_0x001b
        L_0x0539:
            if (r17 == 0) goto L_0x0544
            if (r20 == 0) goto L_0x0544
            if (r2 == 0) goto L_0x0544
            r1 = 2131959582(0x7f131f1e, float:1.9555809E38)
            goto L_0x0b50
        L_0x0544:
            r1 = 2131959580(0x7f131f1c, float:1.9555804E38)
            goto L_0x001b
        L_0x0549:
            if (r18 == 0) goto L_0x0550
            r1 = 2131959444(0x7f131e94, float:1.9555529E38)
            goto L_0x001b
        L_0x0550:
            if (r17 == 0) goto L_0x055b
            if (r20 == 0) goto L_0x055b
            if (r2 == 0) goto L_0x055b
            r1 = 2131959443(0x7f131e93, float:1.9555527E38)
            goto L_0x0b50
        L_0x055b:
            r1 = 2131959442(0x7f131e92, float:1.9555525E38)
            goto L_0x001b
        L_0x0560:
            if (r18 == 0) goto L_0x0567
            r1 = 2131960346(0x7f13221a, float:1.9557358E38)
            goto L_0x001b
        L_0x0567:
            if (r17 == 0) goto L_0x0572
            if (r20 == 0) goto L_0x0572
            if (r2 == 0) goto L_0x0572
            r1 = 2131960345(0x7f132219, float:1.9557356E38)
            goto L_0x0b50
        L_0x0572:
            r1 = 2131960344(0x7f132218, float:1.9557354E38)
            goto L_0x001b
        L_0x0577:
            if (r18 == 0) goto L_0x057e
            r1 = 2131958664(0x7f131b88, float:1.9553947E38)
            goto L_0x001b
        L_0x057e:
            if (r17 == 0) goto L_0x0587
            if (r2 == 0) goto L_0x0587
            r1 = 2131958662(0x7f131b86, float:1.9553943E38)
            goto L_0x0b50
        L_0x0587:
            r1 = 2131958663(0x7f131b87, float:1.9553945E38)
            goto L_0x001b
        L_0x058c:
            if (r18 == 0) goto L_0x0593
            r1 = 2131958914(0x7f131c82, float:1.9554454E38)
            goto L_0x001b
        L_0x0593:
            if (r17 == 0) goto L_0x059e
            if (r20 == 0) goto L_0x059e
            if (r2 == 0) goto L_0x059e
            r1 = 2131958915(0x7f131c83, float:1.9554456E38)
            goto L_0x0b50
        L_0x059e:
            r1 = 2131958913(0x7f131c81, float:1.9554452E38)
            goto L_0x001b
        L_0x05a3:
            if (r18 == 0) goto L_0x05aa
            r1 = 2131959282(0x7f131df2, float:1.95552E38)
            goto L_0x001b
        L_0x05aa:
            r1 = 2131959281(0x7f131df1, float:1.9555198E38)
            goto L_0x0b50
        L_0x05af:
            if (r18 == 0) goto L_0x05b6
            r1 = 2131958777(0x7f131bf9, float:1.9554176E38)
            goto L_0x001b
        L_0x05b6:
            if (r17 == 0) goto L_0x05c1
            if (r20 == 0) goto L_0x05c1
            if (r2 == 0) goto L_0x05c1
            r1 = 2131958778(0x7f131bfa, float:1.9554178E38)
            goto L_0x0b50
        L_0x05c1:
            r1 = 2131958776(0x7f131bf8, float:1.9554174E38)
            goto L_0x001b
        L_0x05c6:
            r1 = 2131959726(0x7f131fae, float:1.95561E38)
            if (r18 == 0) goto L_0x001b
            r1 = 2131959727(0x7f131faf, float:1.9556103E38)
            goto L_0x001b
        L_0x05d0:
            r1 = 2131960212(0x7f132194, float:1.9557086E38)
            if (r18 == 0) goto L_0x001b
            r1 = 2131960210(0x7f132192, float:1.9557082E38)
            goto L_0x001b
        L_0x05da:
            r1 = 2131960211(0x7f132193, float:1.9557084E38)
            if (r18 == 0) goto L_0x001b
            r1 = 2131960209(0x7f132191, float:1.955708E38)
            goto L_0x001b
        L_0x05e4:
            if (r18 == 0) goto L_0x05eb
            r1 = 2131959147(0x7f131d6b, float:1.9554926E38)
            goto L_0x001b
        L_0x05eb:
            if (r17 == 0) goto L_0x05f2
            r1 = 2131959117(0x7f131d4d, float:1.9554865E38)
            goto L_0x0b50
        L_0x05f2:
            r1 = 2131959093(0x7f131d35, float:1.9554817E38)
            goto L_0x001b
        L_0x05f7:
            r6.getClass()
            X.7FN r6 = (X.AnonymousClass7FN) r6
            X.7Q3 r1 = r6.A01
            r1.getClass()
            X.7Q3 r0 = X.AnonymousClass7Q3.COUNTDOWN
            r16 = 0
            if (r1 != r0) goto L_0x0609
            r16 = 1
        L_0x0609:
            X.7Q3 r1 = r6.A01
            r1.getClass()
            X.7Q3 r0 = X.AnonymousClass7Q3.SMB_SUPPORT
            r15 = 0
            if (r1 != r0) goto L_0x0614
            r15 = 1
        L_0x0614:
            X.7Q3 r1 = r6.A01
            r1.getClass()
            X.7Q3 r0 = X.AnonymousClass7Q3.MENTION
            r14 = 0
            if (r1 != r0) goto L_0x061f
            r14 = 1
        L_0x061f:
            X.7Q3 r1 = r6.A01
            r1.getClass()
            X.7Q3 r0 = X.AnonymousClass7Q3.EMOJI_REACTION
            r13 = 0
            if (r1 != r0) goto L_0x062a
            r13 = 1
        L_0x062a:
            com.instagram.model.reels.ReelType r1 = com.instagram.model.reels.ReelType.A0P
            com.instagram.model.reels.ReelType r0 = r6.A04
            r0.getClass()
            r12 = 0
            if (r1 != r0) goto L_0x0635
            r12 = 1
        L_0x0635:
            java.lang.String r1 = r11.getId()
            java.lang.String r0 = r6.A09
            boolean r11 = r1.equals(r0)
            X.7Q3 r1 = r6.A01
            r1.getClass()
            X.7Q3 r0 = X.AnonymousClass7Q3.QUESTION_RESPONSE
            r9 = 0
            if (r1 != r0) goto L_0x064a
            r9 = 1
        L_0x064a:
            X.OFF r0 = r6.A00
            if (r0 == 0) goto L_0x0653
            java.lang.String r1 = r0.A00
            r0 = 1
            if (r1 != 0) goto L_0x0654
        L_0x0653:
            r0 = 0
        L_0x0654:
            if (r16 == 0) goto L_0x0660
            r1 = 2131959108(0x7f131d44, float:1.9554847E38)
            if (r18 == 0) goto L_0x001b
            r1 = 2131959161(0x7f131d79, float:1.9554955E38)
            goto L_0x001b
        L_0x0660:
            if (r15 == 0) goto L_0x0670
            r1 = 2131959109(0x7f131d45, float:1.955485E38)
            if (r18 == 0) goto L_0x066a
            r1 = 2131959162(0x7f131d7a, float:1.9554957E38)
        L_0x066a:
            java.lang.Object[] r4 = new java.lang.Object[r10]
            java.lang.String r6 = r6.A0A
            goto L_0x0ab8
        L_0x0670:
            if (r14 == 0) goto L_0x06ce
            java.lang.String r0 = r6.A00(r8)
            if (r18 == 0) goto L_0x070b
            if (r0 == 0) goto L_0x0685
            r1 = 2131959138(0x7f131d62, float:1.9554908E38)
            java.lang.Object[] r4 = new java.lang.Object[r10]
            java.lang.String r6 = r6.A00(r8)
            goto L_0x0ab8
        L_0x0685:
            java.util.List r2 = r6.A02(r8)
            if (r2 == 0) goto L_0x0700
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x0700
            int r0 = r2.size()
            if (r0 != r10) goto L_0x06a2
            r1 = 2131959139(0x7f131d63, float:1.955491E38)
            java.lang.Object[] r4 = new java.lang.Object[r10]
            java.lang.Object r6 = r2.get(r3)
            goto L_0x0ab8
        L_0x06a2:
            int r1 = r2.size()
            r0 = 2
            if (r1 != r0) goto L_0x06b9
            r1 = 2131959137(0x7f131d61, float:1.9554906E38)
            java.lang.Object[] r4 = new java.lang.Object[r0]
            java.lang.Object r0 = r2.get(r3)
            r4[r3] = r0
            java.lang.Object r0 = r2.get(r10)
            goto L_0x06ee
        L_0x06b9:
            r1 = 2131959134(0x7f131d5e, float:1.95549E38)
            java.lang.Object[] r4 = new java.lang.Object[r0]
            java.lang.Object r0 = r2.get(r3)
            r4[r3] = r0
            int r0 = r2.size()
            int r0 = r0 - r10
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x06ee
        L_0x06ce:
            if (r13 == 0) goto L_0x0715
            if (r18 == 0) goto L_0x06f2
            r1 = 2131959141(0x7f131d65, float:1.9554914E38)
            if (r17 != 0) goto L_0x066a
            r1 = 2131959143(0x7f131d67, float:1.9554918E38)
            r0 = 2
            java.lang.Object[] r4 = new java.lang.Object[r0]
            X.1Xj r0 = r6.A02
            com.instagram.user.model.User r0 = r0.A2A(r8)
            r0.getClass()
            java.lang.String r0 = X.AnonymousClass50n.A07(r0)
            r4[r3] = r0
        L_0x06ec:
            java.lang.String r0 = r6.A0A
        L_0x06ee:
            r4[r10] = r0
            goto L_0x0b54
        L_0x06f2:
            r1 = 2131959073(0x7f131d21, float:1.9554776E38)
            if (r17 == 0) goto L_0x066a
            r1 = 2131959115(0x7f131d4b, float:1.9554861E38)
            r0 = 2
            java.lang.Object[] r4 = new java.lang.Object[r0]
            r4[r3] = r2
            goto L_0x06ec
        L_0x0700:
            r1 = 2131959139(0x7f131d63, float:1.955491E38)
            java.lang.Object[] r4 = new java.lang.Object[r10]
            java.lang.String r6 = r6.A01(r8)
            goto L_0x0ab8
        L_0x070b:
            r1 = 2131959110(0x7f131d46, float:1.9554851E38)
            if (r0 != 0) goto L_0x001b
        L_0x0710:
            r1 = 2131959066(0x7f131d1a, float:1.9554762E38)
            goto L_0x001b
        L_0x0715:
            if (r12 == 0) goto L_0x072f
            if (r18 == 0) goto L_0x0aca
            if (r11 != 0) goto L_0x0abc
            r1 = 2131959146(0x7f131d6a, float:1.9554924E38)
        L_0x071e:
            java.lang.Object[] r4 = new java.lang.Object[r10]
            X.1Xj r0 = r6.A02
            com.instagram.user.model.User r0 = r0.A2A(r8)
            r0.getClass()
            java.lang.String r6 = X.AnonymousClass50n.A07(r0)
            goto L_0x0ab8
        L_0x072f:
            if (r9 == 0) goto L_0x073b
            r1 = 2131959113(0x7f131d49, float:1.9554857E38)
            if (r18 == 0) goto L_0x001b
            r1 = 2131959133(0x7f131d5d, float:1.9554898E38)
            goto L_0x001b
        L_0x073b:
            if (r0 == 0) goto L_0x0747
            r1 = 2131960186(0x7f13217a, float:1.9557034E38)
            if (r18 == 0) goto L_0x001b
            r1 = 2131960185(0x7f132179, float:1.9557032E38)
            goto L_0x001b
        L_0x0747:
            if (r11 != 0) goto L_0x0754
            if (r18 == 0) goto L_0x074f
            r1 = 2131959145(0x7f131d69, float:1.9554922E38)
            goto L_0x071e
        L_0x074f:
            r1 = 2131959087(0x7f131d2f, float:1.9554805E38)
            goto L_0x001b
        L_0x0754:
            boolean r0 = r7.A1M()
            if (r0 != 0) goto L_0x0775
            java.util.List r0 = r7.A0v()
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x0775
            monitor-enter(r7)
            X.4ik r0 = r7.A0d     // Catch:{ all -> 0x0b96 }
            if (r0 == 0) goto L_0x0770
            X.1Xj r1 = r0.A05     // Catch:{ all -> 0x0b96 }
            r0 = 1
            if (r1 != 0) goto L_0x0771
        L_0x0770:
            r0 = 0
        L_0x0771:
            monitor-exit(r7)
            r1 = 0
            if (r0 == 0) goto L_0x0776
        L_0x0775:
            r1 = 1
        L_0x0776:
            java.lang.String r0 = r7.A1q
            if (r0 == 0) goto L_0x077b
            r4 = r0
        L_0x077b:
            if (r1 == 0) goto L_0x0798
            if (r18 == 0) goto L_0x078a
            if (r17 == 0) goto L_0x07ad
            r1 = 2131959141(0x7f131d65, float:1.9554914E38)
        L_0x0784:
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            goto L_0x0b54
        L_0x078a:
            r1 = 2131959073(0x7f131d21, float:1.9554776E38)
            if (r17 == 0) goto L_0x0784
            r1 = 2131959115(0x7f131d4b, float:1.9554861E38)
            java.lang.Object[] r4 = new java.lang.Object[]{r2, r4}
            goto L_0x0b54
        L_0x0798:
            if (r17 == 0) goto L_0x07a1
            if (r18 == 0) goto L_0x07b2
            r1 = 2131959144(0x7f131d68, float:1.955492E38)
            goto L_0x001b
        L_0x07a1:
            if (r18 != 0) goto L_0x0abc
            X.2FW r1 = r7.A0z
            X.2FW r0 = X.2FW.A0m
            if (r1 != r0) goto L_0x07b7
            r1 = 2131959075(0x7f131d23, float:1.955478E38)
            goto L_0x0784
        L_0x07ad:
            r1 = 2131959142(0x7f131d66, float:1.9554916E38)
            goto L_0x001b
        L_0x07b2:
            r1 = 2131959116(0x7f131d4c, float:1.9554863E38)
            goto L_0x0b50
        L_0x07b7:
            r1 = 2131959092(0x7f131d34, float:1.9554815E38)
            goto L_0x001b
        L_0x07bc:
            r6.getClass()
            X.7FJ r6 = (X.AnonymousClass7FJ) r6
            com.instagram.model.reels.ReelType r1 = r6.A02
            com.instagram.model.reels.ReelType r0 = com.instagram.model.reels.ReelType.A0P
            if (r1 != r0) goto L_0x07da
            if (r18 == 0) goto L_0x07ce
            r1 = 2131960405(0x7f132255, float:1.9557478E38)
            goto L_0x001b
        L_0x07ce:
            if (r17 == 0) goto L_0x07d5
            r1 = 2131960397(0x7f13224d, float:1.9557462E38)
            goto L_0x0b50
        L_0x07d5:
            r1 = 2131960401(0x7f132251, float:1.955747E38)
            goto L_0x001b
        L_0x07da:
            if (r18 == 0) goto L_0x07e1
            r1 = 2131960426(0x7f13226a, float:1.955752E38)
            goto L_0x001b
        L_0x07e1:
            if (r17 == 0) goto L_0x07ea
            if (r20 == 0) goto L_0x07ea
            r1 = 2131960416(0x7f132260, float:1.95575E38)
            goto L_0x0b50
        L_0x07ea:
            r1 = 2131960421(0x7f132265, float:1.955751E38)
            goto L_0x001b
        L_0x07ef:
            r6.getClass()
            X.46n r6 = (X.C2606546n) r6
            java.lang.String r2 = r6.A04
            if (r2 == 0) goto L_0x0824
            java.lang.String r0 = A00
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0808
            r0 = 2131959061(0x7f131d15, float:1.9554752E38)
            java.lang.String r6 = r5.getString(r0)
            return r6
        L_0x0808:
            r4 = 2131959163(0x7f131d7b, float:1.9554959E38)
            goto L_0x087c
        L_0x080c:
            com.google.common.collect.ImmutableList r1 = r7.A0H()
            if (r1 == 0) goto L_0x0827
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0827
            java.lang.Object r0 = r1.get(r3)
            X.3tC r0 = (X.C254873tC) r0
            if (r0 == 0) goto L_0x0827
            X.46n r6 = r0.A0O
            if (r6 == 0) goto L_0x0827
        L_0x0824:
            java.lang.String r6 = r6.A03
            return r6
        L_0x0827:
            r1 = 2131959070(0x7f131d1e, float:1.955477E38)
            goto L_0x001b
        L_0x082c:
            r6.getClass()
            X.JwA r6 = (X.C61072JwA) r6
            java.lang.Object r7 = r6.A02
            X.N49 r7 = (X.N49) r7
            int r1 = r6.A01
            r0 = 2
            if (r1 != r10) goto L_0x0850
            if (r7 == 0) goto L_0x084e
            java.lang.String r0 = r7.A01
            if (r0 == 0) goto L_0x084e
        L_0x0840:
            r4 = 2131955083(0x7f130d8b, float:1.9546683E38)
            if (r18 != 0) goto L_0x0a53
            r4 = 2131955082(0x7f130d8a, float:1.9546681E38)
            java.lang.Object[] r1 = new java.lang.Object[]{r2, r0}
            goto L_0x0907
        L_0x084e:
            r0 = r4
            goto L_0x0840
        L_0x0850:
            if (r1 != r0) goto L_0x0b99
            if (r7 == 0) goto L_0x085f
            java.lang.String r1 = r7.A00
            java.lang.String r0 = "screen_recording"
            boolean r0 = X.2PP.A00(r1, r0)
            r1 = 1
            if (r0 != 0) goto L_0x0860
        L_0x085f:
            r1 = 0
        L_0x0860:
            if (r18 == 0) goto L_0x086c
            r0 = 2131961736(0x7f132788, float:1.9560177E38)
            if (r1 == 0) goto L_0x0988
            r0 = 2131961733(0x7f132785, float:1.9560171E38)
            goto L_0x0988
        L_0x086c:
            if (r2 == 0) goto L_0x0882
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x0882
            r4 = 2131961735(0x7f132787, float:1.9560175E38)
            if (r1 == 0) goto L_0x087c
            r4 = 2131961732(0x7f132784, float:1.956017E38)
        L_0x087c:
            java.lang.Object[] r1 = new java.lang.Object[]{r2}
            goto L_0x0907
        L_0x0882:
            r0 = 2131961737(0x7f132789, float:1.956018E38)
            if (r1 == 0) goto L_0x0988
            r0 = 2131961734(0x7f132786, float:1.9560173E38)
            goto L_0x0988
        L_0x088c:
            java.lang.Object r0 = r7.A1T
            boolean r0 = r0 instanceof X.C2814857z
            X.17k.A0E(r0)
            java.lang.Object r0 = r7.A1T
            r0.getClass()
            X.57z r0 = (X.C2814857z) r0
            java.lang.String r6 = r0.A03
            if (r6 != 0) goto L_0x09a7
            java.lang.String r6 = r0.A00(r5)
            return r6
        L_0x08a3:
            java.lang.Object r1 = r7.A1T
            r0 = 6
            boolean r0 = X.AnonymousClass9J6.A00(r0, r1)
            X.17k.A0E(r0)
            java.lang.Object r0 = r7.A1T
            X.9J6 r0 = (X.AnonymousClass9J6) r0
            java.lang.String r6 = r0.A01
            if (r6 != 0) goto L_0x09a7
            java.lang.String r6 = r0.A00
            r6.getClass()
            return r6
        L_0x08bb:
            java.lang.Object r1 = r7.A1T
            boolean r0 = r1 instanceof X.C271374ik
            r4 = 7
            if (r0 == 0) goto L_0x0a7f
            X.4ik r1 = (X.C271374ik) r1
            X.4iq r0 = r1.A04
            if (r0 == 0) goto L_0x08cf
            X.1iA r0 = r0.A07
        L_0x08ca:
            X.1iA r1 = X.1iA.A0Q
            r6 = 1
            if (r0 == r1) goto L_0x08d0
        L_0x08cf:
            r6 = 0
        L_0x08d0:
            boolean r0 = r7.A1j(r11)
            if (r0 == 0) goto L_0x0918
            X.4ik r0 = r7.A0e
            if (r0 == 0) goto L_0x0914
            X.5Dg r1 = r0.A03
            if (r1 == 0) goto L_0x0914
            X.4k3 r0 = r1.A02
            int r0 = r0.A00
            java.lang.String r6 = r5.getString(r0)
            int r2 = r1.A00
            X.4k3 r1 = r1.A02
            if (r17 == 0) goto L_0x0979
            if (r2 <= 0) goto L_0x0979
            int r1 = r1.ordinal()
            if (r1 == r4) goto L_0x0910
            r0 = 9
            if (r1 == r0) goto L_0x090c
            r0 = 8
            if (r1 != r0) goto L_0x09a7
            r4 = 2131960705(0x7f132381, float:1.9558086E38)
        L_0x08ff:
            java.lang.Object[] r1 = new java.lang.Object[r10]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
        L_0x0905:
            r1[r3] = r0
        L_0x0907:
            java.lang.String r6 = r5.getString(r4, r1)
            return r6
        L_0x090c:
            r4 = 2131960704(0x7f132380, float:1.9558084E38)
            goto L_0x08ff
        L_0x0910:
            r4 = 2131960703(0x7f13237f, float:1.9558082E38)
            goto L_0x08ff
        L_0x0914:
            r0 = 2131960390(0x7f132246, float:1.9557447E38)
            goto L_0x0988
        L_0x0918:
            java.lang.Object r1 = r7.A1T
            boolean r0 = r1 instanceof X.C271374ik
            if (r0 == 0) goto L_0x0929
            X.4ik r1 = (X.C271374ik) r1
            X.4iq r0 = r1.A04
            if (r0 == 0) goto L_0x0929
            boolean r0 = r0.A0P
            r2 = 1
            if (r0 != 0) goto L_0x092a
        L_0x0929:
            r2 = 0
        L_0x092a:
            if (r17 == 0) goto L_0x0945
            if (r6 == 0) goto L_0x0937
            r4 = 2131959124(0x7f131d54, float:1.955488E38)
        L_0x0931:
            java.lang.Object[] r1 = new java.lang.Object[r10]
            if (r20 != 0) goto L_0x0940
            r0 = 0
            goto L_0x0905
        L_0x0937:
            r4 = 2131959127(0x7f131d57, float:1.9554886E38)
            if (r2 == 0) goto L_0x0931
            r4 = 2131959128(0x7f131d58, float:1.9554888E38)
            goto L_0x0931
        L_0x0940:
            java.lang.String r0 = X.AnonymousClass50n.A07(r20)
            goto L_0x0905
        L_0x0945:
            X.4ik r0 = r7.A0e
            if (r0 == 0) goto L_0x096a
            java.lang.String r1 = r0.A0A
            if (r1 == 0) goto L_0x096a
            java.lang.String r0 = "story_camera_reply"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0966
            java.lang.String r0 = "story_remix_reply"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0966
            r0 = 2131959102(0x7f131d3e, float:1.9554835E38)
            if (r6 == 0) goto L_0x0988
            r0 = 2131959098(0x7f131d3a, float:1.9554827E38)
            goto L_0x0988
        L_0x0966:
            r0 = 2131959092(0x7f131d34, float:1.9554815E38)
            goto L_0x0988
        L_0x096a:
            if (r6 == 0) goto L_0x0970
            r0 = 2131959097(0x7f131d39, float:1.9554825E38)
            goto L_0x0988
        L_0x0970:
            r0 = 2131959100(0x7f131d3c, float:1.955483E38)
            if (r2 == 0) goto L_0x0988
            r0 = 2131959101(0x7f131d3d, float:1.9554833E38)
            goto L_0x0988
        L_0x0979:
            X.4k3 r0 = X.C272074k3.RAVEN_DELIVERED
            if (r1 != r0) goto L_0x09a7
            X.4ik r0 = r7.A0e
            if (r0 == 0) goto L_0x09a7
            java.lang.String r0 = r0.A0A
            if (r0 == 0) goto L_0x09a7
            r0 = 2131959086(0x7f131d2e, float:1.9554802E38)
        L_0x0988:
            java.lang.String r6 = r5.getString(r0)
            return r6
        L_0x098d:
            X.3tC r4 = r7.A0j
            if (r4 == 0) goto L_0x0acf
            java.lang.String r1 = r4.A12
            java.lang.String r0 = "sticker"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x09a8
            java.lang.String r0 = "placeholder"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0acf
            java.lang.String r6 = r4.A1N
            if (r6 == 0) goto L_0x0acf
        L_0x09a7:
            return r6
        L_0x09a8:
            if (r18 != 0) goto L_0x0a7a
            if (r17 == 0) goto L_0x0a75
            if (r20 == 0) goto L_0x0a75
            r4 = 2131959126(0x7f131d56, float:1.9554884E38)
            java.lang.Object[] r1 = new java.lang.Object[r10]
            java.lang.String r0 = X.AnonymousClass50n.A07(r20)
            goto L_0x0a55
        L_0x09b9:
            com.google.common.collect.ImmutableList r0 = r7.A0H()
            if (r0 == 0) goto L_0x0a5c
            com.google.common.collect.ImmutableList r0 = r7.A0H()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0a5c
            com.google.common.collect.ImmutableList r0 = r7.A0H()
            java.lang.Object r0 = r0.get(r3)
            X.3tC r0 = (X.C254873tC) r0
            com.google.common.collect.ImmutableList r0 = r0.A01()
            if (r0 == 0) goto L_0x0a5c
            com.google.common.collect.ImmutableList r0 = r7.A0H()
            java.lang.Object r0 = r0.get(r3)
            X.3tC r0 = (X.C254873tC) r0
            com.google.common.collect.ImmutableList r0 = r0.A01()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0a5c
            com.google.common.collect.ImmutableList r0 = r7.A0H()
            java.lang.Object r0 = r0.get(r3)
            X.3tC r0 = (X.C254873tC) r0
            com.google.common.collect.ImmutableList r0 = r0.A01()
            java.lang.Object r0 = r0.get(r3)
            X.9JN r0 = (X.AnonymousClass9JN) r0
            java.lang.String r0 = r0.A02
            if (r0 == 0) goto L_0x0a5c
            com.google.common.collect.ImmutableList r0 = r7.A0H()
            java.lang.Object r0 = r0.get(r3)
            X.3tC r0 = (X.C254873tC) r0
            com.google.common.collect.ImmutableList r0 = r0.A01()
            java.lang.Object r0 = r0.get(r3)
            X.9JN r0 = (X.AnonymousClass9JN) r0
            java.lang.String r0 = r0.A02
            android.net.Uri r6 = X.0cp.A03(r0)
            java.lang.String r1 = r6.getHost()
            java.lang.String r0 = "comments"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0a5c
            java.lang.String r0 = "is_tag"
            boolean r0 = r6.getBooleanQueryParameter(r0, r3)
            if (r0 == 0) goto L_0x0a59
            java.lang.Integer r1 = X.AnonymousClass05K.A00
        L_0x0a35:
            if (r1 == 0) goto L_0x0a87
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0a63
            if (r18 == 0) goto L_0x0a5e
            com.google.common.collect.ImmutableList r0 = r7.A0H()
            r0.getClass()
            java.lang.Object r0 = r0.get(r3)
            X.3tC r0 = (X.C254873tC) r0
            java.lang.String r0 = r0.A1N
            r4 = 2131959055(0x7f131d0f, float:1.955474E38)
        L_0x0a53:
            java.lang.Object[] r1 = new java.lang.Object[r10]
        L_0x0a55:
            r1[r3] = r0
            goto L_0x0907
        L_0x0a59:
            java.lang.Integer r1 = X.AnonymousClass05K.A01
            goto L_0x0a35
        L_0x0a5c:
            r1 = 0
            goto L_0x0a35
        L_0x0a5e:
            r0 = 2131959054(0x7f131d0e, float:1.9554738E38)
            goto L_0x0988
        L_0x0a63:
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0bc5
            r0 = 2131959053(0x7f131d0d, float:1.9554736E38)
            if (r18 == 0) goto L_0x0988
            r0 = 2131959057(0x7f131d11, float:1.9554744E38)
            goto L_0x0988
        L_0x0a75:
            r0 = 2131959099(0x7f131d3b, float:1.9554829E38)
            goto L_0x0988
        L_0x0a7a:
            r0 = 2131959153(0x7f131d71, float:1.9554938E38)
            goto L_0x0988
        L_0x0a7f:
            if (r1 == 0) goto L_0x08cf
            X.7Qt r1 = (X.C331377Qt) r1
            X.1iA r0 = r1.A01
            goto L_0x08ca
        L_0x0a87:
            if (r18 == 0) goto L_0x0ac1
            X.2FW r1 = r7.A0z
            X.2FW r0 = X.2FW.A1g
            if (r1 != r0) goto L_0x0abc
            if (r14 == 0) goto L_0x0ab1
            java.lang.String r2 = r7.A1q
            if (r2 == 0) goto L_0x0ab1
            X.79a r1 = X.C3270179a.A00
            X.UVA r0 = r7.A0l
            java.lang.CharSequence r3 = r1.A00(r9, r0, r8, r2)
            java.util.Locale r2 = X.AnonymousClass1Q2.A02()
            r0 = 2131959154(0x7f131d72, float:1.955494E38)
            java.lang.String r1 = r5.getString(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r3}
            android.text.SpannedString r4 = X.C11122SBb.A00(r1, r2, r0)
            return r4
        L_0x0ab1:
            r1 = 2131959154(0x7f131d72, float:1.955494E38)
            java.lang.Object[] r4 = new java.lang.Object[r10]
            java.lang.String r6 = r7.A1q
        L_0x0ab8:
            r4[r3] = r6
            goto L_0x0b54
        L_0x0abc:
            r1 = 2131959151(0x7f131d6f, float:1.9554934E38)
            goto L_0x001b
        L_0x0ac1:
            if (r17 == 0) goto L_0x0aca
            if (r20 == 0) goto L_0x0aca
            r1 = 2131959123(0x7f131d53, float:1.9554878E38)
            goto L_0x0b50
        L_0x0aca:
            r1 = 2131959096(0x7f131d38, float:1.9554823E38)
            goto L_0x001b
        L_0x0acf:
            if (r18 == 0) goto L_0x0ad6
            r1 = 2131960771(0x7f1323c3, float:1.955822E38)
            goto L_0x001b
        L_0x0ad6:
            if (r17 == 0) goto L_0x0ae0
            if (r20 == 0) goto L_0x0ae0
            if (r2 == 0) goto L_0x0ae0
            r1 = 2131960770(0x7f1323c2, float:1.9558218E38)
            goto L_0x0b50
        L_0x0ae0:
            r1 = 2131960769(0x7f1323c1, float:1.9558216E38)
            goto L_0x001b
        L_0x0ae5:
            X.5FV r1 = r7.A0G()
            X.5FV r0 = X.AnonymousClass5FV.GiftWrap
            if (r1 != r0) goto L_0x0af4
            if (r18 == 0) goto L_0x0b4b
            r1 = 2131959157(0x7f131d75, float:1.9554947E38)
            goto L_0x001b
        L_0x0af4:
            java.lang.String r3 = ": "
            if (r14 == 0) goto L_0x0b3f
            boolean r0 = r6 instanceof java.lang.CharSequence
            if (r0 == 0) goto L_0x0b3f
            X.79a r1 = X.C3270179a.A00
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            X.UVA r0 = r7.A0l
            java.lang.CharSequence r4 = r1.A00(r9, r0, r8, r6)
            if (r17 == 0) goto L_0x0b23
            if (r18 == 0) goto L_0x0b1e
            java.util.Locale r2 = X.AnonymousClass1Q2.A02()
            r0 = 2131959154(0x7f131d72, float:1.955494E38)
            java.lang.String r1 = r5.getString(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r4}
            android.text.SpannedString r4 = X.C11122SBb.A00(r1, r2, r0)
            return r4
        L_0x0b1e:
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            goto L_0x0b2f
        L_0x0b23:
            if (r15 == 0) goto L_0x001f
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x001f
            boolean r0 = r19.CQq()
        L_0x0b2f:
            if (r0 != 0) goto L_0x001f
            android.text.SpannableStringBuilder r0 = new android.text.SpannableStringBuilder
            r0.<init>(r2)
            android.text.SpannableStringBuilder r0 = r0.append(r3)
            android.text.SpannableStringBuilder r4 = r0.append(r4)
            return r4
        L_0x0b3f:
            if (r17 == 0) goto L_0x0b9f
            if (r18 == 0) goto L_0x0b9c
            r1 = 2131959154(0x7f131d72, float:1.955494E38)
            java.lang.Object[] r4 = new java.lang.Object[]{r6}
            goto L_0x0b54
        L_0x0b4b:
            if (r2 == 0) goto L_0x0b59
            r1 = 2131959079(0x7f131d27, float:1.9554788E38)
        L_0x0b50:
            java.lang.Object[] r4 = new java.lang.Object[]{r2}
        L_0x0b54:
            java.lang.String r4 = r5.getString(r1, r4)
            return r4
        L_0x0b59:
            r1 = 2131959078(0x7f131d26, float:1.9554786E38)
            goto L_0x001b
        L_0x0b5e:
            if (r6 == 0) goto L_0x0bc6
            java.util.List r6 = (java.util.List) r6
            int r0 = r6.size()
            if (r0 < r10) goto L_0x0bc6
            java.lang.Object r0 = r6.get(r3)
            X.3tC r0 = (X.C254873tC) r0
            java.lang.String r0 = r0.A1N
            if (r0 == 0) goto L_0x0bc6
            java.lang.String r1 = " sent "
            java.lang.Object r0 = r6.get(r3)
            X.3tC r0 = (X.C254873tC) r0
            java.lang.String r0 = r0.A1N
            java.lang.String r4 = X.002.A0g(r2, r1, r0)
            return r4
        L_0x0b81:
            java.lang.String r4 = A02(r7)
            return r4
        L_0x0b86:
            java.lang.String r4 = A01(r7)
            return r4
        L_0x0b8b:
            java.lang.String r4 = A00
            return r4
        L_0x0b8e:
            java.lang.String r1 = "Unexpected content object type for message with content type MEDIA"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0b96:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        L_0x0b99:
            java.lang.String r6 = " "
            return r6
        L_0x0b9c:
            if (r20 == 0) goto L_0x0bc0
            goto L_0x0bad
        L_0x0b9f:
            if (r15 == 0) goto L_0x0bc0
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x0bc0
            boolean r0 = r19.CQq()
            if (r0 != 0) goto L_0x0bc0
        L_0x0bad:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            r0.append(r3)
            r0.append(r6)
            java.lang.String r4 = r0.toString()
            return r4
        L_0x0bc0:
            if (r6 == 0) goto L_0x0bc5
            java.lang.String r6 = (java.lang.String) r6
            return r6
        L_0x0bc5:
            return r4
        L_0x0bc6:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66713MbK.A00(android.content.Context, com.instagram.common.session.UserSession, X.3su, X.2Ep, com.instagram.user.model.User):java.lang.CharSequence");
    }
}
