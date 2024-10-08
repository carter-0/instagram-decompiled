package X;

/* renamed from: X.9It  reason: invalid class name and case insensitive filesystem */
public final class C376639It extends AnonymousClass0T0 {
    public boolean A00;
    public final int A01;
    public final String A02;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C376639It(String str) {
        this(str, false, 3);
        this.A01 = 3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0020, code lost:
        if (r2.A00 == r3.A00) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002d, code lost:
        if ((r3 instanceof X.C376639It) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002f, code lost:
        r3 = (X.C376639It) r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0033, code lost:
        if (r3.A01 != r1) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0039, code lost:
        if (r2.A00 != r3.A00) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0043, code lost:
        if (X.0qQ.A0K(r2.A02, r3.A02) != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000a, code lost:
        if ((r3 instanceof X.C376639It) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000c, code lost:
        r3 = (X.C376639It) r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0010, code lost:
        if (r3.A01 != r1) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001a, code lost:
        if (X.0qQ.A0K(r2.A02, r3.A02) == false) goto L_?;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            int r0 = r2.A01
            switch(r0) {
                case 0: goto L_0x0024;
                case 1: goto L_0x0028;
                case 2: goto L_0x0046;
                default: goto L_0x0005;
            }
        L_0x0005:
            if (r2 == r3) goto L_0x004a
            r1 = 3
        L_0x0008:
            boolean r0 = r3 instanceof X.C376639It
            if (r0 == 0) goto L_0x0022
            X.9It r3 = (X.C376639It) r3
            int r0 = r3.A01
            if (r0 != r1) goto L_0x0022
            java.lang.String r1 = r2.A02
            java.lang.String r0 = r3.A02
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0022
            boolean r1 = r2.A00
            boolean r0 = r3.A00
            if (r1 == r0) goto L_0x004a
        L_0x0022:
            r0 = 0
            return r0
        L_0x0024:
            if (r2 == r3) goto L_0x004a
            r1 = 0
            goto L_0x002b
        L_0x0028:
            if (r2 == r3) goto L_0x004a
            r1 = 1
        L_0x002b:
            boolean r0 = r3 instanceof X.C376639It
            if (r0 == 0) goto L_0x0022
            X.9It r3 = (X.C376639It) r3
            int r0 = r3.A01
            if (r0 != r1) goto L_0x0022
            boolean r1 = r2.A00
            boolean r0 = r3.A00
            if (r1 != r0) goto L_0x0022
            java.lang.String r1 = r2.A02
            java.lang.String r0 = r3.A02
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x004a
            goto L_0x0022
        L_0x0046:
            if (r2 == r3) goto L_0x004a
            r1 = 2
            goto L_0x0008
        L_0x004a:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C376639It.equals(java.lang.Object):boolean");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int hashCode() {
        /*
            r3 = this;
            int r0 = r3.A01
            switch(r0) {
                case 0: goto L_0x0027;
                case 1: goto L_0x0017;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.String r0 = r3.A02
            int r0 = r0.hashCode()
            int r2 = r0 * 31
            boolean r1 = r3.A00
            r0 = 1237(0x4d5, float:1.733E-42)
            if (r1 == 0) goto L_0x0015
            r0 = 1231(0x4cf, float:1.725E-42)
        L_0x0015:
            int r2 = r2 + r0
            return r2
        L_0x0017:
            boolean r1 = r3.A00
            r0 = 1237(0x4d5, float:1.733E-42)
            if (r1 == 0) goto L_0x001f
            r0 = 1231(0x4cf, float:1.725E-42)
        L_0x001f:
            int r2 = r0 * 31
            java.lang.String r0 = r3.A02
            if (r0 != 0) goto L_0x0033
            r0 = 0
            goto L_0x0015
        L_0x0027:
            boolean r1 = r3.A00
            r0 = 1237(0x4d5, float:1.733E-42)
            if (r1 == 0) goto L_0x002f
            r0 = 1231(0x4cf, float:1.725E-42)
        L_0x002f:
            int r2 = r0 * 31
            java.lang.String r0 = r3.A02
        L_0x0033:
            int r0 = r0.hashCode()
            goto L_0x0015
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C376639It.hashCode():int");
    }

    public final String toString() {
        if (1 - this.A01 != 0) {
            return super.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("MutedWordsMatch(containsMatch=");
        sb.append(this.A00);
        sb.append(", dictionaryId=");
        sb.append(this.A02);
        sb.append(')');
        return sb.toString();
    }

    public C376639It(String str, int i, boolean z) {
        this.A01 = i;
        this.A00 = z;
        this.A02 = str;
    }

    public C376639It(String str, boolean z, int i) {
        this.A01 = i;
        this.A02 = str;
        this.A00 = z;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C376639It() {
        this((String) null, 1, false);
        this.A01 = 1;
    }
}
