package X;

import com.instagram.common.session.UserSession;
import com.instagram.reels.prompt.model.PromptStickerModel;
import com.instagram.reels.prompt.mvvm.data.PromptStickerViewerRepository;

/* renamed from: X.KCx  reason: case insensitive filesystem */
public final class C61570KCx extends C228042kh {
    public final UserSession A00;
    public final PromptStickerModel A01;

    public final /* bridge */ /* synthetic */ 2YL create() {
        UserSession userSession = this.A00;
        return new C60207JhQ(userSession, this.A01, new PromptStickerViewerRepository(new L2I(userSession)));
    }

    public C61570KCx(UserSession userSession, PromptStickerModel promptStickerModel) {
        AnonymousClass7TG.A1O(userSession, promptStickerModel);
        this.A00 = userSession;
        this.A01 = promptStickerModel;
    }
}
