package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.HashMap;

public final class KW5 extends C319156q8 {
    public final void A02() {
        C323256xC r5 = this.A01;
        UserSession userSession = r5.A09;
        C63963LFo lFo = new C63963LFo(r5.A0A, userSession);
        C62671KkX kkX = C62671KkX.SETTINGS;
        lFo.A01(kkX);
        HashMap A1E = AnonymousClass7TE.A1E();
        A1E.put(C62528KhK.UPPER_RIGHT_CREATE_AUDIENCE_LIST_BUTTON, (Object) null);
        A1E.put(C62528KhK.LOGGING_ENTRY_POINT, kkX);
        A1E.put(C62528KhK.DELETE_OPTION_ENABLED, (Object) null);
        FragmentActivity fragmentActivity = r5.A06;
        K8H A00 = C63110Krd.A00((MTR) null, userSession, A1E);
        C331127Pr A0W = DbS.A0W(userSession);
        A0W.A0U = A00;
        A0W.A0T = A00;
        A0W.A0X = null;
        DbU.A0y(fragmentActivity, A00, A0W);
    }
}
