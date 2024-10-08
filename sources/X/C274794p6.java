package X;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.4p6  reason: invalid class name and case insensitive filesystem */
public class C274794p6 {
    public static C274794p6 A02 = new C274794p6();
    public final List A00 = new ArrayList();
    public final AtomicBoolean A01 = new AtomicBoolean(true);

    public final void A00(C275104pb r3) {
        List list = this.A00;
        synchronized (list) {
            list.add(r3);
        }
    }
}
