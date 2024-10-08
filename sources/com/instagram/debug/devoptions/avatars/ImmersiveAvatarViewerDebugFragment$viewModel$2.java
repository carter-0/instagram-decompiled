package com.instagram.debug.devoptions.avatars;

import X.0Yg;
import X.2YM;
import X.AnonymousClass7TE;
import X.C62320sa;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerEffectConfigViewModel;

public final class ImmersiveAvatarViewerDebugFragment$viewModel$2 extends 0Yg implements C62320sa {
    public final /* synthetic */ ImmersiveAvatarViewerDebugFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ImmersiveAvatarViewerDebugFragment$viewModel$2(ImmersiveAvatarViewerDebugFragment immersiveAvatarViewerDebugFragment) {
        super(0);
        this.this$0 = immersiveAvatarViewerDebugFragment;
    }

    public final 2YM invoke() {
        return new ImmersiveAvatarViewerEffectConfigViewModel.Factory(AnonymousClass7TE.A0l(this.this$0.session$delegate));
    }
}
