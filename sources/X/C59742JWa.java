package X;

import android.app.Application;
import com.instagram.clips.drafts.model.ClipsDraftPreviewItemRepository;
import com.instagram.common.session.UserSession;

/* renamed from: X.JWa  reason: case insensitive filesystem */
public final class C59742JWa extends C228042kh {
    public final /* synthetic */ Application A00;
    public final /* synthetic */ UserSession A01;

    public C59742JWa(Application application, UserSession userSession) {
        this.A00 = application;
        this.A01 = userSession;
    }

    public final /* bridge */ /* synthetic */ 2YL create() {
        Application application = this.A00;
        UserSession userSession = this.A01;
        return new JWZ(application, ClipsDraftPreviewItemRepository.A09.A00(application, userSession), AnonymousClass12T.A00, userSession);
    }
}
