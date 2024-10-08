package com.instagram.debug.quickexperiment;

import X.AnonymousClass0Dg;
import X.AnonymousClass0fD;
import X.AnonymousClass7TE;
import X.C21258XRd;
import X.DbS;
import X.Dba;
import android.view.View;

public final class QuickExperimentCategoriesFragment$onCreate$1 implements View.OnClickListener {
    public final /* synthetic */ C21258XRd $category;
    public final /* synthetic */ QuickExperimentCategoriesFragment this$0;

    public QuickExperimentCategoriesFragment$onCreate$1(QuickExperimentCategoriesFragment quickExperimentCategoriesFragment, C21258XRd xRd) {
        this.this$0 = quickExperimentCategoriesFragment;
        this.$category = xRd;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(-1139331667);
        this.this$0.getTypeaheadHeader().A01();
        AnonymousClass0Dg.A00(AnonymousClass7TE.A0a(), AnonymousClass7TE.A0l(this.this$0.session$delegate));
        Dba.A12(QuickExperimentEditFragment.createWithExperimentCategory(this.$category), DbS.A0M(this.this$0.requireActivity(), AnonymousClass7TE.A0l(this.this$0.session$delegate)));
        AnonymousClass0fD.A0C(1387331463, A05);
    }
}
