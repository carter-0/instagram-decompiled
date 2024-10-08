package X;

import com.instagram.api.schemas.IGRevShareProductType;
import com.instagram.common.session.UserSession;

public final class EFH extends C228042kh {
    public final IGRevShareProductType A00;
    public final UserSession A01;
    public final String A02;

    public EFH(IGRevShareProductType iGRevShareProductType, UserSession userSession, String str) {
        0qQ.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = iGRevShareProductType;
        this.A02 = str;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.EoV, java.lang.Object] */
    public final /* bridge */ /* synthetic */ 2YL create() {
        UserSession userSession = this.A01;
        return new C46763Dkq(this.A00, userSession, new C49499Ewe(userSession, new Object()), this.A02);
    }
}
