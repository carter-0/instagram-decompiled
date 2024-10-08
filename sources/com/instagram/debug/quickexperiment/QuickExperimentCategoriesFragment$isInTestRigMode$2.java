package com.instagram.debug.quickexperiment;

import X.0Yg;
import X.C273654mx;
import X.C62320sa;
import X.C66580MXl;
import android.os.Bundle;

public final class QuickExperimentCategoriesFragment$isInTestRigMode$2 extends 0Yg implements C62320sa {
    public final /* synthetic */ QuickExperimentCategoriesFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public QuickExperimentCategoriesFragment$isInTestRigMode$2(QuickExperimentCategoriesFragment quickExperimentCategoriesFragment) {
        super(0);
        this.this$0 = quickExperimentCategoriesFragment;
    }

    public final Boolean invoke() {
        Bundle bundle = this.this$0.mArguments;
        boolean z = true;
        if (bundle == null || !bundle.getBoolean(C273654mx.A00(2925), false) || !C66580MXl.A1b(this.this$0.getTestRigParameterNames())) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
