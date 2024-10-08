package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.795  reason: invalid class name */
public final class AnonymousClass795 extends AnonymousClass7KY {
    public final AnonymousClass7IK A00 = new AnonymousClass7IK(this.A00);
    public final AnonymousClass0eM A01 = AnonymousClass1YB.A00(new C377229La(this, 36));
    public final AnonymousClass0eM A02 = AnonymousClass1YB.A00(new C377229La(this, 37));
    public final AnonymousClass0eM A03 = AnonymousClass1YB.A00(new C377229La(this, 38));

    public final boolean A05() {
        DirectThreadKey directThreadKey;
        C329757Kc r2 = (C329757Kc) this.A05.invoke();
        UserSession userSession = this.A00;
        2Er r0 = this.A01;
        if (r0 != null) {
            directThreadKey = C66647MaG.A04(r0.BJz());
        } else {
            directThreadKey = null;
        }
        return r2.CUC(userSession, directThreadKey);
    }

    public AnonymousClass795(AnonymousClass7KY r3) {
        super(r3);
    }
}
