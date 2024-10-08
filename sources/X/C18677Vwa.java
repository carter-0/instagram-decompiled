package X;

import android.content.Context;
import com.instagram.api.schemas.XIGIGBoostCallToAction;
import com.instagram.api.schemas.XIGIGBoostDestination;
import com.instagram.business.promote.model.PromoteData;
import com.instagram.react.modules.base.IgReactQEModule;
import org.webrtc.EglBase14Impl;

/* renamed from: X.Vwa  reason: case insensitive filesystem */
public abstract class C18677Vwa {
    public static final int A00(XIGIGBoostCallToAction xIGIGBoostCallToAction) {
        switch (DbU.A02(xIGIGBoostCallToAction, 1)) {
            case 1:
                return 2131970175;
            case 2:
                return 2131970176;
            case 3:
                return 2131970177;
            case 4:
                return 2131970227;
            case 5:
            case 6:
                return 2131970228;
            case 7:
                return 2131970266;
            case 9:
                return 2131970283;
            case 10:
                return 2131970284;
            case 11:
                return 2131970286;
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                return 2131970553;
            case 14:
                return 2131970554;
            case 15:
                return 2131970457;
            case 16:
                return 2131970570;
            case 17:
                return 2131970572;
            case EglBase14Impl.EGLExt_SDK_VERSION /*18*/:
                return 2131970576;
            case 20:
                return 2131970636;
            case 21:
                return 2131970754;
            case 22:
                return 2131970757;
            case 23:
                return 2131970796;
            case 24:
                return 2131970688;
            case 25:
                return 2131970821;
            case 26:
                return 2131970822;
            case 27:
                return 2131970831;
            default:
                StringBuilder sb = new StringBuilder();
                sb.append("Unimplemented ");
                sb.append(xIGIGBoostCallToAction);
                throw new RuntimeException(AnonymousClass7TF.A0l(", would have crashed anyway.", sb));
        }
    }

    public static final XIGIGBoostCallToAction A01(XIGIGBoostDestination xIGIGBoostDestination, PromoteData promoteData) {
        XIGIGBoostCallToAction xIGIGBoostCallToAction;
        String name;
        String name2;
        XIGIGBoostCallToAction valueOf;
        String name3;
        XIGIGBoostCallToAction valueOf2;
        if (xIGIGBoostDestination == null) {
            return null;
        }
        switch (xIGIGBoostDestination.ordinal()) {
            case 1:
                XIGIGBoostCallToAction xIGIGBoostCallToAction2 = promoteData.A0e;
                if (xIGIGBoostCallToAction2 == null || (name2 = xIGIGBoostCallToAction2.name()) == null || (valueOf = XIGIGBoostCallToAction.valueOf(name2)) == null) {
                    return XIGIGBoostCallToAction.INSTAGRAM_MESSAGE;
                }
                return valueOf;
            case 2:
            case 10:
                xIGIGBoostCallToAction = promoteData.A0b;
                break;
            case 4:
                xIGIGBoostCallToAction = promoteData.A0d;
                break;
            case 5:
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                XIGIGBoostCallToAction xIGIGBoostCallToAction3 = promoteData.A0e;
                if (xIGIGBoostCallToAction3 == null || (name3 = xIGIGBoostCallToAction3.name()) == null || (valueOf2 = XIGIGBoostCallToAction.valueOf(name3)) == null) {
                    return XIGIGBoostCallToAction.WHATSAPP_MESSAGE;
                }
                return valueOf2;
            case 8:
                return XIGIGBoostCallToAction.VIEW_INSTAGRAM_PROFILE;
            default:
                throw new Throwable("Unhandled XIGIGBoostDestination type");
        }
        if (xIGIGBoostCallToAction == null || (name = xIGIGBoostCallToAction.name()) == null) {
            return null;
        }
        return XIGIGBoostCallToAction.valueOf(name);
    }

    public static void A02(Context context, XIGIGBoostCallToAction xIGIGBoostCallToAction, StringBuilder sb, int i) {
        sb.append(context.getString(i, new Object[]{context.getString(A00(xIGIGBoostCallToAction))}));
    }
}
