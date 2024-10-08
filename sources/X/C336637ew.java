package X;

/* renamed from: X.7ew  reason: invalid class name and case insensitive filesystem */
public final class C336637ew extends C333827aD {
    public final C333877aI A00;
    public final boolean A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C336637ew) {
                C336637ew r5 = (C336637ew) obj;
                if (!(this.A00 == r5.A00 && this.A01 == r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C336637ew(X.C333877aI r3, boolean r4) {
        /*
            r2 = this;
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "restricted_comments_reveal_header"
            r1.append(r0)
            java.lang.String r0 = r3.A00
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = r1.toString()
            r2.<init>(r0)
            r2.A00 = r3
            r2.A01 = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C336637ew.<init>(X.7aI, boolean):void");
    }

    public final int hashCode() {
        int hashCode = this.A00.hashCode() * 31;
        int i = 1237;
        if (this.A01) {
            i = 1231;
        }
        return hashCode + i;
    }
}
