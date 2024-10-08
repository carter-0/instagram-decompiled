package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

/* renamed from: X.2kI  reason: invalid class name */
public abstract class AnonymousClass2kI {
    public static final void A00(Fragment fragment, UserSession userSession) {
        Bundle bundle = fragment.mArguments;
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putString("IgSessionManager.SESSION_TOKEN_KEY", userSession.A05);
        fragment.setArguments(bundle);
    }
}
