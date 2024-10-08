package X;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.Y5o  reason: case insensitive filesystem */
public final class C22471Y5o extends AtomicReference implements 1aL {
    public final 1aL A00;
    public final Y5j A01;

    public final void DUK(Object obj) {
        this.A00.DUK(obj);
    }

    public final void onComplete() {
        Y5j y5j = this.A01;
        y5j.A09 = false;
        y5j.A00();
    }

    public final void onError(Throwable th) {
        Y5j y5j = this.A01;
        if (C22013Xr3.A02(th, y5j.A07)) {
            if (!y5j.A08) {
                y5j.A01.dispose();
            }
            y5j.A09 = false;
            y5j.A00();
            return;
        }
        C318176oW.A01(th);
    }

    public C22471Y5o(1aL r1, Y5j y5j) {
        this.A00 = r1;
        this.A01 = y5j;
    }

    public final void Do4(C65051aA r1) {
        1af.A00(r1, this);
    }
}
