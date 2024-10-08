package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.4qf  reason: invalid class name and case insensitive filesystem */
public final class C275634qf extends C232502tp {
    public final Context A00;
    public final AnonymousClass0eM A01 = AnonymousClass0eN.A00(0eO.A02, new AnonymousClass9LP(this, 12));
    public final UserSession A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C275634qf(Context context, AnonymousClass07Z r13, UserSession userSession) {
        super(context, r13, userSession, (String) null, (0sP) null, (0sP) null, 248);
        0qQ.A0B(context, 1);
        0qQ.A0B(userSession, 2);
        this.A00 = context;
        this.A02 = userSession;
    }

    public final C251263mp A02(C62320sa r3, C62320sa r4) {
        0qQ.A0B(r3, 0);
        return new C248633iJ(this.A02, r3);
    }

    public final int A01() {
        int intValue = ((Number) this.A01.getValue()).intValue();
        int i = AnonymousClass3XX.A00;
        return View.MeasureSpec.makeMeasureSpec(intValue, SN3.MAX_SIGNED_POWER_OF_TWO);
    }

    public final String A04() {
        return "LITHO_SOCIAL_CONTEXT_BUBBLES";
    }
}
