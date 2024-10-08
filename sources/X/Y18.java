package X;

import java.util.concurrent.atomic.AtomicReference;

public final class Y18 implements 1aL {
    public Throwable A00;
    public final Y5k A01;
    public final XCy A02;
    public final AtomicReference A03 = new AtomicReference();
    public volatile boolean A04;

    public final void onComplete() {
        this.A04 = true;
        this.A01.A01();
    }

    public final void DUK(Object obj) {
        this.A02.offer(obj);
        this.A01.A01();
    }

    public final void Do4(C65051aA r2) {
        1af.A03(r2, this.A03);
    }

    public final void onError(Throwable th) {
        this.A00 = th;
        this.A04 = true;
        this.A01.A01();
    }

    public Y18(Y5k y5k, int i) {
        this.A01 = y5k;
        this.A02 = new XCy(i);
    }
}
