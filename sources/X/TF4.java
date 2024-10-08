package X;

import com.aiplatform.processors.stickeranything.ig.VideoStickerAnythingProcessorV2;
import com.instagram.pendingmedia.service.common.ParsingSyncHttpService;
import java.io.IOException;

public final class TF4 implements Runnable {
    public final /* synthetic */ VideoStickerAnythingProcessorV2 A00;
    public final /* synthetic */ AnonymousClass1QX A01;

    public TF4(VideoStickerAnythingProcessorV2 videoStickerAnythingProcessorV2, AnonymousClass1QX r2) {
        this.A00 = videoStickerAnythingProcessorV2;
        this.A01 = r2;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.1ut, java.lang.Object] */
    public final void run() {
        Integer num;
        VideoStickerAnythingProcessorV2 videoStickerAnythingProcessorV2 = this.A00;
        C63790L6w A012 = ParsingSyncHttpService.A01(this.A01, videoStickerAnythingProcessorV2.A0L, new Object());
        2ZL r0 = A012.A00;
        if (r0 == null || r0.A02 != 200) {
            C8917RFk rFk = C8917RFk.IGMLSegmentAnythingVideoStatusConfigureSticker;
            1XP r2 = A012.A01;
            K1X k1x = (K1X) r2;
            if (k1x == null || (num = k1x.A02) == null || num.intValue() <= 0) {
                IOException iOException = A012.A02;
                if (iOException != null) {
                    iOException.toString();
                }
            } else {
                rFk.A00 = new S5A(num);
                1XP r22 = r2;
                if (r22 != null) {
                    r22.getErrorMessage();
                }
            }
            C11039S6r s6r = videoStickerAnythingProcessorV2.A06;
            if (s6r != null) {
                s6r.A01("configure_sticker_start");
                return;
            }
            return;
        }
        C11039S6r s6r2 = videoStickerAnythingProcessorV2.A06;
        if (s6r2 != null) {
            s6r2.A02("configure_sticker_finished", C13289TTo.A00);
        }
        C13764Tgc tgc = videoStickerAnythingProcessorV2.A04;
        if (tgc != null) {
            tgc.Dgk();
        }
        C11039S6r s6r3 = videoStickerAnythingProcessorV2.A06;
        if (s6r3 != null) {
            s6r3.A03.execute(new C12853TAt(s6r3));
            S1Z s1z = s6r3.A02;
            Pxi.A1J(s1z, s1z.A02, 16);
        }
    }
}
