package X;

import java.util.List;

public final class J10 extends 0Yg implements 0sP {
    public static final J10 A00 = new J10();

    public J10() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass5Z5 r1;
        0qQ.A0B(obj, 0);
        List list = (List) obj;
        C291815hv r0 = C291815hv.A02;
        Object obj2 = list.get(0);
        long j = AnonymousClass5Z5.A01;
        C56870IFr iFr = C56494HzQ.A0G;
        0qQ.A0K(obj2, false);
        AnonymousClass5Z5 r02 = null;
        if (obj2 != null) {
            r1 = (AnonymousClass5Z5) iFr.A00.invoke(obj2);
        } else {
            r1 = null;
        }
        0qQ.A0A(r1);
        long j2 = r1.A00;
        Object obj3 = list.get(1);
        0qQ.A0K(obj3, false);
        if (obj3 != null) {
            r02 = (AnonymousClass5Z5) iFr.A00.invoke(obj3);
        }
        0qQ.A0A(r02);
        return new C291815hv(j2, r02.A00);
    }
}
