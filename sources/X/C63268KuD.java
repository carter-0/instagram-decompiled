package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;

/* renamed from: X.KuD  reason: case insensitive filesystem */
public abstract class C63268KuD {
    public static final K4Y A00(UserSession userSession, String str) {
        0qQ.A0B(str, 1);
        K4Y k4y = new K4Y();
        Bundle A0F = JTP.A0F(userSession);
        A0F.putString(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str);
        k4y.setArguments(A0F);
        return k4y;
    }
}
