package X;

import java.util.Iterator;

/* renamed from: X.Tpa  reason: case insensitive filesystem */
public final class C14084Tpa implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C263694Mz A01;

    public C14084Tpa(C263694Mz r1, long j) {
        this.A01 = r1;
        this.A00 = j;
    }

    public final void run() {
        Iterator it = this.A01.A00.iterator();
        while (it.hasNext()) {
            ((C263654Mv) it.next()).onSeeking(this.A00);
        }
    }
}
