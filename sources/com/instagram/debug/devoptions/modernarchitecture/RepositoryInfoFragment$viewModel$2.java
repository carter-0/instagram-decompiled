package com.instagram.debug.devoptions.modernarchitecture;

import X.0Yg;
import X.2YM;
import X.AnonymousClass7TE;
import X.C62320sa;
import com.instagram.debug.devoptions.modernarchitecture.RepositoryInfoViewModel;

public final class RepositoryInfoFragment$viewModel$2 extends 0Yg implements C62320sa {
    public final /* synthetic */ RepositoryInfoFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RepositoryInfoFragment$viewModel$2(RepositoryInfoFragment repositoryInfoFragment) {
        super(0);
        this.this$0 = repositoryInfoFragment;
    }

    public final 2YM invoke() {
        return new RepositoryInfoViewModel.Factory(AnonymousClass7TE.A0l(this.this$0.session$delegate));
    }
}
