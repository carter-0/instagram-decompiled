package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.FnF  reason: case insensitive filesystem */
public final class C51023FnF implements C330317Mh {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ 1P0 A01;
    public final /* synthetic */ UserSession A02;

    public final void onFail(C268654dm r1) {
    }

    public C51023FnF(Activity activity, 1P0 r2, UserSession userSession) {
        this.A00 = activity;
        this.A02 = userSession;
        this.A01 = r2;
    }

    public final void onSuccess(User user) {
        FH6.A00(this.A00, (0xF) null, this.A01, this.A02, (1Xj) null, (AnonymousClass3W1) null, user);
    }
}
