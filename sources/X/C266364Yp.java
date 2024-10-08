package X;

import java.util.Iterator;

/* renamed from: X.4Yp  reason: invalid class name and case insensitive filesystem */
public final class C266364Yp implements Runnable {
    public final /* synthetic */ C263694Mz A00;

    public C266364Yp(C263694Mz r1) {
        this.A00 = r1;
    }

    public final void run() {
        Iterator it = this.A00.A00.iterator();
        while (it.hasNext()) {
            ((C263654Mv) it.next()).onDrawnToSurface();
        }
    }
}
