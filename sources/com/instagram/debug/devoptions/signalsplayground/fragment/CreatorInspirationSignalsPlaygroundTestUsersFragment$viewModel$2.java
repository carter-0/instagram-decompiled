package com.instagram.debug.devoptions.signalsplayground.fragment;

import X.0Yg;
import X.2YM;
import X.AnonymousClass7TE;
import X.C62320sa;
import com.instagram.debug.devoptions.signalsplayground.viewmodel.CreatorInspirationSignalsPlaygroundSignalDetailsViewModel;

public final class CreatorInspirationSignalsPlaygroundTestUsersFragment$viewModel$2 extends 0Yg implements C62320sa {
    public final /* synthetic */ CreatorInspirationSignalsPlaygroundTestUsersFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CreatorInspirationSignalsPlaygroundTestUsersFragment$viewModel$2(CreatorInspirationSignalsPlaygroundTestUsersFragment creatorInspirationSignalsPlaygroundTestUsersFragment) {
        super(0);
        this.this$0 = creatorInspirationSignalsPlaygroundTestUsersFragment;
    }

    public final 2YM invoke() {
        return new CreatorInspirationSignalsPlaygroundSignalDetailsViewModel.Factory(AnonymousClass7TE.A0l(this.this$0.session$delegate));
    }
}
