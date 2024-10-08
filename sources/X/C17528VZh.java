package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.VZh  reason: case insensitive filesystem */
public final class C17528VZh {
    public final Fragment A00;
    public final FragmentActivity A01;
    public final 0hq A02;
    public final UserSession A03;
    public final C255773uh A04;

    public C17528VZh(Fragment fragment, UserSession userSession, C255773uh r4) {
        this.A03 = userSession;
        this.A00 = fragment;
        this.A04 = r4;
        this.A02 = fragment.getParentFragmentManager();
        FragmentActivity activity = fragment.getActivity();
        if (activity != null) {
            this.A01 = activity;
            return;
        }
        throw AnonymousClass7TE.A0y();
    }
}
