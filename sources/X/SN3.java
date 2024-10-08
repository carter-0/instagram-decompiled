package X;

import com.facebook.cameracore.instagram.ardelivery.networkconsentmanager.IgNetworkConsentStorage;
import com.facebook.common.dextricks.Constants;
import com.instagram.debug.devoptions.debughead.util.MemoryUtil;
import java.math.RoundingMode;
import org.webrtc.CameraCapturer;

public abstract class SN3 {
    public static final int FLOOR_SQRT_MAX_INT = 46340;
    public static final int MAX_POWER_OF_SQRT2_UNSIGNED = -1257966797;
    public static final int MAX_SIGNED_POWER_OF_TWO = 1073741824;
    public static int[] biggestBinomials = {Integer.MAX_VALUE, Integer.MAX_VALUE, Constants.LOAD_RESULT_PGO_ATTEMPTED, 2345, 477, 193, 110, 75, 58, 49, 43, 39, 37, 35, 34, 34, 33};
    public static final int[] halfPowersOf10 = {3, 31, 316, 3162, 31622, 316227, 3162277, 31622776, 316227766, Integer.MAX_VALUE};
    public static final byte[] maxLog10ForLeadingZeros = {9, 9, 9, 8, 8, 8, 7, 7, 7, 6, 6, 6, 6, 5, 5, 5, 4, 4, 4, 3, 3, 3, 3, 2, 2, 2, 1, 1, 1, 0, 0, 0, 0};
    public static final int[] powersOf10 = {1, 10, 100, IgNetworkConsentStorage.MAX_ENTRIES, CameraCapturer.OPEN_CAMERA_TIMEOUT, 100000, 1000000, MemoryUtil.MAX_ALLOC_SIZE, 100000000, 1000000000};

    public static int A00(int i, int i2) {
        long j = ((long) i) + ((long) i2);
        int i3 = (int) j;
        C9742Rg0.A00(i, i2, "checkedAdd", AnonymousClass7TF.A1Q((j > ((long) i3) ? 1 : (j == ((long) i3) ? 0 : -1))));
        return i3;
    }

    public static int A01(RoundingMode roundingMode, int i, int i2) {
        roundingMode.getClass();
        if (i2 != 0) {
            int i3 = i / i2;
            int i4 = i - (i2 * i3);
            if (i4 == 0) {
                return i3;
            }
            int i5 = ((i ^ i2) >> 31) | 1;
            switch (Pxe.A08(roundingMode, C10010Rl5.A00)) {
                case 1:
                    throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
                case 2:
                    return i3;
                case 3:
                    if (i5 >= 0) {
                        return i3;
                    }
                    break;
                case 4:
                    break;
                case 5:
                    if (i5 <= 0) {
                        return i3;
                    }
                    break;
                case 6:
                case 7:
                case 8:
                    int abs = Math.abs(i4);
                    int abs2 = abs - (Math.abs(i2) - abs);
                    if (abs2 == 0 || abs2 <= 0) {
                        return i3;
                    }
                default:
                    throw Pxe.A0d();
            }
            return i3 + i5;
        }
        throw new ArithmeticException("/ by zero");
    }
}
