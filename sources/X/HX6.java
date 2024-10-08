package X;

import android.content.res.Resources;
import com.instagram.common.session.UserSession;

public abstract class HX6 {
    public static final 2WX A00(Resources resources, C335907dj r18, C333777a7 r19, C52971GgO ggO, UserSession userSession, C300835xz r22, boolean z) {
        String string;
        C52971GgO ggO2 = ggO;
        UserSession userSession2 = userSession;
        AnonymousClass7TF.A1C(userSession2, 0, ggO2);
        C300835xz r15 = r22;
        0qQ.A0B(r15, 4);
        C335907dj r13 = r18;
        Integer num = r13.A0G;
        int A01 = DbX.A01(num);
        AnonymousClass3XV r0 = 2WX.A02;
        2WX A0X = C51965G9l.A0X((2WX) null, C51965G9l.A0d(AnonymousClass05K.A1F, new C58798Ixj(2, r19, ggO2, r13, userSession2, r15, z), 4));
        boolean A1R = AnonymousClass7TF.A1R(A01);
        C59101J6j j6j = new C59101J6j(41, (Object) ggO2, (Object) r13);
        Integer num2 = AnonymousClass05K.A03;
        if (!A1R) {
            j6j = null;
        }
        2WX A0Y = C51971G9r.A0Y(A0X, num2, j6j, 4);
        boolean z2 = r13.A0S;
        Resources resources2 = resources;
        if (A01 > 0) {
            int i = 2131975019;
            if (z2) {
                i = 2131975023;
            }
            string = resources2.getString(i, AnonymousClass7TF.A1b(AnonymousClass7TG.A0A(num)));
        } else {
            int i2 = 2131975018;
            if (z2) {
                i2 = 2131975022;
            }
            string = resources2.getString(i2);
        }
        if (string != null) {
            return C51971G9r.A0Y(A0Y, AnonymousClass05K.A0N, string, 0);
        }
        return A0Y;
    }
}
