package X;

import java.util.List;

/* renamed from: X.5UH  reason: invalid class name */
public final class AnonymousClass5UH extends 0Yg implements 0sP {
    public static final AnonymousClass5UH A00 = new AnonymousClass5UH();

    public AnonymousClass5UH() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass5Z5 r1;
        0qQ.A0C(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
        List list = (List) obj;
        C291815hv r0 = C291815hv.A02;
        Object obj2 = list.get(0);
        AnonymousClass5Z6[] r02 = AnonymousClass5Z5.A02;
        AnonymousClass5UT r2 = C286035Tr.A0L;
        0qQ.A0K(obj2, false);
        AnonymousClass5Z5 r03 = null;
        if (obj2 != null) {
            r1 = (AnonymousClass5Z5) r2.EIl(obj2);
        } else {
            r1 = null;
        }
        0qQ.A0A(r1);
        long j = r1.A00;
        Object obj3 = list.get(1);
        0qQ.A0K(obj3, false);
        if (obj3 != null) {
            r03 = (AnonymousClass5Z5) r2.EIl(obj3);
        }
        0qQ.A0A(r03);
        return new C291815hv(j, r03.A00);
    }
}
