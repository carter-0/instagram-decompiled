package X;

import android.app.Activity;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.PHn  reason: case insensitive filesystem */
public final class C72733PHn implements MVB {
    public final AnonymousClass0iw A00;
    public final UserSession A01;
    public final User A02;

    public C72733PHn(AnonymousClass0iw r2, UserSession userSession, User user) {
        0qQ.A0B(userSession, 2);
        this.A02 = user;
        this.A01 = userSession;
        this.A00 = r2;
    }

    public final void onButtonClick(View view) {
        0qQ.A0B(view, 0);
        Activity A012 = C61270mF.A01(AnonymousClass7TE.A0S(view));
        if (A012 != null) {
            C71110Ocp.A00.A04(A012, this.A00, this.A01, this.A02.getId(), true);
        }
    }

    public final void onDismiss() {
    }

    public final void onShow() {
    }

    public final /* synthetic */ void onTextClick(View view) {
    }
}
