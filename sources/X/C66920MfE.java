package X;

/* renamed from: X.MfE  reason: case insensitive filesystem */
public final class C66920MfE extends AnonymousClass0T0 {
    public final int A00;
    public final int A01;
    public final boolean A02;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C66920MfE(int r3, int r4, boolean r5) {
        /*
            r2 = this;
            r2.A00 = r4
            switch(r4) {
                case 0: goto L_0x001e;
                case 1: goto L_0x0005;
                case 2: goto L_0x0005;
                case 3: goto L_0x0016;
                default: goto L_0x0005;
            }
        L_0x0005:
            r1 = 0
            r0 = r3 & 1
            if (r0 == 0) goto L_0x000b
            r5 = 0
        L_0x000b:
            r0 = r3 & 2
            if (r0 == 0) goto L_0x0011
            r1 = 50
        L_0x0011:
            r0 = 5
        L_0x0012:
            r2.<init>((int) r1, (boolean) r5, (int) r0)
            return
        L_0x0016:
            r1 = 0
            r0 = r3 & 1
            if (r0 == 0) goto L_0x001c
            r5 = 0
        L_0x001c:
            r0 = 3
            goto L_0x0012
        L_0x001e:
            r0 = 0
            r2.<init>((int) r0, (boolean) r5, (int) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66920MfE.<init>(int, int, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0018, code lost:
        r1 = r2.A01;
        r0 = r3.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001c, code lost:
        if (r1 == r0) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x003d, code lost:
        if ((r3 instanceof X.C66920MfE) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x003f, code lost:
        r3 = (X.C66920MfE) r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0043, code lost:
        if (r3.A00 != r1) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0049, code lost:
        if (r2.A01 != r3.A01) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x004b, code lost:
        r1 = r2.A02;
        r0 = r3.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000a, code lost:
        if ((r3 instanceof X.C66920MfE) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000c, code lost:
        r3 = (X.C66920MfE) r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0010, code lost:
        if (r3.A00 != r1) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0016, code lost:
        if (r2.A02 != r3.A02) goto L_?;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            int r0 = r2.A00
            switch(r0) {
                case 0: goto L_0x0020;
                case 1: goto L_0x0024;
                case 2: goto L_0x0028;
                case 3: goto L_0x002c;
                case 4: goto L_0x0030;
                case 5: goto L_0x0034;
                case 6: goto L_0x0038;
                default: goto L_0x0005;
            }
        L_0x0005:
            if (r2 == r3) goto L_0x0050
            r1 = 7
        L_0x0008:
            boolean r0 = r3 instanceof X.C66920MfE
            if (r0 == 0) goto L_0x001e
            X.MfE r3 = (X.C66920MfE) r3
            int r0 = r3.A00
            if (r0 != r1) goto L_0x001e
            boolean r1 = r2.A02
            boolean r0 = r3.A02
            if (r1 != r0) goto L_0x001e
            int r1 = r2.A01
            int r0 = r3.A01
        L_0x001c:
            if (r1 == r0) goto L_0x0050
        L_0x001e:
            r0 = 0
            return r0
        L_0x0020:
            if (r2 == r3) goto L_0x0050
            r1 = 0
            goto L_0x0008
        L_0x0024:
            if (r2 == r3) goto L_0x0050
            r1 = 1
            goto L_0x0008
        L_0x0028:
            if (r2 == r3) goto L_0x0050
            r1 = 2
            goto L_0x003b
        L_0x002c:
            if (r2 == r3) goto L_0x0050
            r1 = 3
            goto L_0x0008
        L_0x0030:
            if (r2 == r3) goto L_0x0050
            r1 = 4
            goto L_0x003b
        L_0x0034:
            if (r2 == r3) goto L_0x0050
            r1 = 5
            goto L_0x0008
        L_0x0038:
            if (r2 == r3) goto L_0x0050
            r1 = 6
        L_0x003b:
            boolean r0 = r3 instanceof X.C66920MfE
            if (r0 == 0) goto L_0x001e
            X.MfE r3 = (X.C66920MfE) r3
            int r0 = r3.A00
            if (r0 != r1) goto L_0x001e
            int r1 = r2.A01
            int r0 = r3.A01
            if (r1 != r0) goto L_0x001e
            boolean r1 = r2.A02
            boolean r0 = r3.A02
            goto L_0x001c
        L_0x0050:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66920MfE.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i;
        int i2;
        switch (this.A00) {
            case 2:
            case 4:
            case 6:
                i = this.A01 * 31;
                i2 = 1237;
                if (this.A02) {
                    i2 = 1231;
                    break;
                }
                break;
            default:
                i = C51965G9l.A05(this.A02);
                i2 = this.A01;
                break;
        }
        return i + i2;
    }

    public final String toString() {
        if (5 - this.A00 != 0) {
            return super.toString();
        }
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("RtcTouchUpModel(enabled=");
        A1A.append(this.A02);
        A1A.append(", strength=");
        return C51975G9x.A0j(A1A, this.A01);
    }

    public C66920MfE(int i, boolean z, int i2) {
        this.A00 = i2;
        this.A01 = i;
        this.A02 = z;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C66920MfE() {
        this(0, false, 4);
        this.A00 = 4;
    }
}
