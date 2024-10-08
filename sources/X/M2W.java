package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.LinkedHashMap;

public final class M2W implements Runnable {
    public final /* synthetic */ JWJ A00;

    public M2W(JWJ jwj) {
        this.A00 = jwj;
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [java.lang.Object, X.7rx] */
    public final void run() {
        JWJ jwj = this.A00;
        C344207rU r0 = jwj.A00;
        if (r0 == null) {
            Context context = jwj.A01;
            UserSession userSession = jwj.A04;
            r0 = C39823AAu.A01(context, new Object(), jwj.A03, userSession, AnonymousClass000.A00(3369), "MediaCaptureRenderService", (LinkedHashMap) null, true, 182.A06(0Tu.A05, userSession, 36315473202646256L));
            jwj.A00 = r0;
        }
        if (r0 != null) {
            r0.A03();
        }
    }
}
