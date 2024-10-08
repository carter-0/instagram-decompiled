package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.fundraiser.NewFundraiserInfo;
import com.instagram.user.model.User;

/* renamed from: X.Egq  reason: case insensitive filesystem */
public abstract class C48581Egq {
    public static Object A00(C307896Rx r17, AnonymousClass6Tm r18) {
        User user;
        User user2;
        AE3 ae3;
        C276544tV r3 = (C276544tV) r18.A03(0);
        UserSession A0Z = DbT.A0Z(r17);
        EtL etL = (EtL) C276544tV.A00(r3, 38);
        if (etL != null) {
            user = etL.A00;
        } else {
            user = null;
        }
        user.getClass();
        AE3 ae32 = new AE3(user.getUsername(), DbU.A0p(user), user.isVerified());
        EtL etL2 = (EtL) C276544tV.A00(r3, 46);
        if (etL2 != null) {
            user2 = etL2.A00;
        } else {
            user2 = null;
        }
        if (user2 != null) {
            ae3 = new AE3(user2.getUsername(), DbU.A0p(user2), user2.isVerified());
        } else {
            ae3 = new AE3(DbV.A11(r3, "", 51), DbV.A11(r3, "", 52), false);
        }
        String str = "";
        String A0G = r3.A0G();
        if (A0G != null) {
            str = A0G;
        }
        String str2 = "";
        String A0I = r3.A0I();
        if (A0I != null) {
            str2 = A0I;
        }
        String str3 = "";
        String A0E = r3.A0E();
        if (A0E != null) {
            str3 = A0E;
        }
        String str4 = "";
        String A0F = r3.A0F();
        if (A0F != null) {
            str4 = A0F;
        }
        String str5 = "";
        String A0J = r3.A0J();
        if (A0J != null) {
            str5 = A0J;
        }
        C18688Vwm.A01(C308206Td.A04(r17), 28D.A4T, A0Z, new C3499082j((NewFundraiserInfo) null, ae3, ae32, str4, DbV.A11(r3, "", 48), str5, str3, str2, str, r3.A03(50, 0)));
        return null;
    }
}
