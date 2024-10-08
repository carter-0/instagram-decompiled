package X;

import com.instagram.common.session.UserSession;
import com.instagram.mediakit.repository.MediaKitRepository;

public final class KDV extends C228042kh {
    public final AnonymousClass0iw A00;
    public final UserSession A01;
    public final C62533KhP A02;

    public final /* bridge */ /* synthetic */ 2YL create() {
        UserSession userSession = this.A01;
        LDW A002 = C63313Kuw.A00(userSession);
        LAT A012 = LJF.A01(userSession);
        AnonymousClass7TF.A1H(userSession, A002);
        Class<MediaKitRepository> cls = MediaKitRepository.class;
        C62533KhP khP = this.A02;
        return new C60326JjV(this.A00, A002, khP, (MediaKitRepository) userSession.A01(cls, MMW.A00(A002, userSession, 0)), A012);
    }

    public KDV(AnonymousClass0iw r1, UserSession userSession, C62533KhP khP) {
        AnonymousClass7TG.A1O(userSession, khP);
        this.A01 = userSession;
        this.A02 = khP;
        this.A00 = r1;
    }
}
