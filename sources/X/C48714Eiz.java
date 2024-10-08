package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.Eiz  reason: case insensitive filesystem */
public abstract class C48714Eiz {
    public static final Object A00(C307896Rx r8, AnonymousClass6Tm r9) {
        Object A03 = r9.A03(0);
        0qQ.A0C(A03, "null cannot be cast to non-null type kotlin.Number");
        String obj = A03.toString();
        C277014uI A0N = DbW.A0N(r9);
        C277014uI A0O = DbW.A0O(r9);
        C307896Rx r5 = r8;
        UserSession A0Y = DbT.A0Y(r8);
        FragmentActivity A04 = C308206Td.A04(r5);
        User A0j = DbV.A0j(A0Y, obj);
        if (A0j != null) {
            AnonymousClass7TF.A1H(A04, A0Y);
            C294695ms.A00(A0Y).A08(A04, new C47692EDb(22, (Object) A0O, (Object) A0N, (Object) r5), A0Y, A0j);
            return null;
        }
        AnonymousClass441.A02.A02(A0Y, new C51024FnG(1, A04, r5, A0N, A0O, A0Y), obj);
        return null;
    }
}
