package X;

import android.net.Uri;

/* renamed from: X.3vz  reason: invalid class name and case insensitive filesystem */
public final class C256573vz {
    public int A00;
    public final long A01;
    public final long A02;
    public final String A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C256573vz r7 = (C256573vz) obj;
            if (!(this.A02 == r7.A02 && this.A01 == r7.A01 && this.A03.equals(r7.A03))) {
                return false;
            }
        }
        return true;
    }

    public final Uri A00(String str) {
        return Uri.parse(C256543vw.A00(str, this.A03));
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0031  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C256573vz A01(X.C256573vz r16, java.lang.String r17) {
        /*
            r15 = this;
            java.lang.String r0 = r15.A03
            r1 = r17
            java.lang.String r10 = X.C256543vw.A00(r1, r0)
            r9 = 0
            r5 = r16
            if (r16 == 0) goto L_0x0038
            java.lang.String r0 = r5.A03
            java.lang.String r0 = X.C256543vw.A00(r1, r0)
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x0038
            long r2 = r15.A01
            r13 = -1
            int r0 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r0 == 0) goto L_0x0039
            long r11 = r15.A02
            long r6 = r11 + r2
            long r0 = r5.A02
            int r4 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r4 != 0) goto L_0x0039
            long r0 = r5.A01
            int r4 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
        L_0x002f:
            if (r4 == 0) goto L_0x0033
            long r2 = r2 + r0
            r13 = r2
        L_0x0033:
            X.3vz r9 = new X.3vz
            r9.<init>(r10, r11, r13)
        L_0x0038:
            return r9
        L_0x0039:
            long r0 = r5.A01
            int r4 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r4 == 0) goto L_0x0038
            long r11 = r5.A02
            long r7 = r11 + r0
            long r4 = r15.A02
            int r6 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r6 != 0) goto L_0x0038
            int r4 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            goto L_0x002f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C256573vz.A01(X.3vz, java.lang.String):X.3vz");
    }

    public final int hashCode() {
        int i = this.A00;
        if (i != 0) {
            return i;
        }
        int hashCode = ((((527 + ((int) this.A02)) * 31) + ((int) this.A01)) * 31) + this.A03.hashCode();
        this.A00 = hashCode;
        return hashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("RangedUri(referenceUri=");
        sb.append(this.A03);
        sb.append(", start=");
        sb.append(this.A02);
        sb.append(Pxd.A00(115));
        sb.append(this.A01);
        sb.append(")");
        return sb.toString();
    }

    public C256573vz(String str, long j, long j2) {
        this.A03 = str == null ? "" : str;
        this.A02 = j;
        this.A01 = j2;
    }
}
