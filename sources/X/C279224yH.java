package X;

import java.util.List;

/* renamed from: X.4yH  reason: invalid class name and case insensitive filesystem */
public final class C279224yH implements Runnable {
    public final /* synthetic */ C279214yG A00;

    public C279224yH(C279214yG r1) {
        this.A00 = r1;
    }

    public final void run() {
        UUB uub;
        try {
            C279214yG r3 = this.A00;
            List list = r3.A01;
            if (!list.isEmpty()) {
                synchronized (list) {
                    uub = new UUB(list);
                    list.clear();
                }
                r3.A00.A00(uub);
            }
            C279214yG.A00(r3);
        } catch (Throwable th) {
            C279214yG.A00(this.A00);
            throw th;
        }
    }
}
