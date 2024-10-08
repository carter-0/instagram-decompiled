package X;

import java.util.concurrent.Future;

/* renamed from: X.XFa  reason: case insensitive filesystem */
public final class C21110XFa implements Y9P {
    public final Future A00;

    public final boolean cancel() {
        return this.A00.cancel(true);
    }

    public C21110XFa(Future future) {
        this.A00 = future;
    }
}
