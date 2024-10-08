package X;

import com.facebook.dsp.core.ColorData;
import com.facebook.dsp.core.OpacityData;
import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.XFl  reason: case insensitive filesystem */
public final class C21121XFl implements JRA {
    public static final C21121XFl A00 = new Object();

    public final GNY AE2(Integer num) {
        0qQ.A0B(num, 0);
        return C21118XFi.A00.AE2(num);
    }

    public final ColorData AIK(C21255XRa xRa) {
        0qQ.A0B(xRa, 0);
        return C21118XFi.A00.AIK(xRa);
    }

    public final OpacityData E0e(C54642HLz hLz) {
        0qQ.A0B(hLz, 0);
        return C21118XFi.A00.E0e(hLz);
    }

    public final C55796Hnc FIL(Integer num) {
        0qQ.A0B(num, 0);
        return C21119XFj.A00.FIL(num);
    }

    public final int AKp(Integer num) {
        switch (C21053XCe.A03(num)) {
            case 0:
            case 6:
            case 10:
            case 11:
            case 13:
            case 15:
            case 16:
            case 17:
            case 19:
            case 20:
            case 25:
            case 26:
                return 16;
            case 2:
            case 3:
            case 23:
                return 24;
            case 7:
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
            case 22:
                return 8;
            case 8:
                return 4;
            case 9:
                return 32;
            case 14:
            case 21:
                return 12;
            case 24:
                return 20;
            default:
                return C21116XFg.A00.AKp(num);
        }
    }

    public final boolean AVl(Integer num) {
        if (C21053XCe.A03(num) != 8) {
            return C21119XFj.A00.AVl(num);
        }
        return true;
    }

    public final float Evg(Integer num) {
        return C21053XCe.A07(num).Evg(num);
    }

    public final float EwD(Integer num) {
        if (C21053XCe.A03(num) == 4) {
            return 8.0f;
        }
        return C21116XFg.A00.EwD(num);
    }
}
