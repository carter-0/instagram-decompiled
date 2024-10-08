package X;

import java.util.List;

/* renamed from: X.Aig  reason: case insensitive filesystem */
public final class C40750Aig implements Runnable {
    public final /* synthetic */ C359908dg A00;

    public C40750Aig(C359908dg r1) {
        this.A00 = r1;
    }

    public final void run() {
        List list = this.A00.A01;
        if (list != null) {
            list.clear();
        }
    }
}
