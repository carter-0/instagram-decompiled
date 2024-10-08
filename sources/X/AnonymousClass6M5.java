package X;

import java.util.Iterator;

/* renamed from: X.6M5  reason: invalid class name */
public final /* synthetic */ class AnonymousClass6M5 implements Runnable {
    public final /* synthetic */ C263694Mz A00;
    public final /* synthetic */ AnonymousClass4Yf A01;

    public /* synthetic */ AnonymousClass6M5(C263694Mz r1, AnonymousClass4Yf r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void run() {
        C263694Mz r0 = this.A00;
        AnonymousClass4Yf r2 = this.A01;
        Iterator it = r0.A00.iterator();
        while (it.hasNext()) {
            ((C263654Mv) it.next()).Cwg(r2);
        }
    }
}
