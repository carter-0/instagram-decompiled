package X;

import com.instagram.common.session.UserSession;
import java.util.HashSet;

/* renamed from: X.5CT  reason: invalid class name */
public final class AnonymousClass5CT {
    public final int A00;
    public final HashSet A01 = new HashSet();
    public final UserSession A02;

    public AnonymousClass5CT(UserSession userSession) {
        this.A02 = userSession;
        C247383gF A002 = C247323g9.A00(userSession);
        this.A00 = A002.A02 - ((1Av) A002.A06.A07.getValue()).A01.getInt("content_note_rec_nux_shown_count", 0);
    }
}
