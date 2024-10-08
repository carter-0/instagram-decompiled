package X;

import java.util.Random;

/* renamed from: X.3ep  reason: invalid class name and case insensitive filesystem */
public final class C246573ep {
    public final int A00;
    public final int A01;
    public final boolean A02;
    public final boolean A03;
    public final int A04;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        if (X.AnonymousClass20W.A02() != false) goto L_0x000b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A00(int r4) {
        /*
            r3 = this;
            boolean r0 = r3.A02
            if (r0 != 0) goto L_0x000b
            boolean r1 = X.AnonymousClass20W.A02()
            r0 = 0
            if (r1 == 0) goto L_0x000c
        L_0x000b:
            r0 = 1
        L_0x000c:
            r2 = 0
            if (r0 == 0) goto L_0x0021
            boolean r1 = X.AnonymousClass20W.A02()
            r0 = 1
            if (r1 != 0) goto L_0x0022
            int r0 = r3.A01
            int r4 = r4 % r0
            if (r4 >= 0) goto L_0x001c
            int r4 = r4 + r0
        L_0x001c:
            int r0 = r3.A04
            if (r4 != r0) goto L_0x0021
            r2 = 1
        L_0x0021:
            return r2
        L_0x0022:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C246573ep.A00(int):boolean");
    }

    public C246573ep(int i, int i2, boolean z, boolean z2) {
        this.A02 = z;
        this.A01 = i;
        this.A00 = i2;
        this.A03 = z2;
        this.A04 = new Random().nextInt(i);
    }
}
