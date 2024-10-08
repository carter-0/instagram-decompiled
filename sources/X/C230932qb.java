package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.quickpromotion.intf.QuickPromotionSlot;

/* renamed from: X.2qb  reason: invalid class name and case insensitive filesystem */
public final class C230932qb implements C230942qc {
    public final /* synthetic */ C227802jw A00;
    public final /* synthetic */ C230822qK A01;

    public C230932qb(C227802jw r1, C230822qK r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void Cyu(AnonymousClass4UE r9) {
        0qQ.A0B(r9, 0);
        C230822qK r1 = this.A01;
        AnonymousClass2qU r2 = r1.A06;
        QuickPromotionSlot quickPromotionSlot = QuickPromotionSlot.A0e;
        C58692Iw1 iw1 = new C58692Iw1(48, r9, r1);
        UserSession userSession = r1.A04;
        FragmentActivity activity = this.A00.getActivity();
        0qQ.A0C(activity, "null cannot be cast to non-null type android.app.Activity");
        r2.A00(activity, userSession, r9, quickPromotionSlot, iw1);
    }
}
