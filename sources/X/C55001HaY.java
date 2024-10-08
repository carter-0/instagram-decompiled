package X;

import android.content.Context;
import android.net.Uri;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.typedurl.SimpleImageUrl;

/* renamed from: X.HaY  reason: case insensitive filesystem */
public abstract class C55001HaY {
    public static final GSY A00(Context context, UserSession userSession, 1Xl r10, int i) {
        SimpleImageUrl A1m;
        1Xj A1c = r10.BPf().A1c(i);
        if (A1c == null) {
            A1c = r10.BPf();
        }
        String str = null;
        if (A1c.A4o()) {
            Uri uri = A1c.A05;
            if (uri != null) {
                A1m = C253833rU.A00(uri, -1, -1);
            } else {
                A1m = null;
            }
        } else {
            A1m = A1c.A1m(context.getResources().getDimensionPixelSize(R.dimen.abc_dropdownitem_icon_width));
        }
        String A06 = 1sx.A06(context, userSession, r10, i);
        if (!1sx.A0S(AnonymousClass47K.A02(context, userSession, r10, i, false))) {
            str = 1sx.A04(context, userSession, A1c, r10, i);
        }
        return new GSY((ImageUrl) A1m, 1sx.A03(r10, i), A06, str, 10);
    }
}
