package X;

import com.instagram.api.schemas.IGRevShareProductType;
import com.instagram.common.session.UserSession;

public final class EFF extends C228042kh {
    public final IGRevShareProductType A00;
    public final UserSession A01;
    public final String A02;

    public EFF(IGRevShareProductType iGRevShareProductType, UserSession userSession, String str) {
        0qQ.A0B(userSession, 1);
        this.A01 = userSession;
        this.A02 = str;
        this.A00 = iGRevShareProductType;
    }

    public final /* bridge */ /* synthetic */ 2YL create() {
        int i;
        0Tu r2;
        long j;
        UserSession userSession = this.A01;
        C49377Euf euf = new C49377Euf(userSession);
        boolean A1V = AnonymousClass7TF.A1V(this.A02);
        IGRevShareProductType iGRevShareProductType = this.A00;
        int ordinal = iGRevShareProductType.ordinal();
        if (ordinal != 1) {
            if (ordinal == 2) {
                r2 = 0Tu.A05;
                j = 36596608876743227L;
            }
            i = -1;
            return new C46773Dl0(iGRevShareProductType, userSession, euf, AnonymousClass7TE.A0M(i));
        }
        if (!A1V) {
            r2 = 0Tu.A05;
            j = 36597304661969682L;
        }
        i = -1;
        return new C46773Dl0(iGRevShareProductType, userSession, euf, AnonymousClass7TE.A0M(i));
        i = AnonymousClass7TF.A0Y(r2, userSession, j);
        return new C46773Dl0(iGRevShareProductType, userSession, euf, AnonymousClass7TE.A0M(i));
    }
}
