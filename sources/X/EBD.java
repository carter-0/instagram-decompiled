package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

public final class EBD extends 1P0 {
    public final 1Xj A00;
    public final /* synthetic */ C246433eb A01;

    public EBD(C246433eb r1, 1Xj r2) {
        this.A01 = r1;
        this.A00 = r2;
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0fD.A03(2089540675);
        int A032 = AnonymousClass0fD.A03(755544324);
        1Xj r3 = this.A00;
        int i = 1;
        if (r3.A5Y()) {
            i = 3;
        }
        r3.A00 = i;
        UserSession userSession = this.A01.A00;
        r3.AE7(userSession);
        User A2A = r3.A2A(userSession);
        if (A2A != null) {
            if (!r3.A5G()) {
                A2A.A0X();
            }
            A2A.A0d(userSession);
            AnonymousClass0fD.A0A(2125789696, A032);
            AnonymousClass0fD.A0A(1055761553, A03);
            return;
        }
        IllegalStateException A0y = AnonymousClass7TE.A0y();
        AnonymousClass0fD.A0A(-1076022082, A032);
        throw A0y;
    }
}
