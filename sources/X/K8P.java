package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;

public final class K8P extends AnonymousClass8ZF {
    public final KWZ A00;
    public final AnonymousClass0r6 A01;

    public K8P(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        KWZ kwz = new KWZ(userSession);
        this.A00 = kwz;
        this.A01 = new C51623FxC((AnonymousClass0r6) kwz.A04, 0);
        addCloseable(kwz);
    }

    public final void A00(DirectThreadKey directThreadKey) {
        DirectThreadKey directThreadKey2 = directThreadKey;
        0qQ.A0B(directThreadKey, 0);
        KWZ kwz = this.A00;
        String str = directThreadKey.A00;
        if (str != null) {
            AnonymousClass7TE.A1Z(new C66174MGl((Object) kwz, (Object) directThreadKey2, str, (AnonymousClass4D7) null, 36), kwz.A01);
        }
    }
}
