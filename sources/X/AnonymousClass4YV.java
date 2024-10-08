package X;

import java.util.Iterator;

/* renamed from: X.4YV  reason: invalid class name */
public final class AnonymousClass4YV implements Runnable {
    public final /* synthetic */ C263694Mz A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ boolean A02;

    public AnonymousClass4YV(C263694Mz r1, String str, boolean z) {
        this.A00 = r1;
        this.A01 = str;
        this.A02 = z;
    }

    public final void run() {
        Iterator it = this.A00.A00.iterator();
        while (it.hasNext()) {
            ((C263654Mv) it.next()).D4H(this.A01, this.A02);
        }
    }
}
