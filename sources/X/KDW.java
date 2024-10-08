package X;

import com.instagram.common.session.UserSession;
import com.instagram.mediakit.repository.MediaKitRepository;
import com.instagram.monetization.repository.MonetizationRepository;

public final class KDW extends C228042kh {
    public final AnonymousClass0iw A00;
    public final UserSession A01;
    public final LDW A02;

    public final /* bridge */ /* synthetic */ 2YL create() {
        UserSession userSession = this.A01;
        0qQ.A0B(userSession, 0);
        Class<L9D> cls = L9D.class;
        LDW ldw = this.A02;
        AnonymousClass7TF.A1H(userSession, ldw);
        Class<MediaKitRepository> cls2 = MediaKitRepository.class;
        MonetizationRepository A002 = AnonymousClass2o3.A00(userSession);
        LC9 A003 = C63322Kv5.A00(userSession);
        2Dm A004 = 1bJ.A00(userSession);
        return new C60327JjW(this.A00, userSession, A004, ldw, (L9D) userSession.A01(cls, MML.A00(userSession, 26)), A003, (MediaKitRepository) userSession.A01(cls2, MMW.A00(ldw, userSession, 0)), A002);
    }

    public /* synthetic */ KDW(AnonymousClass0iw r2, UserSession userSession) {
        LDW A002 = C63313Kuw.A00(userSession);
        AnonymousClass7TG.A1P(userSession, A002);
        this.A01 = userSession;
        this.A00 = r2;
        this.A02 = A002;
    }
}
