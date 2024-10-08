package X;

import android.content.Context;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.WZb  reason: case insensitive filesystem */
public final class C19431WZb implements C230842qN {
    public final boolean CTz() {
        return true;
    }

    public final long EKO() {
        return 2000;
    }

    public final Integer Aw1() {
        return AnonymousClass05K.A00;
    }

    public final int CGx(Context context, UserSession userSession) {
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.abc_list_item_height_material);
        int i = 1;
        if (0mk.A02(context)) {
            i = -1;
        }
        return dimensionPixelSize * i;
    }

    public final int CHU(Context context) {
        return AnonymousClass7TG.A02(context);
    }
}
