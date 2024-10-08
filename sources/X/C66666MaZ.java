package X;

import com.instagram.common.session.UserSession;
import java.util.Random;
import org.webrtc.CameraCapturer;

/* renamed from: X.MaZ  reason: case insensitive filesystem */
public final class C66666MaZ {
    public static final C66666MaZ A01 = new C66666MaZ(new Random());
    public final Random A00;

    public static final boolean A00(UserSession userSession, C66666MaZ maZ, Class cls) {
        0Tu r2;
        long j;
        if (1bp.class.isAssignableFrom(cls) || C65351bw.class.isAssignableFrom(cls) || AnonymousClass1g2.class.isAssignableFrom(cls)) {
            r2 = 0Tu.A05;
            j = 37154795710119939L;
        } else if (!C65721gN.class.isAssignableFrom(cls) && !C65751gX.class.isAssignableFrom(cls) && !C65761gb.class.isAssignableFrom(cls)) {
            return false;
        } else {
            r2 = 0Tu.A05;
            j = 37154795710054402L;
        }
        double A002 = 182.A00(r2, userSession, j);
        if (A002 == 0.0d || maZ.A00.nextInt(CameraCapturer.OPEN_CAMERA_TIMEOUT) >= ((int) (A002 * 10000.0d))) {
            return false;
        }
        return true;
    }

    public C66666MaZ() {
    }

    public C66666MaZ(Random random) {
        this.A00 = random;
    }
}
