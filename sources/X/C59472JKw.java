package X;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: X.JKw  reason: case insensitive filesystem */
public final class C59472JKw extends AnonymousClass19O {
    public static final /* synthetic */ AtomicIntegerFieldUpdater A01 = AtomicIntegerFieldUpdater.newUpdater(C59472JKw.class, "_invoked$volatile");
    public final 0sP A00;
    public volatile /* synthetic */ int _invoked$volatile;

    public final void A05(Throwable th) {
        if (A01.compareAndSet(this, 0, 1)) {
            this.A00.invoke(th);
        }
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        A05((Throwable) obj);
        return C60340gF.A00;
    }

    public C59472JKw(0sP r1) {
        this.A00 = r1;
    }
}
