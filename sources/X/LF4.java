package X;

import com.instagram.common.session.UserSession;
import com.instagram.pendingmedia.model.constants.ShareType;

public class LF4 {
    public 2Fk A00;
    public AnonymousClass2Fj A01;
    public L3G A02;

    public final L3G A00() {
        L3G l3g;
        if (this instanceof KTZ) {
            l3g = ((KTZ) this).A00;
        } else {
            l3g = this.A02;
        }
        if (l3g != null) {
            return l3g;
        }
        0qQ.A0F("qplLogger");
        throw AnonymousClass00P.createAndThrow();
    }

    public void A01(UserSession userSession, AnonymousClass3Q2 r5, 1ua r6) {
        this.A01.A0B(C62502Kgs.START);
        r6.A0J(new C65547LvM(1, r5, this));
        if (this instanceof KTZ) {
            r6.A0G(r5, ((KTZ) this).A01, (ShareType) null);
        } else {
            r6.A0B(r5);
        }
        L3G A002 = A00();
        A002.A01.markerPoint(A002.A00, "start");
    }

    public LF4() {
        2Fk r0 = new 2Fk(C62502Kgs.IDLE);
        this.A01 = r0;
        this.A00 = r0;
    }
}
