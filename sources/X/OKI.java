package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.List;

public final class OKI {
    public final UserSession A00;
    public final AnonymousClass0eM A01 = AnonymousClass0eN.A01(new C73908Plj(this, 1));

    public final void A00(Context context, 1a8 r12, Integer num, Integer num2, 0sP r15, boolean z) {
        List A1I;
        1a8 r3 = r12;
        boolean A1Z = C66581MXm.A1Z(r12);
        boolean A02 = AnonymousClass65A.A02(C66581MXm.A0S(this.A01), 36315949951946558L);
        UserSession userSession = this.A00;
        if (A02) {
            A1I = 0sr.A1P(new C74386Pu2[]{new P11(userSession), new P12(userSession)});
        } else {
            A1I = AnonymousClass7TE.A1I(new P12(userSession));
        }
        OT8 ot8 = new OT8(A1I);
        ot8.A00.clear();
        OT8.A00(context, r3, ot8, num, num2, r15, A1Z ? 1 : 0, z);
    }

    public OKI(UserSession userSession) {
        this.A00 = userSession;
    }
}
