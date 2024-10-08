package X;

/* renamed from: X.4qL  reason: invalid class name and case insensitive filesystem */
public final class C275474qL extends 0Lp {
    public final /* synthetic */ AnonymousClass19A A00;

    public C275474qL(AnonymousClass19A r1) {
        this.A00 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006f, code lost:
        if (r3[5] == r1) goto L_0x0071;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.0HV AjQ(X.0HW r7, java.lang.String r8, java.lang.reflect.Method r9, java.lang.Object[] r10) {
        /*
            r6 = this;
            int r1 = android.os.Process.myPid()
            int r0 = android.os.Process.myTid()
            r5 = 0
            if (r1 == r0) goto L_0x000c
            return r5
        L_0x000c:
            X.19A r4 = r6.A00
            android.content.IntentFilter r0 = X.AnonymousClass19A.A03
            java.util.List r0 = r4.A01
            java.util.Iterator r2 = r0.iterator()
        L_0x0016:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0046
            java.lang.Object r1 = r2.next()
            java.lang.String r0 = r9.getName()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0016
            java.lang.Class r1 = r9.getReturnType()
            java.lang.Class r0 = java.lang.Void.TYPE
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0016
            android.os.Handler r1 = r4.A00
            X.50A r0 = new X.50A
            r0.<init>(r7, r9, r10)
        L_0x003d:
            r1.post(r0)
            X.0HV r0 = new X.0HV
            r0.<init>(r5)
            return r0
        L_0x0046:
            boolean r0 = r4.A02
            if (r0 == 0) goto L_0x00a9
            java.lang.String r1 = r9.getName()
            java.lang.String r0 = "registerReceiver"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x00a9
            if (r10 == 0) goto L_0x00a9
            java.lang.Class[] r3 = r9.getParameterTypes()
            int r1 = r3.length
            r0 = 6
            if (r1 < r0) goto L_0x0095
            r2 = 3
            r0 = r3[r2]
            java.lang.Class<android.content.IntentFilter> r1 = android.content.IntentFilter.class
            if (r0 == r1) goto L_0x0071
            r2 = 4
            r0 = r3[r2]
            if (r0 == r1) goto L_0x0071
            r2 = 5
            r0 = r3[r2]
            if (r0 != r1) goto L_0x0095
        L_0x0071:
            r3 = r10[r2]
            android.content.IntentFilter r3 = (android.content.IntentFilter) r3
            if (r3 == 0) goto L_0x0095
            r2 = 0
        L_0x0078:
            int r0 = r3.countActions()
            if (r2 >= r0) goto L_0x008d
            java.lang.String r1 = r3.getAction(r2)
            android.content.IntentFilter r0 = X.AnonymousClass19A.A03
            boolean r0 = r0.hasAction(r1)
            if (r0 != 0) goto L_0x00a9
            int r2 = r2 + 1
            goto L_0x0078
        L_0x008d:
            android.os.Handler r1 = r4.A00
            X.Pb0 r0 = new X.Pb0
            r0.<init>(r7, r4, r9, r10)
            goto L_0x003d
        L_0x0095:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Fail to find IntentFilter, method="
            r1.append(r0)
            r1.append(r9)
            java.lang.String r0 = r1.toString()
            r4.A0A(r0)
        L_0x00a9:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C275474qL.AjQ(X.0HW, java.lang.String, java.lang.reflect.Method, java.lang.Object[]):X.0HV");
    }
}
