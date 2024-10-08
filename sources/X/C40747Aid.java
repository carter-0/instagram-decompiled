package X;

import java.util.List;

/* renamed from: X.Aid  reason: case insensitive filesystem */
public final class C40747Aid implements Runnable {
    public final /* synthetic */ C340957m6 A00;

    public C40747Aid(C340957m6 r1) {
        this.A00 = r1;
    }

    public final void run() {
        int i = C340577lU.A00;
        C340577lU.A00(1, 0, 002.A0g("ConcurrentFrontBackController", ": ", "Preview started for both cameras"));
        List list = this.A00.A0D.A00;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((AnonymousClass8FP) list.get(i2)).DZE();
        }
    }
}
