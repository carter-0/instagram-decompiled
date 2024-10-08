package X;

import java.util.Iterator;

/* renamed from: X.4PA  reason: invalid class name */
public final class AnonymousClass4PA implements Runnable {
    public final /* synthetic */ C263694Mz A00;

    public AnonymousClass4PA(C263694Mz r1) {
        this.A00 = r1;
    }

    public final void run() {
        Iterator it = this.A00.A00.iterator();
        while (it.hasNext()) {
            ((C263654Mv) it.next()).DyA();
        }
    }
}
