package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.V9q  reason: case insensitive filesystem */
public abstract class C16887V9q {
    public static final Object A00(C307896Rx r36, AnonymousClass6Tm r37) {
        AnonymousClass6Tm r3 = r37;
        List list = r3.A00;
        C276544tV r5 = (C276544tV) list.get(5);
        if (r5 == null) {
            return null;
        }
        boolean A0R = r5.A0R(43, false);
        String A0t = DbU.A0t(list, 0);
        String str = (String) DbW.A0d(r3);
        String A0t2 = DbU.A0t(list, 2);
        String A0t3 = DbU.A0t(list, 3);
        String A0t4 = DbU.A0t(list, 4);
        String A0D = r5.A0D();
        long A04 = r5.A04(36, 0);
        boolean A0R2 = r5.A0R(40, false);
        String A0G = r5.A0G();
        FragmentActivity A042 = C308206Td.A04(r36);
        UserSession A0Z = DbT.A0Z(r36);
        C249713kF r7 = C249713kF.A00;
        Long valueOf = Long.valueOf(A04);
        Boolean valueOf2 = Boolean.valueOf(A0R2);
        if (A0R) {
            r7.A16(A042, A0Z, valueOf2, valueOf, str, A0t2, A0t3, (String) null, (String) null, A0t4, (String) null, A0D, A0G, false, false, false);
            return null;
        }
        r7.A16(A042, A0Z, valueOf2, valueOf, str, A0t2, A0t3, A0t, (String) null, A0t4, (String) null, A0D, A0G, false, false, false);
        return null;
    }
}
