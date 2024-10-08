package X;

import java.util.ArrayList;

public final class XGQ extends AnonymousClass3MR {
    public float A00 = 0.5f;
    public float A01 = 0.5f;
    public float A02 = 0.5f;
    public float A03 = 0.5f;
    public float A04 = 0.5f;
    public float A05 = 0.5f;
    public int A06 = 0;
    public int A07 = -1;
    public int A08 = -1;
    public int A09 = 2;
    public int A0A = 0;
    public int A0B = -1;
    public int A0C = -1;
    public int A0D = -1;
    public int A0E = -1;
    public int A0F = 0;
    public int A0G = 2;
    public int A0H = 0;
    public int A0I = -1;
    public int A0J = 0;
    public ArrayList A0K = AnonymousClass7TE.A1C();
    public int[] A0L = null;
    public 2d3[] A0M = null;
    public 2d3[] A0N = null;
    public 2d3[] A0O;

    public static final int A00(2d3 r9, XGQ xgq, int i) {
        int i2 = 0;
        2d3 r4 = r9;
        if (r9 != null) {
            Integer[] numArr = r9.A14;
            if (numArr[1] == AnonymousClass05K.A0C) {
                int i3 = r9.A0G;
                if (i3 != 0) {
                    if (i3 == 2) {
                        i2 = (int) (r9.A03 * ((float) i));
                        if (i2 != r9.A06()) {
                            r9.A0t = true;
                            XGQ xgq2 = xgq;
                            xgq2.A0d(r4, numArr[0], AnonymousClass05K.A00, r9.A07(), i2);
                        }
                    } else if (i3 != 1 && i3 == 3) {
                        return (int) ((((float) r9.A07()) * r9.A01) + 0.5f);
                    }
                }
            }
            return r9.A06();
        }
        return i2;
    }

    public static final int A01(2d3 r8, XGQ xgq, int i) {
        int i2 = 0;
        2d3 r4 = r8;
        if (r8 != null) {
            Integer[] numArr = r8.A14;
            if (numArr[0] == AnonymousClass05K.A0C) {
                int i3 = r8.A0H;
                if (i3 != 0) {
                    if (i3 == 2) {
                        i2 = (int) (r8.A04 * ((float) i));
                        if (i2 != r8.A07()) {
                            r8.A0t = true;
                            xgq.A0d(r4, AnonymousClass05K.A00, numArr[1], i2, r8.A06());
                        }
                    } else if (i3 != 1 && i3 == 3) {
                        return (int) ((((float) r8.A06()) * r8.A01) + 0.5f);
                    }
                }
            }
            return r8.A07();
        }
        return i2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
        if (r0.A0H == false) goto L_0x0010;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0O(X.2dA r14, boolean r15) {
        /*
            r13 = this;
            X.XGQ.super.A0O(r14, r15)
            X.2d3 r0 = r13.A0h
            r5 = 0
            r6 = 1
            if (r0 == 0) goto L_0x0010
            X.2d1 r0 = (X.2d1) r0
            boolean r0 = r0.A0H
            r10 = 1
            if (r0 != 0) goto L_0x0011
        L_0x0010:
            r10 = 0
        L_0x0011:
            int r1 = r13.A0J
            if (r1 == 0) goto L_0x0162
            if (r1 == r6) goto L_0x0147
            r0 = 2
            if (r1 == r0) goto L_0x0038
            r0 = 3
            if (r1 != r0) goto L_0x0173
            java.util.ArrayList r4 = r13.A0K
            int r3 = r4.size()
            r2 = 0
        L_0x0024:
            if (r2 >= r3) goto L_0x0173
            java.lang.Object r1 = r4.get(r2)
            X.XdM r1 = (X.C21506XdM) r1
            int r0 = r3 + -1
            boolean r0 = X.AnonymousClass7TF.A1S(r2, r0)
            r1.A03(r2, r10, r0)
            int r2 = r2 + 1
            goto L_0x0024
        L_0x0038:
            int[] r0 = r13.A0L
            if (r0 == 0) goto L_0x0173
            X.2d3[] r0 = r13.A0M
            if (r0 == 0) goto L_0x0173
            X.2d3[] r0 = r13.A0N
            if (r0 == 0) goto L_0x0173
            r4 = 0
        L_0x0045:
            int r0 = r13.A06
            if (r4 >= r0) goto L_0x0065
            X.2d3[] r0 = r13.A0O
            r0 = r0[r4]
            r3 = 0
            java.util.ArrayList r2 = r0.A0p
            int r1 = r2.size()
        L_0x0054:
            if (r3 >= r1) goto L_0x0062
            java.lang.Object r0 = r2.get(r3)
            X.2d6 r0 = (X.2d6) r0
            r0.A03()
            int r3 = r3 + 1
            goto L_0x0054
        L_0x0062:
            int r4 = r4 + 1
            goto L_0x0045
        L_0x0065:
            int[] r0 = r13.A0L
            r9 = r0[r5]
            r8 = r0[r6]
            r4 = 0
            float r11 = r13.A02
            r12 = 0
        L_0x006f:
            r7 = 8
            if (r12 >= r9) goto L_0x00bb
            if (r10 == 0) goto L_0x00b9
            int r1 = r9 - r12
            int r1 = r1 - r6
            r11 = 1065353216(0x3f800000, float:1.0)
            float r0 = r13.A02
            float r11 = r11 - r0
        L_0x007d:
            X.2d3[] r0 = r13.A0M
            r3 = r0[r1]
            if (r3 == 0) goto L_0x00b6
            int r0 = r3.A0R
            if (r0 == r7) goto L_0x00b6
            if (r12 != 0) goto L_0x0098
            X.2d6 r2 = r3.A0e
            X.2d6 r1 = r13.A0e
            int r0 = r13.A06
            r3.A0S(r2, r1, r0)
            int r0 = r13.A0B
            r3.A0C = r0
            r3.A02 = r11
        L_0x0098:
            int r0 = r9 + -1
            if (r12 != r0) goto L_0x00a5
            X.2d6 r2 = r3.A0f
            X.2d6 r1 = r13.A0f
            int r0 = r13.A07
            r3.A0S(r2, r1, r0)
        L_0x00a5:
            if (r12 <= 0) goto L_0x00b5
            if (r4 == 0) goto L_0x00b5
            X.2d6 r2 = r3.A0e
            X.2d6 r1 = r4.A0f
            int r0 = r13.A0A
            r3.A0S(r2, r1, r0)
            r4.A0S(r1, r2, r5)
        L_0x00b5:
            r4 = r3
        L_0x00b6:
            int r12 = r12 + 1
            goto L_0x006f
        L_0x00b9:
            r1 = r12
            goto L_0x007d
        L_0x00bb:
            r10 = 0
        L_0x00bc:
            if (r10 >= r8) goto L_0x00fc
            X.2d3[] r0 = r13.A0N
            r3 = r0[r10]
            if (r3 == 0) goto L_0x00f9
            int r0 = r3.A0R
            if (r0 == r7) goto L_0x00f9
            if (r10 != 0) goto L_0x00db
            X.2d6 r2 = r3.A0g
            X.2d6 r1 = r13.A0g
            int r0 = r13.A05
            r3.A0S(r2, r1, r0)
            int r0 = r13.A0I
            r3.A0P = r0
            float r0 = r13.A05
            r3.A06 = r0
        L_0x00db:
            int r0 = r8 + -1
            if (r10 != r0) goto L_0x00e8
            X.2d6 r2 = r3.A0a
            X.2d6 r1 = r13.A0a
            int r0 = r13.A02
            r3.A0S(r2, r1, r0)
        L_0x00e8:
            if (r10 <= 0) goto L_0x00f8
            if (r4 == 0) goto L_0x00f8
            X.2d6 r2 = r3.A0g
            X.2d6 r1 = r4.A0a
            int r0 = r13.A0H
            r3.A0S(r2, r1, r0)
            r4.A0S(r1, r2, r5)
        L_0x00f8:
            r4 = r3
        L_0x00f9:
            int r10 = r10 + 1
            goto L_0x00bc
        L_0x00fc:
            r4 = 0
        L_0x00fd:
            if (r4 >= r9) goto L_0x0173
            r3 = 0
        L_0x0100:
            if (r3 >= r8) goto L_0x0144
            int r2 = r3 * r9
            int r2 = r2 + r4
            int r0 = r13.A0F
            if (r0 != r6) goto L_0x010c
            int r2 = r4 * r8
            int r2 = r2 + r3
        L_0x010c:
            X.2d3[] r1 = r13.A0O
            int r0 = r1.length
            if (r2 >= r0) goto L_0x0141
            r2 = r1[r2]
            if (r2 == 0) goto L_0x0141
            int r0 = r2.A0R
            if (r0 == r7) goto L_0x0141
            X.2d3[] r0 = r13.A0M
            r11 = r0[r4]
            X.2d3[] r0 = r13.A0N
            r10 = r0[r3]
            if (r2 == r11) goto L_0x0131
            X.2d6 r1 = r2.A0e
            X.2d6 r0 = r11.A0e
            r2.A0S(r1, r0, r5)
            X.2d6 r1 = r2.A0f
            X.2d6 r0 = r11.A0f
            r2.A0S(r1, r0, r5)
        L_0x0131:
            if (r2 == r10) goto L_0x0141
            X.2d6 r1 = r2.A0g
            X.2d6 r0 = r10.A0g
            r2.A0S(r1, r0, r5)
            X.2d6 r1 = r2.A0a
            X.2d6 r0 = r10.A0a
            r2.A0S(r1, r0, r5)
        L_0x0141:
            int r3 = r3 + 1
            goto L_0x0100
        L_0x0144:
            int r4 = r4 + 1
            goto L_0x00fd
        L_0x0147:
            java.util.ArrayList r4 = r13.A0K
            int r3 = r4.size()
            r2 = 0
        L_0x014e:
            if (r2 >= r3) goto L_0x0173
            java.lang.Object r1 = r4.get(r2)
            X.XdM r1 = (X.C21506XdM) r1
            int r0 = r3 + -1
            boolean r0 = X.AnonymousClass7TF.A1S(r2, r0)
            r1.A03(r2, r10, r0)
            int r2 = r2 + 1
            goto L_0x014e
        L_0x0162:
            java.util.ArrayList r1 = r13.A0K
            int r0 = r1.size()
            if (r0 <= 0) goto L_0x0173
            java.lang.Object r0 = r1.get(r5)
            X.XdM r0 = (X.C21506XdM) r0
            r0.A03(r5, r10, r6)
        L_0x0173:
            r13.A0A = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.XGQ.A0O(X.2dA, boolean):void");
    }
}
