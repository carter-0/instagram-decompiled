package X;

import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.util.fragment.IgFragmentFactoryImpl;

public final class FAF {
    public final Fragment A00;
    public final boolean A01;
    public final UserSession A02;

    public static void A00(FAF faf, String str) {
        C309516Yo A0M = DbS.A0M(faf.A00.requireActivity(), faf.A02);
        IgFragmentFactoryImpl.A00();
        F3W f3w = new F3W();
        f3w.A0B = str;
        A0M.A0E(f3w.A01());
        A0M.A04();
    }

    public FAF(Fragment fragment, UserSession userSession, boolean z) {
        this.A00 = fragment;
        this.A02 = userSession;
        this.A01 = z;
    }
}
