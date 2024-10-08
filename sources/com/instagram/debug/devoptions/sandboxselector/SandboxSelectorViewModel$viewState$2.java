package com.instagram.debug.devoptions.sandboxselector;

import X.0Yk;
import X.0sI;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import com.instagram.debug.devoptions.sandboxselector.SandboxSelectorViewModel;

public final /* synthetic */ class SandboxSelectorViewModel$viewState$2 extends 0Yk implements 0sI {
    public static final SandboxSelectorViewModel$viewState$2 INSTANCE = new SandboxSelectorViewModel$viewState$2();

    public SandboxSelectorViewModel$viewState$2() {
        super(5, SandboxSelectorViewModel.ViewState.class, "<init>", "<init>(Lcom/instagram/debug/devoptions/sandboxselector/SandboxSelectorViewModel$ViewState$Sandboxes;Lcom/instagram/debug/devoptions/sandboxselector/SandboxSelectorViewModel$ViewState$ConnectionHealth;ZLcom/instagram/debug/devoptions/sandboxselector/SandboxErrorInfo;)V", 4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return new SandboxSelectorViewModel.ViewState((SandboxSelectorViewModel.ViewState.Sandboxes) obj, (SandboxSelectorViewModel.ViewState.ConnectionHealth) obj2, AnonymousClass7TE.A1a(obj3), (SandboxErrorInfo) obj4);
    }

    public final Object invoke(SandboxSelectorViewModel.ViewState.Sandboxes sandboxes, SandboxSelectorViewModel.ViewState.ConnectionHealth connectionHealth, boolean z, SandboxErrorInfo sandboxErrorInfo, AnonymousClass4D7 r6) {
        return new SandboxSelectorViewModel.ViewState(sandboxes, connectionHealth, z, sandboxErrorInfo);
    }
}
