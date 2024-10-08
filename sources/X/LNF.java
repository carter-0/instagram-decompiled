package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;

public final class LNF {
    public static final K6K A00(UserSession userSession, C254923tH r5, DirectThreadKey directThreadKey, float f, float f2, float f3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        String str;
        K6K k6k = new K6K();
        Bundle A0A = DbV.A0A(userSession);
        A0A.putBoolean("BUNDLE_IS_EMBEDDED", z);
        if (r5 == null || (str = r5.A00) == null) {
            str = "";
        }
        A0A.putString("BUNDLE_THREAD_TRANSPORT_TYPE", str);
        A0A.putBoolean("BUNDLE_SHOW_SELECT_BUTTON", z2);
        A0A.putBoolean("BUNDLE_SHOW_MEDIA_THUMBNAILS", z3);
        A0A.putBoolean("BUNDLE_SHOW_NEXT_BUTTON", z4);
        A0A.putBoolean("BUNDLE_SHOW_VIEW_MODE_SELECTOR", z5);
        A0A.putFloat("BUNDLE_ASPECT_RATIO", f);
        A0A.putFloat("BUNDLE_INITIAL_HEIGHT_RATIO", f2);
        A0A.putFloat("BUNDLE_MAXIMUM_HEIGHT_RATIO", f3);
        A0A.putBoolean("BUNDLE_SHOW_DONE_BUTTON_IN_GALLERY", false);
        A0A.putBoolean("BUNDLE_SHOW_MAGIC_MEDIA_REMIX", z6);
        A0A.putParcelable("BUNDLE_DIRECT_THREAD_KEY", directThreadKey);
        A0A.putBoolean("BUNDLE_SHOW_SEND_BUTTON", z7);
        k6k.setArguments(A0A);
        return k6k;
    }

    public final K6K A01(UserSession userSession, C254923tH r15, DirectThreadKey directThreadKey) {
        0qQ.A0B(userSession, 0);
        return A00(userSession, r15, directThreadKey, 1.0f, 0.7f, 1.0f, false, false, false, false, false, false, true);
    }
}
