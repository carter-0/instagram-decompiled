package X;

import com.instagram.common.session.UserSession;
import com.instagram.reels.internal.data.InternalStickerViewerRepository;

/* renamed from: X.KBy  reason: case insensitive filesystem */
public final class C61545KBy extends C228042kh {
    public final UserSession A00;

    public C61545KBy(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
    }

    public final /* bridge */ /* synthetic */ 2YL create() {
        UserSession userSession = this.A00;
        return new C60154JgZ(userSession, new InternalStickerViewerRepository(new L2E(userSession)));
    }
}
