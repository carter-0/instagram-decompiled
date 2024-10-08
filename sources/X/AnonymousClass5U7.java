package X;

import java.util.List;

/* renamed from: X.5U7  reason: invalid class name */
public final class AnonymousClass5U7 extends 0Yg implements 0sP {
    public static final AnonymousClass5U7 A00 = new AnonymousClass5U7();

    public AnonymousClass5U7() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        I1V i1v;
        I1W i1w;
        AnonymousClass5Z5 r0;
        C291815hv r5;
        0qQ.A0C(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
        List list = (List) obj;
        Object obj2 = list.get(0);
        if (obj2 != null) {
            i1v = (I1V) obj2;
        } else {
            i1v = null;
        }
        0qQ.A0A(i1v);
        int i = i1v.A00;
        Object obj3 = list.get(1);
        if (obj3 != null) {
            i1w = (I1W) obj3;
        } else {
            i1w = null;
        }
        0qQ.A0A(i1w);
        int i2 = i1w.A00;
        Object obj4 = list.get(2);
        AnonymousClass5Z6[] r02 = AnonymousClass5Z5.A02;
        AnonymousClass5UT r03 = C286035Tr.A0L;
        0qQ.A0K(obj4, false);
        if (obj4 != null) {
            r0 = (AnonymousClass5Z5) r03.EIl(obj4);
        } else {
            r0 = null;
        }
        0qQ.A0A(r0);
        long j = r0.A00;
        Object obj5 = list.get(3);
        C291815hv r04 = C291815hv.A02;
        C286015Tp r1 = C286035Tr.A0E;
        if (0qQ.A0K(obj5, false) || obj5 == null) {
            r5 = null;
        } else {
            r5 = (C291815hv) r1.EIl(obj5);
        }
        return new AnonymousClass5ZC((AnonymousClass5Z3) null, r5, (C291825hw) null, i, i2, 0, AnonymousClass972.MUTABLE_FLAG_MASK, j);
    }
}
