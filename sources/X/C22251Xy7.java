package X;

import com.facebook.msys.mca.MailboxFeature;

/* renamed from: X.Xy7  reason: case insensitive filesystem */
public final class C22251Xy7 implements MailboxFeature.DbConnectionResolutionCallback {
    public final int A00;
    public final Object A01;

    public C22251Xy7(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object run(com.facebook.msys.mca.Mailbox r60, com.facebook.msys.mci.sqliteholder.SqliteHolder r61) {
        /*
            r59 = this;
            r1 = r59
            int r0 = r1.A00
            r24 = r61
            switch(r0) {
                case 0: goto L_0x0568;
                case 1: goto L_0x0089;
                case 2: goto L_0x007e;
                case 3: goto L_0x004b;
                case 4: goto L_0x04e3;
                case 5: goto L_0x0477;
                case 6: goto L_0x0401;
                case 7: goto L_0x038d;
                case 8: goto L_0x0311;
                case 9: goto L_0x0283;
                case 10: goto L_0x01fc;
                case 11: goto L_0x019c;
                case 12: goto L_0x014e;
                case 13: goto L_0x00a6;
                case 14: goto L_0x0031;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.Object r0 = r1.A01
            X.Xxv r0 = (X.C22240Xxv) r0
            java.util.List r2 = r0.A07
            java.util.List r3 = r0.A04
            java.util.List r4 = r0.A06
            java.util.List r5 = r0.A05
            java.util.List r6 = r0.A03
            boolean r0 = r0.A08
            r1 = 42
            r7 = r24
            r8 = r0
            java.lang.Object r0 = com.facebook.instagramsecuremessage.mca.MailboxInstagramSecureMessageJNI.dispatchCqlOOOOOOOZ(r1, r2, r3, r4, r5, r6, r7, r8)
            com.facebook.msys.mci.CQLResultSet r0 = (com.facebook.msys.mci.CQLResultSet) r0
            if (r0 == 0) goto L_0x00a4
            X.XMZ r1 = new X.XMZ
            r1.<init>(r0)
        L_0x002b:
            com.facebook.msys.mca.MailboxNullable r4 = new com.facebook.msys.mca.MailboxNullable
            r4.<init>(r1)
            return r4
        L_0x0031:
            java.lang.Object r0 = r1.A01
            X.Xxt r0 = (X.C22238Xxt) r0
            java.util.List r3 = r0.A04
            java.util.List r2 = r0.A03
            r1 = 41
            r0 = r24
            java.lang.Object r0 = com.facebook.instagramsecuremessage.mca.MailboxInstagramSecureMessageJNI.dispatchCqlOOOO(r1, r3, r2, r0)
            com.facebook.msys.mci.CQLResultSet r0 = (com.facebook.msys.mci.CQLResultSet) r0
            if (r0 == 0) goto L_0x00a4
            X.XMY r1 = new X.XMY
            r1.<init>(r0)
            goto L_0x002b
        L_0x004b:
            java.lang.Object r8 = r1.A01
            X.Xxx r8 = (X.C22242Xxx) r8
            long r9 = r8.A01
            java.lang.String r11 = r8.A06
            java.lang.String r12 = r8.A0A
            java.lang.Number r7 = r8.A05
            java.lang.Number r6 = r8.A04
            java.lang.String r5 = r8.A09
            java.lang.String r4 = r8.A08
            java.util.List r3 = r8.A0B
            java.lang.String r2 = r8.A07
            com.facebook.msys.cql.dataclasses.ReadOnlyMessageMetadataDataclassAdapter r1 = com.facebook.msys.cql.dataclasses.ReadOnlyMessageMetadataDataclassAdapter.INSTANCE
            r0 = 0
            java.lang.String r19 = r1.toNullableRawObject((X.C74554Pwu) r0)
            boolean r0 = r8.A0C
            r8 = 20
            r20 = r24
            r21 = r0
            r13 = r7
            r14 = r6
            r15 = r5
            r16 = r4
            r17 = r3
            r18 = r2
            java.lang.Object r1 = com.facebook.instagramsecuremessage.mca.MailboxInstagramSecureMessageJNI.dispatchCqlOJOOOOOOOOOOZ(r8, r9, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            goto L_0x002b
        L_0x007e:
            r2 = 172800(0x2a300, double:8.53745E-319)
            r1 = 3
            r0 = r24
            java.lang.Object r1 = com.facebook.clientnotifications.mca.MailboxClientNotificationsJNI.dispatchCqlOJO(r1, r2, r0)
            goto L_0x002b
        L_0x0089:
            java.lang.Object r0 = r1.A01
            X.Xxs r0 = (X.C22237Xxs) r0
            java.lang.String r4 = "main-app"
            java.lang.Number r3 = r0.A02
            java.util.List r2 = r0.A03
            r1 = 2
            r0 = r24
            java.lang.Object r0 = com.facebook.clientnotifications.mca.MailboxClientNotificationsJNI.dispatchCqlOOOOO(r1, r4, r3, r2, r0)
            com.facebook.msys.mci.CQLResultSet r0 = (com.facebook.msys.mci.CQLResultSet) r0
            if (r0 == 0) goto L_0x00a4
            X.XMa r1 = new X.XMa
            r1.<init>(r0)
            goto L_0x002b
        L_0x00a4:
            r1 = 0
            goto L_0x002b
        L_0x00a6:
            java.lang.Object r4 = r1.A01
            X.Xy6 r4 = (X.C22250Xy6) r4
            r17 = 4
            int r0 = r4.A04
            r58 = r0
            int r0 = r4.A00
            r57 = r0
            int r0 = r4.A05
            r56 = r0
            int r0 = r4.A06
            r20 = r0
            int r0 = r4.A02
            r19 = r0
            int r0 = r4.A03
            r18 = r0
            long r2 = r4.A07
            long r0 = r4.A08
            java.lang.String r15 = r4.A0M
            java.lang.String r14 = r4.A0L
            java.lang.Number r13 = r4.A0B
            java.lang.String r12 = r4.A0D
            r32 = 0
            java.lang.String r11 = r4.A0N
            java.lang.String r10 = r4.A0O
            java.lang.String r46 = "ig_sticker"
            java.lang.String r9 = r4.A0H
            java.lang.String r8 = r4.A0G
            java.lang.String r49 = ""
            java.lang.String r7 = r4.A0J
            java.lang.String r6 = r4.A0I
            java.lang.String r5 = r4.A0E
            java.lang.String r4 = r4.A0C
            r16 = 39
            r31 = r12
            r33 = r32
            r34 = r32
            r35 = r32
            r36 = r32
            r37 = r32
            r38 = r32
            r39 = r32
            r40 = r11
            r41 = r10
            r42 = r32
            r43 = r32
            r44 = r32
            r45 = r32
            r47 = r9
            r48 = r8
            r50 = r7
            r51 = r6
            r52 = r32
            r53 = r5
            r54 = r4
            r55 = r24
            r21 = r20
            r22 = r19
            r23 = r18
            r24 = r2
            r26 = r0
            r28 = r15
            r29 = r14
            r30 = r13
            r18 = r58
            r19 = r57
            r20 = r56
            java.lang.Object r1 = com.facebook.instagramsecuremessage.mca.MailboxInstagramSecureMessageJNI.dispatchCqlOIIIIIIIJJOOOOOOOOOOOOOOOOOOOOOOOOOOOO(r16, r17, r18, r19, r20, r21, r22, r23, r24, r26, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55)
            java.lang.Object[] r1 = (java.lang.Object[]) r1
            r0 = 0
            r5 = r1[r0]
            java.lang.Number r5 = (java.lang.Number) r5
            r0 = 1
            r6 = r1[r0]
            java.lang.Number r6 = (java.lang.Number) r6
            r0 = 2
            r7 = r1[r0]
            java.lang.Number r7 = (java.lang.Number) r7
            r0 = 3
            r8 = r1[r0]
            java.lang.Number r8 = (java.lang.Number) r8
            r9 = r1[r17]
            java.lang.Number r9 = (java.lang.Number) r9
            X.XnE r4 = new X.XnE
            r4.<init>(r5, r6, r7, r8, r9)
            return r4
        L_0x014e:
            java.lang.Object r5 = r1.A01
            X.Xxw r5 = (X.C22241Xxw) r5
            long r6 = r5.A01
            java.lang.String r8 = r5.A0A
            com.facebook.msys.cql.dataclasses.XmaDataclassAdapter r1 = com.facebook.msys.cql.dataclasses.XmaDataclassAdapter.INSTANCE
            X.Pww r0 = r5.A03
            java.lang.String r9 = r1.toRawObject((X.C74555Pww) r0)
            r10 = 0
            java.lang.String r4 = r5.A07
            java.lang.String r3 = r5.A08
            java.lang.Number r2 = r5.A05
            java.lang.Number r1 = r5.A06
            java.lang.String r0 = r5.A09
            r25 = 0
            r5 = 38
            r15 = r10
            r16 = r10
            r17 = r10
            r18 = r10
            r19 = r10
            r20 = r0
            r21 = r10
            r22 = r10
            r23 = r10
            r11 = r4
            r12 = r3
            r13 = r2
            r14 = r1
            java.lang.Object r3 = com.facebook.instagramsecuremessage.mca.MailboxInstagramSecureMessageJNI.dispatchCqlOJOOOOOOOOOOOOOOOOOZ(r5, r6, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            java.lang.Object[] r3 = (java.lang.Object[]) r3
            r2 = r3[r25]
            java.lang.Number r2 = (java.lang.Number) r2
            r0 = 1
            r1 = r3[r0]
            java.lang.Number r1 = (java.lang.Number) r1
            r0 = 2
            r0 = r3[r0]
            java.lang.Number r0 = (java.lang.Number) r0
            X.Xmx r4 = new X.Xmx
            r4.<init>(r2, r1, r0)
            return r4
        L_0x019c:
            java.lang.Object r0 = r1.A01
            X.Xxy r0 = (X.C22243Xxy) r0
            int r13 = r0.A01
            int r14 = r0.A02
            long r15 = r0.A03
            java.lang.String r11 = r0.A0H
            java.lang.String r10 = r0.A0G
            java.lang.String r9 = r0.A0A
            r20 = 0
            java.lang.String r8 = r0.A0D
            java.lang.String r7 = r0.A0E
            java.lang.String r6 = r0.A08
            java.lang.String r5 = r0.A09
            java.lang.Number r4 = r0.A06
            java.lang.Number r3 = r0.A07
            java.lang.String r2 = r0.A0B
            java.lang.String r1 = r0.A0F
            java.lang.String r0 = r0.A0C
            r12 = 33
            r28 = r1
            r29 = r0
            r30 = r24
            r17 = r11
            r18 = r10
            r19 = r9
            r21 = r8
            r22 = r7
            r23 = r6
            r24 = r5
            r25 = r4
            r26 = r3
            r27 = r2
            java.lang.Object r4 = com.facebook.instagramsecuremessage.mca.MailboxInstagramSecureMessageJNI.dispatchCqlOIIJOOOOOOOOOOOOOO(r12, r13, r14, r15, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            r0 = 0
            r3 = r4[r0]
            java.lang.Number r3 = (java.lang.Number) r3
            r0 = 1
            r2 = r4[r0]
            java.lang.Number r2 = (java.lang.Number) r2
            r0 = 2
            r1 = r4[r0]
            java.lang.Number r1 = (java.lang.Number) r1
            r0 = 3
            r0 = r4[r0]
            java.lang.Number r0 = (java.lang.Number) r0
            X.Xn6 r4 = new X.Xn6
            r4.<init>(r3, r2, r1, r0)
            return r4
        L_0x01fc:
            java.lang.Object r0 = r1.A01
            X.Xy4 r0 = (X.C22248Xy4) r0
            int r1 = r0.A04
            r43 = r1
            int r1 = r0.A00
            r42 = r1
            int r1 = r0.A02
            r19 = r1
            int r1 = r0.A03
            r20 = r1
            long r2 = r0.A05
            java.lang.String r1 = r0.A0M
            r18 = r1
            java.lang.String r1 = r0.A0L
            r17 = r1
            java.lang.String r15 = r0.A0J
            java.lang.String r14 = r0.A0K
            java.lang.String r13 = r0.A0E
            java.lang.String r12 = r0.A0A
            java.lang.String r11 = r0.A0D
            java.lang.String r10 = r0.A0N
            java.lang.String r9 = r0.A0G
            java.lang.String r8 = r0.A0H
            java.lang.String r7 = r0.A0B
            java.lang.String r6 = r0.A0C
            java.lang.Number r5 = r0.A08
            java.lang.Number r4 = r0.A09
            r37 = 0
            java.lang.String r1 = r0.A0I
            java.lang.String r0 = r0.A0F
            r41 = 0
            r16 = 32
            r32 = r8
            r33 = r7
            r34 = r6
            r35 = r5
            r36 = r4
            r38 = r1
            r39 = r0
            r40 = r24
            r21 = r2
            r23 = r18
            r24 = r17
            r25 = r15
            r26 = r14
            r27 = r13
            r28 = r12
            r29 = r11
            r30 = r10
            r31 = r9
            r17 = r43
            r18 = r42
            java.lang.Object r4 = com.facebook.instagramsecuremessage.mca.MailboxInstagramSecureMessageJNI.dispatchCqlOIIIIJOOOOOOOOOOOOOOOOOOZ(r16, r17, r18, r19, r20, r21, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41)
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            r3 = r4[r41]
            java.lang.Number r3 = (java.lang.Number) r3
            r0 = 1
            r2 = r4[r0]
            java.lang.Number r2 = (java.lang.Number) r2
            r0 = 2
            r1 = r4[r0]
            java.lang.Number r1 = (java.lang.Number) r1
            r0 = 3
            r0 = r4[r0]
            java.lang.Number r0 = (java.lang.Number) r0
            X.Xn5 r4 = new X.Xn5
            r4.<init>(r3, r2, r1, r0)
            return r4
        L_0x0283:
            java.lang.Object r0 = r1.A01
            X.Xy5 r0 = (X.C22249Xy5) r0
            int r1 = r0.A06
            r44 = r1
            int r1 = r0.A02
            r43 = r1
            int r1 = r0.A03
            r42 = r1
            int r1 = r0.A00
            r20 = r1
            int r1 = r0.A04
            r19 = r1
            int r1 = r0.A05
            r18 = r1
            long r3 = r0.A07
            java.lang.String r1 = r0.A0N
            r17 = r1
            java.lang.String r15 = r0.A0M
            java.lang.String r14 = r0.A0J
            java.lang.Number r13 = r0.A0A
            java.lang.String r12 = r0.A0K
            java.lang.String r11 = r0.A0E
            java.lang.String r10 = r0.A0D
            java.lang.String r9 = r0.A0C
            java.lang.String r8 = r0.A0B
            java.lang.String r7 = r0.A0H
            java.lang.String r6 = r0.A0I
            r36 = 0
            java.lang.String r5 = r0.A0L
            java.lang.String r2 = r0.A0G
            java.lang.String r1 = r0.A0F
            boolean r0 = r0.A0O
            r16 = 31
            r32 = r9
            r33 = r8
            r34 = r7
            r35 = r6
            r37 = r5
            r38 = r2
            r39 = r1
            r40 = r24
            r41 = r0
            r21 = r19
            r22 = r18
            r23 = r3
            r25 = r17
            r26 = r15
            r27 = r14
            r28 = r13
            r29 = r12
            r30 = r11
            r31 = r10
            r17 = r44
            r18 = r43
            r19 = r42
            java.lang.Object r4 = com.facebook.instagramsecuremessage.mca.MailboxInstagramSecureMessageJNI.dispatchCqlOIIIIIIJOOOOOOOOOOOOOOOOZ(r16, r17, r18, r19, r20, r21, r22, r23, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41)
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            r0 = 0
            r3 = r4[r0]
            java.lang.Number r3 = (java.lang.Number) r3
            r0 = 1
            r2 = r4[r0]
            java.lang.Number r2 = (java.lang.Number) r2
            r0 = 2
            r1 = r4[r0]
            java.lang.Number r1 = (java.lang.Number) r1
            r0 = 3
            r0 = r4[r0]
            java.lang.Number r0 = (java.lang.Number) r0
            X.Xn7 r4 = new X.Xn7
            r4.<init>(r3, r2, r1, r0)
            return r4
        L_0x0311:
            java.lang.Object r0 = r1.A01
            X.Xy2 r0 = (X.C22246Xy2) r0
            int r1 = r0.A04
            r39 = r1
            int r1 = r0.A00
            r18 = r1
            int r1 = r0.A02
            r19 = r1
            int r1 = r0.A03
            r20 = r1
            long r4 = r0.A05
            java.lang.String r1 = r0.A0M
            r17 = r1
            java.lang.String r15 = r0.A0L
            java.lang.String r14 = r0.A0K
            java.lang.Number r13 = r0.A0A
            java.lang.String r12 = r0.A0I
            java.lang.String r11 = r0.A0D
            java.lang.String r10 = r0.A0G
            java.lang.String r9 = r0.A0H
            java.lang.String r8 = r0.A0B
            java.lang.String r7 = r0.A0C
            java.lang.Number r6 = r0.A08
            java.lang.Number r3 = r0.A09
            java.lang.String r2 = r0.A0E
            java.lang.String r1 = r0.A0J
            java.lang.String r0 = r0.A0F
            r16 = 30
            r32 = r7
            r33 = r6
            r34 = r3
            r35 = r2
            r36 = r1
            r37 = r0
            r38 = r24
            r21 = r4
            r23 = r17
            r24 = r15
            r25 = r14
            r26 = r13
            r27 = r12
            r28 = r11
            r29 = r10
            r30 = r9
            r31 = r8
            r17 = r39
            java.lang.Object r4 = com.facebook.instagramsecuremessage.mca.MailboxInstagramSecureMessageJNI.dispatchCqlOIIIIJOOOOOOOOOOOOOOOO(r16, r17, r18, r19, r20, r21, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38)
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            r0 = 0
            r3 = r4[r0]
            java.lang.Number r3 = (java.lang.Number) r3
            r0 = 1
            r2 = r4[r0]
            java.lang.Number r2 = (java.lang.Number) r2
            r0 = 2
            r1 = r4[r0]
            java.lang.Number r1 = (java.lang.Number) r1
            r0 = 3
            r0 = r4[r0]
            java.lang.Number r0 = (java.lang.Number) r0
            X.Xn9 r4 = new X.Xn9
            r4.<init>(r3, r2, r1, r0)
            return r4
        L_0x038d:
            java.lang.Object r0 = r1.A01
            X.Xy0 r0 = (X.C22245Xy0) r0
            int r1 = r0.A04
            r17 = r1
            int r1 = r0.A00
            r18 = r1
            int r1 = r0.A02
            r19 = r1
            int r15 = r0.A03
            long r3 = r0.A05
            java.lang.String r14 = r0.A0K
            java.lang.String r13 = r0.A0J
            java.lang.String r12 = r0.A0I
            java.lang.String r11 = r0.A0D
            java.lang.String r10 = r0.A0C
            r28 = 0
            java.lang.String r9 = r0.A0F
            java.lang.String r8 = r0.A0G
            java.lang.String r7 = r0.A0A
            java.lang.String r6 = r0.A0B
            java.lang.Number r5 = r0.A08
            java.lang.Number r2 = r0.A09
            java.lang.String r1 = r0.A0H
            java.lang.String r0 = r0.A0E
            r16 = 29
            r32 = r6
            r33 = r5
            r34 = r2
            r35 = r28
            r36 = r1
            r37 = r0
            r38 = r24
            r21 = r3
            r23 = r14
            r24 = r13
            r25 = r12
            r26 = r11
            r27 = r10
            r29 = r9
            r30 = r8
            r31 = r7
            r20 = r15
            java.lang.Object r4 = com.facebook.instagramsecuremessage.mca.MailboxInstagramSecureMessageJNI.dispatchCqlOIIIIJOOOOOOOOOOOOOOOO(r16, r17, r18, r19, r20, r21, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38)
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            r0 = 0
            r3 = r4[r0]
            java.lang.Number r3 = (java.lang.Number) r3
            r0 = 1
            r2 = r4[r0]
            java.lang.Number r2 = (java.lang.Number) r2
            r0 = 2
            r1 = r4[r0]
            java.lang.Number r1 = (java.lang.Number) r1
            r0 = 3
            r0 = r4[r0]
            java.lang.Number r0 = (java.lang.Number) r0
            X.Xn4 r4 = new X.Xn4
            r4.<init>(r3, r2, r1, r0)
            return r4
        L_0x0401:
            java.lang.Object r0 = r1.A01
            X.Xy1 r0 = (X.Xy1) r0
            int r1 = r0.A04
            r17 = r1
            int r1 = r0.A00
            r18 = r1
            int r1 = r0.A02
            r19 = r1
            int r1 = r0.A03
            r20 = r1
            long r3 = r0.A05
            java.lang.String r15 = r0.A0L
            java.lang.String r14 = r0.A0K
            java.lang.String r13 = r0.A0J
            java.lang.String r12 = r0.A0E
            java.lang.String r11 = r0.A0C
            r28 = 0
            java.lang.String r10 = r0.A0G
            java.lang.String r9 = r0.A0H
            java.lang.String r8 = r0.A0A
            java.lang.String r7 = r0.A0B
            java.lang.Number r6 = r0.A08
            java.lang.Number r5 = r0.A09
            java.lang.String r2 = r0.A0D
            java.lang.String r1 = r0.A0I
            java.lang.String r0 = r0.A0F
            r16 = 28
            r32 = r7
            r33 = r6
            r34 = r5
            r35 = r2
            r36 = r1
            r37 = r0
            r38 = r24
            r21 = r3
            r23 = r15
            r24 = r14
            r25 = r13
            r26 = r12
            r27 = r11
            r29 = r10
            r30 = r9
            r31 = r8
            java.lang.Object r4 = com.facebook.instagramsecuremessage.mca.MailboxInstagramSecureMessageJNI.dispatchCqlOIIIIJOOOOOOOOOOOOOOOO(r16, r17, r18, r19, r20, r21, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38)
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            r0 = 0
            r3 = r4[r0]
            java.lang.Number r3 = (java.lang.Number) r3
            r0 = 1
            r2 = r4[r0]
            java.lang.Number r2 = (java.lang.Number) r2
            r0 = 2
            r1 = r4[r0]
            java.lang.Number r1 = (java.lang.Number) r1
            r0 = 3
            r0 = r4[r0]
            java.lang.Number r0 = (java.lang.Number) r0
            X.Xn3 r4 = new X.Xn3
            r4.<init>(r3, r2, r1, r0)
            return r4
        L_0x0477:
            java.lang.Object r0 = r1.A01
            X.Xxz r0 = (X.C22244Xxz) r0
            int r1 = r0.A04
            r36 = r1
            int r1 = r0.A00
            r17 = r1
            int r15 = r0.A02
            int r14 = r0.A03
            long r5 = r0.A05
            long r3 = r0.A06
            java.lang.String r13 = r0.A0I
            java.lang.String r12 = r0.A0H
            java.lang.String r11 = r0.A0G
            java.lang.Number r10 = r0.A09
            java.lang.String r9 = r0.A0E
            java.lang.String r8 = r0.A0C
            java.lang.String r7 = r0.A0D
            java.lang.String r2 = r0.A0A
            java.lang.String r1 = r0.A0F
            java.lang.String r0 = r0.A0B
            r16 = 27
            r29 = r9
            r30 = r8
            r31 = r7
            r32 = r2
            r33 = r1
            r34 = r0
            r35 = r24
            r21 = r5
            r23 = r3
            r25 = r13
            r26 = r12
            r27 = r11
            r28 = r10
            r18 = r17
            r19 = r15
            r20 = r14
            r17 = r36
            java.lang.Object r4 = com.facebook.instagramsecuremessage.mca.MailboxInstagramSecureMessageJNI.dispatchCqlOIIIIJJOOOOOOOOOOO(r16, r17, r18, r19, r20, r21, r23, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            r0 = 0
            r3 = r4[r0]
            java.lang.Number r3 = (java.lang.Number) r3
            r0 = 1
            r2 = r4[r0]
            java.lang.Number r2 = (java.lang.Number) r2
            r0 = 2
            r1 = r4[r0]
            java.lang.Number r1 = (java.lang.Number) r1
            r0 = 3
            r0 = r4[r0]
            java.lang.Number r0 = (java.lang.Number) r0
            X.Xn8 r4 = new X.Xn8
            r4.<init>(r3, r2, r1, r0)
            return r4
        L_0x04e3:
            java.lang.Object r0 = r1.A01
            X.Xy3 r0 = (X.C22247Xy3) r0
            long r3 = r0.A01
            r13 = 0
            java.util.List r1 = r0.A0A
            r42 = r1
            java.util.List r1 = r0.A0G
            r21 = r1
            java.util.List r1 = r0.A0F
            r22 = r1
            java.util.List r1 = r0.A0M
            r20 = r1
            java.util.List r1 = r0.A0K
            r19 = r1
            java.util.List r1 = r0.A0J
            r18 = r1
            java.util.List r1 = r0.A0L
            r17 = r1
            java.util.List r15 = r0.A0C
            java.util.List r14 = r0.A0D
            java.util.List r12 = r0.A0H
            java.util.List r11 = r0.A0E
            java.util.List r10 = r0.A0I
            java.util.List r9 = r0.A0B
            com.facebook.msys.cql.dataclasses.ReadOnlyMessageMetadataDataclassAdapter r1 = com.facebook.msys.cql.dataclasses.ReadOnlyMessageMetadataDataclassAdapter.INSTANCE
            java.lang.String r33 = r1.toNullableRawObject((X.C74554Pwu) r13)
            java.lang.String r8 = r0.A07
            java.lang.Number r7 = r0.A06
            java.lang.Number r6 = r0.A05
            java.lang.Number r5 = r0.A04
            java.lang.String r2 = r0.A09
            java.lang.String r1 = r0.A08
            boolean r0 = r0.A0N
            r16 = 23
            r30 = r11
            r31 = r10
            r32 = r9
            r34 = r8
            r35 = r7
            r36 = r6
            r37 = r5
            r38 = r2
            r39 = r1
            r40 = r24
            r41 = r0
            r23 = r20
            r24 = r19
            r25 = r18
            r26 = r17
            r27 = r15
            r28 = r14
            r29 = r12
            r17 = r3
            r19 = r13
            r20 = r42
            java.lang.Object r2 = com.facebook.instagramsecuremessage.mca.MailboxInstagramSecureMessageJNI.dispatchCqlOJOOOOOOOOOOOOOOOOOOOOOOZ(r16, r17, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41)
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            r0 = 0
            r1 = r2[r0]
            java.util.List r1 = (java.util.List) r1
            r0 = 1
            r0 = r2[r0]
            java.lang.Number r0 = (java.lang.Number) r0
            X.OT4 r4 = new X.OT4
            r4.<init>(r0, r1)
            return r4
        L_0x0568:
            java.lang.Object r0 = r1.A01
            X.Xxu r0 = (X.C22239Xxu) r0
            int r3 = r0.A00
            long r4 = r0.A02
            long r6 = r0.A01
            java.lang.String r8 = r0.A05
            boolean r1 = r0.A07
            boolean r0 = r0.A06
            r2 = 8
            r9 = r24
            r10 = r1
            r11 = r0
            java.lang.Object r4 = com.facebook.advancedcryptotransport.mca.MailboxAdvancedCryptoTransportJNI.dispatchCqlOIJJOOZZ(r2, r3, r4, r6, r8, r9, r10, r11)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22251Xy7.run(com.facebook.msys.mca.Mailbox, com.facebook.msys.mci.sqliteholder.SqliteHolder):java.lang.Object");
    }
}
