package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* renamed from: X.CrG  reason: case insensitive filesystem */
public abstract class C45153CrG {
    public static final C60985Juh A00(UserSession userSession, CGE cge) {
        boolean z;
        CGE cge2 = cge;
        0qQ.A0B(cge2, 0);
        0sl<String> r1 = cge2.A09;
        if (r1 == null) {
            r1 = 0sl.A00;
        }
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (String str : r1) {
            UserSession userSession2 = userSession;
            User A02 = 17h.A00(userSession2).A02(str);
            if (A02 == null) {
                AnonymousClass441.A02.A02(userSession2, (C330317Mh) null, str);
            } else {
                A1C.add(A02);
            }
        }
        Set A0k = 00k.A0k(A1C);
        int i = cge2.A02;
        List list = cge2.A08;
        int i2 = cge2.A01;
        boolean z2 = cge2.A0D;
        String str2 = cge2.A07;
        boolean z3 = cge2.A0A;
        boolean z4 = cge2.A0F;
        boolean z5 = cge2.A0H;
        boolean z6 = cge2.A0G;
        C278114wI r8 = cge2.A03;
        0sl r7 = cge2.A09;
        if (r7 == null) {
            r7 = 0sl.A00;
        }
        int i3 = cge2.A00;
        boolean z7 = cge2.A0C;
        boolean z8 = cge2.A0B;
        L5K l5k = cge2.A06;
        L7F l7f = cge2.A05;
        C45366Cv8 cv8 = cge2.A04;
        if (r8 != null) {
            z = r8.A00();
        } else {
            z = false;
        }
        int i4 = i;
        List list2 = list;
        return new C60985Juh(r8, cv8, l7f, l5k, str2, list2, r7, A0k, i4, i2, i3, z2, z3, z4, z5, z6, z7, z8, z, cge2.A0E);
    }
}
