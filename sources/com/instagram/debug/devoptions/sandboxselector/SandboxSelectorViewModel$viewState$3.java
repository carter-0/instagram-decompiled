package com.instagram.debug.devoptions.sandboxselector;

import X.02o;
import X.0eS;
import X.0sL;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.C60340gF;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.debug.devoptions.sandboxselector.SandboxSelectorViewModel$viewState$3", f = "SandboxSelectorViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class SandboxSelectorViewModel$viewState$3 extends AnonymousClass1Ek implements 0sL {
    public int label;
    public final /* synthetic */ SandboxSelectorViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SandboxSelectorViewModel$viewState$3(SandboxSelectorViewModel sandboxSelectorViewModel, AnonymousClass4D7 r3) {
        super(2, r3);
        this.this$0 = sandboxSelectorViewModel;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.debug.devoptions.sandboxselector.SandboxSelectorViewModel$viewState$3, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r4) {
        return new SandboxSelectorViewModel$viewState$3(this.this$0, r4);
    }

    public final Object invoke(02o r3, AnonymousClass4D7 r4) {
        return new SandboxSelectorViewModel$viewState$3(this.this$0, r4).invokeSuspend(C60340gF.A00);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            0eS.A00(obj);
            SandboxSelectorViewModel sandboxSelectorViewModel = this.this$0;
            sandboxSelectorViewModel.logger.enter(sandboxSelectorViewModel.repository.getCurrentSandbox());
            return C60340gF.A00;
        }
        throw AnonymousClass7TE.A0x();
    }
}
