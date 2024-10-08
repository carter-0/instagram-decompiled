package X;

import com.facebook.msys.mci.TranscodeVideoCompletionCallback;

public final class QQH extends AnonymousClass45Y {
    public final /* synthetic */ double A00;
    public final /* synthetic */ C7959Qe0 A01;
    public final /* synthetic */ SRW A02;
    public final /* synthetic */ String A03;

    public final void run() {
        C7959Qe0 qe0 = this.A01;
        TranscodeVideoCompletionCallback transcodeVideoCompletionCallback = qe0.A05;
        String str = this.A03;
        double d = (double) qe0.A01;
        double d2 = (double) qe0.A00;
        double d3 = (double) qe0.A03;
        double d4 = (double) qe0.A02;
        double d5 = (double) this.A02.A0I;
        double d6 = d5;
        transcodeVideoCompletionCallback.success(str, d, d2, d3, d4, 0.0d, d6, this.A00, 100.0d * -1.0d);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public QQH(C7959Qe0 qe0, SRW srw, String str, double d) {
        super("transcodeVideo");
        this.A01 = qe0;
        this.A03 = str;
        this.A02 = srw;
        this.A00 = d;
    }
}
