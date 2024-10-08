package com.instagram.debug.devoptions.metadata.view;

import X.DbX;
import android.content.DialogInterface;

public final class ThreadMetadataOverrideFragment$showConfirmationDialog$1 implements DialogInterface.OnClickListener {
    public final /* synthetic */ ThreadMetadataOverrideFragment this$0;

    public ThreadMetadataOverrideFragment$showConfirmationDialog$1(ThreadMetadataOverrideFragment threadMetadataOverrideFragment) {
        this.this$0 = threadMetadataOverrideFragment;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.this$0.getViewModel().save();
        DbX.A1I(this.this$0);
    }
}
