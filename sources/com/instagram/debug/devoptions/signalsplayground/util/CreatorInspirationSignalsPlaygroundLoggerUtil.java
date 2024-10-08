package com.instagram.debug.devoptions.signalsplayground.util;

import X.0Aj;
import X.0qQ;
import X.AnonymousClass0iw;
import X.AnonymousClass0kN;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C51969G9p;
import X.DbS;
import X.DbV;
import X.DbX;
import X.DbZ;
import com.instagram.common.session.UserSession;

public final class CreatorInspirationSignalsPlaygroundLoggerUtil {
    public static final CreatorInspirationSignalsPlaygroundLoggerUtil INSTANCE = new Object();

    public final void reportFeedbackButtonClick(UserSession userSession, AnonymousClass0iw r5, String str, String str2, String str3, int i) {
        0qQ.A0B(userSession, 0);
        AnonymousClass7TG.A0w(1, r5, str2, str3);
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r5, userSession), "ig_signals_playground_entity_feedback");
        if (A0e.isSampled()) {
            A0e.AAJ("signal", str3);
            A0e.A9F("target_user_igid", DbV.A0q(str2));
            A0e.A9F("numeric_score", DbS.A0j(i));
            A0e.A9F("media_igid", DbZ.A0d(str));
            C51969G9p.A1A(A0e, r5);
            DbX.A1L(A0e);
        }
    }
}
