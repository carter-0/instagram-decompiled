package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.UkB  reason: case insensitive filesystem */
public final class C15887UkB extends C230372pW {
    public final VYZ A00;

    public final /* bridge */ /* synthetic */ void A03(Object obj, Object obj2) {
        User user = (User) obj;
        0qQ.A0B(user, 0);
        VYZ vyz = this.A00;
        0Aj A0e = AnonymousClass7TE.A0e(vyz.A03, "instagram_shopping_continue_shopping_row_impression");
        if (A0e.isSampled()) {
            C13988Tno.A17(A0e, vyz.A02);
            C13988Tno.A1A(A0e, AnonymousClass3ZA.A00(user));
            A0e.AAE((AnonymousClass0Ah) null, "marketer_id");
            A0e.AAK(vyz.A00, "collections_logging_info");
            A0e.AAK(vyz.A01, "feed_item_info");
            A0e.Cgf();
        }
    }

    public C15887UkB(UserSession userSession, VYZ vyz) {
        super(C13988Tno.A0K(userSession));
        this.A00 = vyz;
    }

    public final /* bridge */ /* synthetic */ void A04(Object obj, Object obj2) {
    }
}
