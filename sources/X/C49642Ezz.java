package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.Ezz  reason: case insensitive filesystem */
public final class C49642Ezz {
    public final Fragment A00;
    public final FragmentActivity A01;
    public final UserSession A02;
    public final C49399Ev1 A03;
    public final ESB A04;

    public C49642Ezz(Fragment fragment, UserSession userSession, ESB esb, C49399Ev1 ev1) {
        this.A02 = userSession;
        this.A00 = fragment;
        FragmentActivity activity = fragment.getActivity();
        activity.getClass();
        this.A01 = activity;
        this.A03 = ev1;
        this.A04 = esb;
    }
}
