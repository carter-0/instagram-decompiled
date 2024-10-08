package X;

import com.aiplatform.processors.stickeranything.ig.VideoStickerAnythingProcessor;

public final class TF2 implements Runnable {
    public final /* synthetic */ C8917RFk A00;
    public final /* synthetic */ VideoStickerAnythingProcessor A01;

    public TF2(C8917RFk rFk, VideoStickerAnythingProcessor videoStickerAnythingProcessor) {
        this.A01 = videoStickerAnythingProcessor;
        this.A00 = rFk;
    }

    public final void run() {
        VideoStickerAnythingProcessor videoStickerAnythingProcessor = this.A01;
        C8917RFk rFk = this.A00;
        videoStickerAnythingProcessor.A05(rFk);
        02m.A0p.markerEnd(900937655, 113);
        String A0R = 002.A0R("timeout ", rFk.A01);
        videoStickerAnythingProcessor.A05.removeCallbacksAndMessages((Object) null);
        C13764Tgc tgc = videoStickerAnythingProcessor.A06;
        if (tgc != null) {
            tgc.DEg(rFk, A0R);
        }
    }
}
