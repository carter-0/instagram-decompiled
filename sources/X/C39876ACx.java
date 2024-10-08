package X;

import java.util.AbstractCollection;
import java.util.Iterator;

/* renamed from: X.ACx  reason: case insensitive filesystem */
public final class C39876ACx {
    public final String A00;
    public final boolean A01;

    public C39876ACx(String str, boolean z) {
        0qQ.A0B(str, 1);
        this.A00 = str;
        this.A01 = z;
    }

    public static void A00(AbstractCollection abstractCollection, Iterator it) {
        C39876ACx aCx = (C39876ACx) it.next();
        2IV r3 = new 2IV();
        r3.A09("FB", "destination_app");
        r3.A09("EVERYONE", "destination_audience");
        String str = aCx.A00;
        r3.A09(str, "destination_surface");
        r3.A09(str, "source_surface");
        2IV r2 = new 2IV();
        r2.A06(r3, "app_surface");
        r2.A08("crosspost_setting", Boolean.valueOf(aCx.A01));
        abstractCollection.add(r2);
    }
}
