package X;

import java.util.List;

/* renamed from: X.5lq  reason: invalid class name and case insensitive filesystem */
public abstract class C294095lq {
    public static final Object A00(C307896Rx r8, AnonymousClass6Tm r9) {
        C307786Rm r7 = r8.A03;
        if (r7 != null) {
            List list = r9.A00;
            String str = (String) list.get(0);
            Object obj = list.get(1);
            Object obj2 = list.get(2);
            0qQ.A0C(obj2, "null cannot be cast to non-null type kotlin.Number");
            int intValue = ((Number) obj2).intValue();
            if (str != null) {
                List list2 = r8.A0D;
                Integer num = AnonymousClass05K.A00;
                if (intValue == 0) {
                    C307476Qg.A02(r7).A0B(new Q3P(str, obj));
                    return null;
                } else if (list2 == null) {
                    throw new IllegalArgumentException("Keypath must be set on environment if trying to WriteLocalState on a depth larger than 0.");
                } else if (intValue <= list2.size()) {
                    C307476Qg.A02(r7).A0B(new Q3P(C7285Q2k.A00(num, str, list2, intValue), obj));
                } else {
                    throw new IllegalArgumentException(Pxd.A00(470));
                }
            }
            return null;
        }
        throw new IllegalStateException("Called WriteLocalState when not attached to a tree");
    }
}
