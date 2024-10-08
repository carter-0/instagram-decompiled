package X;

import com.instagram.common.session.UserSession;
import java.util.List;

public final class NNQ extends C228042kh {
    public final UserSession A00;
    public final C71035OZw A01;
    public final C69028NdD A02;
    public final Double A03;
    public final Double A04;
    public final List A05;

    public NNQ(UserSession userSession, C71035OZw oZw, C69028NdD ndD, Double d, Double d2, List list) {
        DbW.A1O(userSession, 1, ndD);
        this.A00 = userSession;
        this.A05 = list;
        this.A03 = d;
        this.A04 = d2;
        this.A01 = oZw;
        this.A02 = ndD;
    }

    public final /* bridge */ /* synthetic */ 2YL create() {
        UserSession userSession = this.A00;
        0sn r7 = this.A05;
        if (r7 == null) {
            r7 = 0sn.A00;
        }
        return new NdA(userSession, AnonymousClass4A3.A00(userSession), this.A01, this.A02, this.A03, this.A04, r7);
    }
}
