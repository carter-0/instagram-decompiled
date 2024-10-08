package X;

import org.webrtc.EglBase14Impl;

/* renamed from: X.RfE  reason: case insensitive filesystem */
public abstract class C9696RfE {
    public static String A00(int i) {
        switch (i) {
            case -1:
                return "SUCCESS_CACHE";
            case 0:
                return "SUCCESS";
            case 2:
                return C273654mx.A00(1364);
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return C273654mx.A00(1365);
            case 5:
                return C273654mx.A00(1281);
            case 6:
                return C273654mx.A00(1346);
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 10:
                return "DEVELOPER_ERROR";
            case 13:
                return "ERROR";
            case 14:
                return "INTERRUPTED";
            case 15:
                return "TIMEOUT";
            case 16:
                return "CANCELED";
            case 17:
                return "API_NOT_CONNECTED";
            case EglBase14Impl.EGLExt_SDK_VERSION /*18*/:
                return "DEAD_CLIENT";
            case 19:
                return "REMOTE_EXCEPTION";
            case 20:
                return "CONNECTION_SUSPENDED_DURING_CALL";
            case 21:
                return "RECONNECTION_TIMED_OUT_DURING_UPDATE";
            case 22:
                return "RECONNECTION_TIMED_OUT";
            default:
                return 002.A0O("unknown status code: ", i);
        }
    }
}
