package X;

import com.facebookpay.offsite.models.message.PayButtonCTAType$Companion;
import com.instagram.common.session.UserSession;

/* renamed from: X.I2a  reason: case insensitive filesystem */
public abstract class C56570I2a {
    public static final HO4 A00(String str) {
        for (HO4 ho4 : HO4.values()) {
            if (0qQ.A0K(ho4.A00, str)) {
                return ho4;
            }
        }
        return null;
    }

    public static final HO5 A01(String str) {
        for (HO5 ho5 : HO5.values()) {
            if (0qQ.A0K(ho5.A00, str)) {
                return ho5;
            }
        }
        return null;
    }

    public static final void A02(UserSession userSession, boolean z) {
        String str;
        AnonymousClass29V r5 = 27p.A01(userSession).A0C;
        C279294yP r4 = C279294yP.STORY;
        0Aj A0e = AnonymousClass7TE.A0e(r5.A01, "ig_camera_nux");
        if (A0e.isSampled()) {
            if (z) {
                str = PayButtonCTAType$Companion.CONTINUE;
            } else {
                str = "DISMISS";
            }
            A0e.AAJ("entity", "GLASSES_CAMERA_BLUETOOTH_PROMPT");
            A0e.AAJ("nux_step", str);
            AnonymousClass283 r2 = r5.A04;
            String str2 = r2.A0L;
            if (str2 == null) {
                str2 = "";
            }
            A0e.AAJ("camera_session_id", str2);
            DbS.A1F(r2.A09, A0e);
            A0e.A8M(r4, "camera_destination");
            A0e.Cgf();
        }
    }
}
