package X;

import java.util.List;

public final class J11 extends 0Yg implements 0sP {
    public static final J11 A00 = new J11();

    public J11() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Number number;
        0qQ.A0B(obj, 0);
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
