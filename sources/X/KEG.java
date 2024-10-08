package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.inbox.notes.NotesRepository;

public final class KEG extends C228042kh {
    public final UserSession A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final boolean A04;

    public KEG(UserSession userSession, String str, String str2, String str3, boolean z) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
        this.A02 = str;
        this.A03 = str2;
        this.A01 = str3;
        this.A04 = z;
    }

    public final /* bridge */ /* synthetic */ 2YL create() {
        UserSession userSession = this.A00;
        String str = this.A02;
        String str2 = this.A03;
        String str3 = this.A01;
        boolean z = this.A04;
        NotesRepository A002 = AnonymousClass43C.A00(userSession);
        0qQ.A0B(userSession, 0);
        return new C60261JiI(userSession, new C62033KWl(userSession), A002, new C62034KWm(userSession), str, str2, str3, z);
    }
}
