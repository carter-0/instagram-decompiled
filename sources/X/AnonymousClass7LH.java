package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.7LH  reason: invalid class name */
public final class AnonymousClass7LH {
    public final 01r A00 = new 01r(50);
    public final Map A01;

    public final void A00(View view, C331837So r7, int i) {
        AnonymousClass7LK r0 = (AnonymousClass7LK) this.A01.get(Integer.valueOf(i));
        if (r0 != null && ((Boolean) r0.A01.getValue()).booleanValue() && (r7 instanceof AnonymousClass7LQ)) {
            2el A002 = AnonymousClass2hM.A00(view);
            C60340gF r3 = C60340gF.A00;
            String A0g = ((AnonymousClass7LQ) r7).A0e.A0g();
            AnonymousClass30Y r02 = AnonymousClass30Y.A07;
            C2354830a r1 = new C2354830a(r7, r3, A0g);
            r1.A00(new C66791Mcd(this));
            AnonymousClass30Y A012 = r1.A01();
            if (A002 != null) {
                A002.A05(view, A012);
            }
        }
    }

    public AnonymousClass7LH(UserSession userSession) {
        AnonymousClass0eN.A01(AnonymousClass7LI.A00);
        this.A01 = 0se.A0M(new 0eP(29, new AnonymousClass7LK(new AnonymousClass7LJ(userSession), AnonymousClass0eN.A01(new AnonymousClass9LB(userSession, 30)))));
    }
}
