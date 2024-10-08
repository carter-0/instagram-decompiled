package X;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import androidx.fragment.app.Fragment;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import org.json.JSONObject;
import org.webrtc.CameraEnumerationAndroid;

/* renamed from: X.I0s  reason: case insensitive filesystem */
public final class C56541I0s {
    public static final C49925FFb A00 = new Object();

    public final void A00(Context context, C3263576k r17, C69445Nlp nlp, 0wc r19, UserSession userSession, User user, G87 g87, C48088EVg eVg, C51889G6e g6e, String str, String str2) {
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession2, 0);
        Context context2 = context;
        String str3 = str;
        AnonymousClass7TG.A1P(context2, str3);
        C49925FFb.A01(context2, r17, nlp, r19, userSession2, (C331157Pu) null, (C331127Pr) null, user, g87, eVg, g6e, str3, str2, (JSONObject) null, false);
    }

    public final void A01(Fragment fragment, 0wc r11, UserSession userSession, User user) {
        Context context;
        Drawable drawable;
        Fragment fragment2 = fragment;
        if (fragment.isAdded() && (context = fragment.getContext()) != null && (drawable = context.getDrawable(R.drawable.restrict_snackbar_icon)) != null) {
            User user2 = user;
            if (!user.CPV() && (!user.isRestricted())) {
                UserSession userSession2 = userSession;
                if (3 > DbT.A00(AnonymousClass7TE.A0q(userSession), "restrict_block_upsell_snackbar_shown_count")) {
                    drawable.setColorFilter(-1, PorterDuff.Mode.SRC_IN);
                    C310336ap A0a = DbS.A0a();
                    DbS.A19(context, A0a, 2131972310);
                    A0a.A04 = drawable;
                    A0a.A02();
                    DbW.A0q(context, A0a, 2131964884);
                    A0a.A0A(new IVZ(2, userSession2, fragment2, r11, user2));
                    A0a.A0L = true;
                    A0a.A01 = CameraEnumerationAndroid.AnonymousClass1.MIN_FPS_THRESHOLD;
                    DbY.A1N(A0a);
                }
            }
        }
    }
}
