package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.GraphQLSubscriptionID;

public final class GNX implements C270754hF {
    public static final Integer A02 = AnonymousClass05K.A01;
    public final Integer A00;
    public final String A01;

    public final 1OC BCc(UserSession userSession, boolean z) {
        String str;
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession, 0);
        String str2 = this.A01;
        Integer num = A02;
        int intValue = this.A00.intValue();
        if (intValue == 0) {
            str = "fan_club";
        } else if (intValue == 1) {
            str = GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT;
        } else if (intValue != 2) {
            str = "opal";
        } else {
            str = null;
        }
        0qQ.A0B(num, 3);
        1NY A002 = AnonymousClass93V.A00(userSession);
        AnonymousClass73D.A02(A002, userSession2, num, str2, (String) null, str, z);
        return A002.A0M();
    }

    public final 1OC C42(UserSession userSession, String str) {
        String str2;
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession, 0);
        String str3 = this.A01;
        Integer num = A02;
        int intValue = this.A00.intValue();
        if (intValue == 0) {
            str2 = "fan_club";
        } else if (intValue == 1) {
            str2 = GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT;
        } else if (intValue != 2) {
            str2 = "opal";
        } else {
            str2 = null;
        }
        0qQ.A0B(num, 3);
        1NY A002 = AnonymousClass93V.A00(userSession);
        AnonymousClass73D.A02(A002, userSession2, num, str3, str, str2, false);
        return A002.A0M();
    }

    public final /* synthetic */ void ES0(GEP gep) {
    }

    public final /* synthetic */ void ESn(Context context) {
    }

    public final /* synthetic */ void EiB(String str) {
    }

    public final /* synthetic */ void Elk(C290515fR r1) {
    }

    public GNX(String str, Integer num) {
        this.A01 = str;
        this.A00 = num;
    }

    public final /* synthetic */ boolean CTp(boolean z) {
        return false;
    }
}
