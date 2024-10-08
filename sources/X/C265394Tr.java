package X;

import java.util.Iterator;

/* renamed from: X.4Tr  reason: invalid class name and case insensitive filesystem */
public final class C265394Tr implements Runnable {
    public final /* synthetic */ C263694Mz A00;
    public final /* synthetic */ boolean A01;
    public final /* synthetic */ boolean A02;

    public C265394Tr(C263694Mz r1, boolean z, boolean z2) {
        this.A00 = r1;
        this.A02 = z;
        this.A01 = z2;
    }

    public final void run() {
        Iterator it = this.A00.A00.iterator();
        while (it.hasNext()) {
            ((C263654Mv) it.next()).Dzh(this.A02, this.A01);
        }
    }
}
