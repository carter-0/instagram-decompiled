package X;

import java.util.List;

public final class IFH implements AnonymousClass6JL, JLD {
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public boolean A04 = true;
    public boolean A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final int A0A;
    public final long A0B;
    public final AnonymousClass6H4 A0C;
    public final Object A0D;
    public final List A0E;
    public final boolean A0F;
    public final int A0G;
    public final int A0H;
    public final long A0I;
    public final Object A0J;

    public final void EeC(boolean z) {
        this.A05 = true;
    }

    public final int A00() {
        long j;
        boolean z = this.A0F;
        long j2 = this.A03;
        if (!z) {
            j = j2 >> 32;
        } else {
            j = j2 & 4294967295L;
        }
        return (int) j;
    }

    public final void A01(int i, int i2, int i3) {
        long A002;
        this.A00 = i3;
        this.A02 = -this.A0G;
        this.A01 = i3 + this.A06;
        if (this.A0F) {
            A002 = AnonymousClass5TW.A00(i2, i);
        } else {
            A002 = AnonymousClass5TW.A00(i, i2);
        }
        this.A03 = A002;
    }

    public final long Aq6() {
        return this.A0I;
    }

    public final int BKU() {
        return this.A08;
    }

    public final int BOp() {
        return this.A09;
    }

    public final Object BaY(int i) {
        return ((C267974cY) this.A0E.get(i)).BaX();
    }

    public final int Bco() {
        return this.A0E.size();
    }

    public final int By3() {
        return this.A0A;
    }

    public final boolean CeR() {
        return this.A0F;
    }

    public final void E3D(int i, int i2, int i3, int i4) {
        if (this.A0F) {
            i3 = i4;
        }
        A01(i, i2, i3);
    }

    public final int getIndex() {
        return this.A07;
    }

    public final Object getKey() {
        return this.A0D;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00be  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public IFH(X.AnonymousClass6H4 r8, java.lang.Object r9, java.lang.Object r10, java.util.List r11, int r12, int r13, int r14, int r15, int r16, int r17, long r18, boolean r20) {
        /*
            r7 = this;
            r7.<init>()
            r7.A07 = r12
            r7.A0D = r9
            r7.A0E = r11
            r0 = r20
            r7.A0F = r0
            r7.A08 = r14
            r7.A0A = r15
            r0 = r16
            r7.A0G = r0
            r0 = r17
            r7.A06 = r0
            r7.A0J = r10
            r7.A0C = r8
            r0 = r18
            r7.A0I = r0
            r6 = 1
            r7.A04 = r6
            boolean r0 = r11.isEmpty()
            r5 = 0
            if (r0 != 0) goto L_0x005d
            java.lang.Object r1 = r11.get(r5)
            X.4cY r1 = (X.C267974cY) r1
            boolean r0 = r7.A0F
            if (r0 == 0) goto L_0x005a
            int r0 = r1.A00
        L_0x0037:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            int r3 = X.C51966G9m.A06(r11)
            if (r6 > r3) goto L_0x005f
            r2 = 1
        L_0x0042:
            java.lang.Object r1 = r11.get(r2)
            X.4cY r1 = (X.C267974cY) r1
            boolean r0 = r7.A0F
            if (r0 == 0) goto L_0x0057
            int r0 = r1.A00
        L_0x004e:
            java.lang.Integer r4 = X.C51975G9x.A0d(r4, r0)
            if (r2 == r3) goto L_0x005f
            int r2 = r2 + 1
            goto L_0x0042
        L_0x0057:
            int r0 = r1.A01
            goto L_0x004e
        L_0x005a:
            int r0 = r1.A01
            goto L_0x0037
        L_0x005d:
            r0 = 0
            goto L_0x0065
        L_0x005f:
            if (r4 == 0) goto L_0x005d
            int r0 = r4.intValue()
        L_0x0065:
            r7.A0H = r0
            int r0 = r0 + r13
            if (r0 >= r5) goto L_0x006b
            r0 = 0
        L_0x006b:
            r7.A09 = r0
            java.util.List r4 = r7.A0E
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x00aa
            java.lang.Object r1 = r4.get(r5)
            X.4cY r1 = (X.C267974cY) r1
            boolean r0 = r7.A0F
            if (r0 == 0) goto L_0x00a3
            int r0 = r1.A01
        L_0x0081:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            int r2 = X.C51966G9m.A06(r4)
            if (r6 > r2) goto L_0x00a6
        L_0x008b:
            java.lang.Object r1 = r4.get(r6)
            X.4cY r1 = (X.C267974cY) r1
            boolean r0 = r7.A0F
            if (r0 == 0) goto L_0x00a0
            int r0 = r1.A01
        L_0x0097:
            java.lang.Integer r3 = X.C51975G9x.A0d(r3, r0)
            if (r6 == r2) goto L_0x00a6
            int r6 = r6 + 1
            goto L_0x008b
        L_0x00a0:
            int r0 = r1.A00
            goto L_0x0097
        L_0x00a3:
            int r0 = r1.A00
            goto L_0x0081
        L_0x00a6:
            int r5 = X.C51967G9n.A04(r3, r5)
        L_0x00aa:
            r0 = -1
            r7.A00 = r0
            boolean r1 = r7.A0F
            int r0 = r7.A0H
            if (r1 == 0) goto L_0x00be
            long r0 = X.C289155d7.A00(r5, r0)
        L_0x00b7:
            r7.A0B = r0
            r0 = 0
            r7.A03 = r0
            return
        L_0x00be:
            long r0 = X.C289155d7.A00(r0, r5)
            goto L_0x00b7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.IFH.<init>(X.6H4, java.lang.Object, java.lang.Object, java.util.List, int, int, int, int, int, int, long, boolean):void");
    }

    public final long BXq(int i) {
        return this.A03;
    }
}
