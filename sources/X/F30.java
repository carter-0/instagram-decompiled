package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import org.json.JSONObject;

public final class F30 {
    public final E73 A00(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        Bundle A09 = DbY.A09(userSession);
        E73 e73 = new E73();
        e73.setArguments(A09);
        return e73;
    }

    public final E66 A01(UserSession userSession, ImageUrl imageUrl, C48088EVg eVg, String str, String str2, JSONObject jSONObject, boolean z, boolean z2) {
        0qQ.A0B(eVg, 1);
        E66 e66 = new E66();
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putString("target_user_id", str);
        A0a.putString("target_username", str2);
        A0a.putParcelable("target_profile_url", imageUrl);
        A0a.putSerializable(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, eVg);
        A0a.putString("analytics_extra", DbX.A0t(jSONObject));
        A0a.putBoolean("hide_action_button", z);
        A0a.putBoolean("dont_dismiss_on_restrict_success", z2);
        AnonymousClass0Dg.A00(A0a, userSession);
        e66.setArguments(A0a);
        return e66;
    }
}
