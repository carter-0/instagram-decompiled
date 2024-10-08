package X;

import com.facebook.msys.mci.NoOpMediaTranscoder;
import com.facebook.msys.mci.VideoSizeEstimatorCompletionCallback;

public final class QQF extends AnonymousClass45Y {
    public final /* synthetic */ NoOpMediaTranscoder A00;
    public final /* synthetic */ VideoSizeEstimatorCompletionCallback A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public QQF(NoOpMediaTranscoder noOpMediaTranscoder, VideoSizeEstimatorCompletionCallback videoSizeEstimatorCompletionCallback) {
        super("estimateVideoSize");
        this.A00 = noOpMediaTranscoder;
        this.A01 = videoSizeEstimatorCompletionCallback;
    }

    public final void run() {
        this.A01.success(0);
    }
}
