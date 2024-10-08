package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.quickpromotion.intf.QuickPromotionSlot;
import java.util.Map;

/* renamed from: X.EPi  reason: case insensitive filesystem */
public final class C47976EPi extends C47978EPk {
    public final /* synthetic */ E6w A00;

    public final void DbI(AnonymousClass4UE r3, Integer num, Map map) {
        0qQ.A0B(r3, 0);
        super.DbI(r3, num, (Map) null);
        View view = this.A00.A00;
        if (view == null) {
            0qQ.A0F("megaphoneView");
            throw AnonymousClass00P.createAndThrow();
        } else {
            view.setVisibility(0);
        }
    }

    public final void DbJ(AnonymousClass4UE r3) {
        0qQ.A0B(r3, 0);
        super.DbJ(r3);
        View view = this.A00.A00;
        if (view == null) {
            0qQ.A0F("megaphoneView");
            throw AnonymousClass00P.createAndThrow();
        } else {
            view.setVisibility(0);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C47976EPi(UserSession userSession, E6w e6w, QuickPromotionSlot quickPromotionSlot) {
        super(e6w, e6w, userSession, quickPromotionSlot);
        this.A00 = e6w;
    }
}
