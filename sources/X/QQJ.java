package X;

import com.facebook.msys.mci.TranscodeVideoCompletionCallback;
import com.facebook.msys.mci.transcoder.DefaultMediaTranscoder;

public final class QQJ extends AnonymousClass45Y {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ TranscodeVideoCompletionCallback A02;
    public final /* synthetic */ DefaultMediaTranscoder A03;
    public final /* synthetic */ Throwable A04;

    public final void run() {
        this.A02.failure((double) this.A01, (double) this.A00, this.A04);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public QQJ(TranscodeVideoCompletionCallback transcodeVideoCompletionCallback, DefaultMediaTranscoder defaultMediaTranscoder, Throwable th, int i, int i2) {
        super("transcodeVideo");
        this.A03 = defaultMediaTranscoder;
        this.A02 = transcodeVideoCompletionCallback;
        this.A01 = i;
        this.A00 = i2;
        this.A04 = th;
    }
}
