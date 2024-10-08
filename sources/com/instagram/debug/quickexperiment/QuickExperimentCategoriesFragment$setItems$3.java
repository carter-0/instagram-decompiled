package com.instagram.debug.quickexperiment;

import X.AnonymousClass0Dg;
import X.AnonymousClass0fD;
import X.AnonymousClass7TE;
import X.DbS;
import X.Dba;
import android.view.View;

public final class QuickExperimentCategoriesFragment$setItems$3 implements View.OnClickListener {
    public final /* synthetic */ QuickExperimentCategoriesFragment this$0;

    public QuickExperimentCategoriesFragment$setItems$3(QuickExperimentCategoriesFragment quickExperimentCategoriesFragment) {
        this.this$0 = quickExperimentCategoriesFragment;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(-82539732);
        AnonymousClass0Dg.A00(AnonymousClass7TE.A0a(), AnonymousClass7TE.A0l(this.this$0.session$delegate));
        Dba.A12(QuickExperimentEditFragment.createForAllOverrides(AnonymousClass7TE.A0l(this.this$0.session$delegate)), DbS.A0M(this.this$0.requireActivity(), AnonymousClass7TE.A0l(this.this$0.session$delegate)));
        AnonymousClass0fD.A0C(-1444001679, A05);
    }
}
