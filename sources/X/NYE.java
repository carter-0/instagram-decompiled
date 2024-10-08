package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.messageid.DirectMessageIdentifier;
import java.util.Collections;

public final class NYE extends C327997Da implements C3266277n {
    public final C3266277n A00;

    public static NYE A00(AnonymousClass0iw r5, UserSession userSession, AnonymousClass7DR r7, AnonymousClass7XR r8, AnonymousClass9HC r9, C72492P8b p8b) {
        return new NYE(r7, p8b, new C72562PAt(r8, r9, new C72567PAy(r5, userSession, p8b, Collections.emptyList()), new AnonymousClass768(r8, r9, Collections.emptyList()), new AnonymousClass7DZ(Collections.singletonList(new C3265877j(r9.A1X)))));
    }

    public final AnonymousClass758 CEa(DirectMessageIdentifier directMessageIdentifier) {
        return this.A00.CEa(directMessageIdentifier);
    }

    public final Class modelClass() {
        return N6J.class;
    }

    public NYE(AnonymousClass7DR r1, C3266277n r2, C72562PAt pAt) {
        super(r1, pAt);
        this.A00 = r2;
    }
}
