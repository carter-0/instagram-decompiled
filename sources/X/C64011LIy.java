package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.direct.stella.StellaIpcDirectMessagingServiceClient;

/* renamed from: X.LIy  reason: case insensitive filesystem */
public final class C64011LIy {
    public static final StellaIpcDirectMessagingServiceClient A00(Context context, UserSession userSession) {
        if (StellaIpcDirectMessagingServiceClient._instance == null) {
            Class<StellaIpcDirectMessagingServiceClient> cls = StellaIpcDirectMessagingServiceClient.class;
            synchronized (cls) {
                StellaIpcDirectMessagingServiceClient._instance = (StellaIpcDirectMessagingServiceClient) userSession.A01(cls, new C73667Phg(35, context, userSession));
            }
        }
        return StellaIpcDirectMessagingServiceClient._instance;
    }
}
