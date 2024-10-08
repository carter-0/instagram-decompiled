package X;

import android.app.Application;
import com.instagram.barcelona.weblink.WebLinkUseCase;
import com.instagram.common.session.UserSession;

/* renamed from: X.Gg8  reason: case insensitive filesystem */
public final class C52955Gg8 extends C361478gI {
    public final WebLinkUseCase A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C52955Gg8(Application application, UserSession userSession) {
        super(application);
        AnonymousClass7TG.A1O(application, userSession);
        this.A00 = new WebLinkUseCase(userSession);
    }
}
