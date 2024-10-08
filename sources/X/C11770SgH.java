package X;

import com.aiplatform.processors.stickeranything.ig.VideoStickerAnythingProcessor;
import java.net.URI;

/* renamed from: X.SgH  reason: case insensitive filesystem */
public final class C11770SgH implements C13686Tf3 {
    public final /* synthetic */ VideoStickerAnythingProcessor A00;
    public final /* synthetic */ URI A01;

    public C11770SgH(VideoStickerAnythingProcessor videoStickerAnythingProcessor, URI uri) {
        this.A00 = videoStickerAnythingProcessor;
        this.A01 = uri;
    }

    public final void E0I(int i) {
        VideoStickerAnythingProcessor videoStickerAnythingProcessor = this.A00;
        if (videoStickerAnythingProcessor.A02 > 0) {
            int i2 = videoStickerAnythingProcessor.A00;
            if (i2 < 8) {
                videoStickerAnythingProcessor.A00 = i2 * 2;
            }
            VideoStickerAnythingProcessor.A01(videoStickerAnythingProcessor);
            return;
        }
        videoStickerAnythingProcessor.Db5(C8917RFk.IGMLSegmentAnythingVideoStatusPolling, 002.A0O("Failed while polling, status code", i));
    }

    public final void E0J(byte[] bArr) {
        VideoStickerAnythingProcessor videoStickerAnythingProcessor = this.A00;
        C13764Tgc tgc = videoStickerAnythingProcessor.A06;
        if (tgc != null) {
            tgc.E0K(DbT.A10(this.A01), new C13347TVu((Object) videoStickerAnythingProcessor, 23), bArr);
        }
        if (videoStickerAnythingProcessor.A0E) {
            String str = videoStickerAnythingProcessor.A0D;
            if (str != null) {
                videoStickerAnythingProcessor.A0D = str;
                String str2 = videoStickerAnythingProcessor.A0C;
                if (str2 != null) {
                    videoStickerAnythingProcessor.A04.post(new TF3(videoStickerAnythingProcessor, str2));
                    return;
                }
                return;
            }
            return;
        }
        videoStickerAnythingProcessor.A05.removeCallbacksAndMessages((Object) null);
    }
}
