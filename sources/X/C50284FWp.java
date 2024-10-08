package X;

import com.instagram.profile.fragment.UserDetailFragment;
import com.instagram.profile.fragment.UserDetailTabController;

/* renamed from: X.FWp  reason: case insensitive filesystem */
public final class C50284FWp implements 27S {
    public final /* synthetic */ UserDetailFragment A00;

    public C50284FWp(UserDetailFragment userDetailFragment) {
        this.A00 = userDetailFragment;
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A03 = AnonymousClass0fD.A03(532915697);
        int A032 = AnonymousClass0fD.A03(1712259001);
        UserDetailTabController userDetailTabController = this.A00.A0z;
        C322686wF r1 = userDetailTabController.A0O;
        AnonymousClass723 A02 = r1.A02(r1.A01("profile_clips"));
        if (A02 != null) {
            A02.Daz(userDetailTabController);
        }
        AnonymousClass0fD.A0A(807726235, A032);
        AnonymousClass0fD.A0A(1048805943, A03);
    }

    public final /* bridge */ /* synthetic */ boolean A72(Object obj) {
        return true;
    }
}
