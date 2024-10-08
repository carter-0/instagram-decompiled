package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import org.json.JSONObject;

/* renamed from: X.VZs  reason: case insensitive filesystem */
public final class C17539VZs {
    public final int A00;
    public final UserSession A01;
    public final VTZ A02;
    public final VPO A03;
    public final JSONObject A04;

    public C17539VZs(Context context, UserSession userSession, AnonymousClass4D6 r8) {
        VTZ vtz = (VTZ) userSession.A01(VTZ.class, new C20693WxP(userSession, 9));
        VPO vpo = new VPO(r8);
        int A09 = 0nA.A09(context);
        JSONObject A042 = C278474ww.A04(userSession);
        0qQ.A0B(vtz, 2);
        this.A01 = userSession;
        this.A02 = vtz;
        this.A03 = vpo;
        this.A00 = A09;
        this.A04 = A042;
    }
}
