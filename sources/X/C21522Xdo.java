package X;

import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsHelper;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;
import org.webrtc.EglBase14Impl;

/* renamed from: X.Xdo  reason: case insensitive filesystem */
public abstract class C21522Xdo {
    public static final C21235XQg A00(C16666Uz2 uz2) {
        int ordinal = uz2.ordinal();
        if (ordinal == 0) {
            return C21235XQg.CHEVRON_BUTTON;
        }
        if (ordinal == 1) {
            return C21235XQg.REPORT_AD_BUTTON;
        }
        if (ordinal == 2) {
            return C21235XQg.HIDE_AD_BUTTON;
        }
        if (ordinal == 3) {
            return C21235XQg.REPORT_BUTTON;
        }
        throw AnonymousClass7TE.A0w("Unsupported FRXEntryPoint type");
    }

    public static final C21270XRp A01(C14068TpH tpH) {
        switch (tpH.ordinal()) {
            case 0:
                return C21270XRp.A0l;
            case 1:
                return C21270XRp.A0x;
            case 2:
                return C21270XRp.A0O;
            case 3:
                return C21270XRp.A16;
            case 4:
                return C21270XRp.A0i;
            case 5:
                return C21270XRp.A0v;
            case 6:
                return C21270XRp.A0e;
            case 7:
                return C21270XRp.A0t;
            case 8:
                return C21270XRp.A0w;
            case 9:
                return C21270XRp.A0s;
            case 10:
                return C21270XRp.A0r;
            case 11:
                return C21270XRp.A1A;
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                return C21270XRp.A0E;
            case 13:
                return C21270XRp.A0C;
            case 14:
                return C21270XRp.A0D;
            case 15:
                return C21270XRp.A0B;
            case 16:
                return C21270XRp.A0A;
            case 17:
                return C21270XRp.A1B;
            case EglBase14Impl.EGLExt_SDK_VERSION:
                return C21270XRp.A17;
            case 19:
                return C21270XRp.A19;
            case 20:
                return C21270XRp.A0h;
            case 21:
                return C21270XRp.A0K;
            case 22:
                return C21270XRp.A0I;
            case 23:
                return C21270XRp.A0H;
            case 24:
                return C21270XRp.A0o;
            case 25:
                return C21270XRp.A0q;
            case 26:
                return C21270XRp.A10;
            case 27:
                return C21270XRp.A0Y;
            case 28:
                return C21270XRp.A12;
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
                return C21270XRp.A0S;
            case 30:
                return C21270XRp.A0U;
            case 31:
                return C21270XRp.A0W;
            case 32:
                return C21270XRp.A13;
            case 33:
                return C21270XRp.A0F;
            case 34:
                return C21270XRp.A0R;
            case 35:
                return C21270XRp.A0T;
            case 36:
                return C21270XRp.A0V;
            case 37:
                return C21270XRp.A0b;
            case 38:
                return C21270XRp.A0Q;
            case 39:
                return C21270XRp.A0P;
            case Seq.NULL_REFNUM /*41*/:
                return C21270XRp.A0j;
            case Seq.RefTracker.REF_OFFSET /*42*/:
                return C21270XRp.A09;
            case 43:
                return C21270XRp.A0G;
            case 44:
                return C21270XRp.A0J;
            case 45:
                return C21270XRp.A0X;
            case 46:
                return C21270XRp.A0f;
            case 47:
                return C21270XRp.A0u;
            case 48:
                return C21270XRp.A03;
            case 49:
                return C21270XRp.A0M;
            case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /*50*/:
                return C21270XRp.A05;
            case 51:
                return C21270XRp.A06;
            case 52:
                return C21270XRp.A0a;
            case 53:
                return C21270XRp.A0d;
            case 54:
                return C21270XRp.A1C;
            case 55:
                return C21270XRp.A1E;
            case 56:
                return C21270XRp.A0m;
            case 57:
                return C21270XRp.A0g;
            case 58:
                return C21270XRp.A0z;
            case 59:
                return C21270XRp.A0k;
            case 60:
                return C21270XRp.A15;
            case 61:
                return C21270XRp.A14;
            case 62:
                return C21270XRp.A18;
            case 63:
                return C21270XRp.A0p;
            case 64:
                return C21270XRp.A0N;
            case 65:
                return C21270XRp.A1D;
            case 66:
                return C21270XRp.A11;
            case 67:
                return C21270XRp.A0Z;
            case 68:
                return C21270XRp.A0c;
            case 69:
                return C21270XRp.A0n;
            case 70:
                return C21270XRp.A0L;
            case 71:
                return C21270XRp.A04;
            case 72:
                return C21270XRp.A07;
            case 73:
                return C21270XRp.A08;
            case 76:
                return C21270XRp.A1G;
            default:
                throw AnonymousClass7TE.A0w("Unsupported FRXLocation type");
        }
    }
}
