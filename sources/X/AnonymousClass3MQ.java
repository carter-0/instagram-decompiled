package X;

import java.util.ArrayList;

/* renamed from: X.3MQ  reason: invalid class name */
public final class AnonymousClass3MQ extends 2d3 {
    public float A00 = -1.0f;
    public int A01;
    public int A02 = -1;
    public int A03 = -1;
    public 2d6 A04;
    public boolean A05;

    public final boolean A0V() {
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001d, code lost:
        if (r0.A14[0] != X.AnonymousClass05K.A01) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0O(X.2dA r10, boolean r11) {
        /*
            r9 = this;
            X.2d3 r3 = r9.A0h
            if (r3 == 0) goto L_0x0065
            X.2d5 r0 = X.2d5.A06
            X.2d6 r7 = r3.A0A(r0)
            X.2d5 r0 = X.2d5.A07
            X.2d6 r6 = r3.A0A(r0)
            X.2d3 r0 = r9.A0h
            r2 = 1
            r5 = 0
            if (r0 == 0) goto L_0x001f
            java.lang.Integer[] r0 = r0.A14
            r1 = r0[r5]
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            r8 = 1
            if (r1 == r0) goto L_0x0020
        L_0x001f:
            r8 = 0
        L_0x0020:
            int r0 = r9.A01
            if (r0 != 0) goto L_0x003d
            X.2d5 r0 = X.2d5.A08
            X.2d6 r7 = r3.A0A(r0)
            X.2d5 r0 = X.2d5.A02
            X.2d6 r6 = r3.A0A(r0)
            X.2d3 r0 = r9.A0h
            if (r0 == 0) goto L_0x00d9
            java.lang.Integer[] r0 = r0.A14
            r1 = r0[r2]
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r1 != r0) goto L_0x00d9
        L_0x003c:
            r8 = r2
        L_0x003d:
            boolean r0 = r9.A05
            r1 = -1
            r4 = 5
            if (r0 == 0) goto L_0x0078
            X.2d6 r2 = r9.A04
            boolean r0 = r2.A06
            if (r0 == 0) goto L_0x0078
            X.2dB r2 = r10.A09(r2)
            X.2d6 r0 = r9.A04
            int r0 = r0.A00()
            r10.A0D(r2, r0)
            int r0 = r9.A02
            if (r0 == r1) goto L_0x0066
            if (r8 == 0) goto L_0x0063
            X.2dB r1 = r10.A09(r6)
        L_0x0060:
            r10.A0F(r1, r2, r5, r4)
        L_0x0063:
            r9.A05 = r5
        L_0x0065:
            return
        L_0x0066:
            int r0 = r9.A03
            if (r0 == r1) goto L_0x0063
            if (r8 == 0) goto L_0x0063
            X.2dB r1 = r10.A09(r6)
            X.2dB r0 = r10.A09(r7)
            r10.A0F(r2, r0, r5, r4)
            goto L_0x0060
        L_0x0078:
            int r0 = r9.A02
            r3 = 8
            if (r0 == r1) goto L_0x0097
            X.2d6 r0 = r9.A04
            X.2dB r2 = r10.A09(r0)
            X.2dB r1 = r10.A09(r7)
            int r0 = r9.A02
            r10.A0E(r2, r1, r0, r3)
            if (r8 == 0) goto L_0x0065
            X.2dB r1 = r10.A09(r6)
        L_0x0093:
            r10.A0F(r1, r2, r5, r4)
            return
        L_0x0097:
            int r0 = r9.A03
            if (r0 == r1) goto L_0x00b5
            X.2d6 r0 = r9.A04
            X.2dB r2 = r10.A09(r0)
            X.2dB r1 = r10.A09(r6)
            int r0 = r9.A03
            int r0 = -r0
            r10.A0E(r2, r1, r0, r3)
            if (r8 == 0) goto L_0x0065
            X.2dB r0 = r10.A09(r7)
            r10.A0F(r2, r0, r5, r4)
            goto L_0x0093
        L_0x00b5:
            float r0 = r9.A00
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x0065
            X.2d6 r0 = r9.A04
            X.2dB r4 = r10.A09(r0)
            X.2dB r3 = r10.A09(r6)
            float r2 = r9.A00
            X.2dC r1 = r10.A06()
            X.2dJ r0 = r1.A01
            r0.E5I(r4, r5)
            r0.E5I(r3, r2)
            r10.A0C(r1)
            return
        L_0x00d9:
            r2 = 0
            goto L_0x003c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3MQ.A0O(X.2dA, boolean):void");
    }

    public final void A0P(2dA r6, boolean z) {
        2d3 r4 = this.A0h;
        if (r4 != null) {
            int A002 = 2dA.A00(this.A04);
            if (this.A01 == 1) {
                this.A0V = A002;
                this.A0W = 0;
                A0H(r4.A06());
                A0I(0);
                return;
            }
            this.A0V = 0;
            this.A0W = A002;
            A0I(r4.A07());
            A0H(0);
        }
    }

    public final boolean A0W() {
        return this.A05;
    }

    public final boolean A0X() {
        return this.A05;
    }

    public final void A0c(int i) {
        2d6 r3;
        if (this.A01 != i) {
            this.A01 = i;
            ArrayList arrayList = this.A0p;
            arrayList.clear();
            if (i == 1) {
                r3 = this.A0e;
            } else {
                r3 = this.A0g;
            }
            this.A04 = r3;
            arrayList.add(r3);
            2d6[] r2 = this.A11;
            int length = r2.length;
            for (int i2 = 0; i2 < length; i2++) {
                r2[i2] = r3;
            }
        }
    }

    public AnonymousClass3MQ() {
        2d6 r3 = this.A0g;
        this.A04 = r3;
        this.A01 = 0;
        ArrayList arrayList = this.A0p;
        arrayList.clear();
        arrayList.add(r3);
        2d6[] r1 = this.A11;
        int length = r1.length;
        for (int i = 0; i < length; i++) {
            r1[i] = r3;
        }
    }

    public final 2d6 A0A(2d5 r4) {
        int ordinal = r4.ordinal();
        if (ordinal == 1 || ordinal == 3) {
            if (this.A01 != 1) {
                return null;
            }
        } else if (!((ordinal == 2 || ordinal == 4) && this.A01 == 0)) {
            return null;
        }
        return this.A04;
    }
}
