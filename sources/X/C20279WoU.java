package X;

import java.util.Iterator;

/* renamed from: X.WoU  reason: case insensitive filesystem */
public final class C20279WoU implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C263694Mz A01;
    public final /* synthetic */ String A02;

    public C20279WoU(C263694Mz r1, String str, long j) {
        this.A01 = r1;
        this.A02 = str;
        this.A00 = j;
    }

    public final void run() {
        Iterator it = this.A01.A00.iterator();
        while (it.hasNext()) {
            ((C263654Mv) it.next()).DGr(this.A02, this.A00);
        }
    }
}
