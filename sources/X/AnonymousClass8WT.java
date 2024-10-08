package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.8WT  reason: invalid class name */
public final class AnonymousClass8WT {
    public static final AnonymousClass8WT A00 = new Object();

    public static final Integer A00(UserSession userSession) {
        String A04 = 182.A04(0Tu.A05, userSession, 36890698171351932L);
        Integer num = AnonymousClass05K.A01;
        if (0qQ.A0K(A04, "destination_bar")) {
            return num;
        }
        Integer num2 = AnonymousClass05K.A0C;
        if (!0qQ.A0K(A04, "first_tile")) {
            return AnonymousClass05K.A00;
        }
        return num2;
    }

    public static final Integer A01(UserSession userSession) {
        String A04 = 182.A04(0Tu.A05, userSession, 36890698171089787L);
        Integer num = AnonymousClass05K.A01;
        if (0qQ.A0K(A04, "memories_pog")) {
            return num;
        }
        Integer num2 = AnonymousClass05K.A0C;
        if (!0qQ.A0K(A04, "self_pog_nux")) {
            return AnonymousClass05K.A00;
        }
        return num2;
    }
}
