package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.messageid.DirectMessageIdentifier;
import java.util.Map;

/* renamed from: X.P8a  reason: case insensitive filesystem */
public final class C72491P8a implements C3266277n {
    public final UserSession A00;
    public final C391999u1 A01;
    public final AnonymousClass7GO A02 = new AnonymousClass7GO();
    public final Map A03 = AnonymousClass7TE.A1H();

    public final AnonymousClass758 CEa(DirectMessageIdentifier directMessageIdentifier) {
        return (AnonymousClass758) this.A02.A01(directMessageIdentifier);
    }

    public C72491P8a(UserSession userSession, C391999u1 r3) {
        this.A00 = userSession;
        this.A01 = r3;
    }
}
