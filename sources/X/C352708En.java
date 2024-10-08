package X;

import java.util.List;

/* renamed from: X.8En  reason: invalid class name and case insensitive filesystem */
public final class C352708En implements AnonymousClass8CQ {
    public final /* synthetic */ C352688El A00;

    public final void D5A(Exception exc, List list) {
        0qQ.A0B(list, 0);
        AnonymousClass8K5 r5 = (AnonymousClass8K5) 00k.A0J(list);
        if (r5 != null) {
            C352688El r4 = this.A00;
            r4.A01 = r5.A01;
            List list2 = AnonymousClass8Eg.SCENE_UNDERSTANDING.A03;
            Object A0J = 00k.A0J(list2);
            String str = null;
            if (A0J != null) {
                Object obj = r5.A03.get(A0J);
                if (obj == null) {
                    obj = null;
                }
                r4.A02 = (String) obj;
            }
            Object A0L = 00k.A0L(list2);
            if (A0L != null) {
                Object obj2 = r5.A03.get(A0L);
                if (obj2 != null) {
                    str = obj2;
                }
                r4.A00 = str;
            }
            C352688El.A00(r4);
            r4.A07.countDown();
        }
    }

    public C352708En(C352688El r1) {
        this.A00 = r1;
    }
}
