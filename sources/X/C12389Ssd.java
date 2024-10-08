package X;

import com.aiplatform.processors.stickeranything.ig.VideoStickerAnythingProcessor;

/* renamed from: X.Ssd  reason: case insensitive filesystem */
public final class C12389Ssd implements C13821Thq {
    public final /* synthetic */ VideoStickerAnythingProcessor A00;

    public final /* bridge */ /* synthetic */ void DEb(Object obj) {
        0qQ.A0B(obj, 0);
        VideoStickerAnythingProcessor videoStickerAnythingProcessor = this.A00;
        String A0m = AnonymousClass7TG.A0m(obj, "Failed video upload: ", AnonymousClass7TE.A1A());
        videoStickerAnythingProcessor.A05.removeCallbacksAndMessages((Object) null);
        C13764Tgc tgc = videoStickerAnythingProcessor.A06;
        if (tgc != null) {
            tgc.DEg((C8917RFk) null, A0m);
        }
    }

    public final void DaE(float f) {
    }

    public C12389Ssd(VideoStickerAnythingProcessor videoStickerAnythingProcessor) {
        this.A00 = videoStickerAnythingProcessor;
    }

    public final /* bridge */ /* synthetic */ void D0h(Object obj) {
        VideoStickerAnythingProcessor.A03(AnonymousClass7TF.A0w("cancel_reason", "upload_cancelled"));
        02m.A0p.markerEnd(900937655, 4);
    }

    public final void onStart() {
        System.currentTimeMillis();
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        obj.toString();
        System.currentTimeMillis();
    }
}
