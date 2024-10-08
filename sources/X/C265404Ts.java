package X;

import java.util.Iterator;

/* renamed from: X.4Ts  reason: invalid class name and case insensitive filesystem */
public final class C265404Ts implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C263694Mz A01;
    public final /* synthetic */ String A02;

    public C265404Ts(C263694Mz r1, String str, long j) {
        this.A01 = r1;
        this.A00 = j;
        this.A02 = str;
    }

    public final void run() {
        Iterator it = this.A01.A00.iterator();
        while (it.hasNext()) {
            ((C263654Mv) it.next()).DYz(this.A00, this.A02);
        }
    }
}
