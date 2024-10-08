package X;

import com.instagram.android.R;

public abstract class ABA {
    public static int A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return R.style.RainbowGradientPatternStyle;
            case 2:
                return R.style.BlackGradientPatternStyle;
            case 3:
                return R.style.YellowOrangeGradientPatternStyle;
            default:
                return R.style.OrangePatternStyle;
        }
    }

    public static final Integer A01(Integer num) {
        int i;
        switch (num.intValue()) {
            case 1:
                i = 1;
                break;
            case 2:
                i = 2;
                break;
            case 3:
                i = 3;
                break;
            default:
                i = 0;
                break;
        }
        int length = (i + 1) % AnonymousClass05K.A00(4).length;
        if (length == 1) {
            return AnonymousClass05K.A01;
        }
        if (length == 2) {
            return AnonymousClass05K.A0C;
        }
        if (length != 3) {
            return AnonymousClass05K.A00;
        }
        return AnonymousClass05K.A0N;
    }
}
