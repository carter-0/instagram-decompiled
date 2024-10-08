package X;

import java.util.List;

/* renamed from: X.2pT  reason: invalid class name and case insensitive filesystem */
public final class C230342pT implements C250603lj {
    public final C230322pR A00;
    public final AnonymousClass2pP A01;

    public final void ATF(AnonymousClass30Y r8, C252093oY r9) {
        0qQ.A0B(r8, 0);
        0qQ.A0B(r9, 1);
        Object obj = r8.A03;
        List list = ((C53288Gla) obj).A03.A0B;
        Object obj2 = r8.A04;
        0qQ.A06(obj2);
        1Xj A002 = ((C55923Hpk) list.get(((Number) obj2).intValue())).A00();
        AnonymousClass2pP r2 = this.A01;
        String id = A002.getId();
        if (id != null) {
            C254213s7 A003 = r2.A00(id);
            r9.CFe(r8);
            int intValue = r9.CEk(r8).intValue();
            if (intValue == 0 || intValue == 1) {
                A003.A03(r8, r9);
                return;
            }
            A003.A04(r9);
            r2.A01(this.A00, A003, obj, obj2);
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public C230342pT(C230322pR r1, AnonymousClass2pP r2) {
        this.A01 = r2;
        this.A00 = r1;
    }
}
