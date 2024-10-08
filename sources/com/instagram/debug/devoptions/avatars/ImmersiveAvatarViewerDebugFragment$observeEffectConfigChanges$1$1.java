package com.instagram.debug.devoptions.avatars;

import X.02o;
import X.0qQ;
import X.AnonymousClass00P;
import X.AnonymousClass4D7;
import X.C60340gF;
import X.C64301LZb;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerEffectConfigViewModel;

public final class ImmersiveAvatarViewerDebugFragment$observeEffectConfigChanges$1$1 implements 02o {
    public final /* synthetic */ ImmersiveAvatarViewerDebugFragment this$0;

    public ImmersiveAvatarViewerDebugFragment$observeEffectConfigChanges$1$1(ImmersiveAvatarViewerDebugFragment immersiveAvatarViewerDebugFragment) {
        this.this$0 = immersiveAvatarViewerDebugFragment;
    }

    public final Object emit(ImmersiveAvatarViewerEffectConfigViewModel.EffectConfigViewState effectConfigViewState, AnonymousClass4D7 r5) {
        String str;
        if (effectConfigViewState.isLoaded && (str = effectConfigViewState.effectId) != null) {
            ImmersiveAvatarViewerDebugFragment immersiveAvatarViewerDebugFragment = this.this$0;
            C64301LZb lZb = immersiveAvatarViewerDebugFragment.richAvatarViewHandler;
            if (lZb == null) {
                0qQ.A0F("richAvatarViewHandler");
                throw AnonymousClass00P.createAndThrow();
            }
            lZb.A01(immersiveAvatarViewerDebugFragment.requireContext(), str);
        }
        return C60340gF.A00;
    }
}
