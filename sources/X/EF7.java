package X;

import android.app.Application;
import com.instagram.common.session.UserSession;
import com.instagram.settings.language.ContentLanguageSettingsApi;
import com.instagram.settings.language.ContentLanguageSettingsRepository;

public final class EF7 extends C228042kh {
    public final Application A00;
    public final UserSession A01;

    public EF7(Application application, UserSession userSession) {
        0qQ.A0B(userSession, 2);
        this.A00 = application;
        this.A01 = userSession;
    }

    public final /* bridge */ /* synthetic */ 2YL create() {
        Application application = this.A00;
        UserSession userSession = this.A01;
        return new C60092JfY(application, new ContentLanguageSettingsRepository(application, userSession, new ContentLanguageSettingsApi(userSession)), AnonymousClass1Q2.A03());
    }
}
