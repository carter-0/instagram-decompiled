package X;

import android.os.Parcelable;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;

/* renamed from: X.6j8  reason: invalid class name and case insensitive filesystem */
public final class C314966j8 {
    public final C310016aI A00;

    public final void A00(C250973mM r9, String str, double d) {
        C310016aI r6 = this.A00;
        UserSession userSession = r6.A06;
        C255773uh A08 = r9.A08(userSession);
        FollowStatus followStatus = null;
        if (A08.CWu()) {
            1Xj r3 = A08.A0b;
            r3.getClass();
            C310026aJ A01 = C310016aI.A01(r9.A0H, r6);
            0wc A012 = AnonymousClass0kN.A01(A01, userSession);
            1Ln r2 = new 1Ln(A012.A00(A012.A00, "reel_viewer_gestures_nux"), 370);
            if (r2.A00.isSampled()) {
                r2.A0R("reel_viewer_gestures_nux_action", str);
                r2.A0R("tray_session_id", r6.A0H);
                r2.A0R("viewer_session_id", r6.A0E.getSessionId());
                r2.A0R("source_of_action", A01.getModuleName());
                Parcelable.Creator creator = User.CREATOR;
                User A2A = r3.A2A(userSession);
                if (A2A != null) {
                    followStatus = A2A.B6o();
                }
                r2.A0R("follow_status", 1aC.A06(followStatus));
                String id = r3.getId();
                if (id != null) {
                    r2.A0m(id);
                    r2.A0Q("m_t", Long.valueOf((long) r3.BR7().A00));
                    r2.A0Q("m_ts", Long.valueOf(r3.A1A()));
                    r2.A0P("reel_viewer_gestures_nux_impression_duration", Double.valueOf(d));
                    r2.Cgf();
                    return;
                }
                throw new IllegalStateException("Required value was null.");
            }
        }
    }

    public C314966j8(C310016aI r1) {
        this.A00 = r1;
    }
}
