package X;

import com.facebook.msys.mci.TranscodeVideoCompletionCallback;
import com.facebook.msys.mci.transcoder.DefaultMediaTranscoder;

public final class QQM extends AnonymousClass45Y {
    public final /* synthetic */ double A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ TranscodeVideoCompletionCallback A03;
    public final /* synthetic */ DefaultMediaTranscoder A04;
    public final /* synthetic */ C7232Q0d A05;
    public final /* synthetic */ String A06;

    public final void run() {
        TranscodeVideoCompletionCallback transcodeVideoCompletionCallback = this.A03;
        String str = this.A06;
        double d = (double) this.A02;
        double d2 = (double) this.A01;
        double d3 = (double) this.A05.A06;
        double d4 = d3;
        transcodeVideoCompletionCallback.success(str, d, d2, d, d2, 0.0d, d4, this.A00, 100.0d * -1.0d);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public QQM(TranscodeVideoCompletionCallback transcodeVideoCompletionCallback, DefaultMediaTranscoder defaultMediaTranscoder, C7232Q0d q0d, String str, double d, int i, int i2) {
        super("transcodeVideo");
        this.A04 = defaultMediaTranscoder;
        this.A03 = transcodeVideoCompletionCallback;
        this.A06 = str;
        this.A02 = i;
        this.A01 = i2;
        this.A05 = q0d;
        this.A00 = d;
    }
}
