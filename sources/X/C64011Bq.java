package X;

import com.instagram.common.api.base.BandwidthEstimatorUtil;

/* renamed from: X.1Bq  reason: invalid class name and case insensitive filesystem */
public final class C64011Bq {
    public static C64011Bq A03;
    public double A00;
    public BandwidthEstimatorUtil A01;
    public 1Bk A02;

    public final synchronized double A01() {
        double uploadBandwidthEstimate;
        uploadBandwidthEstimate = (double) this.A01.getUploadBandwidthEstimate();
        if (uploadBandwidthEstimate == 0.0d) {
            uploadBandwidthEstimate = this.A00;
        }
        return uploadBandwidthEstimate;
    }

    public static synchronized C64011Bq A00() {
        C64011Bq r0;
        synchronized (C64011Bq.class) {
            A03.getClass();
            r0 = A03;
        }
        return r0;
    }
}
