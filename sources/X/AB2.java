package X;

import com.instagram.common.session.UserSession;
import com.instagram.creation.cameraconfiguration.CameraConfiguration;
import com.instagram.ui.swipenavigation.PositionConfig;

public abstract class AB2 {
    public static final void A00(UserSession userSession, C279284yO r20, AnonymousClass4DU r21, 2Zg r22, String str) {
        C279284yO r4 = r20;
        UserSession userSession2 = userSession;
        A01(userSession2, r21, AnonymousClass000.A00(3542));
        String str2 = str;
        AnonymousClass9PJ.A00(userSession2).A07(C348017xk.A00(str2), true);
        CameraConfiguration cameraConfiguration = null;
        if (r20 == null) {
            if (str2.equals("camera_tab_bar") || str2.equals("camera_action_bar_button_main_feed")) {
                JW1.A00(userSession2).A03(28D.A0a);
                r4 = C363138jC.A00;
            }
            r22.FLD(new PositionConfig((AnonymousClass57C) null, cameraConfiguration, (AnonymousClass3QO) null, str2, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, -1.0f, 0, true));
        } else if (r4 instanceof C363138jC) {
            JW1.A00(userSession2).A03(28D.A0a);
        }
        cameraConfiguration = C358098aM.A00(r4, new C358088aL[0]);
        r22.FLD(new PositionConfig((AnonymousClass57C) null, cameraConfiguration, (AnonymousClass3QO) null, str2, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, -1.0f, 0, true));
    }

    public static final void A01(UserSession userSession, AnonymousClass4DU r3, String str) {
        if (r3 != null) {
            0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r3, userSession), "ig_navigation_header_clicked");
            if (A0e.isSampled()) {
                A0e.AAJ("destination_section", str);
                A0e.AAJ("container_module", r3.getModuleName());
                A0e.Cgf();
            }
        }
    }
}
