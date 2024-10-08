package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.AAd  reason: case insensitive filesystem */
public abstract class C39806AAd {
    public static final Drawable A00(Context context, AnonymousClass3NV r3, boolean z) {
        int i;
        Drawable drawable = null;
        if (context != null) {
            switch (r3.ordinal()) {
                case 0:
                    i = R.drawable.instagram_users_pano_filled_24;
                    break;
                case 1:
                    i = R.drawable.instagram_eye_off_pano_outline_24;
                    break;
                case 2:
                    i = R.drawable.instagram_crown_pano_outline_24;
                    break;
                case 3:
                    return C346697vb.A00(context);
                case 4:
                    i = R.drawable.instagram_user_requested_pano_filled_24;
                    break;
                case 5:
                    break;
                case 6:
                    i = R.drawable.instagram_app_instagram_pano_outline_24;
                    break;
                default:
                    throw AnonymousClass7TE.A1K();
            }
            drawable = context.getDrawable(i);
            if (drawable != null) {
                drawable.mutate();
                int i2 = R.attr.igds_color_primary_icon;
                if (z) {
                    i2 = R.attr.igds_color_icon_on_color;
                }
                drawable.setTint(AnonymousClass7TF.A03(context, i2));
            }
        }
        return drawable;
    }

    public static final String A01(Context context, UserSession userSession, AnonymousClass3NV r4, boolean z) {
        int i;
        0qQ.A0B(userSession, 1);
        if (context == null) {
            return null;
        }
        switch (r4.ordinal()) {
            case 0:
                if (!z) {
                    i = 2131963865;
                    break;
                } else {
                    i = 2131965162;
                    if (AnonymousClass7TF.A1Y(AnonymousClass7TF.A0Q(userSession).A0K(), true)) {
                        i = 2131965161;
                        break;
                    }
                }
                break;
            case 1:
                i = 2131963862;
                break;
            case 2:
                i = 2131963870;
                break;
            case 3:
                i = 2131963853;
                break;
            case 4:
                i = 2131963855;
                break;
            case 5:
                String str = C339717k3.A00(userSession).A03;
                if (str == null) {
                    return "";
                }
                return str;
            case 6:
                i = 2131963858;
                break;
            default:
                throw AnonymousClass7TE.A1B(AnonymousClass000.A00(208));
        }
        return context.getString(i);
    }
}
