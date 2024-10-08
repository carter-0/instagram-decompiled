package com.instagram.debug.devoptions.sandboxselector;

import X.AnonymousClass4D7;
import X.AnonymousClass972;
import X.C64101El;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.debug.devoptions.sandboxselector.SandboxRepository", f = "SandboxRepository.kt", i = {0, 1, 1}, l = {60, 66}, m = "forceSandboxesRefresh", n = {"this", "this", "currentSandbox"}, s = {"L$0", "L$0", "L$1"})
public final class SandboxRepository$forceSandboxesRefresh$1 extends C64101El {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ SandboxRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SandboxRepository$forceSandboxesRefresh$1(SandboxRepository sandboxRepository, AnonymousClass4D7 r2) {
        super(r2);
        this.this$0 = sandboxRepository;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.instagram.debug.devoptions.sandboxselector.SandboxRepository$forceSandboxesRefresh$1, X.4D7] */
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= AnonymousClass972.MUTABLE_FLAG_MASK;
        return this.this$0.forceSandboxesRefresh(this);
    }
}
