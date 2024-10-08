package com.instagram.debug.quickexperiment;

import X.0Yg;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C62320sa;
import android.content.Context;

public final class QuickExperimentCategoriesFragment$adapter$2 extends 0Yg implements C62320sa {
    public final /* synthetic */ QuickExperimentCategoriesFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public QuickExperimentCategoriesFragment$adapter$2(QuickExperimentCategoriesFragment quickExperimentCategoriesFragment) {
        super(0);
        this.this$0 = quickExperimentCategoriesFragment;
    }

    public final QuickExperimentCategoriesAdapter invoke() {
        Context requireContext = this.this$0.requireContext();
        QuickExperimentCategoriesFragment quickExperimentCategoriesFragment = this.this$0;
        return new QuickExperimentCategoriesAdapter(requireContext, quickExperimentCategoriesFragment, AnonymousClass7TE.A0v(), Boolean.valueOf(AnonymousClass7TF.A1Z(quickExperimentCategoriesFragment.isInTestRigMode$delegate)));
    }
}
