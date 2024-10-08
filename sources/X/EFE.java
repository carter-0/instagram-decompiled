package X;

import com.instagram.common.session.UserSession;
import java.util.List;

public final class EFE extends C228042kh {
    public final UserSession A00;
    public final C49376Eue A01;
    public final List A02;

    public /* synthetic */ EFE(UserSession userSession, List list) {
        C49376Eue eue = new C49376Eue(userSession);
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
        this.A02 = list;
        this.A01 = eue;
    }

    public final /* bridge */ /* synthetic */ 2YL create() {
        return new C46781Dl9(this.A00, this.A01, this.A02);
    }
}
