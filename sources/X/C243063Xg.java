package X;

import com.facebook.litho.ComponentsSystrace;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.3Xg  reason: invalid class name and case insensitive filesystem */
public abstract class C243063Xg {
    public final RunnableFuture A00;
    public final AtomicInteger A01;
    public final AtomicInteger A02;
    public final AtomicInteger A03 = new AtomicInteger(-1);
    public final boolean A04;
    public final int A05;
    public volatile boolean A06;

    public abstract AnonymousClass2T6 A03();

    public abstract String A04();

    public final synchronized void A05() {
        if (!this.A06) {
            this.A06 = true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003c, code lost:
        if (r2 == android.os.Process.myTid()) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000d, code lost:
        r4 = r5.A01;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A06(boolean r6) {
        /*
            r5 = this;
            r3 = 1
            if (r6 == 0) goto L_0x0026
            boolean r0 = r5.A04
            if (r0 == 0) goto L_0x0026
            boolean r0 = X.AnonymousClass2VL.A01()
            if (r0 != 0) goto L_0x0026
            java.util.concurrent.atomic.AtomicInteger r4 = r5.A01
            int r0 = r4.get()
            r2 = 0
            if (r0 == r3) goto L_0x0025
            if (r0 != 0) goto L_0x0026
            r1 = 2
            boolean r0 = r4.compareAndSet(r2, r1)
            if (r0 != 0) goto L_0x0026
            int r0 = r4.get()
            if (r0 == r1) goto L_0x0026
        L_0x0025:
            return r2
        L_0x0026:
            java.util.concurrent.atomic.AtomicInteger r0 = r5.A03
            int r2 = r0.get()
            java.util.concurrent.RunnableFuture r0 = r5.A00
            boolean r0 = r0.isDone()
            if (r0 != 0) goto L_0x003e
            r0 = -1
            if (r2 == r0) goto L_0x003e
            int r0 = android.os.Process.myTid()
            r1 = 1
            if (r2 != r0) goto L_0x003f
        L_0x003e:
            r1 = 0
        L_0x003f:
            boolean r0 = r5.A04
            if (r0 == 0) goto L_0x0057
            if (r1 == 0) goto L_0x0057
            boolean r0 = X.AnonymousClass2VL.A01()
            if (r0 == 0) goto L_0x0057
            java.util.concurrent.atomic.AtomicInteger r2 = r5.A01
            int r1 = r2.get()
            r0 = 0
            if (r1 != 0) goto L_0x0057
            r2.compareAndSet(r0, r3)
        L_0x0057:
            java.util.concurrent.atomic.AtomicInteger r0 = r5.A02
            r0.incrementAndGet()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C243063Xg.A06(boolean):boolean");
    }

    public static final void A01(C243063Xg r3, String str) {
        1Kb A002 = ComponentsSystrace.A00(002.A0u("<cls>", r3.getClass().getName(), "</cls>.", str));
        A002.ACO("runningThreadId", r3.A03.get());
        A002.flush();
    }

    public int A02() {
        return this.A05;
    }

    public C243063Xg(int i, boolean z) {
        AtomicInteger atomicInteger;
        this.A05 = i;
        this.A04 = z;
        if (z) {
            atomicInteger = new AtomicInteger(0);
        } else {
            atomicInteger = new AtomicInteger(2);
        }
        this.A01 = atomicInteger;
        this.A02 = new AtomicInteger(0);
        this.A00 = new FutureTask(new C243083Xi(this));
    }
}
