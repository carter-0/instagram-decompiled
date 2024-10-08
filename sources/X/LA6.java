package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

public final class LA6 {
    public C262204Co A00;
    public final Context A01;
    public final AnonymousClass4DH A02;
    public final AnonymousClass0iw A03;
    public final UserSession A04;
    public final AnonymousClass0eM A05;

    public LA6(AnonymousClass4DH r7, UserSession userSession) {
        0qQ.A0B(userSession, 2);
        this.A02 = r7;
        this.A04 = userSession;
        C66302MMl mMl = new C66302MMl(this, 25);
        AnonymousClass0eM A012 = C66302MMl.A01(new C66302MMl(r7, 22), 0eO.A02, 23);
        this.A05 = DbS.A0I(new C66302MMl(A012, 24), mMl, C66304MMn.A01(A012, (Object) null, 44), DbS.A0z(C60214JhX.class));
        this.A01 = r7.requireContext();
        this.A03 = r7;
    }
}
