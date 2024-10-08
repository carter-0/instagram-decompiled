package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.quickpromotion.intf.QuickPromotionSlot;

/* renamed from: X.30u  reason: invalid class name and case insensitive filesystem */
public final class C2356830u implements C230942qc {
    public final /* synthetic */ C2356730t A00;
    public final /* synthetic */ AnonymousClass4DH A01;

    public C2356830u(C2356730t r1, AnonymousClass4DH r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void Cyu(AnonymousClass4UE r9) {
        0qQ.A0B(r9, 0);
        C2356730t r1 = this.A00;
        AnonymousClass2qU r2 = r1.A02;
        QuickPromotionSlot quickPromotionSlot = QuickPromotionSlot.A0Z;
        MMX mmx = new MMX(5, (Object) r9, (Object) r1);
        UserSession userSession = r1.A00;
        FragmentActivity activity = this.A01.getActivity();
        0qQ.A0C(activity, "null cannot be cast to non-null type android.app.Activity");
        r2.A00(activity, userSession, r9, quickPromotionSlot, mmx);
    }
}
