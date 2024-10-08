package X;

import org.webrtc.ScreenCapturerAndroid;

/* renamed from: X.HsQ  reason: case insensitive filesystem */
public final class C56077HsQ {
    public int A00;
    public int A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C56077HsQ) {
                C56077HsQ hsQ = (C56077HsQ) obj;
                if (!(this.A01 == hsQ.A01 && this.A00 == hsQ.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A01 * 31) + this.A00;
    }

    public final String toString() {
        return 002.A0X("SoundSyncTrimTimeRange(startTimeMs=", AnonymousClass000.A00(ScreenCapturerAndroid.VIRTUAL_DISPLAY_DPI), ')', this.A01, this.A00);
    }

    public C56077HsQ(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
        if (i < 0 || i >= i2) {
            throw AnonymousClass7TE.A0z(002.A0X("Illegal SoundSyncTrimTimeRange [", ", ", ']', i, i2));
        }
    }
}
