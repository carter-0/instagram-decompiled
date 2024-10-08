package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.EhN  reason: case insensitive filesystem */
public abstract class C48614EhN {
    public static final Object A00(C307896Rx r9, AnonymousClass6Tm r10) {
        List list = r10.A00;
        Object obj = list.get(0);
        String A0t = DbU.A0t(list, 1);
        String A0t2 = DbU.A0t(list, 2);
        String A0d = Dba.A0d(list);
        String A0t3 = DbU.A0t(list, 4);
        FragmentActivity A04 = C308206Td.A04(r9);
        UserSession A0Y = DbT.A0Y(r9);
        if (1ZB.A01 == null || obj == null) {
            return null;
        }
        EWI A00 = C48952Emq.A00(A0t);
        if (!AnonymousClass000.A00(4213).equals(obj)) {
            return null;
        }
        C48953Emr.A00().A00(A04, A0Y, A00, A0t2, A0d, A0t3);
        return null;
    }
}
