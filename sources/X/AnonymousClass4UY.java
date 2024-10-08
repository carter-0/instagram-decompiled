package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.4UY  reason: invalid class name */
public final class AnonymousClass4UY {
    public final 02m A00;

    public final void A00(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass651 r2 = (AnonymousClass651) it.next();
            0qQ.A0B(r2, 0);
            AnonymousClass654.A00(this.A00, r2, "process_message_start");
        }
    }

    public AnonymousClass4UY() {
        02m r0 = 02m.A0p;
        0qQ.A07(r0);
        this.A00 = r0;
    }
}
