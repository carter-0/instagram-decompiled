package X;

import com.google.android.exoplayer2.util.Util;

/* renamed from: X.4TC  reason: invalid class name */
public final class AnonymousClass4TC {
    public long A00;
    public AnonymousClass4TC A01;
    public AnonymousClass4TB A02;
    public C264844Rn A03 = C264844Rn.A03;
    public C264734Rb A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public final AnonymousClass4TH A08;
    public final Object A09;
    public final AnonymousClass4PN[] A0A;
    public final AnonymousClass4TD[] A0B;
    public final AnonymousClass4TF A0C;
    public final C264634Qq A0D;
    public final boolean[] A0E;

    public final long A01(C264734Rb r15, boolean[] zArr, long j, boolean z) {
        int length;
        C264734Rb r5;
        int i = 0;
        while (true) {
            boolean z2 = true;
            if (i >= r15.A00) {
                break;
            }
            boolean[] zArr2 = this.A0E;
            if (z || (r5 = this.A04) == null || !Util.A0I(r15.A03[i], r5.A03[i]) || !Util.A0I(r15.A04[i], r5.A04[i])) {
                z2 = false;
            }
            zArr2[i] = z2;
            i++;
        }
        AnonymousClass4TD[] r8 = this.A0B;
        int i2 = 0;
        while (true) {
            length = this.A0A.length;
            if (i2 >= length) {
                break;
            }
            i2++;
        }
        this.A04 = r15;
        AnonymousClass4TH r7 = this.A08;
        AnonymousClass4RX[] r9 = r15.A04;
        long ELF = r7.ELF(r8, r9, this.A0E, zArr, j);
        for (int i3 = 0; i3 < length; i3++) {
        }
        this.A06 = false;
        for (int i4 = 0; i4 < r8.length; i4++) {
            if (r8[i4] != null) {
                boolean z3 = false;
                if (r15.A03[i4] != null) {
                    z3 = true;
                }
                C256703wD.A04(z3);
                this.A06 = true;
            } else {
                boolean z4 = false;
                if (r9[i4] == null) {
                    z4 = true;
                }
                C256703wD.A04(z4);
            }
        }
        return ELF;
    }

    public final void A05(float f) {
        this.A07 = true;
        this.A03 = this.A08.C99();
        long A012 = A01(A02(f), new boolean[this.A0A.length], this.A02.A03, false);
        long j = this.A00;
        AnonymousClass4TB r2 = this.A02;
        this.A00 = j + (r2.A03 - A012);
        this.A02 = r2.A01(A012);
    }

    public final long A00() {
        if (!this.A07) {
            return this.A02.A03;
        }
        if (this.A06) {
            long AiU = this.A08.AiU();
            if (AiU != Long.MIN_VALUE) {
                return AiU;
            }
        }
        return this.A02.A00;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: int[][][]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v0, resolved type: X.4Tc[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v3, resolved type: X.4RX[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v17, resolved type: X.5pH} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v2, resolved type: int[][]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v35, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v107, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v118, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v39, resolved type: X.4Tc} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v126, resolved type: X.4XI} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v6, resolved type: int[][]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v6, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v169, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v191, resolved type: int[][]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v14, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v221, resolved type: int[][]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v27, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v59, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v269, resolved type: int[][]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v286, resolved type: X.4XH} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v15, resolved type: X.4XH} */
    /* JADX WARNING: type inference failed for: r0v123 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C264734Rb A02(float r36) {
        /*
            r35 = this;
            r0 = r35
            X.4Qq r12 = r0.A0D
            X.4PN[] r13 = r0.A0A
            X.4Rn r10 = r0.A03
            X.4Qp r12 = (X.C264624Qp) r12
            int r9 = r13.length
            int r3 = r9 + 1
            int[] r8 = new int[r3]
            X.4Ro[][] r7 = new X.C264854Ro[r3][]
            int[][][] r11 = new int[r3][][]
            r6 = 0
            r2 = 0
        L_0x0015:
            if (r2 >= r3) goto L_0x0024
            int r1 = r10.A01
            X.4Ro[] r0 = new X.C264854Ro[r1]
            r7[r2] = r0
            int[][] r0 = new int[r1][]
            r11[r2] = r0
            int r2 = r2 + 1
            goto L_0x0015
        L_0x0024:
            int[] r0 = new int[r9]
            r19 = r0
            r2 = 0
        L_0x0029:
            if (r2 >= r9) goto L_0x003e
            r1 = r13[r2]
            boolean r0 = r1 instanceof X.AnonymousClass4PJ
            if (r0 != 0) goto L_0x003b
            boolean r0 = r1 instanceof X.AnonymousClass4TZ
            if (r0 != 0) goto L_0x003b
            r0 = 0
        L_0x0036:
            r19[r2] = r0
            int r2 = r2 + 1
            goto L_0x0029
        L_0x003b:
            r0 = 8
            goto L_0x0036
        L_0x003e:
            r5 = 0
        L_0x003f:
            int r0 = r10.A01
            if (r5 >= r0) goto L_0x00bc
            com.google.common.collect.ImmutableList r0 = r10.A02
            java.lang.Object r4 = r0.get(r5)
            X.4Ro r4 = (X.C264854Ro) r4
            int r1 = r4.A02
            r0 = 5
            r18 = 0
            if (r1 != r0) goto L_0x0054
            r18 = 1
        L_0x0054:
            r3 = r9
            r2 = 0
            r17 = 0
            r16 = 1
        L_0x005a:
            if (r2 >= r9) goto L_0x008f
            r14 = r13[r2]
            r15 = 0
            r1 = 0
        L_0x0060:
            int r0 = r4.A01
            if (r15 >= r0) goto L_0x0075
            X.3wB[] r0 = r4.A04
            r0 = r0[r15]
            int r0 = r14.Ez5(r0)
            r0 = r0 & 7
            int r1 = java.lang.Math.max(r1, r0)
            int r15 = r15 + 1
            goto L_0x0060
        L_0x0075:
            r0 = r8[r2]
            r14 = 0
            if (r0 != 0) goto L_0x007b
            r14 = 1
        L_0x007b:
            r0 = r17
            if (r1 > r0) goto L_0x0087
            if (r1 != r0) goto L_0x008c
            if (r18 == 0) goto L_0x008c
            if (r16 != 0) goto L_0x008c
            if (r14 == 0) goto L_0x008c
        L_0x0087:
            r3 = r2
            r16 = r14
            r17 = r1
        L_0x008c:
            int r2 = r2 + 1
            goto L_0x005a
        L_0x008f:
            if (r3 != r9) goto L_0x00a6
            int r0 = r4.A01
            int[] r2 = new int[r0]
        L_0x0095:
            r1 = r8[r3]
            r0 = r7[r3]
            r0[r1] = r4
            r0 = r11[r3]
            r0[r1] = r2
            int r0 = r1 + 1
            r8[r3] = r0
            int r5 = r5 + 1
            goto L_0x003f
        L_0x00a6:
            r15 = r13[r3]
            int r14 = r4.A01
            int[] r2 = new int[r14]
            r1 = 0
        L_0x00ad:
            if (r1 >= r14) goto L_0x0095
            X.3wB[] r0 = r4.A04
            r0 = r0[r1]
            int r0 = r15.Ez5(r0)
            r2[r1] = r0
            int r1 = r1 + 1
            goto L_0x00ad
        L_0x00bc:
            X.4Rn[] r5 = new X.C264844Rn[r9]
            java.lang.String[] r4 = new java.lang.String[r9]
            int[] r3 = new int[r9]
        L_0x00c2:
            if (r6 >= r9) goto L_0x0100
            r10 = r8[r6]
            r2 = r7[r6]
            int r1 = r2.length
            r0 = 0
            if (r10 > r1) goto L_0x00cd
            r0 = 1
        L_0x00cd:
            X.C256703wD.A03(r0)
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r2, r10)
            X.4Ro[] r1 = (X.C264854Ro[]) r1
            X.4Rn r0 = new X.4Rn
            r0.<init>(r1)
            r5[r6] = r0
            r2 = r11[r6]
            int r1 = r2.length
            r0 = 0
            if (r10 > r1) goto L_0x00e4
            r0 = 1
        L_0x00e4:
            X.C256703wD.A03(r0)
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r2, r10)
            r11[r6] = r0
            r0 = r13[r6]
            java.lang.String r0 = r0.getName()
            r4[r6] = r0
            r0 = r13[r6]
            X.4PK r0 = (X.AnonymousClass4PK) r0
            int r0 = r0.A0B
            r3[r6] = r0
            int r6 = r6 + 1
            goto L_0x00c2
        L_0x0100:
            r6 = r8[r9]
            r2 = r7[r9]
            int r1 = r2.length
            r0 = 0
            if (r6 > r1) goto L_0x0109
            r0 = 1
        L_0x0109:
            X.C256703wD.A03(r0)
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r2, r6)
            X.4Ro[] r1 = (X.C264854Ro[]) r1
            X.4Rn r0 = new X.4Rn
            r0.<init>(r1)
            X.4Tb r10 = new X.4Tb
            r16 = r10
            r17 = r0
            r18 = r3
            r20 = r5
            r21 = r4
            r22 = r11
            r16.<init>(r17, r18, r19, r20, r21, r22)
            X.4Qo r12 = (X.C264614Qo) r12
            java.lang.Object r1 = r12.A03
            monitor-enter(r1)
            X.4Qb r9 = r12.A01     // Catch:{ all -> 0x0760 }
            monitor-exit(r1)     // Catch:{ all -> 0x0760 }
            int r8 = r10.A00
            X.4Tc[] r0 = new X.C265244Tc[r8]
            r26 = r0
            r0 = r19
            android.util.Pair r2 = r12.A03(r9, r10, r0, r11)
            if (r2 == 0) goto L_0x014a
            java.lang.Object r0 = r2.second
            java.lang.Number r0 = (java.lang.Number) r0
            int r1 = r0.intValue()
            java.lang.Object r0 = r2.first
            r26[r1] = r0
        L_0x014a:
            r34 = 0
            r2 = 0
        L_0x014d:
            if (r2 >= r8) goto L_0x0160
            r1 = 2
            int[] r0 = r10.A03
            r0 = r0[r2]
            if (r1 != r0) goto L_0x024a
            X.4Rn[] r0 = r10.A04
            r0 = r0[r2]
            int r0 = r0.A01
            if (r0 <= 0) goto L_0x024a
            r34 = 1
        L_0x0160:
            r7 = 1
            X.4Te r22 = new X.4Te
            r22.<init>()
            java.util.ArrayList r21 = new java.util.ArrayList
            r21.<init>()
            r13 = 0
        L_0x016c:
            if (r13 >= r8) goto L_0x024e
            int[] r0 = r10.A03
            r0 = r0[r13]
            if (r7 != r0) goto L_0x0246
            X.4Rn[] r0 = r10.A04
            r20 = r0[r13]
            r6 = 0
        L_0x0179:
            r0 = r20
            int r0 = r0.A01
            if (r6 >= r0) goto L_0x0246
            r0 = r20
            com.google.common.collect.ImmutableList r0 = r0.A02
            java.lang.Object r5 = r0.get(r6)
            X.4Ro r5 = (X.C264854Ro) r5
            r0 = r11[r13]
            r4 = r0[r6]
            X.4Tf r3 = new X.4Tf
            r3.<init>(r12)
            com.google.common.collect.ImmutableList$Builder r2 = com.google.common.collect.ImmutableList.builder()
            r1 = 0
        L_0x0197:
            int r0 = r5.A01
            if (r1 >= r0) goto L_0x01b4
            r33 = r4[r1]
            X.4Tg r0 = new X.4Tg
            r27 = r0
            r28 = r5
            r29 = r9
            r30 = r3
            r31 = r13
            r32 = r1
            r27.<init>(r28, r29, r30, r31, r32, r33, r34)
            r2.add(r0)
            int r1 = r1 + 1
            goto L_0x0197
        L_0x01b4:
            com.google.common.collect.ImmutableList r19 = r2.build()
            int r0 = r5.A01
            boolean[] r0 = new boolean[r0]
            r18 = r0
            java.util.ArrayList r17 = new java.util.ArrayList
            r17.<init>()
            java.util.ArrayList r16 = new java.util.ArrayList
            r16.<init>()
            r14 = 0
        L_0x01c9:
            int r0 = r5.A01
            if (r14 >= r0) goto L_0x021d
            r0 = r19
            java.lang.Object r4 = r0.get(r14)
            X.4Th r4 = (X.C265294Th) r4
            int r1 = r4.A00()
            boolean r0 = r18[r14]
            if (r0 != 0) goto L_0x01ef
            if (r1 == 0) goto L_0x01ef
            if (r1 != r7) goto L_0x01f2
            com.google.common.collect.ImmutableList r15 = com.google.common.collect.ImmutableList.of(r4)
            r0 = r17
            r0.add(r4)
        L_0x01ea:
            r0 = r16
            r0.add(r15)
        L_0x01ef:
            int r14 = r14 + 1
            goto L_0x01c9
        L_0x01f2:
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            r15.add(r4)
            int r3 = r14 + 1
        L_0x01fc:
            int r0 = r5.A01
            if (r3 >= r0) goto L_0x01ea
            r0 = r19
            java.lang.Object r2 = r0.get(r3)
            X.4Th r2 = (X.C265294Th) r2
            int r1 = r2.A00()
            r0 = 2
            if (r1 != r0) goto L_0x021a
            boolean r0 = r4.A01(r2)
            if (r0 == 0) goto L_0x021a
            r15.add(r2)
            r18[r3] = r7
        L_0x021a:
            int r3 = r3 + 1
            goto L_0x01fc
        L_0x021d:
            X.4Qb r0 = r12.A01
            boolean r0 = r0.A0C
            if (r0 == 0) goto L_0x023b
            boolean r0 = r17.isEmpty()
            if (r0 != 0) goto L_0x023b
            int r1 = r17.size()
            int r0 = r5.A01
            if (r1 != r0) goto L_0x023b
            r16.clear()
            r1 = r16
            r0 = r17
            r1.add(r0)
        L_0x023b:
            r1 = r21
            r0 = r16
            r1.addAll(r0)
            int r6 = r6 + 1
            goto L_0x0179
        L_0x0246:
            int r13 = r13 + 1
            goto L_0x016c
        L_0x024a:
            int r2 = r2 + 1
            goto L_0x014d
        L_0x024e:
            boolean r0 = r21.isEmpty()
            if (r0 == 0) goto L_0x0366
            r2 = 0
        L_0x0255:
            r4 = 0
            if (r2 != 0) goto L_0x0354
            r1 = 0
        L_0x0259:
            X.4Ti r25 = new X.4Ti
            r0 = r25
            r0.<init>(r9, r1)
            X.4Tj r24 = new X.4Tj
            r24.<init>()
            r23 = 3
            java.util.ArrayList r22 = new java.util.ArrayList
            r22.<init>()
            r3 = 0
        L_0x026d:
            if (r3 >= r8) goto L_0x03b2
            int[] r0 = r10.A03
            r1 = r0[r3]
            r0 = r23
            if (r0 != r1) goto L_0x0350
            X.4Rn[] r0 = r10.A04
            r21 = r0[r3]
            r2 = 0
        L_0x027c:
            r0 = r21
            int r0 = r0.A01
            if (r2 >= r0) goto L_0x0350
            r0 = r21
            com.google.common.collect.ImmutableList r0 = r0.A02
            java.lang.Object r1 = r0.get(r2)
            X.4Ro r1 = (X.C264854Ro) r1
            r0 = r11[r3]
            r15 = r0[r2]
            r0 = r25
            X.4Qb r13 = r0.A00
            java.lang.String r14 = r0.A01
            com.google.common.collect.ImmutableList$Builder r6 = com.google.common.collect.ImmutableList.builder()
            r5 = 0
        L_0x029b:
            int r0 = r1.A01
            if (r5 >= r0) goto L_0x02b8
            r33 = r15[r5]
            X.5pG r0 = new X.5pG
            r28 = r1
            r29 = r13
            r30 = r14
            r31 = r3
            r32 = r5
            r27 = r0
            r27.<init>(r28, r29, r30, r31, r32, r33)
            r6.add(r0)
            int r5 = r5 + 1
            goto L_0x029b
        L_0x02b8:
            com.google.common.collect.ImmutableList r20 = r6.build()
            int r0 = r1.A01
            boolean[] r0 = new boolean[r0]
            r19 = r0
            java.util.ArrayList r18 = new java.util.ArrayList
            r18.<init>()
            java.util.ArrayList r17 = new java.util.ArrayList
            r17.<init>()
            r5 = 0
        L_0x02cd:
            int r0 = r1.A01
            if (r5 >= r0) goto L_0x0327
            r0 = r20
            java.lang.Object r6 = r0.get(r5)
            X.4Th r6 = (X.C265294Th) r6
            int r13 = r6.A00()
            boolean r0 = r19[r5]
            if (r0 != 0) goto L_0x02f5
            if (r13 == 0) goto L_0x02f5
            if (r13 != r7) goto L_0x02f8
            com.google.common.collect.ImmutableList r16 = com.google.common.collect.ImmutableList.of(r6)
            r0 = r18
            r0.add(r6)
        L_0x02ee:
            r6 = r17
            r0 = r16
            r6.add(r0)
        L_0x02f5:
            int r5 = r5 + 1
            goto L_0x02cd
        L_0x02f8:
            java.util.ArrayList r16 = new java.util.ArrayList
            r16.<init>()
            r0 = r16
            r0.add(r6)
            int r13 = r5 + 1
        L_0x0304:
            int r0 = r1.A01
            if (r13 >= r0) goto L_0x02ee
            r0 = r20
            java.lang.Object r14 = r0.get(r13)
            X.4Th r14 = (X.C265294Th) r14
            int r15 = r14.A00()
            r0 = 2
            if (r15 != r0) goto L_0x0324
            boolean r0 = r6.A01(r14)
            if (r0 == 0) goto L_0x0324
            r0 = r16
            r0.add(r14)
            r19[r13] = r7
        L_0x0324:
            int r13 = r13 + 1
            goto L_0x0304
        L_0x0327:
            X.4Qb r0 = r12.A01
            boolean r0 = r0.A0C
            if (r0 == 0) goto L_0x0345
            boolean r0 = r18.isEmpty()
            if (r0 != 0) goto L_0x0345
            int r5 = r18.size()
            int r0 = r1.A01
            if (r5 != r0) goto L_0x0345
            r17.clear()
            r1 = r17
            r0 = r18
            r1.add(r0)
        L_0x0345:
            r1 = r22
            r0 = r17
            r1.addAll(r0)
            int r2 = r2 + 1
            goto L_0x027c
        L_0x0350:
            int r3 = r3 + 1
            goto L_0x026d
        L_0x0354:
            java.lang.Object r0 = r2.first
            X.4Tc r0 = (X.C265244Tc) r0
            X.4Ro r2 = r0.A00
            int[] r0 = r0.A01
            r1 = r0[r4]
            X.3wB[] r0 = r2.A04
            r0 = r0[r1]
            java.lang.String r1 = r0.A0V
            goto L_0x0259
        L_0x0366:
            r1 = r21
            r0 = r22
            java.lang.Object r2 = java.util.Collections.max(r1, r0)
            java.util.List r2 = (java.util.List) r2
            int r0 = r2.size()
            int[] r3 = new int[r0]
            r1 = 0
        L_0x0377:
            int r0 = r2.size()
            if (r1 >= r0) goto L_0x038a
            java.lang.Object r0 = r2.get(r1)
            X.4Th r0 = (X.C265294Th) r0
            int r0 = r0.A01
            r3[r1] = r0
            int r1 = r1 + 1
            goto L_0x0377
        L_0x038a:
            r0 = 0
            java.lang.Object r2 = r2.get(r0)
            X.4Th r2 = (X.C265294Th) r2
            X.4Ro r0 = r2.A03
            X.4Tc r1 = new X.4Tc
            r1.<init>(r0, r3)
            int r0 = r2.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            android.util.Pair r2 = android.util.Pair.create(r1, r0)
            if (r2 == 0) goto L_0x0255
            java.lang.Object r0 = r2.second
            java.lang.Number r0 = (java.lang.Number) r0
            int r1 = r0.intValue()
            java.lang.Object r0 = r2.first
            r26[r1] = r0
            goto L_0x0255
        L_0x03b2:
            boolean r0 = r22.isEmpty()
            if (r0 != 0) goto L_0x0401
            r1 = r22
            r0 = r24
            java.lang.Object r2 = java.util.Collections.max(r1, r0)
            java.util.List r2 = (java.util.List) r2
            int r0 = r2.size()
            int[] r3 = new int[r0]
            r1 = 0
        L_0x03c9:
            int r0 = r2.size()
            if (r1 >= r0) goto L_0x03dc
            java.lang.Object r0 = r2.get(r1)
            X.4Th r0 = (X.C265294Th) r0
            int r0 = r0.A01
            r3[r1] = r0
            int r1 = r1 + 1
            goto L_0x03c9
        L_0x03dc:
            java.lang.Object r2 = r2.get(r4)
            X.4Th r2 = (X.C265294Th) r2
            X.4Ro r0 = r2.A03
            X.4Tc r1 = new X.4Tc
            r1.<init>(r0, r3)
            int r0 = r2.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            android.util.Pair r2 = android.util.Pair.create(r1, r0)
            if (r2 == 0) goto L_0x0401
            java.lang.Object r0 = r2.second
            java.lang.Number r0 = (java.lang.Number) r0
            int r1 = r0.intValue()
            java.lang.Object r0 = r2.first
            r26[r1] = r0
        L_0x0401:
            if (r4 >= r8) goto L_0x0456
            int[] r0 = r10.A03
            r1 = r0[r4]
            r0 = 2
            if (r1 == r0) goto L_0x0453
            if (r1 == r7) goto L_0x0453
            r0 = r23
            if (r1 == r0) goto L_0x0453
            X.4Rn[] r0 = r10.A04
            r14 = r0[r4]
            r18 = r11[r4]
            r13 = 0
            r6 = r13
            r5 = 0
            r17 = 0
        L_0x041b:
            int r0 = r14.A01
            if (r5 >= r0) goto L_0x0446
            com.google.common.collect.ImmutableList r0 = r14.A02
            java.lang.Object r3 = r0.get(r5)
            X.4Ro r3 = (X.C264854Ro) r3
            r16 = r18[r5]
            r2 = 0
        L_0x042a:
            int r0 = r3.A01
            if (r2 >= r0) goto L_0x0443
            r0 = r16[r2]
            boolean r15 = r9.A0D
            r1 = r0 & 7
            r0 = 4
            if (r1 == r0) goto L_0x043d
            if (r15 == 0) goto L_0x0440
            r0 = r23
            if (r1 != r0) goto L_0x0440
        L_0x043d:
            r6 = r3
            r17 = r2
        L_0x0440:
            int r2 = r2 + 1
            goto L_0x042a
        L_0x0443:
            int r5 = r5 + 1
            goto L_0x041b
        L_0x0446:
            if (r6 == 0) goto L_0x0451
            int[] r0 = new int[]{r17}
            X.4Tc r13 = new X.4Tc
            r13.<init>(r6, r0)
        L_0x0451:
            r26[r4] = r13
        L_0x0453:
            int r4 = r4 + 1
            goto L_0x0401
        L_0x0456:
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r1 = 0
            r6 = 0
        L_0x045d:
            if (r6 >= r8) goto L_0x0479
            X.4Rn[] r0 = r10.A04
            r5 = r0[r6]
            r4 = 0
        L_0x0464:
            int r0 = r5.A01
            if (r4 >= r0) goto L_0x0476
            com.google.common.collect.ImmutableList r0 = r5.A02
            java.lang.Object r3 = r0.get(r4)
            com.google.common.collect.ImmutableMap r0 = r9.A0G
            r0.get(r3)
            int r4 = r4 + 1
            goto L_0x0464
        L_0x0476:
            int r6 = r6 + 1
            goto L_0x045d
        L_0x0479:
            X.4Rn r0 = r10.A01
            r25 = r0
            r4 = 0
        L_0x047e:
            r0 = r25
            int r0 = r0.A01
            r24 = r0
            if (r4 >= r0) goto L_0x0496
            r0 = r25
            com.google.common.collect.ImmutableList r0 = r0.A02
            java.lang.Object r3 = r0.get(r4)
            com.google.common.collect.ImmutableMap r0 = r9.A0G
            r0.get(r3)
            int r4 = r4 + 1
            goto L_0x047e
        L_0x0496:
            if (r1 >= r8) goto L_0x04a6
            int[] r0 = r10.A03
            r0 = r0[r1]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.get(r0)
            int r1 = r1 + 1
            goto L_0x0496
        L_0x04a6:
            r3 = 0
        L_0x04a7:
            if (r3 >= r8) goto L_0x04ce
            X.4Rn[] r0 = r10.A04
            r2 = r0[r3]
            android.util.SparseArray r1 = r9.A00
            java.lang.Object r0 = r1.get(r3)
            java.util.Map r0 = (java.util.Map) r0
            if (r0 == 0) goto L_0x04cb
            boolean r0 = r0.containsKey(r2)
            if (r0 == 0) goto L_0x04cb
            java.lang.Object r0 = r1.get(r3)
            java.util.Map r0 = (java.util.Map) r0
            if (r0 == 0) goto L_0x04c8
            r0.get(r2)
        L_0x04c8:
            r0 = 0
            r26[r3] = r0
        L_0x04cb:
            int r3 = r3 + 1
            goto L_0x04a7
        L_0x04ce:
            r3 = 0
        L_0x04cf:
            r16 = 0
            if (r3 >= r8) goto L_0x04f0
            int[] r0 = r10.A03
            r2 = r0[r3]
            android.util.SparseBooleanArray r0 = r9.A01
            boolean r0 = r0.get(r3)
            if (r0 != 0) goto L_0x04eb
            com.google.common.collect.ImmutableSet r1 = r9.A0H
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x04ed
        L_0x04eb:
            r26[r3] = r16
        L_0x04ed:
            int r3 = r3 + 1
            goto L_0x04cf
        L_0x04f0:
            X.4Qm r14 = r12.A02
            X.28n r0 = r12.A01
            X.C256703wD.A01(r0)
            X.4Ql r14 = (X.C264584Ql) r14
            X.4RX[] r13 = new X.AnonymousClass4RX[r8]
            r3 = 0
            r15 = 0
        L_0x04fd:
            if (r15 >= r8) goto L_0x0575
            r1 = r26[r15]
            if (r1 == 0) goto L_0x052a
            int[] r0 = r1.A01
            int r0 = r0.length
            if (r0 == 0) goto L_0x052a
            X.4Ro r0 = r1.A00
            int r2 = r0.A02
            r0 = 3
            if (r0 == r2) goto L_0x0519
            int[] r0 = r1.A01
            int r0 = r0.length
            if (r0 != r7) goto L_0x052d
            if (r7 == r2) goto L_0x052d
            r0 = 2
            if (r0 == r2) goto L_0x052d
        L_0x0519:
            X.4Ro r2 = r1.A00
            int[] r0 = r1.A01
            r0 = r0[r3]
            int[] r1 = new int[]{r0}
            X.5qU r0 = new X.5qU
            r0.<init>(r2, r1)
        L_0x0528:
            r13[r15] = r0
        L_0x052a:
            int r15 = r15 + 1
            goto L_0x04fd
        L_0x052d:
            X.4Ro r12 = r1.A00
            int[] r6 = r1.A01
            X.28w r5 = r14.A02
            java.lang.String r1 = "audio"
            if (r5 == 0) goto L_0x0572
            X.3wB[] r0 = r12.A04
            r0 = r0[r3]
            java.lang.String r0 = r0.A0S
            if (r0 == 0) goto L_0x0572
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L_0x0572
        L_0x0545:
            X.4Qj r4 = r14.A00
            if (r4 == 0) goto L_0x056f
            X.3wB[] r0 = r12.A04
            r0 = r0[r3]
            java.lang.String r0 = r0.A0S
            if (r0 == 0) goto L_0x056f
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L_0x056f
        L_0x0557:
            com.facebook.video.heroplayer.setting.HeroPlayerSetting r2 = r14.A05
            X.4Ox r1 = r14.A04
            X.4XH r0 = new X.4XH
            r17 = r0
            r18 = r4
            r19 = r5
            r20 = r1
            r21 = r2
            r22 = r12
            r23 = r6
            r17.<init>(r18, r19, r20, r21, r22, r23)
            goto L_0x0528
        L_0x056f:
            X.4Qj r4 = r14.A01
            goto L_0x0557
        L_0x0572:
            X.28w r5 = r14.A03
            goto L_0x0545
        L_0x0575:
            X.4RW[] r12 = new X.AnonymousClass4RW[r8]
            r2 = 0
        L_0x0578:
            if (r2 >= r8) goto L_0x05a5
            int[] r5 = r10.A03
            r4 = r5[r2]
            android.util.SparseBooleanArray r0 = r9.A01
            boolean r0 = r0.get(r2)
            if (r0 != 0) goto L_0x05a2
            com.google.common.collect.ImmutableSet r1 = r9.A0H
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x05a2
            r1 = r5[r2]
            r0 = -2
            if (r1 == r0) goto L_0x059b
            r0 = r13[r2]
            if (r0 == 0) goto L_0x05a2
        L_0x059b:
            X.4RW r0 = X.AnonymousClass4RW.A01
        L_0x059d:
            r12[r2] = r0
            int r2 = r2 + 1
            goto L_0x0578
        L_0x05a2:
            r0 = r16
            goto L_0x059d
        L_0x05a5:
            boolean r0 = r9.A0F
            if (r0 == 0) goto L_0x060c
            r18 = 0
            r14 = -1
            r15 = 0
            r9 = -1
            r6 = -1
        L_0x05af:
            if (r15 >= r8) goto L_0x05f8
            int[] r0 = r10.A03
            r5 = r0[r15]
            r4 = r13[r15]
            if (r5 == r7) goto L_0x05bc
            r0 = 2
            if (r5 != r0) goto L_0x05ef
        L_0x05bc:
            if (r4 == 0) goto L_0x05ef
            r17 = r11[r15]
            X.4Rn[] r0 = r10.A04
            r0 = r0[r15]
            X.4Ro r1 = r4.C98()
            com.google.common.collect.ImmutableList r0 = r0.A02
            int r16 = r0.indexOf(r1)
            if (r16 >= 0) goto L_0x05d2
            r16 = -1
        L_0x05d2:
            r2 = 0
        L_0x05d3:
            int r0 = r4.length()
            if (r2 >= r0) goto L_0x05ea
            r1 = r17[r16]
            int r0 = r4.BGu(r2)
            r0 = r1[r0]
            r1 = r0 & 32
            r0 = 32
            if (r1 != r0) goto L_0x05ef
            int r2 = r2 + 1
            goto L_0x05d3
        L_0x05ea:
            if (r5 != r7) goto L_0x05f2
            if (r6 != r14) goto L_0x05f6
            r6 = r15
        L_0x05ef:
            int r15 = r15 + 1
            goto L_0x05af
        L_0x05f2:
            if (r9 != r14) goto L_0x05f6
            r9 = r15
            goto L_0x05ef
        L_0x05f6:
            r0 = 0
            goto L_0x05f9
        L_0x05f8:
            r0 = 1
        L_0x05f9:
            if (r6 == r14) goto L_0x05ff
            if (r9 == r14) goto L_0x05ff
            r18 = 1
        L_0x05ff:
            r0 = r0 & r18
            if (r0 == 0) goto L_0x060c
            X.4RW r0 = new X.4RW
            r0.<init>(r7)
            r12[r6] = r0
            r12[r9] = r0
        L_0x060c:
            android.util.Pair r6 = android.util.Pair.create(r12, r13)
            java.lang.Object r4 = r6.second
            X.4RY[] r4 = (X.AnonymousClass4RY[]) r4
            int r2 = r4.length
            java.util.List[] r0 = new java.util.List[r2]
            r19 = r0
            r1 = 0
        L_0x061a:
            if (r1 >= r2) goto L_0x062c
            r0 = r4[r1]
            if (r0 == 0) goto L_0x0629
            com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.of(r0)
        L_0x0624:
            r19[r1] = r0
            int r1 = r1 + 1
            goto L_0x061a
        L_0x0629:
            X.0sn r0 = X.0sn.A00
            goto L_0x0624
        L_0x062c:
            com.google.common.collect.ImmutableList$Builder r18 = new com.google.common.collect.ImmutableList$Builder
            r18.<init>()
            r11 = 0
        L_0x0632:
            if (r11 >= r8) goto L_0x0710
            X.4Rn[] r9 = r10.A04
            r17 = r9[r11]
            r16 = r19[r11]
            r7 = 0
        L_0x063b:
            r0 = r17
            int r0 = r0.A01
            if (r7 >= r0) goto L_0x070c
            r0 = r17
            com.google.common.collect.ImmutableList r0 = r0.A02
            java.lang.Object r14 = r0.get(r7)
            X.4Ro r14 = (X.C264854Ro) r14
            r0 = r9[r11]
            com.google.common.collect.ImmutableList r0 = r0.A02
            java.lang.Object r0 = r0.get(r7)
            X.4Ro r0 = (X.C264854Ro) r0
            int r12 = r0.A01
            int[] r5 = new int[r12]
            r4 = 0
            r2 = 0
        L_0x065b:
            if (r4 >= r12) goto L_0x0672
            int[][][] r0 = r10.A05
            r0 = r0[r11]
            r0 = r0[r7]
            r0 = r0[r4]
            r1 = r0 & 7
            r0 = 4
            if (r1 != r0) goto L_0x066f
            int r0 = r2 + 1
            r5[r2] = r4
            r2 = r0
        L_0x066f:
            int r4 = r4 + 1
            goto L_0x065b
        L_0x0672:
            int[] r5 = java.util.Arrays.copyOf(r5, r2)
            r4 = 0
            r2 = 0
            r15 = 0
            r13 = 0
            r1 = 16
        L_0x067c:
            int r0 = r5.length
            if (r4 >= r0) goto L_0x06b0
            r12 = r5[r4]
            r0 = r9[r11]
            com.google.common.collect.ImmutableList r0 = r0.A02
            java.lang.Object r0 = r0.get(r7)
            X.4Ro r0 = (X.C264854Ro) r0
            X.3wB[] r0 = r0.A04
            r0 = r0[r12]
            java.lang.String r0 = r0.A0W
            int r12 = r13 + 1
            if (r13 != 0) goto L_0x06a8
            r2 = r0
        L_0x0696:
            int[][][] r0 = r10.A05
            r0 = r0[r11]
            r0 = r0[r7]
            r0 = r0[r4]
            r0 = r0 & 24
            int r1 = java.lang.Math.min(r1, r0)
            int r4 = r4 + 1
            r13 = r12
            goto L_0x067c
        L_0x06a8:
            boolean r0 = com.google.android.exoplayer2.util.Util.A0I(r2, r0)
            r0 = r0 ^ 1
            r15 = r15 | r0
            goto L_0x0696
        L_0x06b0:
            if (r15 == 0) goto L_0x06ba
            int[] r0 = r10.A02
            r0 = r0[r11]
            int r1 = java.lang.Math.min(r1, r0)
        L_0x06ba:
            r13 = 0
            if (r1 == 0) goto L_0x06be
            r13 = 1
        L_0x06be:
            int r12 = r14.A01
            int[] r5 = new int[r12]
            boolean[] r4 = new boolean[r12]
            r2 = 0
        L_0x06c5:
            if (r2 >= r12) goto L_0x06fe
            int[][][] r0 = r10.A05
            r0 = r0[r11]
            r0 = r0[r7]
            r0 = r0[r2]
            r0 = r0 & 7
            r5[r2] = r0
            r1 = 0
        L_0x06d4:
            int r0 = r16.size()
            if (r1 >= r0) goto L_0x06fc
            r0 = r16
            java.lang.Object r15 = r0.get(r1)
            X.4RY r15 = (X.AnonymousClass4RY) r15
            X.4Ro r0 = r15.C98()
            boolean r0 = r0.equals(r14)
            if (r0 == 0) goto L_0x06f9
            int r0 = r15.CM9(r2)
            r15 = -1
            if (r0 == r15) goto L_0x06f9
            r0 = 1
        L_0x06f4:
            r4[r2] = r0
            int r2 = r2 + 1
            goto L_0x06c5
        L_0x06f9:
            int r1 = r1 + 1
            goto L_0x06d4
        L_0x06fc:
            r0 = 0
            goto L_0x06f4
        L_0x06fe:
            X.4Ra r1 = new X.4Ra
            r1.<init>(r14, r5, r4, r13)
            r0 = r18
            r0.add(r1)
            int r7 = r7 + 1
            goto L_0x063b
        L_0x070c:
            int r11 = r11 + 1
            goto L_0x0632
        L_0x0710:
            r5 = 0
        L_0x0711:
            r0 = r24
            if (r5 >= r0) goto L_0x0735
            r0 = r25
            com.google.common.collect.ImmutableList r0 = r0.A02
            java.lang.Object r4 = r0.get(r5)
            X.4Ro r4 = (X.C264854Ro) r4
            int r0 = r4.A01
            int[] r2 = new int[r0]
            java.util.Arrays.fill(r2, r3)
            boolean[] r0 = new boolean[r0]
            X.4Ra r1 = new X.4Ra
            r1.<init>(r4, r2, r0, r3)
            r0 = r18
            r0.add(r1)
            int r5 = r5 + 1
            goto L_0x0711
        L_0x0735:
            X.4RZ r0 = X.AnonymousClass4RZ.A01
            com.google.common.collect.ImmutableList r0 = r18.build()
            X.4RZ r2 = new X.4RZ
            r2.<init>(r0)
            java.lang.Object r1 = r6.first
            X.4RW[] r1 = (X.AnonymousClass4RW[]) r1
            java.lang.Object r0 = r6.second
            X.4RX[] r0 = (X.AnonymousClass4RX[]) r0
            X.4Rb r4 = new X.4Rb
            r4.<init>(r2, r10, r1, r0)
            X.4RX[] r3 = r4.A04
            int r2 = r3.length
            r1 = 0
        L_0x0751:
            if (r1 >= r2) goto L_0x075f
            r0 = r3[r1]
            if (r0 == 0) goto L_0x075c
            r5 = r36
            r0.DXe(r5)
        L_0x075c:
            int r1 = r1 + 1
            goto L_0x0751
        L_0x075f:
            return r4
        L_0x0760:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0760 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4TC.A02(float):X.4Rb");
    }

    public final void A03() {
        AnonymousClass4TF r2 = this.A0C;
        AnonymousClass4TH r1 = this.A08;
        try {
            if (r1 instanceof AnonymousClass4TW) {
                r1 = ((AnonymousClass4TW) r1).A06;
            }
            r2.ECj(r1);
        } catch (RuntimeException e) {
            2AG.A05("MediaPeriodHolder", "Period release failed.", e);
        }
    }

    public final void A04() {
        AnonymousClass4TH r5 = this.A08;
        if (r5 instanceof AnonymousClass4TW) {
            long j = this.A02.A01;
            if (j == -9223372036854775807L) {
                j = Long.MIN_VALUE;
            }
            AnonymousClass4TW r52 = (AnonymousClass4TW) r5;
            r52.A02 = 0;
            r52.A00 = j;
        }
    }

    public final void A06(long j) {
        boolean z = false;
        if (this.A01 == null) {
            z = true;
        }
        C256703wD.A04(z);
        this.A08.AJh(j - this.A00, -9223372036854775807L);
    }

    public final void A07(long j) {
        boolean z = false;
        if (this.A01 == null) {
            z = true;
        }
        C256703wD.A04(z);
        if (this.A07) {
            this.A08.EB7(j - this.A00);
        }
    }

    public final void A08(C21415XaP xaP) {
        boolean z = false;
        if (this.A01 == null) {
            z = true;
        }
        C256703wD.A04(z);
        this.A08.AJi(new C21415XaP(xaP.A01 - this.A00, xaP.A02));
    }

    public final boolean A09() {
        if (!this.A07) {
            return false;
        }
        if (!this.A06 || this.A08.AiU() == Long.MIN_VALUE) {
            return true;
        }
        return false;
    }

    public AnonymousClass4TC(AnonymousClass4TB r9, C265164Su r10, C264634Qq r11, C264734Rb r12, AnonymousClass4QW r13, AnonymousClass4PN[] r14, long j) {
        this.A0A = r14;
        long j2 = r9.A03;
        this.A00 = j - j2;
        this.A0D = r11;
        C264874Rq r4 = r9.A04;
        Object obj = r4.A04;
        obj.getClass();
        this.A09 = obj;
        this.A02 = r9;
        this.A04 = r12;
        int length = r14.length;
        this.A0B = new AnonymousClass4TD[length];
        this.A0E = new boolean[length];
        AnonymousClass4TE r2 = new AnonymousClass4TE(this, r10);
        this.A0C = r2;
        long j3 = r9.A01;
        AnonymousClass4TH AMb = r2.A01.AMb(r4, r13, j2);
        this.A08 = j3 != -9223372036854775807L ? new AnonymousClass4TW(AMb, 0, j3) : AMb;
    }

    public AnonymousClass4TC(AnonymousClass4TB r9, AnonymousClass5NF r10, C264634Qq r11, C264734Rb r12, AnonymousClass4QW r13, AnonymousClass4PN[] r14, long j) {
        this.A0A = r14;
        this.A00 = j;
        this.A0D = r11;
        C284615Ng r2 = new C284615Ng(this, r10);
        this.A0C = r2;
        C264874Rq r3 = r9.A04;
        this.A09 = r3.A04;
        this.A02 = r9;
        this.A04 = r12;
        int length = r14.length;
        this.A0B = new AnonymousClass4TD[length];
        this.A0E = new boolean[length];
        long j2 = r9.A03;
        long j3 = r9.A01;
        AnonymousClass4TH A002 = r2.A00(r3, r13, j2);
        this.A08 = j3 != -9223372036854775807L ? new AnonymousClass4TW(A002, 0, j3) : A002;
    }
}
