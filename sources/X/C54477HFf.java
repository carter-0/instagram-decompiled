package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.HFf  reason: case insensitive filesystem */
public final class C54477HFf extends C232502tp {
    public final Context A00;
    public final AnonymousClass0eM A01 = AnonymousClass0eN.A01(new C58176Ing(this, 44));
    public final UserSession A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54477HFf(Context context, AnonymousClass07Z r12, UserSession userSession) {
        super(context, r12, userSession, (String) null, (0sP) null, (0sP) null, 248);
        AnonymousClass7TG.A1O(context, userSession);
        this.A00 = context;
        this.A02 = userSession;
    }

    public final C251263mp A02(C62320sa r3, C62320sa r4) {
        0qQ.A0B(r3, 0);
        return new C53648Gs1(this.A02, r3);
    }

    public final int A01() {
        return C51967G9n.A01(DbX.A07(this.A01));
    }

    public final String A04() {
        return "LITHO_BOOST_UPSELL_BANNER";
    }
}
