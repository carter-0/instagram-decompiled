package com.instagram.debug.devoptions.signalsplayground.fragment;

import X.0Yg;
import X.2YM;
import X.AnonymousClass7TE;
import X.C62320sa;
import com.instagram.debug.devoptions.signalsplayground.viewmodel.CreatorInspirationSignalsPlaygroundSignalsViewModel;

public final class CreatorInspirationSignalsPlaygroundSignalsFragment$viewModel$2 extends 0Yg implements C62320sa {
    public final /* synthetic */ CreatorInspirationSignalsPlaygroundSignalsFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CreatorInspirationSignalsPlaygroundSignalsFragment$viewModel$2(CreatorInspirationSignalsPlaygroundSignalsFragment creatorInspirationSignalsPlaygroundSignalsFragment) {
        super(0);
        this.this$0 = creatorInspirationSignalsPlaygroundSignalsFragment;
    }

    public final 2YM invoke() {
        return new CreatorInspirationSignalsPlaygroundSignalsViewModel.Factory(AnonymousClass7TE.A0l(this.this$0.session$delegate));
    }
}
