package X;

import com.instagram.common.session.UserSession;
import com.instagram.profile.productsonprofile.producttab.ui.ProductTabRepository;

public final class KDX extends C228042kh {
    public final UserSession A00;
    public final String A01;
    public final String A02;

    public KDX(UserSession userSession, String str, String str2) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = str;
        this.A02 = str2;
    }

    public final /* bridge */ /* synthetic */ 2YL create() {
        UserSession userSession = this.A00;
        return new C60202JhL(userSession, new ProductTabRepository(userSession), this.A01, this.A02);
    }
}
