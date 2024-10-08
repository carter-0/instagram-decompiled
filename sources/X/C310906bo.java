package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;

/* renamed from: X.6bo  reason: invalid class name and case insensitive filesystem */
public final class C310906bo implements C229222n2 {
    public final /* synthetic */ UserSession A00;

    public C310906bo(UserSession userSession) {
        this.A00 = userSession;
    }

    public final String BK2(AnonymousClass30Y r4) {
        int i;
        0qQ.A0B(r4, 0);
        UserSession userSession = this.A00;
        Reel reel = ((C250973mM) r4.A03).A0H;
        String ByO = reel.ByO(userSession);
        if (ByO != null) {
            i = ByO.hashCode();
        } else {
            i = 0;
        }
        return 002.A0R(Integer.toHexString(i), reel.getId());
    }
}
