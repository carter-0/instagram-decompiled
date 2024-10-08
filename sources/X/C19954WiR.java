package X;

import java.util.Iterator;

/* renamed from: X.WiR  reason: case insensitive filesystem */
public final class C19954WiR implements Runnable {
    public final /* synthetic */ C263694Mz A00;

    public C19954WiR(C263694Mz r1) {
        this.A00 = r1;
    }

    public final void run() {
        Iterator it = this.A00.A00.iterator();
        while (it.hasNext()) {
            ((C263654Mv) it.next()).DyF();
        }
    }
}
