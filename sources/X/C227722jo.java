package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;

/* renamed from: X.2jo  reason: invalid class name and case insensitive filesystem */
public final class C227722jo extends C252233om {
    public final Activity A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;

    public final void onCreate() {
        0lp A002 = 0lq.A00("SwipeNavigationController.onCreate");
        try {
            C71342cb.A00(this.A02).A0C(this.A01);
            A002.close();
        } catch (Throwable th) {
            C9153RRe.A00(th, th);
            throw th;
        }
    }

    public final void onDestroy() {
        0lp A002 = 0lq.A00("SwipeNavigationController.onDestroy");
        try {
            C71342cb.A00(this.A02).A08(this.A00, this.A01);
            A002.close();
        } catch (Throwable th) {
            C9153RRe.A00(th, th);
            throw th;
        }
    }

    public C227722jo(Activity activity, AnonymousClass0iw r2, UserSession userSession) {
        this.A02 = userSession;
        this.A00 = activity;
        this.A01 = r2;
    }
}
