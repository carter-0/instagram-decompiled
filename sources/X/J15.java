package X;

import java.util.List;

public final class J15 extends 0Yg implements 0sP {
    public static final J15 A00 = new J15();

    public J15() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        List list;
        List list2;
        String str;
        0qQ.A0B(obj, 0);
        List list3 = (List) obj;
        Object obj2 = list3.get(1);
        C286015Tp r5 = C56494HzQ.A00;
        if (0qQ.A0K(obj2, false) || obj2 == null) {
            list = null;
        } else {
            list = (List) r5.EIl(obj2);
        }
        Object obj3 = list3.get(2);
        if (0qQ.A0K(obj3, false) || obj3 == null) {
            list2 = null;
        } else {
            list2 = (List) r5.EIl(obj3);
        }
        Object obj4 = list3.get(0);
        if (obj4 != null) {
            str = (String) obj4;
        } else {
            str = null;
        }
        0qQ.A0A(str);
        if (list == null) {
            list = 0sn.A00;
        }
        if (list2 == null) {
            list2 = 0sn.A00;
        }
        return C51970G9q.A0S(new C286025Tq(list, list2, str));
    }
}
