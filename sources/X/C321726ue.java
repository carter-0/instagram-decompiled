package X;

import com.instagram.api.schemas.ProfileGridItemTypeEnum;
import com.instagram.model.reels.Reel;
import com.instagram.profile.fragment.UserDetailFragment;
import com.instagram.profile.fragment.UserDetailTabController;

/* renamed from: X.6ue  reason: invalid class name and case insensitive filesystem */
public final class C321726ue implements AnonymousClass36F {
    public 1Xj A00;
    public final /* synthetic */ UserDetailFragment A01;

    public C321726ue(UserDetailFragment userDetailFragment) {
        this.A01 = userDetailFragment;
    }

    public final boolean AJb(1Xj r6) {
        this.A00 = r6;
        UserDetailTabController userDetailTabController = this.A01.A0z;
        C294255m9 A0B = userDetailTabController.A0B();
        if (A0B == null) {
            return false;
        }
        WZN wzn = userDetailTabController.A02;
        if (wzn == null || !userDetailTabController.A0D || A0B != C294255m9.A09) {
            C322706wH r0 = userDetailTabController.A0Q;
            C294265mA r1 = A0B.A00;
            0qQ.A0B(r6, 0);
            return ((C322736wK) r0.A03.get(r1)).A02.A0B(r6);
        }
        C294265mA r3 = A0B.A00;
        0qQ.A0B(r3, 0);
        0qQ.A0B(r6, 1);
        return WZN.A00(wzn, r3).A07.A0B(new C17884Vhb(ProfileGridItemTypeEnum.MEDIA, r6, (Reel) null));
    }

    public final void DQv(1Xj r4) {
        UserDetailTabController userDetailTabController = this.A01.A0z;
        C294255m9 A0B = userDetailTabController.A0B();
        if (A0B == null) {
            return;
        }
        if (!userDetailTabController.A0D || A0B != C294255m9.A09) {
            C322706wH r0 = userDetailTabController.A0Q;
            C322736wK.A00((C322736wK) r0.A03.get(A0B.A00));
        }
    }
}
