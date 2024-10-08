package X;

import com.instagram.api.schemas.UserMonetizationProductType;
import com.instagram.common.session.UserSession;

public final class EFG extends C228042kh {
    public final UserMonetizationProductType A00;
    public final UserSession A01;
    public final String A02;

    public EFG(UserMonetizationProductType userMonetizationProductType, UserSession userSession, String str) {
        0qQ.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = userMonetizationProductType;
        this.A02 = str;
    }

    public final /* bridge */ /* synthetic */ 2YL create() {
        return new C46757Dkk(this.A00, this.A01, this.A02);
    }
}
