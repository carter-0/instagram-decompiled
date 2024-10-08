package X;

import com.instagram.common.session.UserSession;
import java.util.HashMap;

/* renamed from: X.Mgy  reason: case insensitive filesystem */
public abstract class C67025Mgy {
    public static final HashMap A00(UserSession userSession) {
        HashMap A0x = C66582MXn.A0x(userSession);
        AnonymousClass6AQ A00 = AnonymousClass6AP.A00(userSession);
        A0x.put("mem_offline_sync_started", Boolean.valueOf(A00.A08));
        A0x.put("mem_offline_sync_completed", Boolean.valueOf(A00.A07));
        return A0x;
    }
}
