package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.fanclub.gifting.FanClubGiftingApi;
import com.instagram.fanclub.gifting.FanClubGiftingViewModel;

/* renamed from: X.EEx  reason: case insensitive filesystem */
public final class C47739EEx extends C228042kh {
    public final Context A00;
    public final UserSession A01;

    public C47739EEx(UserSession userSession, Context context) {
        0qQ.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = context;
    }

    public final /* bridge */ /* synthetic */ 2YL create() {
        UserSession userSession = this.A01;
        FanClubGiftingApi fanClubGiftingApi = new FanClubGiftingApi(userSession, 1vm.A01(userSession));
        Context context = this.A00;
        AnonymousClass7TG.A1N(userSession, context);
        return new FanClubGiftingViewModel((C64828Lio) userSession.A01(C64828Lio.class, new C58187Inr(2, userSession, context)), fanClubGiftingApi);
    }
}
