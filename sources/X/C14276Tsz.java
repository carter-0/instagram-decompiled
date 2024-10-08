package X;

import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.Tsz  reason: case insensitive filesystem */
public abstract class C14276Tsz {
    public static final int[] A02(C14272Tsv tsv) {
        0qQ.A0B(tsv, 0);
        int[] iArr = (int[]) C14272Tsv.A00.get(tsv);
        if (iArr == null) {
            return new int[2];
        }
        return iArr;
    }

    public static final int A00(C14272Tsv tsv) {
        int ordinal;
        if (tsv == null) {
            ordinal = -1;
        } else {
            ordinal = tsv.ordinal();
        }
        switch (ordinal) {
            case 0:
                return -8519535;
            case 1:
                return -6094770;
            case 3:
                return -2660595;
            case 4:
                return -13130240;
            case 11:
                return -6092870;
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                return -1226410;
            case 13:
                return -160462;
            case 14:
                return -2973647;
            case 15:
                return -10960094;
            case 16:
                return -16738826;
            default:
                return -14277082;
        }
    }

    public static final C14272Tsv A01(C14272Tsv tsv, Integer num, Integer num2) {
        if (!(num == null || num2 == null)) {
            for (C14272Tsv tsv2 : C14272Tsv.values()) {
                int[] iArr = (int[]) C14272Tsv.A00.get(tsv2);
                if (iArr != null && iArr[0] == num.intValue() && iArr[1] == num2.intValue()) {
                    return tsv2;
                }
            }
        }
        return tsv;
    }
}
