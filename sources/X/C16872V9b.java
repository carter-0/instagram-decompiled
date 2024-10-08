package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.V9b  reason: case insensitive filesystem */
public abstract class C16872V9b {
    public static Object A00(C307896Rx r25, AnonymousClass6Tm r26) {
        User user;
        AnonymousClass6Tm r3 = r26;
        String str = (String) r3.A02();
        String str2 = (String) r3.A00();
        String str3 = (String) r3.A03(3);
        String str4 = (String) r3.A03(4);
        String str5 = (String) r3.A03(5);
        String str6 = (String) r3.A03(6);
        EtL etL = (EtL) r3.A00.get(7);
        if (etL == null || (user = etL.A00) == null) {
            user = null;
        }
        UserSession A0Z = DbT.A0Z(r25);
        int[] iArr = C19475WaN.A03;
        AnonymousClass4Hy r0 = new AnonymousClass8YF(C18710Vyf.A00(), (User) null, (String) null, "", "", (String) null, (String) null, "", "", "", "", "", "", 0).A01;
        0qQ.A0B(str, 0);
        0qQ.A0B(str2, 0);
        0qQ.A0B(str3, 0);
        0qQ.A0B(str4, 0);
        0qQ.A0B(str5, 0);
        0qQ.A0B(str6, 0);
        C18688Vwm.A02(C308206Td.A04(r25), 28D.A2v, A0Z, new C19475WaN(C39574A0q.A00(r0, user, (String) null, str6, str5, "DEFAULT", (String) null, "", "bloks", str4, str3, str, str2, 0)), false);
        return null;
    }
}
