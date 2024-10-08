package X;

import android.app.Activity;
import android.graphics.RectF;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.creation.cameraconfiguration.CameraConfiguration;
import com.instagram.modal.TransparentModalActivity;
import com.instagram.model.direct.camera.DirectCameraViewModel;
import java.io.IOException;

/* renamed from: X.NwB  reason: case insensitive filesystem */
public abstract class C70033NwB {
    public static final void A00(RectF rectF, Fragment fragment, FragmentActivity fragmentActivity, 28D r7, UserSession userSession, CameraConfiguration cameraConfiguration, C254933tI r10, C273434mZ r11, DirectCameraViewModel directCameraViewModel, C254743sy r13, Boolean bool, String str, String str2, String str3) {
        if (fragment.getContext() == null) {
            0wb.A03("IgDirectThreadCameraNavigatorUtil", "Fragment Context is null!");
            return;
        }
        Bundle A0B = C66582MXn.A0B(directCameraViewModel);
        C360908fL.A00(r7);
        A0B.putSerializable("DirectReplyCameraFragments.ARG_REPLY_ENTRY_POINT", r7);
        A0B.putString("DirectReplyCameraFragments.ARG_REPLY_SEND_ATTRIBUTION", str2);
        A0B.putParcelable("DirectQuickReplyCameraFragment.REPLY_CAM_ARG_CAMERA_INIT_CONFIG", cameraConfiguration);
        if (rectF != null) {
            A0B.putParcelable(AnonymousClass000.A00(24), rectF);
        }
        String str4 = str3;
        if (str3 != null) {
            A0B.putString("DirectQuickReplyCameraFragment.REPLY_CAM_ARG_CAMERA_AR_EFFECT_ID", str4);
        }
        if (r13 != null) {
            C67002Mga.A01(A0B, r13, "DirectStoryViewerFragment.ARGUMENTS_THREAD_KEY");
        }
        if (r10 != null) {
            try {
                A0B.putString(AnonymousClass000.A00(224), C292605jE.A00(r10));
            } catch (IOException unused) {
            }
        }
        if (bool != null) {
            A0B.putBoolean("DirectReplyCameraFragments.REPLY_CAM_ARG_INSERT_RAVEN_MEDIA_IN_COMPOSER", bool.booleanValue());
        }
        AnonymousClass6W8 A02 = AnonymousClass6W8.A02((Activity) 0mE.A00(fragmentActivity, Activity.class), A0B, userSession, TransparentModalActivity.class, str);
        A02.A0E(r11);
        A02.A0A(fragment.getActivity(), 101);
        fragmentActivity.overridePendingTransition(0, 0);
    }
}
