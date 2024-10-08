package X;

import com.instagram.profile.fragment.UserDetailTabController;

/* renamed from: X.6yH  reason: invalid class name and case insensitive filesystem */
public final class C323896yH implements C267634bw {
    public final /* synthetic */ UserDetailTabController A00;

    public final void Dmb() {
    }

    public final void DnR() {
    }

    public C323896yH(UserDetailTabController userDetailTabController) {
        this.A00 = userDetailTabController;
    }

    public final void Dcp() {
        UserDetailTabController userDetailTabController = this.A00;
        C323756y3 r0 = userDetailTabController.mViewHolder;
        if (r0 != null) {
            1Jk.A08.A0J(String.valueOf(r0.A02.hashCode()), userDetailTabController.A0L.getModuleName());
            boolean z = userDetailTabController.A0A;
            C323756y3 r02 = userDetailTabController.mViewHolder;
            if (z) {
                r02.A0J.setIsLoading(true);
            } else {
                r02.A0E.A02(true);
            }
            userDetailTabController.A0W.Dcp();
        }
    }

    public final void DhP(float f, int i) {
        UserDetailTabController userDetailTabController = this.A00;
        C323756y3 r1 = userDetailTabController.mViewHolder;
        if (r1 != null) {
            AnonymousClass72p r0 = userDetailTabController.mOpalSwitchIndicatorHelper;
            if (r0 != null) {
                r0.FKx(f);
            } else if (!userDetailTabController.A0A) {
                r1.A0E.A01(f);
                userDetailTabController.mViewHolder.A03.setScaleY((float) i);
            }
        }
    }

    public final void DnQ() {
        UserDetailTabController userDetailTabController = this.A00;
        C323756y3 r0 = userDetailTabController.mViewHolder;
        if (r0 != null) {
            1Jk.A08.A0I(String.valueOf(r0.A02.hashCode()), userDetailTabController.A0L.getModuleName());
        }
        UserDetailTabController.A04(userDetailTabController);
    }
}
