package X;

import android.os.Handler;
import android.os.SystemClock;
import com.facebook.proxygen.LigerSamplePolicy;

/* renamed from: X.Whw  reason: case insensitive filesystem */
public final class C19927Whw implements Runnable {
    public final /* synthetic */ C18483Vsd A00;

    public C19927Whw(C18483Vsd vsd) {
        this.A00 = vsd;
    }

    public final void run() {
        C18483Vsd vsd = this.A00;
        if (SystemClock.uptimeMillis() - vsd.A00 > LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT) {
            0KC.A0O("AnomalyDetector", "Freeze Detected - we did not receive input frames for over %d ms", AnonymousClass7TF.A1b(5000));
            vsd.A01 = 1 + vsd.A01;
            if (vsd.A03 != null) {
                0KC.A0C("AnomalyDetector", "Freeze detected");
            }
        }
        Handler handler = vsd.A02;
        if (handler != null) {
            handler.postDelayed(vsd.A04, LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT);
        }
    }
}
