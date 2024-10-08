package X;

import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.6cE  reason: invalid class name and case insensitive filesystem */
public final class C311156cE implements C310726bW {
    public final C250603lj A00;
    public final C250603lj A01;

    public final void ABc(C2354830a r1, C2354830a r2, C255773uh r3, C250973mM r4) {
    }

    public final void ABe(C2354830a r2, C2354830a r3, C255773uh r4, C250973mM r5) {
        0qQ.A0B(r2, 2);
        r2.A00(this.A00);
    }

    public final void ABh(View view, C2354830a r3, C2354830a r4, C255773uh r5, C250973mM r6) {
        0qQ.A0B(r3, 3);
        r3.A00(this.A01);
    }

    public C311156cE(C310696bT r4, C310666bQ r5) {
        C311176cG r2 = C311166cF.A08;
        UserSession userSession = r5.A01;
        this.A01 = r2.A00(userSession, r4, AnonymousClass05K.A00);
        this.A00 = r2.A00(userSession, r4, AnonymousClass05K.A01);
    }
}
