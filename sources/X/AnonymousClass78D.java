package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.messageid.DirectMessageIdentifier;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.78D  reason: invalid class name */
public final class AnonymousClass78D implements C3266277n {
    public final UserSession A00;
    public final AnonymousClass78C A01;
    public final AnonymousClass7GO A02 = new AnonymousClass7GO();
    public final Map A03 = new LinkedHashMap();

    public final AnonymousClass758 CEa(DirectMessageIdentifier directMessageIdentifier) {
        return (AnonymousClass758) this.A02.A01(directMessageIdentifier);
    }

    public AnonymousClass78D(UserSession userSession, AnonymousClass78C r3) {
        this.A00 = userSession;
        this.A01 = r3;
    }
}
