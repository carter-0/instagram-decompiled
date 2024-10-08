package com.instagram.debug.devoptions.avatars;

import X.05G;
import X.07U;
import X.0eS;
import X.0sL;
import X.1Hj;
import X.AnonymousClass07V;
import X.AnonymousClass07Z;
import X.AnonymousClass1Ek;
import X.AnonymousClass3DM;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.C262224Cq;
import X.C51965G9l;
import X.C60340gF;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment$observeEffectConfigChanges$$inlined$launchAndRepeatWithViewLifecycle$default$1", f = "ImmersiveAvatarViewerDebugFragment.kt", i = {}, l = {73}, m = "invokeSuspend", n = {}, s = {})
public final class ImmersiveAvatarViewerDebugFragment$observeEffectConfigChanges$$inlined$launchAndRepeatWithViewLifecycle$default$1 extends AnonymousClass1Ek implements 0sL {
    public final /* synthetic */ 07U $minActiveState;
    public final /* synthetic */ AnonymousClass07Z $this_launchAndRepeatWithLifecycle;
    public int label;
    public final /* synthetic */ ImmersiveAvatarViewerDebugFragment this$0;

    @DebugMetadata(c = "com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment$observeEffectConfigChanges$$inlined$launchAndRepeatWithViewLifecycle$default$1$1", f = "ImmersiveAvatarViewerDebugFragment.kt", i = {}, l = {75}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment$observeEffectConfigChanges$$inlined$launchAndRepeatWithViewLifecycle$default$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends AnonymousClass1Ek implements 0sL {
        public /* synthetic */ Object L$0;
        public int label;

        /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment$observeEffectConfigChanges$$inlined$launchAndRepeatWithViewLifecycle$default$1$1, X.4D7] */
        public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r4) {
            ? r0 = new AnonymousClass1(r4, immersiveAvatarViewerDebugFragment);
            r0.L$0 = obj;
            return r0;
        }

        public final Object invoke(C262224Cq r3, AnonymousClass4D7 r4) {
            return ((AnonymousClass1) create(r3, r4)).invokeSuspend(C60340gF.A00);
        }

        /* JADX WARNING: type inference failed for: r5v0, types: [com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment$observeEffectConfigChanges$$inlined$launchAndRepeatWithViewLifecycle$default$1$1, X.4D7] */
        public final Object invokeSuspend(Object obj) {
            1Hj r4 = 1Hj.A02;
            int i = this.label;
            if (i == 0) {
                0eS.A00(obj);
                05G r2 = immersiveAvatarViewerDebugFragment.getViewModel()._effectConfig;
                ImmersiveAvatarViewerDebugFragment$observeEffectConfigChanges$1$1 immersiveAvatarViewerDebugFragment$observeEffectConfigChanges$1$1 = new ImmersiveAvatarViewerDebugFragment$observeEffectConfigChanges$1$1(immersiveAvatarViewerDebugFragment);
                this.label = 1;
                if (r2.collect(immersiveAvatarViewerDebugFragment$observeEffectConfigChanges$1$1, this) == r4) {
                    return r4;
                }
            } else if (i != 1) {
                throw AnonymousClass7TE.A0x();
            } else {
                0eS.A00(obj);
            }
            throw C51965G9l.A0x();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ImmersiveAvatarViewerDebugFragment$observeEffectConfigChanges$$inlined$launchAndRepeatWithViewLifecycle$default$1(AnonymousClass07Z r2, 07U r3, AnonymousClass4D7 r4, ImmersiveAvatarViewerDebugFragment immersiveAvatarViewerDebugFragment) {
        super(2, r4);
        this.$this_launchAndRepeatWithLifecycle = r2;
        this.$minActiveState = r3;
        this.this$0 = immersiveAvatarViewerDebugFragment;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment$observeEffectConfigChanges$$inlined$launchAndRepeatWithViewLifecycle$default$1, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r6) {
        return new ImmersiveAvatarViewerDebugFragment$observeEffectConfigChanges$$inlined$launchAndRepeatWithViewLifecycle$default$1(this.$this_launchAndRepeatWithLifecycle, this.$minActiveState, r6, this.this$0);
    }

    public final Object invoke(C262224Cq r3, AnonymousClass4D7 r4) {
        return ((ImmersiveAvatarViewerDebugFragment$observeEffectConfigChanges$$inlined$launchAndRepeatWithViewLifecycle$default$1) create(r3, r4)).invokeSuspend(C60340gF.A00);
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment$observeEffectConfigChanges$$inlined$launchAndRepeatWithViewLifecycle$default$1, X.4D7] */
    public final Object invokeSuspend(Object obj) {
        1Hj r6 = 1Hj.A02;
        int i = this.label;
        if (i == 0) {
            0eS.A00(obj);
            AnonymousClass07V lifecycle = this.$this_launchAndRepeatWithLifecycle.getLifecycle();
            07U r3 = this.$minActiveState;
            final ImmersiveAvatarViewerDebugFragment immersiveAvatarViewerDebugFragment = this.this$0;
            AnonymousClass1 r0 = new AnonymousClass1((AnonymousClass4D7) null);
            this.label = 1;
            if (AnonymousClass3DM.A00(r3, lifecycle, this, r0) == r6) {
                return r6;
            }
        } else if (i == 1) {
            0eS.A00(obj);
        } else {
            throw AnonymousClass7TE.A0x();
        }
        return C60340gF.A00;
    }
}
