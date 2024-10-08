package X;

import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.instagram.model.direct.DirectShareTargetLoggingInfo;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;
import java.util.List;
import org.webrtc.EglBase14Impl;

/* renamed from: X.Od3  reason: case insensitive filesystem */
public abstract class C71112Od3 {
    public static final String A04(String str) {
        return AnonymousClass7TE.A19(DbX.A0x(str), 0);
    }

    public static final C69471NmF A02(C254923tH r1) {
        if (r1 == null) {
            return null;
        }
        int ordinal = r1.ordinal();
        if (ordinal == 2) {
            return C69471NmF.IG_ADVANCED_CRYPTO_TRANSPORT;
        }
        if (ordinal == 1) {
            return C69471NmF.IG_MESSENGER_INFRA;
        }
        if (ordinal == 0) {
            return C69471NmF.IG_DJANGO;
        }
        return null;
    }

    public static final List A05(DirectShareTargetLoggingInfo directShareTargetLoggingInfo) {
        C69469NmD nmD;
        if (directShareTargetLoggingInfo == null) {
            return 0sn.A00;
        }
        if (DbX.A1a(directShareTargetLoggingInfo.A00)) {
            nmD = C69469NmD.SERVER_ENTITIES_NAMED_DSQ1;
        } else {
            nmD = C69469NmD.LOCAL_BLENDED;
        }
        return AnonymousClass7TE.A1I(nmD);
    }

    public static final C69488NmW A00(int i) {
        switch (i) {
            case 1:
                return C69488NmW.PAPER_AIRPLANE_SEND;
            case 2:
                return C69488NmW.KEYBOARD_SEND;
            case 3:
                return C69488NmW.META_AI_RING;
            case 4:
                return C69488NmW.CLEAR_SEARCH;
            case 5:
                return C69488NmW.SEARCH;
            case 6:
                return C69488NmW.THUMB_UP;
            case 7:
                return C69488NmW.THUMB_DOWN;
            default:
                return C69488NmW.SEE_MORE_WITH_SNIPPET;
        }
    }

    public static final C69505Nmn A01(Integer num) {
        switch (num.intValue()) {
            case 0:
                return C69505Nmn.A03;
            case 1:
            case 2:
                return C69505Nmn.A0G;
            case 3:
                return C69505Nmn.A07;
            case 4:
                return C69505Nmn.A0O;
            case 5:
                return C69505Nmn.A0Q;
            case 6:
                return C69505Nmn.A06;
            case 7:
                return C69505Nmn.A0P;
            case 8:
                return C69505Nmn.A0I;
            case 9:
                return C69505Nmn.A0L;
            case 10:
                return C69505Nmn.A09;
            case 11:
                return C69505Nmn.A0K;
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                return C69505Nmn.A08;
            case 13:
                return C69505Nmn.A0N;
            case 14:
                return C69505Nmn.A0B;
            case 15:
                return C69505Nmn.A0M;
            case 16:
                return C69505Nmn.A0A;
            case 19:
                return C69505Nmn.A02;
            case 20:
                return C69505Nmn.A0J;
            case 21:
                return C69505Nmn.A04;
            default:
                return C69505Nmn.A0H;
        }
    }

    public static final C69504Nmm A03(int i, boolean z) {
        switch (i) {
            case 6:
                if (z) {
                    return C69504Nmm.A0J;
                }
                return C69504Nmm.A0B;
            case 7:
                return C69504Nmm.A09;
            case 11:
            case 15:
                if (z) {
                    return C69504Nmm.A0L;
                }
                return C69504Nmm.A0D;
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
            case 16:
                if (z) {
                    return C69504Nmm.A0I;
                }
                break;
            case 13:
            case 17:
                if (z) {
                    return C69504Nmm.A0M;
                }
                break;
            case EglBase14Impl.EGLExt_SDK_VERSION:
                return C69504Nmm.A0A;
            case 21:
            case 22:
                if (z) {
                    return C69504Nmm.A0F;
                }
                break;
            case 23:
            case 24:
                if (z) {
                    return C69504Nmm.A0H;
                }
                break;
            case 25:
                return C69504Nmm.A0G;
            case 28:
                return C69504Nmm.A0N;
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
                return C69504Nmm.A07;
            case 30:
                return C69504Nmm.A04;
            case 35:
                return C69504Nmm.A02;
            case 36:
                return C69504Nmm.A03;
            case 37:
                return C69504Nmm.A05;
            case 40:
                return C69504Nmm.A0C;
            case Seq.NULL_REFNUM:
                return C69504Nmm.A0K;
            case 43:
                return C69504Nmm.A06;
            case 44:
                return C69504Nmm.A08;
        }
        return C69504Nmm.A0E;
    }
}
