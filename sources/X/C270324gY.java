package X;

import java.util.List;

/* renamed from: X.4gY  reason: invalid class name and case insensitive filesystem */
public abstract class C270324gY implements C270334gZ {
    public int A00;
    public int A01;
    public 2d3 A02;
    public C22054Xuf A03;
    public C22054Xuf A04;
    public XGS A05;
    public Xn0 A06;
    public Integer A07;
    public Integer A08;
    public boolean A09;

    public static final C22054Xuf A01(2d6 r3) {
        2d6 r0 = r3.A04;
        if (r0 == null) {
            return null;
        }
        2d3 r2 = r0.A08;
        int ordinal = r0.A07.ordinal();
        if (ordinal == 1) {
            return r2.A0k.A04;
        }
        if (ordinal == 3) {
            return r2.A0k.A03;
        }
        if (ordinal == 2) {
            return r2.A0l.A04;
        }
        if (ordinal == 5) {
            return r2.A0l.A00;
        }
        if (ordinal == 4) {
            return r2.A0l.A03;
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001b, code lost:
        if (r1 != 4) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C22054Xuf A02(X.2d6 r3, int r4) {
        /*
            X.2d6 r1 = r3.A04
            r3 = 0
            if (r1 == 0) goto L_0x001d
            X.2d3 r0 = r1.A08
            if (r4 != 0) goto L_0x001e
            X.4gX r2 = r0.A0k
        L_0x000b:
            X.2d5 r0 = r1.A07
            int r1 = r0.ordinal()
            r0 = 1
            if (r1 == r0) goto L_0x0024
            r0 = 3
            if (r1 == r0) goto L_0x0021
            r0 = 2
            if (r1 == r0) goto L_0x0024
            r0 = 4
            if (r1 == r0) goto L_0x0021
        L_0x001d:
            return r3
        L_0x001e:
            X.4ga r2 = r0.A0l
            goto L_0x000b
        L_0x0021:
            X.Xuf r3 = r2.A03
            return r3
        L_0x0024:
            X.Xuf r3 = r2.A04
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C270324gY.A02(X.2d6, int):X.Xuf");
    }

    public static final void A03(C22054Xuf xuf, C22054Xuf xuf2, int i) {
        xuf.A08.add(xuf2);
        xuf.A00 = i;
        xuf2.A07.add(xuf);
    }

    public final int A04(int i, int i2) {
        int i3;
        int i4;
        2d3 r0 = this.A02;
        if (i2 == 0) {
            i3 = r0.A0J;
            i4 = r0.A0L;
        } else {
            i3 = r0.A0I;
            i4 = r0.A0K;
        }
        int max = Math.max(i4, i);
        if (i3 > 0) {
            max = Math.min(i3, i);
        }
        if (max != i) {
            return max;
        }
        return i;
    }

    public long A05() {
        XGS xgs = this.A05;
        if (xgs.A0B) {
            return (long) xgs.A02;
        }
        return 0;
    }

    /* JADX WARNING: type inference failed for: r1v85, types: [X.XGS, X.Xuf] */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x0339, code lost:
        r4 = r13.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x007f, code lost:
        r3 = r6.A02;
     */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0215  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0232  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x024c  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0259  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x027c  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x02d3  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x037d  */
    /* JADX WARNING: Removed duplicated region for block: B:209:0x041e  */
    /* JADX WARNING: Removed duplicated region for block: B:222:0x048f  */
    /* JADX WARNING: Removed duplicated region for block: B:242:0x0523  */
    /* JADX WARNING: Removed duplicated region for block: B:248:0x0538  */
    /* JADX WARNING: Removed duplicated region for block: B:261:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:267:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01a9  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x01e1  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0204  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A06() {
        /*
            r13 = this;
            boolean r0 = r13 instanceof X.C270344ga
            if (r0 == 0) goto L_0x02d8
            r6 = r13
            X.4ga r6 = (X.C270344ga) r6
            X.2d3 r2 = r6.A02
            boolean r0 = r2.A0u
            if (r0 == 0) goto L_0x0016
            X.XGS r1 = r6.A05
            int r0 = r2.A06()
            r1.A02(r0)
        L_0x0016:
            X.XGS r5 = r6.A05
            boolean r0 = r5.A0B
            if (r0 != 0) goto L_0x0079
            X.2d3 r7 = r6.A02
            java.lang.Integer[] r0 = r7.A14
            r3 = 1
            r2 = r0[r3]
            r6.A07 = r2
            boolean r0 = r7.A0q
            if (r0 == 0) goto L_0x0034
            X.XGR r1 = new X.XGR
            r1.<init>(r6)
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            r1.A06 = r0
            r6.A01 = r1
        L_0x0034:
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r2 == r0) goto L_0x00bb
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            if (r2 != r0) goto L_0x00b0
            X.2d3 r4 = r7.A0h
            if (r4 == 0) goto L_0x00b0
            java.lang.Integer[] r0 = r4.A14
            r1 = r0[r3]
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r1 != r0) goto L_0x00b0
            int r3 = r4.A06()
            X.2d6 r0 = r7.A0g
            int r2 = r0.A01()
            int r3 = r3 - r2
            X.2d6 r0 = r7.A0a
            int r0 = r0.A01()
            int r3 = r3 - r0
            X.Xuf r1 = r6.A04
            X.4ga r0 = r4.A0l
            X.Xuf r0 = r0.A04
            A03(r1, r0, r2)
            X.Xuf r2 = r6.A03
            X.4ga r0 = r4.A0l
            X.Xuf r1 = r0.A03
            X.2d3 r0 = r6.A02
            X.2d6 r0 = r0.A0a
        L_0x006d:
            int r0 = r0.A01()
            int r0 = -r0
            A03(r2, r1, r0)
            r5.A02(r3)
        L_0x0078:
            return
        L_0x0079:
            java.lang.Integer r1 = r6.A07
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            if (r1 != r0) goto L_0x00bb
            X.2d3 r3 = r6.A02
            X.2d3 r4 = r3.A0h
            if (r4 == 0) goto L_0x00bb
            java.lang.Integer[] r1 = r4.A14
            r0 = 1
            r1 = r1[r0]
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r1 != r0) goto L_0x00bb
            X.Xuf r2 = r6.A04
            X.4ga r0 = r4.A0l
            X.Xuf r1 = r0.A04
            X.2d6 r0 = r3.A0g
            int r0 = r0.A01()
            A03(r2, r1, r0)
            X.Xuf r3 = r6.A03
            X.4ga r0 = r4.A0l
            X.Xuf r1 = r0.A03
            X.2d3 r0 = r6.A02
            X.2d6 r0 = r0.A0a
            int r0 = r0.A01()
            int r0 = -r0
        L_0x00ac:
            A03(r3, r1, r0)
            return
        L_0x00b0:
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r2 != r0) goto L_0x00bb
            int r0 = r7.A06()
            r5.A02(r0)
        L_0x00bb:
            boolean r1 = r5.A0B
            r7 = 0
            r12 = 4
            r4 = 1
            r3 = 2
            r2 = 3
            if (r1 == 0) goto L_0x01a1
            X.2d3 r8 = r6.A02
            boolean r0 = r8.A0u
            if (r0 == 0) goto L_0x01a1
            X.2d6[] r10 = r8.A11
            r9 = r10[r3]
            X.2d6 r1 = r9.A04
            if (r1 == 0) goto L_0x012a
            r3 = r10[r2]
            X.2d6 r0 = r3.A04
            if (r0 == 0) goto L_0x012a
            boolean r0 = r8.A0Z()
            if (r0 == 0) goto L_0x00fc
            X.Xuf r1 = r6.A04
            int r0 = r9.A01()
            r1.A00 = r0
            X.Xuf r1 = r6.A03
            int r0 = r3.A01()
            int r0 = -r0
            r1.A00 = r0
        L_0x00ef:
            X.2d3 r2 = r6.A02
            boolean r0 = r2.A0q
            if (r0 == 0) goto L_0x0078
            X.Xuf r3 = r6.A00
            X.Xuf r1 = r6.A04
            int r0 = r2.A08
            goto L_0x00ac
        L_0x00fc:
            X.Xuf r3 = A01(r9)
            if (r3 == 0) goto L_0x010b
            X.Xuf r1 = r6.A04
            int r0 = r9.A01()
            A03(r1, r3, r0)
        L_0x010b:
            X.2d3 r0 = r6.A02
            X.2d6[] r0 = r0.A11
            r0 = r0[r2]
            X.Xuf r2 = A01(r0)
            if (r2 == 0) goto L_0x0121
            X.Xuf r1 = r6.A03
            int r0 = r0.A01()
            int r0 = -r0
            A03(r1, r2, r0)
        L_0x0121:
            X.Xuf r0 = r6.A04
            r0.A09 = r4
            X.Xuf r0 = r6.A03
            r0.A09 = r4
            goto L_0x00ef
        L_0x012a:
            if (r1 == 0) goto L_0x0143
            X.Xuf r2 = A01(r9)
            if (r2 == 0) goto L_0x0078
            X.Xuf r3 = r6.A04
            int r0 = r9.A01()
        L_0x0138:
            A03(r3, r2, r0)
            X.Xuf r1 = r6.A03
            int r0 = r5.A02
        L_0x013f:
            A03(r1, r3, r0)
            goto L_0x00ef
        L_0x0143:
            r2 = r10[r2]
            X.2d6 r0 = r2.A04
            if (r0 == 0) goto L_0x015f
            X.Xuf r1 = A01(r2)
            if (r1 == 0) goto L_0x00ef
            X.Xuf r3 = r6.A03
            int r0 = r2.A01()
            int r0 = -r0
            A03(r3, r1, r0)
            X.Xuf r1 = r6.A04
            int r0 = r5.A02
            int r0 = -r0
            goto L_0x013f
        L_0x015f:
            r1 = r10[r12]
            X.2d6 r0 = r1.A04
            if (r0 == 0) goto L_0x0180
            X.Xuf r0 = A01(r1)
            if (r0 == 0) goto L_0x0078
            X.Xuf r2 = r6.A00
            A03(r2, r0, r7)
            X.Xuf r1 = r6.A04
            X.2d3 r0 = r6.A02
            int r0 = r0.A08
            int r0 = -r0
            A03(r1, r2, r0)
            X.Xuf r3 = r6.A03
            int r0 = r5.A02
            goto L_0x00ac
        L_0x0180:
            boolean r0 = r8 instanceof X.AnonymousClass3MG
            if (r0 != 0) goto L_0x0078
            X.2d3 r0 = r8.A0h
            if (r0 == 0) goto L_0x0078
            X.2d5 r0 = X.2d5.A03
            X.2d6 r0 = r8.A0A(r0)
            X.2d6 r0 = r0.A04
            if (r0 != 0) goto L_0x0078
            X.2d3 r1 = r6.A02
            X.2d3 r0 = r1.A0h
            X.4ga r0 = r0.A0l
            X.Xuf r2 = r0.A04
            X.Xuf r3 = r6.A04
            int r0 = r1.A09()
            goto L_0x0138
        L_0x01a1:
            if (r1 != 0) goto L_0x02d3
            java.lang.Integer r1 = r6.A07
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r1 != r0) goto L_0x02d3
            X.2d3 r1 = r6.A02
            int r0 = r1.A0G
            if (r0 == r3) goto L_0x02cb
            if (r0 != r2) goto L_0x01d7
            boolean r0 = r1.A0Z()
            if (r0 != 0) goto L_0x01d7
            int r0 = r1.A0H
            if (r0 == r2) goto L_0x01d7
            X.4gX r0 = r1.A0k
        L_0x01bd:
            X.XGS r1 = r0.A05
            java.util.List r0 = r5.A08
            r0.add(r1)
            java.util.List r0 = r1.A07
            r0.add(r5)
            r5.A09 = r4
            java.util.List r1 = r5.A07
            X.Xuf r0 = r6.A04
            r1.add(r0)
            X.Xuf r0 = r6.A03
            r1.add(r0)
        L_0x01d7:
            X.2d3 r9 = r6.A02
            X.2d6[] r1 = r9.A11
            r8 = r1[r3]
            X.2d6 r11 = r8.A04
            if (r11 == 0) goto L_0x022f
            r3 = r1[r2]
            X.2d6 r0 = r3.A04
            if (r0 == 0) goto L_0x022f
            boolean r0 = r9.A0Z()
            if (r0 == 0) goto L_0x0218
            X.Xuf r1 = r6.A04
            int r0 = r8.A01()
            r1.A00 = r0
            X.Xuf r1 = r6.A03
            int r0 = r3.A01()
            int r0 = -r0
            r1.A00 = r0
        L_0x01fe:
            X.2d3 r0 = r6.A02
            boolean r0 = r0.A0q
            if (r0 == 0) goto L_0x020d
            X.Xuf r2 = r6.A00
            X.Xuf r1 = r6.A04
            X.XGS r0 = r6.A01
        L_0x020a:
            r6.A0A(r2, r1, r0, r4)
        L_0x020d:
            java.util.List r0 = r5.A08
            int r0 = r0.size()
            if (r0 != 0) goto L_0x0078
            r5.A0A = r4
            return
        L_0x0218:
            X.Xuf r1 = A01(r8)
            X.Xuf r0 = A01(r3)
            if (r1 == 0) goto L_0x0225
            r1.A03(r6)
        L_0x0225:
            if (r0 == 0) goto L_0x022a
            r0.A03(r6)
        L_0x022a:
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            r6.A08 = r0
            goto L_0x01fe
        L_0x022f:
            r10 = 0
            if (r11 == 0) goto L_0x027c
            X.Xuf r1 = A01(r8)
            if (r1 == 0) goto L_0x020d
            X.Xuf r2 = r6.A04
            int r0 = r8.A01()
        L_0x023e:
            A03(r2, r1, r0)
            X.Xuf r0 = r6.A03
            r6.A0A(r0, r2, r5, r4)
            X.2d3 r0 = r6.A02
            boolean r0 = r0.A0q
            if (r0 == 0) goto L_0x0253
            X.Xuf r1 = r6.A00
            X.XGS r0 = r6.A01
            r6.A0A(r1, r2, r0, r4)
        L_0x0253:
            java.lang.Integer r0 = r6.A07
            java.lang.Integer r2 = X.AnonymousClass05K.A0C
            if (r0 != r2) goto L_0x020d
            X.2d3 r1 = r6.A02
            float r0 = r1.A01
            int r0 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r0 <= 0) goto L_0x020d
            X.4gX r1 = r1.A0k
            java.lang.Integer r0 = r1.A07
            if (r0 != r2) goto L_0x020d
            X.XGS r0 = r1.A05
            java.util.List r0 = r0.A07
            r0.add(r5)
            java.util.List r1 = r5.A08
            X.2d3 r0 = r6.A02
            X.4gX r0 = r0.A0k
            X.XGS r0 = r0.A05
            r1.add(r0)
            r5.A03 = r6
            goto L_0x020d
        L_0x027c:
            r8 = r1[r2]
            X.2d6 r0 = r8.A04
            r3 = -1
            if (r0 == 0) goto L_0x029a
            X.Xuf r2 = A01(r8)
            if (r2 == 0) goto L_0x020d
            X.Xuf r1 = r6.A03
            int r0 = r8.A01()
            int r0 = -r0
            A03(r1, r2, r0)
            X.Xuf r0 = r6.A04
            r6.A0A(r0, r1, r5, r3)
            goto L_0x01fe
        L_0x029a:
            r1 = r1[r12]
            X.2d6 r0 = r1.A04
            if (r0 == 0) goto L_0x02b7
            X.Xuf r0 = A01(r1)
            if (r0 == 0) goto L_0x020d
            X.Xuf r2 = r6.A00
            A03(r2, r0, r7)
            X.Xuf r1 = r6.A04
            X.XGS r0 = r6.A01
            r6.A0A(r1, r2, r0, r3)
            X.Xuf r2 = r6.A03
            r0 = r5
            goto L_0x020a
        L_0x02b7:
            boolean r0 = r9 instanceof X.AnonymousClass3MG
            if (r0 != 0) goto L_0x020d
            X.2d3 r0 = r9.A0h
            if (r0 == 0) goto L_0x020d
            X.4ga r0 = r0.A0l
            X.Xuf r1 = r0.A04
            X.Xuf r2 = r6.A04
            int r0 = r9.A09()
            goto L_0x023e
        L_0x02cb:
            X.2d3 r0 = r1.A0h
            if (r0 == 0) goto L_0x01d7
            X.4ga r0 = r0.A0l
            goto L_0x01bd
        L_0x02d3:
            r5.A03(r6)
            goto L_0x01d7
        L_0x02d8:
            X.2d3 r2 = r13.A02
            boolean r0 = r2.A0u
            if (r0 == 0) goto L_0x02e7
            X.XGS r1 = r13.A05
            int r0 = r2.A07()
            r1.A02(r0)
        L_0x02e7:
            X.XGS r5 = r13.A05
            boolean r0 = r5.A0B
            if (r0 != 0) goto L_0x0333
            X.2d3 r6 = r13.A02
            java.lang.Integer[] r0 = r6.A14
            r1 = 0
            r3 = r0[r1]
            r13.A07 = r3
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r3 == r0) goto L_0x0377
            java.lang.Integer r2 = X.AnonymousClass05K.A0N
            if (r3 != r2) goto L_0x036c
            X.2d3 r4 = r6.A0h
            if (r4 == 0) goto L_0x036c
            java.lang.Integer[] r0 = r4.A14
            r1 = r0[r1]
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r1 == r0) goto L_0x030c
            if (r1 != r2) goto L_0x036c
        L_0x030c:
            int r3 = r4.A07()
            X.2d6 r0 = r6.A0e
            int r2 = r0.A01()
            int r3 = r3 - r2
            X.2d6 r0 = r6.A0f
            int r0 = r0.A01()
            int r3 = r3 - r0
            X.Xuf r1 = r13.A04
            X.4gX r0 = r4.A0k
            X.Xuf r0 = r0.A04
            A03(r1, r0, r2)
            X.Xuf r2 = r13.A03
            X.4gX r0 = r4.A0k
            X.Xuf r1 = r0.A03
            X.2d3 r0 = r13.A02
            X.2d6 r0 = r0.A0f
            goto L_0x006d
        L_0x0333:
            java.lang.Integer r0 = r13.A07
            java.lang.Integer r2 = X.AnonymousClass05K.A0N
            if (r0 != r2) goto L_0x0377
            X.2d3 r4 = r13.A02
            X.2d3 r3 = r4.A0h
            if (r3 == 0) goto L_0x0377
            java.lang.Integer[] r1 = r3.A14
            r0 = 0
            r1 = r1[r0]
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r1 == r0) goto L_0x034a
            if (r1 != r2) goto L_0x0377
        L_0x034a:
            X.Xuf r2 = r13.A04
            X.4gX r0 = r3.A0k
            X.Xuf r1 = r0.A04
            X.2d6 r0 = r4.A0e
            int r0 = r0.A01()
            A03(r2, r1, r0)
            X.Xuf r1 = r13.A03
            X.4gX r0 = r3.A0k
            X.Xuf r3 = r0.A03
            X.2d3 r0 = r13.A02
            X.2d6 r0 = r0.A0f
            int r0 = r0.A01()
        L_0x0367:
            int r0 = -r0
        L_0x0368:
            A03(r1, r3, r0)
            return
        L_0x036c:
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r3 != r0) goto L_0x0377
            int r0 = r6.A07()
            r5.A02(r0)
        L_0x0377:
            boolean r0 = r5.A0B
            r7 = 0
            r4 = 1
            if (r0 == 0) goto L_0x0418
            X.2d3 r6 = r13.A02
            boolean r0 = r6.A0u
            if (r0 == 0) goto L_0x0418
            X.2d6[] r2 = r6.A11
            r7 = r2[r7]
            X.2d6 r1 = r7.A04
            if (r1 == 0) goto L_0x03c5
            r3 = r2[r4]
            X.2d6 r0 = r3.A04
            if (r0 == 0) goto L_0x03c5
            boolean r0 = r6.A0Y()
            if (r0 != 0) goto L_0x0565
            X.Xuf r2 = A01(r7)
            if (r2 == 0) goto L_0x03a6
            X.Xuf r1 = r13.A04
            int r0 = r7.A01()
            A03(r1, r2, r0)
        L_0x03a6:
            X.2d3 r0 = r13.A02
            X.2d6[] r0 = r0.A11
            r0 = r0[r4]
            X.Xuf r2 = A01(r0)
            if (r2 == 0) goto L_0x03bc
            X.Xuf r1 = r13.A03
            int r0 = r0.A01()
            int r0 = -r0
            A03(r1, r2, r0)
        L_0x03bc:
            X.Xuf r0 = r13.A04
            r0.A09 = r4
            X.Xuf r0 = r13.A03
            r0.A09 = r4
            return
        L_0x03c5:
            if (r1 == 0) goto L_0x03db
            X.Xuf r2 = A01(r7)
            if (r2 == 0) goto L_0x0078
            X.Xuf r3 = r13.A04
            int r0 = r7.A01()
        L_0x03d3:
            A03(r3, r2, r0)
            X.Xuf r1 = r13.A03
            int r0 = r5.A02
            goto L_0x0368
        L_0x03db:
            r2 = r2[r4]
            X.2d6 r0 = r2.A04
            if (r0 == 0) goto L_0x03f7
            X.Xuf r1 = A01(r2)
            if (r1 == 0) goto L_0x0078
            X.Xuf r3 = r13.A03
            int r0 = r2.A01()
            int r0 = -r0
            A03(r3, r1, r0)
            X.Xuf r1 = r13.A04
            int r0 = r5.A02
            goto L_0x0367
        L_0x03f7:
            boolean r0 = r6 instanceof X.AnonymousClass3MG
            if (r0 != 0) goto L_0x0078
            X.2d3 r0 = r6.A0h
            if (r0 == 0) goto L_0x0078
            X.2d5 r0 = X.2d5.A03
            X.2d6 r0 = r6.A0A(r0)
            X.2d6 r0 = r0.A04
            if (r0 != 0) goto L_0x0078
            X.2d3 r1 = r13.A02
            X.2d3 r0 = r1.A0h
            X.4gX r0 = r0.A0k
            X.Xuf r2 = r0.A04
            X.Xuf r3 = r13.A04
            int r0 = r1.A08()
            goto L_0x03d3
        L_0x0418:
            java.lang.Integer r1 = r13.A07
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r1 != r0) goto L_0x0485
            X.2d3 r3 = r13.A02
            int r2 = r3.A0H
            r0 = 2
            if (r2 == r0) goto L_0x0502
            r1 = 3
            if (r2 != r1) goto L_0x0485
            int r0 = r3.A0G
            if (r0 != r1) goto L_0x04c8
            X.Xuf r0 = r13.A04
            r0.A03 = r13
            X.Xuf r0 = r13.A03
            r0.A03 = r13
            X.4ga r1 = r3.A0l
            X.Xuf r0 = r1.A04
            r0.A03 = r13
            X.Xuf r0 = r1.A03
            r0.A03 = r13
            r5.A03 = r13
            boolean r0 = r3.A0Z()
            if (r0 == 0) goto L_0x04b2
            java.util.List r2 = r5.A08
            X.XGS r0 = r1.A05
            r2.add(r0)
            X.2d3 r0 = r13.A02
            X.4ga r0 = r0.A0l
            X.XGS r0 = r0.A05
            java.util.List r0 = r0.A07
            r0.add(r5)
            X.2d3 r0 = r13.A02
            X.4ga r1 = r0.A0l
            X.XGS r0 = r1.A05
            r0.A03 = r13
            X.Xuf r0 = r1.A04
            r2.add(r0)
            X.2d3 r0 = r13.A02
            X.4ga r0 = r0.A0l
            X.Xuf r0 = r0.A03
            r2.add(r0)
            X.2d3 r0 = r13.A02
            X.4ga r0 = r0.A0l
            X.Xuf r0 = r0.A04
            java.util.List r0 = r0.A07
            r0.add(r5)
            X.2d3 r0 = r13.A02
            X.4ga r0 = r0.A0l
            X.Xuf r0 = r0.A03
            java.util.List r1 = r0.A07
        L_0x0481:
            r0 = r5
        L_0x0482:
            r1.add(r0)
        L_0x0485:
            X.2d3 r6 = r13.A02
            X.2d6[] r2 = r6.A11
            r7 = r2[r7]
            X.2d6 r1 = r7.A04
            if (r1 == 0) goto L_0x0521
            r3 = r2[r4]
            X.2d6 r0 = r3.A04
            if (r0 == 0) goto L_0x0521
            boolean r0 = r6.A0Y()
            if (r0 != 0) goto L_0x0565
            X.Xuf r1 = A01(r7)
            X.Xuf r0 = A01(r3)
            if (r1 == 0) goto L_0x04a8
            r1.A03(r13)
        L_0x04a8:
            if (r0 == 0) goto L_0x04ad
            r0.A03(r13)
        L_0x04ad:
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            r13.A08 = r0
            return
        L_0x04b2:
            boolean r0 = r3.A0Y()
            X.XGS r1 = r1.A05
            if (r0 == 0) goto L_0x04ff
            java.util.List r0 = r1.A08
            r0.add(r5)
            java.util.List r1 = r5.A07
            X.2d3 r0 = r13.A02
            X.4ga r0 = r0.A0l
            X.XGS r0 = r0.A05
            goto L_0x0482
        L_0x04c8:
            X.4ga r0 = r3.A0l
            X.XGS r1 = r0.A05
            java.util.List r0 = r5.A08
            r0.add(r1)
            java.util.List r0 = r1.A07
            r0.add(r5)
            X.2d3 r0 = r13.A02
            X.4ga r0 = r0.A0l
            X.Xuf r0 = r0.A04
            java.util.List r0 = r0.A07
            r0.add(r5)
            X.2d3 r0 = r13.A02
            X.4ga r0 = r0.A0l
            X.Xuf r0 = r0.A03
            java.util.List r0 = r0.A07
            r0.add(r5)
            r5.A09 = r4
            java.util.List r2 = r5.A07
            X.Xuf r0 = r13.A04
            r2.add(r0)
            X.Xuf r1 = r13.A03
            r2.add(r1)
            java.util.List r0 = r0.A08
            r0.add(r5)
        L_0x04ff:
            java.util.List r1 = r1.A08
            goto L_0x0481
        L_0x0502:
            X.2d3 r0 = r3.A0h
            if (r0 == 0) goto L_0x0485
            X.4ga r0 = r0.A0l
            X.XGS r1 = r0.A05
            java.util.List r0 = r5.A08
            r0.add(r1)
            java.util.List r0 = r1.A07
            r0.add(r5)
            r5.A09 = r4
            java.util.List r1 = r5.A07
            X.Xuf r0 = r13.A04
            r1.add(r0)
            X.Xuf r0 = r13.A03
            goto L_0x0482
        L_0x0521:
            if (r1 == 0) goto L_0x0538
            X.Xuf r1 = A01(r7)
            if (r1 == 0) goto L_0x0078
            X.Xuf r3 = r13.A04
            int r0 = r7.A01()
        L_0x052f:
            A03(r3, r1, r0)
            X.Xuf r0 = r13.A03
        L_0x0534:
            r13.A0A(r0, r3, r5, r4)
            return
        L_0x0538:
            r2 = r2[r4]
            X.2d6 r0 = r2.A04
            if (r0 == 0) goto L_0x0552
            X.Xuf r1 = A01(r2)
            if (r1 == 0) goto L_0x0078
            X.Xuf r3 = r13.A03
            int r0 = r2.A01()
            int r0 = -r0
            A03(r3, r1, r0)
            X.Xuf r0 = r13.A04
            r4 = -1
            goto L_0x0534
        L_0x0552:
            boolean r0 = r6 instanceof X.AnonymousClass3MG
            if (r0 != 0) goto L_0x0078
            X.2d3 r0 = r6.A0h
            if (r0 == 0) goto L_0x0078
            X.4gX r0 = r0.A0k
            X.Xuf r1 = r0.A04
            X.Xuf r3 = r13.A04
            int r0 = r6.A08()
            goto L_0x052f
        L_0x0565:
            X.Xuf r1 = r13.A04
            int r0 = r7.A01()
            r1.A00 = r0
            X.Xuf r1 = r13.A03
            int r0 = r3.A01()
            int r0 = -r0
            r1.A00 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C270324gY.A06():void");
    }

    public void A07() {
        boolean z = this instanceof C270344ga;
        C22054Xuf xuf = this.A04;
        boolean z2 = xuf.A0B;
        if (z) {
            if (z2) {
                this.A02.A0W = xuf.A02;
            }
        } else if (z2) {
            this.A02.A0V = xuf.A02;
        }
    }

    public void A08() {
        if (this instanceof C270344ga) {
            C270344ga r1 = (C270344ga) this;
            r1.A06 = null;
            r1.A04.A01();
            r1.A03.A01();
            r1.A00.A01();
            r1.A05.A01();
            r1.A09 = false;
            return;
        }
        this.A06 = null;
        this.A04.A01();
        this.A03.A01();
        this.A05.A01();
        this.A09 = false;
    }

    public final void A0A(C22054Xuf xuf, C22054Xuf xuf2, XGS xgs, int i) {
        List list = xuf.A08;
        list.add(xuf2);
        list.add(this.A05);
        xuf.A01 = i;
        xuf.A04 = xgs;
        xuf2.A07.add(xuf);
        xgs.A07.add(xuf);
    }

    public boolean A0B() {
        int i;
        boolean z = this instanceof C270344ga;
        Integer num = this.A07;
        Integer num2 = AnonymousClass05K.A0C;
        if (z) {
            if (num != num2) {
                return true;
            }
            i = this.A02.A0G;
        } else if (num != num2) {
            return true;
        } else {
            i = this.A02.A0H;
        }
        if (i != 0) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0238, code lost:
        if (r9 != false) goto L_0x023a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x028c, code lost:
        if (r11 != false) goto L_0x028e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x0313, code lost:
        if (r1.A0Y() == false) goto L_0x032c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x032a, code lost:
        if (r1.A0Z() == false) goto L_0x032c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void FJM(X.C270334gZ r22) {
        /*
            r21 = this;
            r5 = r21
            boolean r1 = r5 instanceof X.C270344ga
            java.lang.Integer r0 = r5.A08
            int r0 = r0.intValue()
            if (r1 == 0) goto L_0x0086
            r8 = 3
            r2 = 2
            r3 = 1
            if (r0 == r3) goto L_0x001f
            if (r0 == r2) goto L_0x001f
            if (r0 != r8) goto L_0x001f
            X.2d3 r0 = r5.A02
            X.2d6 r1 = r0.A0g
            X.2d6 r0 = r0.A0a
            r5.A09(r1, r0, r3)
        L_0x001e:
            return
        L_0x001f:
            X.XGS r6 = r5.A05
            boolean r0 = r6.A0A
            r12 = 1056964608(0x3f000000, float:0.5)
            r4 = 0
            if (r0 == 0) goto L_0x0054
            boolean r0 = r6.A0B
            if (r0 != 0) goto L_0x0054
            java.lang.Integer r1 = r5.A07
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r1 != r0) goto L_0x0054
            X.2d3 r7 = r5.A02
            int r0 = r7.A0G
            if (r0 == r2) goto L_0x0074
            if (r0 != r8) goto L_0x0054
            X.4gX r0 = r7.A0k
            X.XGS r2 = r0.A05
            boolean r0 = r2.A0B
            if (r0 == 0) goto L_0x0054
            int r1 = r7.A09
            r0 = -1
            if (r1 == r0) goto L_0x006d
            if (r1 != 0) goto L_0x006d
            int r0 = r2.A02
            float r1 = (float) r0
            float r0 = r7.A01
        L_0x004e:
            float r1 = r1 * r0
        L_0x004f:
            float r1 = r1 + r12
            int r0 = (int) r1
            r6.A02(r0)
        L_0x0054:
            X.Xuf r8 = r5.A04
            boolean r0 = r8.A0A
            if (r0 == 0) goto L_0x001e
            X.Xuf r7 = r5.A03
            boolean r0 = r7.A0A
            if (r0 == 0) goto L_0x001e
            boolean r0 = r8.A0B
            if (r0 == 0) goto L_0x0316
            boolean r0 = r7.A0B
            if (r0 == 0) goto L_0x0316
            boolean r0 = r6.A0B
            if (r0 == 0) goto L_0x0316
            return
        L_0x006d:
            int r0 = r2.A02
            float r1 = (float) r0
            float r0 = r7.A01
            float r1 = r1 / r0
            goto L_0x004f
        L_0x0074:
            X.2d3 r0 = r7.A0h
            if (r0 == 0) goto L_0x0054
            X.4ga r0 = r0.A0l
            X.XGS r1 = r0.A05
            boolean r0 = r1.A0B
            if (r0 == 0) goto L_0x0054
            float r0 = r7.A03
            int r1 = r1.A02
            float r1 = (float) r1
            goto L_0x004e
        L_0x0086:
            r7 = 2
            r8 = 3
            r3 = 1
            r4 = 0
            if (r0 == r3) goto L_0x009a
            if (r0 == r7) goto L_0x009a
            if (r0 != r8) goto L_0x009a
            X.2d3 r0 = r5.A02
            X.2d6 r1 = r0.A0e
            X.2d6 r0 = r0.A0f
            r5.A09(r1, r0, r4)
            return
        L_0x009a:
            X.XGS r6 = r5.A05
            boolean r0 = r6.A0B
            r13 = 1056964608(0x3f000000, float:0.5)
            if (r0 != 0) goto L_0x00cc
            java.lang.Integer r1 = r5.A07
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r1 != r0) goto L_0x00cc
            X.2d3 r2 = r5.A02
            int r0 = r2.A0H
            if (r0 == r7) goto L_0x02eb
            if (r0 != r8) goto L_0x00cc
            int r0 = r2.A0G
            r7 = -1
            if (r0 == 0) goto L_0x00f0
            if (r0 == r8) goto L_0x00f0
            int r0 = r2.A09
            if (r0 == r7) goto L_0x00e5
            if (r0 != 0) goto L_0x00e5
            X.4ga r0 = r2.A0l
            X.XGS r0 = r0.A05
            int r0 = r0.A02
            float r1 = (float) r0
            float r0 = r2.A01
            float r1 = r1 / r0
        L_0x00c7:
            float r1 = r1 + r13
            int r0 = (int) r1
            r6.A02(r0)
        L_0x00cc:
            X.Xuf r8 = r5.A04
            boolean r0 = r8.A0A
            if (r0 == 0) goto L_0x001e
            X.Xuf r7 = r5.A03
            boolean r0 = r7.A0A
            if (r0 == 0) goto L_0x001e
            boolean r0 = r8.A0B
            if (r0 == 0) goto L_0x02ff
            boolean r0 = r7.A0B
            if (r0 == 0) goto L_0x02ff
            boolean r0 = r6.A0B
            if (r0 == 0) goto L_0x02ff
            return
        L_0x00e5:
            X.4ga r0 = r2.A0l
            X.XGS r0 = r0.A05
            int r0 = r0.A02
            float r1 = (float) r0
            float r2 = r2.A01
            goto L_0x02fc
        L_0x00f0:
            X.4ga r0 = r2.A0l
            X.Xuf r1 = r0.A04
            X.Xuf r10 = r0.A03
            X.2d6 r0 = r2.A0e
            X.2d6 r0 = r0.A04
            r12 = 0
            if (r0 == 0) goto L_0x00fe
            r12 = 1
        L_0x00fe:
            X.2d6 r0 = r2.A0g
            X.2d6 r0 = r0.A04
            r11 = 0
            if (r0 == 0) goto L_0x0106
            r11 = 1
        L_0x0106:
            X.2d6 r0 = r2.A0f
            X.2d6 r0 = r0.A04
            r9 = 0
            if (r0 == 0) goto L_0x010e
            r9 = 1
        L_0x010e:
            X.2d6 r0 = r2.A0a
            X.2d6 r8 = r0.A04
            r0 = 0
            if (r8 == 0) goto L_0x0116
            r0 = 1
        L_0x0116:
            int r8 = r2.A09
            if (r12 == 0) goto L_0x028c
            if (r11 == 0) goto L_0x0238
            if (r9 == 0) goto L_0x028e
            if (r0 == 0) goto L_0x023a
            float r15 = r2.A01
            boolean r0 = r1.A0B
            if (r0 == 0) goto L_0x017a
            boolean r0 = r10.A0B
            if (r0 == 0) goto L_0x017a
            X.Xuf r7 = r5.A04
            boolean r0 = r7.A0A
            if (r0 == 0) goto L_0x001e
            X.Xuf r2 = r5.A03
            boolean r0 = r2.A0A
            if (r0 == 0) goto L_0x001e
            java.util.List r0 = r7.A08
            java.lang.Object r0 = r0.get(r4)
            X.Xuf r0 = (X.C22054Xuf) r0
            int r9 = r0.A02
            int r0 = r7.A00
            int r9 = r9 + r0
            java.util.List r0 = r2.A08
            java.lang.Object r0 = r0.get(r4)
            X.Xuf r0 = (X.C22054Xuf) r0
            int r7 = r0.A02
            int r0 = r2.A00
            int r7 = r7 - r0
            int r2 = r1.A02
            int r0 = r1.A00
            int r2 = r2 + r0
            int r1 = r10.A02
            int r0 = r10.A00
            int r1 = r1 - r0
            int[] r14 = X.C270314gX.A00
            r17 = r7
            r18 = r2
            r19 = r1
            r20 = r8
            r16 = r9
            X.C270314gX.A00(r14, r15, r16, r17, r18, r19, r20)
            r0 = r14[r4]
            r6.A02(r0)
            X.2d3 r0 = r5.A02
            X.4ga r0 = r0.A0l
            X.XGS r1 = r0.A05
            r0 = r14[r3]
            r1.A02(r0)
            return
        L_0x017a:
            X.Xuf r7 = r5.A04
            boolean r0 = r7.A0B
            if (r0 == 0) goto L_0x01d1
            X.Xuf r2 = r5.A03
            boolean r0 = r2.A0B
            if (r0 == 0) goto L_0x01d1
            boolean r0 = r1.A0A
            if (r0 == 0) goto L_0x001e
            boolean r0 = r10.A0A
            if (r0 == 0) goto L_0x001e
            int r12 = r7.A02
            int r0 = r7.A00
            int r12 = r12 + r0
            int r11 = r2.A02
            int r0 = r2.A00
            int r11 = r11 - r0
            java.util.List r0 = r1.A08
            java.lang.Object r0 = r0.get(r4)
            X.Xuf r0 = (X.C22054Xuf) r0
            int r9 = r0.A02
            int r0 = r1.A00
            int r9 = r9 + r0
            java.util.List r0 = r10.A08
            java.lang.Object r0 = r0.get(r4)
            X.Xuf r0 = (X.C22054Xuf) r0
            int r2 = r0.A02
            int r0 = r10.A00
            int r2 = r2 - r0
            int[] r14 = X.C270314gX.A00
            r17 = r11
            r18 = r9
            r19 = r2
            r20 = r8
            r16 = r12
            X.C270314gX.A00(r14, r15, r16, r17, r18, r19, r20)
            r0 = r14[r4]
            r6.A02(r0)
            X.2d3 r0 = r5.A02
            X.4ga r0 = r0.A0l
            X.XGS r2 = r0.A05
            r0 = r14[r3]
            r2.A02(r0)
        L_0x01d1:
            boolean r0 = r7.A0A
            if (r0 == 0) goto L_0x001e
            X.Xuf r2 = r5.A03
            boolean r0 = r2.A0A
            if (r0 == 0) goto L_0x001e
            boolean r0 = r1.A0A
            if (r0 == 0) goto L_0x001e
            boolean r0 = r10.A0A
            if (r0 == 0) goto L_0x001e
            java.util.List r0 = r7.A08
            java.lang.Object r0 = r0.get(r4)
            X.Xuf r0 = (X.C22054Xuf) r0
            int r9 = r0.A02
            int r0 = r7.A00
            int r9 = r9 + r0
            java.util.List r0 = r2.A08
            java.lang.Object r0 = r0.get(r4)
            X.Xuf r0 = (X.C22054Xuf) r0
            int r7 = r0.A02
            int r0 = r2.A00
            int r7 = r7 - r0
            java.util.List r0 = r1.A08
            java.lang.Object r0 = r0.get(r4)
            X.Xuf r0 = (X.C22054Xuf) r0
            int r2 = r0.A02
            int r0 = r1.A00
            int r2 = r2 + r0
            java.util.List r0 = r10.A08
            java.lang.Object r0 = r0.get(r4)
            X.Xuf r0 = (X.C22054Xuf) r0
            int r1 = r0.A02
            int r0 = r10.A00
            int r1 = r1 - r0
            int[] r14 = X.C270314gX.A00
            r17 = r7
            r18 = r2
            r19 = r1
            r20 = r8
            r16 = r9
            X.C270314gX.A00(r14, r15, r16, r17, r18, r19, r20)
            r0 = r14[r4]
            r6.A02(r0)
            X.2d3 r0 = r5.A02
            X.4ga r0 = r0.A0l
            X.XGS r1 = r0.A05
            r0 = r14[r3]
            r1.A02(r0)
            goto L_0x00cc
        L_0x0238:
            if (r9 == 0) goto L_0x00cc
        L_0x023a:
            X.Xuf r1 = r5.A04
            boolean r0 = r1.A0A
            if (r0 == 0) goto L_0x001e
            X.Xuf r10 = r5.A03
            boolean r0 = r10.A0A
            if (r0 == 0) goto L_0x001e
            float r2 = r2.A01
            java.util.List r0 = r1.A08
            java.lang.Object r0 = r0.get(r4)
            X.Xuf r0 = (X.C22054Xuf) r0
            int r9 = r0.A02
            int r0 = r1.A00
            int r9 = r9 + r0
            java.util.List r0 = r10.A08
            java.lang.Object r0 = r0.get(r4)
            X.Xuf r0 = (X.C22054Xuf) r0
            int r1 = r0.A02
            int r0 = r10.A00
            int r1 = r1 - r0
            if (r8 == r7) goto L_0x027a
            if (r8 == 0) goto L_0x027a
            int r1 = r1 - r9
            int r1 = r5.A04(r1, r4)
            float r0 = (float) r1
            float r0 = r0 / r2
            float r0 = r0 + r13
            int r0 = (int) r0
            int r7 = r5.A04(r0, r3)
            if (r0 == r7) goto L_0x02cb
            float r0 = (float) r7
            float r0 = r0 * r2
        L_0x0277:
            float r0 = r0 + r13
            int r1 = (int) r0
            goto L_0x02cb
        L_0x027a:
            int r1 = r1 - r9
            int r1 = r5.A04(r1, r4)
            float r0 = (float) r1
            float r0 = r0 * r2
            float r0 = r0 + r13
            int r0 = (int) r0
            int r7 = r5.A04(r0, r3)
            if (r0 == r7) goto L_0x02cb
            float r0 = (float) r7
            float r0 = r0 / r2
            goto L_0x0277
        L_0x028c:
            if (r11 == 0) goto L_0x00cc
        L_0x028e:
            if (r0 == 0) goto L_0x00cc
            boolean r0 = r1.A0A
            if (r0 == 0) goto L_0x001e
            boolean r0 = r10.A0A
            if (r0 == 0) goto L_0x001e
            float r2 = r2.A01
            java.util.List r0 = r1.A08
            java.lang.Object r0 = r0.get(r4)
            X.Xuf r0 = (X.C22054Xuf) r0
            int r9 = r0.A02
            int r0 = r1.A00
            int r9 = r9 + r0
            java.util.List r0 = r10.A08
            java.lang.Object r0 = r0.get(r4)
            X.Xuf r0 = (X.C22054Xuf) r0
            int r1 = r0.A02
            int r0 = r10.A00
            int r1 = r1 - r0
            if (r8 == r7) goto L_0x02d9
            if (r8 != 0) goto L_0x02d9
            int r1 = r1 - r9
            int r7 = r5.A04(r1, r3)
            float r0 = (float) r7
            float r0 = r0 * r2
            float r0 = r0 + r13
            int r0 = (int) r0
            int r1 = r5.A04(r0, r4)
            if (r0 == r1) goto L_0x02cb
            float r0 = (float) r1
            float r0 = r0 / r2
        L_0x02c9:
            float r0 = r0 + r13
            int r7 = (int) r0
        L_0x02cb:
            r6.A02(r1)
            X.2d3 r0 = r5.A02
            X.4ga r0 = r0.A0l
            X.XGS r0 = r0.A05
            r0.A02(r7)
            goto L_0x00cc
        L_0x02d9:
            int r1 = r1 - r9
            int r7 = r5.A04(r1, r3)
            float r0 = (float) r7
            float r0 = r0 / r2
            float r0 = r0 + r13
            int r0 = (int) r0
            int r1 = r5.A04(r0, r4)
            if (r0 == r1) goto L_0x02cb
            float r0 = (float) r1
            float r0 = r0 * r2
            goto L_0x02c9
        L_0x02eb:
            X.2d3 r0 = r2.A0h
            if (r0 == 0) goto L_0x00cc
            X.4gX r0 = r0.A0k
            X.XGS r1 = r0.A05
            boolean r0 = r1.A0B
            if (r0 == 0) goto L_0x00cc
            float r2 = r2.A04
            int r0 = r1.A02
            float r1 = (float) r0
        L_0x02fc:
            float r1 = r1 * r2
            goto L_0x00c7
        L_0x02ff:
            boolean r2 = r6.A0B
            if (r2 != 0) goto L_0x03ce
            java.lang.Integer r1 = r5.A07
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r1 != r0) goto L_0x03ce
            X.2d3 r1 = r5.A02
            int r0 = r1.A0H
            if (r0 != 0) goto L_0x03ce
            boolean r0 = r1.A0Y()
            if (r0 != 0) goto L_0x03ce
            goto L_0x032c
        L_0x0316:
            boolean r2 = r6.A0B
            if (r2 != 0) goto L_0x0352
            java.lang.Integer r1 = r5.A07
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r1 != r0) goto L_0x0352
            X.2d3 r1 = r5.A02
            int r0 = r1.A0H
            if (r0 != 0) goto L_0x0352
            boolean r0 = r1.A0Z()
            if (r0 != 0) goto L_0x0352
        L_0x032c:
            java.util.List r0 = r8.A08
            java.lang.Object r2 = r0.get(r4)
            X.Xuf r2 = (X.C22054Xuf) r2
            java.util.List r0 = r7.A08
            java.lang.Object r1 = r0.get(r4)
            X.Xuf r1 = (X.C22054Xuf) r1
            int r2 = r2.A02
            int r0 = r8.A00
            int r2 = r2 + r0
            int r1 = r1.A02
            int r0 = r7.A00
            int r1 = r1 + r0
            int r0 = r1 - r2
            r8.A02(r2)
            r7.A02(r1)
            r6.A02(r0)
            return
        L_0x0352:
            if (r2 != 0) goto L_0x038c
            java.lang.Integer r1 = r5.A07
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r1 != r0) goto L_0x038c
            int r0 = r5.A00
            if (r0 != r3) goto L_0x038c
            java.util.List r2 = r8.A08
            int r0 = r2.size()
            if (r0 <= 0) goto L_0x038c
            java.util.List r1 = r7.A08
            int r0 = r1.size()
            if (r0 <= 0) goto L_0x038c
            java.lang.Object r0 = r2.get(r4)
            X.Xuf r0 = (X.C22054Xuf) r0
            java.lang.Object r1 = r1.get(r4)
            X.Xuf r1 = (X.C22054Xuf) r1
            int r2 = r0.A02
            int r0 = r8.A00
            int r2 = r2 + r0
            int r1 = r1.A02
            int r0 = r7.A00
            int r1 = r1 + r0
            int r1 = r1 - r2
            int r0 = r6.A00
            if (r1 >= r0) goto L_0x03ca
            r6.A02(r1)
        L_0x038c:
            boolean r0 = r6.A0B
            if (r0 == 0) goto L_0x001e
            java.util.List r2 = r8.A08
            int r0 = r2.size()
            if (r0 <= 0) goto L_0x001e
            java.util.List r1 = r7.A08
            int r0 = r1.size()
            if (r0 <= 0) goto L_0x001e
            java.lang.Object r11 = r2.get(r4)
            X.Xuf r11 = (X.C22054Xuf) r11
            java.lang.Object r10 = r1.get(r4)
            X.Xuf r10 = (X.C22054Xuf) r10
            int r9 = r11.A02
            int r0 = r8.A00
            int r4 = r9 + r0
            int r1 = r10.A02
            int r0 = r7.A00
            int r3 = r1 + r0
            X.2d3 r0 = r5.A02
            float r2 = r0.A06
            if (r11 != r10) goto L_0x03c2
            r4 = r9
            r3 = r1
            r2 = 1056964608(0x3f000000, float:0.5)
        L_0x03c2:
            int r3 = r3 - r4
            int r0 = r6.A02
            int r3 = r3 - r0
            float r1 = (float) r4
            float r1 = r1 + r12
            goto L_0x044a
        L_0x03ca:
            r6.A02(r0)
            goto L_0x038c
        L_0x03ce:
            if (r2 != 0) goto L_0x041a
            java.lang.Integer r1 = r5.A07
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r1 != r0) goto L_0x041a
            int r0 = r5.A00
            if (r0 != r3) goto L_0x041a
            java.util.List r2 = r8.A08
            int r0 = r2.size()
            if (r0 <= 0) goto L_0x041a
            java.util.List r1 = r7.A08
            int r0 = r1.size()
            if (r0 <= 0) goto L_0x041a
            java.lang.Object r0 = r2.get(r4)
            X.Xuf r0 = (X.C22054Xuf) r0
            java.lang.Object r1 = r1.get(r4)
            X.Xuf r1 = (X.C22054Xuf) r1
            int r2 = r0.A02
            int r0 = r8.A00
            int r2 = r2 + r0
            int r1 = r1.A02
            int r0 = r7.A00
            int r1 = r1 + r0
            int r1 = r1 - r2
            int r0 = r6.A00
            int r2 = java.lang.Math.min(r1, r0)
            X.2d3 r0 = r5.A02
            int r1 = r0.A0J
            int r0 = r0.A0L
            int r0 = java.lang.Math.max(r0, r2)
            if (r1 <= 0) goto L_0x0417
            int r0 = java.lang.Math.min(r1, r0)
        L_0x0417:
            r6.A02(r0)
        L_0x041a:
            boolean r0 = r6.A0B
            if (r0 == 0) goto L_0x001e
            java.util.List r0 = r8.A08
            java.lang.Object r11 = r0.get(r4)
            X.Xuf r11 = (X.C22054Xuf) r11
            java.util.List r0 = r7.A08
            java.lang.Object r10 = r0.get(r4)
            X.Xuf r10 = (X.C22054Xuf) r10
            int r9 = r11.A02
            int r0 = r8.A00
            int r4 = r9 + r0
            int r1 = r10.A02
            int r0 = r7.A00
            int r3 = r1 + r0
            X.2d3 r0 = r5.A02
            float r2 = r0.A02
            if (r11 != r10) goto L_0x0444
            r4 = r9
            r3 = r1
            r2 = 1056964608(0x3f000000, float:0.5)
        L_0x0444:
            int r3 = r3 - r4
            int r0 = r6.A02
            int r3 = r3 - r0
            float r1 = (float) r4
            float r1 = r1 + r13
        L_0x044a:
            float r0 = (float) r3
            float r0 = r0 * r2
            float r1 = r1 + r0
            int r0 = (int) r1
            r8.A02(r0)
            int r1 = r8.A02
            int r0 = r6.A02
            int r1 = r1 + r0
            r7.A02(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C270324gY.FJM(X.4gZ):void");
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.XGS, X.Xuf] */
    public C270324gY(2d3 r3) {
        Integer num;
        ? xuf = new C22054Xuf(this);
        if (this instanceof C270314gX) {
            num = AnonymousClass05K.A01;
        } else {
            num = AnonymousClass05K.A0C;
        }
        xuf.A06 = num;
        this.A05 = xuf;
        this.A01 = 0;
        this.A09 = false;
        this.A04 = new C22054Xuf(this);
        this.A03 = new C22054Xuf(this);
        this.A08 = AnonymousClass05K.A00;
        this.A02 = r3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0052, code lost:
        if (r1.A00 == 3) goto L_0x0054;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A09(X.2d6 r16, X.2d6 r17, int r18) {
        /*
            r15 = this;
            X.Xuf r7 = A01(r16)
            X.Xuf r2 = A01(r17)
            boolean r0 = r7.A0B
            if (r0 == 0) goto L_0x0066
            boolean r0 = r2.A0B
            if (r0 == 0) goto L_0x0066
            int r6 = r7.A02
            int r0 = r16.A01()
            int r6 = r6 + r0
            int r5 = r2.A02
            int r0 = r17.A01()
            int r5 = r5 - r0
            int r9 = r5 - r6
            X.XGS r4 = r15.A05
            boolean r0 = r4.A0B
            r8 = r18
            if (r0 != 0) goto L_0x0054
            java.lang.Integer r0 = r15.A07
            java.lang.Integer r13 = X.AnonymousClass05K.A0C
            if (r0 != r13) goto L_0x0054
            r0 = r9
            int r1 = r15.A00
            if (r1 == 0) goto L_0x00c0
            r10 = 1
            if (r1 == r10) goto L_0x00cb
            r0 = 2
            r14 = 1056964608(0x3f000000, float:0.5)
            if (r1 == r0) goto L_0x00a6
            r12 = 3
            if (r1 != r12) goto L_0x0054
            X.2d3 r11 = r15.A02
            X.4gX r3 = r11.A0k
            java.lang.Integer r0 = r3.A07
            if (r0 != r13) goto L_0x008f
            int r0 = r3.A00
            if (r0 != r12) goto L_0x008f
            X.4ga r1 = r11.A0l
            java.lang.Integer r0 = r1.A07
            if (r0 != r13) goto L_0x008f
            int r0 = r1.A00
            if (r0 != r12) goto L_0x008f
        L_0x0054:
            boolean r0 = r4.A0B
            if (r0 == 0) goto L_0x0066
            int r1 = r4.A02
            if (r1 != r9) goto L_0x0067
            X.Xuf r0 = r15.A04
            r0.A02(r6)
            X.Xuf r1 = r15.A03
        L_0x0063:
            r1.A02(r5)
        L_0x0066:
            return
        L_0x0067:
            X.2d3 r0 = r15.A02
            if (r18 != 0) goto L_0x008c
            float r3 = r0.A02
        L_0x006d:
            r0 = 1056964608(0x3f000000, float:0.5)
            if (r7 != r2) goto L_0x0077
            int r6 = r7.A02
            int r5 = r2.A02
            r3 = 1056964608(0x3f000000, float:0.5)
        L_0x0077:
            int r5 = r5 - r6
            int r5 = r5 - r1
            X.Xuf r2 = r15.A04
            float r1 = (float) r6
            float r1 = r1 + r0
            float r0 = (float) r5
            float r0 = r0 * r3
            float r1 = r1 + r0
            int r0 = (int) r1
            r2.A02(r0)
            X.Xuf r1 = r15.A03
            int r5 = r2.A02
            int r0 = r4.A02
            int r5 = r5 + r0
            goto L_0x0063
        L_0x008c:
            float r3 = r0.A06
            goto L_0x006d
        L_0x008f:
            if (r18 != 0) goto L_0x0093
            X.4ga r3 = r11.A0l
        L_0x0093:
            X.XGS r3 = r3.A05
            boolean r0 = r3.A0B
            if (r0 == 0) goto L_0x0054
            float r1 = r11.A01
            int r0 = r3.A02
            float r0 = (float) r0
            if (r8 != r10) goto L_0x00a4
            float r0 = r0 / r1
        L_0x00a1:
            float r0 = r0 + r14
            int r0 = (int) r0
            goto L_0x00d5
        L_0x00a4:
            float r0 = r0 * r1
            goto L_0x00a1
        L_0x00a6:
            X.2d3 r1 = r15.A02
            X.2d3 r0 = r1.A0h
            if (r0 == 0) goto L_0x0054
            if (r18 != 0) goto L_0x00c8
            X.4gX r0 = r0.A0k
        L_0x00b0:
            X.XGS r3 = r0.A05
            boolean r0 = r3.A0B
            if (r0 == 0) goto L_0x0054
            if (r18 != 0) goto L_0x00c5
            float r1 = r1.A04
        L_0x00ba:
            int r0 = r3.A02
            float r0 = (float) r0
            float r0 = r0 * r1
            float r0 = r0 + r14
            int r0 = (int) r0
        L_0x00c0:
            int r0 = r15.A04(r0, r8)
            goto L_0x00d5
        L_0x00c5:
            float r1 = r1.A03
            goto L_0x00ba
        L_0x00c8:
            X.4ga r0 = r0.A0l
            goto L_0x00b0
        L_0x00cb:
            int r0 = r4.A00
            int r0 = r15.A04(r0, r8)
            int r0 = java.lang.Math.min(r0, r9)
        L_0x00d5:
            r4.A02(r0)
            goto L_0x0054
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C270324gY.A09(X.2d6, X.2d6, int):void");
    }
}
