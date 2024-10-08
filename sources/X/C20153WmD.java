package X;

import java.util.Iterator;

/* renamed from: X.WmD  reason: case insensitive filesystem */
public final /* synthetic */ class C20153WmD implements Runnable {
    public final /* synthetic */ C263694Mz A00;
    public final /* synthetic */ C297475ro A01;

    public /* synthetic */ C20153WmD(C263694Mz r1, C297475ro r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void run() {
        C263694Mz r0 = this.A00;
        C297475ro r2 = this.A01;
        Iterator it = r0.A00.iterator();
        while (it.hasNext()) {
            ((C263654Mv) it.next()).DnZ(r2);
        }
    }
}
