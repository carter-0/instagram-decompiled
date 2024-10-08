package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

public final class M14 implements C336187eD {
    public final /* synthetic */ C64723Lh0 A00;

    public final void CpL() {
    }

    public final boolean Erh() {
        return false;
    }

    public M14(C64723Lh0 lh0) {
        this.A00 = lh0;
    }

    public final void Cqd() {
        C64723Lh0 lh0 = this.A00;
        FragmentActivity requireActivity = lh0.A09.requireActivity();
        UserSession userSession = lh0.A0A;
        FGc.A05(requireActivity, userSession);
        C49241Erk.A00(AnonymousClass0kN.A01((AnonymousClass0iw) null, userSession), userSession, (User) null, AnonymousClass000.A00(3757), "click", AnonymousClass000.A00(2769));
    }

    public final boolean Eri() {
        return AnonymousClass7TF.A1V(this.A00.A09.getActivity());
    }
}
