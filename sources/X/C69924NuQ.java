package X;

import android.content.res.Resources;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.NuQ  reason: case insensitive filesystem */
public abstract class C69924NuQ {
    public static final int A00(Resources resources, UserSession userSession) {
        double A00 = 182.A00(0Tu.A05, userSession, 37174131653870187L);
        if (A00 > 1.0d) {
            A00 = 1.0d;
        }
        return (int) (A00 * ((double) resources.getDimensionPixelSize(R.dimen.abc_list_item_height_large_material)));
    }
}
