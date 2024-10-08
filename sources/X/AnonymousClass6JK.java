package X;

import java.util.List;

/* renamed from: X.6JK  reason: invalid class name */
public final class AnonymousClass6JK implements AnonymousClass6JL, AnonymousClass6JM {
    public int A00 = AnonymousClass972.MUTABLE_FLAG_MASK;
    public int A01;
    public int A02;
    public boolean A03;
    public int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final AnonymousClass6H4 A0A;
    public final Object A0B;
    public final List A0C;
    public final boolean A0D;
    public final int[] A0E;
    public final int A0F;
    public final int A0G;
    public final long A0H;
    public final long A0I;
    public final C287265Zr A0J;
    public final C287245Zp A0K;
    public final AnonymousClass5Q8 A0L;
    public final Object A0M;
    public final boolean A0N;

    public final void EeC(boolean z) {
        this.A03 = true;
    }

    public final void A00(int i, int i2, int i3) {
        int i4;
        this.A02 = i;
        boolean z = this.A0D;
        int i5 = i2;
        if (z) {
            i5 = i3;
        }
        this.A00 = i5;
        List list = this.A0C;
        int size = list.size();
        for (int i6 = 0; i6 < size; i6++) {
            C267974cY r8 = (C267974cY) list.get(i6);
            int i7 = i6 * 2;
            int[] iArr = this.A0E;
            if (z) {
                C287265Zr r2 = this.A0J;
                if (r2 != null) {
                    iArr[i7] = r2.AB2(this.A0L, r8.A01, i2);
                    iArr[i7 + 1] = i;
                    i4 = r8.A00;
                } else {
                    throw new IllegalArgumentException("null horizontalAlignment when isVertical == true");
                }
            } else {
                iArr[i7] = i;
                int i8 = i7 + 1;
                C287245Zp r1 = this.A0K;
                if (r1 != null) {
                    iArr[i8] = r1.AAy(r8.A00, i3);
                    i4 = r8.A01;
                } else {
                    throw new IllegalArgumentException("null verticalAlignment when isVertical == false");
                }
            }
            i += i4;
        }
        this.A04 = -this.A0F;
        this.A01 = this.A00 + this.A05;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00c1, code lost:
        if (((int) r0) > r10) goto L_0x00c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00cf, code lost:
        if (((int) r0) >= r9) goto L_0x00d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00d1, code lost:
        r8.A02();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(X.C268104cl r20, boolean r21) {
        /*
            r19 = this;
            r6 = r19
            int r1 = r6.A00
            r5 = 0
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == r0) goto L_0x00ed
            java.util.List r12 = r6.A0C
            int r11 = r12.size()
        L_0x000f:
            if (r5 >= r11) goto L_0x00ec
            java.lang.Object r4 = r12.get(r5)
            X.4cY r4 = (X.C267974cY) r4
            int r10 = r6.A04
            boolean r7 = r6.A0D
            if (r7 == 0) goto L_0x00e8
            int r0 = r4.A00
        L_0x001f:
            int r10 = r10 - r0
            int r9 = r6.A01
            long r2 = r6.BXq(r5)
            X.6H4 r1 = r6.A0A
            java.lang.Object r0 = r6.A0B
            X.I4b r8 = r1.A05(r0, r5)
            if (r8 == 0) goto L_0x00e5
            if (r21 == 0) goto L_0x0094
            r8.A01 = r2
        L_0x0034:
            androidx.compose.ui.graphics.layer.GraphicsLayer r9 = r8.A04
        L_0x0036:
            boolean r0 = r6.A0N
            if (r0 == 0) goto L_0x0052
            r0 = 32
            long r0 = r2 >> r0
            int r10 = (int) r0
            if (r7 == 0) goto L_0x0085
            r0 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r0
            int r0 = (int) r2
            int r1 = r6.A00
            int r1 = r1 - r0
            int r0 = r4.A00
            int r1 = r1 - r0
        L_0x004e:
            long r2 = X.AnonymousClass5TW.A00(r10, r1)
        L_0x0052:
            long r0 = r6.A0I
            long r0 = X.C289165d8.A01(r2, r0)
            if (r21 != 0) goto L_0x005e
            if (r8 == 0) goto L_0x005e
            r8.A00 = r0
        L_0x005e:
            r13 = r20
            if (r7 == 0) goto L_0x0079
            r16 = 0
            if (r9 == 0) goto L_0x0070
            r14 = r9
            r15 = r4
            r17 = r0
            r13.A03(r14, r15, r16, r17)
        L_0x006d:
            int r5 = r5 + 1
            goto L_0x000f
        L_0x0070:
            X.0sP r15 = X.AnonymousClass5SD.A01
            r14 = r4
            r17 = r0
            r13.A0A(r14, r15, r16, r17)
            goto L_0x006d
        L_0x0079:
            if (r9 == 0) goto L_0x007f
            r13.A04(r9, r4, r0)
            goto L_0x006d
        L_0x007f:
            X.0sP r2 = X.AnonymousClass5SD.A01
            r13.A0C(r4, r2, r0)
            goto L_0x006d
        L_0x0085:
            int r1 = r6.A00
            int r1 = r1 - r10
            int r0 = r4.A01
            int r10 = r1 - r0
            r0 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r0
            int r1 = (int) r2
            goto L_0x004e
        L_0x0094:
            long r0 = r8.A01
            long r14 = X.C56602I4b.A0G
            int r13 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r13 == 0) goto L_0x009e
            long r2 = r8.A01
        L_0x009e:
            X.5Oz r0 = r8.A0C
            java.lang.Object r0 = r0.getValue()
            X.5d8 r0 = (X.C289165d8) r0
            long r0 = r0.A00
            long r14 = X.C289165d8.A01(r2, r0)
            if (r7 == 0) goto L_0x00e1
            r0 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r0
        L_0x00b4:
            int r13 = (int) r2
            if (r13 > r10) goto L_0x00c3
            if (r7 == 0) goto L_0x00dc
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r14 & r2
        L_0x00c0:
            int r2 = (int) r0
            if (r2 <= r10) goto L_0x00d1
        L_0x00c3:
            if (r13 < r9) goto L_0x00d4
            if (r7 == 0) goto L_0x00d7
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r14 & r2
        L_0x00ce:
            int r2 = (int) r0
            if (r2 < r9) goto L_0x00d4
        L_0x00d1:
            r8.A02()
        L_0x00d4:
            r2 = r14
            goto L_0x0034
        L_0x00d7:
            r0 = 32
            long r0 = r14 >> r0
            goto L_0x00ce
        L_0x00dc:
            r0 = 32
            long r0 = r14 >> r0
            goto L_0x00c0
        L_0x00e1:
            r0 = 32
            long r2 = r2 >> r0
            goto L_0x00b4
        L_0x00e5:
            r9 = 0
            goto L_0x0036
        L_0x00e8:
            int r0 = r4.A01
            goto L_0x001f
        L_0x00ec:
            return
        L_0x00ed:
            java.lang.String r1 = "position() should be called first"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6JK.A01(X.4cl, boolean):void");
    }

    public final long Aq6() {
        return this.A0H;
    }

    public final int BKU() {
        return 0;
    }

    public final int BOp() {
        return this.A08;
    }

    public final long BXq(int i) {
        int[] iArr = this.A0E;
        int i2 = i * 2;
        return AnonymousClass5TW.A00(iArr[i2], iArr[i2 + 1]);
    }

    public final Object BaY(int i) {
        return ((C267974cY) this.A0C.get(i)).BaX();
    }

    public final int Bco() {
        return this.A0C.size();
    }

    public final int By3() {
        return 1;
    }

    public final boolean CeR() {
        return this.A0D;
    }

    public final int getIndex() {
        return this.A07;
    }

    public final Object getKey() {
        return this.A0B;
    }

    public AnonymousClass6JK(AnonymousClass6H4 r8, C287265Zr r9, C287245Zp r10, AnonymousClass5Q8 r11, Object obj, Object obj2, List list, int i, int i2, int i3, int i4, long j, long j2, boolean z, boolean z2) {
        int i5;
        int i6;
        this.A07 = i;
        this.A0C = list;
        this.A0D = z;
        this.A0J = r9;
        this.A0K = r10;
        this.A0L = r11;
        this.A0N = z2;
        this.A0F = i2;
        this.A05 = i3;
        this.A0G = i4;
        this.A0I = j;
        this.A0B = obj;
        this.A0M = obj2;
        this.A0A = r8;
        this.A0H = j2;
        int size = list.size();
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < size; i9++) {
            C267974cY r2 = (C267974cY) list.get(i9);
            boolean z3 = this.A0D;
            if (z3) {
                i5 = r2.A00;
            } else {
                i5 = r2.A01;
            }
            i7 += i5;
            if (!z3) {
                i6 = r2.A00;
            } else {
                i6 = r2.A01;
            }
            i8 = Math.max(i8, i6);
        }
        this.A09 = i7;
        int i10 = i7 + this.A0G;
        this.A08 = i10 < 0 ? 0 : i10;
        this.A06 = i8;
        this.A0E = new int[(this.A0C.size() * 2)];
    }

    public final void E3D(int i, int i2, int i3, int i4) {
        A00(i, i3, i4);
    }
}
