package X;

import java.util.concurrent.atomic.AtomicReference;

public final class Y17 implements 1aL {
    public boolean A00 = true;
    public final C65071aK A01;
    public final 1aL A02;
    public final C22475Y5s A03 = new AtomicReference();

    public final void DUK(Object obj) {
        if (this.A00) {
            this.A00 = false;
        }
        this.A02.DUK(obj);
    }

    public final void Do4(C65051aA r4) {
        1af r1;
        C22475Y5s y5s = this.A03;
        do {
            r1 = (C65051aA) y5s.get();
            if (r1 == 1af.A01) {
                if (r4 != null) {
                    r4.dispose();
                    return;
                }
                return;
            }
        } while (!1FH.A00(r1, r4, y5s));
        if (r1 != null) {
            r1.dispose();
        }
    }

    public final void onComplete() {
        if (this.A00) {
            this.A00 = false;
            this.A01.Eyt(this);
            return;
        }
        this.A02.onComplete();
    }

    public final void onError(Throwable th) {
        this.A02.onError(th);
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [java.util.concurrent.atomic.AtomicReference, X.Y5s] */
    public Y17(C65071aK r2, 1aL r3) {
        this.A02 = r3;
        this.A01 = r2;
    }
}
