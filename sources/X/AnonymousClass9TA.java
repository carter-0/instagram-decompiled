package X;

import com.instagram.common.session.UserSession;
import java.util.concurrent.Callable;

/* renamed from: X.9TA  reason: invalid class name */
public final class AnonymousClass9TA implements Callable {
    public final /* synthetic */ UserSession A00;

    public AnonymousClass9TA(UserSession userSession) {
        this.A00 = userSession;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        UserSession userSession = this.A00;
        return userSession.A01(AnonymousClass9B2.class, new MMP(userSession, 31));
    }
}
