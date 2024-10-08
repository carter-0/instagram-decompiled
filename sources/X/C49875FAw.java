package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import org.json.JSONObject;

/* renamed from: X.FAw  reason: case insensitive filesystem */
public final class C49875FAw {
    public static final C49875FAw A00 = new Object();

    public final Object A00(C307896Rx r22, AnonymousClass6Tm r23) {
        String str;
        String str2;
        AnonymousClass6Tm r1 = r23;
        String A0c = Dbb.A0c(r1);
        C277014uI A0N = DbW.A0N(r1);
        C277014uI A0O = DbW.A0O(r1);
        C276544tV A0M = DbW.A0M(r1, 3);
        C307896Rx r4 = r22;
        UserSession A0Z = DbT.A0Z(r4);
        FragmentActivity A04 = C308206Td.A04(r4);
        if (A0M == null || (str = A0M.A0H()) == null) {
            str = "SINGLE_BLOCK";
        }
        if (str.equals("SINGLE_BLOCK")) {
            Integer num = AnonymousClass05K.A00;
            if (A0M == null || (str2 = A0M.A0D()) == null) {
                str2 = "";
            }
            C51048Fne fne = new C51048Fne(0, r4, A0N, A0O);
            User A0j = DbV.A0j(A0Z, A0c);
            if (A0j != null) {
                String A002 = C49192Eqx.A00(str2);
                A0j.getUsername();
                AnonymousClass7TF.A1H(A04, A0Z);
                C49193Eqy.A00(A04, A0Z, A0j, fne, str2, A002, (JSONObject) null, 0, false);
                return null;
            }
            AnonymousClass441.A02.A02(A0Z, new C51026FnI(A04, fne, num, r4, A0O, A0Z, str2, 1), A0c);
            return null;
        }
        throw AnonymousClass7TE.A0w(str);
    }
}
