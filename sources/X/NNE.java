package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.inbox.notes.NotesRepository;
import com.instagram.direct.inbox.notes.reply.QuickReplySheetContent;
import com.instagram.friendmap.data.FriendMapRepository;

public final class NNE extends C228042kh {
    public final long A00;
    public final UserSession A01;
    public final QuickReplySheetContent A02;
    public final String A03;

    public NNE(UserSession userSession, QuickReplySheetContent quickReplySheetContent, String str, long j) {
        0qQ.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = j;
        this.A03 = str;
        this.A02 = quickReplySheetContent;
    }

    public final /* bridge */ /* synthetic */ 2YL create() {
        UserSession userSession = this.A01;
        NotesRepository A002 = AnonymousClass43C.A00(userSession);
        AnonymousClass4JK A003 = AnonymousClass4JJ.A00(userSession);
        FriendMapRepository A004 = AnonymousClass4A3.A00(userSession);
        long j = this.A00;
        return new C67755MuA(userSession, A003, A002, this.A02, A004, this.A03, j);
    }
}
