package com.instagram.debug.devoptions.metadata.view;

import X.0Yg;
import X.2YM;
import X.AnonymousClass7TE;
import X.AnonymousClass9H0;
import X.C254783t2;
import X.C62320sa;
import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.metadata.viewmodel.ThreadMetadataOverrideViewModel;

public final class ThreadMetadataOverrideFragment$viewModel$2 extends 0Yg implements C62320sa {
    public final /* synthetic */ ThreadMetadataOverrideFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ThreadMetadataOverrideFragment$viewModel$2(ThreadMetadataOverrideFragment threadMetadataOverrideFragment) {
        super(0);
        this.this$0 = threadMetadataOverrideFragment;
    }

    public final 2YM invoke() {
        C254783t2 r1;
        UserSession A0l = AnonymousClass7TE.A0l(this.this$0.session$delegate);
        Bundle bundle = this.this$0.mArguments;
        if (bundle != null) {
            r1 = AnonymousClass9H0.A00(bundle, ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID);
        } else {
            r1 = null;
        }
        return new ThreadMetadataOverrideViewModel.Factory(A0l, r1);
    }
}
