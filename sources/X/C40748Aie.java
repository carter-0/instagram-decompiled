package X;

import java.util.List;

/* renamed from: X.Aie  reason: case insensitive filesystem */
public final class C40748Aie implements Runnable {
    public final /* synthetic */ C340957m6 A00;

    public C40748Aie(C340957m6 r1) {
        this.A00 = r1;
    }

    public final void run() {
        int i = C340577lU.A00;
        C340577lU.A00(1, 0, 002.A0g("ConcurrentFrontBackController", ": ", "Preview stopped for at least one of the cameras"));
        List list = this.A00.A0E.A00;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((C340347l7) list.get(i2)).DZF();
        }
    }
}
