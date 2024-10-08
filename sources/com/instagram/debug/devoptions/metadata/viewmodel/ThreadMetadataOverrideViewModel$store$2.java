package com.instagram.debug.devoptions.metadata.viewmodel;

import X.0Yg;
import X.C62320sa;
import com.instagram.debug.devoptions.metadata.store.ThreadMetadataOverrideStore;

public final class ThreadMetadataOverrideViewModel$store$2 extends 0Yg implements C62320sa {
    public final /* synthetic */ ThreadMetadataOverrideViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ThreadMetadataOverrideViewModel$store$2(ThreadMetadataOverrideViewModel threadMetadataOverrideViewModel) {
        super(0);
        this.this$0 = threadMetadataOverrideViewModel;
    }

    public final ThreadMetadataOverrideStore invoke() {
        return ThreadMetadataOverrideStore.Companion.getInstance(this.this$0.userSession);
    }
}
