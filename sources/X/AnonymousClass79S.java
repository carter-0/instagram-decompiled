package X;

import android.content.Context;
import android.util.LruCache;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.79S  reason: invalid class name */
public final class AnonymousClass79S {
    public static final AnonymousClass79S A00 = new Object();

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0099, code lost:
        if (r0 == null) goto L_0x009b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x005b, code lost:
        if (r14 == false) goto L_0x005d;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.AnonymousClass79c A02(android.content.Context r85, com.instagram.common.session.UserSession r86, X.AnonymousClass9HO r87, X.AnonymousClass9HC r88, X.AnonymousClass7LQ r89, X.AnonymousClass7L2 r90) {
        /*
            r2 = 0
            r12 = r85
            X.0qQ.A0B(r12, r2)
            r0 = 1
            r11 = r86
            X.0qQ.A0B(r11, r0)
            r1 = 2
            r5 = r89
            X.0qQ.A0B(r5, r1)
            r1 = 3
            r8 = r88
            X.0qQ.A0B(r8, r1)
            r1 = 4
            r6 = r90
            X.0qQ.A0B(r6, r1)
            r1 = 6
            r13 = r87
            X.0qQ.A0B(r13, r1)
            X.3su r7 = r5.A0e
            X.7AG r1 = r7.A0Q
            r10 = 0
            if (r1 == 0) goto L_0x002c
            r10 = 1
        L_0x002c:
            X.7SD r1 = r5.A0G
            int r1 = r1.A08
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            boolean r9 = X.AnonymousClass48O.A06(r1)
            X.0t1 r1 = X.0eE.A00(r11)
            com.instagram.user.model.User r1 = r1.A00()
            boolean r1 = r7.A1j(r1)
            boolean r3 = X.AnonymousClass79Y.A00(r11, r9, r10)
            if (r3 == 0) goto L_0x005d
            X.7SD r3 = r5.A0G
            boolean r3 = r3.A00()
            if (r3 == 0) goto L_0x006a
            java.lang.Boolean r3 = X.C70306O1k.A00(r11)
            boolean r14 = r3.booleanValue()
        L_0x005a:
            r4 = 1
            if (r14 != 0) goto L_0x005e
        L_0x005d:
            r4 = 0
        L_0x005e:
            java.lang.CharSequence r3 = r5.A0L
            if (r3 == 0) goto L_0x009b
            X.79S r14 = A00
            java.lang.String r21 = r3.toString()
            monitor-enter(r7)
            goto L_0x007d
        L_0x006a:
            X.0Tu r14 = X.0Tu.A05
            r3 = 36325613619065936(0x810df400033450, double:3.0358025519782185E-306)
            boolean r14 = X.182.A06(r14, r11, r3)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r14)
            X.0qQ.A0A(r3)
            goto L_0x005a
        L_0x007d:
            java.util.List r3 = r7.A28     // Catch:{ all -> 0x0080 }
            goto L_0x0083
        L_0x0080:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        L_0x0083:
            monitor-exit(r7)
            r15 = r12
            r16 = r11
            r17 = r13
            r18 = r8
            r19 = r5
            r20 = r6
            r22 = r3
            r23 = r1
            r24 = r0
            java.lang.CharSequence r0 = r14.A07(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            if (r0 != 0) goto L_0x00a1
        L_0x009b:
            java.lang.String r0 = r7.A1q
            if (r0 != 0) goto L_0x00a1
            java.lang.String r0 = ""
        L_0x00a1:
            if (r4 == 0) goto L_0x00be
            X.79S r13 = A00
            r14 = r12
            r15 = r11
            r16 = r6
            r17 = r1
            r18 = r10
            r19 = r9
            X.Mhg r4 = r13.A00(r14, r15, r16, r17, r18, r19)
            android.text.Editable$Factory r3 = android.text.Editable.Factory.getInstance()
            android.text.Editable r0 = r3.newEditable(r0)
            r4.A01(r0, r1)
        L_0x00be:
            boolean r75 = r7.A1Z()
            X.2FW r80 = X.2FW.A1g
            X.Pjp r3 = X.C73790Pjp.A00
            X.0t0 r13 = X.AnonymousClass0eN.A01(r3)
            X.7FE r69 = new X.7FE
            r9 = r69
            r10 = r8
            r11 = r6
            r12 = r80
            r14 = r2
            r15 = r2
            r16 = r2
            r17 = r2
            r18 = r2
            r19 = r2
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            java.lang.String r6 = r7.A0h()
            java.lang.String r4 = r7.A0f()
            com.instagram.model.direct.messageid.MessageIdentifier r3 = new com.instagram.model.direct.messageid.MessageIdentifier
            r3.<init>(r6, r4)
            r7 = 0
            java.lang.String r9 = ""
            X.7FR r6 = new X.7FR
            r8 = r7
            r10 = r9
            r11 = r7
            r12 = r7
            r13 = r7
            r14 = r7
            r15 = r7
            r16 = r7
            r17 = r7
            r18 = r7
            r19 = r7
            r21 = r2
            r22 = r2
            r23 = r2
            r24 = r2
            r25 = r2
            r26 = r2
            r27 = r2
            r28 = r2
            r29 = r2
            r30 = r2
            r31 = r2
            r32 = r2
            r33 = r2
            r34 = r2
            r35 = r2
            r36 = r2
            r37 = r2
            r38 = r2
            r39 = r2
            r40 = r2
            r41 = r2
            r42 = r2
            r43 = r2
            r44 = r2
            r45 = r2
            r46 = r2
            r47 = r2
            r48 = r2
            r49 = r2
            r50 = r2
            r51 = r2
            r52 = r2
            r53 = r2
            r54 = r2
            r55 = r2
            r56 = r2
            r57 = r2
            r58 = r2
            r59 = r2
            r60 = r2
            r61 = r2
            r62 = r2
            r63 = r2
            r64 = r2
            r65 = r2
            r66 = r2
            r67 = r2
            r68 = r2
            r20 = r2
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68)
            X.7Bo r79 = r5.A03()
            X.0qQ.A07(r79)
            r84 = 0
            X.7FT r68 = new X.7FT
            r76 = r68
            r77 = r7
            r78 = r6
            r81 = r3
            r82 = r7
            r83 = r7
            r86 = r2
            r87 = r2
            r88 = r2
            r89 = r1
            r90 = r2
            r76.<init>(r77, r78, r79, r80, r81, r82, r83, r84, r86, r87, r88, r89, r90)
            X.5FV r66 = X.AnonymousClass5FV.None
            X.79c r65 = new X.79c
            r67 = r7
            r71 = r7
            r72 = r7
            r73 = r7
            r74 = r2
            r76 = r2
            r78 = r2
            r79 = r2
            r80 = r2
            r81 = r2
            r70 = r0
            r77 = r2
            r65.<init>(r66, r67, r68, r69, r70, r71, r72, r73, r74, r75, r76, r77, r78, r79, r80, r81)
            return r65
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass79S.A02(android.content.Context, com.instagram.common.session.UserSession, X.9HO, X.9HC, X.7LQ, X.7L2):X.79c");
    }

    public static final AnonymousClass79c A03(Context context, UserSession userSession, AnonymousClass9HO r11, AnonymousClass9HC r12, AnonymousClass7LQ r13, AnonymousClass7L2 r14) {
        0qQ.A0B(context, 0);
        0qQ.A0B(userSession, 1);
        0qQ.A0B(r14, 2);
        AnonymousClass7LQ r5 = r13;
        0qQ.A0B(r13, 3);
        AnonymousClass9HC r4 = r12;
        0qQ.A0B(r12, 4);
        AnonymousClass9HO r3 = r11;
        0qQ.A0B(r11, 5);
        return A04(context, userSession, r3, r4, r5, r14, AnonymousClass79T.A00.A04(userSession, r13), false, r13.A0V);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: android.text.SpannableString} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: android.text.Editable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: android.text.SpannableString} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v7, resolved type: android.text.SpannableString} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v8, resolved type: android.text.SpannableString} */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0092, code lost:
        if (r12.A02 != r11) goto L_0x0094;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00a3, code lost:
        if (r0.A1u.equals(X.C3262475z.A00(r2)) != false) goto L_0x00a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0125, code lost:
        if (X.182.A06(X.0Tu.A05, r2, 36324831935148430L) == false) goto L_0x0127;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0171, code lost:
        if (r23 == false) goto L_0x0173;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0185, code lost:
        if (r3.A1X() != false) goto L_0x0187;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.AnonymousClass79c A04(android.content.Context r27, com.instagram.common.session.UserSession r28, X.AnonymousClass9HO r29, X.AnonymousClass9HC r30, X.AnonymousClass7LQ r31, X.AnonymousClass7L2 r32, java.lang.String r33, boolean r34, boolean r35) {
        /*
            r9 = 0
            r8 = r27
            X.0qQ.A0B(r8, r9)
            r0 = 1
            r2 = r28
            X.0qQ.A0B(r2, r0)
            r0 = 2
            r6 = r32
            X.0qQ.A0B(r6, r0)
            r0 = 5
            r10 = r30
            X.0qQ.A0B(r10, r0)
            r0 = 8
            r5 = r29
            X.0qQ.A0B(r5, r0)
            r1 = r31
            X.3su r0 = r1.A0e
            X.0qQ.A07(r0)
            X.0t1 r3 = X.0eE.A00(r2)
            com.instagram.user.model.User r3 = r3.A00()
            boolean r4 = r0.A1j(r3)
            java.lang.Integer r11 = X.AnonymousClass05K.A01
            X.7AG r3 = r0.A0Q
            r7 = 0
            if (r3 == 0) goto L_0x01cc
            java.lang.Integer r3 = r3.A02
        L_0x003b:
            java.lang.String r12 = ""
            r19 = r33
            if (r11 != r3) goto L_0x01a3
            if (r33 == 0) goto L_0x0045
            r12 = r19
        L_0x0045:
            android.text.SpannableString r5 = new android.text.SpannableString
            r5.<init>(r12)
            X.Gms r13 = r1.A09
            java.lang.Integer r3 = r1.A0N
            if (r3 != r11) goto L_0x008a
            java.lang.String r3 = r0.A0o()
            if (r3 == 0) goto L_0x008a
            if (r13 == 0) goto L_0x008a
            X.7Kz r3 = X.AnonymousClass7FB.A04(r6, r4)
            int r14 = r3.A05
            X.7Kz r3 = X.AnonymousClass7FB.A04(r6, r4)
            int r12 = r3.A04
            r3 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            if (r12 == r3) goto L_0x006e
            r3 = 204(0xcc, float:2.86E-43)
            int r14 = X.2eL.A06(r12, r3)
        L_0x006e:
            android.text.style.ForegroundColorSpan r12 = new android.text.style.ForegroundColorSpan
            r12.<init>(r14)
            int r15 = r13.A01
            int r3 = r13.A00
            r14 = 33
            r5.setSpan(r12, r15, r3, r14)
            r3 = 1104150528(0x41d00000, float:26.0)
            X.W7s r13 = new X.W7s
            r13.<init>(r3)
            int r12 = r15 + 1
            int r3 = r15 + 2
            r5.setSpan(r13, r12, r3, r14)
        L_0x008a:
            X.7AG r12 = r0.A0Q
            if (r12 == 0) goto L_0x0094
            java.lang.Integer r3 = r12.A02
            r23 = 1
            if (r3 == r11) goto L_0x00a5
        L_0x0094:
            r23 = 0
            if (r12 != 0) goto L_0x00a5
            java.lang.String r11 = X.C3262475z.A00(r2)
            java.lang.String r3 = r0.A1u
            boolean r3 = r3.equals(r11)
            r11 = 0
            if (r3 == 0) goto L_0x00a6
        L_0x00a5:
            r11 = 1
        L_0x00a6:
            X.7SD r3 = r1.A0G
            int r3 = r3.A08
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            boolean r3 = X.AnonymousClass48O.A06(r3)
            boolean r12 = X.AnonymousClass79Y.A00(r2, r3, r11)
            if (r12 == 0) goto L_0x01a0
            X.79S r13 = A00
            r14 = r8
            r15 = r2
            r16 = r6
            r17 = r4
            r18 = r11
            r19 = r3
            X.Mhg r14 = r13.A00(r14, r15, r16, r17, r18, r19)
            if (r23 != 0) goto L_0x00d5
            android.text.Editable$Factory r3 = android.text.Editable.Factory.getInstance()
            android.text.Editable r5 = r3.newEditable(r5)
            r14.A01(r5, r4)
        L_0x00d5:
            X.5FV r13 = r0.A0G()
            java.util.Set r3 = X.AnonymousClass5FV.A03
            boolean r3 = r3.contains(r13)
            if (r3 != 0) goto L_0x00ee
            X.79Z r3 = new X.79Z
            r3.<init>(r2)
            boolean r3 = r3.A00(r13)
            if (r3 != 0) goto L_0x00ee
            X.5FV r13 = X.AnonymousClass5FV.None
        L_0x00ee:
            X.79a r4 = X.C3270179a.A00
            X.UVA r3 = r0.A0l
            java.lang.CharSequence r17 = r4.A00(r8, r3, r2, r5)
            com.instagram.user.model.User r3 = r1.A0K
            int r4 = r1.A00
            if (r4 == 0) goto L_0x0127
            if (r3 == 0) goto L_0x0127
            X.4Cl r4 = r3.A03
            com.instagram.api.schemas.IGAIAgentType r5 = r4.AaX()
            com.instagram.api.schemas.IGAIAgentType r4 = com.instagram.api.schemas.IGAIAgentType.A05
            if (r5 == r4) goto L_0x0118
            X.4Cl r4 = r3.A03
            com.instagram.api.schemas.IGAIAgentType r5 = r4.AaX()
            com.instagram.api.schemas.IGAIAgentType r4 = com.instagram.api.schemas.IGAIAgentType.A06
            if (r5 == r4) goto L_0x0118
            boolean r4 = r3.A1X()
            if (r4 == 0) goto L_0x0127
        L_0x0118:
            X.0Tu r11 = X.0Tu.A05
            r4 = 36324831935148430(0x810d3e0005318e, double:3.035308211921199E-306)
            boolean r4 = X.182.A06(r11, r2, r4)
            r26 = 1
            if (r4 != 0) goto L_0x0129
        L_0x0127:
            r26 = 0
        L_0x0129:
            java.lang.Integer r4 = r0.A1F
            boolean r21 = X.AnonymousClass48R.A01(r4)
            boolean r22 = r0.A1Z()
            java.lang.Boolean r32 = java.lang.Boolean.valueOf(r34)
            java.lang.Boolean r33 = java.lang.Boolean.valueOf(r35)
            X.7FC r4 = X.AnonymousClass7FC.A00
            X.0t0 r34 = X.AnonymousClass0eN.A01(r4)
            X.2FW r4 = r0.A10
            r27 = r2
            r28 = r10
            r29 = r1
            r30 = r6
            r31 = r4
            r35 = r9
            X.7FE r16 = X.AnonymousClass7FD.A02(r27, r28, r29, r30, r31, r32, r33, r34, r35)
            X.2FW r4 = X.2FW.A1g
            X.7FT r15 = X.AnonymousClass7FG.A00(r8, r2, r10, r1, r4)
            com.google.common.collect.ImmutableList r4 = r0.A0H
            com.instagram.user.model.User r1 = r1.A0K
            if (r1 == 0) goto L_0x019d
            java.lang.String r18 = r1.getId()
        L_0x0163:
            boolean r2 = r0.A2O
            com.instagram.model.direct.messageid.DirectMessageIdentifier r1 = r0.A13
            r25 = 0
            if (r1 == 0) goto L_0x016d
            r25 = 1
        L_0x016d:
            if (r12 == 0) goto L_0x0173
            r27 = 1
            if (r23 != 0) goto L_0x0175
        L_0x0173:
            r27 = 0
        L_0x0175:
            if (r3 == 0) goto L_0x0187
            X.4Cl r1 = r3.A03
            com.instagram.api.schemas.IGAIAgentType r1 = r1.AaX()
            if (r1 == 0) goto L_0x0187
            boolean r1 = r3.A1X()
            r28 = 1
            if (r1 == 0) goto L_0x0189
        L_0x0187:
            r28 = 0
        L_0x0189:
            X.3t0 r0 = r0.A0U()
            if (r0 == 0) goto L_0x0191
            java.lang.String r7 = r0.A00
        L_0x0191:
            X.79c r12 = new X.79c
            r24 = r2
            r19 = r7
            r20 = r4
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            return r12
        L_0x019d:
            r18 = r7
            goto L_0x0163
        L_0x01a0:
            r14 = r7
            goto L_0x00d5
        L_0x01a3:
            int r3 = r0.A01
            if (r3 <= 0) goto L_0x01b1
            r1.A0L = r7
            r1.A0M = r7
            if (r33 == 0) goto L_0x0045
            r12 = r19
            goto L_0x0045
        L_0x01b1:
            X.79S r12 = A00
            monitor-enter(r0)
            java.util.List r3 = r0.A28     // Catch:{ all -> 0x01cf }
            monitor-exit(r0)
            r13 = r8
            r14 = r2
            r15 = r5
            r16 = r10
            r17 = r1
            r18 = r6
            r20 = r3
            r21 = r4
            r22 = r9
            java.lang.CharSequence r12 = r12.A07(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            goto L_0x0045
        L_0x01cc:
            r3 = r7
            goto L_0x003b
        L_0x01cf:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass79S.A04(android.content.Context, com.instagram.common.session.UserSession, X.9HO, X.9HC, X.7LQ, X.7L2, java.lang.String, boolean, boolean):X.79c");
    }

    public static final AnonymousClass79c A05(Context context, UserSession userSession, AnonymousClass9HO r15, AnonymousClass9HC r16, AnonymousClass7LQ r17, AnonymousClass7L2 r18, boolean z) {
        String str;
        Class<?> cls;
        Context context2 = context;
        0qQ.A0B(context, 0);
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession, 1);
        AnonymousClass7L2 r10 = r18;
        0qQ.A0B(r10, 2);
        AnonymousClass9HC r8 = r16;
        0qQ.A0B(r8, 4);
        AnonymousClass9HO r7 = r15;
        0qQ.A0B(r15, 7);
        AnonymousClass7LQ r9 = r17;
        C254703su r3 = r9.A0e;
        0qQ.A07(r3);
        0wj r4 = 0wj.A01;
        0qQ.A0B(r4, 0);
        2FW r1 = r3.A10;
        C331597Rp r0 = C331597Rp.$redex_init_class;
        if (r1.ordinal() == 22) {
            Object obj = r3.A1T;
            if (!(obj instanceof AnonymousClass7FN)) {
                StringBuilder sb = new StringBuilder();
                sb.append("directMessage.content required to be DirectReelMedia but is ");
                if (obj != null) {
                    cls = obj.getClass();
                } else {
                    cls = null;
                }
                sb.append(cls);
                throw new IllegalArgumentException(sb.toString());
            }
            0qQ.A0C(obj, "null cannot be cast to non-null type com.instagram.direct.model.DirectReelMedia");
            str = ((AnonymousClass7FN) obj).A0A;
            0qQ.A0A(str);
        } else {
            if (r3.A1q == null) {
                0f9 AEf = r4.AEf("Expected REEL_SHARE or directMessage.text != null", 817891009);
                AEf.ABQ("item_type", r3.A10.toString());
                AEf.report();
            }
            str = r3.A1q;
            if (str == null) {
                str = "";
            }
        }
        return A04(context2, userSession2, r7, r8, r9, r10, str, false, z);
    }

    public static final AnonymousClass79c A06(Context context, UserSession userSession, AnonymousClass9HO r9, AnonymousClass9HC r10, AnonymousClass7LQ r11, AnonymousClass7L2 r12, boolean z, boolean z2) {
        Class<?> cls;
        Context context2 = context;
        0qQ.A0B(context, 0);
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession, 1);
        AnonymousClass7L2 r8 = r12;
        0qQ.A0B(r12, 2);
        AnonymousClass9HC r6 = r10;
        0qQ.A0B(r10, 4);
        AnonymousClass9HO r5 = r9;
        0qQ.A0B(r9, 7);
        AnonymousClass7LQ r7 = r11;
        C254703su r1 = r11.A0e;
        Object obj = r1.A1T;
        if ((obj instanceof String) || (obj instanceof List) || r1.A1q != null) {
            return A04(context2, userSession2, r5, r6, r7, r8, AnonymousClass79T.A00.A04(userSession2, r11), z, z2);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("directMessage.content required to be String but is ");
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        sb.append(cls);
        throw new IllegalArgumentException(sb.toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0042, code lost:
        if (X.182.A06(X.0Tu.A05, r13, 36322594256857379L) != false) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0064, code lost:
        if (r0.A03 != 8) goto L_0x0066;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00ac, code lost:
        if (X.182.A06(X.0Tu.A06, r13, 36324715970703641L) == false) goto L_0x00ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00fb, code lost:
        if (X.182.A06(X.0Tu.A06, r13, 36324715970703641L) == false) goto L_0x00fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x010c, code lost:
        if (r5 == null) goto L_0x00d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0026, code lost:
        if (X.0qQ.A0K(r0.A0M, r4) != false) goto L_0x0028;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.CharSequence A07(android.content.Context r25, com.instagram.common.session.UserSession r26, X.AnonymousClass9HO r27, X.AnonymousClass9HC r28, X.AnonymousClass7LQ r29, X.AnonymousClass7L2 r30, java.lang.String r31, java.util.List r32, boolean r33, boolean r34) {
        /*
            r24 = this;
            r0 = 7
            r6 = r28
            X.0qQ.A0B(r6, r0)
            r0 = r29
            java.lang.CharSequence r5 = r0.A0L
            r13 = r26
            r4 = r31
            if (r5 == 0) goto L_0x0044
            if (r34 != 0) goto L_0x0044
            X.0eM r1 = r6.A1Q
            java.lang.Object r1 = r1.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L_0x0029
            java.lang.CharSequence r1 = r0.A0M
            boolean r1 = X.0qQ.A0K(r1, r4)
            if (r1 == 0) goto L_0x0044
        L_0x0028:
            return r5
        L_0x0029:
            X.3su r3 = r0.A0e
            X.2FW r2 = r3.A10
            X.2FW r1 = X.2FW.A1s
            if (r2 != r1) goto L_0x0028
            boolean r1 = r3.A1S()
            if (r1 != 0) goto L_0x0028
            X.0Tu r3 = X.0Tu.A05
            r1 = 36322594256857379(0x810b3500002923, double:3.0338930951595313E-306)
            boolean r1 = X.182.A06(r3, r13, r1)
            if (r1 == 0) goto L_0x0028
        L_0x0044:
            r1 = r30
            if (r30 == 0) goto L_0x0151
            r5 = r33
            X.7Kz r16 = X.AnonymousClass7FB.A04(r1, r5)
            X.7SD r1 = r0.A0G
            boolean r10 = r1.A1G
            X.0Tu r7 = X.0Tu.A05
            r1 = 36318058773419842(0x810715001f1742, double:3.031024837170707E-306)
            boolean r1 = X.182.A06(r7, r13, r1)
            if (r1 == 0) goto L_0x0066
            int r3 = r0.A03
            r2 = 8
            r1 = 1
            if (r3 == r2) goto L_0x0067
        L_0x0066:
            r1 = 0
        L_0x0067:
            r9 = r1 ^ 1
            java.lang.String r8 = ""
            r17 = r25
            r15 = r27
            if (r10 == 0) goto L_0x010f
            r3 = 0
        L_0x0072:
            r1 = 36318058774533966(0x8107150030174e, double:3.0310248378752835E-306)
            boolean r1 = X.182.A06(r7, r13, r1)
            if (r1 == 0) goto L_0x00db
            X.79W r14 = new X.79W
            r14.<init>(r0, r4)
            android.content.Context r11 = r17.getApplicationContext()
            X.0qQ.A07(r11)
            X.3su r6 = r0.A0e
            X.5FV r12 = r6.A0G()
            X.7SD r1 = r0.A0G
            boolean r5 = r1.A0r
            java.lang.String r2 = r13.A06
            java.lang.String r1 = r6.BsI()
            boolean r1 = X.0qQ.A0K(r2, r1)
            if (r1 != 0) goto L_0x00ae
            X.0Tu r6 = X.0Tu.A06
            r1 = 36324715970703641(0x810d2300003119, double:3.0352348755393633E-306)
            boolean r1 = X.182.A06(r6, r13, r1)
            r23 = 1
            if (r1 != 0) goto L_0x00b0
        L_0x00ae:
            r23 = 0
        L_0x00b0:
            r21 = 1
            X.12T r6 = X.AnonymousClass12T.A00
            r20 = 0
            r2 = 1538196579(0x5baf0463, float:9.8525888E16)
            r1 = 3
            X.0nV r1 = r6.CO6(r2, r1)
            com.instagram.direct.messagethread.DirectMessageLinkifyHelper$linkifyAsync$1 r10 = new com.instagram.direct.messagethread.DirectMessageLinkifyHelper$linkifyAsync$1
            r19 = r32
            r22 = r5
            r18 = r4
            r17 = r3
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            X.1ES.A07(r1, r10)
            if (r31 == 0) goto L_0x00d1
            r8 = r4
        L_0x00d1:
            r5 = r8
        L_0x00d2:
            if (r9 == 0) goto L_0x0028
            if (r34 != 0) goto L_0x0028
            r0.A0L = r5
            r0.A0M = r4
            return r5
        L_0x00db:
            android.content.Context r10 = r17.getApplicationContext()
            X.0qQ.A07(r10)
            X.3su r1 = r0.A0e
            X.5FV r11 = r1.A0G()
            if (r33 != 0) goto L_0x00fd
            r1 = 0
            X.0qQ.A0B(r13, r1)
            X.0Tu r5 = X.0Tu.A06
            r1 = 36324715970703641(0x810d2300003119, double:3.0352348755393633E-306)
            boolean r1 = X.182.A06(r5, r13, r1)
            r18 = 1
            if (r1 != 0) goto L_0x00ff
        L_0x00fd:
            r18 = 0
        L_0x00ff:
            r17 = 1
            r12 = r13
            r13 = r15
            r14 = r16
            r15 = r3
            r16 = r4
            android.text.SpannableStringBuilder r5 = X.C3270279b.A00(r10, r11, r12, r13, r14, r15, r16, r17, r18)
            if (r5 != 0) goto L_0x00d2
            goto L_0x00d1
        L_0x010f:
            X.5H7 r3 = r0.A0H
            if (r3 != 0) goto L_0x0131
            if (r9 == 0) goto L_0x0131
            r20 = r4
            if (r31 != 0) goto L_0x011b
            r20 = r8
        L_0x011b:
            boolean r2 = r6.A1Y
            X.3su r1 = r0.A0e
            java.util.List r21 = r1.A0t()
            r18 = r13
            r19 = r15
            r22 = r2
            X.5H7 r3 = X.C3270279b.A01(r17, r18, r19, r20, r21, r22)
            r0.A0H = r3
            goto L_0x0072
        L_0x0131:
            java.lang.Integer r2 = r0.A0N
            java.lang.Integer r1 = X.AnonymousClass05K.A01
            if (r2 != r1) goto L_0x0072
            X.79U r1 = X.AnonymousClass79T.A00
            java.lang.String r20 = r1.A04(r13, r0)
            boolean r2 = r6.A1Y
            X.3su r1 = r0.A0e
            java.util.List r21 = r1.A0t()
            r18 = r13
            r19 = r15
            r22 = r2
            X.5H7 r3 = X.C3270279b.A01(r17, r18, r19, r20, r21, r22)
            goto L_0x0072
        L_0x0151:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass79S.A07(android.content.Context, com.instagram.common.session.UserSession, X.9HO, X.9HC, X.7LQ, X.7L2, java.lang.String, java.util.List, boolean, boolean):java.lang.CharSequence");
    }

    private final C67065Mhg A00(Context context, UserSession userSession, AnonymousClass7L2 r12, boolean z, boolean z2, boolean z3) {
        UserSession userSession2 = userSession;
        Context context2 = context;
        AnonymousClass7L2 r5 = r12;
        boolean z4 = z;
        boolean z5 = z2;
        boolean z6 = z3;
        if (!182.A06(0Tu.A05, userSession, 36324724561359143L)) {
            return A01(context2, userSession2, r5, z4, z5, z6);
        }
        C70559OBh oBh = (C70559OBh) userSession.A01(C70559OBh.class, new C73918Ply(userSession, 27));
        UserSession userSession3 = oBh.A01;
        C21417XaR xaR = new C21417XaR(context, userSession3, r12);
        LruCache lruCache = oBh.A00;
        C67065Mhg mhg = (C67065Mhg) lruCache.get(xaR);
        if (mhg != null) {
            return mhg;
        }
        C67065Mhg A01 = A01(context2, userSession3, r5, z4, z5, z6);
        lruCache.put(xaR, A01);
        return A01;
    }

    public static final C67065Mhg A01(Context context, UserSession userSession, AnonymousClass7L2 r12, boolean z, boolean z2, boolean z3) {
        boolean z4;
        if (!z3 ? !z2 || !182.A06(0Tu.A05, userSession, 36324724561031460L) : !182.A06(0Tu.A05, userSession, 36324724561031460L)) {
            z4 = false;
        } else {
            z4 = true;
        }
        return new C67065Mhg(context, Integer.valueOf(AnonymousClass7FB.A04(r12, z).A02), AnonymousClass7FB.A04(r12, z).A04, AnonymousClass7FB.A04(r12, z).A05, AnonymousClass7FB.A04(r12, z).A01, context.getResources().getDimensionPixelSize(R.dimen.account_group_management_row_text_size), R.style.MessageRenderingBlockquoteOutgoing, R.style.MessageRenderingBlockquoteIncoming, true, true, true, true, z4, false);
    }
}
