package X;

import com.facebook.msys.mca.MailboxFeature;
import com.instagram.common.session.UserSession;
import java.util.HashMap;

/* renamed from: X.PPp  reason: case insensitive filesystem */
public final class C72931PPp implements 0Jp {
    public final AnonymousClass5HJ A00;
    public final 0sP A01;

    public C72931PPp(AnonymousClass5HJ r2, 0sP r3) {
        0qQ.A0B(r3, 2);
        this.A00 = r2;
        this.A01 = r3;
    }

    /* JADX WARNING: type inference failed for: r0v14, types: [X.NAW, com.facebook.msys.mca.MailboxFeature] */
    public final void ATC(UserSession userSession, 0Jv r11) {
        Object obj;
        Integer num;
        UserSession userSession2 = userSession;
        0Jv r6 = r11;
        int A1U = AnonymousClass7TF.A1U(0, userSession, r11);
        if (2HM.A00(userSession).A02()) {
            AnonymousClass6ED.A00(userSession).A09(false);
            AnonymousClass5HJ r2 = this.A00;
            AnonymousClass69F A002 = AnonymousClass69E.A00(r2.A0j);
            Long l = r2.A0K;
            0qQ.A07(l);
            A002.Clr(l.longValue(), "handle_armadillo_push_operation");
            HashMap A012 = OQ0.A01(r2);
            if (C66582MXn.A1W(2HM.A00(userSession).A1R) && !r2.A1M && !r2.A1Q && !r2.A1P) {
                if (A012 != null) {
                    obj = A012.get("notify");
                } else {
                    obj = null;
                }
                if (!0qQ.A0K(obj, "0") && (num = r2.A0I) != null && num.intValue() == A1U) {
                    this.A01.invoke(r2);
                }
            }
            0qQ.A0A(new MailboxFeature(C66845Mdd.A00.A00(userSession)).A00(new C71664Ooj(4, r6, userSession2, A012, this), A012));
            return;
        }
        r11.AId((Object) null);
        AnonymousClass5HJ r1 = this.A00;
        AnonymousClass69F A003 = AnonymousClass69E.A00(r1.A0j);
        Long l2 = r1.A0K;
        0qQ.A07(l2);
        A003.DUc(l2.longValue());
    }
}
