package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

public final class L9R {
    public final Context A00;
    public final AnonymousClass4DH A01;
    public final AnonymousClass0iw A02;
    public final UserSession A03;
    public final AnonymousClass0eM A04;

    public L9R(AnonymousClass4DH r7, UserSession userSession) {
        0qQ.A0B(userSession, 2);
        this.A01 = r7;
        this.A03 = userSession;
        C66302MMl mMl = new C66302MMl(this, 14);
        AnonymousClass0eM A012 = C66302MMl.A01(new C66302MMl(r7, 11), 0eO.A02, 12);
        this.A04 = DbS.A0I(new C66302MMl(A012, 13), mMl, C66304MMn.A01(A012, (Object) null, 42), DbS.A0z(C60213JhW.class));
        this.A00 = r7.requireContext();
        this.A02 = r7;
        DbZ.A1C(r7, MHB.A01(this, (AnonymousClass4D7) null, 4), ((C60213JhW) this.A04.getValue()).A04);
    }
}
