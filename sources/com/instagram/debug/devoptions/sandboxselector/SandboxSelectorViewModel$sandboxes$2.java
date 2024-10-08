package com.instagram.debug.devoptions.sandboxselector;

import X.0Yk;
import X.0sK;
import X.AnonymousClass4D7;
import com.instagram.debug.devoptions.sandboxselector.SandboxSelectorViewModel;
import java.util.List;

public final /* synthetic */ class SandboxSelectorViewModel$sandboxes$2 extends 0Yk implements 0sK {
    public static final SandboxSelectorViewModel$sandboxes$2 INSTANCE = new SandboxSelectorViewModel$sandboxes$2();

    public SandboxSelectorViewModel$sandboxes$2() {
        super(3, SandboxSelectorViewModel.ViewState.Sandboxes.class, "<init>", "<init>(Lcom/instagram/debug/devoptions/sandboxselector/Sandbox;Ljava/util/List;)V", 4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return new SandboxSelectorViewModel.ViewState.Sandboxes((Sandbox) obj, (List) obj2);
    }

    public final Object invoke(Sandbox sandbox, List list, AnonymousClass4D7 r4) {
        return new SandboxSelectorViewModel.ViewState.Sandboxes(sandbox, list);
    }
}
