package X;

import java.util.Iterator;

/* renamed from: X.WmE  reason: case insensitive filesystem */
public final class C20154WmE implements Runnable {
    public final /* synthetic */ C263694Mz A00;
    public final /* synthetic */ C284815Oa A01;

    public C20154WmE(C263694Mz r1, C284815Oa r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void run() {
        Iterator it = this.A00.A00.iterator();
        while (it.hasNext()) {
            ((C263654Mv) it.next()).E06(this.A01);
        }
    }
}
