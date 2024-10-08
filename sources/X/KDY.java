package X;

import android.app.Application;
import com.instagram.common.session.UserSession;
import com.instagram.stickersearch.AvatarStickerInteractor;
import com.instagram.stickersearch.AvatarStickerPreRenderInteractor;

public final class KDY extends C228042kh {
    public final Application A00;
    public final UserSession A01;
    public final Integer A02;

    public final /* bridge */ /* synthetic */ 2YL create() {
        Integer num = this.A02;
        UserSession userSession = this.A01;
        Application application = this.A00;
        return new C60286Jii(userSession, new AvatarStickerInteractor(application, userSession, 22), new AvatarStickerPreRenderInteractor(application, userSession, 94), num);
    }

    public KDY(Application application, UserSession userSession, Integer num) {
        this.A01 = userSession;
        this.A02 = num;
        this.A00 = application;
    }
}
