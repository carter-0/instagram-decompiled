package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.stickersearch.AvatarStickerInteractor;

/* renamed from: X.9jI  reason: invalid class name and case insensitive filesystem */
public final class C385639jI extends C228042kh {
    public final UserSession A00;

    public final /* bridge */ /* synthetic */ 2YL create() {
        UserSession userSession = this.A00;
        return new AnonymousClass9YD(userSession, new AvatarStickerInteractor((Context) null, userSession, 30));
    }

    public C385639jI(UserSession userSession) {
        this.A00 = userSession;
    }
}
