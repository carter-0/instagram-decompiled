package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.OVo  reason: case insensitive filesystem */
public final class C70993OVo {
    public static final C70993OVo A00 = new Object();

    public final void A01(Context context, UserSession userSession, String str, String str2, String str3, String str4, List list, List list2, int i, int i2, long j) {
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession2, 1);
        0KC.A0D("IpcQplConsts", 002.A0R("Unhandled action: ", "CallState"));
        Integer num = AnonymousClass05K.A0X;
        0qQ.A0B(num, 2);
        ((OZN) userSession2.A01(N1M.class, new C73667Phg(34, context, userSession2))).A01(new NEh(C71034OZv.A02(num, "CallState", true), str, str2, str3, str4, list, list2, i, i2, j));
    }

    public final void A00(Context context, UserSession userSession) {
        boolean A1Z = AnonymousClass7TG.A1Z(context, userSession);
        0KC.A0D("IpcQplConsts", 002.A0R("Unhandled action: ", "ContactChangeEvent"));
        Integer num = AnonymousClass05K.A0X;
        0qQ.A0B(num, 2);
        ((OZN) userSession.A01(N1M.class, new C73667Phg(34, context, userSession))).A01(new C68380NEg(C71034OZv.A02(num, "ContactChangeEvent", A1Z)));
    }
}
