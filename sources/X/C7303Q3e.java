package X;

/* renamed from: X.Q3e  reason: case insensitive filesystem */
public abstract class C7303Q3e implements C13751TgN {
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0079, code lost:
        if (r13.A0C().equals(r5) == false) goto L_0x007b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0019, code lost:
        if (r13.A0C().equals(r3) == false) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C276544tV ABu(X.C276634te r12, X.C276544tV r13) {
        /*
            r11 = this;
            r7 = r13
            r4 = r11
            boolean r0 = r11 instanceof X.R9L
            if (r0 == 0) goto L_0x0062
            X.R9L r4 = (X.R9L) r4
            java.lang.String r3 = r4.A02
            java.lang.String r0 = r13.A0C()
            if (r0 == 0) goto L_0x001b
            java.lang.String r0 = r13.A0C()
            boolean r1 = r0.equals(r3)
            r0 = 1
            if (r1 != 0) goto L_0x001c
        L_0x001b:
            r0 = 0
        L_0x001c:
            java.lang.String r2 = "Multiple components with the same id found during reflow"
            if (r0 == 0) goto L_0x0026
            X.4tV r0 = r4.A00
            if (r0 != 0) goto L_0x00c1
            r4.A00 = r13
        L_0x0026:
            java.util.LinkedList r0 = r13.A08
            if (r0 == 0) goto L_0x004a
            java.util.Iterator r1 = r0.iterator()
        L_0x002e:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x004a
            java.lang.Object r0 = r1.next()
            X.Q3g r0 = (X.C7304Q3g) r0
            java.lang.String r0 = r0.A03
            if (r0 == 0) goto L_0x002e
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x002e
            X.4tV r0 = r4.A00
            if (r0 != 0) goto L_0x00bc
            r4.A00 = r13
        L_0x004a:
            X.4tV r0 = r4.A00
            if (r0 == 0) goto L_0x0061
            r0 = 134(0x86, float:1.88E-43)
            X.4uI r2 = r13.A0A(r0)
            if (r2 == 0) goto L_0x0061
            X.6Tm r1 = X.Pxj.A0a(r13)
            X.5ur r0 = r4.A01
            X.6Rx r0 = r0.A00
            X.C299275ur.A00(r0, r1, r2)
        L_0x0061:
            return r7
        L_0x0062:
            boolean r0 = r11 instanceof X.R9K
            if (r0 == 0) goto L_0x00d0
            X.R9K r4 = (X.R9K) r4
            java.lang.String r5 = r4.A02
            java.lang.String r0 = r13.A0C()
            if (r0 == 0) goto L_0x007b
            java.lang.String r0 = r13.A0C()
            boolean r1 = r0.equals(r5)
            r0 = 1
            if (r1 != 0) goto L_0x007c
        L_0x007b:
            r0 = 0
        L_0x007c:
            java.lang.String r6 = "Multiple components with the same id found during reflow"
            if (r0 == 0) goto L_0x0086
            X.4tV r0 = r4.A00
            if (r0 != 0) goto L_0x00cb
            r4.A00 = r13
        L_0x0086:
            java.util.LinkedList r0 = r13.A08
            if (r0 == 0) goto L_0x0061
            java.util.Iterator r3 = r0.iterator()
        L_0x008e:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0061
            java.lang.Object r1 = r3.next()
            X.Q3g r1 = (X.C7304Q3g) r1
            java.lang.String r0 = r1.A03
            if (r0 == 0) goto L_0x00aa
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L_0x00aa
            X.4tV r0 = r4.A00
            if (r0 != 0) goto L_0x00c6
            r4.A00 = r13
        L_0x00aa:
            X.4tV r0 = r4.A00
            if (r0 == 0) goto L_0x008e
            X.4uI r2 = r1.A01
            if (r2 == 0) goto L_0x008e
            X.5ur r0 = r4.A01
            X.6Tm r1 = X.AnonymousClass6Tm.A01
            X.6Rx r0 = r0.A00
            X.C299275ur.A00(r0, r1, r2)
            goto L_0x008e
        L_0x00bc:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r2)
            throw r0
        L_0x00c1:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r2)
            throw r0
        L_0x00c6:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r6)
            throw r0
        L_0x00cb:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r6)
            throw r0
        L_0x00d0:
            boolean r0 = r11 instanceof X.C7309Q3l
            if (r0 == 0) goto L_0x0122
            X.Q3l r4 = (X.C7309Q3l) r4
            r3 = 0
            r2 = 0
            r5 = r13
        L_0x00d9:
            java.util.List r1 = r4.A00
            int r0 = r1.size()
            if (r2 >= r0) goto L_0x011c
            java.lang.Object r1 = r1.get(r2)
            android.util.Pair r1 = (android.util.Pair) r1
            java.lang.Object r0 = r1.first
            X.Tee r0 = (X.C13670Tee) r0
            boolean r0 = r0.Ezc(r5)
            if (r0 == 0) goto L_0x0119
            if (r3 != 0) goto L_0x00f7
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()
        L_0x00f7:
            r3.add(r1)
            java.lang.Object r0 = r1.second
            X.Q42 r0 = (X.Q42) r0
            boolean r0 = r0.A01(r5)
            if (r0 == 0) goto L_0x0119
            if (r5 != r13) goto L_0x0112
            r8 = 0
            int r10 = r13.A03
            java.util.List r9 = r13.A09
            X.4te r6 = r13.A01
            X.4tV r5 = new X.4tV
            r5.<init>(r6, r7, r8, r9, r10)
        L_0x0112:
            java.lang.Object r0 = r1.second
            X.Q42 r0 = (X.Q42) r0
            r0.A00(r5)
        L_0x0119:
            int r2 = r2 + 1
            goto L_0x00d9
        L_0x011c:
            if (r3 == 0) goto L_0x0121
            r1.removeAll(r3)
        L_0x0121:
            return r5
        L_0x0122:
            X.Q49 r4 = (X.Q49) r4
            java.util.List r9 = r4.A01
            java.util.concurrent.atomic.AtomicInteger r0 = X.C276604tb.A00
            int r10 = r0.incrementAndGet()
            r8 = 0
            X.4te r6 = r13.A01
            X.4tV r5 = new X.4tV
            r5.<init>(r6, r7, r8, r9, r10)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7303Q3e.ABu(X.4te, X.4tV):X.4tV");
    }
}
