package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.GoalsToastInfo;
import com.instagram.common.session.UserSession;

public final class Fd6 implements MVB {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ GoalsToastInfo A01;
    public final /* synthetic */ UserSession A02;

    public final void onDismiss() {
    }

    public final void onShow() {
    }

    public final /* synthetic */ void onTextClick(View view) {
    }

    public Fd6(FragmentActivity fragmentActivity, GoalsToastInfo goalsToastInfo, UserSession userSession) {
        this.A01 = goalsToastInfo;
        this.A00 = fragmentActivity;
        this.A02 = userSession;
    }

    public final void onButtonClick(View view) {
        String Avk = this.A01.Avk();
        if (Avk != null) {
            FragmentActivity fragmentActivity = this.A00;
            UserSession userSession = this.A02;
            if (00p.A0k(Avk, "instagram://bloks_screen_query", false)) {
                C48720Ej5.A00(fragmentActivity, DbT.A09(Avk), userSession);
            } else if (Avk.startsWith(C66579MXk.A00(64))) {
                FFC.A03(userSession, fragmentActivity, Avk);
            } else if (AnonymousClass5FF.A00(fragmentActivity, userSession, Avk)) {
                FH7.A03(fragmentActivity, Avk);
            }
        }
    }
}
