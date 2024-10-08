package X;

import java.util.List;

/* renamed from: X.5U5  reason: invalid class name */
public final class AnonymousClass5U5 extends 0Yg implements 0sP {
    public static final AnonymousClass5U5 A00 = new AnonymousClass5U5();

    public AnonymousClass5U5() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String str;
        0qQ.A0C(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
        List list = (List) obj;
        Object obj2 = list.get(0);
        C56545I0z i0z = null;
        if (obj2 != null) {
            str = (String) obj2;
        } else {
            str = null;
        }
        0qQ.A0A(str);
        Object obj3 = list.get(1);
        C286015Tp r1 = C286035Tr.A0F;
        if (!0qQ.A0K(obj3, false) && obj3 != null) {
            i0z = (C56545I0z) r1.EIl(obj3);
        }
        return new C52945Gfw(i0z, str);
    }
}
