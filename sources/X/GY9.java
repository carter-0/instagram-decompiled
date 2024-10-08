package X;

import com.instagram.common.session.UserSession;
import java.util.Arrays;

public final class GY9 {
    public final UserSession A00;
    public final JO9 A01;
    public final AnonymousClass0eM A02 = AnonymousClass1YB.A00(new C58684Ivt(this, 10));

    public GY9(UserSession userSession, JO9 jo9) {
        0qQ.A0B(jo9, 2);
        this.A00 = userSession;
        this.A01 = jo9;
    }

    public final int A01(1Xj r4) {
        0qQ.A0B(r4, 0);
        C2609247o Amn = r4.A0C.Amn();
        if (Amn != null) {
            return Arrays.hashCode(new Object[]{r4.getId(), Amn.getTitle(), Boolean.valueOf(A00(r4))});
        }
        throw AnonymousClass7TE.A0y();
    }

    public final AnonymousClass9JA A02(1Xj r7) {
        0qQ.A0B(r7, 0);
        C2609247o Amn = r7.A0C.Amn();
        if (Amn == null) {
            return null;
        }
        String C6E = Amn.C6E();
        String title = Amn.getTitle();
        boolean A002 = A00(r7);
        C2609247o Amn2 = r7.A0C.Amn();
        if (Amn2 != null) {
            return new AnonymousClass9JA(new C61078JwG((Object) J6S.A00(Amn2, this, 18), 17), C6E, title, A002);
        }
        throw AnonymousClass7TE.A0y();
    }

    private final boolean A00(1Xj r4) {
        C2609247o Amn = r4.A0C.Amn();
        if (Amn != null) {
            AnonymousClass3U9 C60 = ((2Dm) this.A02.getValue()).C60(Amn.C6E());
            if (C60 != null) {
                return C60.COP();
            }
            return AnonymousClass7TG.A1X(Amn.CX9());
        }
        throw AnonymousClass7TE.A0y();
    }
}
