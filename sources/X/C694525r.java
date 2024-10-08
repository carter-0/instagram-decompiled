package X;

import com.facebook.cameracore.instagram.ardelivery.networkconsentmanager.IgNetworkConsentStorage;
import org.webrtc.CameraVideoCapturer;

/* renamed from: X.25r  reason: invalid class name and case insensitive filesystem */
public final class C694525r {
    public float A00;
    public float A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;

    public final 1xZ A00() {
        int i = this.A07;
        int i2 = this.A06;
        return new 1xZ(this.A01, this.A00, i, i2, this.A05, this.A04, this.A03, this.A02);
    }

    public final void A01() {
        this.A02 = CameraVideoCapturer.CameraStatistics.CAMERA_OBSERVER_PERIOD_MS;
    }

    public final void A02() {
        this.A00 = 1.0f;
    }

    public final void A03() {
        this.A03 = 7000;
    }

    public final void A04() {
        this.A04 = IgNetworkConsentStorage.MAX_ENTRIES;
    }

    public final void A05() {
        this.A05 = CameraVideoCapturer.CameraStatistics.CAMERA_OBSERVER_PERIOD_MS;
    }

    public final void A06() {
        this.A01 = 1.0f;
    }

    public final void A07() {
        this.A06 = 6000;
    }

    public final void A08() {
        this.A07 = IgNetworkConsentStorage.MAX_ENTRIES;
    }
}
