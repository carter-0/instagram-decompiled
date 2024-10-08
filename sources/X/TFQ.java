package X;

public final class TFQ implements Runnable {
    public final /* synthetic */ C7902QcU A00;
    public final /* synthetic */ S3A A01;

    public TFQ(C7902QcU qcU, S3A s3a) {
        this.A01 = s3a;
        this.A00 = qcU;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.QcU, android.webkit.WebView] */
    public final void run() {
        this.A01.A00(this.A00.getUrl());
    }
}
