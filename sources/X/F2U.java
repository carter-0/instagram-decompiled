package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

public final class F2U {
    public final E6C A00;
    public final Context A01;
    public final AnonymousClass07i A02;
    public final UserSession A03;

    public final void A00() {
        1NY A0b = AnonymousClass7TG.A0b(this.A03);
        A0b.A0A("commerce/purchase_protection/");
        A0b.A0Q(DvO.class, C49799F7k.class);
        Context context = this.A01;
        AnonymousClass07i r2 = this.A02;
        1OC A0M = A0b.A0M();
        C47696EDf.A01(A0M, this, 39);
        1ES.A00(context, r2, A0M);
    }

    public F2U(Context context, AnonymousClass07i r2, UserSession userSession, E6C e6c) {
        this.A01 = context;
        this.A03 = userSession;
        this.A02 = r2;
        this.A00 = e6c;
    }
}
