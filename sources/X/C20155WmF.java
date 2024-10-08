package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.WmF  reason: case insensitive filesystem */
public final class C20155WmF implements Runnable {
    public final /* synthetic */ C263694Mz A00;
    public final /* synthetic */ List A01;

    public C20155WmF(C263694Mz r1, List list) {
        this.A00 = r1;
        this.A01 = list;
    }

    public final void run() {
        Iterator it = this.A00.A00.iterator();
        while (it.hasNext()) {
            ((C263654Mv) it.next()).Drl(this.A01);
        }
    }
}
