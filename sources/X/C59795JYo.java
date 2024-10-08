package X;

import com.instagram.common.session.UserSession;
import java.util.concurrent.Callable;

/* renamed from: X.JYo  reason: case insensitive filesystem */
public final class C59795JYo implements Callable {
    public final /* synthetic */ UserSession A00;

    public C59795JYo(UserSession userSession) {
        this.A00 = userSession;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        UserSession userSession = this.A00;
        return userSession.A01(C290645fe.class, new MMP(userSession, 32));
    }
}
