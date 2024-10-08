package X;

import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.6OC  reason: invalid class name */
public final class AnonymousClass6OC {
    public static final AnonymousClass624 A00(UserSession userSession, String str) {
        if (str.equals("sn_integration_reels")) {
            C67671vk r0 = C67671vk.A01;
            r0.A00 = userSession;
            return new AnonymousClass624(r0, (int) 182.A01(0Tu.A05, userSession, 36592253780623741L), false);
        }
        boolean equals = str.equals("sn_integration_feed");
        AnonymousClass625 r02 = AnonymousClass624.A03;
        if (!equals) {
            return r02.A00(userSession);
        }
        C67671vk r1 = C67671vk.A01;
        r1.A00 = userSession;
        return new AnonymousClass624(r1, (int) 182.A01(0Tu.A05, userSession, 36594710500017980L), true);
    }

    public final AnonymousClass6OE A01(AnonymousClass624 r9, UserSession userSession, String str) {
        AnonymousClass6OE r2;
        Class<AnonymousClass6OB> cls = AnonymousClass6OB.class;
        UserSession userSession2 = userSession;
        AnonymousClass6OB r0 = (AnonymousClass6OB) userSession.A01(cls, AnonymousClass6OD.A00);
        synchronized (cls) {
            Map map = r0.A00;
            String str2 = str;
            r2 = (AnonymousClass6OE) map.get(str);
            if (r2 == null) {
                02m r3 = 02m.A0p;
                0qQ.A07(r3);
                r2 = new AnonymousClass6OE(r3, r9.A01(), r9, userSession2, str2);
                map.put(str, r2);
            }
        }
        return r2;
    }
}
