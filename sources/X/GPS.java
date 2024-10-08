package X;

import kotlin.Deprecated;
import kotlin.ReplaceWith;

public abstract class GPS {
    public static final long A00(GPU gpu) {
        long A06 = C289295dM.A06(gpu.A06, gpu.A07);
        if (gpu.A02()) {
            return 0;
        }
        return A06;
    }

    public static final boolean A02(GPU gpu) {
        if (!gpu.A0C || gpu.A0B) {
            return false;
        }
        return true;
    }

    @Deprecated(message = "Use isOutOfBounds() that supports minimum touch target", replaceWith = @ReplaceWith(expression = "this.isOutOfBounds(size, extendedTouchPadding)", imports = {}))
    public static final boolean A03(GPU gpu, long j) {
        long j2 = gpu.A06;
        float A01 = C289295dM.A01(j2);
        float A02 = C289295dM.A02(j2);
        int A04 = C51965G9l.A04(j);
        int A00 = C289005cr.A00(j);
        if (A01 < 0.0f || A01 > ((float) A04) || A02 < 0.0f || A02 > ((float) A00)) {
            return true;
        }
        return false;
    }

    public static final boolean A04(GPU gpu, long j, long j2) {
        if (gpu.A04 != 1) {
            return A03(gpu, j);
        }
        long j3 = gpu.A06;
        float A01 = C289295dM.A01(j3);
        float A02 = C289295dM.A02(j3);
        float f = -C288025bF.A02(j2);
        float A04 = ((float) C51965G9l.A04(j)) + C288025bF.A02(j2);
        float f2 = -C288025bF.A00(j2);
        float A00 = ((float) C289005cr.A00(j)) + C288025bF.A00(j2);
        if (A01 < f || A01 > A04 || A02 < f2 || A02 > A00) {
            return true;
        }
        return false;
    }

    public static final boolean A01(GPU gpu) {
        if (gpu.A02() || !gpu.A0C || gpu.A0B) {
            return false;
        }
        return true;
    }
}
