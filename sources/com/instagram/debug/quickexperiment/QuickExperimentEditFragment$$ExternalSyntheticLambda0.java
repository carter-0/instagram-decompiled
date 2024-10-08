package com.instagram.debug.quickexperiment;

import com.instagram.common.session.UserSession;
import com.instagram.debug.quickexperiment.QuickExperimentEditFragment;
import com.instagram.debug.quickexperiment.storage.QuickExperimentDebugStoreManager;
import java.util.List;

public final /* synthetic */ class QuickExperimentEditFragment$$ExternalSyntheticLambda0 implements QuickExperimentEditFragment.ExperimentParameterListGenerator {
    public final /* synthetic */ UserSession f$0;

    public /* synthetic */ QuickExperimentEditFragment$$ExternalSyntheticLambda0(UserSession userSession) {
        this.f$0 = userSession;
    }

    public final List createList() {
        return QuickExperimentHelper.getOverriddenExperimentParameters(QuickExperimentDebugStoreManager.getOverrideStore(this.f$0));
    }
}
