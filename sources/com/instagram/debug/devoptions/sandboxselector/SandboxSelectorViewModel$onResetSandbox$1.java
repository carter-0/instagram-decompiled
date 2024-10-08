package com.instagram.debug.devoptions.sandboxselector;

import X.0eS;
import X.0qQ;
import X.0sL;
import X.1Hj;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.C249513ju;
import X.C262224Cq;
import X.C56078HsR;
import X.C60340gF;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.debug.devoptions.sandboxselector.SandboxSelectorViewModel$onResetSandbox$1", f = "SandboxSelectorViewModel.kt", i = {}, l = {98}, m = "invokeSuspend", n = {}, s = {})
public final class SandboxSelectorViewModel$onResetSandbox$1 extends AnonymousClass1Ek implements 0sL {
    public int label;
    public final /* synthetic */ SandboxSelectorViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SandboxSelectorViewModel$onResetSandbox$1(SandboxSelectorViewModel sandboxSelectorViewModel, AnonymousClass4D7 r3) {
        super(2, r3);
        this.this$0 = sandboxSelectorViewModel;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.debug.devoptions.sandboxselector.SandboxSelectorViewModel$onResetSandbox$1, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r4) {
        return new SandboxSelectorViewModel$onResetSandbox$1(this.this$0, r4);
    }

    public final Object invoke(C262224Cq r3, AnonymousClass4D7 r4) {
        return new SandboxSelectorViewModel$onResetSandbox$1(this.this$0, r4).invokeSuspend(C60340gF.A00);
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [com.instagram.debug.devoptions.sandboxselector.SandboxSelectorViewModel$onResetSandbox$1, X.4D7] */
    public final Object invokeSuspend(Object obj) {
        int i;
        1Hj r4 = 1Hj.A02;
        int i2 = this.label;
        if (i2 == 0) {
            0eS.A00(obj);
            if (0qQ.A0K(this.this$0.repository.getCurrentSandbox().url, "i.instagram.com")) {
                i = 2131958254;
            } else {
                this.this$0.repository.resetToDefaultSandbox();
                i = 2131958255;
            }
            C249513ju r2 = this.this$0._toasts;
            C56078HsR hsR = new C56078HsR(new Object[0], i);
            this.label = 1;
            if (r2.ELH(hsR, this) == r4) {
                return r4;
            }
        } else if (i2 == 1) {
            0eS.A00(obj);
        } else {
            throw AnonymousClass7TE.A0x();
        }
        return C60340gF.A00;
    }
}
