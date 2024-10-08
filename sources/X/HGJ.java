package X;

import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;

public final class HGJ extends C243843aC {
    public final /* synthetic */ int A00;

    public HGJ(int i) {
        this.A00 = i;
    }

    public final void D2Y(FollowStatus followStatus, User user) {
        AnonymousClass7TG.A1N(user, followStatus);
        C55759Hmu hmu = GBU.A04;
        if (hmu != null) {
            String id = user.getId();
            int i = this.A00;
            String A06 = 1aC.A06(user.B6o());
            0Aj A0H = DbZ.A0H(hmu.A01, "suggested_creator_follow_button_tapped", id, i);
            A0H.AAJ("follow_status", A06);
            A0H.Cgf();
        }
    }
}
