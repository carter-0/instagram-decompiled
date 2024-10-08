package X;

import java.util.List;

/* renamed from: X.5UX  reason: invalid class name */
public final class AnonymousClass5UX extends 0Yg implements 0sP {
    public static final AnonymousClass5UX A00 = new AnonymousClass5UX();

    public AnonymousClass5UX() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Number number;
        long A002;
        if (0qQ.A0K(obj, false)) {
            A002 = 9205357640488583168L;
        } else {
            0qQ.A0C(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            Number number2 = null;
            if (obj2 != null) {
                number = (Number) obj2;
            } else {
                number = null;
            }
            0qQ.A0A(number);
            float floatValue = number.floatValue();
            Object obj3 = list.get(1);
            if (obj3 != null) {
                number2 = (Number) obj3;
            }
            0qQ.A0A(number2);
            A002 = C289325dP.A00(floatValue, number2.floatValue());
        }
        return new C289295dM(A002);
    }
}
