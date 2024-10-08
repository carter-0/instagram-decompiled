package X;

import com.instagram.common.session.UserSession;
import com.instagram.mediakit.repository.MediaKitRepository;

/* renamed from: X.KCu  reason: case insensitive filesystem */
public final class C61567KCu extends C228042kh {
    public final UserSession A00;
    public final MXF A01;

    public C61567KCu(UserSession userSession, MXF mxf) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = mxf;
    }

    public final /* bridge */ /* synthetic */ 2YL create() {
        UserSession userSession = this.A00;
        2Dm A002 = 1bJ.A00(userSession);
        MXF mxf = this.A01;
        LDW BO3 = mxf.BO3();
        AnonymousClass7TF.A1H(userSession, BO3);
        return new C60245Ji2(userSession, A002, mxf, (MediaKitRepository) userSession.A01(MediaKitRepository.class, MMW.A00(BO3, userSession, 0)));
    }
}
