package X;

import com.facebook.mqtt.service.ConnectionConfig;

/* renamed from: X.45T  reason: invalid class name */
public abstract class AnonymousClass45T {
    public static final boolean A00(ConnectionConfig connectionConfig, ConnectionConfig connectionConfig2) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        Integer num;
        Integer num2;
        String str7;
        String str8 = null;
        if (connectionConfig2 != null) {
            str = connectionConfig2.userId;
        } else {
            str = null;
        }
        if (connectionConfig != null) {
            str2 = connectionConfig.userId;
        } else {
            str2 = null;
        }
        if (0qQ.A0K(str, str2)) {
            if (connectionConfig2 != null) {
                str3 = connectionConfig2.password;
            } else {
                str3 = null;
            }
            if (connectionConfig != null) {
                str4 = connectionConfig.password;
            } else {
                str4 = null;
            }
            if (0qQ.A0K(str3, str4)) {
                if (connectionConfig2 != null) {
                    str5 = connectionConfig2.host;
                } else {
                    str5 = null;
                }
                if (connectionConfig != null) {
                    str6 = connectionConfig.host;
                } else {
                    str6 = null;
                }
                if (0qQ.A0K(str5, str6)) {
                    if (connectionConfig2 != null) {
                        num = Integer.valueOf(connectionConfig2.port);
                    } else {
                        num = null;
                    }
                    if (connectionConfig != null) {
                        num2 = Integer.valueOf(connectionConfig.port);
                    } else {
                        num2 = null;
                    }
                    if (0qQ.A0K(num, num2)) {
                        if (connectionConfig2 != null) {
                            str7 = connectionConfig2.appId;
                        } else {
                            str7 = null;
                        }
                        if (connectionConfig != null) {
                            str8 = connectionConfig.appId;
                        }
                        if (!0qQ.A0K(str7, str8)) {
                            return false;
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
