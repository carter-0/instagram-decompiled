package X;

import com.instagram.android.R;
import com.instagram.common.session.UserSession;

public abstract class LKJ {
    public static final int A00(UserSession userSession, C313666go r3, AnonymousClass3NV r4, Boolean bool, boolean z) {
        boolean A06;
        if (r4 != null) {
            switch (r4.ordinal()) {
                case -1:
                case 0:
                case 4:
                case 5:
                    break;
                case 1:
                    return R.drawable.live_practice_label_background;
                case 2:
                    return R.drawable.live_subscribers_label_background;
                case 3:
                    C278264wZ.A06(userSession, r3, false, z);
                    if (bool != null) {
                        A06 = bool.booleanValue();
                    } else {
                        A06 = C278264wZ.A06(userSession, r3, false, z);
                    }
                    if (A06) {
                        return R.drawable.live_label_background;
                    }
                    return R.drawable.live_close_friends_label_background;
                case 6:
                    return R.drawable.live_internal_label_background;
                default:
                    throw AnonymousClass7TE.A1K();
            }
        }
        return R.drawable.live_label_background;
    }

    public static final int A01(AnonymousClass3NV r0) {
        if (r0 == null) {
            return 2131965256;
        }
        switch (r0.ordinal()) {
            case -1:
            case 0:
            case 2:
            case 3:
            case 4:
            case 5:
                return 2131965256;
            case 1:
                return 2131965291;
            case 6:
                return 2131965241;
            default:
                throw AnonymousClass7TE.A1K();
        }
    }
}
