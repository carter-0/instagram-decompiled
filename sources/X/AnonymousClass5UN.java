package X;

import java.util.List;

/* renamed from: X.5UN  reason: invalid class name */
public final class AnonymousClass5UN extends 0Yg implements 0sP {
    public static final AnonymousClass5UN A00 = new AnonymousClass5UN();

    public AnonymousClass5UN() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Number number;
        0qQ.A0C(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
        List list = (List) obj;
        Object obj2 = list.get(0);
        Number number2 = null;
        if (obj2 != null) {
            number = (Number) obj2;
        } else {
            number = null;
        }
        0qQ.A0A(number);
        int intValue = number.intValue();
        Object obj3 = list.get(1);
        if (obj3 != null) {
            number2 = (Number) obj3;
        }
        0qQ.A0A(number2);
        return new C285965Tk(C3026964x.A00(intValue, number2.intValue()));
    }
}
