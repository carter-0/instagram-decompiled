package X;

import com.aiplatform.processors.stickeranything.ig.VideoStickerAnythingProcessorV2;
import java.net.URI;

public final class SgI implements C13686Tf3 {
    public final /* synthetic */ VideoStickerAnythingProcessorV2 A00;
    public final /* synthetic */ URI A01;

    public SgI(VideoStickerAnythingProcessorV2 videoStickerAnythingProcessorV2, URI uri) {
        this.A00 = videoStickerAnythingProcessorV2;
        this.A01 = uri;
    }

    public final void E0I(int i) {
        VideoStickerAnythingProcessorV2 videoStickerAnythingProcessorV2 = this.A00;
        if (videoStickerAnythingProcessorV2.A01 > 0) {
            int i2 = videoStickerAnythingProcessorV2.A00;
            if (i2 < 8) {
                videoStickerAnythingProcessorV2.A00 = i2 * 2;
            }
            VideoStickerAnythingProcessorV2.A01(videoStickerAnythingProcessorV2);
            return;
        }
        C11039S6r s6r = videoStickerAnythingProcessorV2.A06;
        if (s6r != null) {
            s6r.A01("polling_start");
        }
    }

    public final void E0J(byte[] bArr) {
        String str;
        VideoStickerAnythingProcessorV2 videoStickerAnythingProcessorV2 = this.A00;
        C13764Tgc tgc = videoStickerAnythingProcessorV2.A04;
        if (tgc != null) {
            tgc.E0K(DbT.A10(this.A01), new C13347TVu((Object) videoStickerAnythingProcessorV2, 24), bArr);
        }
        if (videoStickerAnythingProcessorV2.A0G && (str = videoStickerAnythingProcessorV2.A0E) != null) {
            videoStickerAnythingProcessorV2.A0E = str;
            String str2 = videoStickerAnythingProcessorV2.A0D;
            if (str2 != null) {
                videoStickerAnythingProcessorV2.A03.post(new TF5(videoStickerAnythingProcessorV2, str2));
            }
        }
    }
}
