package X;

import android.app.Activity;
import android.view.View;
import com.instagram.common.session.UserSession;

public final class OFB {
    public final Activity A00;
    public final View A01;
    public final UserSession A02;
    public final OWC A03;

    public OFB(Activity activity, View view, UserSession userSession) {
        this.A01 = view;
        this.A02 = userSession;
        this.A00 = activity;
        this.A03 = new OWC(view, userSession);
    }
}
