package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

public final class GPQ extends C314066hb {
    public C2366634p A00;
    public C2366634p A01;
    public boolean A02;
    public boolean A03;
    public final GPR A04;

    public final void A0M() {
        this.A02 = true;
        super.A0M();
    }

    public final void A05() {
        GPR gpr = this.A04;
        gpr.A01.remove(Integer.valueOf(gpr.A00));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GPQ(Context context, UserSession userSession, GPR gpr) {
        super(context, userSession, 749803224);
        AnonymousClass7TG.A1O(userSession, context);
        this.A04 = gpr;
        this.A04 = false;
    }
}
