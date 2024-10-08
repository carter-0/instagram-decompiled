package X;

import java.util.List;

/* renamed from: X.5UP  reason: invalid class name */
public final class AnonymousClass5UP extends 0Yg implements 0sP {
    public static final AnonymousClass5UP A00 = new AnonymousClass5UP();

    public AnonymousClass5UP() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass5RW r0;
        C289295dM r02;
        0qQ.A0C(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
        List list = (List) obj;
        C291805hu r03 = C291805hu.A03;
        Object obj2 = list.get(0);
        long j = AnonymousClass5RW.A01;
        AnonymousClass5UT r04 = C286035Tr.A0J;
        0qQ.A0K(obj2, false);
        Number number = null;
        if (obj2 != null) {
            r0 = (AnonymousClass5RW) r04.EIl(obj2);
        } else {
            r0 = null;
        }
        0qQ.A0A(r0);
        long j2 = r0.A00;
        Object obj3 = list.get(1);
        AnonymousClass5UT r05 = C286035Tr.A0K;
        0qQ.A0K(obj3, false);
        if (obj3 != null) {
            r02 = (C289295dM) r05.EIl(obj3);
        } else {
            r02 = null;
        }
        0qQ.A0A(r02);
        long j3 = r02.A00;
        Object obj4 = list.get(2);
        if (obj4 != null) {
            number = (Number) obj4;
        }
        0qQ.A0A(number);
        return new C291805hu(number.floatValue(), j2, j3);
    }
}
