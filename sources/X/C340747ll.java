package X;

import java.util.concurrent.Callable;

/* renamed from: X.7ll  reason: invalid class name and case insensitive filesystem */
public final class C340747ll implements Callable {
    public final /* synthetic */ C340597lW A00;

    public C340747ll(C340597lW r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        C340597lW r1 = this.A00;
        if (C340597lW.A07(r1)) {
            return null;
        }
        C340837lu r3 = r1.A0R;
        if (!r3.A0S) {
            return null;
        }
        r3.A0P.A07("restart_preview_on_background_thread", new C41345AsS(r3, false, false));
        return null;
    }
}
