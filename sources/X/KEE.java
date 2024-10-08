package X;

import com.instagram.archive.data.ArchiveStoryRepository;
import com.instagram.common.session.UserSession;

public final class KEE extends C228042kh {
    public final AnonymousClass0xx A00;
    public final UserSession A01;
    public final String A02;
    public final boolean A03;
    public final boolean A04;

    public KEE(AnonymousClass0xx r2, UserSession userSession, String str, boolean z, boolean z2) {
        0qQ.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = r2;
        this.A02 = str;
        this.A03 = z;
        this.A04 = z2;
    }

    public final /* bridge */ /* synthetic */ 2YL create() {
        C63971LGa lGa = new C63971LGa(this.A00, C51965G9l.A0l());
        UserSession userSession = this.A01;
        ArchiveStoryRepository archiveStoryRepository = new ArchiveStoryRepository(userSession);
        boolean z = this.A03;
        boolean z2 = this.A04;
        String str = this.A02;
        C64184LSr A002 = C64184LSr.A00(userSession);
        0qQ.A07(A002);
        return new C60308Jj7(A002, archiveStoryRepository, lGa, userSession, str, z, z2);
    }
}
