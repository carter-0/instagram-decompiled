package com.instagram.debug.devoptions.sandboxselector;

import X.02o;
import X.0eS;
import X.0sK;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.C60340gF;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.debug.devoptions.sandboxselector.SandboxSelectorViewModel$viewState$4", f = "SandboxSelectorViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class SandboxSelectorViewModel$viewState$4 extends AnonymousClass1Ek implements 0sK {
    public int label;
    public final /* synthetic */ SandboxSelectorViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SandboxSelectorViewModel$viewState$4(SandboxSelectorViewModel sandboxSelectorViewModel, AnonymousClass4D7 r3) {
        super(3, r3);
        this.this$0 = sandboxSelectorViewModel;
    }

    public final Object invoke(02o r3, Throwable th, AnonymousClass4D7 r5) {
        return new SandboxSelectorViewModel$viewState$4(this.this$0, r5).invokeSuspend(C60340gF.A00);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            0eS.A00(obj);
            SandboxSelectorViewModel sandboxSelectorViewModel = this.this$0;
            sandboxSelectorViewModel.logger.exit(sandboxSelectorViewModel.repository.getCurrentSandbox());
            return C60340gF.A00;
        }
        throw AnonymousClass7TE.A0x();
    }
}
