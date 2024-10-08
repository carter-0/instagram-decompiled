package com.instagram.debug.devoptions.section.xme;

import X.0qQ;
import X.2Cn;
import X.C59689JTv;
import X.C59730JVo;
import java.io.File;

public final class WearableMediaDownloadManager$downloadFile$1 extends 2Cn {
    public final /* synthetic */ boolean $isVideo;
    public final /* synthetic */ String $metadataMarker;
    public final /* synthetic */ WearableMediaDownloadManager this$0;

    public void onSuccess(File file) {
        0qQ.A0B(file, 0);
        boolean z = this.$isVideo;
        WearableMediaDownloadManager wearableMediaDownloadManager = this.this$0;
        String str = this.$metadataMarker;
        if (z) {
            wearableMediaDownloadManager.writeExifCommentField(file, str);
        } else {
            wearableMediaDownloadManager.writeExifImageFields(file, str);
        }
        C59730JVo.A08(this.this$0.context, file);
    }

    public WearableMediaDownloadManager$downloadFile$1(boolean z, WearableMediaDownloadManager wearableMediaDownloadManager, String str) {
        this.$isVideo = z;
        this.this$0 = wearableMediaDownloadManager;
        this.$metadataMarker = str;
    }

    public void onFail(Exception exc) {
        C59689JTv.A03(this.this$0.context, "Failed to save media", "wearable_media_tool_download_failed", 0);
    }
}
