package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.PQx  reason: case insensitive filesystem */
public final class C72965PQx implements C322776wO {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C72965PQx(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj;
        this.A01 = obj2;
    }

    public final void DBx() {
    }

    public final void DBy() {
        if (this.A00 != 0) {
            C19560Wbk wbk = ((W1F) this.A02).A09;
            User user = (User) this.A01;
            0qQ.A0A(user);
            wbk.A06(user, "merchant_shopping_bag_empty_state_action");
            return;
        }
        UserSession userSession = (UserSession) this.A02;
        C69004Ncg.A02(O0Z.A00(userSession), AnonymousClass05K.A0C);
        C67564Mpy.A00(userSession).A06(C67256Mkq.PENDING, AnonymousClass05K.A0N);
        ((C70940OSn) this.A01).A00.A0m(true, false);
    }

    public final /* synthetic */ void DBz(C320156rr r1) {
    }
}
