package X;

import android.app.Activity;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.Map;

/* renamed from: X.Ls1  reason: case insensitive filesystem */
public final class C65361Ls1 implements MVB {
    public final /* synthetic */ DV3 A00;
    public final /* synthetic */ C323186x5 A01;
    public final /* synthetic */ User A02;

    public final void onDismiss() {
    }

    public final /* synthetic */ void onTextClick(View view) {
    }

    public C65361Ls1(DV3 dv3, C323186x5 r2, User user) {
        this.A01 = r2;
        this.A00 = dv3;
        this.A02 = user;
    }

    public final void onButtonClick(View view) {
        C323186x5 r0 = this.A01;
        UserSession userSession = r0.A03;
        FragmentActivity fragmentActivity = r0.A01;
        0qQ.A0C(fragmentActivity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        LTV.A0A(fragmentActivity, userSession, String.valueOf(this.A00.getFundraiserId()), "USER_PROFILE", this.A02.getId(), (String) null, true);
    }

    public final void onShow() {
        C323186x5 r5 = this.A01;
        Activity activity = r5.A01;
        UserSession userSession = r5.A03;
        DV3 dv3 = this.A00;
        LTV.A04(activity, userSession, String.valueOf(dv3.getFundraiserId()), "USER_PROFILE", this.A02.getId(), (String) null);
        1Av A002 = 1Au.A00(userSession);
        DbS.A1a(A002, String.valueOf(dv3.getFundraiserId()), A002.A6D, 1Av.A8a, 294);
        LTM.A06(r5.A02, userSession, "user_self_profile_bio_snack_bar", "USER_PROFILE", (String) null, String.valueOf(dv3.getFundraiserId()), (Map) null);
    }
}
