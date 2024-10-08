package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.3JL  reason: invalid class name */
public final class AnonymousClass3JL implements View.OnClickListener {
    public final /* synthetic */ AnonymousClass354 A00;

    public AnonymousClass3JL(AnonymousClass354 r1) {
        this.A00 = r1;
    }

    public final void onClick(View view) {
        FragmentActivity activity;
        int A05 = AnonymousClass0fD.A05(-106571569);
        AnonymousClass354 r2 = this.A00;
        C227802jw A002 = AnonymousClass354.A00(r2);
        if (!(A002 == null || (activity = A002.getActivity()) == null)) {
            UserSession userSession = r2.A01;
            String moduleName = r2.A02.getModuleName();
            0qQ.A0B(moduleName, 2);
            C309516Yo r22 = new C309516Yo(activity, userSession);
            r22.A08();
            1a1 r1 = C46447Df9.A03().A01;
            C46474Dfc A003 = C46548Dgp.A00(userSession, "app_main_action_bar", moduleName);
            A003.A0V = true;
            r22.A0D(r1.A02(userSession, A003.A04()));
            r22.A05();
        }
        AnonymousClass0fD.A0C(-1589428046, A05);
    }
}
