package X;

import android.os.Handler;
import android.view.Choreographer;
import java.util.Iterator;

/* renamed from: X.6NW  reason: invalid class name */
public final class AnonymousClass6NW implements Runnable {
    public final /* synthetic */ AnonymousClass6QX A00;

    public AnonymousClass6NW(AnonymousClass6QX r1) {
        this.A00 = r1;
    }

    public final void run() {
        AnonymousClass6QX r2 = this.A00;
        if (r2.A00) {
            ((Handler) r2.A05.getValue()).removeCallbacks(this);
            Choreographer.getInstance().removeFrameCallback(r2.A02);
            return;
        }
        r2.A01 = true;
        Iterator it = r2.A04.iterator();
        0qQ.A07(it);
        while (it.hasNext()) {
            Object next = it.next();
            0qQ.A07(next);
            ((Runnable) next).run();
            it.remove();
        }
        r2.A01 = false;
        if (!r2.A06 && !r2.A00) {
            Choreographer.getInstance().postFrameCallback(r2.A02);
        }
    }
}
