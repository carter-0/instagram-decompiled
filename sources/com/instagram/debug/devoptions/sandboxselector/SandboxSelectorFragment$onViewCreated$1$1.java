package com.instagram.debug.devoptions.sandboxselector;

import X.0Yg;
import X.0qQ;
import X.0sP;
import X.C51969G9p;
import X.C56259HvT;
import X.C60340gF;
import X.C62320sa;
import X.C68504NKx;
import com.instagram.debug.devoptions.sandboxselector.SandboxSelectorViewModel;

public final class SandboxSelectorFragment$onViewCreated$1$1 extends 0Yg implements 0sP {
    public final /* synthetic */ C68504NKx $adapter;
    public final /* synthetic */ SandboxSelectorFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SandboxSelectorFragment$onViewCreated$1$1(C68504NKx nKx, SandboxSelectorFragment sandboxSelectorFragment) {
        super(1);
        this.$adapter = nKx;
        this.this$0 = sandboxSelectorFragment;
    }

    public final void invoke(SandboxSelectorViewModel.ViewState viewState) {
        C68504NKx nKx = this.$adapter;
        0qQ.A0A(viewState);
        nKx.setItems(SandboxViewStateConverterKt.toAdapterItems(viewState, this.this$0.requireContext(), new 0sP(this.this$0.getViewModel()) {
            public final void invoke(Sandbox sandbox) {
                ((SandboxSelectorViewModel) C51969G9p.A0t(sandbox, this)).onSandboxSelected(sandbox);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Sandbox) obj);
                return C60340gF.A00;
            }
        }, new C62320sa(this.this$0.getViewModel()) {
            public final void invoke() {
                ((SandboxSelectorViewModel) this.receiver).onResetSandbox();
            }
        }, new C62320sa(this.this$0.getViewModel()) {
            public final void invoke() {
                ((SandboxSelectorViewModel) this.receiver).onManualEntryClicked();
            }
        }));
        if (viewState.isManualEntryDialogShowing) {
            this.this$0.showManualEntryDialog();
        }
        SandboxErrorInfo sandboxErrorInfo = viewState.errorInfo;
        if (sandboxErrorInfo != null) {
            SandboxSelectorFragment sandboxSelectorFragment = this.this$0;
            sandboxSelectorFragment.showErrorDialog(C56259HvT.A01(sandboxSelectorFragment, sandboxErrorInfo.title), C56259HvT.A01(sandboxSelectorFragment, sandboxErrorInfo.message));
        }
        this.this$0.updateOverlayIndicator();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((SandboxSelectorViewModel.ViewState) obj);
        return C60340gF.A00;
    }
}
