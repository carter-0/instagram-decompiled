package X;

import android.app.Application;
import com.instagram.common.session.UserSession;
import com.instagram.stickersearch.AvatarStickerPreRenderInteractor;

/* renamed from: X.JgY  reason: case insensitive filesystem */
public final class C60153JgY extends 2YL {
    public final UserSession A00;
    public final AvatarStickerPreRenderInteractor A01;
    public final 05G A02;
    public final AnonymousClass0Ud A03;

    public /* synthetic */ C60153JgY(UserSession userSession) {
        AvatarStickerPreRenderInteractor avatarStickerPreRenderInteractor = new AvatarStickerPreRenderInteractor((Application) null, userSession, 126);
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = avatarStickerPreRenderInteractor;
        02z A012 = 106.A01((Object) null);
        this.A02 = A012;
        this.A03 = A012;
    }
}
