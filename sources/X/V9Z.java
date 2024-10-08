package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

public abstract class V9Z {
    public static Object A00(C307896Rx r12, AnonymousClass6Tm r13) {
        C16666Uz2 uz2;
        String str = (String) r13.A01();
        int A0M = AnonymousClass7TE.A0M(r13.A02());
        int A0M2 = AnonymousClass7TE.A0M(r13.A00());
        int A0M3 = AnonymousClass7TE.A0M(r13.A03(3));
        UserSession A0B = C308206Td.A0B(r12);
        FragmentActivity A04 = C308206Td.A04(r12);
        AnonymousClass0iw A08 = C308206Td.A08(r12);
        String valueOf = String.valueOf(A0M3);
        C16666Uz2[] values = C16666Uz2.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                uz2 = null;
                break;
            }
            uz2 = values[i];
            if (0qQ.A0K(uz2.A00, valueOf)) {
                break;
            }
            i++;
        }
        uz2.getClass();
        C18134VmA.A01(A04, A08, A0B, uz2, str, A0M, A0M2);
        return null;
    }
}
