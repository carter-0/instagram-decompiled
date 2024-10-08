package X;

import com.instagram.common.session.UserSession;
import java.util.Set;

/* renamed from: X.Ly4  reason: case insensitive filesystem */
public final class C65689Ly4 implements AnonymousClass2yG {
    public final UserSession A00;

    public final void EGR(C230472pg r10, C233162v9 r11, C230432pc r12, String str) {
        AnonymousClass7TG.A1T(r10, r11, r12);
        AnonymousClass19S A02 = 19E.A02(AnonymousClass12T.A00.AOJ(2080523710, 3));
        AnonymousClass7TE.A1Z(new C66148MEb(this, r12, r10, r11, str, (AnonymousClass4D7) null, 3), A02);
    }

    public C65689Ly4(UserSession userSession) {
        this.A00 = userSession;
    }

    public final Set AUL(C230472pg r7, C233162v9 r8, C230432pc r9) {
        AnonymousClass7TG.A1N(r7, r8);
        0qQ.A0B(r9, 2);
        UserSession userSession = this.A00;
        String obj = r7.toString();
        String obj2 = r8.toString();
        String obj3 = r9.toString();
        AnonymousClass7TF.A1H(obj, obj2);
        0qQ.A0B(obj3, 2);
        String A0j = 002.A0j(obj, obj3, obj2, '_', '_');
        0xa r2 = ((C64825Lil) userSession.A01(C64825Lil.class, new C20695WxR(userSession, 9))).A00;
        Set set = 0sl.A00;
        Set stringSet = r2.getStringSet(A0j, set);
        if (stringSet != null) {
            set = 00k.A0k(00k.A0X(stringSet));
        }
        0xY AR4 = r2.AR4();
        AR4.ED3(A0j);
        AR4.apply();
        return set;
    }
}
