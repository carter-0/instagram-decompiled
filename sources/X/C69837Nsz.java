package X;

import android.app.Activity;
import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;

/* renamed from: X.Nsz  reason: case insensitive filesystem */
public abstract class C69837Nsz {
    public static final void A00(UserSession userSession, Activity activity, String str) {
        boolean A1U = AnonymousClass7TF.A1U(0, activity, userSession);
        if (!C331227Qb.A03(userSession)) {
            AnonymousClass7I3 r3 = new AnonymousClass7I3(userSession);
            NII nii = new NII();
            Bundle A0a = AnonymousClass7TE.A0a();
            A0a.putSerializable(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str);
            C331127Pr A0V = DbV.A0V(A0a, nii, userSession);
            A0V.A16 = false;
            A0V.A0v = A1U;
            A0V.A0U = new C72956PQo(r3, userSession, str, 0);
            DbU.A0y(activity, nii, A0V);
        }
    }
}
