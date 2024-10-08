package X;

import com.instagram.common.session.UserSession;
import com.instagram.quickpromotion.intf.QuickPromotionSlot;

/* renamed from: X.EPh  reason: case insensitive filesystem */
public final class C47975EPh extends C47978EPk {
    public final /* synthetic */ E2K A00;

    public final void DbJ(AnonymousClass4UE r2) {
        0qQ.A0B(r2, 0);
        super.DbJ(r2);
        C322106vG r0 = this.A00.A01;
        if (r0 == null) {
            0qQ.A0F("controller");
            throw AnonymousClass00P.createAndThrow();
        } else {
            C322106vG.A00(r0);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C47975EPh(UserSession userSession, E2K e2k, QuickPromotionSlot quickPromotionSlot) {
        super(e2k, e2k, userSession, quickPromotionSlot);
        this.A00 = e2k;
    }
}
