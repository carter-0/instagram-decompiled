package X;

import com.instagram.common.session.UserSession;
import com.instagram.friendmap.data.FriendMapAudienceListRepository;

/* renamed from: X.NMx  reason: case insensitive filesystem */
public final class C68550NMx extends C228042kh {
    public final UserSession A00;
    public final AnonymousClass4A5 A01;

    public final /* bridge */ /* synthetic */ 2YL create() {
        UserSession userSession = this.A00;
        AnonymousClass4A5 r2 = this.A01;
        AnonymousClass7TG.A1N(userSession, r2);
        return new HBO(new FriendMapAudienceListRepository(userSession, new AnonymousClass4A4(userSession), r2));
    }

    public C68550NMx(UserSession userSession, AnonymousClass4A5 r2) {
        AnonymousClass7TG.A1O(userSession, r2);
        this.A00 = userSession;
        this.A01 = r2;
    }
}
