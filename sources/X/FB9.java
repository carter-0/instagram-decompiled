package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.Map;

public final class FB9 {
    public static final FB9 A00 = new Object();

    public final 1CV A00(UserSession userSession) {
        Context context = AnonymousClass1KO.A00;
        String A0R = 002.A0R(userSession.A06, "_multiple_account_info");
        Map map = 1CV.A09;
        return new 1CW(context, A0R).A00();
    }
}
