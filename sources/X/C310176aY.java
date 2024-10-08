package X;

import com.instagram.common.session.UserSession;
import com.instagram.quickpromotion.intf.QuickPromotionSlot;
import instagram.features.stories.fragment.ReelViewerFragment;

/* renamed from: X.6aY  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C310176aY implements C230942qc {
    public final /* synthetic */ ReelViewerFragment A00;

    public /* synthetic */ C310176aY(ReelViewerFragment reelViewerFragment) {
        this.A00 = reelViewerFragment;
    }

    public final void Cyu(AnonymousClass4UE r7) {
        ReelViewerFragment reelViewerFragment = this.A00;
        if (reelViewerFragment.A0i != null) {
            reelViewerFragment.CLU();
            AnonymousClass2qU r0 = reelViewerFragment.A0i;
            QuickPromotionSlot quickPromotionSlot = QuickPromotionSlot.A18;
            C51604Fws fws = new C51604Fws(r7, reelViewerFragment);
            UserSession session = reelViewerFragment.getSession();
            r0.A00(reelViewerFragment.requireActivity(), session, r7, quickPromotionSlot, fws);
        }
    }
}
