package com.instagram.debug.quickexperiment;

import X.0ng;
import X.DbU;

public final class QuickExperimentCategoriesFragment$searchTextChanged$1 extends 0ng {
    public final /* synthetic */ String $previousQuery;
    public final /* synthetic */ QuickExperimentCategoriesFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public QuickExperimentCategoriesFragment$searchTextChanged$1(QuickExperimentCategoriesFragment quickExperimentCategoriesFragment, String str) {
        super(1386848661, 3, false, false);
        this.this$0 = quickExperimentCategoriesFragment;
        this.$previousQuery = str;
    }

    public void run() {
        QuickExperimentCategoriesFragment quickExperimentCategoriesFragment = this.this$0;
        String str = quickExperimentCategoriesFragment.searchQuery;
        String str2 = this.$previousQuery;
        boolean z = true;
        if (str2.length() <= 0 || !DbU.A1a(str, str2)) {
            z = false;
        }
        quickExperimentCategoriesFragment.filterExperimentsList(str, z);
    }
}
