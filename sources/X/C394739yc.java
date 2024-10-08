package X;

import android.graphics.drawable.Drawable;
import com.instagram.common.session.UserSession;

/* renamed from: X.9yc  reason: invalid class name and case insensitive filesystem */
public abstract class C394739yc {
    public static final boolean A00(Drawable drawable, UserSession userSession) {
        0qQ.A0B(drawable, 0);
        if (drawable instanceof AnonymousClass5MH) {
            drawable = ((AnonymousClass5MH) drawable).A0A;
        }
        if (drawable instanceof C347017w8) {
            drawable = ((C347017w8) drawable).A04();
        }
        if ((drawable instanceof C306386Ly) || (drawable instanceof C369768vI) || (drawable instanceof C321056tV) || (drawable instanceof AnonymousClass5MM) || (drawable instanceof AnonymousClass9XC) || (drawable instanceof U1R) || (drawable instanceof C380189Wz) || (drawable instanceof C380179Wy) || (drawable instanceof C380169Wx) || (drawable instanceof C369908vW) || (drawable instanceof C369488uq) || (drawable instanceof C389659pz) || (drawable instanceof C389649py)) {
            return true;
        }
        if ((drawable instanceof AnonymousClass9X8) && ((AnonymousClass9X8) drawable).A0C == C391149sQ.GALLERY_STICKER) {
            return true;
        }
        if ((drawable instanceof AnonymousClass9XK) && C394269xo.A00(userSession)) {
            return true;
        }
        if (!(drawable instanceof AnonymousClass9XD) || ((AnonymousClass9XD) drawable).A04 != C391049sG.BARCELONA_CLIPS) {
            return false;
        }
        return true;
    }
}
