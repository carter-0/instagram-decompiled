package X;

import org.webrtc.CameraCapturer;

/* renamed from: X.9GQ  reason: invalid class name */
public final class AnonymousClass9GQ extends C272194kI {
    public static boolean A01 = true;
    public static boolean A02;
    public final AnonymousClass4EF A00;

    public final void A04() {
        this.A00.A03();
    }

    public final boolean A05() {
        int i;
        if (!A01) {
            return false;
        }
        try {
            if (A02) {
                i = CameraCapturer.OPEN_CAMERA_DELAY_MS;
            } else {
                i = this.A05;
            }
            if (this.A00.A02(i, this.A00) < 0) {
                A02 = true;
                return false;
            }
            A02 = false;
            return true;
        } catch (Error unused) {
            A01 = false;
            return false;
        }
    }

    public AnonymousClass9GQ(AnonymousClass4EF r1, int[] iArr, int i) {
        super(i, iArr);
        this.A00 = r1;
    }
}
