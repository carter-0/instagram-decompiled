package X;

import java.util.List;

/* renamed from: X.HVy  reason: case insensitive filesystem */
public abstract class C54867HVy {
    public static final Object A00(C307896Rx r6, AnonymousClass6Tm r7) {
        C64361Kj.A00();
        0lg A0B = C308206Td.A0B(r6);
        0qQ.A0B(A0B, 1);
        C59112J6u j6u = new C59112J6u(A0B, 4);
        List list = r7.A00;
        Object obj = list.get(0);
        Long l = null;
        try {
            if (obj instanceof Number) {
                l = C51968G9o.A0v((Number) obj);
            } else {
                Number number = (Number) obj;
                if (number != null) {
                    l = C51968G9o.A0v(number);
                }
            }
        } catch (ClassCastException e) {
            1Kn.A00((C307786Rm) null, "CXF_CPDP", "Error when trying to get the TTL in argument index 0 for action bk.action.cxf.experimental.cpdp.Prefetch", e);
        }
        Object obj2 = list.get(1);
        boolean z = false;
        try {
            if (obj2 instanceof Boolean) {
                z = AnonymousClass7TE.A1a(obj2);
            } else {
                Boolean bool = (Boolean) obj2;
                if (bool != null) {
                    z = bool.booleanValue();
                }
            }
        } catch (ClassCastException e2) {
            1Kn.A00((C307786Rm) null, "CXF_CPDP", "Error when trying to get the exit_view in argument index 1 for action bk.action.cxf.experimental.cpdp.Prefetch", e2);
        }
        j6u.invoke(l, Boolean.valueOf(z));
        return null;
    }
}
