package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.VZq  reason: case insensitive filesystem */
public final class C17537VZq {
    public boolean A00;
    public final FragmentActivity A01;
    public final UserSession A02;
    public final AnonymousClass4DU A03;
    public final String A04;

    public C17537VZq(Fragment fragment, UserSession userSession, AnonymousClass4DU r4, String str) {
        C51972G9s.A1D(userSession, str);
        this.A03 = r4;
        this.A02 = userSession;
        this.A04 = str;
        FragmentActivity activity = fragment.getActivity();
        if (activity != null) {
            this.A01 = activity;
            return;
        }
        throw AnonymousClass7TE.A0y();
    }
}
