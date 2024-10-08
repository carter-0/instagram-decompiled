package X;

/* renamed from: X.QvG  reason: case insensitive filesystem */
public final class C8471QvG extends TA9 {
    public final String A00;

    public final int hashCode() {
        return Pxf.A0A(3, this.A00);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
        r1 = r4.A00;
        r0 = ((X.C8471QvG) r5).A00;
        r3 = r0.length();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ int compareTo(java.lang.Object r5) {
        /*
            r4 = this;
            X.TA9 r5 = (X.TA9) r5
            int r3 = r5.A02()
            r2 = 3
            if (r2 != r3) goto L_0x001e
            X.QvG r5 = (X.C8471QvG) r5
            java.lang.String r1 = r4.A00
            java.lang.String r0 = r5.A00
            int r3 = r0.length()
            int r2 = r1.length()
            if (r2 != r3) goto L_0x001e
            int r2 = r1.compareTo(r0)
            return r2
        L_0x001e:
            int r2 = r2 - r3
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8471QvG.compareTo(java.lang.Object):int");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.A00.equals(((C8471QvG) obj).A00);
    }

    public final String toString() {
        return 002.A0g("\"", this.A00, "\"");
    }

    public C8471QvG(String str) {
        this.A00 = str;
    }
}
