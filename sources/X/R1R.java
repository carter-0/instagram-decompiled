package X;

public abstract class R1R extends C249803kO {
    public Integer A00 = AnonymousClass05K.A01;
    public Object A01;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: X.Qz3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: X.Qz2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: X.Qz3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: X.Qz3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: X.Qz3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: X.Qz3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: X.Qz3} */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0055, code lost:
        r1 = (java.util.Iterator) r2.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005d, code lost:
        if (r1.hasNext() == false) goto L_0x00d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005f, code lost:
        r4 = r1.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006d, code lost:
        if (((X.R1J) r2.A02).A01.contains(r4) != false) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0070, code lost:
        r1 = (java.util.Iterator) r2.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0078, code lost:
        if (r1.hasNext() == false) goto L_0x00d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x007a, code lost:
        r0 = X.AnonymousClass7TE.A1J(r1);
        r5 = r0.getKey();
        r1 = X.QzM.A00(new X.C12610Szu(((X.R0o) r2.A02).A00.A00, r5), X.Pxe.A18(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x009b, code lost:
        if (r1.isEmpty() != false) goto L_0x0070;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x009d, code lost:
        r4 = new com.google.common.collect.ImmutableEntry(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00a3, code lost:
        r1 = (java.util.Iterator) r2.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00ab, code lost:
        if (r1.hasNext() == false) goto L_0x00d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00ad, code lost:
        r4 = r1.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00b9, code lost:
        if (((X.1UV) r2.A01).apply(r4) == false) goto L_0x00a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00bc, code lost:
        r1 = (java.util.Iterator) r2.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00c4, code lost:
        if (r1.hasNext() == false) goto L_0x00d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00c6, code lost:
        r4 = r1.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00d4, code lost:
        if (((X.R1K) r2.A02).A01.contains(r4) == false) goto L_0x00bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00d8, code lost:
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00d8, code lost:
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00d8, code lost:
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00d8, code lost:
        r2 = r2;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean hasNext() {
        /*
            r6 = this;
            java.lang.Integer r5 = r6.A00
            java.lang.Integer r4 = X.AnonymousClass05K.A0N
            r3 = 0
            r2 = 1
            r1 = 2
            boolean r0 = X.C51969G9p.A1a(r5, r4)
            X.17k.A0F(r0)
            int r0 = r5.intValue()
            if (r0 == r1) goto L_0x004d
            if (r0 == r3) goto L_0x00df
            r6.A00 = r4
            r2 = r6
            boolean r0 = r6 instanceof X.C8661Qz2
            if (r0 == 0) goto L_0x004e
            X.Qz2 r2 = (X.C8661Qz2) r2
        L_0x001f:
            java.util.Iterator r1 = r2.A00
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00d8
            java.util.Map$Entry r4 = X.AnonymousClass7TE.A1J(r1)
            java.lang.Object r0 = r4.getValue()
            java.util.concurrent.atomic.AtomicInteger r0 = (java.util.concurrent.atomic.AtomicInteger) r0
            int r1 = r0.get()
            if (r1 == 0) goto L_0x001f
            java.lang.Object r0 = r4.getKey()
            com.google.common.collect.Multisets$ImmutableEntry r4 = new com.google.common.collect.Multisets$ImmutableEntry
            r4.<init>(r0, r1)
        L_0x0040:
            r6.A01 = r4
            java.lang.Integer r1 = r6.A00
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r1 == r0) goto L_0x004d
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            r6.A00 = r0
            r3 = 1
        L_0x004d:
            return r3
        L_0x004e:
            X.Qz3 r2 = (X.C8662Qz3) r2
            int r0 = r2.A00
            switch(r0) {
                case 0: goto L_0x0070;
                case 1: goto L_0x00a3;
                case 2: goto L_0x00bc;
                default: goto L_0x0055;
            }
        L_0x0055:
            java.lang.Object r1 = r2.A01
            java.util.Iterator r1 = (java.util.Iterator) r1
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00d8
            java.lang.Object r4 = r1.next()
            java.lang.Object r0 = r2.A02
            X.R1J r0 = (X.R1J) r0
            java.util.Set r0 = r0.A01
            boolean r0 = r0.contains(r4)
            if (r0 != 0) goto L_0x0055
            goto L_0x0040
        L_0x0070:
            java.lang.Object r1 = r2.A01
            java.util.Iterator r1 = (java.util.Iterator) r1
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00d8
            java.util.Map$Entry r0 = X.AnonymousClass7TE.A1J(r1)
            java.lang.Object r5 = r0.getKey()
            java.util.Collection r4 = X.Pxe.A18(r0)
            java.lang.Object r0 = r2.A02
            X.R0o r0 = (X.R0o) r0
            X.R0u r0 = r0.A00
            X.QzM r1 = r0.A00
            X.Szu r0 = new X.Szu
            r0.<init>(r1, r5)
            java.util.Collection r1 = X.QzM.A00(r0, r4)
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0070
            com.google.common.collect.ImmutableEntry r4 = new com.google.common.collect.ImmutableEntry
            r4.<init>(r5, r1)
            goto L_0x0040
        L_0x00a3:
            java.lang.Object r1 = r2.A02
            java.util.Iterator r1 = (java.util.Iterator) r1
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00d8
            java.lang.Object r4 = r1.next()
            java.lang.Object r0 = r2.A01
            X.1UV r0 = (X.1UV) r0
            boolean r0 = r0.apply(r4)
            if (r0 == 0) goto L_0x00a3
            goto L_0x0040
        L_0x00bc:
            java.lang.Object r1 = r2.A01
            java.util.Iterator r1 = (java.util.Iterator) r1
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00d8
            java.lang.Object r4 = r1.next()
            java.lang.Object r0 = r2.A02
            X.R1K r0 = (X.R1K) r0
            java.util.Set r0 = r0.A01
            boolean r0 = r0.contains(r4)
            if (r0 == 0) goto L_0x00bc
            goto L_0x0040
        L_0x00d8:
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            r2.A00 = r0
            r4 = 0
            goto L_0x0040
        L_0x00df:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.R1R.hasNext():boolean");
    }

    public final Object next() {
        if (hasNext()) {
            this.A00 = AnonymousClass05K.A01;
            Object obj = this.A01;
            this.A01 = null;
            return obj;
        }
        throw Pxe.A1C();
    }
}
