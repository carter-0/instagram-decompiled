package X;

/* renamed from: X.Ns8  reason: case insensitive filesystem */
public abstract class C69785Ns8 {
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0056, code lost:
        monitor-enter(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        X.0qQ.A0B(r3, 0);
        X.0qQ.A0B(r5, 1);
        X.0Yt.A0E();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        new X.C73670Phj(r5, r3, 28).invoke();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x006a, code lost:
        monitor-exit(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006b, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0029, code lost:
        throw X.DbW.A0c("Unknown experience outcome ", r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(X.AnonymousClass6Tm r7) {
        /*
            java.lang.Object r2 = r7.A01()
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.String"
            X.0qQ.A0C(r2, r0)
            java.lang.String r2 = (java.lang.String) r2
            r6 = 1
            java.lang.Object r5 = X.DbT.A0q(r7, r0, r6)
            java.lang.String r5 = (java.lang.String) r5
            X.OUs r7 = X.OUs.A00
            r4 = 0
            X.0qQ.A0B(r2, r4)
            java.lang.String r1 = X.AnonymousClass7TF.A0k(r2)
            int r0 = r1.hashCode()
            switch(r0) {
                case -1348905847: goto L_0x004b;
                case 1951623110: goto L_0x0040;
                case 1967871671: goto L_0x0035;
                case 2012901275: goto L_0x002a;
                default: goto L_0x0023;
            }
        L_0x0023:
            java.lang.String r0 = "Unknown experience outcome "
            java.lang.IllegalStateException r0 = X.DbW.A0c(r0, r2)
            throw r0
        L_0x002a:
            java.lang.String r0 = "DENIED"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0023
            java.lang.Integer r3 = X.AnonymousClass05K.A01
            goto L_0x0055
        L_0x0035:
            java.lang.String r0 = "APPROVED"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0023
            java.lang.Integer r3 = X.AnonymousClass05K.A00
            goto L_0x0055
        L_0x0040:
            java.lang.String r0 = "BACKED"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0023
            java.lang.Integer r3 = X.AnonymousClass05K.A0N
            goto L_0x0055
        L_0x004b:
            java.lang.String r0 = "DISMISSED"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0023
            java.lang.Integer r3 = X.AnonymousClass05K.A0C
        L_0x0055:
            r2 = 0
            monitor-enter(r7)
            X.0qQ.A0B(r3, r4)     // Catch:{ all -> 0x006e }
            X.0qQ.A0B(r5, r6)     // Catch:{ all -> 0x006e }
            X.0Yt.A0E()     // Catch:{ all -> 0x006e }
            r1 = 28
            X.Phj r0 = new X.Phj     // Catch:{ all -> 0x006e }
            r0.<init>(r5, r3, r1)     // Catch:{ all -> 0x006e }
            r0.invoke()     // Catch:{ all -> 0x006c }
            monitor-exit(r7)
            return r2
        L_0x006c:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x006e }
        L_0x006e:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C69785Ns8.A00(X.6Tm):java.lang.Object");
    }
}
