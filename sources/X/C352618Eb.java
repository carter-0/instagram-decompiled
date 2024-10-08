package X;

import com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsHelper;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;
import org.webrtc.EglBase14Impl;

/* renamed from: X.8Eb  reason: invalid class name and case insensitive filesystem */
public abstract class C352618Eb {
    public static final int A00(C358088aL r2) {
        0qQ.A0B(r2, 1);
        int ordinal = r2.ordinal();
        if (ordinal == 33) {
            return 0;
        }
        if (ordinal == 10) {
            return 2;
        }
        if (ordinal == 8) {
            return 0;
        }
        switch (ordinal) {
            case 5:
            case 31:
                return 0;
            case 32:
                return 1;
            case 34:
                return 3;
            default:
                StringBuilder sb = new StringBuilder();
                sb.append("camera tool is not secondary menu tool: ");
                sb.append(r2);
                throw new IllegalArgumentException(sb.toString());
        }
    }

    public static final Integer A04(C358088aL r1) {
        0qQ.A0B(r1, 0);
        int ordinal = r1.ordinal();
        if (ordinal == 0) {
            return AnonymousClass05K.A0N;
        }
        if (ordinal == 6) {
            return AnonymousClass05K.A0Y;
        }
        if (ordinal == 4) {
            return AnonymousClass05K.A0u;
        }
        if (ordinal == 1) {
            return AnonymousClass05K.A01;
        }
        if (ordinal == 28) {
            return AnonymousClass05K.A03;
        }
        if (ordinal != 16) {
            return null;
        }
        return AnonymousClass05K.A1F;
    }

    public static final int A01(C358088aL r1) {
        int ordinal = r1.ordinal();
        if (ordinal == 33 || ordinal == 10 || ordinal == 8) {
            return 1;
        }
        switch (ordinal) {
            case 5:
            case 31:
            case 32:
            case 34:
                return 1;
            case 11:
                return 2;
            default:
                return 3;
        }
    }

    public static final long A02(C358088aL r2) {
        int ordinal = r2.ordinal();
        if (ordinal == 14) {
            return -1;
        }
        if (ordinal == 8) {
            return 30000;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("camera tool is not status menu tool: ");
        sb.append(r2);
        throw new IllegalArgumentException(sb.toString());
    }

    public static final C358088aL A03(String str) {
        long parseLong = Long.parseLong(str);
        for (C358088aL r3 : C358088aL.values()) {
            Long valueOf = Long.valueOf(r3.A00.A00);
            if (valueOf != null && valueOf.longValue() == parseLong) {
                return r3;
            }
        }
        return null;
    }

    public static final boolean A05(C358088aL r0) {
        switch (r0.ordinal()) {
            case 0:
            case 1:
            case 3:
            case 4:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
            case 13:
            case 14:
            case 15:
            case 17:
            case EglBase14Impl.EGLExt_SDK_VERSION:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 30:
            case 33:
            case 37:
            case 40:
            case Seq.NULL_REFNUM:
            case Seq.RefTracker.REF_OFFSET:
            case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /*50*/:
                return true;
            default:
                return false;
        }
    }

    public static final boolean A06(C358088aL r3) {
        int ordinal = r3.ordinal();
        if (ordinal == 33 || ordinal == 10) {
            return true;
        }
        if (ordinal != 8) {
            switch (ordinal) {
                case 5:
                case 31:
                case 32:
                    break;
                case 11:
                case 34:
                    return true;
                default:
                    0kD.A07("CameraTool", "This tool cannot have a secondary picker", (Throwable) null);
                    break;
            }
        }
        return false;
    }
}
