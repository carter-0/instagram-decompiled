package X;

/* renamed from: X.Wvp  reason: case insensitive filesystem */
public final class C20608Wvp extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C20608Wvp(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0603, code lost:
        r3.E5Z(r2, r0 + 1);
        r3.apply();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x0645, code lost:
        return X.AnonymousClass7TF.A0R(r2, r3, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x065a, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x03c6, code lost:
        r0 = "dataSource";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x03c8, code lost:
        X.0qQ.A0F(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x03cf, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r45 = this;
            r2 = r45
            int r0 = r2.A00
            switch(r0) {
                case 0: goto L_0x065b;
                case 1: goto L_0x0653;
                case 2: goto L_0x0653;
                case 3: goto L_0x0646;
                case 4: goto L_0x0630;
                case 5: goto L_0x061e;
                case 6: goto L_0x060c;
                case 7: goto L_0x05e0;
                case 8: goto L_0x05a3;
                case 9: goto L_0x058d;
                case 10: goto L_0x0584;
                case 11: goto L_0x0551;
                case 12: goto L_0x0536;
                case 13: goto L_0x052d;
                case 14: goto L_0x051d;
                case 15: goto L_0x050a;
                case 16: goto L_0x066b;
                case 17: goto L_0x0503;
                case 18: goto L_0x0007;
                case 19: goto L_0x04f8;
                case 20: goto L_0x04e5;
                case 21: goto L_0x04ca;
                case 22: goto L_0x04c0;
                case 23: goto L_0x04b6;
                case 24: goto L_0x048e;
                case 25: goto L_0x0484;
                case 26: goto L_0x047a;
                case 27: goto L_0x0470;
                case 28: goto L_0x0466;
                case 29: goto L_0x045c;
                case 30: goto L_0x0452;
                case 31: goto L_0x0448;
                case 32: goto L_0x043e;
                case 33: goto L_0x0434;
                case 34: goto L_0x042a;
                case 35: goto L_0x0420;
                case 36: goto L_0x0416;
                case 37: goto L_0x040c;
                case 38: goto L_0x0402;
                case 39: goto L_0x03e0;
                case 40: goto L_0x03d0;
                case 41: goto L_0x03b9;
                case 42: goto L_0x03a4;
                case 43: goto L_0x03a4;
                case 44: goto L_0x0385;
                case 45: goto L_0x00b3;
                case 46: goto L_0x066b;
                case 47: goto L_0x0503;
                case 48: goto L_0x0007;
                case 49: goto L_0x000e;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r0 = r2.A01
            X.07f r0 = X.DbY.A0I(r0)
            return r0
        L_0x000e:
            java.lang.Object r1 = r2.A01
            X.UZq r1 = (X.C15286UZq) r1
            java.lang.String r12 = X.C13988Tno.A0Z(r1)
            java.lang.String r13 = r1.A08()
            java.lang.String r14 = X.C13988Tno.A0X(r1)
            X.0eM r4 = r1.A0m
            com.instagram.common.session.UserSession r5 = X.AnonymousClass7TE.A0l(r4)
            android.content.Context r2 = r1.requireContext()
            r0 = 0
            X.0qQ.A0B(r5, r0)
            android.content.Context r3 = r2.getApplicationContext()
            r0 = 19
            X.To0 r2 = new X.To0
            r2.<init>(r3, r0)
            java.lang.Class<X.Ocm> r0 = X.C71108Ocm.class
            java.lang.Object r3 = r5.A01(r0, r2)
            X.Ocm r3 = (X.C71108Ocm) r3
            android.content.Context r5 = r1.requireContext()
            java.lang.String r0 = X.C13988Tno.A0X(r1)
            X.OFd r2 = new X.OFd
            r2.<init>(r5, r0)
            boolean r0 = r1 instanceof X.C16206UqV
            if (r0 == 0) goto L_0x0067
            r0 = r1
            X.UqV r0 = (X.C16206UqV) r0
            X.0eM r0 = r0.A01
        L_0x0055:
            java.lang.Object r5 = r0.getValue()
            X.L71 r5 = (X.L71) r5
            com.instagram.common.session.UserSession r6 = X.AnonymousClass7TE.A0l(r4)
            X.Vv4 r4 = r1.A0D
            if (r4 != 0) goto L_0x009f
            java.lang.String r0 = "perfLogger"
            goto L_0x03c8
        L_0x0067:
            boolean r0 = r1 instanceof X.C16207UqW
            if (r0 == 0) goto L_0x0071
            r0 = r1
            X.UqW r0 = (X.C16207UqW) r0
            X.0eM r0 = r0.A01
            goto L_0x0055
        L_0x0071:
            boolean r0 = r1 instanceof X.C16203UqS
            if (r0 == 0) goto L_0x007b
            r0 = r1
            X.UqS r0 = (X.C16203UqS) r0
            X.0eM r0 = r0.A01
            goto L_0x0055
        L_0x007b:
            boolean r0 = r1 instanceof X.C16208UqX
            if (r0 == 0) goto L_0x0085
            r0 = r1
            X.UqX r0 = (X.C16208UqX) r0
            X.0eM r0 = r0.A01
            goto L_0x0055
        L_0x0085:
            boolean r0 = r1 instanceof X.C16205UqU
            if (r0 == 0) goto L_0x008f
            r0 = r1
            X.UqU r0 = (X.C16205UqU) r0
            X.0eM r0 = r0.A01
            goto L_0x0055
        L_0x008f:
            boolean r0 = r1 instanceof X.C16204UqT
            if (r0 == 0) goto L_0x0099
            r0 = r1
            X.UqT r0 = (X.C16204UqT) r0
            X.0eM r0 = r0.A01
            goto L_0x0055
        L_0x0099:
            r0 = r1
            X.UqY r0 = (X.C16209UqY) r0
            X.0eM r0 = r0.A04
            goto L_0x0055
        L_0x009f:
            X.Hop r1 = r1.A0C
            if (r1 != 0) goto L_0x00a7
            java.lang.String r0 = "serpMetaAiHcmLogger"
            goto L_0x03c8
        L_0x00a7:
            X.UhZ r0 = new X.UhZ
            r9 = r4
            r10 = r3
            r11 = r2
            r8 = r5
            r7 = r1
            r5 = r0
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return r0
        L_0x00b3:
            java.lang.Object r0 = r2.A01
            X.TqY r0 = (X.C14138TqY) r0
            X.0eM r1 = r0.A0t
            r44 = r1
            java.lang.Object r8 = r44.getValue()
            com.instagram.common.session.UserSession r8 = (com.instagram.common.session.UserSession) r8
            r1 = r0
            X.TqX r1 = (X.C14137TqX) r1
            java.lang.String r15 = r1.A09
            java.lang.String r5 = "Required value was null."
            if (r15 == 0) goto L_0x037f
            X.TqX r3 = r1.A0b
            java.lang.String r2 = r3.A07
            r22 = r2
            X.X4b r2 = r0.A0k
            r43 = r2
            X.X6r r2 = r0.A0i
            r26 = r2
            X.0eM r2 = r3.A0h
            java.lang.Object r6 = r2.getValue()
            X.TwL r6 = (X.C14437TwL) r6
            if (r6 == 0) goto L_0x0379
            X.0eM r2 = r3.A0f
            java.lang.Object r4 = r2.getValue()
            X.TwK r4 = (X.C14436TwK) r4
            if (r4 == 0) goto L_0x0373
            X.0eM r2 = r3.A0i
            java.lang.Object r7 = r2.getValue()
            X.Ja5 r7 = (X.C59830Ja5) r7
            X.X42 r2 = r0.A0d
            r21 = r2
            java.lang.Object r3 = r44.getValue()
            com.instagram.common.session.UserSession r3 = (com.instagram.common.session.UserSession) r3
            X.328 r2 = new X.328
            r2.<init>(r0)
            X.32A r14 = new X.32A
            r14.<init>(r0, r3, r2)
            X.8av r24 = r0.A0D()
            java.lang.Object r2 = r44.getValue()
            com.instagram.common.session.UserSession r2 = (com.instagram.common.session.UserSession) r2
            X.5js r13 = new X.5js
            r13.<init>(r0, r2)
            r17 = 1
            X.TxH r12 = new X.TxH
            r2 = r17
            r12.<init>(r0, r2)
            X.X4X r2 = r0.A0f
            r25 = r2
            X.X4a r2 = r0.A0j
            r27 = r2
            boolean r2 = r0.A0M
            r20 = r2
            boolean r2 = r0.A0N
            r19 = r2
            X.X8b r2 = r0.A0l
            r18 = r2
            r23 = 0
            r2 = 40
            X.Wvp r11 = new X.Wvp
            r11.<init>(r0, r2)
            r2 = 41
            X.Wvp r10 = new X.Wvp
            r10.<init>(r0, r2)
            java.lang.Object r9 = r44.getValue()
            com.instagram.common.session.UserSession r9 = (com.instagram.common.session.UserSession) r9
            X.0Tu r5 = X.AnonymousClass7TF.A0H(r9)
            r2 = 36328340924742921(0x81106f00193d09, double:3.037527311070322E-306)
            boolean r40 = X.182.A06(r5, r9, r2)
            java.lang.Object r9 = r44.getValue()
            com.instagram.common.session.UserSession r9 = (com.instagram.common.session.UserSession) r9
            r16 = 0
            r2 = r16
            X.0qQ.A0B(r9, r2)
            X.0Tu r5 = X.0Tu.A05
            r2 = 36328340924022014(0x81106f000e3cfe, double:3.037527310614418E-306)
            boolean r41 = X.182.A06(r5, r9, r2)
            com.instagram.common.session.UserSession r9 = X.C13988Tno.A0L(r0)
            r2 = 36328340924153088(0x81106f00103d00, double:3.0375273106973095E-306)
            boolean r42 = X.182.A06(r5, r9, r2)
            X.Tqa r9 = new X.Tqa
            r28 = r43
            r29 = r12
            r30 = r18
            r31 = r6
            r32 = r7
            r33 = r4
            r34 = r15
            r35 = r22
            r36 = r11
            r37 = r10
            r38 = r20
            r39 = r19
            r18 = r9
            r19 = r8
            r20 = r21
            r21 = r13
            r22 = r14
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42)
            X.2tC r2 = X.DbV.A0S(r0)
            com.instagram.common.session.UserSession r6 = X.C13988Tno.A0L(r0)
            r3 = 36328044570360710(0x81102a00003b86, double:3.037339895365689E-306)
            boolean r3 = X.182.A06(r5, r6, r3)
            if (r3 == 0) goto L_0x01e3
            X.MnP r10 = r0.A0G()
            com.instagram.common.session.UserSession r6 = X.C13988Tno.A0L(r0)
            r3 = 36328044571933595(0x81102a00183b9b, double:3.0373398963603876E-306)
            boolean r12 = X.182.A06(r5, r6, r3)
            boolean r13 = X.C13989Tnp.A1X(r0)
            com.instagram.common.session.UserSession r6 = X.C13988Tno.A0L(r0)
            r3 = 36609519547455348(0x82102a00061774, double:3.2153458042890966E-306)
            long r3 = X.182.A01(r5, r6, r3)
            int r6 = (int) r3
            X.NQJ r3 = new X.NQJ
            r11 = r6
            r8 = r3
            r8.<init>(r9, r10, r11, r12, r13)
            r2.A01(r3)
        L_0x01e3:
            java.lang.Object r7 = r44.getValue()
            com.instagram.common.session.UserSession r7 = (com.instagram.common.session.UserSession) r7
            X.MnP r11 = r0.A0G()
            r3 = r16
            X.0qQ.A0B(r7, r3)
            r10 = 2
            boolean r6 = X.C13988Tno.A1Y(r7)
            r3 = 36319055203801993(0x8107fd00001b89, double:3.0316549837566824E-306)
            boolean r25 = X.182.A06(r5, r7, r3)
            boolean r21 = X.C13988Tno.A1Y(r7)
            r3 = 9
            X.PFs r8 = new X.PFs
            r8.<init>(r1, r3)
            r3 = 36316353669566736(0x81058800031110, double:3.0299465226281006E-306)
            boolean r23 = X.182.A06(r5, r7, r3)
            X.Mmz r3 = X.C14408Tvb.A00(r7)
            int r3 = r3.A01
            boolean r24 = X.AnonymousClass7TF.A1S(r3, r10)
            X.Tw1 r3 = new X.Tw1
            r26 = r3
            r27 = r1
            r28 = r7
            r29 = r9
            r30 = r11
            r31 = r21
            r32 = r16
            r33 = r6
            r26.<init>(r27, r28, r29, r30, r31, r32, r33)
            r2.A01(r3)
            X.Tw0 r3 = new X.Tw0
            r3.<init>(r1, r9, r11, r6)
            r2.A01(r3)
            X.0eM r3 = r1.A0q
            boolean r26 = X.AnonymousClass7TF.A1Z(r3)
            boolean r10 = r1.A0D
            boolean r4 = r1.A0C
            X.Tw6 r3 = new X.Tw6
            r19 = r9
            r20 = r11
            r22 = r6
            r27 = r10
            r28 = r4
            r18 = r3
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            r2.A01(r3)
            X.Tw8 r4 = new X.Tw8
            r4.<init>(r1)
            X.Ja4 r3 = new X.Ja4
            r18 = r3
            r19 = r7
            r20 = r9
            r21 = r4
            r22 = r11
            r23 = r16
            r24 = r16
            r25 = r16
            r26 = r6
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26)
            r2.A01(r3)
            X.Tw9 r10 = new X.Tw9
            r10.<init>(r1)
            r3 = 2131972797(0x7f1352bd, float:1.9582612E38)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            X.MnI r3 = new X.MnI
            r3.<init>(r8, r10, r4)
            r2.A01(r3)
            X.Tw4 r3 = new X.Tw4
            r18 = r3
            r19 = r1
            r20 = r7
            r21 = r9
            r23 = r6
            r18.<init>(r19, r20, r21, r22, r23)
            r2.A01(r3)
            X.TwC r3 = new X.TwC
            r3.<init>(r1, r9)
            r2.A01(r3)
            android.content.Context r4 = r1.requireContext()
            X.TwB r3 = new X.TwB
            r3.<init>(r4, r7, r9)
            r2.A01(r3)
            android.content.Context r4 = r1.requireContext()
            X.Dh4 r3 = new X.Dh4
            r3.<init>(r4, r1, r7, r9)
            r2.A01(r3)
            android.content.Context r6 = r1.requireContext()
            X.TwA r4 = new X.TwA
            r4.<init>(r7, r1)
            X.Dh5 r3 = new X.Dh5
            r3.<init>(r6, r4)
            r2.A01(r3)
            androidx.fragment.app.FragmentActivity r18 = r0.getActivity()
            java.lang.Object r7 = r44.getValue()
            com.instagram.common.session.UserSession r7 = (com.instagram.common.session.UserSession) r7
            X.MnP r22 = r0.A0G()
            java.lang.String r6 = r1.A0e
            java.lang.Object r1 = r44.getValue()
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            r3 = 36326266453898912(0x810e8c000036a0, double:3.0362154073553474E-306)
            boolean r24 = X.182.A06(r5, r1, r3)
            boolean r3 = r0.A0P
            X.MnG r1 = new X.MnG
            r19 = r0
            r20 = r7
            r23 = r6
            r25 = r17
            r26 = r3
            r27 = r17
            r28 = r17
            r29 = r17
            r30 = r16
            r17 = r1
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            r2.A01(r1)
            android.content.Context r16 = r0.requireContext()
            X.Trf r13 = r0.A07
            if (r13 == 0) goto L_0x03c6
            X.X4Z r15 = r0.A0h
            X.G6V r12 = r0.A0p
            X.XBu r11 = r0.A0c
            X.X47 r10 = r0.A0e
            X.X4d r8 = r0.A0m
            java.lang.Object r1 = r44.getValue()
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            X.Mmz r4 = X.C14408Tvb.A00(r1)
            int r3 = r4.A01
            if (r3 == 0) goto L_0x0371
            X.8jb r1 = r4.A02
            java.util.List r1 = r1.A04
            boolean r1 = X.AnonymousClass7TE.A1b(r1)
            if (r1 == 0) goto L_0x0371
            r1 = 3
            if (r3 == r1) goto L_0x0371
            int r7 = r4.A00
        L_0x033e:
            boolean r6 = r0.A0P
            int r5 = r0.A00
            boolean r4 = r0.A0Q
            boolean r3 = r0.A0K
            boolean r1 = r0.A0O
            boolean r14 = r0.A0L
            X.TxA r0 = new X.TxA
            r22 = r43
            r23 = r8
            r24 = r9
            r25 = r12
            r26 = r7
            r27 = r5
            r28 = r6
            r29 = r4
            r30 = r3
            r31 = r1
            r32 = r14
            r19 = r10
            r20 = r13
            r21 = r15
            r18 = r11
            r15 = r0
            r17 = r2
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            return r0
        L_0x0371:
            r7 = -1
            goto L_0x033e
        L_0x0373:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r5)
            throw r0
        L_0x0379:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r5)
            throw r0
        L_0x037f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r5)
            throw r0
        L_0x0385:
            X.Tws r1 = X.C14471Twt.A05
            java.lang.Object r0 = r2.A01
            X.TqY r0 = (X.C14138TqY) r0
            X.0eM r0 = r0.A0t
            java.lang.Object r0 = r0.getValue()
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.Twt r0 = r1.A00(r0)
            X.0eM r0 = r0.A02
            java.lang.Object r0 = r0.getValue()
            X.0r6 r0 = (X.AnonymousClass0r6) r0
            androidx.lifecycle.CoroutineLiveData r0 = X.DbT.A0G(r0)
            return r0
        L_0x03a4:
            java.lang.Object r0 = r2.A01
            X.TqY r0 = (X.C14138TqY) r0
            X.0eM r0 = r0.A0t
            java.lang.Object r1 = r0.getValue()
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            r0 = 0
            X.0qQ.A0B(r1, r0)
            java.lang.Boolean r0 = X.C249093j7.A00(r1)
            return r0
        L_0x03b9:
            java.lang.Object r1 = r2.A01
            X.TqY r1 = (X.C14138TqY) r1
            X.Trf r0 = r1.A07
            if (r0 == 0) goto L_0x03c6
            X.C14488TxA.A00(r0, r1)
            goto L_0x0658
        L_0x03c6:
            java.lang.String r0 = "dataSource"
        L_0x03c8:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x03d0:
            java.lang.Object r0 = r2.A01
            X.TqY r0 = (X.C14138TqY) r0
            X.TwE r0 = r0.A06
            if (r0 == 0) goto L_0x0658
            r0.A01()
            r0.A02()
            goto L_0x0658
        L_0x03e0:
            java.lang.Object r1 = r2.A01
            X.UZq r1 = (X.C15286UZq) r1
            X.0eM r0 = r1.A0m
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r0)
            java.lang.String r1 = X.C13988Tno.A0a(r1)
            r0 = 1
            X.0qQ.A0B(r2, r0)
            r0 = 2
            X.Iwl r3 = new X.Iwl
            r3.<init>(r1, r2, r0)
            java.lang.String r2 = "music/audio_global_search/"
            java.lang.String r1 = "audio_serp_page"
            X.Uq7 r0 = new X.Uq7
            r0.<init>(r2, r1, r3)
            return r0
        L_0x0402:
            java.lang.Object r1 = r2.A01
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            X.TvZ r0 = new X.TvZ
            r0.<init>(r1)
            return r0
        L_0x040c:
            java.lang.Object r1 = r2.A01
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            X.Tww r0 = new X.Tww
            r0.<init>(r1)
            return r0
        L_0x0416:
            java.lang.Object r1 = r2.A01
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            X.JZv r0 = new X.JZv
            r0.<init>(r1)
            return r0
        L_0x0420:
            java.lang.Object r1 = r2.A01
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            X.Mmz r0 = new X.Mmz
            r0.<init>(r1)
            return r0
        L_0x042a:
            java.lang.Object r1 = r2.A01
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            X.VTM r0 = new X.VTM
            r0.<init>(r1)
            return r0
        L_0x0434:
            java.lang.Object r1 = r2.A01
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            X.ToJ r0 = new X.ToJ
            r0.<init>(r1)
            return r0
        L_0x043e:
            java.lang.Object r1 = r2.A01
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            X.WT5 r0 = new X.WT5
            r0.<init>(r1)
            return r0
        L_0x0448:
            java.lang.Object r1 = r2.A01
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            X.Tvn r0 = new X.Tvn
            r0.<init>(r1)
            return r0
        L_0x0452:
            java.lang.Object r1 = r2.A01
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            X.Vvr r0 = new X.Vvr
            r0.<init>(r1)
            return r0
        L_0x045c:
            java.lang.Object r1 = r2.A01
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            X.Tvp r0 = new X.Tvp
            r0.<init>(r1)
            return r0
        L_0x0466:
            java.lang.Object r1 = r2.A01
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            X.Tvo r0 = new X.Tvo
            r0.<init>(r1)
            return r0
        L_0x0470:
            java.lang.Object r1 = r2.A01
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            X.TvT r0 = new X.TvT
            r0.<init>(r1)
            return r0
        L_0x047a:
            java.lang.Object r1 = r2.A01
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            X.Twu r0 = new X.Twu
            r0.<init>(r1)
            return r0
        L_0x0484:
            java.lang.Object r1 = r2.A01
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            X.Twx r0 = new X.Twx
            r0.<init>(r1)
            return r0
        L_0x048e:
            java.lang.Object r4 = r2.A01
            com.instagram.common.session.UserSession r4 = (com.instagram.common.session.UserSession) r4
            X.4xp r3 = X.11q.A0A
            X.4xq r6 = new X.4xq
            r6.<init>(r3)
            X.4xq r5 = new X.4xq
            r5.<init>(r3)
            X.AnonymousClass7TG.A1N(r3, r4)
            r2 = 20
            X.Iw8 r1 = new X.Iw8
            r1.<init>(r2, r3, r4, r5, r6)
            java.lang.Class<com.instagram.screentime.IGScreenTimeApi> r0 = com.instagram.screentime.IGScreenTimeApi.class
            java.lang.Object r1 = r4.A01(r0, r1)
            com.instagram.screentime.IGScreenTimeApi r1 = (com.instagram.screentime.IGScreenTimeApi) r1
            X.11q r0 = new X.11q
            r0.<init>(r4, r1)
            return r0
        L_0x04b6:
            java.lang.Object r1 = r2.A01
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            X.HEM r0 = new X.HEM
            r0.<init>(r1)
            return r0
        L_0x04c0:
            java.lang.Object r1 = r2.A01
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            X.HEL r0 = new X.HEL
            r0.<init>(r1)
            return r0
        L_0x04ca:
            java.lang.Object r1 = r2.A01
            X.H0z r1 = (X.C54155H0z) r1
            X.0eM r0 = r1.A0B
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r0)
            androidx.fragment.app.FragmentActivity r0 = r1.requireActivity()
            android.app.Application r1 = r0.getApplication()
            X.0qQ.A07(r1)
            X.9jP r0 = new X.9jP
            r0.<init>(r1, r2)
            return r0
        L_0x04e5:
            java.lang.Object r0 = r2.A01
            X.H0z r0 = (X.C54155H0z) r0
            X.0eM r0 = r0.A0B
            X.0lg r3 = X.DbT.A0X(r0)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36324750330835290(0x810d2b0006315a, double:3.035256605024975E-306)
            goto L_0x0641
        L_0x04f8:
            java.lang.Object r1 = r2.A01
            X.H0z r1 = (X.C54155H0z) r1
            X.0eM r0 = r1.A0B
            X.0wc r0 = X.DbX.A0P(r1, r0)
            return r0
        L_0x0503:
            java.lang.Object r0 = r2.A01
            java.lang.Object r0 = X.DbT.A0r(r0)
            return r0
        L_0x050a:
            java.lang.Object r0 = r2.A01
            X.H0z r0 = (X.C54155H0z) r0
            X.0eM r0 = r0.A0B
            X.0lg r3 = X.DbT.A0X(r0)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36324750331031901(0x810d2b0009315d, double:3.035256605149313E-306)
            goto L_0x0641
        L_0x051d:
            java.lang.Object r0 = r2.A01
            X.H0z r0 = (X.C54155H0z) r0
            X.0eM r0 = r0.A0B
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r0)
            X.INA r0 = new X.INA
            r0.<init>(r1)
            return r0
        L_0x052d:
            java.lang.Object r0 = r2.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            X.0gy r0 = X.AnonymousClass07i.A00(r0)
            return r0
        L_0x0536:
            X.1YN r3 = X.AnonymousClass2bO.A00()
            java.lang.Object r2 = r2.A01
            X.H0z r2 = (X.C54155H0z) r2
            X.0eM r0 = r2.A0B
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r0)
            X.0eM r0 = r2.A03
            java.lang.Object r0 = r0.getValue()
            java.util.HashMap r0 = (java.util.HashMap) r0
            X.2qT r0 = r3.A04(r1, r0)
            return r0
        L_0x0551:
            X.1YN r8 = X.AnonymousClass2bO.A00()
            java.lang.Object r9 = r2.A01
            X.H0z r9 = (X.C54155H0z) r9
            X.0eM r0 = r9.A0B
            com.instagram.common.session.UserSession r11 = X.AnonymousClass7TE.A0l(r0)
            com.instagram.quickpromotion.intf.QuickPromotionSlot r13 = com.instagram.quickpromotion.intf.QuickPromotionSlot.A0t
            X.AnonymousClass2bO.A00()
            r1 = 0
            java.lang.Boolean r7 = X.AnonymousClass7TE.A0u()
            r0 = 3
            X.WZY r4 = new X.WZY
            r4.<init>(r9, r0)
            X.0eM r0 = r9.A08
            java.lang.Object r6 = r0.getValue()
            X.2qT r6 = (X.C230882qT) r6
            r2 = r1
            r3 = r1
            r5 = r1
            X.2bW r12 = X.2bV.A01(r1, r2, r3, r4, r5, r6, r7)
            r10 = r9
            X.2qi r0 = r8.A01(r9, r10, r11, r12, r13)
            return r0
        L_0x0584:
            java.lang.Object r0 = r2.A01
            X.H0z r0 = (X.C54155H0z) r0
            X.C54155H0z.A00(r0)
            goto L_0x0658
        L_0x058d:
            java.lang.Object r0 = r2.A01
            X.H0z r0 = (X.C54155H0z) r0
            X.0eM r0 = r0.A0F
            java.lang.Object r2 = r0.getValue()
            X.2YL r2 = (X.2YL) r2
            X.6oS r1 = X.C318116oQ.A00(r2)
            r0 = 5
            X.C13989Tnp.A1S(r2, r1, r0)
            goto L_0x0658
        L_0x05a3:
            java.lang.Object r0 = r2.A01
            X.H0z r0 = (X.C54155H0z) r0
            X.0eM r0 = r0.A0F
            java.lang.Object r3 = r0.getValue()
            X.GhG r3 = (X.C53025GhG) r3
            X.05G r2 = r3.A05
        L_0x05b1:
            java.lang.Object r1 = r2.getValue()
            r6 = r1
            X.GnT r6 = (X.C53396GnT) r6
            r5 = 0
            r4 = 0
            r10 = 63
            r7 = r5
            r8 = r5
            r9 = r5
            X.GnT r0 = X.C53396GnT.A00(r5, r6, r7, r8, r9, r10)
            boolean r0 = r2.AIY(r1, r0)
            if (r0 == 0) goto L_0x05b1
            X.HjB r0 = r3.A01
            com.instagram.common.session.UserSession r0 = r0.A00
            X.0xa r1 = X.AnonymousClass7TE.A0q(r0)
            X.0xY r3 = r1.AR4()
            r0 = 3924(0xf54, float:5.499E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r0)
            int r0 = r1.getInt(r2, r4)
            goto L_0x0603
        L_0x05e0:
            java.lang.Object r0 = r2.A01
            X.H0z r0 = (X.C54155H0z) r0
            X.0eM r0 = r0.A0F
            java.lang.Object r0 = r0.getValue()
            X.GhG r0 = (X.C53025GhG) r0
            X.HjB r0 = r0.A01
            com.instagram.common.session.UserSession r0 = r0.A00
            X.0xa r1 = X.AnonymousClass7TE.A0q(r0)
            X.0xY r3 = r1.AR4()
            r0 = 3925(0xf55, float:5.5E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r0)
            r0 = 0
            int r0 = r1.getInt(r2, r0)
        L_0x0603:
            int r0 = r0 + 1
            r3.E5Z(r2, r0)
            r3.apply()
            goto L_0x0658
        L_0x060c:
            java.lang.Object r0 = r2.A01
            X.H0z r0 = (X.C54155H0z) r0
            X.0eM r0 = r0.A0B
            X.0lg r3 = X.DbT.A0X(r0)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36324750330704216(0x810d2b00043158, double:3.0352566049420836E-306)
            goto L_0x0641
        L_0x061e:
            java.lang.Object r0 = r2.A01
            X.H0z r0 = (X.C54155H0z) r0
            X.0eM r0 = r0.A0B
            X.0lg r3 = X.DbT.A0X(r0)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36330226413748752(0x81122600004210, double:3.0387197019098647E-306)
            goto L_0x0641
        L_0x0630:
            java.lang.Object r0 = r2.A01
            X.H0z r0 = (X.C54155H0z) r0
            X.0eM r0 = r0.A0B
            X.0lg r3 = X.DbT.A0X(r0)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36330226414010900(0x81122600044214, double:3.038719702075648E-306)
        L_0x0641:
            java.lang.Boolean r0 = X.AnonymousClass7TF.A0R(r2, r3, r0)
            return r0
        L_0x0646:
            java.lang.Object r0 = r2.A01
            java.util.List r0 = (java.util.List) r0
            int r0 = r0.size()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
        L_0x0653:
            java.lang.Object r0 = r2.A01
            X.DbS.A1U(r0)
        L_0x0658:
            X.0gF r0 = X.C60340gF.A00
            return r0
        L_0x065b:
            java.lang.Object r0 = r2.A01
            X.H0p r0 = (X.C54145H0p) r0
            X.0eM r0 = r0.A00
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r0)
            X.H5j r0 = new X.H5j
            r0.<init>(r1)
            return r0
        L_0x066b:
            java.lang.Object r0 = r2.A01
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20608Wvp.invoke():java.lang.Object");
    }
}
