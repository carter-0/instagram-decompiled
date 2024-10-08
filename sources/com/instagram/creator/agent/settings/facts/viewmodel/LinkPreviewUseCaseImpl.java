package com.instagram.creator.agent.settings.facts.viewmodel;

import X.02z;
import X.05G;
import X.10b;
import X.AnonymousClass0Ud;
import X.C53373Gn3;
import X.DbS;
import X.H2Q;
import com.instagram.creator.agent.settings.facts.repository.FactsRepository;

public final class LinkPreviewUseCaseImpl extends H2Q {
    public String A00;
    public final C53373Gn3 A01;
    public final FactsRepository A02;
    public final 05G A03;
    public final AnonymousClass0Ud A04;

    public LinkPreviewUseCaseImpl(FactsRepository factsRepository) {
        this.A02 = factsRepository;
        C53373Gn3 gn3 = new C53373Gn3(2131956938, 6, true);
        this.A01 = gn3;
        02z A10 = DbS.A10(gn3);
        this.A03 = A10;
        this.A04 = 10b.A03(A10);
    }
}
