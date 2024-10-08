package X;

import java.util.List;

/* renamed from: X.5Tt  reason: invalid class name and case insensitive filesystem */
public final class C286055Tt extends 0Yg implements 0sP {
    public static final C286055Tt A00 = new C286055Tt();

    public C286055Tt() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        List list;
        List list2;
        String str;
        0qQ.A0C(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
        List list3 = (List) obj;
        Object obj2 = list3.get(1);
        C286015Tp r7 = C286035Tr.A01;
        List list4 = null;
        if (0qQ.A0K(obj2, false) || obj2 == null) {
            list = null;
        } else {
            list = (List) r7.EIl(obj2);
        }
        Object obj3 = list3.get(2);
        if (0qQ.A0K(obj3, false) || obj3 == null) {
            list2 = null;
        } else {
            list2 = (List) r7.EIl(obj3);
        }
        Object obj4 = list3.get(0);
        if (obj4 != null) {
            str = (String) obj4;
        } else {
            str = null;
        }
        0qQ.A0A(str);
        if (list == null) {
            list = null;
        } else if (list.isEmpty()) {
            list = null;
        }
        if (list2 == null) {
            list2 = null;
        } else if (list2.isEmpty()) {
            list2 = null;
        }
        Object obj5 = list3.get(3);
        if (!0qQ.A0K(obj5, false) && obj5 != null) {
            list4 = (List) r7.EIl(obj5);
        }
        return new C286025Tq(str, list, list2, list4);
    }
}
