package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.Iterator;

/* renamed from: X.EfR  reason: case insensitive filesystem */
public abstract class C48494EfR {
    public static final Object A00(C307896Rx r15, AnonymousClass6Tm r16) {
        Object obj;
        UserSession A0Z = DbT.A0Z(r15);
        if (!C324536zU.A01(A0Z) || C324536zU.A00(A0Z)) {
            return null;
        }
        Object A03 = r16.A03(0);
        if (!(A03 instanceof String)) {
            return null;
        }
        String str = A0Z.A06;
        if (0qQ.A0K(str, A03)) {
            return null;
        }
        0tB A00 = AnonymousClass0BO.A00(A0Z);
        Iterator it = A00.BO0().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (A03.equals(DbS.A0q(obj))) {
                break;
            }
        }
        User user = (User) obj;
        if (user == null || A00.A02.A03.keySet().contains(A03)) {
            return null;
        }
        C49919FEu.A00(new QP5("bloks_action", "", "", (String) null, 13), A0Z, "log_out_account", "deeplink", (String) null, (String) null);
        FragmentActivity A04 = C308206Td.A04(r15);
        0qQ.A0B(A04, 1);
        0xY AR4 = 0xn.A00(A04, "invite_prefs").AR4();
        AR4.E5g("invite_initiation_user_id", str);
        AR4.apply();
        09i.A0A.A03(new Fl4(1));
        UserSession A01 = 08y.A00().A01((0Gm) null, user);
        C67623Mqv mqv = C67620Mqs.A04;
        FragmentActivity fragmentActivity = A04;
        new C47705EDo(A04, (Fragment) null, fragmentActivity, DbT.A0F(A04), C308206Td.A08(r15), A01, EVP.SINGLE, AnonymousClass7TE.A1C(), false).A02(new Void[0]);
        return null;
    }
}
