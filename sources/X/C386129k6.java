package X;

import android.content.res.Resources;
import android.view.View;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import java.io.File;
import java.util.Set;

/* renamed from: X.9k6  reason: invalid class name and case insensitive filesystem */
public final class C386129k6 extends AnonymousClass3NK {
    public final /* synthetic */ C355048Oj A00;

    public C386129k6(C355048Oj r1) {
        this.A00 = r1;
    }

    public final boolean Dqe(View view) {
        Medium medium;
        AnonymousClass8BA r4 = this.A00.A0q.A00;
        UserSession userSession = r4.A0v;
        27r A01 = 27p.A01(userSession);
        C360948fP A0I = A01.A0I();
        AnonymousClass29T r6 = A01.A0B;
        0qQ.A0B(A0I, 0);
        0Aj A0e = AnonymousClass7TE.A0e(r6.A01, "ig_camera_navigation");
        if (A0e.isSampled()) {
            A0e.AAJ("step", "POST_CAPTURE_EDIT_BUTTON");
            A0e.AAJ("legacy_falco_event_name", "IG_CAMERA_TAP_POST_CAPTURED_EDIT_BUTTON");
            AnonymousClass283 r2 = r6.A04;
            String str = r2.A0L;
            if (str == null) {
                str = "";
            }
            A0e.AAJ("camera_session_id", str);
            A0e.A8M(A0I, "capture_type");
            AnonymousClass7TE.A1V(A0e, r2);
            AnonymousClass7TE.A1W(A0e, "event_type", 2);
            AnonymousClass7TH.A0U(A0e);
            A0e.A8M(C59725JVj.POST_CAPTURE, "surface");
            AnonymousClass7TH.A0W(A0e, r6);
            AnonymousClass7TH.A0V(A0e);
        }
        C352218Cl A03 = r4.A14.A01.A03();
        if (A03 == null || (medium = A03.A0F) == null || !Boolean.TRUE.equals(medium.A0I)) {
            r4.A1M.E3H(new Object());
            return true;
        }
        ((Set) r4.A0w.A09.A00).add(C358088aL.A0B);
        I09 i09 = (I09) r4.A1Z.get();
        String str2 = medium.A0X;
        Resources resources = AnonymousClass7TE.A0T(r4).getResources();
        0sL r1 = r4.A1z;
        0qQ.A0B(str2, 0);
        AnonymousClass7TG.A1U(resources, userSession, r1);
        i09.A06.invoke();
        File A0t = AnonymousClass7TE.A0t(str2);
        0nY.A00().ATE(new RAS(userSession, AnonymousClass457.A03(), A0t, new JG3(10, r1, i09, resources)));
        return true;
    }
}
