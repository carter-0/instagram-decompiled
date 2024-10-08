package X;

import java.util.List;

/* renamed from: X.5Tn  reason: invalid class name and case insensitive filesystem */
public final class C285995Tn extends 0Yg implements 0sP {
    public static final C285995Tn A00 = new C285995Tn();

    public C285995Tn() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C286025Tq r0;
        0qQ.A0C(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
        List list = (List) obj;
        Object obj2 = list.get(0);
        C286015Tp r2 = C286035Tr.A00;
        C285965Tk r1 = null;
        if (0qQ.A0K(obj2, false) || obj2 == null) {
            r0 = null;
        } else {
            r0 = (C286025Tq) r2.EIl(obj2);
        }
        0qQ.A0A(r0);
        Object obj3 = list.get(1);
        C286015Tp r3 = C286035Tr.A0G;
        if (!0qQ.A0K(obj3, false) && obj3 != null) {
            r1 = (C285965Tk) r3.EIl(obj3);
        }
        0qQ.A0A(r1);
        return new C285975Tl(r0, (C285965Tk) null, r1.A00);
    }
}
