package X;

import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.Map;

/* renamed from: X.EeV  reason: case insensitive filesystem */
public abstract class C48436EeV {
    public static Object A00(C307896Rx r14, AnonymousClass6Tm r15) {
        UserSession A0Z = DbT.A0Z(r14);
        Fragment A0H = DbU.A0H(r14);
        C50194FTa fTa = new C50194FTa(A0H, r14, r15, A0Z);
        User A0Q = AnonymousClass7TF.A0Q(A0Z);
        0hq A05 = C308206Td.A05(r14);
        AnonymousClass7TG.A0w(1, A0Z, A0H, A05);
        EDH edh = new EDH(A0H, A05, fTa, A0Z, A0Q, (0sP) null);
        AnonymousClass36O.A0C = AnonymousClass000.A00(3879);
        AnonymousClass36X r9 = AnonymousClass36O.A0B;
        00y.A0n(10, A0Z.A06);
        UserSession userSession = A0Z;
        C46653DiY.A00(r9, userSession, AnonymousClass000.A00(748), "photo_editing", AnonymousClass36O.A0C, (String) null, (Map) null);
        1OC A00 = C49736F4b.A00(A0Z);
        A00.A00 = edh;
        Dbb.A15(A0H, A00);
        return null;
    }
}
