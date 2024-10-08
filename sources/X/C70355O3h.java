package X;

import com.google.gson.Gson;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.O3h  reason: case insensitive filesystem */
public abstract class C70355O3h {
    public static final void A00(UserSession userSession, String str) {
        ArrayList A1C;
        List A0H = 1Au.A00(userSession).A0H();
        if (A0H != null) {
            A1C = AnonymousClass7TE.A1D(A0H);
        } else {
            A1C = AnonymousClass7TE.A1C();
        }
        A1C.add(str);
        0xY A0N = AnonymousClass7TF.A0N(userSession);
        A0N.E5g("share_to_whatsapp_reel_id_cache", new Gson().A0B(A1C));
        A0N.apply();
    }
}
