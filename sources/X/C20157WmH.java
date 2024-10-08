package X;

import java.util.Iterator;

/* renamed from: X.WmH  reason: case insensitive filesystem */
public final class C20157WmH implements Runnable {
    public final /* synthetic */ C263694Mz A00;
    public final /* synthetic */ boolean A01;

    public C20157WmH(C263694Mz r1, boolean z) {
        this.A00 = r1;
        this.A01 = z;
    }

    public final void run() {
        Iterator it = this.A00.A00.iterator();
        while (it.hasNext()) {
            ((C263654Mv) it.next()).DNp(this.A01);
        }
    }
}
