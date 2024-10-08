package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.direct.capabilities.Capabilities;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import java.util.List;

public abstract class O0H {
    /* JADX WARNING: type inference failed for: r2v0, types: [X.XQI, X.1aK] */
    /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.Object, X.OIu] */
    public static final C67195Mjr A00(Context context, UserSession userSession, Capabilities capabilities, C254793t3 r9) {
        Object nb9;
        C269794fh r4 = C318146oT.A00;
        C73437Pcf pcf = C73437Pcf.A00;
        1aP.A01(pcf, "supplier is null");
        ? xqi = new XQI(pcf);
        C318206oZ r1 = r4.A00;
        1aP.A01(r1, "scheduler is null");
        1aU r3 = new 1aU(new AnonymousClass67U(xqi, r1));
        boolean z = r9 instanceof MsysThreadId;
        List A1P = 0sr.A1P(new C70737OIu[]{new C68946NbP(z), new Object()});
        if (z) {
            nb9 = new C68931NbA(userSession, capabilities, MYc.A01(userSession, "DirectThreadDetailInfoReduxStore"), (MsysThreadId) r9);
        } else if (C300965yF.A02(r9) != null) {
            nb9 = new C68930Nb9(context, userSession, capabilities, C300965yF.A01(r9));
        } else {
            throw AnonymousClass7TE.A0z("Unexpected value for threadId");
        }
        return new C67195Mjr(r3, r4, A1P, AnonymousClass7TE.A1I(nb9));
    }
}
