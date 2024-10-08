package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.creation.capture.quickcapture.sundial.edit.model.ClipsTimelineEditorConfig;

/* renamed from: X.KsW  reason: case insensitive filesystem */
public abstract class C63163KsW {
    public static final C61785KLz A00(UserSession userSession, TargetViewSizeProvider targetViewSizeProvider, C390839rv r3, ClipsTimelineEditorConfig clipsTimelineEditorConfig, C2801950r r5) {
        Bundle A0A = DbV.A0A(userSession);
        A0A.putSerializable("ARG_CLIPS_CREATION_TYPE", r5);
        A0A.putSerializable("ARG_EDITOR_TRANSITION_SOURCE", r3);
        A0A.putSerializable("ARG_EDITOR_CONFIG", clipsTimelineEditorConfig);
        A0A.putParcelable("ARG_TARGET_VIEW_SIZE_PROVIDER", targetViewSizeProvider);
        Fragment k5u = new K5U();
        k5u.setArguments(A0A);
        return k5u;
    }
}
