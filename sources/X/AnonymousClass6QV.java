package X;

/* renamed from: X.6QV  reason: invalid class name */
public final class AnonymousClass6QV extends RuntimeException implements AnonymousClass6QW {
    public final C276634te A00;
    public final AnonymousClass6U0 A01;

    public AnonymousClass6QV(AnonymousClass6U0 r2) {
        super(r2);
        this.A00 = null;
        this.A01 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004a, code lost:
        if (r2.hasNext() == false) goto L_0x005c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004c, code lost:
        r1 = r2.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0054, code lost:
        if (r3.booleanValue() != false) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0056, code lost:
        r5.add(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005a, code lost:
        r3 = false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List AgO() {
        /*
            r6 = this;
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            X.6U0 r0 = r6.A01
            java.lang.String r1 = r0.A00
            r0 = 0
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r0)
            if (r1 == 0) goto L_0x003e
            java.lang.String r0 = "\n"
            java.lang.String[] r0 = r1.split(r0)
            java.util.List r0 = java.util.Arrays.asList(r0)
            r5.addAll(r0)
            r0 = 1
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)
        L_0x0022:
            X.4te r0 = r6.A00
            if (r0 == 0) goto L_0x005c
            r2 = 0
        L_0x0027:
            X.S5V r1 = r0.AgN()
            if (r1 == 0) goto L_0x0040
            if (r2 != 0) goto L_0x0034
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
        L_0x0034:
            java.lang.String r0 = r1.A01
            r2.add(r0)
            X.4te r0 = r1.A00
            if (r0 == 0) goto L_0x0042
            goto L_0x0027
        L_0x003e:
            r3 = r4
            goto L_0x0022
        L_0x0040:
            if (r2 == 0) goto L_0x005c
        L_0x0042:
            java.util.Iterator r2 = r2.iterator()
        L_0x0046:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x005c
            java.lang.Object r1 = r2.next()
            boolean r0 = r3.booleanValue()
            if (r0 != 0) goto L_0x005a
            r5.add(r1)
            goto L_0x0046
        L_0x005a:
            r3 = r4
            goto L_0x0046
        L_0x005c:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6QV.AgO():java.util.List");
    }

    public final String B2P() {
        return this.A01.getMessage();
    }

    public final String BOB() {
        C276634te r0 = this.A00;
        if (r0 == null) {
            return null;
        }
        return r0.BOB();
    }

    public final Throwable BVP() {
        return this.A01.getCause();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass6QV(X.C276634te r2, X.AnonymousClass6QV r3) {
        /*
            r1 = this;
            X.6U0 r0 = r3.A01
            r1.<init>(r0)
            r1.A00 = r2
            r1.A01 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6QV.<init>(X.4te, X.6QV):void");
    }
}
