package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.direct.fragment.sharesheet.viewmodel.DirectShareSheetFragmentViewModel;

/* renamed from: X.Mpw  reason: case insensitive filesystem */
public abstract class C67562Mpw {
    public static final C336297eO A00(Context context, UserSession userSession, AnonymousClass4D6 r18, String str, String str2, boolean z, boolean z2, boolean z3) {
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession2, 1);
        boolean z4 = z2;
        AnonymousClass4D6 r11 = r18;
        boolean z5 = z;
        return new C336297eO(r11, new JZO(context, userSession2, z5, z4, z3), new C336247eJ(r11, (C336227eH) new C67561Mpv(userSession2, str, (String) null, str2, 0, 0, 0, 0, z4), false), z5, true);
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [X.OIy, java.lang.Object] */
    public static final C72920PPe A01(UserSession userSession, AnonymousClass4D6 r3, String str, String str2, String str3, boolean z) {
        C336227eH lws;
        AnonymousClass7TF.A1H(userSession, r3);
        if (str2 == null) {
            lws = new C72923PPh(userSession, str, str3, z);
        } else {
            lws = new C65617Lws(userSession, str, str2, 0);
        }
        return new C72920PPe(r3, new Object(), new C336247eJ(r3, lws));
    }

    public static C336267eL A03(Context context, AnonymousClass07Z r21, UserSession userSession, AnonymousClass4D6 r23, DirectShareSheetFragmentViewModel directShareSheetFragmentViewModel, String str, String str2, String str3, String str4, String str5, int i, int i2, boolean z, boolean z2, boolean z3) {
        Context context2 = context;
        UserSession userSession2 = userSession;
        boolean A1U = AnonymousClass7TF.A1U(0, userSession2, context2);
        return A02(context2, r21, userSession2, r23, directShareSheetFragmentViewModel, (C46730DkJ) null, str2, str3, str5, str4, (String) null, str, 0, 0, i2, i, A1U, z, z3, A1U, false, false, z2, false, false, false);
    }

    public static C336267eL A06(Context context, UserSession userSession, AnonymousClass4D6 r20, String str, String str2, int i, boolean z, boolean z2) {
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession2, 0);
        return A02(context, (AnonymousClass07Z) null, userSession2, r20, (DirectShareSheetFragmentViewModel) null, (C46730DkJ) null, "reshare", str, str2, (String) null, (String) null, (String) null, 0, 0, 0, i, true, z, z2, true, false, false, false, false, false, false);
    }

    public static C336267eL A07(Context context, UserSession userSession, AnonymousClass4D6 r10, String str, String str2, String str3, int i, int i2, boolean z, boolean z2) {
        return A05(context, userSession, r10, (C46730DkJ) null, str, str2, str3, 0, i, 0, i2, z, false, z2);
    }

    public static final C336267eL A04(Context context, UserSession userSession, AnonymousClass4D6 r39, C68163N3d n3d) {
        Context context2 = context;
        UserSession userSession2 = userSession;
        AnonymousClass4D6 r13 = r39;
        AnonymousClass7TG.A1T(context2, userSession2, r13);
        C68163N3d n3d2 = n3d;
        boolean z = n3d2.A09;
        int i = n3d2.A03;
        int i2 = n3d2.A02;
        int i3 = n3d2.A01;
        int i4 = n3d2.A00;
        boolean z2 = n3d2.A0E;
        boolean z3 = n3d2.A0B;
        boolean z4 = n3d2.A0C;
        boolean z5 = n3d2.A0A;
        boolean z6 = n3d2.A0F;
        boolean z7 = n3d2.A0D;
        String str = n3d2.A08;
        int i5 = i;
        int i6 = i2;
        int i7 = i3;
        int i8 = i4;
        return A02(context2, (AnonymousClass07Z) null, userSession2, r13, (DirectShareSheetFragmentViewModel) null, n3d2.A04, "universal", "direct_user_search_nullstate", "direct_user_search_keypressed", (String) null, str, (String) null, i5, i6, i7, i8, z, z2, false, false, z3, z4, false, z5, z6, z7);
    }

    public static C336267eL A05(Context context, UserSession userSession, AnonymousClass4D6 r23, C46730DkJ dkJ, String str, String str2, String str3, int i, int i2, int i3, int i4, boolean z, boolean z2, boolean z3) {
        Context context2 = context;
        UserSession userSession2 = userSession;
        AnonymousClass4D6 r3 = r23;
        AnonymousClass7TG.A1T(context2, userSession2, r3);
        return A02(context2, (AnonymousClass07Z) null, userSession2, r3, (DirectShareSheetFragmentViewModel) null, dkJ, str, str2, "direct_user_search_keypressed", (String) null, str3, (String) null, i4, i3, i2, i, z, z3, false, false, false, false, false, z2, false, false);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v0, resolved type: X.O8H} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v1, resolved type: X.O8H} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v3, resolved type: X.O8H} */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0034, code lost:
        if (r3.equals("universal") != false) goto L_0x0036;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x013b  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0149  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0156 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C336267eL A02(android.content.Context r31, X.AnonymousClass07Z r32, com.instagram.common.session.UserSession r33, X.AnonymousClass4D6 r34, com.instagram.direct.fragment.sharesheet.viewmodel.DirectShareSheetFragmentViewModel r35, X.C46730DkJ r36, java.lang.String r37, java.lang.String r38, java.lang.String r39, java.lang.String r40, java.lang.String r41, java.lang.String r42, int r43, int r44, int r45, int r46, boolean r47, boolean r48, boolean r49, boolean r50, boolean r51, boolean r52, boolean r53, boolean r54, boolean r55, boolean r56) {
        /*
            java.lang.String r0 = "forwarding"
            r3 = r37
            boolean r0 = X.0qQ.A0K(r3, r0)
            if (r0 != 0) goto L_0x0152
            java.lang.String r0 = "reshare"
            boolean r0 = X.0qQ.A0K(r3, r0)
            if (r0 != 0) goto L_0x0152
            java.lang.String r0 = "story_share_sheet"
            boolean r0 = X.0qQ.A0K(r3, r0)
            if (r0 != 0) goto L_0x0152
            r30 = 0
            java.lang.String r0 = "direct_invite_main"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x0036
            java.lang.String r0 = "raven"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x0036
            java.lang.String r0 = "universal"
            boolean r0 = r3.equals(r0)
            r19 = 0
            if (r0 == 0) goto L_0x0038
        L_0x0036:
            r19 = 1
        L_0x0038:
            r0 = 12
            X.Ple r1 = new X.Ple
            r10 = r33
            r1.<init>(r10, r0)
            java.lang.Class<X.OEC> r0 = X.OEC.class
            java.lang.Object r6 = r10.A01(r0, r1)
            X.OEC r6 = (X.OEC) r6
            java.lang.String r5 = "surface"
            r1 = 0
            r2 = r38
            r6.A00 = r2
            java.util.Set r7 = r6.A02
            boolean r0 = X.00k.A0u(r7, r2)
            if (r0 == 0) goto L_0x0060
            X.02m r4 = r6.A01
            r0 = 276892616(0x10810bc8, float:5.089968E-29)
            r4.markerAnnotate(r0, r5, r2)
        L_0x0060:
            java.lang.String r0 = r6.A00
            boolean r0 = X.00k.A0u(r7, r0)
            if (r0 == 0) goto L_0x0072
            X.02m r5 = r6.A01
            r4 = 276892616(0x10810bc8, float:5.089968E-29)
            java.lang.String r0 = "start_suggested_section_load"
            r5.markerPoint(r4, r0)
        L_0x0072:
            java.lang.String r0 = r6.A00
            boolean r0 = X.00k.A0u(r7, r0)
            if (r0 == 0) goto L_0x0084
            X.02m r5 = r6.A01
            r4 = 276892616(0x10810bc8, float:5.089968E-29)
            java.lang.String r0 = "loaded_suggested_section"
            r5.markerPoint(r4, r0)
        L_0x0084:
            r0 = 15
            X.Plo r4 = X.C73913Plo.A00(r10, r0)
            java.lang.Class<X.Oy6> r0 = X.Oy6.class
            java.lang.Object r0 = r10.A01(r0, r4)
            X.Oy6 r0 = (X.Oy6) r0
            java.util.ArrayList r6 = X.AnonymousClass7TE.A1C()
            java.util.HashMap r5 = X.AnonymousClass7TE.A1E()
            if (r51 == 0) goto L_0x00a6
            java.lang.String r7 = "message_content"
            r6.add(r7)
            java.lang.String r4 = "0"
            r5.put(r7, r4)
        L_0x00a6:
            boolean r4 = r6.isEmpty()
            r13 = 0
            r11 = r34
            if (r4 != 0) goto L_0x014f
            X.PPg r4 = new X.PPg
            r4.<init>(r10, r6, r5)
            X.7eJ r8 = new X.7eJ
            r8.<init>((X.AnonymousClass4D6) r11, (X.C336227eH) r4, (boolean) r1)
        L_0x00b9:
            X.0Tu r6 = X.0Tu.A05
            r4 = 36317521902638360(0x81069800211518, double:3.0306853179266927E-306)
            boolean r4 = X.182.A06(r6, r10, r4)
            r9 = r41
            if (r4 == 0) goto L_0x014d
            X.A5P r5 = new X.A5P
            r5.<init>(r10, r9)
            X.9qH r4 = new X.9qH
            r4.<init>(r10, r11, r5)
        L_0x00d2:
            r6 = r35
            if (r35 == 0) goto L_0x014b
            r5 = r42
            if (r42 == 0) goto L_0x014b
            if (r53 == 0) goto L_0x014b
            if (r30 == 0) goto L_0x014b
            r7 = r32
            if (r32 == 0) goto L_0x014b
            X.L9l r15 = new X.L9l
            r15.<init>(r7, r6, r5)
        L_0x00e7:
            if (r56 == 0) goto L_0x0149
            X.O8H r14 = new X.O8H
            r14.<init>()
        L_0x00ee:
            r5 = r36
            if (r36 == 0) goto L_0x00f7
            X.L1T r13 = new X.L1T
            r13.<init>(r5)
        L_0x00f7:
            X.Mpv r5 = new X.Mpv
            r25 = r43
            r23 = r40
            r29 = r47
            r28 = r46
            r27 = r45
            r26 = r44
            r20 = r5
            r21 = r10
            r22 = r3
            r24 = r9
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28, r29)
            X.7eJ r3 = new X.7eJ
            r3.<init>((X.AnonymousClass4D6) r11, (X.C336227eH) r5, (boolean) r1)
            X.OWV r12 = new X.OWV
            r25 = r39
            r29 = r55
            r28 = r54
            r27 = r52
            r21 = r31
            r20 = r12
            r22 = r10
            r23 = r0
            r24 = r2
            r26 = r19
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28, r29)
            X.PPf r9 = new X.PPf
            r18 = r4
            r17 = r8
            r16 = r3
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            if (r48 == 0) goto L_0x0156
            X.PPZ r27 = new X.PPZ
            r31 = r50
            r32 = r49
            r28 = r10
            r29 = r9
            r27.<init>(r28, r29, r30, r31, r32)
            return r27
        L_0x0149:
            r14 = r13
            goto L_0x00ee
        L_0x014b:
            r15 = r13
            goto L_0x00e7
        L_0x014d:
            r4 = r13
            goto L_0x00d2
        L_0x014f:
            r8 = r13
            goto L_0x00b9
        L_0x0152:
            r30 = 1
            goto L_0x0036
        L_0x0156:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67562Mpw.A02(android.content.Context, X.07Z, com.instagram.common.session.UserSession, X.4D6, com.instagram.direct.fragment.sharesheet.viewmodel.DirectShareSheetFragmentViewModel, X.DkJ, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, int, int, int, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean):X.7eL");
    }
}
