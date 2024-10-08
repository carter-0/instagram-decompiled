package com.instagram.creator.agent.settings.facts.viewmodel;

import X.02z;
import X.05G;
import X.10b;
import X.AnonymousClass0Ud;
import X.C53373Gn3;
import X.DbS;
import X.H2Q;
import com.instagram.creator.agent.settings.facts.repository.FactsRepository;

public final class QuestionAnswerFactPreviewUseCaseImpl extends H2Q {
    public String A00;
    public final FactsRepository A01;
    public final 05G A02;
    public final AnonymousClass0Ud A03;

    public QuestionAnswerFactPreviewUseCaseImpl(FactsRepository factsRepository) {
        this.A01 = factsRepository;
        02z A10 = DbS.A10(new C53373Gn3(0, 14, true));
        this.A02 = A10;
        this.A03 = 10b.A03(A10);
    }
}
