package com.instagram.debug.devoptions.metadata.view;

import X.0Yg;
import X.0sP;
import X.0sn;
import X.C60340gF;
import X.JXP;
import com.instagram.debug.devoptions.metadata.viewmodel.ThreadMetadataOverrideViewModel;

public final class ThreadMetadataOverrideFragment$onViewCreated$1 extends 0Yg implements 0sP {
    public final /* synthetic */ ThreadMetadataOverrideFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ThreadMetadataOverrideFragment$onViewCreated$1(ThreadMetadataOverrideFragment threadMetadataOverrideFragment) {
        super(1);
        this.this$0 = threadMetadataOverrideFragment;
    }

    public final void invoke(ThreadMetadataOverrideViewModel.ViewState viewState) {
        ThreadMetadataOverrideFragment threadMetadataOverrideFragment;
        JXP jxp;
        0sn r0;
        if (viewState instanceof ThreadMetadataOverrideViewModel.ViewState.Loading) {
            threadMetadataOverrideFragment = this.this$0;
            jxp = JXP.LOADING;
        } else {
            boolean z = viewState instanceof ThreadMetadataOverrideViewModel.ViewState.Success;
            threadMetadataOverrideFragment = this.this$0;
            if (z) {
                jxp = JXP.LOADED;
                r0 = ((ThreadMetadataOverrideViewModel.ViewState.Success) viewState).items;
                threadMetadataOverrideFragment.updateUi(jxp, r0);
            }
            jxp = JXP.ERROR;
        }
        r0 = 0sn.A00;
        threadMetadataOverrideFragment.updateUi(jxp, r0);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((ThreadMetadataOverrideViewModel.ViewState) obj);
        return C60340gF.A00;
    }
}
