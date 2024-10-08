package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;
import com.instagram.user.follow.FollowButton;
import com.instagram.user.model.User;

/* renamed from: X.FnG  reason: case insensitive filesystem */
public final class C51024FnG implements C330317Mh {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;

    public C51024FnG(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.A00 = i;
        this.A01 = obj;
        this.A05 = obj5;
        this.A04 = obj3;
        this.A03 = obj4;
        this.A02 = obj2;
    }

    public final void onFail(C268654dm r3) {
        if (this.A00 != 0) {
            DbZ.A1V((C307896Rx) this.A02, this.A03);
        }
    }

    public final void onSuccess(User user) {
        if (this.A00 != 0) {
            0qQ.A0B(user, 0);
            Activity activity = (Activity) this.A01;
            UserSession userSession = (UserSession) this.A05;
            Object obj = this.A04;
            Object obj2 = this.A03;
            Object obj3 = this.A02;
            AnonymousClass7TF.A1H(activity, userSession);
            C294695ms.A00(userSession).A08(activity, new C47692EDb(22, obj2, obj, obj3), userSession, user);
            return;
        }
        0qQ.A0B(user, 0);
        ((C17565VaJ) this.A04).A01 = user;
        C276544tV r2 = (C276544tV) this.A02;
        W12.A00((C307786Rm) this.A01, r2, (UserSession) this.A05, (FollowButton) this.A03, user);
    }
}
