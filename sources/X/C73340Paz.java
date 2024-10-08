package X;

import android.app.Activity;
import android.content.res.Resources;
import com.instagram.common.session.UserSession;

/* renamed from: X.Paz  reason: case insensitive filesystem */
public final class C73340Paz implements Runnable {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ String A02;

    public C73340Paz(UserSession userSession, Activity activity, String str) {
        this.A00 = activity;
        this.A01 = userSession;
        this.A02 = str;
    }

    public final void run() {
        Activity activity = this.A00;
        Resources resources = activity.getResources();
        UserSession userSession = this.A01;
        E1D A002 = C49793F7b.A00(userSession, this.A02);
        C331127Pr A0W = DbS.A0W(userSession);
        A0W.A0d = resources.getString(2131974889);
        DbU.A0y(activity, A002, A0W);
    }
}
