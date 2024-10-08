package X;

import com.instagram.api.schemas.ProfileGridItemTypeEnum;
import com.instagram.model.reels.Reel;
import com.instagram.profile.fragment.UserDetailFragment;
import com.instagram.profile.fragment.UserDetailTabController;
import java.util.Arrays;

public final class WQX implements 1wn {
    public final /* synthetic */ UserDetailFragment A00;

    public WQX(UserDetailFragment userDetailFragment) {
        this.A00 = userDetailFragment;
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        WZM wzm;
        Integer num;
        1Xj r1;
        int A03 = AnonymousClass0fD.A03(1420403304);
        C321926uy r2 = (C321926uy) obj;
        int A032 = AnonymousClass0fD.A03(-1256535428);
        UserDetailFragment userDetailFragment = this.A00;
        if (userDetailFragment.A15()) {
            Reel reel = r2.A01;
            C17884Vhb vhb = new C17884Vhb(ProfileGridItemTypeEnum.HIGHLIGHT, (1Xj) null, reel);
            if (!r2.A02 || !userDetailFragment.A1x) {
                C17883Vha vha = userDetailFragment.A0q.A03;
                vha.A02.remove(reel.getId());
                vha.A03.remove(reel);
                UserDetailTabController userDetailTabController = userDetailFragment.A0z;
                C294265mA r12 = C294265mA.MAIN_GRID;
                WZN wzn = userDetailTabController.A02;
                if (wzn != null) {
                    wzm = WZN.A00(wzn, r12);
                    wzm.A07.A0D(vhb.A00());
                }
            } else {
                userDetailFragment.A0q.A03.A00(Arrays.asList(new Reel[]{reel}));
                UserDetailTabController userDetailTabController2 = userDetailFragment.A0z;
                C294265mA r13 = C294265mA.MAIN_GRID;
                int i = r2.A00;
                WZN wzn2 = userDetailTabController2.A02;
                if (wzn2 != null) {
                    wzm = WZN.A00(wzn2, r13);
                    int i2 = -1;
                    C15953UlV ulV = wzm.A07;
                    int i3 = 0;
                    for (Object next : ulV.A01) {
                        int i4 = i3 + 1;
                        if (i3 < 0) {
                            0sr.A1T();
                            throw AnonymousClass00P.createAndThrow();
                        }
                        C17884Vhb vhb2 = (C17884Vhb) next;
                        long j = 0;
                        if (vhb2.A01 == ProfileGridItemTypeEnum.MEDIA) {
                            1Xj r0 = vhb2.A02;
                            if (r0 != null) {
                                j = r0.A1A();
                            }
                        } else {
                            Reel reel2 = vhb2.A03;
                            if (!(reel2 == null || (num = reel2.A0i) == null)) {
                                j = (long) num.intValue();
                            }
                        }
                        if (((long) i) > j && i2 == -1 && (r1 = vhb2.A02) != null && !r1.A6h(wzm.A02.A06)) {
                            i2 = i3;
                        }
                        i3 = i4;
                    }
                    if (i2 != -1) {
                        AnonymousClass2rW.A01(ulV, vhb, i2, true);
                    }
                }
            }
            WZM.A00(wzm);
        }
        AnonymousClass0fD.A0A(-1427743296, A032);
        AnonymousClass0fD.A0A(-912054914, A03);
    }
}
