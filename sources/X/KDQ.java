package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.messageid.MessageIdentifier;

public final class KDQ extends C228042kh {
    public final UserSession A00;
    public final C70804OLz A01;
    public final AnonymousClass4DU A02;

    public final /* bridge */ /* synthetic */ 2YL create() {
        UserSession userSession = this.A00;
        C70804OLz oLz = this.A01;
        AnonymousClass4DU r8 = this.A02;
        C333747a3 r4 = new C333747a3(C333727a1.A00(userSession), userSession);
        String str = oLz.A0C;
        if (str != null) {
            return new C60314JjH(r4, userSession, new LSm(userSession, new MessageIdentifier(oLz.A09, oLz.A07), str), oLz, r8);
        }
        throw AnonymousClass7TE.A0y();
    }

    public KDQ(UserSession userSession, C70804OLz oLz, AnonymousClass4DU r3) {
        AnonymousClass7TG.A1O(userSession, oLz);
        this.A00 = userSession;
        this.A01 = oLz;
        this.A02 = r3;
    }
}
