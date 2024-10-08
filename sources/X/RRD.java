package X;

import android.os.Handler;
import com.aiplatform.processors.stickeranything.ig.VideoStickerAnythingProcessor;
import com.aiplatform.processors.stickeranything.ig.VideoStickerAnythingProcessorV2;
import java.util.List;

public abstract class RRD {
    public final void A04(S5Q s5q, C10963S2v s2v) {
        Handler handler;
        Runnable ti6;
        C63960LFk lFk;
        if (this instanceof VideoStickerAnythingProcessorV2) {
            VideoStickerAnythingProcessorV2 videoStickerAnythingProcessorV2 = (VideoStickerAnythingProcessorV2) this;
            Object obj = s5q.A00;
            if ((obj instanceof C63960LFk) && (lFk = (C63960LFk) obj) != null) {
                videoStickerAnythingProcessorV2.A0G = lFk.A01;
                C11020S5r s5r = lFk.A00;
                List list = s5r.A01;
                boolean z = s5r.A02;
                String str = videoStickerAnythingProcessorV2.A0E;
                if (str != null) {
                    videoStickerAnythingProcessorV2.A0E = str;
                    handler = Pxf.A0H(videoStickerAnythingProcessorV2.A0I);
                    ti6 = new TI8(videoStickerAnythingProcessorV2, list, z);
                } else {
                    return;
                }
            } else {
                return;
            }
        } else if (this instanceof VideoStickerAnythingProcessor) {
            throw AnonymousClass00P.createAndThrow();
        } else {
            QGH qgh = (QGH) this;
            handler = qgh.A00;
            ti6 = new TI6(qgh, s5q, s2v);
        }
        handler.post(ti6);
    }

    public final void A05(C8917RFk rFk) {
        if (this instanceof VideoStickerAnythingProcessorV2) {
            VideoStickerAnythingProcessorV2 videoStickerAnythingProcessorV2 = (VideoStickerAnythingProcessorV2) this;
            0qQ.A0B(rFk, 0);
            if (rFk == C8917RFk.IGMLSegmentAnythingVideoStatusPolling) {
                videoStickerAnythingProcessorV2.A01 = 0;
                1OC r0 = videoStickerAnythingProcessorV2.A0A;
                if (r0 != null) {
                    r0.onCancel();
                }
                videoStickerAnythingProcessorV2.A03.removeCallbacksAndMessages((Object) null);
            }
        } else if (this instanceof VideoStickerAnythingProcessor) {
            VideoStickerAnythingProcessor videoStickerAnythingProcessor = (VideoStickerAnythingProcessor) this;
            0qQ.A0B(rFk, 0);
            if (rFk == C8917RFk.IGMLSegmentAnythingVideoStatusPolling) {
                videoStickerAnythingProcessor.A02 = 0;
                1OC r02 = videoStickerAnythingProcessor.A09;
                if (r02 != null) {
                    r02.onCancel();
                }
                videoStickerAnythingProcessor.A09 = null;
                videoStickerAnythingProcessor.A04.removeCallbacksAndMessages((Object) null);
            }
        }
    }
}
