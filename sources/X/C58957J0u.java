package X;

import java.util.List;

/* renamed from: X.J0u  reason: case insensitive filesystem */
public final class C58957J0u extends 0Yg implements 0sP {
    public static final C58957J0u A00 = new C58957J0u();

    public C58957J0u() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Number number;
        long A002;
        0qQ.A0B(obj, 0);
        if (obj.equals(false)) {
            A002 = 9205357640488583168L;
        } else {
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
        return C51965G9l.A0M(A002);
    }
}
