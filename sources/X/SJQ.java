package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

public final class SJQ {
    public final UserSession A00;

    public final void A00(Context context, C270254gR r5, S0G s0g) {
        0qQ.A0B(s0g, 2);
        if (context != null && AnonymousClass7TE.A0q(this.A00).getBoolean("autofill_internal_bloks_prefetch_enabled", true) && RUL.A00(r5.A03, new C13347TVu((Object) r5, 40))) {
            SPC.A00.A01(r5, s0g);
        }
    }

    public final void A02(Context context, C270254gR r5, S0G s0g) {
        0qQ.A0B(s0g, 2);
        if (context != null && AnonymousClass7TE.A0q(this.A00).getBoolean("autofill_internal_bloks_prefetch_enabled", true) && RUL.A00(r5.A03, new C13347TVu((Object) r5, 42))) {
            SPC.A00.A03(r5, s0g);
        }
    }

    public SJQ(UserSession userSession) {
        this.A00 = userSession;
    }

    public final void A01(Context context, C270254gR r5, S0G s0g) {
        AnonymousClass7TG.A1O(r5, s0g);
        if (context != null && AnonymousClass7TE.A0q(this.A00).getBoolean("autofill_internal_bloks_prefetch_enabled", true) && RUL.A00(r5.A03, new C13347TVu((Object) r5, 41))) {
            SPC.A00.A02(r5, s0g);
        }
    }

    public final void A03(Context context, C270254gR r5, S0G s0g) {
        AnonymousClass7TG.A1O(r5, s0g);
        if (context != null && AnonymousClass7TE.A0q(this.A00).getBoolean("autofill_internal_bloks_prefetch_enabled", true) && RUL.A00(r5.A03, new C13347TVu((Object) r5, 43))) {
            SPC.A00.A04(r5, s0g);
        }
    }

    public SJQ() {
    }
}
