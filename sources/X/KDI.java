package X;

import com.instagram.common.session.UserSession;
import com.instagram.contentnotes.domain.immersivereply.ContentNotesImmersiveReplyContent;

public final class KDI extends C228042kh {
    public final AnonymousClass0iw A00;
    public final UserSession A01;
    public final ContentNotesImmersiveReplyContent A02;

    public final /* bridge */ /* synthetic */ 2YL create() {
        AnonymousClass0iw r4 = this.A00;
        UserSession userSession = this.A01;
        return new C60299Jix(r4, userSession, AnonymousClass4JJ.A00(userSession), this.A02);
    }

    public KDI(AnonymousClass0iw r1, UserSession userSession, ContentNotesImmersiveReplyContent contentNotesImmersiveReplyContent) {
        AnonymousClass7TG.A1Q(userSession, contentNotesImmersiveReplyContent);
        this.A00 = r1;
        this.A01 = userSession;
        this.A02 = contentNotesImmersiveReplyContent;
    }
}
