package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

public final class LFG {
    public AnonymousClass3Q2 A00;
    public String A01;
    public final UserSession A02;
    public final 1ua A03;
    public final Context A04;

    public LFG(UserSession userSession, Context context) {
        0qQ.A0B(userSession, 1);
        this.A02 = userSession;
        this.A04 = context;
        this.A03 = JTO.A0n(context, userSession);
    }

    public final void A00() {
        AnonymousClass3Q2 r3 = this.A00;
        if (r3 != null) {
            String str = this.A01;
            if (str == null || !str.equals(r3.A33)) {
                this.A01 = r3.A33;
                AnonymousClass3QD r0 = r3.A1f;
                AnonymousClass3QD r1 = AnonymousClass3QD.UPLOADED;
                if (r0 == r1) {
                    r3.A0b(AnonymousClass3QD.UPLOADED_VIDEO);
                }
                r3.A0c(r1);
            }
        }
    }

    public final void A01(boolean z) {
        AnonymousClass3Q2 r1 = this.A00;
        if (r1 != null) {
            r1.A5g = false;
            this.A03.A06((AnonymousClass0iw) null, r1.A35, (String) null, z, true, true);
        }
        this.A00 = null;
    }
}
