package X;

import java.util.Iterator;

public final class XDi extends 1aJ {
    public final Iterable A00;

    public final void A02(1aL r6) {
        try {
            Iterator it = this.A00.iterator();
            if (!it.hasNext()) {
                r6.Do4(AnonymousClass6F8.INSTANCE);
                r6.onComplete();
                return;
            }
            C21070XDj xDj = new C21070XDj(r6, it);
            r6.Do4(xDj);
            if (!xDj.A02) {
                while (!xDj.A05) {
                    try {
                        Iterator it2 = xDj.A04;
                        Object next = it2.next();
                        1aP.A01(next, "The iterator returned a null value");
                        1aL r1 = xDj.A03;
                        r1.DUK(next);
                        if (!xDj.A05) {
                            try {
                                if (!it2.hasNext()) {
                                    if (!xDj.A05) {
                                        r1.onComplete();
                                        return;
                                    }
                                    return;
                                }
                            } catch (Throwable th) {
                                C9877Riq.A00(th);
                                r1.onError(th);
                                return;
                            }
                        } else {
                            return;
                        }
                    } catch (Throwable th2) {
                        C9877Riq.A00(th2);
                        xDj.A03.onError(th2);
                        return;
                    }
                }
            }
        } catch (Throwable th3) {
            C9877Riq.A00(th3);
            r6.Do4(AnonymousClass6F8.INSTANCE);
            r6.onError(th3);
        }
    }

    public XDi(Iterable iterable) {
        this.A00 = iterable;
    }
}
