package X;

import android.util.SparseArray;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.V9t  reason: case insensitive filesystem */
public abstract class C16890V9t {
    public static final Object A00(C307896Rx r6, AnonymousClass6Tm r7) {
        C276544tV A0P = DbY.A0P(r7, 0);
        UserSession A0Z = DbT.A0Z(r6);
        User A0j = DbT.A0j(A0Z);
        if (A0P.A05.indexOfKey(35) < 0 && ((SparseArray) A0P.A06.A00()).indexOfKey(35) < 0) {
            return null;
        }
        Boolean A0Q = C13988Tno.A0Q(A0P, 35, false);
        if (0qQ.A0K(A0Q, A0j.A03.CYa())) {
            return null;
        }
        A0j.A03.Eem(A0Q);
        17h.A00(A0Z).A03(A0j);
        return null;
    }
}
