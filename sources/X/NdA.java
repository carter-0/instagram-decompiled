package X;

import com.instagram.common.session.UserSession;
import com.instagram.friendmap.data.FriendMapRepository;
import java.util.List;

public final class NdA extends MYL {
    public final UserSession A00;
    public final FriendMapRepository A01;
    public final C71035OZw A02;
    public final C69028NdD A03;
    public final Double A04;
    public final Double A05;
    public final List A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NdA(UserSession userSession, FriendMapRepository friendMapRepository, C71035OZw oZw, C69028NdD ndD, Double d, Double d2, List list) {
        super(new C68277N8o("", 0sn.A00, false));
        AnonymousClass7TG.A1P(userSession, friendMapRepository);
        C51972G9s.A1E(oZw, ndD);
        this.A00 = userSession;
        this.A06 = list;
        this.A01 = friendMapRepository;
        this.A04 = d;
        this.A05 = d2;
        this.A02 = oZw;
        this.A03 = ndD;
        MG8.A01(this, C318116oQ.A00(this), 26);
    }
}
