package X;

import com.instagram.common.session.UserSession;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.Hn7  reason: case insensitive filesystem */
public final class C55772Hn7 {
    public final UserSession A00;
    public final C362088hK A01;
    public final String A02;
    public final ConcurrentHashMap.KeySetView A03 = ConcurrentHashMap.newKeySet();

    public C55772Hn7(UserSession userSession, C362088hK r3, String str) {
        AnonymousClass7TG.A1O(str, r3);
        this.A02 = str;
        this.A01 = r3;
        this.A00 = userSession;
    }
}
