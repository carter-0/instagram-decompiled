package X;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

/* renamed from: X.6xK  reason: invalid class name and case insensitive filesystem */
public final class C323336xK {
    public int A00;
    public DcA A01;
    public final Activity A02;
    public final Fragment A03;
    public final UserSession A04;
    public final AnonymousClass4D6 A05;

    public C323336xK(Activity activity, Fragment fragment, UserSession userSession, AnonymousClass4D6 r5) {
        0qQ.A0B(userSession, 1);
        this.A04 = userSession;
        this.A02 = activity;
        this.A03 = fragment;
        this.A05 = r5;
    }

    public final void A00() {
        UserSession userSession = this.A04;
        0Tu r7 = 0Tu.A05;
        if (182.A06(r7, userSession, 36318887703550565L)) {
            if (((double) (System.currentTimeMillis() - C14147Tqj.A00)) >= 182.A00(r7, userSession, 37163312633938200L) * 1000.0d) {
                C14147Tqj.A00 = System.currentTimeMillis();
            } else {
                return;
            }
        }
        C319356qS.A00(new C319346qR(this), userSession, this.A05);
    }
}
