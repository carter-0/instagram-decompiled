package X;

import android.graphics.RectF;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.modal.TransparentModalActivity;

/* renamed from: X.Es6  reason: case insensitive filesystem */
public abstract class C49263Es6 {
    public static final void A00(RectF rectF, Bundle bundle, Fragment fragment, UserSession userSession, C273434mZ r7) {
        0qQ.A0B(fragment, 0);
        if (rectF != null) {
            bundle.putParcelable(C66579MXk.A00(55), rectF);
        }
        AnonymousClass6W8 A02 = AnonymousClass6W8.A02(fragment.requireActivity(), bundle, userSession, TransparentModalActivity.class, "attribution_quick_camera_fragment");
        A02.A0E(r7);
        if (rectF == null) {
            Dbc.A0y(A02);
        }
        A02.A0D(fragment, 60571);
    }
}
