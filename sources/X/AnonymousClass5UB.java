package X;

import java.util.List;

/* renamed from: X.5UB  reason: invalid class name */
public final class AnonymousClass5UB extends 0Yg implements 0sP {
    public static final AnonymousClass5UB A00 = new AnonymousClass5UB();

    public AnonymousClass5UB() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass5ZB r0;
        AnonymousClass5ZB r1;
        AnonymousClass5ZB r2;
        0qQ.A0C(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
        List list = (List) obj;
        Object obj2 = list.get(0);
        C286015Tp r6 = C286035Tr.A0B;
        AnonymousClass5ZB r3 = null;
        if (0qQ.A0K(obj2, false) || obj2 == null) {
            r0 = null;
        } else {
            r0 = (AnonymousClass5ZB) r6.EIl(obj2);
        }
        Object obj3 = list.get(1);
        if (0qQ.A0K(obj3, false) || obj3 == null) {
            r1 = null;
        } else {
            r1 = (AnonymousClass5ZB) r6.EIl(obj3);
        }
        Object obj4 = list.get(2);
        if (0qQ.A0K(obj4, false) || obj4 == null) {
            r2 = null;
        } else {
            r2 = (AnonymousClass5ZB) r6.EIl(obj4);
        }
        Object obj5 = list.get(3);
        if (!0qQ.A0K(obj5, false) && obj5 != null) {
            r3 = (AnonymousClass5ZB) r6.EIl(obj5);
        }
        return new C56545I0z(r0, r1, r2, r3);
    }
}
