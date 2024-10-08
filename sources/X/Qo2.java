package X;

public final class Qo2 extends AnonymousClass4TN {
    public S4k A00;
    public final C284825Ob A01 = new Object();
    public final AnonymousClass4XV A02 = new AnonymousClass4XV();

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: com.google.android.exoplayer2.metadata.scte35.TimeSignalCommand} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v9, resolved type: com.google.android.exoplayer2.metadata.scte35.TimeSignalCommand} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v10, resolved type: com.google.android.exoplayer2.metadata.scte35.PrivateCommand} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v11, resolved type: com.google.android.exoplayer2.metadata.scte35.SpliceScheduleCommand} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v12, resolved type: com.google.android.exoplayer2.metadata.scte35.SpliceInsertCommand} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v9, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v13, resolved type: com.google.android.exoplayer2.metadata.scte35.TimeSignalCommand} */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0014, code lost:
        if (r5 != r1) goto L_0x0016;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.exoplayer2.metadata.Metadata A06(X.AnonymousClass4QS r29, java.nio.ByteBuffer r30) {
        /*
            r28 = this;
            r4 = r28
            X.S4k r3 = r4.A00
            r7 = r29
            if (r3 == 0) goto L_0x0016
            long r5 = r7.A00
            monitor-enter(r3)
            long r1 = r3.A02     // Catch:{ all -> 0x000e }
            goto L_0x0011
        L_0x000e:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x0011:
            monitor-exit(r3)
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0027
        L_0x0016:
            long r0 = r7.A01
            X.S4k r5 = new X.S4k
            r5.<init>(r0)
            r4.A00 = r5
            long r2 = r7.A01
            long r0 = r7.A00
            long r2 = r2 - r0
            r5.A00(r2)
        L_0x0027:
            byte[] r1 = r30.array()
            int r0 = r30.limit()
            X.4XV r5 = r4.A02
            r5.A0I(r1, r0)
            X.5Ob r6 = r4.A01
            r6.A03 = r1
            r2 = 0
            r6.A02 = r2
            r6.A00 = r2
            r6.A01 = r0
            r0 = 39
            r6.A03(r0)
            r0 = 1
            int r0 = r6.A01(r0)
            long r13 = (long) r0
            r0 = 32
            long r13 = r13 << r0
            int r0 = r6.A01(r0)
            long r0 = (long) r0
            long r13 = r13 | r0
            r0 = 20
            r6.A03(r0)
            r0 = 12
            int r3 = r6.A01(r0)
            r0 = 8
            int r1 = r6.A01(r0)
            r0 = 14
            r5.A0H(r0)
            if (r1 == 0) goto L_0x015e
            r0 = 255(0xff, float:3.57E-43)
            if (r1 == r0) goto L_0x014d
            r0 = 4
            if (r1 == r0) goto L_0x0091
            r0 = 5
            if (r1 == r0) goto L_0x0164
            r0 = 6
            if (r1 == r0) goto L_0x0080
            com.google.android.exoplayer2.metadata.Metadata$Entry[] r1 = new com.google.android.exoplayer2.metadata.Metadata.Entry[r2]
        L_0x007a:
            com.google.android.exoplayer2.metadata.Metadata r0 = new com.google.android.exoplayer2.metadata.Metadata
            r0.<init>((com.google.android.exoplayer2.metadata.Metadata.Entry[]) r1)
            return r0
        L_0x0080:
            X.S4k r0 = r4.A00
            long r2 = com.google.android.exoplayer2.metadata.scte35.TimeSignalCommand.A00(r5, r13)
            long r0 = r0.A01(r2)
            com.google.android.exoplayer2.metadata.scte35.TimeSignalCommand r10 = new com.google.android.exoplayer2.metadata.scte35.TimeSignalCommand
            r10.<init>(r2, r0)
            goto L_0x01da
        L_0x0091:
            int r9 = r5.A02()
            java.util.ArrayList r8 = X.DbS.A0v(r9)
        L_0x0099:
            if (r2 >= r9) goto L_0x0146
            long r16 = r5.A07()
            int r0 = r5.A02()
            r0 = r0 & 128(0x80, float:1.794E-43)
            boolean r22 = X.AnonymousClass7TF.A1P(r0)
            java.util.ArrayList r12 = X.AnonymousClass7TE.A1C()
            if (r22 != 0) goto L_0x0132
            int r1 = r5.A02()
            r0 = r1 & 128(0x80, float:1.794E-43)
            boolean r23 = X.AnonymousClass7TF.A1P(r0)
            r0 = r1 & 64
            boolean r24 = X.AnonymousClass7TF.A1P(r0)
            r0 = r1 & 32
            boolean r10 = X.AnonymousClass7TF.A1P(r0)
            if (r24 == 0) goto L_0x010f
            long r18 = r5.A07()
        L_0x00cb:
            if (r10 == 0) goto L_0x0107
            int r0 = r5.A02()
            long r0 = (long) r0
            r10 = 128(0x80, double:6.32E-322)
            long r10 = r10 & r0
            r6 = 0
            int r3 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            boolean r25 = X.AnonymousClass7TF.A1P(r3)
            r3 = 1
            long r0 = r0 & r3
            r3 = 32
            long r0 = r0 << r3
            long r3 = r5.A07()
            long r0 = r0 | r3
            r3 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r3
            r3 = 90
            long r0 = r0 / r3
        L_0x00ee:
            int r13 = r5.A05()
            int r14 = r5.A02()
            int r15 = r5.A02()
        L_0x00fa:
            X.SFr r11 = new X.SFr
            r20 = r0
            r11.<init>(r12, r13, r14, r15, r16, r18, r20, r22, r23, r24, r25)
            r8.add(r11)
            int r2 = r2 + 1
            goto L_0x0099
        L_0x0107:
            r25 = 0
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x00ee
        L_0x010f:
            r18 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r7 = r5.A02()
            java.util.ArrayList r12 = X.DbS.A0v(r7)
            r6 = 0
        L_0x011d:
            if (r6 >= r7) goto L_0x00cb
            int r4 = r5.A02()
            long r0 = r5.A07()
            X.Rsa r3 = new X.Rsa
            r3.<init>(r4, r0)
            r12.add(r3)
            int r6 = r6 + 1
            goto L_0x011d
        L_0x0132:
            r23 = 0
            r18 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r25 = 0
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r13 = 0
            r14 = 0
            r15 = 0
            r24 = 0
            goto L_0x00fa
        L_0x0146:
            com.google.android.exoplayer2.metadata.scte35.SpliceScheduleCommand r10 = new com.google.android.exoplayer2.metadata.scte35.SpliceScheduleCommand
            r10.<init>((java.util.List) r8)
            goto L_0x01da
        L_0x014d:
            long r11 = r5.A07()
            int r0 = r3 + -4
            byte[] r15 = new byte[r0]
            r5.A0J(r15, r2, r0)
            com.google.android.exoplayer2.metadata.scte35.PrivateCommand r10 = new com.google.android.exoplayer2.metadata.scte35.PrivateCommand
            r10.<init>(r11, r13, r15)
            goto L_0x01da
        L_0x015e:
            com.google.android.exoplayer2.metadata.scte35.SpliceNullCommand r10 = new com.google.android.exoplayer2.metadata.scte35.SpliceNullCommand
            r10.<init>()
            goto L_0x01da
        L_0x0164:
            X.S4k r6 = r4.A00
            long r15 = r5.A07()
            int r0 = r5.A02()
            r0 = r0 & 128(0x80, float:1.794E-43)
            boolean r23 = X.AnonymousClass7TF.A1P(r0)
            java.util.List r11 = java.util.Collections.emptyList()
            if (r23 != 0) goto L_0x021c
            int r1 = r5.A02()
            r0 = r1 & 128(0x80, float:1.794E-43)
            boolean r24 = X.AnonymousClass7TF.A1P(r0)
            r0 = r1 & 64
            boolean r25 = X.AnonymousClass7TF.A1P(r0)
            r0 = r1 & 32
            boolean r9 = X.AnonymousClass7TF.A1P(r0)
            r0 = r1 & 16
            boolean r26 = X.AnonymousClass7TF.A1P(r0)
            if (r25 == 0) goto L_0x01e8
            if (r26 != 0) goto L_0x01e8
            long r3 = com.google.android.exoplayer2.metadata.scte35.TimeSignalCommand.A00(r5, r13)
        L_0x019e:
            if (r9 == 0) goto L_0x01e0
            int r0 = r5.A02()
            long r0 = (long) r0
            r9 = 128(0x80, double:6.32E-322)
            long r9 = r9 & r0
            r7 = 0
            int r2 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            boolean r27 = X.AnonymousClass7TF.A1P(r2)
            r7 = 1
            long r0 = r0 & r7
            r2 = 32
            long r0 = r0 << r2
            long r7 = r5.A07()
            long r0 = r0 | r7
            r7 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r7
            r7 = 90
            long r0 = r0 / r7
        L_0x01c1:
            int r12 = r5.A05()
            int r13 = r5.A02()
            int r14 = r5.A02()
        L_0x01cd:
            long r19 = r6.A01(r3)
            com.google.android.exoplayer2.metadata.scte35.SpliceInsertCommand r10 = new com.google.android.exoplayer2.metadata.scte35.SpliceInsertCommand
            r17 = r3
            r21 = r0
            r10.<init>(r11, r12, r13, r14, r15, r17, r19, r21, r23, r24, r25, r26, r27)
        L_0x01da:
            com.google.android.exoplayer2.metadata.Metadata$Entry[] r1 = new com.google.android.exoplayer2.metadata.Metadata.Entry[]{r10}
            goto L_0x007a
        L_0x01e0:
            r27 = 0
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x01c1
        L_0x01e8:
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r25 != 0) goto L_0x019e
            int r8 = r5.A02()
            java.util.ArrayList r11 = X.DbS.A0v(r8)
        L_0x01f7:
            if (r2 >= r8) goto L_0x019e
            int r22 = r5.A02()
            if (r26 != 0) goto L_0x0216
            long r0 = com.google.android.exoplayer2.metadata.scte35.TimeSignalCommand.A00(r5, r13)
        L_0x0203:
            long r20 = r6.A01(r0)
            X.Rup r7 = new X.Rup
            r18 = r0
            r17 = r7
            r17.<init>(r18, r20, r22)
            r11.add(r7)
            int r2 = r2 + 1
            goto L_0x01f7
        L_0x0216:
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x0203
        L_0x021c:
            r24 = 0
            r26 = 0
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r27 = 0
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r12 = 0
            r13 = 0
            r14 = 0
            r25 = 0
            goto L_0x01cd
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Qo2.A06(X.4QS, java.nio.ByteBuffer):com.google.android.exoplayer2.metadata.Metadata");
    }
}
