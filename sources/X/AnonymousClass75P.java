package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.messageid.DirectMessageIdentifier;
import java.util.Map;

/* renamed from: X.75P  reason: invalid class name */
public final class AnonymousClass75P extends C331017Pd implements C3266277n, AnonymousClass7Pe {
    public final UserSession A00;
    public final AnonymousClass75Q A01;
    public final AnonymousClass9HC A02;
    public final AnonymousClass7L2 A03;
    public final 17i A04;
    public final Integer A05;
    public final C3266277n A06;

    public final AnonymousClass758 CEa(DirectMessageIdentifier directMessageIdentifier) {
        return this.A06.CEa(directMessageIdentifier);
    }

    public AnonymousClass75P(UserSession userSession, AnonymousClass7EZ r3, C332807Wl r4, AnonymousClass9HC r5, AnonymousClass75O r6, AnonymousClass7L2 r7, 17i r8, Integer num, Map map) {
        super(r3, r6, r4);
        this.A00 = userSession;
        this.A04 = r8;
        this.A03 = r7;
        this.A02 = r5;
        this.A05 = num;
        this.A01 = new AnonymousClass75Q(map);
        this.A06 = r6;
    }
}
