package X;

import java.util.concurrent.TimeUnit;

public final class XDR implements AnonymousClass5IX {
    public final long A00;

    public final boolean E1z(AnonymousClass5IY r6) {
        0qQ.A0B(r6, 0);
        return AnonymousClass7TF.A1R(((System.currentTimeMillis() - r6.A01(AnonymousClass05K.A00)) > this.A00 ? 1 : ((System.currentTimeMillis() - r6.A01(AnonymousClass05K.A00)) == this.A00 ? 0 : -1)));
    }

    public XDR(int i) {
        this.A00 = TimeUnit.SECONDS.toMillis((long) i);
    }
}
