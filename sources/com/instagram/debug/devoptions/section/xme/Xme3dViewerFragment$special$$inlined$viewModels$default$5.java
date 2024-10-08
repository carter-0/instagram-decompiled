package com.instagram.debug.devoptions.section.xme;

import X.0Yg;
import X.2YM;
import X.AnonymousClass07P;
import X.AnonymousClass07g;
import X.AnonymousClass0eM;
import X.C62320sa;
import androidx.fragment.app.Fragment;

public final class Xme3dViewerFragment$special$$inlined$viewModels$default$5 extends 0Yg implements C62320sa {
    public final /* synthetic */ AnonymousClass0eM $owner$delegate;
    public final /* synthetic */ Fragment $this_viewModels;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Xme3dViewerFragment$special$$inlined$viewModels$default$5(Fragment fragment, AnonymousClass0eM r3) {
        super(0);
        this.$this_viewModels = fragment;
        this.$owner$delegate = r3;
    }

    public final 2YM invoke() {
        AnonymousClass07P r1;
        2YM defaultViewModelProviderFactory;
        AnonymousClass07g r12 = (AnonymousClass07g) this.$owner$delegate.getValue();
        if (!(r12 instanceof AnonymousClass07P) || (r1 = (AnonymousClass07P) r12) == null || (defaultViewModelProviderFactory = r1.getDefaultViewModelProviderFactory()) == null) {
            return this.$this_viewModels.getDefaultViewModelProviderFactory();
        }
        return defaultViewModelProviderFactory;
    }
}
