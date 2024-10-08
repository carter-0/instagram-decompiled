package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.TtR  reason: case insensitive filesystem */
public abstract class C14293TtR {
    public static final C14230TsD A00(UserSession userSession, C229132mt r5, C231272rL r6, Boolean bool, Integer num, int i, boolean z) {
        UserSession userSession2 = userSession;
        C231272rL r3 = r6;
        AnonymousClass7TG.A1N(userSession, r6);
        C229132mt r2 = r5;
        0qQ.A0B(r5, 4);
        int i2 = C249383je.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
        Integer num2 = num;
        int i3 = i;
        boolean z2 = z;
        if (bool != null) {
            return new C14230TsD(userSession2, r2, r3, num2, i3, z2, bool.booleanValue());
        }
        return new C14230TsD(userSession2, r2, r3, num2, i3, z2);
    }

    public static final void A01(UserSession userSession, C229132mt r8, C231272rL r9, Integer num, int i) {
        Dba.A0j(1, userSession, r9);
        0qQ.A0B(r8, 4);
        C234312xe r3 = new C14230TsD(userSession, r8, r9, num, i, true).A00.A04;
        Integer num2 = r3.A02;
        r3.A01 = num2;
        int i2 = Integer.MAX_VALUE;
        if (num2 == AnonymousClass05K.A01) {
            i2 = -1;
        }
        r3.A00 = i2;
    }
}
