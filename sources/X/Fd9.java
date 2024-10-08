package X;

import android.app.Activity;
import android.view.View;
import com.instagram.common.session.UserSession;

public final class Fd9 implements MVB {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ String A02;

    public final void onDismiss() {
    }

    public final void onShow() {
    }

    public final /* synthetic */ void onTextClick(View view) {
    }

    public Fd9(UserSession userSession, Activity activity, String str) {
        this.A00 = activity;
        this.A01 = userSession;
        this.A02 = str;
    }

    public final void onButtonClick(View view) {
        UserSession userSession = this.A01;
        C46474Dfc.A02(DbS.A0M(this.A00, userSession), userSession, C46447Df9.A02(), C46548Dgp.A00(userSession, "deleted_media", this.A02));
    }
}
