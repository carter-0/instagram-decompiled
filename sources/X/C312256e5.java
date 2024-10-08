package X;

import com.instagram.common.session.UserSession;
import com.instagram.feed.media.CreativeConfigIntf;
import instagram.features.stories.fragment.ReelViewerFragment;

/* renamed from: X.6e5  reason: invalid class name and case insensitive filesystem */
public final class C312256e5 implements C312266e6 {
    public final UserSession A00;
    public final C273384mU A01;

    public final void De5(String str) {
    }

    public final void De6() {
    }

    public final void EDY(String str) {
    }

    public final void DBd(boolean z, String str) {
        C255773uh A08;
        1Xj r2;
        CreativeConfigIntf AsO;
        C250973mM r1 = ((ReelViewerFragment) this.A01).A0a;
        if (r1 != null && (A08 = r1.A08(this.A00)) != null && (r2 = A08.A0b) != null && (AsO = r2.A0C.AsO()) != null) {
            r2.A0C.ETB(C284745Nt.A02(AsO, z));
        }
    }

    public final void Dj6() {
        this.A01.EHd();
    }

    public C312256e5(UserSession userSession, C273384mU r2) {
        this.A00 = userSession;
        this.A01 = r2;
    }
}
