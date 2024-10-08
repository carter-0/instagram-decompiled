package X;

import android.app.Activity;
import android.content.DialogInterface;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

/* renamed from: X.F2d  reason: case insensitive filesystem */
public final class C49693F2d {
    public G7J A00;
    public final Fragment A01;
    public final Activity A02;
    public final DialogInterface.OnClickListener A03 = C50021FJg.A00(this, 10);
    public final UserSession A04;

    public final void A00(G7J g7j) {
        this.A00 = g7j;
        C358248ab A0X = DbS.A0X(this.A02);
        UserSession userSession = this.A04;
        Fragment fragment = this.A01;
        A0X.A0l(fragment, userSession);
        A0X.A0e(this.A03, new CharSequence[]{DbU.A0m(fragment, 2131976640), DbU.A0m(fragment, 2131969038)});
        A0X.A04();
        DbT.A1V(A0X);
    }

    public C49693F2d(Activity activity, Fragment fragment, UserSession userSession) {
        this.A02 = activity;
        this.A04 = userSession;
        this.A01 = fragment;
    }
}
