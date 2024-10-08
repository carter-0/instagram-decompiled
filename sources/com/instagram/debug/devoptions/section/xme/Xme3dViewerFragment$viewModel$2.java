package com.instagram.debug.devoptions.section.xme;

import X.0Yg;
import X.2YM;
import X.AnonymousClass7TE;
import X.C62320sa;
import com.instagram.debug.devoptions.section.xme.Xme3dViewModel;

public final class Xme3dViewerFragment$viewModel$2 extends 0Yg implements C62320sa {
    public final /* synthetic */ Xme3dViewerFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Xme3dViewerFragment$viewModel$2(Xme3dViewerFragment xme3dViewerFragment) {
        super(0);
        this.this$0 = xme3dViewerFragment;
    }

    public final 2YM invoke() {
        return new Xme3dViewModel.Factory(AnonymousClass7TE.A0l(this.this$0.session$delegate));
    }
}
