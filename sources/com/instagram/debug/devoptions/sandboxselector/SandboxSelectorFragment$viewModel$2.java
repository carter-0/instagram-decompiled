package com.instagram.debug.devoptions.sandboxselector;

import X.0Yg;
import X.0qQ;
import X.2YM;
import X.AnonymousClass00P;
import X.AnonymousClass7TE;
import X.C46329Dbx;
import X.C62320sa;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.sandboxselector.SandboxSelectorViewModel;

public final class SandboxSelectorFragment$viewModel$2 extends 0Yg implements C62320sa {
    public final /* synthetic */ SandboxSelectorFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SandboxSelectorFragment$viewModel$2(SandboxSelectorFragment sandboxSelectorFragment) {
        super(0);
        this.this$0 = sandboxSelectorFragment;
    }

    public final 2YM invoke() {
        UserSession A0l = AnonymousClass7TE.A0l(this.this$0.session$delegate);
        C46329Dbx dbx = this.this$0.navigationPerfLogger;
        if (dbx != null) {
            return new SandboxSelectorViewModel.Factory(A0l, "sandbox_selector", dbx);
        }
        0qQ.A0F("navigationPerfLogger");
        throw AnonymousClass00P.createAndThrow();
    }
}
