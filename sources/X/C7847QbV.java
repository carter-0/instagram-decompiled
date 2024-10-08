package X;

/* renamed from: X.QbV  reason: case insensitive filesystem */
public final class C7847QbV extends 2SM {
    public C7847QbV(Object[] objArr) {
        super((String[]) objArr);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00c7, code lost:
        if (r0 != null) goto L_0x00a9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(X.PzN r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof X.C7846QbU
            if (r0 == 0) goto L_0x002a
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.NANOSECONDS
            java.util.Map r1 = r8.A03
            java.lang.String r0 = "duration"
            java.lang.Object r1 = r1.get(r0)
            boolean r0 = r1 instanceof X.S5G
            if (r0 == 0) goto L_0x0027
            X.S5G r1 = (X.S5G) r1
            if (r1 == 0) goto L_0x0027
            long r0 = r1.A00
        L_0x0018:
            long r3 = r2.toMillis(r0)
            X.9Iq r0 = X.C11339SNv.A01
            if (r0 == 0) goto L_0x0088
            long r1 = r0.A03
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x002a
        L_0x0026:
            return
        L_0x0027:
            r0 = 0
            goto L_0x0018
        L_0x002a:
            boolean r0 = X.C245983dn.A03()
            if (r0 != 0) goto L_0x008b
            java.lang.String r1 = r8.A02
            java.lang.String r0 = "Litho.TreeFuture.Run"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0055
            int r0 = android.os.Process.myTid()
            java.util.concurrent.ConcurrentHashMap r2 = X.C11339SNv.A03
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            boolean r0 = r2.containsKey(r1)
            if (r0 != 0) goto L_0x0055
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.ref.WeakReference r0 = X.C51965G9l.A0v(r0)
            r2.put(r1, r0)
        L_0x0055:
            java.util.concurrent.ConcurrentLinkedQueue r3 = X.C11339SNv.A04
            r3.add(r8)
            java.util.concurrent.atomic.AtomicLong r4 = X.C11339SNv.A05
            long r5 = r4.incrementAndGet()
            r1 = 1
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0069
            X.C11339SNv.A00()
        L_0x0069:
            X.9Iq r0 = X.C11339SNv.A01
            if (r0 == 0) goto L_0x0088
            long r1 = r0.A02
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0026
            boolean r0 = X.C245983dn.A03()
            if (r0 != 0) goto L_0x0026
            android.os.Handler r1 = X.C11339SNv.A00
            r0 = 0
            if (r1 != 0) goto L_0x00cd
            java.lang.String r0 = "backgroundHandler"
        L_0x0080:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0088:
            java.lang.String r0 = "config"
            goto L_0x0080
        L_0x008b:
            java.lang.String r2 = r8.A02
            int r1 = r2.hashCode()
            r0 = -1695461095(0xffffffff9af15119, float:-9.9806284E-23)
            if (r1 == r0) goto L_0x00ca
            r0 = -1019213806(0xffffffffc3400812, float:-192.03152)
            if (r1 == r0) goto L_0x00ac
            r0 = -351073398(0xffffffffeb130b8a, float:-1.7776659E26)
            if (r1 != r0) goto L_0x0055
            java.lang.String r0 = "Litho.TreeFuture.Resume"
        L_0x00a2:
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0055
            r0 = 0
        L_0x00a9:
            X.C12029Skq.A00 = r0
            goto L_0x0055
        L_0x00ac:
            java.lang.String r0 = "Litho.TreeFuture.Wait"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0055
            java.util.Map r1 = r8.A03
            java.lang.String r0 = "waiting-on"
            java.lang.Object r1 = r1.get(r0)
            if (r1 == 0) goto L_0x0055
            java.util.concurrent.ConcurrentHashMap r0 = X.C11339SNv.A03
            java.lang.Object r0 = r0.get(r1)
            java.lang.ref.WeakReference r0 = (java.lang.ref.WeakReference) r0
            if (r0 != 0) goto L_0x00a9
            goto L_0x0055
        L_0x00ca:
            java.lang.String r0 = "Litho.TreeFuture.Get"
            goto L_0x00a2
        L_0x00cd:
            r1.removeCallbacksAndMessages(r0)
            r1 = 1000(0x3e8, float:1.401E-42)
            r0 = 0
        L_0x00d3:
            r3.poll()
            int r0 = r0 + 1
            if (r0 < r1) goto L_0x00d3
            long r2 = r4.get()
            r0 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 - r0
            r4.set(r2)
            X.C11339SNv.A00()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7847QbV.A00(X.PzN):void");
    }
}
