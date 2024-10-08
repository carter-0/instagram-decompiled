package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.quickpromotion.intf.QuickPromotionSlot;

/* renamed from: X.2qX  reason: invalid class name and case insensitive filesystem */
public final class C230912qX implements AnonymousClass2qY {
    public final /* synthetic */ C230822qK A00;

    public C230912qX(C230822qK r1) {
        this.A00 = r1;
    }

    public final void DLW(Context context, AnonymousClass4UE r9, 2bv r10, String str) {
        0qQ.A0B(r9, 1);
        C230822qK r4 = this.A00;
        C227872kC r5 = r4.A08;
        C227802jw r6 = r5.A00;
        Context context2 = r6.getContext();
        if (context2 != null && r6.A0L && !r5.A00()) {
            C234232xM.A00(r4.A04).A02 = true;
            if (r6.mView != null) {
                ((C238143As) r6.getScrollingViewProxy()).APL();
            }
            AnonymousClass2bO.A00().A06(context2, r4.A03, r9, r4.A05);
        }
        Context context3 = r6.getContext();
        if (context3 != null && r6.A0L && !r5.A00()) {
            AnonymousClass2bO.A00();
            UserSession userSession = r4.A04;
            QuickPromotionSlot quickPromotionSlot = QuickPromotionSlot.A0e;
            0qQ.A0B(quickPromotionSlot, 2);
            F7D.A01(context3, userSession, r9, quickPromotionSlot, (Integer) null);
        }
        if (r6.A0L && !r5.A00()) {
            AnonymousClass2bO.A00().A07(r9, r4.A05);
        }
    }
}
