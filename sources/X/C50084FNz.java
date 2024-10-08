package X;

import android.app.Activity;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.FNz  reason: case insensitive filesystem */
public final class C50084FNz implements View.OnClickListener {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ 0xG A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ AnonymousClass3FW A03;

    public C50084FNz(Activity activity, 0xG r2, UserSession userSession, AnonymousClass3FW r4) {
        this.A02 = userSession;
        this.A01 = r2;
        this.A03 = r4;
        this.A00 = activity;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(-105758530);
        UserSession userSession = this.A02;
        0xG r0 = this.A01;
        AnonymousClass7TG.A1N(userSession, r0);
        DcM.A03(new DcM(r0, userSession), this.A03.A03(2Aq.A03(userSession).A0O()), "ig_quiet_mode_self_profile_indicator_tap", "self_profile");
        Activity activity = this.A00;
        DbS.A1X(activity);
        0qQ.A0B(activity, 1);
        DbW.A0T(userSession).A02(activity, new ERY());
        AnonymousClass0iw r02 = C46359DdX.A00;
        AnonymousClass7TG.A1N(userSession, r02);
        DcM.A03(new DcM(r02, userSession), Dba.A0Q(new AnonymousClass3FW(userSession)), "ig_quiet_mode_self_profile_bottom_sheet_shown", "self_profile");
        AnonymousClass0fD.A0C(994963349, A05);
    }
}
