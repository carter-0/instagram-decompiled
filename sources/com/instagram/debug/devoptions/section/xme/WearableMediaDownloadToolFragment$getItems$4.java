package com.instagram.debug.devoptions.section.xme;

import X.0qQ;
import X.AnonymousClass00P;
import X.AnonymousClass0fD;
import android.view.View;
import com.instagram.debug.devoptions.section.xme.WearableMediaDownloadManager;

public final class WearableMediaDownloadToolFragment$getItems$4 implements View.OnClickListener {
    public final /* synthetic */ WearableMediaDownloadToolFragment this$0;

    public WearableMediaDownloadToolFragment$getItems$4(WearableMediaDownloadToolFragment wearableMediaDownloadToolFragment) {
        this.this$0 = wearableMediaDownloadToolFragment;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(1318607119);
        WearableMediaDownloadManager wearableMediaDownloadManager = this.this$0.downloadManager;
        if (wearableMediaDownloadManager == null) {
            0qQ.A0F("downloadManager");
            throw AnonymousClass00P.createAndThrow();
        }
        wearableMediaDownloadManager.downloadFile(WearableMediaDownloadManager.MediaType.STELLA_VIDEO, true);
        AnonymousClass0fD.A0C(-1096066188, A05);
    }
}
