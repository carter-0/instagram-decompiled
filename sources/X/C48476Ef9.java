package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.Ef9  reason: case insensitive filesystem */
public abstract class C48476Ef9 {
    public static Object A00(C307896Rx r10, AnonymousClass6Tm r11) {
        List list = (List) r11.A03(0);
        UserSession A0Z = DbT.A0Z(r10);
        FragmentActivity A04 = C308206Td.A04(r10);
        C324356z9 r6 = new C324356z9(A04, AnonymousClass07i.A00(A04), A0Z);
        AnonymousClass7TF.A1H(list, A0Z);
        String A0z = DbT.A0z(", ", list, (0sP) null);
        1NY A0b = AnonymousClass7TG.A0b(A0Z);
        A0b.A0A("media/infos/");
        A0b.A9m("media_ids", A0z);
        r6.A03(DbT.A0R((15p) null, A0b, 1XO.class, 1XW.class, false), new C54379HAu(3, new C55769Hn4(A04, r10, A0Z, list), AnonymousClass3BQ.BLOKS));
        return null;
    }
}
