package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.inbox.notes.NotesRepository;

/* renamed from: X.NMi  reason: case insensitive filesystem */
public final class C68536NMi extends C228042kh {
    public final UserSession A00;

    public C68536NMi(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
    }

    public final /* bridge */ /* synthetic */ 2YL create() {
        UserSession userSession = this.A00;
        NotesRepository A002 = AnonymousClass43C.A00(userSession);
        AnonymousClass4JK A003 = AnonymousClass4JJ.A00(userSession);
        0qQ.A0B(userSession, 0);
        return new C67761MuH(userSession, A003, A002, (C62026KWa) userSession.A01(C62026KWa.class, new C73928Pm8(userSession, 47)));
    }
}
