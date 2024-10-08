package X;

import com.facebook.proxygen.LigerSamplePolicy;

public final class PUP implements Runnable {
    public final /* synthetic */ C70969OTq A00;

    public PUP(C70969OTq oTq) {
        this.A00 = oTq;
    }

    public final void run() {
        C70969OTq oTq = this.A00;
        JTO.A0E(oTq.A05).postDelayed(oTq.A02, LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT);
    }
}
