package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

public final class LMQ {
    public final Context A00;
    public final LAG A01;
    public final UserSession A02;

    public static final void A00(C368278sM r8, LMQ lmq, String str) {
        AnonymousClass819 r3;
        UserSession userSession = lmq.A02;
        boolean A1Z = Dbb.A1Z(C363388je.A00(userSession), AnonymousClass000.A00(2168));
        LAG lag = lmq.A01;
        AnonymousClass818 r5 = lag.A00;
        int intValue = lag.A03.intValue();
        if (intValue == 1) {
            r3 = AnonymousClass819.DIALOG_SINGLE_CCP_REEL;
        } else if (intValue == 0) {
            r3 = AnonymousClass819.DIALOG_SINGLE_XAR_REEL;
        } else {
            throw AnonymousClass7TE.A1K();
        }
        AnonymousClass81A A0O = JTO.A0O();
        A0O.A06("waterfall_id", lag.A05);
        A0O.A09(Boolean.valueOf(A1Z));
        JTQ.A19(A0O, "ig_media_id", lag.A02.getId(), str);
        C368288sN.A00(r5, r8, r3, A0O, userSession);
    }

    public LMQ(Context context, LAG lag, UserSession userSession) {
        this.A02 = userSession;
        this.A00 = context;
        this.A01 = lag;
    }
}
