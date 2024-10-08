package X;

import com.aiplatform.processors.stickeranything.ig.VideoStickerAnythingProcessor;

/* renamed from: X.M1c  reason: case insensitive filesystem */
public final class C65836M1c implements Runnable {
    public final /* synthetic */ VideoStickerAnythingProcessor A00;

    public C65836M1c(VideoStickerAnythingProcessor videoStickerAnythingProcessor) {
        this.A00 = videoStickerAnythingProcessor;
    }

    public final void run() {
        VideoStickerAnythingProcessor videoStickerAnythingProcessor = this.A00;
        1OC r0 = videoStickerAnythingProcessor.A09;
        if (r0 != null) {
            1GK r1 = r0.A04;
            if (!r1.A0C() && !r1.A0B() && !r1.A0D()) {
                1OC r02 = videoStickerAnythingProcessor.A09;
                if (r02 != null) {
                    r02.run();
                    return;
                }
                return;
            }
        }
        0f9 AEf = 0wj.A01.AEf("VideoStickerAnythingProcessor", 817892340);
        AEf.ABQ("VideoStickerAnythingProcessor", "webpDownloadTask is finished");
        AEf.report();
    }
}
