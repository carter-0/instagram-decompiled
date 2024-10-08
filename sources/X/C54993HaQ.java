package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.androidlink.AndroidLinkImpl;
import com.instagram.model.venue.LocationDictIntf;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.HaQ  reason: case insensitive filesystem */
public abstract class C54993HaQ {
    public static 1Xj A00(UserSession userSession, C53352Gmc gmc, 1Xj r36, String str, String str2, String str3, List list, boolean z, boolean z2) {
        String str4;
        boolean z3;
        C282165Ca r0;
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession2, 0);
        1Xj r2 = new 1Xj();
        1Xj r3 = r36;
        r2.A3z(userSession2, r3, false);
        if (z2) {
            r2.A3u(0);
            r2.A0C.EqW(0);
            r2.A44(C243363Yl.NOT_LIKED);
            r2.A0C.ESK(0);
            1i5 r1 = r2.A0d;
            r1.A01();
            r1.A05.A01();
            r1.A06.A01();
        }
        String str5 = str;
        if (str != null) {
            r2.A0C.EcC(str5);
            if (r2.A3P().isEmpty()) {
                Integer valueOf = Integer.valueOf(AnonymousClass47L.AD_DESTINATION_WEB.A00);
                String A00 = C273654mx.A00(731);
                r2.A0C.EOd(AnonymousClass7TE.A1I(new AndroidLinkImpl((Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Integer) null, (Integer) null, valueOf, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, A00, (String) null, (String) null, (String) null, (String) null, "Package", (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, A00)));
            }
        }
        String str6 = str3;
        if (str3 != null && C51966G9m.A0w(r2) == null) {
            User A2A = r3.A2A(userSession2);
            String str7 = str2;
            if (str2 == null || str7.length() == 0 || A2A == null) {
                str4 = null;
            } else {
                str4 = A2A.B8Q();
            }
            C2592741b r12 = new C2592741b(C41916B6o.A00());
            r12.A0i = str4;
            if (str2 == null || str7.length() == 0) {
                z3 = null;
            } else {
                z3 = true;
            }
            r12.A0M = z3;
            r12.A0r = str6;
            if (str2 == null || str7.length() == 0) {
                r0 = null;
            } else {
                r0 = new C282165Ca(str7);
            }
            r12.A07 = r0;
            r2.A45(r12.A00());
        }
        if (z) {
            r2.A0C.Eca((LocationDictIntf) null);
            1Xy r02 = r2.A0C;
            Float A0g = C51967G9n.A0g();
            r02.Eas(A0g);
            r2.A0C.EcW(A0g);
        }
        List list2 = list;
        if (list != null) {
            r2.A0C.ERA(list2);
            r2.A3w((UserSession) null);
        }
        r2.A0A = gmc;
        return r2;
    }
}
