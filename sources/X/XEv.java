package X;

import java.util.concurrent.atomic.AtomicReference;

public final class XEv extends AtomicReference implements C65051aA {
    public final 1aL A00;

    public XEv(1aL r1) {
        this.A00 = r1;
    }

    public final void dispose() {
        Object andSet = getAndSet(this);
        if (andSet != null && andSet != this) {
            ((C21075XDo) andSet).A00(this);
        }
    }
}
