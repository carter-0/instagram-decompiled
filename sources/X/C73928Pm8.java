package X;

/* renamed from: X.Pm8  reason: case insensitive filesystem */
public final class C73928Pm8 extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C73928Pm8(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    public static AnonymousClass0eM A00(Object obj, int i) {
        return AnonymousClass1YB.A00(new C73928Pm8(obj, i));
    }

    public static 0t0 A01(Object obj, int i) {
        return AnonymousClass0eN.A01(new C73928Pm8(obj, i));
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x039e, code lost:
        return X.AnonymousClass7TF.A0R(r2, r3, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x03d2, code lost:
        if (r1 == true) goto L_0x0782;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x0521, code lost:
        X.0qQ.A0F(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x05a2, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x05a3, code lost:
        r5 = "promptXButton";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x05a7, code lost:
        r5 = "pogViewContainer";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x05ab, code lost:
        r5 = "avatarContainer";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x05af, code lost:
        r5 = "bubbleNestedScrollView";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:291:0x0733, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:301:0x0780, code lost:
        if (r1.getBoolean("arg_is_in_friend_map_mode") == true) goto L_0x0782;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:303:0x0786, code lost:
        return java.lang.Boolean.valueOf(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:309:0x07a0, code lost:
        if (r0.length() != 0) goto L_0x0782;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:310:0x07a2, code lost:
        r2 = false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r48 = this;
            r2 = r48
            int r0 = r2.A00
            switch(r0) {
                case 0: goto L_0x0011;
                case 1: goto L_0x001c;
                case 2: goto L_0x0030;
                case 3: goto L_0x0053;
                case 4: goto L_0x000e;
                case 5: goto L_0x0313;
                case 6: goto L_0x031a;
                case 7: goto L_0x000e;
                case 8: goto L_0x0313;
                case 9: goto L_0x031a;
                case 10: goto L_0x0321;
                case 11: goto L_0x033b;
                case 12: goto L_0x0347;
                case 13: goto L_0x0353;
                case 14: goto L_0x035f;
                case 15: goto L_0x036b;
                case 16: goto L_0x0377;
                case 17: goto L_0x0383;
                case 18: goto L_0x038f;
                case 19: goto L_0x039f;
                case 20: goto L_0x03b2;
                case 21: goto L_0x03bf;
                case 22: goto L_0x0007;
                case 23: goto L_0x03d8;
                case 24: goto L_0x04c1;
                case 25: goto L_0x03f0;
                case 26: goto L_0x05b3;
                case 27: goto L_0x05cb;
                case 28: goto L_0x05db;
                case 29: goto L_0x05eb;
                case 30: goto L_0x05fa;
                case 31: goto L_0x0609;
                case 32: goto L_0x0621;
                case 33: goto L_0x0787;
                case 34: goto L_0x0659;
                case 35: goto L_0x0662;
                case 36: goto L_0x066c;
                case 37: goto L_0x067d;
                case 38: goto L_0x0696;
                case 39: goto L_0x06a6;
                case 40: goto L_0x06b5;
                case 41: goto L_0x0007;
                case 42: goto L_0x0007;
                case 43: goto L_0x0007;
                case 44: goto L_0x06c6;
                case 45: goto L_0x0734;
                case 46: goto L_0x074f;
                case 47: goto L_0x0760;
                case 48: goto L_0x0771;
                case 49: goto L_0x07a4;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r0 = r2.A01
            X.07f r3 = X.C51971G9r.A0U(r0)
            return r3
        L_0x000e:
            java.lang.Object r3 = r2.A01
            return r3
        L_0x0011:
            java.lang.Object r0 = r2.A01
            X.NIz r0 = (X.C68461NIz) r0
            X.0sa r0 = r0.A03
            java.lang.Object r3 = r0.invoke()
            return r3
        L_0x001c:
            java.lang.Object r2 = r2.A01
            X.NIz r2 = (X.C68461NIz) r2
            X.0eM r0 = r2.A04
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r0)
            android.content.Context r0 = r2.requireContext()
            X.NN3 r3 = new X.NN3
            r3.<init>(r0, r2, r1)
            return r3
        L_0x0030:
            java.lang.Object r2 = r2.A01
            com.instagram.direct.inbox.fragment.DirectSearchInboxFragment r2 = (com.instagram.direct.inbox.fragment.DirectSearchInboxFragment) r2
            android.content.Context r0 = r2.requireContext()
            android.content.Context r1 = r0.getApplicationContext()
            r0 = 29
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0qQ.A0C(r1, r0)
            android.app.Application r1 = (android.app.Application) r1
            X.0eM r0 = r2.A0Q
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.EEz r3 = new X.EEz
            r3.<init>(r1, r0)
            return r3
        L_0x0053:
            java.lang.Object r8 = r2.A01
            com.instagram.direct.inbox.fragment.DirectSearchInboxFragment r8 = (com.instagram.direct.inbox.fragment.DirectSearchInboxFragment) r8
            android.app.Application r21 = X.DbY.A05(r8)
            X.0eM r7 = r8.A0Q
            com.instagram.common.session.UserSession r20 = X.AnonymousClass7TE.A0l(r7)
            android.content.Context r43 = r8.requireContext()
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r7)
            android.content.Context r2 = r8.requireContext()
            X.0gy r1 = X.AnonymousClass07i.A00(r8)
            r19 = 0
            X.2lw r11 = new X.2lw
            r0 = r19
            r11.<init>(r2, r1, r0)
            java.lang.String r13 = "universal"
            java.lang.String r9 = "direct_user_search_nullstate"
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r7)
            boolean r0 = X.AnonymousClass6FC.A01(r0)
            if (r0 == 0) goto L_0x030f
            boolean r0 = r8.A0E
            if (r0 != 0) goto L_0x009c
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r7)
            X.2HN r0 = X.2HM.A00(r0)
            X.2HR r0 = r0.A0h
            boolean r0 = X.DbX.A1Z(r0)
            if (r0 == 0) goto L_0x030f
        L_0x009c:
            r18 = 1
        L_0x009e:
            X.0lg r12 = X.DbT.A0X(r7)
            r6 = 0
            X.0Tu r2 = X.DbS.A0J(r12, r6)
            r4 = 36313944192977219(0x81035700040943, double:3.0284227599307066E-306)
            boolean r0 = X.182.A06(r2, r12, r4)
            if (r0 == 0) goto L_0x02fc
            X.0Tu r10 = X.0Tu.A06
            r0 = 36595419169425551(0x8203570000088f, double:3.206428668445388E-306)
            long r0 = X.182.A01(r10, r12, r0)
        L_0x00bd:
            int r10 = (int) r0
            r31 = r10
            X.0lg r10 = X.AnonymousClass7TF.A0L(r7, r6)
            boolean r0 = X.182.A06(r2, r10, r4)
            if (r0 == 0) goto L_0x02e9
            X.0Tu r4 = X.0Tu.A06
            r0 = 36595419169491088(0x82035700010890, double:3.206428668486834E-306)
            long r0 = X.182.A01(r4, r10, r0)
        L_0x00d5:
            int r4 = (int) r0
            r29 = r4
            X.0lg r4 = X.AnonymousClass7TF.A0L(r7, r6)
            r0 = 36317521900475658(0x8106980000150a, double:3.030685316558991E-306)
            boolean r0 = X.182.A06(r2, r4, r0)
            if (r0 == 0) goto L_0x02d6
            r0 = 36598996877249879(0x82069800010d57, double:3.208691225279766E-306)
            long r0 = X.182.A01(r2, r4, r0)
        L_0x00f0:
            int r4 = (int) r0
            r28 = r4
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r7)
            boolean r0 = X.AnonymousClass9B8.A0B(r0)
            if (r0 == 0) goto L_0x02d3
            com.instagram.common.session.UserSession r5 = X.AnonymousClass7TE.A0l(r7)
            X.0qQ.A0B(r5, r6)
            boolean r0 = X.AnonymousClass9B8.A07(r5)
            if (r0 == 0) goto L_0x02d0
            X.0Tu r4 = X.0Tu.A05
            r0 = 36601316159852681(0x8208b400051089, double:3.2101579489367795E-306)
            long r0 = X.182.A01(r4, r5, r0)
            int r12 = (int) r0
        L_0x0116:
            com.instagram.common.session.UserSession r4 = X.DbW.A0S(r7, r6)
            com.instagram.user.model.User r5 = X.AnonymousClass7TF.A0Q(r4)
            boolean r0 = X.2Ek.A00(r5)
            if (r0 != 0) goto L_0x012f
            r0 = 36314811776109359(0x81042100000b2f, double:3.028971422996949E-306)
            boolean r0 = X.182.A06(r2, r4, r0)
            if (r0 != 0) goto L_0x0140
        L_0x012f:
            boolean r0 = X.2Ek.A00(r5)
            if (r0 == 0) goto L_0x02cc
            r0 = 36314811776174896(0x81042100010b30, double:3.028971423038395E-306)
            boolean r0 = X.182.A06(r2, r4, r0)
            if (r0 == 0) goto L_0x02cc
        L_0x0140:
            r17 = 1
        L_0x0142:
            r7.getValue()
            X.0lg r4 = X.AnonymousClass7TF.A0L(r7, r6)
            r0 = 36321997256402829(0x810aaa0000278d, double:3.033515549668146E-306)
            boolean r25 = X.182.A06(r2, r4, r0)
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r7)
            boolean r26 = X.AnonymousClass9B8.A0B(r0)
            X.0lg r5 = X.AnonymousClass7TF.A0L(r7, r6)
            X.0Tu r4 = X.0Tu.A06
            r0 = 36320438183272877(0x81093f000021ad, double:3.032529585542881E-306)
            boolean r27 = X.182.A06(r4, r5, r0)
            X.0lg r4 = X.AnonymousClass7TF.A0L(r7, r6)
            r0 = 36320438183535023(0x81093f000421af, double:3.032529585708663E-306)
            boolean r16 = X.182.A06(r2, r4, r0)
            X.0eM r0 = r8.A0O
            java.lang.Object r7 = r0.getValue()
            X.DkJ r7 = (X.C46730DkJ) r7
            X.OyY r0 = r8.A06
            if (r0 == 0) goto L_0x02c9
            X.OO3 r0 = r0.A01
            if (r0 == 0) goto L_0x02c6
            java.lang.String r8 = r0.A07
        L_0x0188:
            r15 = r19
            r14 = 1
            r32 = 0
            X.0qQ.A0B(r3, r14)
            java.lang.String r0 = "forwarding"
            boolean r0 = r13.equals(r0)
            if (r0 != 0) goto L_0x01a8
            java.lang.String r0 = "reshare"
            boolean r0 = r13.equals(r0)
            if (r0 != 0) goto L_0x01a8
            java.lang.String r0 = "story_share_sheet"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L_0x01aa
        L_0x01a8:
            r32 = 1
        L_0x01aa:
            r0 = 12
            X.Ple r1 = new X.Ple
            r1.<init>(r3, r0)
            java.lang.Class<X.OEC> r0 = X.OEC.class
            java.lang.Object r10 = r3.A01(r0, r1)
            X.OEC r10 = (X.OEC) r10
            java.lang.String r5 = "surface"
            X.0qQ.A0B(r9, r6)
            r10.A00 = r9
            java.util.Set r4 = r10.A02
            boolean r0 = X.00k.A0u(r4, r9)
            if (r0 == 0) goto L_0x01d0
            X.02m r1 = r10.A01
            r0 = 276892616(0x10810bc8, float:5.089968E-29)
            r1.markerAnnotate(r0, r5, r9)
        L_0x01d0:
            java.lang.String r0 = r10.A00
            boolean r0 = X.00k.A0u(r4, r0)
            if (r0 == 0) goto L_0x01e2
            X.02m r5 = r10.A01
            r1 = 276892616(0x10810bc8, float:5.089968E-29)
            java.lang.String r0 = "start_suggested_section_load"
            r5.markerPoint(r1, r0)
        L_0x01e2:
            java.lang.String r0 = r10.A00
            boolean r0 = X.00k.A0u(r4, r0)
            if (r0 == 0) goto L_0x01f4
            X.02m r4 = r10.A01
            r1 = 276892616(0x10810bc8, float:5.089968E-29)
            java.lang.String r0 = "loaded_suggested_section"
            r4.markerPoint(r1, r0)
        L_0x01f4:
            r0 = 15
            X.Plo r1 = X.C73913Plo.A00(r3, r0)
            java.lang.Class<X.Oy6> r0 = X.Oy6.class
            java.lang.Object r5 = r3.A01(r0, r1)
            X.Oy6 r5 = (X.Oy6) r5
            java.util.ArrayList r9 = X.AnonymousClass7TE.A1C()
            java.util.HashMap r1 = X.AnonymousClass7TE.A1E()
            if (r17 == 0) goto L_0x0216
            java.lang.String r4 = "message_content"
            r9.add(r4)
            java.lang.String r0 = "0"
            r1.put(r4, r0)
        L_0x0216:
            boolean r0 = r9.isEmpty()
            r4 = 0
            if (r0 != 0) goto L_0x0227
            X.PPg r0 = new X.PPg
            r0.<init>(r3, r9, r1)
            X.7eJ r15 = new X.7eJ
            r15.<init>((X.AnonymousClass4D6) r11, (X.C336227eH) r0, (boolean) r6)
        L_0x0227:
            r0 = 36317521902638360(0x81069800211518, double:3.0306853179266927E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x02c3
            X.A5P r1 = new X.A5P
            r1.<init>(r3, r8)
            X.9qH r0 = new X.9qH
            r0.<init>(r3, r11, r1)
        L_0x023c:
            X.NeB r30 = new X.NeB
            r22 = r30
            r23 = r3
            r24 = r0
            r22.<init>(r23, r24, r25, r26, r27)
            if (r16 == 0) goto L_0x02c1
            X.KX9 r9 = new X.KX9
            r9.<init>(r3)
        L_0x024e:
            if (r7 == 0) goto L_0x0255
            X.KX8 r4 = new X.KX8
            r4.<init>(r7)
        L_0x0255:
            X.Mpv r0 = new X.Mpv
            r33 = r0
            r34 = r3
            r35 = r13
            r36 = r19
            r37 = r8
            r38 = r31
            r39 = r29
            r40 = r28
            r41 = r12
            r42 = r14
            r33.<init>(r34, r35, r36, r37, r38, r39, r40, r41, r42)
            X.7eJ r1 = new X.7eJ
            r1.<init>((X.AnonymousClass4D6) r11, (X.C336227eH) r0, (boolean) r6)
            X.NeA r27 = new X.NeA
            r42 = r27
            r44 = r3
            r45 = r5
            r46 = r1
            r47 = r15
            r42.<init>(r43, r44, r45, r46, r47)
            X.Ne8 r6 = new X.Ne8
            r6.<init>(r3)
            X.Ne9 r5 = new X.Ne9
            r5.<init>(r3)
            r0 = 2342156064350996112(0x20810288002b0690, double:4.059697225785784E-152)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x02b9
            java.lang.Integer r31 = X.AnonymousClass05K.A00
        L_0x0299:
            X.KX7 r0 = new X.KX7
            r0.<init>(r3)
            X.Ne7 r2 = new X.Ne7
            r24 = r6
            r25 = r5
            r26 = r0
            r28 = r4
            r29 = r9
            r22 = r2
            r22.<init>(r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            X.NN5 r3 = new X.NN5
            r1 = r21
            r0 = r20
            r3.<init>(r1, r0, r2)
            return r3
        L_0x02b9:
            if (r18 == 0) goto L_0x02be
            java.lang.Integer r31 = X.AnonymousClass05K.A0C
            goto L_0x0299
        L_0x02be:
            java.lang.Integer r31 = X.AnonymousClass05K.A0N
            goto L_0x0299
        L_0x02c1:
            r9 = r4
            goto L_0x024e
        L_0x02c3:
            r0 = r4
            goto L_0x023c
        L_0x02c6:
            r8 = 0
            goto L_0x0188
        L_0x02c9:
            r8 = 0
            goto L_0x0188
        L_0x02cc:
            r17 = 0
            goto L_0x0142
        L_0x02d0:
            r12 = 0
            goto L_0x0116
        L_0x02d3:
            r12 = 0
            goto L_0x0116
        L_0x02d6:
            r0 = 36598996877249879(0x82069800010d57, double:3.208691225279766E-306)
            X.0tM r0 = X.AnonymousClass0yP.A00(r0)
            java.lang.Object r0 = r0.getDefaultValue()
            long r0 = X.AnonymousClass7TE.A0R(r0)
            goto L_0x00f0
        L_0x02e9:
            r0 = 36595419169491088(0x82035700010890, double:3.206428668486834E-306)
            X.0tM r0 = X.AnonymousClass0yP.A00(r0)
            java.lang.Object r0 = r0.getDefaultValue()
            long r0 = X.AnonymousClass7TE.A0R(r0)
            goto L_0x00d5
        L_0x02fc:
            r0 = 36595419169425551(0x8203570000088f, double:3.206428668445388E-306)
            X.0tM r0 = X.AnonymousClass0yP.A00(r0)
            java.lang.Object r0 = r0.getDefaultValue()
            long r0 = X.AnonymousClass7TE.A0R(r0)
            goto L_0x00bd
        L_0x030f:
            r18 = 0
            goto L_0x009e
        L_0x0313:
            java.lang.Object r0 = r2.A01
            java.lang.Object r3 = X.DbT.A0r(r0)
            return r3
        L_0x031a:
            java.lang.Object r0 = r2.A01
            X.07f r3 = X.DbY.A0I(r0)
            return r3
        L_0x0321:
            java.lang.Object r3 = r2.A01
            com.instagram.common.session.UserSession r3 = (com.instagram.common.session.UserSession) r3
            X.0Tu r2 = X.0Tu.A05
            r0 = 36325433230570453(0x810dca000533d5, double:3.035688473567309E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 != 0) goto L_0x0338
            boolean r0 = X.AnonymousClass39U.A00(r3)
            if (r0 == 0) goto L_0x07a2
        L_0x0338:
            r2 = 1
            goto L_0x0782
        L_0x033b:
            java.lang.Object r3 = r2.A01
            X.0lg r3 = (X.0lg) r3
            X.0Tu r2 = X.0Tu.A05
            r0 = 36317852612957807(0x8106e50000166f, double:3.0308944604643745E-306)
            goto L_0x039a
        L_0x0347:
            java.lang.Object r3 = r2.A01
            X.0lg r3 = (X.0lg) r3
            X.0Tu r2 = X.0Tu.A05
            r0 = 36312664292590800(0x81022d000204d0, double:3.02761334577259E-306)
            goto L_0x039a
        L_0x0353:
            java.lang.Object r3 = r2.A01
            X.0lg r3 = (X.0lg) r3
            X.0Tu r2 = X.0Tu.A05
            r0 = 36314201890753000(0x810393000009e8, double:3.028585729041776E-306)
            goto L_0x039a
        L_0x035f:
            java.lang.Object r3 = r2.A01
            X.0lg r3 = (X.0lg) r3
            X.0Tu r2 = X.0Tu.A05
            r0 = 36312664292656337(0x81022d000304d1, double:3.027613345814036E-306)
            goto L_0x039a
        L_0x036b:
            java.lang.Object r3 = r2.A01
            X.0lg r3 = (X.0lg) r3
            X.0Tu r2 = X.0Tu.A05
            r0 = 36317938512369334(0x8106f9000116b6, double:3.0309487835981134E-306)
            goto L_0x039a
        L_0x0377:
            java.lang.Object r3 = r2.A01
            X.0lg r3 = (X.0lg) r3
            X.0Tu r2 = X.0Tu.A05
            r0 = 36322997983783653(0x810b9300002ae5, double:3.034148413693385E-306)
            goto L_0x039a
        L_0x0383:
            java.lang.Object r3 = r2.A01
            X.0lg r3 = (X.0lg) r3
            X.0Tu r2 = X.0Tu.A05
            r0 = 36322997983914726(0x810b9300022ae6, double:3.034148413776276E-306)
            goto L_0x039a
        L_0x038f:
            java.lang.Object r3 = r2.A01
            X.0lg r3 = (X.0lg) r3
            X.0Tu r2 = X.0Tu.A05
            r0 = 36319407398133112(0x81084f006b1d78, double:3.031877712869855E-306)
        L_0x039a:
            java.lang.Boolean r3 = X.AnonymousClass7TF.A0R(r2, r3, r0)
            return r3
        L_0x039f:
            java.lang.Object r0 = r2.A01
            X.JwM r0 = (X.C61084JwM) r0
            java.lang.Object r1 = r0.A00
            com.instagram.direct.capabilities.Capabilities r1 = (com.instagram.direct.capabilities.Capabilities) r1
            X.9Gx r0 = X.C376179Gx.RAVEN_VISUAL_MESSAGING
            boolean r0 = r1.A00(r0)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)
            return r3
        L_0x03b2:
            java.lang.Object r0 = r2.A01
            X.Mbx r0 = (X.C66752Mbx) r0
            com.instagram.common.session.UserSession r1 = r0.A04
            java.lang.String r0 = "MsysSecureThreadListLoader"
            X.MYg r3 = X.MYc.A01(r1, r0)
            return r3
        L_0x03bf:
            java.lang.Object r0 = r2.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            android.os.Bundle r1 = r0.mArguments
            if (r1 == 0) goto L_0x03d6
            java.lang.String r0 = "is_friend_map"
            java.lang.Boolean r1 = X.DbU.A0g(r1, r0)
        L_0x03cd:
            r2 = 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            if (r1 != r0) goto L_0x07a2
            goto L_0x0782
        L_0x03d6:
            r1 = 0
            goto L_0x03cd
        L_0x03d8:
            java.lang.Object r3 = r2.A01
            X.NKj r3 = (X.C68490NKj) r3
            X.0eM r0 = r3.A03
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r0)
            boolean r1 = r3.A01
            X.0eM r0 = r3.A02
            boolean r0 = X.AnonymousClass7TF.A1Z(r0)
            X.NN4 r3 = new X.NN4
            r3.<init>(r2, r1, r0)
            return r3
        L_0x03f0:
            java.lang.Object r3 = r2.A01
            X.NIn r3 = (X.C68449NIn) r3
            X.MuH r1 = X.C68449NIn.A02(r3)
            java.lang.String r0 = r1.A06
            X.C67761MuH.A03(r1, r0)
            android.view.View r1 = r3.A05
            r2 = 0
            if (r1 == 0) goto L_0x05af
            r0 = 6
            X.C71439Oke.A01(r1, r0, r3)
            com.instagram.common.ui.base.IgTextView r0 = r3.A0K
            java.lang.String r5 = "characterCounterTextView"
            if (r0 == 0) goto L_0x0521
            r1 = 1068960317(0x3fb70a3d, float:1.43)
            r0.setScaleX(r1)
            com.instagram.common.ui.base.IgTextView r0 = r3.A0K
            if (r0 == 0) goto L_0x0521
            r0.setScaleY(r1)
            android.view.View r0 = r3.A03
            if (r0 == 0) goto L_0x05ab
            android.view.ViewPropertyAnimator r1 = r0.animate()
            r0 = 1060320051(0x3f333333, float:0.7)
            android.view.ViewPropertyAnimator r1 = X.C66583MXo.A0E(r1, r0)
            android.view.animation.AccelerateDecelerateInterpolator r0 = new android.view.animation.AccelerateDecelerateInterpolator
            r0.<init>()
            android.view.ViewPropertyAnimator r1 = r1.setInterpolator(r0)
            X.PVg r0 = new X.PVg
            r0.<init>(r3)
            android.view.ViewPropertyAnimator r0 = r1.withStartAction(r0)
            r0.start()
            r4 = 0
            X.C68449NIn.A0U(r3, r4)
            com.instagram.common.ui.base.IgEditText r1 = r3.A0I
            java.lang.String r5 = "promptEditText"
            if (r1 == 0) goto L_0x0521
            X.PVh r0 = new X.PVh
            r0.<init>(r3)
            r1.post(r0)
            X.0eM r1 = r3.A1T
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r1)
            boolean r0 = X.AnonymousClass4AJ.A0B(r0)
            if (r0 == 0) goto L_0x045e
            X.C68449NIn.A0F(r3)
        L_0x045e:
            boolean r0 = X.C68449NIn.A0f(r3)
            if (r0 == 0) goto L_0x046e
            X.C68449NIn.A0H(r3)
            com.instagram.direct.inbox.notes.creation.NotesCreationPogView r0 = r3.A0b
            if (r0 == 0) goto L_0x05a7
            r0.setOnClickListener(r2)
        L_0x046e:
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r1)
            boolean r0 = X.C68449NIn.A0b(r0)
            if (r0 == 0) goto L_0x048d
            com.instagram.common.ui.base.IgEditText r2 = r3.A0I
            if (r2 == 0) goto L_0x0521
            android.content.Context r1 = r3.requireContext()
            r0 = 2131239629(0x7f0822cd, float:1.809557E38)
            X.DbU.A11(r1, r2, r0)
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r3.A0T
            if (r0 == 0) goto L_0x05a3
            r0.setVisibility(r4)
        L_0x048d:
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r3.A0S
            if (r0 == 0) goto L_0x04b6
            android.view.ViewPropertyAnimator r0 = r0.animate()
            if (r0 == 0) goto L_0x04b6
            r1 = 1065353216(0x3f800000, float:1.0)
            android.view.ViewPropertyAnimator r0 = r0.scaleX(r1)
            if (r0 == 0) goto L_0x04b6
            android.view.ViewPropertyAnimator r0 = r0.scaleY(r1)
            if (r0 == 0) goto L_0x04b6
            android.view.ViewPropertyAnimator r2 = r0.alpha(r1)
            if (r2 == 0) goto L_0x04b6
            r0 = 125(0x7d, double:6.2E-322)
            android.view.ViewPropertyAnimator r0 = r2.setDuration(r0)
            if (r0 == 0) goto L_0x04b6
            r0.start()
        L_0x04b6:
            com.instagram.common.ui.widget.imageview.IgImageView r1 = r3.A0S
            if (r1 == 0) goto L_0x05a0
            android.view.View$OnClickListener r0 = r3.A01
            X.AnonymousClass0fU.A00(r0, r1)
            goto L_0x05a0
        L_0x04c1:
            java.lang.Object r4 = r2.A01
            X.NIn r4 = (X.C68449NIn) r4
            X.MuH r1 = X.C68449NIn.A02(r4)
            java.lang.String r0 = r1.A05
            X.C67761MuH.A03(r1, r0)
            android.view.View r0 = r4.A05
            r3 = 0
            if (r0 == 0) goto L_0x05af
            r0.setOnTouchListener(r3)
            com.instagram.common.ui.base.IgTextView r0 = r4.A0K
            java.lang.String r5 = "characterCounterTextView"
            if (r0 == 0) goto L_0x0521
            r2 = 1065353216(0x3f800000, float:1.0)
            r0.setScaleX(r2)
            com.instagram.common.ui.base.IgTextView r0 = r4.A0K
            if (r0 == 0) goto L_0x0521
            r0.setScaleY(r2)
            android.view.View r0 = r4.A03
            if (r0 == 0) goto L_0x05ab
            android.view.ViewPropertyAnimator r0 = r0.animate()
            android.view.ViewPropertyAnimator r1 = X.C66583MXo.A0E(r0, r2)
            android.view.animation.DecelerateInterpolator r0 = new android.view.animation.DecelerateInterpolator
            r0.<init>()
            android.view.ViewPropertyAnimator r0 = r1.setInterpolator(r0)
            r0.start()
            r1 = 1
            X.C68449NIn.A0U(r4, r1)
            com.instagram.direct.inbox.notes.creation.NotesCreationPogView r0 = r4.A0b
            if (r0 == 0) goto L_0x05a7
            r0.setAlpha(r2)
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r4.A0U
            java.lang.String r5 = "selectedNoteXButton"
            if (r0 == 0) goto L_0x0521
            r0.setAlpha(r2)
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r4.A0U
            if (r0 == 0) goto L_0x0521
            r0.setEnabled(r1)
            com.instagram.common.ui.base.IgEditText r1 = r4.A0H
            if (r1 != 0) goto L_0x0526
            java.lang.String r5 = "noteEditText"
        L_0x0521:
            X.0qQ.A0F(r5)
            goto L_0x072f
        L_0x0526:
            X.PVf r0 = new X.PVf
            r0.<init>(r4)
            r1.post(r0)
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r4.A0S
            if (r0 == 0) goto L_0x0556
            android.view.ViewPropertyAnimator r0 = r0.animate()
            if (r0 == 0) goto L_0x0556
            r1 = 0
            android.view.ViewPropertyAnimator r0 = r0.scaleX(r1)
            if (r0 == 0) goto L_0x0556
            android.view.ViewPropertyAnimator r0 = r0.scaleY(r1)
            if (r0 == 0) goto L_0x0556
            android.view.ViewPropertyAnimator r2 = r0.alpha(r1)
            if (r2 == 0) goto L_0x0556
            r0 = 125(0x7d, double:6.2E-322)
            android.view.ViewPropertyAnimator r0 = r2.setDuration(r0)
            if (r0 == 0) goto L_0x0556
            r0.start()
        L_0x0556:
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r4.A0S
            if (r0 == 0) goto L_0x055d
            r0.setOnClickListener(r3)
        L_0x055d:
            X.0eM r1 = r4.A1T
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r1)
            boolean r0 = X.AnonymousClass4AJ.A0B(r0)
            if (r0 == 0) goto L_0x0577
            androidx.cardview.widget.CardView r0 = r4.A07
            if (r0 != 0) goto L_0x0570
            java.lang.String r5 = "musicNoteEntryPointButton"
            goto L_0x0521
        L_0x0570:
            java.util.List r0 = X.AnonymousClass7TE.A1I(r0)
            X.C68449NIn.A0T(r4, r0)
        L_0x0577:
            boolean r0 = X.C68449NIn.A0f(r4)
            if (r0 == 0) goto L_0x0583
            X.C68449NIn.A0M(r4)
            X.C68449NIn.A0A(r4)
        L_0x0583:
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r1)
            boolean r0 = X.C68449NIn.A0b(r0)
            if (r0 == 0) goto L_0x05a0
            com.instagram.common.ui.base.IgEditText r0 = r4.A0I
            if (r0 != 0) goto L_0x0594
            java.lang.String r5 = "promptEditText"
            goto L_0x0521
        L_0x0594:
            r0.setBackground(r3)
            com.instagram.common.ui.widget.imageview.IgImageView r1 = r4.A0T
            if (r1 == 0) goto L_0x05a3
            r0 = 8
            r1.setVisibility(r0)
        L_0x05a0:
            X.0gF r3 = X.C60340gF.A00
            return r3
        L_0x05a3:
            java.lang.String r5 = "promptXButton"
            goto L_0x0521
        L_0x05a7:
            java.lang.String r5 = "pogViewContainer"
            goto L_0x0521
        L_0x05ab:
            java.lang.String r5 = "avatarContainer"
            goto L_0x0521
        L_0x05af:
            java.lang.String r5 = "bubbleNestedScrollView"
            goto L_0x0521
        L_0x05b3:
            java.lang.Object r3 = r2.A01
            X.NIn r3 = (X.C68449NIn) r3
            X.0eM r0 = r3.A1T
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r0)
            boolean r1 = X.C68449NIn.A0c(r3)
            boolean r0 = X.C68449NIn.A0g(r3)
            X.NN4 r3 = new X.NN4
            r3.<init>(r2, r1, r0)
            return r3
        L_0x05cb:
            java.lang.Object r0 = r2.A01
            X.NIn r0 = (X.C68449NIn) r0
            X.0eM r0 = r0.A1T
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.H5Y r3 = new X.H5Y
            r3.<init>(r0)
            return r3
        L_0x05db:
            java.lang.Object r0 = r2.A01
            X.NIn r0 = (X.C68449NIn) r0
            X.0eM r0 = r0.A1T
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.NMi r3 = new X.NMi
            r3.<init>(r0)
            return r3
        L_0x05eb:
            java.lang.Object r0 = r2.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            android.os.Bundle r1 = r0.mArguments
            if (r1 == 0) goto L_0x06c4
            java.lang.String r0 = "arg_friend_map_note_latitude"
            java.lang.String r3 = r1.getString(r0)
            return r3
        L_0x05fa:
            java.lang.Object r0 = r2.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            android.os.Bundle r1 = r0.mArguments
            if (r1 == 0) goto L_0x06c4
            java.lang.String r0 = "arg_friend_map_note_longitude"
            java.lang.String r3 = r1.getString(r0)
            return r3
        L_0x0609:
            java.lang.Object r2 = r2.A01
            X.NIn r2 = (X.C68449NIn) r2
            X.0eM r0 = r2.A1F
            java.lang.Object r1 = r0.getValue()
            X.Gh7 r1 = (X.C53016Gh7) r1
            java.lang.String r0 = r2.A0l
            if (r0 != 0) goto L_0x061b
            java.lang.String r0 = ""
        L_0x061b:
            X.L3X r3 = new X.L3X
            r3.<init>(r1, r0)
            return r3
        L_0x0621:
            java.lang.Object r1 = r2.A01
            X.NIn r1 = (X.C68449NIn) r1
            androidx.fragment.app.FragmentActivity r4 = r1.requireActivity()
            X.0eM r0 = r1.A1J
            java.lang.Object r9 = r0.getValue()
            X.L3X r9 = (X.L3X) r9
            androidx.fragment.app.FragmentActivity r0 = r1.requireActivity()
            X.00N r5 = r0.getOnBackPressedDispatcher()
            X.0eM r0 = r1.A1M
            java.lang.Object r7 = X.AnonymousClass7TE.A14(r0)
            X.3E6 r7 = (X.AnonymousClass3E6) r7
            X.0eM r0 = r1.A1I
            java.lang.Object r8 = r0.getValue()
            com.instagram.contentnotes.data.immersive.params.ContentNotesImmersiveCreationUiState r8 = (com.instagram.contentnotes.data.immersive.params.ContentNotesImmersiveCreationUiState) r8
            X.0eM r0 = r1.A1T
            com.instagram.common.session.UserSession r6 = X.AnonymousClass7TE.A0l(r0)
            X.0xx r10 = X.DbV.A0J(r1)
            X.LN3 r3 = new X.LN3
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            return r3
        L_0x0659:
            java.lang.Object r2 = r2.A01
            r1 = 1
            r0 = 0
            X.3E5 r3 = X.AnonymousClass3E4.A01(r2, r0, r1)
            return r3
        L_0x0662:
            java.lang.Object r1 = r2.A01
            r0 = 8
            X.Oz5 r3 = new X.Oz5
            r3.<init>(r1, r0)
            return r3
        L_0x066c:
            java.lang.Object r0 = r2.A01
            X.NIn r0 = (X.C68449NIn) r0
            X.0eM r0 = r0.A1I
            java.lang.Object r0 = r0.getValue()
            com.instagram.contentnotes.data.immersive.params.ContentNotesImmersiveCreationUiState r0 = (com.instagram.contentnotes.data.immersive.params.ContentNotesImmersiveCreationUiState) r0
            if (r0 == 0) goto L_0x06c4
            java.lang.String r3 = r0.A01
            return r3
        L_0x067d:
            java.lang.Object r2 = r2.A01
            X.NIn r2 = (X.C68449NIn) r2
            X.0eM r0 = r2.A1T
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.17i r1 = X.17h.A00(r0)
            X.0eM r0 = r2.A1O
            java.lang.String r0 = X.DbS.A0t(r0)
            com.instagram.user.model.User r3 = r1.A02(r0)
            return r3
        L_0x0696:
            java.lang.Object r1 = r2.A01
            X.NIn r1 = (X.C68449NIn) r1
            X.0eM r0 = r1.A1T
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.OL6 r3 = new X.OL6
            r3.<init>(r1, r0)
            return r3
        L_0x06a6:
            java.lang.Object r0 = r2.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            android.os.Bundle r1 = r0.mArguments
            if (r1 == 0) goto L_0x06c4
            java.lang.String r0 = "arg_prompt_note_id"
            java.lang.String r3 = r1.getString(r0)
            return r3
        L_0x06b5:
            java.lang.Object r0 = r2.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            android.os.Bundle r1 = r0.mArguments
            if (r1 == 0) goto L_0x06c4
            java.lang.String r0 = "arg_prompt_note_text"
            java.lang.String r3 = r1.getString(r0)
            return r3
        L_0x06c4:
            r3 = 0
            return r3
        L_0x06c6:
            java.lang.Object r4 = r2.A01
            X.NIn r4 = (X.C68449NIn) r4
            com.instagram.common.ui.base.IgEditText r0 = r4.A0H
            java.lang.String r2 = "noteEditText"
            if (r0 == 0) goto L_0x0728
            android.text.TextPaint r1 = r0.getPaint()
            com.instagram.common.ui.base.IgEditText r0 = r4.A0H
            if (r0 == 0) goto L_0x0728
            java.lang.String r0 = X.AnonymousClass7TF.A0f(r0)
            float r5 = r1.measureText(r0)
            com.instagram.common.ui.base.IgEditText r0 = r4.A0H
            if (r0 == 0) goto L_0x0728
            int r0 = r0.getPaddingStart()
            float r0 = (float) r0
            float r5 = r5 + r0
            com.instagram.common.ui.base.IgEditText r0 = r4.A0H
            if (r0 == 0) goto L_0x0728
            int r0 = r0.getPaddingEnd()
            float r0 = (float) r0
            float r5 = r5 + r0
            android.content.Context r2 = r4.requireContext()
            r1 = 1116471296(0x428c0000, float:70.0)
            r0 = 1061158912(0x3f400000, float:0.75)
            float r1 = r1 / r0
            float r0 = X.C61380mr.A00(r2, r1)
            java.lang.String r3 = "pogViewContainer"
            java.lang.String r2 = "bubbleView"
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            com.instagram.direct.inbox.notes.creation.NotesCreationBubbleView r1 = r4.A0a
            if (r0 <= 0) goto L_0x071e
            if (r1 == 0) goto L_0x0728
            com.instagram.direct.inbox.notes.creation.NotesCreationPogView r0 = r4.A0b
            if (r0 == 0) goto L_0x072c
            X.C319756rA.A01(r1, r0)
        L_0x0714:
            com.instagram.direct.inbox.notes.creation.NotesCreationBubbleView r0 = r4.A0a
            if (r0 == 0) goto L_0x0728
            r0.invalidate()
            X.0gF r3 = X.C60340gF.A00
            return r3
        L_0x071e:
            if (r1 == 0) goto L_0x0728
            com.instagram.direct.inbox.notes.creation.NotesCreationPogView r0 = r4.A0b
            if (r0 == 0) goto L_0x072c
            X.C319756rA.A02(r1, r0)
            goto L_0x0714
        L_0x0728:
            X.0qQ.A0F(r2)
            goto L_0x072f
        L_0x072c:
            X.0qQ.A0F(r3)
        L_0x072f:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0734:
            java.lang.Object r0 = r2.A01
            X.1Av r0 = (X.1Av) r0
            X.0xa r1 = r0.A01
            java.lang.String r0 = "notes_music_reshare_creation_tooltip_seen_count"
            X.0xY r3 = X.AnonymousClass7TG.A0g(r1, r0)
            long r1 = java.lang.System.currentTimeMillis()
            java.lang.String r0 = "notes_music_reshare_creation_tooltip_last_impression_timestamp_ms"
            r3.E5c(r0, r1)
            r3.apply()
            X.0gF r3 = X.C60340gF.A00
            return r3
        L_0x074f:
            java.lang.Object r2 = r2.A01
            X.OL6 r2 = (X.OL6) r2
            com.instagram.common.session.UserSession r0 = r2.A02
            X.1Am r1 = X.1Al.A01(r0)
            X.1An r0 = X.1An.A2K
            X.0xa r3 = X.C51969G9p.A0n(r1, r0, r2)
            return r3
        L_0x0760:
            r0 = 683150568(0x28b80ce8, float:2.04337E-14)
            X.19S r1 = X.AnonymousClass43D.A00(r0)
            java.lang.Object r0 = r2.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.KWa r3 = new X.KWa
            r3.<init>(r0, r1)
            return r3
        L_0x0771:
            java.lang.Object r0 = r2.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            android.os.Bundle r1 = r0.mArguments
            r2 = 1
            if (r1 == 0) goto L_0x07a2
            java.lang.String r0 = "arg_is_in_friend_map_mode"
            boolean r0 = r1.getBoolean(r0)
            if (r0 != r2) goto L_0x07a2
        L_0x0782:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r2)
            return r3
        L_0x0787:
            java.lang.Object r1 = r2.A01
            X.NIn r1 = (X.C68449NIn) r1
            X.0eM r0 = r1.A1R
            java.lang.Object r0 = r0.getValue()
            r2 = 1
            if (r0 == 0) goto L_0x07a2
            X.0eM r0 = r1.A1S
            java.lang.String r0 = X.DbS.A0t(r0)
            if (r0 == 0) goto L_0x07a2
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0782
        L_0x07a2:
            r2 = 0
            goto L_0x0782
        L_0x07a4:
            java.lang.Object r0 = r2.A01
            X.0r6[] r0 = (X.AnonymousClass0r6[]) r0
            int r0 = r0.length
            java.lang.Object[] r3 = new java.lang.Object[r0]
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C73928Pm8.invoke():java.lang.Object");
    }
}
