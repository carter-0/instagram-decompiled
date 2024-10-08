package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

public final class FmL implements C332277Ui {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ User A02;

    public final void D9a() {
    }

    public FmL(FragmentActivity fragmentActivity, UserSession userSession, User user) {
        this.A00 = fragmentActivity;
        this.A02 = user;
        this.A01 = userSession;
    }

    public final void D9V() {
        FragmentActivity fragmentActivity = this.A00;
        C358248ab A0X = DbS.A0X(fragmentActivity);
        User user = this.A02;
        A0X.A05 = DbY.A0b(fragmentActivity, user, 2131964505);
        DbY.A0w(fragmentActivity, A0X, user.getUsername(), 2131964504);
        A0X.A0I(new C50026FJl(fragmentActivity, this.A01, user, 31), 2131964503);
        A0X.A05();
        DbT.A1V(A0X);
    }
}
