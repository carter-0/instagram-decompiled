package X;

import org.webrtc.HardwareVideoEncoderFactory;

public final class AUR implements B16 {
    public final /* synthetic */ B16 A00;
    public final /* synthetic */ C341627nG A01;
    public final /* synthetic */ Integer A02;

    public AUR(B16 b16, C341627nG r2, Integer num) {
        this.A01 = r2;
        this.A02 = num;
        this.A00 = b16;
    }

    public final void onFinished() {
        this.A01.A04(new C391719tX((int) HardwareVideoEncoderFactory.QCOM_VP8_KEY_FRAME_INTERVAL_ANDROID_M_MS, 002.A0R("prepare must be called before start. Current state: ", C378729Qz.A00(this.A02))));
        this.A00.onFinished();
    }
}
