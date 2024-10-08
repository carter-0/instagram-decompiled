package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.profile.fragment.UserDetailFragment;
import com.instagram.profile.fragment.UserDetailTabController;

/* renamed from: X.6xI  reason: invalid class name and case insensitive filesystem */
public final class C323316xI implements C323326xJ {
    public final FragmentActivity A00;
    public final UserSession A01;
    public final C323206x7 A02;
    public final UserDetailFragment A03;
    public final UserDetailTabController A04;

    public final C319866rM Bgg() {
        return this.A02.Bgg();
    }

    public final AnonymousClass710 BhL() {
        return this.A02.BhL();
    }

    public final AnonymousClass71F BwV() {
        return this.A02.BwV();
    }

    public C323316xI(FragmentActivity fragmentActivity, UserSession userSession, C323206x7 r3, UserDetailFragment userDetailFragment, UserDetailTabController userDetailTabController) {
        this.A04 = userDetailTabController;
        this.A03 = userDetailFragment;
        this.A00 = fragmentActivity;
        this.A01 = userSession;
        this.A02 = r3;
    }
}
