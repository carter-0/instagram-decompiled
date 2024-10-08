package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;

/* renamed from: X.6YW  reason: invalid class name */
public final class AnonymousClass6YW {
    public UserSession A00;
    public 0xa A01;

    public final void A01(Reel reel) {
        0xY AR4 = this.A01.AR4();
        AR4.E5T(reel.getId(), true);
        AR4.apply();
        reel.A0R(this.A00);
    }

    public static AnonymousClass6YW A00(UserSession userSession) {
        return (AnonymousClass6YW) userSession.A01(AnonymousClass6YW.class, new AnonymousClass6YX(userSession));
    }
}
