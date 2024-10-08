package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.Er7  reason: case insensitive filesystem */
public abstract class C49202Er7 {
    public static final void A00(Uri uri, Fragment fragment, UserSession userSession) {
        FragmentActivity requireActivity = fragment.requireActivity();
        Bundle A0a = AnonymousClass7TE.A0a();
        if (uri != null) {
            A0a.putString(AnonymousClass000.A00(961), uri.getQueryParameter("audience_type"));
            A0a.putBoolean(AnonymousClass000.A00(2324), uri.getBooleanQueryParameter("show_audience_type_selector", false));
        }
        Dba.A0l(requireActivity, A0a, userSession, "universal_creation_live_camera");
    }
}
