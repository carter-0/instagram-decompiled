package com.instagram.barcelona.search.data;

import X.02z;
import X.05G;
import X.0qQ;
import X.AnonymousClass0Ud;
import X.AnonymousClass43D;
import X.AnonymousClass4HU;
import X.AnonymousClass4HW;
import X.AnonymousClass7TE;
import X.C252733pa;
import X.C335967dq;
import X.C47184Drz;
import X.DbS;
import com.instagram.common.session.UserSession;
import java.util.Map;

public final class SearchTopicsRepository extends C252733pa {
    public final Map A00;
    public final AnonymousClass4HW A01 = C335967dq.A00(AnonymousClass4HU.A00);
    public final UserSession A02;
    public final 05G A03;
    public final AnonymousClass0Ud A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchTopicsRepository(UserSession userSession) {
        super("barcelona_trending_topics_repository", AnonymousClass43D.A00(1926455034));
        0qQ.A0B(userSession, 1);
        this.A02 = userSession;
        02z A10 = DbS.A10(new C47184Drz());
        this.A03 = A10;
        this.A04 = A10;
        this.A00 = AnonymousClass7TE.A1H();
    }
}
