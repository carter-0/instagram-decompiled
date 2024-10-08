package X;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* renamed from: X.TLw  reason: case insensitive filesystem */
public final class C13113TLw implements Comparator {
    public final int A00;

    public C13113TLw(int i) {
        this.A00 = i;
    }

    public static void A00(int i, List list) {
        Collections.sort(list, new C13113TLw(i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003a, code lost:
        if (r1 >= r0) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x008f, code lost:
        return r6.compareTo((java.lang.Long) r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00c4, code lost:
        r0 = java.lang.Long.valueOf(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00cc, code lost:
        return X.29b.A00(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        return 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        return -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        return 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0037, code lost:
        if (r1 == r0) goto L_?;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int compare(java.lang.Object r6, java.lang.Object r7) {
        /*
            r5 = this;
            int r0 = r5.A00
            switch(r0) {
                case 0: goto L_0x000e;
                case 1: goto L_0x0051;
                case 2: goto L_0x004f;
                case 3: goto L_0x005c;
                case 4: goto L_0x0069;
                case 5: goto L_0x006c;
                case 6: goto L_0x0079;
                case 7: goto L_0x003e;
                case 8: goto L_0x0090;
                case 9: goto L_0x00a1;
                case 10: goto L_0x001b;
                case 11: goto L_0x00ab;
                case 12: goto L_0x0028;
                case 13: goto L_0x002f;
                case 14: goto L_0x00b8;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r7 = (java.lang.String) r7
            int r4 = r6.compareTo(r7)
        L_0x000d:
            return r4
        L_0x000e:
            X.SEM r6 = (X.SEM) r6
            X.SEM r7 = (X.SEM) r7
            X.Rvk r0 = r6.A01
            int r1 = r0.A00
            X.Rvk r0 = r7.A01
            int r0 = r0.A00
            goto L_0x0037
        L_0x001b:
            X.SEY r6 = (X.SEY) r6
            X.SEY r7 = (X.SEY) r7
            X.Ruq r0 = r6.A01
            int r1 = r0.A00
            X.Ruq r0 = r7.A01
            int r0 = r0.A00
            goto L_0x0037
        L_0x0028:
            X.Rwo r6 = (X.C10710Rwo) r6
            boolean r0 = r6.A03
            if (r0 == 0) goto L_0x004f
            goto L_0x003c
        L_0x002f:
            X.Rwo r6 = (X.C10710Rwo) r6
            X.Rwo r7 = (X.C10710Rwo) r7
            int r1 = r6.A00
            int r0 = r7.A00
        L_0x0037:
            if (r1 == r0) goto L_0x004f
            r4 = 1
            if (r1 >= r0) goto L_0x000d
        L_0x003c:
            r4 = -1
            return r4
        L_0x003e:
            X.4aM r6 = (X.C266794aM) r6
            X.4aM r7 = (X.C266794aM) r7
            long r3 = r6.A00
            long r1 = r7.A00
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x003c
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            r4 = 1
            if (r0 > 0) goto L_0x000d
        L_0x004f:
            r4 = 0
            return r4
        L_0x0051:
            X.RtU r6 = (X.C10515RtU) r6
            X.RtU r7 = (X.C10515RtU) r7
            long r2 = r6.A01
            long r0 = r7.A01
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            return r4
        L_0x005c:
            X.0eP r7 = (X.0eP) r7
            java.lang.Object r1 = r7.A01
            java.lang.Float r1 = (java.lang.Float) r1
            X.0eP r6 = (X.0eP) r6
            java.lang.Object r0 = r6.A01
            java.lang.Float r0 = (java.lang.Float) r0
            goto L_0x00c8
        L_0x0069:
            java.lang.Long r6 = (java.lang.Long) r6
            goto L_0x0089
        L_0x006c:
            X.QOl r6 = (X.QOl) r6
            long r0 = r6.A00
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            X.QOl r7 = (X.QOl) r7
            long r2 = r7.A00
            goto L_0x00c4
        L_0x0079:
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7
            X.TO6 r0 = X.C11375SQk.A07
            java.lang.Object r6 = r6.getValue()
            java.lang.Long r6 = (java.lang.Long) r6
            java.lang.Object r7 = r7.getValue()
        L_0x0089:
            java.lang.Long r7 = (java.lang.Long) r7
            int r4 = r6.compareTo(r7)
            return r4
        L_0x0090:
            X.4aF r6 = (X.C266724aF) r6
            X.4aF r7 = (X.C266724aF) r7
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MICROSECONDS
            long r2 = r6.A03(r0)
            long r0 = r7.A03(r0)
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            return r4
        L_0x00a1:
            X.SQr r6 = (X.C11379SQr) r6
            X.SQr r7 = (X.C11379SQr) r7
            int r4 = r7.A02
            int r0 = r6.A02
            int r4 = r4 - r0
            return r4
        L_0x00ab:
            X.0eP r6 = (X.0eP) r6
            java.lang.Object r1 = r6.A00
            java.lang.Comparable r1 = (java.lang.Comparable) r1
            X.0eP r7 = (X.0eP) r7
            java.lang.Object r0 = r7.A00
            java.lang.Comparable r0 = (java.lang.Comparable) r0
            goto L_0x00c8
        L_0x00b8:
            X.S35 r6 = (X.S35) r6
            long r0 = r6.A01
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            X.S35 r7 = (X.S35) r7
            long r2 = r7.A01
        L_0x00c4:
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
        L_0x00c8:
            int r4 = X.29b.A00(r1, r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C13113TLw.compare(java.lang.Object, java.lang.Object):int");
    }
}
