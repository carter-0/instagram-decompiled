package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveBroadcastInfoManager;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveHeartbeatManager;
import java.util.Set;

/* renamed from: X.Jhw  reason: case insensitive filesystem */
public class C60239Jhw extends 2YL {
    public final 2Fk A00;
    public final UserSession A01;
    public final C313666go A02;
    public final C17992VjU A03;
    public final C59720JVe A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;

    public final String getPrimaryText(String str, User user, Set set) {
        if (str == null) {
            return C63488Kxs.A00(user, set);
        }
        return str;
    }

    public C60239Jhw(UserSession userSession, C313666go r8, C17992VjU vjU, IgLiveBroadcastInfoManager igLiveBroadcastInfoManager, IgLiveHeartbeatManager igLiveHeartbeatManager, LES les, C59720JVe jVe, boolean z, boolean z2, boolean z3) {
        C51974G9v.A1S(r8, igLiveBroadcastInfoManager, igLiveHeartbeatManager, les, vjU);
        0qQ.A0B(jVe, 7);
        this.A01 = userSession;
        this.A02 = r8;
        this.A03 = vjU;
        this.A04 = jVe;
        this.A06 = z;
        this.A05 = z2;
        this.A07 = z3;
        this.A00 = DbT.A0G(AnonymousClass10H.A00(new MHs(this, (AnonymousClass4D7) null, 7), igLiveBroadcastInfoManager.A06, igLiveHeartbeatManager.A08, les.A0V));
    }
}
