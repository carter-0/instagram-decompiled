package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.FAv  reason: case insensitive filesystem */
public final class C49874FAv {
    public static final C49874FAv A00 = new Object();

    public final Object A00(C307896Rx r24, AnonymousClass6Tm r25) {
        String str;
        String str2;
        AnonymousClass6Tm r1 = r25;
        String A0c = Dbb.A0c(r1);
        C277014uI A0N = DbW.A0N(r1);
        C277014uI A0O = DbW.A0O(r1);
        C276544tV A0M = DbW.A0M(r1, 3);
        C307896Rx r13 = r24;
        UserSession A0Y = DbT.A0Y(r13);
        FragmentActivity A04 = C308206Td.A04(r13);
        if (A0M == null || (str = A0M.A0F()) == null) {
            str = "DIRECT_RESTRICT";
        }
        if (str.equals("DIRECT_RESTRICT")) {
            Integer num = AnonymousClass05K.A00;
            if (A0M == null || (str2 = A0M.A0D()) == null) {
                str2 = "";
            }
            C51093FoN foN = new C51093FoN(C308206Td.A04(r13), DbW.A0J(C308206Td.A0B(r13), str2), r13, A0N, A0O, A0c);
            User A0j = DbV.A0j(A0Y, A0c);
            if (A0j != null) {
                1YZ r3 = 1YZ.A02;
                if (r3 == null) {
                    return null;
                }
                0qQ.A0C(A04, "null cannot be cast to non-null type android.app.Activity");
                r3.A03(A04, AnonymousClass07i.A00(A04), A0Y, foN, A0j.getId(), str2, (String) null, (String) null);
                return null;
            }
            AnonymousClass441.A02.A02(A0Y, new C51026FnI(A04, num, r13, foN, A0O, A0Y, str2, 0), A0c);
            return null;
        }
        throw AnonymousClass7TE.A0w(str);
    }
}
