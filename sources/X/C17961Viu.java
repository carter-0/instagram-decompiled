package X;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: X.Viu  reason: case insensitive filesystem */
public final class C17961Viu {
    public final Set A00 = new LinkedHashSet();

    public final void A00() {
        Set set = this.A00;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int A0F = AnonymousClass7TG.A0F(it);
            02m.A0p.markerPoint(A0F, "USER_NAVIGATION_CANCELLATION");
            02m.A0p.markerEnd(A0F, 4);
        }
        set.clear();
    }

    public final void A01() {
        Set set = this.A00;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int A0F = AnonymousClass7TG.A0F(it);
            02m.A0p.markerPoint(A0F, "NETWORK_FAILED");
            02m.A0p.markerEnd(A0F, 3);
        }
        set.clear();
    }
}
