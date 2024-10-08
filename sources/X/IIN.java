package X;

import java.util.List;

public final class IIN implements AnonymousClass2So {
    public final List A00 = AnonymousClass7TE.A1C();
    public volatile boolean A01;

    public final void A9e(C247583ga r2) {
        synchronized (this) {
            if (!this.A01) {
                this.A00.add(r2);
            }
        }
    }

    public final boolean Cab() {
        return this.A01;
    }
}
