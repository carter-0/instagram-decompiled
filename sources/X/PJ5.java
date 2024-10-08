package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.modal.ModalActivity;

public final class PJ5 implements G6H {
    public final FragmentActivity A00;
    public final UserSession A01;

    public final void CI0(Uri uri, Bundle bundle) {
        Bundle A0B = DbV.A0B(uri, 0);
        A0B.putBoolean("scroll_to_message_access_toggle", uri.getBooleanQueryParameter("scroll_to_message_access_toggle", false));
        String queryParameter = uri.getQueryParameter(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
        if (queryParameter != null) {
            A0B.putString(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, queryParameter);
        }
        FragmentActivity fragmentActivity = this.A00;
        DbW.A0W(fragmentActivity, A0B, this.A01, ModalActivity.class, C273654mx.A00(3208)).A0C(fragmentActivity);
    }

    public PJ5(FragmentActivity fragmentActivity, UserSession userSession) {
        this.A00 = fragmentActivity;
        this.A01 = userSession;
    }
}
