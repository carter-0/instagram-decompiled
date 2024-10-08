package X;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;

public final class RAH extends 0ng {
    public final /* synthetic */ C11223SFx A00;
    public final /* synthetic */ IOException A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RAH(C11223SFx sFx, IOException iOException) {
        super(1773997430, 3, false, false);
        this.A00 = sFx;
        this.A01 = iOException;
    }

    public final void run() {
        C11223SFx sFx = this.A00;
        AtomicBoolean atomicBoolean = sFx.A0A;
        if (!atomicBoolean.get()) {
            sFx.A0B.set(false);
            sFx.A04.markerAnnotate(936452326, sFx.A00, "is_http_success", false);
            atomicBoolean.set(true);
        }
    }
}
