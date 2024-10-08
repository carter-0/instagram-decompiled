package X;

import java.util.List;

/* renamed from: X.2pZ  reason: invalid class name and case insensitive filesystem */
public final class C230402pZ implements C229222n2 {
    public final String BK2(AnonymousClass30Y r3) {
        0qQ.A0B(r3, 0);
        List list = ((C53288Gla) r3.A03).A03.A0B;
        Object obj = r3.A04;
        0qQ.A06(obj);
        String id = ((C55923Hpk) list.get(((Number) obj).intValue())).A00().getId();
        if (id != null) {
            return id;
        }
        throw new IllegalStateException("Required value was null.");
    }
}
