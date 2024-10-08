package X;

import android.text.TextUtils;
import com.google.common.collect.ComparatorOrdering;

/* renamed from: X.4Qo  reason: invalid class name and case insensitive filesystem */
public abstract class C264614Qo extends C264624Qp {
    public static final C264654Qt A04 = new ComparatorOrdering(new C264644Qr());
    public static final C264654Qt A05 = new ComparatorOrdering(new C264664Qu());
    public AnonymousClass4QB A00;
    public C264484Qb A01;
    public final C264594Qm A02;
    public final Object A03 = new Object();

    public static void A01(C264614Qo r2) {
        synchronized (r2.A03) {
        }
    }

    public final void A02() {
        synchronized (this.A03) {
        }
        super.A02();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006e, code lost:
        if (r0 != r1) goto L_0x0070;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.util.Pair A03(X.C264484Qb r32, X.C265234Tb r33, int[] r34, int[][][] r35) {
        /*
            r31 = this;
            X.4Td r20 = new X.4Td
            r20.<init>()
            r19 = 2
            java.util.ArrayList r18 = new java.util.ArrayList
            r18.<init>()
            r30 = r33
            r0 = r30
            int r0 = r0.A00
            r29 = r0
            r10 = 0
        L_0x0015:
            r0 = r29
            if (r10 >= r0) goto L_0x016e
            r0 = r30
            int[] r0 = r0.A03
            r1 = r0[r10]
            r0 = r19
            if (r0 != r1) goto L_0x016a
            r0 = r30
            X.4Rn[] r0 = r0.A04
            r15 = r0[r10]
            r9 = 0
        L_0x002a:
            int r0 = r15.A01
            if (r9 >= r0) goto L_0x016a
            com.google.common.collect.ImmutableList r0 = r15.A02
            java.lang.Object r8 = r0.get(r9)
            X.4Ro r8 = (X.C264854Ro) r8
            r0 = r35[r10]
            r17 = r0[r9]
            r27 = r34[r10]
            r7 = r32
            int r12 = r7.A0F
            int r11 = r7.A0E
            boolean r0 = r7.A0Q
            r16 = r0
            r6 = 2147483647(0x7fffffff, float:NaN)
            if (r12 == r6) goto L_0x00a6
            if (r11 == r6) goto L_0x00a6
            r5 = 0
        L_0x004e:
            int r0 = r8.A01
            if (r5 >= r0) goto L_0x00a6
            X.3wB[] r0 = r8.A04
            r4 = r0[r5]
            int r0 = r4.A0L
            if (r0 <= 0) goto L_0x0096
            int r0 = r4.A0A
            if (r0 <= 0) goto L_0x0096
            int r3 = r4.A0L
            int r2 = r4.A0A
            r14 = r12
            r13 = r11
            if (r16 == 0) goto L_0x00a3
            r1 = 1
            r0 = 0
            if (r3 <= r2) goto L_0x006b
            r0 = 1
        L_0x006b:
            if (r12 > r11) goto L_0x006e
            r1 = 0
        L_0x006e:
            if (r0 == r1) goto L_0x00a3
        L_0x0070:
            int r1 = r3 * r14
            int r0 = r2 * r13
            if (r1 < r0) goto L_0x0099
            int r0 = r0 + r3
            int r1 = r0 + -1
            int r1 = r1 / r3
            android.graphics.Point r0 = new android.graphics.Point
            r0.<init>(r13, r1)
        L_0x007f:
            int r2 = r2 * r3
            int r1 = r0.x
            float r1 = (float) r1
            r13 = 1065017672(0x3f7ae148, float:0.98)
            float r1 = r1 * r13
            int r1 = (int) r1
            if (r3 < r1) goto L_0x0096
            int r1 = r4.A0A
            int r0 = r0.y
            float r0 = (float) r0
            float r0 = r0 * r13
            int r0 = (int) r0
            if (r1 < r0) goto L_0x0096
            if (r2 >= r6) goto L_0x0096
            r6 = r2
        L_0x0096:
            int r5 = r5 + 1
            goto L_0x004e
        L_0x0099:
            int r1 = r1 + r2
            int r1 = r1 + -1
            int r1 = r1 / r2
            android.graphics.Point r0 = new android.graphics.Point
            r0.<init>(r1, r14)
            goto L_0x007f
        L_0x00a3:
            r13 = r12
            r14 = r11
            goto L_0x0070
        L_0x00a6:
            com.google.common.collect.ImmutableList$Builder r2 = com.google.common.collect.ImmutableList.builder()
            r1 = 0
        L_0x00ab:
            int r0 = r8.A01
            if (r1 >= r0) goto L_0x00e4
            X.3wB[] r0 = r8.A04
            r0 = r0[r1]
            int r4 = r0.A0L
            r3 = -1
            if (r4 == r3) goto L_0x00be
            int r0 = r0.A0A
            if (r0 == r3) goto L_0x00be
            int r3 = r4 * r0
        L_0x00be:
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r6 == r0) goto L_0x00c8
            r0 = -1
            if (r3 == r0) goto L_0x00e1
            if (r3 > r6) goto L_0x00e1
        L_0x00c8:
            r28 = 1
        L_0x00ca:
            r26 = r17[r1]
            X.4XG r0 = new X.4XG
            r21 = r0
            r22 = r8
            r23 = r7
            r24 = r10
            r25 = r1
            r21.<init>(r22, r23, r24, r25, r26, r27, r28)
            r2.add(r0)
            int r1 = r1 + 1
            goto L_0x00ab
        L_0x00e1:
            r28 = 0
            goto L_0x00ca
        L_0x00e4:
            com.google.common.collect.ImmutableList r13 = r2.build()
            int r0 = r8.A01
            boolean[] r12 = new boolean[r0]
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r6 = 0
        L_0x00f7:
            int r0 = r8.A01
            if (r6 >= r0) goto L_0x0145
            java.lang.Object r5 = r13.get(r6)
            X.4Th r5 = (X.C265294Th) r5
            int r1 = r5.A00()
            boolean r0 = r12[r6]
            if (r0 != 0) goto L_0x0118
            if (r1 == 0) goto L_0x0118
            r4 = 1
            if (r1 != r4) goto L_0x011b
            com.google.common.collect.ImmutableList r3 = com.google.common.collect.ImmutableList.of(r5)
            r11.add(r5)
        L_0x0115:
            r7.add(r3)
        L_0x0118:
            int r6 = r6 + 1
            goto L_0x00f7
        L_0x011b:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r3.add(r5)
            int r2 = r6 + 1
        L_0x0125:
            int r0 = r8.A01
            if (r2 >= r0) goto L_0x0115
            java.lang.Object r1 = r13.get(r2)
            X.4Th r1 = (X.C265294Th) r1
            int r14 = r1.A00()
            r0 = r19
            if (r14 != r0) goto L_0x0142
            boolean r0 = r5.A01(r1)
            if (r0 == 0) goto L_0x0142
            r3.add(r1)
            r12[r2] = r4
        L_0x0142:
            int r2 = r2 + 1
            goto L_0x0125
        L_0x0145:
            r0 = r31
            X.4Qb r0 = r0.A01
            boolean r0 = r0.A0C
            if (r0 == 0) goto L_0x0161
            boolean r0 = r11.isEmpty()
            if (r0 != 0) goto L_0x0161
            int r1 = r11.size()
            int r0 = r8.A01
            if (r1 != r0) goto L_0x0161
            r7.clear()
            r7.add(r11)
        L_0x0161:
            r0 = r18
            r0.addAll(r7)
            int r9 = r9 + 1
            goto L_0x002a
        L_0x016a:
            int r10 = r10 + 1
            goto L_0x0015
        L_0x016e:
            boolean r0 = r18.isEmpty()
            if (r0 == 0) goto L_0x0176
            r0 = 0
            return r0
        L_0x0176:
            r1 = r20
            r0 = r18
            java.lang.Object r2 = java.util.Collections.max(r0, r1)
            java.util.List r2 = (java.util.List) r2
            int r0 = r2.size()
            int[] r3 = new int[r0]
            r1 = 0
        L_0x0187:
            int r0 = r2.size()
            if (r1 >= r0) goto L_0x019a
            java.lang.Object r0 = r2.get(r1)
            X.4Th r0 = (X.C265294Th) r0
            int r0 = r0.A01
            r3[r1] = r0
            int r1 = r1 + 1
            goto L_0x0187
        L_0x019a:
            r0 = 0
            java.lang.Object r2 = r2.get(r0)
            X.4Th r2 = (X.C265294Th) r2
            X.4Ro r0 = r2.A03
            X.4Tc r1 = new X.4Tc
            r1.<init>(r0, r3)
            int r0 = r2.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            android.util.Pair r0 = android.util.Pair.create(r1, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C264614Qo.A03(X.4Qb, X.4Tb, int[], int[][][]):android.util.Pair");
    }

    public final C264484Qb A04() {
        C264484Qb r0;
        synchronized (this.A03) {
            r0 = this.A01;
        }
        return r0;
    }

    public final void A05(C264504Qd r5) {
        boolean z;
        C264484Qb r3 = new C264484Qb(r5);
        synchronized (this.A03) {
            z = false;
            if (!this.A01.equals(r3)) {
                z = true;
            }
            this.A01 = r3;
        }
        if (z) {
            if (r3.A0A) {
                2AG.A04("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
            }
            C264964Rz r0 = this.A00;
            if (r0 != null) {
                r0.DtA();
            }
        }
    }

    public C264614Qo(C264594Qm r3, C264494Qc r4) {
        this.A02 = r3;
        C264484Qb r42 = (C264484Qb) r4;
        this.A01 = r42;
        this.A00 = AnonymousClass4QB.A02;
        if (r42.A0A) {
            2AG.A04("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    public static int A00(C256683wB r4, String str, boolean z) {
        if (!TextUtils.isEmpty(str) && str.equals(r4.A0V)) {
            return 4;
        }
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            str = null;
        }
        String str2 = r4.A0V;
        if (TextUtils.isEmpty(str2) || TextUtils.equals(str2, "und")) {
            str2 = null;
        }
        if (str2 == null || str == null) {
            if (!z || str2 != null) {
                return 0;
            }
            return 1;
        } else if (str2.startsWith(str) || str.startsWith(str2)) {
            return 3;
        } else {
            if (str2.split("-", 2)[0].equals(str.split("-", 2)[0])) {
                return 2;
            }
            return 0;
        }
    }
}
