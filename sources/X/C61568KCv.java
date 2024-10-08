package X;

import com.instagram.api.schemas.UserMonetizationProductType;
import com.instagram.common.session.UserSession;

/* renamed from: X.KCv  reason: case insensitive filesystem */
public final class C61568KCv extends C228042kh {
    public final UserMonetizationProductType A00;
    public final UserSession A01;

    public C61568KCv(UserMonetizationProductType userMonetizationProductType, UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = userMonetizationProductType;
    }

    public final /* bridge */ /* synthetic */ 2YL create() {
        UserSession userSession = this.A01;
        return new C46786DlE(this.A00, userSession, AnonymousClass2o3.A00(userSession));
    }
}
