package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.Dwf  reason: case insensitive filesystem */
public final class C47369Dwf extends C272124k8 {
    public final /* bridge */ /* synthetic */ void A06(UserSession userSession, Object obj) {
        int A03 = AnonymousClass0fD.A03(-2032958749);
        DwO dwO = (DwO) obj;
        int A032 = AnonymousClass0fD.A03(-1879922614);
        boolean A1U = AnonymousClass7TF.A1U(0, userSession, dwO);
        for (C47157DrY drY : dwO.A01) {
            List<AnonymousClass9JM> list = drY.A06;
            if (!list.isEmpty() && "mute_all".equals(((AnonymousClass9JM) list.get(0)).A01)) {
                for (AnonymousClass9JM r0 : list) {
                    String str = r0.A03;
                    if (Boolean.valueOf(A1U).equals(r0.A00) && str != null) {
                        1Au.A00(userSession).A0j(Long.parseLong(str));
                    }
                }
            }
        }
        AnonymousClass0fD.A0A(4659036, A032);
        AnonymousClass0fD.A0A(1675874978, A03);
    }

    public C47369Dwf(UserSession userSession) {
        super(userSession);
    }
}
