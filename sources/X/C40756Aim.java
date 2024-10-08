package X;

import java.util.Iterator;
import java.util.Map;

/* renamed from: X.Aim  reason: case insensitive filesystem */
public final class C40756Aim implements Runnable {
    public final /* synthetic */ 1Ga A00;

    public C40756Aim(1Ga r1) {
        this.A00 = r1;
    }

    public final void run() {
        1Ga r3 = this.A00;
        Map map = r3.A01;
        Iterator A0v = AnonymousClass7TF.A0v(map);
        while (A0v.hasNext()) {
            ((11W) A0v.next()).onCancel();
        }
        map.clear();
        r3.A02.clear();
        r3.A00.clear();
    }
}
