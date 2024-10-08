package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.model.androidlink.AndroidLink;
import com.instagram.react.modules.base.IgReactQEModule;
import org.webrtc.EglBase14Impl;

/* renamed from: X.RgH  reason: case insensitive filesystem */
public abstract class C9759RgH {
    public static String A00(AndroidLink androidLink) {
        AnonymousClass47L A01 = C271714jT.A01(androidLink);
        if (A01 != null) {
            int ordinal = A01.ordinal();
            if (ordinal != 7) {
                switch (ordinal) {
                    case 0:
                        return androidLink.CGH();
                    case 1:
                        String CHl = androidLink.CHl();
                        CHl.getClass();
                        return DbV.A08(0oI.A01.buildUpon(), PublicKeyCredentialControllerUtility.JSON_KEY_ID, CHl).toString();
                    case 2:
                    case 3:
                    case 4:
                    case 10:
                    case 11:
                    case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case EglBase14Impl.EGLExt_SDK_VERSION /*18*/:
                    case 19:
                    case 20:
                        return androidLink.Avj();
                }
            } else if (androidLink.BFh() != null) {
                return androidLink.BFh();
            }
        }
        return null;
    }
}
