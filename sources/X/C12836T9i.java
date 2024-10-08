package X;

import java.io.Serializable;
import java.util.Arrays;

/* renamed from: X.T9i  reason: case insensitive filesystem */
public final class C12836T9i implements Serializable {
    public final int A00;
    public final String A01;
    public final boolean A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C12836T9i)) {
                return false;
            }
            C12836T9i t9i = (C12836T9i) obj;
            if (!2PP.A00(this.A01, t9i.A01) || this.A00 != t9i.A00) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(C51968G9o.A1Z(this.A01, this.A00));
    }

    public final String toString() {
        String str = this.A01;
        StringBuilder A14 = Pxe.A14(str.length() + 8);
        if (str.indexOf(58) >= 0) {
            A14.append('[');
            A14.append(str);
            A14.append(']');
        } else {
            A14.append(str);
        }
        int i = this.A00;
        if (i >= 0) {
            A14.append(':');
            A14.append(i);
        }
        return A14.toString();
    }

    public C12836T9i(String str, int i, boolean z) {
        this.A01 = str;
        this.A00 = i;
        this.A02 = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00c1, code lost:
        if (r3 > 65535) goto L_0x00c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x002c, code lost:
        if (r2 <= r4) goto L_0x002e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0051  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C12836T9i A00(java.lang.String r10) {
        /*
            r10.getClass()
            java.lang.String r0 = "["
            boolean r0 = r10.startsWith(r0)
            r3 = -1
            r5 = 1
            r6 = 0
            if (r0 == 0) goto L_0x0090
            char r1 = r10.charAt(r6)
            r0 = 91
            boolean r1 = X.AnonymousClass7TF.A1S(r1, r0)
            java.lang.String r0 = "Bracketed host-port string must start with a bracket: %s"
            X.17k.A0A(r10, r0, r1)
            r9 = 58
            int r4 = r10.indexOf(r9)
            r0 = 93
            int r2 = r10.lastIndexOf(r0)
            if (r4 <= r3) goto L_0x002e
            r1 = 1
            if (r2 > r4) goto L_0x002f
        L_0x002e:
            r1 = 0
        L_0x002f:
            java.lang.String r0 = "Invalid bracketed host/port: %s"
            X.17k.A0A(r10, r0, r1)
            java.lang.String r8 = r10.substring(r5, r2)
            int r0 = r2 + 1
            int r7 = r10.length()
            if (r0 != r7) goto L_0x0069
            java.lang.String r0 = ""
        L_0x0042:
            java.lang.String[] r0 = new java.lang.String[]{r8, r0}
            r4 = r0[r6]
            r0 = r0[r5]
        L_0x004a:
            r2 = 0
        L_0x004b:
            boolean r1 = X.AnonymousClass5He.A00(r0)
            if (r1 != 0) goto L_0x00c9
            java.lang.String r1 = "+"
            boolean r1 = r0.startsWith(r1)
            if (r1 != 0) goto L_0x0067
            X.Szy r1 = X.C8639Qyc.A00
            boolean r1 = r1.A0A(r0)
            if (r1 == 0) goto L_0x0067
        L_0x0061:
            java.lang.String r1 = "Unparseable port number: %s"
            X.17k.A0A(r10, r1, r5)
            goto L_0x00af
        L_0x0067:
            r5 = 0
            goto L_0x0061
        L_0x0069:
            char r0 = r10.charAt(r0)
            boolean r1 = X.AnonymousClass7TF.A1S(r0, r9)
            java.lang.String r0 = "Only a colon may follow a close bracket: %s"
            X.17k.A0A(r10, r0, r1)
            int r4 = r2 + 2
            r2 = r4
        L_0x0079:
            if (r2 >= r7) goto L_0x008b
            char r0 = r10.charAt(r2)
            boolean r1 = java.lang.Character.isDigit(r0)
            java.lang.String r0 = "Port must be numeric: %s"
            X.17k.A0A(r10, r0, r1)
            int r2 = r2 + 1
            goto L_0x0079
        L_0x008b:
            java.lang.String r0 = r10.substring(r4)
            goto L_0x0042
        L_0x0090:
            r0 = 58
            int r2 = r10.indexOf(r0)
            if (r2 < 0) goto L_0x00ab
            int r1 = r2 + 1
            int r0 = r10.indexOf(r0, r1)
            if (r0 != r3) goto L_0x00a9
            java.lang.String r4 = r10.substring(r6, r2)
            java.lang.String r0 = r10.substring(r1)
            goto L_0x004a
        L_0x00a9:
            r2 = 1
            goto L_0x00ac
        L_0x00ab:
            r2 = 0
        L_0x00ac:
            r0 = 0
            r4 = r10
            goto L_0x004b
        L_0x00af:
            int r3 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x00b6 }
            if (r3 < 0) goto L_0x00c3
            goto L_0x00bd
        L_0x00b6:
            java.lang.String r0 = "Unparseable port number: "
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TF.A0W(r0, r10)
            throw r0
        L_0x00bd:
            r0 = 65535(0xffff, float:9.1834E-41)
            r1 = 1
            if (r3 <= r0) goto L_0x00c4
        L_0x00c3:
            r1 = 0
        L_0x00c4:
            java.lang.String r0 = "Port number out of range: %s"
            X.17k.A0A(r10, r0, r1)
        L_0x00c9:
            X.T9i r0 = new X.T9i
            r0.<init>(r4, r3, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12836T9i.A00(java.lang.String):X.T9i");
    }
}
