package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.6UJ  reason: invalid class name */
public abstract class AnonymousClass6UJ {
    public static final void A01(UserSession userSession, AnonymousClass4D6 r5, C45419Cvz cvz) {
        0qQ.A0B(userSession, 0);
        C225972fF A00 = C225972fF.A00(userSession);
        String str = cvz.A05;
        str.getClass();
        A00.A0D(str, cvz);
        1OC A002 = C45002Cof.A00(userSession, cvz);
        A002.A00 = new C15581Uf9(cvz, A00);
        r5.schedule(A002);
        0xY AR4 = 1Au.A00(userSession).A01.AR4();
        AR4.E5T("has_ever_voted_on_story_slider", true);
        AR4.apply();
    }

    public static final C19472WaK A00(1Xj r1) {
        List A3o;
        C255783ui r0;
        if (r1 == null || (A3o = r1.A3o(AnonymousClass3WT.SLIDER)) == null || (r0 = (C255783ui) 00k.A0J(A3o)) == null) {
            return null;
        }
        return r0.A0G();
    }
}
