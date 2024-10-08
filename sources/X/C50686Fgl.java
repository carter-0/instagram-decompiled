package X;

import android.content.Context;
import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.Fgl  reason: case insensitive filesystem */
public final class C50686Fgl implements G6E {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C331157Pu A01;
    public final /* synthetic */ User A02;
    public final /* synthetic */ C46430Der A03;

    public C50686Fgl(Context context, C331157Pu r2, User user, C46430Der der) {
        this.A01 = r2;
        this.A03 = der;
        this.A00 = context;
        this.A02 = user;
    }

    public final void E16() {
        C331157Pu r4 = this.A01;
        C46430Der der = this.A03;
        C331127Pr A0W = DbS.A0W(C46430Der.A03(der));
        A0W.A0a = AnonymousClass7TE.A0v();
        DbT.A1C(this.A00.getResources(), A0W, 2131962579);
        C46447Df9.A03();
        UserSession A032 = C46430Der.A03(der);
        String id = this.A02.getId();
        0qQ.A0B(A032, 0);
        Bundle A09 = DbY.A09(A032);
        A09.putString("ProfileLiveNotificationsSettingsFragment.ARG_DISPLAYED_USER_ID", id);
        C47419E1n e1n = new C47419E1n();
        e1n.setArguments(A09);
        r4.A0F(e1n, A0W);
    }
}
