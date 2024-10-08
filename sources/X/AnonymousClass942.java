package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.instagram.common.session.UserSession;

/* renamed from: X.942  reason: invalid class name */
public final class AnonymousClass942 {
    public final 0xa A00;
    public final UserSession A01;

    public AnonymousClass942(0xa r2, UserSession userSession) {
        0qQ.A0B(userSession, 1);
        0qQ.A0B(r2, 2);
        this.A01 = userSession;
        this.A00 = r2;
    }

    public final void A00(1Xj r4, Integer num) {
        String str;
        0qQ.A0B(r4, 0);
        0xY AR4 = this.A00.AR4();
        String id = r4.getId();
        switch (num.intValue()) {
            case 0:
                str = C273654mx.A00(3054);
                break;
            case 1:
                str = "positive_feedback";
                break;
            case 2:
                str = AnonymousClass000.A00(3023);
                break;
            default:
                str = NetInfoModule.CONNECTION_TYPE_NONE;
                break;
        }
        AR4.E5g(id, str);
        AR4.apply();
        r4.AE7(this.A01);
    }

    public final boolean A01(1Xj r4) {
        return 0qQ.A0K(this.A00.getString(r4.getId(), (String) null), "positive_feedback");
    }
}
