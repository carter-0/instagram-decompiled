package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.Fgj  reason: case insensitive filesystem */
public final class C50684Fgj implements G6E {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ C331157Pu A01;
    public final /* synthetic */ Eu6 A02;
    public final /* synthetic */ String A03;

    public C50684Fgj(FragmentActivity fragmentActivity, C331157Pu r2, Eu6 eu6, String str) {
        this.A01 = r2;
        this.A02 = eu6;
        this.A00 = fragmentActivity;
        this.A03 = str;
    }

    public final void E16() {
        C331157Pu r5 = this.A01;
        UserSession userSession = this.A02.A00;
        C331127Pr A0W = DbS.A0W(userSession);
        DbZ.A0z(this.A00, A0W, 2131964080);
        C46447Df9.A03();
        String str = this.A03;
        Bundle A09 = DbY.A09(userSession);
        A09.putString("ProfileLiveNotificationsSettingsFragment.ARG_DISPLAYED_USER_ID", str);
        C47419E1n e1n = new C47419E1n();
        e1n.setArguments(A09);
        r5.A0F(e1n, A0W);
    }
}
