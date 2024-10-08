package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

public final /* synthetic */ class Oj6 implements View.OnClickListener {
    public final /* synthetic */ C279864zZ A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C323286xF A02;
    public final /* synthetic */ User A03;

    public /* synthetic */ Oj6(C279864zZ r1, UserSession userSession, C323286xF r3, User user) {
        this.A01 = userSession;
        this.A03 = user;
        this.A02 = r3;
        this.A00 = r1;
    }

    public final void onClick(View view) {
        UserSession userSession = this.A01;
        User user = this.A03;
        C323286xF r3 = this.A02;
        C279864zZ r2 = this.A00;
        if (DbT.A0j(userSession).getId().equals(user.getId())) {
            r3.CyC(user);
        } else if (r2 != null) {
            r3.DUY(r2, (String) null, (String) null);
        } else {
            r3.Cpa(user);
        }
    }
}
