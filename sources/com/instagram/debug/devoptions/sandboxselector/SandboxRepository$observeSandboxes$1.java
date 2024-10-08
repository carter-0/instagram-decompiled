package com.instagram.debug.devoptions.sandboxselector;

import X.0eS;
import X.0sK;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.C60340gF;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.debug.devoptions.sandboxselector.SandboxRepository$observeSandboxes$1", f = "SandboxRepository.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class SandboxRepository$observeSandboxes$1 extends AnonymousClass1Ek implements 0sK {
    public /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public int label;

    public SandboxRepository$observeSandboxes$1(AnonymousClass4D7 r2) {
        super(3, r2);
    }

    public final Object invoke(List list, String str, AnonymousClass4D7 r5) {
        SandboxRepository$observeSandboxes$1 sandboxRepository$observeSandboxes$1 = new SandboxRepository$observeSandboxes$1(r5);
        sandboxRepository$observeSandboxes$1.L$0 = list;
        sandboxRepository$observeSandboxes$1.L$1 = str;
        return sandboxRepository$observeSandboxes$1.invokeSuspend(C60340gF.A00);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            0eS.A00(obj);
            return SandboxDataModelConverterKt.toSandboxes((List) this.L$0, (String) this.L$1, "i.instagram.com");
        }
        throw AnonymousClass7TE.A0x();
    }
}
