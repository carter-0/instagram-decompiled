package X;

import android.content.Context;
import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.IGAIAgentType;
import com.instagram.common.session.UserSession;
import com.instagram.direct.wellbeing.harmfulcontent.ondevicenudity.view.data.PrivacyMediaOverlayViewModel;
import com.instagram.model.direct.gifs.DirectAnimatedMedia;
import com.instagram.model.direct.messageid.DirectMessageIdentifier;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.model.mediasize.GifUrlImpl;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.7Am  reason: invalid class name and case insensitive filesystem */
public final class C327367Am {
    public final C327387Ao A00 = new AnonymousClass7Ap();
    public final C327387Ao A01 = new C327457Aw(this);
    public final C327387Ao A02 = new C327377An();
    public final C327387Ao A03;
    public final C327387Ao A04 = new C327467Ax(this);
    public final C327387Ao A05 = new C327427At();
    public final C327387Ao A06 = new AnonymousClass7B7();
    public final C327387Ao A07 = new C327437Au();
    public final AnonymousClass7B5 A08 = new AnonymousClass7B6();
    public final AnonymousClass7B5 A09 = new AnonymousClass7B4();
    public final AnonymousClass7B2 A0A = new AnonymousClass7B3();
    public final AnonymousClass7B2 A0B = new AnonymousClass7B1();
    public final AnonymousClass9HO A0C;
    public final C327387Ao A0D = new C327397Aq();
    public final C327387Ao A0E = new C327417As();
    public final C327387Ao A0F = new C327447Av();
    public final C327387Ao A0G = new C327407Ar();
    public final C327387Ao A0H = new C327477Ay();
    public final C327387Ao A0I = new C327487Az();
    public final C327387Ao A0J = new AnonymousClass7B0(this);

    public static C328667Fr A03(Context context, UserSession userSession, AnonymousClass9HC r12, AnonymousClass7LQ r13, AnonymousClass7L2 r14) {
        C254873tC r7;
        AnonymousClass7LQ r6 = r13;
        C254703su r1 = r13.A0e;
        C254933tI A0P = r1.A0P();
        Context context2 = context;
        UserSession userSession2 = userSession;
        AnonymousClass9HC r5 = r12;
        AnonymousClass7L2 r122 = r14;
        if (A0P == null) {
            UserSession userSession3 = userSession;
            AnonymousClass9HC r10 = r5;
            AnonymousClass7LQ r11 = r6;
            AnonymousClass7FE A032 = AnonymousClass7FD.A03(userSession3, r10, r11, r122, r1.A10, AnonymousClass0eN.A01(new C73474PdH(r14)));
            new C3264276s();
            0qQ.A0B(context2, 0);
            0qQ.A0B(userSession2, 2);
            0qQ.A0B(r5, 4);
            ImmutableList A0H2 = r1.A0H();
            if (A0H2 == null || (r7 = (C254873tC) 00k.A0O(A0H2, 0)) == null) {
                return null;
            }
            return AnonymousClass773.A02(context2, userSession2, A032, r5, r6, r7, false);
        }
        return new C3264276s().A02(context2, userSession2, AnonymousClass7FD.A01(userSession, r5, r13, r122, A0P, 2FW.A0q), r5, r6, A0P);
    }

    public static C328667Fr A04(Context context, UserSession userSession, AnonymousClass9HC r8, AnonymousClass7LQ r9, AnonymousClass7L2 r10) {
        return A05(context, userSession, r8, r9, r10, (Boolean) null, (Boolean) null);
    }

    public static C328667Fr A05(Context context, UserSession userSession, AnonymousClass9HC r13, AnonymousClass7LQ r14, AnonymousClass7L2 r15, Boolean bool, Boolean bool2) {
        AnonymousClass7LQ r4 = r14;
        C254703su r3 = r14.A0e;
        ImmutableList A0H2 = r3.A0H();
        2FW r1 = r3.A10;
        if ((r1 == 2FW.A1s || r1 == 2FW.A17) && (A0H2 == null || A0H2.isEmpty())) {
            return null;
        }
        0t0 A012 = AnonymousClass0eN.A01(new C73473PdG(r15));
        2FW r6 = r3.A10;
        return new C3264276s().A01(context, userSession, AnonymousClass7FD.A02(userSession, r13, r4, r15, r6, bool, bool2, A012, false), r13, r14);
    }

    public static NYR A00(Context context, UserSession userSession, AnonymousClass9HC r7, AnonymousClass7LQ r8) {
        String str;
        AnonymousClass53G r0 = r8.A0e.A12;
        r0.getClass();
        AnonymousClass9IE r02 = r0.A00;
        r02.getClass();
        GifUrlImpl gifUrlImpl = (GifUrlImpl) r02.A00;
        User user = r8.A0K;
        if (user != null) {
            str = user.getUsername();
        } else {
            str = null;
        }
        return new NYR(AnonymousClass7FG.A00(context, userSession, r7, r8, 2FW.A0K), gifUrlImpl, str, false);
    }

    public static NYR A01(UserSession userSession, AnonymousClass7LQ r6) {
        String str;
        C254933tI A0P = r6.A0e.A0P();
        A0P.getClass();
        DirectAnimatedMedia A012 = AnonymousClass53I.A01(A0P.A0G);
        A012.getClass();
        GifUrlImpl gifUrlImpl = A012.A02;
        User user = r6.A0K;
        if (user != null) {
            str = user.getUsername();
        } else {
            str = null;
        }
        return new NYR(AnonymousClass7FG.A02(userSession, r6, A0P), gifUrlImpl, str, true);
    }

    public static C328667Fr A02(Context context, UserSession userSession, AnonymousClass9HC r29, AnonymousClass7LQ r30, AnonymousClass7L2 r31) {
        UserSession userSession2 = userSession;
        AnonymousClass9HC r10 = r29;
        AnonymousClass7LQ r1 = r30;
        AnonymousClass7FE A002 = AnonymousClass7FD.A00(userSession2, r10, r1, r31);
        new C3264276s();
        Context context2 = context;
        0qQ.A0B(context2, 0);
        0qQ.A0B(r1, 1);
        0qQ.A0B(r10, 3);
        0qQ.A0B(userSession2, 4);
        C254703su r12 = r1.A0e;
        0qQ.A07(r12);
        C254873tC A003 = C3266377o.A00(r12);
        C254873tC r0 = r12.A0i;
        String str = null;
        if (r0 == null) {
            ExtendedImageUrl extendedImageUrl = r12.A16;
            if (extendedImageUrl != null) {
                A003.A0X = extendedImageUrl;
                A003.A0e = true;
            } else {
                A003 = C3266377o.A00(r12);
            }
        } else {
            A003 = r0;
        }
        DirectMessageIdentifier directMessageIdentifier = new DirectMessageIdentifier(r12.A0z, r12.A0g(), r12.A0f());
        boolean A032 = C3266377o.A03(userSession2, r12);
        String str2 = r12.A1u;
        0qQ.A07(str2);
        User user = r1.A0K;
        if (user != null) {
            str = user.getUsername();
        }
        2FW r02 = r12.A0z;
        if (r02 != null) {
            AnonymousClass7FT A004 = AnonymousClass7FG.A00(context2, userSession2, r10, r1, r02);
            AnonymousClass7SD r03 = r1.A0G;
            C254793t3 r13 = r03.A0P;
            int i = r03.A08;
            C254873tC r4 = r12.A0i;
            if (r4 == null) {
                r4 = C3266377o.A00(r12);
            }
            AnonymousClass774 A012 = AnonymousClass773.A01(r4, r10.A1C);
            String str3 = r12.A1V;
            boolean z = false;
            if (r12.A16 != null) {
                z = true;
            }
            return AnonymousClass773.A04(context2, (C3259574v) null, A004, A002, r10, A012, r12, A003, (C254873tC) null, directMessageIdentifier, r13, str2, str, str3, (String) null, (String) null, AnonymousClass773.A05(A003, r13, i, true), i, A032, true, false, false, true, false, z, false);
        }
        throw new IllegalStateException("Required value was null.");
    }

    public static C328707Fv A06(UserSession userSession, AnonymousClass9HC r16, AnonymousClass7LQ r17, AnonymousClass7L2 r18) {
        String str;
        AnonymousClass7LQ r11 = r17;
        C254703su r1 = r11.A0e;
        C254933tI A0P = r1.A0P();
        A0P.getClass();
        DirectAnimatedMedia A012 = AnonymousClass53I.A01(A0P.A0G);
        A012.getClass();
        GifUrlImpl gifUrlImpl = A012.A02;
        DirectMessageIdentifier A0V = r1.A0V();
        User user = r11.A0K;
        if (user != null) {
            str = user.getUsername();
        } else {
            str = null;
        }
        Boolean bool = Boolean.TRUE;
        boolean equals = bool.equals(A012.A04);
        return new C328707Fv(AnonymousClass7FG.A02(userSession, r11, A0P), AnonymousClass7FD.A01(userSession, r16, r11, r18, A0P, 2FW.A0K), A0V, gifUrlImpl, str, equals, true, bool.equals(A012.A03));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x00b5, code lost:
        if (r19 != false) goto L_0x00b7;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0109  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C66809Mcv A07(android.content.Context r66, com.instagram.common.session.UserSession r67, X.AnonymousClass9HC r68, X.AnonymousClass7LQ r69, X.AnonymousClass7L2 r70) {
        /*
            r2 = r69
            X.3su r1 = r2.A0e
            X.3tI r0 = r1.A0P()
            r0.getClass()
            X.1Xj r5 = r0.A0C
            r21 = 0
            if (r5 != 0) goto L_0x0012
            return r21
        L_0x0012:
            r9 = r66
            android.content.res.Resources r4 = r9.getResources()
            r3 = 2131165265(0x7f070051, float:1.7944742E38)
            int r7 = r4.getDimensionPixelSize(r3)
            com.instagram.model.mediasize.ExtendedImageUrl r51 = r5.A1n(r9)
            java.lang.String r6 = r5.getId()
            X.76m r3 = new X.76m
            r4 = r67
            r3.<init>(r4, r1, r6)
            boolean r19 = r3.A05()
            if (r19 == 0) goto L_0x0040
            r8 = 0
            android.content.res.Resources r6 = r9.getResources()
            X.0qQ.A07(r6)
            com.instagram.direct.wellbeing.harmfulcontent.ondevicenudity.view.data.PrivacyMediaOverlayViewModel r21 = r3.A04(r6, r8)
        L_0x0040:
            X.76d r20 = X.C3262776c.A00(r9, r4)
            X.7SD r6 = r2.A0G
            boolean r14 = r6.A0x
            r42 = 0
            r45 = 1
            java.lang.String r13 = r0.A0U
            java.lang.String r12 = r0.A0T
            X.2FW r11 = r0.A0F
            X.0qQ.A07(r11)
            X.1iA r25 = r5.BR7()
            java.lang.String r10 = r0.A0R
            boolean r9 = r1.A2P
            long r17 = r1.C7c()
            boolean r40 = r1.A1T()
            boolean r8 = r1.A2G
            java.lang.Long r6 = r1.A1L
            boolean r16 = r1.A1S()
            boolean r15 = r1.A1c()
            r46 = r15 ^ 1
            java.lang.Long r27 = java.lang.Long.valueOf(r17)
            java.lang.Boolean r26 = java.lang.Boolean.valueOf(r16)
            r24 = 0
            r28 = r6
            r29 = r13
            r30 = r12
            r31 = r10
            r32 = r24
            r33 = r24
            r34 = r24
            r35 = r24
            r36 = r24
            r37 = r24
            r38 = r14
            r39 = r9
            r41 = r8
            r43 = r42
            r44 = r42
            r47 = r42
            r48 = r42
            r49 = r42
            r50 = r42
            r22 = r5
            r23 = r11
            X.77B r52 = X.C3262876d.A01(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50)
            X.7FT r6 = X.AnonymousClass7FG.A02(r4, r2, r0)
            boolean r8 = r6.A09
            if (r8 == 0) goto L_0x00b7
            r69 = 0
            if (r19 == 0) goto L_0x010c
        L_0x00b7:
            r69 = 1
            if (r19 == 0) goto L_0x010c
            int r62 = r3.A03()
        L_0x00bf:
            boolean r67 = r5.CeS()
            float r61 = r5.A0l()
            X.MeT r3 = new X.MeT
            r3.<init>(r7)
            X.2FW r12 = X.2FW.A1A
            r8 = r68
            r10 = r70
            r7 = r4
            r9 = r2
            r11 = r0
            X.7FE r54 = X.AnonymousClass7FD.A01(r7, r8, r9, r10, r11, r12)
            long r64 = r5.A17()
            X.7SD r0 = r2.A0G
            int r4 = r0.A08
            boolean r0 = r1.A1c()
            if (r0 != 0) goto L_0x0109
            X.7SD r0 = r2.A0G
            boolean r1 = r1.A2G
            com.instagram.direct.thread.analytics.DirectThreadAnalyticsParams r56 = X.C3263376i.A00(r0, r1)
        L_0x00ef:
            X.Mcv r50 = new X.Mcv
            r53 = r6
            r55 = r3
            r57 = r24
            r58 = r24
            r59 = r24
            r60 = r24
            r63 = r4
            r66 = r42
            r68 = r45
            r70 = r42
            r50.<init>(r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r66, r67, r68, r69, r70)
            return r50
        L_0x0109:
            r56 = 0
            goto L_0x00ef
        L_0x010c:
            int r62 = r2.A01()
            goto L_0x00bf
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C327367Am.A07(android.content.Context, com.instagram.common.session.UserSession, X.9HC, X.7LQ, X.7L2):X.Mcv");
    }

    public static C68821NYf A08(Context context, UserSession userSession, AnonymousClass9HC r21, AnonymousClass7LQ r22, AnonymousClass7L2 r23) {
        C254873tC r3;
        boolean z;
        UserSession userSession2 = userSession;
        AnonymousClass9HC r11 = r21;
        AnonymousClass7LQ r12 = r22;
        AnonymousClass7L2 r13 = r23;
        AnonymousClass7FE A022 = AnonymousClass7FD.A02(userSession2, r11, r12, r13, 2FW.A0y, false, (Boolean) null, AnonymousClass0eN.A01(new C41403AtP()), true);
        new C3264276s();
        Context context2 = context;
        0qQ.A0B(context2, 0);
        0qQ.A0B(r12, 1);
        0qQ.A0B(userSession2, 2);
        0qQ.A0B(r11, 4);
        C254703su r0 = r12.A0e;
        0qQ.A07(r0);
        ImmutableList A0H2 = r0.A0H();
        if (A0H2 == null || (r3 = (C254873tC) 00k.A0J(A0H2)) == null) {
            throw new IllegalStateException("Required value was null.");
        }
        AnonymousClass7SD r2 = r12.A0G;
        if (r2.A08 == 29) {
            z = r2.A0n;
        } else {
            z = true;
        }
        return new C68821NYf((AnonymousClass77B) null, AnonymousClass773.A03(context2, userSession2, A022, r11, r12, r3, z), C3264276s.A00(r12), (PrivacyMediaOverlayViewModel) null, 2, false, Boolean.TRUE.equals(r3.A0c), false, false);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r43v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r43v3, resolved type: com.instagram.direct.wellbeing.harmfulcontent.ondevicenudity.view.data.PrivacyMediaOverlayViewModel} */
    /* JADX WARNING: type inference failed for: r43v0 */
    /* JADX WARNING: type inference failed for: r43v5 */
    /* JADX WARNING: type inference failed for: r43v6 */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0130, code lost:
        if (((X.AnonymousClass7FV) r4.get(0)).A00.CU2() != false) goto L_0x0132;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C328687Ft A09(android.content.Context r46, com.instagram.common.session.UserSession r47, X.AnonymousClass9HC r48, X.AnonymousClass7LQ r49, X.AnonymousClass7L2 r50) {
        /*
            r0 = r49
            X.3su r5 = r0.A0e
            X.3tI r1 = r5.A0P()
            r1.getClass()
            X.3tI r10 = r5.A0P()
            r10.getClass()
            X.2FW r11 = X.2FW.A0y
            r18 = 0
            r2 = r47
            r12 = r48
            r9 = r50
            r6 = r2
            r7 = r12
            r8 = r0
            X.7FE r13 = X.AnonymousClass7FD.A01(r6, r7, r8, r9, r10, r11)
            X.76s r3 = new X.76s
            r3.<init>()
            r7 = 1
            r3 = 0
            r14 = r46
            X.0qQ.A0B(r14, r3)
            r4 = 3
            X.0qQ.A0B(r2, r4)
            r4 = 5
            X.0qQ.A0B(r12, r4)
            com.google.common.collect.ImmutableList r8 = r1.A01()
            if (r8 != 0) goto L_0x003f
            X.0sn r8 = X.0sn.A00
        L_0x003f:
            r4 = 10
            int r6 = X.0Yv.A1E(r8, r4)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r6)
            java.util.Iterator r16 = r8.iterator()
        L_0x004e:
            boolean r6 = r16.hasNext()
            r43 = 0
            if (r6 == 0) goto L_0x010a
            java.lang.Object r6 = r16.next()
            X.3tC r6 = (X.C254873tC) r6
            int r44 = r0.A01()
            com.instagram.model.mediasize.GifUrlImpl r8 = r6.A0Z
            if (r8 != 0) goto L_0x0106
            long r8 = r6.A0K
            java.lang.String r9 = java.lang.String.valueOf(r8)
            X.76m r8 = new X.76m
            r8.<init>(r2, r5, r9)
            boolean r47 = r8.A05()
            if (r47 == 0) goto L_0x0084
            int r44 = r8.A03()
            android.content.res.Resources r9 = r14.getResources()
            X.0qQ.A07(r9)
            com.instagram.direct.wellbeing.harmfulcontent.ondevicenudity.view.data.PrivacyMediaOverlayViewModel r43 = r8.A04(r9, r3)
        L_0x0084:
            java.lang.String r10 = r5.A0g()
            java.lang.String r9 = r5.A0f()
            X.2FW r8 = r1.A0F
            com.instagram.model.direct.messageid.DirectMessageIdentifier r11 = new com.instagram.model.direct.messageid.DirectMessageIdentifier
            r11.<init>(r8, r10, r9)
            boolean r35 = X.C3266377o.A04(r2, r1)
            java.lang.String r15 = r1.A0U
            X.0qQ.A07(r15)
            com.instagram.user.model.User r8 = r0.A0K
            if (r8 == 0) goto L_0x0103
            java.lang.String r29 = r8.getUsername()
        L_0x00a4:
            X.7Bo r8 = r0.A03()
            X.0qQ.A07(r8)
            X.7FT r19 = X.AnonymousClass7FG.A01(r2, r8, r5, r1, r7)
            X.7SD r8 = r0.A0G
            X.3t3 r10 = r8.A0P
            int r9 = r8.A08
            X.0eM r8 = r12.A1C
            X.774 r22 = X.AnonymousClass773.A01(r6, r8)
            java.util.List r33 = X.AnonymousClass773.A05(r6, r10, r9, r7)
            r25 = r18
            r28 = r15
            r30 = r18
            r31 = r18
            r32 = r18
            r34 = r9
            r36 = r7
            r37 = r3
            r38 = r3
            r39 = r3
            r40 = r3
            r41 = r3
            r42 = r3
            r23 = r5
            r24 = r6
            r26 = r11
            r27 = r10
            r20 = r13
            r21 = r12
            r17 = r14
            X.7Fr r41 = X.AnonymousClass773.A04(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42)
            com.instagram.direct.thread.analytics.DirectThreadAnalyticsParams r42 = X.C3264276s.A00(r0)
            X.NYf r6 = new X.NYf
            r39 = r6
            r40 = r18
            r45 = r3
            r46 = r3
            r48 = r3
            r39.<init>(r40, r41, r42, r43, r44, r45, r46, r47, r48)
            r4.add(r6)
            goto L_0x004e
        L_0x0103:
            r29 = 0
            goto L_0x00a4
        L_0x0106:
            r47 = 0
            goto L_0x0084
        L_0x010a:
            com.instagram.model.direct.messageid.DirectMessageIdentifier r42 = r5.A0V()
            X.7SD r1 = r0.A0G
            X.3t3 r1 = r1.A0P
            if (r1 == 0) goto L_0x0118
            java.lang.String r43 = X.C300965yF.A07(r1)
        L_0x0118:
            X.7SD r1 = r0.A0G
            int r2 = r1.A08
            boolean r1 = r4.isEmpty()
            if (r1 != 0) goto L_0x0132
            java.lang.Object r1 = r4.get(r3)
            X.7FV r1 = (X.AnonymousClass7FV) r1
            X.7FU r1 = r1.A00
            boolean r1 = r1.CU2()
            r49 = 1
            if (r1 == 0) goto L_0x0134
        L_0x0132:
            r49 = 0
        L_0x0134:
            int r47 = r0.A01()
            r1 = 13
            X.9Lz r0 = new X.9Lz
            r0.<init>(r1, r14, r13)
            X.0t0 r45 = X.AnonymousClass0eN.A01(r0)
            X.7Ft r39 = new X.7Ft
            r40 = r18
            r41 = r18
            r44 = r4
            r46 = r2
            r48 = r7
            r50 = r7
            r39.<init>(r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50)
            return r39
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C327367Am.A09(android.content.Context, com.instagram.common.session.UserSession, X.9HC, X.7LQ, X.7L2):X.7Ft");
    }

    public static AnonymousClass79c A0A(Context context, UserSession userSession, AnonymousClass9HC r18, AnonymousClass7LQ r19, AnonymousClass7L2 r20) {
        String str;
        AnonymousClass7LQ r13 = r19;
        C254703su r1 = r13.A0e;
        C254933tI A0P = r1.A0P();
        A0P.getClass();
        User user = r13.A0K;
        C3270179a r4 = C3270179a.A00;
        String A032 = A0P.A03();
        A032.getClass();
        UserSession userSession2 = userSession;
        CharSequence A002 = r4.A00(context, A0P.A0A, userSession2, A032);
        boolean A012 = AnonymousClass48R.A01(r1.A1F);
        boolean A0E2 = 0mp.A0E(A0P.A03());
        AnonymousClass7FE A013 = AnonymousClass7FD.A01(userSession2, r18, r13, r20, A0P, 2FW.A1g);
        AnonymousClass7FT A022 = AnonymousClass7FG.A02(userSession2, r13, A0P);
        AnonymousClass5FV r3 = AnonymousClass5FV.None;
        if (user != null) {
            str = user.getId();
        } else {
            str = null;
        }
        boolean z = r1.A2O;
        boolean z2 = false;
        if (r13.A00 == 0) {
            z2 = true;
        }
        return new AnonymousClass79c(r3, A022, A013, A002, str, A012, A0E2, z, A0H(userSession2, user, z2));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x003f, code lost:
        if (((java.lang.Boolean) r4.A11.getValue()).booleanValue() == false) goto L_0x0041;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C66851Mdk A0B(com.instagram.common.session.UserSession r18, X.AnonymousClass9HC r19, X.AnonymousClass7LQ r20, X.AnonymousClass7L2 r21) {
        /*
            r2 = r20
            X.3su r0 = r2.A0e
            X.3tI r3 = r0.A0P()
            r3.getClass()
            X.4ik r1 = r3.A07
            r1.getClass()
            X.4iq r5 = r1.A04
            r15 = r18
            if (r5 != 0) goto L_0x001c
            X.1Xj r0 = r1.A05
            X.4iq r5 = X.C271384il.A00(r15, r0)
        L_0x001c:
            java.lang.String r4 = r1.A09
            java.lang.String r0 = "once"
            boolean r11 = r0.equals(r4)
            r12 = 0
            java.lang.Integer r7 = X.AnonymousClass05K.A0u
            java.lang.Integer r8 = X.AnonymousClass05K.A01
            r6 = 0
            X.7SD r0 = r2.A0G
            boolean r0 = r0.A1G
            r4 = r19
            if (r0 == 0) goto L_0x0041
            X.0eM r0 = r4.A11
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r14 = 1
            if (r0 != 0) goto L_0x0042
        L_0x0041:
            r14 = 0
        L_0x0042:
            X.2FW r20 = X.2FW.A0q
            r18 = r21
            r17 = r2
            r19 = r3
            r16 = r4
            X.7FE r4 = X.AnonymousClass7FD.A01(r15, r16, r17, r18, r19, r20)
            X.7FT r3 = X.AnonymousClass7FG.A02(r15, r2, r3)
            java.lang.String r0 = r1.A0A
            r16 = 0
            if (r0 == 0) goto L_0x005c
            r16 = 1
        L_0x005c:
            com.instagram.user.model.User r0 = r2.A0K
            if (r0 == 0) goto L_0x006e
            java.lang.String r9 = r0.getUsername()
        L_0x0064:
            java.lang.String r10 = r1.A0A
            X.Mdk r2 = new X.Mdk
            r13 = r12
            r15 = r12
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return r2
        L_0x006e:
            r9 = 0
            goto L_0x0064
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C327367Am.A0B(com.instagram.common.session.UserSession, X.9HC, X.7LQ, X.7L2):X.Mdk");
    }

    /* JADX WARNING: type inference failed for: r10v1, types: [X.NaO] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C68819NYd A0C(android.content.Context r19, com.instagram.common.session.UserSession r20, X.AnonymousClass9HC r21, X.AnonymousClass7LQ r22, X.AnonymousClass7L2 r23) {
        /*
            r1 = r22
            X.3su r0 = r1.A0e
            X.5yB r5 = r0.A0v
            X.1Xj r4 = r0.A0s
            r13 = 0
            r3 = r19
            if (r4 == 0) goto L_0x0078
            com.instagram.model.mediasize.ExtendedImageUrl r15 = r4.A1n(r3)
            if (r15 == 0) goto L_0x0078
            com.instagram.model.mediasize.ImageInfo r2 = r4.A1p()
            r19 = 0
            if (r2 == 0) goto L_0x001d
            r19 = 1
        L_0x001d:
            com.instagram.model.mediasize.ImageInfo r16 = r4.A1p()
            long r17 = r4.A17()
            X.NaP r10 = new X.NaP
            r14 = r10
            r14.<init>(r15, r16, r17, r19)
            boolean r17 = r4.A5p()
            boolean r16 = r4.CeS()
        L_0x0033:
            java.lang.String r4 = r0.A1u
            r6 = r20
            java.lang.String r2 = r6.A06
            boolean r5 = r4.equals(r2)
            com.instagram.user.model.User r2 = r1.A0K
            if (r2 == 0) goto L_0x0045
            java.lang.String r13 = X.AnonymousClass50n.A05(r2)
        L_0x0045:
            r14 = 0
            java.lang.Integer r4 = X.AnonymousClass05K.A01
            r2 = 2
            X.9IP r7 = new X.9IP
            r7.<init>((java.lang.Integer) r4, (int) r2, (boolean) r5)
            r4 = r21
            r2 = r23
            X.7FE r9 = X.AnonymousClass7FD.A00(r6, r4, r1, r2)
            X.2FW r2 = X.2FW.A1A
            X.7FT r8 = X.AnonymousClass7FG.A00(r3, r6, r4, r1, r2)
            r12 = 0
            boolean r18 = r0.A1S()
            boolean r2 = r0.A1c()
            if (r2 != 0) goto L_0x0076
            X.7SD r1 = r1.A0G
            boolean r0 = r0.A2G
            com.instagram.direct.thread.analytics.DirectThreadAnalyticsParams r11 = X.C3263376i.A00(r1, r0)
        L_0x006f:
            X.NYd r6 = new X.NYd
            r15 = r14
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            return r6
        L_0x0076:
            r11 = 0
            goto L_0x006f
        L_0x0078:
            if (r5 == 0) goto L_0x0090
            java.lang.String r2 = r5.A06
            X.NaO r10 = new X.NaO
            r10.<init>(r2, r13)
            X.1iA r4 = r5.A01
            X.1iA r2 = X.1iA.A0Q
            r17 = 0
            if (r4 != r2) goto L_0x008b
            r17 = 1
        L_0x008b:
            boolean r16 = r5.A05()
            goto L_0x0033
        L_0x0090:
            r10 = r13
            r16 = 0
            r17 = 0
            goto L_0x0033
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C327367Am.A0C(android.content.Context, com.instagram.common.session.UserSession, X.9HC, X.7LQ, X.7L2):X.NYd");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0062, code lost:
        if (r4.A0V == false) goto L_0x0064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0066, code lost:
        if (r4 != null) goto L_0x0068;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006a, code lost:
        if (r4.A0T == false) goto L_0x00d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00d8, code lost:
        r17 = false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C68819NYd A0D(android.content.Context r23, com.instagram.common.session.UserSession r24, X.AnonymousClass9HC r25, X.AnonymousClass7LQ r26, X.AnonymousClass7L2 r27) {
        /*
            r1 = r26
            X.3su r0 = r1.A0e
            X.3tI r2 = r0.A0P()
            r2.getClass()
            X.4ik r8 = r2.A07
            r8.getClass()
            X.4iq r4 = r8.A04
            r17 = 1
            r12 = 0
            r7 = r23
            if (r4 == 0) goto L_0x00e3
            com.instagram.model.mediasize.ExtendedImageUrl r3 = r4.A00(r7)
            if (r3 == 0) goto L_0x00e3
            com.instagram.model.mediasize.ImageInfo r5 = r4.A06
            r23 = 0
            if (r5 == 0) goto L_0x0027
            r23 = 1
        L_0x0027:
            com.instagram.model.mediasize.ExtendedImageUrl r19 = r4.A00(r7)
            long r3 = r4.A02
            X.NaP r10 = new X.NaP
            r18 = r10
            r20 = r5
            r21 = r3
            r18.<init>(r19, r20, r21, r23)
        L_0x0038:
            java.lang.String r4 = r2.A0U
            r5 = r24
            java.lang.String r3 = r5.A06
            boolean r6 = r4.equals(r3)
            java.lang.Object r4 = r0.A1T
            boolean r3 = r4 instanceof X.1Xj
            if (r3 == 0) goto L_0x00de
            X.1Xj r4 = (X.1Xj) r4
            boolean r16 = r4.CeS()
            boolean r9 = r4.A5p()
        L_0x0052:
            java.lang.Object r4 = r0.A1T
            boolean r3 = r4 instanceof X.C271374ik
            if (r3 == 0) goto L_0x00db
            X.4ik r4 = (X.C271374ik) r4
            X.4iq r4 = r4.A04
            if (r4 == 0) goto L_0x0064
            boolean r3 = r4.A0V
            r16 = 1
            if (r3 != 0) goto L_0x0068
        L_0x0064:
            r16 = 0
            if (r4 == 0) goto L_0x00d8
        L_0x0068:
            boolean r3 = r4.A0T
            if (r3 == 0) goto L_0x00d8
        L_0x006c:
            com.instagram.user.model.User r3 = r1.A0K
            if (r3 == 0) goto L_0x00d6
            java.lang.String r13 = X.AnonymousClass50n.A05(r3)
        L_0x0074:
            X.1Xj r3 = r8.A05
            if (r3 == 0) goto L_0x009e
            java.lang.String r3 = r3.getId()
            if (r3 == 0) goto L_0x009e
            X.1Xj r3 = r8.A05
            java.lang.String r3 = r3.getId()
            X.76m r8 = new X.76m
            r8.<init>(r5, r0, r3)
            boolean r3 = r8.A05()
            if (r3 == 0) goto L_0x009e
            r4 = 0
            X.0qQ.A0B(r7, r4)
            android.content.res.Resources r3 = r7.getResources()
            X.0qQ.A07(r3)
            com.instagram.direct.wellbeing.harmfulcontent.ondevicenudity.view.data.PrivacyMediaOverlayViewModel r12 = r8.A04(r3, r4)
        L_0x009e:
            r14 = 1
            r15 = 0
            java.lang.Integer r4 = X.AnonymousClass05K.A01
            r3 = 2
            X.9IP r7 = new X.9IP
            r7.<init>((java.lang.Integer) r4, (int) r3, (boolean) r6)
            X.2FW r23 = X.2FW.A0q
            r19 = r25
            r21 = r27
            r20 = r1
            r22 = r2
            r18 = r5
            X.7FE r9 = X.AnonymousClass7FD.A01(r18, r19, r20, r21, r22, r23)
            X.7FT r8 = X.AnonymousClass7FG.A02(r5, r1, r2)
            boolean r18 = r0.A1S()
            boolean r2 = r0.A1c()
            if (r2 != 0) goto L_0x00d4
            X.7SD r1 = r1.A0G
            boolean r0 = r0.A2G
            com.instagram.direct.thread.analytics.DirectThreadAnalyticsParams r11 = X.C3263376i.A00(r1, r0)
        L_0x00ce:
            X.NYd r6 = new X.NYd
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            return r6
        L_0x00d4:
            r11 = 0
            goto L_0x00ce
        L_0x00d6:
            r13 = r12
            goto L_0x0074
        L_0x00d8:
            r17 = 0
            goto L_0x006c
        L_0x00db:
            r17 = r9
            goto L_0x006c
        L_0x00de:
            r9 = 0
            r16 = 0
            goto L_0x0052
        L_0x00e3:
            r10 = r12
            goto L_0x0038
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C327367Am.A0D(android.content.Context, com.instagram.common.session.UserSession, X.9HC, X.7LQ, X.7L2):X.NYd");
    }

    public static C328657Fq A0E(UserSession userSession, AnonymousClass9HC r29, AnonymousClass7LQ r30, AnonymousClass7L2 r31) {
        String str;
        C254923tH A002;
        AnonymousClass7LQ r7 = r30;
        C254703su r0 = r7.A0e;
        C254933tI A0P = r0.A0P();
        A0P.getClass();
        C2609947v r10 = A0P.A08;
        r10.getClass();
        UserSession userSession2 = userSession;
        User A022 = 17h.A00(userSession2).A02(A0P.A0U);
        C254793t3 r1 = r7.A0G.A0P;
        String str2 = null;
        if (r1 instanceof C254763t0) {
            str = ((C254763t0) r1).A00;
        } else {
            str = null;
        }
        String A023 = r10.A02();
        String A0g = r0.A0g();
        String A0f = r0.A0f();
        2FW r9 = 2FW.A1k;
        DirectMessageIdentifier directMessageIdentifier = new DirectMessageIdentifier(r9, A0g, A0f);
        if (A022 != null) {
            str2 = A022.getUsername();
        }
        int intValue = ((Number) C66801Mcn.A00(r10.A00(), 0, "playbackDurationMs")).intValue();
        1Xj r4 = r10.A02;
        int i = r10.A00;
        List A032 = r10.A03();
        AnonymousClass7FE A012 = AnonymousClass7FD.A01(userSession2, r29, r7, r31, A0P, r9);
        AnonymousClass7FT A024 = AnonymousClass7FG.A02(userSession2, r7, A0P);
        if (r1 == null) {
            A002 = C254923tH.DJANGO;
        } else {
            A002 = C300965yF.A00(r1);
        }
        boolean A1S = r0.A1S();
        return new C328657Fq((N4D) null, A024, A012, A002, r4, directMessageIdentifier, AnonymousClass05K.A00, AnonymousClass05K.A0C, (Long) null, r0.A1K, A023, str2, str, A032, intValue, i, A1S, r0.A2P, false);
    }

    public static CharSequence A0F(Context context, UserSession userSession, AnonymousClass7LQ r4) {
        C254703su r1 = r4.A0e;
        if (r1.A2F) {
            return O0S.A00(context, userSession, r4);
        }
        return C328527Fd.A0D(context, userSession, r1, r1.A1j(AnonymousClass0t1.A01.A01(userSession)));
    }

    public static String A0G(UserSession userSession, AnonymousClass7LQ r8) {
        C254703su r3 = r8.A0e;
        String str = r3.A1V;
        if (str != null) {
            return str;
        }
        String A0n = r3.A0n();
        String A0l = r3.A0l();
        String A0m = r3.A0m();
        if (A0n == null || A0l == null || A0m == null) {
            return str;
        }
        String str2 = r3.A1u;
        AnonymousClass7SD r0 = r8.A0G;
        return C70869OPi.A01(C69421Nl3.A00(A0n), C69420Nl2.A00(A0l), userSession, str2, A0m, r0.A0b, r0.A0r);
    }

    public static boolean A0H(UserSession userSession, User user, boolean z) {
        if (!z && user != null && (user.A03.AaX() == IGAIAgentType.A05 || user.A03.AaX() == IGAIAgentType.A06 || user.A1X())) {
            0qQ.A0B(userSession, 0);
            if (!182.A06(0Tu.A05, userSession, 36324831935148430L)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final AnonymousClass7AO A0I() {
        P6K p6k = new P6K();
        C3257674b r3 = new C3257674b(this);
        return new AnonymousClass7AO(this.A0D, new Y0T(this), r3, p6k);
    }

    public final AnonymousClass7AO A0J() {
        C72445P6g p6g = new C72445P6g();
        C3257674b r3 = new C3257674b(this);
        return new AnonymousClass7AO(this.A0D, new P59(this), r3, p6g);
    }

    public final AnonymousClass7AO A0K() {
        C72436P5x p5x = new C72436P5x();
        C3257674b r3 = new C3257674b(this);
        return new AnonymousClass7AO(this.A0D, new C72395P4i(this), r3, p5x);
    }

    public final AnonymousClass7AO A0L() {
        P70 p70 = new P70();
        C3257674b r3 = new C3257674b(this);
        return new AnonymousClass7AO(this.A0D, new Y0f(this), r3, p70);
    }

    public final AnonymousClass7AO A0M() {
        C72448P6j p6j = new C72448P6j();
        C3257674b r3 = new C3257674b(this);
        return new AnonymousClass7AO(this.A0D, new C22352Y0b(this), r3, p6j);
    }

    public final AnonymousClass7AO A0N() {
        P61 p61 = new P61();
        C3257674b r3 = new C3257674b(this);
        return new AnonymousClass7AO(this.A0D, new C72398P4l(this), r3, p61);
    }

    public final AnonymousClass7AO A0O() {
        P6F p6f = new P6F();
        C3257674b r3 = new C3257674b(this);
        return new AnonymousClass7AO(this.A0D, new Y0P(this), r3, p6f);
    }

    public final AnonymousClass7AO A0P() {
        P6A p6a = new P6A();
        C3257674b r3 = new C3257674b(this);
        return new AnonymousClass7AO(this.A0E, new Y0L(this), r3, p6a);
    }

    public final AnonymousClass7AO A0Q() {
        P6P p6p = new P6P();
        C3257674b r3 = new C3257674b(this);
        return new AnonymousClass7AO(this.A0E, new C72411P4y(this), r3, p6p);
    }

    public final AnonymousClass7AO A0R() {
        C72457P6s p6s = new C72457P6s();
        C3257674b r3 = new C3257674b(this);
        return new AnonymousClass7AO(this.A0E, new P5H(this), r3, p6s);
    }

    public final AnonymousClass7AO A0S() {
        C72434P5v p5v = new C72434P5v();
        C3257674b r3 = new C3257674b(this);
        return new AnonymousClass7AO(this.A0E, new Y0J(this), r3, p5v);
    }

    public final AnonymousClass7AO A0T() {
        P6B p6b = new P6B();
        C3257674b r3 = new C3257674b(this);
        return new AnonymousClass7AO(this.A0E, new Y0M(this), r3, p6b);
    }

    public final AnonymousClass7AO A0U() {
        P6T p6t = new P6T();
        C3257674b r3 = new C3257674b(this);
        return new AnonymousClass7AO(this.A0E, new C72412P4z(this), r3, p6t);
    }

    public final AnonymousClass7AO A0V() {
        C72464P6z p6z = new C72464P6z();
        C3257674b r3 = new C3257674b(this);
        return new AnonymousClass7AO(this.A0E, new Y0e(this), r3, p6z);
    }

    public final AnonymousClass7AO A0W() {
        P6V p6v = new P6V();
        C3257674b r3 = new C3257674b(this);
        return new AnonymousClass7AO(this.A0F, new Y0X(this), r3, p6v);
    }

    public final AnonymousClass7AO A0X() {
        C72437P5y p5y = new C72437P5y();
        C3257674b r3 = new C3257674b(this);
        return new AnonymousClass7AO(this.A0F, new C72396P4j(this), r3, p5y);
    }

    public final AnonymousClass7AO A0Y() {
        C72427P5o p5o = new C72427P5o();
        C3257674b r3 = new C3257674b(this);
        return new AnonymousClass7AO(this.A0F, new C72390P4d(this), r3, p5o);
    }

    public final AnonymousClass7AO A0Z() {
        P6S p6s = new P6S();
        C3257674b r3 = new C3257674b(this);
        return new AnonymousClass7AO(this.A0F, new Y0V(this), r3, p6s);
    }

    public final AnonymousClass7AO A0a() {
        P71 p71 = new P71();
        C3257674b r3 = new C3257674b(this);
        return new AnonymousClass7AO(this.A0F, new C22353Y0g(this), r3, p71);
    }

    public final AnonymousClass7AO A0b() {
        P6N p6n = new P6N();
        C3257674b r3 = new C3257674b(this);
        return new AnonymousClass7AO(this.A0F, new C72409P4w(this), r3, p6n);
    }

    public final AnonymousClass7AO A0c() {
        P6U p6u = new P6U();
        C3257674b r3 = new C3257674b(this);
        return new AnonymousClass7AO(this.A0F, new Y0W(this), r3, p6u);
    }

    public final AnonymousClass7AO A0d() {
        P6J p6j = new P6J();
        C3257674b r3 = new C3257674b(this);
        return new AnonymousClass7AO(this.A0G, new Y0S(this), r3, p6j);
    }

    public final AnonymousClass7AO A0e() {
        P6H p6h = new P6H();
        C3257674b r3 = new C3257674b(this);
        return new AnonymousClass7AO(this.A03, new Y0Q(this), r3, p6h);
    }

    public final AnonymousClass7AO A0f() {
        P6W p6w = new P6W();
        C3257674b r3 = new C3257674b(this);
        return new AnonymousClass7AO(this.A03, new P50(this), r3, p6w);
    }

    public final AnonymousClass7AO A0g() {
        C66897Mef mef = new C66897Mef();
        C3257674b r3 = new C3257674b(this);
        return new AnonymousClass7AO(this.A03, new C66896Mee(this), r3, mef);
    }

    public final AnonymousClass7AO A0h() {
        AnonymousClass74H r4 = new AnonymousClass74H();
        C3257674b r3 = new C3257674b(this);
        return new AnonymousClass7AO(this.A03, new AnonymousClass74I(this), r3, r4);
    }

    public final AnonymousClass7AO A0i() {
        P6Z p6z = new P6Z();
        C3257674b r3 = new C3257674b(this);
        return new AnonymousClass7AO(this.A03, new Y0Y(this), r3, p6z);
    }

    public final AnonymousClass7AO A0j() {
        P6I p6i = new P6I();
        C3257674b r3 = new C3257674b(this);
        return new AnonymousClass7AO(this.A03, new Y0R(this), r3, p6i);
    }

    public final AnonymousClass7AO A0k() {
        P6E p6e = new P6E();
        C3257674b r3 = new C3257674b(this);
        return new AnonymousClass7AO(this.A0H, new Y0O(this), r3, p6e);
    }

    public final AnonymousClass7AO A0l() {
        C72435P5w p5w = new C72435P5w();
        C3257674b r3 = new C3257674b(this);
        return new AnonymousClass7AO(this.A0H, new C72394P4h(this), r3, p5w);
    }

    public final AnonymousClass7AO A0m() {
        C72442P6d p6d = new C72442P6d();
        C3257674b r3 = new C3257674b(this);
        return new AnonymousClass7AO(this.A0H, new P55(this), r3, p6d);
    }

    public final AnonymousClass7AO A0n() {
        C72452P6n p6n = new C72452P6n();
        C3257674b r3 = new C3257674b(this);
        return new AnonymousClass7AO(this.A0H, new Y0d(this), r3, p6n);
    }

    public final AnonymousClass7AO A0o() {
        P6Y p6y = new P6Y();
        C3257674b r3 = new C3257674b(this);
        return new AnonymousClass7AO(this.A0H, new Y0Z(this), r3, p6y);
    }

    public final AnonymousClass7AO A0p() {
        P75 p75 = new P75();
        C3257674b r3 = new C3257674b(this);
        return new AnonymousClass7AO(this.A0H, new P5O(this), r3, p75);
    }

    public final AnonymousClass7AO A0q() {
        C72426P5n p5n = new C72426P5n();
        C3257674b r3 = new C3257674b(this);
        return new AnonymousClass7AO(this.A0H, new Y0G(this), r3, p5n);
    }

    public final AnonymousClass7AO A0r() {
        C72447P6i p6i = new C72447P6i();
        C3257674b r3 = new C3257674b(this);
        return new AnonymousClass7AO(this.A0I, new C22351Y0a(this), r3, p6i);
    }

    public final AnonymousClass7AO A0s() {
        C72455P6q p6q = new C72455P6q();
        C3257674b r3 = new C3257674b(this);
        return new AnonymousClass7AO(this.A0I, new P5F(this), r3, p6q);
    }

    public final AnonymousClass7AO A0t() {
        P73 p73 = new P73();
        C3257674b r3 = new C3257674b(this);
        return new AnonymousClass7AO(this.A0I, new P5M(this), r3, p73);
    }

    public final AnonymousClass7AO A0u() {
        C72429P5q p5q = new C72429P5q();
        C3257674b r3 = new C3257674b(this);
        return new AnonymousClass7AO(this.A0I, new Y0H(this), r3, p5q);
    }

    public final AnonymousClass7AO A0v() {
        C72462P6x p6x = new C72462P6x();
        C3257674b r3 = new C3257674b(this);
        return new AnonymousClass7AO(this.A0I, new C22355Y0i(this), r3, p6x);
    }

    public final AnonymousClass7AO A0w() {
        C72450P6l p6l = new C72450P6l();
        C3257674b r3 = new C3257674b(this);
        return new AnonymousClass7AO(this.A0I, new P5C(this), r3, p6l);
    }

    public final AnonymousClass7AO A0x() {
        P6Q p6q = new P6Q();
        C3257674b r3 = new C3257674b(this);
        return new AnonymousClass7AO(this.A0I, new Y0U(this), r3, p6q);
    }

    public final AnonymousClass7AO A0y() {
        C72430P5r p5r = new C72430P5r();
        C3257674b r3 = new C3257674b(this);
        return new AnonymousClass7AO(this.A07, new Y0I(this), r3, p5r);
    }

    public final AnonymousClass7AO A0z() {
        P6D p6d = new P6D();
        C3257674b r3 = new C3257674b(this);
        return new AnonymousClass7AO(this.A07, new Y0N(this), r3, p6d);
    }

    public final AnonymousClass7AO A10() {
        C72451P6m p6m = new C72451P6m();
        C3257674b r3 = new C3257674b(this);
        return new AnonymousClass7AO(this.A07, new Y0c(this), r3, p6m);
    }

    public final AnonymousClass7AO A11() {
        P72 p72 = new P72();
        C3257674b r3 = new C3257674b(this);
        return new AnonymousClass7AO(this.A07, new C22354Y0h(this), r3, p72);
    }

    public final AnonymousClass7AO A12() {
        P64 p64 = new P64();
        C3257674b r3 = new C3257674b(this);
        return new AnonymousClass7AO(new P4L(this), new Y0K(this), r3, p64);
    }

    public final AnonymousClass7AO A13() {
        P66 p66 = new P66();
        P5T p5t = new P5T();
        return new AnonymousClass7AO(this.A0J, new C72401P4o(this), p5t, p66);
    }

    public final AnonymousClass7AO A14() {
        C72424P5l p5l = new C72424P5l();
        P5W p5w = new P5W();
        return new AnonymousClass7AO(new P4V(this), new P58(this), p5w, p5l);
    }

    public final AnonymousClass7AO A15() {
        C72431P5s p5s = new C72431P5s();
        C72415P5c p5c = new C72415P5c(this);
        return new AnonymousClass7AO(this.A0J, new C72397P4k(this), p5c, p5s);
    }

    public C327367Am(AnonymousClass9HO r2) {
        this.A0C = r2;
        this.A03 = new AnonymousClass7B8(this);
    }
}
