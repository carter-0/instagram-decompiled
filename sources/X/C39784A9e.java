package X;

import org.webrtc.ScreenCapturerAndroid;

/* renamed from: X.A9e  reason: case insensitive filesystem */
public final class C39784A9e {
    public final int A00;
    public final int A01;
    public final int A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C39784A9e) {
                C39784A9e a9e = (C39784A9e) obj;
                if (!(this.A02 == a9e.A02 && this.A01 == a9e.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A02 * 31) + this.A01;
    }

    public final String toString() {
        return 002.A0X("Bleep(startTimeMs=", AnonymousClass000.A00(ScreenCapturerAndroid.VIRTUAL_DISPLAY_DPI), ')', this.A02, this.A01);
    }

    public C39784A9e(int i, int i2) {
        this.A02 = i;
        this.A01 = i2;
        this.A00 = i2 - i;
    }
}
