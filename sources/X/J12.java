package X;

import java.util.List;

public final class J12 extends 0Yg implements 0sP {
    public static final J12 A00 = new J12();

    public J12() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Number number;
        long A002;
        0qQ.A0B(obj, 0);
        if (obj.equals(false)) {
            A002 = AnonymousClass5Z5.A01;
        } else {
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
