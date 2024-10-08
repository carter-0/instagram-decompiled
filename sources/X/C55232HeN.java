package X;

import com.instagram.react.modules.base.IgReactQEModule;
import org.webrtc.EglBase14Impl;

/* renamed from: X.HeN  reason: case insensitive filesystem */
public abstract class C55232HeN {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "Meta2";
            case 2:
                return "Meta4";
            case 3:
                return "Body1";
            case 4:
                return "Body2";
            case 5:
                return "Body2_Emphasized";
            case 6:
                return "Body2Bold";
            case 7:
                return "Body2Small";
            case 8:
                return "Body2SmallEmphasized";
            case 9:
                return "Body3";
            case 10:
                return "Body4";
            case 11:
                return "Headline2";
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                return "Headline3";
            case 13:
                return "Headline3Emphasized";
            case 14:
                return "Headline4";
            case 15:
                return "Headline4Emphasized";
            case 16:
                return "TextOnMedia";
            case 17:
                return "TextOnMediaEmphasized";
            case EglBase14Impl.EGLExt_SDK_VERSION:
                return "SecondaryHeader";
            case 19:
                return "TextInputText";
            case 20:
                return "Body1_Emphasized";
            case 21:
                return "Button1";
            case 22:
                return "Label";
            case 23:
                return "Body1_Emphasized2";
            case 24:
                return "Headline1Emphasized";
            case 25:
                return "OverlayButton";
            case 26:
                return "HeaderActionButton";
            case 27:
                return "Title2";
            default:
                return "Meta";
        }
    }
}
