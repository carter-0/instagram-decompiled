package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.P1a  reason: case insensitive filesystem */
public final class C72309P1a implements C74544Pwd {
    public NVZ A00;
    public Integer A01 = AnonymousClass05K.A01;
    public String A02;
    public final O6T A03;
    public final C68740NVa A04;
    public final UserSession A05;
    public final OJX A06;
    public final List A07;

    public C72309P1a(UserSession userSession, O6T o6t, String str, String str2, String str3, String str4, List list) {
        UserSession userSession2 = userSession;
        AnonymousClass7TG.A1U(userSession, str, str2);
        0qQ.A0B(str4, 5);
        this.A05 = userSession;
        this.A02 = str;
        this.A07 = list;
        this.A03 = o6t;
        OJX ojx = new OJX(this);
        this.A06 = ojx;
        this.A04 = new C68740NVa(userSession2, (O6T) null, ojx, str, str2, str4, list);
        this.A00 = new NVZ(userSession2, (O6T) null, ojx, this.A02, str3);
    }

    public final void EIC(String str) {
        this.A02 = str;
        0qQ.A0B(AnonymousClass05K.A00, 0);
    }

    public final Integer Bz7() {
        P1Z p1z;
        if (this.A01 == AnonymousClass05K.A01) {
            p1z = this.A04;
        } else {
            p1z = this.A00;
        }
        return p1z.A02;
    }

    public final void CgL() {
        P1Z p1z;
        Integer num = AnonymousClass05K.A01;
        0qQ.A0B(num, 0);
        Integer num2 = this.A01;
        if (num2 == num) {
            p1z = this.A04;
        } else if (num2 == AnonymousClass05K.A00) {
            p1z = this.A00;
        } else {
            return;
        }
        p1z.CgL();
    }

    public final void onDestroy() {
        this.A00.onDestroy();
    }
}
