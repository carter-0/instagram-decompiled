package com.instagram.creator.agent.settings.facts.viewmodel;

import X.02z;
import X.05G;
import X.0Tu;
import X.10b;
import X.182;
import X.AnonymousClass0Ud;
import X.C53373Gn3;
import X.DbS;
import X.H2Q;
import com.instagram.common.session.UserSession;
import com.instagram.creator.agent.settings.facts.repository.FactsRepository;

public final class SingularFactPreviewUseCaseImpl extends H2Q {
    public String A00;
    public final FactsRepository A01;
    public final 05G A02;
    public final AnonymousClass0Ud A03;
    public final boolean A04;

    public SingularFactPreviewUseCaseImpl(UserSession userSession, FactsRepository factsRepository) {
        this.A01 = factsRepository;
        boolean A06 = 182.A06(0Tu.A05, userSession, 36322993689471704L);
        this.A04 = A06;
        02z A10 = DbS.A10(new C53373Gn3(0, 14, A06));
        this.A02 = A10;
        this.A03 = 10b.A03(A10);
    }
}
