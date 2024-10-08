package X;

import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: X.7zC  reason: invalid class name and case insensitive filesystem */
public final class C348897zC implements Callable {
    public final /* synthetic */ C340837lu A00;

    public C348897zC(C340837lu r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        C392189uM r0;
        C340837lu r5 = this.A00;
        if (r5.A0S) {
            List list = r5.A0Q;
            if (!list.isEmpty() && (r0 = (C392189uM) list.remove(0)) != null) {
                r5.A0P.A07("restart_preview_on_background_thread", new C41345AsS(r5, r0.A00, r0.A01));
            }
        }
        return null;
    }
}
