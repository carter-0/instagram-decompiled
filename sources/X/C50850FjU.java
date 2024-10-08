package X;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.creation.cameraconfiguration.CameraConfiguration;
import com.instagram.ui.swipenavigation.PositionConfig;

/* renamed from: X.FjU  reason: case insensitive filesystem */
public final class C50850FjU implements G6H {
    public final Fragment A00;
    public final UserSession A01;

    public final void CI0(Uri uri, Bundle bundle) {
        Uri uri2 = uri;
        0qQ.A0B(uri2, 0);
        String queryParameter = uri2.getQueryParameter("entrypoint");
        if ("PRODUCT_SWIPE_UP_LINK_NUDGE".equals(queryParameter) || "QP_DEEP_LINK".equals(queryParameter)) {
            AnonymousClass4DH r4 = this.A00;
            UserSession userSession = this.A01;
            AnonymousClass2ZQ A002 = C71172bH.A00();
            if (A002 != null) {
                A002.Eng(1QK.A0C);
            }
            Activity activity = r4.mParentFragment;
            if (!(activity instanceof 2Zg)) {
                if (r4 instanceof AnonymousClass4DH) {
                    AnonymousClass4DH r42 = r4;
                    if (r42.getRootActivity() instanceof 2Zg) {
                        activity = r42.getRootActivity();
                        0qQ.A0C(activity, AnonymousClass000.A00(51));
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            2Zg r1 = (2Zg) activity;
            if (r1 != null) {
                1Au.A00(userSession).A1d(false);
                r1.FLD(new PositionConfig((AnonymousClass57C) null, (CameraConfiguration) null, (AnonymousClass3QO) null, AnonymousClass000.A00(1711), (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, -1.0f, 0, true));
            }
        }
    }

    public C50850FjU(Fragment fragment, UserSession userSession) {
        this.A00 = fragment;
        this.A01 = userSession;
    }
}
