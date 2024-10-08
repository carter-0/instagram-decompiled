package X;

import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.RealtimeClientManager$MessageDeliveryCallback;

public final class MeR extends RealtimeClientManager$MessageDeliveryCallback {
    public final UserSession A00;
    public final C74417PuX A01;

    public final void onFailure(Integer num, String str, String str2, boolean z, C254403sQ r14, String str3, boolean z2, boolean z3) {
        C270214gN r0;
        if (num != null) {
            C254403sQ r02 = r14;
            r0 = C71115Od8.A02(r02, "mqtt", str, str2, str3, num.intValue(), z, z2, z3);
        } else if ("mqtt".equals("http")) {
            r0 = C270214gN.A0L;
        } else {
            r0 = C270214gN.A0N;
        }
        this.A01.DEJ(r0, AnonymousClass05K.A01);
    }

    public final void onTimeout() {
        this.A01.DEJ(C270214gN.A0O, AnonymousClass05K.A01);
    }

    public MeR(UserSession userSession, C74417PuX puX) {
        this.A00 = userSession;
        this.A01 = puX;
    }

    public final void onSuccess(String str, String str2, long j, Long l) {
        AnonymousClass7TG.A1N(str, str2);
        this.A01.Dop(new C66888MeS(str2), AnonymousClass05K.A01);
    }
}
