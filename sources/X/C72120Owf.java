package X;

import go.Seq;

/* renamed from: X.Owf  reason: case insensitive filesystem */
public final class C72120Owf implements AnonymousClass68Z {
    public final int A00;
    public final Object A01;

    public C72120Owf(Long l, int i) {
        this.A00 = i;
        switch (i) {
            case 53:
            case 55:
                this.A01 = l;
                return;
            default:
                this.A01 = l;
                return;
        }
    }

    public static 1aU A00(1aU r1, Object obj, int i) {
        return r1.A0L(new C72120Owf(obj, i));
    }

    public static 1aU A01(1aU r1, Object obj, int i) {
        return r1.A0M(new C72120Owf(obj, i));
    }

    public static 1aU A02(1aU r1, 0sP r2, int i) {
        return r1.A0M(new C72120Owf(i, r2));
    }

    public static 1aU A03(1aU r1, 0sP r2, int i) {
        return r1.A0K(new C72120Owf(i, r2));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v109, resolved type: X.OyT} */
    /* JADX WARNING: type inference failed for: r6v0, types: [X.OFl, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0353, code lost:
        if (X.JTQ.A1T(r10, r1) == false) goto L_0x0355;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x03f0, code lost:
        if (r4 == 8) goto L_0x03f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0402, code lost:
        if (X.JTQ.A1T(r7, r1) == false) goto L_0x0404;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x043a, code lost:
        if (r6 == 8) goto L_0x043c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x051f, code lost:
        if (X.C66642MaB.A00(r8, r2.A01, r9) == false) goto L_0x0521;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object apply(java.lang.Object r83) {
        /*
            r82 = this;
            r5 = r82
            r1 = r83
            int r0 = r5.A00
            switch(r0) {
                case 0: goto L_0x0c10;
                case 1: goto L_0x0bf0;
                case 2: goto L_0x0bde;
                case 3: goto L_0x0bce;
                case 4: goto L_0x0bb0;
                case 5: goto L_0x0b89;
                case 6: goto L_0x0b7e;
                case 7: goto L_0x0b71;
                case 8: goto L_0x0b53;
                case 9: goto L_0x0b34;
                case 10: goto L_0x0b0b;
                case 11: goto L_0x0af2;
                case 12: goto L_0x0a84;
                case 13: goto L_0x0a5a;
                case 14: goto L_0x0a34;
                case 15: goto L_0x0a28;
                case 16: goto L_0x0a1c;
                case 17: goto L_0x09e6;
                case 18: goto L_0x09d6;
                case 19: goto L_0x09ca;
                case 20: goto L_0x099f;
                case 21: goto L_0x0009;
                case 22: goto L_0x0009;
                case 23: goto L_0x0986;
                case 24: goto L_0x0009;
                case 25: goto L_0x0009;
                case 26: goto L_0x096c;
                case 27: goto L_0x093d;
                case 28: goto L_0x0862;
                case 29: goto L_0x027c;
                case 30: goto L_0x0853;
                case 31: goto L_0x080c;
                case 32: goto L_0x0009;
                case 33: goto L_0x0047;
                case 34: goto L_0x0009;
                case 35: goto L_0x07fb;
                case 36: goto L_0x0009;
                case 37: goto L_0x07ef;
                case 38: goto L_0x07ef;
                case 39: goto L_0x0796;
                case 40: goto L_0x0009;
                case 41: goto L_0x0009;
                case 42: goto L_0x0009;
                case 43: goto L_0x0009;
                case 44: goto L_0x0009;
                case 45: goto L_0x0009;
                case 46: goto L_0x0009;
                case 47: goto L_0x0785;
                case 48: goto L_0x0774;
                case 49: goto L_0x0763;
                case 50: goto L_0x074d;
                case 51: goto L_0x073c;
                case 52: goto L_0x072b;
                case 53: goto L_0x0713;
                case 54: goto L_0x0704;
                case 55: goto L_0x06ec;
                case 56: goto L_0x0009;
                case 57: goto L_0x0009;
                case 58: goto L_0x0009;
                case 59: goto L_0x06e9;
                case 60: goto L_0x0009;
                case 61: goto L_0x06e9;
                case 62: goto L_0x0009;
                case 63: goto L_0x0009;
                case 64: goto L_0x0009;
                case 65: goto L_0x06dc;
                case 66: goto L_0x0012;
                case 67: goto L_0x0009;
                case 68: goto L_0x0009;
                case 69: goto L_0x02d6;
                case 70: goto L_0x02bb;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.Object r0 = r5.A01
            X.0sP r0 = (X.0sP) r0
            java.lang.Object r0 = r0.invoke(r1)
        L_0x0011:
            return r0
        L_0x0012:
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r0 = r5.A01
            X.Ne6 r0 = (X.C69067Ne6) r0
            com.instagram.common.session.UserSession r0 = r0.A03
            java.lang.String r6 = r0.A06
            X.0qQ.A0A(r1)
            java.util.ArrayList r0 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r5 = r1.iterator()
        L_0x0027:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L_0x0011
            java.lang.Object r4 = r5.next()
            r3 = r4
            X.Mb9 r3 = (X.C66702Mb9) r3
            int r2 = r3.A04
            r1 = 29
            if (r2 != r1) goto L_0x0043
            java.lang.String r1 = r3.A0P
            boolean r1 = r6.equals(r1)
            if (r1 == 0) goto L_0x0043
            goto L_0x0027
        L_0x0043:
            r0.add(r4)
            goto L_0x0027
        L_0x0047:
            X.Mf6 r1 = (X.Mf6) r1
            r4 = 0
            X.0qQ.A0B(r1, r4)
            java.lang.Object r0 = r5.A01
            X.MfW r0 = (X.C66937MfW) r0
            X.Mkk r3 = r0.A0B
            X.Pwi r2 = r1.A01
            X.2EM r0 = r1.A00
            r30 = r0
            boolean r0 = r1.A03
            r44 = r0
            boolean r0 = r1.A06
            r45 = r0
            boolean r0 = r1.A04
            r46 = r0
            boolean r0 = r1.A05
            r47 = r0
            X.3sy r0 = r1.A02
            r50 = r0
            r12 = 1
            if (r2 == 0) goto L_0x0c4f
            X.MiR r0 = r3.A05
            X.34p r0 = r0.A00
            r21 = r0
            if (r0 == 0) goto L_0x007b
            r21.A04()
        L_0x007b:
            int r0 = r2.getCount()
            X.2HY r0 = X.C229632nm.A0C(r4, r0)
            java.util.ArrayList r7 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r6 = r0.iterator()
        L_0x008b:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x00ac
            r0 = r6
            X.0sh r0 = (X.0sh) r0
            int r5 = r0.A00()
            X.OIs r1 = X.C72583PBo.A0W
            com.instagram.common.session.UserSession r0 = r3.A01
            X.PBo r1 = r1.A00(r0, r2, r5)
            boolean r0 = r1.A0A
            if (r0 != 0) goto L_0x008b
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            X.AnonymousClass7TF.A1I(r0, r1, r7)
            goto L_0x008b
        L_0x00ac:
            java.util.ArrayList r0 = X.AnonymousClass7TF.A0p(r7)
            java.util.Iterator r20 = r7.iterator()
        L_0x00b4:
            boolean r1 = r20.hasNext()
            if (r1 == 0) goto L_0x0276
            X.0eP r1 = X.JTO.A1A(r20)
            java.lang.Object r5 = r1.A01
            X.PBo r5 = (X.C72583PBo) r5
            int r1 = X.C51970G9q.A0B(r1)
            com.instagram.common.session.UserSession r15 = r3.A01
            com.instagram.user.model.User r33 = X.DbT.A0j(r15)
            r7 = 0
            if (r1 < 0) goto L_0x012c
            int r6 = r2.getCount()
            int r6 = r6 + -1
            if (r1 > r6) goto L_0x012c
            java.lang.String r34 = r2.BxJ(r1)
            if (r34 == 0) goto L_0x012c
            java.lang.String r36 = r2.BKz(r1)
            if (r36 == 0) goto L_0x012c
            java.lang.Long r6 = r2.BL0(r1)
            if (r6 == 0) goto L_0x012c
            long r39 = r6.longValue()
            boolean r41 = r2.CeK(r1)
            java.lang.String r35 = r2.BKy(r1)
            java.lang.Integer r6 = r2.BUH(r1)
            int r38 = X.AnonymousClass7TG.A0A(r6)
            java.lang.String r6 = ""
            java.util.List r6 = X.C253053q8.A07(r6)
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L_0x0129
            X.2FW r32 = X.2FW.A1g
        L_0x010b:
            java.util.List r6 = r2.BrM(r1)
            java.util.ArrayList r8 = X.AnonymousClass7TF.A0p(r6)
            java.util.Iterator r9 = r6.iterator()
        L_0x0117:
            boolean r6 = r9.hasNext()
            if (r6 == 0) goto L_0x012f
            java.lang.Object r6 = r9.next()
            X.ODw r6 = (X.C70625ODw) r6
            java.lang.String r6 = r6.A02
            r8.add(r6)
            goto L_0x0117
        L_0x0129:
            X.2FW r32 = X.2FW.A17
            goto L_0x010b
        L_0x012c:
            r31 = r7
            goto L_0x0136
        L_0x012f:
            X.PBn r31 = new X.PBn
            r37 = r8
            r31.<init>(r32, r33, r34, r35, r36, r37, r38, r39, r41)
        L_0x0136:
            X.1Av r6 = X.1Au.A00(r15)
            boolean r10 = r6.A21()
            X.3mS r6 = r3.A06
            java.util.List r14 = X.C66688Mav.A00(r5, r6, r10)
            r6 = 2
            long[] r8 = new long[r6]
            java.lang.Long r6 = r2.AlG(r1)
            r18 = 0
            long r16 = X.DbY.A04(r6)
            r8[r4] = r16
            java.lang.Long r6 = r2.AlH(r1)
            if (r6 == 0) goto L_0x015d
            long r18 = r6.longValue()
        L_0x015d:
            r8[r12] = r18
            android.os.Parcelable$Creator r6 = com.instagram.direct.capabilities.Capabilities.CREATOR
            X.C376189Gz.A01(r8)
            com.instagram.direct.capabilities.Capabilities r6 = X.AnonymousClass9NQ.A00(r15, r4)
            android.text.SpannableString r23 = r2.Ayo(r1)
            android.content.Context r8 = r3.A00
            r17 = r8
            X.Mi5 r13 = r3.A03
            r40 = r10
            X.0qQ.A0B(r6, r12)
            X.9Gx r11 = X.C376179Gx.SECRET_CHATS
            boolean r8 = r6.A00(r11)
            if (r8 == 0) goto L_0x0189
            X.0eM r8 = r13.A02
            boolean r8 = X.AnonymousClass7TF.A1Z(r8)
            if (r8 != 0) goto L_0x0189
            r40 = 0
        L_0x0189:
            X.3mO r9 = r3.A07
            X.0qQ.A0B(r5, r4)
            r8 = 3
            X.0qQ.A0B(r14, r8)
            boolean r8 = r6.A00(r11)
            r41 = 0
            if (r8 == 0) goto L_0x0264
            X.0eM r8 = r13.A02
            java.lang.Object r8 = r8.getValue()
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto L_0x0264
        L_0x01a8:
            X.PuD r9 = r3.A02
            r16 = 0
            X.9IV r24 = r9.C0v(r7)
            int r8 = r5.A01
            boolean r8 = X.OPx.A00(r8)
            if (r8 != 0) goto L_0x01e8
            java.util.List r8 = r5.BkC()
            int r8 = r8.size()
            if (r8 != r12) goto L_0x025c
            java.util.List r7 = r5.BkC()
            java.lang.Object r7 = r7.get(r4)
            X.170 r7 = (X.AnonymousClass170) r7
            X.17i r11 = X.17h.A00(r15)
            android.os.Parcelable$Creator r8 = com.instagram.user.model.User.CREATOR
            java.lang.String r10 = r7.getId()
            java.lang.String r8 = r7.getUsername()
            com.instagram.user.model.User r7 = new com.instagram.user.model.User
            r7.<init>(r10, r8)
            com.instagram.user.model.User r8 = r11.A01(r7, r4, r4)
            X.MaQ r7 = new X.MaQ
            r7.<init>(r8)
        L_0x01e8:
            com.instagram.model.reels.Reel r35 = r9.Bkv(r7)
            java.lang.Long r7 = r2.C65(r1)
            java.lang.String r10 = java.lang.String.valueOf(r7)
            java.lang.Integer r7 = r2.CAu(r1)
            int r11 = X.AnonymousClass7TG.A0A(r7)
            java.lang.String r9 = r2.CAv(r1)
            if (r9 != 0) goto L_0x0204
            java.lang.String r9 = ""
        L_0x0204:
            X.5uu r8 = new X.5uu
            r7 = r16
            r8.<init>(r7, r10)
            X.42s r7 = new X.42s
            r7.<init>()
            X.MlR r10 = new X.MlR
            r10.<init>(r8, r7, r9, r11)
            java.lang.String r37 = r2.AZc(r1)
            if (r37 == 0) goto L_0x0259
            X.0Tu r9 = X.0Tu.A05
            r7 = 36313222638733127(0x8102af00080747, double:3.027966446121277E-306)
            boolean r7 = X.182.A06(r9, r15, r7)
            if (r7 == 0) goto L_0x0259
        L_0x0228:
            com.instagram.model.direct.threadkey.impl.MsysThreadId r8 = r5.A04
            r7 = r50
            boolean r49 = X.0qQ.A0K(r7, r8)
            X.4AM r7 = r3.A04
            r25 = r15
            r26 = r6
            r27 = r16
            r28 = r13
            r29 = r7
            r32 = r5
            r33 = r10
            r34 = r16
            r36 = r16
            r38 = r14
            r39 = r1
            r42 = r4
            r43 = r4
            r48 = r4
            r22 = r17
            X.Mb9 r1 = X.C66690Max.A00(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49)
            r0.add(r1)
            goto L_0x00b4
        L_0x0259:
            r37 = 0
            goto L_0x0228
        L_0x025c:
            java.lang.String r10 = "msys_thread_row_get_reel"
            java.lang.String r8 = "no members in 1:1 thread"
            X.0wb.A03(r10, r8)
            goto L_0x01e8
        L_0x0264:
            if (r10 == 0) goto L_0x01a8
            boolean r8 = r9.A0D(r14)
            if (r8 != 0) goto L_0x0272
            boolean r8 = r5.COe()
            if (r8 == 0) goto L_0x01a8
        L_0x0272:
            r41 = 1
            goto L_0x01a8
        L_0x0276:
            if (r21 == 0) goto L_0x0011
            r21.A05()
            return r0
        L_0x027c:
            X.MbS r1 = (X.C66721MbS) r1
            r0 = r1
            java.lang.Object r2 = r5.A01
            X.Mgn r2 = (X.C67014Mgn) r2
            com.instagram.common.session.UserSession r3 = r2.A05
            r2 = 0
            boolean r2 = com.instagram.direct.lockedchat.LockedChatKillSwitch.isLockedChatEnabled(r3, r2)
            if (r2 == 0) goto L_0x0011
            X.2EM r4 = r1.A00
            X.MkK r8 = X.C67224MkK.A00
            boolean r0 = X.0qQ.A0K(r4, r8)
            r7 = 1
            java.util.List r6 = r1.A03
            X.0qQ.A06(r6)
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r5 = r6.iterator()
            if (r0 == 0) goto L_0x0c52
        L_0x02a4:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0c69
            java.lang.Object r2 = r5.next()
            r0 = r2
            X.2Es r0 = (X.AnonymousClass2Es) r0
            int r0 = r0.BNq()
            if (r0 != r7) goto L_0x02a4
            r3.add(r2)
            goto L_0x02a4
        L_0x02bb:
            java.lang.Object r4 = r5.A01
            X.Nb9 r4 = (X.C68930Nb9) r4
            X.3t0 r0 = r4.A03
            java.lang.String r3 = r0.A00
            com.instagram.common.session.UserSession r2 = r4.A00
            r1 = 1
            X.Owm r0 = new X.Owm
            r0.<init>(r3, r2, r1)
            X.1aU r1 = X.1aU.A06(r0)
            r0 = 69
            X.1aU r0 = A00(r1, r4, r0)
            return r0
        L_0x02d6:
            X.PrM r1 = (X.C74233PrM) r1
            java.lang.Object r2 = r5.A01
            X.Nb9 r2 = (X.C68930Nb9) r2
            com.instagram.common.session.UserSession r8 = r2.A00
            X.0qQ.A0A(r1)
            boolean r0 = r1 instanceof X.C66990MgO
            if (r0 == 0) goto L_0x06c9
            java.lang.Object r9 = X.C66996MgU.A02(r1)
            X.0qQ.A07(r9)
            X.2Ep r9 = (X.AnonymousClass2Ep) r9
            java.lang.String r16 = r9.C6C()
            if (r16 != 0) goto L_0x0301
            java.lang.String r0 = "thread Id is null."
        L_0x02f6:
            X.Oxl r1 = new X.Oxl
            r1.<init>(r0)
        L_0x02fb:
            X.PCn r0 = new X.PCn
            r0.<init>(r1)
            return r0
        L_0x0301:
            java.util.ArrayList r12 = X.AnonymousClass7TE.A1C()
            com.instagram.user.model.User r10 = X.DbT.A0j(r8)
            r11 = r9
            X.3U9 r11 = (X.AnonymousClass3U9) r11
            X.3S9 r0 = r11.A01
            java.util.Map r3 = r0.A2D
            if (r3 == 0) goto L_0x0319
            java.lang.String r1 = r10.getId()
            r3.get(r1)
        L_0x0319:
            com.instagram.direct.model.messaginguser.MessagingUser r19 = com.instagram.direct.model.messaginguser.MessagingUser.A00(r10)
            java.util.List r1 = r9.BIr()
            java.util.List r3 = r9.AZs()
            boolean r29 = X.JTQ.A1T(r10, r3)
            java.lang.String r5 = r10.getId()
            int r4 = r9.C6a()
            X.3Te r3 = r0.A0s
            boolean r30 = X.C329997La.A05(r3, r5, r4)
            java.lang.String r5 = r10.getId()
            int r4 = r9.C6a()
            X.3Te r3 = r0.A0s
            boolean r31 = X.C329997La.A03(r3, r5, r4)
            if (r1 == 0) goto L_0x0355
            boolean r3 = r1.isEmpty()
            if (r3 != 0) goto L_0x0355
            boolean r3 = X.JTQ.A1T(r10, r1)
            r34 = 1
            if (r3 != 0) goto L_0x0357
        L_0x0355:
            r34 = 0
        L_0x0357:
            java.lang.String r5 = r10.getId()
            int r4 = r9.C6a()
            X.3Te r3 = r0.A0s
            boolean r35 = X.C329997La.A06(r3, r5, r4)
            java.lang.String r5 = r10.getId()
            int r4 = r9.C6a()
            X.3Te r3 = r0.A0s
            boolean r36 = X.C329997La.A04(r3, r5, r4)
            java.util.Map r4 = r0.A2D
            r25 = 0
            if (r4 == 0) goto L_0x0487
            java.lang.String r3 = r10.getId()
            java.lang.String r28 = X.DbT.A11(r3, r4)
        L_0x0381:
            r53 = 0
            r13 = 0
            r40 = 1
            X.N9q r3 = new X.N9q
            r26 = r3
            r27 = r10
            r32 = r13
            r33 = r13
            r37 = r13
            r38 = r13
            r39 = r13
            r26.<init>(r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40)
            r12.add(r3)
            java.util.List r3 = r9.BRZ()
            java.util.Iterator r15 = r3.iterator()
        L_0x03a4:
            boolean r3 = r15.hasNext()
            if (r3 == 0) goto L_0x048b
            com.instagram.user.model.User r7 = X.DbT.A0k(r15)
            java.util.List r3 = r9.AZs()
            boolean r29 = X.JTQ.A1T(r7, r3)
            java.lang.String r5 = r7.getId()
            int r4 = r9.C6a()
            X.3Te r3 = r0.A0s
            boolean r30 = X.C329997La.A05(r3, r5, r4)
            java.lang.String r5 = r7.getId()
            int r4 = r9.C6a()
            X.3Te r3 = r0.A0s
            boolean r31 = X.C329997La.A03(r3, r5, r4)
            java.lang.String r6 = r10.getId()
            int r5 = r9.C6a()
            int r4 = r9.BHS()
            X.3Te r3 = r0.A0s
            boolean r14 = X.C329997La.A02(r3, r6, r5)
            if (r14 != 0) goto L_0x03ec
            boolean r3 = X.C329997La.A06(r3, r6, r5)
            if (r3 == 0) goto L_0x03f2
        L_0x03ec:
            r3 = 8
            r32 = 1
            if (r4 != r3) goto L_0x03f4
        L_0x03f2:
            r32 = 0
        L_0x03f4:
            if (r1 == 0) goto L_0x0404
            boolean r3 = r1.isEmpty()
            if (r3 != 0) goto L_0x0404
            boolean r3 = X.JTQ.A1T(r7, r1)
            r34 = 1
            if (r3 != 0) goto L_0x0406
        L_0x0404:
            r34 = 0
        L_0x0406:
            java.lang.String r5 = r7.getId()
            int r4 = r9.C6a()
            X.3Te r3 = r0.A0s
            boolean r35 = X.C329997La.A06(r3, r5, r4)
            java.lang.String r5 = r7.getId()
            int r4 = r9.C6a()
            X.3Te r3 = r0.A0s
            boolean r36 = X.C329997La.A04(r3, r5, r4)
            java.lang.String r5 = r10.getId()
            int r4 = r9.C6a()
            int r6 = r9.BHS()
            X.3Te r3 = r0.A0s
            boolean r3 = X.C329997La.A02(r3, r5, r4)
            if (r3 == 0) goto L_0x043c
            r3 = 8
            r37 = 1
            if (r6 != r3) goto L_0x043e
        L_0x043c:
            r37 = 0
        L_0x043e:
            java.util.Map r4 = r0.A2E
            if (r4 == 0) goto L_0x0485
            java.lang.String r3 = r7.getId()
            java.lang.Object r3 = r4.get(r3)
        L_0x044a:
            boolean r40 = r7.A2A()
            java.lang.String r4 = "PEOPLE_YOU_FOLLOW"
            boolean r4 = X.0qQ.A0K(r3, r4)
            if (r4 != 0) goto L_0x0460
            java.lang.String r4 = "EVERYONE"
            boolean r4 = X.0qQ.A0K(r3, r4)
            if (r4 == 0) goto L_0x047d
            r40 = 1
        L_0x0460:
            java.util.Map r3 = r0.A2D
            if (r3 == 0) goto L_0x047a
            java.lang.String r4 = r7.getId()
            java.lang.String r28 = X.DbT.A11(r4, r3)
        L_0x046c:
            X.N9q r3 = new X.N9q
            r26 = r3
            r27 = r7
            r26.<init>(r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40)
            r12.add(r3)
            goto L_0x03a4
        L_0x047a:
            r28 = r25
            goto L_0x046c
        L_0x047d:
            java.lang.String r4 = "ONLY_YOU"
            X.0qQ.A0K(r3, r4)
            r40 = 0
            goto L_0x0460
        L_0x0485:
            r3 = 0
            goto L_0x044a
        L_0x0487:
            r28 = r25
            goto L_0x0381
        L_0x048b:
            com.instagram.direct.model.DirectThreadThemeInfo r1 = r9.C5v()
            X.3t0 r24 = X.C66580MXl.A0g(r16)
            java.lang.String r27 = r9.C6k()
            boolean r3 = r9.CUG()
            r39 = 1
            if (r3 == 0) goto L_0x04a1
            r39 = 2
        L_0x04a1:
            int r40 = r9.BSK()
            java.lang.String r28 = r9.C6f()
            boolean r4 = r9.isPending()
            int r6 = r9.B6d()
            X.2EN r3 = r9.C3d()
            X.0qQ.A07(r3)
            if (r4 == 0) goto L_0x05c2
            X.Mkq r3 = X.C67256Mkq.PENDING
        L_0x04bc:
            java.lang.String r14 = r3.A00
            X.4jH r3 = r9.C6F()
            if (r3 == 0) goto L_0x05be
            com.instagram.model.mediasize.ImageInfoImpl r3 = r3.A00
            com.instagram.model.mediasize.ExtendedImageUrl r16 = X.1iI.A03(r3)
        L_0x04ca:
            boolean r50 = r9.COS()
            boolean r54 = r9.CXF()
            boolean r52 = r9.isMuted()
            boolean r55 = r9.CaM()
            int r41 = r9.Bjw()
            int r42 = r9.CAt()
            int r3 = r9.BHS()
            if (r3 != 0) goto L_0x04ea
            r53 = 1
        L_0x04ea:
            boolean r51 = r9.CeU()
            boolean r56 = r9.CVr()
            java.lang.Integer r4 = X.AnonymousClass05K.A0N
            java.lang.Integer r3 = r9.BMT()
            boolean r57 = X.AnonymousClass7TF.A1W(r4, r3)
            X.MaI r3 = r2.A02
            boolean r58 = r3.A09(r9)
            boolean r60 = r9.CVE()
            X.3Tu r4 = r9.AiM()
            boolean r4 = X.C331057Pi.A02(r4)
            X.0qQ.A0B(r8, r13)
            boolean r4 = X.C66642MaB.A02(r8, r4)
            if (r4 == 0) goto L_0x0521
            com.instagram.direct.capabilities.Capabilities r4 = r2.A01
            boolean r4 = X.C66642MaB.A00(r8, r4, r9)
            r61 = 1
            if (r4 != 0) goto L_0x0523
        L_0x0521:
            r61 = 0
        L_0x0523:
            boolean r62 = r9.Cbs()
            com.instagram.direct.capabilities.Capabilities r2 = r2.A01
            boolean r63 = X.C66642MaB.A00(r8, r2, r9)
            boolean r64 = r9.CKb()
            java.lang.String r4 = r9.CDs()
            if (r4 != 0) goto L_0x05ae
            r59 = 0
        L_0x0539:
            boolean r65 = r9.AqP()
            boolean r66 = r9.CdY()
            java.util.HashMap r35 = r9.C6h()
            java.util.ArrayList r32 = X.AnonymousClass7TE.A1C()
            java.util.List r33 = r9.AZs()
            java.lang.String r10 = r1.A0o
            int r8 = r1.A00
            java.lang.String r7 = r1.A0f
            int r6 = r1.A07
            int r5 = r1.A03
            java.util.List r2 = r1.A0s
            int[] r74 = com.instagram.direct.model.DirectThreadThemeInfo.A00(r2)
            java.util.List r2 = r1.A0q
            int[] r75 = com.instagram.direct.model.DirectThreadThemeInfo.A00(r2)
            int r79 = r1.A02()
            int r80 = r1.A01()
            java.lang.String r4 = r1.A0n
            java.lang.String r3 = r1.A0j
            java.lang.String r2 = r1.A0l
            java.lang.String r1 = r1.A0i
            X.N3u r23 = new X.N3u
            r67 = r23
            r68 = r10
            r69 = r7
            r70 = r4
            r71 = r3
            r72 = r2
            r73 = r1
            r76 = r8
            r77 = r6
            r78 = r5
            r67.<init>(r68, r69, r70, r71, r72, r73, r74, r75, r76, r77, r78, r79, r80)
            java.util.List r34 = r9.AxI()
            boolean r67 = r9.CUJ()
            java.lang.String r30 = r9.BA0()
            com.instagram.direct.model.thread.CreatorSubscriberThreadInfo r20 = r9.Asg()
            X.0eM r2 = r11.A05
            boolean r1 = X.AnonymousClass7TF.A1Z(r2)
            if (r1 == 0) goto L_0x05f6
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = r11.A03
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r3 = r1.readLock()
            r3.lock()
            goto L_0x05e5
        L_0x05ae:
            X.0eM r2 = r3.A02
            java.lang.Object r2 = r2.getValue()
            X.1X9 r2 = (X.1X9) r2
            com.instagram.common.session.UserSession r3 = r3.A01
            boolean r59 = r2.A04(r3, r4)
            goto L_0x0539
        L_0x05be:
            r16 = r25
            goto L_0x04ca
        L_0x05c2:
            int r5 = r3.ordinal()
            r4 = 1
            r3 = 3
            if (r5 != r3) goto L_0x05ce
            X.Mkq r3 = X.C67256Mkq.BC_PARTNERSHIP
            goto L_0x04bc
        L_0x05ce:
            if (r6 == 0) goto L_0x05e1
            if (r6 == r4) goto L_0x05dd
            r3 = 2
            if (r6 == r3) goto L_0x05d9
            X.Mkq r3 = X.C67256Mkq.INBOX
            goto L_0x04bc
        L_0x05d9:
            X.Mkq r3 = X.C67256Mkq.TOP_THREADS
            goto L_0x04bc
        L_0x05dd:
            X.Mkq r3 = X.C67256Mkq.GENERAL
            goto L_0x04bc
        L_0x05e1:
            X.Mkq r3 = X.C67256Mkq.PRIMARY
            goto L_0x04bc
        L_0x05e5:
            X.3SB r1 = r0.A15     // Catch:{ all -> 0x06cf }
            java.lang.Object r1 = r1.A01()     // Catch:{ all -> 0x06cf }
            X.0qQ.A07(r1)     // Catch:{ all -> 0x06cf }
            boolean r68 = X.AnonymousClass7TE.A1a(r1)     // Catch:{ all -> 0x06cf }
            r3.unlock()
            goto L_0x0605
        L_0x05f6:
            monitor-enter(r0)
            X.3SB r1 = r0.A15     // Catch:{ all -> 0x06d9 }
            java.lang.Object r1 = r1.A01()     // Catch:{ all -> 0x06d9 }
            X.0qQ.A07(r1)     // Catch:{ all -> 0x06d9 }
            boolean r68 = X.AnonymousClass7TE.A1a(r1)     // Catch:{ all -> 0x06d9 }
            monitor-exit(r0)
        L_0x0605:
            boolean r1 = X.AnonymousClass7TF.A1Z(r2)
            if (r1 == 0) goto L_0x0624
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = r11.A03
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r2 = r1.readLock()
            r2.lock()
            X.3SB r1 = r0.A1E     // Catch:{ all -> 0x06d4 }
            java.lang.Object r1 = r1.A01()     // Catch:{ all -> 0x06d4 }
            boolean r1 = X.AnonymousClass7TE.A1a(r1)     // Catch:{ all -> 0x06d4 }
            r69 = r1 ^ 1
            r2.unlock()
            goto L_0x0632
        L_0x0624:
            monitor-enter(r0)
            X.3SB r1 = r0.A1E     // Catch:{ all -> 0x06d9 }
            java.lang.Object r1 = r1.A01()     // Catch:{ all -> 0x06d9 }
            boolean r1 = X.AnonymousClass7TE.A1a(r1)     // Catch:{ all -> 0x06d9 }
            r69 = r1 ^ 1
            monitor-exit(r0)
        L_0x0632:
            X.3SB r1 = r0.A11
            java.lang.Object r1 = r1.A01()
            boolean r1 = X.AnonymousClass7TE.A1a(r1)
            r70 = r1 ^ 1
            int r43 = r9.C6a()
            X.3Te r3 = r0.A0s
            int r44 = r9.BHS()
            boolean r71 = r9.CY7()
            X.3Tu r1 = r9.AiM()
            boolean r72 = X.C331057Pi.A02(r1)
            int r45 = r9.Btc()
            X.4li r21 = r9.Axk()
            if (r21 != 0) goto L_0x0675
            X.4li r21 = new X.4li
            r73 = r21
            r74 = r25
            r75 = r25
            r76 = r25
            r77 = r25
            r78 = r25
            r79 = r25
            r80 = r25
            r81 = r13
            r73.<init>(r74, r75, r76, r77, r78, r79, r80, r81)
        L_0x0675:
            java.lang.Boolean r1 = r0.A1c
            boolean r73 = X.DbX.A1a(r1)
            java.lang.Long r26 = r9.CBk()
            boolean r74 = r9.CQo()
            int r46 = r9.AaV()
            com.google.common.collect.ImmutableMap r36 = r9.CQl()
            boolean r75 = r9.CL4()
            boolean r76 = r9.isStale()
            X.3Tu r17 = r9.AiM()
            int r47 = r9.BNq()
            int r48 = r9.BWe()
            int r49 = r9.BlL()
            java.util.Map r1 = r0.A2D
            if (r1 == 0) goto L_0x06c6
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>(r1)
        L_0x06ac:
            java.util.Map r0 = r0.A2E
            X.7Cl r22 = X.C327857Cl.UNKNOWN
            X.N4P r15 = new X.N4P
            r29 = r14
            r31 = r12
            r37 = r2
            r38 = r0
            r18 = r3
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72, r73, r74, r75, r76)
            X.MgO r1 = new X.MgO
            r1.<init>(r15)
            goto L_0x02fb
        L_0x06c6:
            r2 = r25
            goto L_0x06ac
        L_0x06c9:
            java.lang.Object r0 = X.C66996MgU.A01(r1)
            goto L_0x02f6
        L_0x06cf:
            r1 = move-exception
            r3.unlock()
            throw r1
        L_0x06d4:
            r1 = move-exception
            r2.unlock()
            throw r1
        L_0x06d9:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x06dc:
            java.lang.Object r0 = r5.A01
            X.Npo r0 = (X.C69666Npo) r0
            java.lang.Class r0 = r0.A00()
            java.lang.Object r0 = r0.cast(r1)
            return r0
        L_0x06e9:
            java.lang.Object r0 = r5.A01
            return r0
        L_0x06ec:
            java.lang.Object r4 = r5.A01
            java.lang.Long r4 = (java.lang.Long) r4
            X.NAb r1 = (X.C68314NAb) r1
            java.lang.String r0 = "rxmailbox_retry_message"
            X.4fh r3 = X.AnonymousClass6F9.A00(r0)
            r2 = 15
            X.Oxe r0 = new X.Oxe
            r0.<init>((X.C68314NAb) r1, (java.lang.Long) r4, (int) r2)
            X.1aU r0 = X.1aU.A07(r0, r3)
            return r0
        L_0x0704:
            java.lang.String r0 = "get_should_use_secure_thread"
            java.lang.Object r3 = r5.A01
            X.4fh r2 = X.AnonymousClass6F9.A00(r0)
            r0 = 14
            X.1aU r0 = X.C72169Oxe.A00(r2, r3, r1, r0)
            return r0
        L_0x0713:
            java.lang.Object r4 = r5.A01
            java.lang.Long r4 = (java.lang.Long) r4
            X.NAb r1 = (X.C68314NAb) r1
            java.lang.String r0 = "rxmailbox_delete_message"
            X.4fh r3 = X.AnonymousClass6F9.A00(r0)
            r2 = 17
            X.Oxe r0 = new X.Oxe
            r0.<init>((X.C68314NAb) r1, (java.lang.Long) r4, (int) r2)
            X.1aU r0 = X.1aU.A07(r0, r3)
            return r0
        L_0x072b:
            java.lang.Object r3 = r5.A01
            X.MYb r0 = X.MYb.A0M
            java.lang.String r0 = "load_secure_threadmodel"
            X.4fh r2 = X.AnonymousClass6F9.A00(r0)
            r0 = 10
            X.1aU r0 = X.C72169Oxe.A00(r2, r3, r1, r0)
            return r0
        L_0x073c:
            java.lang.Object r3 = r5.A01
            X.MYb r0 = X.MYb.A0M
            java.lang.String r0 = "load_secure_message_poll_list"
            X.4fh r2 = X.AnonymousClass6F9.A00(r0)
            r0 = 13
            X.1aU r0 = X.C72169Oxe.A00(r2, r3, r1, r0)
            return r0
        L_0x074d:
            java.lang.Object r3 = r5.A01
            X.MYb r3 = (X.MYb) r3
            X.67N r1 = (X.AnonymousClass67N) r1
            java.lang.String r0 = "load_top_20_threads"
            X.4fh r2 = X.AnonymousClass6F9.A00(r0)
            X.67P r0 = new X.67P
            r0.<init>(r1, r3)
            X.1aU r0 = X.1aU.A07(r0, r2)
            return r0
        L_0x0763:
            java.lang.Object r3 = r5.A01
            X.MYb r0 = X.MYb.A0M
            java.lang.String r0 = "runTamClientSpamMessageFetch"
            X.4fh r2 = X.AnonymousClass6F9.A00(r0)
            r0 = 11
            X.1aU r0 = X.C72169Oxe.A00(r2, r3, r1, r0)
            return r0
        L_0x0774:
            java.lang.Object r3 = r5.A01
            X.MYb r0 = X.MYb.A0M
            java.lang.String r0 = "dismiss_proactive_warnings_thread_banner"
            X.4fh r2 = X.AnonymousClass6F9.A00(r0)
            r0 = 8
            X.1aU r0 = X.C72169Oxe.A00(r2, r3, r1, r0)
            return r0
        L_0x0785:
            java.lang.Object r3 = r5.A01
            X.MYb r0 = X.MYb.A0M
            java.lang.String r0 = "load_secure_participants"
            X.4fh r2 = X.AnonymousClass6F9.A00(r0)
            r0 = 12
            X.1aU r0 = X.C72169Oxe.A00(r2, r3, r1, r0)
            return r0
        L_0x0796:
            java.lang.Object r2 = r5.A01
            X.PAS r2 = (X.PAS) r2
            X.N8U r1 = (X.N8U) r1
            r2.A01 = r1
            int r0 = r1.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A02 = r0
            java.lang.String r0 = r1.A0I
            r2.A04 = r0
            X.OKP r0 = r1.A0D
            java.util.List r6 = r0.A00()
            X.N4L r5 = r1.A09
            if (r5 == 0) goto L_0x07dc
            java.lang.Object r0 = r5.A03
            if (r0 == 0) goto L_0x07dc
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()
            r3 = 0
            java.lang.Object r2 = r6.get(r3)
            if (r2 == 0) goto L_0x07d1
            boolean r0 = r2 instanceof X.AnonymousClass79E
            if (r0 == 0) goto L_0x07d1
            r6.remove(r3)
            boolean r0 = r5.A06
            if (r0 == 0) goto L_0x07d1
            r4.add(r2)
        L_0x07d1:
            java.lang.Object r0 = r5.A00
            java.util.Collection r0 = (java.util.Collection) r0
            r4.addAll(r0)
            r4.addAll(r6)
            r6 = r4
        L_0x07dc:
            java.util.Collections.reverse(r6)
            java.lang.Long r4 = r1.A0G
            X.Jw4 r3 = r1.A08
            java.util.List r2 = java.util.Collections.unmodifiableList(r6)
            r1 = 13
            X.JwM r0 = new X.JwM
            r0.<init>((int) r1, (java.lang.Object) r4, (java.lang.Object) r3, (java.lang.Object) r2)
            return r0
        L_0x07ef:
            java.lang.Object r0 = r5.A01
            X.0eP r1 = X.AnonymousClass7TE.A1L(r0, r1)
            X.MgO r0 = new X.MgO
            r0.<init>(r1)
            return r0
        L_0x07fb:
            X.NAg r1 = (X.C68319NAg) r1
            java.lang.Object r0 = r5.A01
            X.PCw r0 = (X.C72617PCw) r0
            java.lang.String r2 = r0.A00
            X.0qQ.A0A(r1)
            X.PCo r0 = new X.PCo
            r0.<init>(r1, r2)
            return r0
        L_0x080c:
            X.MfB r1 = (X.C66917MfB) r1
            java.lang.Object r0 = r5.A01
            X.MfC r0 = (X.C66918MfC) r0
            X.0qQ.A0A(r1)
            X.3xP r3 = X.C66918MfC.A00(r1, r0)
            java.lang.Integer r0 = r1.A02
            X.0qQ.A06(r0)
            int r5 = r0.intValue()
            X.48q r2 = r1.A01
            X.0qQ.A06(r2)
            java.lang.Object r1 = r3.A04()
            X.Pwi r1 = (X.C74549Pwi) r1
            if (r1 == 0) goto L_0x0850
            int r6 = r1.getCount()
            int r0 = r1.getCount()
            if (r0 <= 0) goto L_0x0851
            int r0 = r1.getCount()
            int r0 = r0 + -1
            long r0 = r1.BKf(r0)
            java.lang.Long r3 = java.lang.Long.valueOf(r0)
        L_0x0847:
            X.0sl r4 = X.0sl.A00
            X.GAX r0 = new X.GAX
            r1 = r0
            r1.<init>((X.C2611948q) r2, (java.lang.Long) r3, (java.util.Set) r4, (int) r5, (int) r6)
            return r0
        L_0x0850:
            r6 = 0
        L_0x0851:
            r3 = 0
            goto L_0x0847
        L_0x0853:
            X.MfB r1 = (X.C66917MfB) r1
            r0 = 0
            X.0qQ.A0B(r1, r0)
            java.lang.Object r0 = r5.A01
            X.MfC r0 = (X.C66918MfC) r0
            X.3xP r0 = X.C66918MfC.A00(r1, r0)
            return r0
        L_0x0862:
            X.MbS r1 = (X.C66721MbS) r1
            java.lang.Object r12 = r5.A01
            X.Mgn r12 = (X.C67014Mgn) r12
            X.0qQ.A0A(r1)
            X.2B9 r11 = r12.A06
            X.2EM r10 = r1.A00
            java.lang.String r0 = r10.A04
            r11.A02 = r0
            java.util.List r9 = r1.A03
            r11.A07 = r9
            int r3 = r10.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            java.lang.String r0 = X.C66724MbV.A00(r0)
            r11.A04 = r0
            X.2Dm r0 = r12.A0B
            X.2Dr r0 = (X.2Dr) r0
            X.2ED r8 = r0.A0C
            X.48q r7 = r1.A01
            X.0qQ.A06(r7)
            X.2Eh r0 = r8.A0B(r10, r7)
            java.lang.String r0 = r0.toString()
            r11.A05 = r0
            java.lang.String r0 = r7.name()
            r11.A03 = r0
            java.lang.Boolean r6 = r1.A02
            r11.A01 = r6
            boolean r0 = r6.booleanValue()
            if (r0 == 0) goto L_0x08b2
            X.0sn r5 = X.0sn.A00
        L_0x08aa:
            r11.A06 = r5
            X.MbS r0 = new X.MbS
            r0.<init>(r10, r7, r6, r5)
            return r0
        L_0x08b2:
            X.48q r0 = X.C2611948q.ALL
            r13 = 0
            if (r7 != r0) goto L_0x08db
            r0 = -1
            if (r3 != r0) goto L_0x08db
            java.util.ArrayList r5 = X.AnonymousClass7TE.A1C()
            int r2 = r9.size()
        L_0x08c2:
            if (r13 >= r2) goto L_0x08aa
            java.lang.Object r1 = r9.get(r13)
            X.2Ep r1 = (X.AnonymousClass2Ep) r1
            com.instagram.common.session.UserSession r0 = r12.A05
            X.0qQ.A0A(r1)
            boolean r0 = X.AnonymousClass53K.A02(r0, r1, r3)
            if (r0 != 0) goto L_0x08d8
            r5.add(r1)
        L_0x08d8:
            int r13 = r13 + 1
            goto L_0x08c2
        L_0x08db:
            java.util.ArrayList r5 = X.AnonymousClass7TE.A1C()
            int r18 = r9.size()
        L_0x08e3:
            r0 = r18
            if (r13 >= r0) goto L_0x08aa
            java.lang.Object r4 = r9.get(r13)
            X.2Ep r4 = (X.AnonymousClass2Ep) r4
            X.0qQ.A0A(r4)
            com.instagram.common.session.UserSession r3 = r12.A05
            boolean r0 = r7.A00(r3, r4)
            if (r0 == 0) goto L_0x093a
            r0 = 4
            X.0qQ.A0B(r4, r0)
            r17 = 1
            X.2Eh r16 = r8.A0B(r10, r7)
            long r14 = r4.BKd()
            java.lang.String r0 = r4.C6k()
            double r1 = (double) r14
            r14 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r1 = r1 / r14
            double r1 = java.lang.Math.ceil(r1)
            int r14 = (int) r1
            if (r0 != 0) goto L_0x091e
            X.2Ee r0 = X.C69952Ee.A00
            java.lang.Object r0 = r0.A01
            java.lang.String r0 = (java.lang.String) r0
        L_0x091e:
            X.2Eh r2 = new X.2Eh
            r2.<init>(r14, r0)
            X.2Ec r0 = X.C69942Ec.A00
            java.util.Comparator r1 = r0.A02
            r0 = r16
            int r1 = r1.compare(r0, r2)
            r0 = r17
            if (r1 >= r0) goto L_0x093a
            boolean r0 = r10.A00(r3, r4)
            if (r0 == 0) goto L_0x093a
            r5.add(r4)
        L_0x093a:
            int r13 = r13 + 1
            goto L_0x08e3
        L_0x093d:
            java.util.List r1 = (java.util.List) r1
            X.0qQ.A0A(r1)
            boolean r6 = X.AnonymousClass7TE.A1b(r1)
            java.lang.Object r0 = r5.A01
            X.Mgn r0 = (X.C67014Mgn) r0
            com.instagram.common.session.UserSession r5 = r0.A05
            int r4 = r1.size()
            r3 = 0
            r2 = 0
        L_0x0952:
            if (r3 >= r4) goto L_0x0965
            java.lang.Object r0 = r1.get(r3)
            X.2Eu r0 = (X.2Eu) r0
            boolean r0 = r0.Cdv(r5)
            if (r0 == 0) goto L_0x0962
            int r2 = r2 + 1
        L_0x0962:
            int r3 = r3 + 1
            goto L_0x0952
        L_0x0965:
            r1 = 3
            X.MfE r0 = new X.MfE
            r0.<init>((int) r2, (boolean) r6, (int) r1)
            return r0
        L_0x096c:
            X.PrM r1 = (X.C74233PrM) r1
            X.0qQ.A0A(r1)
            java.lang.Object r0 = r5.A01
            X.Mgu r0 = (X.C67021Mgu) r0
            long r4 = r0.A05
            int r3 = r0.A01
            int r2 = r0.A03
            X.Mh0 r0 = new X.Mh0
            r6 = r0
            r7 = r1
            r8 = r3
            r9 = r2
            r10 = r4
            r6.<init>(r7, r8, r9, r10)
            return r0
        L_0x0986:
            X.NAq r1 = (X.C68329NAq) r1
            java.lang.Object r0 = r5.A01
            com.instagram.common.session.UserSession r0 = X.C66583MXo.A0M(r0)
            com.facebook.msys.mci.AuthData r2 = X.C300325ww.A00(r0)
            X.0qQ.A0A(r1)
            X.PCM r0 = new X.PCM
            r0.<init>(r1)
            android.util.Pair r0 = android.util.Pair.create(r2, r0)
            return r0
        L_0x099f:
            X.OOB r1 = (X.OOB) r1
            r0 = 0
            X.0qQ.A0B(r1, r0)
            X.OZI r0 = r1.A00
            X.ObS r6 = X.C71087ObS.A00()
            X.NAX r4 = r0.A02
            X.68L r3 = X.C66581MXm.A0I(r4)
            com.facebook.msys.mca.MailboxFutureImpl r2 = X.C66580MXl.A0G(r3)
            r1 = 18
            X.Oph r0 = new X.Oph
            r0.<init>((X.NAX) r4, (com.facebook.msys.mca.MailboxFutureImpl) r2, (int) r1)
            X.C66582MXn.A1E(r3, r0, r2)
            r0 = 11
            X.C71722Opg.A01(r2, r6, r0)
            java.lang.Object r3 = r5.A01
            r0 = 31
            goto L_0x0bd8
        L_0x09ca:
            X.OOB r1 = (X.OOB) r1
            X.ObS r6 = r1.A03()
            java.lang.Object r3 = r5.A01
            r0 = 30
            goto L_0x0bd8
        L_0x09d6:
            X.OOB r1 = (X.OOB) r1
            X.ObS r3 = r1.A02()
            java.lang.Object r2 = r5.A01
            r0 = 18
            X.C71087ObS.A02(r3, r2, r1, r0)
            X.0gF r0 = X.C60340gF.A00
            return r0
        L_0x09e6:
            X.OOB r1 = (X.OOB) r1
            X.OZI r2 = r1.A00
            X.ObS r6 = X.C71087ObS.A00()
            X.O5P r0 = r2.A01
            X.0sa r0 = r0.A00
            boolean r0 = X.C51971G9r.A1b(r0)
            if (r0 != 0) goto L_0x0a01
            X.OZI.A01(r6)
        L_0x09fb:
            java.lang.Object r3 = r5.A01
            r0 = 28
            goto L_0x0bd8
        L_0x0a01:
            X.NAX r4 = r2.A02
            r1 = 4
            X.Oph r0 = new X.Oph
            r0.<init>((X.OZI) r2, (X.C71087ObS) r6, (int) r1)
            X.68L r3 = X.C66581MXm.A0I(r4)
            com.facebook.msys.mca.MailboxFutureImpl r2 = X.C66581MXm.A0J(r3, r0)
            r1 = 23
            X.Oph r0 = new X.Oph
            r0.<init>((X.NAX) r4, (com.facebook.msys.mca.MailboxFutureImpl) r2, (int) r1)
            X.C66582MXn.A1D(r3, r0, r2)
            goto L_0x09fb
        L_0x0a1c:
            X.OOB r1 = (X.OOB) r1
            X.ObS r6 = r1.A00()
            java.lang.Object r3 = r5.A01
            r0 = 27
            goto L_0x0bd8
        L_0x0a28:
            X.OOB r1 = (X.OOB) r1
            X.ObS r6 = r1.A02()
            java.lang.Object r3 = r5.A01
            r0 = 26
            goto L_0x0bd8
        L_0x0a34:
            X.OMK r1 = (X.OMK) r1
            X.ObS r6 = X.C71087ObS.A00()
            X.NAX r4 = r1.A00
            r0 = 18
            X.Opg r0 = X.C71722Opg.A00(r6, r0)
            X.68L r3 = X.C66581MXm.A0I(r4)
            com.facebook.msys.mca.MailboxFutureImpl r2 = X.C66581MXm.A0J(r3, r0)
            r1 = 26
            X.Oph r0 = new X.Oph
            r0.<init>((X.NAX) r4, (com.facebook.msys.mca.MailboxFutureImpl) r2, (int) r1)
            X.C66582MXn.A1D(r3, r0, r2)
            java.lang.Object r3 = r5.A01
            r0 = 25
            goto L_0x0bd8
        L_0x0a5a:
            X.OOB r1 = (X.OOB) r1
            X.OZI r0 = r1.A00
            X.1xN r2 = r0.A00
            if (r2 == 0) goto L_0x0a78
            X.NAX r0 = r0.A02
            X.68J r1 = r0.mMailboxApiHandleMetaProvider
            boolean r0 = r1 instanceof X.AnonymousClass68I
            if (r0 == 0) goto L_0x0a82
            X.68I r1 = (X.AnonymousClass68I) r1
        L_0x0a6c:
            X.0qQ.A0A(r1)
            r0 = 13
            X.Opg r0 = X.C71722Opg.A00(r2, r0)
            r1.A04(r0)
        L_0x0a78:
            java.lang.Object r1 = r5.A01
            X.OyT r1 = (X.C72203OyT) r1
            r0 = 0
            r1.A01 = r0
            X.0gF r0 = X.C60340gF.A00
            return r0
        L_0x0a82:
            r1 = 0
            goto L_0x0a6c
        L_0x0a84:
            X.OOB r1 = (X.OOB) r1
            boolean r0 = r1.A04
            if (r0 == 0) goto L_0x0ac4
            X.OdW r1 = r1.A01
            X.ObS r6 = X.C71087ObS.A00()
            X.O5P r0 = r1.A01
            X.0sa r0 = r0.A00
            boolean r0 = X.C51971G9r.A1b(r0)
            if (r0 != 0) goto L_0x0aac
            com.encryptedbackups.statemanager.model.UserNotAllowedException r0 = new com.encryptedbackups.statemanager.model.UserNotAllowedException
            r0.<init>()
        L_0x0a9f:
            X.N0J r1 = X.N0J.A00(r0)
        L_0x0aa3:
            r6.A05(r1)
        L_0x0aa6:
            java.lang.Object r3 = r5.A01
            r0 = 24
            goto L_0x0bd8
        L_0x0aac:
            X.OFl r1 = r1.A00
            boolean r0 = r1.A03
            if (r0 == 0) goto L_0x0abe
            boolean r0 = r1.A04
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            X.N0I r1 = new X.N0I
            r1.<init>(r0)
            goto L_0x0aa3
        L_0x0abe:
            com.encryptedbackups.statemanager.model.ApiCacheNotInitializedException r0 = new com.encryptedbackups.statemanager.model.ApiCacheNotInitializedException
            r0.<init>()
            goto L_0x0a9f
        L_0x0ac4:
            X.OZI r1 = r1.A00
            X.ObS r6 = X.C71087ObS.A00()
            X.O5P r0 = r1.A01
            X.0sa r0 = r0.A00
            boolean r0 = X.C51971G9r.A1b(r0)
            if (r0 != 0) goto L_0x0ad8
            X.OZI.A01(r6)
            goto L_0x0aa6
        L_0x0ad8:
            X.NAX r4 = r1.A02
            r0 = 6
            X.Opg r0 = X.C71722Opg.A00(r6, r0)
            X.68L r3 = X.C66581MXm.A0I(r4)
            com.facebook.msys.mca.MailboxFutureImpl r2 = X.C66581MXm.A0J(r3, r0)
            r1 = 21
            X.Oph r0 = new X.Oph
            r0.<init>((X.NAX) r4, (com.facebook.msys.mca.MailboxFutureImpl) r2, (int) r1)
            X.C66582MXn.A1D(r3, r0, r2)
            goto L_0x0aa6
        L_0x0af2:
            X.OOB r1 = (X.OOB) r1
            java.lang.Object r3 = r5.A01
            X.OyT r3 = (X.C72203OyT) r3
            X.0eM r0 = r3.A09
            X.Mex r2 = X.C66580MXl.A0U(r0)
            java.lang.String r0 = "MAILBOX_API_READY"
            r2.A0B(r0)
            X.ObS r6 = r1.A01()
            r0 = 23
            goto L_0x0bd8
        L_0x0b0b:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            java.lang.Object r4 = r5.A01
            X.MtT r4 = (X.C67714MtT) r4
            X.NUJ r0 = r4.A07
            r0.A09()
            X.OyT r2 = r4.A09
            r0 = 1
            r2.A04 = r0
            X.OUY r2 = X.OUY.A00
            com.instagram.common.session.UserSession r0 = r4.A05
            java.util.concurrent.CompletableFuture r3 = r2.A00(r0)
            r0 = 36
            X.PqX r2 = new X.PqX
            r2.<init>((int) r0, (java.lang.Object) r1, (java.lang.Object) r4)
            r0 = 11
            X.C73452Pcu.A00(r3, r2, r0)
            X.0gF r0 = X.C60340gF.A00
            return r0
        L_0x0b34:
            X.OUY r2 = X.OUY.A00
            java.lang.Object r4 = r5.A01
            X.MtR r4 = (X.C67712MtR) r4
            com.instagram.common.session.UserSession r0 = r4.A04
            java.util.concurrent.CompletableFuture r3 = r2.A00(r0)
            r0 = 35
            X.PqX r2 = new X.PqX
            r2.<init>((int) r0, (java.lang.Object) r1, (java.lang.Object) r4)
            r1 = 9
            X.Pcu r0 = new X.Pcu
            r0.<init>((int) r1, (X.0sP) r2)
            java.util.concurrent.CompletableFuture r0 = r3.thenAccept(r0)
            return r0
        L_0x0b53:
            X.OUY r2 = X.OUY.A00
            java.lang.Object r4 = r5.A01
            X.Mu9 r4 = (X.C67754Mu9) r4
            com.instagram.common.session.UserSession r0 = r4.A05
            java.util.concurrent.CompletableFuture r3 = r2.A00(r0)
            r0 = 32
            X.PqX r2 = new X.PqX
            r2.<init>((int) r0, (java.lang.Object) r1, (java.lang.Object) r4)
            r1 = 4
            X.Pcu r0 = new X.Pcu
            r0.<init>((int) r1, (X.0sP) r2)
            java.util.concurrent.CompletableFuture r0 = r3.thenAccept(r0)
            return r0
        L_0x0b71:
            X.OOB r1 = (X.OOB) r1
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            X.ObS r6 = r1.A06(r0)
            java.lang.Object r3 = r5.A01
            r0 = 14
            goto L_0x0bd8
        L_0x0b7e:
            X.OOB r1 = (X.OOB) r1
            X.ObS r6 = r1.A03()
            java.lang.Object r3 = r5.A01
            r0 = 13
            goto L_0x0bd8
        L_0x0b89:
            X.OOB r1 = (X.OOB) r1
            X.OZI r2 = r1.A00
            X.ObS r6 = X.C71087ObS.A00()
            X.NAX r4 = r2.A02
            r1 = 5
            X.Oph r0 = new X.Oph
            r0.<init>((X.OZI) r2, (X.C71087ObS) r6, (int) r1)
            X.68L r3 = X.C66581MXm.A0I(r4)
            com.facebook.msys.mca.MailboxFutureImpl r2 = X.C66581MXm.A0J(r3, r0)
            r1 = 27
            X.Oph r0 = new X.Oph
            r0.<init>((X.NAX) r4, (com.facebook.msys.mca.MailboxFutureImpl) r2, (int) r1)
            X.C66582MXn.A1D(r3, r0, r2)
            java.lang.Object r3 = r5.A01
            r0 = 12
            goto L_0x0bd8
        L_0x0bb0:
            X.OUY r2 = X.OUY.A00
            java.lang.Object r0 = r5.A01
            X.Mu9 r0 = (X.C67754Mu9) r0
            com.instagram.common.session.UserSession r0 = r0.A05
            java.util.concurrent.CompletableFuture r3 = r2.A00(r0)
            r0 = 32
            X.PqZ r2 = new X.PqZ
            r2.<init>(r1, r0)
            r1 = 4
            X.Pcu r0 = new X.Pcu
            r0.<init>((int) r1, (X.0sP) r2)
            java.util.concurrent.CompletableFuture r0 = r3.thenAccept(r0)
            return r0
        L_0x0bce:
            X.OOB r1 = (X.OOB) r1
            X.ObS r6 = r1.A00()
            java.lang.Object r3 = r5.A01
            r0 = 11
        L_0x0bd8:
            X.C71087ObS.A01(r6, r3, r0)
            X.0gF r0 = X.C60340gF.A00
            return r0
        L_0x0bde:
            X.OOB r1 = (X.OOB) r1
            X.Njv r0 = X.C69356Njv.A0E
            X.ObS r3 = r1.A04(r0)
            java.lang.Object r2 = r5.A01
            r0 = 14
            X.C71087ObS.A02(r3, r2, r1, r0)
            X.0gF r0 = X.C60340gF.A00
            return r0
        L_0x0bf0:
            X.OOB r1 = (X.OOB) r1
            java.lang.Object r0 = r5.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.02m r3 = X.C51965G9l.A0l()
            X.0qQ.A0A(r1)
            java.util.concurrent.ExecutorService r5 = java.util.concurrent.Executors.newSingleThreadExecutor()
            X.0qQ.A07(r5)
            X.1vn r2 = X.1vm.A01(r0)
            java.lang.Integer r4 = X.AnonymousClass05K.A01
            X.OYu r0 = new X.OYu
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
        L_0x0c10:
            com.facebook.msys.mca.Mailbox r1 = (com.facebook.msys.mca.Mailbox) r1
            java.lang.Object r5 = r5.A01
            com.instagram.common.session.UserSession r5 = (com.instagram.common.session.UserSession) r5
            X.02m r9 = X.02m.A0p
            r2 = 49
            X.Ay7 r0 = new X.Ay7
            r0.<init>(r5, r2)
            X.O5P r4 = new X.O5P
            r4.<init>(r0)
            X.65E r0 = X.AnonymousClass65D.A00(r5)
            com.instagram.common.session.UserSession r0 = r0.A00
            r2 = 36315949947948821(0x81052a00540f15, double:3.029691207451275E-306)
            boolean r11 = X.AnonymousClass65A.A02(r0, r2)
            X.Mcg r2 = new X.Mcg
            r2.<init>(r1)
            X.OFl r6 = new X.OFl
            r6.<init>()
            X.O67 r1 = new X.O67
            r1.<init>(r5)
            X.0qQ.A0A(r9)
            X.OOB r0 = new X.OOB
            r5 = r0
            r7 = r4
            r8 = r2
            r10 = r1
            r5.<init>(r6, r7, r8, r9, r10, r11)
            return r0
        L_0x0c4f:
            X.0sn r0 = X.0sn.A00
            return r0
        L_0x0c52:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0c69
            java.lang.Object r2 = r5.next()
            r0 = r2
            X.2Es r0 = (X.AnonymousClass2Es) r0
            int r0 = r0.BNq()
            if (r0 == r7) goto L_0x0c52
            r3.add(r2)
            goto L_0x0c52
        L_0x0c69:
            boolean r0 = X.0qQ.A0K(r4, r8)
            if (r0 == 0) goto L_0x0c7f
            boolean r0 = r6.isEmpty()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
        L_0x0c77:
            X.48q r1 = r1.A01
            X.MbS r0 = new X.MbS
            r0.<init>(r4, r1, r2, r3)
            return r0
        L_0x0c7f:
            java.lang.Boolean r2 = r1.A02
            goto L_0x0c77
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C72120Owf.apply(java.lang.Object):java.lang.Object");
    }

    public C72120Owf(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public C72120Owf(int i, 0sP r3) {
        this.A00 = i;
        switch (i) {
            case 21:
            case 24:
            case 25:
            case 32:
            case 34:
            case 36:
            case 40:
            case Seq.NULL_REFNUM:
            case Seq.RefTracker.REF_OFFSET:
            case 43:
            case 44:
            case 45:
            case 46:
            case 56:
            case 57:
            case 58:
            case 62:
            case 63:
            case 64:
            case 67:
            case 68:
                break;
            default:
                0qQ.A0B(r3, 1);
                break;
        }
        this.A01 = r3;
    }
}
