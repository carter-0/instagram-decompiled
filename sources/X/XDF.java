package X;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReferenceArray;

public final class XDF extends AtomicReferenceArray implements Runnable, C65051aA, Callable {
    public static final Object A01 = Pxe.A0p();
    public static final Object A02 = Pxe.A0p();
    public static final Object A03 = Pxe.A0p();
    public static final Object A04 = Pxe.A0p();
    public final Runnable A00;

    public XDF(AnonymousClass1aB r2, Runnable runnable) {
        super(3);
        this.A00 = runnable;
        lazySet(0, r2);
    }

    public final void A00(Future future) {
        Object obj;
        do {
            boolean z = true;
            obj = get(1);
            if (obj != A02) {
                if (obj == A04) {
                    z = false;
                } else if (obj != A01) {
                }
                future.cancel(z);
                return;
            }
            return;
        } while (!compareAndSet(1, obj, future));
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void dispose() {
        /*
            r9 = this;
        L_0x0000:
            r8 = 1
            java.lang.Object r7 = r9.get(r8)
            java.lang.Object r6 = A02
            r5 = 0
            if (r7 == r6) goto L_0x002d
            java.lang.Object r4 = A04
            if (r7 == r4) goto L_0x002d
            java.lang.Object r3 = A01
            if (r7 == r3) goto L_0x002d
            r0 = 2
            java.lang.Object r2 = r9.get(r0)
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r1 = 0
            if (r2 == r0) goto L_0x0020
            r1 = 1
            r4 = r3
        L_0x0020:
            boolean r0 = r9.compareAndSet(r8, r7, r4)
            if (r0 == 0) goto L_0x0000
            if (r7 == 0) goto L_0x002d
            java.util.concurrent.Future r7 = (java.util.concurrent.Future) r7
            r7.cancel(r1)
        L_0x002d:
            java.lang.Object r1 = r9.get(r5)
            if (r1 == r6) goto L_0x0044
            java.lang.Object r0 = A03
            if (r1 == r0) goto L_0x0044
            if (r1 == 0) goto L_0x0044
            boolean r0 = r9.compareAndSet(r5, r1, r0)
            if (r0 == 0) goto L_0x002d
            X.1aB r1 = (X.AnonymousClass1aB) r1
            r1.AOQ(r9)
        L_0x0044:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.XDF.dispose():void");
    }

    public final Object call() {
        run();
        return null;
    }

    public final void run() {
        Object obj;
        Object obj2;
        lazySet(2, Thread.currentThread());
        try {
            this.A00.run();
        } catch (Throwable th) {
            lazySet(2, (Object) null);
            Object obj3 = get(0);
            if (!(obj3 == A03 || !compareAndSet(0, obj3, A02) || obj3 == null)) {
                ((AnonymousClass1aB) obj3).AOQ(this);
            }
            do {
                obj2 = get(1);
                if (obj2 == A04 || obj2 == A01 || compareAndSet(1, obj2, A02)) {
                    throw th;
                }
                obj2 = get(1);
                break;
            } while (compareAndSet(1, obj2, A02));
            throw th;
        }
        lazySet(2, (Object) null);
        Object obj4 = get(0);
        if (!(obj4 == A03 || !compareAndSet(0, obj4, A02) || obj4 == null)) {
            ((AnonymousClass1aB) obj4).AOQ(this);
        }
        do {
            obj = get(1);
            if (obj == A04 || obj == A01 || compareAndSet(1, obj, A02)) {
            }
            obj = get(1);
            return;
        } while (compareAndSet(1, obj, A02));
    }
}
