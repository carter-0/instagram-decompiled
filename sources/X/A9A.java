package X;

import com.facebook.odin.model.OdinContext;
import com.instagram.common.session.UserSession;

public final class A9A {
    public int A00 = 1;
    public 02m A01;
    public String A02;
    public final UserSession A03;
    public final AnonymousClass0eM A04 = AnonymousClass0eN.A01(new C41562AwU(this, 38));
    public final AnonymousClass0eM A05 = AnonymousClass0eN.A01(new C41562AwU(this, 39));
    public final AnonymousClass0eM A06 = AnonymousClass0eN.A01(new C41562AwU(this, 40));

    public final boolean A00() {
        String str;
        AnonymousClass40G E3W = ((AnonymousClass408) ((C39685A5b) this.A04.getValue()).A00.getValue()).E3W((C258943zt) null, OdinContext.A05);
        boolean z = E3W.A02;
        if (z) {
            Number number = (Number) E3W.A00;
            if (number.doubleValue() == 0.0d) {
                str = "bad_swiper";
            } else if (number.doubleValue() == 1.0d) {
                str = "good_swiper";
            } else {
                str = "not_swiper";
            }
        } else {
            str = null;
        }
        this.A02 = str;
        if (!z || ((Number) E3W.A00).doubleValue() != 1.0d) {
            return false;
        }
        return true;
    }

    public A9A(UserSession userSession) {
        this.A03 = userSession;
    }
}
