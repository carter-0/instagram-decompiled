package com.instagram.debug.devoptions.sandboxselector;

import android.content.DialogInterface;

public final class SandboxSelectorFragment$showErrorDialog$2 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ SandboxSelectorFragment this$0;

    public SandboxSelectorFragment$showErrorDialog$2(SandboxSelectorFragment sandboxSelectorFragment) {
        this.this$0 = sandboxSelectorFragment;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        this.this$0.getViewModel().onErrorDialogDismissed();
    }
}
