package X;

import com.instagram.react.modules.base.IgReactQEModule;
import org.webrtc.EglBase14Impl;

/* renamed from: X.45C  reason: invalid class name */
public abstract class AnonymousClass45C {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "analytics";
            case 2:
                return Pxd.A00(732);
            case 3:
                return "fbns_state";
            case 4:
                return "flags";
            case 5:
                return "ids";
            case 6:
                return "keypair";
            case 7:
                return Pxd.A00(829);
            case 8:
                return AnonymousClass000.A00(1752);
            case 9:
                return "retry";
            case 10:
                return "gk";
            case 11:
                return Pxd.A00(804);
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                return "token_store";
            case 13:
                return C66579MXk.A00(160);
            case 14:
                return "mqtt_debug";
            case 15:
                return "mqtt_config";
            case 16:
                return "mqtt_last_host";
            case 17:
                return "third_party_auth_pn_config";
            case EglBase14Impl.EGLExt_SDK_VERSION:
                return "third_party_auth_sig_config";
            default:
                return "address";
        }
    }
}
