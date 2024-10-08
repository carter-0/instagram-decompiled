package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

public final class EyE {
    public final FragmentActivity A00;
    public final UserSession A01;
    public final Fragment A02;

    public EyE(Fragment fragment, UserSession userSession) {
        0qQ.A0B(userSession, 2);
        this.A02 = fragment;
        this.A01 = userSession;
        this.A00 = fragment.requireActivity();
    }
}
