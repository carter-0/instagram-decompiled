package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;

public final class EUA extends C243843aC {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ 0sP A01;

    public final void D2Y(FollowStatus followStatus, User user) {
        0qQ.A0B(user, 0);
        user.A0n(DbV.A0i(this.A00, user));
        this.A01.invoke(user.B6o());
    }

    public EUA(0sP r1, UserSession userSession) {
        this.A00 = userSession;
        this.A01 = r1;
    }
}
