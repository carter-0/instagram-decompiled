package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.List;
import org.json.JSONObject;

/* renamed from: X.Eix  reason: case insensitive filesystem */
public abstract class C48712Eix {
    public static Object A00(C307896Rx r22, AnonymousClass6Tm r23) {
        AnonymousClass6Tm r1 = r23;
        String obj = r1.A01().toString();
        C277014uI A0N = DbW.A0N(r1);
        C277014uI A0P = DbW.A0P(r1, 2);
        List list = r1.A00;
        String A0t = DbU.A0t(list, 3);
        String A0t2 = DbU.A0t(list, 4);
        C50224FUg fUg = new C50224FUg(A0t);
        C307896Rx r7 = r22;
        UserSession A0Z = DbT.A0Z(r7);
        FragmentActivity A04 = C308206Td.A04(r7);
        User A0j = DbV.A0j(A0Z, obj);
        if (A0j != null) {
            0qQ.A0B(A04, 1);
            0qQ.A0B(A0Z, 2);
            C331157Pu A07 = FH9.A07(r7);
            C331127Pr A0e = DbX.A0e(A0Z, true);
            A0e.A19 = true;
            F8Z.A00(A04, fUg, r7, A0P, A0N, A0Z, A07, A0e, A0j, (String) null, A0t2, (JSONObject) null);
            return null;
        }
        AnonymousClass441.A02.A02(A0Z, new C51026FnI(A04, fUg, r7, A0P, A0N, A0Z, A0t2, 2), obj);
        return null;
    }
}
