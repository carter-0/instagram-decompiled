package X;

import com.aiplatform.processors.stickeranything.ig.VideoStickerAnythingProcessorV2;

/* renamed from: X.TAu  reason: case insensitive filesystem */
public final class C12854TAu implements Runnable {
    public final /* synthetic */ VideoStickerAnythingProcessorV2 A00;

    public C12854TAu(VideoStickerAnythingProcessorV2 videoStickerAnythingProcessorV2) {
        this.A00 = videoStickerAnythingProcessorV2;
    }

    public final void run() {
        1OC r0 = this.A00.A0A;
        if (r0 != null) {
            r0.run();
        } else {
            0qQ.A0F("webpDownloadTask");
            throw AnonymousClass00P.createAndThrow();
        }
    }
}
