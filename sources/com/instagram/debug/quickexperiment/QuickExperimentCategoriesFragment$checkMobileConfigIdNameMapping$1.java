package com.instagram.debug.quickexperiment;

import X.183;
import X.AnonymousClass7TE;
import X.C59689JTv;
import android.content.Context;
import android.content.DialogInterface;

public final class QuickExperimentCategoriesFragment$checkMobileConfigIdNameMapping$1 implements DialogInterface.OnClickListener {
    public final /* synthetic */ QuickExperimentCategoriesFragment this$0;

    public QuickExperimentCategoriesFragment$checkMobileConfigIdNameMapping$1(QuickExperimentCategoriesFragment quickExperimentCategoriesFragment) {
        this.this$0 = quickExperimentCategoriesFragment;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        183 r4 = 183.A01;
        QuickExperimentCategoriesFragment quickExperimentCategoriesFragment = this.this$0;
        if (r4 == null) {
            C59689JTv.A09(quickExperimentCategoriesFragment.requireContext(), "Failed User MetaConfig Sync");
            return;
        }
        Context requireContext = quickExperimentCategoriesFragment.requireContext();
        QuickExperimentHelper.forceUserQESync(requireContext, r4, AnonymousClass7TE.A0l(this.this$0.session$delegate), new QuickExperimentHelper$$ExternalSyntheticLambda5(requireContext, AnonymousClass7TE.A0v()));
    }
}
