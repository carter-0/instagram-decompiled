package X;

import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;

/* renamed from: X.HXy  reason: case insensitive filesystem */
public abstract class C54916HXy {
    public static final void A00(AnonymousClass0iw r1, UserSession userSession, String str, String str2, String str3, boolean z) {
        String str4;
        0wc A0O = DbX.A0O(r1, userSession);
        if (z) {
            str4 = "thumbs_up";
        } else {
            str4 = "thumbs_down";
        }
        1Ln A0U = C51965G9l.A0U(AnonymousClass7TE.A0e(A0O, C66579MXk.A00(854)), 160);
        if (DbT.A1Y(A0U)) {
            A0U.A0R("feedback_surface", str3);
            A0U.A0R(C66579MXk.A00(130), str4);
            A0U.A0R(TraceFieldType.RequestID, str);
            A0U.A0R("response_id", str2);
            A0U.Cgf();
        }
    }
}
