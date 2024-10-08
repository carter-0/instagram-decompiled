package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.user.model.User;

/* renamed from: X.6WH  reason: invalid class name */
public final class AnonymousClass6WH {
    public final String A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;

    public AnonymousClass6WH(UserSession userSession, Reel reel) {
        User user;
        0qQ.A0B(userSession, 2);
        String id = reel.getId();
        0qQ.A07(id);
        this.A00 = id;
        boolean z = true;
        this.A04 = !reel.A16(userSession);
        this.A02 = reel.A1Y;
        User A002 = 0eE.A00(userSession).A00();
        1Ns r0 = reel.A0W;
        if (r0 != null) {
            user = r0.CCd();
        } else {
            user = null;
        }
        this.A03 = 0qQ.A0K(A002, user);
        if (!reel.A0b() && !reel.A0i() && !reel.A0k()) {
            z = false;
        }
        this.A01 = z;
    }
}
