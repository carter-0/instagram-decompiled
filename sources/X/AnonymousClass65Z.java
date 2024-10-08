package X;

import com.facebook.msys.mca.MailboxCallback;
import com.instagram.common.session.UserSession;

/* renamed from: X.65Z  reason: invalid class name */
public final class AnonymousClass65Z implements MailboxCallback {
    public final UserSession A00;
    public final AnonymousClass65X A01;
    public final AnonymousClass6EB A02;
    public final AnonymousClass65Q A03;
    public final AnonymousClass65S A04;
    public final 1Av A05;

    public /* synthetic */ AnonymousClass65Z(UserSession userSession, AnonymousClass65X r7) {
        AnonymousClass6EB r4 = new AnonymousClass6EB(userSession);
        AnonymousClass65S A002 = AnonymousClass6ED.A00(userSession);
        1Av A003 = 1Au.A00(userSession);
        AnonymousClass65Q r1 = new AnonymousClass65Q(C61410nE.A00, A003);
        0qQ.A0B(A002, 4);
        0qQ.A0B(A003, 5);
        this.A00 = userSession;
        this.A01 = r7;
        this.A02 = r4;
        this.A04 = A002;
        this.A05 = A003;
        this.A03 = r1;
    }

    /* JADX WARNING: type inference failed for: r25v3, types: [X.5ER, java.lang.Object] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x03ca  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onCompletion(java.lang.Object r50) {
        /*
            r49 = this;
            r1 = r50
            com.facebook.msys.mca.MailboxNullable r1 = (com.facebook.msys.mca.MailboxNullable) r1
            r4 = 0
            X.0qQ.A0B(r1, r4)
            r11 = r49
            com.instagram.common.session.UserSession r15 = r11.A00
            java.lang.String r0 = r15.A06
            r48 = r0
            boolean r23 = X.C282435Db.A02(r48)
            java.lang.Object r0 = r1.value
            X.5z0 r0 = (X.C301345z0) r0
            if (r0 == 0) goto L_0x0402
            com.facebook.msys.mci.CQLResultSet r1 = r0.mResultSet
            int r22 = r1.getCount()
            r1 = 0
        L_0x0021:
            r2 = r22
            if (r1 >= r2) goto L_0x0402
            X.65Q r6 = r11.A03
            com.facebook.msys.mci.CQLResultSet r2 = r0.mResultSet
            java.lang.Integer r5 = r2.getNullableInteger(r1, r4)
            com.facebook.msys.mci.CQLResultSet r3 = r0.mResultSet
            r2 = 29
            int r8 = r3.getInteger(r1, r2)
            r2 = 1
            if (r5 == 0) goto L_0x03eb
            int r5 = r5.intValue()
            r3 = 2004(0x7d4, float:2.808E-42)
            if (r5 != r3) goto L_0x03ce
            java.lang.String r3 = "admin message in android"
        L_0x0042:
            X.9It r5 = new X.9It
            r5.<init>((java.lang.String) r3, (int) r4, (boolean) r2)
        L_0x0047:
            boolean r9 = r5.A00
            java.lang.String r3 = r5.A02
            com.facebook.msys.mci.CQLResultSet r6 = r0.mResultSet
            r5 = 28
            int r5 = r6.getInteger(r1, r5)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            com.instagram.direct.msys.subtype.MsysThreadSubtype r6 = X.C70116NxW.A00(r5)
            X.4fB r7 = X.C269474fB.A00
            X.4cw r5 = new X.4cw
            r5.<init>(r7)
            java.lang.String r7 = "is_vanish_mode"
            r5.A0F(r7, r4)
            X.6EB r7 = r11.A02
            r36 = r7
            com.facebook.msys.mci.CQLResultSet r7 = r0.mResultSet
            r8 = 10
            java.lang.Long r7 = r7.getNullableLong(r1, r8)
            if (r7 == 0) goto L_0x03ca
            java.lang.String r31 = java.lang.String.valueOf(r7)
        L_0x0079:
            r38 = 0
            com.facebook.msys.mci.CQLResultSet r10 = r0.mResultSet
            r7 = 14
            int r10 = r10.getInteger(r1, r7)
            java.lang.Integer r29 = java.lang.Integer.valueOf(r10)
            java.lang.String r30 = "ARMADILLO_NOTIFICATIONS_PRESENT_CLIENT_NOTIFICATION_SYNCED_2"
            r24 = r36
            r25 = r5
            r26 = r38
            r27 = r38
            r28 = r38
            r32 = r38
            r33 = r38
            r34 = r38
            r35 = r23
            r24.A02(r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)
            if (r9 == 0) goto L_0x00e4
            X.65S r9 = r11.A04
            com.facebook.msys.mci.CQLResultSet r6 = r0.mResultSet
            r2 = 19
            java.lang.String r25 = r6.getString(r1, r2)
            com.facebook.msys.mci.CQLResultSet r6 = r0.mResultSet
            r2 = 18
            java.lang.String r26 = r6.getString(r1, r2)
            r24 = r9
            r27 = r3
            r29 = r4
            r30 = r4
            r24.A06(r25, r26, r27, r28, r29, r30)
            com.facebook.msys.mci.CQLResultSet r2 = r0.mResultSet
            java.lang.Long r2 = r2.getNullableLong(r1, r8)
            java.lang.String r31 = java.lang.String.valueOf(r2)
            com.facebook.msys.mci.CQLResultSet r2 = r0.mResultSet
            int r2 = r2.getInteger(r1, r7)
            java.lang.Integer r29 = java.lang.Integer.valueOf(r2)
            java.lang.String r30 = "ARMADILLO_NOTIFICATIONS_SUPPRESSED"
            r24 = r36
            r25 = r5
            r26 = r38
            r27 = r38
            r32 = r3
            r24.A02(r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)
        L_0x00e0:
            int r1 = r1 + 1
            goto L_0x0021
        L_0x00e4:
            boolean r3 = r6.A03
            if (r3 == 0) goto L_0x0132
            com.facebook.msys.mci.CQLResultSet r6 = r0.mResultSet
            r3 = 26
            java.lang.String r6 = r6.getString(r1, r3)
            if (r6 == 0) goto L_0x0123
            int r3 = r6.length()
            if (r3 == 0) goto L_0x0123
            java.util.List r6 = java.util.Collections.singletonList(r6)
            X.0qQ.A07(r6)
            com.instagram.direct.perf.constants.ThreadFetchReason r3 = com.instagram.direct.perf.constants.ThreadFetchReason.ARMADILLO_MIXED_NOTIFICATION_IS_OPEN_THREAD_MUTED
            X.2Ep r3 = X.C71129OdS.A01(r15, r3, r6)
            if (r3 == 0) goto L_0x0132
            boolean r3 = r3.isMuted()
            if (r3 != r2) goto L_0x0132
            com.facebook.msys.mci.CQLResultSet r2 = r0.mResultSet
            java.lang.Long r2 = r2.getNullableLong(r1, r8)
            java.lang.String r31 = java.lang.String.valueOf(r2)
            java.lang.String r30 = "ARMADILLO_NOTIFICATIONS_SUPPRESSED"
            java.lang.String r32 = "Open thread corresponding to Armadillo thread was muted"
        L_0x011b:
            r29 = r38
            r35 = r4
            r24.A02(r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)
            goto L_0x00e0
        L_0x0123:
            com.facebook.msys.mci.CQLResultSet r2 = r0.mResultSet
            java.lang.Long r2 = r2.getNullableLong(r1, r8)
            java.lang.String r31 = java.lang.String.valueOf(r2)
            java.lang.String r30 = "ARMADILLO_NOTIFICATIONS_SUPPRESSED"
            java.lang.String r32 = "Armadillo Mixed notifications require a senderId"
            goto L_0x011b
        L_0x0132:
            com.facebook.msys.mci.CQLResultSet r3 = r0.mResultSet
            r6 = 12
            int r9 = r3.getInteger(r1, r6)
            r3 = 18
            if (r9 != r3) goto L_0x0144
            boolean r9 = X.C272094k5.A09(r15)
            if (r9 == 0) goto L_0x00e0
        L_0x0144:
            X.65X r13 = r11.A01
            com.facebook.msys.mci.CQLResultSet r10 = r0.mResultSet
            r9 = 9
            java.lang.Long r12 = r10.getNullableLong(r1, r9)
            com.facebook.msys.mci.CQLResultSet r9 = r0.mResultSet
            java.lang.Long r27 = r9.getNullableLong(r1, r8)
            com.facebook.msys.mci.CQLResultSet r9 = r0.mResultSet
            int r9 = r9.getInteger(r1, r7)
            com.facebook.msys.mci.CQLResultSet r7 = r0.mResultSet
            int r7 = r7.getInteger(r1, r6)
            if (r12 == 0) goto L_0x0370
            if (r27 != 0) goto L_0x0168
            if (r7 != r3) goto L_0x0370
            if (r9 != r8) goto L_0x0370
        L_0x0168:
            com.facebook.msys.mci.CQLResultSet r7 = r0.mResultSet
            r9 = 27
            boolean r10 = r7.getBoolean(r1, r9)
            com.facebook.msys.mci.CQLResultSet r8 = r0.mResultSet
            r7 = 16
            java.lang.String r21 = r8.getString(r1, r7)
            if (r21 == 0) goto L_0x03fa
            if (r10 == 0) goto L_0x036c
            java.lang.Integer r7 = X.AnonymousClass05K.A01
        L_0x017e:
            int r7 = r7.intValue()
            if (r7 == r4) goto L_0x0206
            long r38 = r12.longValue()
            com.facebook.msys.mci.CQLResultSet r5 = r0.mResultSet
            r2 = 23
            java.lang.String r2 = r5.getString(r1, r2)
            com.instagram.common.typedurl.SimpleImageUrl r7 = new com.instagram.common.typedurl.SimpleImageUrl
            r7.<init>(r2)
            com.facebook.msys.mci.CQLResultSet r5 = r0.mResultSet
            r2 = 5
            java.lang.String r28 = r5.getString(r1, r2)
            com.facebook.msys.mci.CQLResultSet r5 = r0.mResultSet
            r2 = 4
            java.lang.String r29 = r5.getString(r1, r2)
            com.facebook.msys.mci.CQLResultSet r5 = r0.mResultSet
            r2 = 6
            java.lang.String r30 = r5.getString(r1, r2)
            com.facebook.msys.mci.CQLResultSet r2 = r0.mResultSet
            java.lang.Integer r2 = r2.getNullableInteger(r1, r4)
            if (r2 != 0) goto L_0x01b6
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
        L_0x01b6:
            int r37 = r2.intValue()
            com.facebook.msys.mci.CQLResultSet r2 = r0.mResultSet
            int r36 = r2.getInteger(r1, r6)
            com.facebook.msys.mci.CQLResultSet r5 = r0.mResultSet
            r2 = 3
            long r5 = r5.getLong(r1, r2)
            java.lang.String r33 = java.lang.String.valueOf(r5)
            com.facebook.msys.mci.CQLResultSet r5 = r0.mResultSet
            r2 = 19
            java.lang.String r34 = r5.getString(r1, r2)
            com.facebook.msys.mci.CQLResultSet r2 = r0.mResultSet
            java.lang.String r35 = r2.getString(r1, r3)
            com.facebook.msys.mci.CQLResultSet r3 = r0.mResultSet
            r2 = 26
            java.lang.String r2 = r3.getString(r1, r2)
            java.lang.String r32 = java.lang.String.valueOf(r2)
            r24 = r15
            r25 = r7
            r26 = r13
            r31 = r21
            X.5HJ r3 = X.AnonymousClass65X.A00(r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38)
            com.facebook.msys.mci.CQLResultSet r5 = r0.mResultSet
            r2 = 30
            java.lang.Long r2 = r5.getNullableLong(r1, r2)
            r3.A0L = r2
        L_0x01fb:
            X.OIv r2 = X.OZF.A02
            X.OZF r2 = r2.A00()
            r2.A00(r3, r15)
            goto L_0x00e0
        L_0x0206:
            long r19 = r12.longValue()
            com.facebook.msys.mci.CQLResultSet r8 = r0.mResultSet
            r7 = 23
            java.lang.String r8 = r8.getString(r1, r7)
            com.instagram.common.typedurl.SimpleImageUrl r18 = new com.instagram.common.typedurl.SimpleImageUrl
            r7 = r18
            r7.<init>(r8)
            com.facebook.msys.mci.CQLResultSet r8 = r0.mResultSet
            r7 = 4
            java.lang.String r14 = r8.getString(r1, r7)
            com.facebook.msys.mci.CQLResultSet r8 = r0.mResultSet
            r7 = 26
            java.lang.String r17 = r8.getString(r1, r7)
            com.facebook.msys.mci.CQLResultSet r8 = r0.mResultSet
            r7 = 6
            java.lang.String r31 = r8.getString(r1, r7)
            if (r31 != 0) goto L_0x0233
            java.lang.String r31 = ""
        L_0x0233:
            com.facebook.msys.mci.CQLResultSet r7 = r0.mResultSet
            java.lang.Integer r7 = r7.getNullableInteger(r1, r4)
            if (r7 != 0) goto L_0x023f
            java.lang.Integer r7 = java.lang.Integer.valueOf(r4)
        L_0x023f:
            int r7 = r7.intValue()
            com.facebook.msys.mci.CQLResultSet r8 = r0.mResultSet
            int r6 = r8.getInteger(r1, r6)
            com.facebook.msys.mci.CQLResultSet r10 = r0.mResultSet
            r8 = 28
            int r8 = r10.getInteger(r1, r8)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            com.instagram.direct.msys.subtype.MsysThreadSubtype r8 = X.C70116NxW.A00(r8)
            com.facebook.msys.mci.CQLResultSet r12 = r0.mResultSet
            r10 = 19
            java.lang.String r39 = r12.getString(r1, r10)
            com.facebook.msys.mci.CQLResultSet r10 = r0.mResultSet
            java.lang.String r40 = r10.getString(r1, r3)
            int r10 = r8.A00
            r12 = 2
            X.N4O r16 = new X.N4O
            r41 = r16
            r42 = r38
            r43 = r38
            r44 = r38
            r45 = r38
            r46 = r10
            r47 = r9
            r41.<init>((java.lang.Boolean) r42, (java.lang.Boolean) r43, (java.lang.Integer) r44, (java.lang.Long) r45, (int) r46, (int) r47)
            boolean r9 = r16.A00()
            r47 = 0
            if (r9 != r2) goto L_0x0287
            r47 = 1
        L_0x0287:
            boolean r9 = r8.A03
            if (r9 == 0) goto L_0x0356
            if (r17 == 0) goto L_0x0378
            int r9 = r17.length()
            if (r9 == 0) goto L_0x0378
            java.util.List r10 = java.util.Collections.singletonList(r17)
            X.0qQ.A07(r10)
            com.instagram.direct.perf.constants.ThreadFetchReason r9 = com.instagram.direct.perf.constants.ThreadFetchReason.ARMADILLO_MIXED_NOTIFICATION
            X.2Ep r9 = X.C71129OdS.A01(r15, r9, r10)
            if (r9 == 0) goto L_0x0378
            java.lang.String r44 = r9.C6C()
            if (r44 == 0) goto L_0x0378
            int r9 = r44.length()
            if (r9 == 0) goto L_0x0378
            X.65Y r5 = r13.A02
            java.lang.Long r43 = java.lang.Long.valueOf(r19)
            r41 = r5
            r45 = r7
            r46 = r4
            r42 = r27
            java.lang.String r32 = r41.A01(r42, r43, r44, r45, r46, r47)
        L_0x02c0:
            if (r6 != r3) goto L_0x02ce
            android.content.Context r8 = r13.A00
            r5 = 2131963991(0x7f133057, float:1.9564751E38)
            java.lang.String r31 = r8.getString(r5)
            X.0qQ.A0A(r31)
        L_0x02ce:
            if (r7 == r12) goto L_0x034b
            r5 = 13
            if (r7 == r5) goto L_0x0344
            java.lang.String r33 = "direct_v2_message"
        L_0x02d6:
            r34 = r21
        L_0x02d8:
            if (r6 != r3) goto L_0x0341
            r3 = 1284(0x504, float:1.799E-42)
            java.lang.String r35 = X.AnonymousClass000.A00(r3)
        L_0x02e0:
            X.5ER r25 = new X.5ER
            r25.<init>()
            java.lang.Boolean r27 = java.lang.Boolean.valueOf(r4)
            java.lang.Boolean r29 = java.lang.Boolean.valueOf(r2)
            X.5HJ r3 = new X.5HJ
            r28 = r27
            r30 = r14
            r36 = r48
            r37 = r21
            r24 = r3
            r26 = r18
            r24.<init>(r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40)
            r5 = r16
            r3.A05 = r5
            r3.A1U = r4
            com.facebook.msys.mci.CQLResultSet r6 = r0.mResultSet
            r5 = 3
            long r5 = r6.getLong(r1, r5)
            java.lang.String r5 = java.lang.String.valueOf(r5)
            r3.A0u = r5
            com.facebook.msys.mci.CQLResultSet r6 = r0.mResultSet
            r5 = 30
            java.lang.Long r5 = r6.getNullableLong(r1, r5)
            r3.A0L = r5
            r5 = 13
            if (r7 != r5) goto L_0x0321
            r3.A1N = r2
        L_0x0321:
            java.lang.String r5 = java.lang.String.valueOf(r17)
            r3.A1A = r5
            r3.A19 = r14
            r3.A0b = r14
            X.O5r r6 = new X.O5r
            r6.<init>()
            r6.A00 = r4
            X.OtU r5 = new X.OtU
            r5.<init>(r6)
            r3.A09 = r5
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r3.A0c = r2
            goto L_0x01fb
        L_0x0341:
            java.lang.String r35 = "direct_v2_text"
            goto L_0x02e0
        L_0x0344:
            r5 = 590(0x24e, float:8.27E-43)
            java.lang.String r33 = X.AnonymousClass000.A00(r5)
            goto L_0x02d6
        L_0x034b:
            java.lang.String r33 = "direct_v2_delete_item"
            java.lang.String r8 = "_unsend"
            r5 = r21
            java.lang.String r34 = X.002.A0R(r5, r8)
            goto L_0x02d8
        L_0x0356:
            X.65Y r5 = r13.A02
            java.lang.String r44 = java.lang.String.valueOf(r19)
            r41 = r5
            r42 = r27
            r45 = r7
            r46 = r2
            r47 = r4
            java.lang.String r32 = r41.A01(r42, r43, r44, r45, r46, r47)
            goto L_0x02c0
        L_0x036c:
            java.lang.Integer r7 = X.AnonymousClass05K.A00
            goto L_0x017e
        L_0x0370:
            java.lang.String r7 = "notification_threadPk_null_or_messagePK_null"
            java.lang.String r6 = "No notification should be rendered"
            X.0wb.A04(r7, r6, r2)
            goto L_0x038e
        L_0x0378:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r6 = "Unable to create action for threadType: "
            r7.append(r6)
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            java.lang.String r6 = "armadillo_notification_no_action"
            X.0wb.A04(r6, r7, r2)
        L_0x038e:
            X.65S r7 = r11.A04
            com.facebook.msys.mci.CQLResultSet r6 = r0.mResultSet
            r2 = 19
            java.lang.String r25 = r6.getString(r1, r2)
            com.facebook.msys.mci.CQLResultSet r2 = r0.mResultSet
            java.lang.String r26 = r2.getString(r1, r3)
            java.lang.String r27 = "missing information, threadPk or messagePk"
            r24 = r7
            r29 = r4
            r30 = r4
            r24.A06(r25, r26, r27, r28, r29, r30)
            java.lang.String r27 = "ARMADILLO_NOTIFICATIONS_PRESENT_CLIENT_NOTIFICATION_ERROR"
            java.lang.String r3 = "is_bg_account"
            r2 = r23
            r5.A0F(r3, r2)
            java.lang.String r2 = "skips_sync"
            r5.A0F(r2, r4)
            java.lang.String r30 = r5.toString()
            r24 = r36
            r25 = r38
            r26 = r38
            r29 = r38
            r31 = r38
            X.AnonymousClass6EB.A01(r24, r25, r26, r27, r28, r29, r30, r31)
            goto L_0x00e0
        L_0x03ca:
            r31 = 0
            goto L_0x0079
        L_0x03ce:
            r3 = 6
            if (r5 != r3) goto L_0x03eb
            X.1Av r7 = r6.A00
            X.0s0 r6 = r7.A10
            X.0YZ[] r5 = X.1Av.A8a
            r3 = 337(0x151, float:4.72E-43)
            r3 = r5[r3]
            java.lang.Object r3 = r6.CDM(r7, r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L_0x03eb
            java.lang.String r3 = "app message request mute"
            goto L_0x0042
        L_0x03eb:
            if (r8 != r2) goto L_0x03f1
            java.lang.String r3 = "Receiver not eligible for disappearing mode"
            goto L_0x0042
        L_0x03f1:
            java.lang.String r3 = ""
            X.9It r5 = new X.9It
            r5.<init>((java.lang.String) r3, (int) r4, (boolean) r4)
            goto L_0x0047
        L_0x03fa:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0402:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass65Z.onCompletion(java.lang.Object):void");
    }
}
