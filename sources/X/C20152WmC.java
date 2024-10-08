package X;

import java.util.Iterator;

/* renamed from: X.WmC  reason: case insensitive filesystem */
public final /* synthetic */ class C20152WmC implements Runnable {
    public final /* synthetic */ C263694Mz A00;
    public final /* synthetic */ 2Co A01;

    public /* synthetic */ C20152WmC(C263694Mz r1, 2Co r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void run() {
        C263694Mz r0 = this.A00;
        2Co r2 = this.A01;
        Iterator it = r0.A00.iterator();
        while (it.hasNext()) {
            ((C263654Mv) it.next()).DXc(r2);
        }
    }
}
