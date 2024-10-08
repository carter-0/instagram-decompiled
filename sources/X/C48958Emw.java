package X;

import android.app.Activity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.Emw  reason: case insensitive filesystem */
public abstract class C48958Emw {
    public static final void A00(Activity activity, C48145EZn eZn, UserSession userSession, boolean z, boolean z2) {
        String string;
        0qQ.A0B(userSession, 0);
        AnonymousClass7TF.A1B(activity, 1, eZn);
        C331127Pr A0e = DbX.A0e(userSession, true);
        A0e.A03 = 0.7f;
        A0e.A0x = true;
        if (eZn.ordinal() == 16 && (string = activity.getResources().getString(2131974451)) != null) {
            A0e.A0d = string;
            A0e.A0D = R.style.PrivacyTextStyle;
        }
        boolean A01 = C267044ar.A01(activity, userSession);
        C331157Pu A00 = A0e.A00();
        String obj = eZn.toString();
        0qQ.A0B(obj, 0);
        E5S e5s = new E5S();
        DbT.A1N(e5s, AnonymousClass7TH.A0h("is_contact_synced", Boolean.valueOf(A01), AnonymousClass7TE.A1L("invite_location", obj), AnonymousClass7TE.A1L("show_app_tray", Boolean.valueOf(z)), AnonymousClass7TE.A1L("is_photo_enabled", Boolean.valueOf(z2))));
        A00.A02(activity, e5s);
    }
}
