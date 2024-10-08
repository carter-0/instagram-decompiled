package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.leadads.viewmodel.LeadAdsPostClickEntryViewModel;

public final class U87 extends AnonymousClass9YH {
    public final UserSession A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public U87(Bundle bundle, AnonymousClass0g9 r3, UserSession userSession) {
        super(bundle, r3);
        0qQ.A0B(userSession, 3);
        this.A00 = userSession;
    }

    public final 2YL A02(C319836rJ r3, Class cls, String str) {
        0qQ.A0B(r3, 2);
        return new LeadAdsPostClickEntryViewModel(r3, this.A00);
    }
}
