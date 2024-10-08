package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.messageid.DirectMessageIdentifier;
import java.util.HashMap;

/* renamed from: X.P8b  reason: case insensitive filesystem */
public final class C72492P8b implements C3266277n {
    public final UserSession A00;
    public final C70739OJk A01 = new C70739OJk();
    public final AnonymousClass7GO A02 = new AnonymousClass7GO();
    public final AnonymousClass7L3 A03;
    public final HashMap A04 = AnonymousClass7TE.A1E();

    public final AnonymousClass758 CEa(DirectMessageIdentifier directMessageIdentifier) {
        return (AnonymousClass758) this.A02.A01(directMessageIdentifier);
    }

    public C72492P8b(UserSession userSession, AnonymousClass7L3 r3) {
        this.A03 = r3;
        this.A00 = userSession;
    }
}
