package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.stickersearch.AvatarStickerInteractor;

public final class KDF extends C228042kh {
    public final 0wc A00;
    public final UserSession A01;
    public final String A02;

    public KDF(0wc r2, UserSession userSession, String str) {
        0qQ.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = r2;
        this.A02 = str;
    }

    public final /* bridge */ /* synthetic */ 2YL create() {
        return new C60147JgS(this.A00, new AvatarStickerInteractor((Context) null, this.A01, 30), this.A02);
    }
}
