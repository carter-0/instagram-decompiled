package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.leadads.repository.LeadFormRepository;

public final class U8A extends AnonymousClass9YH {
    public final UserSession A00;
    public final WYW A01;

    public final 2YL A02(C319836rJ r5, Class cls, String str) {
        0qQ.A0B(r5, 2);
        UserSession userSession = this.A00;
        return new C16043UnW(r5, userSession, this.A01, new LeadFormRepository(userSession));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public U8A(Bundle bundle, AnonymousClass0g9 r2, UserSession userSession, WYW wyw) {
        super(bundle, r2);
        C51972G9s.A1B(userSession, wyw);
        this.A00 = userSession;
        this.A01 = wyw;
    }
}
