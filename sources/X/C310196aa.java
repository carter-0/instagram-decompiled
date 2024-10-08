package X;

import com.instagram.common.session.UserSession;
import instagram.features.stories.fragment.ReelViewerFragment;

/* renamed from: X.6aa  reason: invalid class name and case insensitive filesystem */
public final class C310196aa implements C310206ab {
    public final UserSession A00;
    public final C273384mU A01;

    public C310196aa(UserSession userSession, C273384mU r3) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = r3;
    }

    public final void Ddb(String str) {
        C313056fm r2 = ((ReelViewerFragment) this.A01).mViewPager;
        if (r2 != null) {
            r2.EJb(new C58738Iwl(str, this, 12));
        }
    }
}
