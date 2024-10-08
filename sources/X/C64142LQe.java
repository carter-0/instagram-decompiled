package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.LQe  reason: case insensitive filesystem */
public final class C64142LQe {
    public final C64835Lix A00;
    public final String A01;
    public final String A02;
    public final 05G A03 = JTQ.A0r(2);
    public final 05G A04;
    public final 05G A05 = DbS.A10(6);
    public final 05G A06 = DbS.A10(6);
    public final boolean A07;

    public static final C61069Jw7 A00(C61069Jw7 jw7, int i) {
        List list = (List) jw7.A02;
        List A0d = 00k.A0d(list, i);
        C62865Knf knf = (C62865Knf) jw7.A01;
        if (!(knf instanceof C62085KZp)) {
            if (list.size() > i) {
                knf = new C62085KZp((String) null);
            } else {
                knf = C62084KZo.A00;
            }
        }
        Integer num = (Integer) jw7.A00;
        AnonymousClass7TG.A1T(A0d, num, knf);
        return new C61069Jw7(knf, num, A0d);
    }

    public static final boolean A01(C16679UzF uzF, C64142LQe lQe, boolean z) {
        Object obj;
        if (z) {
            C61069Jw7 A042 = JTO.A0P(lQe.A04).A04(uzF);
            if (A042 != null) {
                obj = A042.A00;
            } else {
                obj = null;
            }
            if (obj != AnonymousClass05K.A0C) {
                return true;
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ C64142LQe(UserSession userSession, String str, String str2, boolean z) {
        C64835Lix A002 = C63446KxB.A00(userSession, z);
        DbW.A1N(str, 2, A002);
        this.A02 = str;
        this.A01 = str2;
        this.A07 = z;
        this.A00 = A002;
        this.A04 = A002.A0E(str2);
    }
}
