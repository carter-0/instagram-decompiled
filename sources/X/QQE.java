package X;

import com.facebook.msys.mci.NoOpMediaTranscoder;
import com.facebook.msys.mci.TranscodeVideoCompletionCallback;

public final class QQE extends AnonymousClass45Y {
    public final /* synthetic */ NoOpMediaTranscoder A00;
    public final /* synthetic */ TranscodeVideoCompletionCallback A01;

    public final void run() {
        this.A01.success((String) null, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, -1.0d);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public QQE(NoOpMediaTranscoder noOpMediaTranscoder, TranscodeVideoCompletionCallback transcodeVideoCompletionCallback) {
        super("transcodeVideo");
        this.A00 = noOpMediaTranscoder;
        this.A01 = transcodeVideoCompletionCallback;
    }
}
