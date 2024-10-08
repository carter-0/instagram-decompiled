package X;

import android.content.Context;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.Lvc  reason: case insensitive filesystem */
public final class C65552Lvc implements C230842qN {
    public final Integer A00 = AnonymousClass05K.A00;

    public final long EKO() {
        return 0;
    }

    public final Integer Aw1() {
        return this.A00;
    }

    public final boolean CTz() {
        return true;
    }

    public final int CGx(Context context, UserSession userSession) {
        int dimensionPixelOffset = JTR.A0Q(context).getDimensionPixelOffset(R.dimen.action_button_min_width);
        int i = -1;
        if (0mk.A02(context)) {
            i = 1;
        }
        return dimensionPixelOffset * i;
    }

    public final int CHU(Context context) {
        return JTR.A0Q(context).getDimensionPixelOffset(R.dimen.account_discovery_bottom_gap);
    }
}
