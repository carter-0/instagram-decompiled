package com.instagram.debug.devoptions.sandboxselector;

import X.0eS;
import X.0sL;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.C56078HsR;
import X.C56259HvT;
import X.C59689JTv;
import X.C60340gF;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.debug.devoptions.sandboxselector.SandboxSelectorFragment$onViewCreated$1$2", f = "SandboxSelectorFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class SandboxSelectorFragment$onViewCreated$1$2 extends AnonymousClass1Ek implements 0sL {
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ SandboxSelectorFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SandboxSelectorFragment$onViewCreated$1$2(SandboxSelectorFragment sandboxSelectorFragment, AnonymousClass4D7 r3) {
        super(2, r3);
        this.this$0 = sandboxSelectorFragment;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.debug.devoptions.sandboxselector.SandboxSelectorFragment$onViewCreated$1$2, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r4) {
        ? sandboxSelectorFragment$onViewCreated$1$2 = new SandboxSelectorFragment$onViewCreated$1$2(this.this$0, r4);
        sandboxSelectorFragment$onViewCreated$1$2.L$0 = obj;
        return sandboxSelectorFragment$onViewCreated$1$2;
    }

    public final Object invoke(C56078HsR hsR, AnonymousClass4D7 r4) {
        return ((SandboxSelectorFragment$onViewCreated$1$2) create(hsR, r4)).invokeSuspend(C60340gF.A00);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            0eS.A00(obj);
            C59689JTv.A09(this.this$0.requireContext(), C56259HvT.A01(this.this$0, (C56078HsR) this.L$0));
            return C60340gF.A00;
        }
        throw AnonymousClass7TE.A0x();
    }
}
