package X;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.Ail  reason: case insensitive filesystem */
public final class C40755Ail implements Runnable {
    public final /* synthetic */ 1P2 A00;

    public C40755Ail(1P2 r1) {
        this.A00 = r1;
    }

    public final void run() {
        1P2 r3 = this.A00;
        Map map = r3.A01;
        Iterator A0t = AnonymousClass7TF.A0t(new HashMap(map));
        while (A0t.hasNext()) {
            ((AnonymousClass4Z9) A0t.next()).A07.cancel();
        }
        map.clear();
        r3.A02.clear();
        r3.A00.clear();
    }
}
