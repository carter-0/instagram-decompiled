package X;

import java.util.concurrent.Callable;

public final class XQI extends 1aJ implements Callable {
    public final Callable A00;

    public final void A02(1aL r7) {
        XQK xqk = new XQK(r7);
        r7.Do4(xqk);
        if (xqk.get() != 4) {
            try {
                Object call = this.A00.call();
                1aP.A01(call, "Callable returned null");
                int i = xqk.get();
                if ((i & 54) == 0) {
                    1aL r1 = xqk.A01;
                    if (i == 8) {
                        xqk.A00 = call;
                        xqk.lazySet(16);
                        call = null;
                    } else {
                        xqk.lazySet(2);
                    }
                    r1.DUK(call);
                    if (xqk.get() != 4) {
                        r1.onComplete();
                    }
                }
            } catch (Throwable th) {
                C9877Riq.A00(th);
                if (xqk.get() == 4) {
                    C318176oW.A01(th);
                } else {
                    r7.onError(th);
                }
            }
        }
    }

    public final Object call() {
        Object call = this.A00.call();
        1aP.A01(call, "The callable returned a null value");
        return call;
    }

    public XQI(Callable callable) {
        this.A00 = callable;
    }
}
