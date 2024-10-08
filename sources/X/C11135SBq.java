package X;

import com.facebook.cameracore.instagram.ardelivery.networkconsentmanager.IgNetworkConsentStorage;
import java.nio.ByteBuffer;
import org.webrtc.CameraVideoCapturer;
import org.webrtc.ScreenCapturerAndroid;

/* renamed from: X.SBq  reason: case insensitive filesystem */
public abstract class C11135SBq {
    public static final int[] A00 = {2002, CameraVideoCapturer.CameraStatistics.CAMERA_OBSERVER_PERIOD_MS, 1920, 1601, 1600, 1001, IgNetworkConsentStorage.MAX_ENTRIES, 960, 800, 800, 480, ScreenCapturerAndroid.VIRTUAL_DISPLAY_DPI, ScreenCapturerAndroid.VIRTUAL_DISPLAY_DPI, C249703kE.FLAG_MOVED};

    /* JADX WARNING: type inference failed for: r4v0, types: [java.lang.Object, X.5Ob] */
    public static int A00(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[16];
        int position = byteBuffer.position();
        byteBuffer.get(bArr);
        byteBuffer.position(position);
        ? obj = new Object();
        obj.A03 = bArr;
        obj.A01 = 16;
        obj.A01(16);
        if (obj.A01(16) == 65535) {
            obj.A01(24);
        }
        if (obj.A01(2) == 3) {
            do {
                obj.A01(2);
            } while (obj.A05());
        }
        int A01 = obj.A01(10);
        if (obj.A05() && obj.A01(3) > 0) {
            obj.A03(2);
        }
        char c = 44100;
        if (obj.A05()) {
            c = 48000;
        }
        int A012 = obj.A01(4);
        if (c == 44100) {
            if (A012 == 13) {
                return A00[A012];
            }
            return 0;
        } else if (c != 48000) {
            return 0;
        } else {
            int[] iArr = A00;
            if (A012 >= 14) {
                return 0;
            }
            int i = iArr[A012];
            int i2 = A01 % 5;
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            return i;
                        }
                        if (!(A012 == 3 || A012 == 8 || A012 == 11)) {
                            return i;
                        }
                    }
                } else if (!(A012 == 8 || A012 == 11)) {
                    return i;
                }
                return i + 1;
            }
            if (!(A012 == 3 || A012 == 8)) {
                return i;
            }
            return i + 1;
        }
    }
}
