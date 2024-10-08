package X;

import android.os.Bundle;
import com.instagram.clips.intf.ClipsViewerSource;

/* renamed from: X.Hea  reason: case insensitive filesystem */
public abstract class C55245Hea {
    public static final H1K A00(ClipsViewerSource clipsViewerSource, String str, String str2, String str3, boolean z) {
        0qQ.A0B(str2, 1);
        H1K h1k = new H1K();
        Bundle A0N = C51971G9r.A0N(str);
        A0N.putString("grid_key", str2);
        A0N.putParcelable("clips_viewer_source", clipsViewerSource);
        A0N.putString("analytics_module", str3);
        A0N.putBoolean("should_show_followed_users_profile_pictures", z);
        h1k.setArguments(A0N);
        return h1k;
    }
}
