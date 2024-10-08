package com.instagram.debug.devoptions.metadata.view;

import X.DbX;
import android.content.DialogInterface;

public final class ThreadMetadataOverrideFragment$showConfirmationDialog$2 implements DialogInterface.OnClickListener {
    public final /* synthetic */ ThreadMetadataOverrideFragment this$0;

    public ThreadMetadataOverrideFragment$showConfirmationDialog$2(ThreadMetadataOverrideFragment threadMetadataOverrideFragment) {
        this.this$0 = threadMetadataOverrideFragment;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.this$0.getViewModel().reset();
        DbX.A1I(this.this$0);
    }
}
