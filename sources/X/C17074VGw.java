package X;

import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.VGw  reason: case insensitive filesystem */
public abstract class C17074VGw {
    public static void A00(FragmentActivity fragmentActivity, AnonymousClass0iw r9, UserSession userSession, String str, String str2) {
        UserSession userSession2 = userSession;
        0wc A01 = AnonymousClass0kN.A01(r9, userSession);
        C358248ab r3 = new C358248ab((Activity) fragmentActivity);
        r3.A0i(fragmentActivity.getDrawable(R.drawable.checkout_chevron_96));
        r3.A09(2131955098);
        DbY.A0w(fragmentActivity, r3, str2, 2131955097);
        r3.A0E(new C50022FJh(str, (Object) A01, 19));
        r3.A0G(new C71193OfE(fragmentActivity, r9, userSession2, str, str2, 1), 2131964884);
        r3.A0s(true);
        r3.A0B(new W4Y(str, A01, 1));
        DbT.A1V(r3);
        0Aj A0e = AnonymousClass7TE.A0e(A01, "instagram_shopping_checkout_awareness_dialog_impression");
        A0e.AAJ("visual_style", AnonymousClass000.A00(268));
        C13988Tno.A1D(A0e, str);
        A0e.Cgf();
        0xY A0N = AnonymousClass7TF.A0N(userSession2);
        A0N.E5T("has_shown_checkout_awareness_interstitial", true);
        A0N.apply();
    }
}
