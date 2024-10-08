package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.UkA  reason: case insensitive filesystem */
public final class C15886UkA extends C230372pW {
    public final UserSession A00;

    public final /* bridge */ /* synthetic */ void A03(Object obj, Object obj2) {
        1Xj r5 = (1Xj) obj;
        0qQ.A0B(r5, 0);
        User A11 = C51966G9m.A11(r5);
        if (A11 != null) {
            C52369GPq.A03(new C52369GPq(this.A00, "story-reply"), AnonymousClass7TE.A10(A11.getId()), C273654mx.A00(398));
        }
    }

    public final /* bridge */ /* synthetic */ void A04(Object obj, Object obj2) {
        1Xj r5 = (1Xj) obj;
        0qQ.A0B(r5, 0);
        User A11 = C51966G9m.A11(r5);
        if (A11 != null) {
            C52369GPq.A03(new C52369GPq(this.A00, "story-reply"), AnonymousClass7TE.A10(A11.getId()), C273654mx.A00(398));
        }
    }

    public C15886UkA(UserSession userSession) {
        super(C13988Tno.A0K(userSession));
        this.A00 = userSession;
    }
}
