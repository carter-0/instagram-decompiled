package X;

import android.os.Handler;
import com.facebook.msys.mci.TraceLogger;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.OMd  reason: case insensitive filesystem */
public final class C70808OMd {
    public final UserSession A00;
    public final Handler A01 = new Handler(C64021Cb.A00());
    public final C282375Cv A02;

    public final void A01(String str, boolean z) {
        C73672Phl phl = new C73672Phl(this, str, 3, z);
        if (182.A06(0Tu.A05, this.A00, 36323195554180093L)) {
            this.A01.postDelayed(new PWP(phl), 3000);
        } else {
            phl.invoke();
        }
    }

    public final void A00(String str, List list, int i, int i2) {
        String traceIdForAliasId;
        if (str != null && (traceIdForAliasId = TraceLogger.getTraceIdForAliasId(14, str)) != null) {
            C282375Cv.A03(traceIdForAliasId, list, 0, i, i2);
        }
    }

    public C70808OMd(UserSession userSession) {
        this.A00 = userSession;
        C282375Cv A002 = C282375Cv.A00(userSession);
        0qQ.A07(A002);
        this.A02 = A002;
    }
}
