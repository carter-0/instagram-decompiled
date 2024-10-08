package X;

import com.aiplatform.processors.stickeranything.ig.VideoStickerAnythingProcessor;
import com.instagram.pendingmedia.service.common.ParsingSyncHttpService;

public final class TF1 implements Runnable {
    public final /* synthetic */ VideoStickerAnythingProcessor A00;
    public final /* synthetic */ AnonymousClass1QX A01;

    public TF1(VideoStickerAnythingProcessor videoStickerAnythingProcessor, AnonymousClass1QX r2) {
        this.A00 = videoStickerAnythingProcessor;
        this.A01 = r2;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.1ut, java.lang.Object] */
    public final void run() {
        String A0i;
        Integer num;
        VideoStickerAnythingProcessor videoStickerAnythingProcessor = this.A00;
        C63790L6w A012 = ParsingSyncHttpService.A01(this.A01, videoStickerAnythingProcessor.A0K, new Object());
        2ZL r0 = A012.A00;
        if (r0 == null || r0.A02 != 200) {
            C8917RFk rFk = C8917RFk.IGMLSegmentAnythingVideoStatusConfigureSticker;
            1XP r2 = A012.A01;
            K1X k1x = (K1X) r2;
            if (k1x == null || (num = k1x.A02) == null || num.intValue() <= 0) {
                StringBuilder A1A = AnonymousClass7TE.A1A();
                A1A.append("configure sticker failed ");
                A0i = AnonymousClass7TF.A0i(A012.A02, A1A);
            } else {
                rFk.A00 = new S5A(num);
                1XP r22 = r2;
                if (r22 == null || (A0i = r22.getErrorMessage()) == null) {
                    A0i = "Fail to save cutout stickers because of reaching maximum number of cutout stickers";
                }
            }
            videoStickerAnythingProcessor.Db5(rFk, A0i);
            return;
        }
        videoStickerAnythingProcessor.Db4(C8917RFk.IGMLSegmentAnythingVideoStatusConfigureStickerFinished);
        C13764Tgc tgc = videoStickerAnythingProcessor.A06;
        if (tgc != null) {
            tgc.Dgk();
        }
        02m.A0p.markerEnd(900937655, 2);
        videoStickerAnythingProcessor.A05.removeCallbacksAndMessages((Object) null);
    }
}
