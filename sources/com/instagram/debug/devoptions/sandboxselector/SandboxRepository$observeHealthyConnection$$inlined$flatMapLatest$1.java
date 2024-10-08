package com.instagram.debug.devoptions.sandboxselector;

import X.02o;
import X.0eS;
import X.0sK;
import X.1Hj;
import X.AnonymousClass0r6;
import X.AnonymousClass11O;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.C60340gF;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.debug.devoptions.sandboxselector.SandboxRepository$observeHealthyConnection$$inlined$flatMapLatest$1", f = "SandboxRepository.kt", i = {}, l = {189}, m = "invokeSuspend", n = {}, s = {})
public final class SandboxRepository$observeHealthyConnection$$inlined$flatMapLatest$1 extends AnonymousClass1Ek implements 0sK {
    public /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public int label;
    public final /* synthetic */ SandboxRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SandboxRepository$observeHealthyConnection$$inlined$flatMapLatest$1(AnonymousClass4D7 r2, SandboxRepository sandboxRepository) {
        super(3, r2);
        this.this$0 = sandboxRepository;
    }

    public final Object invoke(02o r3, Object obj, AnonymousClass4D7 r5) {
        SandboxRepository$observeHealthyConnection$$inlined$flatMapLatest$1 sandboxRepository$observeHealthyConnection$$inlined$flatMapLatest$1 = new SandboxRepository$observeHealthyConnection$$inlined$flatMapLatest$1(r5, this.this$0);
        sandboxRepository$observeHealthyConnection$$inlined$flatMapLatest$1.L$0 = r3;
        sandboxRepository$observeHealthyConnection$$inlined$flatMapLatest$1.L$1 = obj;
        return sandboxRepository$observeHealthyConnection$$inlined$flatMapLatest$1.invokeSuspend(C60340gF.A00);
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [com.instagram.debug.devoptions.sandboxselector.SandboxRepository$observeHealthyConnection$$inlined$flatMapLatest$1, X.4D7] */
    public final Object invokeSuspend(Object obj) {
        1Hj r3 = 1Hj.A02;
        int i = this.label;
        if (i == 0) {
            0eS.A00(obj);
            AnonymousClass0r6 access$observeServerHealth = this.this$0.observeServerHealth();
            this.label = 1;
            if (AnonymousClass11O.A02(this, access$observeServerHealth, (02o) this.L$0) == r3) {
                return r3;
            }
        } else if (i == 1) {
            0eS.A00(obj);
        } else {
            throw AnonymousClass7TE.A0x();
        }
        return C60340gF.A00;
    }
}
