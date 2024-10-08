package X;

import android.view.animation.AccelerateInterpolator;
import org.webrtc.CameraCapturer;

public final class J5L extends 0Yg implements 0sP {
    public static final J5L A00 = new J5L();

    public J5L() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass4Ey A002 = 2Vi.A00(C243533Zd.GLOBAL, "suggestions_search_visibility");
        C246053du r3 = C246033ds.A00;
        C51976G9y.A0S(new AccelerateInterpolator(), A002, r3, C51970G9q.A03(A002, r3), CameraCapturer.OPEN_CAMERA_DELAY_MS);
        return A002;
    }
}
