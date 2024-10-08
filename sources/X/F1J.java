package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

public final class F1J {
    public final E68 A00(FragmentActivity fragmentActivity, GPK gpk, UserSession userSession, C51898G6o g6o, String str, String str2, String str3, boolean z, boolean z2) {
        AnonymousClass7TG.A0w(1, userSession, str, str2);
        AnonymousClass37D A0i = DbT.A0i(fragmentActivity);
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putString("media_id", str);
        A0a.putString("container_module", str2);
        A0a.putBoolean("disable_secondary_button", z);
        A0a.putSerializable("event_source", gpk);
        if (str3 != null) {
            A0a.putString("mimicry_entry_point", str3);
        }
        E68 e68 = new E68();
        e68.A00 = g6o;
        e68.setArguments(A0a);
        C331157Pu A00 = C48943Emh.A00(A0i);
        if (A00 == null || A00.A03.getViewLifecycleOwner().getLifecycle().A07().compareTo(07U.A01) < 0) {
            C331127Pr A0W = DbS.A0W(userSession);
            A0W.A1O = z2;
            DbS.A1S(A0W, true);
            A0W.A03 = 1.0f;
            A0W.A0T = e68;
            if (A0W.A00().A02(fragmentActivity, e68) == null) {
                DbT.A1Q(0wj.A01, "NUX Bottom Sheet failed to open", 817892647);
                g6o.DZJ();
                return e68;
            }
        } else {
            C331127Pr A0W2 = DbS.A0W(userSession);
            A0W2.A1O = z2;
            A0W2.A0T = e68;
            A00.A0G(e68, A0W2, false, false);
        }
        return e68;
    }
}
