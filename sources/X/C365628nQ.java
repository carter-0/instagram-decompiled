package X;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.8nQ  reason: invalid class name and case insensitive filesystem */
public final class C365628nQ implements B1A {
    public AnonymousClass1RQ A00;
    public boolean A01;
    public final AtomicInteger A02;
    public final /* synthetic */ PyE A03;
    public final /* synthetic */ 2Ju A04;
    public final /* synthetic */ C365488nC A05;
    public final /* synthetic */ AnonymousClass1RQ A06;

    public C365628nQ(PyE pyE, 2Ju r4, C365488nC r5, AnonymousClass1RQ r6, boolean z) {
        this.A04 = r4;
        this.A06 = r6;
        this.A03 = pyE;
        this.A05 = r5;
        this.A02 = new AtomicInteger(r4.A01);
        this.A00 = r6;
        this.A01 = z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x005f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void D5F(X.PyF r12) {
        /*
            r11 = this;
            boolean r0 = r12.A07()
            r7 = 1
            if (r0 == 0) goto L_0x0021
            java.lang.Object r0 = r12.A04()
            if (r0 == 0) goto L_0x0021
            java.lang.Object r0 = r12.A04()
            X.94A r0 = (X.AnonymousClass94A) r0
            int r0 = r0.A00
            if (r0 != r7) goto L_0x0021
            X.PyE r1 = r11.A03
            java.lang.Object r0 = r12.A04()
            r1.A01(r0)
        L_0x0020:
            return
        L_0x0021:
            X.2Ju r6 = r11.A04
            boolean r9 = r11.A01
            java.util.concurrent.atomic.AtomicInteger r5 = r11.A02
            X.1RQ r10 = r11.A00
            X.1RQ[] r4 = r6.A05
            java.util.concurrent.atomic.AtomicInteger r3 = r6.A04
            int r0 = r3.get()
            r1 = r4[r0]
            X.1RQ r0 = r6.A02
            r2 = 0
            r8 = 0
            if (r1 != r0) goto L_0x003a
            r8 = 1
        L_0x003a:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            int r0 = r5.get()
            if (r0 <= 0) goto L_0x00d8
            boolean r0 = r10.Cas(r12)
            if (r0 == 0) goto L_0x00d8
            X.9s2 r0 = X.C390909s2.DECREMENT_RETRY
        L_0x004d:
            r1.add(r0)
            X.9s2 r0 = X.C390909s2.RETRY_DOWNLOAD
        L_0x0052:
            r1.add(r0)
            java.util.Iterator r9 = r1.iterator()
        L_0x0059:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x0020
            java.lang.Object r0 = r9.next()
            X.9s2 r0 = (X.C390909s2) r0
            int r0 = r0.ordinal()
            switch(r0) {
                case 0: goto L_0x00aa;
                case 1: goto L_0x006d;
                case 2: goto L_0x007f;
                case 3: goto L_0x007b;
                case 4: goto L_0x00c4;
                case 5: goto L_0x00ca;
                case 6: goto L_0x00d3;
                default: goto L_0x006c;
            }
        L_0x006c:
            goto L_0x0059
        L_0x006d:
            X.1RQ r1 = r11.A00
            X.8nC r0 = r11.A05
            X.PyF r1 = r1.A03(r0)
            java.util.concurrent.Executor r0 = r6.A03
            r1.A05(r11, r0)
            goto L_0x0059
        L_0x007b:
            r5.decrementAndGet()
            goto L_0x0059
        L_0x007f:
            java.lang.Object r0 = r12.A04()
            if (r0 == 0) goto L_0x008f
            X.PyE r1 = r11.A03
            java.lang.Object r0 = r12.A04()
            r1.A01(r0)
            goto L_0x0059
        L_0x008f:
            java.lang.Exception r0 = r12.A03()
            X.PyE r8 = r11.A03
            if (r0 == 0) goto L_0x009f
            java.lang.Exception r0 = r12.A03()
            r8.A00(r0)
            goto L_0x0059
        L_0x009f:
            java.lang.String r1 = "Unexpected error: null"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            r8.A00(r0)
            goto L_0x0059
        L_0x00aa:
            r3.incrementAndGet()
            int r1 = r3.get()
            int r0 = r4.length
            if (r1 < r0) goto L_0x0059
            r3.set(r2)
            X.PyE r8 = r11.A03
            java.lang.String r1 = "Exceeded number of downloaders available"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            r8.A00(r0)
            goto L_0x0059
        L_0x00c4:
            int r0 = r6.A01
            r5.set(r0)
            goto L_0x0059
        L_0x00ca:
            int r0 = r3.get()
            r0 = r4[r0]
            r11.A00 = r0
            goto L_0x0059
        L_0x00d3:
            r6.A00 = r7
            r11.A01 = r2
            goto L_0x0059
        L_0x00d8:
            if (r9 == 0) goto L_0x00ea
            X.9s2 r0 = X.C390909s2.SET_FORCE_GP_FAILED
            r1.add(r0)
            if (r8 != 0) goto L_0x00ea
            X.9s2 r0 = X.C390909s2.RESET_CURRENT_DOWNLOADER
            r1.add(r0)
            X.9s2 r0 = X.C390909s2.RESET_RETRY_LIMIT
            goto L_0x004d
        L_0x00ea:
            r3.get()
            X.9s2 r0 = X.C390909s2.SET_EXCEPTION
            goto L_0x0052
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C365628nQ.D5F(X.PyF):void");
    }
}
