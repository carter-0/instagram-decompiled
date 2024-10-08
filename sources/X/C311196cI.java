package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.6cI  reason: invalid class name and case insensitive filesystem */
public final class C311196cI implements C250603lj {
    public final 2O0 A00;
    public final Map A01 = new HashMap();

    public final void ATF(AnonymousClass30Y r3, C252093oY r4) {
        0qQ.A0B(r3, 0);
        0qQ.A0B(r4, 1);
        if (r4.CEk(r3) == AnonymousClass05K.A0C) {
            Map map = this.A01;
            String id = ((C250973mM) r3.A03).A0H.getId();
            0qQ.A07(id);
            map.remove(id);
        }
    }

    public C311196cI(2O0 r2) {
        this.A00 = r2;
    }
}
