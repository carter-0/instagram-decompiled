package X;

import com.instagram.common.session.UserSession;
import com.instagram.contentnotes.domain.immersivereply.ContentNotesImmersiveReplyContent;

public final class L9Y {
    public final UserSession A00;
    public final ContentNotesImmersiveReplyContent A01;
    public final 05G A02;
    public final 05G A03;
    public final AnonymousClass0Ud A04;
    public final AnonymousClass0Ud A05;

    public L9Y(UserSession userSession, ContentNotesImmersiveReplyContent contentNotesImmersiveReplyContent) {
        AnonymousClass7TG.A1O(contentNotesImmersiveReplyContent, userSession);
        this.A01 = contentNotesImmersiveReplyContent;
        this.A00 = userSession;
        02z A10 = DbS.A10(C62452Kg2.A03);
        this.A03 = A10;
        this.A05 = 10b.A03(A10);
        02z A0u = C51967G9n.A0u();
        this.A02 = A0u;
        this.A04 = 10b.A03(A0u);
    }
}
