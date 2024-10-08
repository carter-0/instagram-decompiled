package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;

/* renamed from: X.HeG  reason: case insensitive filesystem */
public abstract class C55225HeG {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 0:
                return NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED;
            case 1:
                return "CAPTURE_CONSENT";
            case 2:
                return "LIVE_CAPTURE";
            default:
                return "EXTENDED_CAPTURE";
        }
    }
}
