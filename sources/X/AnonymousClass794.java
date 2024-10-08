package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.794  reason: invalid class name */
public final class AnonymousClass794 extends AnonymousClass7KY {
    public final AnonymousClass7IJ A00 = new AnonymousClass7IJ(this.A00);
    public final AnonymousClass0eM A01 = AnonymousClass1YB.A00(new C377229La(this, 34));
    public final AnonymousClass0eM A02 = AnonymousClass1YB.A00(new C377229La(this, 35));

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
        if (!r2.CPE(userSession, directThreadKey)) {
            return false;
        }
        if (!A01() || A04(AnonymousClass05K.A09)) {
            return true;
        }
        return false;
    }

    public AnonymousClass794(AnonymousClass7KY r3) {
        super(r3);
    }
}
