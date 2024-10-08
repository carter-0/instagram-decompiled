package X;

/* renamed from: X.AlC  reason: case insensitive filesystem */
public final class C40904AlC implements Runnable {
    public final /* synthetic */ S3Z A00;

    public C40904AlC(S3Z s3z) {
        this.A00 = s3z;
    }

    public final void run() {
        S3Z s3z = this.A00;
        s3z.A05 = true;
        s3z.A0F.countDown();
    }
}
