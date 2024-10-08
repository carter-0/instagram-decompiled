package X;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

public final class FNO implements View.OnClickListener {
    public final /* synthetic */ Fragment A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C273004lm A02;

    public FNO(Fragment fragment, UserSession userSession, C273004lm r3) {
        this.A02 = r3;
        this.A01 = userSession;
        this.A00 = fragment;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(-1143267053);
        C273004lm r0 = this.A02;
        UserSession userSession = this.A01;
        String str = userSession.A06;
        0Aj A0e = AnonymousClass7TE.A0e(r0.A00, "subscription_notification_deferral_profile_banner_view_cta");
        DbS.A1O(A0e, "profile");
        DbY.A1G(A0e, str);
        A0e.AAJ("origin", "PROFILE");
        A0e.Cgf();
        FC8.A00();
        E42 e42 = new E42();
        Bundle A0B = DbY.A0B("origin", "PROFILE");
        C227642jf.A03(A0B, userSession);
        e42.setArguments(A0B);
        Dba.A12(e42, DbW.A0H(this.A00, userSession));
        AnonymousClass0fD.A0C(1839550173, A05);
    }
}
