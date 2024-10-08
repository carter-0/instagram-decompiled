package X;

import com.instagram.api.schemas.ProfileGridItemTypeEnum;
import com.instagram.profile.fragment.UserDetailFragment;
import com.instagram.profile.fragment.UserDetailTabController;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.6x3  reason: invalid class name and case insensitive filesystem */
public final class C323166x3 implements C323176x4 {
    public final /* synthetic */ UserDetailFragment A00;

    public final boolean CZI() {
        return false;
    }

    public C323166x3(UserDetailFragment userDetailFragment) {
        this.A00 = userDetailFragment;
    }

    public final int BXA() {
        ArrayList<1Xj> arrayList;
        UserDetailFragment userDetailFragment = this.A00;
        UserDetailTabController userDetailTabController = userDetailFragment.A0z;
        C294255m9 A0B = userDetailTabController.A0B();
        if (A0B != null) {
            WZN wzn = userDetailTabController.A02;
            if (wzn == null || !userDetailTabController.A0D || A0B != C294255m9.A09) {
                C322706wH r0 = userDetailTabController.A0Q;
                C322736wK r02 = (C322736wK) r0.A03.get(A0B.A00);
                C273674n0 r1 = r02.A02;
                r1.A08(r02.A03);
                arrayList = r1.A01;
            } else {
                C294265mA r12 = A0B.A00;
                0qQ.A0B(r12, 0);
                WZM A002 = WZN.A00(wzn, r12);
                C15953UlV ulV = A002.A07;
                ulV.A08(A002.A06);
                List list = ulV.A01;
                ArrayList<C17884Vhb> arrayList2 = new ArrayList<>();
                for (Object next : list) {
                    if (((C17884Vhb) next).A01 == ProfileGridItemTypeEnum.MEDIA) {
                        arrayList2.add(next);
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                for (C17884Vhb vhb : arrayList2) {
                    1Xj r03 = vhb.A02;
                    if (r03 != null) {
                        arrayList3.add(r03);
                    }
                }
                arrayList = arrayList3;
            }
        } else {
            arrayList = null;
        }
        User user = userDetailFragment.A10.A03;
        int i = 0;
        if (!(user == null || arrayList == null)) {
            for (1Xj A6h : arrayList) {
                if (A6h.A6h(user.getId())) {
                    i++;
                }
            }
        }
        return i;
    }

    public final boolean CZH() {
        UserDetailFragment userDetailFragment = this.A00;
        if (!userDetailFragment.A15() || !"profile_clips".equals(userDetailFragment.A0z.A0C())) {
            return false;
        }
        return true;
    }

    public final boolean CZJ() {
        UserDetailFragment userDetailFragment = this.A00;
        if (!userDetailFragment.A15() || !"profile_media_grid".equals(userDetailFragment.A0z.A0C())) {
            return false;
        }
        return true;
    }
}
