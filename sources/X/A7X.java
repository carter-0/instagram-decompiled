package X;

import android.content.Context;
import android.graphics.Point;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.cameraspec.CameraSpec;

public final class A7X {
    public STU A00;
    public final Context A01;
    public final UserSession A02;
    public final CameraSpec A03;
    public final A4Z A04;
    public final Point A05;

    public A7X(Context context, UserSession userSession, A4Z a4z) {
        this.A01 = context;
        this.A02 = userSession;
        this.A04 = a4z;
        Point A012 = AEW.A01(context, userSession, 0.5625f, C63472Kxb.A00(context, userSession, Integer.MAX_VALUE, false, false));
        0qQ.A07(A012);
        this.A05 = A012;
        this.A03 = AnonymousClass72R.A01(userSession, A012.x, A012.y);
    }
}
