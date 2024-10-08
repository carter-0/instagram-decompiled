package X;

import android.content.Context;
import com.instagram.android.R;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public abstract class LSj {
    public static final float[] A00 = {0.0f, 0.0f, 1.0f};
    public static final float[] A01 = {0.0f, 1.0f, 0.0f};
    public static final float[] A02 = {0.0f, 1.0f, 1.0f};
    public static final float[] A03 = {1.0f, 1.0f, 1.0f};
    public static final float[] A04 = {0.0f, 0.0f, 0.0f};
    public static final float[] A05 = {1.0f, 0.5f, 0.0f};
    public static final float[] A06 = {1.0f, 0.0f, 1.0f};
    public static final float[] A07 = {0.5f, 0.0f, 1.0f};
    public static final float[] A08 = {1.0f, 0.0f, 0.0f};
    public static final float[] A09 = {1.0f, 1.0f, 0.0f};
    public static final Map A0A;

    static {
        HashMap A1E = AnonymousClass7TE.A1E();
        A1E.put(Arrays.toString(A09), C62580KiD.YELLOW);
        A1E.put(Arrays.toString(A05), C62580KiD.ORANGE);
        A1E.put(Arrays.toString(A08), C62580KiD.RED);
        A1E.put(Arrays.toString(A06), C62580KiD.PINK);
        A1E.put(Arrays.toString(A07), C62580KiD.PURPLE);
        A1E.put(Arrays.toString(A00), C62580KiD.BLUE);
        A1E.put(Arrays.toString(A02), C62580KiD.LIGHTBLUE);
        A1E.put(Arrays.toString(A01), C62580KiD.GREEN);
        A0A = A1E;
    }

    public static int A00(Context context, C62580KiD kiD, boolean z) {
        C63219KtQ ktQ = C63219KtQ.$redex_init_class;
        switch (kiD.ordinal()) {
            case 0:
                return 2Yu.A0F(context, R.attr.tintPickerNoneColor);
            case 1:
                if (z) {
                    return -3685842;
                }
                return -1645705;
            case 2:
                if (z) {
                    return -3699922;
                }
                return -1655945;
            case 3:
                if (z) {
                    return -3723730;
                }
                return -1673353;
            case 4:
                if (z) {
                    return -3915394;
                }
                return -1405768;
            case 5:
                if (z) {
                    return -8048953;
                }
                return -4818970;
            case 6:
                if (z) {
                    return -13747001;
                }
                return -8944922;
            case 7:
                if (z) {
                    return -13718585;
                }
                return -8924442;
            case 8:
                if (z) {
                    return -13711556;
                }
                return -8919423;
            default:
                return -1;
        }
    }

    public static C62580KiD A01(float[] fArr) {
        if (fArr != null) {
            C62580KiD kiD = C62580KiD.A06;
            if (!Arrays.equals(fArr, kiD.A01)) {
                C62580KiD kiD2 = (C62580KiD) A0A.get(Arrays.toString(fArr));
                if (kiD2 != null) {
                    return kiD2;
                }
                A03("TintColorUtil_getShadowTintColorFromArray()", fArr);
                return kiD;
            }
        }
        return C62580KiD.A06;
    }

    public static C62580KiD A02(float[] fArr) {
        if (fArr != null) {
            C62580KiD kiD = C62580KiD.A06;
            if (!Arrays.equals(fArr, kiD.A00)) {
                C62580KiD kiD2 = (C62580KiD) A0A.get(Arrays.toString(fArr));
                if (kiD2 != null) {
                    return kiD2;
                }
                A03("TintColorUtil_getTintColorFromArray()", fArr);
                return kiD;
            }
        }
        return C62580KiD.A06;
    }

    public static void A03(String str, float[] fArr) {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("No TintColor found for array {");
        A1A.append(fArr[0]);
        A1A.append(", ");
        A1A.append(fArr[1]);
        A1A.append(", ");
        A1A.append(fArr[2]);
        0kD.A01(str, AnonymousClass7TF.A0l("}", A1A));
    }
}
