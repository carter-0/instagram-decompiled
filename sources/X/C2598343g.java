package X;

import com.instagram.common.session.UserSession;
import java.util.LinkedHashMap;

/* renamed from: X.43g  reason: invalid class name and case insensitive filesystem */
public abstract class C2598343g {
    public static final 1bT A00(UserSession userSession) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (1o3 r0 : 1bT.A05) {
            linkedHashMap.put(r0.A01, r0.A00.AXH(userSession));
        }
        return (1bT) userSession.A01(1bT.class, new C377479Lz(20, linkedHashMap, userSession));
    }
}
