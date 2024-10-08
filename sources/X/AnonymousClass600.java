package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.600  reason: invalid class name */
public final class AnonymousClass600 implements Runnable {
    public final /* synthetic */ C263694Mz A00;
    public final /* synthetic */ List A01;

    public AnonymousClass600(C263694Mz r1, List list) {
        this.A00 = r1;
        this.A01 = list;
    }

    public final void run() {
        Iterator it = this.A00.A00.iterator();
        while (it.hasNext()) {
            ((C263654Mv) it.next()).onCues(this.A01);
        }
    }
}
