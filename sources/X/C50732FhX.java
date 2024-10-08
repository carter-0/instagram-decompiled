package X;

import com.instagram.common.session.UserSession;
import com.instagram.newsfeed.fragment.NewsfeedFragment;
import com.instagram.quickpromotion.intf.QuickPromotionSlot;

/* renamed from: X.FhX  reason: case insensitive filesystem */
public final class C50732FhX implements C230942qc {
    public final /* synthetic */ NewsfeedFragment A00;
    public final /* synthetic */ AnonymousClass2qU A01;

    public C50732FhX(NewsfeedFragment newsfeedFragment, AnonymousClass2qU r2) {
        this.A01 = r2;
        this.A00 = newsfeedFragment;
    }

    public final void Cyu(AnonymousClass4UE r9) {
        0qQ.A0B(r9, 0);
        AnonymousClass2qU r2 = this.A01;
        QuickPromotionSlot quickPromotionSlot = QuickPromotionSlot.A05;
        NewsfeedFragment newsfeedFragment = this.A00;
        MJ7 mj7 = new MJ7(18, r9, newsfeedFragment);
        UserSession A0l = AnonymousClass7TE.A0l(newsfeedFragment.A0A);
        r2.A00(newsfeedFragment.requireActivity(), A0l, r9, quickPromotionSlot, mj7);
    }
}
