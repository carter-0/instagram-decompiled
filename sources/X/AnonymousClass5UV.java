package X;

import java.util.List;

/* renamed from: X.5UV  reason: invalid class name */
public final class AnonymousClass5UV extends 0Yg implements 0sP {
    public static final AnonymousClass5UV A00 = new AnonymousClass5UV();

    public AnonymousClass5UV() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Number number;
        long A002;
        if (0qQ.A0K(obj, false)) {
            A002 = AnonymousClass5Z5.A01;
        } else {
            0qQ.A0C(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            AnonymousClass5Z6 r1 = null;
            if (obj2 != null) {
                number = (Number) obj2;
            } else {
                number = null;
            }
            0qQ.A0A(number);
            float floatValue = number.floatValue();
            Object obj3 = list.get(1);
            if (obj3 != null) {
                r1 = (AnonymousClass5Z6) obj3;
            }
            0qQ.A0A(r1);
            A002 = AnonymousClass5Z7.A00(floatValue, r1.A00);
        }
        return new AnonymousClass5Z5(A002);
    }
}
