package X;

import com.google.android.material.appbar.AppBarLayout;
import com.instagram.profile.fragment.UserDetailFragment;
import com.instagram.profile.fragment.UserDetailTabController;
import com.instagram.ui.animation.pushlayout.PushDynamicCoordinatorLayout;
import java.util.HashSet;

/* renamed from: X.6wC  reason: invalid class name and case insensitive filesystem */
public final class C322656wC implements C324246ys {
    public int A00 = 0;
    public final /* synthetic */ UserDetailTabController A01;

    public C322656wC(UserDetailTabController userDetailTabController) {
        this.A01 = userDetailTabController;
    }

    public final void DUz(AppBarLayout appBarLayout, int i) {
        Integer num;
        C319006pt r0;
        UserDetailTabController userDetailTabController = this.A01;
        C323756y3 r02 = userDetailTabController.mViewHolder;
        if (r02 != null) {
            boolean z = userDetailTabController.A0B;
            Integer num2 = userDetailTabController.A05;
            int A002 = AnonymousClass3D4.A00(r02.A0H.getContext()) + userDetailTabController.mViewHolder.A0C.getMeasuredHeight();
            if (!userDetailTabController.A0b) {
                A002 = 0;
            }
            0qQ.A0B(appBarLayout, 0);
            int totalScrollRange = appBarLayout.getTotalScrollRange() - A002;
            if (i == 0) {
                num = AnonymousClass05K.A01;
            } else if (Math.abs(i) >= totalScrollRange) {
                num = AnonymousClass05K.A00;
            } else {
                num = AnonymousClass05K.A0C;
            }
            userDetailTabController.A05 = num;
            Integer num3 = AnonymousClass05K.A00;
            boolean z2 = false;
            if (num == num3) {
                z2 = true;
            }
            userDetailTabController.A0B = z2;
            if (z2 != z) {
                if (!z2) {
                    C322616w8 r03 = userDetailTabController.A0U;
                    String A0C = userDetailTabController.A0C();
                    HashSet hashSet = r03.A03;
                    hashSet.clear();
                    for (AnonymousClass724 r1 : r03.A04) {
                        if (!r1.BhI().equals(A0C)) {
                            r1.DhR(false);
                        }
                        hashSet.add(r1.BhI());
                    }
                }
                UserDetailTabController.A06(userDetailTabController, false);
            }
            if (i != 0) {
                UserDetailFragment userDetailFragment = userDetailTabController.A04.A00;
                UserDetailFragment.A0X(userDetailFragment, 1sa.A00(new Object[]{C323616xn.NOT_TRIGGERED}), Double.valueOf(182.A00(0Tu.A05, userDetailFragment.A0I, 37169974124544512L)).longValue());
            }
            userDetailTabController.mViewHolder.A0F.setIgnoreAdapterUpdates(userDetailTabController.A0B);
            int i2 = this.A00 - i;
            this.A00 = i;
            C322616w8 r12 = userDetailTabController.A0U;
            PushDynamicCoordinatorLayout pushDynamicCoordinatorLayout = userDetailTabController.mViewHolder.A0H;
            for (AnonymousClass724 DWI : r12.A04) {
                DWI.DWI(i2, pushDynamicCoordinatorLayout);
            }
            Integer num4 = userDetailTabController.A05;
            if (num2 != num4 && (r0 = userDetailTabController.A03) != null) {
                UserDetailFragment userDetailFragment2 = r0.A00;
                if (num4 == AnonymousClass05K.A01) {
                    userDetailFragment2.A1j = false;
                    if (userDetailFragment2.A0z.A0P.A0g.A0G) {
                        userDetailFragment2.A0z("chaining_button");
                    }
                } else if (num4 == num3) {
                    userDetailFragment2.A1j = true;
                    userDetailFragment2.A1W = false;
                }
            }
        }
    }
}
