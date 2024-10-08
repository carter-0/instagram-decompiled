package X;

import com.instagram.api.schemas.ProfileGridItemTypeEnum;
import com.instagram.model.reels.Reel;
import com.instagram.profile.fragment.UserDetailFragment;
import com.instagram.profile.fragment.UserDetailTabController;

public final class WQY implements 1wn {
    public final /* synthetic */ UserDetailFragment A00;

    public WQY(UserDetailFragment userDetailFragment) {
        this.A00 = userDetailFragment;
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A03 = AnonymousClass0fD.A03(1683805130);
        C321936uz r9 = (C321936uz) obj;
        int A032 = AnonymousClass0fD.A03(2126367135);
        UserDetailFragment userDetailFragment = this.A00;
        if (userDetailFragment.A15()) {
            Reel reel = r9.A00;
            C17884Vhb vhb = new C17884Vhb(ProfileGridItemTypeEnum.HIGHLIGHT, (1Xj) null, reel);
            C17883Vha vha = userDetailFragment.A0q.A03;
            vha.A02.remove(reel.getId());
            vha.A03.remove(reel);
            UserDetailTabController userDetailTabController = userDetailFragment.A0z;
            C294265mA r1 = C294265mA.MAIN_GRID;
            WZN wzn = userDetailTabController.A02;
            if (wzn != null) {
                WZM A002 = WZN.A00(wzn, r1);
                A002.A07.A0D(vhb.A00());
                WZM.A00(A002);
            }
        }
        AnonymousClass0fD.A0A(-986212105, A032);
        AnonymousClass0fD.A0A(1651561518, A03);
    }
}
