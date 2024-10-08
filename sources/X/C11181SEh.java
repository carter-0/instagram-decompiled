package X;

import org.webrtc.CameraCapturer;

/* renamed from: X.SEh  reason: case insensitive filesystem */
public final class C11181SEh {
    public final int A00;
    public final int A01;
    public final int A02;

    public C11181SEh(int i) {
        this.A01 = i;
        this.A02 = 100;
        this.A00 = 5000;
    }

    public C11181SEh() {
        this.A01 = 50;
        this.A02 = 1;
        this.A00 = CameraCapturer.OPEN_CAMERA_DELAY_MS;
    }
}
