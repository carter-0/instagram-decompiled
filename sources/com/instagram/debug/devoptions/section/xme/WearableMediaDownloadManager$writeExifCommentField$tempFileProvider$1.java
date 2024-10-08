package com.instagram.debug.devoptions.section.xme;

import X.0qQ;
import X.C13589TdH;
import java.io.File;

public final class WearableMediaDownloadManager$writeExifCommentField$tempFileProvider$1 implements C13589TdH {
    public final /* synthetic */ WearableMediaDownloadManager this$0;

    public WearableMediaDownloadManager$writeExifCommentField$tempFileProvider$1(WearableMediaDownloadManager wearableMediaDownloadManager) {
        this.this$0 = wearableMediaDownloadManager;
    }

    public final File createTempFile(String str, String str2) {
        0qQ.A0B(str, 0);
        return File.createTempFile(str, str2, this.this$0.context.getCacheDir());
    }
}
