package X;

import java.util.Comparator;

/* renamed from: X.DiF  reason: case insensitive filesystem */
public final class C46635DiF implements Comparator {
    public final /* synthetic */ C307896Rx A00;
    public final /* synthetic */ C277014uI A01;

    public C46635DiF(C307896Rx r1, C277014uI r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final int compare(Object obj, Object obj2) {
        C277014uI r3 = this.A01;
        C308276Tl A0P = DbS.A0P();
        A0P.A03(obj, 0);
        Object A002 = C299275ur.A00(this.A00, DbT.A0V(A0P, obj2), r3);
        if (A002 instanceof Integer) {
            return AnonymousClass7TE.A0M(A002);
        }
        1Kn.A02("bk.action.array.SortedArray", "Got non-integer result while evaluating comparator predicate");
        return 0;
    }
}
