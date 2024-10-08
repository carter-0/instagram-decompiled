package X;

import com.facebook.proxygen.LigerSamplePolicy;

/* renamed from: X.Wi9  reason: case insensitive filesystem */
public final class C19936Wi9 implements Runnable {
    public final /* synthetic */ UHR A00;

    public C19936Wi9(UHR uhr) {
        this.A00 = uhr;
    }

    public final void run() {
        UHR uhr = this.A00;
        if (uhr.A00) {
            uhr.A00.postDelayed(this, LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT);
        }
    }
}
