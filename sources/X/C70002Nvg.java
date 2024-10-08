package X;

/* renamed from: X.Nvg  reason: case insensitive filesystem */
public abstract class C70002Nvg {
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0026, code lost:
        if (r13 == false) goto L_0x0028;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002c, code lost:
        if (r11.isEmpty() == false) goto L_0x0040;
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002e, code lost:
        if (r14 != false) goto L_0x0032;
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0030, code lost:
        if (r15 == false) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0040, code lost:
        if (r12 != false) goto L_0x0083;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0042, code lost:
        if (r14 != false) goto L_0x0098;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0044, code lost:
        r5 = r2.get(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0048, code lost:
        if (r13 != false) goto L_0x0069;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004a, code lost:
        if (r15 != false) goto L_0x007e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x004c, code lost:
        r6 = X.00k.A0K(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0050, code lost:
        r1 = r2.iterator();
        r4 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0055, code lost:
        r3 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x005a, code lost:
        if (r1.hasNext() == false) goto L_0x009d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0064, code lost:
        if (r9.compare(r1.next(), r5) == 0) goto L_0x009e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0066, code lost:
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0069, code lost:
        if (r15 == false) goto L_0x0079;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0077, code lost:
        if (r9.compare(X.00k.A0K(r10), X.00k.A0K(r11)) > 0) goto L_0x007e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0079, code lost:
        r6 = X.00k.A0K(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x007e, code lost:
        r6 = X.00k.A0K(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0083, code lost:
        if (r14 == false) goto L_0x0093;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000f, code lost:
        if (r14 != false) goto L_0x0011;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0091, code lost:
        if (r9.compare(r10.get(0), r11.get(0)) < 0) goto L_0x0098;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0093, code lost:
        r5 = r10.get(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0098, code lost:
        r5 = r11.get(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x009d, code lost:
        r4 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x009e, code lost:
        r1 = r2.listIterator(r2.size());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00aa, code lost:
        if (r1.hasPrevious() == false) goto L_0x00ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00b4, code lost:
        if (r9.compare(r1.previous(), r6) != 0) goto L_0x00a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00b6, code lost:
        r3 = r1.nextIndex();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00ba, code lost:
        r2 = r2.subList(r4, r3 + 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0015, code lost:
        if (r15 != false) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.AnonymousClass59G A00(java.util.Comparator r9, java.util.List r10, java.util.List r11, boolean r12, boolean r13, boolean r14, boolean r15) {
        /*
            r3 = 0
            X.AnonymousClass7TF.A1C(r10, r3, r11)
            r0 = 6
            X.0qQ.A0B(r9, r0)
            java.util.ArrayList r2 = X.AnonymousClass3S1.A02(r9, r10, r11)
            if (r12 != 0) goto L_0x0011
            r8 = 0
            if (r14 == 0) goto L_0x0012
        L_0x0011:
            r8 = 1
        L_0x0012:
            if (r13 != 0) goto L_0x0017
            r7 = 0
            if (r15 == 0) goto L_0x0018
        L_0x0017:
            r7 = 1
        L_0x0018:
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x0032
            boolean r0 = r10.isEmpty()
            if (r0 == 0) goto L_0x0028
            if (r12 != 0) goto L_0x0032
            if (r13 != 0) goto L_0x0032
        L_0x0028:
            boolean r0 = r11.isEmpty()
            if (r0 == 0) goto L_0x0040
            if (r14 != 0) goto L_0x0032
            if (r15 == 0) goto L_0x0040
        L_0x0032:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r8)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r7)
            X.59G r3 = new X.59G
            r3.<init>(r2, r1, r0)
            return r3
        L_0x0040:
            if (r12 != 0) goto L_0x0083
            if (r14 != 0) goto L_0x0098
            java.lang.Object r5 = r2.get(r3)
        L_0x0048:
            if (r13 != 0) goto L_0x0069
            if (r15 != 0) goto L_0x007e
            java.lang.Object r6 = X.00k.A0K(r2)
        L_0x0050:
            java.util.Iterator r1 = r2.iterator()
            r4 = 0
        L_0x0055:
            boolean r0 = r1.hasNext()
            r3 = -1
            if (r0 == 0) goto L_0x009d
            java.lang.Object r0 = r1.next()
            int r0 = r9.compare(r0, r5)
            if (r0 == 0) goto L_0x009e
            int r4 = r4 + 1
            goto L_0x0055
        L_0x0069:
            if (r15 == 0) goto L_0x0079
            java.lang.Object r1 = X.00k.A0K(r10)
            java.lang.Object r0 = X.00k.A0K(r11)
            int r0 = r9.compare(r1, r0)
            if (r0 > 0) goto L_0x007e
        L_0x0079:
            java.lang.Object r6 = X.00k.A0K(r10)
            goto L_0x0050
        L_0x007e:
            java.lang.Object r6 = X.00k.A0K(r11)
            goto L_0x0050
        L_0x0083:
            if (r14 == 0) goto L_0x0093
            java.lang.Object r1 = r10.get(r3)
            java.lang.Object r0 = r11.get(r3)
            int r0 = r9.compare(r1, r0)
            if (r0 < 0) goto L_0x0098
        L_0x0093:
            java.lang.Object r5 = r10.get(r3)
            goto L_0x0048
        L_0x0098:
            java.lang.Object r5 = r11.get(r3)
            goto L_0x0048
        L_0x009d:
            r4 = -1
        L_0x009e:
            int r0 = r2.size()
            java.util.ListIterator r1 = r2.listIterator(r0)
        L_0x00a6:
            boolean r0 = r1.hasPrevious()
            if (r0 == 0) goto L_0x00ba
            java.lang.Object r0 = r1.previous()
            int r0 = r9.compare(r0, r6)
            if (r0 != 0) goto L_0x00a6
            int r3 = r1.nextIndex()
        L_0x00ba:
            int r0 = r3 + 1
            java.util.List r2 = r2.subList(r4, r0)
            goto L_0x0032
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70002Nvg.A00(java.util.Comparator, java.util.List, java.util.List, boolean, boolean, boolean, boolean):X.59G");
    }
}
