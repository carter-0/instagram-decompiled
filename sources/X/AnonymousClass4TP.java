package X;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.4TP  reason: invalid class name */
public final class AnonymousClass4TP implements AnonymousClass4TI, AnonymousClass4TD, AnonymousClass4TQ, AnonymousClass4TR {
    public int A00;
    public long A01;
    public long A02;
    public long A03 = -1;
    public AnonymousClass4Y1 A04;
    public AnonymousClass4Y1 A05;
    public C266194Xx A06;
    public AnonymousClass4TJ A07;
    public C2609547r A08;
    public C2609447q A09;
    public Boolean A0A = null;
    public boolean A0B;
    public boolean A0C = false;
    public C256683wB A0D;
    public boolean A0E;
    public final int A0F;
    public final C264544Qh A0G;
    public final C265174Sv A0H;
    public final C265984Xc A0I;
    public final C264934Rw A0J;
    public final AnonymousClass4XP A0K;
    public final C265084Sm A0L;
    public final AnonymousClass4XY A0M;
    public final ArrayList A0N;
    public final List A0O;
    public final boolean A0P;
    public final boolean A0Q;
    public final boolean A0R;
    public final int[] A0S;
    public final C256683wB[] A0T;
    public final C265984Xc[] A0U;
    public final boolean[] A0V;
    public final C266074Xl A0W;
    public final AnonymousClass4Xb A0X;

    public final /* bridge */ /* synthetic */ void DOA(C266204Xy r15, long j, long j2) {
        C266194Xx r5 = (C266194Xx) r15;
        this.A06 = null;
        this.A08 = null;
        this.A09 = null;
        this.A0K.D1o(r5);
        C257263x7 r2 = r5.A06;
        C266214Xz r0 = r5.A07;
        AnonymousClass4Y0 r3 = new AnonymousClass4Y0(r0.A01, r2, r0.A02);
        C265174Sv r1 = this.A0H;
        int i = r5.A01;
        int i2 = this.A0F;
        r1.A05(r5.A05, r3, r5.A08, r5, (Object) null, i, i2, r5.A00, r5.A04, r5.A02);
        this.A0J.D6K(this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK, PHI: r4 
      PHI: (r4v1 int) = (r4v0 int), (r4v2 int) binds: [B:0:0x0000, B:3:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A00(X.AnonymousClass4TP r2, int r3, int r4) {
        /*
        L_0x0000:
            int r4 = r4 + 1
            java.util.ArrayList r1 = r2.A0N
            int r0 = r1.size()
            if (r4 >= r0) goto L_0x001d
            java.lang.Object r0 = r1.get(r4)
            X.4Y1 r0 = (X.AnonymousClass4Y1) r0
            r1 = 0
            int[] r0 = r0.A01
            X.C256703wD.A01(r0)
            r0 = r0[r1]
            if (r0 <= r3) goto L_0x0000
        L_0x001a:
            int r0 = r4 + -1
            return r0
        L_0x001d:
            int r4 = r1.size()
            goto L_0x001a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4TP.A00(X.4TP, int, int):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0045, code lost:
        if (r10 > (r1 - r4.A03)) goto L_0x0047;
     */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00e1 A[LOOP:0: B:8:0x002e->B:43:0x00e1, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0119 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private X.AnonymousClass4Y1 A01(int r13) {
        /*
            r12 = this;
            java.util.ArrayList r2 = r12.A0N
            java.lang.Object r7 = r2.get(r13)
            X.4Y1 r7 = (X.AnonymousClass4Y1) r7
            int r1 = r2.size()
            if (r13 < 0) goto L_0x011a
            int r0 = r2.size()
            if (r1 > r0) goto L_0x011a
            if (r13 > r1) goto L_0x011a
            if (r13 == r1) goto L_0x001f
            java.util.List r0 = r2.subList(r13, r1)
            r0.clear()
        L_0x001f:
            int r1 = r12.A00
            int r0 = r2.size()
            int r0 = java.lang.Math.max(r1, r0)
            r12.A00 = r0
            X.4Xc r4 = r12.A0I
            r6 = 0
        L_0x002e:
            int[] r0 = r7.A01
            X.C256703wD.A01(r0)
            r8 = r0[r6]
            X.4Xe r5 = r4.A0T
            int r10 = r4.A00
            int r1 = r4.A02
            int r10 = r10 + r1
            int r10 = r10 - r8
            r9 = 0
            r11 = 1
            if (r10 < 0) goto L_0x0047
            int r0 = r4.A03
            int r1 = r1 - r0
            r0 = 1
            if (r10 <= r1) goto L_0x0048
        L_0x0047:
            r0 = 0
        L_0x0048:
            X.C256703wD.A03(r0)
            int r0 = r4.A02
            int r0 = r0 - r10
            r4.A02 = r0
            long r2 = r4.A05
            long r0 = X.C265984Xc.A02(r4, r0)
            long r0 = java.lang.Math.max(r2, r0)
            r4.A06 = r0
            if (r10 != 0) goto L_0x0063
            boolean r0 = r4.A0E
            if (r0 == 0) goto L_0x0063
            r9 = 1
        L_0x0063:
            r4.A0E = r9
            X.4Xk r3 = r4.A0U
            android.util.SparseArray r9 = r3.A01
            int r2 = r9.size()
        L_0x006d:
            int r2 = r2 + -1
            if (r2 < 0) goto L_0x0084
            int r0 = r9.keyAt(r2)
            if (r8 >= r0) goto L_0x0084
            X.4Xj r1 = r3.A02
            java.lang.Object r0 = r9.valueAt(r2)
            r1.accept(r0)
            r9.removeAt(r2)
            goto L_0x006d
        L_0x0084:
            int r0 = r9.size()
            if (r0 <= 0) goto L_0x0116
            int r1 = r3.A00
            int r0 = r9.size()
            int r0 = r0 + -1
            int r0 = java.lang.Math.min(r1, r0)
        L_0x0096:
            r3.A00 = r0
            int r0 = r4.A02
            if (r0 == 0) goto L_0x0113
            int r0 = r0 - r11
            int r1 = r4.A04
            int r1 = r1 + r0
            int r0 = r4.A01
            if (r1 < r0) goto L_0x00a5
            int r1 = r1 - r0
        L_0x00a5:
            long[] r0 = r4.A0M
            r2 = r0[r1]
            int[] r0 = r4.A0K
            r0 = r0[r1]
            long r0 = (long) r0
            long r2 = r2 + r0
        L_0x00af:
            long r0 = r5.A00
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            r0 = 0
            if (r4 > 0) goto L_0x00b7
            r0 = 1
        L_0x00b7:
            X.C256703wD.A03(r0)
            r5.A00 = r2
            r8 = 0
            int r0 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r0 == 0) goto L_0x00ca
            X.4Xf r4 = r5.A01
            long r0 = r4.A01
            int r8 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r8 != 0) goto L_0x00e7
        L_0x00ca:
            X.4Xf r0 = r5.A01
            X.C266004Xe.A04(r0, r5)
            long r0 = r5.A00
            X.4Xf r2 = new X.4Xf
            r2.<init>(r0)
            r5.A01 = r2
            r5.A02 = r2
            r5.A03 = r2
        L_0x00dc:
            X.4Xc[] r1 = r12.A0U
            int r0 = r1.length
            if (r6 >= r0) goto L_0x0119
            r4 = r1[r6]
            int r6 = r6 + 1
            goto L_0x002e
        L_0x00e7:
            long r0 = r4.A00
            int r8 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r8 <= 0) goto L_0x00f0
            X.4Xf r4 = r4.A02
            goto L_0x00e7
        L_0x00f0:
            X.4Xf r10 = r4.A02
            r10.getClass()
            X.C266004Xe.A04(r10, r5)
            long r0 = r4.A00
            X.4Xf r9 = new X.4Xf
            r9.<init>(r0)
            r4.A02 = r9
            long r2 = r5.A00
            long r0 = r4.A00
            int r8 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r8 != 0) goto L_0x010a
            r4 = r9
        L_0x010a:
            r5.A03 = r4
            X.4Xf r0 = r5.A02
            if (r0 != r10) goto L_0x00dc
            r5.A02 = r9
            goto L_0x00dc
        L_0x0113:
            r2 = 0
            goto L_0x00af
        L_0x0116:
            r0 = -1
            goto L_0x0096
        L_0x0119:
            return r7
        L_0x011a:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4TP.A01(int):X.4Y1");
    }

    private void A02(int i) {
        C256683wB r0;
        C266194Xx r2 = (C266194Xx) this.A0N.get(i);
        C256683wB r4 = r2.A05;
        if ((!r4.equals(this.A0D) && !this.A0G.A0N) || (this.A0G.A0N && ((r0 = this.A0D) == null || !r4.A0T.equals(r0.A0T)))) {
            this.A0H.A06(r4, r2.A08, this.A0F, r2.A00, r2.A04);
        }
        this.A0D = r4;
    }

    private boolean A03(int i) {
        C265984Xc r0;
        C265984Xc r02 = this.A0I;
        int i2 = r02.A00 + r02.A03;
        int[] iArr = ((AnonymousClass4Y1) this.A0N.get(i)).A01;
        C256703wD.A01(iArr);
        if (i2 <= iArr[0]) {
            int i3 = 0;
            do {
                C265984Xc[] r1 = this.A0U;
                if (i3 >= r1.length) {
                    return false;
                }
                r0 = r1[i3];
                i3++;
            } while (r0.A00 + r0.A03 <= iArr[i3]);
        }
        return true;
    }

    public final boolean A04() {
        if (this.A02 != -9223372036854775807L) {
            return true;
        }
        return false;
    }

    public final void AGR(long j) {
        ArrayList arrayList = this.A0N;
        int size = arrayList.size() - 1;
        if (size >= 0 && AiS(j) >= 4000000) {
            AnonymousClass4Y2 r1 = (AnonymousClass4Y2) arrayList.get(size);
            if (!r1.A01()) {
                AnonymousClass4XY r2 = this.A0M;
                if (r2.A01 != null && !A03(size)) {
                    arrayList.remove(size);
                    if (arrayList.isEmpty()) {
                        this.A02 = r1.A04;
                    }
                    r2.A00();
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0096, code lost:
        if (r17 != false) goto L_0x0098;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a2, code lost:
        if (r2.A02 != false) goto L_0x00a4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0095 A[Catch:{ all -> 0x0177 }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x009f A[Catch:{ all -> 0x0177 }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00b5 A[Catch:{ all -> 0x0177 }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00bd A[Catch:{ all -> 0x0177 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean AJh(long r31, long r33) {
        /*
            r30 = this;
            java.lang.String r0 = "continueLoading"
            X.27d.A01(r0)     // Catch:{ all -> 0x0177 }
            r6 = r30
            boolean r0 = r6.A0B     // Catch:{ all -> 0x0177 }
            r5 = 0
            if (r0 != 0) goto L_0x0173
            X.4XY r12 = r6.A0M     // Catch:{ all -> 0x0177 }
            X.4Y3 r0 = r12.A01     // Catch:{ all -> 0x0177 }
            if (r0 != 0) goto L_0x0173
            boolean r15 = r6.A04()     // Catch:{ all -> 0x0177 }
            if (r15 == 0) goto L_0x003b
            java.util.List r14 = java.util.Collections.emptyList()     // Catch:{ all -> 0x0177 }
            r13 = 0
            long r3 = r6.A02     // Catch:{ all -> 0x0177 }
        L_0x001f:
            boolean r0 = r6.A0E     // Catch:{ all -> 0x0177 }
            r9 = r31
            if (r0 == 0) goto L_0x0036
            long r26 = r6.AiU()     // Catch:{ all -> 0x0177 }
            long r26 = r26 - r31
        L_0x002b:
            long r7 = r6.A03     // Catch:{ all -> 0x0177 }
            r0 = -1
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            r17 = 0
            if (r2 == 0) goto L_0x0050
            goto L_0x004e
        L_0x0036:
            long r26 = r6.AiS(r9)     // Catch:{ all -> 0x0177 }
            goto L_0x002b
        L_0x003b:
            java.util.List r14 = r6.A0O     // Catch:{ all -> 0x0177 }
            java.util.ArrayList r1 = r6.A0N     // Catch:{ all -> 0x0177 }
            int r0 = r1.size()     // Catch:{ all -> 0x0177 }
            int r0 = r0 + -1
            java.lang.Object r13 = r1.get(r0)     // Catch:{ all -> 0x0177 }
            X.4Y1 r13 = (X.AnonymousClass4Y1) r13     // Catch:{ all -> 0x0177 }
            long r3 = r13.A02     // Catch:{ all -> 0x0177 }
            goto L_0x001f
        L_0x004e:
            r17 = 1
        L_0x0050:
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r2 == 0) goto L_0x0059
            r6.A03 = r0     // Catch:{ all -> 0x0177 }
            r17 = 0
            goto L_0x007a
        L_0x0059:
            if (r17 == 0) goto L_0x007a
            X.4XP r11 = r6.A0K     // Catch:{ all -> 0x0177 }
            r20 = 0
            java.util.List r21 = java.util.Collections.emptyList()     // Catch:{ all -> 0x0177 }
            r26 = 0
            X.4Xb r2 = r6.A0X     // Catch:{ all -> 0x0177 }
            r28 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r18 = r11
            r19 = r2
            r22 = r9
            r24 = r7
            r18.BW6(r19, r20, r21, r22, r24, r26, r28)     // Catch:{ all -> 0x0177 }
            r16 = 1
            goto L_0x0091
        L_0x007a:
            X.4XP r11 = r6.A0K     // Catch:{ all -> 0x0177 }
            X.4Xb r2 = r6.A0X     // Catch:{ all -> 0x0177 }
            r16 = 1
            r28 = r33
            r18 = r11
            r19 = r2
            r20 = r13
            r21 = r14
            r22 = r9
            r24 = r3
            r18.BW6(r19, r20, r21, r22, r24, r26, r28)     // Catch:{ all -> 0x0177 }
        L_0x0091:
            boolean r3 = r2.A01     // Catch:{ all -> 0x0177 }
            if (r3 == 0) goto L_0x0098
            r8 = 1
            if (r17 == 0) goto L_0x0099
        L_0x0098:
            r8 = 0
        L_0x0099:
            X.4Xx r4 = r2.A00     // Catch:{ all -> 0x0177 }
            boolean r3 = r6.A0C     // Catch:{ all -> 0x0177 }
            if (r3 != 0) goto L_0x00a4
            boolean r7 = r2.A02     // Catch:{ all -> 0x0177 }
            r3 = 0
            if (r7 == 0) goto L_0x00a5
        L_0x00a4:
            r3 = 1
        L_0x00a5:
            r6.A0C = r3     // Catch:{ all -> 0x0177 }
            r14 = 0
            r2.A00 = r14     // Catch:{ all -> 0x0177 }
            r2.A01 = r5     // Catch:{ all -> 0x0177 }
            r2.A02 = r5     // Catch:{ all -> 0x0177 }
            r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r8 == 0) goto L_0x00bd
            r6.A02 = r9     // Catch:{ all -> 0x0177 }
            r0 = r16
            r6.A0B = r0     // Catch:{ all -> 0x0177 }
            goto L_0x016f
        L_0x00bd:
            if (r4 == 0) goto L_0x0173
            r6.A06 = r4     // Catch:{ all -> 0x0177 }
            boolean r2 = r4 instanceof X.AnonymousClass4Y1     // Catch:{ all -> 0x0177 }
            if (r2 == 0) goto L_0x0110
            r13 = r4
            X.4Y1 r13 = (X.AnonymousClass4Y1) r13     // Catch:{ all -> 0x0177 }
            if (r15 == 0) goto L_0x00e4
            long r7 = r13.A04     // Catch:{ all -> 0x0177 }
            long r2 = r6.A02     // Catch:{ all -> 0x0177 }
            int r15 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r15 == 0) goto L_0x00e2
            X.4Xc r7 = r6.A0I     // Catch:{ all -> 0x0177 }
            r7.A08 = r2     // Catch:{ all -> 0x0177 }
            X.4Xc[] r15 = r6.A0U     // Catch:{ all -> 0x0177 }
            int r8 = r15.length     // Catch:{ all -> 0x0177 }
        L_0x00d9:
            if (r5 >= r8) goto L_0x00e2
            r7 = r15[r5]     // Catch:{ all -> 0x0177 }
            r7.A08 = r2     // Catch:{ all -> 0x0177 }
            int r5 = r5 + 1
            goto L_0x00d9
        L_0x00e2:
            r6.A02 = r9     // Catch:{ all -> 0x0177 }
        L_0x00e4:
            if (r17 != 0) goto L_0x0106
            X.4Xl r2 = r6.A0W     // Catch:{ all -> 0x0177 }
            r13.A00 = r2     // Catch:{ all -> 0x0177 }
            X.4Xc[] r9 = r2.A00     // Catch:{ all -> 0x0177 }
            int r8 = r9.length     // Catch:{ all -> 0x0177 }
            int[] r7 = new int[r8]     // Catch:{ all -> 0x0177 }
            r5 = 0
        L_0x00f0:
            if (r5 >= r8) goto L_0x00fe
            r2 = r9[r5]     // Catch:{ all -> 0x0177 }
            int r3 = r2.A00     // Catch:{ all -> 0x0177 }
            int r2 = r2.A02     // Catch:{ all -> 0x0177 }
            int r3 = r3 + r2
            r7[r5] = r3     // Catch:{ all -> 0x0177 }
            int r5 = r5 + 1
            goto L_0x00f0
        L_0x00fe:
            r13.A01 = r7     // Catch:{ all -> 0x0177 }
            java.util.ArrayList r2 = r6.A0N     // Catch:{ all -> 0x0177 }
            r2.add(r13)     // Catch:{ all -> 0x0177 }
            goto L_0x011b
        L_0x0106:
            r13.A00 = r14     // Catch:{ all -> 0x0177 }
            java.lang.String r1 = "sampleQueues"
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ all -> 0x0177 }
            r0.<init>(r1)     // Catch:{ all -> 0x0177 }
            throw r0     // Catch:{ all -> 0x0177 }
        L_0x0110:
            boolean r2 = r4 instanceof X.C266184Xw     // Catch:{ all -> 0x0177 }
            if (r2 == 0) goto L_0x011b
            r3 = r4
            X.4Xw r3 = (X.C266184Xw) r3     // Catch:{ all -> 0x0177 }
            X.4Xl r2 = r6.A0W     // Catch:{ all -> 0x0177 }
            r3.A00 = r2     // Catch:{ all -> 0x0177 }
        L_0x011b:
            long r2 = r6.A03     // Catch:{ all -> 0x0177 }
            int r5 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r5 == 0) goto L_0x0124
            if (r17 != 0) goto L_0x0124
            goto L_0x0126
        L_0x0124:
            r6.A03 = r0     // Catch:{ all -> 0x0177 }
        L_0x0126:
            X.27s r0 = r12.A00     // Catch:{ all -> 0x0177 }
            if (r0 != 0) goto L_0x0130
            X.4XN r11 = (X.AnonymousClass4XN) r11     // Catch:{ all -> 0x0177 }
            X.27s r0 = r11.A08     // Catch:{ all -> 0x0177 }
            r12.A00 = r0     // Catch:{ all -> 0x0177 }
        L_0x0130:
            X.4Sm r0 = r6.A0L     // Catch:{ all -> 0x0177 }
            int r11 = r4.A01     // Catch:{ all -> 0x0177 }
            X.4Sl r0 = (X.C265074Sl) r0     // Catch:{ all -> 0x0177 }
            int r1 = r0.A00     // Catch:{ all -> 0x0177 }
            r0 = -1
            if (r1 != r0) goto L_0x013c
            r1 = 3
        L_0x013c:
            r12.A02(r6, r4, r1)     // Catch:{ all -> 0x0177 }
            boolean r0 = r6.A0Q     // Catch:{ all -> 0x0177 }
            if (r0 != 0) goto L_0x016f
            X.4Sv r10 = r6.A0H     // Catch:{ all -> 0x0177 }
            java.util.concurrent.atomic.AtomicLong r0 = X.AnonymousClass4Y0.A03     // Catch:{ all -> 0x0177 }
            X.3x7 r0 = r4.A06     // Catch:{ all -> 0x0177 }
            X.4Y0 r9 = new X.4Y0     // Catch:{ all -> 0x0177 }
            r9.<init>(r0)     // Catch:{ all -> 0x0177 }
            int r8 = r6.A0F     // Catch:{ all -> 0x0177 }
            X.3wB r7 = r4.A05     // Catch:{ all -> 0x0177 }
            int r6 = r4.A00     // Catch:{ all -> 0x0177 }
            java.lang.Object r5 = r4.A08     // Catch:{ all -> 0x0177 }
            long r2 = r4.A04     // Catch:{ all -> 0x0177 }
            long r0 = r4.A02     // Catch:{ all -> 0x0177 }
            r17 = r10
            r18 = r7
            r19 = r9
            r20 = r5
            r21 = r11
            r22 = r8
            r23 = r6
            r24 = r2
            r26 = r0
            r17.A04(r18, r19, r20, r21, r22, r23, r24, r26)     // Catch:{ all -> 0x0177 }
        L_0x016f:
            X.27d.A00()
            return r16
        L_0x0173:
            X.27d.A00()
            return r5
        L_0x0177:
            r0 = move-exception
            X.27d.A00()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4TP.AJh(long, long):boolean");
    }

    public final boolean AJi(C21415XaP xaP) {
        Boolean bool = this.A0A;
        if (bool == null || bool.booleanValue() != xaP.A02) {
            boolean z = xaP.A02;
            Boolean valueOf = Boolean.valueOf(z);
            String.format("playWhenReady changed from %s to %b, this: %d", new Object[]{bool, valueOf, Integer.valueOf(hashCode())});
            this.A0A = valueOf;
            if (z) {
                AnonymousClass4XN r1 = (AnonymousClass4XN) this.A0K;
                r1.A03 = Math.min(r1.A03, 2);
                if (this.A0G.A0P) {
                    FKi((byte) 0, true);
                }
            } else {
                C264544Qh r12 = this.A0G;
                if (r12.A0P) {
                    FKi((byte) 2, true);
                }
                if (!this.A0R && r12.A0H) {
                    AGR(xaP.A01);
                }
            }
        }
        return AJh(xaP.A01, -9223372036854775807L);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0058, code lost:
        if (r1 != null) goto L_0x005a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long AiS(long r12) {
        /*
            r11 = this;
            java.util.ArrayList r5 = r11.A0N
            java.util.Iterator r10 = r5.iterator()
            r8 = 0
            r6 = 0
        L_0x000a:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x006b
            java.lang.Object r4 = r10.next()
            X.4Xx r4 = (X.C266194Xx) r4
            boolean r0 = r11.A04()
            if (r0 == 0) goto L_0x0031
            long r2 = r11.A02
        L_0x001e:
            long r0 = r4.A02
            long r2 = java.lang.Math.min(r2, r0)
            long r0 = r4.A04
            long r0 = java.lang.Math.max(r0, r12)
            long r2 = r2 - r0
            int r0 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x000a
            long r6 = r6 + r2
            goto L_0x000a
        L_0x0031:
            long r2 = r11.A01
            int r0 = r5.size()
            int r0 = r0 + -1
            java.lang.Object r1 = r5.get(r0)
            X.4Y2 r1 = (X.AnonymousClass4Y2) r1
            boolean r0 = r1.A01()
            if (r0 != 0) goto L_0x005a
            int r1 = r5.size()
            r0 = 1
            if (r1 <= r0) goto L_0x0060
            int r0 = r5.size()
            int r0 = r0 + -2
            java.lang.Object r1 = r5.get(r0)
            X.4Xx r1 = (X.C266194Xx) r1
            if (r1 == 0) goto L_0x0060
        L_0x005a:
            long r0 = r1.A02
            long r2 = java.lang.Math.max(r2, r0)
        L_0x0060:
            X.4Xc r0 = r11.A0I
            long r0 = r0.A05()
            long r2 = java.lang.Math.max(r2, r0)
            goto L_0x001e
        L_0x006b:
            X.4Y1 r1 = r11.A05
            if (r1 == 0) goto L_0x0081
            long r4 = r1.A04
            int r0 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r0 > 0) goto L_0x0081
            long r2 = r1.A02
            int r0 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r0 > 0) goto L_0x0081
            long r0 = java.lang.Math.max(r4, r12)
            long r2 = r2 - r0
            long r6 = r6 + r2
        L_0x0081:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4TP.AiS(long):long");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0039, code lost:
        if (r3 != null) goto L_0x003b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long AiU() {
        /*
            r5 = this;
            boolean r0 = r5.A0B
            if (r0 == 0) goto L_0x0007
            r0 = -9223372036854775808
            return r0
        L_0x0007:
            boolean r0 = r5.A04()
            if (r0 == 0) goto L_0x0010
            long r0 = r5.A02
            return r0
        L_0x0010:
            long r1 = r5.A01
            java.util.ArrayList r4 = r5.A0N
            int r0 = r4.size()
            int r0 = r0 + -1
            java.lang.Object r3 = r4.get(r0)
            X.4Y2 r3 = (X.AnonymousClass4Y2) r3
            boolean r0 = r3.A01()
            if (r0 != 0) goto L_0x003b
            int r3 = r4.size()
            r0 = 1
            if (r3 <= r0) goto L_0x0041
            int r0 = r4.size()
            int r0 = r0 + -2
            java.lang.Object r3 = r4.get(r0)
            X.4Xx r3 = (X.C266194Xx) r3
            if (r3 == 0) goto L_0x0041
        L_0x003b:
            long r3 = r3.A02
            long r1 = java.lang.Math.max(r1, r3)
        L_0x0041:
            X.4Xc r0 = r5.A0I
            long r3 = r0.A05()
            long r0 = java.lang.Math.max(r1, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4TP.AiU():long");
    }

    public final void Cnj() {
        AnonymousClass4XY r1 = this.A0M;
        r1.Cnj();
        this.A0I.A07();
        if (r1.A01 == null) {
            AnonymousClass4XN r12 = (AnonymousClass4XN) this.A0K;
            IOException iOException = r12.A0F;
            if (iOException == null) {
                r12.A0d.Cnj();
                return;
            }
            throw iOException;
        }
    }

    public final /* bridge */ /* synthetic */ void DO6(C266204Xy r13, long j, long j2, boolean z) {
        C266194Xx r132 = (C266194Xx) r13;
        this.A06 = null;
        C257263x7 r2 = r132.A06;
        C266214Xz r0 = r132.A07;
        AnonymousClass4Y0 r3 = new AnonymousClass4Y0(r0.A01, r2, r0.A02);
        this.A0H.A03(r132.A05, r3, r132.A08, r132.A01, this.A0F, r132.A00, r132.A04, r132.A02);
        if (!z) {
            if (A04()) {
                this.A0I.A0C(false);
                for (C265984Xc A0C2 : this.A0U) {
                    A0C2.A0C(false);
                }
            } else if (this.A0R && !this.A0P && (r132 instanceof AnonymousClass4Y1)) {
                ArrayList arrayList = this.A0N;
                A01(arrayList.size() - 1);
                if (arrayList.isEmpty()) {
                    this.A02 = this.A01;
                }
            }
            this.A0J.D6K(this);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0034, code lost:
        if (A03(r2) == false) goto L_0x0036;
     */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00d7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ X.AnonymousClass4XZ DOC(X.C266204Xy r35, java.io.IOException r36, int r37, long r38, long r40) {
        /*
            r34 = this;
            r7 = r35
            X.4Xx r7 = (X.C266194Xx) r7
            r5 = r36
            boolean r8 = r5 instanceof X.C2609447q
            r6 = r34
            if (r8 == 0) goto L_0x0100
            r0 = r5
            X.47q r0 = (X.C2609447q) r0
            r6.A09 = r0
        L_0x0011:
            X.4Xz r9 = r7.A07
            long r0 = r9.A00
            boolean r3 = r7 instanceof X.AnonymousClass4Y1
            boolean r2 = r7 instanceof X.AnonymousClass4YR
            if (r2 != 0) goto L_0x00f9
            r4 = 0
        L_0x001c:
            java.util.ArrayList r14 = r6.A0N
            int r2 = r14.size()
            int r2 = r2 + -1
            r11 = 0
            int r10 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r10 != 0) goto L_0x002c
            if (r4 == 0) goto L_0x0036
        L_0x002c:
            if (r3 == 0) goto L_0x0036
            boolean r0 = r6.A03(r2)
            r30 = 0
            if (r0 != 0) goto L_0x0038
        L_0x0036:
            r30 = 1
        L_0x0038:
            r16 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r28 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r30 == 0) goto L_0x0052
            if (r8 == 0) goto L_0x0052
            r0 = r5
            X.47q r0 = (X.C2609447q) r0
            int r1 = r0.A00
            r0 = 500(0x1f4, float:7.0E-43)
            if (r1 != r0) goto L_0x0052
            r28 = 60000(0xea60, double:2.9644E-319)
        L_0x0052:
            X.3x7 r8 = r7.A06
            android.net.Uri r1 = r9.A01
            java.util.Map r0 = r9.A02
            X.4Y0 r4 = new X.4Y0
            r4.<init>(r1, r8, r0)
            int r0 = r7.A01
            r33 = r0
            int r0 = r6.A0F
            r22 = r0
            X.3wB r0 = r7.A05
            r32 = r0
            int r0 = r7.A00
            r23 = r0
            java.lang.Object r15 = r7.A08
            long r12 = r7.A04
            long r24 = com.google.android.exoplayer2.util.Util.A08(r12)
            long r0 = r7.A02
            long r26 = com.google.android.exoplayer2.util.Util.A08(r0)
            X.4Y4 r8 = new X.4Y4
            r18 = r8
            r19 = r32
            r20 = r15
            r21 = r33
            r18.<init>(r19, r20, r21, r22, r23, r24, r26)
            X.XDS r11 = new X.XDS
            r9 = r37
            r11.<init>(r4, r8, r5, r9)
            X.4XP r10 = r6.A0K
            X.4Sm r9 = r6.A0L
            r8 = 1
            r24 = r10
            r25 = r7
            r26 = r11
            r27 = r9
            r31 = r8
            boolean r7 = r24.D1p(r25, r26, r27, r28, r30, r31)
            if (r7 == 0) goto L_0x00e7
            if (r30 == 0) goto L_0x00e0
            X.4XZ r7 = X.AnonymousClass4XY.A04
            if (r3 == 0) goto L_0x00b7
            r6.A01(r2)
            boolean r2 = r14.isEmpty()
            if (r2 == 0) goto L_0x00b7
            long r2 = r6.A01
            r6.A02 = r2
        L_0x00b7:
            int r3 = r7.A00
            r2 = 1
            if (r3 == 0) goto L_0x00bf
            if (r3 == r8) goto L_0x00bf
            r2 = 0
        L_0x00bf:
            r21 = r2 ^ 1
            X.4Sv r9 = r6.A0H
            r16 = r23
            r17 = r12
            r19 = r0
            r10 = r32
            r11 = r4
            r12 = r5
            r13 = r15
            r14 = r33
            r15 = r22
            r9.A01(r10, r11, r12, r13, r14, r15, r16, r17, r19, r21)
            if (r21 == 0) goto L_0x00df
            r0 = 0
            r6.A06 = r0
            X.4Rw r0 = r6.A0J
            r0.D6K(r6)
        L_0x00df:
            return r7
        L_0x00e0:
            java.lang.String r3 = "ChunkSampleStream"
            java.lang.String r2 = "Ignoring attempt to cancel non-cancelable load."
            android.util.Log.w(r3, r2)
        L_0x00e7:
            long r2 = r9.Bo4(r11)
            int r7 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r7 == 0) goto L_0x00f6
            r9 = 0
            X.4XZ r7 = new X.4XZ
            r7.<init>(r9, r2)
            goto L_0x00b7
        L_0x00f6:
            X.4XZ r7 = X.AnonymousClass4XY.A05
            goto L_0x00b7
        L_0x00f9:
            r2 = r7
            X.4YR r2 = (X.AnonymousClass4YR) r2
            boolean r4 = r2.A06
            goto L_0x001c
        L_0x0100:
            boolean r0 = r5 instanceof X.C2609547r
            if (r0 == 0) goto L_0x0011
            r0 = r5
            X.47r r0 = (X.C2609547r) r0
            r6.A08 = r0
            goto L_0x0011
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4TP.DOC(X.4Xy, java.io.IOException, int, long, long):X.4XZ");
    }

    public final /* bridge */ /* synthetic */ void DOS(C266204Xy r14, int i, long j, long j2) {
        C266194Xx r142 = (C266194Xx) r14;
        if (this.A0Q) {
            C257263x7 r2 = r142.A06;
            C266214Xz r0 = r142.A07;
            AnonymousClass4Y0 r3 = new AnonymousClass4Y0(r0.A01, r2, r0.A02);
            C265174Sv r1 = this.A0H;
            int i2 = r142.A01;
            int i3 = this.A0F;
            r1.A02(r142.A05, r3, r142.A08, i2, i3, r142.A00, i, r142.A04, r142.A02);
        }
    }

    public final void DOc() {
        this.A0I.A09();
        for (C265984Xc A092 : this.A0U) {
            A092.A09();
        }
        AnonymousClass4TJ r1 = this.A07;
        if (r1 != null) {
            AnonymousClass4TG r12 = (AnonymousClass4TG) r1;
            synchronized (r12) {
                C290505fQ r0 = (C290505fQ) r12.A0M.remove(this);
                if (r0 != null) {
                    r0.A03.A09();
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void EB7(long r16) {
        /*
            r15 = this;
            boolean r0 = r15.A0R
            r3 = r16
            if (r0 == 0) goto L_0x0077
            X.4XY r7 = r15.A0M
            java.io.IOException r0 = r7.A02
            if (r0 != 0) goto L_0x0038
            boolean r0 = r15.A04()
            if (r0 != 0) goto L_0x0038
            boolean r0 = r15.A0P
            if (r0 == 0) goto L_0x0039
            X.4XP r6 = r15.A0K
            X.4Xx r2 = r15.A06
            java.util.List r5 = r15.A0O
            r1 = r6
            X.4XN r1 = (X.AnonymousClass4XN) r1
            java.io.IOException r0 = r1.A0F
            if (r0 != 0) goto L_0x0034
            X.4Qh r0 = r1.A0U
            boolean r0 = r0.A0H
            if (r0 == 0) goto L_0x0034
            X.4RX r0 = r1.A0E
            boolean r0 = r0.Erq(r2, r5, r3)
            if (r0 == 0) goto L_0x0034
            r15.AGR(r3)
        L_0x0034:
            X.4Y3 r0 = r7.A01
            if (r0 == 0) goto L_0x0088
        L_0x0038:
            return
        L_0x0039:
            X.4Y3 r0 = r7.A01
            if (r0 == 0) goto L_0x0084
            X.4Xx r6 = r15.A06
            r6.getClass()
            boolean r5 = r6 instanceof X.AnonymousClass4Y1
            if (r5 == 0) goto L_0x0055
            java.util.ArrayList r0 = r15.A0N
            int r0 = r0.size()
            int r0 = r0 + -1
            boolean r0 = r15.A03(r0)
            if (r0 == 0) goto L_0x0055
            return
        L_0x0055:
            X.4XP r2 = r15.A0K
            java.util.List r1 = r15.A0O
            X.4XN r2 = (X.AnonymousClass4XN) r2
            java.io.IOException r0 = r2.A0F
            if (r0 != 0) goto L_0x0038
            X.4Qh r0 = r2.A0U
            boolean r0 = r0.A0H
            if (r0 == 0) goto L_0x0038
            X.4RX r0 = r2.A0E
            boolean r0 = r0.Erq(r6, r1, r3)
            if (r0 == 0) goto L_0x0038
            r7.A00()
            if (r5 == 0) goto L_0x0038
            X.4Y1 r6 = (X.AnonymousClass4Y1) r6
            r15.A04 = r6
            return
        L_0x0077:
            X.4XY r0 = r15.A0M
            X.4Y3 r0 = r0.A01
            if (r0 != 0) goto L_0x0038
            boolean r0 = r15.A04()
            if (r0 == 0) goto L_0x0084
            return
        L_0x0084:
            X.4XP r6 = r15.A0K
            java.util.List r5 = r15.A0O
        L_0x0088:
            X.4XN r6 = (X.AnonymousClass4XN) r6
            java.io.IOException r0 = r6.A0F
            if (r0 != 0) goto L_0x00ef
            X.4RX r2 = r6.A0E
            int r1 = r2.length()
            r0 = 2
            if (r1 < r0) goto L_0x00ef
            int r5 = r2.ASz(r5, r3)
        L_0x009b:
            java.util.ArrayList r4 = r15.A0N
            int r0 = r4.size()
            if (r5 >= r0) goto L_0x0038
            int r2 = r4.size()
        L_0x00a7:
            r1 = -1
            if (r5 >= r2) goto L_0x0038
            boolean r0 = r15.A03(r5)
            if (r0 != 0) goto L_0x00ec
            if (r5 == r1) goto L_0x0038
            int r0 = r4.size()
            int r0 = r0 + -1
            java.lang.Object r0 = r4.get(r0)
            X.4Xx r0 = (X.C266194Xx) r0
            long r2 = r0.A02
            X.4Y1 r5 = r15.A01(r5)
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L_0x00ce
            long r0 = r15.A01
            r15.A02 = r0
        L_0x00ce:
            r0 = 0
            r15.A0B = r0
            X.4Sv r4 = r15.A0H
            int r9 = r15.A0F
            long r0 = r5.A04
            long r11 = X.C265174Sv.A00(r4, r0)
            long r13 = X.C265174Sv.A00(r4, r2)
            r8 = 1
            r6 = 0
            r10 = 3
            X.4Y4 r5 = new X.4Y4
            r7 = r6
            r5.<init>(r6, r7, r8, r9, r10, r11, r13)
            r4.A0C(r5)
            return
        L_0x00ec:
            int r5 = r5 + 1
            goto L_0x00a7
        L_0x00ef:
            int r5 = r5.size()
            goto L_0x009b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4TP.EB7(long):void");
    }

    public final void Efw(boolean z) {
        String valueOf = String.valueOf(this.A0A);
        Boolean valueOf2 = Boolean.valueOf(z);
        String.format("playWhenReady changed from %s to %b, this: %d", new Object[]{valueOf, valueOf2, Integer.valueOf(hashCode())});
        this.A0A = valueOf2;
        if (z) {
            AnonymousClass4XN r1 = (AnonymousClass4XN) this.A0K;
            r1.A03 = Math.min(r1.A03, 2);
        }
    }

    public final void FKi(byte b, boolean z) {
        boolean z2;
        String str;
        C257113ws r1 = ((AnonymousClass4XN) this.A0K).A0c;
        if (r1 instanceof AnonymousClass4XL) {
            C257113ws r12 = ((AnonymousClass4XK) ((AnonymousClass4XL) r1)).A01;
            if (r12 instanceof C257133wu) {
                ((C257133wu) r12).changeHttpPriority(b, z);
            }
            z2 = true;
        } else {
            z2 = false;
        }
        Object[] objArr = {Integer.valueOf(b), Boolean.valueOf(z)};
        if (z2) {
            str = "Successfully update http/3 priority to %d and incremental %s";
        } else {
            str = "Failed update http/3 priority to %d and incremental %s";
        }
        String.format(str, objArr);
    }

    public final boolean isLoading() {
        if (this.A0M.A01 != null) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [X.4Xb, java.lang.Object] */
    public AnonymousClass4TP(C264544Qh r9, C265184Sw r10, C265114Sp r11, C265174Sv r12, C264934Rw r13, AnonymousClass4XP r14, AnonymousClass4QW r15, C265084Sm r16, int[] iArr, C256683wB[] r18, int i, long j) {
        this.A0F = i;
        int[] iArr2 = iArr;
        this.A0S = iArr2;
        this.A0T = r18;
        this.A0K = r14;
        this.A0J = r13;
        this.A0H = r12;
        this.A0L = r16;
        this.A0G = r9;
        this.A05 = null;
        this.A0M = new AnonymousClass4XY("Loader:ChunkSampleStream");
        this.A0X = new Object();
        ArrayList arrayList = new ArrayList();
        this.A0N = arrayList;
        this.A0O = Collections.unmodifiableList(arrayList);
        int length = iArr2.length;
        this.A0U = new C265984Xc[length];
        this.A0V = new boolean[length];
        int i2 = length + 1;
        int[] iArr3 = new int[i2];
        C265984Xc[] r5 = new C265984Xc[i2];
        r11.getClass();
        r10.getClass();
        C265984Xc r0 = new C265984Xc(r10, r11, r15);
        this.A0I = r0;
        iArr3[0] = i;
        r5[0] = r0;
        int i3 = 0;
        while (i3 < length) {
            C265984Xc r2 = new C265984Xc((C265184Sw) null, (C265114Sp) null, r15);
            this.A0U[i3] = r2;
            int i4 = i3 + 1;
            r5[i4] = r2;
            iArr3[i4] = this.A0S[i3];
            i3 = i4;
        }
        this.A0W = new C266074Xl(iArr3, r5);
        long j2 = j;
        this.A02 = j2;
        this.A01 = j2;
        this.A0E = 2BY.A02(2BQ.A0O);
        this.A0R = 2BY.A02(2BQ.A0P);
        this.A0P = 2BY.A02(2BQ.A0X);
        this.A0Q = 2BY.A02(2BQ.A0g);
    }

    public final long BWC() {
        if (A04()) {
            return this.A02;
        }
        if (this.A0B) {
            return Long.MIN_VALUE;
        }
        ArrayList arrayList = this.A0N;
        return ((C266194Xx) arrayList.get(arrayList.size() - 1)).A02;
    }

    public final boolean CaO() {
        if (A04() || !this.A0I.A0E(this.A0B)) {
            return false;
        }
        return true;
    }

    public final int E6J(AnonymousClass4PO r6, AnonymousClass4PQ r7, int i) {
        if (A04()) {
            return -3;
        }
        C265984Xc r4 = this.A0I;
        int A042 = r4.A04(r6, r7, i, this.A0B);
        if (A042 != -4) {
            return A042;
        }
        boolean z = this.A0G.A0Q;
        int i2 = r4.A00 + r4.A03;
        if (z) {
            int A002 = A00(this, i2, this.A00 - 1);
            while (true) {
                int i3 = this.A00;
                if (i3 > A002) {
                    return A042;
                }
                this.A00 = i3 + 1;
                A02(i3);
            }
        } else {
            int A003 = A00(this, i2 - 1, 0);
            int i4 = A003;
            while (A003 <= i4) {
                A02(A003);
                A003++;
            }
            return A042;
        }
    }

    public final int Evj(long j) {
        int i;
        if (A04()) {
            return 0;
        }
        C265984Xc r4 = this.A0I;
        int A032 = r4.A03(j, this.A0B);
        r4.A0A(A032);
        if (A032 <= 0) {
            return A032;
        }
        boolean z = this.A0G.A0Q;
        int i2 = r4.A00 + r4.A03;
        if (z) {
            int A002 = A00(this, i2, this.A00 - 1);
            while (true) {
                int i3 = this.A00;
                if (i3 > A002) {
                    return A032;
                }
                this.A00 = i3 + 1;
                A02(i3);
            }
        } else {
            int A003 = A00(this, i2 - A032, 0);
            if (A032 == 1) {
                i = A003;
            } else {
                i = A00(this, i2 - 1, A003);
            }
            while (A003 <= i) {
                A02(A003);
                A003++;
            }
            return A032;
        }
    }

    public final /* synthetic */ long C96(int i) {
        return -9223372036854775807L;
    }
}
