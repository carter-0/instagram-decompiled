package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.MiK  reason: case insensitive filesystem */
public final class C67100MiK extends C67101MiL {
    public final Context A00;
    public final UserSession A01;

    public static final void A00(C67100MiK miK, C254743sy r16, boolean z) {
        String str;
        C254743sy r3 = r16;
        DirectThreadKey A04 = C66647MaG.A04(r3);
        C67100MiK miK2 = miK;
        if (!(A04 == null || (str = A04.A00) == null || str.length() == 0)) {
            C66959Mfs.A01.A00(miK.A00, String.valueOf(C66647MaG.A09(r3)));
        }
        DirectThreadKey A03 = C66647MaG.A03(r3);
        UserSession userSession = miK.A01;
        C66665MaY maY = new C66665MaY(OQO.A00(userSession, A03), (Boolean) null, DbV.A0s(), (String) null, (String) null, "", C66666MaZ.A00(userSession, C66666MaZ.A01, AnonymousClass1hT.class), false, false, false, z);
        0qQ.A0B(A03, 2);
        1OS r0 = new 1OS(maY);
        r0.A00 = A03;
        C66580MXl.A1P(userSession, r0);
        C3265677h.A0j(userSession, A03);
        miK2.A02(r3);
    }

    public C67100MiK(Context context, UserSession userSession) {
        super(userSession);
        this.A00 = context;
        this.A01 = userSession;
    }
}
