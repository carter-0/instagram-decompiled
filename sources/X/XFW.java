package X;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Future;

public final class XFW implements Y9P {
    public Runnable A00;
    public final List A01 = AnonymousClass7TE.A1C();
    public final XFC A02;

    public XFW(XFC xfc) {
        0qQ.A0B(xfc, 1);
        this.A02 = xfc;
    }

    public final boolean cancel() {
        Runnable runnable = this.A00;
        if (runnable != null) {
            this.A02.A00.removeCallbacks(runnable, (Object) null);
        }
        List<Future> list = this.A01;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (Future cancel : list) {
                if (!cancel.cancel(true)) {
                    return false;
                }
            }
        }
        return true;
    }
}
