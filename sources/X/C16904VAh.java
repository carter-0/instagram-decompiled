package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.simplewebview.SimpleWebViewConfig;

/* renamed from: X.VAh  reason: case insensitive filesystem */
public abstract class C16904VAh {
    public static final void A00(FragmentActivity fragmentActivity, UserSession userSession, String str, String str2) {
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession2, 0);
        SimpleWebViewConfig simpleWebViewConfig = new SimpleWebViewConfig(str2, (String) null, str, (String) null, false, false, false, false, false, true, false, true, false, false, false, false);
        Bundle bundle = new Bundle();
        bundle.putParcelable(Pxd.A00(12), simpleWebViewConfig);
        DbU.A1D(bundle, userSession2);
        AnonymousClass4DH r1 = new AnonymousClass4DH();
        r1.setArguments(bundle);
        C309516Yo r0 = new C309516Yo(fragmentActivity, userSession2);
        r0.A0D = false;
        r0.A0B((Bundle) null, r1);
        r0.A04();
    }
}
