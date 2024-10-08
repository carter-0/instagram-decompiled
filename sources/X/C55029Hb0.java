package X;

import android.content.DialogInterface;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

/* renamed from: X.Hb0  reason: case insensitive filesystem */
public abstract class C55029Hb0 {
    public static final void A00(DialogInterface.OnDismissListener onDismissListener, Fragment fragment, UserSession userSession, 1Xj r10) {
        int i;
        int i2;
        1Xj r6 = r10;
        boolean A5Y = r10.A5Y();
        C67161s9 BP1 = r10.A0C.BP1();
        if (BP1 == null || !BP1.getHasBeenMashedUp()) {
            i = 2131964019;
            i2 = 2131964018;
            if (A5Y) {
                i = 2131976476;
                i2 = 2131976475;
            }
        } else {
            i = 2131976476;
            i2 = 2131971957;
        }
        C358248ab A0U = DbW.A0U(fragment);
        A0U.A09(i);
        A0U.A08(i2);
        A0U.A0F(new C50024FJj(6, (Object) onDismissListener, (Object) r6, (Object) userSession, (Object) fragment));
        DbX.A16(new C49969FHc(7), A0U);
    }
}
