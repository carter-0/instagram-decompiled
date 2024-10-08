package X;

import com.facebook.cameracore.instagram.ardelivery.networkconsentmanager.IgNetworkConsentStorage;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.sandboxselector.SandboxRepository;
import com.instagram.model.reels.Reel;
import com.instagram.reels.store.ReelStore;
import com.instagram.user.model.User;

public final class DdG {
    public final UserSession A00;
    public final 17i A01;

    public DdG(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = 17h.A00(userSession);
    }

    public final Reel A00(C283155Gi r11) {
        0qQ.A0B(r11, 0);
        User A02 = this.A01.A02(r11.A04.A0f);
        if (A02 == null) {
            C283165Gj r2 = r11.A04;
            String str = r2.A0f;
            if (str == null || str.length() == 0) {
                0wb.A01.Ew1("ReelForNewsfeedStoryProvider", 002.A0O("Can not create user without user id (model.getProfileId()) for story type: ", r11.A00), IgNetworkConsentStorage.MAX_ENTRIES);
                return null;
            }
            A02 = new User(str, r2.A0h);
            A02.A0l(r11.A04.A0E);
        }
        UserSession userSession = this.A00;
        Long l = r11.A04.A0T;
        1OP r0 = 1OP.$redex_init_class;
        if (AnonymousClass3PQ.A06(userSession, A02) && l != null) {
            Reel A0K = ReelStore.A03(userSession).A0K(new 1Nr(A02), A02.getId(), false);
            if (l.longValue() + (AnonymousClass3PE.A00 / 1000) <= (System.currentTimeMillis() / 1000) - SandboxRepository.CACHE_TTL || 2O0.A00(userSession).A06(A0K, l)) {
                return null;
            }
            return A0K;
        }
        return null;
    }
}
