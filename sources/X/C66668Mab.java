package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.Mab  reason: case insensitive filesystem */
public abstract class C66668Mab {
    public static void A00(C282255Cj r2, 1OS r3, C74248Prc prc, C74248Prc prc2, List list) {
        AnonymousClass1cS r0;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((AnonymousClass1cS) it.next()).DTO(r3, prc, prc2);
        }
        AnonymousClass0eM r02 = r2.A01(r3.A02()).A06;
        if (r02 != null && (r0 = (AnonymousClass1cS) r02.getValue()) != null) {
            r0.DTO(r3, prc, prc2);
        }
    }

    public static void A01(C282255Cj r2, 1OS r3, C74248Prc prc, List list) {
        AnonymousClass1cS r0;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((AnonymousClass1cS) it.next()).DTJ(r3, prc);
        }
        AnonymousClass0eM r02 = r2.A01(r3.A02()).A06;
        if (r02 != null && (r0 = (AnonymousClass1cS) r02.getValue()) != null) {
            r0.DTJ(r3, prc);
        }
    }
}
