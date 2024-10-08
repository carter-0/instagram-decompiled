package X;

import com.instagram.common.session.UserSession;
import com.instagram.quickpromotion.intf.QuickPromotionSlot;

/* renamed from: X.7Lv  reason: invalid class name and case insensitive filesystem */
public final class C330207Lv implements C230942qc {
    public final /* synthetic */ AnonymousClass7VP A00;

    public C330207Lv(AnonymousClass7VP r1) {
        this.A00 = r1;
    }

    public final void Cyu(AnonymousClass4UE r9) {
        0qQ.A0B(r9, 0);
        AnonymousClass7VP r1 = this.A00;
        AnonymousClass2qU r2 = (AnonymousClass2qU) r1.A08.getValue();
        QuickPromotionSlot quickPromotionSlot = QuickPromotionSlot.A0M;
        C73665Phe phe = new C73665Phe(7, r1, r9);
        UserSession userSession = r1.A04;
        r2.A00(r1.A01.requireActivity(), userSession, r9, quickPromotionSlot, phe);
    }
}
