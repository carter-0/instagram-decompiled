package X;

/* renamed from: X.5qM  reason: invalid class name and case insensitive filesystem */
public final class C296615qM implements Runnable {
    public final int A00;
    public final C296575qI A01;
    public final C296505qA A02;
    public final boolean A03;
    public final /* synthetic */ AnonymousClass3LT A04;

    public C296615qM(C296575qI r1, C296505qA r2, AnonymousClass3LT r3, int i, boolean z) {
        this.A04 = r3;
        this.A02 = r2;
        this.A01 = r1;
        this.A00 = i;
        this.A03 = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0010, code lost:
        if (r14.A00() != false) goto L_0x0012;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r19 = this;
            r10 = r19
            X.5qI r14 = r10.A01
            boolean r0 = r14.A01()
            r12 = 0
            if (r0 == 0) goto L_0x0012
            boolean r0 = r14.A00()
            r11 = 1
            if (r0 == 0) goto L_0x0013
        L_0x0012:
            r11 = 0
        L_0x0013:
            X.3LT r8 = r10.A04
            java.util.Map r6 = r8.A0D
            X.5qA r13 = r10.A02
            java.lang.String r5 = r13.A0D
            java.lang.Object r15 = r6.get(r5)
            java.util.List r15 = (java.util.List) r15
            int r7 = r10.A00
            long r2 = (long) r7
            X.A7M r0 = r8.A08
            X.XnF r4 = r0.A00
            long r0 = r4.A01
            int r9 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            r2 = 0
            if (r9 >= 0) goto L_0x0030
            r2 = 1
        L_0x0030:
            boolean r1 = r10.A03
            if (r1 == 0) goto L_0x003f
            if (r2 != 0) goto L_0x003f
            if (r15 == 0) goto L_0x003f
            boolean r0 = r15.isEmpty()
            if (r0 != 0) goto L_0x003f
            r12 = 1
        L_0x003f:
            if (r11 != 0) goto L_0x0057
            if (r12 != 0) goto L_0x0057
            if (r2 == 0) goto L_0x0071
            android.os.Handler r2 = r8.A06
            int r9 = r7 + 1
            X.5qM r5 = new X.5qM
            r6 = r14
            r7 = r13
            r10 = r1
            r5.<init>(r6, r7, r8, r9, r10)
            long r0 = r4.A00
            r2.postDelayed(r5, r0)
            return
        L_0x0057:
            X.7ke r0 = r8.A0B
            X.7kh r12 = r0.A03
            long r2 = r4.A00
            int r0 = r7 + 1
            long r0 = (long) r0
            long r2 = r2 * r0
            double r0 = (double) r2
            r2 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r0 = r0 / r2
            boolean r2 = r4.A04
            r18 = r2
            r16 = r0
            r12.A01(r13, r14, r15, r16, r18)
        L_0x0071:
            r6.remove(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C296615qM.run():void");
    }
}
