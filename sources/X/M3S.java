package X;

import android.widget.PopupWindow;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

public final class M3S implements Runnable {
    public final /* synthetic */ LON A00;

    public M3S(LON lon) {
        this.A00 = lon;
    }

    public final void run() {
        LON lon = this.A00;
        if (!lon.A04) {
            UserSession userSession = lon.A0A;
            if (182.A06(0Tu.A05, userSession, 36323401710709895L)) {
                AnonymousClass4DH r1 = lon.A09;
                if (r1.isAdded()) {
                    r1.requireActivity();
                    PopupWindow popupWindow = lon.A02;
                    if (popupWindow == null) {
                        0qQ.A0F("popupWindow");
                        throw AnonymousClass00P.createAndThrow();
                    }
                    popupWindow.showAsDropDown(lon.A08);
                    ArrayList A1C = AnonymousClass7TE.A1C();
                    if (!lon.A0C) {
                        A1C.add(C62648KkA.USER_TAG);
                    }
                    A1C.add(C62648KkA.COLLAB);
                    27r A01 = 27p.A01(userSession);
                    List A0a = 00k.A0a(A1C);
                    0Aj A0e = AnonymousClass7TE.A0e(A01.A01, "ig_camera_mention_prompt_impression");
                    C279294yP A0J = A01.A0J();
                    AnonymousClass283 r3 = A01.A04;
                    String str = r3.A0L;
                    C59725JVj jVj = r3.A0C;
                    if (A0e.isSampled() && A0J != null && str != null && jVj != null) {
                        JTO.A1S(A0e, str);
                        A0e.A8M(A0J, "camera_destination");
                        JTQ.A12(A0e, A01);
                        JTS.A15(r3.A09, A0e, 2);
                        JTP.A1J(A0e, r3);
                        AnonymousClass7TH.A0U(A0e);
                        C51965G9l.A1A(jVj, A0e);
                        DbY.A1C(A0e);
                        A0e.AAe("mention_prompt_options", A0a);
                        A0e.Cgf();
                    }
                }
            }
        }
    }
}
