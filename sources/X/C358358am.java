package X;

import com.instagram.common.session.UserSession;
import java.util.Collections;
import java.util.List;

/* renamed from: X.8am  reason: invalid class name and case insensitive filesystem */
public final class C358358am extends C252733pa {
    public C61076JwE A00;
    public final UserSession A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C358358am(UserSession userSession) {
        super("GroupMention", AnonymousClass43D.A01(1746325272, 3));
        0qQ.A0B(userSession, 1);
        this.A01 = userSession;
    }

    public final AnonymousClass0r6 A00(String str) {
        C61076JwE jwE = this.A00;
        if (jwE != null && 0qQ.A0K(jwE.A01, str)) {
            C387339m3 r2 = (C387339m3) jwE.A00;
            if (r2.A06.size() + r2.A05.size() > 1) {
                List singletonList = Collections.singletonList(r2);
                0qQ.A07(singletonList);
                return new 0rr(singletonList);
            }
        }
        return AnonymousClass0Zq.A01(new C66166MGd((AnonymousClass4D7) null, (Object) this, 40));
    }
}
