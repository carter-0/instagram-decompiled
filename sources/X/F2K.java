package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

public final class F2K {
    public final G7O A00;
    public final UserSession A01;
    public final String A02;

    public final void A00(Context context, AnonymousClass07i r5, String str) {
        if (str != null) {
            1NY A0O = DbU.A0O(this.A01);
            A0O.A0R(C3727892k.class, C3727992l.class);
            A0O.A9m("from_module", this.A02);
            A0O.A0A("users/{user_name}/usernameinfo/");
            1OC A0T = DbT.A0T(A0O, "user_name", str);
            C47696EDf.A01(A0T, this, 41);
            1ES.A00(context, r5, A0T);
            return;
        }
        throw AnonymousClass7TE.A0w("userId and username cannot both be null");
    }

    public F2K(UserSession userSession, G7O g7o, String str) {
        this.A01 = userSession;
        this.A00 = g7o;
        this.A02 = str;
    }
}
