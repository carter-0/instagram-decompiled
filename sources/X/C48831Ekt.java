package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.GraphQLSubscriptionID;

/* renamed from: X.Ekt  reason: case insensitive filesystem */
public abstract class C48831Ekt {
    public static final void A00(View view, UserSession userSession, C314466iJ r5, 2Er r6, boolean z) {
        String str;
        View findViewById = view.findViewById(R.id.nux_banner);
        if (findViewById != null && findViewById.getVisibility() == 0) {
            C48827Ekp.A00(findViewById);
            r5.DUr();
            AnonymousClass7TG.A0g(AnonymousClass7TE.A0q(userSession), C273654mx.A00(2963)).apply();
            String C6C = r6.C6C();
            if (C6C != null) {
                if (z) {
                    str = "impression";
                } else {
                    str = "tap";
                }
                C48954Ems.A00(userSession, C6C, "kindness_reminder_dismissed", str, GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT);
            }
        }
    }
}
