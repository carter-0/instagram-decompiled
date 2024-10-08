package X;

/* renamed from: X.9IL  reason: invalid class name */
public final class AnonymousClass9IL extends AnonymousClass0T0 {
    public final int A00;
    public final long A01;
    public final Object A02;

    public AnonymousClass9IL(1Jp r4, Integer num) {
        this.A00 = 2;
        long j = r4.A00;
        this.A00 = 2;
        this.A02 = num;
        this.A01 = j;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0022, code lost:
        if (X.0qQ.A0K(r5.A02, r6.A02) != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x005c, code lost:
        if (r5.A01 == r6.A01) goto L_?;
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
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000a, code lost:
        if ((r6 instanceof X.AnonymousClass9IL) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000c, code lost:
        r6 = (X.AnonymousClass9IL) r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0010, code lost:
        if (r6.A00 != r1) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0018, code lost:
        if (r5.A01 != r6.A01) goto L_?;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            int r0 = r5.A00
            switch(r0) {
                case 0: goto L_0x0026;
                case 1: goto L_0x002a;
                case 2: goto L_0x0042;
                default: goto L_0x0005;
            }
        L_0x0005:
            if (r5 == r6) goto L_0x005f
            r1 = 3
        L_0x0008:
            boolean r0 = r6 instanceof X.AnonymousClass9IL
            if (r0 == 0) goto L_0x0024
            X.9IL r6 = (X.AnonymousClass9IL) r6
            int r0 = r6.A00
            if (r0 != r1) goto L_0x0024
            long r3 = r5.A01
            long r1 = r6.A01
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0024
            java.lang.Object r1 = r5.A02
            java.lang.Object r0 = r6.A02
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x005f
        L_0x0024:
            r0 = 0
            return r0
        L_0x0026:
            if (r5 == r6) goto L_0x005f
            r1 = 0
            goto L_0x0008
        L_0x002a:
            if (r5 == r6) goto L_0x005f
            r1 = 1
            boolean r0 = r6 instanceof X.AnonymousClass9IL
            if (r0 == 0) goto L_0x0024
            X.9IL r6 = (X.AnonymousClass9IL) r6
            int r0 = r6.A00
            if (r0 != r1) goto L_0x0024
            java.lang.Object r1 = r5.A02
            java.lang.Object r0 = r6.A02
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x0056
            goto L_0x0024
        L_0x0042:
            if (r5 == r6) goto L_0x005f
            r1 = 2
            boolean r0 = r6 instanceof X.AnonymousClass9IL
            if (r0 == 0) goto L_0x0024
            X.9IL r6 = (X.AnonymousClass9IL) r6
            int r0 = r6.A00
            if (r0 != r1) goto L_0x0024
            java.lang.Object r1 = r5.A02
            java.lang.Object r0 = r6.A02
            if (r1 == r0) goto L_0x0056
            goto L_0x0024
        L_0x0056:
            long r3 = r5.A01
            long r1 = r6.A01
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x005f
            goto L_0x0024
        L_0x005f:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9IL.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        String str;
        switch (this.A00) {
            case 1:
                Object obj = this.A02;
                if (obj != null) {
                    i = obj.hashCode();
                    break;
                } else {
                    i = 0;
                    break;
                }
            case 2:
                int intValue = ((Number) this.A02).intValue();
                switch (intValue) {
                    case 1:
                        str = "FAIL";
                        break;
                    case 2:
                        str = "CANCEL";
                        break;
                    default:
                        str = "SUCCESS";
                        break;
                }
                i = str.hashCode() + intValue;
                break;
            default:
                long j = this.A01;
                i2 = ((int) (j ^ (j >>> 32))) * 31;
                Object obj2 = this.A02;
                if (obj2 != null) {
                    i3 = obj2.hashCode();
                    break;
                } else {
                    i3 = 0;
                    break;
                }
        }
        i2 = i * 31;
        long j2 = this.A01;
        i3 = (int) (j2 ^ (j2 >>> 32));
        return i2 + i3;
    }

    public final String toString() {
        String str;
        if (2 - this.A00 != 0) {
            return super.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Outcome(action=");
        Number number = (Number) this.A02;
        if (number != null) {
            switch (number.intValue()) {
                case 1:
                    str = "FAIL";
                    break;
                case 2:
                    str = "CANCEL";
                    break;
                default:
                    str = "SUCCESS";
                    break;
            }
        } else {
            str = "null";
        }
        sb.append(str);
        sb.append(C66579MXk.A00(446));
        sb.append(this.A01);
        sb.append(')');
        return sb.toString();
    }

    public AnonymousClass9IL(long j, Object obj, int i) {
        this.A00 = i;
        this.A01 = j;
        this.A02 = obj;
    }
}
