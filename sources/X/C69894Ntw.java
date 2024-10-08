package X;

import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.Ntw  reason: case insensitive filesystem */
public abstract class C69894Ntw {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "RESTORE_TOAST";
            case 2:
                return "SETTINGS";
            case 3:
                return "SETTINGS_GDRIVE_TOGGLE";
            case 4:
                return "FISHFOODING";
            case 5:
                return "OTC_NOTIFICATION";
            case 6:
                return "SETTINGS_RESET_PIN";
            case 7:
                return "UNKNOWN";
            case 8:
                return "ENCRYPTED_MESSAGE";
            case 9:
                return "DEFAULT_BACKUPS";
            case 10:
                return "THREAD_EXIT";
            case 11:
                return "INBOX_BANNER";
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                return "RETRY_PIN";
            case 13:
                return "AUTO_POPUP";
            case 14:
                return "STATE_CHECKER";
            case 15:
                return "BLOCK_STORE_HEALTH_VALIDATOR";
            default:
                return "DIRECT_INBOX_NUX";
        }
    }
}
