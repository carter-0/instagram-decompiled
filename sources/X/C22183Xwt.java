package X;

import com.facebook.dsp.core.ColorData;
import com.facebook.dsp.core.OpacityData;

/* renamed from: X.Xwt  reason: case insensitive filesystem */
public final class C22183Xwt implements JRA {
    public static final C22183Xwt A00 = new Object();

    public final GNY AE2(Integer num) {
        0qQ.A0B(num, 0);
        return C22182Xws.A00.AE2(num);
    }

    public final OpacityData E0e(C54642HLz hLz) {
        0qQ.A0B(hLz, 0);
        return C22182Xws.A00.E0e(hLz);
    }

    public final C55796Hnc FIL(Integer num) {
        0qQ.A0B(num, 0);
        return C22182Xws.A00.FIL(num);
    }

    public final ColorData AIK(C21255XRa xRa) {
        if (C21053XCe.A02(xRa) == 107) {
            return new ColorData(-1, -1);
        }
        return C22182Xws.A00.AIK(xRa);
    }

    public final int AKp(Integer num) {
        int A03 = C21053XCe.A03(num);
        if (A03 == 15) {
            return 8;
        }
        if (A03 == 17) {
            return 12;
        }
        if (A03 != 19) {
            return C22182Xws.A00.AKp(num);
        }
        return 8;
    }

    public final boolean AVl(Integer num) {
        return C21053XCe.A07(num).AVl(num);
    }

    public final float Evg(Integer num) {
        return C21053XCe.A07(num).Evg(num);
    }

    public final float EwD(Integer num) {
        int A03 = C21053XCe.A03(num);
        if (A03 == 24) {
            return 52.0f;
        }
        if (A03 == 35 || A03 == 36) {
            return 6.0f;
        }
        return C22182Xws.A00.EwD(num);
    }
}
