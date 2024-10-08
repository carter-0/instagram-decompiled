package X;

public final class SJE {
    public static final C10865RzQ A07 = new Object();
    public final int A00;
    public final int A01;
    public final int A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final boolean A06;

    public final boolean equals(Object obj) {
        int i;
        String str;
        String str2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof SJE) {
            SJE sje = (SJE) obj;
            if (this.A02 == sje.A02 && 0qQ.A0K(this.A04, sje.A04) && this.A06 == sje.A06 && ((i = this.A01) != 1 || sje.A01 != 2 || (str2 = this.A03) == null || A07.A00(str2, sje.A03))) {
                if (i == 2 && sje.A01 == 1 && (str = sje.A03) != null && !A07.A00(str, this.A03)) {
                    return false;
                }
                if (i == sje.A01) {
                    String str3 = this.A03;
                    if (str3 != null) {
                        if (!A07.A00(str3, sje.A03)) {
                            return false;
                        }
                    } else if (sje.A03 != null) {
                        return false;
                    }
                }
                return this.A00 == sje.A00;
            }
        }
        return false;
    }

    public final int hashCode() {
        int A0O = (AnonymousClass7TE.A0O(this.A04) + this.A00) * 31;
        int i = 1237;
        if (this.A06) {
            i = 1231;
        }
        return ((A0O + i) * 31) + this.A02;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0058, code lost:
        if (X.00l.A0d(r2, "DOUB", false) != false) goto L_0x005a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SJE(java.lang.String r5, java.lang.String r6, java.lang.String r7, int r8, int r9, boolean r10) {
        /*
            r4 = this;
            r4.<init>()
            r4.A04 = r5
            r4.A05 = r6
            r4.A06 = r10
            r4.A02 = r8
            r4.A03 = r7
            r4.A01 = r9
            r3 = 5
            java.lang.String r2 = X.DbY.A0k(r6)
            java.lang.String r0 = "INT"
            r1 = 0
            boolean r0 = X.00l.A0d(r2, r0, r1)
            if (r0 == 0) goto L_0x0021
            r3 = 3
        L_0x001e:
            r4.A00 = r3
            return
        L_0x0021:
            java.lang.String r0 = "CHAR"
            boolean r0 = X.00l.A0d(r2, r0, r1)
            if (r0 != 0) goto L_0x005c
            java.lang.String r0 = "CLOB"
            boolean r0 = X.00l.A0d(r2, r0, r1)
            if (r0 != 0) goto L_0x005c
            java.lang.String r0 = "TEXT"
            boolean r0 = X.00l.A0d(r2, r0, r1)
            if (r0 != 0) goto L_0x005c
            java.lang.String r0 = "BLOB"
            boolean r0 = X.00l.A0d(r2, r0, r1)
            if (r0 != 0) goto L_0x001e
            java.lang.String r0 = "REAL"
            boolean r0 = X.00l.A0d(r2, r0, r1)
            if (r0 != 0) goto L_0x005a
            java.lang.String r0 = "FLOA"
            boolean r0 = X.00l.A0d(r2, r0, r1)
            if (r0 != 0) goto L_0x005a
            java.lang.String r0 = "DOUB"
            boolean r0 = X.00l.A0d(r2, r0, r1)
            r3 = 1
            if (r0 == 0) goto L_0x001e
        L_0x005a:
            r3 = 4
            goto L_0x001e
        L_0x005c:
            r3 = 2
            goto L_0x001e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SJE.<init>(java.lang.String, java.lang.String, java.lang.String, int, int, boolean):void");
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("Column{name='");
        A1A.append(this.A04);
        A1A.append("', type='");
        A1A.append(this.A05);
        A1A.append("', affinity='");
        A1A.append(this.A00);
        A1A.append("', notNull=");
        A1A.append(this.A06);
        A1A.append(", primaryKeyPosition=");
        A1A.append(this.A02);
        A1A.append(", defaultValue='");
        String str = this.A03;
        if (str == null) {
            str = "undefined";
        }
        A1A.append(str);
        return AnonymousClass7TF.A0l("'}", A1A);
    }
}
