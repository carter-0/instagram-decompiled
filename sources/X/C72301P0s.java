package X;

import android.app.Activity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.P0s  reason: case insensitive filesystem */
public final class C72301P0s implements C74444Puz {
    public final Activity A00;
    public final N4O A01;
    public final UserSession A02;
    public final C69293Nit A03 = C69293Nit.MEX_EB_LOW_DISK_SPACE_BANNER;
    public final Integer A04;

    public final N4O BTX() {
        return this.A01;
    }

    public final void D9Q() {
        UserSession userSession = this.A02;
        C69899Nu1.A00(userSession).A0I(this.A03);
        Integer num = this.A04;
        if (num != null) {
            C67458MoD.A03(new C67458MoD(userSession), AnonymousClass05K.A15, num);
        }
    }

    public final void DZK() {
        FH7.A03(this.A00, "instagram://encryptedbackups?type=settings");
        UserSession userSession = this.A02;
        C69899Nu1.A00(userSession).A0H(this.A03);
        Integer num = this.A04;
        if (num != null) {
            C67458MoD.A03(new C67458MoD(userSession), AnonymousClass05K.A15, num);
        }
    }

    public C72301P0s(Activity activity, UserSession userSession, Integer num) {
        this.A04 = num;
        this.A00 = activity;
        this.A02 = userSession;
        this.A01 = new N4O((CharSequence) AnonymousClass7TE.A16(activity, 2131966488), (CharSequence) activity.getString(2131966490), (CharSequence) activity.getString(2131966489), AnonymousClass05K.A01, (int) R.drawable.ig_illustrations_qp_warning2_refresh);
    }
}
