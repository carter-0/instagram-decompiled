package X;

import com.facebook.proxygen.LigerSamplePolicy;

/* renamed from: X.2nj  reason: invalid class name and case insensitive filesystem */
public final class C229602nj {
    public boolean A00;
    public final 02m A01;
    public final boolean A02;

    public final void A00(boolean z) {
        if (z) {
            if (this.A00) {
                this.A00 = false;
                this.A01.markerEnd(23592986, 2);
            }
        } else if (this.A02 && C64031Cc.A02() <= LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT) {
            this.A00 = true;
            02m r4 = this.A01;
            r4.markerStart(23592986);
            r4.markerAnnotate(23592986, "startup_type", C64031Cc.A09.toString());
            r4.markerAnnotate(23592986, "time_since_startup", C64031Cc.A02());
        }
    }

    public C229602nj(AnonymousClass0iw r3, 02m r4) {
        this.A02 = "feed_timeline".equals(r3.getModuleName());
        this.A01 = r4;
    }
}
