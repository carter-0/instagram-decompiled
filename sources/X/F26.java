package X;

import com.instagram.common.session.UserSession;
import java.util.concurrent.ConcurrentHashMap;

public final class F26 {
    public final UserSession A00;
    public final A6Q A01;

    public final float A00(String str) {
        ConcurrentHashMap concurrentHashMap = this.A01.A02;
        if (!AnonymousClass7TF.A1P(concurrentHashMap.isEmpty() ? 1 : 0)) {
            return ((Number) concurrentHashMap.getOrDefault(str, Float.valueOf(0.0f))).floatValue();
        }
        return 0.0f;
    }

    public F26(UserSession userSession) {
        this.A00 = userSession;
        this.A01 = (A6Q) userSession.A01(A6Q.class, new C41562AwU(userSession, 45));
    }
}
