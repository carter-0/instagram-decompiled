package X;

import java.util.Arrays;

/* renamed from: X.XoQ  reason: case insensitive filesystem */
public final class C21978XoQ {
    public int A00 = 0;
    public int A01 = 0;
    public int A02 = 4096;
    public int A03 = 7;
    public int A04 = Integer.MAX_VALUE;
    public boolean A05;
    public Xs6[] A06 = new Xs6[8];
    public final C13198TPe A07;

    public static void A00(C21978XoQ xoQ, int i) {
        int i2;
        int i3 = 0;
        if (i > 0) {
            Xs6[] xs6Arr = xoQ.A06;
            int length = xs6Arr.length;
            while (true) {
                length--;
                i2 = xoQ.A03;
                if (length < i2 || i <= 0) {
                    int i4 = i2 + 1;
                    System.arraycopy(xs6Arr, i4, xs6Arr, i4 + i3, xoQ.A01);
                    Xs6[] xs6Arr2 = xoQ.A06;
                    int i5 = xoQ.A03 + 1;
                    Arrays.fill(xs6Arr2, i5, i5 + i3, (Object) null);
                    xoQ.A03 += i3;
                } else {
                    int i6 = xs6Arr[length].A00;
                    i -= i6;
                    xoQ.A00 -= i6;
                    xoQ.A01--;
                    i3++;
                }
            }
            int i42 = i2 + 1;
            System.arraycopy(xs6Arr, i42, xs6Arr, i42 + i3, xoQ.A01);
            Xs6[] xs6Arr22 = xoQ.A06;
            int i52 = xoQ.A03 + 1;
            Arrays.fill(xs6Arr22, i52, i52 + i3, (Object) null);
            xoQ.A03 += i3;
        }
    }

    public C21978XoQ(C13198TPe tPe) {
        this.A07 = tPe;
    }

    public final void A01(int i, int i2, int i3) {
        int i4;
        C13198TPe tPe = this.A07;
        if (i < i2) {
            i4 = i | i3;
        } else {
            tPe.A0B(i3 | i2);
            i4 = i - i2;
            while (i4 >= 128) {
                tPe.A0B(128 | (i4 & 127));
                i4 >>>= 7;
            }
        }
        tPe.A0B(i4);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v7, resolved type: byte} */
    /* JADX WARNING: type inference failed for: r4v1, types: [java.lang.Object, X.TPe] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(X.TAH r10) {
        /*
            r9 = this;
            r3 = 127(0x7f, float:1.78E-43)
            r1 = 0
            r7 = 0
        L_0x0005:
            int r6 = r10.A05()
            if (r7 >= r6) goto L_0x001a
            byte r0 = r10.A04(r7)
            r4 = r0 & 255(0xff, float:3.57E-43)
            byte[] r0 = X.C21959Xmo.A02
            byte r0 = r0[r4]
            long r4 = (long) r0
            long r1 = r1 + r4
            int r7 = r7 + 1
            goto L_0x0005
        L_0x001a:
            r4 = 7
            long r1 = r1 + r4
            r0 = 3
            long r1 = r1 >> r0
            int r0 = (int) r1
            if (r0 >= r6) goto L_0x006b
            X.TPe r4 = new X.TPe
            r4.<init>()
            r6 = 0
            r7 = 0
            r5 = 0
        L_0x002b:
            int r0 = r10.A05()
            r1 = 255(0xff, float:3.57E-43)
            if (r6 >= r0) goto L_0x0054
            byte r2 = r10.A04(r6)
            r2 = r2 & r1
            int[] r0 = X.C21959Xmo.A03
            r1 = r0[r2]
            byte[] r0 = X.C21959Xmo.A02
            byte r2 = r0[r2]
            long r7 = r7 << r2
            long r0 = (long) r1
            long r7 = r7 | r0
            int r5 = r5 + r2
        L_0x0044:
            r0 = 8
            if (r5 < r0) goto L_0x0051
            int r5 = r5 + -8
            long r1 = r7 >> r5
            int r0 = (int) r1
            r4.FNn(r0)
            goto L_0x0044
        L_0x0051:
            int r6 = r6 + 1
            goto L_0x002b
        L_0x0054:
            if (r5 <= 0) goto L_0x0060
            int r0 = 8 - r5
            long r7 = r7 << r0
            int r1 = r1 >>> r5
            long r1 = (long) r1
            long r1 = r1 | r7
            int r0 = (int) r1
            r4.FNn(r0)
        L_0x0060:
            X.TAH r10 = r4.A08()
            int r6 = r10.A05()
            r0 = 128(0x80, float:1.794E-43)
            goto L_0x006c
        L_0x006b:
            r0 = 0
        L_0x006c:
            r9.A01(r6, r3, r0)
            X.TPe r0 = r9.A07
            r10.A0B(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21978XoQ.A02(X.TAH):void");
    }
}
