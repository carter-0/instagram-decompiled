package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;

/* renamed from: X.Eol  reason: case insensitive filesystem */
public abstract class C49067Eol {
    public static final C47532E6t A00(UserSession userSession, C319866rM r4, String str, ArrayList arrayList, boolean z) {
        AnonymousClass7TG.A1N(userSession, str);
        Bundle A0a = AnonymousClass7TE.A0a();
        C47532E6t e6t = new C47532E6t();
        DbU.A1D(A0a, userSession);
        A0a.putString("ContactOptionsFragment.USER_ID", str);
        A0a.putIntegerArrayList("ContactOptionsFragment.ACTION_ID_LIST", arrayList);
        A0a.putBoolean("ContactOptionsFragment.REQUEST_CONTACT_ENABLED", z);
        e6t.setArguments(A0a);
        e6t.A00 = r4;
        return e6t;
    }
}
