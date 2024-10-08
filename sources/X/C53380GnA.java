package X;

/* renamed from: X.GnA  reason: case insensitive filesystem */
public final class C53380GnA extends AnonymousClass0T0 {
    public int A00;
    public String A01;
    public String A02;
    public final int A03;

    public C53380GnA(int i, int i2, String str, String str2) {
        this.A03 = i2;
        switch (i2) {
            case 1:
            case 7:
                0qQ.A0B(str, 1);
                this.A02 = str;
                this.A00 = i;
                this.A01 = str2;
                return;
            default:
                AnonymousClass7TG.A1P(str, str2);
                this.A01 = str;
                this.A00 = i;
                this.A02 = str2;
                return;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0020, code lost:
        if (r2.A00 == r3.A00) goto L_0x009c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x005b, code lost:
        if ((r3 instanceof X.C53380GnA) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x005d, code lost:
        r3 = (X.C53380GnA) r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0061, code lost:
        if (r3.A03 != r1) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x006b, code lost:
        if (X.0qQ.A0K(r2.A02, r3.A02) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0075, code lost:
        if (X.0qQ.A0K(r2.A01, r3.A01) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x007b, code lost:
        if (r2.A00 == r3.A00) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0083, code lost:
        if ((r3 instanceof X.C53380GnA) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0085, code lost:
        r3 = (X.C53380GnA) r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0089, code lost:
        if (r3.A03 != r1) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x008f, code lost:
        if (r2.A00 != r3.A00) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0099, code lost:
        if (X.0qQ.A0K(r2.A02, r3.A02) != false) goto L_0x009c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x009c, code lost:
        r1 = r2.A01;
        r0 = r3.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00a4, code lost:
        if (X.0qQ.A0K(r1, r0) != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000a, code lost:
        if ((r3 instanceof X.C53380GnA) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000c, code lost:
        r3 = (X.C53380GnA) r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0010, code lost:
        if (r3.A03 != r1) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001a, code lost:
        if (X.0qQ.A0K(r2.A02, r3.A02) == false) goto L_?;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            int r0 = r2.A03
            switch(r0) {
                case 0: goto L_0x0024;
                case 1: goto L_0x0028;
                case 2: goto L_0x004e;
                case 3: goto L_0x0052;
                case 4: goto L_0x002c;
                case 5: goto L_0x0056;
                case 6: goto L_0x007e;
                default: goto L_0x0005;
            }
        L_0x0005:
            if (r2 == r3) goto L_0x00a8
            r1 = 7
        L_0x0008:
            boolean r0 = r3 instanceof X.C53380GnA
            if (r0 == 0) goto L_0x0022
            X.GnA r3 = (X.C53380GnA) r3
            int r0 = r3.A03
            if (r0 != r1) goto L_0x0022
            java.lang.String r1 = r2.A02
            java.lang.String r0 = r3.A02
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0022
            int r1 = r2.A00
            int r0 = r3.A00
            if (r1 == r0) goto L_0x009c
        L_0x0022:
            r0 = 0
            return r0
        L_0x0024:
            if (r2 == r3) goto L_0x00a8
            r1 = 0
            goto L_0x0059
        L_0x0028:
            if (r2 == r3) goto L_0x00a8
            r1 = 1
            goto L_0x0008
        L_0x002c:
            if (r2 == r3) goto L_0x00a8
            r1 = 4
            boolean r0 = r3 instanceof X.C53380GnA
            if (r0 == 0) goto L_0x0022
            X.GnA r3 = (X.C53380GnA) r3
            int r0 = r3.A03
            if (r0 != r1) goto L_0x0022
            java.lang.String r1 = r2.A01
            java.lang.String r0 = r3.A01
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0022
            int r1 = r2.A00
            int r0 = r3.A00
            if (r1 != r0) goto L_0x0022
            java.lang.String r1 = r2.A02
            java.lang.String r0 = r3.A02
            goto L_0x00a0
        L_0x004e:
            if (r2 == r3) goto L_0x00a8
            r1 = 2
            goto L_0x0081
        L_0x0052:
            if (r2 == r3) goto L_0x00a8
            r1 = 3
            goto L_0x0059
        L_0x0056:
            if (r2 == r3) goto L_0x00a8
            r1 = 5
        L_0x0059:
            boolean r0 = r3 instanceof X.C53380GnA
            if (r0 == 0) goto L_0x0022
            X.GnA r3 = (X.C53380GnA) r3
            int r0 = r3.A03
            if (r0 != r1) goto L_0x0022
            java.lang.String r1 = r2.A02
            java.lang.String r0 = r3.A02
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0022
            java.lang.String r1 = r2.A01
            java.lang.String r0 = r3.A01
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0022
            int r1 = r2.A00
            int r0 = r3.A00
            if (r1 == r0) goto L_0x00a8
            goto L_0x0022
        L_0x007e:
            if (r2 == r3) goto L_0x00a8
            r1 = 6
        L_0x0081:
            boolean r0 = r3 instanceof X.C53380GnA
            if (r0 == 0) goto L_0x0022
            X.GnA r3 = (X.C53380GnA) r3
            int r0 = r3.A03
            if (r0 != r1) goto L_0x0022
            int r1 = r2.A00
            int r0 = r3.A00
            if (r1 != r0) goto L_0x0022
            java.lang.String r1 = r2.A02
            java.lang.String r0 = r3.A02
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x009c
            goto L_0x0022
        L_0x009c:
            java.lang.String r1 = r2.A01
            java.lang.String r0 = r3.A01
        L_0x00a0:
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x00a8
            goto L_0x0022
        L_0x00a8:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C53380GnA.equals(java.lang.Object):boolean");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002f, code lost:
        r2 = (r1 + r0) * 31;
        r1 = r3.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003d, code lost:
        r0 = r0.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004f, code lost:
        r1 = r0.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0016, code lost:
        return r2 + r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int hashCode() {
        /*
            r3 = this;
            int r0 = r3.A03
            switch(r0) {
                case 0: goto L_0x0035;
                case 1: goto L_0x0005;
                case 2: goto L_0x0017;
                case 3: goto L_0x0024;
                case 4: goto L_0x0042;
                case 5: goto L_0x0035;
                case 6: goto L_0x0054;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.String r0 = r3.A02
            int r1 = X.AnonymousClass7TE.A0O(r0)
            int r0 = r3.A00
            int r1 = r1 + r0
            int r2 = r1 * 31
            java.lang.String r0 = r3.A01
            if (r0 != 0) goto L_0x004f
            r1 = 0
        L_0x0015:
            int r2 = r2 + r1
            return r2
        L_0x0017:
            int r0 = r3.A00
            int r1 = r0 * 31
            java.lang.String r0 = r3.A02
            int r2 = X.AnonymousClass7TF.A08(r0, r1)
            java.lang.String r0 = r3.A01
            goto L_0x004f
        L_0x0024:
            java.lang.String r0 = r3.A02
            int r1 = X.AnonymousClass7TE.A0O(r0)
            java.lang.String r0 = r3.A01
            if (r0 != 0) goto L_0x003d
            r0 = 0
        L_0x002f:
            int r1 = r1 + r0
            int r2 = r1 * 31
            int r1 = r3.A00
            goto L_0x0015
        L_0x0035:
            java.lang.String r0 = r3.A02
            int r1 = X.AnonymousClass7TE.A0O(r0)
            java.lang.String r0 = r3.A01
        L_0x003d:
            int r0 = r0.hashCode()
            goto L_0x002f
        L_0x0042:
            java.lang.String r0 = r3.A01
            int r1 = X.AnonymousClass7TE.A0O(r0)
            int r0 = r3.A00
            int r1 = r1 + r0
            int r2 = r1 * 31
            java.lang.String r0 = r3.A02
        L_0x004f:
            int r1 = r0.hashCode()
            goto L_0x0015
        L_0x0054:
            int r0 = r3.A00
            int r1 = r0 * 31
            java.lang.String r0 = r3.A02
            int r0 = X.AnonymousClass7TG.A0E(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.String r0 = r3.A01
            int r2 = X.C41845B3m.A00(r0)
            goto L_0x0015
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C53380GnA.hashCode():int");
    }

    public final String toString() {
        if (5 - this.A03 != 0) {
            return super.toString();
        }
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("AymfHeader(title=");
        A1A.append(this.A02);
        A1A.append(", subtitle=");
        A1A.append(this.A01);
        A1A.append(", followings=");
        return C51975G9x.A0j(A1A, this.A00);
    }

    public C53380GnA(String str, String str2, int i, int i2) {
        this.A03 = i2;
        switch (i2) {
            case 0:
            case 5:
                AnonymousClass7TG.A1O(str, str2);
                break;
            default:
                0qQ.A0B(str, 1);
                break;
        }
        this.A02 = str;
        this.A01 = str2;
        this.A00 = i;
    }

    public C53380GnA(int i, String str, String str2, int i2) {
        this.A03 = i2;
        this.A00 = i;
        this.A02 = str;
        this.A01 = str2;
    }
}
