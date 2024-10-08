package X;

import java.util.concurrent.atomic.AtomicReference;

public final /* synthetic */ class THN implements Runnable {
    public final /* synthetic */ SOD A00;
    public final /* synthetic */ Runnable A01;

    public /* synthetic */ THN(SOD sod, Runnable runnable) {
        this.A00 = sod;
        this.A01 = runnable;
    }

    public final void run() {
        SOD sod = this.A00;
        Runnable runnable = this.A01;
        AtomicReference atomicReference = sod.A01;
        if (atomicReference.getAndSet(Thread.currentThread()) == null) {
            try {
                runnable.run();
                atomicReference.set((Object) null);
                SOD.A00(sod);
            } catch (Throwable th) {
                Class<Throwable> cls = Throwable.class;
                try {
                    cls.getDeclaredMethod("addSuppressed", new Class[]{cls}).invoke(th, new Object[]{th});
                } catch (Exception unused) {
                }
                throw th;
            }
        } else {
            throw Pxe.A0i();
        }
    }
}
