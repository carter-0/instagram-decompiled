package X;

import com.instagram.realtimeclient.GraphQLSubscriptionID;

/* renamed from: X.Kpn  reason: case insensitive filesystem */
public abstract class C62997Kpn {
    public static Integer A00(String str) {
        String str2;
        for (Integer num : AnonymousClass05K.A00(3)) {
            switch (num.intValue()) {
                case 1:
                    str2 = "Merlot";
                    break;
                case 2:
                    str2 = GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT;
                    break;
                default:
                    str2 = "Facebook View";
                    break;
            }
            if (str2.equals(str)) {
                return num;
            }
        }
        return AnonymousClass05K.A0C;
    }
}
