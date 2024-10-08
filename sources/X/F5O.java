package X;

import com.instagram.android.R;
import com.instagram.api.schemas.UserMonetizationProductType;
import com.instagram.common.session.UserSession;

public abstract class F5O {
    public static final JQE A01(UserMonetizationProductType userMonetizationProductType, UserSession userSession, boolean z) {
        Object fZv;
        switch (DbU.A02(userMonetizationProductType, 1)) {
            case 2:
            case 15:
                fZv = new C50361FZs(z);
                break;
            case 5:
                fZv = new Object();
                break;
            case 7:
                fZv = new Object();
                break;
            case 9:
                fZv = new C50364FZv(z);
                break;
            case 10:
                fZv = new C50363FZu(userSession);
                break;
            case 11:
                fZv = new C50362FZt(z);
                break;
            case 13:
                fZv = new Object();
                break;
            default:
                fZv = new Object();
                break;
        }
        return (JQE) fZv;
    }

    public static final int A00(String str) {
        if (0qQ.A0K(str, "users-pano")) {
            return R.drawable.instagram_users_pano_outline_24;
        }
        if (0qQ.A0K(str, "promote-pano")) {
            return R.drawable.instagram_promote_pano_outline_24;
        }
        if (0qQ.A0K(str, "money-pano")) {
            return R.drawable.instagram_money_pano_outline_24;
        }
        if (0qQ.A0K(str, "key-pano")) {
            return R.drawable.instagram_key_pano_outline_24;
        }
        if (0qQ.A0K(str, "badge-pano")) {
            return R.drawable.instagram_badge_pano_outline_24;
        }
        if (0qQ.A0K(str, "badges-pano")) {
            return R.drawable.instagram_badges_pano_outline_24;
        }
        if (0qQ.A0K(str, "crown-badge-pano")) {
            return R.drawable.instagram_crown_badge_pano_outline_24;
        }
        if (0qQ.A0K(str, "mail-pano")) {
            return R.drawable.instagram_mail_pano_outline_24;
        }
        if (0qQ.A0K(str, "business-pano")) {
            return R.drawable.instagram_business_pano_outline_24;
        }
        if (0qQ.A0K(str, "circle-check-pano")) {
            return R.drawable.instagram_circle_check_pano_filled_24;
        }
        if (0qQ.A0K(str, "circle-x-pano")) {
            return R.drawable.instagram_circle_x_pano_outline_24;
        }
        if (!0qQ.A0K(str, "ticket-pano")) {
            return R.drawable.instagram_money_pano_outline_24;
        }
        return R.drawable.instagram_ticket_pano_outline_24;
    }
}
