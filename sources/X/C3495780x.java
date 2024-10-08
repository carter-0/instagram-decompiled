package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.cameraspec.CameraSpec;
import java.util.List;

/* renamed from: X.80x  reason: invalid class name and case insensitive filesystem */
public final class C3495780x extends 2YL {
    public 28D A00;
    public C340297l2 A01;
    public CameraSpec A02;
    public final AnonymousClass2Fj A03;
    public final AnonymousClass2Fj A04 = new 2Fk(true);
    public final AnonymousClass2Fj A05 = new 2Fk(C3495880y.DURATION_15_SEC_IN_MS);
    public final UserSession A06;
    public final 0xa A07;
    public final List A08;
    public final 05G A09;
    public final 05G A0A;
    public final 05G A0B;
    public final Context A0C;

    public C3495780x(Context context, UserSession userSession) {
        this.A0C = context;
        this.A06 = userSession;
        Float valueOf = Float.valueOf(1.0f);
        this.A0B = new 02z(new AnonymousClass34S(0, valueOf));
        this.A03 = new 2Fk(new AnonymousClass34S(valueOf, false));
        this.A0A = new 02z(false);
        this.A09 = new 02z(false);
        this.A08 = C3495980z.A01(userSession);
        this.A07 = 1Al.A01(userSession).A03(1An.A0d);
        this.A00 = 28D.A5J;
    }

    public final CameraSpec A00() {
        CameraSpec cameraSpec = this.A02;
        if (cameraSpec == null) {
            cameraSpec = AnonymousClass72R.A00(this.A0C, this.A06);
        }
        this.A02 = cameraSpec;
        return cameraSpec;
    }
}
