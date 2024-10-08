package X;

import android.app.Activity;
import android.net.Uri;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.E7h  reason: case insensitive filesystem */
public final class C47544E7h extends F1F {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public C47544E7h(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj3;
        this.A03 = obj2;
    }

    public final void A00(UserSession userSession) {
        if (this.A00 != 0) {
            C47695EDe eDe = (C47695EDe) this.A01;
            if (userSession == null) {
                userSession = (UserSession) this.A03;
            }
            eDe.A03(userSession, (User) this.A02);
            return;
        }
        C46413Dea.A04((Activity) this.A01, (Uri) this.A03, (AnonymousClass0iw) this.A02, userSession);
    }
}
