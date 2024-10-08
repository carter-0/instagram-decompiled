package X;

import com.instagram.common.session.UserSession;
import com.instagram.profile.fragment.UserDetailFragment;
import com.instagram.quickpromotion.intf.QuickPromotionSlot;

/* renamed from: X.Mfi  reason: case insensitive filesystem */
public final /* synthetic */ class C66949Mfi implements C230942qc {
    public final /* synthetic */ UserDetailFragment A00;
    public final /* synthetic */ QuickPromotionSlot A01;

    public /* synthetic */ C66949Mfi(UserDetailFragment userDetailFragment, QuickPromotionSlot quickPromotionSlot) {
        this.A00 = userDetailFragment;
        this.A01 = quickPromotionSlot;
    }

    public final void Cyu(AnonymousClass4UE r9) {
        UserDetailFragment userDetailFragment = this.A00;
        QuickPromotionSlot quickPromotionSlot = this.A01;
        C73466Pd8 pd8 = new C73466Pd8(2, userDetailFragment, r9);
        UserSession userSession = userDetailFragment.A0I;
        userDetailFragment.A1J.A00(userDetailFragment.requireActivity(), userSession, r9, quickPromotionSlot, pd8);
    }
}
