package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;

public final class LE0 {
    public boolean A00;
    public final Context A01;
    public final UserSession A02;
    public final AnonymousClass0eM A03;
    public final AnonymousClass0eM A04;
    public final AnonymousClass0eM A05 = MMT.A00(this, 5);
    public final AnonymousClass0eM A06;

    public LE0(Context context, View view, UserSession userSession) {
        0qQ.A0B(view, 3);
        this.A01 = context;
        this.A02 = userSession;
        this.A04 = MMT.A00(view, 4);
        this.A03 = MMT.A00(view, 3);
        this.A06 = MMT.A00(view, 6);
    }

    public final void A00() {
        ((C226472gs) AnonymousClass7TE.A14(this.A05)).stop();
        AnonymousClass7TE.A0c(this.A04).setVisibility(8);
        DbW.A1R(this.A03, 8);
        DbW.A1R(this.A06, 8);
    }
}
