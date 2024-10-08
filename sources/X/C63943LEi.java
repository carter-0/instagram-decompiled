package X;

import com.facebook.videolite.instagram.VideoIngestionStep;

/* renamed from: X.LEi  reason: case insensitive filesystem */
public final class C63943LEi {
    public final 0xa A00 = 0xn.A01("video_upload_network_preference");
    public final /* synthetic */ VideoIngestionStep A01;

    public C63943LEi(VideoIngestionStep videoIngestionStep) {
        this.A01 = videoIngestionStep;
    }

    public final double A01() {
        if (!182.A06(0Tu.A05, this.A01.A02, 36329857046626662L)) {
            return -1.0d;
        }
        double A012 = C64011Bq.A00().A01();
        if (A012 >= 0.0d) {
            return 8.0d * A012;
        }
        return -1.0d;
    }

    public final double A00() {
        double A012 = 1Bh.A00().A01();
        if (A012 > 0.0d) {
            0xY AR4 = this.A00.AR4();
            AR4.E5W("last_measured_positive_bandwidth_for_upload", (float) A012);
            AR4.apply();
        } else if (A012 <= 0.0d) {
            A012 = (double) this.A00.getFloat("last_measured_positive_bandwidth_for_upload", 0.0f);
        }
        if (A012 < 0.0d) {
            return -1.0d;
        }
        return A012 * 8.0d;
    }
}
