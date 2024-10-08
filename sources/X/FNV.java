package X;

import android.app.Activity;
import android.graphics.RectF;
import android.view.View;
import com.instagram.common.session.UserSession;

public final class FNV implements View.OnClickListener {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ String A02;

    public FNV(UserSession userSession, Activity activity, String str) {
        this.A01 = userSession;
        this.A00 = activity;
        this.A02 = str;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(1470949907);
        UserSession userSession = this.A01;
        FFV.A03(this.A00, new RectF(0.0f, 0.0f, 0.0f, 0.0f), userSession, this.A02, (String) null);
        AnonymousClass0fD.A0C(-1993996560, A05);
    }
}
