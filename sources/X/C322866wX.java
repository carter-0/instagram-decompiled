package X;

import com.instagram.common.session.UserSession;
import com.instagram.profile.fragment.UserDetailTabController;

/* renamed from: X.6wX  reason: invalid class name and case insensitive filesystem */
public final class C322866wX implements C322876wY {
    public final /* synthetic */ UserDetailTabController A00;
    public final /* synthetic */ boolean A01;

    public C322866wX(UserDetailTabController userDetailTabController, boolean z) {
        this.A00 = userDetailTabController;
        this.A01 = z;
    }

    public final void DvZ(int i, String str) {
        UserSession userSession = this.A00.A0M;
        boolean z = this.A01;
        0qQ.A0B(userSession, 0);
        02m.A0p.markerStart(18290511);
        02m.A0p.markerAnnotate(18290511, "self_profile", z);
        02m.A0p.markerAnnotate(18290511, "update_count", i);
        02m.A0p.markerAnnotate(18290511, "update_reason", str);
    }
}
