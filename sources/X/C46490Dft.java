package X;

import com.instagram.quickpromotion.intf.QuickPromotionSlot;

/* renamed from: X.Dft  reason: case insensitive filesystem */
public final class C46490Dft implements C230942qc {
    public final /* synthetic */ C273624mt A00;

    public C46490Dft(C273624mt r1) {
        this.A00 = r1;
    }

    public final void Cyu(AnonymousClass4UE r9) {
        AnonymousClass4UE r5 = r9;
        0qQ.A0B(r9, 0);
        C273624mt r1 = this.A00;
        AnonymousClass2qU r2 = r1.A0B;
        if (r2 != null) {
            QuickPromotionSlot quickPromotionSlot = QuickPromotionSlot.A0J;
            C73916Plr plr = new C73916Plr(9, r9, r1);
            r2.A00(r1.requireActivity(), C273624mt.A01(r1), r5, quickPromotionSlot, plr);
        }
    }
}
