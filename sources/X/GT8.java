package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;

public final class GT8 {
    public final int A00;
    public final UserSession A01;
    public final Reel A02;
    public final C255773uh A03;
    public final C250973mM A04;
    public final C309426Yf A05;
    public final boolean A06;
    public final boolean A07;

    public GT8(UserSession userSession, Reel reel, C255773uh r4, C250973mM r5, C309426Yf r6, int i, boolean z) {
        0qQ.A0B(userSession, 1);
        this.A01 = userSession;
        this.A04 = r5;
        this.A02 = reel;
        this.A03 = r4;
        this.A05 = r6;
        this.A00 = i;
        this.A06 = z;
        this.A07 = C309456Yi.A02(r5);
    }

    public final int A00() {
        return C250973mM.A00(this.A01, this.A04).indexOf(this.A03);
    }
}
