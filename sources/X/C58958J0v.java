package X;

import java.util.List;

/* renamed from: X.J0v  reason: case insensitive filesystem */
public final class C58958J0v extends 0Yg implements 0sP {
    public static final C58958J0v A00 = new C58958J0v();

    public C58958J0v() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        I1V i1v;
        I1W i1w;
        AnonymousClass5Z5 r0;
        C291815hv r5;
        0qQ.A0B(obj, 0);
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
        long j = AnonymousClass5Z5.A01;
        C56870IFr iFr = C56494HzQ.A0G;
        0qQ.A0K(obj4, false);
        if (obj4 != null) {
            r0 = (AnonymousClass5Z5) iFr.A00.invoke(obj4);
        } else {
            r0 = null;
        }
        0qQ.A0A(r0);
        long j2 = r0.A00;
        Object obj5 = list.get(3);
        C291815hv r02 = C291815hv.A02;
        C286015Tp r1 = C56494HzQ.A0B;
        if (0qQ.A0K(obj5, false) || obj5 == null) {
            r5 = null;
        } else {
            r5 = (C291815hv) r1.EIl(obj5);
        }
        return new AnonymousClass5ZC((AnonymousClass5Z3) null, r5, (C291825hw) null, i, i2, 0, AnonymousClass972.MUTABLE_FLAG_MASK, j2);
    }
}
