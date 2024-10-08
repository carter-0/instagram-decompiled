package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.profile.intf.UserDetailEntryInfo;
import com.instagram.user.model.User;
import org.json.JSONObject;

/* renamed from: X.Ej1  reason: case insensitive filesystem */
public abstract class C48716Ej1 {
    public static final Object A00(C307896Rx r23, AnonymousClass6Tm r24) {
        AnonymousClass6Tm r0 = r24;
        String A0c = Dbb.A0c(r0);
        0qQ.A07(A0c);
        C277014uI A0N = DbW.A0N(r0);
        C277014uI A0O = DbW.A0O(r0);
        String A0i = DbW.A0i(r0, 3);
        C307896Rx r6 = r23;
        UserSession A0Y = DbT.A0Y(r6);
        FragmentActivity A04 = C308206Td.A04(r6);
        C16365Uti uti = new C16365Uti(0);
        User A0j = DbV.A0j(A0Y, A0c);
        if (A0j != null) {
            AnonymousClass7TF.A1H(A04, A0Y);
            0qQ.A0B(uti, 3);
            FH6.A08(A04, (0xF) null, new C47692EDb(23, (Object) A0O, (Object) A0N, (Object) r6), A0Y, (1Xj) null, (AnonymousClass3W1) null, (UserDetailEntryInfo) null, uti, A0j, A0i, (String) null, A0i, (String) null, (JSONObject) null);
            return null;
        }
        AnonymousClass441.A02.A02(A0Y, new C51026FnI(A04, uti, r6, A0O, A0N, A0Y, A0i, 3), A0c);
        return null;
    }
}
