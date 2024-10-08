package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.instagram.realtimeclient.GraphQLSubscriptionID;

/* renamed from: X.Di1  reason: case insensitive filesystem */
public abstract class C46621Di1 {
    public static Integer A00(String str) {
        for (Integer num : AnonymousClass05K.A00(3)) {
            if (A01(num).equals(str)) {
                return num;
            }
        }
        return AnonymousClass05K.A00;
    }

    public static String A01(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "fade";
            case 2:
                return NetInfoModule.CONNECTION_TYPE_NONE;
            default:
                return GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT;
        }
    }
}
