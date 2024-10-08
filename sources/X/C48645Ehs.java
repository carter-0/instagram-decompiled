package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.Ehs  reason: case insensitive filesystem */
public abstract class C48645Ehs {
    public static final Object A00(C307896Rx r11, AnonymousClass6Tm r12) {
        Object A03 = r12.A03(0);
        0qQ.A0C(A03, C66579MXk.A00(5));
        Object A02 = r12.A02();
        String A0p = DbX.A0p(r12, DbS.A0p(A02));
        C277014uI A0S = DbX.A0S(r12, 3);
        UserSession A0Y = DbT.A0Y(r11);
        FragmentActivity A04 = C308206Td.A04(r11);
        String A0z = DbT.A0z(", ", (Iterable) A03, (0sP) null);
        1NY A0b = AnonymousClass7TG.A0b(A0Y);
        A0b.A0A("media/infos/");
        A0b.A9m("media_ids", A0z);
        new C324356z9(A04, AnonymousClass07i.A00(A04), A0Y).A03(DbT.A0R((15p) null, A0b, 1XO.class, 1XW.class, false), new ELI(A04, r11, A0S, A0Y, (String) A02, A0p));
        return null;
    }
}
