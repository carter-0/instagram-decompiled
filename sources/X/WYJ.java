package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import com.instagram.android.R;
import com.instagram.business.promote.model.PromoteLaunchOrigin;
import com.instagram.common.session.UserSession;
import com.instagram.mainactivity.InstagramMainActivity;

public final class WYJ implements MVB {
    public final /* synthetic */ C16678UzE A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ 1Xj A02;
    public final /* synthetic */ InstagramMainActivity A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;

    public final void onDismiss() {
    }

    public final /* synthetic */ void onTextClick(View view) {
    }

    public WYJ(C16678UzE uzE, UserSession userSession, 1Xj r3, InstagramMainActivity instagramMainActivity, String str, String str2) {
        this.A01 = userSession;
        this.A00 = uzE;
        this.A04 = str;
        this.A02 = r3;
        this.A05 = str2;
        this.A03 = instagramMainActivity;
    }

    public final void onShow() {
        WGU A002 = WGU.A00(this.A01);
        C16678UzE uzE = this.A00;
        String str = this.A04;
        A002.A01 = "home_screen";
        A002.A0H(uzE, str);
    }

    public final void onButtonClick(View view) {
        1Yh A002 = C18138VmE.A00();
        UserSession userSession = this.A01;
        1Xj r9 = this.A02;
        String str = this.A05;
        InstagramMainActivity instagramMainActivity = this.A03;
        Fragment A012 = InstagramMainActivity.A01(instagramMainActivity);
        A012.getClass();
        0qQ.A0C(A012, "null cannot be cast to non-null type com.instagram.mainactivity.maintab.IgTabHostFragment");
        Fragment A0P = A012.getChildFragmentManager().A0P(R.id.layout_container_main);
        if (A0P != null) {
            A002.A07(A0P, (G7V) null, (PromoteLaunchOrigin) null, instagramMainActivity.A0n(), userSession, r9, str, (String) null, false);
            WGU A003 = WGU.A00(userSession);
            C16678UzE uzE = this.A00;
            String str2 = this.A04;
            A003.A01 = "home_screen";
            A003.A0F(uzE, str2);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }
}
