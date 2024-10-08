package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import java.util.List;

/* renamed from: X.Kte  reason: case insensitive filesystem */
public abstract class C63233Kte {
    public static final K6G A00(UserSession userSession, DirectThreadKey directThreadKey, String str, String str2, String str3, List list, float f, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        0qQ.A0B(userSession, 0);
        K6G k6g = new K6G();
        Bundle A0A = DbV.A0A(userSession);
        A0A.putBoolean("BUNDLE_IS_EMBEDDED", z);
        A0A.putInt("MAX_MULTI_SELECT_COUNT", i);
        A0A.putInt("MAX_MULTI_VIDEO_COUNT", i2);
        A0A.putBoolean("BUNDLE_IS_CAPTURE_BUTTON_ENABLED", false);
        A0A.putString("BUNDLE_THREAD_TRANSPORT_TYPE", str);
        A0A.putBoolean("BUNDLE_SHOW_SELECT_BUTTON", z2);
        A0A.putFloat("BUNDLE_ASPECT_RATIO", f);
        A0A.putString("BUNDLE_FOLDER_NAME", str2);
        if (list != null) {
            A0A.putParcelableArrayList("BUNDLE_SELECTED_ITEMS", AnonymousClass7TE.A1D(list));
        }
        A0A.putString("BUNDLE_SUBHEADER_TITLE", str3);
        A0A.putString("BUNDLE_SUBHEADER_SUBTITLE", (String) null);
        A0A.putBoolean("BUNDLE_KEEP_FOLDER_SELECTION", z3);
        A0A.putBoolean("BUNDLE_SHOW_DONE_BUTTON", z4);
        A0A.putParcelable("DIRECT_THREAD_KEY", 0B0.A00(directThreadKey));
        A0A.putBoolean("BUNDLE_SHOW_MAGIC_MEDIA_REMIX", z5);
        k6g.setArguments(A0A);
        return k6g;
    }
}
