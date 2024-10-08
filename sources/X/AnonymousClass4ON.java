package X;

import java.util.Iterator;

/* renamed from: X.4ON  reason: invalid class name */
public final class AnonymousClass4ON implements Runnable {
    public final /* synthetic */ C263694Mz A00;

    public AnonymousClass4ON(C263694Mz r1) {
        this.A00 = r1;
    }

    public final void run() {
        Iterator it = this.A00.A00.iterator();
        while (it.hasNext()) {
            ((C263654Mv) it.next()).DZ3();
        }
    }
}
