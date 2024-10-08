package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.3fO  reason: invalid class name and case insensitive filesystem */
public final class C246883fO implements C246893fP {
    public final Fragment A00;
    public final UserSession A01;

    public final void Cz3() {
        AnonymousClass0iw r1 = this.A00;
        FragmentActivity activity = r1.getActivity();
        if (activity != null) {
            SUL sul = new SUL(activity, this.A01, 2EG.A0h, C273654mx.A00(14), false);
            sul.A0S = r1.getModuleName();
            sul.A0A();
        }
    }

    public C246883fO(Fragment fragment, UserSession userSession) {
        this.A01 = userSession;
        this.A00 = fragment;
    }
}
