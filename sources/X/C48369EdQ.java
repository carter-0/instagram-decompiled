package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.EdQ  reason: case insensitive filesystem */
public abstract class C48369EdQ {
    public static final Drawable A00(Context context, UserSession userSession) {
        Drawable drawable;
        0Tu A0J = DbS.A0J(userSession, 1);
        if (182.A06(A0J, userSession, 36325351626650524L)) {
            drawable = context.getDrawable(R.drawable.ig_avatars_style_2_g6_casual_alpha_style2);
            if (drawable == null) {
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
        } else if (182.A06(A0J, userSession, 36322246364506137L)) {
            drawable = context.getDrawable(R.drawable.ig_avatar_assets_avatar_nux_sp);
            if (drawable == null) {
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
        } else {
            drawable = context.getDrawable(R.drawable.ig_avatar_assets_avatar_nux_static);
            if (drawable == null) {
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
        }
        return drawable;
    }
}
