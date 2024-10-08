package com.instagram.debug.quickexperiment;

import X.AnonymousClass7TE;
import com.instagram.common.session.UserSession;
import java.util.List;

public final class QuickExperimentCategoriesFragment$createUiFromExperimentParams$1 implements Runnable {
    public final /* synthetic */ List $experimentParams;
    public final /* synthetic */ QuickExperimentCategoriesFragment this$0;

    public QuickExperimentCategoriesFragment$createUiFromExperimentParams$1(QuickExperimentCategoriesFragment quickExperimentCategoriesFragment, List list) {
        this.this$0 = quickExperimentCategoriesFragment;
        this.$experimentParams = list;
    }

    public final void run() {
        QuickExperimentCategoriesFragment quickExperimentCategoriesFragment = this.this$0;
        quickExperimentCategoriesFragment.currentExperimentParams = this.$experimentParams;
        UserSession A0l = AnonymousClass7TE.A0l(quickExperimentCategoriesFragment.session$delegate);
        UniverseCollapseTracker access$getUniverseCollapseTracker = this.this$0.getUniverseCollapseTracker();
        final QuickExperimentCategoriesFragment quickExperimentCategoriesFragment2 = this.this$0;
        quickExperimentCategoriesFragment.setItems(QuickExperimentHelper.setupMenuItems(quickExperimentCategoriesFragment, A0l, access$getUniverseCollapseTracker, new Runnable() {
            public final void run() {
                QuickExperimentCategoriesFragment.this.refreshUi();
            }
        }, this.$experimentParams, quickExperimentCategoriesFragment2.getAdapter(), true, true), true);
    }
}
