package X;

import android.app.Application;
import com.instagram.common.session.UserSession;
import com.instagram.creation.genai.contextualbackground.domain.ContextualBackgroundViewModel;
import com.instagram.genai.imageservice.service.GenAIImageService;
import com.instagram.genai.imageservice.service.GenAIImagineService;

/* renamed from: X.KCe  reason: case insensitive filesystem */
public final class C61551KCe extends C228042kh {
    public final Application A00;
    public final UserSession A01;

    public C61551KCe(Application application, UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = application;
    }

    public final /* bridge */ /* synthetic */ 2YL create() {
        UserSession userSession = this.A01;
        Application application = this.A00;
        return new ContextualBackgroundViewModel(userSession, new KWV(new GenAIImageService(application, new C61078JwG(new C61082JwK(30, (Object) 1000000L, AnonymousClass7TG.A1Z(userSession, application))), userSession, 8), new GenAIImagineService(userSession)));
    }
}
