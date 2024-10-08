package X;

import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.RealtimeConstants;

public final class WF0 implements AnonymousClass3M5 {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ 1Xj A01;

    public WF0(UserSession userSession, 1Xj r2) {
        this.A00 = userSession;
        this.A01 = r2;
    }

    public final void Ddp(int i) {
        String A0O;
        AnonymousClass3KE r3 = AnonymousClass3KD.A06;
        UserSession userSession = this.A00;
        1Xj r1 = this.A01;
        if (i == 9) {
            A0O = RealtimeConstants.SEND_SUCCESS;
        } else {
            A0O = 002.A0O("android-progress-", i);
        }
        r3.A01(A0O, userSession, r1);
    }
}
