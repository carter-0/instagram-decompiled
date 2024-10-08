package com.instagram.debug.quickexperiment;

import X.AnonymousClass0fD;
import X.AnonymousClass1GX;
import X.C238133Ar;

public final class QuickExperimentCategoriesFragment$onViewCreated$1 extends AnonymousClass1GX {
    public final /* synthetic */ QuickExperimentCategoriesFragment this$0;

    public QuickExperimentCategoriesFragment$onViewCreated$1(QuickExperimentCategoriesFragment quickExperimentCategoriesFragment) {
        this.this$0 = quickExperimentCategoriesFragment;
    }

    public void onScrollStateChanged(C238133Ar r3, int i) {
        int A03 = AnonymousClass0fD.A03(-1888424979);
        if (i == 1) {
            this.this$0.getTypeaheadHeader().A01();
        }
        AnonymousClass0fD.A0A(-1273085582, A03);
    }
}
