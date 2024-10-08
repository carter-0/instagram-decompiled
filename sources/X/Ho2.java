package X;

import com.instagram.common.session.UserSession;
import java.util.WeakHashMap;
import org.webrtc.CameraCapturer;

public final class Ho2 {
    public final UserSession A00;
    public final AnonymousClass4DU A01;
    public final AnonymousClass49W A02;
    public final AnonymousClass49S A03;
    public final WeakHashMap A04 = new WeakHashMap();

    public Ho2(UserSession userSession, AnonymousClass4DU r11) {
        this.A00 = userSession;
        this.A01 = r11;
        AnonymousClass49S r0 = new AnonymousClass49S((AnonymousClass49T) null, (Integer) null, AnonymousClass05K.A01, (Integer) null, CameraCapturer.OPEN_CAMERA_DELAY_MS, false, 182.A06(0Tu.A05, this.A00, 36324630071423167L), false);
        this.A03 = r0;
        this.A02 = AnonymousClass49V.A00(userSession, r0);
    }
}
