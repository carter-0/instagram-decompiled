package X;

import java.util.List;

/* renamed from: X.5U3  reason: invalid class name */
public final class AnonymousClass5U3 extends 0Yg implements 0sP {
    public static final AnonymousClass5U3 A00 = new AnonymousClass5U3();

    public AnonymousClass5U3() {
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
        C286015Tp r2 = C286035Tr.A0F;
        if (!0qQ.A0K(obj3, false) && obj3 != null) {
            i0z = (C56545I0z) r2.EIl(obj3);
        }
        return new C52946Gfx(i0z, str);
    }
}
