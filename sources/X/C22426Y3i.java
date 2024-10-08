package X;

import java.util.Comparator;

/* renamed from: X.Y3i  reason: case insensitive filesystem */
public final class C22426Y3i implements Comparator {
    public final int A00;

    public C22426Y3i(int i) {
        this.A00 = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005c, code lost:
        return r1 - r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int compare(java.lang.Object r8, java.lang.Object r9) {
        /*
            r7 = this;
            int r0 = r7.A00
            switch(r0) {
                case 0: goto L_0x002e;
                case 1: goto L_0x0052;
                case 2: goto L_0x0041;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.String r8 = (java.lang.String) r8
            java.lang.String r9 = (java.lang.String) r9
            int r6 = r8.length()
            int r5 = r9.length()
            int r4 = java.lang.Math.min(r6, r5)
            r3 = 4
        L_0x0016:
            r2 = -1
            if (r3 >= r4) goto L_0x0029
            char r1 = r8.charAt(r3)
            char r0 = r9.charAt(r3)
            if (r1 == r0) goto L_0x0026
            if (r1 >= r0) goto L_0x0050
        L_0x0025:
            return r2
        L_0x0026:
            int r3 = r3 + 1
            goto L_0x0016
        L_0x0029:
            if (r6 == r5) goto L_0x003f
            if (r6 >= r5) goto L_0x0050
            return r2
        L_0x002e:
            java.lang.Number r8 = (java.lang.Number) r8
            java.lang.Number r9 = (java.lang.Number) r9
            int r1 = r8.intValue()
            r2 = -1
            int r0 = r9.intValue()
            if (r1 != r2) goto L_0x004e
            if (r0 != r2) goto L_0x0025
        L_0x003f:
            r2 = 0
            return r2
        L_0x0041:
            X.XaF r8 = (X.C21407XaF) r8
            X.XaF r9 = (X.C21407XaF) r9
            float r1 = r8.A00
            float r0 = r9.A00
            int r2 = java.lang.Float.compare(r1, r0)
            return r2
        L_0x004e:
            if (r0 != r2) goto L_0x005a
        L_0x0050:
            r2 = 1
            return r2
        L_0x0052:
            X.XaF r8 = (X.C21407XaF) r8
            X.XaF r9 = (X.C21407XaF) r9
            int r1 = r8.A01
            int r0 = r9.A01
        L_0x005a:
            int r2 = r1 - r0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22426Y3i.compare(java.lang.Object, java.lang.Object):int");
    }
}
