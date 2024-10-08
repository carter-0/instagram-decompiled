package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.9xv  reason: invalid class name and case insensitive filesystem */
public abstract class C394339xv {
    public static final void A00(UserSession userSession, C279284yO r8, Exception exc, Integer num) {
        C360908fL.A04("preview", C363818kO.A00(num), exc, false);
        02m.A0p.markerEnd(17642914, 3);
        02m.A0p.markerEnd(C344017rB.A02(17), 3);
        String str = "";
        if (0qQ.A0K(r8, C363138jC.A00)) {
            C59847JaN A00 = JW1.A00(userSession);
            String message = exc.getMessage();
            if (message == null) {
                message = str;
            }
            A00.A08 = A00.A0B.A07(String.valueOf(message), str, 288434727, A00.A08);
        }
        String message2 = exc.getMessage();
        if (message2 != null) {
            str = message2;
        }
        0KC.A0F("CameraPhotoCaptureController", str, exc);
    }
}
