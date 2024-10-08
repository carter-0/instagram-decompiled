package X;

import android.content.Context;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.6v3  reason: invalid class name and case insensitive filesystem */
public final class C321976v3 implements C230842qN {
    public final Integer A00 = AnonymousClass05K.A00;

    public final int CGx(Context context, UserSession userSession) {
        0qQ.A0B(context, 0);
        int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R.dimen.action_button_min_width);
        int i = -1;
        if (0mk.A02(context)) {
            i = 1;
        }
        return dimensionPixelOffset * i;
    }

    public final int CHU(Context context) {
        0qQ.A0B(context, 0);
        return context.getResources().getDimensionPixelOffset(R.dimen.account_discovery_bottom_gap);
    }

    public final long EKO() {
        return 0;
    }

    public final Integer Aw1() {
        return this.A00;
    }

    public final boolean CTz() {
        return true;
    }
}
