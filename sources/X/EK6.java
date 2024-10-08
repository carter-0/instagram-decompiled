package X;

import android.content.Context;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;
import java.util.Map;

public final class EK6 extends C49890FBq {
    public final Context A00;
    public final UserSession A01;
    public final User A02;

    public EK6(Context context, UserSession userSession, 2FW r9, User user, int i, int i2) {
        super(r9, user, "follow", i, i2);
        this.A02 = user;
        this.A01 = userSession;
        this.A00 = context;
    }

    public static final void A00(C284945Oz r5, C284945Oz r6, Y43 y43, EK6 ek6) {
        int i;
        int i2;
        AnonymousClass2f1 A002 = AnonymousClass2f1.A00(ek6.A01);
        User user = ek6.A02;
        FollowStatus A0N = A002.A0N(user);
        int ordinal = A0N.ordinal();
        if (ordinal != 4) {
            i = R.drawable.instagram_user_requested_pano_outline_24;
            if (ordinal != 5) {
                i = R.drawable.instagram_user_follow_pano_outline_24;
            }
        } else {
            i = R.drawable.instagram_user_following_pano_outline_24;
        }
        r6.Epw(Integer.valueOf(i));
        if (ordinal != 4) {
            i2 = 2131960317;
            if (ordinal != 5) {
                i2 = 2131960313;
            }
        } else {
            i2 = 2131960314;
        }
        r5.Epw(Integer.valueOf(i2));
        if (A0N == FollowStatus.A06 && DbX.A1a(user.A0K())) {
            Map map = 0Yh.A03;
            String A012 = 0q1.A01(C47851EJx.class);
            if (A012 == null) {
                A012 = "";
            }
            y43.put(A012, AnonymousClass7TE.A0u());
        }
    }
}
