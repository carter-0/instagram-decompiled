package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.inbox.notes.NotesRepository;
import com.instagram.friendmap.data.FriendMapRepository;
import com.instagram.spotlight.fetch.SpotlightFetchRepository;

/* renamed from: X.49v  reason: invalid class name and case insensitive filesystem */
public final class C2615049v extends C228042kh {
    public final UserSession A00;
    public final String A01;

    public C2615049v(UserSession userSession, String str) {
        0qQ.A0B(userSession, 1);
        0qQ.A0B(str, 2);
        this.A00 = userSession;
        this.A01 = str;
    }

    public final /* bridge */ /* synthetic */ 2YL create() {
        UserSession userSession = this.A00;
        C2615249x A002 = C2615149w.A00(userSession);
        NotesRepository A003 = AnonymousClass43C.A00(userSession);
        FriendMapRepository A004 = AnonymousClass4A3.A00(userSession);
        SpotlightFetchRepository A005 = AnonymousClass4A7.A00(userSession);
        0qQ.A07(A005);
        return new C2614949u(userSession, AnonymousClass4JJ.A00(userSession), A003, A002, A004, A005, this.A01);
    }
}
