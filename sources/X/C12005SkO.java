package X;

import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.SkO  reason: case insensitive filesystem */
public final class C12005SkO implements C13543TcF {
    public static final C9208RTl A0P = new Object();
    public C13892TjF A00;
    public TLE A01;
    public C11909Sii A02;
    public C8995RKo A03;
    public C13796ThF A04;
    public Integer A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public final 02U A0D;
    public final SOI A0E;
    public final SOI A0F;
    public final C9208RTl A0G;
    public final TAI A0H = new TAI();
    public final TO7 A0I;
    public final TO7 A0J;
    public final TO7 A0K;
    public final TO7 A0L;
    public final S0B A0M = new Object();
    public final AtomicInteger A0N = new AtomicInteger();
    public volatile boolean A0O;

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002b, code lost:
        if (r2.A00 != false) goto L_0x002d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void A00(X.C12005SkO r5) {
        /*
            monitor-enter(r5)
            X.TjF r0 = r5.A00     // Catch:{ all -> 0x0049 }
            if (r0 == 0) goto L_0x0044
            X.TAI r0 = r5.A0H     // Catch:{ all -> 0x0049 }
            java.util.List r0 = r0.A00     // Catch:{ all -> 0x0049 }
            r0.clear()     // Catch:{ all -> 0x0049 }
            r4 = 0
            r5.A00 = r4     // Catch:{ all -> 0x0049 }
            r5.A02 = r4     // Catch:{ all -> 0x0049 }
            r5.A04 = r4     // Catch:{ all -> 0x0049 }
            r0 = 0
            r5.A06 = r0     // Catch:{ all -> 0x0049 }
            r5.A0O = r0     // Catch:{ all -> 0x0049 }
            r5.A07 = r0     // Catch:{ all -> 0x0049 }
            r5.A09 = r0     // Catch:{ all -> 0x0049 }
            X.TLE r3 = r5.A01     // Catch:{ all -> 0x0049 }
            X.Rte r2 = r3.A0O     // Catch:{ all -> 0x0049 }
            monitor-enter(r2)     // Catch:{ all -> 0x0049 }
            r0 = 1
            r2.A02 = r0     // Catch:{ all -> 0x0041 }
            boolean r0 = r2.A01     // Catch:{ all -> 0x0041 }
            if (r0 != 0) goto L_0x002d
            boolean r1 = r2.A00     // Catch:{ all -> 0x0041 }
            r0 = 0
            if (r1 == 0) goto L_0x002e
        L_0x002d:
            r0 = 1
        L_0x002e:
            monitor-exit(r2)     // Catch:{ all -> 0x0049 }
            if (r0 == 0) goto L_0x0034
            X.TLE.A06(r3)     // Catch:{ all -> 0x0049 }
        L_0x0034:
            r5.A01 = r4     // Catch:{ all -> 0x0049 }
            r5.A03 = r4     // Catch:{ all -> 0x0049 }
            r5.A05 = r4     // Catch:{ all -> 0x0049 }
            X.02U r0 = r5.A0D     // Catch:{ all -> 0x0049 }
            r0.ECR(r5)     // Catch:{ all -> 0x0049 }
            monitor-exit(r5)
            return
        L_0x0041:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0049 }
            goto L_0x0048
        L_0x0044:
            java.lang.IllegalArgumentException r0 = X.Pxe.A0g()     // Catch:{ all -> 0x0049 }
        L_0x0048:
            throw r0     // Catch:{ all -> 0x0049 }
        L_0x0049:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12005SkO.A00(X.SkO):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0011, code lost:
        if (r3.A0O != false) goto L_0x0013;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01() {
        /*
            r3 = this;
            monitor-enter(r3)
            X.S0B r0 = r3.A0M     // Catch:{ all -> 0x0041 }
            r0.A00()     // Catch:{ all -> 0x0041 }
            boolean r0 = r3.A06     // Catch:{ all -> 0x0041 }
            if (r0 != 0) goto L_0x0013
            boolean r0 = r3.A07     // Catch:{ all -> 0x0041 }
            if (r0 != 0) goto L_0x0013
            boolean r0 = r3.A0O     // Catch:{ all -> 0x0041 }
            r1 = 0
            if (r0 == 0) goto L_0x0014
        L_0x0013:
            r1 = 1
        L_0x0014:
            java.lang.String r0 = "Not yet complete!"
            if (r1 == 0) goto L_0x003c
            java.util.concurrent.atomic.AtomicInteger r0 = r3.A0N     // Catch:{ all -> 0x0041 }
            int r2 = r0.decrementAndGet()     // Catch:{ all -> 0x0041 }
            boolean r1 = X.Pxf.A1R(r2)
            java.lang.String r0 = "Can't decrement below 0"
            if (r1 == 0) goto L_0x0037
            if (r2 != 0) goto L_0x0029
            goto L_0x002b
        L_0x0029:
            r0 = 0
            goto L_0x0030
        L_0x002b:
            X.Sii r0 = r3.A02     // Catch:{ all -> 0x0041 }
            A00(r3)     // Catch:{ all -> 0x0041 }
        L_0x0030:
            monitor-exit(r3)     // Catch:{ all -> 0x0041 }
            if (r0 == 0) goto L_0x0036
            r0.A00()
        L_0x0036:
            return
        L_0x0037:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)     // Catch:{ all -> 0x0041 }
            throw r0     // Catch:{ all -> 0x0041 }
        L_0x003c:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)     // Catch:{ all -> 0x0041 }
            throw r0     // Catch:{ all -> 0x0041 }
        L_0x0041:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0041 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12005SkO.A01():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000c, code lost:
        if (r2.A0O != false) goto L_0x000e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void A02(int r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.A06     // Catch:{ all -> 0x0029 }
            if (r0 != 0) goto L_0x000e
            boolean r0 = r2.A07     // Catch:{ all -> 0x0029 }
            if (r0 != 0) goto L_0x000e
            boolean r0 = r2.A0O     // Catch:{ all -> 0x0029 }
            r1 = 0
            if (r0 == 0) goto L_0x000f
        L_0x000e:
            r1 = 1
        L_0x000f:
            java.lang.String r0 = "Not yet complete!"
            if (r1 == 0) goto L_0x0024
            java.util.concurrent.atomic.AtomicInteger r0 = r2.A0N     // Catch:{ all -> 0x0029 }
            int r0 = r0.getAndAdd(r3)     // Catch:{ all -> 0x0029 }
            if (r0 != 0) goto L_0x0022
            X.Sii r0 = r2.A02     // Catch:{ all -> 0x0029 }
            if (r0 == 0) goto L_0x0022
            r0.A01()     // Catch:{ all -> 0x0029 }
        L_0x0022:
            monitor-exit(r2)
            return
        L_0x0024:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)     // Catch:{ all -> 0x0029 }
            throw r0     // Catch:{ all -> 0x0029 }
        L_0x0029:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12005SkO.A02(int):void");
    }

    public final synchronized void A03(C11990Sk9 sk9) {
        Map map;
        this.A0M.A00();
        List list = this.A0H.A00;
        list.remove(new S48(sk9, C10061Rly.A00));
        if (list.isEmpty()) {
            if (!this.A06 && !this.A07 && !this.A0O) {
                this.A0O = true;
                TLE tle = this.A01;
                tle.A0U = true;
                C13695TfD tfD = tle.A0T;
                if (tfD != null) {
                    tfD.cancel();
                }
                SOI soi = this.A0E;
                C13892TjF tjF = this.A00;
                synchronized (soi) {
                    C10363Rr0 rr0 = soi.A04;
                    if (this.A0A) {
                        map = rr0.A01;
                    } else {
                        map = rr0.A00;
                    }
                    if (equals(map.get(tjF))) {
                        map.remove(tjF);
                    }
                }
            }
            if ((this.A07 || this.A06) && this.A0N.get() == 0) {
                A00(this);
            }
        }
    }

    public final synchronized void A04(C11990Sk9 sk9, Executor executor) {
        Runnable tfh;
        this.A0M.A00();
        this.A0H.A00.add(new S48(sk9, executor));
        boolean z = true;
        if (this.A07) {
            A02(1);
            tfh = new TFI(this, sk9);
        } else if (this.A06) {
            A02(1);
            tfh = new TFH(this, sk9);
        } else {
            if (this.A0O) {
                z = false;
            }
            if (!z) {
                throw AnonymousClass7TE.A0w("Cannot add callbacks to a cancelled EngineJob");
            }
        }
        executor.execute(tfh);
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.S0B, java.lang.Object] */
    public C12005SkO(02U r3, SOI soi, SOI soi2, TO7 to7, TO7 to72, TO7 to73, TO7 to74) {
        C9208RTl rTl = A0P;
        this.A0J = to7;
        this.A0K = to72;
        this.A0L = to73;
        this.A0I = to74;
        this.A0E = soi;
        this.A0F = soi2;
        this.A0D = r3;
        this.A0G = rTl;
    }

    public final S0B CDi() {
        return this.A0M;
    }
}
