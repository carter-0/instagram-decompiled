package X;

import org.webrtc.EglBase14Impl;

/* renamed from: X.4I5  reason: invalid class name */
public final class AnonymousClass4I5 {
    public static final Integer A00(Integer num) {
        if (num != null) {
            for (Integer num2 : AnonymousClass05K.A00(20)) {
                if (AnonymousClass59V.A00(num2) == num.intValue()) {
                    return num2;
                }
            }
        }
        return null;
    }

    public final boolean A01(Integer num) {
        Integer A00 = A00(num);
        if (A00 == null) {
            return false;
        }
        int intValue = A00.intValue();
        if (intValue == 3 || intValue == 12) {
            return true;
        }
        return false;
    }

    public final boolean A02(Integer num) {
        Integer A00 = A00(num);
        if (A00 != null) {
            int intValue = A00.intValue();
            if (intValue == 2) {
                return true;
            }
            switch (intValue) {
                case 13:
                case 16:
                case 17:
                case EglBase14Impl.EGLExt_SDK_VERSION:
                case 19:
                    return true;
            }
        }
        return false;
    }
}
