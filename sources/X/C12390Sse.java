package X;

import com.aiplatform.processors.stickeranything.ig.VideoStickerAnythingProcessorV2;

/* renamed from: X.Sse  reason: case insensitive filesystem */
public final class C12390Sse implements C13821Thq {
    public final /* synthetic */ VideoStickerAnythingProcessorV2 A00;

    public final /* bridge */ /* synthetic */ void DEb(Object obj) {
        0qQ.A0B(obj, 0);
        VideoStickerAnythingProcessorV2 videoStickerAnythingProcessorV2 = this.A00;
        String A0m = AnonymousClass7TG.A0m(obj, "Failed video upload: ", AnonymousClass7TE.A1A());
        C13764Tgc tgc = videoStickerAnythingProcessorV2.A04;
        if (tgc != null) {
            tgc.DEg((C8917RFk) null, A0m);
        }
    }

    public final void DaE(float f) {
    }

    public C12390Sse(VideoStickerAnythingProcessorV2 videoStickerAnythingProcessorV2) {
        this.A00 = videoStickerAnythingProcessorV2;
    }

    public final /* bridge */ /* synthetic */ void D0h(Object obj) {
        C11039S6r s6r = this.A00.A06;
        if (s6r != null) {
            s6r.A00("upload_cancelled");
        }
    }

    public final void onStart() {
        System.currentTimeMillis();
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        obj.toString();
        System.currentTimeMillis();
    }
}
