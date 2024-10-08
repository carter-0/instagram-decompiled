package X;

import com.instagram.react.modules.base.IgReactQEModule;
import org.webrtc.EglBase14Impl;

/* renamed from: X.HeM  reason: case insensitive filesystem */
public abstract class C55231HeM {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 0:
                return "ButtonMediumHeight";
            case 1:
                return "ButtonLargeHeight";
            case 2:
                return "ButtonMediumCornerRadius";
            case 3:
                return "ButtonLargeCornerRadius";
            case 4:
                return "ButtonSmallPaddingHorizontal";
            case 5:
                return "ButtonMediumPaddingHorizontal";
            case 6:
                return "ButtonLargePaddingHorizontal";
            case 7:
                return "ButtonNoOutlineBorderWidth";
            case 8:
                return "ConsentSecondaryButtonOutlineBorderWidth";
            case 9:
                return "TextInputCornerRadius";
            case 10:
                return "TextInputMinHeight";
            case 11:
                return "TextInputMediumPadding";
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                return "TextInputEndPadding";
            case 13:
                return "TextInputVerticalPadding";
            case 14:
                return "TextInputAddOnToInputSpacing";
            case 15:
                return "TextInputIconButtonEndAddOnCornerRadius";
            case 16:
                return "TextInputIconButtonEndAddOnHeight";
            case 17:
                return "TextInputIconButtonEndAddOnWidth";
            case EglBase14Impl.EGLExt_SDK_VERSION:
                return "MoreInputIconButtonEndAddOnCornerRadius";
            case 19:
                return "MoreInputIconButtonEndAddOnHeight";
            case 20:
                return "MoreInputIconButtonEndAddOnWidth";
            case 21:
                return "MoreInputIconButtonEndAddOnPaddingHorizontal";
            default:
                return "TextInputIconButtonEndAddOnPaddingHorizontal";
        }
    }
}
