package X;

import android.app.Activity;
import android.content.DialogInterface;
import com.instagram.common.session.UserSession;

/* renamed from: X.KwS  reason: case insensitive filesystem */
public abstract class C63406KwS {
    public static final void A00(Activity activity, DialogInterface.OnClickListener onClickListener, AnonymousClass0iw r7, UserSession userSession, C255773uh r9) {
        1Xj r1;
        0qQ.A0B(userSession, 2);
        C358248ab A0X = DbS.A0X(activity);
        A0X.A09(2131974321);
        A0X.A08(2131974320);
        1Ln A0C = 1Ln.A0C(AnonymousClass0kN.A01(r7, userSession));
        if (r9 != null) {
            r1 = r9.A0b;
        } else {
            r1 = null;
        }
        if (DbT.A1Y(A0C) && r1 != null) {
            String id = r1.getId();
            if (id == null) {
                id = "";
            }
            A0C.A0m(id);
            A0C.A0Q("m_t", DbS.A0j(r1.BR7().A00));
            Double valueOf = Double.valueOf(0.0d);
            A0C.A0P(C273654mx.A00(96), valueOf);
            A0C.A0P(C273654mx.A00(413), valueOf);
            A0C.A0R("tray_session_id", "");
            A0C.A0R("viewer_session_id", AnonymousClass7TF.A0b());
            A0C.A0R("reel_id", r9.A0k);
            A0C.A0k("tap");
            A0C.A0R(C273654mx.A00(53), AnonymousClass000.A00(4060));
            A0C.Cgf();
        }
        A0X.A0L(onClickListener, 2131957531);
        DbX.A16(C64229LUt.A00, A0X);
    }
}
