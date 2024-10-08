package X;

import java.util.Iterator;

public abstract class TM9 implements Iterator {
    public int A00 = 2;
    public Object A01;

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x007a, code lost:
        if (r3 >= r6) goto L_0x007f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x007c, code lost:
        r5.charAt(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x007f, code lost:
        if (r3 >= r6) goto L_0x0086;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0081, code lost:
        r5.charAt(r6 - 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0088, code lost:
        if (r4.A04 == false) goto L_0x00e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00e1, code lost:
        r0 = r4.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00e3, code lost:
        if (r0 != 1) goto L_0x00fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00e5, code lost:
        r6 = r5.length();
        r4.A00 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00eb, code lost:
        if (r6 <= r3) goto L_0x00f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00ed, code lost:
        r5.charAt(r6 - 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00f2, code lost:
        r0 = r5.subSequence(r3, r6).toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00fb, code lost:
        r4.A01 = r0 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0104, code lost:
        r10.A01 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0109, code lost:
        if (r10.A00 == 3) goto L_0x010e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x010b, code lost:
        r10.A00 = 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean hasNext() {
        /*
            r10 = this;
            int r0 = r10.A00
            r3 = 4
            if (r0 == r3) goto L_0x010f
            int r1 = r0 + -1
            r2 = 1
            if (r1 == 0) goto L_0x010d
            r0 = 2
            r8 = 0
            if (r1 == r0) goto L_0x010e
            r10.A00 = r3
            r4 = r10
            X.Que r4 = (X.C8436Que) r4
        L_0x0013:
            int r3 = r4.A00
        L_0x0015:
            int r6 = r4.A00
            r9 = -1
            if (r6 == r9) goto L_0x0100
            java.lang.CharSequence r5 = r4.A03
            int r7 = r5.length()
            java.lang.String r0 = "index"
            if (r6 < 0) goto L_0x008d
            if (r6 <= r7) goto L_0x004a
            if (r7 < 0) goto L_0x00d9
            java.lang.Object[] r6 = X.Pxg.A1a(r0, r6, r7)
            java.lang.String r8 = "%s (%s) must not be greater than size (%s)"
        L_0x002e:
            r7 = 0
            r2 = 0
        L_0x0030:
            int r5 = r6.length
            if (r2 >= r5) goto L_0x0094
            r1 = r6[r2]
            if (r1 != 0) goto L_0x003f
            java.lang.String r0 = "null"
        L_0x003a:
            r6[r2] = r0
            int r2 = r2 + 1
            goto L_0x0030
        L_0x003f:
            java.lang.String r0 = r1.toString()     // Catch:{ Exception -> 0x0044 }
            goto L_0x003a
        L_0x0044:
            r0 = move-exception
            java.lang.String r0 = X.Pxk.A0I(r1, r0)
            goto L_0x003a
        L_0x004a:
            if (r6 >= r7) goto L_0x0072
            X.RpV r0 = r4.A05
            char r1 = r5.charAt(r6)
            X.RLv r0 = r0.A00
            X.Quf r0 = (X.C8437Quf) r0
            char r0 = r0.A00
            if (r1 != r0) goto L_0x006f
            if (r6 == r9) goto L_0x0072
            int r0 = r6 + 1
            r4.A00 = r0
        L_0x0060:
            if (r0 != r3) goto L_0x007a
            int r1 = r0 + 1
            r4.A00 = r1
            int r0 = r5.length()
            if (r1 <= r0) goto L_0x0015
            r4.A00 = r9
            goto L_0x0015
        L_0x006f:
            int r6 = r6 + 1
            goto L_0x004a
        L_0x0072:
            int r6 = r5.length()
            r4.A00 = r9
            r0 = -1
            goto L_0x0060
        L_0x007a:
            if (r3 >= r6) goto L_0x007f
            r5.charAt(r3)
        L_0x007f:
            if (r3 >= r6) goto L_0x0086
            int r0 = r6 + -1
            r5.charAt(r0)
        L_0x0086:
            boolean r0 = r4.A04
            if (r0 == 0) goto L_0x00e1
            if (r3 != r6) goto L_0x00e1
            goto L_0x0013
        L_0x008d:
            java.lang.Object[] r6 = X.C51968G9o.A1Z(r0, r6)
            java.lang.String r8 = "%s (%s) must not be negative"
            goto L_0x002e
        L_0x0094:
            int r4 = r8.length()
            int r0 = r5 * 16
            java.lang.StringBuilder r3 = X.Pxe.A15(r4, r0)
            r0 = 0
        L_0x009f:
            java.lang.String r1 = "%s"
            int r2 = r8.indexOf(r1, r0)
            if (r2 == r9) goto L_0x00b7
            r3.append(r8, r0, r2)
            int r1 = r7 + 1
            r0 = r6[r7]
            r3.append(r0)
            int r0 = r2 + 2
            r7 = r1
            if (r1 >= r5) goto L_0x00b7
            goto L_0x009f
        L_0x00b7:
            r3.append(r8, r0, r4)
            if (r7 >= r5) goto L_0x00d0
            java.lang.String r0 = " ["
            int r0 = X.Pxg.A07(r0, r3, r6, r7)
        L_0x00c2:
            if (r0 >= r5) goto L_0x00cb
            java.lang.String r1 = ", "
            int r0 = X.Pxg.A07(r1, r3, r6, r0)
            goto L_0x00c2
        L_0x00cb:
            r0 = 93
            r3.append(r0)
        L_0x00d0:
            java.lang.String r0 = r3.toString()
            java.lang.IndexOutOfBoundsException r0 = X.Pxe.A0k(r0)
            throw r0
        L_0x00d9:
            java.lang.String r0 = "negative size: "
            java.lang.IllegalArgumentException r0 = X.DbW.A0a(r0, r7)
            throw r0
        L_0x00e1:
            int r0 = r4.A01
            if (r0 != r2) goto L_0x00fb
            int r6 = r5.length()
            r4.A00 = r9
            if (r6 <= r3) goto L_0x00f2
            int r0 = r6 + -1
            r5.charAt(r0)
        L_0x00f2:
            java.lang.CharSequence r0 = r5.subSequence(r3, r6)
            java.lang.String r0 = r0.toString()
            goto L_0x0104
        L_0x00fb:
            int r0 = r0 + -1
            r4.A01 = r0
            goto L_0x00f2
        L_0x0100:
            r0 = 3
            r4.A00 = r0
            r0 = 0
        L_0x0104:
            r10.A01 = r0
            int r1 = r10.A00
            r0 = 3
            if (r1 == r0) goto L_0x010e
            r10.A00 = r2
        L_0x010d:
            return r2
        L_0x010e:
            return r8
        L_0x010f:
            java.lang.IllegalStateException r0 = X.Pxe.A0i()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.TM9.hasNext():boolean");
    }

    public final Object next() {
        if (hasNext()) {
            this.A00 = 2;
            Object obj = this.A01;
            this.A01 = null;
            return obj;
        }
        throw Pxe.A1C();
    }

    public final void remove() {
        throw C66580MXl.A11();
    }
}
