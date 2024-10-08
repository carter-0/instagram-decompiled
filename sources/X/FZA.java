package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

public final class FZA implements AnonymousClass11X {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ C47698EDh A01;
    public final /* synthetic */ User A02;
    public final /* synthetic */ boolean A03;

    public final String getName() {
        return "forceSynchronizeQE";
    }

    public final int getRunnableId() {
        return 259;
    }

    public final void onCancel() {
    }

    public final void onStart() {
    }

    public FZA(UserSession userSession, C47698EDh eDh, User user, boolean z) {
        this.A01 = eDh;
        this.A00 = userSession;
        this.A02 = user;
        this.A03 = z;
    }

    public final void onFinish() {
        C47698EDh.A00(this.A00, this.A01, this.A02, this.A03);
    }

    public final void run() {
        183.A01.A04(this.A00);
    }
}
