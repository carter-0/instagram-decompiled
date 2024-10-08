package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;

public abstract class VGS {
    public static final void A00(AnonymousClass0iw r3, UserSession userSession, XC5 xc5, VYX vyx, C18065Vkr vkr, Uw7 uw7, C16271UrY urY) {
        boolean A1U = AnonymousClass7TF.A1U(0, vyx, urY);
        C51974G9v.A1S(uw7, vkr, r3, userSession, xc5);
        VGQ.A00(userSession, xc5, vyx.A02, urY);
        MediaFrameLayout mediaFrameLayout = vyx.A03;
        mediaFrameLayout.A00 = urY.A00;
        if (uw7 != Uw7.A02) {
            vkr.A01(mediaFrameLayout);
        }
        ExtendedImageUrl A00 = urY.A00(vyx.A00);
        if (A00 != null) {
            vyx.A01.setUrl(A00, r3);
        }
        C13989Tnp.A1B(vyx.A01, uw7, Uw7.PLAYING, A1U);
    }
}
