package X;

import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;

/* renamed from: X.F5j  reason: case insensitive filesystem */
public abstract class C49758F5j {
    public static void A00(AnonymousClass0iw r5, UserSession userSession, FV6 fv6, GradientSpinnerAvatarView gradientSpinnerAvatarView) {
        Object obj;
        DirectShareTarget directShareTarget = fv6.A09;
        directShareTarget.getClass();
        AnonymousClass34S A00 = OXB.A00(userSession, directShareTarget);
        ImageUrl imageUrl = fv6.A07;
        ImageUrl A01 = OXB.A01(userSession, directShareTarget);
        if (A01 == null) {
            if (imageUrl != null) {
                gradientSpinnerAvatarView.A0F((AnonymousClass9IV) null, r5, imageUrl);
                return;
            } else if ((fv6.A03() || !directShareTarget.A0R) && (obj = A00.A00) != null) {
                gradientSpinnerAvatarView.A0G((AnonymousClass9IV) null, r5, (ImageUrl) obj, (ImageUrl) A00.A01);
                return;
            } else {
                Object obj2 = A00.A00;
                if (obj2 != null) {
                    A01 = (ImageUrl) obj2;
                } else {
                    return;
                }
            }
        }
        gradientSpinnerAvatarView.A0F((AnonymousClass9IV) null, r5, A01);
    }

    public static boolean A01(UserSession userSession, FV6 fv6) {
        if (!DbV.A1Y(userSession) || fv6.A02 <= 0 || fv6.A03()) {
            return false;
        }
        0Tu r2 = 0Tu.A05;
        if (182.A06(r2, userSession, 36316031546888049L) || 182.A06(r2, userSession, 36318234865244177L)) {
            return true;
        }
        return false;
    }
}
