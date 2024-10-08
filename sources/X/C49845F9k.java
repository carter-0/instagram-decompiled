package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.simplewebview.SimpleWebViewConfig;

/* renamed from: X.F9k  reason: case insensitive filesystem */
public abstract class C49845F9k {
    public static final 0bY A00 = DbW.A0G();

    public static final void A00(FragmentActivity fragmentActivity, UserSession userSession, String str) {
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession2, 0);
        SimpleWebViewConfig simpleWebViewConfig = new SimpleWebViewConfig((String) null, (String) null, false, false, false, false, false, true, false, false, true, false, false, false, (String) null, str);
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putParcelable("SimpleWebViewFragment.SIMPLE_WEB_VIEW_CONFIG", simpleWebViewConfig);
        DbU.A1D(A0a, userSession2);
        AnonymousClass4DH r0 = new AnonymousClass4DH();
        r0.setArguments(A0a);
        Dbb.A0o((Bundle) null, r0, fragmentActivity, userSession2);
    }
}
