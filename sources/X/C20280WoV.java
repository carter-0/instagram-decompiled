package X;

/* renamed from: X.WoV  reason: case insensitive filesystem */
public final class C20280WoV implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C20883X2n A01;
    public final /* synthetic */ W00 A02;

    public C20280WoV(C20883X2n x2n, W00 w00, int i) {
        this.A02 = w00;
        this.A00 = i;
        this.A01 = x2n;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0017, code lost:
        if (r0 != null) goto L_0x001e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r3 = this;
            X.W00 r2 = r3.A02
            int r1 = r3.A00
            r0 = -1
            if (r1 == r0) goto L_0x0019
            java.util.Map r2 = r2.A02
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            boolean r0 = r2.containsKey(r1)
            if (r0 == 0) goto L_0x0019
            java.lang.Object r0 = r2.get(r1)
            if (r0 != 0) goto L_0x001e
        L_0x0019:
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
        L_0x001e:
            X.X2n r1 = r3.A01
            r1.accept(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20280WoV.run():void");
    }
}
