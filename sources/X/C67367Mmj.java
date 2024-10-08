package X;

import com.instagram.quickpromotion.intf.QuickPromotionSlot;

/* renamed from: X.Mmj  reason: case insensitive filesystem */
public final class C67367Mmj implements C230942qc {
    public final /* synthetic */ AnonymousClass32L A00;

    public C67367Mmj(AnonymousClass32L r1) {
        this.A00 = r1;
    }

    public final void Cyu(AnonymousClass4UE r9) {
        AnonymousClass4UE r5 = r9;
        0qQ.A0B(r9, 0);
        AnonymousClass32L r1 = this.A00;
        if (r1.isAdded()) {
            QuickPromotionSlot quickPromotionSlot = QuickPromotionSlot.A0R;
            C73667Phg phg = new C73667Phg(48, r9, r1);
            ((AnonymousClass2qU) r1.A0x.getValue()).A00(r1.requireActivity(), r1.getSession(), r5, quickPromotionSlot, phg);
        }
    }
}
