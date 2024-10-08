package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.user.model.User;

public final class F1l {
    public final /* synthetic */ E1U A00;

    public F1l(E1U e1u) {
        this.A00 = e1u;
    }

    public final void A00(User user) {
        2Zg r2;
        E1U e1u = this.A00;
        AnonymousClass0eM r7 = e1u.A03;
        C46474Dfc A01 = C46548Dgp.A01(AnonymousClass7TE.A0l(r7), user.getId(), "events_user_search", "clickable_profile_category");
        C323246xB r3 = null;
        if (e1u.getRootActivity() instanceof 2Zg) {
            r2 = (2Zg) e1u.getRootActivity();
        } else {
            r2 = null;
        }
        FragmentActivity activity = e1u.getActivity();
        if (activity != null) {
            r3 = new C323246xB(activity, AnonymousClass7TE.A0l(r7), r2);
        }
        Fragment A002 = C46474Dfc.A00(AnonymousClass7TE.A0l(r7), C46447Df9.A02(), A01);
        if (r3 != null) {
            r3.A03(A002, "profile", true);
            r3.A00();
        }
        1Ln r22 = e1u.A00;
        if (r22 != null) {
            r22.A0R("container_module", "clickable_profile_category");
            r22.A0R("entry_module", "recommended_user_click");
            r22.A0R("target_id", user.getId());
            r22.Cgf();
        }
    }
}
