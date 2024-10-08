package X;

import com.instagram.common.session.UserSession;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.TwJ  reason: case insensitive filesystem */
public final class C14435TwJ implements C250603lj {
    public final 0wc A00;
    public final C20899X3q A01;
    public final Set A02 = new HashSet();

    public C14435TwJ(AnonymousClass0iw r2, UserSession userSession, C20899X3q x3q) {
        this.A01 = x3q;
        this.A00 = AnonymousClass0kN.A01(r2, userSession);
    }

    public final void ATF(AnonymousClass30Y r7, C252093oY r8) {
        AnonymousClass7TG.A1N(r7, r8);
        if (r8.CEk(r7) == AnonymousClass05K.A00) {
            Object obj = r7.A03;
            0qQ.A06(obj);
            N3M n3m = (N3M) obj;
            Set set = this.A02;
            0qQ.A0B(n3m, 0);
            String str = n3m.A05;
            String str2 = str;
            if (str == null) {
                str = n3m.A06;
            }
            if (set.add(str)) {
                0wc r1 = this.A00;
                C20899X3q x3q = this.A01;
                1Ln r12 = new 1Ln(AnonymousClass7TE.A0e(r1, "instagram_inform_module_impression"), 292);
                if (DbT.A1Y(r12)) {
                    C13989Tnp.A1J(r12, n3m, str2);
                    x3q.ACr(r12);
                    r12.Cgf();
                }
            }
        }
    }
}
