package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.3CE  reason: invalid class name */
public abstract class AnonymousClass3CE {
    public static final AnonymousClass3CG A00(Context context, UserSession userSession, C249863kU r11) {
        0qQ.A0B(r11, 0);
        0Tu r3 = 0Tu.A05;
        UserSession userSession2 = userSession;
        boolean A06 = 182.A06(r3, userSession, 36312866155922716L);
        int A01 = (int) 182.A01(r3, userSession, 36594341132699314L);
        int A012 = (int) 182.A01(r3, userSession, 36594341132764851L);
        boolean A062 = 182.A06(r3, userSession, 36312866156119325L);
        if (!A06) {
            return new AnonymousClass3CF();
        }
        C22361Y0p y0p = new C22361Y0p(r11);
        C308736Vk r2 = new C308736Vk(context, userSession2, y0p, A01, A012, A062);
        y0p.A01 = r2;
        y0p.A04.A06(r2);
        return r2;
    }
}
