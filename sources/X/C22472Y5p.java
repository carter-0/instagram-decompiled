package X;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.Y5p  reason: case insensitive filesystem */
public final class C22472Y5p extends AtomicReference implements 1aL {
    public final 1aL A00;
    public final C22469Y5i A01;

    public final void DUK(Object obj) {
        this.A00.DUK(obj);
    }

    public final void onComplete() {
        C22469Y5i y5i = this.A01;
        y5i.A07 = false;
        y5i.A00();
    }

    public final void onError(Throwable th) {
        this.A01.dispose();
        this.A00.onError(th);
    }

    public C22472Y5p(1aL r1, C22469Y5i y5i) {
        this.A00 = r1;
        this.A01 = y5i;
    }

    public final void Do4(C65051aA r1) {
        1af.A00(r1, this);
    }
}
