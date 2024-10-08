package X;

import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;

public final class EUB extends C243843aC {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public EUB(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    public final void D2Y(FollowStatus followStatus, User user) {
        1Ln r2;
        String str;
        if (this.A00 != 0) {
            ((F14) this.A01).A0B.DGM(user, AnonymousClass7TE.A0M(this.A02));
            return;
        }
        F1l f1l = ((EHF) this.A02).A03;
        User user2 = ((FYA) this.A01).A00;
        if (user2.B6o() == FollowStatus.A05) {
            r2 = f1l.A00.A00;
            if (r2 != null) {
                r2.A0R("container_module", "clickable_profile_category");
                str = "recommended_follow_button_click";
            } else {
                return;
            }
        } else if (user2.B6o() == FollowStatus.A06 && (r2 = f1l.A00.A00) != null) {
            r2.A0R("container_module", "clickable_profile_category");
            str = "recommended_unfollow_button_click";
        } else {
            return;
        }
        r2.A0R("entry_module", str);
        r2.A0R("target_id", user2.getId());
        r2.Cgf();
    }
}
