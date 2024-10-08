package X;

import com.instagram.common.session.UserSession;
import org.webrtc.CameraCapturer;

/* renamed from: X.8Wo  reason: invalid class name and case insensitive filesystem */
public final class C357118Wo implements AnonymousClass8Wp {
    public final int Bee(UserSession userSession) {
        return 0;
    }

    public final int BnJ(UserSession userSession) {
        return CameraCapturer.OPEN_CAMERA_DELAY_MS;
    }

    public final boolean CXq() {
        return true;
    }

    public final boolean Esk(UserSession userSession) {
        return false;
    }

    public final boolean Ers(UserSession userSession) {
        if (System.currentTimeMillis() / 1000 < 1Au.A00(userSession).A01.getLong(AnonymousClass000.A00(539), 0)) {
            return false;
        }
        return true;
    }

    public final boolean Esl(UserSession userSession) {
        return false;
    }
}
