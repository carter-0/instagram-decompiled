package X;

import java.util.Iterator;

/* renamed from: X.WmI  reason: case insensitive filesystem */
public final class C20158WmI implements Runnable {
    public final /* synthetic */ C263694Mz A00;
    public final /* synthetic */ Object A01;

    public C20158WmI(C263694Mz r1, Object obj) {
        this.A00 = r1;
        this.A01 = obj;
    }

    public final void run() {
        Iterator it = this.A00.A00.iterator();
        while (it.hasNext()) {
            ((C263654Mv) it.next()).DS6(this.A01);
        }
    }
}
