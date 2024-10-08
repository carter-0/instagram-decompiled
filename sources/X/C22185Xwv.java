package X;

import com.facebook.dsp.core.ColorData;
import com.facebook.dsp.core.OpacityData;

/* renamed from: X.Xwv  reason: case insensitive filesystem */
public final class C22185Xwv implements JRA {
    public static final C22185Xwv A00 = new Object();

    public final GNY AE2(Integer num) {
        int A03 = C51967G9n.A03(num, 0);
        if (A03 == 4 || A03 == 5) {
            return new GNY((Object) C21255XRa.A0Z, 1.0f, 0);
        }
        return C22184Xwu.A00.AE2(num);
    }

    public final boolean AVl(Integer num) {
        int A03 = C51967G9n.A03(num, 0);
        if (A03 == 0 || A03 == 2) {
            return false;
        }
        return C21116XFg.A00.AVl(num);
    }

    public final ColorData AIK(C21255XRa xRa) {
        int A02 = C21053XCe.A02(xRa);
        if (A02 == 62) {
            return C21053XCe.A06(-14931149, -920329);
        }
        if (A02 != 144) {
            return C21116XFg.A00.AIK(xRa);
        }
        return C21053XCe.A06(-1, -14931149);
    }

    public final int AKp(Integer num) {
        return C21053XCe.A07(num).AKp(num);
    }

    public final OpacityData E0e(C54642HLz hLz) {
        float f;
        int A02 = C21053XCe.A02(hLz);
        if (A02 == 1) {
            f = 0.1f;
        } else if (A02 == 2) {
            return new OpacityData(0.03f, 0.05f);
        } else {
            if (A02 != 5) {
                return C22184Xwu.A00.E0e(hLz);
            }
            f = 0.0f;
        }
        return new OpacityData(f, f);
    }

    public final float Evg(Integer num) {
        return C21053XCe.A07(num).Evg(num);
    }

    public final float EwD(Integer num) {
        return C21053XCe.A07(num).EwD(num);
    }

    public final C55796Hnc FIL(Integer num) {
        return C21053XCe.A07(num).FIL(num);
    }
}
